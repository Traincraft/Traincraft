//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.02.2021 - 11:53:33
// Last changed on: 14.02.2021 - 11:53:33

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

public class ModelGE44Ton extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelGE44Ton() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[193];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 160, 44, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 1, 116, textureX, textureY); // Box 59
		bodyModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 60
		bodyModel[3] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 61
		bodyModel[4] = new ModelRendererTurbo(this, 0, 119, textureX, textureY); // Box 62 
		bodyModel[5] = new ModelRendererTurbo(this, 160, 38, textureX, textureY); // Box 156
		bodyModel[6] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[7] = new ModelRendererTurbo(this, 65, 83, textureX, textureY); // Box 206
		bodyModel[8] = new ModelRendererTurbo(this, 65, 75, textureX, textureY); // Box 207
		bodyModel[9] = new ModelRendererTurbo(this, 87, 38, textureX, textureY); // Box 208
		bodyModel[10] = new ModelRendererTurbo(this, 118, 34, textureX, textureY); // Box 209
		bodyModel[11] = new ModelRendererTurbo(this, 100, 34, textureX, textureY); // Box 210
		bodyModel[12] = new ModelRendererTurbo(this, 64, 91, textureX, textureY); // Box 211
		bodyModel[13] = new ModelRendererTurbo(this, 134, 16, textureX, textureY); // Box 212
		bodyModel[14] = new ModelRendererTurbo(this, 65, 16, textureX, textureY); // Box 213
		bodyModel[15] = new ModelRendererTurbo(this, 139, 32, textureX, textureY); // Box 219
		bodyModel[16] = new ModelRendererTurbo(this, 123, 13, textureX, textureY); // Box 52 door swing right
		bodyModel[17] = new ModelRendererTurbo(this, 92, 3, textureX, textureY); // Box 222
		bodyModel[18] = new ModelRendererTurbo(this, 200, 49, textureX, textureY); // Box 223
		bodyModel[19] = new ModelRendererTurbo(this, 143, 97, textureX, textureY); // Box 224
		bodyModel[20] = new ModelRendererTurbo(this, 143, 88, textureX, textureY); // Box 225
		bodyModel[21] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 227
		bodyModel[22] = new ModelRendererTurbo(this, 101, 64, textureX, textureY, "cull"); // Box 230 cull
		bodyModel[23] = new ModelRendererTurbo(this, 101, 71, textureX, textureY, "cull"); // Box 231 cull
		bodyModel[24] = new ModelRendererTurbo(this, 143, 59, textureX, textureY); // Box 238
		bodyModel[25] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 242
		bodyModel[26] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 243
		bodyModel[27] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 245
		bodyModel[28] = new ModelRendererTurbo(this, 6, 101, textureX, textureY); // Box 246
		bodyModel[29] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 247
		bodyModel[30] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 248
		bodyModel[31] = new ModelRendererTurbo(this, 4, 123, textureX, textureY, "lamp"); // Box 251 headlight front
		bodyModel[32] = new ModelRendererTurbo(this, 4, 121, textureX, textureY, "lamp"); // Box 252 headlight front
		bodyModel[33] = new ModelRendererTurbo(this, 4, 123, textureX, textureY, "lamp"); // Box 253 headlight front
		bodyModel[34] = new ModelRendererTurbo(this, 4, 121, textureX, textureY, "lamp"); // Box 254 headlight front
		bodyModel[35] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "lamp"); // Box 255 headlight rear
		bodyModel[36] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "lamp"); // Box 256 headlight rear
		bodyModel[37] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 257 headlight rear
		bodyModel[38] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 258 headlight rear
		bodyModel[39] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 259
		bodyModel[40] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 275
		bodyModel[41] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 276
		bodyModel[42] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 278
		bodyModel[43] = new ModelRendererTurbo(this, 30, 68, textureX, textureY); // Box 279
		bodyModel[44] = new ModelRendererTurbo(this, 84, 44, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 1, 47, textureX, textureY); // Box 364 prime base
		bodyModel[46] = new ModelRendererTurbo(this, 1, 43, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[47] = new ModelRendererTurbo(this, 1, 43, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[48] = new ModelRendererTurbo(this, 1, 43, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[49] = new ModelRendererTurbo(this, 1, 43, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[50] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 287
		bodyModel[51] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 288
		bodyModel[52] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 289
		bodyModel[53] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 292
		bodyModel[54] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 293
		bodyModel[55] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 294
		bodyModel[56] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 295
		bodyModel[57] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 296
		bodyModel[58] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 297
		bodyModel[59] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 300
		bodyModel[60] = new ModelRendererTurbo(this, 182, 36, textureX, textureY); // Box 303
		bodyModel[61] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 387
		bodyModel[62] = new ModelRendererTurbo(this, 51, 99, textureX, textureY); // Box 306
		bodyModel[63] = new ModelRendererTurbo(this, 11, 101, textureX, textureY); // Box 318
		bodyModel[64] = new ModelRendererTurbo(this, 200, 104, textureX, textureY); // Box 156
		bodyModel[65] = new ModelRendererTurbo(this, 202, 94, textureX, textureY); // Box 157
		bodyModel[66] = new ModelRendererTurbo(this, 233, 72, textureX, textureY); // Box 158
		bodyModel[67] = new ModelRendererTurbo(this, 182, 91, textureX, textureY); // Box 161
		bodyModel[68] = new ModelRendererTurbo(this, 214, 73, textureX, textureY); // Box 162
		bodyModel[69] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 163
		bodyModel[70] = new ModelRendererTurbo(this, 183, 101, textureX, textureY); // Box 165
		bodyModel[71] = new ModelRendererTurbo(this, 20, 12, textureX, textureY); // Box 166
		bodyModel[72] = new ModelRendererTurbo(this, 192, 13, textureX, textureY); // Box 167 door swing right
		bodyModel[73] = new ModelRendererTurbo(this, 161, 3, textureX, textureY); // Box 168
		bodyModel[74] = new ModelRendererTurbo(this, 11, 73, textureX, textureY); // Box 570
		bodyModel[75] = new ModelRendererTurbo(this, 19, 76, textureX, textureY); // Box 571
		bodyModel[76] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 572
		bodyModel[77] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 573
		bodyModel[78] = new ModelRendererTurbo(this, 130, 98, textureX, textureY); // Box 574
		bodyModel[79] = new ModelRendererTurbo(this, 11, 87, textureX, textureY); // Box 575
		bodyModel[80] = new ModelRendererTurbo(this, 19, 90, textureX, textureY); // Box 576
		bodyModel[81] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 577
		bodyModel[82] = new ModelRendererTurbo(this, 5, 1, textureX, textureY); // Box 578
		bodyModel[83] = new ModelRendererTurbo(this, 101, 71, textureX, textureY, "cull"); // Box 579 cull
		bodyModel[84] = new ModelRendererTurbo(this, 101, 64, textureX, textureY, "cull"); // Box 580 cull
		bodyModel[85] = new ModelRendererTurbo(this, 174, 85, textureX, textureY); // Box 581
		bodyModel[86] = new ModelRendererTurbo(this, 174, 85, textureX, textureY); // Box 582
		bodyModel[87] = new ModelRendererTurbo(this, 29, 92, textureX, textureY); // Box 583
		bodyModel[88] = new ModelRendererTurbo(this, 61, 92, textureX, textureY); // Box 584
		bodyModel[89] = new ModelRendererTurbo(this, 29, 88, textureX, textureY); // Box 585
		bodyModel[90] = new ModelRendererTurbo(this, 43, 97, textureX, textureY); // Box 586
		bodyModel[91] = new ModelRendererTurbo(this, 36, 97, textureX, textureY); // Box 587
		bodyModel[92] = new ModelRendererTurbo(this, 56, 94, textureX, textureY); // Box 588
		bodyModel[93] = new ModelRendererTurbo(this, 29, 78, textureX, textureY); // Box 589
		bodyModel[94] = new ModelRendererTurbo(this, 56, 78, textureX, textureY); // Box 590
		bodyModel[95] = new ModelRendererTurbo(this, 54, 83, textureX, textureY); // Box 591
		bodyModel[96] = new ModelRendererTurbo(this, 29, 74, textureX, textureY); // Box 592
		bodyModel[97] = new ModelRendererTurbo(this, 43, 84, textureX, textureY); // Box 593
		bodyModel[98] = new ModelRendererTurbo(this, 36, 84, textureX, textureY); // Box 594
		bodyModel[99] = new ModelRendererTurbo(this, 204, 81, textureX, textureY); // Box 595
		bodyModel[100] = new ModelRendererTurbo(this, 214, 18, textureX, textureY); // Box 596
		bodyModel[101] = new ModelRendererTurbo(this, 204, 26, textureX, textureY); // Box 597
		bodyModel[102] = new ModelRendererTurbo(this, 183, 46, textureX, textureY); // Box 598
		bodyModel[103] = new ModelRendererTurbo(this, 209, 26, textureX, textureY); // Box 599
		bodyModel[104] = new ModelRendererTurbo(this, 105, 91, textureX, textureY); // Box 600
		bodyModel[105] = new ModelRendererTurbo(this, 105, 91, textureX, textureY); // Box 601
		bodyModel[106] = new ModelRendererTurbo(this, 112, 97, textureX, textureY); // Box 602
		bodyModel[107] = new ModelRendererTurbo(this, 105, 88, textureX, textureY); // Box 603
		bodyModel[108] = new ModelRendererTurbo(this, 102, 59, textureX, textureY); // Box 604
		bodyModel[109] = new ModelRendererTurbo(this, 174, 88, textureX, textureY); // Box 605
		bodyModel[110] = new ModelRendererTurbo(this, 174, 88, textureX, textureY); // Box 606
		bodyModel[111] = new ModelRendererTurbo(this, 112, 88, textureX, textureY); // Box 607
		bodyModel[112] = new ModelRendererTurbo(this, 105, 88, textureX, textureY); // Box 608
		bodyModel[113] = new ModelRendererTurbo(this, 9, 122, textureX, textureY); // Box 609
		bodyModel[114] = new ModelRendererTurbo(this, 9, 119, textureX, textureY); // Box 610
		bodyModel[115] = new ModelRendererTurbo(this, 9, 116, textureX, textureY); // Box 611
		bodyModel[116] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 612
		bodyModel[117] = new ModelRendererTurbo(this, 225, 21, textureX, textureY, "lamp"); // Box 247 headlight 2beam front
		bodyModel[118] = new ModelRendererTurbo(this, 225, 21, textureX, textureY, "lamp"); // Box 248 headlight 2beam front
		bodyModel[119] = new ModelRendererTurbo(this, 205, 19, textureX, textureY, "cull"); // Box 615 headlight box cull
		bodyModel[120] = new ModelRendererTurbo(this, 232, 74, textureX, textureY); // Box 616
		bodyModel[121] = new ModelRendererTurbo(this, 225, 76, textureX, textureY, "lamp"); // Box 617 headlight 2beam rear
		bodyModel[122] = new ModelRendererTurbo(this, 225, 76, textureX, textureY, "lamp"); // Box 618 headlight 2beam rear
		bodyModel[123] = new ModelRendererTurbo(this, 27, 68, textureX, textureY); // Box 619
		bodyModel[124] = new ModelRendererTurbo(this, 21, 68, textureX, textureY); // Box 620
		bodyModel[125] = new ModelRendererTurbo(this, 12, 68, textureX, textureY); // Box 621
		bodyModel[126] = new ModelRendererTurbo(this, 12, 68, textureX, textureY); // Box 622
		bodyModel[127] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Box 623
		bodyModel[128] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 624
		bodyModel[129] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 625
		bodyModel[130] = new ModelRendererTurbo(this, 64, 78, textureX, textureY); // Box 626
		bodyModel[131] = new ModelRendererTurbo(this, 62, 85, textureX, textureY); // Box 627
		bodyModel[132] = new ModelRendererTurbo(this, 64, 69, textureX, textureY); // Box 628
		bodyModel[133] = new ModelRendererTurbo(this, 68, 85, textureX, textureY); // Box 629
		bodyModel[134] = new ModelRendererTurbo(this, 64, 75, textureX, textureY); // Box 630
		bodyModel[135] = new ModelRendererTurbo(this, 65, 85, textureX, textureY); // Box 631
		bodyModel[136] = new ModelRendererTurbo(this, 64, 72, textureX, textureY); // Box 632
		bodyModel[137] = new ModelRendererTurbo(this, 59, 85, textureX, textureY); // Box 633
		bodyModel[138] = new ModelRendererTurbo(this, 39, 37, textureX, textureY); // Box 634
		bodyModel[139] = new ModelRendererTurbo(this, 232, 19, textureX, textureY); // Box 752
		bodyModel[140] = new ModelRendererTurbo(this, 205, 74, textureX, textureY, "cull"); // Box 615 headlight box cull
		bodyModel[141] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 131
		bodyModel[142] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 231
		bodyModel[143] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Box 238
		bodyModel[144] = new ModelRendererTurbo(this, 37, 9, textureX, textureY); // Box 239
		bodyModel[145] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 240
		bodyModel[146] = new ModelRendererTurbo(this, 46, 9, textureX, textureY); // Box 241
		bodyModel[147] = new ModelRendererTurbo(this, 115, 66, textureX, textureY); // Box 280
		bodyModel[148] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 282
		bodyModel[149] = new ModelRendererTurbo(this, 170, 61, textureX, textureY); // Box 283
		bodyModel[150] = new ModelRendererTurbo(this, 126, 64, textureX, textureY); // Box 285
		bodyModel[151] = new ModelRendererTurbo(this, 148, 64, textureX, textureY); // Box 340
		bodyModel[152] = new ModelRendererTurbo(this, 137, 62, textureX, textureY); // Box 342
		bodyModel[153] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 769
		bodyModel[154] = new ModelRendererTurbo(this, 170, 61, textureX, textureY); // Box 770
		bodyModel[155] = new ModelRendererTurbo(this, 137, 62, textureX, textureY); // Box 771
		bodyModel[156] = new ModelRendererTurbo(this, 148, 64, textureX, textureY); // Box 772
		bodyModel[157] = new ModelRendererTurbo(this, 115, 66, textureX, textureY); // Box 773
		bodyModel[158] = new ModelRendererTurbo(this, 126, 64, textureX, textureY); // Box 774
		bodyModel[159] = new ModelRendererTurbo(this, 122, 106, textureX, textureY); // Box 114
		bodyModel[160] = new ModelRendererTurbo(this, 122, 106, textureX, textureY); // Box 74
		bodyModel[161] = new ModelRendererTurbo(this, 127, 106, textureX, textureY); // Box 78
		bodyModel[162] = new ModelRendererTurbo(this, 137, 106, textureX, textureY); // Box 114
		bodyModel[163] = new ModelRendererTurbo(this, 137, 106, textureX, textureY); // Box 115
		bodyModel[164] = new ModelRendererTurbo(this, 130, 107, textureX, textureY); // Box 116
		bodyModel[165] = new ModelRendererTurbo(this, -6, 106, textureX, textureY); // Box 268
		bodyModel[166] = new ModelRendererTurbo(this, -6, 106, textureX, textureY); // Box 783
		bodyModel[167] = new ModelRendererTurbo(this, 104, 94, textureX, textureY); // Box 784
		bodyModel[168] = new ModelRendererTurbo(this, 102, 100, textureX, textureY); // Box 785
		bodyModel[169] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 786
		bodyModel[170] = new ModelRendererTurbo(this, 99, 94, textureX, textureY); // Box 787
		bodyModel[171] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 788
		bodyModel[172] = new ModelRendererTurbo(this, 10, 15, textureX, textureY); // Box 789
		bodyModel[173] = new ModelRendererTurbo(this, 19, 15, textureX, textureY); // Box 790
		bodyModel[174] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 202
		bodyModel[175] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 792
		bodyModel[176] = new ModelRendererTurbo(this, 9, 18, textureX, textureY); // Box 793
		bodyModel[177] = new ModelRendererTurbo(this, 152, 106, textureX, textureY); // Box 794
		bodyModel[178] = new ModelRendererTurbo(this, 156, 108, textureX, textureY); // Box 795
		bodyModel[179] = new ModelRendererTurbo(this, 152, 106, textureX, textureY); // Box 796
		bodyModel[180] = new ModelRendererTurbo(this, 147, 107, textureX, textureY); // Box 797
		bodyModel[181] = new ModelRendererTurbo(this, 142, 106, textureX, textureY); // Box 798
		bodyModel[182] = new ModelRendererTurbo(this, 142, 106, textureX, textureY); // Box 799
		bodyModel[183] = new ModelRendererTurbo(this, 97, 83, textureX, textureY); // Box 298
		bodyModel[184] = new ModelRendererTurbo(this, 97, 83, textureX, textureY); // Box 801
		bodyModel[185] = new ModelRendererTurbo(this, 193, 50, textureX, textureY); // Box 301
		bodyModel[186] = new ModelRendererTurbo(this, 185, 50, textureX, textureY); // Box 302
		bodyModel[187] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 160
		bodyModel[188] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 164
		bodyModel[189] = new ModelRendererTurbo(this, 185, 102, textureX, textureY); // Box 164
		bodyModel[190] = new ModelRendererTurbo(this, 193, 102, textureX, textureY); // Box 160
		bodyModel[191] = new ModelRendererTurbo(this, 193, 47, textureX, textureY); // Box 301
		bodyModel[192] = new ModelRendererTurbo(this, 185, 47, textureX, textureY); // Box 302

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 48
		bodyModel[0].setRotationPoint(-28F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[1].setRotationPoint(-25F, -10F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 60
		bodyModel[2].setRotationPoint(-25F, -10F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[3].setRotationPoint(-25F, -11F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62 
		bodyModel[4].setRotationPoint(-25F, -11F, 0F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 156
		bodyModel[5].setRotationPoint(25F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 50, 1, 20, 0F); // Box 188
		bodyModel[6].setRotationPoint(-25F, 2F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[7].setRotationPoint(-6F, -18F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[8].setRotationPoint(-6F, -18F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[9].setRotationPoint(-6F, -17F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 209
		bodyModel[10].setRotationPoint(5F, -17F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[11].setRotationPoint(-6F, -17F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[12].setRotationPoint(-6F, -18F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 212
		bodyModel[13].setRotationPoint(-6F, -16F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 213
		bodyModel[14].setRotationPoint(-6F, -16F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 219
		bodyModel[15].setRotationPoint(-6F, -17F, -9F);

		bodyModel[16].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[16].setRotationPoint(-5.5F, -16F, -8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 222
		bodyModel[17].setRotationPoint(-6F, -16F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 17, 12, 10, 0F); // Box 223
		bodyModel[18].setRotationPoint(-23F, -10F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 224
		bodyModel[19].setRotationPoint(-21F, -6F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 225
		bodyModel[20].setRotationPoint(-21F, -6F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 227
		bodyModel[21].setRotationPoint(-23F, -11F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 230 cull
		bodyModel[22].setRotationPoint(-25F, 3F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 231 cull
		bodyModel[23].setRotationPoint(25F, 3F, 10F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 238
		bodyModel[24].setRotationPoint(-24.5F, -6F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 242
		bodyModel[25].setRotationPoint(-26F, 0F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 243
		bodyModel[26].setRotationPoint(26F, 0F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 245
		bodyModel[27].setRotationPoint(24F, -10F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[28].setRotationPoint(24F, -10F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[29].setRotationPoint(23F, -11F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[30].setRotationPoint(23F, -11F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251 headlight front
		bodyModel[31].setRotationPoint(-25.01F, -11F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252 headlight front
		bodyModel[32].setRotationPoint(-25.01F, -11F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253 headlight front
		bodyModel[33].setRotationPoint(-25.01F, -10F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 254 headlight front
		bodyModel[34].setRotationPoint(-25.01F, -10F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 255 headlight rear
		bodyModel[35].setRotationPoint(25.01F, -10F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256 headlight rear
		bodyModel[36].setRotationPoint(25.01F, -11F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257 headlight rear
		bodyModel[37].setRotationPoint(25.01F, -10F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258 headlight rear
		bodyModel[38].setRotationPoint(25.01F, -11F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[39].setRotationPoint(-9F, -17.5F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 275
		bodyModel[40].setRotationPoint(-7F, -19F, 4F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 276
		bodyModel[41].setRotationPoint(-9.5F, -12.5F, 2.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 278
		bodyModel[42].setRotationPoint(-3F, -14F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 279
		bodyModel[43].setRotationPoint(-3F, -14F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 8, 4, 0F); // Box 67
		bodyModel[44].setRotationPoint(-7F, -10F, 1.5F);
		bodyModel[44].rotateAngleY = -0.48869219F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[45].setRotationPoint(-1F, -18.5F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[46].setRotationPoint(-1F, -19F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[47].setRotationPoint(-1F, -19F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[48].setRotationPoint(-1F, -19F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[49].setRotationPoint(-1F, -19F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 287
		bodyModel[50].setRotationPoint(-5.5F, -19F, 2.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[51].setRotationPoint(-4.5F, -19F, 1.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 289
		bodyModel[52].setRotationPoint(-3.5F, -18F, 2F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 292
		bodyModel[53].setRotationPoint(-26F, 2.5F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 293
		bodyModel[54].setRotationPoint(25F, 2.5F, -2F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 294
		bodyModel[55].setRotationPoint(25F, 2F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 295
		bodyModel[56].setRotationPoint(25F, 2F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 296
		bodyModel[57].setRotationPoint(-26F, 2F, -8F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 297
		bodyModel[58].setRotationPoint(-26F, 2F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 11, 10, 0F); // Box 300
		bodyModel[59].setRotationPoint(-24F, -9F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[60].setRotationPoint(-24F, -10F, -4F);

		bodyModel[61].addBox(0F, 0F, -2F, 12, 0, 2, 0F); // Box 387
		bodyModel[61].setRotationPoint(-6F, -16F, -10F);
		bodyModel[61].rotateAngleX = 0.87266463F;

		bodyModel[62].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 306
		bodyModel[62].setRotationPoint(-6F, -16F, 10F);
		bodyModel[62].rotateAngleX = -0.87266463F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 318
		bodyModel[63].setRotationPoint(1.5F, -19F, 7.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 17, 12, 10, 0F); // Box 156
		bodyModel[64].setRotationPoint(6F, -10F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[65].setRotationPoint(6F, -11F, -4F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 11, 10, 0F); // Box 158
		bodyModel[66].setRotationPoint(23F, -9F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[67].setRotationPoint(23F, -10F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[68].setRotationPoint(24F, -10F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[69].setRotationPoint(24F, -9F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 0.05F, -8F, 0F, -0.35F, -8F, 0F, -0.35F, -8F, 0F, 0.05F, -8F, 0F); // Box 165
		bodyModel[70].setRotationPoint(24.5F, -8F, -3.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 12, 4, 20, 0F); // Box 166
		bodyModel[71].setRotationPoint(-6F, -2F, -10F);

		bodyModel[72].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 167 door swing right
		bodyModel[72].setRotationPoint(5.5F, -16F, 8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 168
		bodyModel[73].setRotationPoint(5F, -16F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 570
		bodyModel[74].setRotationPoint(-25F, 3F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 571
		bodyModel[75].setRotationPoint(-25F, 3F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[76].setRotationPoint(-25F, 3F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 573
		bodyModel[77].setRotationPoint(-25.01F, 3F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 574
		bodyModel[78].setRotationPoint(25.01F, 3F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 575
		bodyModel[79].setRotationPoint(24F, 3F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 576
		bodyModel[80].setRotationPoint(24F, 3F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[81].setRotationPoint(24F, 3F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 44, 1, 6, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[82].setRotationPoint(-24F, 3F, -3F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 579 cull
		bodyModel[83].setRotationPoint(21F, 3F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 580 cull
		bodyModel[84].setRotationPoint(-21F, 3F, 10F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 581
		bodyModel[85].setRotationPoint(-24.5F, -8F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 582
		bodyModel[86].setRotationPoint(-24.5F, -8F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 583
		bodyModel[87].setRotationPoint(-6F, 5F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 584
		bodyModel[88].setRotationPoint(-7F, 5F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 585
		bodyModel[89].setRotationPoint(-7F, 3F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 586
		bodyModel[90].setRotationPoint(-9F, 3F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[91].setRotationPoint(7F, 3F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 588
		bodyModel[92].setRotationPoint(6F, 5F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 589
		bodyModel[93].setRotationPoint(-6F, 5F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 590
		bodyModel[94].setRotationPoint(-7F, 5F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 591
		bodyModel[95].setRotationPoint(6F, 5F, 9F);

		bodyModel[96].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 592
		bodyModel[96].setRotationPoint(-7F, 3F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 593
		bodyModel[97].setRotationPoint(-9F, 3F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[98].setRotationPoint(7F, 3F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[99].setRotationPoint(24F, -9F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[100].setRotationPoint(-25F, -10F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 597
		bodyModel[101].setRotationPoint(-25F, -9F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,-1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F, -0.35F, -8F, 0F, 0.05F, -8F, 0F, 0.05F, -8F, 0F, -0.35F, -8F, 0F); // Box 598
		bodyModel[102].setRotationPoint(-25.5F, -8F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[103].setRotationPoint(-25F, -9F, -5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 600
		bodyModel[104].setRotationPoint(-21F, -8F, 10F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 601
		bodyModel[105].setRotationPoint(-21F, -8F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 602
		bodyModel[106].setRotationPoint(6F, -6F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 603
		bodyModel[107].setRotationPoint(18F, -8F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 604
		bodyModel[108].setRotationPoint(24.5F, -6F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 605
		bodyModel[109].setRotationPoint(24.5F, -8F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 606
		bodyModel[110].setRotationPoint(24.5F, -8F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 607
		bodyModel[111].setRotationPoint(6F, -6F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 608
		bodyModel[112].setRotationPoint(18F, -8F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 609
		bodyModel[113].setRotationPoint(-26F, -11F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[114].setRotationPoint(-26F, -11F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[115].setRotationPoint(25F, -11F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 612
		bodyModel[116].setRotationPoint(25F, -11F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight 2beam front
		bodyModel[117].setRotationPoint(-25F, -11F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight 2beam front
		bodyModel[118].setRotationPoint(-25F, -11F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 615 headlight box cull
		bodyModel[119].setRotationPoint(-24.5F, -11F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 616
		bodyModel[120].setRotationPoint(23F, -11F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 617 headlight 2beam rear
		bodyModel[121].setRotationPoint(24F, -11F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 618 headlight 2beam rear
		bodyModel[122].setRotationPoint(24F, -11F, 0F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 619
		bodyModel[123].setRotationPoint(3F, -14F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 620
		bodyModel[124].setRotationPoint(3F, -14F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 621
		bodyModel[125].setRotationPoint(-8F, -17F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 622
		bodyModel[126].setRotationPoint(-8F, -17F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[127].setRotationPoint(6F, -17.5F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 624
		bodyModel[128].setRotationPoint(6F, -17F, -3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[129].setRotationPoint(6F, -17F, 1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[130].setRotationPoint(-9F, 0F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[131].setRotationPoint(-7F, -3F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[132].setRotationPoint(-9F, 0F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[133].setRotationPoint(-7F, -3F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[134].setRotationPoint(6F, 0F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[135].setRotationPoint(6F, -3F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[136].setRotationPoint(6F, 0F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[137].setRotationPoint(6F, -3F, 10F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 4, 16, 0F); // Box 634
		bodyModel[138].setRotationPoint(-4F, 3F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 752
		bodyModel[139].setRotationPoint(-24F, -11F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 615 headlight box cull
		bodyModel[140].setRotationPoint(23.5F, -11F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[141].setRotationPoint(-1F, -18.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[142].setRotationPoint(-3.5F, -19.5F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[143].setRotationPoint(-2.5F, -19.25F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[144].setRotationPoint(-2.5F, -19.25F, 0.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[145].setRotationPoint(-1F, -19F, -2.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[146].setRotationPoint(-1F, -19F, 1.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[147].setRotationPoint(-28F, 5F, 2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[148].setRotationPoint(-29F, 7F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[149].setRotationPoint(-29F, 7F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[150].setRotationPoint(-28F, 5F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 340
		bodyModel[151].setRotationPoint(-27F, 6F, 2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 342
		bodyModel[152].setRotationPoint(-27F, 6F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 769
		bodyModel[153].setRotationPoint(28F, 7F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 770
		bodyModel[154].setRotationPoint(28F, 7F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[155].setRotationPoint(26F, 6F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 772
		bodyModel[156].setRotationPoint(26F, 6F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 773
		bodyModel[157].setRotationPoint(27F, 5F, 2F);

		bodyModel[158].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[158].setRotationPoint(27F, 5F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[159].setRotationPoint(-11F, -13.25F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[160].setRotationPoint(-11F, -14.25F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[161].setRotationPoint(-10.75F, -12.75F, -0.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[162].setRotationPoint(-11F, -14.25F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[163].setRotationPoint(-11F, -14.25F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[164].setRotationPoint(-11F, -14.75F, -1F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 268
		bodyModel[165].setRotationPoint(-28F, 9F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 783
		bodyModel[166].setRotationPoint(25F, 9F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 784
		bodyModel[167].setRotationPoint(-7F, -1F, -10F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 785
		bodyModel[168].setRotationPoint(-8F, 1F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 786
		bodyModel[169].setRotationPoint(6F, -1F, 5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 787
		bodyModel[170].setRotationPoint(6F, 1F, 5F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 788
		bodyModel[171].setRotationPoint(-5F, -18F, 4F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[172].setRotationPoint(4F, -19F, -5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 790
		bodyModel[173].setRotationPoint(4F, -18F, -5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 202
		bodyModel[174].setRotationPoint(-6F, -19.5F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 792
		bodyModel[175].setRotationPoint(5F, -19.5F, -6F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 793
		bodyModel[176].setRotationPoint(6.5F, -12.5F, 2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 794
		bodyModel[177].setRotationPoint(-22F, -12.75F, -0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 795
		bodyModel[178].setRotationPoint(-21.75F, -12.25F, -0.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		bodyModel[179].setRotationPoint(-22F, -13.75F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 797
		bodyModel[180].setRotationPoint(-22F, -14.25F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyModel[181].setRotationPoint(-22F, -13.75F, 1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 799
		bodyModel[182].setRotationPoint(-22F, -13.75F, -2F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		bodyModel[183].setRotationPoint(-7.25F, -20.5F, -0.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 801
		bodyModel[184].setRotationPoint(6.25F, -20.5F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[185].setRotationPoint(-24F, -11F, -5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 302
		bodyModel[186].setRotationPoint(-24F, -11F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[187].setRotationPoint(23F, -11F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[188].setRotationPoint(23F, -11F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[189].setRotationPoint(23F, -10F, 4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[190].setRotationPoint(23F, -10F, -5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 301
		bodyModel[191].setRotationPoint(-24F, -10F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[192].setRotationPoint(-24F, -10F, 4F);
	}
	ModelGETonnerTruck theTrucks = new ModelGETonnerTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for (int i = 0; i < 193; i++) {
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


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==5465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/tonnertruck_black_roller"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/tonnertruck_black_friction.png"));
		}

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-0.95f, -0.03f,0.0f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(1.9f, 0f,0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}