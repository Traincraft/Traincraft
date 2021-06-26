package train.client.render.models;


import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelICE1 extends ModelBase
{
    int textureX = 512;
    int textureY = 256;

    public ModelICE1()
    {
        ice1Model = new ModelRendererTurbo[227];
        ice1Model[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box01
        ice1Model[1] = new ModelRendererTurbo(this, 100, 185, textureX, textureY); // Box02
        ice1Model[2] = new ModelRendererTurbo(this, 494, 2, textureX, textureY); // Box03
        ice1Model[3] = new ModelRendererTurbo(this, 326, 78, textureX, textureY); // Box04
        ice1Model[4] = new ModelRendererTurbo(this, 272, 84, textureX, textureY); // Box05
        ice1Model[5] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box06
        ice1Model[6] = new ModelRendererTurbo(this, 73, 114, textureX, textureY); // Box07
        ice1Model[7] = new ModelRendererTurbo(this, 0, 96, textureX, textureY); // Box08
        ice1Model[8] = new ModelRendererTurbo(this, 0, 94, textureX, textureY); // Box09
        ice1Model[9] = new ModelRendererTurbo(this, 279, 82, textureX, textureY); // Box10
        ice1Model[10] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Box11
        ice1Model[11] = new ModelRendererTurbo(this, 253, 90, textureX, textureY); // Box12
        ice1Model[12] = new ModelRendererTurbo(this, 253, 82, textureX, textureY); // Box13
        ice1Model[13] = new ModelRendererTurbo(this, 253, 80, textureX, textureY); // Box14
        ice1Model[14] = new ModelRendererTurbo(this, 263, 80, textureX, textureY); // Box15
        ice1Model[15] = new ModelRendererTurbo(this, 253, 78, textureX, textureY); // Box16
        ice1Model[16] = new ModelRendererTurbo(this, 263, 78, textureX, textureY); // Box17
        ice1Model[17] = new ModelRendererTurbo(this, 271, 80, textureX, textureY); // Box18
        ice1Model[18] = new ModelRendererTurbo(this, 273, 78, textureX, textureY); // Box19
        ice1Model[19] = new ModelRendererTurbo(this, 61, 130, textureX, textureY); // Box20
        ice1Model[20] = new ModelRendererTurbo(this, 283, 80, textureX, textureY); // Box21
        ice1Model[21] = new ModelRendererTurbo(this, 285, 78, textureX, textureY); // Box22
        ice1Model[22] = new ModelRendererTurbo(this, 295, 80, textureX, textureY); // Box23
        ice1Model[23] = new ModelRendererTurbo(this, 295, 78, textureX, textureY); // Box24
        ice1Model[24] = new ModelRendererTurbo(this, -2, 191, textureX, textureY); // Box25
        ice1Model[25] = new ModelRendererTurbo(this, 17, 147, textureX, textureY); // Box26
        ice1Model[26] = new ModelRendererTurbo(this, 0, 163, textureX, textureY); // Box27
        ice1Model[27] = new ModelRendererTurbo(this, 50, 163, textureX, textureY); // Box28
        ice1Model[28] = new ModelRendererTurbo(this, 67, 147, textureX, textureY); // Box29
        ice1Model[29] = new ModelRendererTurbo(this, 307, 80, textureX, textureY); // Box30
        ice1Model[30] = new ModelRendererTurbo(this, 305, 78, textureX, textureY); // Box31
        ice1Model[31] = new ModelRendererTurbo(this, 494, 38, textureX, textureY); // Box32
        ice1Model[32] = new ModelRendererTurbo(this, 496, 0, textureX, textureY); // Box33
        ice1Model[33] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box34
        ice1Model[34] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box35
        ice1Model[35] = new ModelRendererTurbo(this, 198, 170, textureX, textureY); // Box36
        ice1Model[36] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box37
        ice1Model[37] = new ModelRendererTurbo(this, 253, 90, textureX, textureY); // Box38
        ice1Model[38] = new ModelRendererTurbo(this, 253, 82, textureX, textureY); // Box39
        ice1Model[39] = new ModelRendererTurbo(this, 253, 78, textureX, textureY); // Box40
        ice1Model[40] = new ModelRendererTurbo(this, 253, 80, textureX, textureY); // Box41
        ice1Model[41] = new ModelRendererTurbo(this, 263, 78, textureX, textureY); // Box42
        ice1Model[42] = new ModelRendererTurbo(this, 263, 80, textureX, textureY); // Box43
        ice1Model[43] = new ModelRendererTurbo(this, 273, 78, textureX, textureY); // Box44
        ice1Model[44] = new ModelRendererTurbo(this, 271, 80, textureX, textureY); // Box45
        ice1Model[45] = new ModelRendererTurbo(this, 283, 80, textureX, textureY); // Box46
        ice1Model[46] = new ModelRendererTurbo(this, 285, 78, textureX, textureY); // Box47
        ice1Model[47] = new ModelRendererTurbo(this, 295, 78, textureX, textureY); // Box48
        ice1Model[48] = new ModelRendererTurbo(this, 295, 80, textureX, textureY); // Box49
        ice1Model[49] = new ModelRendererTurbo(this, 494, 0, textureX, textureY); // Box50
        ice1Model[50] = new ModelRendererTurbo(this, 502, 19, textureX, textureY); // Box51
        ice1Model[51] = new ModelRendererTurbo(this, 494, 0, textureX, textureY); // Box52
        ice1Model[52] = new ModelRendererTurbo(this, 496, 0, textureX, textureY); // Box53
        ice1Model[53] = new ModelRendererTurbo(this, 494, 19, textureX, textureY); // Box54
        ice1Model[54] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box55
        ice1Model[55] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box56
        ice1Model[56] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box57
        ice1Model[57] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box58
        ice1Model[58] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box59
        ice1Model[59] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box60
        ice1Model[60] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box61
        ice1Model[61] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box62
        ice1Model[62] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box63
        ice1Model[63] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box64
        ice1Model[64] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box65
        ice1Model[65] = new ModelRendererTurbo(this, 402, 78, textureX, textureY); // Box66
        ice1Model[66] = new ModelRendererTurbo(this, 364, 78, textureX, textureY); // Box67
        ice1Model[67] = new ModelRendererTurbo(this, 402, 89, textureX, textureY); // Box68
        ice1Model[68] = new ModelRendererTurbo(this, 315, 83, textureX, textureY); // Box69
        ice1Model[69] = new ModelRendererTurbo(this, 29, 98, textureX, textureY); // Box70
        ice1Model[70] = new ModelRendererTurbo(this, 22, 98, textureX, textureY); // Box71
        ice1Model[71] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box72
        ice1Model[72] = new ModelRendererTurbo(this, 272, 82, textureX, textureY); // Box73
        ice1Model[73] = new ModelRendererTurbo(this, 272, 90, textureX, textureY); // Box74
        ice1Model[74] = new ModelRendererTurbo(this, 256, 84, textureX, textureY); // Box75
        ice1Model[75] = new ModelRendererTurbo(this, 256, 84, textureX, textureY); // Box76
        ice1Model[76] = new ModelRendererTurbo(this, 272, 90, textureX, textureY); // Box77
        ice1Model[77] = new ModelRendererTurbo(this, 272, 86, textureX, textureY); // Box78
        ice1Model[78] = new ModelRendererTurbo(this, 272, 86, textureX, textureY); // Box79
        ice1Model[79] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box80
        ice1Model[80] = new ModelRendererTurbo(this, 272, 82, textureX, textureY); // Box81
        ice1Model[81] = new ModelRendererTurbo(this, 272, 84, textureX, textureY); // Box82
        ice1Model[82] = new ModelRendererTurbo(this, 272, 90, textureX, textureY); // Box83
        ice1Model[83] = new ModelRendererTurbo(this, 272, 86, textureX, textureY); // Box84
        ice1Model[84] = new ModelRendererTurbo(this, 272, 90, textureX, textureY); // Box85
        ice1Model[85] = new ModelRendererTurbo(this, 272, 86, textureX, textureY); // Box86
        ice1Model[86] = new ModelRendererTurbo(this, 256, 84, textureX, textureY); // Box87
        ice1Model[87] = new ModelRendererTurbo(this, 256, 84, textureX, textureY); // Box88
        ice1Model[88] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box89
        ice1Model[89] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box90
        ice1Model[90] = new ModelRendererTurbo(this, 402, 78, textureX, textureY); // Box91
        ice1Model[91] = new ModelRendererTurbo(this, 402, 78, textureX, textureY); // Box92
        ice1Model[92] = new ModelRendererTurbo(this, 264, 98, textureX, textureY); // Box93
        ice1Model[93] = new ModelRendererTurbo(this, 100, 173, textureX, textureY); // Box94
        ice1Model[94] = new ModelRendererTurbo(this, 88, 188, textureX, textureY); // Box95
        ice1Model[95] = new ModelRendererTurbo(this, 100, 179, textureX, textureY); // Box96
        ice1Model[96] = new ModelRendererTurbo(this, 100, 176, textureX, textureY); // Box97
        ice1Model[97] = new ModelRendererTurbo(this, 100, 170, textureX, textureY); // Box98
        ice1Model[98] = new ModelRendererTurbo(this, 100, 182, textureX, textureY); // Box99
        ice1Model[99] = new ModelRendererTurbo(this, 35, 130, textureX, textureY); // Box100
        ice1Model[100] = new ModelRendererTurbo(this, 56, 136, textureX, textureY); // Box101
        ice1Model[101] = new ModelRendererTurbo(this, 46, 134, textureX, textureY); // Box102
        ice1Model[102] = new ModelRendererTurbo(this, 60, 131, textureX, textureY); // Box103
        ice1Model[103] = new ModelRendererTurbo(this, 48, 130, textureX, textureY); // Box104
        ice1Model[104] = new ModelRendererTurbo(this, 58, 127, textureX, textureY); // Box105
        ice1Model[105] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box106
        ice1Model[106] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box107
        ice1Model[107] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box108
        ice1Model[108] = new ModelRendererTurbo(this, 306, 84, textureX, textureY); // Box109
        ice1Model[109] = new ModelRendererTurbo(this, 284, 98, textureX, textureY); // Box110
        ice1Model[110] = new ModelRendererTurbo(this, 270, 98, textureX, textureY); // Box111
        ice1Model[111] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box112
        ice1Model[112] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box113
        ice1Model[113] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box114
        ice1Model[114] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box115
        ice1Model[115] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box116
        ice1Model[116] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box117
        ice1Model[117] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box118
        ice1Model[118] = new ModelRendererTurbo(this, 131, 101, textureX, textureY); // Box119
        ice1Model[119] = new ModelRendererTurbo(this, 307, 80, textureX, textureY); // Box120
        ice1Model[120] = new ModelRendererTurbo(this, 305, 78, textureX, textureY); // Box121
        ice1Model[121] = new ModelRendererTurbo(this, 315, 83, textureX, textureY); // Box122
        ice1Model[122] = new ModelRendererTurbo(this, 264, 98, textureX, textureY); // Box123
        ice1Model[123] = new ModelRendererTurbo(this, 35, 130, textureX, textureY); // Box124
        ice1Model[124] = new ModelRendererTurbo(this, 56, 136, textureX, textureY); // Box125
        ice1Model[125] = new ModelRendererTurbo(this, 46, 134, textureX, textureY); // Box126
        ice1Model[126] = new ModelRendererTurbo(this, 60, 131, textureX, textureY); // Box127
        ice1Model[127] = new ModelRendererTurbo(this, 48, 130, textureX, textureY); // Box128
        ice1Model[128] = new ModelRendererTurbo(this, 58, 127, textureX, textureY); // Box129
        ice1Model[129] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box130
        ice1Model[130] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box131
        ice1Model[131] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box132
        ice1Model[132] = new ModelRendererTurbo(this, 306, 84, textureX, textureY); // Box133
        ice1Model[133] = new ModelRendererTurbo(this, 298, 98, textureX, textureY); // Box134
        ice1Model[134] = new ModelRendererTurbo(this, 270, 98, textureX, textureY); // Box135
        ice1Model[135] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box136
        ice1Model[136] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box137
        ice1Model[137] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box138
        ice1Model[138] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box139
        ice1Model[139] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box140
        ice1Model[140] = new ModelRendererTurbo(this, 52, 119, textureX, textureY); // Box141
        ice1Model[141] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box142
        ice1Model[142] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box143
        ice1Model[143] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box144
        ice1Model[144] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box145
        ice1Model[145] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box146
        ice1Model[146] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box147
        ice1Model[147] = new ModelRendererTurbo(this, 242, 115, textureX, textureY); // Box148
        ice1Model[148] = new ModelRendererTurbo(this, 210, 99, textureX, textureY); // Box149
        ice1Model[149] = new ModelRendererTurbo(this, 210, 99, textureX, textureY); // Box150
        ice1Model[150] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box151
        ice1Model[151] = new ModelRendererTurbo(this, 100, 185, textureX, textureY); // Box152
        ice1Model[152] = new ModelRendererTurbo(this, 100, 173, textureX, textureY); // Box153
        ice1Model[153] = new ModelRendererTurbo(this, 88, 188, textureX, textureY); // Box154
        ice1Model[154] = new ModelRendererTurbo(this, 100, 179, textureX, textureY); // Box155
        ice1Model[155] = new ModelRendererTurbo(this, 100, 176, textureX, textureY); // Box156
        ice1Model[156] = new ModelRendererTurbo(this, 100, 170, textureX, textureY); // Box157
        ice1Model[157] = new ModelRendererTurbo(this, 100, 182, textureX, textureY); // Box158
        ice1Model[158] = new ModelRendererTurbo(this, 219, 152, textureX, textureY); // Box159
        ice1Model[159] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box160
        ice1Model[160] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box161
        ice1Model[161] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box162
        ice1Model[162] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box163
        ice1Model[163] = new ModelRendererTurbo(this, 130, 130, textureX, textureY); // Box164
        ice1Model[164] = new ModelRendererTurbo(this, 130, 130, textureX, textureY); // Box165
        ice1Model[165] = new ModelRendererTurbo(this, 130, 130, textureX, textureY); // Box166
        ice1Model[166] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box167
        ice1Model[167] = new ModelRendererTurbo(this, 333, 145, textureX, textureY); // Box168
        ice1Model[168] = new ModelRendererTurbo(this, 219, 152, textureX, textureY); // Box169
        ice1Model[169] = new ModelRendererTurbo(this, 219, 126, textureX, textureY); // Box170
        ice1Model[170] = new ModelRendererTurbo(this, 315, 145, textureX, textureY); // Box171
        ice1Model[171] = new ModelRendererTurbo(this, 295, 145, textureX, textureY); // Box172
        ice1Model[172] = new ModelRendererTurbo(this, 277, 145, textureX, textureY); // Box173
        ice1Model[173] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box174
        ice1Model[174] = new ModelRendererTurbo(this, 311, 187, textureX, textureY); // Box175
        ice1Model[175] = new ModelRendererTurbo(this, 86, 143, textureX, textureY); // Box177
        ice1Model[176] = new ModelRendererTurbo(this, 274, 192, textureX, textureY); // Box178
        ice1Model[177] = new ModelRendererTurbo(this, 189, 185, textureX, textureY); // Box179
        ice1Model[178] = new ModelRendererTurbo(this, 301, 174, textureX, textureY); // Box180
        ice1Model[179] = new ModelRendererTurbo(this, 287, 174, textureX, textureY); // Box181
        ice1Model[180] = new ModelRendererTurbo(this, 212, 192, textureX, textureY); // Box182
        ice1Model[181] = new ModelRendererTurbo(this, 197, 194, textureX, textureY); // Box183
        ice1Model[182] = new ModelRendererTurbo(this, 263, 174, textureX, textureY); // Box184
        ice1Model[183] = new ModelRendererTurbo(this, 223, 174, textureX, textureY); // Box185
        ice1Model[184] = new ModelRendererTurbo(this, 301, 174, textureX, textureY); // Box186
        ice1Model[185] = new ModelRendererTurbo(this, 301, 174, textureX, textureY); // Box187
        ice1Model[186] = new ModelRendererTurbo(this, 236, 186, textureX, textureY); // Box188
        ice1Model[187] = new ModelRendererTurbo(this, 237, 175, textureX, textureY); // Box189
        ice1Model[188] = new ModelRendererTurbo(this, 296, 193, textureX, textureY); // Box190
        ice1Model[189] = new ModelRendererTurbo(this, 202, 174, textureX, textureY); // Box191
        ice1Model[190] = new ModelRendererTurbo(this, 231, 193, textureX, textureY); // Box192
        ice1Model[191] = new ModelRendererTurbo(this, 231, 195, textureX, textureY); // Box193
        ice1Model[192] = new ModelRendererTurbo(this, 427, 172, textureX, textureY); // Box194
        ice1Model[193] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box195
        ice1Model[194] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box196
        ice1Model[195] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box197
        ice1Model[196] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box198
        ice1Model[197] = new ModelRendererTurbo(this, 461, 175, textureX, textureY); // Box199
        ice1Model[198] = new ModelRendererTurbo(this, 445, 159, textureX, textureY); // Box200
        ice1Model[199] = new ModelRendererTurbo(this, 447, 175, textureX, textureY); // Box201
        ice1Model[200] = new ModelRendererTurbo(this, 428, 192, textureX, textureY); // Box202
        ice1Model[201] = new ModelRendererTurbo(this, 374, 210, textureX, textureY); // Box203
        ice1Model[202] = new ModelRendererTurbo(this, 440, 207, textureX, textureY); // Box204
        ice1Model[203] = new ModelRendererTurbo(this, 443, 169, textureX, textureY); // Box205
        ice1Model[204] = new ModelRendererTurbo(this, 443, 166, textureX, textureY); // Box206
        ice1Model[205] = new ModelRendererTurbo(this, 426, 182, textureX, textureY); // Box207
        ice1Model[206] = new ModelRendererTurbo(this, 430, 182, textureX, textureY); // Box208
        ice1Model[207] = new ModelRendererTurbo(this, 434, 182, textureX, textureY); // Box209
        ice1Model[208] = new ModelRendererTurbo(this, 438, 182, textureX, textureY); // Box210
        ice1Model[209] = new ModelRendererTurbo(this, 427, 172, textureX, textureY); // Box211
        ice1Model[210] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box212
        ice1Model[211] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box213
        ice1Model[212] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box214
        ice1Model[213] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box215
        ice1Model[214] = new ModelRendererTurbo(this, 461, 175, textureX, textureY); // Box216
        ice1Model[215] = new ModelRendererTurbo(this, 445, 159, textureX, textureY); // Box217
        ice1Model[216] = new ModelRendererTurbo(this, 447, 175, textureX, textureY); // Box218
        ice1Model[217] = new ModelRendererTurbo(this, 428, 192, textureX, textureY); // Box219
        ice1Model[218] = new ModelRendererTurbo(this, 374, 210, textureX, textureY); // Box220
        ice1Model[219] = new ModelRendererTurbo(this, 440, 207, textureX, textureY); // Box221
        ice1Model[220] = new ModelRendererTurbo(this, 443, 169, textureX, textureY); // Box222
        ice1Model[221] = new ModelRendererTurbo(this, 443, 166, textureX, textureY); // Box223
        ice1Model[222] = new ModelRendererTurbo(this, 426, 182, textureX, textureY); // Box224
        ice1Model[223] = new ModelRendererTurbo(this, 430, 182, textureX, textureY); // Box225
        ice1Model[224] = new ModelRendererTurbo(this, 434, 182, textureX, textureY); // Box226
        ice1Model[225] = new ModelRendererTurbo(this, 438, 182, textureX, textureY); // Box227
        ice1Model[226] = new ModelRendererTurbo(this, 130, 143, textureX, textureY); // Box228

        ice1Model[0].addShapeBox(0F, 0F, 0F, 178, 38, 1, 0F, 0F, 0F, 0F, -89F, 0F, 0F, -89F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, -89F, -19F, 0F, -89F, -19F, 0F, 0F, -19F, 0F); // Box01
        ice1Model[0].setRotationPoint(-79F, -14F, 12F);

        ice1Model[1].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.5F, 0.9F, 0F, -1.5F, 0.9F, 0F, -0.7F, -1.6F, 0F, -0.7F, -1.6F); // Box02
        ice1Model[1].setRotationPoint(-60F, 7F, 11F);

        ice1Model[2].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box03
        ice1Model[2].setRotationPoint(-86F, -11F, 12F);

        ice1Model[3].addShapeBox(0F, 0F, 0F, 18, 24, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -9F, -12F, 0F, -9F, -12F, 0F, 0F, -12F, 0F); // Box04
        ice1Model[3].setRotationPoint(-95F, -7F, 12F);

        ice1Model[4].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.9F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box05
        ice1Model[4].setRotationPoint(-95F, -9F, 12F);

        ice1Model[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box06
        ice1Model[5].setRotationPoint(-87F, -13F, 12F);

        ice1Model[6].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F, -2.5F, 2.7F, 0F, -3.7F, 10.5F, 0F, -3.7F, 10.5F, 0F, -2.5F, 2.7F, 0F, -3.1F, -2.6F, 0F, -2.9F, -10.4F, 0F, -2.9F, -10.4F, 0F, -3.1F, -2.6F, 0F); // Box07
        ice1Model[6].setRotationPoint(-108F, -1F, -6F);

        ice1Model[7].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F, 0F, 0.9F, 0.7F, 0F, 0.9F, 0.7F, 0F, 1.8F, -1.3F, 0F, 1.8F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box08
        ice1Model[7].setRotationPoint(-79F, -15F, 12F);

        ice1Model[8].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box09
        ice1Model[8].setRotationPoint(-79F, -17F, 11F);

        ice1Model[9].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -0.5F, 0F); // Box10
        ice1Model[9].setRotationPoint(-93F, -14F, -6F);

        ice1Model[10].addShapeBox(0F, 0F, 0F, 52, 1, 7, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.6F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box11
        ice1Model[10].setRotationPoint(-79F, -18F, 2F);

        ice1Model[11].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -3.8F, 0.7F, 0.5F, 2F, 1.4F, 0.5F, 2F, 0.9F, 0.5F, -3.8F, 0.7F, 0.2F, -3.7F, -0.8F, 0.5F, 2F, -1.6F, 0.5F, 2F, -1F, 0.2F, -3.7F, -0.8F, 0.2F); // Box12
        ice1Model[11].setRotationPoint(-87F, -17F, 2F);

        ice1Model[12].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -4F, 0F, 0.5F, 1.8F, 0.7F, 0.5F, 1.8F, 0.7F, 0.2F, -4F, 0F, 0F, -4F, 0F, 0.5F, 1.7F, -0.8F, 0.5F, 1.7F, -0.8F, 0.2F, -4F, 0F, 0F); // Box13
        ice1Model[12].setRotationPoint(-91F, -17F, 2F);

        ice1Model[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.7F, 0.7F, 0F, 0.9F, 0.7F, 0F, 1.8F, -1.3F, 0F, 1.3F, -1.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box14
        ice1Model[13].setRotationPoint(-83F, -15F, 12F);

        ice1Model[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, -0.1F, 0.7F, 0F, 0.7F, 0.7F, 0F, 1.3F, -1.5F, 0.7F, 0.5F, -1.7F, 0F, 0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0F); // Box15
        ice1Model[14].setRotationPoint(-86F, -15F, 12F);

        ice1Model[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.3F, -0.2F, 1.8F, 0F, 0F, 1.8F, 0F, 0.9F, -2.5F, 0.2F, 0.7F, -2.8F, 0F, 0.3F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.3F, -0.5F); // Box16
        ice1Model[15].setRotationPoint(-83F, -17F, 11F);

        ice1Model[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 2F, -0.3F, -0.2F, 1.8F, -0.2F, 0.7F, -2.8F, 0F, 0F, -3F, -0.5F, 1.1F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.3F, -0.5F, -0.3F, 0.5F, -0.7F); // Box17
        ice1Model[16].setRotationPoint(-87F, -17F, 11F);

        ice1Model[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, -0.8F, 1.2F, -0.5F, 1.9F, 0.7F, -0.7F, 2.5F, -1.7F, 1F, 0.2F, -1.7F, -0.4F, 1.1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.4F, 1.1F, 0F); // Box18
        ice1Model[17].setRotationPoint(-91F, -13F, 12F);

        ice1Model[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, -1.5F, 2F, 0F, 1F, 2F, 0F, 2F, -3F, 1F, -0.5F, -3F, -0.5F, 1.8F, 0.2F, 0.5F, -0.9F, -0.3F, 0.3F, -1.5F, -0.7F, 0F, 0.8F, -0.7F); // Box19
        ice1Model[18].setRotationPoint(-92F, -15F, 11F);

        ice1Model[19].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, -0.3F, 0.5F, 0F, -2F, 3.5F, 0F, -2F, 3.5F, 0F, -0.3F, 0.5F, 0F, -1.1F, -0.4F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, -1.1F, -0.4F, 0F); // Box20
        ice1Model[19].setRotationPoint(-97F, -11F, -6F);

        ice1Model[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.5F, 1.2F, -0.5F, 2.2F, 1.2F, -1F, 3.2F, -1.7F, 0F, 0.2F, -1.7F, -1F, 1.2F, 0F, 0.4F, -1.9F, 0F, 0.4F, -1.9F, 0F, -1F, 1.2F, 0F); // Box21
        ice1Model[20].setRotationPoint(-96F, -10F, 12F);

        ice1Model[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.1F, -1.6F, 2F, -0.5F, 1.5F, 2F, -1F, 2.5F, -3F, 0.7F, -0.5F, -3F, -0.3F, 1.5F, 0.2F, 0.5F, -1.2F, 0.2F, 0F, -2.2F, -0.7F, 0F, 0.8F, -0.7F); // Box22
        ice1Model[21].setRotationPoint(-96F, -12F, 11F);

        ice1Model[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 4.7F, -5.3F, 1.4F, -0.7F, 2.5F, 1.2F, -1F, 3.2F, -1.7F, 5F, -4.5F, -1.7F, 4F, 6F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 4F, 6F, 0F); // Box23
        ice1Model[22].setRotationPoint(-100F, -7F, 12F);

        ice1Model[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 1.9F, -3.4F, 2F, 3.1F, 4.4F, 2F, 2.3F, 5.5F, -3F, 2.5F, -2.3F, -3F, 1.7F, 3.3F, 0.4F, 3.3F, -4.5F, 0.2F, 3F, -5.2F, -0.7F, 2F, 2.5F, -0.7F); // Box24
        ice1Model[23].setRotationPoint(-103F, -6F, 11F);

        ice1Model[24].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, -2F, 1.1F, 0F, -3.5F, 5.7F, 0F, -3.5F, 5.7F, 0F, -2F, 1.1F, 0F, -2.7F, -1.3F, 0F, -2.9F, -5.6F, 0F, -2.9F, -5.6F, 0F, -2.7F, -1.3F, 0F); // Box25
        ice1Model[24].setRotationPoint(-112F, 2F, -6F);

        ice1Model[25].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, -5.5F, 3F, 0F, -3F, 5.1F, 0F, -3F, 5.1F, 0F, -5.5F, 3F, 0F, -6.5F, -3.6F, 0F, -2.3F, -5.3F, 0F, -2.3F, -5.3F, 0F, -6.5F, -3.6F, 0F); // Box26
        ice1Model[25].setRotationPoint(-117F, 6F, -6F);

        ice1Model[26].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, -6.2F, 2.5F, 0F, -3.5F, 5F, 0F, -3.5F, 5F, 0F, -6.2F, 2.5F, 0F, -7.2F, -3.6F, 0F, -2.5F, -5.6F, 0F, -2.5F, -5.6F, 0F, -7.2F, -3.6F, 0F); // Box27
        ice1Model[26].setRotationPoint(-118F, 8F, -6F);

        ice1Model[27].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, -6.5F, 2.3F, 0F, -4.8F, 4.5F, 0F, -4.8F, 4.5F, 0F, -6.5F, 2.3F, 0F, -7.2F, -3.9F, 0F, -3.8F, -5.6F, 0F, -3.8F, -5.6F, 0F, -7.2F, -3.9F, 0F); // Box28
        ice1Model[27].setRotationPoint(-117F, 10F, -6F);

        ice1Model[28].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, -7.7F, 2.6F, 0F, -5.5F, 4.3F, 0F, -5.5F, 4.3F, 0F, -7.7F, 2.6F, 0F, -7.7F, -4.6F, 0F, -4.8F, -5.9F, 0F, -4.8F, -5.9F, 0F, -7.7F, -4.6F, 0F); // Box29
        ice1Model[28].setRotationPoint(-115F, 12F, -6F);

        ice1Model[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 4.7F, -5.3F, 1.4F, -5.7F, -1.3F, 1.4F, -6F, -0.5F, -1.7F, 5F, -4.5F, -1.7F, 0F, 3.3F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 3.6F, 0F); // Box30
        ice1Model[29].setRotationPoint(-104F, -3F, 12F);

        ice1Model[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 4.3F, -6.7F, 1F, -4.9F, -2.4F, 1F, -5.5F, -1.3F, -2F, 5F, -5.9F, -2F, 3.7F, 6.3F, -0.6F, -4.7F, 2.3F, -0.6F, -5F, 1.5F, 0.3F, 4F, 5.5F, 0.3F); // Box31
        ice1Model[30].setRotationPoint(-105F, -5F, 10F);

        ice1Model[31].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box32
        ice1Model[31].setRotationPoint(-83F, -13F, 12F);

        ice1Model[32].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box33
        ice1Model[32].setRotationPoint(-86F, -14F, 12F);

        ice1Model[33].addShapeBox(0F, 0F, 0F, 178, 38, 1, 0F, 0F, 0F, 0F, -89F, 0F, 0F, -89F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, -89F, -19F, 0F, -89F, -19F, 0F, 0F, -19F, 0F); // Box34
        ice1Model[33].setRotationPoint(-79F, -14F, -10F);

        ice1Model[34].addShapeBox(0F, 0F, 0F, 52, 1, 7, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.6F, 0.5F); // Box35
        ice1Model[34].setRotationPoint(-79F, -18F, -6F);

        ice1Model[35].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F, 0F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box36
        ice1Model[35].setRotationPoint(-79F, -17F, -9F);

        ice1Model[36].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F, 0F, 1.8F, -1.3F, 0F, 1.8F, -1.3F, 0F, 0.9F, 0.7F, 0F, 0.9F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box37
        ice1Model[36].setRotationPoint(-79F, -15F, -10F);

        ice1Model[37].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -3.8F, 0.7F, 0.2F, 2F, 0.9F, 0.5F, 2F, 1.4F, 0.5F, -3.8F, 0.7F, 0.5F, -3.7F, -0.8F, 0.2F, 2F, -1F, 0.2F, 2F, -1.6F, 0.5F, -3.7F, -0.8F, 0.5F); // Box38
        ice1Model[37].setRotationPoint(-87F, -17F, -6F);

        ice1Model[38].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -4F, 0F, 0F, 1.8F, 0.7F, 0.2F, 1.8F, 0.7F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 1.7F, -0.8F, 0.2F, 1.7F, -0.8F, 0.5F, -4F, 0F, 0.5F); // Box39
        ice1Model[38].setRotationPoint(-91F, -17F, -6F);

        ice1Model[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, 0.7F, -2.8F, 0F, 0.9F, -2.5F, 0F, 0F, 1.8F, 0.3F, -0.2F, 1.8F, 0F, -0.3F, -0.5F, 0F, -0.8F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.3F, -0.3F); // Box40
        ice1Model[39].setRotationPoint(-83F, -17F, -9F);

        ice1Model[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 1.3F, -1.5F, 0F, 1.8F, -1.3F, 0F, 0.9F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box41
        ice1Model[40].setRotationPoint(-83F, -15F, -10F);

        ice1Model[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -3F, -0.2F, 0.7F, -2.8F, -0.3F, -0.2F, 1.8F, 0F, -1F, 2F, -0.3F, 0.5F, -0.7F, 0F, -0.3F, -0.5F, 0F, 0.3F, -0.3F, -0.5F, 1.1F, -0.3F); // Box42
        ice1Model[41].setRotationPoint(-87F, -17F, -9F);

        ice1Model[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.7F, 0.5F, -1.7F, 0F, 1.3F, -1.5F, 0F, 0.7F, 0.7F, 0.5F, -0.1F, 0.7F, 0F, 0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0F); // Box43
        ice1Model[42].setRotationPoint(-86F, -15F, -10F);

        ice1Model[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, -0.5F, -3F, 0F, 2F, -3F, 0F, 1F, 2F, 0.5F, -1.5F, 2F, 0F, 0.8F, -0.7F, 0.3F, -1.5F, -0.7F, 0.5F, -0.9F, -0.3F, -0.5F, 1.8F, 0.2F); // Box44
        ice1Model[43].setRotationPoint(-92F, -15F, -9F);

        ice1Model[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0.2F, -1.7F, -0.7F, 2.5F, -1.7F, -0.5F, 1.9F, 0.7F, 0.5F, -0.8F, 1.2F, -0.4F, 1.1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.4F, 1.1F, 0F); // Box45
        ice1Model[44].setRotationPoint(-91F, -13F, -10F);

        ice1Model[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, -1.7F, -1F, 3.2F, -1.7F, -0.5F, 2.2F, 1.2F, -0.3F, -0.5F, 1.2F, -1F, 1.2F, 0F, 0.4F, -1.9F, 0F, 0.4F, -1.9F, 0F, -1F, 1.2F, 0F); // Box46
        ice1Model[45].setRotationPoint(-96F, -10F, -10F);

        ice1Model[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.7F, -0.5F, -3F, -1F, 2.5F, -3F, -0.5F, 1.5F, 2F, -0.1F, -1.6F, 2F, 0F, 0.8F, -0.7F, 0F, -2.2F, -0.7F, 0.5F, -1.2F, 0.2F, -0.3F, 1.5F, 0.2F); // Box47
        ice1Model[46].setRotationPoint(-96F, -12F, -9F);

        ice1Model[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 2.5F, -2.3F, -3F, 2.3F, 5.5F, -3F, 3.1F, 4.4F, 2F, 1.9F, -3.4F, 2F, 2F, 2.5F, -0.7F, 3F, -5.2F, -0.7F, 3.3F, -4.5F, 0.2F, 1.7F, 3.3F, 0.4F); // Box48
        ice1Model[47].setRotationPoint(-103F, -6F, -9F);

        ice1Model[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 5F, -4.5F, -1.7F, -1F, 3.2F, -1.7F, -0.7F, 2.5F, 1.2F, 4.7F, -5.3F, 1.4F, 4F, 6F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 4F, 6F, 0F); // Box49
        ice1Model[48].setRotationPoint(-100F, -7F, -10F);

        ice1Model[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box50
        ice1Model[49].setRotationPoint(-83F, -14F, 12F);

        ice1Model[50].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box51
        ice1Model[50].setRotationPoint(-83F, -13F, -10F);

        ice1Model[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box52
        ice1Model[51].setRotationPoint(-83F, -14F, -10F);

        ice1Model[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box53
        ice1Model[52].setRotationPoint(-86F, -14F, -10F);

        ice1Model[53].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box54
        ice1Model[53].setRotationPoint(-86F, -11F, -10F);

        ice1Model[54].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 0.3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0.3F, 0F); // Box55
        ice1Model[54].setRotationPoint(-9F, -18F, 1F);

        ice1Model[55].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, -1F, 0F, 0F); // Box56
        ice1Model[55].setRotationPoint(-9F, -23F, -1F);

        ice1Model[56].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box57
        ice1Model[56].setRotationPoint(-9F, -24F, -3F);

        ice1Model[57].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, -1F, 0F, 0F); // Box58
        ice1Model[57].setRotationPoint(-9F, -23F, 3F);

        ice1Model[58].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box59
        ice1Model[58].setRotationPoint(-12F, -24F, -3F);

        ice1Model[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box60
        ice1Model[59].setRotationPoint(-12F, -24F, 6F);

        ice1Model[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box61
        ice1Model[60].setRotationPoint(-9F, -24F, 6F);

        ice1Model[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box62
        ice1Model[61].setRotationPoint(-9F, -24F, -5F);

        ice1Model[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box63
        ice1Model[62].setRotationPoint(-12F, -24F, -5F);

        ice1Model[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box64
        ice1Model[63].setRotationPoint(-12F, -23F, -3F);

        ice1Model[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box65
        ice1Model[64].setRotationPoint(-12F, -23F, 5F);

        ice1Model[65].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box66
        ice1Model[65].setRotationPoint(-104F, 0F, 12F);

        ice1Model[66].addShapeBox(0F, 0F, 0F, 18, 24, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -9F, -12F, 0F, -9F, -12F, 0F, 0F, -12F, 0F); // Box67
        ice1Model[66].setRotationPoint(-95F, -7F, -10F);

        ice1Model[67].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box68
        ice1Model[67].setRotationPoint(-104F, 0F, -10F);

        ice1Model[68].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0.8F, -0.5F, 0F, -0.8F, -0.4F, 0F, 1.5F, 0F, -1.5F, -1.3F, -0.2F, -0.7F, -0.5F, -0.3F, 0F, 0.2F, -0.9F, 0F, 1.6F, -1.6F, -1.5F, -1.7F, -1F, -1F); // Box69
        ice1Model[68].setRotationPoint(-111F, 5F, 9F);

        ice1Model[69].addShapeBox(0F, 0F, 0F, 33, 1, 15, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box70
        ice1Model[69].setRotationPoint(-27F, -17F, -6F);

        ice1Model[70].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0.5F, 0F, -0.6F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box71
        ice1Model[70].setRotationPoint(6F, -18F, 2F);

        ice1Model[71].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0.5F, 0F, 0F, 0.5F); // Box72
        ice1Model[71].setRotationPoint(6F, -18F, -6F);

        ice1Model[72].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box73
        ice1Model[72].setRotationPoint(-95F, -8F, 12F);

        ice1Model[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.7F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F); // Box74
        ice1Model[73].setRotationPoint(-87F, -13F, 12F);

        ice1Model[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F); // Box75
        ice1Model[74].setRotationPoint(-87F, -13F, 12F);

        ice1Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, -5.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 7F, -5.2F, 0F, 6.7F, 4.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 6.7F, 4.2F, 0F); // Box76
        ice1Model[75].setRotationPoint(-88F, -13F, 12F);

        ice1Model[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.7F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box77
        ice1Model[76].setRotationPoint(-91F, -11F, 12F);

        ice1Model[77].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.2F, -1.9F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.2F, -1.9F, -0.2F, 0.2F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F); // Box78
        ice1Model[77].setRotationPoint(-94F, -10F, 12F);

        ice1Model[78].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.3F, 0.5F, -0.2F, 0.8F, 2.9F, -0.2F, 0.7F, 2.9F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.3F, -0.1F, -0.2F); // Box79
        ice1Model[78].setRotationPoint(-90F, -10F, 12F);

        ice1Model[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2.6F, -2.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2.6F, -2.1F, 0F, 7F, 4.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 7F, 4.2F, 0F); // Box80
        ice1Model[79].setRotationPoint(-88F, -13F, 12F);

        ice1Model[80].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box81
        ice1Model[80].setRotationPoint(-95F, -8F, -10F);

        ice1Model[81].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.9F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box82
        ice1Model[81].setRotationPoint(-95F, -9F, -10F);

        ice1Model[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.7F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F); // Box83
        ice1Model[82].setRotationPoint(-87F, -13F, -10F);

        ice1Model[83].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.3F, 0.5F, -0.2F, 0.8F, 2.9F, -0.2F, 0.7F, 2.9F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.3F, -0.1F, -0.2F); // Box84
        ice1Model[83].setRotationPoint(-90F, -10F, -10F);

        ice1Model[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.7F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box85
        ice1Model[84].setRotationPoint(-91F, -11F, -10F);

        ice1Model[85].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.2F, -1.9F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.2F, -1.9F, -0.2F, 0.2F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F); // Box86
        ice1Model[85].setRotationPoint(-94F, -10F, -10F);

        ice1Model[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, -5.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 7F, -5.2F, 0F, 6.7F, 4.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 6.7F, 4.2F, 0F); // Box87
        ice1Model[86].setRotationPoint(-88F, -13F, -10F);

        ice1Model[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F); // Box88
        ice1Model[87].setRotationPoint(-87F, -13F, -10F);

        ice1Model[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box89
        ice1Model[88].setRotationPoint(-87F, -13F, -10F);

        ice1Model[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2.6F, -2.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2.6F, -2.1F, 0F, 7F, 4.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 7F, 4.2F, 0F); // Box90
        ice1Model[89].setRotationPoint(-88F, -13F, -10F);

        ice1Model[90].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, -8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box91
        ice1Model[90].setRotationPoint(-104F, -8F, 12F);

        ice1Model[91].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, -8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box92
        ice1Model[91].setRotationPoint(-104F, -8F, -10F);

        ice1Model[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.3F, 0.4F, 0F, 0.7F, -1F, 0F, 0.4F, 1F, 0F, 0.5F, -0.7F, -0.2F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 1F, 0.6F, 0F, -0.7F); // Box93
        ice1Model[92].setRotationPoint(-109F, 2F, 11F);

        ice1Model[93].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box94
        ice1Model[93].setRotationPoint(-60F, 5F, 12F);

        ice1Model[94].addShapeBox(0F, 0F, 0F, 31, 1, 13, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F); // Box95
        ice1Model[94].setRotationPoint(-60F, 8F, -5F);

        ice1Model[95].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.7F, -1.6F, 0F, -0.7F, -1.6F, 0F, -1.5F, 0.9F, 0F, -1.5F, 0.9F); // Box96
        ice1Model[95].setRotationPoint(-60F, 7F, -9F);

        ice1Model[96].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F); // Box97
        ice1Model[96].setRotationPoint(-60F, 5F, -10F);

        ice1Model[97].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, 0.5F, -1.1F, 0F, 0.5F, -1.1F, 0F, -1.1F, -1.7F, 0F, -1.1F, -1.7F, 0F, -1.9F, 0.9F, 0F, -1.9F, 0.9F); // Box98
        ice1Model[97].setRotationPoint(-60F, 8F, -7F);

        ice1Model[98].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0.5F, -1.1F, 0F, 0.5F, -1.1F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -1.9F, 0.9F, 0F, -1.9F, 0.9F, 0F, -1.1F, -1.7F, 0F, -1.1F, -1.7F); // Box99
        ice1Model[98].setRotationPoint(-60F, 8F, 9F);

        ice1Model[99].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.9F, 0.6F, 0F, -0.8F, 0.6F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F, 0F, -0.3F, -1.4F, 0F, -0.4F, -1.4F); // Box100
        ice1Model[99].setRotationPoint(-94F, 8F, 10F);

        ice1Model[100].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.5F, -0.9F, 0F, 0.4F, -0.9F); // Box101
        ice1Model[100].setRotationPoint(-94F, 5F, 12F);

        ice1Model[101].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -0.1F, -1.4F, 0F, -0.2F, -1.4F); // Box102
        ice1Model[101].setRotationPoint(-94F, 7F, 12F);

        ice1Model[102].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.8F, 0.6F, 0F, -0.7F, 0.6F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F, 0F, -0.4F, -1.4F, 0F, -0.5F, -1.4F); // Box103
        ice1Model[102].setRotationPoint(-97F, 8F, 10F);

        ice1Model[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.4F, -0.9F, 0F, 0.3F, -0.9F); // Box104
        ice1Model[103].setRotationPoint(-97F, 5F, 12F);

        ice1Model[104].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0.1F, 0F, -0.3F, 0.1F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, 0F, -0.2F, -1.4F, 0F, -0.3F, -1.4F); // Box105
        ice1Model[104].setRotationPoint(-97F, 7F, 12F);

        ice1Model[105].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0.1F, -1.3F, 0F, 0F, -1.3F, 0F, -0.7F, 0.6F, 0F, -0.6F, 0.6F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F, 0F, -0.5F, -1.4F, 0F, -0.6F, -1.4F); // Box106
        ice1Model[105].setRotationPoint(-100F, 8F, 10F);

        ice1Model[106].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.7F, 0F, 0F, 0.7F, 0F, 0.3F, -0.9F, 0F, 0.2F, -0.9F); // Box107
        ice1Model[106].setRotationPoint(-100F, 5F, 12F);

        ice1Model[107].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0.1F, 0F, -0.2F, 0.1F, 0F, -1.1F, 0.7F, 0F, -1F, 0.7F, 0F, -0.3F, -1.4F, 0F, -0.4F, -1.4F); // Box108
        ice1Model[107].setRotationPoint(-100F, 7F, 12F);

        ice1Model[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 2.5F, -3.4F, 1F, -6.3F, -1.7F, 1F, -7F, -0.9F, -2F, 3.5F, -3F, -2F, 0.8F, 2F, -0.6F, -5.7F, 1.3F, -0.6F, -6F, 0.5F, 0.3F, 1.6F, 2F, 0.3F); // Box109
        ice1Model[108].setRotationPoint(-108F, 0F, 10F);

        ice1Model[109].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 1.6F, 0F, -0.3F, -1.8F, 0F, 0.4F, 3F, 0F, -5F, -4F, 0F, -4F, 1.7F, -3.8F, -0.3F, -1.5F, -4F, 0.5F, 3F, -4F, -5F, -4F, -4F, -4F); // Box110
        ice1Model[109].setRotationPoint(-108F, 3F, 11F);

        ice1Model[110].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0.5F, 0F, 0F, -0.5F, -0.4F, 0F, 1.2F, 0F, -4.4F, -1.4F, 0F, -3.7F, 0.8F, -3.5F, 0F, -0.8F, -3.6F, 0F, 1.5F, -4F, -4.5F, -1.3F, -3.8F, -3.7F); // Box111
        ice1Model[110].setRotationPoint(-111F, 3F, 9F);

        ice1Model[111].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F, 0F, -0.6F, -1.4F, 0F, -0.6F, -1.4F); // Box112
        ice1Model[111].setRotationPoint(-104F, 8F, 10F);

        ice1Model[112].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.7F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box113
        ice1Model[112].setRotationPoint(-104F, 5F, 12F);

        ice1Model[113].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F, 0F, -0.4F, -1.4F, 0F, -0.4F, -1.4F); // Box114
        ice1Model[113].setRotationPoint(-104F, 7F, 12F);

        ice1Model[114].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, -1.6F, 0.6F, -1.5F, 0F, -0.9F, -1.3F, 0F, -1.6F, 0.4F, -0.7F, 0F, 1F, -0.2F, -1.9F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0.4F, -1F, 0.5F, -1.3F, -1F); // Box115
        ice1Model[114].setRotationPoint(-110F, 7F, 10F);

        ice1Model[115].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.7F, -0.2F, -1.7F, 1.4F, -0.6F, 1.5F, 0F, -0.1F, 0.7F, 0F, 0.2F, -0.9F, 2.3F, 0F, -2F); // Box116
        ice1Model[115].setRotationPoint(-107F, 5F, 12F);

        ice1Model[116].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 1.4F, 0.6F, 0.5F, 0F, 0.1F, -0.3F, 0F, -0.2F, 0.1F, 2.3F, 0F, -1F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F, 0F, -0.4F, -1.4F, 0F, -0.4F, -1.6F); // Box117
        ice1Model[116].setRotationPoint(-107F, 7F, 12F);

        ice1Model[117].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.4F, 0.3F, -1.6F, 0F, 0F, -1.3F, 0.7F, 0F, -0.6F, -1.4F, 0.3F, -0.6F, -1F); // Box118
        ice1Model[117].setRotationPoint(-107F, 8F, 10F);

        ice1Model[118].addShapeBox(0F, 0F, 0F, 1, 26, 43, 0F, -0.3F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -40.5F, -0.3F, -0.25F, -40.5F, -0.2F, -24.5F, -0.5F, 0F, -24.5F, -0.5F, 0F, -24.5F, -40.5F, -0.2F, -24.5F, -40.5F); // Box119
        ice1Model[118].setRotationPoint(-112F, 4F, 0F);

        ice1Model[119].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 5F, -4.5F, -1.7F, -6F, -0.5F, -1.7F, -5.7F, -1.3F, 1.4F, 4.7F, -5.3F, 1.4F, 0F, 3.6F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 3.3F, 0F); // Box120
        ice1Model[119].setRotationPoint(-104F, -3F, -10F);

        ice1Model[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 5F, -5.9F, -2F, -5.5F, -1.3F, -2F, -4.9F, -2.4F, 1F, 4.3F, -6.7F, 1F, 4F, 5.5F, 0.3F, -5F, 1.5F, 0.3F, -4.7F, 2.3F, -0.6F, 3.7F, 6.3F, -0.6F); // Box121
        ice1Model[120].setRotationPoint(-105F, -5F, -8F);

        ice1Model[121].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -1.3F, -0.2F, -0.7F, 1.5F, 0F, -1.5F, -0.8F, -0.4F, 0F, 0.8F, -0.5F, 0F, -1.7F, -1F, -1F, 1.6F, -1.6F, -1.5F, 0.2F, -0.9F, 0F, -0.5F, -0.3F, 0F); // Box122
        ice1Model[121].setRotationPoint(-111F, 5F, -9F);

        ice1Model[122].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, -0.7F, 0F, 0.4F, 1F, 0F, 0.7F, -1F, -0.3F, -0.3F, 0.4F, 0.6F, 0F, -0.7F, 0F, 0F, 1F, 0F, 0F, -1F, -0.2F, 0F, 0.4F); // Box123
        ice1Model[122].setRotationPoint(-109F, 2F, -9F);

        ice1Model[123].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.8F, 0.6F, 0F, -0.9F, 0.6F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.4F, -1.4F, 0F, -0.3F, -1.4F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F); // Box124
        ice1Model[123].setRotationPoint(-94F, 8F, -6F);

        ice1Model[124].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.9F, 0F, 0.5F, -0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box125
        ice1Model[124].setRotationPoint(-94F, 5F, -10F);

        ice1Model[125].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.4F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -1.4F, 0F, -0.1F, -1.4F, 0F, -1F, 0.7F, 0F, -1F, 0.7F); // Box126
        ice1Model[125].setRotationPoint(-94F, 7F, -8F);

        ice1Model[126].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.7F, 0.6F, 0F, -0.8F, 0.6F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.5F, -1.4F, 0F, -0.4F, -1.4F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F); // Box127
        ice1Model[126].setRotationPoint(-97F, 8F, -6F);

        ice1Model[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.9F, 0F, 0.4F, -0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box128
        ice1Model[127].setRotationPoint(-97F, 5F, -10F);

        ice1Model[128].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.3F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -1.4F, 0F, -0.2F, -1.4F, 0F, -1F, 0.7F, 0F, -1F, 0.7F); // Box129
        ice1Model[128].setRotationPoint(-97F, 7F, -8F);

        ice1Model[129].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.6F, 0.6F, 0F, -0.7F, 0.6F, 0F, 0F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.6F, -1.4F, 0F, -0.5F, -1.4F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F); // Box130
        ice1Model[129].setRotationPoint(-100F, 8F, -6F);

        ice1Model[130].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0F, 0.7F, 0F, -0.1F, 0.7F); // Box131
        ice1Model[130].setRotationPoint(-100F, 5F, -10F);

        ice1Model[131].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.2F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.4F, -1.4F, 0F, -0.3F, -1.4F, 0F, -1F, 0.7F, 0F, -1.1F, 0.7F); // Box132
        ice1Model[131].setRotationPoint(-100F, 7F, -8F);

        ice1Model[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 3.5F, -3F, -2F, -7F, -0.9F, -2F, -6.3F, -1.7F, 1F, 2.5F, -3.4F, 1F, 1.6F, 2F, 0.3F, -6F, 0.5F, 0.3F, -5.7F, 1.3F, -0.6F, 0.8F, 2F, -0.6F); // Box133
        ice1Model[132].setRotationPoint(-108F, 0F, -8F);

        ice1Model[133].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, -4F, 0F, -4F, 3F, 0F, -5F, -1.8F, 0F, 0.4F, 1.6F, 0F, -0.3F, -4F, -4F, -4F, 3F, -4F, -5F, -1.5F, -4F, 0.5F, 1.7F, -3.8F, -0.3F); // Box134
        ice1Model[133].setRotationPoint(-108F, 3F, -14F);

        ice1Model[134].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, -1.4F, 0F, -3.7F, 1.2F, 0F, -4.4F, -0.5F, -0.4F, 0F, 0.5F, 0F, 0F, -1.3F, -3.8F, -3.7F, 1.5F, -4F, -4.5F, -0.8F, -3.6F, 0F, 0.8F, -3.5F, 0F); // Box135
        ice1Model[134].setRotationPoint(-111F, 3F, -12F);

        ice1Model[135].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.6F, -1.4F, 0F, -0.6F, -1.4F, 0F, -1.3F, 0.7F, 0F, -1.3F, 0.7F); // Box136
        ice1Model[135].setRotationPoint(-104F, 8F, -6F);

        ice1Model[136].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.7F); // Box137
        ice1Model[136].setRotationPoint(-104F, 5F, -10F);

        ice1Model[137].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.4F, -1.4F, 0F, -0.4F, -1.4F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F); // Box138
        ice1Model[137].setRotationPoint(-104F, 7F, -8F);

        ice1Model[138].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, -0.7F, 0F, 1F, 0F, -1.6F, 0.4F, 0F, -0.9F, -1.3F, -1.6F, 0.6F, -1.5F, 0.5F, -1.3F, -1F, -0.3F, 0.4F, -1F, -0.3F, -0.6F, 0F, -0.2F, -1.9F, 0F); // Box139
        ice1Model[138].setRotationPoint(-110F, 7F, -6F);

        ice1Model[139].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 2.7F, -0.2F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 1.5F, 2.3F, 0F, -2F, 0F, 0.2F, -0.9F, 0F, -0.1F, 0.7F, 1.4F, -0.6F, 1.5F); // Box140
        ice1Model[139].setRotationPoint(-107F, 5F, -10F);

        ice1Model[140].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 2.3F, 0F, -1F, 0F, -0.2F, 0.1F, 0F, 0.1F, -0.3F, 1.4F, 0.6F, 0.5F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.4F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F); // Box141
        ice1Model[140].setRotationPoint(-107F, 7F, -8F);

        ice1Model[141].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.6F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0.3F, -0.6F, -1F, 0F, -0.6F, -1.4F, 0F, -1.3F, 0.7F, 0.3F, -1.6F, 0F); // Box142
        ice1Model[141].setRotationPoint(-107F, 8F, -6F);

        ice1Model[142].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.3F, -6.6F, -0.5F, -0.7F, -3.4F, -0.5F, -0.7F, -3.4F, 0F, 0.3F, -6.6F, 0F, -1.2F, 6.2F, -0.5F, 0.2F, 3.6F, -0.5F, 0.2F, 3.6F, 0F, -1.2F, 6.2F, 0F); // Box143
        ice1Model[142].setRotationPoint(-100F, -15F, 8F);

        ice1Model[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -3.4F, -0.5F, -0.2F, -1.4F, -0.5F, -0.2F, -1.4F, 0F, -0.3F, -3.4F, 0F, -1.2F, 3.6F, -0.5F, 0.7F, 1.3F, -0.5F, 0.7F, 1.3F, 0F, -1.2F, 3.6F, 0F); // Box144
        ice1Model[143].setRotationPoint(-97F, -15F, 8F);

        ice1Model[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.3F, -6.6F, -1F, -0.7F, -3.4F, -1F, -0.7F, -3.4F, 0.5F, 0.3F, -6.6F, 0.5F, -1.2F, 6.2F, -1F, 0.2F, 3.6F, -1F, 0.2F, 3.6F, 0.5F, -1.2F, 6.2F, 0.5F); // Box145
        ice1Model[144].setRotationPoint(-100F, -15F, -7F);

        ice1Model[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -3.4F, -1F, -0.2F, -1.4F, -1F, -0.2F, -1.4F, 0.5F, -0.3F, -3.4F, 0.5F, -1.2F, 3.6F, -1F, 0.7F, 1.3F, -1F, 0.7F, 1.3F, 0.5F, -1.2F, 3.6F, 0.5F); // Box146
        ice1Model[145].setRotationPoint(-97F, -15F, -7F);

        ice1Model[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.3F, -6.6F, -0.1F, -0.7F, -3.4F, -0.1F, -0.7F, -3.4F, -0.1F, 0.3F, -6.6F, -0.1F, -1.2F, 6.2F, -0.1F, 0.2F, 3.6F, -0.1F, 0.2F, 3.6F, -0.1F, -1.2F, 6.2F, -0.1F); // Box147
        ice1Model[146].setRotationPoint(-100F, -15F, 1F);

        ice1Model[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -3.4F, -0.1F, -0.2F, -1.4F, -0.1F, -0.2F, -1.4F, -0.1F, -0.3F, -3.4F, -0.1F, -1.2F, 3.6F, -0.1F, 0.7F, 1.3F, -0.1F, 0.7F, 1.3F, -0.1F, -1.2F, 3.6F, -0.1F); // Box148
        ice1Model[147].setRotationPoint(-97F, -15F, 1F);

        ice1Model[148].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, -0.7F, -2.3F, 0F, -1.5F, -1.6F, 0F, -1.5F, -1.6F, 0F, -0.7F, -2.3F, 0F, -1F, 1F, 0F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, -1F, 1F, 0F); // Box149
        ice1Model[148].setRotationPoint(-94F, -15F, -6F);

        ice1Model[149].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, -0.7F, -2.6F, 0F, -1.5F, -1.8F, 0F, -1.5F, -1.8F, 0F, -0.7F, -2.6F, 0F, -1.2F, 1.2F, 0F, -1.1F, 0.4F, 0F, -1.1F, 0.4F, 0F, -1.2F, 1.2F, 0F); // Box150
        ice1Model[149].setRotationPoint(-100F, -10F, -6F);

        ice1Model[150].addShapeBox(0F, 0F, 0F, 112, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box151
        ice1Model[150].setRotationPoint(-105F, 4F, -9F);

        ice1Model[151].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.5F, 0.9F, 0F, -1.5F, 0.9F, 0F, -0.7F, -1.6F, 0F, -0.7F, -1.6F); // Box152
        ice1Model[151].setRotationPoint(2F, 7F, 11F);

        ice1Model[152].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box153
        ice1Model[152].setRotationPoint(2F, 5F, 12F);

        ice1Model[153].addShapeBox(0F, 0F, 0F, 8, 1, 13, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F); // Box154
        ice1Model[153].setRotationPoint(2F, 8F, -5F);

        ice1Model[154].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.7F, -1.6F, 0F, -0.7F, -1.6F, 0F, -1.5F, 0.9F, 0F, -1.5F, 0.9F); // Box155
        ice1Model[154].setRotationPoint(2F, 7F, -9F);

        ice1Model[155].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F); // Box156
        ice1Model[155].setRotationPoint(2F, 5F, -10F);

        ice1Model[156].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, 0.5F, -1.1F, 0F, 0.5F, -1.1F, 0F, -1.1F, -1.7F, 0F, -1.1F, -1.7F, 0F, -1.9F, 0.9F, 0F, -1.9F, 0.9F); // Box157
        ice1Model[156].setRotationPoint(2F, 8F, -7F);

        ice1Model[157].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0.5F, -1.1F, 0F, 0.5F, -1.1F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -1.9F, 0.9F, 0F, -1.9F, 0.9F, 0F, -1.1F, -1.7F, 0F, -1.1F, -1.7F); // Box158
        ice1Model[157].setRotationPoint(2F, 8F, 9F);

        ice1Model[158].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0.9F, -2.6F, 0F, 0.9F, -2.6F, 0F, 0.9F, -2.6F, 0F, 0.9F, -2.6F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F); // Box159
        ice1Model[158].setRotationPoint(7F, -17F, -7F);

        ice1Model[159].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F); // Box160
        ice1Model[159].setRotationPoint(2F, 5F, -5F);

        ice1Model[160].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F); // Box161
        ice1Model[160].setRotationPoint(-30F, 5F, -5F);

        ice1Model[161].addShapeBox(0F, 0F, 0F, 0, 3, 13, 0F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F); // Box162
        ice1Model[161].setRotationPoint(-60F, 5F, -5F);

        ice1Model[162].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, -0.4F, 3.4F, 0F, -0.4F, 3.4F, 0F, -0.4F, 3.4F, 0F, -0.4F, 3.4F); // Box163
        ice1Model[162].setRotationPoint(-92F, 5F, -5F);

        ice1Model[163].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0.3F, 0.6F, 1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.3F, 0.6F, 1F, 0.3F, -0.6F, 1F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F, 0.3F, -0.6F, 1F); // Box164
        ice1Model[163].setRotationPoint(-107F, 9F, -5F);

        ice1Model[164].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.6F, 0.6F); // Box165
        ice1Model[164].setRotationPoint(-100F, 9F, -5F);

        ice1Model[165].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F, 0F, -0.6F, 0.6F); // Box166
        ice1Model[165].setRotationPoint(-104F, 9F, -5F);

        ice1Model[166].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0.4F, 4.4F, 0F, 0.4F, 4.4F, 0F, 0.4F, 4.4F, 0F, 0.4F, 4.4F, 0F, -0.3F, 3F, 0F, -0.3F, 3F, 0F, -0.3F, 3F, 0F, -0.3F, 3F); // Box167
        ice1Model[166].setRotationPoint(-92F, 8F, -4F);

        ice1Model[167].addShapeBox(0F, 0F, 0F, 4, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box168
        ice1Model[167].setRotationPoint(8F, -15F, -6F);

        ice1Model[168].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.7F, -2.6F, 0F, 0.7F, -2.6F, 0F, 0.7F, -2.6F, 0F, 0.7F, -2.6F); // Box169
        ice1Model[168].setRotationPoint(7F, 7F, -7F);

        ice1Model[169].addShapeBox(0F, 0F, 0F, 1, 23, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box170
        ice1Model[169].setRotationPoint(7F, -16F, -9F);

        ice1Model[170].addShapeBox(0F, 0F, 0F, 6, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box171
        ice1Model[170].setRotationPoint(8F, -15F, -3F);

        ice1Model[171].addShapeBox(0F, 0F, 0F, 7, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box172
        ice1Model[171].setRotationPoint(8F, -15F, 0F);

        ice1Model[172].addShapeBox(0F, 0F, 0F, 6, 22, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box173
        ice1Model[172].setRotationPoint(8F, -15F, 3F);

        ice1Model[173].addShapeBox(0F, 0F, 0F, 4, 22, 3, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box174
        ice1Model[173].setRotationPoint(8F, -15F, 6F);

        ice1Model[174].addShapeBox(0F, 0F, 0F, 1, 20, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box175
        ice1Model[174].setRotationPoint(-80F, -16F, -9F);

        ice1Model[175].addShapeBox(0F, 0F, 0F, 43, 26, 1, 0F, -0.3F, 0F, 0F, -39.8F, 0F, 0F, -39.8F, 0F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, -24F, 0F, -39.8F, -24F, 0F, -39.8F, -24F, 0.05F, -0.3F, -24F, 0.05F); // Box177
        ice1Model[175].setRotationPoint(-8F, 1F, 12F);

        ice1Model[176].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box178
        ice1Model[176].setRotationPoint(-99F, -5F, 7F);

        ice1Model[177].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box179
        ice1Model[177].setRotationPoint(-80F, -17F, -9F);

        ice1Model[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box180
        ice1Model[178].setRotationPoint(-97F, -6F, 0F);

        ice1Model[179].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, 1F, 0F, -4.8F, -2F, 0F, -5F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, -2F, -5F, -2F, -2F, -5F); // Box181
        ice1Model[179].setRotationPoint(-100F, -7F, 7F);

        ice1Model[180].addShapeBox(0F, 0F, 0F, 7, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box182
        ice1Model[180].setRotationPoint(-100F, -5F, -9F);

        ice1Model[181].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box183
        ice1Model[181].setRotationPoint(-91F, 0F, 3F);

        ice1Model[182].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0F, 0F, 0F, -1F, 0F, 0.2F, -1F, 0F, -4.8F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, -2F, -5F); // Box184
        ice1Model[182].setRotationPoint(-100F, -7F, 2F);

        ice1Model[183].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, -1F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, -5.2F, 0F, 0F, -5F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, -5F, 0F, -2F, -5F); // Box185
        ice1Model[183].setRotationPoint(-100F, -7F, -3F);

        ice1Model[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box186
        ice1Model[184].setRotationPoint(-97F, -6F, 1F);

        ice1Model[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.3F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.2F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box187
        ice1Model[185].setRotationPoint(-97F, -6F, 6F);

        ice1Model[186].addShapeBox(0F, 0F, 0F, 8, 9, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box188
        ice1Model[186].setRotationPoint(-103F, -5F, -4F);

        ice1Model[187].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box189
        ice1Model[187].setRotationPoint(-92F, -2F, 1F);

        ice1Model[188].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box190
        ice1Model[188].setRotationPoint(-87F, -8F, 1F);

        ice1Model[189].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box191
        ice1Model[189].setRotationPoint(-86F, -11F, 2F);

        ice1Model[190].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box192
        ice1Model[190].setRotationPoint(-92F, -5F, 0F);

        ice1Model[191].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box193
        ice1Model[191].setRotationPoint(-92F, -5F, 8F);

        ice1Model[192].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box194
        ice1Model[192].setRotationPoint(-1F, 7F, -7F);

        ice1Model[193].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box195
        ice1Model[193].setRotationPoint(-3F, 5F, 8F);

        ice1Model[194].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box196
        ice1Model[194].setRotationPoint(-3F, 5F, -4F);

        ice1Model[195].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box197
        ice1Model[195].setRotationPoint(-29F, 5F, 8F);

        ice1Model[196].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box198
        ice1Model[196].setRotationPoint(-29F, 5F, -4F);

        ice1Model[197].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box199
        ice1Model[197].setRotationPoint(-27F, 7F, -7F);

        ice1Model[198].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box200
        ice1Model[198].setRotationPoint(-27F, 5F, -6F);

        ice1Model[199].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box201
        ice1Model[199].setRotationPoint(-1F, 5F, -6F);

        ice1Model[200].addShapeBox(0F, 0F, 0F, 25, 1, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box202
        ice1Model[200].setRotationPoint(-26F, 7F, -6F);

        ice1Model[201].addShapeBox(0F, 0F, 0F, 19, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F); // Box203
        ice1Model[201].setRotationPoint(-23F, 5F, -6F);

        ice1Model[202].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box204
        ice1Model[202].setRotationPoint(-17F, 7F, -8F);

        ice1Model[203].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box205
        ice1Model[203].setRotationPoint(-17F, 8F, -7F);

        ice1Model[204].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box206
        ice1Model[204].setRotationPoint(-17F, 8F, 8F);

        ice1Model[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box207
        ice1Model[205].setRotationPoint(-16F, 5F, -8F);

        ice1Model[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box208
        ice1Model[206].setRotationPoint(-12F, 5F, -8F);

        ice1Model[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box209
        ice1Model[207].setRotationPoint(-16F, 5F, 9F);

        ice1Model[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box210
        ice1Model[208].setRotationPoint(-12F, 5F, 9F);

        ice1Model[209].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box211
        ice1Model[209].setRotationPoint(-63F, 7F, -7F);

        ice1Model[210].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box212
        ice1Model[210].setRotationPoint(-65F, 5F, 8F);

        ice1Model[211].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box213
        ice1Model[211].setRotationPoint(-65F, 5F, -4F);

        ice1Model[212].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box214
        ice1Model[212].setRotationPoint(-91F, 5F, 8F);

        ice1Model[213].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -0.5F, 0F, -15F, -0.5F); // Box215
        ice1Model[213].setRotationPoint(-91F, 5F, -4F);

        ice1Model[214].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box216
        ice1Model[214].setRotationPoint(-89F, 7F, -7F);

        ice1Model[215].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box217
        ice1Model[215].setRotationPoint(-89F, 5F, -6F);

        ice1Model[216].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box218
        ice1Model[216].setRotationPoint(-63F, 5F, -6F);

        ice1Model[217].addShapeBox(0F, 0F, 0F, 25, 1, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box219
        ice1Model[217].setRotationPoint(-88F, 7F, -6F);

        ice1Model[218].addShapeBox(0F, 0F, 0F, 19, 2, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F); // Box220
        ice1Model[218].setRotationPoint(-85F, 5F, -6F);

        ice1Model[219].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box221
        ice1Model[219].setRotationPoint(-79F, 7F, -8F);

        ice1Model[220].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box222
        ice1Model[220].setRotationPoint(-79F, 8F, -7F);

        ice1Model[221].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box223
        ice1Model[221].setRotationPoint(-79F, 8F, 8F);

        ice1Model[222].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box224
        ice1Model[222].setRotationPoint(-78F, 5F, -8F);

        ice1Model[223].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box225
        ice1Model[223].setRotationPoint(-74F, 5F, -8F);

        ice1Model[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box226
        ice1Model[224].setRotationPoint(-78F, 5F, 9F);

        ice1Model[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box227
        ice1Model[225].setRotationPoint(-74F, 5F, 9F);

        ice1Model[226].addShapeBox(0F, 0F, 0F, 43, 26, 1, 0F, -0.3F, 0F, 0.05F, -39.8F, 0F, 0.05F, -39.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -24F, 0.05F, -39.8F, -24F, 0.05F, -39.8F, -24F, 0F, -0.3F, -24F, 0F); // Box228
        ice1Model[226].setRotationPoint(-8F, 1F, -10F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 227; i++)
        {
            ice1Model[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo ice1Model[];
}
