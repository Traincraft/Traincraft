//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.07.2021 - 08:46:22
// Last changed on: 03.07.2021 - 08:46:22

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelFMTrimountTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFMTrimountTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[200];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 100
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 100
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 337
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 337
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 889
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 890
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 891
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 892
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 337
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 890
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 337
		bodyModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 337
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 890
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 892
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 337
		bodyModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 337
		bodyModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 889
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 891
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 890
		bodyModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 891
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 337
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 891
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 337
		bodyModel[30] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 337
		bodyModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 337
		bodyModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 337
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 337
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 152
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 152
		bodyModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 152
		bodyModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 152
		bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
		bodyModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 152
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 152
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 152
		bodyModel[42] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 152
		bodyModel[43] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 152
		bodyModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 152
		bodyModel[45] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 152
		bodyModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 152
		bodyModel[47] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 152
		bodyModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 152
		bodyModel[49] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 152
		bodyModel[50] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 528
		bodyModel[51] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 528
		bodyModel[52] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 528
		bodyModel[53] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 528
		bodyModel[54] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 152
		bodyModel[55] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 152
		bodyModel[56] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 152
		bodyModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 152
		bodyModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 152
		bodyModel[59] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 152
		bodyModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 337
		bodyModel[61] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 5
		bodyModel[62] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 5
		bodyModel[63] = new ModelRendererTurbo(this, 250, 9, textureX, textureY); // Box 5
		bodyModel[64] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 2
		bodyModel[65] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 152
		bodyModel[66] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 152
		bodyModel[67] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 152
		bodyModel[68] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 957
		bodyModel[70] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 152
		bodyModel[71] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 152
		bodyModel[72] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 152
		bodyModel[73] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 151
		bodyModel[74] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 151
		bodyModel[75] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 152
		bodyModel[76] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 152
		bodyModel[77] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 151
		bodyModel[78] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 151
		bodyModel[79] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 152
		bodyModel[80] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 152
		bodyModel[81] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 122
		bodyModel[82] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 123
		bodyModel[83] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 122
		bodyModel[87] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 890
		bodyModel[88] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 337
		bodyModel[89] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 337
		bodyModel[90] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 337
		bodyModel[91] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 337
		bodyModel[92] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 337
		bodyModel[93] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 337
		bodyModel[94] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 337
		bodyModel[95] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 337
		bodyModel[96] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 337
		bodyModel[97] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 337
		bodyModel[98] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 337
		bodyModel[99] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 337
		bodyModel[100] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 337
		bodyModel[101] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 337
		bodyModel[102] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 337
		bodyModel[103] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 337
		bodyModel[104] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 337
		bodyModel[105] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 337
		bodyModel[106] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 337
		bodyModel[107] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 337
		bodyModel[108] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 920
		bodyModel[109] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 921
		bodyModel[110] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 922
		bodyModel[111] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 923
		bodyModel[112] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 924
		bodyModel[113] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 925
		bodyModel[114] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 926
		bodyModel[115] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 927
		bodyModel[116] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 928
		bodyModel[117] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 929
		bodyModel[118] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 930
		bodyModel[119] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 931
		bodyModel[120] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 922
		bodyModel[121] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 337
		bodyModel[122] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 337
		bodyModel[123] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 925
		bodyModel[124] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 927
		bodyModel[125] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 928
		bodyModel[126] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 929
		bodyModel[127] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 930
		bodyModel[128] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 924
		bodyModel[129] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 931
		bodyModel[130] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 926
		bodyModel[131] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 1039
		bodyModel[132] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 1040
		bodyModel[133] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 1043
		bodyModel[134] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 1044
		bodyModel[135] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 412
		bodyModel[136] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 419
		bodyModel[137] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 426
		bodyModel[138] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 878
		bodyModel[139] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 879
		bodyModel[140] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 880
		bodyModel[141] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 881
		bodyModel[142] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 882
		bodyModel[143] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 883
		bodyModel[144] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 885
		bodyModel[145] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 886
		bodyModel[146] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 887
		bodyModel[147] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 888
		bodyModel[148] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 889
		bodyModel[149] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 890
		bodyModel[150] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 891
		bodyModel[151] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 892
		bodyModel[152] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 893
		bodyModel[153] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 894
		bodyModel[154] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 895
		bodyModel[155] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 896
		bodyModel[156] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 898
		bodyModel[157] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 917
		bodyModel[158] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 918
		bodyModel[159] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 919
		bodyModel[160] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 920
		bodyModel[161] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 921
		bodyModel[162] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 923
		bodyModel[163] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 993
		bodyModel[164] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 994
		bodyModel[165] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 995
		bodyModel[166] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 996
		bodyModel[167] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 997
		bodyModel[168] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 998
		bodyModel[169] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 999
		bodyModel[170] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 1000
		bodyModel[171] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 1001
		bodyModel[172] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 1002
		bodyModel[173] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 1003
		bodyModel[174] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 1004
		bodyModel[175] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 1005
		bodyModel[176] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 1006
		bodyModel[177] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 1007
		bodyModel[178] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 1008
		bodyModel[179] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 1009
		bodyModel[180] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 1010
		bodyModel[181] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 1011
		bodyModel[182] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 1012
		bodyModel[183] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 1013
		bodyModel[184] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 1014
		bodyModel[185] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 1015
		bodyModel[186] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 1016
		bodyModel[187] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 1017
		bodyModel[188] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 1018
		bodyModel[189] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 1037
		bodyModel[190] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1038
		bodyModel[191] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 1041
		bodyModel[192] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1042
		bodyModel[193] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 152
		bodyModel[194] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 152
		bodyModel[195] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 152
		bodyModel[196] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 152
		bodyModel[197] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1051
		bodyModel[198] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 1052
		bodyModel[199] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1019

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9.25F, 5.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(9.25F, 5.5F, -9F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[2].setRotationPoint(-8.25F, 6.5F, -6F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 100
		bodyModel[3].setRotationPoint(10.25F, 6.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[4].setRotationPoint(-1.25F, 5.5F, -9F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 100
		bodyModel[5].setRotationPoint(-0.25F, 6.5F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[6].setRotationPoint(-9F, 5.75F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[7].setRotationPoint(-1F, 5.75F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[8].setRotationPoint(9.5F, 5.75F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[9].setRotationPoint(-1.25F, 8F, -8.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[10].setRotationPoint(-0.75F, 5F, -8.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 889
		bodyModel[11].setRotationPoint(-3F, 4.75F, -8.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 890
		bodyModel[12].setRotationPoint(0.75F, 4.75F, -8.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F); // Box 891
		bodyModel[13].setRotationPoint(-2.25F, 5.25F, -8.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 892
		bodyModel[14].setRotationPoint(0.75F, 5.25F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 337
		bodyModel[15].setRotationPoint(-12F, 3F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 890
		bodyModel[16].setRotationPoint(-1.25F, 4.75F, -8.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[17].setRotationPoint(-9.25F, 8F, -8.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[18].setRotationPoint(-8.75F, 5F, -8.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 890
		bodyModel[19].setRotationPoint(-7.25F, 4.75F, -8.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 892
		bodyModel[20].setRotationPoint(-7.25F, 5.25F, -8.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[21].setRotationPoint(9.25F, 8F, -8.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[22].setRotationPoint(9.75F, 5F, -8.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 889
		bodyModel[23].setRotationPoint(7.5F, 4.75F, -8.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F); // Box 891
		bodyModel[24].setRotationPoint(8.25F, 5.25F, -8.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 890
		bodyModel[25].setRotationPoint(9.25F, 4.75F, -8.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 891
		bodyModel[26].setRotationPoint(-10.25F, 5.75F, -8.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[27].setRotationPoint(-12F, 4.75F, -8.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 891
		bodyModel[28].setRotationPoint(11.25F, 5.75F, -8.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[29].setRotationPoint(11.25F, 4.75F, -8.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 337
		bodyModel[30].setRotationPoint(12.25F, 5.75F, -8.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 337
		bodyModel[31].setRotationPoint(12F, 7.75F, -8.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 337
		bodyModel[32].setRotationPoint(-11.75F, 5.75F, -8.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 337
		bodyModel[33].setRotationPoint(-12F, 7.75F, -8.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[34].setRotationPoint(7F, 6.55F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[35].setRotationPoint(7.5F, 7.55F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[36].setRotationPoint(2.5F, 7.55F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[37].setRotationPoint(8F, 5.05F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[38].setRotationPoint(1F, 5.05F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[39].setRotationPoint(1F, 6.55F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 152
		bodyModel[40].setRotationPoint(1.5F, 7.55F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F); // Box 152
		bodyModel[41].setRotationPoint(-3.5F, 6.55F, -8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[42].setRotationPoint(-3F, 7.55F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[43].setRotationPoint(-2.5F, 5.05F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[44].setRotationPoint(-7F, 5.05F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F); // Box 152
		bodyModel[45].setRotationPoint(-7F, 6.55F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 152
		bodyModel[46].setRotationPoint(-6.5F, 7.55F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[47].setRotationPoint(-5.5F, 7.55F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F); // Box 152
		bodyModel[48].setRotationPoint(4.25F, 7.05F, -8.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F); // Box 152
		bodyModel[49].setRotationPoint(-5.5F, 7.05F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, -2.7F, 0F, -0.125F, -2.7F, 0F, -0.125F, -2.7F, 0.5F, 0.125F, -2.7F, 0.5F); // Box 528
		bodyModel[50].setRotationPoint(4.5F, 4.75F, -8.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, -2.7F, 0F, 0.125F, -2.7F, 0F, 0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0.5F); // Box 528
		bodyModel[51].setRotationPoint(5.5F, 4.75F, -8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, -2.7F, 0F, -0.125F, -2.7F, 0F, -0.125F, -2.7F, 0.5F, 0.125F, -2.7F, 0.5F); // Box 528
		bodyModel[52].setRotationPoint(-5.25F, 4.75F, -8.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, -2.7F, 0F, -0.125F, -2.7F, 0F, -0.125F, -2.7F, 0.5F, 0.125F, -2.7F, 0.5F); // Box 528
		bodyModel[53].setRotationPoint(-4F, 4.75F, -8.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.7F, 0.125F, -0.5F, -0.7F, 0.125F, -0.5F, -0.7F, -0.625F, 0F, -0.7F, -0.625F); // Box 152
		bodyModel[54].setRotationPoint(5.25F, 4.75F, -9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[55].setRotationPoint(5F, 4.25F, -9.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[56].setRotationPoint(5F, 6.55F, -9.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.7F, 0.125F, -0.5F, -0.7F, 0.125F, -0.5F, -0.7F, -0.625F, 0F, -0.7F, -0.625F); // Box 152
		bodyModel[57].setRotationPoint(-4.5F, 4.75F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[58].setRotationPoint(-4.75F, 4.25F, -9.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[59].setRotationPoint(-4.75F, 6.55F, -9.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[60].setRotationPoint(-2.5F, 2.5F, -8.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[61].setRotationPoint(4.25F, 3F, -7.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[62].setRotationPoint(-5.5F, 3F, -7.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[63].setRotationPoint(-3F, 3F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[64].setRotationPoint(-4.5F, 2.5F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[65].setRotationPoint(9F, 2.2F, -9.37F);
		bodyModel[65].rotateAngleX = -0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[66].setRotationPoint(9.75F, 1.5F, -9.37F);
		bodyModel[66].rotateAngleX = -0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[67].setRotationPoint(11.25F, 2.55F, -9.87F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[68].setRotationPoint(4.75F, 2F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 957
		bodyModel[69].setRotationPoint(4.75F, 2F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[70].setRotationPoint(8F, 2.55F, -9.87F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[71].setRotationPoint(-9.25F, 1.5F, -9.37F);
		bodyModel[71].rotateAngleX = -0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[72].setRotationPoint(-7.75F, 2.2F, -9.37F);
		bodyModel[72].rotateAngleX = -0.78539816F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 151
		bodyModel[73].setRotationPoint(11.75F, 2.55F, -8.87F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 151
		bodyModel[74].setRotationPoint(7.75F, 2.55F, -8.87F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[75].setRotationPoint(-7F, 2.55F, -9.87F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[76].setRotationPoint(-10.25F, 2.55F, -9.87F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 151
		bodyModel[77].setRotationPoint(-6.75F, 2.55F, -8.87F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 151
		bodyModel[78].setRotationPoint(-10.75F, 2.55F, -8.87F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[79].setRotationPoint(-6.1F, 5.8F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[80].setRotationPoint(1.9F, 5.8F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 122
		bodyModel[81].setRotationPoint(-10.25F, 5F, -5F);

		bodyModel[82].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 123
		bodyModel[82].setRotationPoint(5.25F, 5F, -5F);

		bodyModel[83].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 101
		bodyModel[83].setRotationPoint(10.25F, 6.5F, 6F);

		bodyModel[84].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 102
		bodyModel[84].setRotationPoint(-8.25F, 6.5F, 6F);

		bodyModel[85].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 101
		bodyModel[85].setRotationPoint(-0.25F, 6.5F, 6F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 122
		bodyModel[86].setRotationPoint(-2.25F, 5F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 890
		bodyModel[87].setRotationPoint(-9.25F, 4.75F, -8.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[88].setRotationPoint(14F, 6F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[89].setRotationPoint(12.5F, 6F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[90].setRotationPoint(13.5F, 6F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337
		bodyModel[91].setRotationPoint(14F, 7F, -6.95F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[92].setRotationPoint(12F, 3F, -7.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 337
		bodyModel[93].setRotationPoint(14F, 5.5F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 337
		bodyModel[94].setRotationPoint(14F, 2.55F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 337
		bodyModel[95].setRotationPoint(12.25F, 2.05F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[96].setRotationPoint(13.5F, 4.5F, -7.01F);
		bodyModel[96].rotateAngleZ = -0.2443461F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[97].setRotationPoint(-11.5F, 6F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[98].setRotationPoint(-12F, 6F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[99].setRotationPoint(-12F, 6F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 337
		bodyModel[100].setRotationPoint(-13F, 5.5F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F); // Box 337
		bodyModel[101].setRotationPoint(-13F, 2.55F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 337
		bodyModel[102].setRotationPoint(-12.25F, 2.05F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337
		bodyModel[103].setRotationPoint(-12F, 7F, -6.95F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[104].setRotationPoint(-11.98F, 4.62F, -7.01F);
		bodyModel[104].rotateAngleZ = 0.2443461F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[105].setRotationPoint(-12F, 3F, -7.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 337
		bodyModel[106].setRotationPoint(14F, 4.75F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[107].setRotationPoint(13.5F, 4.75F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 0F, -3F, 0F); // Box 920
		bodyModel[108].setRotationPoint(12.25F, 5.75F, 6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[109].setRotationPoint(12F, 7.75F, 6.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 922
		bodyModel[110].setRotationPoint(12.5F, 6F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 923
		bodyModel[111].setRotationPoint(13.5F, 6F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 924
		bodyModel[112].setRotationPoint(14F, 7F, 5.95F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 925
		bodyModel[113].setRotationPoint(14F, 4.75F, 6.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 926
		bodyModel[114].setRotationPoint(12F, 3F, 6.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 927
		bodyModel[115].setRotationPoint(14F, 5.5F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 928
		bodyModel[116].setRotationPoint(14F, 2.55F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 929
		bodyModel[117].setRotationPoint(12.25F, 2.05F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 930
		bodyModel[118].setRotationPoint(13.5F, 4.75F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[119].setRotationPoint(13.5F, 4.5F, 7.01F);
		bodyModel[119].rotateAngleZ = -0.2443461F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 922
		bodyModel[120].setRotationPoint(-12F, 6F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 337
		bodyModel[121].setRotationPoint(-12F, 4.75F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 337
		bodyModel[122].setRotationPoint(-11.95F, 4.75F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 925
		bodyModel[123].setRotationPoint(-12F, 4.75F, 6.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 927
		bodyModel[124].setRotationPoint(-13F, 5.5F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F); // Box 928
		bodyModel[125].setRotationPoint(-13F, 2.55F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 929
		bodyModel[126].setRotationPoint(-12.25F, 2.05F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 930
		bodyModel[127].setRotationPoint(-11.95F, 4.75F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 924
		bodyModel[128].setRotationPoint(-12F, 7F, 5.95F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[129].setRotationPoint(-11.98F, 4.62F, 7.01F);
		bodyModel[129].rotateAngleZ = 0.2443461F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 926
		bodyModel[130].setRotationPoint(-12F, 3F, 6.25F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[131].setRotationPoint(11.75F, 2.55F, 6.87F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 1040
		bodyModel[132].setRotationPoint(7.75F, 2.55F, 6.87F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[133].setRotationPoint(-6.75F, 2.55F, 6.87F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 1044
		bodyModel[134].setRotationPoint(-10.75F, 2.55F, 6.87F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
		bodyModel[135].setRotationPoint(-9F, 5.75F, 8.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
		bodyModel[136].setRotationPoint(-1F, 5.75F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 426
		bodyModel[137].setRotationPoint(9.5F, 5.75F, 8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[138].setRotationPoint(-1.25F, 8F, 6.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 879
		bodyModel[139].setRotationPoint(-0.75F, 5F, 6.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 880
		bodyModel[140].setRotationPoint(-3F, 4.75F, 6.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 881
		bodyModel[141].setRotationPoint(0.75F, 4.75F, 6.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 882
		bodyModel[142].setRotationPoint(-2.25F, 5.25F, 6.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 883
		bodyModel[143].setRotationPoint(0.75F, 5.25F, 6.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 885
		bodyModel[144].setRotationPoint(-1.25F, 4.75F, 6.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 886
		bodyModel[145].setRotationPoint(-9.25F, 8F, 6.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 887
		bodyModel[146].setRotationPoint(-8.75F, 5F, 6.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 888
		bodyModel[147].setRotationPoint(-7.25F, 4.75F, 6.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 889
		bodyModel[148].setRotationPoint(-7.25F, 5.25F, 6.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 890
		bodyModel[149].setRotationPoint(-9.25F, 4.75F, 6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 891
		bodyModel[150].setRotationPoint(9.25F, 8F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 892
		bodyModel[151].setRotationPoint(9.75F, 5F, 6.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 893
		bodyModel[152].setRotationPoint(7.5F, 4.75F, 6.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 894
		bodyModel[153].setRotationPoint(8.25F, 5.25F, 6.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 895
		bodyModel[154].setRotationPoint(9.25F, 4.75F, 6.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 896
		bodyModel[155].setRotationPoint(-10.25F, 5.75F, 6.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 898
		bodyModel[156].setRotationPoint(11.25F, 5.75F, 6.75F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 917
		bodyModel[157].setRotationPoint(-12F, 3F, 6.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 918
		bodyModel[158].setRotationPoint(-12F, 4.75F, 6.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 919
		bodyModel[159].setRotationPoint(11.25F, 4.75F, 6.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 0F, -3F, 0F); // Box 920
		bodyModel[160].setRotationPoint(-11.75F, 5.75F, 6.75F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[161].setRotationPoint(-12F, 7.75F, 6.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 923
		bodyModel[162].setRotationPoint(-11.5F, 6F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 993
		bodyModel[163].setRotationPoint(7F, 6.55F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 994
		bodyModel[164].setRotationPoint(7.5F, 7.55F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 995
		bodyModel[165].setRotationPoint(2.5F, 7.55F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 996
		bodyModel[166].setRotationPoint(8F, 5.05F, 7.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 997
		bodyModel[167].setRotationPoint(1F, 5.05F, 7.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 998
		bodyModel[168].setRotationPoint(1F, 6.55F, 7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 999
		bodyModel[169].setRotationPoint(1.5F, 7.55F, 7.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F); // Box 1000
		bodyModel[170].setRotationPoint(-3.5F, 6.55F, 7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1001
		bodyModel[171].setRotationPoint(-3F, 7.55F, 7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1002
		bodyModel[172].setRotationPoint(-2.5F, 5.05F, 7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1003
		bodyModel[173].setRotationPoint(-7F, 5.05F, 7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F); // Box 1004
		bodyModel[174].setRotationPoint(-7F, 6.55F, 7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1005
		bodyModel[175].setRotationPoint(-6.5F, 7.55F, 7.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1006
		bodyModel[176].setRotationPoint(-5.5F, 7.55F, 7.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 1007
		bodyModel[177].setRotationPoint(4.25F, 7.05F, 6.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 1008
		bodyModel[178].setRotationPoint(-5.5F, 7.05F, 6.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0F, 0.125F, -2.7F, 0F); // Box 1009
		bodyModel[179].setRotationPoint(4.5F, 4.75F, 7.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.125F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -2.7F, 0.5F, 0.125F, -2.7F, 0.5F, 0.125F, -2.7F, 0F, -0.125F, -2.7F, 0F); // Box 1010
		bodyModel[180].setRotationPoint(5.5F, 4.75F, 7.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0F, 0.125F, -2.7F, 0F); // Box 1011
		bodyModel[181].setRotationPoint(-5.25F, 4.75F, 7.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0.5F, -0.125F, -2.7F, 0F, 0.125F, -2.7F, 0F); // Box 1012
		bodyModel[182].setRotationPoint(-4F, 4.75F, 7.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.7F, -0.625F, -0.5F, -0.7F, -0.625F, -0.5F, -0.7F, 0.125F, 0F, -0.7F, 0.125F); // Box 1013
		bodyModel[183].setRotationPoint(5.25F, 4.75F, 8.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1014
		bodyModel[184].setRotationPoint(5F, 4.25F, 8.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1015
		bodyModel[185].setRotationPoint(5F, 6.55F, 8.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.7F, -0.625F, -0.5F, -0.7F, -0.625F, -0.5F, -0.7F, 0.125F, 0F, -0.7F, 0.125F); // Box 1016
		bodyModel[186].setRotationPoint(-4.5F, 4.75F, 8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1017
		bodyModel[187].setRotationPoint(-4.75F, 4.25F, 8.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1018
		bodyModel[188].setRotationPoint(-4.75F, 6.55F, 8.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		bodyModel[189].setRotationPoint(11.25F, 2.55F, 8.87F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		bodyModel[190].setRotationPoint(8F, 2.55F, 8.87F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		bodyModel[191].setRotationPoint(-7F, 2.55F, 8.87F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[192].setRotationPoint(-10.25F, 2.55F, 8.87F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[193].setRotationPoint(9F, 2.2F, 9.37F);
		bodyModel[193].rotateAngleX = -0.78539816F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[194].setRotationPoint(9.75F, 1.5F, 9.37F);
		bodyModel[194].rotateAngleX = -0.78539816F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[195].setRotationPoint(-9.25F, 1.5F, 9.37F);
		bodyModel[195].rotateAngleX = -0.78539816F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[196].setRotationPoint(-7.75F, 2.2F, 9.37F);
		bodyModel[196].rotateAngleX = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1051
		bodyModel[197].setRotationPoint(-6.1F, 5.8F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1052
		bodyModel[198].setRotationPoint(1.9F, 5.8F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1019
		bodyModel[199].setRotationPoint(-2.5F, 2.5F, 6.75F);
	}
}