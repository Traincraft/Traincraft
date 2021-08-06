//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: Bidahochi
// Created on: 23.02.2020 - 15:35:18
// Last changed on: 23.02.2020 - 15:35:18

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

public class ModelH1044 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelH1044() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[252];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box20
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // box21
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // box22
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // box23
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // box03
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // box05
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // box06
		bodyModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // box07
		bodyModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // box08
		bodyModel[15] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // box24
		bodyModel[16] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // box25
		bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box26
		bodyModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // box27
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box28
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // box29
		bodyModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // box48
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box50
		bodyModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // box51
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // box56
		bodyModel[25] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // box57
		bodyModel[26] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box58
		bodyModel[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // box04
		bodyModel[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // box70
		bodyModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // box81
		bodyModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // box82
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 134
		bodyModel[32] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 217
		bodyModel[34] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 371
		bodyModel[35] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 372
		bodyModel[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 374
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 375
		bodyModel[38] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 376
		bodyModel[39] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 377
		bodyModel[40] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 378
		bodyModel[41] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 379
		bodyModel[42] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 380
		bodyModel[43] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 381
		bodyModel[44] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 382
		bodyModel[45] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 383
		bodyModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 384
		bodyModel[47] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 385
		bodyModel[48] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 386
		bodyModel[49] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 387
		bodyModel[50] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "lamp"); // Box 388 lamp front
		bodyModel[51] = new ModelRendererTurbo(this, 3, 41, textureX, textureY); // Box 389
		bodyModel[52] = new ModelRendererTurbo(this, 477, 33, textureX, textureY); // Box 467
		bodyModel[53] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 468
		bodyModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // box31 smoke
		bodyModel[55] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // box32 smoke
		bodyModel[56] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 471
		bodyModel[57] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 472 
		bodyModel[58] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // box64
		bodyModel[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // box65
		bodyModel[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 478
		bodyModel[61] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 479
		bodyModel[62] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 480
		bodyModel[63] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 481
		bodyModel[64] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 482
		bodyModel[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 483
		bodyModel[66] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 484
		bodyModel[67] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 485
		bodyModel[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 486
		bodyModel[69] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 487
		bodyModel[70] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 488
		bodyModel[71] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 489
		bodyModel[72] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 490
		bodyModel[73] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 491
		bodyModel[74] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 492
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 493
		bodyModel[76] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 494
		bodyModel[77] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 495
		bodyModel[78] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 496
		bodyModel[79] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 497
		bodyModel[80] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 498
		bodyModel[81] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 499
		bodyModel[82] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 500
		bodyModel[83] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 501
		bodyModel[84] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 502
		bodyModel[85] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 503
		bodyModel[86] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 504
		bodyModel[87] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 505
		bodyModel[88] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 506
		bodyModel[89] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 507
		bodyModel[90] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 508
		bodyModel[91] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 509
		bodyModel[92] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 510
		bodyModel[93] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 511
		bodyModel[94] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 512
		bodyModel[95] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 513
		bodyModel[96] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 514
		bodyModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 515
		bodyModel[98] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 516
		bodyModel[99] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 517
		bodyModel[100] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 518
		bodyModel[101] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 519
		bodyModel[102] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 520
		bodyModel[103] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 521
		bodyModel[104] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 522
		bodyModel[105] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 523
		bodyModel[106] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 524
		bodyModel[107] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 525
		bodyModel[108] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 526
		bodyModel[109] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 527
		bodyModel[110] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 528
		bodyModel[111] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 529
		bodyModel[112] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 530
		bodyModel[113] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 531
		bodyModel[114] = new ModelRendererTurbo(this, 241, 33, textureX, textureY, "lamp"); // Box 532 lamp rear
		bodyModel[115] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 534
		bodyModel[116] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 535
		bodyModel[117] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 536
		bodyModel[118] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 537
		bodyModel[119] = new ModelRendererTurbo(this, 274, 102, textureX, textureY); // Box 538
		bodyModel[120] = new ModelRendererTurbo(this, 291, 96, textureX, textureY); // Box 539
		bodyModel[121] = new ModelRendererTurbo(this, 307, 102, textureX, textureY, "cull"); // Box 540 cull
		bodyModel[122] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 541
		bodyModel[123] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 542
		bodyModel[124] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 543
		bodyModel[125] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 545
		bodyModel[126] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 546
		bodyModel[127] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 547
		bodyModel[128] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 548
		bodyModel[129] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 549
		bodyModel[130] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 550
		bodyModel[131] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 551
		bodyModel[132] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 552
		bodyModel[133] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 553
		bodyModel[134] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 554
		bodyModel[135] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 555
		bodyModel[136] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 708
		bodyModel[137] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 709
		bodyModel[138] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 710
		bodyModel[139] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 711
		bodyModel[140] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 712
		bodyModel[141] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 713
		bodyModel[142] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 792
		bodyModel[143] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 114
		bodyModel[144] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 74
		bodyModel[145] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 78
		bodyModel[146] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 875
		bodyModel[147] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 876
		bodyModel[148] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 877
		bodyModel[149] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 878
		bodyModel[150] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 879
		bodyModel[151] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 314 door swing right
		bodyModel[152] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 315 door swing right
		bodyModel[153] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 883
		bodyModel[154] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 884
		bodyModel[155] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 886
		bodyModel[156] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 887
		bodyModel[157] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 888
		bodyModel[158] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 889
		bodyModel[159] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 890
		bodyModel[160] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 891
		bodyModel[161] = new ModelRendererTurbo(this, 441, 57, textureX, textureY, "lamp"); // Box 162 light commander beacon rear
		bodyModel[162] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 165
		bodyModel[163] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 894
		bodyModel[164] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 895
		bodyModel[165] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 896
		bodyModel[166] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 897 liveryimg 1
		bodyModel[167] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 898 liveryimg 1
		bodyModel[168] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 899 liveryimg 1
		bodyModel[169] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 900 liveryimg 1
		bodyModel[170] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 901 liveryimg 1
		bodyModel[171] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 902 liveryimg 2
		bodyModel[172] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 903 liveryimg 2
		bodyModel[173] = new ModelRendererTurbo(this, 300, 83, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 264, 83, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 229, 91, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 237, 89, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 305, 91, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 466, 70, textureX, textureY, "lamp"); // Box 182 light commander beacon low
		bodyModel[182] = new ModelRendererTurbo(this, 504, 65, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 212, 90, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 181, 91, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 394, 86, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 262, 90, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 244, 90, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 329, 74, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 2, 69, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 329, 68, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 457, 67, textureX, textureY, "lamp"); // Box 193 light commander beacon forward
		bodyModel[193] = new ModelRendererTurbo(this, 456, 73, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 12, 70, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 15, 70, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 291, 55, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 257, 35, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 268, 36, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 54, 60, textureX, textureY); // Box 555
		bodyModel[205] = new ModelRendererTurbo(this, 186, 75, textureX, textureY); // Box 4
		bodyModel[206] = new ModelRendererTurbo(this, 148, 70, textureX, textureY); // Box 4
		bodyModel[207] = new ModelRendererTurbo(this, 154, 80, textureX, textureY); // Box 4
		bodyModel[208] = new ModelRendererTurbo(this, 190, 93, textureX, textureY); // Box 4
		bodyModel[209] = new ModelRendererTurbo(this, 165, 67, textureX, textureY); // Box 4
		bodyModel[210] = new ModelRendererTurbo(this, 205, 67, textureX, textureY); // Box 4
		bodyModel[211] = new ModelRendererTurbo(this, 111, 76, textureX, textureY); // Box 4
		bodyModel[212] = new ModelRendererTurbo(this, 120, 92, textureX, textureY); // Box 4
		bodyModel[213] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 4
		bodyModel[214] = new ModelRendererTurbo(this, 161, 95, textureX, textureY); // Box 4
		bodyModel[215] = new ModelRendererTurbo(this, 109, 64, textureX, textureY); // Box 4
		bodyModel[216] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 4
		bodyModel[217] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 94, 51, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 204
		bodyModel[220] = new ModelRendererTurbo(this, 314, 37, textureX, textureY); // Box 204
		bodyModel[221] = new ModelRendererTurbo(this, 278, 27, textureX, textureY); // Box 204
		bodyModel[222] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 204
		bodyModel[223] = new ModelRendererTurbo(this, 251, 40, textureX, textureY); // Box 204
		bodyModel[224] = new ModelRendererTurbo(this, 296, 27, textureX, textureY); // Box 204
		bodyModel[225] = new ModelRendererTurbo(this, 441, 52, textureX, textureY, "lamp"); // Box 162 light commander beacon tall
		bodyModel[226] = new ModelRendererTurbo(this, 505, 61, textureX, textureY); // Box 165
		bodyModel[227] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 196
		bodyModel[228] = new ModelRendererTurbo(this, 15, 67, textureX, textureY); // Box 196
		bodyModel[229] = new ModelRendererTurbo(this, 180, 66, textureX, textureY); // Box 535
		bodyModel[230] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 537
		bodyModel[231] = new ModelRendererTurbo(this, 363, 66, textureX, textureY); // Box 397
		bodyModel[232] = new ModelRendererTurbo(this, 374, 70, textureX, textureY); // Box 398
		bodyModel[233] = new ModelRendererTurbo(this, 462, 80, textureX, textureY); // Box 131
		bodyModel[234] = new ModelRendererTurbo(this, 467, 80, textureX, textureY); // Box 131
		bodyModel[235] = new ModelRendererTurbo(this, 465, 74, textureX, textureY); // Box 131
		bodyModel[236] = new ModelRendererTurbo(this, 478, 79, textureX, textureY); // Box 131
		bodyModel[237] = new ModelRendererTurbo(this, 476, 71, textureX, textureY); // Box 131
		bodyModel[238] = new ModelRendererTurbo(this, 20, 47, textureX, textureY); // Box 389
		bodyModel[239] = new ModelRendererTurbo(this, 20, 41, textureX, textureY); // Box 389
		bodyModel[240] = new ModelRendererTurbo(this, 6, 41, textureX, textureY); // Box 389
		bodyModel[241] = new ModelRendererTurbo(this, 6, 82, textureX, textureY); // Box 389
		bodyModel[242] = new ModelRendererTurbo(this, 23, 88, textureX, textureY); // Box 389
		bodyModel[243] = new ModelRendererTurbo(this, 23, 82, textureX, textureY); // Box 389
		bodyModel[244] = new ModelRendererTurbo(this, 9, 87, textureX, textureY); // Box 389
		bodyModel[245] = new ModelRendererTurbo(this, 493, 79, textureX, textureY); // Box 131
		bodyModel[246] = new ModelRendererTurbo(this, 334, 96, textureX, textureY); // Box 540
		bodyModel[247] = new ModelRendererTurbo(this, 276, 97, textureX, textureY); // Box 372
		bodyModel[248] = new ModelRendererTurbo(this, 494, 67, textureX, textureY); // Box 467
		bodyModel[249] = new ModelRendererTurbo(this, 257, 102, textureX, textureY); // Box 538
		bodyModel[250] = new ModelRendererTurbo(this, 289, 90, textureX, textureY); // Box 539
		bodyModel[251] = new ModelRendererTurbo(this, 305, 110, textureX, textureY); // Box 540

		bodyModel[0].addBox(0F, 0F, 0F, 58, 3, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(-36F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(33F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 5
		bodyModel[3].setRotationPoint(-32F, 1F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 6
		bodyModel[4].setRotationPoint(-32.01F, 1F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // box20
		bodyModel[5].setRotationPoint(17F, -16F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box21
		bodyModel[6].setRotationPoint(18F, -16F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box22
		bodyModel[7].setRotationPoint(18F, -16F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // box23
		bodyModel[8].setRotationPoint(28F, -16F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 20
		bodyModel[9].setRotationPoint(29F, 1F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 43, 20, 14, 0F); // box03
		bodyModel[10].setRotationPoint(-26F, -19F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 19, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box05
		bodyModel[11].setRotationPoint(-29F, -18F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 20, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box06
		bodyModel[12].setRotationPoint(-29F, -19F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 20, 4, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // box07
		bodyModel[13].setRotationPoint(-29F, -19F, 3F);

		bodyModel[14].addBox(0F, 0F, 0F, 34, 1, 6, 0F); // box08
		bodyModel[14].setRotationPoint(-17F, -20F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // box24
		bodyModel[15].setRotationPoint(7F, -3F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // box25
		bodyModel[16].setRotationPoint(7F, -3F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box26
		bodyModel[17].setRotationPoint(5F, -3F, 11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box27
		bodyModel[18].setRotationPoint(5F, -3F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // box28
		bodyModel[19].setRotationPoint(5F, -1F, 7F);

		bodyModel[20].addBox(0F, 0F, -14F, 2, 0, 4, 0F); // box29
		bodyModel[20].setRotationPoint(5F, -1F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box48
		bodyModel[21].setRotationPoint(16F, -7F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box50
		bodyModel[22].setRotationPoint(15F, -5F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box51
		bodyModel[23].setRotationPoint(13F, -4F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
		bodyModel[24].setRotationPoint(13F, -4F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
		bodyModel[25].setRotationPoint(15F, -5F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
		bodyModel[26].setRotationPoint(16F, -7F, 11F);

		bodyModel[27].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // box04
		bodyModel[27].setRotationPoint(-6F, 4F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // box70
		bodyModel[28].setRotationPoint(-5F, 4F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // box81
		bodyModel[29].setRotationPoint(5F, 3.5F, -8.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // box82
		bodyModel[30].setRotationPoint(-6F, 3.5F, -8.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 134
		bodyModel[31].setRotationPoint(-5F, 4F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 135
		bodyModel[32].setRotationPoint(-5F, 4F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 217
		bodyModel[33].setRotationPoint(-32F, -7F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[34].setRotationPoint(17F, -17F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[35].setRotationPoint(17F, -19F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[36].setRotationPoint(-28F, -20F, -2F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 375
		bodyModel[37].setRotationPoint(-26F, -20F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[38].setRotationPoint(-17F, -20F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[39].setRotationPoint(-17F, -20F, 3F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 378
		bodyModel[40].setRotationPoint(-24F, -19.5F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[41].setRotationPoint(-26F, -20F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[42].setRotationPoint(-26F, -20F, 3F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 19, 14, 0F); // Box 381
		bodyModel[43].setRotationPoint(-27F, -18F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 382
		bodyModel[44].setRotationPoint(-28F, -19F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 383
		bodyModel[45].setRotationPoint(-27F, -19F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[46].setRotationPoint(-27F, -19F, 3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[47].setRotationPoint(-27F, -19F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[48].setRotationPoint(-28F, -19F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[49].setRotationPoint(-28F, -19F, 2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 388 lamp front
		bodyModel[50].setRotationPoint(-28.5F, -17F, -1.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 389
		bodyModel[51].setRotationPoint(28F, -18F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 467
		bodyModel[52].setRotationPoint(17F, -19F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[53].setRotationPoint(17F, -17F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box31 smoke
		bodyModel[54].setRotationPoint(-14F, -20.5F, -3F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box32 smoke
		bodyModel[55].setRotationPoint(-14F, -20.5F, 1F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 471
		bodyModel[56].setRotationPoint(-14F, -21.5F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 472 
		bodyModel[57].setRotationPoint(-14F, -21.5F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[58].setRotationPoint(19.5F, -15F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[59].setRotationPoint(19.5F, -15F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		bodyModel[60].setRotationPoint(-32F, -7F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 479
		bodyModel[61].setRotationPoint(-32F, -5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[62].setRotationPoint(-32F, 2F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 481
		bodyModel[63].setRotationPoint(-32F, 7F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[64].setRotationPoint(-32F, 4F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[65].setRotationPoint(-29F, 4F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 484
		bodyModel[66].setRotationPoint(-29F, 7F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 485
		bodyModel[67].setRotationPoint(-32F, 9F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 486
		bodyModel[68].setRotationPoint(-32F, 1F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 487
		bodyModel[69].setRotationPoint(-32F, 3F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 488
		bodyModel[70].setRotationPoint(-32F, 6F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		bodyModel[71].setRotationPoint(-29F, 4F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 490
		bodyModel[72].setRotationPoint(-32F, 6F, 8F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 491
		bodyModel[73].setRotationPoint(-32F, 9F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 492
		bodyModel[74].setRotationPoint(-32F, 7F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[75].setRotationPoint(-32F, 4F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[76].setRotationPoint(-29F, 4F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[77].setRotationPoint(-29F, 4F, 9F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 496
		bodyModel[78].setRotationPoint(-29F, 7F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 497
		bodyModel[79].setRotationPoint(-32F, 3F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 498
		bodyModel[80].setRotationPoint(-32F, 1F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		bodyModel[81].setRotationPoint(-32F, 2F, 9F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 500
		bodyModel[82].setRotationPoint(-32F, -5F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 501
		bodyModel[83].setRotationPoint(-32F, -7F, 9F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 502
		bodyModel[84].setRotationPoint(-35F, 9F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 503
		bodyModel[85].setRotationPoint(-35F, 9F, 3F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 504
		bodyModel[86].setRotationPoint(32.01F, 1F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 505
		bodyModel[87].setRotationPoint(32F, 9F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 506
		bodyModel[88].setRotationPoint(32F, 9F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 507
		bodyModel[89].setRotationPoint(32F, 7F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[90].setRotationPoint(32F, 4F, 9F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 509
		bodyModel[91].setRotationPoint(32F, 7F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[92].setRotationPoint(32F, 4F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[93].setRotationPoint(32F, 2F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 512
		bodyModel[94].setRotationPoint(32F, -5F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 513
		bodyModel[95].setRotationPoint(32F, -7F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 514
		bodyModel[96].setRotationPoint(32F, -7F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 515
		bodyModel[97].setRotationPoint(32F, -7F, 9F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 516
		bodyModel[98].setRotationPoint(32F, -5F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 517
		bodyModel[99].setRotationPoint(32F, 2F, 9F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 518
		bodyModel[100].setRotationPoint(29F, 7F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[101].setRotationPoint(29F, 4F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[102].setRotationPoint(29F, 4F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 521
		bodyModel[103].setRotationPoint(29F, 4F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[104].setRotationPoint(29F, 4F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 523
		bodyModel[105].setRotationPoint(29F, 7F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 524
		bodyModel[106].setRotationPoint(29F, 9F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 525
		bodyModel[107].setRotationPoint(29F, 6F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 526
		bodyModel[108].setRotationPoint(29F, 3F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 527
		bodyModel[109].setRotationPoint(29F, 1F, -8F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 528
		bodyModel[110].setRotationPoint(29F, 9F, 9F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 529
		bodyModel[111].setRotationPoint(29F, 6F, 8F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 530
		bodyModel[112].setRotationPoint(29F, 3F, 6F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 531
		bodyModel[113].setRotationPoint(29F, 1F, 6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532 lamp rear
		bodyModel[114].setRotationPoint(29F, -19F, -1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		bodyModel[115].setRotationPoint(29F, -17F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[116].setRotationPoint(28F, -18F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[117].setRotationPoint(29F, -17F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[118].setRotationPoint(28F, -18F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[119].setRotationPoint(17F, -20F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[120].setRotationPoint(17F, -20F, 3F);

		bodyModel[121].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 540 cull
		bodyModel[121].setRotationPoint(17F, -20F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 541
		bodyModel[122].setRotationPoint(-29F, -5F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 542
		bodyModel[123].setRotationPoint(-29F, -7F, 11F);

		bodyModel[124].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 543
		bodyModel[124].setRotationPoint(-27F, -7F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 545
		bodyModel[125].setRotationPoint(-24F, -7F, 11F);

		bodyModel[126].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 546
		bodyModel[126].setRotationPoint(5F, -11F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[127].setRotationPoint(4F, -11F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 548
		bodyModel[128].setRotationPoint(11F, -10F, 11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 549
		bodyModel[129].setRotationPoint(-24F, -7F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 550
		bodyModel[130].setRotationPoint(-27F, -7F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 551
		bodyModel[131].setRotationPoint(11F, -10F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 552
		bodyModel[132].setRotationPoint(5F, -11F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[133].setRotationPoint(4F, -11F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 554
		bodyModel[134].setRotationPoint(-29F, -7F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 555
		bodyModel[135].setRotationPoint(-29F, -5F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 708
		bodyModel[136].setRotationPoint(5F, 3.5F, 7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 709
		bodyModel[137].setRotationPoint(-5F, 4F, 8F);

		bodyModel[138].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 710
		bodyModel[138].setRotationPoint(-5F, 4F, 7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 711
		bodyModel[139].setRotationPoint(-5F, 4F, 6F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 712
		bodyModel[140].setRotationPoint(-6F, 3.5F, 7.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[141].setRotationPoint(-20F, 4F, -2F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 792
		bodyModel[142].setRotationPoint(16F, 4F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[143].setRotationPoint(-30F, -19F, -0.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[144].setRotationPoint(-30F, -20F, -0.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[145].setRotationPoint(-29.75F, -18.5F, -0.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[146].setRotationPoint(-30F, -20F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[147].setRotationPoint(-30F, -20F, 1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[148].setRotationPoint(-29.75F, -20.25F, -1.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 878
		bodyModel[149].setRotationPoint(17F, -3F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 46, 0, 16, 0F); // Box 879
		bodyModel[150].setRotationPoint(-29F, -11F, -8F);

		bodyModel[151].addBox(-0.5F, 0F, -5.5F, 1, 13, 6, 0F); // Box 314 door swing right
		bodyModel[151].setRotationPoint(28.5F, -16F, 2.5F);

		bodyModel[152].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[152].setRotationPoint(17.5F, -16F, -10.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // Box 883
		bodyModel[153].setRotationPoint(28F, -16F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyModel[154].setRotationPoint(29F, -2F, -3F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 886
		bodyModel[155].setRotationPoint(14F, -17F, 7.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 887
		bodyModel[156].setRotationPoint(16F, -22F, -4F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 888
		bodyModel[157].setRotationPoint(17F, -22F, -3F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 889
		bodyModel[158].setRotationPoint(16F, -22F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 890
		bodyModel[159].setRotationPoint(17.5F, -21F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		bodyModel[160].setRotationPoint(19F, -21F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light commander beacon rear
		bodyModel[161].setRotationPoint(27.32F, -22F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[162].setRotationPoint(27.5F, -21F, -0.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[163].setRotationPoint(13F, -22F, -0.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[164].setRotationPoint(15F, -21F, -0.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 896
		bodyModel[165].setRotationPoint(-28.5F, -12F, -1.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 897 liveryimg 1
		bodyModel[166].setRotationPoint(-28.1F, -19F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 898 liveryimg 1
		bodyModel[167].setRotationPoint(29.05F, -18F, 2F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 899 liveryimg 1
		bodyModel[168].setRotationPoint(29.05F, -18F, -6F);

		bodyModel[169].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 900 liveryimg 1
		bodyModel[169].setRotationPoint(19.05F, -8F, 11.05F);

		bodyModel[170].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 901 liveryimg 1
		bodyModel[170].setRotationPoint(19.05F, -8F, -11.05F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 902 liveryimg 2
		bodyModel[171].setRotationPoint(-1.95F, -14F, -7.05F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 903 liveryimg 2
		bodyModel[172].setRotationPoint(-1.95F, -14F, 7.05F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[173].setRotationPoint(-25F, -20F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 0, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[174].setRotationPoint(-25F, -20F, -7F);

		bodyModel[175].addBox(0F, 0F, 0F, 8, 0, 6, 0F); // Box 176
		bodyModel[175].setRotationPoint(-25F, -20F, -3F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		bodyModel[176].setRotationPoint(28.5F, -17.25F, 6.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[177].setRotationPoint(29.05F, -8F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[178].setRotationPoint(29.05F, -8F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[179].setRotationPoint(29.05F, 2F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[180].setRotationPoint(29.05F, 2F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 light commander beacon low
		bodyModel[181].setRotationPoint(17.32F, -22F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 183
		bodyModel[182].setRotationPoint(17.5F, -21F, -0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 184
		bodyModel[183].setRotationPoint(-14F, -19.5F, 1F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 185
		bodyModel[184].setRotationPoint(-14F, -19.5F, -3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[185].setRotationPoint(-27.5F, -17F, -1.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 187
		bodyModel[186].setRotationPoint(28.5F, -14F, 3.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
		bodyModel[187].setRotationPoint(28.5F, -14F, -3.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 189
		bodyModel[188].setRotationPoint(12F, -20F, 7.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 190
		bodyModel[189].setRotationPoint(13F, -19F, 6.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 191
		bodyModel[190].setRotationPoint(12F, -18F, 7.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 192
		bodyModel[191].setRotationPoint(13F, -19F, 7.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193 light commander beacon forward
		bodyModel[192].setRotationPoint(11.32F, -22F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 194
		bodyModel[193].setRotationPoint(11.5F, -21F, -0.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 195
		bodyModel[194].setRotationPoint(15F, -22F, -2.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[195].setRotationPoint(19F, -22F, 0F);

		bodyModel[196].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 197
		bodyModel[196].setRotationPoint(-15F, -22F, -4F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 198
		bodyModel[197].setRotationPoint(-15F, -22F, -4F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 199
		bodyModel[198].setRotationPoint(-15F, -22F, 3F);

		bodyModel[199].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 200
		bodyModel[199].setRotationPoint(-11F, -22F, 3F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 201
		bodyModel[200].setRotationPoint(-11F, -22F, -4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 202
		bodyModel[201].setRotationPoint(14F, -22.5F, -1.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 203
		bodyModel[202].setRotationPoint(-14F, -20.5F, -3F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 204
		bodyModel[203].setRotationPoint(-14F, -20.5F, 1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 23, 0, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[204].setRotationPoint(-20F, -22F, -7.25F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[205].setRotationPoint(-35F, 6F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[206].setRotationPoint(-35F, 5F, 2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[207].setRotationPoint(-35F, 7F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[208].setRotationPoint(-35F, 6F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[209].setRotationPoint(-35.5F, 5F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[210].setRotationPoint(-35F, 7F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[211].setRotationPoint(32F, 6F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[212].setRotationPoint(32F, 5F, 2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[213].setRotationPoint(32F, 7F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[214].setRotationPoint(32F, 6F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[215].setRotationPoint(32.5F, 5F, -10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[216].setRotationPoint(32F, 7F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[217].setRotationPoint(-33F, 2.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[218].setRotationPoint(32F, 2.5F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[219].setRotationPoint(-14F, -21.5F, 1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 204
		bodyModel[220].setRotationPoint(-14F, -23.5F, 1F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 204
		bodyModel[221].setRotationPoint(-15F, -22.5F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[222].setRotationPoint(-14F, -21.5F, -3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 204
		bodyModel[223].setRotationPoint(-14F, -23.5F, -3F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 204
		bodyModel[224].setRotationPoint(-15F, -22.5F, -4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light commander beacon tall
		bodyModel[225].setRotationPoint(21.32F, -24F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[226].setRotationPoint(21.5F, -23F, -0.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[227].setRotationPoint(21.35F, -22F, -0.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[228].setRotationPoint(21.35F, -22F, 0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[229].setRotationPoint(17F, -18F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[230].setRotationPoint(17F, -18F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 397
		bodyModel[231].setRotationPoint(27.49F, -11F, -8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[232].setRotationPoint(27.5F, -9F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131
		bodyModel[233].setRotationPoint(24F, -10F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[234].setRotationPoint(22F, -10F, 2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[235].setRotationPoint(22.5F, -13F, 2.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[236].setRotationPoint(18F, -13F, 2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F, 0F); // Box 131
		bodyModel[237].setRotationPoint(18F, -13F, 5F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 389
		bodyModel[238].setRotationPoint(28F, -19F, -3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[239].setRotationPoint(28F, -19F, 3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[240].setRotationPoint(28F, -19F, -7F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 389
		bodyModel[241].setRotationPoint(17F, -18F, -7F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 389
		bodyModel[242].setRotationPoint(17F, -19F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[243].setRotationPoint(17F, -19F, 3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[244].setRotationPoint(17F, -19F, -7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[245].setRotationPoint(18F, -10F, 5F);

		bodyModel[246].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 540
		bodyModel[246].setRotationPoint(17F, -19F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[247].setRotationPoint(29F, -19F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 467
		bodyModel[248].setRotationPoint(29F, -19F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[249].setRotationPoint(29F, -20F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[250].setRotationPoint(29F, -20F, 3F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 540
		bodyModel[251].setRotationPoint(29F, -20F, -3F);
	}
	ModelTypeA theTrucks = new ModelTypeA();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 252; i++) {
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
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==15 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Silver.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.1F ,-0.0F,0F);//front
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.1F,-0.0F,0);//rear
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}