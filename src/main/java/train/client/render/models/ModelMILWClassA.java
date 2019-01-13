//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:28.03.2018 - 18:52:57
// Last changed on: 28.03.2018 - 18:52:57

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelMILWClassA extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILWClassA()
	{
		milwclassaModel = new ModelRendererTurbo[201];
		milwclassaModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box001
		milwclassaModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box002
		milwclassaModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box003
		milwclassaModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box004
		milwclassaModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box005
		milwclassaModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box006
		milwclassaModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box007
		milwclassaModel[7] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box008
		milwclassaModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box009
		milwclassaModel[9] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box010
		milwclassaModel[10] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box011
		milwclassaModel[11] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box012
		milwclassaModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box013
		milwclassaModel[13] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box014
		milwclassaModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box015
		milwclassaModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box016
		milwclassaModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box017
		milwclassaModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box018
		milwclassaModel[18] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box019
		milwclassaModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box020
		milwclassaModel[20] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box021
		milwclassaModel[21] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box022
		milwclassaModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box023
		milwclassaModel[23] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box024
		milwclassaModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box025
		milwclassaModel[25] = new ModelRendererTurbo(this, 160, 125, textureX, textureY); // Box026
		milwclassaModel[26] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box028
		milwclassaModel[27] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box029
		milwclassaModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box031
		milwclassaModel[29] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box032
		milwclassaModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box033
		milwclassaModel[31] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box034
		milwclassaModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box035
		milwclassaModel[33] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box036
		milwclassaModel[34] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box037
		milwclassaModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box038
		milwclassaModel[36] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box040
		milwclassaModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box041
		milwclassaModel[38] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box042
		milwclassaModel[39] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box043
		milwclassaModel[40] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box044
		milwclassaModel[41] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box045
		milwclassaModel[42] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box046
		milwclassaModel[43] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box047
		milwclassaModel[44] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box048
		milwclassaModel[45] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box049
		milwclassaModel[46] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box050
		milwclassaModel[47] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box051
		milwclassaModel[48] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box052
		milwclassaModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box053
		milwclassaModel[50] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box054
		milwclassaModel[51] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box055
		milwclassaModel[52] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box056
		milwclassaModel[53] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box057
		milwclassaModel[54] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box058
		milwclassaModel[55] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box059
		milwclassaModel[56] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box060
		milwclassaModel[57] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box061
		milwclassaModel[58] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box062
		milwclassaModel[59] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box063
		milwclassaModel[60] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box065
		milwclassaModel[61] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box068
		milwclassaModel[62] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box069
		milwclassaModel[63] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box070
		milwclassaModel[64] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box071
		milwclassaModel[65] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box072
		milwclassaModel[66] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box073
		milwclassaModel[67] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box075
		milwclassaModel[68] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box076
		milwclassaModel[69] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box077
		milwclassaModel[70] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box078
		milwclassaModel[71] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box079
		milwclassaModel[72] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box080
		milwclassaModel[73] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box081
		milwclassaModel[74] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box082
		milwclassaModel[75] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box083
		milwclassaModel[76] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box084
		milwclassaModel[77] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box085
		milwclassaModel[78] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box086
		milwclassaModel[79] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box088
		milwclassaModel[80] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box089
		milwclassaModel[81] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box090
		milwclassaModel[82] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box091
		milwclassaModel[83] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box092
		milwclassaModel[84] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box093
		milwclassaModel[85] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box094
		milwclassaModel[86] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box095
		milwclassaModel[87] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box096
		milwclassaModel[88] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box097
		milwclassaModel[89] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box098
		milwclassaModel[90] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box100
		milwclassaModel[91] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box101
		milwclassaModel[92] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box102
		milwclassaModel[93] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box103
		milwclassaModel[94] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box104
		milwclassaModel[95] = new ModelRendererTurbo(this, 385, 150, textureX, textureY); // Box106
		milwclassaModel[96] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box107
		milwclassaModel[97] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box108
		milwclassaModel[98] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box109
		milwclassaModel[99] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box110
		milwclassaModel[100] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box111
		milwclassaModel[101] = new ModelRendererTurbo(this, 185, 120, textureX, textureY); // Box117
		milwclassaModel[102] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box121
		milwclassaModel[103] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box130
		milwclassaModel[104] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box131
		milwclassaModel[105] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box132
		milwclassaModel[106] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box133
		milwclassaModel[107] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box134
		milwclassaModel[108] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box135
		milwclassaModel[109] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box150
		milwclassaModel[110] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box151
		milwclassaModel[111] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box152
		milwclassaModel[112] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box153
		milwclassaModel[113] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box154
		milwclassaModel[114] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box155
		milwclassaModel[115] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box156
		milwclassaModel[116] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box157
		milwclassaModel[117] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box158
		milwclassaModel[118] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box159
		milwclassaModel[119] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box160
		milwclassaModel[120] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box161
		milwclassaModel[121] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box162
		milwclassaModel[122] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box163
		milwclassaModel[123] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box164
		milwclassaModel[124] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box165
		milwclassaModel[125] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 165
		milwclassaModel[126] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 166
		milwclassaModel[127] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 169
		milwclassaModel[128] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 170
		milwclassaModel[129] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 171
		milwclassaModel[130] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 172
		milwclassaModel[131] = new ModelRendererTurbo(this, 497, 25, textureX, textureY, "lamp"); // Box 173
		milwclassaModel[132] = new ModelRendererTurbo(this, 225, 97, textureX, textureY, "lamp"); // Box 174
		milwclassaModel[133] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 175
		milwclassaModel[134] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 177
		milwclassaModel[135] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 178
		milwclassaModel[136] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 180
		milwclassaModel[137] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 182
		milwclassaModel[138] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 180
		milwclassaModel[139] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 181
		milwclassaModel[140] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 182
		milwclassaModel[141] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 183
		milwclassaModel[142] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 184
		milwclassaModel[143] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 186
		milwclassaModel[144] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 187
		milwclassaModel[145] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 188
		milwclassaModel[146] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 189
		milwclassaModel[147] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 190
		milwclassaModel[148] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 191
		milwclassaModel[149] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 191
		milwclassaModel[150] = new ModelRendererTurbo(this, 417, 113, textureX, textureY, "lamp"); // Box 192
		milwclassaModel[151] = new ModelRendererTurbo(this, 433, 113, textureX, textureY, "lamp"); // Box 193
		milwclassaModel[152] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 194
		milwclassaModel[153] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 195
		milwclassaModel[154] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 194
		milwclassaModel[155] = new ModelRendererTurbo(this, 466, 125, textureX, textureY); // Box 196
		milwclassaModel[156] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 196
		milwclassaModel[157] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 199
		milwclassaModel[158] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 200
		milwclassaModel[159] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 201
		milwclassaModel[160] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 202
		milwclassaModel[161] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 203
		milwclassaModel[162] = new ModelRendererTurbo(this, 185, 120, textureX, textureY); // Box 199
		milwclassaModel[163] = new ModelRendererTurbo(this, 185, 120, textureX, textureY); // Box 200
		milwclassaModel[164] = new ModelRendererTurbo(this, 300, 150, textureX, textureY); // Box 194
		milwclassaModel[165] = new ModelRendererTurbo(this, 450, 120, textureX, textureY); // Box 195
		milwclassaModel[166] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 196
		milwclassaModel[167] = new ModelRendererTurbo(this, 430, 140, textureX, textureY); // Box 197
		milwclassaModel[168] = new ModelRendererTurbo(this, 430, 140, textureX, textureY); // Box 198
		milwclassaModel[169] = new ModelRendererTurbo(this, 5, 140, textureX, textureY); // Box 182
		milwclassaModel[170] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 183
		milwclassaModel[171] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 184
		milwclassaModel[172] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 185
		milwclassaModel[173] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 186
		milwclassaModel[174] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 187
		milwclassaModel[175] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 188
		milwclassaModel[176] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 189
		milwclassaModel[177] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 190
		milwclassaModel[178] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 191
		milwclassaModel[179] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 192
		milwclassaModel[180] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 193
		milwclassaModel[181] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 194
		milwclassaModel[182] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 195
		milwclassaModel[183] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 196
		milwclassaModel[184] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 197
		milwclassaModel[185] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 198
		milwclassaModel[186] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 199
		milwclassaModel[187] = new ModelRendererTurbo(this, 5, 140, textureX, textureY); // Box 200
		milwclassaModel[188] = new ModelRendererTurbo(this, 5, 140, textureX, textureY); // Box 201
		milwclassaModel[189] = new ModelRendererTurbo(this, 5, 140, textureX, textureY); // Box 202
		milwclassaModel[190] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 192
		milwclassaModel[191] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 193
		milwclassaModel[192] = new ModelRendererTurbo(this, 250, 130, textureX, textureY); // Box 195
		milwclassaModel[193] = new ModelRendererTurbo(this, 250, 130, textureX, textureY); // Box 197
		milwclassaModel[194] = new ModelRendererTurbo(this, 260, 130, textureX, textureY); // Box 198
		milwclassaModel[195] = new ModelRendererTurbo(this, 255, 120, textureX, textureY); // Box 199
		milwclassaModel[196] = new ModelRendererTurbo(this, 75, 130, textureX, textureY); // Box 200
		milwclassaModel[197] = new ModelRendererTurbo(this, 75, 130, textureX, textureY); // Box 201
		milwclassaModel[198] = new ModelRendererTurbo(this, 75, 130, textureX, textureY); // Box 202
		milwclassaModel[199] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 200
		milwclassaModel[200] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 201

		milwclassaModel[0].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box001
		milwclassaModel[0].setRotationPoint(-84F, 6F, -6F);

		milwclassaModel[1].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box002
		milwclassaModel[1].setRotationPoint(-72F, 6F, -6F);

		milwclassaModel[2].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box003
		milwclassaModel[2].setRotationPoint(-56F, 3F, -6F);

		milwclassaModel[3].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box004
		milwclassaModel[3].setRotationPoint(-38F, 3F, -6F);

		milwclassaModel[4].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box005
		milwclassaModel[4].setRotationPoint(-12F, 5F, -6F);

		milwclassaModel[5].addShapeBox(2F, 0F, 0F, 68, 13, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box006
		milwclassaModel[5].setRotationPoint(-83F, -17F, -8F);

		milwclassaModel[6].addShapeBox(0F, 0F, 0F, 70, 2, 14, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box007
		milwclassaModel[6].setRotationPoint(-81F, -19F, -7F);

		milwclassaModel[7].addShapeBox(0F, 0F, 0F, 71, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box008
		milwclassaModel[7].setRotationPoint(-81F, -20F, -6F);

		milwclassaModel[8].addShapeBox(0F, 0F, 0F, 79, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0F, 0F); // Box009
		milwclassaModel[8].setRotationPoint(-81F, -21F, -4F);

		milwclassaModel[9].addShapeBox(0F, 0F, 0F, 5, 13, 16, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box010
		milwclassaModel[9].setRotationPoint(-86F, -17F, -8F);

		milwclassaModel[10].addShapeBox(0F, 0F, 0F, 2, 13, 14, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box011
		milwclassaModel[10].setRotationPoint(-88F, -17F, -7F);

		milwclassaModel[11].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box012
		milwclassaModel[11].setRotationPoint(-90F, -17F, -6F);

		milwclassaModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box013
		milwclassaModel[12].setRotationPoint(-87F, -19F, -7F);

		milwclassaModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box014
		milwclassaModel[13].setRotationPoint(-89F, -19F, -6F);

		milwclassaModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box015
		milwclassaModel[14].setRotationPoint(-87F, -20F, -6F);

		milwclassaModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Box016
		milwclassaModel[15].setRotationPoint(-87F, -21F, -5F);

		milwclassaModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box017
		milwclassaModel[16].setRotationPoint(-89F, -20F, -5F);

		milwclassaModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -2F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Box018
		milwclassaModel[17].setRotationPoint(-89F, -21F, -4F);

		milwclassaModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box019
		milwclassaModel[18].setRotationPoint(-91F, -19F, -5F);

		milwclassaModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box020
		milwclassaModel[19].setRotationPoint(-90F, -20F, -4F);

		milwclassaModel[20].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F, -1F, 0F, -1F, 0.05F, 0F, -0.9F, 0.05F, 0F, -0.9F, -1F, 0F, -1F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box021
		milwclassaModel[20].setRotationPoint(-91F, -17F, -4F);

		milwclassaModel[21].addBox(0F, 0F, 0F, 69, 1, 22, 0F); // Box022
		milwclassaModel[21].setRotationPoint(-81F, -4F, -11F);

		milwclassaModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box023
		milwclassaModel[22].setRotationPoint(-86F, -4F, -11F);

		milwclassaModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box024
		milwclassaModel[23].setRotationPoint(-90F, -4F, -9F);

		milwclassaModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F); // Box025
		milwclassaModel[24].setRotationPoint(-92F, -4F, -6F);

		milwclassaModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box026
		milwclassaModel[25].setRotationPoint(-92.5F, -3F, -2F);

		milwclassaModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box028
		milwclassaModel[26].setRotationPoint(-91.5F, -3F, -6F);

		milwclassaModel[27].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, 0F, -1F, 1F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 2F, 0F, 0F); // Box029
		milwclassaModel[27].setRotationPoint(-90F, -3F, -7F);

		milwclassaModel[28].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box031
		milwclassaModel[28].setRotationPoint(-91.5F, -3F, 2F);

		milwclassaModel[29].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F); // Box032
		milwclassaModel[29].setRotationPoint(-90F, -3F, 6F);

		milwclassaModel[30].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, 1F, -1F, 2F, 2F, -1F, 2F, -2F, 0F, 6F, -1F); // Box033
		milwclassaModel[30].setRotationPoint(-86F, -3F, -9F);

		milwclassaModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -1F, 6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, -1F, 6F, 0F, 0F, 2F, 1F, -4F, 0F, 1F, -4F, 0F, -1F, 0F, 2F, -1F); // Box034
		milwclassaModel[31].setRotationPoint(-87F, 3F, -9F);

		milwclassaModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F); // Box035
		milwclassaModel[32].setRotationPoint(-81F, -3F, -11F);

		milwclassaModel[33].addShapeBox(0F, 0F, 0F, 89, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box036
		milwclassaModel[33].setRotationPoint(-78F, -3F, -11F);

		milwclassaModel[34].addShapeBox(0F, 0F, 0F, 89, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box037
		milwclassaModel[34].setRotationPoint(-78F, -3F, 10F);

		milwclassaModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -1F, 6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, -1F, 6F, 0F, 0F, 2F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 2F, 1F); // Box038
		milwclassaModel[35].setRotationPoint(-87F, 3F, 8F);

		milwclassaModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F); // Box040
		milwclassaModel[36].setRotationPoint(-81F, -3F, 10F);

		milwclassaModel[37].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box041
		milwclassaModel[37].setRotationPoint(-86F, 4F, -6F);

		milwclassaModel[38].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box042
		milwclassaModel[38].setRotationPoint(-74F, 4F, -6F);

		milwclassaModel[39].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box043
		milwclassaModel[39].setRotationPoint(-15F, 2F, -6F);

		milwclassaModel[40].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box044
		milwclassaModel[40].setRotationPoint(-15F, 2F, 6F);

		milwclassaModel[41].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box045
		milwclassaModel[41].setRotationPoint(-74F, 4F, 6F);

		milwclassaModel[42].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box046
		milwclassaModel[42].setRotationPoint(-86F, 4F, 6F);

		milwclassaModel[43].addBox(0F, 0F, 0F, 12, 12, 0, 0F); // Box047
		milwclassaModel[43].setRotationPoint(-61F, -2F, -6F);

		milwclassaModel[44].addBox(0F, 0F, 0F, 12, 12, 0, 0F); // Box048
		milwclassaModel[44].setRotationPoint(-61F, -2F, 6F);

		milwclassaModel[45].addBox(0F, 0F, 0F, 12, 12, 0, 0F); // Box049
		milwclassaModel[45].setRotationPoint(-43F, -2F, 6F);

		milwclassaModel[46].addBox(0F, 0F, 0F, 12, 12, 0, 0F); // Box050
		milwclassaModel[46].setRotationPoint(-43F, -2F, -6F);

		milwclassaModel[47].addBox(0F, 0F, 0F, 37, 3, 4, 0F); // Box051
		milwclassaModel[47].setRotationPoint(-66F, 3F, -2F);

		milwclassaModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box052
		milwclassaModel[48].setRotationPoint(-90.2F, -21F, -1.5F);

		milwclassaModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box053
		milwclassaModel[49].setRotationPoint(-90.2F, -19F, -1.5F);

		milwclassaModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box054
		milwclassaModel[50].setRotationPoint(-80F, -21.5F, -1.5F);

		milwclassaModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box055
		milwclassaModel[51].setRotationPoint(-80F, -21.5F, 0.5F);

		milwclassaModel[52].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box056
		milwclassaModel[52].setRotationPoint(-82F, 6F, -1F);

		milwclassaModel[53].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box057
		milwclassaModel[53].setRotationPoint(-78F, 4F, -1F);

		milwclassaModel[54].addShapeBox(0F, 0F, 0F, 9, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box058
		milwclassaModel[54].setRotationPoint(-82F, -3F, -9F);

		milwclassaModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box059
		milwclassaModel[55].setRotationPoint(-82F, 3F, -7F);

		milwclassaModel[56].addShapeBox(0F, 0F, 0F, 88, 2, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box060
		milwclassaModel[56].setRotationPoint(-77F, 1F, -1F);

		milwclassaModel[57].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F); // Box061
		milwclassaModel[57].setRotationPoint(-28F, -3F, -8.5F);

		milwclassaModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box062
		milwclassaModel[58].setRotationPoint(-29F, -3F, -9.5F);

		milwclassaModel[59].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box063
		milwclassaModel[59].setRotationPoint(-80F, -21.5F, -0.5F);

		milwclassaModel[60].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box065
		milwclassaModel[60].setRotationPoint(-19F, 5F, 6F);

		milwclassaModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box068
		milwclassaModel[61].setRotationPoint(-15F, 7F, 6F);

		milwclassaModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box069
		milwclassaModel[62].setRotationPoint(-12F, 5F, 6F);

		milwclassaModel[63].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box070
		milwclassaModel[63].setRotationPoint(-3F, 5F, -6F);

		milwclassaModel[64].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box071
		milwclassaModel[64].setRotationPoint(-19F, 5F, -7F);

		milwclassaModel[65].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box072
		milwclassaModel[65].setRotationPoint(-15F, 7F, -7F);

		milwclassaModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box073
		milwclassaModel[66].setRotationPoint(-17F, 3F, -7F);

		milwclassaModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box075
		milwclassaModel[67].setRotationPoint(-12F, 5F, -7F);

		milwclassaModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box076
		milwclassaModel[68].setRotationPoint(-27F, 5F, 6F);

		milwclassaModel[69].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box077
		milwclassaModel[69].setRotationPoint(-27F, 5F, -7F);

		milwclassaModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 1F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -2F, 1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F); // Box078
		milwclassaModel[70].setRotationPoint(-28F, 4F, -4F);

		milwclassaModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box079
		milwclassaModel[71].setRotationPoint(-17F, -7F, 7F);

		milwclassaModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box080
		milwclassaModel[72].setRotationPoint(-16F, -10F, 7F);

		milwclassaModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box081
		milwclassaModel[73].setRotationPoint(-15F, -13F, 7F);

		milwclassaModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box082
		milwclassaModel[74].setRotationPoint(-14F, -16F, 7F);

		milwclassaModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 1.05F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, -1F, -2F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box083
		milwclassaModel[75].setRotationPoint(-11F, -19F, 8F);

		milwclassaModel[76].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box084
		milwclassaModel[76].setRotationPoint(-10F, -18F, 8F);

		milwclassaModel[77].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, -0.99F, 0F, 0F, -0.69F, 0F, 0F, 0.2F, 1F, 0F, 0F, 1F); // Box085
		milwclassaModel[77].setRotationPoint(-10F, -19F, 6F);

		milwclassaModel[78].addBox(0F, 0F, 0F, 16, 7, 1, 0F); // Box086
		milwclassaModel[78].setRotationPoint(-12F, -10F, 10F);

		milwclassaModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box088
		milwclassaModel[79].setRotationPoint(-17F, -7F, -8F);

		milwclassaModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box089
		milwclassaModel[80].setRotationPoint(-16F, -10F, -8F);

		milwclassaModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box090
		milwclassaModel[81].setRotationPoint(-15F, -13F, -8F);

		milwclassaModel[82].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box091
		milwclassaModel[82].setRotationPoint(-14F, -16F, -8F);

		milwclassaModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -1F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 1.05F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box092
		milwclassaModel[83].setRotationPoint(-11F, -19F, -11F);

		milwclassaModel[84].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -2F, 0F); // Box093
		milwclassaModel[84].setRotationPoint(-10F, -18F, -11F);

		milwclassaModel[85].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -1F, 0F, -0.3F, -1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 1F, 0F, -0.59F, 0F, 0F, -0.99F, 0F); // Box094
		milwclassaModel[85].setRotationPoint(-10F, -19F, -7F);

		milwclassaModel[86].addBox(0F, 0F, 0F, 16, 7, 1, 0F); // Box095
		milwclassaModel[86].setRotationPoint(-12F, -10F, -11F);

		milwclassaModel[87].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box096
		milwclassaModel[87].setRotationPoint(-13F, -16F, -11F);

		milwclassaModel[88].addShapeBox(0F, 0F, 0F, 20, 2, 22, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -2F, 0F, -0.1F); // Box097
		milwclassaModel[88].setRotationPoint(-9F, 0F, -11F);

		milwclassaModel[89].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box098
		milwclassaModel[89].setRotationPoint(10F, -16F, 10F);

		milwclassaModel[90].addShapeBox(0F, 0F, 0F, 5, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 1F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 4F, 0F); // Box100
		milwclassaModel[90].setRotationPoint(-14F, -17F, -7F);

		milwclassaModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box101
		milwclassaModel[91].setRotationPoint(-15F, -0.01F, -10F);

		milwclassaModel[92].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box102
		milwclassaModel[92].setRotationPoint(-13F, -3F, -10F);

		milwclassaModel[93].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box103
		milwclassaModel[93].setRotationPoint(-13F, -3F, 7F);

		milwclassaModel[94].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box104
		milwclassaModel[94].setRotationPoint(-4F, -17F, -11F);

		milwclassaModel[95].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box106
		milwclassaModel[95].setRotationPoint(10F, -16F, -10F);

		milwclassaModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box107
		milwclassaModel[96].setRotationPoint(10F, -17F, -11F);

		milwclassaModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, -0.5F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box108
		milwclassaModel[97].setRotationPoint(10F, -20F, -10F);

		milwclassaModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0.25F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.2F, 0F); // Box109
		milwclassaModel[98].setRotationPoint(-2F, -21F, -4F);

		milwclassaModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0.35F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.35F, 0F); // Box110
		milwclassaModel[99].setRotationPoint(4F, -21F, -4F);

		milwclassaModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box111
		milwclassaModel[100].setRotationPoint(-4F, -17F, 10F);

		milwclassaModel[101].addBox(0F, 0F, 0F, 5, 6, 0, 0F); // Box117
		milwclassaModel[101].setRotationPoint(5F, 1F, -11F);

		milwclassaModel[102].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box121
		milwclassaModel[102].setRotationPoint(8F, 3F, -1F);

		milwclassaModel[103].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box130
		milwclassaModel[103].setRotationPoint(-75F, 0F, -6F);

		milwclassaModel[104].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box131
		milwclassaModel[104].setRotationPoint(-58F, 2F, -7F);

		milwclassaModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box132
		milwclassaModel[105].setRotationPoint(-58F, 1F, -7F);

		milwclassaModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box133
		milwclassaModel[106].setRotationPoint(-58F, 3F, -7F);

		milwclassaModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box134
		milwclassaModel[107].setRotationPoint(-40F, 3F, -7F);

		milwclassaModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box135
		milwclassaModel[108].setRotationPoint(-40F, 1F, -7F);

		milwclassaModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box150
		milwclassaModel[109].setRotationPoint(-18F, -5F, -8F);

		milwclassaModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box151
		milwclassaModel[110].setRotationPoint(-16F, -5F, -11F);

		milwclassaModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box152
		milwclassaModel[111].setRotationPoint(-15F, -7F, -11F);

		milwclassaModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box153
		milwclassaModel[112].setRotationPoint(-18F, -5F, 7F);

		milwclassaModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box154
		milwclassaModel[113].setRotationPoint(-15F, -7F, 8F);

		milwclassaModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box155
		milwclassaModel[114].setRotationPoint(-16F, -5F, 8F);

		milwclassaModel[115].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box156
		milwclassaModel[115].setRotationPoint(-13F, -10F, -10F);

		milwclassaModel[116].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box157
		milwclassaModel[116].setRotationPoint(-13F, -10F, 9F);

		milwclassaModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, -1.95F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F); // Box158
		milwclassaModel[117].setRotationPoint(-14F, -19F, -8F);

		milwclassaModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.95F, -2F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F); // Box159
		milwclassaModel[118].setRotationPoint(-14F, -19F, 6F);

		milwclassaModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box160
		milwclassaModel[119].setRotationPoint(-16F, -10F, -11F);

		milwclassaModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box161
		milwclassaModel[120].setRotationPoint(-15F, -13F, -11F);

		milwclassaModel[121].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box162
		milwclassaModel[121].setRotationPoint(-14F, -16F, -11F);

		milwclassaModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box163
		milwclassaModel[122].setRotationPoint(-16F, -10F, 8F);

		milwclassaModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box164
		milwclassaModel[123].setRotationPoint(-15F, -13F, 8F);

		milwclassaModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box165
		milwclassaModel[124].setRotationPoint(-14F, -16F, 8F);

		milwclassaModel[125].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -0.99F, 0F, 0F, -0.49F, 0F, 0F, 0.3F, 1F, 0F, 0F, 1F); // Box 165
		milwclassaModel[125].setRotationPoint(-10F, -20F, 4F);

		milwclassaModel[126].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.4F, 1F, 0F, -0.49F, 0F, 0F, -0.99F, 0F); // Box 166
		milwclassaModel[126].setRotationPoint(-10F, -20F, -5F);

		milwclassaModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 169
		milwclassaModel[127].setRotationPoint(-73F, -1F, 4.7F);

		milwclassaModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		milwclassaModel[128].setRotationPoint(-73F, -1F, -5.7F);

		milwclassaModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		milwclassaModel[129].setRotationPoint(-75F, 1F, -6F);

		milwclassaModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 172
		milwclassaModel[130].setRotationPoint(-75F, -1F, -6F);

		milwclassaModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 173
		milwclassaModel[131].setRotationPoint(-82F, -19F, 6.5F);

		milwclassaModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 174
		milwclassaModel[132].setRotationPoint(-82F, -19F, -7.5F);

		milwclassaModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		milwclassaModel[133].setRotationPoint(-82F, -18F, -7.5F);

		milwclassaModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 177
		milwclassaModel[134].setRotationPoint(-82F, -18F, 6.5F);

		milwclassaModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -3.2F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 2F, 0F, 1F, -3F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 1.8F, 0F, 0.8F); // Box 178
		milwclassaModel[135].setRotationPoint(-85F, 0F, -11F);

		milwclassaModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 1.4F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0.05F, -3.2F, 0F, 0.05F, 1.8F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0.05F, -3F, 0F, 0.05F); // Box 180
		milwclassaModel[136].setRotationPoint(-85F, 0F, 10F);

		milwclassaModel[137].addShapeBox(0F, 0F, 0F, 26, 3, 10, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F); // Box 182
		milwclassaModel[137].setRotationPoint(-19F, 1F, -5F);

		milwclassaModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.099F, -1F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F); // Box 180
		milwclassaModel[138].setRotationPoint(-16F, -5F, 11.02F);

		milwclassaModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.099F, -1F, 0F, -1.099F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.099F, 0F, 0F, -1.099F); // Box 181
		milwclassaModel[139].setRotationPoint(-18F, -4F, 11.02F);

		milwclassaModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.099F, -1F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F); // Box 182
		milwclassaModel[140].setRotationPoint(-15F, -7F, 11.02F);

		milwclassaModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.099F, -1F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F); // Box 183
		milwclassaModel[141].setRotationPoint(-14F, -10F, 11.02F);

		milwclassaModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, -1.099F, 1F, 0F, -1.099F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		milwclassaModel[142].setRotationPoint(-14F, -10F, -12.02F);

		milwclassaModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1.099F, 1F, 0F, -1.099F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		milwclassaModel[143].setRotationPoint(-16F, -5F, -12.02F);

		milwclassaModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -1.099F, 1F, 0F, -1.099F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.099F, 0F, 0F, -1.099F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		milwclassaModel[144].setRotationPoint(-15F, -7F, -12.02F);

		milwclassaModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -1.099F, 1F, 0F, -1.099F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.099F, -1F, 0F, -1.099F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		milwclassaModel[145].setRotationPoint(-18F, -4F, -12.02F);

		milwclassaModel[146].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 189
		milwclassaModel[146].setRotationPoint(-5F, 1F, 0F);

		milwclassaModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.8F, -1F, 0F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 1F, 0.1F, 1.4F, 1F, -1F); // Box 190
		milwclassaModel[147].setRotationPoint(-83F, -3F, 10F);

		milwclassaModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.55F, 0F, 0F, 0.05F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 191
		milwclassaModel[148].setRotationPoint(-83F, 1F, -11F);

		milwclassaModel[149].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 191
		milwclassaModel[149].setRotationPoint(-90.1F, -20F, -0.5F);

		milwclassaModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		milwclassaModel[150].setRotationPoint(-90.35F, -19F, -1F);

		milwclassaModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		milwclassaModel[151].setRotationPoint(-90.35F, -18F, -1F);

		milwclassaModel[152].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // Box 194
		milwclassaModel[152].setRotationPoint(-66F, -7F, -9F);

		milwclassaModel[153].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		milwclassaModel[153].setRotationPoint(-66F, -7F, 7F);

		milwclassaModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -0.4F, 0.8F, -1F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 1.4F, 1F, -0.8F, 0.6F, 1F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		milwclassaModel[154].setRotationPoint(-85F, -3F, -10F);

		milwclassaModel[155].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, -0.4F, -12F, -6F, 0F, -12F, -6F, 0F, -12F, -6F, -0.4F, -12F, -6F, 0.2F, 0F, -6F, -0.4F, 0F, -6F, -0.4F, 0F, -6F, 0.2F, 0F, -6F); // Box 196
		milwclassaModel[155].setRotationPoint(-91.2F, -25F, -8F);

		milwclassaModel[156].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 196
		milwclassaModel[156].setRotationPoint(10F, -16F, -11F);

		milwclassaModel[157].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		milwclassaModel[157].setRotationPoint(-55F, 3F, 6F);

		milwclassaModel[158].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 200
		milwclassaModel[158].setRotationPoint(-55F, 5F, 6F);

		milwclassaModel[159].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		milwclassaModel[159].setRotationPoint(-55F, 1F, -7F);

		milwclassaModel[160].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 202
		milwclassaModel[160].setRotationPoint(-55F, 3F, -7F);

		milwclassaModel[161].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 203
		milwclassaModel[161].setRotationPoint(-17F, 3F, 6F);

		milwclassaModel[162].addBox(0F, 0F, 0F, 5, 6, 0, 0F); // Box 199
		milwclassaModel[162].setRotationPoint(5F, 1F, 11F);

		milwclassaModel[163].addBox(0F, 0F, 0F, 5, 6, 0, 0F); // Box 200
		milwclassaModel[163].setRotationPoint(5F, 1F, 11F);

		milwclassaModel[164].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		milwclassaModel[164].setRotationPoint(4F, -16F, 11F);
		milwclassaModel[164].rotateAngleY = -3.14159265F;

		milwclassaModel[165].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 195
		milwclassaModel[165].setRotationPoint(4F, -16F, -11F);

		milwclassaModel[166].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 196
		milwclassaModel[166].setRotationPoint(4F, -16F, 10F);

		milwclassaModel[167].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		milwclassaModel[167].setRotationPoint(5F, -16F, -10.5F);

		milwclassaModel[168].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		milwclassaModel[168].setRotationPoint(10F, -16F, 11F);
		milwclassaModel[168].rotateAngleY = -3.14159265F;

		milwclassaModel[169].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 182
		milwclassaModel[169].setRotationPoint(-57F, 2.5F, 7F);
		milwclassaModel[169].rotateAngleZ = -0.78539816F;

		milwclassaModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 183
		milwclassaModel[170].setRotationPoint(-40F, 5F, 6F);

		milwclassaModel[171].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 184
		milwclassaModel[171].setRotationPoint(-55F, 5F, 6F);

		milwclassaModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		milwclassaModel[172].setRotationPoint(-40F, 3F, 6F);

		milwclassaModel[173].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		milwclassaModel[173].setRotationPoint(-58F, 4F, 6F);

		milwclassaModel[174].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 187
		milwclassaModel[174].setRotationPoint(-55F, 5F, 6F);

		milwclassaModel[175].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 3.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.7F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F); // Box 188
		milwclassaModel[175].setRotationPoint(-68F, 4F, 6F);

		milwclassaModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 189
		milwclassaModel[176].setRotationPoint(-58F, 5F, 6F);

		milwclassaModel[177].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		milwclassaModel[177].setRotationPoint(-75F, 1F, 5F);

		milwclassaModel[178].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 191
		milwclassaModel[178].setRotationPoint(-75F, 0F, 5F);

		milwclassaModel[179].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 192
		milwclassaModel[179].setRotationPoint(-75F, -1F, 5F);

		milwclassaModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		milwclassaModel[180].setRotationPoint(-58F, 3F, 6F);

		milwclassaModel[181].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F); // Box 194
		milwclassaModel[181].setRotationPoint(-68F, 2F, -7F);

		milwclassaModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 195
		milwclassaModel[182].setRotationPoint(-58F, 3F, -7F);

		milwclassaModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		milwclassaModel[183].setRotationPoint(-58F, 1F, -7F);

		milwclassaModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 197
		milwclassaModel[184].setRotationPoint(-40F, 3F, -7F);

		milwclassaModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		milwclassaModel[185].setRotationPoint(-40F, 1F, -7F);

		milwclassaModel[186].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 199
		milwclassaModel[186].setRotationPoint(-55F, 3F, -7F);

		milwclassaModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 200
		milwclassaModel[187].setRotationPoint(-55.6F, 1.2F, 7F);
		milwclassaModel[187].rotateAngleZ = -0.78539816F;

		milwclassaModel[188].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 201
		milwclassaModel[188].setRotationPoint(-55F, 2F, -8F);
		milwclassaModel[188].rotateAngleZ = -2.32128791F;

		milwclassaModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 202
		milwclassaModel[189].setRotationPoint(-53.6F, 3.4F, -8F);
		milwclassaModel[189].rotateAngleZ = -2.32128791F;

		milwclassaModel[190].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 7.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 7.5F, 0F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 192
		milwclassaModel[190].setRotationPoint(-75.5F, 3.5F, -9F);

		milwclassaModel[191].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 193
		milwclassaModel[191].setRotationPoint(-75.3F, 1.8F, 7.5F);

		milwclassaModel[192].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 195
		milwclassaModel[192].setRotationPoint(-9F, -17F, 2F);

		milwclassaModel[193].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 197
		milwclassaModel[193].setRotationPoint(-9F, -17F, -3F);

		milwclassaModel[194].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 198
		milwclassaModel[194].setRotationPoint(-6F, -19F, 4F);

		milwclassaModel[195].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		milwclassaModel[195].setRotationPoint(-5.5F, -14F, 5F);

		milwclassaModel[196].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 200
		milwclassaModel[196].setRotationPoint(-71F, -1F, -7F);

		milwclassaModel[197].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 201
		milwclassaModel[197].setRotationPoint(-71F, -1F, 6F);

		milwclassaModel[198].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 202
		milwclassaModel[198].setRotationPoint(-71F, -1F, 6F);

		milwclassaModel[199].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 6F, -1F, -1F, 2F, -2F, -1F, 2F, 2F, 0F, 6F, 1F); // Box 200
		milwclassaModel[199].setRotationPoint(-86F, -3F, 8F);

		milwclassaModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.8F, -1F, 0.2F, 0F, -1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 1F, 0.4F, 1.4F, 1F, -0.8F); // Box 201
		milwclassaModel[200].setRotationPoint(-85F, -3F, 9F);

		fixRotation(milwclassaModel, false, true, true);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 201; i++)
		{
			if(milwclassaModel[i].boxName!= null && milwclassaModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				milwclassaModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				milwclassaModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo milwclassaModel[];
}