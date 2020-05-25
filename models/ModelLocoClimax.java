//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: Larky2k
// Created on:01.09.2017 - 15:21:02
// Last changed on: 01.09.2017 - 15:21:02

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelLocoClimax extends ModelBase
{
    int textureX = 512;
    int textureY = 256;

    public ModelLocoClimax()
    {
        lococlimaxModel = new ModelRendererTurbo[303];
        lococlimaxModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        lococlimaxModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        lococlimaxModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        lococlimaxModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        lococlimaxModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
        lococlimaxModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
        lococlimaxModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
        lococlimaxModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
        lococlimaxModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
        lococlimaxModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
        lococlimaxModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 10
        lococlimaxModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
        lococlimaxModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
        lococlimaxModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 13
        lococlimaxModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 14
        lococlimaxModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
        lococlimaxModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 16
        lococlimaxModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
        lococlimaxModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
        lococlimaxModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
        lococlimaxModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 20
        lococlimaxModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
        lococlimaxModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
        lococlimaxModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 23
        lococlimaxModel[24] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 24
        lococlimaxModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 25
        lococlimaxModel[26] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26
        lococlimaxModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
        lococlimaxModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
        lococlimaxModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 29
        lococlimaxModel[30] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 30
        lococlimaxModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 31
        lococlimaxModel[32] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 32
        lococlimaxModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
        lococlimaxModel[34] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 34
        lococlimaxModel[35] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 35
        lococlimaxModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 36
        lococlimaxModel[37] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 37
        lococlimaxModel[38] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 38
        lococlimaxModel[39] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 39
        lococlimaxModel[40] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 40
        lococlimaxModel[41] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 41
        lococlimaxModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 42
        lococlimaxModel[43] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 43
        lococlimaxModel[44] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 44
        lococlimaxModel[45] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 45
        lococlimaxModel[46] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 46
        lococlimaxModel[47] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 47
        lococlimaxModel[48] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 48
        lococlimaxModel[49] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 49
        lococlimaxModel[50] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 50
        lococlimaxModel[51] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 51
        lococlimaxModel[52] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 52
        lococlimaxModel[53] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 53
        lococlimaxModel[54] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 54
        lococlimaxModel[55] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 55
        lococlimaxModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
        lococlimaxModel[57] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 57
        lococlimaxModel[58] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 58
        lococlimaxModel[59] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 60
        lococlimaxModel[60] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
        lococlimaxModel[61] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 62
        lococlimaxModel[62] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 63
        lococlimaxModel[63] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 63
        lococlimaxModel[64] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 64
        lococlimaxModel[65] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 65
        lococlimaxModel[66] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 66
        lococlimaxModel[67] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 68
        lococlimaxModel[68] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 69
        lococlimaxModel[69] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 70
        lococlimaxModel[70] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 71
        lococlimaxModel[71] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 73
        lococlimaxModel[72] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 74
        lococlimaxModel[73] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 75
        lococlimaxModel[74] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 76
        lococlimaxModel[75] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 77
        lococlimaxModel[76] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 78
        lococlimaxModel[77] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 79
        lococlimaxModel[78] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 80
        lococlimaxModel[79] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 81
        lococlimaxModel[80] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 82
        lococlimaxModel[81] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 83
        lococlimaxModel[82] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 84
        lococlimaxModel[83] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 85
        lococlimaxModel[84] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 86
        lococlimaxModel[85] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 87
        lococlimaxModel[86] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 88
        lococlimaxModel[87] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 89
        lococlimaxModel[88] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 90
        lococlimaxModel[89] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 91
        lococlimaxModel[90] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 92
        lococlimaxModel[91] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 93
        lococlimaxModel[92] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 94
        lococlimaxModel[93] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 95
        lococlimaxModel[94] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 96
        lococlimaxModel[95] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 97
        lococlimaxModel[96] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
        lococlimaxModel[97] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 99
        lococlimaxModel[98] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 100
        lococlimaxModel[99] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 101
        lococlimaxModel[100] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 102
        lococlimaxModel[101] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 103
        lococlimaxModel[102] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 104
        lococlimaxModel[103] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 105
        lococlimaxModel[104] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 106
        lococlimaxModel[105] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
        lococlimaxModel[106] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 108
        lococlimaxModel[107] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 109
        lococlimaxModel[108] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 110
        lococlimaxModel[109] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 111
        lococlimaxModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 112
        lococlimaxModel[111] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 113
        lococlimaxModel[112] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 114
        lococlimaxModel[113] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 115
        lococlimaxModel[114] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 116
        lococlimaxModel[115] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 117
        lococlimaxModel[116] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 119
        lococlimaxModel[117] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 120
        lococlimaxModel[118] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 121
        lococlimaxModel[119] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 122
        lococlimaxModel[120] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 123
        lococlimaxModel[121] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 124
        lococlimaxModel[122] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 125
        lococlimaxModel[123] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 126
        lococlimaxModel[124] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 127
        lococlimaxModel[125] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 128
        lococlimaxModel[126] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 129
        lococlimaxModel[127] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 130
        lococlimaxModel[128] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 131
        lococlimaxModel[129] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 132
        lococlimaxModel[130] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 133
        lococlimaxModel[131] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 134
        lococlimaxModel[132] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 135
        lococlimaxModel[133] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 136
        lococlimaxModel[134] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 137
        lococlimaxModel[135] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 138
        lococlimaxModel[136] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 139
        lococlimaxModel[137] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 140
        lococlimaxModel[138] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 141
        lococlimaxModel[139] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 142
        lococlimaxModel[140] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 143
        lococlimaxModel[141] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 144
        lococlimaxModel[142] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 145
        lococlimaxModel[143] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 146
        lococlimaxModel[144] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 147
        lococlimaxModel[145] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 148
        lococlimaxModel[146] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 149
        lococlimaxModel[147] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 150
        lococlimaxModel[148] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 151
        lococlimaxModel[149] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 152
        lococlimaxModel[150] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 153
        lococlimaxModel[151] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 154
        lococlimaxModel[152] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 155
        lococlimaxModel[153] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 156
        lococlimaxModel[154] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 157
        lococlimaxModel[155] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 158
        lococlimaxModel[156] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 159
        lococlimaxModel[157] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 160
        lococlimaxModel[158] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 161
        lococlimaxModel[159] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 162
        lococlimaxModel[160] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 163
        lococlimaxModel[161] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 163
        lococlimaxModel[162] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 163
        lococlimaxModel[163] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 164
        lococlimaxModel[164] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 165
        lococlimaxModel[165] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 166
        lococlimaxModel[166] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 167
        lococlimaxModel[167] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 168
        lococlimaxModel[168] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 169
        lococlimaxModel[169] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 170
        lococlimaxModel[170] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 171
        lococlimaxModel[171] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 172
        lococlimaxModel[172] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 173
        lococlimaxModel[173] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 174
        lococlimaxModel[174] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 175
        lococlimaxModel[175] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 176
        lococlimaxModel[176] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 177
        lococlimaxModel[177] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 178
        lococlimaxModel[178] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 179
        lococlimaxModel[179] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 180
        lococlimaxModel[180] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 181
        lococlimaxModel[181] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 182
        lococlimaxModel[182] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 183
        lococlimaxModel[183] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 184
        lococlimaxModel[184] = new ModelRendererTurbo(this, 207, 65, textureX, textureY); // Box 185
        lococlimaxModel[185] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 186
        lococlimaxModel[186] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 187
        lococlimaxModel[187] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 188
        lococlimaxModel[188] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 189
        lococlimaxModel[189] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 190
        lococlimaxModel[190] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 191
        lococlimaxModel[191] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 192
        lococlimaxModel[192] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 193
        lococlimaxModel[193] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 194
        lococlimaxModel[194] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 195
        lococlimaxModel[195] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 196
        lococlimaxModel[196] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 197
        lococlimaxModel[197] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 199
        lococlimaxModel[198] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 199
        lococlimaxModel[199] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 200
        lococlimaxModel[200] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 201
        lococlimaxModel[201] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 202
        lococlimaxModel[202] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 203
        lococlimaxModel[203] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 204
        lococlimaxModel[204] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 205
        lococlimaxModel[205] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 206
        lococlimaxModel[206] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 207
        lococlimaxModel[207] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 208
        lococlimaxModel[208] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 209
        lococlimaxModel[209] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 210
        lococlimaxModel[210] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 211
        lococlimaxModel[211] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 212
        lococlimaxModel[212] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 213
        lococlimaxModel[213] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 214
        lococlimaxModel[214] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 215
        lococlimaxModel[215] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 216
        lococlimaxModel[216] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 217
        lococlimaxModel[217] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 218
        lococlimaxModel[218] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 219
        lococlimaxModel[219] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 220
        lococlimaxModel[220] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 221
        lococlimaxModel[221] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 222
        lococlimaxModel[222] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 223
        lococlimaxModel[223] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 224
        lococlimaxModel[224] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 225
        lococlimaxModel[225] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 226
        lococlimaxModel[226] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 227
        lococlimaxModel[227] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 228
        lococlimaxModel[228] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 229
        lococlimaxModel[229] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 230
        lococlimaxModel[230] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 231
        lococlimaxModel[231] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 232
        lococlimaxModel[232] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 233
        lococlimaxModel[233] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 234
        lococlimaxModel[234] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 235
        lococlimaxModel[235] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 236
        lococlimaxModel[236] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 237
        lococlimaxModel[237] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 238
        lococlimaxModel[238] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 239
        lococlimaxModel[239] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 240
        lococlimaxModel[240] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 241
        lococlimaxModel[241] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 242
        lococlimaxModel[242] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 243
        lococlimaxModel[243] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 244
        lococlimaxModel[244] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 245
        lococlimaxModel[245] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 246
        lococlimaxModel[246] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 247
        lococlimaxModel[247] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 248
        lococlimaxModel[248] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 249
        lococlimaxModel[249] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 251
        lococlimaxModel[250] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 252
        lococlimaxModel[251] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 253
        lococlimaxModel[252] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 252
        lococlimaxModel[253] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 253
        lococlimaxModel[254] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 254
        lococlimaxModel[255] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 255
        lococlimaxModel[256] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 256
        lococlimaxModel[257] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 257
        lococlimaxModel[258] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 258
        lococlimaxModel[259] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 259
        lococlimaxModel[260] = new ModelRendererTurbo(this, 32, 131, textureX, textureY); // Box 260
        lococlimaxModel[261] = new ModelRendererTurbo(this, 28, 131, textureX, textureY); // Box 261
        lococlimaxModel[262] = new ModelRendererTurbo(this, 29, 128, textureX, textureY); // Box 262
        lococlimaxModel[263] = new ModelRendererTurbo(this, 36, 131, textureX, textureY); // Box 263
        lococlimaxModel[264] = new ModelRendererTurbo(this, 28, 123, textureX, textureY); // Box 264
        lococlimaxModel[265] = new ModelRendererTurbo(this, 29, 135, textureX, textureY); // Box 265
        lococlimaxModel[266] = new ModelRendererTurbo(this, 37, 136, textureX, textureY); // Box 266
        lococlimaxModel[267] = new ModelRendererTurbo(this, 33, 128, textureX, textureY); // Box 267
        lococlimaxModel[268] = new ModelRendererTurbo(this, 38, 128, textureX, textureY); // Box 268
        lococlimaxModel[269] = new ModelRendererTurbo(this, 39, 133, textureX, textureY); // Box 269
        lococlimaxModel[270] = new ModelRendererTurbo(this, 37, 124, textureX, textureY); // Box 270
        lococlimaxModel[271] = new ModelRendererTurbo(this, 32, 131, textureX, textureY); // Box 271
        lococlimaxModel[272] = new ModelRendererTurbo(this, 32, 131, textureX, textureY); // Box 272
        lococlimaxModel[273] = new ModelRendererTurbo(this, 32, 131, textureX, textureY); // Box 273
        lococlimaxModel[274] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 274
        lococlimaxModel[275] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 275
        lococlimaxModel[276] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 276
        lococlimaxModel[277] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 277
        lococlimaxModel[278] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 278
        lococlimaxModel[279] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 279
        lococlimaxModel[280] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 280
        lococlimaxModel[281] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 281
        lococlimaxModel[282] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 282
        lococlimaxModel[283] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 283
        lococlimaxModel[284] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 284
        lococlimaxModel[285] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 285
        lococlimaxModel[286] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 286
        lococlimaxModel[287] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 287
        lococlimaxModel[288] = new ModelRendererTurbo(this, 30, 127, textureX, textureY); // Box 288
        lococlimaxModel[289] = new ModelRendererTurbo(this, 36, 126, textureX, textureY); // Box 289
        lococlimaxModel[290] = new ModelRendererTurbo(this, 36, 134, textureX, textureY); // Box 290
        lococlimaxModel[291] = new ModelRendererTurbo(this, 40, 135, textureX, textureY); // Box 291
        lococlimaxModel[292] = new ModelRendererTurbo(this, 40, 137, textureX, textureY); // Box 292
        lococlimaxModel[293] = new ModelRendererTurbo(this, 33, 135, textureX, textureY); // Box 293
        lococlimaxModel[294] = new ModelRendererTurbo(this, 28, 136, textureX, textureY); // Box 294
        lococlimaxModel[295] = new ModelRendererTurbo(this, 40, 126, textureX, textureY); // Box 295
        lococlimaxModel[296] = new ModelRendererTurbo(this, 40, 123, textureX, textureY); // Box 296
        lococlimaxModel[297] = new ModelRendererTurbo(this, 32, 123, textureX, textureY); // Box 297
        lococlimaxModel[298] = new ModelRendererTurbo(this, 28, 125, textureX, textureY); // Box 298
        lococlimaxModel[299] = new ModelRendererTurbo(this, 28, 123, textureX, textureY); // Box 299
        lococlimaxModel[300] = new ModelRendererTurbo(this, 37, 123, textureX, textureY); // Box 300
        lococlimaxModel[301] = new ModelRendererTurbo(this, 40, 131, textureX, textureY); // Box 301
        lococlimaxModel[302] = new ModelRendererTurbo(this, 28, 133, textureX, textureY); // Box 302

        lococlimaxModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        lococlimaxModel[0].setRotationPoint(-49F, 5F, -6F);

        lococlimaxModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        lococlimaxModel[1].setRotationPoint(-49F, 5F, 6F);

        lococlimaxModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
        lococlimaxModel[2].setRotationPoint(-39F, 5F, 6F);

        lococlimaxModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
        lococlimaxModel[3].setRotationPoint(-39F, 5F, -6F);

        lococlimaxModel[4].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 4
        lococlimaxModel[4].setRotationPoint(-48F, 6F, -7F);

        lococlimaxModel[5].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 5
        lococlimaxModel[5].setRotationPoint(-38F, 6F, -7F);

        lococlimaxModel[6].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 6
        lococlimaxModel[6].setRotationPoint(-48F, 9F, -7F);

        lococlimaxModel[7].addBox(0F, 0F, 0F, 17, 0, 1, 0F); // Box 7
        lococlimaxModel[7].setRotationPoint(-50F, 6F, -7F);

        lococlimaxModel[8].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 8
        lococlimaxModel[8].setRotationPoint(-50F, 6F, -7F);
        lococlimaxModel[8].rotateAngleZ = 0.83775804F;

        lococlimaxModel[9].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 9
        lococlimaxModel[9].setRotationPoint(-33F, 6F, -7F);
        lococlimaxModel[9].rotateAngleZ = 2.30383461F;

        lococlimaxModel[10].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 10
        lococlimaxModel[10].setRotationPoint(-43F, 5F, -7F);

        lococlimaxModel[11].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 11
        lococlimaxModel[11].setRotationPoint(-48F, 6F, 6F);

        lococlimaxModel[12].addBox(0F, 0F, 0F, 17, 0, 1, 0F); // Box 12
        lococlimaxModel[12].setRotationPoint(-50F, 6F, 6F);

        lococlimaxModel[13].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 13
        lococlimaxModel[13].setRotationPoint(-50F, 6F, 6F);
        lococlimaxModel[13].rotateAngleZ = 0.83775804F;

        lococlimaxModel[14].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 14
        lococlimaxModel[14].setRotationPoint(-48F, 9F, 6F);

        lococlimaxModel[15].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 15
        lococlimaxModel[15].setRotationPoint(-43F, 5F, 6F);

        lococlimaxModel[16].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 16
        lococlimaxModel[16].setRotationPoint(-38F, 6F, 6F);

        lococlimaxModel[17].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 17
        lococlimaxModel[17].setRotationPoint(-33F, 6F, 6F);
        lococlimaxModel[17].rotateAngleZ = 2.30383461F;

        lococlimaxModel[18].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 18
        lococlimaxModel[18].setRotationPoint(-47F, 7F, -6F);

        lococlimaxModel[19].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 19
        lococlimaxModel[19].setRotationPoint(-37F, 7F, -6F);

        lococlimaxModel[20].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 20
        lococlimaxModel[20].setRotationPoint(-48F, 6F, -1F);

        lococlimaxModel[21].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 21
        lococlimaxModel[21].setRotationPoint(-38F, 6F, -1F);

        lococlimaxModel[22].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 22
        lococlimaxModel[22].setRotationPoint(-46F, 7F, 0F);

        lococlimaxModel[23].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 23
        lococlimaxModel[23].setRotationPoint(-43F, 5F, -6F);

        lococlimaxModel[24].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24
        lococlimaxModel[24].setRotationPoint(-42F, 4F, -1F);

        lococlimaxModel[25].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
        lococlimaxModel[25].setRotationPoint(2F, 5F, -6F);

        lococlimaxModel[26].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 26
        lococlimaxModel[26].setRotationPoint(2F, 5F, 6F);

        lococlimaxModel[27].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
        lococlimaxModel[27].setRotationPoint(12F, 5F, 6F);

        lococlimaxModel[28].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 28
        lococlimaxModel[28].setRotationPoint(12F, 5F, -6F);

        lococlimaxModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 29
        lococlimaxModel[29].setRotationPoint(3F, 6F, -7F);

        lococlimaxModel[30].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 30
        lococlimaxModel[30].setRotationPoint(13F, 6F, -7F);

        lococlimaxModel[31].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 31
        lococlimaxModel[31].setRotationPoint(3F, 9F, -7F);

        lococlimaxModel[32].addBox(0F, 0F, 0F, 17, 0, 1, 0F); // Box 32
        lococlimaxModel[32].setRotationPoint(1F, 6F, -7F);

        lococlimaxModel[33].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 33
        lococlimaxModel[33].setRotationPoint(1F, 6F, -7F);
        lococlimaxModel[33].rotateAngleZ = 0.83775804F;

        lococlimaxModel[34].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 34
        lococlimaxModel[34].setRotationPoint(18F, 6F, -7F);
        lococlimaxModel[34].rotateAngleZ = 2.30383461F;

        lococlimaxModel[35].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 35
        lococlimaxModel[35].setRotationPoint(8F, 5F, -7F);

        lococlimaxModel[36].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 36
        lococlimaxModel[36].setRotationPoint(3F, 6F, 6F);

        lococlimaxModel[37].addBox(0F, 0F, 0F, 17, 0, 1, 0F); // Box 37
        lococlimaxModel[37].setRotationPoint(1F, 6F, 6F);

        lococlimaxModel[38].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 38
        lococlimaxModel[38].setRotationPoint(1F, 6F, 6F);
        lococlimaxModel[38].rotateAngleZ = 0.83775804F;

        lococlimaxModel[39].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 39
        lococlimaxModel[39].setRotationPoint(3F, 9F, 6F);

        lococlimaxModel[40].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 40
        lococlimaxModel[40].setRotationPoint(8F, 5F, 6F);

        lococlimaxModel[41].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 41
        lococlimaxModel[41].setRotationPoint(13F, 6F, 6F);

        lococlimaxModel[42].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 42
        lococlimaxModel[42].setRotationPoint(18F, 6F, 6F);
        lococlimaxModel[42].rotateAngleZ = 2.30383461F;

        lococlimaxModel[43].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 43
        lococlimaxModel[43].setRotationPoint(4F, 7F, -6F);

        lococlimaxModel[44].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 44
        lococlimaxModel[44].setRotationPoint(14F, 7F, -6F);

        lococlimaxModel[45].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 45
        lococlimaxModel[45].setRotationPoint(3F, 6F, -1F);

        lococlimaxModel[46].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 46
        lococlimaxModel[46].setRotationPoint(13F, 6F, -1F);

        lococlimaxModel[47].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 47
        lococlimaxModel[47].setRotationPoint(5F, 7F, 0F);

        lococlimaxModel[48].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 48
        lococlimaxModel[48].setRotationPoint(8F, 5F, -6F);

        lococlimaxModel[49].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 49
        lococlimaxModel[49].setRotationPoint(9F, 4F, -1F);

        lococlimaxModel[50].addBox(0F, 0F, 0F, 22, 1, 22, 0F); // Box 50
        lococlimaxModel[50].setRotationPoint(-51F, 3F, -11F);

        lococlimaxModel[51].addBox(0F, 0F, 0F, 0, 6, 22, 0F); // Box 51
        lococlimaxModel[51].setRotationPoint(-51F, 3F, -11F);

        lococlimaxModel[52].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 52
        lococlimaxModel[52].setRotationPoint(-48F, 0F, -10F);

        lococlimaxModel[53].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 53
        lococlimaxModel[53].setRotationPoint(-48F, 0F, 7F);

        lococlimaxModel[54].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 54
        lococlimaxModel[54].setRotationPoint(-42F, 0F, -3F);

        lococlimaxModel[55].addBox(0F, 0F, 0F, 17, 1, 16, 0F); // Box 55
        lococlimaxModel[55].setRotationPoint(-29F, 3F, -8F);

        lococlimaxModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        lococlimaxModel[56].setRotationPoint(-48F, -1F, 7F);

        lococlimaxModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        lococlimaxModel[57].setRotationPoint(-48F, -1F, -10F);

        lococlimaxModel[58].addBox(0F, 0F, 0F, 5, 5, 16, 0F); // Box 58
        lococlimaxModel[58].setRotationPoint(-19F, 4F, -8F);

        lococlimaxModel[59].addBox(0F, 0F, 0F, 38, 1, 1, 0F); // Box 60
        lococlimaxModel[59].setRotationPoint(-35F, 7F, 0F);

        lococlimaxModel[60].addBox(0F, 0F, 0F, 32, 1, 22, 0F); // Box 61
        lococlimaxModel[60].setRotationPoint(-12F, 3F, -11F);

        lococlimaxModel[61].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 62
        lococlimaxModel[61].setRotationPoint(-53F, 8F, -11F);

        lococlimaxModel[62].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 63
        lococlimaxModel[62].setRotationPoint(-53F, 3F, -1.5F);

        lococlimaxModel[63].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 63
        lococlimaxModel[63].setRotationPoint(20F, 8F, -11F);

        lococlimaxModel[64].addBox(0F, 0F, 0F, 0, 6, 22, 0F); // Box 64
        lococlimaxModel[64].setRotationPoint(20F, 3F, -11F);

        lococlimaxModel[65].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 65
        lococlimaxModel[65].setRotationPoint(19F, 3F, -1.5F);

        lococlimaxModel[66].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 66
        lococlimaxModel[66].setRotationPoint(-42F, -3F, -3F);

        lococlimaxModel[67].addBox(0F, 0F, 0F, 36, 6, 6, 0F); // Box 68
        lococlimaxModel[67].setRotationPoint(-42F, -9F, -3F);

        lococlimaxModel[68].addBox(0F, 0F, 0F, 36, 6, 3, 0F); // Box 69
        lococlimaxModel[68].setRotationPoint(-42F, -9F, -6F);

        lococlimaxModel[69].addBox(0F, 0F, 0F, 36, 6, 3, 0F); // Box 70
        lococlimaxModel[69].setRotationPoint(-42F, -9F, 3F);

        lococlimaxModel[70].addBox(0F, 0F, 0F, 36, 3, 6, 0F); // Box 71
        lococlimaxModel[70].setRotationPoint(-42F, -12F, -3F);

        lococlimaxModel[71].addShapeBox(0F, 0F, 0F, 36, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        lococlimaxModel[71].setRotationPoint(-42F, -12F, 3F);

        lococlimaxModel[72].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 74
        lococlimaxModel[72].setRotationPoint(-42F, -3F, 3F);

        lococlimaxModel[73].addShapeBox(0F, 0F, 0F, 26, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        lococlimaxModel[73].setRotationPoint(-42F, -3F, -6F);

        lococlimaxModel[74].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 76
        lococlimaxModel[74].setRotationPoint(-43F, -4F, -2F);

        lococlimaxModel[75].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 77
        lococlimaxModel[75].setRotationPoint(-43F, -10F, -2F);

        lococlimaxModel[76].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 78
        lococlimaxModel[76].setRotationPoint(-43F, -8F, -2F);

        lococlimaxModel[77].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 79
        lococlimaxModel[77].setRotationPoint(-43F, -8F, -4F);

        lococlimaxModel[78].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 80
        lococlimaxModel[78].setRotationPoint(-43F, -8F, 2F);

        lococlimaxModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        lococlimaxModel[79].setRotationPoint(-43F, -10F, 2F);

        lococlimaxModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        lococlimaxModel[80].setRotationPoint(-43F, -10F, -4F);

        lococlimaxModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        lococlimaxModel[81].setRotationPoint(-43F, -4F, -4F);

        lococlimaxModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 84
        lococlimaxModel[82].setRotationPoint(-43F, -4F, 2F);

        lococlimaxModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 85
        lococlimaxModel[83].setRotationPoint(-43.5F, -7F, -1F);

        lococlimaxModel[84].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 86
        lococlimaxModel[84].setRotationPoint(-45F, -16F, -2F);

        lococlimaxModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        lococlimaxModel[85].setRotationPoint(-42F, -13F, -1F);

        lococlimaxModel[86].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 88
        lococlimaxModel[86].setRotationPoint(-44F, -17F, -1F);

        lococlimaxModel[87].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 89
        lococlimaxModel[87].setRotationPoint(-37F, -26F, -1F);

        lococlimaxModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        lococlimaxModel[88].setRotationPoint(-38F, -13F, -1F);

        lococlimaxModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        lococlimaxModel[89].setRotationPoint(-35F, -13F, -1F);

        lococlimaxModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        lococlimaxModel[90].setRotationPoint(-37F, -13F, -2F);

        lococlimaxModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        lococlimaxModel[91].setRotationPoint(-37F, -13F, 1F);

        lococlimaxModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
        lococlimaxModel[92].setRotationPoint(-38F, -13F, 1F);

        lococlimaxModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        lococlimaxModel[93].setRotationPoint(-38F, -13F, -2F);

        lococlimaxModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        lococlimaxModel[94].setRotationPoint(-35F, -13F, -2F);

        lococlimaxModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 97
        lococlimaxModel[95].setRotationPoint(-35F, -13F, 1F);

        lococlimaxModel[96].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 98
        lococlimaxModel[96].setRotationPoint(-38F, -26F, -1F);

        lococlimaxModel[97].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 99
        lococlimaxModel[97].setRotationPoint(-35F, -26F, -1F);

        lococlimaxModel[98].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
        lococlimaxModel[98].setRotationPoint(-37F, -26F, 1F);

        lococlimaxModel[99].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        lococlimaxModel[99].setRotationPoint(-37F, -26F, -2F);

        lococlimaxModel[100].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 102
        lococlimaxModel[100].setRotationPoint(-35F, -26F, 1F);

        lococlimaxModel[101].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 103
        lococlimaxModel[101].setRotationPoint(-38F, -26F, 1F);

        lococlimaxModel[102].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 104
        lococlimaxModel[102].setRotationPoint(-38F, -26F, -2F);

        lococlimaxModel[103].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
        lococlimaxModel[103].setRotationPoint(-35F, -26F, -2F);

        lococlimaxModel[104].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 106
        lococlimaxModel[104].setRotationPoint(-30F, -17F, -1F);

        lococlimaxModel[105].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 107
        lococlimaxModel[105].setRotationPoint(-30F, -16F, -2F);

        lococlimaxModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        lococlimaxModel[106].setRotationPoint(-30F, -14F, -3F);

        lococlimaxModel[107].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 109
        lococlimaxModel[107].setRotationPoint(-30F, -16F, 1F);

        lococlimaxModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        lococlimaxModel[108].setRotationPoint(-30F, -14F, 2F);

        lococlimaxModel[109].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 111
        lococlimaxModel[109].setRotationPoint(-31F, -16F, -1F);

        lococlimaxModel[110].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 112
        lococlimaxModel[110].setRotationPoint(-28F, -16F, -1F);

        lococlimaxModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        lococlimaxModel[111].setRotationPoint(-32F, -14F, -1F);

        lococlimaxModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        lococlimaxModel[112].setRotationPoint(-31F, -16F, -2F);

        lococlimaxModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        lococlimaxModel[113].setRotationPoint(-28F, -16F, -2F);

        lococlimaxModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 116
        lococlimaxModel[114].setRotationPoint(-28F, -16F, 1F);

        lococlimaxModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 117
        lococlimaxModel[115].setRotationPoint(-31F, -16F, 1F);

        lococlimaxModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        lococlimaxModel[116].setRotationPoint(-32F, -14F, -3F);

        lococlimaxModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        lococlimaxModel[117].setRotationPoint(-27F, -14F, -1F);

        lococlimaxModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        lococlimaxModel[118].setRotationPoint(-28F, -14F, -3F);

        lococlimaxModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 122
        lococlimaxModel[119].setRotationPoint(-28F, -14F, 1F);

        lococlimaxModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 123
        lococlimaxModel[120].setRotationPoint(-32F, -14F, 1F);

        lococlimaxModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        lococlimaxModel[121].setRotationPoint(-31F, -17F, -2F);

        lococlimaxModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        lococlimaxModel[122].setRotationPoint(-28F, -17F, -2F);

        lococlimaxModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 126
        lococlimaxModel[123].setRotationPoint(-28F, -17F, 1F);

        lococlimaxModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 127
        lococlimaxModel[124].setRotationPoint(-31F, -17F, 1F);

        lococlimaxModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        lococlimaxModel[125].setRotationPoint(-30F, -17F, -2F);

        lococlimaxModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        lococlimaxModel[126].setRotationPoint(-30F, -17F, 1F);

        lococlimaxModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        lococlimaxModel[127].setRotationPoint(-31F, -17F, -1F);

        lococlimaxModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        lococlimaxModel[128].setRotationPoint(-28F, -17F, -1F);

        lococlimaxModel[129].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 132
        lococlimaxModel[129].setRotationPoint(-22F, -18F, -1F);

        lococlimaxModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        lococlimaxModel[130].setRotationPoint(-23F, -17F, -2F);

        lococlimaxModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        lococlimaxModel[131].setRotationPoint(-22F, -18F, -2F);

        lococlimaxModel[132].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 135
        lococlimaxModel[132].setRotationPoint(-22F, -17F, -2F);

        lococlimaxModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        lococlimaxModel[133].setRotationPoint(-23F, -18F, -2F);

        lococlimaxModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        lococlimaxModel[134].setRotationPoint(-20F, -17F, -2F);

        lococlimaxModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        lococlimaxModel[135].setRotationPoint(-22F, -14F, -3F);

        lococlimaxModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        lococlimaxModel[136].setRotationPoint(-24F, -14F, -3F);

        lococlimaxModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        lococlimaxModel[137].setRotationPoint(-20F, -14F, -3F);

        lococlimaxModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        lococlimaxModel[138].setRotationPoint(-19F, -14F, -1F);

        lococlimaxModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 142
        lococlimaxModel[139].setRotationPoint(-20F, -14F, 1F);

        lococlimaxModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 143
        lococlimaxModel[140].setRotationPoint(-20F, -17F, 1F);

        lococlimaxModel[141].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 144
        lococlimaxModel[141].setRotationPoint(-20F, -17F, -1F);

        lococlimaxModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        lococlimaxModel[142].setRotationPoint(-22F, -18F, 1F);

        lococlimaxModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 146
        lococlimaxModel[143].setRotationPoint(-20F, -18F, 1F);

        lococlimaxModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        lococlimaxModel[144].setRotationPoint(-20F, -18F, -1F);

        lococlimaxModel[145].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 148
        lococlimaxModel[145].setRotationPoint(-22F, -17F, 1F);

        lococlimaxModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        lococlimaxModel[146].setRotationPoint(-22F, -14F, 2F);

        lococlimaxModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 150
        lococlimaxModel[147].setRotationPoint(-24F, -14F, 1F);

        lococlimaxModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 151
        lococlimaxModel[148].setRotationPoint(-23F, -17F, 1F);

        lococlimaxModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 152
        lococlimaxModel[149].setRotationPoint(-23F, -18F, 1F);

        lococlimaxModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        lococlimaxModel[150].setRotationPoint(-23F, -18F, -1F);

        lococlimaxModel[151].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 154
        lococlimaxModel[151].setRotationPoint(-23F, -17F, -1F);

        lococlimaxModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        lococlimaxModel[152].setRotationPoint(-24F, -14F, -1F);

        lococlimaxModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        lococlimaxModel[153].setRotationPoint(-20F, -18F, -2F);

        lococlimaxModel[154].addBox(0F, 0F, 0F, 10, 9, 12, 0F); // Box 157
        lococlimaxModel[154].setRotationPoint(-16F, -3F, -6F);

        lococlimaxModel[155].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 158
        lococlimaxModel[155].setRotationPoint(-12F, -3F, -11F);

        lococlimaxModel[156].addBox(0F, 0F, 0F, 18, 0, 5, 0F); // Box 159
        lococlimaxModel[156].setRotationPoint(-30F, -3F, -11F);

        lococlimaxModel[157].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 160
        lococlimaxModel[157].setRotationPoint(-12F, -19F, -10F);

        lococlimaxModel[158].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 161
        lococlimaxModel[158].setRotationPoint(-12F, -14F, -7F);

        lococlimaxModel[159].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 162
        lococlimaxModel[159].setRotationPoint(-12F, -22F, -11F);

        lococlimaxModel[160].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // Box 163
        lococlimaxModel[160].setRotationPoint(-11F, -9F, -11F);

        lococlimaxModel[161].addShapeBox(0F, 0F, 0F, 36, 3, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        lococlimaxModel[161].setRotationPoint(-42F, -12F, -6F);

        lococlimaxModel[162].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 163
        lococlimaxModel[162].setRotationPoint(-38.75F, -6F, -7F);

        lococlimaxModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 164
        lococlimaxModel[163].setRotationPoint(-49F, 2F, -7F);

        lococlimaxModel[164].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 165
        lococlimaxModel[164].setRotationPoint(-49F, 2F, -7F);
        lococlimaxModel[164].rotateAngleZ = -0.66322512F;

        lococlimaxModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 166
        lococlimaxModel[165].setRotationPoint(-38.75F, -6F, 6F);

        lococlimaxModel[166].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 167
        lococlimaxModel[166].setRotationPoint(-49F, 2F, 6F);
        lococlimaxModel[166].rotateAngleZ = -0.66322512F;

        lococlimaxModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 168
        lococlimaxModel[167].setRotationPoint(-49F, 2F, 6F);

        lococlimaxModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
        lococlimaxModel[168].setRotationPoint(-50.25F, 2F, -7.25F);

        lococlimaxModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
        lococlimaxModel[169].setRotationPoint(-50.25F, 2F, -6.75F);

        lococlimaxModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
        lococlimaxModel[170].setRotationPoint(-50.25F, 2F, 5.75F);

        lococlimaxModel[171].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 172
        lococlimaxModel[171].setRotationPoint(-37F, -6F, -11F);
        lococlimaxModel[171].rotateAngleZ = 0.43633231F;

        lococlimaxModel[172].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 173
        lococlimaxModel[172].setRotationPoint(-37F, -6F, -11F);
        lococlimaxModel[172].rotateAngleZ = 0.43633231F;

        lococlimaxModel[173].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 174
        lococlimaxModel[173].setRotationPoint(-18F, 4F, -9F);

        lococlimaxModel[174].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 175
        lococlimaxModel[174].setRotationPoint(-18F, 8F, -9F);

        lococlimaxModel[175].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 176
        lococlimaxModel[175].setRotationPoint(-18F, 5F, -9F);

        lococlimaxModel[176].addBox(0F, 0F, 2F, 1, 3, 1, 0F); // Box 177
        lococlimaxModel[176].setRotationPoint(-19F, 5F, -11F);

        lococlimaxModel[177].addBox(0F, 0F, 2F, 1, 3, 1, 0F); // Box 178
        lococlimaxModel[177].setRotationPoint(-15F, 5F, -11F);

        lococlimaxModel[178].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 179
        lococlimaxModel[178].setRotationPoint(-34F, -3.5F, -10F);
        lococlimaxModel[178].rotateAngleZ = 0.43633231F;

        lococlimaxModel[179].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 180
        lococlimaxModel[179].setRotationPoint(-18F, 5F, 8F);

        lococlimaxModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
        lococlimaxModel[180].setRotationPoint(-18F, 8F, 8F);

        lococlimaxModel[181].addBox(0F, 0F, 2F, 1, 3, 1, 0F); // Box 182
        lococlimaxModel[181].setRotationPoint(-19F, 5F, 6F);

        lococlimaxModel[182].addBox(0F, 0F, 2F, 1, 3, 1, 0F); // Box 183
        lococlimaxModel[182].setRotationPoint(-15F, 5F, 6F);

        lococlimaxModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
        lococlimaxModel[183].setRotationPoint(-18F, 4F, 8F);

        lococlimaxModel[184].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 185
        lococlimaxModel[184].setRotationPoint(-34F, -3.5F, 9F);
        lococlimaxModel[184].rotateAngleZ = 0.52359878F;

        lococlimaxModel[185].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 186
        lococlimaxModel[185].setRotationPoint(-37F, -6F, 8F);
        lococlimaxModel[185].rotateAngleZ = 0.43633231F;

        lococlimaxModel[186].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 187
        lococlimaxModel[186].setRotationPoint(-37F, -6F, 6F);
        lococlimaxModel[186].rotateAngleZ = 0.43633231F;

        lococlimaxModel[187].addBox(0F, 0F, 0F, 13, 12, 1, 0F); // Box 188
        lococlimaxModel[187].setRotationPoint(7F, -9F, -11F);

        lococlimaxModel[188].addBox(0F, 0F, 0F, 13, 12, 1, 0F); // Box 189
        lococlimaxModel[188].setRotationPoint(7F, -9F, 10F);

        lococlimaxModel[189].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 190
        lococlimaxModel[189].setRotationPoint(19F, -9F, -10F);

        lococlimaxModel[190].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
        lococlimaxModel[190].setRotationPoint(7F, -11F, -12F);

        lococlimaxModel[191].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 192
        lococlimaxModel[191].setRotationPoint(7F, -11F, 10F);

        lococlimaxModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
        lococlimaxModel[192].setRotationPoint(19F, -11F, -10F);

        lococlimaxModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 194
        lococlimaxModel[193].setRotationPoint(19F, -11F, -12F);

        lococlimaxModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 195
        lococlimaxModel[194].setRotationPoint(19F, -11F, 10F);

        lococlimaxModel[195].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 196
        lococlimaxModel[195].setRotationPoint(7F, -11F, 3F);

        lococlimaxModel[196].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 197
        lococlimaxModel[196].setRotationPoint(7F, -11F, -10F);

        lococlimaxModel[197].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // Box 199
        lococlimaxModel[197].setRotationPoint(-11F, -9F, 10F);

        lococlimaxModel[198].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 199
        lococlimaxModel[198].setRotationPoint(0F, -22F, -11F);

        lococlimaxModel[199].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        lococlimaxModel[199].setRotationPoint(-13F, -24F, -11F);

        lococlimaxModel[200].addBox(0F, 0F, 0F, 18, 0, 5, 0F); // Box 201
        lococlimaxModel[200].setRotationPoint(-30F, -3F, 6F);

        lococlimaxModel[201].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 202
        lococlimaxModel[201].setRotationPoint(-12F, -14F, 4F);

        lococlimaxModel[202].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 203
        lococlimaxModel[202].setRotationPoint(-12F, -19F, 7F);

        lococlimaxModel[203].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 204
        lococlimaxModel[203].setRotationPoint(-12F, -3F, 6F);

        lococlimaxModel[204].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 205
        lococlimaxModel[204].setRotationPoint(-12F, -22F, 10F);

        lococlimaxModel[205].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 206
        lococlimaxModel[205].setRotationPoint(-12F, -14F, -4F);

        lococlimaxModel[206].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 207
        lococlimaxModel[206].setRotationPoint(-12F, -19F, 6F);

        lococlimaxModel[207].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 208
        lococlimaxModel[207].setRotationPoint(-12F, -19F, -7F);

        lococlimaxModel[208].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 209
        lococlimaxModel[208].setRotationPoint(-12F, -22F, -10F);

        lococlimaxModel[209].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 210
        lococlimaxModel[209].setRotationPoint(-12F, -19F, -1F);

        lococlimaxModel[210].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
        lococlimaxModel[210].setRotationPoint(-13F, -24F, 9F);

        lococlimaxModel[211].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 212
        lococlimaxModel[211].setRotationPoint(0F, -22F, 10F);

        lococlimaxModel[212].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
        lococlimaxModel[212].setRotationPoint(-13F, -25F, 6F);

        lococlimaxModel[213].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        lococlimaxModel[213].setRotationPoint(-13F, -25F, -9F);

        lococlimaxModel[214].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        lococlimaxModel[214].setRotationPoint(-13F, -26F, -6F);

        lococlimaxModel[215].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        lococlimaxModel[215].setRotationPoint(-13F, -26F, 1F);

        lococlimaxModel[216].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 217
        lococlimaxModel[216].setRotationPoint(-13F, -26F, -1F);

        lococlimaxModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
        lococlimaxModel[217].setRotationPoint(-12F, -24F, -9F);

        lococlimaxModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        lococlimaxModel[218].setRotationPoint(-12F, -25F, -6F);

        lococlimaxModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 220
        lococlimaxModel[219].setRotationPoint(7F, -24F, -9F);

        lococlimaxModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
        lococlimaxModel[220].setRotationPoint(7F, -24F, 6F);

        lococlimaxModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        lococlimaxModel[221].setRotationPoint(7F, -25F, 1F);

        lococlimaxModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 223
        lococlimaxModel[222].setRotationPoint(7F, -25F, -6F);

        lococlimaxModel[223].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // Box 224
        lococlimaxModel[223].setRotationPoint(-11F, -22F, -11F);

        lococlimaxModel[224].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // Box 225
        lococlimaxModel[224].setRotationPoint(-11F, -22F, 10F);

        lococlimaxModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 226
        lococlimaxModel[225].setRotationPoint(-13F, -24F, -9F);

        lococlimaxModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 227
        lococlimaxModel[226].setRotationPoint(-13F, -25F, -6F);

        lococlimaxModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        lococlimaxModel[227].setRotationPoint(-13F, -25F, 1F);

        lococlimaxModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        lococlimaxModel[228].setRotationPoint(-13F, -24F, 6F);

        lococlimaxModel[229].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 230
        lococlimaxModel[229].setRotationPoint(-11F, -20F, -11F);

        lococlimaxModel[230].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 231
        lococlimaxModel[230].setRotationPoint(-11F, -20F, 11F);

        lococlimaxModel[231].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 232
        lococlimaxModel[231].setRotationPoint(-21.6F, -8F, -7F);

        lococlimaxModel[232].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 233
        lococlimaxModel[232].setRotationPoint(-31F, -5.2F, -7F);

        lococlimaxModel[233].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 234
        lococlimaxModel[233].setRotationPoint(-25.6F, -5F, -7F);
        lococlimaxModel[233].rotateAngleZ = -0.64577182F;

        lococlimaxModel[234].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 235
        lococlimaxModel[234].setRotationPoint(-16F, -19F, -0.5F);

        lococlimaxModel[235].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 236
        lococlimaxModel[235].setRotationPoint(-19F, -16F, -0.5F);

        lococlimaxModel[236].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // Box 237
        lococlimaxModel[236].setRotationPoint(-10F, -25F, -1F);

        lococlimaxModel[237].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 238
        lococlimaxModel[237].setRotationPoint(-16F, -13F, -3F);

        lococlimaxModel[238].addFlexTrapezoid(0F, 0F, 1F, 1, 1, 4, 0F, 0.00F, 0.00F, 1.00F, 1.00F, 1.00F, 1.00F, ModelRendererTurbo.MR_TOP); // Box 239
        lococlimaxModel[238].setRotationPoint(-16F, -13F, 3F);
        lococlimaxModel[238].rotateAngleX = -0.78539816F;

        lococlimaxModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 240
        lococlimaxModel[239].setRotationPoint(-16F, -9F, 6F);

        lococlimaxModel[240].addFlexTrapezoid(0F, 0F, 1F, 1, 1, 4, 0F, 0.00F, 0.00F, 1.00F, 1.00F, 1.00F, 1.00F, ModelRendererTurbo.MR_TOP); // Box 241
        lococlimaxModel[240].setRotationPoint(-15F, -13F, -3F);
        lococlimaxModel[240].rotateAngleX = -0.78539816F;
        lococlimaxModel[240].rotateAngleY = 3.14159265F;

        lococlimaxModel[241].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
        lococlimaxModel[241].setRotationPoint(-16F, -9F, -7F);

        lococlimaxModel[242].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 243
        lococlimaxModel[242].setRotationPoint(-12F, -19F, -6F);

        lococlimaxModel[243].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 244
        lococlimaxModel[243].setRotationPoint(-12F, -19F, 1F);

        lococlimaxModel[244].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 245
        lococlimaxModel[244].setRotationPoint(20F, -15F, -2F);

        lococlimaxModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
        lococlimaxModel[245].setRotationPoint(19F, -12F, -1F);

        lococlimaxModel[246].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 247
        lococlimaxModel[246].setRotationPoint(21F, -16F, -1F);

        lococlimaxModel[247].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 248
        lococlimaxModel[247].setRotationPoint(-26.6F, -8F, 6F);

        lococlimaxModel[248].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 249
        lococlimaxModel[248].setRotationPoint(-36.5999999999999F, -6F, 6F);

        lococlimaxModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        lococlimaxModel[249].setRotationPoint(-27.6F, -8F, 6F);

        lococlimaxModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
        lococlimaxModel[250].setRotationPoint(-27.6F, -6F, 6F);

        lococlimaxModel[251].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 253
        lococlimaxModel[251].setRotationPoint(-27.6F, -7F, 6F);

        lococlimaxModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 252
        lococlimaxModel[252].setRotationPoint(1F, -22F, -11F);

        lococlimaxModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 253
        lococlimaxModel[253].setRotationPoint(1F, -22F, 10F);

        lococlimaxModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 254
        lococlimaxModel[254].setRotationPoint(0F, -22F, -10F);

        lococlimaxModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
        lococlimaxModel[255].setRotationPoint(0F, -22F, 9F);

        lococlimaxModel[256].addBox(0F, 0F, 0F, 11, 11, 7, 0F); // Box 256
        lococlimaxModel[256].setRotationPoint(8F, -8F, 3F);

        lococlimaxModel[257].addBox(0F, 0F, 0F, 11, 11, 7, 0F); // Box 257
        lococlimaxModel[257].setRotationPoint(8F, -8F, -10F);

        lococlimaxModel[258].addBox(0F, 0F, 0F, 9, 11, 7, 0F); // Box 258
        lococlimaxModel[258].setRotationPoint(10F, -8F, -3F);

        lococlimaxModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 259
        lococlimaxModel[259].setRotationPoint(12F, -9F, 0F);

        lococlimaxModel[260].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 260
        lococlimaxModel[260].setRotationPoint(12F, -9F, -5F);

        lococlimaxModel[261].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 261
        lococlimaxModel[261].setRotationPoint(17F, -9F, 6F);

        lococlimaxModel[262].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 262
        lococlimaxModel[262].setRotationPoint(11F, -9F, 5F);

        lococlimaxModel[263].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 263
        lococlimaxModel[263].setRotationPoint(15F, -9F, 8F);

        lococlimaxModel[264].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 264
        lococlimaxModel[264].setRotationPoint(13F, -9F, -1F);

        lococlimaxModel[265].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 265
        lococlimaxModel[265].setRotationPoint(8F, -9F, -10F);

        lococlimaxModel[266].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 266
        lococlimaxModel[266].setRotationPoint(8F, -10F, -9F);

        lococlimaxModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 267
        lococlimaxModel[267].setRotationPoint(8F, -10F, -10F);

        lococlimaxModel[268].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 268
        lococlimaxModel[268].setRotationPoint(9F, -10F, -10F);

        lococlimaxModel[269].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 269
        lococlimaxModel[269].setRotationPoint(14F, -10F, 0F);

        lococlimaxModel[270].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 270
        lococlimaxModel[270].setRotationPoint(14F, -9F, 2F);

        lococlimaxModel[271].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 271
        lococlimaxModel[271].setRotationPoint(17F, -9F, -8F);

        lococlimaxModel[272].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 272
        lococlimaxModel[272].setRotationPoint(16F, -9F, -5F);

        lococlimaxModel[273].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 273
        lococlimaxModel[273].setRotationPoint(14F, -9F, -2F);

        lococlimaxModel[274].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
        lococlimaxModel[274].setRotationPoint(14F, -9F, 5F);

        lococlimaxModel[275].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 275
        lococlimaxModel[275].setRotationPoint(9F, -9F, 8F);

        lococlimaxModel[276].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 276
        lococlimaxModel[276].setRotationPoint(6F, 2F, 2F);

        lococlimaxModel[277].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
        lococlimaxModel[277].setRotationPoint(4F, 2F, 1F);

        lococlimaxModel[278].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 278
        lococlimaxModel[278].setRotationPoint(9F, 2F, 2F);

        lococlimaxModel[279].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 279
        lococlimaxModel[279].setRotationPoint(8F, 2F, 2F);

        lococlimaxModel[280].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 280
        lococlimaxModel[280].setRotationPoint(9F, 2F, 1F);

        lococlimaxModel[281].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 281
        lococlimaxModel[281].setRotationPoint(9F, 1F, 2F);

        lococlimaxModel[282].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 282
        lococlimaxModel[282].setRotationPoint(9F, 1F, -3F);

        lococlimaxModel[283].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 283
        lococlimaxModel[283].setRotationPoint(8F, 2F, -3F);

        lococlimaxModel[284].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 284
        lococlimaxModel[284].setRotationPoint(9F, 2F, -3F);

        lococlimaxModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 285
        lococlimaxModel[285].setRotationPoint(9F, 2F, -2F);

        lococlimaxModel[286].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 286
        lococlimaxModel[286].setRotationPoint(8F, 2F, -1F);

        lococlimaxModel[287].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
        lococlimaxModel[287].setRotationPoint(6F, 2F, -2F);

        lococlimaxModel[288].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 288
        lococlimaxModel[288].setRotationPoint(5F, 2F, -1F);

        lococlimaxModel[289].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 289
        lococlimaxModel[289].setRotationPoint(5F, 2F, -2F);

        lococlimaxModel[290].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 290
        lococlimaxModel[290].setRotationPoint(4F, 2F, -3F);

        lococlimaxModel[291].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 291
        lococlimaxModel[291].setRotationPoint(9F, -3F, -3F);

        lococlimaxModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
        lococlimaxModel[292].setRotationPoint(9F, -1F, 1F);

        lococlimaxModel[293].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
        lococlimaxModel[293].setRotationPoint(9F, -5F, 2F);

        lococlimaxModel[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 294
        lococlimaxModel[294].setRotationPoint(9F, -4F, -2F);

        lococlimaxModel[295].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 295
        lococlimaxModel[295].setRotationPoint(9F, -7F, -3F);

        lococlimaxModel[296].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 296
        lococlimaxModel[296].setRotationPoint(9F, -6F, 0F);

        lococlimaxModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297
        lococlimaxModel[297].setRotationPoint(9F, 0F, -1F);

        lococlimaxModel[298].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 298
        lococlimaxModel[298].setRotationPoint(9F, 2F, -1F);

        lococlimaxModel[299].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 299
        lococlimaxModel[299].setRotationPoint(9F, 2F, 0F);

        lococlimaxModel[300].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
        lococlimaxModel[300].setRotationPoint(7F, 2F, 0F);

        lococlimaxModel[301].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301
        lococlimaxModel[301].setRotationPoint(5F, 1F, -2F);

        lococlimaxModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
        lococlimaxModel[302].setRotationPoint(6F, 2F, -4F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 303; i++)
        {
            lococlimaxModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo lococlimaxModel[];
}