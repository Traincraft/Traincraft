//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: E8-9a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

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

public class ModelEMDE8A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEMDE8A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[531];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 236, 77, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 242, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 274, 160, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 179, 128, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 345, 128, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 417, 135, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 137, 135, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 290, 158, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 267, 146, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 268, 146, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 290, 146, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 267, 109, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 84, 15, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 86, 9, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 87, 4, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 89, 34, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 85, 150, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 96, 142, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 58, 150, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 170, 244, textureX, textureY); // Box 1 pilot a
		bodyModel[31] = new ModelRendererTurbo(this, 97, 204, textureX, textureY); // Box 106
		bodyModel[32] = new ModelRendererTurbo(this, 85, 204, textureX, textureY); // Box 112
		bodyModel[33] = new ModelRendererTurbo(this, 85, 197, textureX, textureY); // Box 117
		bodyModel[34] = new ModelRendererTurbo(this, 81, 191, textureX, textureY); // Box 118
		bodyModel[35] = new ModelRendererTurbo(this, 118, 150, textureX, textureY); // Box 129
		bodyModel[36] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 401, 144, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 417, 128, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 422, 128, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 412, 128, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 401, 128, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 165, 144, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 155, 128, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 146, 128, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 160, 128, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 165, 128, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 493, 113, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 270, 226, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 261, 226, textureX, textureY); // Box 254
		bodyModel[50] = new ModelRendererTurbo(this, 270, 222, textureX, textureY); // Box 255
		bodyModel[51] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 136
		bodyModel[52] = new ModelRendererTurbo(this, 261, 222, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 138
		bodyModel[54] = new ModelRendererTurbo(this, 115, 178, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 51, 178, textureX, textureY); // Box 144
		bodyModel[56] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Low nose lift lugs
		bodyModel[57] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Low nose lift lugs
		bodyModel[58] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Low nose lift lugs
		bodyModel[59] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Low nose lift lugs
		bodyModel[60] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Nose hand railing
		bodyModel[61] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Nose hand railing
		bodyModel[62] = new ModelRendererTurbo(this, 84, 240, textureX, textureY); // Box 151
		bodyModel[63] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 152
		bodyModel[64] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 153
		bodyModel[65] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 154
		bodyModel[66] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 155
		bodyModel[67] = new ModelRendererTurbo(this, 167, 151, textureX, textureY); // Box 156
		bodyModel[68] = new ModelRendererTurbo(this, 401, 151, textureX, textureY); // Box 157
		bodyModel[69] = new ModelRendererTurbo(this, 470, 67, textureX, textureY); // Box 350
		bodyModel[70] = new ModelRendererTurbo(this, 473, 67, textureX, textureY); // Box 351
		bodyModel[71] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[72] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[73] = new ModelRendererTurbo(this, 153, 46, textureX, textureY); // Early CP horns
		bodyModel[74] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // horn base
		bodyModel[75] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Early CP horns
		bodyModel[76] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // horn base
		bodyModel[77] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "glow"); // Box 348 commander beacon
		bodyModel[78] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[79] = new ModelRendererTurbo(this, 125, 175, textureX, textureY, "glow"); // Box 184 numberboard glow
		bodyModel[80] = new ModelRendererTurbo(this, 45, 175, textureX, textureY, "glow"); // Box 185 numberboard glow
		bodyModel[81] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[82] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 192
		bodyModel[83] = new ModelRendererTurbo(this, 165, 43, textureX, textureY); // CBQ horn
		bodyModel[84] = new ModelRendererTurbo(this, 169, 40, textureX, textureY); // horn base
		bodyModel[85] = new ModelRendererTurbo(this, 167, 37, textureX, textureY); // CBQ horn
		bodyModel[86] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[87] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[88] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[89] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[90] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[91] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[92] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[93] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[94] = new ModelRendererTurbo(this, 178, 40, textureX, textureY); // Amtrak and PRR horn
		bodyModel[95] = new ModelRendererTurbo(this, 178, 37, textureX, textureY); // Amtrak and PRR horn
		bodyModel[96] = new ModelRendererTurbo(this, 187, 40, textureX, textureY); // Horn base
		bodyModel[97] = new ModelRendererTurbo(this, 235, 37, textureX, textureY); // ATSF E8m horn
		bodyModel[98] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[99] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131
		bodyModel[100] = new ModelRendererTurbo(this, 462, 87, textureX, textureY); // Box 131
		bodyModel[101] = new ModelRendererTurbo(this, 467, 85, textureX, textureY); // Box 131
		bodyModel[102] = new ModelRendererTurbo(this, 476, 87, textureX, textureY); // Box 131
		bodyModel[103] = new ModelRendererTurbo(this, 436, 70, textureX, textureY); // Box 131
		bodyModel[104] = new ModelRendererTurbo(this, 461, 82, textureX, textureY); // Box 131
		bodyModel[105] = new ModelRendererTurbo(this, 462, 74, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[107] = new ModelRendererTurbo(this, 384, 69, textureX, textureY, "glow"); // Box 247 headlight rear left
		bodyModel[108] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[109] = new ModelRendererTurbo(this, 301, 143, textureX, textureY); // Box 223
		bodyModel[110] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 438
		bodyModel[111] = new ModelRendererTurbo(this, 263, 201, textureX, textureY); // Box 439
		bodyModel[112] = new ModelRendererTurbo(this, 124, 240, textureX, textureY, "glow"); // Box 443 ditchlight front a
		bodyModel[113] = new ModelRendererTurbo(this, 117, 243, textureX, textureY, "glow"); // Ditchlight box
		bodyModel[114] = new ModelRendererTurbo(this, 124, 240, textureX, textureY, "glow"); // Box 445 ditchlight front a
		bodyModel[115] = new ModelRendererTurbo(this, 117, 243, textureX, textureY, "glow"); // Ditchlight box
		bodyModel[116] = new ModelRendererTurbo(this, 181, 74, textureX, textureY); // Box 260
		bodyModel[117] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 264
		bodyModel[118] = new ModelRendererTurbo(this, 145, 76, textureX, textureY); // Box 268
		bodyModel[119] = new ModelRendererTurbo(this, 139, 78, textureX, textureY); // Box 274
		bodyModel[120] = new ModelRendererTurbo(this, 136, 82, textureX, textureY); // Box 283
		bodyModel[121] = new ModelRendererTurbo(this, 149, 82, textureX, textureY); // Box 284
		bodyModel[122] = new ModelRendererTurbo(this, 166, 82, textureX, textureY); // Box 291
		bodyModel[123] = new ModelRendererTurbo(this, 179, 82, textureX, textureY); // Box 292
		bodyModel[124] = new ModelRendererTurbo(this, 184, 78, textureX, textureY); // Box 293
		bodyModel[125] = new ModelRendererTurbo(this, 172, 76, textureX, textureY); // Box 294
		bodyModel[126] = new ModelRendererTurbo(this, 140, 74, textureX, textureY); // Box 295
		bodyModel[127] = new ModelRendererTurbo(this, 146, 73, textureX, textureY); // Box 296
		bodyModel[128] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 194
		bodyModel[129] = new ModelRendererTurbo(this, 70, 202, textureX, textureY); // Box 278
		bodyModel[130] = new ModelRendererTurbo(this, 57, 207, textureX, textureY); // Box 279
		bodyModel[131] = new ModelRendererTurbo(this, 50, 207, textureX, textureY); // Box 280
		bodyModel[132] = new ModelRendererTurbo(this, 43, 186, textureX, textureY); // Box 281
		bodyModel[133] = new ModelRendererTurbo(this, 60, 180, textureX, textureY); // Box 282
		bodyModel[134] = new ModelRendererTurbo(this, 61, 188, textureX, textureY); // Box 284
		bodyModel[135] = new ModelRendererTurbo(this, 46, 197, textureX, textureY); // Box 289
		bodyModel[136] = new ModelRendererTurbo(this, 38, 199, textureX, textureY); // Box 291
		bodyModel[137] = new ModelRendererTurbo(this, 427, 40, textureX, textureY); // Box 293
		bodyModel[138] = new ModelRendererTurbo(this, 96, 202, textureX, textureY); // Box 294
		bodyModel[139] = new ModelRendererTurbo(this, 111, 207, textureX, textureY); // Box 295
		bodyModel[140] = new ModelRendererTurbo(this, 124, 207, textureX, textureY); // Box 296
		bodyModel[141] = new ModelRendererTurbo(this, 58, 153, textureX, textureY); // Box 311
		bodyModel[142] = new ModelRendererTurbo(this, 51, 152, textureX, textureY); // Box 312
		bodyModel[143] = new ModelRendererTurbo(this, 115, 186, textureX, textureY); // Box 313
		bodyModel[144] = new ModelRendererTurbo(this, 98, 180, textureX, textureY); // Box 314
		bodyModel[145] = new ModelRendererTurbo(this, 105, 188, textureX, textureY); // Box 315
		bodyModel[146] = new ModelRendererTurbo(this, 96, 149, textureX, textureY); // Box 323
		bodyModel[147] = new ModelRendererTurbo(this, 109, 151, textureX, textureY); // Box 324
		bodyModel[148] = new ModelRendererTurbo(this, 118, 153, textureX, textureY); // Box 325
		bodyModel[149] = new ModelRendererTurbo(this, 123, 152, textureX, textureY); // Box 326
		bodyModel[150] = new ModelRendererTurbo(this, 72, 149, textureX, textureY); // Box 327
		bodyModel[151] = new ModelRendererTurbo(this, 63, 151, textureX, textureY); // Box 328
		bodyModel[152] = new ModelRendererTurbo(this, 39, 194, textureX, textureY); // Box 329
		bodyModel[153] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 330
		bodyModel[154] = new ModelRendererTurbo(this, 63, 146, textureX, textureY); // Box 331
		bodyModel[155] = new ModelRendererTurbo(this, 69, 232, textureX, textureY); // Box 332
		bodyModel[156] = new ModelRendererTurbo(this, 97, 232, textureX, textureY); // Box 333
		bodyModel[157] = new ModelRendererTurbo(this, 85, 234, textureX, textureY); // Box 334
		bodyModel[158] = new ModelRendererTurbo(this, 56, 233, textureX, textureY); // Box 335
		bodyModel[159] = new ModelRendererTurbo(this, 294, 99, textureX, textureY); // Box 441
		bodyModel[160] = new ModelRendererTurbo(this, 81, 186, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 91, 186, textureX, textureY); // Box 166
		bodyModel[162] = new ModelRendererTurbo(this, 91, 181, textureX, textureY); // Box 165
		bodyModel[163] = new ModelRendererTurbo(this, 77, 181, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Box 556
		bodyModel[165] = new ModelRendererTurbo(this, 91, 221, textureX, textureY); // Box 557
		bodyModel[166] = new ModelRendererTurbo(this, 427, 85, textureX, textureY); // Box 865
		bodyModel[167] = new ModelRendererTurbo(this, 96, 193, textureX, textureY); // Box 866
		bodyModel[168] = new ModelRendererTurbo(this, 105, 196, textureX, textureY); // Box 867
		bodyModel[169] = new ModelRendererTurbo(this, 59, 196, textureX, textureY); // Box 868
		bodyModel[170] = new ModelRendererTurbo(this, 70, 193, textureX, textureY); // Box 869
		bodyModel[171] = new ModelRendererTurbo(this, 112, 233, textureX, textureY); // Box 1296
		bodyModel[172] = new ModelRendererTurbo(this, 159, 244, textureX, textureY); // Box 1297 pilot a
		bodyModel[173] = new ModelRendererTurbo(this, 181, 244, textureX, textureY); // Box 1299 pilot a
		bodyModel[174] = new ModelRendererTurbo(this, 152, 246, textureX, textureY); // Box 1300 pilot a
		bodyModel[175] = new ModelRendererTurbo(this, 192, 246, textureX, textureY); // Box 1301 pilot a
		bodyModel[176] = new ModelRendererTurbo(this, 47, 204, textureX, textureY); // Box 1302
		bodyModel[177] = new ModelRendererTurbo(this, 121, 204, textureX, textureY); // Box 1303
		bodyModel[178] = new ModelRendererTurbo(this, 116, 197, textureX, textureY); // Box 1304
		bodyModel[179] = new ModelRendererTurbo(this, 133, 194, textureX, textureY); // Box 1305
		bodyModel[180] = new ModelRendererTurbo(this, 132, 199, textureX, textureY); // Box 1306
		bodyModel[181] = new ModelRendererTurbo(this, 165, 131, textureX, textureY); // Box 329 door swing left cab
		bodyModel[182] = new ModelRendererTurbo(this, 401, 131, textureX, textureY); // Box 332 door swing right cab
		bodyModel[183] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 326
		bodyModel[184] = new ModelRendererTurbo(this, 104, 139, textureX, textureY); // Box 327
		bodyModel[185] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Box 328
		bodyModel[186] = new ModelRendererTurbo(this, 30, 102, textureX, textureY); // Box 333
		bodyModel[187] = new ModelRendererTurbo(this, 30, 82, textureX, textureY); // Box 334
		bodyModel[188] = new ModelRendererTurbo(this, 486, 83, textureX, textureY); // Box 602
		bodyModel[189] = new ModelRendererTurbo(this, 484, 88, textureX, textureY); // Box 603
		bodyModel[190] = new ModelRendererTurbo(this, 490, 83, textureX, textureY); // Box 604
		bodyModel[191] = new ModelRendererTurbo(this, 490, 91, textureX, textureY); // Box 605
		bodyModel[192] = new ModelRendererTurbo(this, 499, 95, textureX, textureY); // Box 606
		bodyModel[193] = new ModelRendererTurbo(this, 125, 177, textureX, textureY, "glow"); // Box 352 markerlight
		bodyModel[194] = new ModelRendererTurbo(this, 51, 177, textureX, textureY, "glow"); // Box 353 markerlight
		bodyModel[195] = new ModelRendererTurbo(this, 475, 125, textureX, textureY); // Box 356
		bodyModel[196] = new ModelRendererTurbo(this, 494, 103, textureX, textureY); // Box 357
		bodyModel[197] = new ModelRendererTurbo(this, 489, 101, textureX, textureY); // Box 358
		bodyModel[198] = new ModelRendererTurbo(this, 470, 65, textureX, textureY); // Box 359
		bodyModel[199] = new ModelRendererTurbo(this, 461, 78, textureX, textureY); // Box 360
		bodyModel[200] = new ModelRendererTurbo(this, 431, 78, textureX, textureY); // Box 361
		bodyModel[201] = new ModelRendererTurbo(this, 472, 123, textureX, textureY); // Box 362
		bodyModel[202] = new ModelRendererTurbo(this, 78, 173, textureX, textureY); // Box 103
		bodyModel[203] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // Box 103
		bodyModel[204] = new ModelRendererTurbo(this, 91, 173, textureX, textureY); // Box 103
		bodyModel[205] = new ModelRendererTurbo(this, 98, 173, textureX, textureY); // Box 103
		bodyModel[206] = new ModelRendererTurbo(this, 78, 177, textureX, textureY); // Box 103
		bodyModel[207] = new ModelRendererTurbo(this, 98, 177, textureX, textureY); // Box 103
		bodyModel[208] = new ModelRendererTurbo(this, 83, 177, textureX, textureY); // Box 103
		bodyModel[209] = new ModelRendererTurbo(this, 91, 177, textureX, textureY); // Box 103
		bodyModel[210] = new ModelRendererTurbo(this, 79, 204, textureX, textureY); // Box 380
		bodyModel[211] = new ModelRendererTurbo(this, 92, 205, textureX, textureY); // Box 381
		bodyModel[212] = new ModelRendererTurbo(this, 84, 205, textureX, textureY); // Box 382
		bodyModel[213] = new ModelRendererTurbo(this, 104, 167, textureX, textureY, "glow"); // Box 186 headlight 2beam top A
		bodyModel[214] = new ModelRendererTurbo(this, 104, 172, textureX, textureY, "glow"); // Box 187 headlight 2beam top A
		bodyModel[215] = new ModelRendererTurbo(this, 83, 226, textureX, textureY); // Box 386
		bodyModel[216] = new ModelRendererTurbo(this, 91, 226, textureX, textureY); // Box 387
		bodyModel[217] = new ModelRendererTurbo(this, 98, 226, textureX, textureY); // Box 388
		bodyModel[218] = new ModelRendererTurbo(this, 98, 230, textureX, textureY); // Box 389
		bodyModel[219] = new ModelRendererTurbo(this, 91, 230, textureX, textureY); // Box 390
		bodyModel[220] = new ModelRendererTurbo(this, 83, 230, textureX, textureY); // Box 391
		bodyModel[221] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 392
		bodyModel[222] = new ModelRendererTurbo(this, 78, 226, textureX, textureY); // Box 393
		bodyModel[223] = new ModelRendererTurbo(this, 111, 172, textureX, textureY, "glow"); // Large headlight
		bodyModel[224] = new ModelRendererTurbo(this, 118, 167, textureX, textureY, "glow"); // Box 186 headlight 2beam top B
		bodyModel[225] = new ModelRendererTurbo(this, 111, 167, textureX, textureY, "glow"); // Box 187 headlight 2beam top B
		bodyModel[226] = new ModelRendererTurbo(this, 91, 165, textureX, textureY); // Box 403 headlight cover
		bodyModel[227] = new ModelRendererTurbo(this, 96, 165, textureX, textureY); // Box 404 headlight cover
		bodyModel[228] = new ModelRendererTurbo(this, 96, 168, textureX, textureY); // Box 405 headlight cover
		bodyModel[229] = new ModelRendererTurbo(this, 91, 168, textureX, textureY); // Box 406 headlight cover
		bodyModel[230] = new ModelRendererTurbo(this, 465, 131, textureX, textureY); // Box 407
		bodyModel[231] = new ModelRendererTurbo(this, 458, 121, textureX, textureY); // Box 409
		bodyModel[232] = new ModelRendererTurbo(this, 451, 121, textureX, textureY); // Box 410
		bodyModel[233] = new ModelRendererTurbo(this, 441, 131, textureX, textureY); // Box 411
		bodyModel[234] = new ModelRendererTurbo(this, 95, 125, textureX, textureY); // NoName
		bodyModel[235] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // NoName
		bodyModel[236] = new ModelRendererTurbo(this, 86, 126, textureX, textureY); // NoName
		bodyModel[237] = new ModelRendererTurbo(this, 106, 127, textureX, textureY); // NoName
		bodyModel[238] = new ModelRendererTurbo(this, 68, 127, textureX, textureY); // NoName
		bodyModel[239] = new ModelRendererTurbo(this, 384, 64, textureX, textureY, "glow"); // Box 418 headlight rear right
		bodyModel[240] = new ModelRendererTurbo(this, 170, 232, textureX, textureY); // Box 419 pilot b, c
		bodyModel[241] = new ModelRendererTurbo(this, 199, 236, textureX, textureY); // Box 420 pilot b
		bodyModel[242] = new ModelRendererTurbo(this, 181, 232, textureX, textureY); // Box 421 pilot b
		bodyModel[243] = new ModelRendererTurbo(this, 159, 232, textureX, textureY); // Box 422 pilot b
		bodyModel[244] = new ModelRendererTurbo(this, 152, 232, textureX, textureY); // Box 423 pilot b
		bodyModel[245] = new ModelRendererTurbo(this, 110, 235, textureX, textureY); // Box 424
		bodyModel[246] = new ModelRendererTurbo(this, 64, 235, textureX, textureY); // Box 425
		bodyModel[247] = new ModelRendererTurbo(this, 170, 225, textureX, textureY); // Box 427 pilot b, c
		bodyModel[248] = new ModelRendererTurbo(this, 155, 223, textureX, textureY); // Box 429 pilot b
		bodyModel[249] = new ModelRendererTurbo(this, 196, 224, textureX, textureY); // Box 432 pilot b
		bodyModel[250] = new ModelRendererTurbo(this, 181, 223, textureX, textureY); // Box 433 pilot b
		bodyModel[251] = new ModelRendererTurbo(this, 142, 224, textureX, textureY); // Box 434 pilot b
		bodyModel[252] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 439
		bodyModel[253] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 440
		bodyModel[254] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 441
		bodyModel[255] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 442
		bodyModel[256] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[257] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[258] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[259] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[260] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[261] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[262] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[263] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[264] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[265] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[266] = new ModelRendererTurbo(this, 94, 137, textureX, textureY); // Box 364 prime base
		bodyModel[267] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "glow"); // Box 6 PRIME1-1
		bodyModel[268] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "glow"); // Box 7 PRIME1-3
		bodyModel[269] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "glow"); // Box 8 PRIME1-2
		bodyModel[270] = new ModelRendererTurbo(this, 94, 133, textureX, textureY, "glow"); // Box 9 PRIME1-4
		bodyModel[271] = new ModelRendererTurbo(this, 272, 42, textureX, textureY); // Box 465
		bodyModel[272] = new ModelRendererTurbo(this, 154, 193, textureX, textureY); // Box 474 pilot c
		bodyModel[273] = new ModelRendererTurbo(this, 176, 205, textureX, textureY); // Box 476 pilot c
		bodyModel[274] = new ModelRendererTurbo(this, 176, 193, textureX, textureY); // Box 477 pilot c
		bodyModel[275] = new ModelRendererTurbo(this, 197, 205, textureX, textureY); // Box 478 pilot c
		bodyModel[276] = new ModelRendererTurbo(this, 158, 205, textureX, textureY); // Box 479 pilot c
		bodyModel[277] = new ModelRendererTurbo(this, 176, 215, textureX, textureY); // Box 480 pilot c
		bodyModel[278] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 481 pilot c
		bodyModel[279] = new ModelRendererTurbo(this, 197, 193, textureX, textureY); // Box 482 pilot c
		bodyModel[280] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 483
		bodyModel[281] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 484
		bodyModel[282] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 372
		bodyModel[283] = new ModelRendererTurbo(this, 171, 48, textureX, textureY); // Box 486
		bodyModel[284] = new ModelRendererTurbo(this, 72, 177, textureX, textureY); // MU connection E
		bodyModel[285] = new ModelRendererTurbo(this, 141, 39, textureX, textureY); // MP firecracker antenna
		bodyModel[286] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[287] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 513
		bodyModel[288] = new ModelRendererTurbo(this, 91, 221, textureX, textureY); // Box 557
		bodyModel[289] = new ModelRendererTurbo(this, 104, 221, textureX, textureY, "glow"); // Box 186 headlight 2beam bottom A
		bodyModel[290] = new ModelRendererTurbo(this, 104, 226, textureX, textureY, "glow"); // Box 187 headlight 2beam bottom A
		bodyModel[291] = new ModelRendererTurbo(this, 111, 226, textureX, textureY, "glow"); // Box 169 headlight big bottom
		bodyModel[292] = new ModelRendererTurbo(this, 118, 221, textureX, textureY, "glow"); // Box 186 headlight 2beam bottom B
		bodyModel[293] = new ModelRendererTurbo(this, 111, 221, textureX, textureY, "glow"); // Box 187 headlight 2beam bottom B
		bodyModel[294] = new ModelRendererTurbo(this, 73, 227, textureX, textureY, "glow"); // Box 403 headlight backpart
		bodyModel[295] = new ModelRendererTurbo(this, 73, 227, textureX, textureY, "glow"); // Box 405 headlight backpart
		bodyModel[296] = new ModelRendererTurbo(this, 73, 227, textureX, textureY, "glow"); // Box 406 headlight backpart
		bodyModel[297] = new ModelRendererTurbo(this, 157, 54, textureX, textureY); // Box 404
		bodyModel[298] = new ModelRendererTurbo(this, 156, 52, textureX, textureY); // Box 405
		bodyModel[299] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 292, 11, textureX, textureY); // Box 0
		bodyModel[301] = new ModelRendererTurbo(this, 288, 15, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 301, 13, textureX, textureY); // Box 0
		bodyModel[303] = new ModelRendererTurbo(this, 292, 11, textureX, textureY); // Box 0
		bodyModel[304] = new ModelRendererTurbo(this, 250, 23, textureX, textureY, "cull"); // Box 186
		bodyModel[305] = new ModelRendererTurbo(this, 328, 15, textureX, textureY); // Single Steam Genorator
		bodyModel[306] = new ModelRendererTurbo(this, 328, 19, textureX, textureY); // Single Steam Genorator
		bodyModel[307] = new ModelRendererTurbo(this, 312, 23, textureX, textureY, "cull"); // Box 186
		bodyModel[308] = new ModelRendererTurbo(this, 284, 27, textureX, textureY); // Dynamic Brake fan
		bodyModel[309] = new ModelRendererTurbo(this, 274, 35, textureX, textureY); // Exhaust shrowd
		bodyModel[310] = new ModelRendererTurbo(this, 274, 35, textureX, textureY); // Exhaust shrowd
		bodyModel[311] = new ModelRendererTurbo(this, 368, 10, textureX, textureY); // Southern Air Tanks
		bodyModel[312] = new ModelRendererTurbo(this, 368, 20, textureX, textureY); // Southern Air Tanks
		bodyModel[313] = new ModelRendererTurbo(this, 371, 17, textureX, textureY); // Southern Air Tank Supports
		bodyModel[314] = new ModelRendererTurbo(this, 371, 17, textureX, textureY); // Southern Air Tank Supports
		bodyModel[315] = new ModelRendererTurbo(this, 371, 27, textureX, textureY); // Southern Air Tank Supports
		bodyModel[316] = new ModelRendererTurbo(this, 371, 27, textureX, textureY); // Southern Air Tank Supports
		bodyModel[317] = new ModelRendererTurbo(this, 368, 10, textureX, textureY); // Southern Air Tanks
		bodyModel[318] = new ModelRendererTurbo(this, 368, 20, textureX, textureY); // Southern Air Tanks
		bodyModel[319] = new ModelRendererTurbo(this, 371, 17, textureX, textureY); // Southern Air Tank Supports
		bodyModel[320] = new ModelRendererTurbo(this, 371, 17, textureX, textureY); // Southern Air Tank Supports
		bodyModel[321] = new ModelRendererTurbo(this, 371, 27, textureX, textureY); // Southern Air Tank Supports
		bodyModel[322] = new ModelRendererTurbo(this, 371, 27, textureX, textureY); // Southern Air Tank Supports
		bodyModel[323] = new ModelRendererTurbo(this, 286, 1, textureX, textureY); // Box 186
		bodyModel[324] = new ModelRendererTurbo(this, 286, 1, textureX, textureY); // Box 186
		bodyModel[325] = new ModelRendererTurbo(this, 119, 119, textureX, textureY); // Box 196
		bodyModel[326] = new ModelRendererTurbo(this, 295, 119, textureX, textureY); // Box 197
		bodyModel[327] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[328] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[329] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[330] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[331] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[332] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[333] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[334] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[335] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[336] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[337] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[338] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[339] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[340] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[341] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[342] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[343] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[345] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[346] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[347] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[348] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[349] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[350] = new ModelRendererTurbo(this, 364, 197, textureX, textureY); // Box 9
		bodyModel[351] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[352] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[353] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[354] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[355] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[356] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[358] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[359] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 0
		bodyModel[362] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[363] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[364] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[365] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[366] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[367] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[368] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[369] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[370] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[371] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[372] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[373] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[374] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[375] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[376] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[377] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[378] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 114
		bodyModel[379] = new ModelRendererTurbo(this, 384, 248, textureX, textureY); // Box 115
		bodyModel[380] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[381] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[382] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[383] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[384] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[385] = new ModelRendererTurbo(this, 303, 197, textureX, textureY); // Box 42
		bodyModel[386] = new ModelRendererTurbo(this, 278, 211, textureX, textureY); // Box 44
		bodyModel[387] = new ModelRendererTurbo(this, 308, 177, textureX, textureY); // Box 324
		bodyModel[388] = new ModelRendererTurbo(this, 278, 205, textureX, textureY); // Box 325
		bodyModel[389] = new ModelRendererTurbo(this, 307, 158, textureX, textureY); // Box 324
		bodyModel[390] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[391] = new ModelRendererTurbo(this, 287, 174, textureX, textureY); // Box 324
		bodyModel[392] = new ModelRendererTurbo(this, 320, 183, textureX, textureY); // Box 324
		bodyModel[393] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[394] = new ModelRendererTurbo(this, 317, 183, textureX, textureY); // Box 324
		bodyModel[395] = new ModelRendererTurbo(this, 275, 19, textureX, textureY); // Box 0
		bodyModel[396] = new ModelRendererTurbo(this, 288, 21, textureX, textureY); // Box 0
		bodyModel[397] = new ModelRendererTurbo(this, 301, 19, textureX, textureY); // Box 0
		bodyModel[398] = new ModelRendererTurbo(this, 236, 151, textureX, textureY); // Box 189
		bodyModel[399] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[400] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 179
		bodyModel[401] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 180
		bodyModel[402] = new ModelRendererTurbo(this, 331, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[403] = new ModelRendererTurbo(this, 331, 128, textureX, textureY); // Box 335
		bodyModel[404] = new ModelRendererTurbo(this, 331, 148, textureX, textureY); // Box 337
		bodyModel[405] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[406] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[407] = new ModelRendererTurbo(this, 235, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[408] = new ModelRendererTurbo(this, 235, 128, textureX, textureY); // Box 336
		bodyModel[409] = new ModelRendererTurbo(this, 235, 148, textureX, textureY); // Box 338
		bodyModel[410] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Duel Steam Genorator
		bodyModel[411] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Duel Steam Genorator
		bodyModel[412] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Duel Steam Genorator
		bodyModel[413] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Duel Steam Genorator
		bodyModel[414] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // ATSF E8m extentions
		bodyModel[415] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // ATSF E8m extentions
		bodyModel[416] = new ModelRendererTurbo(this, 157, 54, textureX, textureY); // Box 404
		bodyModel[417] = new ModelRendererTurbo(this, 157, 54, textureX, textureY); // Can be used as antenna
		bodyModel[418] = new ModelRendererTurbo(this, 157, 54, textureX, textureY); // Box 404
		bodyModel[419] = new ModelRendererTurbo(this, 169, 53, textureX, textureY); // Box 404
		bodyModel[420] = new ModelRendererTurbo(this, 208, 48, textureX, textureY); // AMTK 4316 and Southern horn
		bodyModel[421] = new ModelRendererTurbo(this, 208, 54, textureX, textureY); // AMTK 4316 and Southern horn
		bodyModel[422] = new ModelRendererTurbo(this, 208, 51, textureX, textureY); // AMTK 4316 and Southern horn
		bodyModel[423] = new ModelRendererTurbo(this, 169, 40, textureX, textureY); // horn base
		bodyModel[424] = new ModelRendererTurbo(this, 167, 37, textureX, textureY); // CBQ horn
		bodyModel[425] = new ModelRendererTurbo(this, 219, 37, textureX, textureY); // CP and VIA horn
		bodyModel[426] = new ModelRendererTurbo(this, 219, 43, textureX, textureY); // CP and VIA horn
		bodyModel[427] = new ModelRendererTurbo(this, 219, 40, textureX, textureY); // CP and VIA horn
		bodyModel[428] = new ModelRendererTurbo(this, 226, 40, textureX, textureY); // Erie Lackawanna horn
		bodyModel[429] = new ModelRendererTurbo(this, 226, 43, textureX, textureY); // Erie Lackawanna horn
		bodyModel[430] = new ModelRendererTurbo(this, 226, 37, textureX, textureY); // Erie Lackawanna and ATSF E8m horn
		bodyModel[431] = new ModelRendererTurbo(this, 178, 43, textureX, textureY); // Amtrak and PRR horn
		bodyModel[432] = new ModelRendererTurbo(this, 209, 43, textureX, textureY); // Stupid UP horns
		bodyModel[433] = new ModelRendererTurbo(this, 213, 46, textureX, textureY); // horn base
		bodyModel[434] = new ModelRendererTurbo(this, 209, 37, textureX, textureY); // Stupid UP horns
		bodyModel[435] = new ModelRendererTurbo(this, 209, 40, textureX, textureY); // horn base
		bodyModel[436] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Box 186
		bodyModel[437] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Box 186
		bodyModel[438] = new ModelRendererTurbo(this, 248, 32, textureX, textureY); // Stupid UP snow sheild
		bodyModel[439] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[440] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[441] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[442] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[443] = new ModelRendererTurbo(this, 320, 32, textureX, textureY); // Stupid UP snow sheild
		bodyModel[444] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[445] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[446] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[447] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Stupid UP snow sheild
		bodyModel[448] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Normal extentions
		bodyModel[449] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Normal extentions
		bodyModel[450] = new ModelRendererTurbo(this, 104, 177, textureX, textureY); // MU connection F
		bodyModel[451] = new ModelRendererTurbo(this, 119, 240, textureX, textureY); // MU connection E bottom
		bodyModel[452] = new ModelRendererTurbo(this, 114, 240, textureX, textureY); // MU connection F bottom
		bodyModel[453] = new ModelRendererTurbo(this, 287, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[454] = new ModelRendererTurbo(this, 287, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[455] = new ModelRendererTurbo(this, 297, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[456] = new ModelRendererTurbo(this, 297, 7, textureX, textureY); // Normal extention weird sides
		bodyModel[457] = new ModelRendererTurbo(this, 289, 35, textureX, textureY); // SP spark arresters
		bodyModel[458] = new ModelRendererTurbo(this, 289, 35, textureX, textureY); // SP spark arresters
		bodyModel[459] = new ModelRendererTurbo(this, 310, 32, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[460] = new ModelRendererTurbo(this, 310, 32, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[461] = new ModelRendererTurbo(this, 303, 29, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[462] = new ModelRendererTurbo(this, 303, 29, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[463] = new ModelRendererTurbo(this, 312, 38, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[464] = new ModelRendererTurbo(this, 312, 38, textureX, textureY); // CBQ/BN spark arresters
		bodyModel[465] = new ModelRendererTurbo(this, 104, 162, textureX, textureY, "glow"); // IC 3 lamp
		bodyModel[466] = new ModelRendererTurbo(this, 118, 162, textureX, textureY, "glow"); // IC 3 lamp
		bodyModel[467] = new ModelRendererTurbo(this, 111, 162, textureX, textureY, "glow"); // IC 3 lamp
		bodyModel[468] = new ModelRendererTurbo(this, 80, 165, textureX, textureY); // Box 403 headlight cover
		bodyModel[469] = new ModelRendererTurbo(this, 85, 165, textureX, textureY); // Box 404 headlight cover
		bodyModel[470] = new ModelRendererTurbo(this, 85, 168, textureX, textureY); // Box 405 headlight cover
		bodyModel[471] = new ModelRendererTurbo(this, 80, 168, textureX, textureY); // Box 406 headlight cover
		bodyModel[472] = new ModelRendererTurbo(this, 296, 42, textureX, textureY); // MILW spark arresters
		bodyModel[473] = new ModelRendererTurbo(this, 296, 47, textureX, textureY); // MILW spark arresters
		bodyModel[474] = new ModelRendererTurbo(this, 288, 42, textureX, textureY); // MILW spark arresters
		bodyModel[475] = new ModelRendererTurbo(this, 288, 47, textureX, textureY); // MILW spark arrester support
		bodyModel[476] = new ModelRendererTurbo(this, 296, 42, textureX, textureY); // MILW spark arresters
		bodyModel[477] = new ModelRendererTurbo(this, 296, 47, textureX, textureY); // MILW spark arresters
		bodyModel[478] = new ModelRendererTurbo(this, 288, 42, textureX, textureY); // MILW spark arresters
		bodyModel[479] = new ModelRendererTurbo(this, 288, 47, textureX, textureY); // MILW spark arrester support
		bodyModel[480] = new ModelRendererTurbo(this, 45, 171, textureX, textureY, "glow"); // Box 185 numberboard glow
		bodyModel[481] = new ModelRendererTurbo(this, 52, 172, textureX, textureY, "glow"); // Box 185 numberboard glow
		bodyModel[482] = new ModelRendererTurbo(this, 129, 171, textureX, textureY, "glow"); // Box 185 numberboard glow
		bodyModel[483] = new ModelRendererTurbo(this, 124, 172, textureX, textureY, "glow"); // Box 185 numberboard glow
		bodyModel[484] = new ModelRendererTurbo(this, 77, 221, textureX, textureY); // BN end of train light
		bodyModel[485] = new ModelRendererTurbo(this, 78, 223, textureX, textureY, "glow"); // BN end of train light glow
		bodyModel[486] = new ModelRendererTurbo(this, 464, 67, textureX, textureY); // NYC sheilds
		bodyModel[487] = new ModelRendererTurbo(this, 467, 67, textureX, textureY); // NYC sheilds
		bodyModel[488] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[489] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[490] = new ModelRendererTurbo(this, 176, 49, textureX, textureY); // BN iceical breakers
		bodyModel[491] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[492] = new ModelRendererTurbo(this, 176, 49, textureX, textureY); // BN iceical breakers
		bodyModel[493] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[494] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[495] = new ModelRendererTurbo(this, 184, 48, textureX, textureY); // BN iceical breakers
		bodyModel[496] = new ModelRendererTurbo(this, 175, 48, textureX, textureY); // BN iceical breakers
		bodyModel[497] = new ModelRendererTurbo(this, 175, 48, textureX, textureY); // BN iceical breakers
		bodyModel[498] = new ModelRendererTurbo(this, 57, 221, textureX, textureY, "glow"); // Wacky AMTK tri lights
		bodyModel[499] = new ModelRendererTurbo(this, 50, 221, textureX, textureY, "glow"); // Wacky AMTK tri lights

		bodyModel[0].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-40F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-49F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(46F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-23F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-23F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-37.5F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-37.5F, -10F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[7].setRotationPoint(45F, 3F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[8].setRotationPoint(45F, 1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[9].setRotationPoint(45F, 3F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[10].setRotationPoint(45F, 3F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[11].setRotationPoint(45F, -15F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-32F, -19F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 78, 1, 6, 0F); // Box 0
		bodyModel[13].setRotationPoint(-32F, -19F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-32F, -19F, 3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-32F, -18F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-32F, -18F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-32F, -16F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-32F, -16F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[19].setRotationPoint(45F, -17F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[20].setRotationPoint(45F, -18F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(45F, -17F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(45F, -17F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(45F, -18F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(45F, -18F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-36.5F, -18F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-34F, -19F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -2F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-34F, -19F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -0.5F, -1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-34F, -18F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-33F, -16F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1 pilot a
		bodyModel[30].setRotationPoint(-47F, 3F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[31].setRotationPoint(-44.5F, -12F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[32].setRotationPoint(-46.5F, -10F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[33].setRotationPoint(-43.5F, -14F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 118
		bodyModel[34].setRotationPoint(-40.5F, -14F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[35].setRotationPoint(-33F, -16F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-23F, -18F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(-27F, -3F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(-28.5F, -15F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-32F, -15F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-27.5F, -15F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[41].setRotationPoint(-27F, -15F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[42].setRotationPoint(-27F, -3F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[43].setRotationPoint(-28.5F, -15F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-32F, -15F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-27.5F, -15F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[46].setRotationPoint(-27F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 0
		bodyModel[47].setRotationPoint(-35.5F, -11F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[48].setRotationPoint(-9.5F, 2F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[49].setRotationPoint(-12.5F, 2F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[50].setRotationPoint(-9.5F, 2F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[51].setRotationPoint(-12.5F, 2F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[52].setRotationPoint(13.5F, 2F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[53].setRotationPoint(13.5F, 2F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[54].setRotationPoint(-41.5F, -8.5F, -10F);
		bodyModel[54].rotateAngleY = 0.6981317F;

		bodyModel[55].addBox(0F, 0F, -5F, 2, 2, 5, 0F); // Box 144
		bodyModel[55].setRotationPoint(-41.5F, -8.5F, 10F);
		bodyModel[55].rotateAngleY = -0.6981317F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Low nose lift lugs
		bodyModel[56].setRotationPoint(-47.5F, 0F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Low nose lift lugs
		bodyModel[57].setRotationPoint(-47.5F, 0F, 4F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Low nose lift lugs
		bodyModel[58].setRotationPoint(-47.5F, -1F, -4F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Low nose lift lugs
		bodyModel[59].setRotationPoint(-47.5F, -1F, 4F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Nose hand railing
		bodyModel[60].setRotationPoint(-45.25F, -8F, -3F);
		bodyModel[60].rotateAngleZ = -0.15707963F;

		bodyModel[61].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Nose hand railing
		bodyModel[61].setRotationPoint(-45.25F, -8F, 3F);
		bodyModel[61].rotateAngleZ = -0.15707963F;

		bodyModel[62].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[62].setRotationPoint(-47F, 1F, -2.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[63].setRotationPoint(-22.5F, -11F, -11.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[64].setRotationPoint(-27.5F, -11F, -11.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 154
		bodyModel[65].setRotationPoint(-27.5F, -11F, 10.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 155
		bodyModel[66].setRotationPoint(-22.5F, -11F, 10.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[67].setRotationPoint(-27F, 2F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[68].setRotationPoint(-27F, 2F, 11F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[69].setRotationPoint(-32F, -14F, -12F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[70].setRotationPoint(-32F, -14F, 11F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[71].setRotationPoint(-36.5F, 2F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[72].setRotationPoint(-36.5F, 2F, 11F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Early CP horns
		bodyModel[73].setRotationPoint(-27.5F, -20.5F, -5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[74].setRotationPoint(-27.5F, -19.5F, -5F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Early CP horns
		bodyModel[75].setRotationPoint(-30.5F, -20.5F, 4F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[76].setRotationPoint(-27.5F, -19.5F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 commander beacon
		bodyModel[77].setRotationPoint(-30F, -20F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 349
		bodyModel[78].setRotationPoint(-30F, -20F, -0.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 184 numberboard glow
		bodyModel[79].setRotationPoint(-41.51F, -8.5F, -10F);
		bodyModel[79].rotateAngleY = 0.6981317F;

		bodyModel[80].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 185 numberboard glow
		bodyModel[80].setRotationPoint(-41.51F, -8.5F, 10F);
		bodyModel[80].rotateAngleY = -0.6981317F;

		bodyModel[81].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[81].setRotationPoint(42.5F, 2F, 11F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[82].setRotationPoint(42.5F, 2F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // CBQ horn
		bodyModel[83].setRotationPoint(-30.5F, -20.5F, 2F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[84].setRotationPoint(-28.5F, -19.5F, 2.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // CBQ horn
		bodyModel[85].setRotationPoint(-29.5F, -20.5F, 3F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[86].setRotationPoint(45.5F, -4F, -11.75F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[87].setRotationPoint(42.5F, -4F, -11.75F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[88].setRotationPoint(45.5F, -4F, 10.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[89].setRotationPoint(42.5F, -4F, 10.75F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[90].setRotationPoint(46F, -19F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[91].setRotationPoint(46F, -19F, -7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[92].setRotationPoint(46F, -14F, -4F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[93].setRotationPoint(46F, -14F, 3F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Amtrak and PRR horn
		bodyModel[94].setRotationPoint(-23.5F, -20.5F, 0F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Amtrak and PRR horn
		bodyModel[95].setRotationPoint(-25.5F, -20.5F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Horn base
		bodyModel[96].setRotationPoint(-23.5F, -19.5F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // ATSF E8m horn
		bodyModel[97].setRotationPoint(-29.5F, -20.5F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[98].setRotationPoint(-33.5F, -11F, 8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[99].setRotationPoint(-34F, -9F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131
		bodyModel[100].setRotationPoint(-31.5F, -11F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[101].setRotationPoint(-32.5F, -11F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131
		bodyModel[102].setRotationPoint(-33.5F, -11F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[103].setRotationPoint(-34.5F, -12.3F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[104].setRotationPoint(-33F, -13F, 1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[105].setRotationPoint(-35F, -13.5F, 2.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[106].setRotationPoint(46F, -19F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[107].setRotationPoint(45.5F, -10.5F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[108].setRotationPoint(46.01F, 2F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[109].setRotationPoint(46.01F, 2F, 5F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[110].setRotationPoint(27.5F, 3F, -2F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[111].setRotationPoint(-27.5F, 3F, -2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 ditchlight front a
		bodyModel[112].setRotationPoint(-46.75F, -0.25F, -6.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[113].setRotationPoint(-46F, -0.25F, -6.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front a
		bodyModel[114].setRotationPoint(-46.75F, -0.25F, 4.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[115].setRotationPoint(-46F, -0.25F, 4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[116].setRotationPoint(-27.5F, -25F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[117].setRotationPoint(-27.5F, -25F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[118].setRotationPoint(-27.5F, -24F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[119].setRotationPoint(-27.5F, -24F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[120].setRotationPoint(-27.5F, -22F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[121].setRotationPoint(-27.5F, -22F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[122].setRotationPoint(-27.5F, -22F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[123].setRotationPoint(-27.5F, -22F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[124].setRotationPoint(-27.5F, -24F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[125].setRotationPoint(-27.5F, -24F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[126].setRotationPoint(-27.5F, -25F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[127].setRotationPoint(-27.5F, -25F, -9F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 194
		bodyModel[128].setRotationPoint(-27.5F, -21F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 278
		bodyModel[129].setRotationPoint(-43.5F, -10F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F); // Box 279
		bodyModel[130].setRotationPoint(-42.5F, -10F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[131].setRotationPoint(-39.5F, -10F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, -1.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1.5F, 0F, 1F, 3F, 0F); // Box 281
		bodyModel[132].setRotationPoint(-40.5F, -14F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5F, 1.5F, 0F); // Box 282
		bodyModel[133].setRotationPoint(-40.5F, -14F, 2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 284
		bodyModel[134].setRotationPoint(-41.5F, -14F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -2F, -2.75F, 0F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F, -2F, 1.75F, -1F, 0F, 1F, -3F); // Box 289
		bodyModel[135].setRotationPoint(-41.5F, -13F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 291
		bodyModel[136].setRotationPoint(-37.5F, -13F, 8F);

		bodyModel[137].addBox(0F, 0F, 0F, 13, 3, 20, 0F); // Box 293
		bodyModel[137].setRotationPoint(-35F, -3F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 294
		bodyModel[138].setRotationPoint(-43.5F, -10F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 2F); // Box 295
		bodyModel[139].setRotationPoint(-42.5F, -10F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[140].setRotationPoint(-39.5F, -10F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1.5F, 1F, 0F); // Box 311
		bodyModel[141].setRotationPoint(-35.5F, -15F, 10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 312
		bodyModel[142].setRotationPoint(-34.5F, -15F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, -3F, 0F, 0F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[143].setRotationPoint(-40.5F, -14F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[144].setRotationPoint(-40.5F, -14F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[145].setRotationPoint(-41.5F, -14F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 323
		bodyModel[146].setRotationPoint(-36.5F, -17F, -7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3.5F, -1F, 0F, 3.5F, -1F, 0F, 3F, 1F, 0F, -3F, 1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[147].setRotationPoint(-36.5F, -16F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 325
		bodyModel[148].setRotationPoint(-35.5F, -15F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
		bodyModel[149].setRotationPoint(-34.5F, -15F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-2.5F, 1F, 0F, 2.5F, 1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 327
		bodyModel[150].setRotationPoint(-36.5F, -17F, 2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3F, 1F, 0F, 3F, 1F, 0F, 3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 328
		bodyModel[151].setRotationPoint(-36.5F, -16F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.9F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F); // Box 329
		bodyModel[152].setRotationPoint(-35.5F, -13F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F); // Box 330
		bodyModel[153].setRotationPoint(-34F, -19F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 331
		bodyModel[154].setRotationPoint(-34F, -18F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 332
		bodyModel[155].setRotationPoint(-46.5F, 2F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[156].setRotationPoint(-46.5F, 2F, -8F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 334
		bodyModel[157].setRotationPoint(-46.5F, 2F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F); // Box 335
		bodyModel[158].setRotationPoint(-44.5F, 2F, 8F);

		bodyModel[159].addBox(0F, 0F, 0F, 89, 2, 14, 0F); // Box 441
		bodyModel[159].setRotationPoint(-44F, 1F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[160].setRotationPoint(-44F, -12F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[161].setRotationPoint(-44F, -12F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[162].setRotationPoint(-44F, -14F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[163].setRotationPoint(-44F, -14F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[164].setRotationPoint(-45F, -8F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[165].setRotationPoint(-45F, -8F, -2F);

		bodyModel[166].addBox(0F, 0F, 0F, 8, 1, 9, 0F); // Box 865
		bodyModel[166].setRotationPoint(-35F, -4F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 866
		bodyModel[167].setRotationPoint(-43.5F, -12F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -3F, 0F, -1F, -2F, 0F, -1F, 0.75F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 867
		bodyModel[168].setRotationPoint(-42.5F, -13F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,1F, -1F, 0F, -1F, 0.75F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 868
		bodyModel[169].setRotationPoint(-42.5F, -13F, 2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 869
		bodyModel[170].setRotationPoint(-43.5F, -12F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		bodyModel[171].setRotationPoint(-44.5F, 2F, -13F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1297 pilot a
		bodyModel[172].setRotationPoint(-47F, 3F, 2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1299 pilot a
		bodyModel[173].setRotationPoint(-47F, 3F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.65F, 0F, 0.85F, -0.7F, 0F, 0.85F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 1300 pilot a
		bodyModel[174].setRotationPoint(-45F, 3F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.7F, 0F, 0.85F, 0.65F, 0F, 0.85F); // Box 1301 pilot a
		bodyModel[175].setRotationPoint(-45F, 3F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.75F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 1302
		bodyModel[176].setRotationPoint(-42.5F, -11F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -1F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1303
		bodyModel[177].setRotationPoint(-42.5F, -11F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, -3F, -2F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, -2F, 1.75F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 1304
		bodyModel[178].setRotationPoint(-41.5F, -13F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2.5F, 0F, 0.9F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 1305
		bodyModel[179].setRotationPoint(-35.5F, -13F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -2.75F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 1306
		bodyModel[180].setRotationPoint(-37.5F, -13F, -11F);

		bodyModel[181].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[181].setRotationPoint(-23.5F, -14F, -10.5F);

		bodyModel[182].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right cab
		bodyModel[182].setRotationPoint(-23.5F, -14F, 10.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 326
		bodyModel[183].setRotationPoint(-32.5F, -19F, -3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 327
		bodyModel[184].setRotationPoint(-32.5F, -19F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 328
		bodyModel[185].setRotationPoint(-32.5F, -19F, 2F);

		bodyModel[186].addBox(0F, 0F, 0F, 40, 17, 1, 0F); // Box 333
		bodyModel[186].setRotationPoint(6F, -15F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 40, 17, 1, 0F); // Box 334
		bodyModel[187].setRotationPoint(6F, -15F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[188].setRotationPoint(-35.5F, -12F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[189].setRotationPoint(-35.5F, -12F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[190].setRotationPoint(-35.5F, -13F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[191].setRotationPoint(-35.5F, -13F, 2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[192].setRotationPoint(-37.5F, -13F, -2F);

		bodyModel[193].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 352 markerlight
		bodyModel[193].setRotationPoint(-42.4F, -9.5F, -7.7F);
		bodyModel[193].rotateAngleY = 0.6981317F;

		bodyModel[194].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 353 markerlight
		bodyModel[194].setRotationPoint(-42.4F, -9.5F, 7.7F);
		bodyModel[194].rotateAngleY = -0.6981317F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[195].setRotationPoint(-34.5F, -10F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[196].setRotationPoint(-34.5F, -13F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[197].setRotationPoint(-34.5F, -12F, -10F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 359
		bodyModel[198].setRotationPoint(-35.5F, -11F, 2F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360
		bodyModel[199].setRotationPoint(-34.5F, -9.3F, 6F);

		bodyModel[200].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 361
		bodyModel[200].setRotationPoint(-35F, -4F, -10F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 362
		bodyModel[201].setRotationPoint(-32.5F, -9F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[202].setRotationPoint(-45F, -14F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[203].setRotationPoint(-45F, -14F, 0F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[204].setRotationPoint(-45F, -14F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[205].setRotationPoint(-45F, -14F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[206].setRotationPoint(-45F, -12F, 1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[207].setRotationPoint(-45F, -12F, -2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[208].setRotationPoint(-45F, -11F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[209].setRotationPoint(-45F, -11F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[210].setRotationPoint(-44.5F, -12F, 1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[211].setRotationPoint(-44.5F, -11F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[212].setRotationPoint(-44.5F, -11F, 0F);

		bodyModel[213].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[213].setRotationPoint(-44.25F, -12F, 0F);

		bodyModel[214].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[214].setRotationPoint(-44.25F, -12F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 386
		bodyModel[215].setRotationPoint(-46F, -8F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 387
		bodyModel[216].setRotationPoint(-46F, -8F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 388
		bodyModel[217].setRotationPoint(-46F, -8F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 389
		bodyModel[218].setRotationPoint(-46F, -6F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[219].setRotationPoint(-46F, -5F, -2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 391
		bodyModel[220].setRotationPoint(-46F, -5F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 392
		bodyModel[221].setRotationPoint(-46F, -6F, 1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[222].setRotationPoint(-46F, -8F, 1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Large headlight
		bodyModel[223].setRotationPoint(-44.25F, -13.25F, -1.25F);

		bodyModel[224].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[224].setRotationPoint(-44.25F, -12F, 0F);
		bodyModel[224].rotateAngleX = 1.57079633F;

		bodyModel[225].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[225].setRotationPoint(-44.25F, -12F, 0F);
		bodyModel[225].rotateAngleX = 1.57079633F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight cover
		bodyModel[226].setRotationPoint(-45.01F, -14F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight cover
		bodyModel[227].setRotationPoint(-45.01F, -14F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 headlight cover
		bodyModel[228].setRotationPoint(-45.01F, -12F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406 headlight cover
		bodyModel[229].setRotationPoint(-45.01F, -12F, 0F);

		bodyModel[230].addBox(-1F, 0F, -1F, 2, 3, 2, 0F); // Box 407
		bodyModel[230].setRotationPoint(-31.5F, -12F, -4F);
		bodyModel[230].rotateAngleY = -0.78539816F;

		bodyModel[231].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 409
		bodyModel[231].setRotationPoint(-37.5F, -13F, 2F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 410
		bodyModel[232].setRotationPoint(-37.5F, -13F, -3F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 411
		bodyModel[233].setRotationPoint(-38.5F, -13F, -3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // NoName
		bodyModel[234].setRotationPoint(-32F, -19F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // NoName
		bodyModel[235].setRotationPoint(-32F, -19F, 2F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // NoName
		bodyModel[236].setRotationPoint(-32.5F, -20F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // NoName
		bodyModel[237].setRotationPoint(-32F, -17F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // NoName
		bodyModel[238].setRotationPoint(-32F, -17F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[239].setRotationPoint(45.5F, -10.5F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 419 pilot b, c
		bodyModel[240].setRotationPoint(-46.5F, 5F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.55F, 0F, 0.75F, 0.5F, 0F, 0.75F); // Box 420 pilot b
		bodyModel[241].setRotationPoint(-44.5F, 5F, -9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 421 pilot b
		bodyModel[242].setRotationPoint(-46.5F, 5F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 422 pilot b
		bodyModel[243].setRotationPoint(-46.5F, 5F, 2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.5F, 0F, 0.75F, -0.55F, 0F, 0.75F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 423 pilot b
		bodyModel[244].setRotationPoint(-44.5F, 5F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[245].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[246].setRotationPoint(-39.5F, 2F, 10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427 pilot b, c
		bodyModel[247].setRotationPoint(-45.5F, 3F, -2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 429 pilot b
		bodyModel[248].setRotationPoint(-45.5F, 3F, 2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-4F, 0F, -2F, 4F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 432 pilot b
		bodyModel[249].setRotationPoint(-43.5F, 3F, -13F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433 pilot b
		bodyModel[250].setRotationPoint(-45.5F, 3F, -8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 3F, 0F, -3F, -3F, 0F, -3F); // Box 434 pilot b
		bodyModel[251].setRotationPoint(-43.5F, 3F, 8F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 439
		bodyModel[252].setRotationPoint(-26.5F, 1F, -11.75F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 440
		bodyModel[253].setRotationPoint(-26.5F, -3F, -11.75F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 441
		bodyModel[254].setRotationPoint(-26.5F, -3F, 10.75F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 442
		bodyModel[255].setRotationPoint(-26.5F, 1F, 10.75F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[256].setRotationPoint(47F, -15F, 4F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[257].setRotationPoint(47F, -15F, -5F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[258].setRotationPoint(46F, -15F, -4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[259].setRotationPoint(47F, -16F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[260].setRotationPoint(47F, -16F, 0F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[261].setRotationPoint(46F, 1F, -4F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[262].setRotationPoint(45.5F, -13F, -2F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[263].setRotationPoint(47F, -14F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[264].setRotationPoint(47F, -14F, -3F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[265].setRotationPoint(46F, 2F, -3.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[266].setRotationPoint(-32F, -20F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[267].setRotationPoint(-32F, -20.5F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[268].setRotationPoint(-32F, -20.5F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[269].setRotationPoint(-32F, -20.5F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[270].setRotationPoint(-32F, -20.5F, -1F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 465
		bodyModel[271].setRotationPoint(-14.5F, -21.25F, -3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -3F, 0F, -1F); // Box 474 pilot c
		bodyModel[272].setRotationPoint(-45.5F, 3F, 2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476 pilot c
		bodyModel[273].setRotationPoint(-46.5F, 5F, -9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477 pilot c
		bodyModel[274].setRotationPoint(-45.5F, 3F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 0F, 3F, 0F, 0F); // Box 478 pilot c
		bodyModel[275].setRotationPoint(-41.5F, 3F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 479 pilot c
		bodyModel[276].setRotationPoint(-46.5F, 5F, 2F);

		bodyModel[277].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-3.36F, 0F, 0.5F, 3.36F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -2.36F, 0F, 0F, 2.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480 pilot c
		bodyModel[277].setRotationPoint(-46.5F, 5F, -9F);

		bodyModel[278].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3.36F, 0F, 0.5F, -3.36F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.36F, 0F, 0F, -2.36F, 0F, 0F); // Box 481 pilot c
		bodyModel[278].setRotationPoint(-46.5F, 5F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 482 pilot c
		bodyModel[279].setRotationPoint(-41.5F, 3F, 2F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 483
		bodyModel[280].setRotationPoint(-26.5F, -1F, 10.75F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 484
		bodyModel[281].setRotationPoint(-26.5F, -1F, -11.75F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[282].setRotationPoint(-30.5F, -20F, -1F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 486
		bodyModel[283].setRotationPoint(-31.5F, -21F, 0F);

		bodyModel[284].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // MU connection E
		bodyModel[284].setRotationPoint(-43.7F, -10.5F, 3.75F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // MP firecracker antenna
		bodyModel[285].setRotationPoint(-28.5F, -21F, -0.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[286].setRotationPoint(-23F, -18F, -6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[287].setRotationPoint(-23F, -18F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[288].setRotationPoint(-45F, -8F, -2F);

		bodyModel[289].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[289].setRotationPoint(-45.6F, -6F, 0F);

		bodyModel[290].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[290].setRotationPoint(-45.6F, -6F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big bottom
		bodyModel[291].setRotationPoint(-45.6F, -7.25F, -1.25F);

		bodyModel[292].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[292].setRotationPoint(-45.6F, -6F, 0F);
		bodyModel[292].rotateAngleX = 1.57079633F;

		bodyModel[293].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[293].setRotationPoint(-45.6F, -6F, 0F);
		bodyModel[293].rotateAngleX = 1.57079633F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight backpart
		bodyModel[294].setRotationPoint(-45.2F, -8F, 0F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 405 headlight backpart
		bodyModel[295].setRotationPoint(-45.2F, -6F, -2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 406 headlight backpart
		bodyModel[296].setRotationPoint(-45.2F, -6F, 0F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[297].setRotationPoint(-23F, -21F, 2F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[298].setRotationPoint(-26F, -21F, -2F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[299].setRotationPoint(-16.5F, -20F, -2F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[300].setRotationPoint(-1.5F, -20F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[301].setRotationPoint(-12.25F, -20F, -2F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[302].setRotationPoint(-8F, -20F, -2F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[303].setRotationPoint(8.5F, -20F, -1F);

		bodyModel[304].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[304].setRotationPoint(-21.4F, -21F, -3F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[305].setRotationPoint(32.5F, -20F, 0F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[306].setRotationPoint(36.5F, -20F, -2F);

		bodyModel[307].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[307].setRotationPoint(20.35F, -21F, -3F);

		bodyModel[308].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Dynamic Brake fan
		bodyModel[308].setRotationPoint(1F, -20F, -3F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Exhaust shrowd
		bodyModel[309].setRotationPoint(-2F, -22F, -2F);

		bodyModel[310].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Exhaust shrowd
		bodyModel[310].setRotationPoint(8F, -22F, -2F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Southern Air Tanks
		bodyModel[311].setRotationPoint(17.6F, -19.85F, -6.9F);
		bodyModel[311].rotateAngleX = 0.78539816F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Southern Air Tanks
		bodyModel[312].setRotationPoint(17.6F, -19.85F, 2.67F);
		bodyModel[312].rotateAngleX = 0.78539816F;

		bodyModel[313].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[313].setRotationPoint(18.6F, -19.85F, -6.2F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[314].setRotationPoint(26.6F, -19.85F, -6.2F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[315].setRotationPoint(18.6F, -19.85F, 6.2F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[316].setRotationPoint(26.6F, -19.85F, 6.2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Southern Air Tanks
		bodyModel[317].setRotationPoint(-17.4F, -19.85F, -6.9F);
		bodyModel[317].rotateAngleX = 0.78539816F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Southern Air Tanks
		bodyModel[318].setRotationPoint(-17.4F, -19.85F, 2.67F);
		bodyModel[318].rotateAngleX = 0.78539816F;

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[319].setRotationPoint(-16.4F, -19.85F, -6.2F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[320].setRotationPoint(-8.4F, -19.85F, -6.2F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[321].setRotationPoint(-16.4F, -19.85F, 6.2F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Southern Air Tank Supports
		bodyModel[322].setRotationPoint(-8.4F, -19.85F, 6.2F);

		bodyModel[323].addBox(0F, 0F, 0F, 66, 4, 0, 0F); // Box 186
		bodyModel[323].setRotationPoint(-22.4F, -22F, 5.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 66, 4, 0, 0F); // Box 186
		bodyModel[324].setRotationPoint(-22.4F, -22F, -5.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 67, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[325].setRotationPoint(-22F, -14.5F, -11.25F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 67, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[326].setRotationPoint(-22F, -14.5F, 10.25F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[327].setRotationPoint(27F, -14F, -2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[328].setRotationPoint(27F, -14F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[329].setRotationPoint(27F, -14F, 2F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[330].setRotationPoint(27F, -10F, -3F);

		bodyModel[331].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[331].setRotationPoint(10F, -4F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[332].setRotationPoint(12F, -15F, -1.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[333].setRotationPoint(11F, -12F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[334].setRotationPoint(12F, -14F, -1.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[335].setRotationPoint(11F, -8F, -2F);

		bodyModel[336].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[336].setRotationPoint(28F, -13F, 3F);

		bodyModel[337].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[337].setRotationPoint(28F, -13F, -6F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[338].setRotationPoint(24.5F, -14F, -1F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[339].setRotationPoint(20.5F, -14F, -1F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[340].setRotationPoint(22.5F, -14F, -1F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[341].setRotationPoint(17.5F, -14F, -1F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[342].setRotationPoint(13.5F, -14F, -1F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[343].setRotationPoint(15.5F, -14F, -1F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[344].setRotationPoint(-14F, -14F, -2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[345].setRotationPoint(-14F, -14F, 2F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 13
		bodyModel[346].setRotationPoint(-14F, -10F, -3F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[347].setRotationPoint(2F, -4F, -5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[348].setRotationPoint(-12F, -15F, -1.5F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[349].setRotationPoint(2F, -12F, -4F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[350].setRotationPoint(-12F, -14F, -1.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[351].setRotationPoint(2F, -8F, -2F);

		bodyModel[352].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[352].setRotationPoint(-19F, -13F, 3F);

		bodyModel[353].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[353].setRotationPoint(-19F, -13F, -6F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[354].setRotationPoint(-0.5F, -14F, -1F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[355].setRotationPoint(-4.5F, -14F, -1F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[356].setRotationPoint(-2.5F, -14F, -1F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[357].setRotationPoint(-7.5F, -14F, -1F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[358].setRotationPoint(-11.5F, -14F, -1F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[359].setRotationPoint(-9.5F, -14F, -1F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[360].setRotationPoint(1.5F, -18F, -1F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[361].setRotationPoint(11.5F, -18F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[362].setRotationPoint(-18F, -5.5F, -4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[363].setRotationPoint(-18F, -8F, 1.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[364].setRotationPoint(-18F, -8F, -1.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[365].setRotationPoint(-18F, -8F, -3.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[366].setRotationPoint(-18F, -3F, -3.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[367].setRotationPoint(-18F, -3F, -1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[368].setRotationPoint(-21F, -5F, -1.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[369].setRotationPoint(-18F, -11F, -1.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[370].setRotationPoint(-16F, -9.5F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[371].setRotationPoint(-16F, -10.5F, -1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[372].setRotationPoint(-14F, -14F, -6F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[373].setRotationPoint(-18F, -3F, 1.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[374].setRotationPoint(27F, -5.5F, -4F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[375].setRotationPoint(27F, -8F, 1.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[376].setRotationPoint(27F, -8F, -1.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[377].setRotationPoint(27F, -8F, -3.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[378].setRotationPoint(27F, -3F, -3.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[379].setRotationPoint(27F, -3F, -1.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[380].setRotationPoint(32F, -5F, -1.5F);

		bodyModel[381].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[381].setRotationPoint(30F, -11F, -1.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[382].setRotationPoint(28F, -9.5F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[383].setRotationPoint(28F, -10.5F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[384].setRotationPoint(27F, -3F, 1.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 20, 4, 20, 0F); // Box 42
		bodyModel[385].setRotationPoint(-8F, 2F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[386].setRotationPoint(-8F, 6F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[387].setRotationPoint(-8F, 6F, -8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[388].setRotationPoint(-8F, 6F, 8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[389].setRotationPoint(-11F, 6F, -8F);
		bodyModel[389].rotateAngleZ = 0.78539816F;

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[390].setRotationPoint(12.92F, 1F, -8.01F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[391].setRotationPoint(12F, 6F, -8F);
		bodyModel[391].rotateAngleZ = 0.78539816F;

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[392].setRotationPoint(12.92F, 1F, 8.01F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[393].setRotationPoint(-10.1F, 1F, -8.01F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[394].setRotationPoint(-10.1F, 1F, 8.01F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[395].setRotationPoint(12F, -20F, -2F);

		bodyModel[396].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[396].setRotationPoint(16.25F, -20F, -2F);

		bodyModel[397].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[397].setRotationPoint(20.5F, -20F, -2F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[398].setRotationPoint(2F, 2F, -11.01F);

		bodyModel[399].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[399].setRotationPoint(2F, 2F, 11.01F);

		bodyModel[400].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 179
		bodyModel[400].setRotationPoint(6.5F, -9F, 10.75F);

		bodyModel[401].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[401].setRotationPoint(1.5F, -9F, 10.75F);

		bodyModel[402].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[402].setRotationPoint(5.5F, -10F, 10.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[403].setRotationPoint(2F, -15F, 10F);

		bodyModel[404].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[404].setRotationPoint(2F, 1F, 10F);

		bodyModel[405].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[405].setRotationPoint(6.5F, -9F, -11.75F);

		bodyModel[406].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[406].setRotationPoint(1.5F, -9F, -11.75F);

		bodyModel[407].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[407].setRotationPoint(5.5F, -10F, -10.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[408].setRotationPoint(2F, -15F, -11F);

		bodyModel[409].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[409].setRotationPoint(2F, 1F, -11F);

		bodyModel[410].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[410].setRotationPoint(33.5F, -19.7F, -4F);

		bodyModel[411].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[411].setRotationPoint(39.5F, -19.7F, -4F);

		bodyModel[412].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[412].setRotationPoint(33.5F, -19.7F, 2F);

		bodyModel[413].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[413].setRotationPoint(39.5F, -19.7F, 2F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // ATSF E8m extentions
		bodyModel[414].setRotationPoint(-1.5F, -22F, -1F);

		bodyModel[415].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // ATSF E8m extentions
		bodyModel[415].setRotationPoint(8.5F, -22F, -1F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[416].setRotationPoint(-26F, -21F, 2F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Can be used as antenna
		bodyModel[417].setRotationPoint(-23F, -21F, -2F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[418].setRotationPoint(-26F, -21F, -2F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 404
		bodyModel[419].setRotationPoint(-24.5F, -23F, -0.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // AMTK 4316 and Southern horn
		bodyModel[420].setRotationPoint(-24F, -20.5F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // AMTK 4316 and Southern horn
		bodyModel[421].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[422].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // AMTK 4316 and Southern horn
		bodyModel[422].setRotationPoint(-25F, -20.5F, 0F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[423].setRotationPoint(-28.5F, -19.5F, -3.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // CBQ horn
		bodyModel[424].setRotationPoint(-29.5F, -20.5F, -3.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // CP and VIA horn
		bodyModel[425].setRotationPoint(-27F, -20.5F, 5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // CP and VIA horn
		bodyModel[426].setRotationPoint(-27.5F, -20.5F, 3F);

		bodyModel[427].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // CP and VIA horn
		bodyModel[427].setRotationPoint(-28.5F, -20.5F, 4F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Erie Lackawanna horn
		bodyModel[428].setRotationPoint(-28.5F, -20.5F, 4F);

		bodyModel[429].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Erie Lackawanna horn
		bodyModel[429].setRotationPoint(-27.5F, -20.5F, 3F);

		bodyModel[430].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Erie Lackawanna and ATSF E8m horn
		bodyModel[430].setRotationPoint(-29.5F, -20.5F, 5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Amtrak and PRR horn
		bodyModel[431].setRotationPoint(-24.5F, -20.5F, 1F);

		bodyModel[432].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Stupid UP horns
		bodyModel[432].setRotationPoint(-14.5F, -23.25F, -1.5F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[433].setRotationPoint(-14.5F, -22.25F, -1.5F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Stupid UP horns
		bodyModel[434].setRotationPoint(-16.5F, -23.25F, 0.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // horn base
		bodyModel[435].setRotationPoint(-14.5F, -22.25F, 0.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[436].setRotationPoint(-14.5F, -21.25F, -3.01F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[437].setRotationPoint(-14.5F, -21.25F, 3.01F);

		bodyModel[438].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Stupid UP snow sheild
		bodyModel[438].setRotationPoint(-21F, -21.25F, -4F);

		bodyModel[439].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[439].setRotationPoint(-21F, -21.25F, -3.01F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[440].setRotationPoint(-21F, -21.25F, 3.01F);

		bodyModel[441].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[441].setRotationPoint(-18F, -21.25F, -3.01F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[442].setRotationPoint(-18F, -21.25F, 3.01F);

		bodyModel[443].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Stupid UP snow sheild
		bodyModel[443].setRotationPoint(25F, -21.25F, -4F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[444].setRotationPoint(25F, -21.25F, -3.01F);

		bodyModel[445].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[445].setRotationPoint(25F, -21.25F, 3.01F);

		bodyModel[446].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[446].setRotationPoint(28F, -21.25F, -3.01F);

		bodyModel[447].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Stupid UP snow sheild
		bodyModel[447].setRotationPoint(28F, -21.25F, 3.01F);

		bodyModel[448].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Normal extentions
		bodyModel[448].setRotationPoint(-1.5F, -21F, -1F);

		bodyModel[449].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Normal extentions
		bodyModel[449].setRotationPoint(8.5F, -21F, -1F);

		bodyModel[450].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // MU connection F
		bodyModel[450].setRotationPoint(-43.7F, -10.5F, -3.75F);

		bodyModel[451].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // MU connection E bottom
		bodyModel[451].setRotationPoint(-45.35F, 0.5F, 4.75F);

		bodyModel[452].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // MU connection F bottom
		bodyModel[452].setRotationPoint(-45.35F, 0.5F, -4.75F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[453].setRotationPoint(7.5F, -21F, -1.01F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[454].setRotationPoint(7.5F, -21F, 1.01F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[455].setRotationPoint(-2.5F, -21F, -1.01F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Normal extention weird sides
		bodyModel[456].setRotationPoint(-2.5F, -21F, 1.01F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // SP spark arresters
		bodyModel[457].setRotationPoint(-2.5F, -22F, -1.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // SP spark arresters
		bodyModel[458].setRotationPoint(7.5F, -22F, -1.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // CBQ/BN spark arresters
		bodyModel[459].setRotationPoint(-2.5F, -22.25F, -1.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // CBQ/BN spark arresters
		bodyModel[460].setRotationPoint(7.5F, -22.25F, -1.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CBQ/BN spark arresters
		bodyModel[461].setRotationPoint(-2F, -22.75F, -1F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CBQ/BN spark arresters
		bodyModel[462].setRotationPoint(8F, -22.75F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // CBQ/BN spark arresters
		bodyModel[463].setRotationPoint(-2F, -20.75F, -1F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // CBQ/BN spark arresters
		bodyModel[464].setRotationPoint(8F, -20.75F, -1F);

		bodyModel[465].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // IC 3 lamp
		bodyModel[465].setRotationPoint(-44.25F, -12.13F, 0F);

		bodyModel[466].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // IC 3 lamp
		bodyModel[466].setRotationPoint(-44.25F, -11.63F, 0F);
		bodyModel[466].rotateAngleX = 1.57079633F;

		bodyModel[467].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // IC 3 lamp
		bodyModel[467].setRotationPoint(-44.25F, -11.63F, 0F);
		bodyModel[467].rotateAngleX = 1.57079633F;

		bodyModel[468].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight cover
		bodyModel[468].setRotationPoint(-46.01F, -8F, 0F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight cover
		bodyModel[469].setRotationPoint(-46.01F, -8F, -2F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 headlight cover
		bodyModel[470].setRotationPoint(-46.01F, -6F, -2F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406 headlight cover
		bodyModel[471].setRotationPoint(-46.01F, -6F, 0F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW spark arresters
		bodyModel[472].setRotationPoint(-3.49F, -21.5F, -1.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MILW spark arresters
		bodyModel[473].setRotationPoint(-3.49F, -20.5F, -1.5F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arresters
		bodyModel[474].setRotationPoint(-3.48F, -22.5F, -1F);

		bodyModel[475].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arrester support
		bodyModel[475].setRotationPoint(-3.48F, -20.5F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW spark arresters
		bodyModel[476].setRotationPoint(8.49F, -21.5F, -1.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MILW spark arresters
		bodyModel[477].setRotationPoint(8.49F, -20.5F, -1.5F);

		bodyModel[478].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arresters
		bodyModel[478].setRotationPoint(10.5F, -22.5F, -1F);

		bodyModel[479].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // MILW spark arrester support
		bodyModel[479].setRotationPoint(10.5F, -20.5F, -1F);

		bodyModel[480].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185 numberboard glow
		bodyModel[480].setRotationPoint(-40.51F, -8.5F, 9.35F);
		bodyModel[480].rotateAngleY = -1.02974426F;
		bodyModel[480].rotateAngleZ = -0.10471976F;

		bodyModel[481].addShapeBox(0F, 0F, -2F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185 numberboard glow
		bodyModel[481].setRotationPoint(-42.75F, -8.5F, 8F);
		bodyModel[481].rotateAngleY = -0.34906585F;
		bodyModel[481].rotateAngleZ = -0.16580628F;

		bodyModel[482].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185 numberboard glow
		bodyModel[482].setRotationPoint(-40.53F, -8.5F, -9.35F);
		bodyModel[482].rotateAngleY = -2.11621172F;
		bodyModel[482].rotateAngleZ = 0.08726646F;

		bodyModel[483].addShapeBox(0F, 0F, -2F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185 numberboard glow
		bodyModel[483].setRotationPoint(-43.47F, -8.5F, -6.1F);
		bodyModel[483].rotateAngleY = 0.34906585F;
		bodyModel[483].rotateAngleZ = -0.14835299F;

		bodyModel[484].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F); // BN end of train light
		bodyModel[484].setRotationPoint(-44.7F, -9.25F, 0F);

		bodyModel[485].addShapeBox(-0.5F, -0.5F, -0.5F, 0, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // BN end of train light glow
		bodyModel[485].setRotationPoint(-44.83F, -9.25F, 0F);

		bodyModel[486].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // NYC sheilds
		bodyModel[486].setRotationPoint(-32.4F, -14F, -12F);
		bodyModel[486].rotateAngleZ = -0.37960911F;

		bodyModel[487].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // NYC sheilds
		bodyModel[487].setRotationPoint(-32.4F, -14F, 11F);
		bodyModel[487].rotateAngleZ = -0.37960911F;

		bodyModel[488].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[488].setRotationPoint(-23F, -18.8F, 8.7F);

		bodyModel[489].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[489].setRotationPoint(-23F, -20.5F, 4F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // BN iceical breakers
		bodyModel[490].setRotationPoint(-23F, -20.5F, 4F);
		bodyModel[490].rotateAngleX = -0.34906585F;

		bodyModel[491].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[491].setRotationPoint(-23F, -20.5F, -4F);

		bodyModel[492].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // BN iceical breakers
		bodyModel[492].setRotationPoint(-23F, -20.5F, -4F);
		bodyModel[492].rotateAngleX = 3.4906585F;

		bodyModel[493].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[493].setRotationPoint(-23F, -18.8F, -8.7F);

		bodyModel[494].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // BN iceical breakers
		bodyModel[494].setRotationPoint(-23F, -21.15F, 5F);

		bodyModel[495].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // BN iceical breakers
		bodyModel[495].setRotationPoint(-23F, -21.15F, -5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // BN iceical breakers
		bodyModel[496].setRotationPoint(-23F, -23.5F, 0F);
		bodyModel[496].rotateAngleX = -0.43895031F;

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // BN iceical breakers
		bodyModel[497].setRotationPoint(-23F, -23.5F, 0F);
		bodyModel[497].rotateAngleX = 3.58054296F;

		bodyModel[498].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Wacky AMTK tri lights
		bodyModel[498].setRotationPoint(-46.7F, -6F, 0F);

		bodyModel[499].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Wacky AMTK tri lights
		bodyModel[499].setRotationPoint(-46.7F, -6F, 0F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 57, 226, textureX, textureY, "glow"); // Wacky AMTK tri lights
		bodyModel[501] = new ModelRendererTurbo(this, 64, 221, textureX, textureY); // Wacky AMTK tri lights holder
		bodyModel[502] = new ModelRendererTurbo(this, 83, 137, textureX, textureY); // Box 336
		bodyModel[503] = new ModelRendererTurbo(this, 87, 132, textureX, textureY, "glow"); // Box 337 ane 2 beam
		bodyModel[504] = new ModelRendererTurbo(this, 87, 132, textureX, textureY, "glow"); // Box 338 ane 2 beam
		bodyModel[505] = new ModelRendererTurbo(this, 194, 40, textureX, textureY); // Box 249
		bodyModel[506] = new ModelRendererTurbo(this, 203, 41, textureX, textureY); // Box 250
		bodyModel[507] = new ModelRendererTurbo(this, 194, 37, textureX, textureY); // Box 251
		bodyModel[508] = new ModelRendererTurbo(this, 194, 43, textureX, textureY); // Box 252
		bodyModel[509] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 114
		bodyModel[510] = new ModelRendererTurbo(this, 193, 52, textureX, textureY); // Box 74
		bodyModel[511] = new ModelRendererTurbo(this, 193, 58, textureX, textureY); // Box 78
		bodyModel[512] = new ModelRendererTurbo(this, 197, 59, textureX, textureY); // Box 245
		bodyModel[513] = new ModelRendererTurbo(this, 198, 54, textureX, textureY); // Box 257
		bodyModel[514] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[516] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[517] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[518] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[519] = new ModelRendererTurbo(this, 430, 155, textureX, textureY); // Box 6
		bodyModel[520] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[521] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[522] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 0
		bodyModel[523] = new ModelRendererTurbo(this, 422, 192, textureX, textureY); // Box 3
		bodyModel[524] = new ModelRendererTurbo(this, 422, 176, textureX, textureY); // Box 4
		bodyModel[525] = new ModelRendererTurbo(this, 430, 169, textureX, textureY); // Box 5
		bodyModel[526] = new ModelRendererTurbo(this, 430, 162, textureX, textureY); // Box 7
		bodyModel[527] = new ModelRendererTurbo(this, 422, 208, textureX, textureY); // Box 3
		bodyModel[528] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 530
		bodyModel[529] = new ModelRendererTurbo(this, 422, 222, textureX, textureY); // Box 2
		bodyModel[530] = new ModelRendererTurbo(this, 372, 66, textureX, textureY, "glow"); // Box 418 headlight rear middle

		bodyModel[500].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Wacky AMTK tri lights
		bodyModel[500].setRotationPoint(-46.7F, -4F, 0F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Wacky AMTK tri lights holder
		bodyModel[501].setRotationPoint(-46.25F, -8F, -1F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[502].setRotationPoint(-33.25F, -20.5F, -2F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ane 2 beam
		bodyModel[503].setRotationPoint(-34F, -20.5F, 0F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ane 2 beam
		bodyModel[504].setRotationPoint(-34F, -20.5F, -2F);

		bodyModel[505].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 249
		bodyModel[505].setRotationPoint(4F, -19.5F, -9F);

		bodyModel[506].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 250
		bodyModel[506].setRotationPoint(5F, -18.5F, -9F);

		bodyModel[507].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 251
		bodyModel[507].setRotationPoint(2F, -19.5F, -8F);

		bodyModel[508].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 252
		bodyModel[508].setRotationPoint(3F, -19.5F, -10F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[509].setRotationPoint(4.5F, -18.5F, 8.7F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[510].setRotationPoint(4.5F, -19.5F, 8.7F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[511].setRotationPoint(4.75F, -18F, 8.95F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[512].setRotationPoint(4.5F, -20.5F, 7.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257
		bodyModel[513].setRotationPoint(4.5F, -19.5F, 6.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[514].setRotationPoint(12F, -3F, -6F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[515].setRotationPoint(12F, -5F, -6F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[516].setRotationPoint(12F, -8F, -6F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[517].setRotationPoint(12F, -10F, -6F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[518].setRotationPoint(12F, -12F, -6F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[519].setRotationPoint(12F, -12F, 2F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[520].setRotationPoint(12F, -12F, -2F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[521].setRotationPoint(12F, -6F, -6F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[522].setRotationPoint(-13F, -3F, -6F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[523].setRotationPoint(-13F, -8F, -6F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[524].setRotationPoint(-13F, -10F, -6F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[525].setRotationPoint(-13F, -12F, -6F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[526].setRotationPoint(-13F, -12F, -2F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[527].setRotationPoint(-13F, -6F, -6F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[528].setRotationPoint(-45.2F, -8F, -2F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[529].setRotationPoint(-13F, -5F, -6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear middle
		bodyModel[530].setRotationPoint(45.5F, -17.5F, -1F);
	}
	ModelBlombergA1ATruck theTruck = new ModelBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 531; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("glow")) {
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergA1ATruckGrey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergA1ATruckBlack.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.6, -0.0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.45, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.93D, 1.23D, 0D});
				add(new double[]{1.3D, 1.23D, 0D});
			}
		};
	}
}