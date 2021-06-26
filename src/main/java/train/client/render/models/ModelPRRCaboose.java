
package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+
// Model: PRR_N5c
// Model Creator: Mr. Rail
// Created on:20.08.2017 - 10:25:49
// Last changed on: 20.08.2017 - 10:25:49

public class ModelPRRCaboose extends ModelBase
{
    private ModelBettendorf_Trucks fronttrucks = new ModelBettendorf_Trucks();
    private ModelBettendorf_Trucks backtrucks = new ModelBettendorf_Trucks();
    int textureX = 512;
    int textureY = 256;

    public ModelPRRCaboose()
    {
		prrcabooseModel = new ModelRendererTurbo[153];
		prrcabooseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		prrcabooseModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		prrcabooseModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 38
		prrcabooseModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 39
		prrcabooseModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 40
		prrcabooseModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
		prrcabooseModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 43
		prrcabooseModel[7] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 44
		prrcabooseModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		prrcabooseModel[9] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 51
		prrcabooseModel[10] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 52
		prrcabooseModel[11] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 53
		prrcabooseModel[12] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 54
		prrcabooseModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 55
		prrcabooseModel[14] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 56
		prrcabooseModel[15] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 57
		prrcabooseModel[16] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 58
		prrcabooseModel[17] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 59
		prrcabooseModel[18] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 60
		prrcabooseModel[19] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 70
		prrcabooseModel[20] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 71
		prrcabooseModel[21] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 72
		prrcabooseModel[22] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 73
		prrcabooseModel[23] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 77
		prrcabooseModel[24] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 80
		prrcabooseModel[25] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 81
		prrcabooseModel[26] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 82
		prrcabooseModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 83
		prrcabooseModel[28] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 101
		prrcabooseModel[29] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 102
		prrcabooseModel[30] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 103
		prrcabooseModel[31] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 105
		prrcabooseModel[32] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 130
		prrcabooseModel[33] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 110
		prrcabooseModel[34] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 111
		prrcabooseModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 112
		prrcabooseModel[36] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 113
		prrcabooseModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 114
		prrcabooseModel[38] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 115
		prrcabooseModel[39] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 116
		prrcabooseModel[40] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 117
		prrcabooseModel[41] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 118
		prrcabooseModel[42] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 120
		prrcabooseModel[43] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 122
		prrcabooseModel[44] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 46
		prrcabooseModel[45] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 47
		prrcabooseModel[46] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 48
		prrcabooseModel[47] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 49
		prrcabooseModel[48] = new ModelRendererTurbo(this, 382, 125, textureX, textureY); // Box 50
		prrcabooseModel[49] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Box 53
		prrcabooseModel[50] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 56
		prrcabooseModel[51] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 57
		prrcabooseModel[52] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 58
		prrcabooseModel[53] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 59
		prrcabooseModel[54] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 60
		prrcabooseModel[55] = new ModelRendererTurbo(this, 420, 125, textureX, textureY); // Box 64
		prrcabooseModel[56] = new ModelRendererTurbo(this, 401, 127, textureX, textureY); // Box 66
		prrcabooseModel[57] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 67
		prrcabooseModel[58] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 68
		prrcabooseModel[59] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 69
		prrcabooseModel[60] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 70
		prrcabooseModel[61] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 71
		prrcabooseModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 72
		prrcabooseModel[63] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 73
		prrcabooseModel[64] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 74
		prrcabooseModel[65] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75
		prrcabooseModel[66] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 76
		prrcabooseModel[67] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 77
		prrcabooseModel[68] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 78
		prrcabooseModel[69] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 79
		prrcabooseModel[70] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 80
		prrcabooseModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 81
		prrcabooseModel[72] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 82
		prrcabooseModel[73] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 83
		prrcabooseModel[74] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 84
		prrcabooseModel[75] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 85
		prrcabooseModel[76] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 86
		prrcabooseModel[77] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 87
		prrcabooseModel[78] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 88
		prrcabooseModel[79] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 89
		prrcabooseModel[80] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 90
		prrcabooseModel[81] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 91
		prrcabooseModel[82] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 92
		prrcabooseModel[83] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 93
		prrcabooseModel[84] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 94
		prrcabooseModel[85] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 95
		prrcabooseModel[86] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 96
		prrcabooseModel[87] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 97
		prrcabooseModel[88] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 98
		prrcabooseModel[89] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 99
		prrcabooseModel[90] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 100
		prrcabooseModel[91] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 101
		prrcabooseModel[92] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 102
		prrcabooseModel[93] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 103
		prrcabooseModel[94] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 151
		prrcabooseModel[95] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 152
		prrcabooseModel[96] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 153
		prrcabooseModel[97] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 154
		prrcabooseModel[98] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 155
		prrcabooseModel[99] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 156
		prrcabooseModel[100] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 157
		prrcabooseModel[101] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 158
		prrcabooseModel[102] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 159
		prrcabooseModel[103] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 160
		prrcabooseModel[104] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 161
		prrcabooseModel[105] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 162
		prrcabooseModel[106] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 163
		prrcabooseModel[107] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 164
		prrcabooseModel[108] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 165
		prrcabooseModel[109] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 166
		prrcabooseModel[110] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 167
		prrcabooseModel[111] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 168
		prrcabooseModel[112] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 169
		prrcabooseModel[113] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 170
		prrcabooseModel[114] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 171
		prrcabooseModel[115] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 172
		prrcabooseModel[116] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 173
		prrcabooseModel[117] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 174
		prrcabooseModel[118] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 175
		prrcabooseModel[119] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 176
		prrcabooseModel[120] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 177
		prrcabooseModel[121] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box
																							 // 178
		prrcabooseModel[122] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box
																							 // 179
		prrcabooseModel[123] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 180
		prrcabooseModel[124] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 181
		prrcabooseModel[125] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 182
		prrcabooseModel[126] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 183
		prrcabooseModel[127] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box
																							 // 184
		prrcabooseModel[128] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box
																							 // 185
		prrcabooseModel[129] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box
																							 // 186
		prrcabooseModel[130] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 187
		prrcabooseModel[131] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 188
		prrcabooseModel[132] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 189
		prrcabooseModel[133] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 190
		prrcabooseModel[134] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 191
		prrcabooseModel[135] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 192
		prrcabooseModel[136] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 193
		prrcabooseModel[137] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 194
		prrcabooseModel[138] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 195
		prrcabooseModel[139] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 196
		prrcabooseModel[140] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 197
		prrcabooseModel[141] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 198
		prrcabooseModel[142] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 199
		prrcabooseModel[143] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box
																							 // 197
		prrcabooseModel[144] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box
																							 // 198
		prrcabooseModel[145] = new ModelRendererTurbo(this, 359, 115, textureX, textureY); // Box
																							 // 199
		prrcabooseModel[146] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box
																							 // 200
		prrcabooseModel[147] = new ModelRendererTurbo(this, 373, 115, textureX, textureY); // Box
																							 // 201
		prrcabooseModel[148] = new ModelRendererTurbo(this, 380, 113, textureX, textureY); // Box
																							 // 202
		prrcabooseModel[149] = new ModelRendererTurbo(this, 373, 109, textureX, textureY); // Box
																							 // 208
		prrcabooseModel[150] = new ModelRendererTurbo(this, 359, 109, textureX, textureY); // Box
																							 // 209
		prrcabooseModel[151] = new ModelRendererTurbo(this, 380, 109, textureX, textureY); // Box
																							 // 210
		prrcabooseModel[152] = new ModelRendererTurbo(this, 380, 111, textureX, textureY); // Box
																							 // 211

		prrcabooseModel[0].addBox(0F, 0F, 0F, 68, 1, 19, 0F); // Box 2
		prrcabooseModel[0].setRotationPoint(-34F, -6F, -9.5F);

		prrcabooseModel[1].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		prrcabooseModel[1].setRotationPoint(-27F, -21F, -10.5F);

		prrcabooseModel[2].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		prrcabooseModel[2].setRotationPoint(-27F, -21F, 9.5F);

		prrcabooseModel[3].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
		prrcabooseModel[3].setRotationPoint(26F, -21F, 9.5F);

		prrcabooseModel[4].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		prrcabooseModel[4].setRotationPoint(26F, -21F, -10.5F);

		prrcabooseModel[5].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F,
				0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 41
		prrcabooseModel[5].setRotationPoint(-33F, -20.5F, -11F);

		prrcabooseModel[6].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		prrcabooseModel[6].setRotationPoint(-34F, -21.5F, -11F);

		prrcabooseModel[7].addShapeBox(0F, 0F, 0F, 22, 1, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		prrcabooseModel[7].setRotationPoint(-34F, -23.5F, -8F);

		prrcabooseModel[8].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		prrcabooseModel[8].setRotationPoint(-34F, -22.5F, -10F);

		prrcabooseModel[9].addShapeBox(0F, 0F, 0F, 22, 1, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		prrcabooseModel[9].setRotationPoint(12F, -23.5F, -8F);

		prrcabooseModel[10].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		prrcabooseModel[10].setRotationPoint(12F, -22.5F, -10F);

		prrcabooseModel[11].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		prrcabooseModel[11].setRotationPoint(-34F, -22.5F, 8F);

		prrcabooseModel[12].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 54
		prrcabooseModel[12].setRotationPoint(-34F, -21.5F, 10F);

		prrcabooseModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F,
				0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 55
		prrcabooseModel[13].setRotationPoint(-33F, -20.5F, 10F);

		prrcabooseModel[14].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		prrcabooseModel[14].setRotationPoint(12F, -22.5F, 8F);

		prrcabooseModel[15].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F,
				0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		prrcabooseModel[15].setRotationPoint(-13F, -28.5F, -3F);

		prrcabooseModel[16].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F,
				-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 58
		prrcabooseModel[16].setRotationPoint(10F, -28.5F, -3F);

		prrcabooseModel[17].addShapeBox(0F, 0F, 0F, 22, 1, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		prrcabooseModel[17].setRotationPoint(-11F, -28.5F, -8F);

		prrcabooseModel[18].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		prrcabooseModel[18].setRotationPoint(-11F, -27.5F, -9F);

		prrcabooseModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F,
				0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 70
		prrcabooseModel[19].setRotationPoint(-13F, -26.5F, -10F);

		prrcabooseModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F,
				-2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 71
		prrcabooseModel[20].setRotationPoint(9F, -26.5F, -10F);

		prrcabooseModel[21].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F,
				-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		prrcabooseModel[21].setRotationPoint(-13F, -26.5F, 9F);

		prrcabooseModel[22].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		prrcabooseModel[22].setRotationPoint(-11F, -27.5F, 8F);

		prrcabooseModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F,
				-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 77
		prrcabooseModel[23].setRotationPoint(9F, -26.5F, 9F);

		prrcabooseModel[24].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, -2F, -1F, -1F,
				0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 80
		prrcabooseModel[24].setRotationPoint(-13F, -27.5F, 8F);

		prrcabooseModel[25].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, -1F, -1F, -1F,
				-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 81
		prrcabooseModel[25].setRotationPoint(10F, -27.5F, 8F);

		prrcabooseModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, -1F, -1F, -1F, -2F, -1F, -1F, -2F, 0F, 0F, -1F, 0F, 0F,
				-2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 82
		prrcabooseModel[26].setRotationPoint(10F, -27.5F, -10F);

		prrcabooseModel[27].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, -2F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, -2F, 0F, 0F,
				0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 83
		prrcabooseModel[27].setRotationPoint(-13F, -27.5F, -10F);

		prrcabooseModel[28].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		prrcabooseModel[28].setRotationPoint(-27F, -22.5F, -9.5F);

		prrcabooseModel[29].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 102
		prrcabooseModel[29].setRotationPoint(-27.25F, -19.5F, 2F);

		prrcabooseModel[30].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 103
		prrcabooseModel[30].setRotationPoint(-27.25F, -19.5F, -3F);

		prrcabooseModel[31].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 105
		prrcabooseModel[31].setRotationPoint(-27.25F, -19.5F, -2F);

		prrcabooseModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		prrcabooseModel[32].setRotationPoint(27F, -22.5F, -9.5F);

		prrcabooseModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		prrcabooseModel[33].setRotationPoint(-3.5F, -26.5F, 9F);

		prrcabooseModel[34].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		prrcabooseModel[34].setRotationPoint(-3.5F, -26.5F, -10F);

		prrcabooseModel[35].addShapeBox(0F, 0F, 0F, 104, 30, 0, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F,
				-7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F); // Box 112
		prrcabooseModel[35].setRotationPoint(-52F, -27.5F, 10.5F);

		prrcabooseModel[36].addShapeBox(0F, 0F, 0F, 104, 30, 0, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F,
				-7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F, -26F, -7F, 0F); // Box 113
		prrcabooseModel[36].setRotationPoint(-52F, -27.5F, -10.5F);

		prrcabooseModel[37].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 114
		prrcabooseModel[37].setRotationPoint(-11F, -26.5F, -9F);

		prrcabooseModel[38].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 115
		prrcabooseModel[38].setRotationPoint(-11F, -26.5F, 8F);

		prrcabooseModel[39].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 116
		prrcabooseModel[39].setRotationPoint(26.25F, -19.5F, -3F);

		prrcabooseModel[40].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 117
		prrcabooseModel[40].setRotationPoint(26.25F, -19.5F, 2F);

		prrcabooseModel[41].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 118
		prrcabooseModel[41].setRotationPoint(26.25F, -19.5F, -2F);

		prrcabooseModel[42].addShapeBox(0F, 0F, 0F, 0, 32, 37, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F,
				-9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F); // Box 120
		prrcabooseModel[42].setRotationPoint(-27F, -29.5F, -18.5F);

		prrcabooseModel[43].addShapeBox(0F, 0F, 0F, 0, 32, 37, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F,
				-9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, -8F, -9F); // Box 122
		prrcabooseModel[43].setRotationPoint(27F, -29.5F, -18.5F);

		prrcabooseModel[44].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 46
		prrcabooseModel[44].setRotationPoint(-33.75F, -22F, -9F);

		prrcabooseModel[45].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 47
		prrcabooseModel[45].setRotationPoint(-33.75F, -22F, 8F);

		prrcabooseModel[46].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 48
		prrcabooseModel[46].setRotationPoint(-33.75F, -22.5F, 2F);

		prrcabooseModel[47].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 49
		prrcabooseModel[47].setRotationPoint(-33.75F, -22.5F, -3F);

		prrcabooseModel[48].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 50
		prrcabooseModel[48].setRotationPoint(-33.75F, -11F, -8F);

		prrcabooseModel[49].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 53
		prrcabooseModel[49].setRotationPoint(-33.75F, -14.5F, -8F);

		prrcabooseModel[50].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 56
		prrcabooseModel[50].setRotationPoint(-34.25F, -22F, 4.5F);

		prrcabooseModel[51].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 57
		prrcabooseModel[51].setRotationPoint(32.75F, -22F, -9F);

		prrcabooseModel[52].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 58
		prrcabooseModel[52].setRotationPoint(32.75F, -22.5F, -3F);

		prrcabooseModel[53].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 59
		prrcabooseModel[53].setRotationPoint(32.75F, -22.5F, 2F);

		prrcabooseModel[54].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 60
		prrcabooseModel[54].setRotationPoint(32.75F, -22F, 8F);

		prrcabooseModel[55].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 64
		prrcabooseModel[55].setRotationPoint(32.75F, -11F, -8F);

		prrcabooseModel[56].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 66
		prrcabooseModel[56].setRotationPoint(32.75F, -14.5F, -8F);

		prrcabooseModel[57].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 67
		prrcabooseModel[57].setRotationPoint(34.75F, -22F, -8.5F);

		prrcabooseModel[58].addBox(0F, 0F, 0F, 22, 0, 4, 0F); // Box 68
		prrcabooseModel[58].setRotationPoint(13F, -24F, -2F);

		prrcabooseModel[59].addBox(0F, 0F, 0F, 22, 0, 4, 0F); // Box 69
		prrcabooseModel[59].setRotationPoint(-35F, -24F, -2F);

		prrcabooseModel[60].addShapeBox(0F, 0F, 0F, 4, 0, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 70
		prrcabooseModel[60].setRotationPoint(-33F, -24F, 2F);

		prrcabooseModel[61].addShapeBox(0F, 0F, 0F, 4, 0, 9, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		prrcabooseModel[61].setRotationPoint(29F, -24F, -11F);

		prrcabooseModel[62].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 72
		prrcabooseModel[62].setRotationPoint(-32F, -5F, -8.5F);

		prrcabooseModel[63].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 73
		prrcabooseModel[63].setRotationPoint(-32F, -3F, -9.5F);

		prrcabooseModel[64].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 74
		prrcabooseModel[64].setRotationPoint(-32F, -5F, -9.5F);

		prrcabooseModel[65].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 75
		prrcabooseModel[65].setRotationPoint(-29F, -5F, -9.5F);

		prrcabooseModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		prrcabooseModel[66].setRotationPoint(-33F, -3F, -8.5F);

		prrcabooseModel[67].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 77
		prrcabooseModel[67].setRotationPoint(-29F, -3F, -9.5F);

		prrcabooseModel[68].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 78
		prrcabooseModel[68].setRotationPoint(-32F, -3F, -9.5F);

		prrcabooseModel[69].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 79
		prrcabooseModel[69].setRotationPoint(-33F, -1F, -10F);

		prrcabooseModel[70].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 80
		prrcabooseModel[70].setRotationPoint(-32F, -5F, 8.5F);

		prrcabooseModel[71].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 81
		prrcabooseModel[71].setRotationPoint(-32F, -5F, 8.5F);

		prrcabooseModel[72].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 82
		prrcabooseModel[72].setRotationPoint(-29F, -5F, 8.5F);

		prrcabooseModel[73].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 83
		prrcabooseModel[73].setRotationPoint(-32F, -3F, 8.5F);

		prrcabooseModel[74].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		prrcabooseModel[74].setRotationPoint(-33F, -3F, 8.5F);

		prrcabooseModel[75].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 85
		prrcabooseModel[75].setRotationPoint(-32F, -3F, 8.5F);

		prrcabooseModel[76].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		prrcabooseModel[76].setRotationPoint(-29F, -3F, 8.5F);

		prrcabooseModel[77].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 87
		prrcabooseModel[77].setRotationPoint(-33F, -1F, 8F);

		prrcabooseModel[78].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 88
		prrcabooseModel[78].setRotationPoint(29F, -5F, -8.5F);

		prrcabooseModel[79].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 89
		prrcabooseModel[79].setRotationPoint(29F, -5F, -9.5F);

		prrcabooseModel[80].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 90
		prrcabooseModel[80].setRotationPoint(32F, -5F, -9.5F);

		prrcabooseModel[81].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 91
		prrcabooseModel[81].setRotationPoint(29F, -3F, -9.5F);

		prrcabooseModel[82].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		prrcabooseModel[82].setRotationPoint(28F, -3F, -8.5F);

		prrcabooseModel[83].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 93
		prrcabooseModel[83].setRotationPoint(29F, -3F, -9.5F);

		prrcabooseModel[84].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 94
		prrcabooseModel[84].setRotationPoint(32F, -3F, -9.5F);

		prrcabooseModel[85].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 95
		prrcabooseModel[85].setRotationPoint(28F, -1F, -10F);

		prrcabooseModel[86].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 96
		prrcabooseModel[86].setRotationPoint(28F, -1F, 8F);

		prrcabooseModel[87].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 97
		prrcabooseModel[87].setRotationPoint(32F, -3F, 8.5F);

		prrcabooseModel[88].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 98
		prrcabooseModel[88].setRotationPoint(32F, -5F, 8.5F);

		prrcabooseModel[89].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		prrcabooseModel[89].setRotationPoint(28F, -3F, 8.5F);

		prrcabooseModel[90].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 100
		prrcabooseModel[90].setRotationPoint(29F, -5F, 8.5F);

		prrcabooseModel[91].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 101
		prrcabooseModel[91].setRotationPoint(29F, -3F, 8.5F);

		prrcabooseModel[92].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 102
		prrcabooseModel[92].setRotationPoint(29F, -3F, 8.5F);

		prrcabooseModel[93].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 103
		prrcabooseModel[93].setRotationPoint(29F, -5F, 8.5F);

		prrcabooseModel[94].addBox(0F, 0F, 0F, 68, 2, 3, 0F); // Box 151
		prrcabooseModel[94].setRotationPoint(-34F, -5F, -1.5F);

		prrcabooseModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 152
		prrcabooseModel[95].setRotationPoint(-23F, -4.5F, 1.5F);

		prrcabooseModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		prrcabooseModel[96].setRotationPoint(-23F, -4.5F, -10.5F);

		prrcabooseModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		prrcabooseModel[97].setRotationPoint(20F, -4.5F, -10.5F);

		prrcabooseModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 155
		prrcabooseModel[98].setRotationPoint(20F, -4.5F, 1.5F);

		prrcabooseModel[99].addBox(0F, 0F, 0F, 52, 0, 21, 0F); // Box 156
		prrcabooseModel[99].setRotationPoint(-26F, -4.5F, -10.5F);

		prrcabooseModel[100].addBox(0F, 0F, 0F, 0, 1, 21, 0F); // Box 157
		prrcabooseModel[100].setRotationPoint(-26F, -5.5F, -10.5F);

		prrcabooseModel[101].addBox(0F, 0F, 0F, 0, 1, 21, 0F); // Box 158
		prrcabooseModel[101].setRotationPoint(26F, -5.5F, -10.5F);

		prrcabooseModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		prrcabooseModel[102].setRotationPoint(8F, -4.5F, -10.5F);

		prrcabooseModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		prrcabooseModel[103].setRotationPoint(-10F, -4.5F, -10.5F);

		prrcabooseModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 161
		prrcabooseModel[104].setRotationPoint(-10F, -4.5F, 1.5F);

		prrcabooseModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 162
		prrcabooseModel[105].setRotationPoint(8F, -4.5F, 1.5F);

		prrcabooseModel[106].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 163
		prrcabooseModel[106].setRotationPoint(-7F, -3.5F, -6.5F);

		prrcabooseModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		prrcabooseModel[107].setRotationPoint(-7F, -4.5F, -6.5F);

		prrcabooseModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 165
		prrcabooseModel[108].setRotationPoint(-7F, -2.5F, -6.5F);

		prrcabooseModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 166
		prrcabooseModel[109].setRotationPoint(-4F, -2.5F, -6.5F);

		prrcabooseModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 167
		prrcabooseModel[110].setRotationPoint(-4F, -4.5F, -6.5F);

		prrcabooseModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 168
		prrcabooseModel[111].setRotationPoint(-4F, -3.5F, -6.5F);

		prrcabooseModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		prrcabooseModel[112].setRotationPoint(2F, -4.5F, -9.5F);

		prrcabooseModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		prrcabooseModel[113].setRotationPoint(2F, -2.5F, -9.5F);

		prrcabooseModel[114].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 171
		prrcabooseModel[114].setRotationPoint(2F, -3.5F, -9.5F);

		prrcabooseModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 172
		prrcabooseModel[115].setRotationPoint(4F, -2F, -10F);

		prrcabooseModel[116].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 173
		prrcabooseModel[116].setRotationPoint(4F, -5F, -10F);

		prrcabooseModel[117].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 174
		prrcabooseModel[117].setRotationPoint(-3F, -5F, 6F);

		prrcabooseModel[118].addBox(0F, 0F, 0F, 72, 2, 2, 0F); // Box 175
		prrcabooseModel[118].setRotationPoint(-36F, -5.5F, -1F);

		prrcabooseModel[119].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F,
				0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 1F, 0F); // Box 176
		prrcabooseModel[119].setRotationPoint(-13F, -28.5F, 3F);

		prrcabooseModel[120].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F,
				0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 177
		prrcabooseModel[120].setRotationPoint(-13F, -28.5F, -8F);

		prrcabooseModel[121].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F,
				-3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 178
		prrcabooseModel[121].setRotationPoint(10F, -28.5F, -8F);

		prrcabooseModel[122].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F,
				-3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F); // Box 179
		prrcabooseModel[122].setRotationPoint(10F, -28.5F, 3F);

		prrcabooseModel[123].addShapeBox(0F, 0F, 0F, 22, 5, 0, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		prrcabooseModel[123].setRotationPoint(-11F, -26.5F, -9.5F);

		prrcabooseModel[124].addShapeBox(0F, 0F, 0F, 22, 5, 0, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		prrcabooseModel[124].setRotationPoint(-11F, -26.5F, 9.5F);

		prrcabooseModel[125].addBox(0F, 0F, 0F, 21, 3, 0, 0F); // Box 182
		prrcabooseModel[125].setRotationPoint(13F, -29F, 7F);

		prrcabooseModel[126].addBox(0F, 0F, 0F, 47, 3, 0, 0F); // Box 183
		prrcabooseModel[126].setRotationPoint(-34F, -29F, -7F);

		prrcabooseModel[127].addBox(0F, 0F, 0F, 47, 0, 1, 0F); // Box 184
		prrcabooseModel[127].setRotationPoint(-34F, -28.5F, -7.5F);

		prrcabooseModel[128].addBox(0F, 0F, 0F, 21, 0, 1, 0F); // Box 185
		prrcabooseModel[128].setRotationPoint(13F, -28.5F, 6.5F);

		prrcabooseModel[129].addShapeBox(0F, 0F, 0F, 21, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 186
		prrcabooseModel[129].setRotationPoint(13F, -26F, 7F);

		prrcabooseModel[130].addShapeBox(0F, 0F, 0F, 21, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 187
		prrcabooseModel[130].setRotationPoint(13F, -26F, 7F);

		prrcabooseModel[131].addShapeBox(0F, 0F, 0F, 23, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 188
		prrcabooseModel[131].setRotationPoint(-34F, -26F, -7F);

		prrcabooseModel[132].addShapeBox(0F, 0F, 0F, 23, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 189
		prrcabooseModel[132].setRotationPoint(-34F, -26F, -7F);

		prrcabooseModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 190
		prrcabooseModel[133].setRotationPoint(-17F, -24.5F, 5.5F);

		prrcabooseModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		prrcabooseModel[134].setRotationPoint(-17F, -26.5F, 5.5F);

		prrcabooseModel[135].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 192
		prrcabooseModel[135].setRotationPoint(-17F, -25.5F, 5.5F);

		prrcabooseModel[136].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		prrcabooseModel[136].setRotationPoint(-21.5F, -25.5F, 5.5F);

		prrcabooseModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		prrcabooseModel[137].setRotationPoint(-21.5F, -26.5F, 5.5F);

		prrcabooseModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 195
		prrcabooseModel[138].setRotationPoint(-21.5F, -24.5F, 5.5F);

		prrcabooseModel[139].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 196
		prrcabooseModel[139].setRotationPoint(-20.5F, -25.5F, 5F);

		prrcabooseModel[140].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 197
		prrcabooseModel[140].setRotationPoint(-16F, -25.5F, 5F);

		prrcabooseModel[141].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 198
		prrcabooseModel[141].setRotationPoint(-16.5F, -24.5F, 6F);

		prrcabooseModel[142].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 199
		prrcabooseModel[142].setRotationPoint(-21F, -24.5F, 6F);

		prrcabooseModel[143].addBox(0F, 0F, 0F, 52, 0, 1, 0F); // Box 197
		prrcabooseModel[143].setRotationPoint(-26F, -6F, -10.5F);

		prrcabooseModel[144].addBox(0F, 0F, 0F, 52, 0, 1, 0F); // Box 198
		prrcabooseModel[144].setRotationPoint(-26F, -6F, 9.5F);

		prrcabooseModel[145].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 199
		prrcabooseModel[145].setRotationPoint(14F, -24F, -2F);

		prrcabooseModel[146].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 200
		prrcabooseModel[146].setRotationPoint(32F, -24F, -2F);

		prrcabooseModel[147].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 201
		prrcabooseModel[147].setRotationPoint(-15F, -24F, -2F);

		prrcabooseModel[148].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 202
		prrcabooseModel[148].setRotationPoint(-33F, -24F, -2F);

		prrcabooseModel[149].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 208
		prrcabooseModel[149].setRotationPoint(-24F, -24F, -2F);

		prrcabooseModel[150].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 209
		prrcabooseModel[150].setRotationPoint(23F, -24F, -2F);

		prrcabooseModel[151].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 210
		prrcabooseModel[151].setRotationPoint(-33F, -22.4F, 9F);

		prrcabooseModel[152].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 211
		prrcabooseModel[152].setRotationPoint(29F, -22.4F, -9F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 153; i++) {
            prrcabooseModel[i].render(f5);
        }

        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Bettendorf_trucks.png"));
        GL11.glPushMatrix();
		GL11.glTranslated(1.25, 0.1, 0);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
		GL11.glTranslated(-1.25, 0.1, 0);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo prrcabooseModel[];
}