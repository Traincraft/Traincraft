package train.client.render.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;
import train.client.tmt.Tessellator;
import train.common.library.Info;

public class ModelEMDF3 extends ModelBase
{
    int textureX = 1024;
    int textureY = 512;

    public ModelEMDF3()
    {
		emdf3Model = new ModelRendererTurbo[244];
		emdf3Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box001
		emdf3Model[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box002
		emdf3Model[2] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box003
		emdf3Model[3] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box004
		emdf3Model[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box005
		emdf3Model[5] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box006
		emdf3Model[6] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box007
		emdf3Model[7] = new ModelRendererTurbo(this, 803, 27, textureX, textureY); // Box008
		emdf3Model[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box009
		emdf3Model[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box010
		emdf3Model[10] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box011
		emdf3Model[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box012
		emdf3Model[12] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box013
		emdf3Model[13] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box014
		emdf3Model[14] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box015
		emdf3Model[15] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box016
		emdf3Model[16] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box017
		emdf3Model[17] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box018
		emdf3Model[18] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box019
		emdf3Model[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box020
		emdf3Model[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box021
		emdf3Model[21] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box022
		emdf3Model[22] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box023
		emdf3Model[23] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box024
		emdf3Model[24] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box025
		emdf3Model[25] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box026
		emdf3Model[26] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box027
		emdf3Model[27] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box028
		emdf3Model[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box029
		emdf3Model[29] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box030
		emdf3Model[30] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box031
		emdf3Model[31] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box032
		emdf3Model[32] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box033
		emdf3Model[33] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box034
		emdf3Model[34] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box035
		emdf3Model[35] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box036
		emdf3Model[36] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box037
		emdf3Model[37] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box038
		emdf3Model[38] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box039
		emdf3Model[39] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box040
		emdf3Model[40] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box041
		emdf3Model[41] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box042
		emdf3Model[42] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box043
		emdf3Model[43] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box044
		emdf3Model[44] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box045
		emdf3Model[45] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box046
		emdf3Model[46] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box047
		emdf3Model[47] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box048
		emdf3Model[48] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box049
		emdf3Model[49] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box050
		emdf3Model[50] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box051
		emdf3Model[51] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box052
		emdf3Model[52] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box053
		emdf3Model[53] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box054
		emdf3Model[54] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box055
		emdf3Model[55] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box056
		emdf3Model[56] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box057
		emdf3Model[57] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box058
		emdf3Model[58] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box059
		emdf3Model[59] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box060
		emdf3Model[60] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box061
		emdf3Model[61] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box062
		emdf3Model[62] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box063
		emdf3Model[63] = new ModelRendererTurbo(this, 617, 161, textureX, textureY); // Box064
		emdf3Model[64] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box065
		emdf3Model[65] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box066
		emdf3Model[66] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box067
		emdf3Model[67] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box068
		emdf3Model[68] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box069
		emdf3Model[69] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box071
		emdf3Model[70] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box072
		emdf3Model[71] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box073
		emdf3Model[72] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box074
		emdf3Model[73] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box075
		emdf3Model[74] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box076
		emdf3Model[75] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box077
		emdf3Model[76] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box078
		emdf3Model[77] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box079
		emdf3Model[78] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box080
		emdf3Model[79] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box081
		emdf3Model[80] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box082
		emdf3Model[81] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box083
		emdf3Model[82] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box087
		emdf3Model[83] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box088
		emdf3Model[84] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box089
		emdf3Model[85] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box090
		emdf3Model[86] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box091
		emdf3Model[87] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box092
		emdf3Model[88] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box093
		emdf3Model[89] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box094
		emdf3Model[90] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box095
		emdf3Model[91] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box096
		emdf3Model[92] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box097
		emdf3Model[93] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box098
		emdf3Model[94] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box099
		emdf3Model[95] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box100
		emdf3Model[96] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box101
		emdf3Model[97] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box102
		emdf3Model[98] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box103
		emdf3Model[99] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box104
		emdf3Model[100] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box105
		emdf3Model[101] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box106
		emdf3Model[102] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box107
		emdf3Model[103] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box108
		emdf3Model[104] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box109
		emdf3Model[105] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box110
		emdf3Model[106] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box111
		emdf3Model[107] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box112
		emdf3Model[108] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box113
		emdf3Model[109] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box114
		emdf3Model[110] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box115
		emdf3Model[111] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box116
		emdf3Model[112] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box117
		emdf3Model[113] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box118
		emdf3Model[114] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box119
		emdf3Model[115] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box120
		emdf3Model[116] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box121
		emdf3Model[117] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box122
		emdf3Model[118] = new ModelRendererTurbo(this, 205, 192, textureX, textureY); // Box123
		emdf3Model[119] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box125
		emdf3Model[120] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box126
		emdf3Model[121] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box127
		emdf3Model[122] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box128
		emdf3Model[123] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box130
		emdf3Model[124] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box131
		emdf3Model[125] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box132
		emdf3Model[126] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box133
		emdf3Model[127] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box134
		emdf3Model[128] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box135
		emdf3Model[129] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box136
		emdf3Model[130] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box138
		emdf3Model[131] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box140
		emdf3Model[132] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box141
		emdf3Model[133] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box142
		emdf3Model[134] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box143
		emdf3Model[135] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box144
		emdf3Model[136] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box145
		emdf3Model[137] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box146
		emdf3Model[138] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box148
		emdf3Model[139] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box149
		emdf3Model[140] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box151
		emdf3Model[141] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box152
		emdf3Model[142] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box153
		emdf3Model[143] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box155
		emdf3Model[144] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box156
		emdf3Model[145] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box157
		emdf3Model[146] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box163
		emdf3Model[147] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box164
		emdf3Model[148] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box165
		emdf3Model[149] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box168
		emdf3Model[150] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box170
		emdf3Model[151] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box172
		emdf3Model[152] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box174
		emdf3Model[153] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box175
		emdf3Model[154] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box177
		emdf3Model[155] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box179
		emdf3Model[156] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box180
		emdf3Model[157] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box181
		emdf3Model[158] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box182
		emdf3Model[159] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box183
		emdf3Model[160] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box184
		emdf3Model[161] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box185
		emdf3Model[162] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box186
		emdf3Model[163] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box188
		emdf3Model[164] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box191
		emdf3Model[165] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box194
		emdf3Model[166] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box195
		emdf3Model[167] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box197
		emdf3Model[168] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box198
		emdf3Model[169] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box199
		emdf3Model[170] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box200
		emdf3Model[171] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box201
		emdf3Model[172] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box202
		emdf3Model[173] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box203
		emdf3Model[174] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box204
		emdf3Model[175] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box205
		emdf3Model[176] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box206
		emdf3Model[177] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box207
		emdf3Model[178] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box208
		emdf3Model[179] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); // Box209
		emdf3Model[180] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); // Box210
		emdf3Model[181] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box211
		emdf3Model[182] = new ModelRendererTurbo(this, 729, 225, textureX, textureY); // Box212
		emdf3Model[183] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box213
		emdf3Model[184] = new ModelRendererTurbo(this, 521, 241, textureX, textureY); // Box214
		emdf3Model[185] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Box215
		emdf3Model[186] = new ModelRendererTurbo(this, 953, 241, textureX, textureY); // Box216
		emdf3Model[187] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box217
		emdf3Model[188] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box218
		emdf3Model[189] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box219
		emdf3Model[190] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box220
		emdf3Model[191] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box221
		emdf3Model[192] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box222
		emdf3Model[193] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Box223
		emdf3Model[194] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box224
		emdf3Model[195] = new ModelRendererTurbo(this, 697, 265, textureX, textureY); // Box225
		emdf3Model[196] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box226
		emdf3Model[197] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box227
		emdf3Model[198] = new ModelRendererTurbo(this, 777, 265, textureX, textureY); // Box228
		emdf3Model[199] = new ModelRendererTurbo(this, 553, 265, textureX, textureY); // Box229
		emdf3Model[200] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box230
		emdf3Model[201] = new ModelRendererTurbo(this, 609, 281, textureX, textureY); // Box231
		emdf3Model[202] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box232
		emdf3Model[203] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box233
		emdf3Model[204] = new ModelRendererTurbo(this, 697, 281, textureX, textureY); // Box234
		emdf3Model[205] = new ModelRendererTurbo(this, 921, 281, textureX, textureY); // Box235
		emdf3Model[206] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box236
		emdf3Model[207] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box237
		emdf3Model[208] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box238
		emdf3Model[209] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box239
		emdf3Model[210] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box240
		emdf3Model[211] = new ModelRendererTurbo(this, 537, 289, textureX, textureY); // Box241
		emdf3Model[212] = new ModelRendererTurbo(this, 761, 289, textureX, textureY); // Box242
		emdf3Model[213] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box243
		emdf3Model[214] = new ModelRendererTurbo(this, 833, 289, textureX, textureY); // Box244
		emdf3Model[215] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box246
		emdf3Model[216] = new ModelRendererTurbo(this, 889, 289, textureX, textureY); // Box247
		emdf3Model[217] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 337
		emdf3Model[218] = new ModelRendererTurbo(this, 24, 297, textureX, textureY); // Box 338
		emdf3Model[219] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 339
		emdf3Model[220] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 340
		emdf3Model[221] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 341
		emdf3Model[222] = new ModelRendererTurbo(this, 169, 296, textureX, textureY); // Box 342
		emdf3Model[223] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 343
		emdf3Model[224] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 344
		emdf3Model[225] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Box 345
		emdf3Model[226] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 346
		emdf3Model[227] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 347
		emdf3Model[228] = new ModelRendererTurbo(this, 681, 241, textureX, textureY); // Box 348
		emdf3Model[229] = new ModelRendererTurbo(this, 985, 281, textureX, textureY); // Box 349
		emdf3Model[230] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Box 350
		emdf3Model[231] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 351
		emdf3Model[232] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 352
		emdf3Model[233] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 353
		emdf3Model[234] = new ModelRendererTurbo(this, 537, 265, textureX, textureY); // Box 354
		emdf3Model[235] = new ModelRendererTurbo(this, 681, 281, textureX, textureY); // Box 355
		emdf3Model[236] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 356
		emdf3Model[237] = new ModelRendererTurbo(this, 817, 289, textureX, textureY); // Box 357
		emdf3Model[238] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 358
		emdf3Model[239] = new ModelRendererTurbo(this, 65, 141, textureX, textureY); // Box 248
		emdf3Model[240] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 249
		emdf3Model[241] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 248
		emdf3Model[242] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 249
		emdf3Model[243] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 250

		emdf3Model[0].addBox(0F, 0F, 0F, 62, 1, 22, 0F); // Box001
		emdf3Model[0].setRotationPoint(-52F, 1F, -11F);

		emdf3Model[1].addShapeBox(0F, 0F, -11F, 172, 92, 88, 0F, 0F, 0F, 0F, -129F, 0F, 0F, -129F, 0F, -66F, 0F, 0F,
				-66F, 0F, -69F, 0F, -129F, -69F, 0F, -129F, -69F, -66F, 0F, -69F, -66F); // Box002
		emdf3Model[1].setRotationPoint(-33F, -22F, 0F);

		emdf3Model[2].addShapeBox(0F, 0F, 0F, 44, 64, 1, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F,
				-48F, 0F, -33F, -48F, 0F, -33F, -48F, 0F, 0F, -48F, 0F); // Box003
		emdf3Model[2].setRotationPoint(-52F, -15F, -11F);

		emdf3Model[3].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -6F, -0.5F, 0F, -6F,
				0.25F, -6F, 0F, -3.5F, -6F, 0F, -3.5F, -6F, -6F, 0.25F, -6F, -6F); // Box004
		emdf3Model[3].setRotationPoint(-66F, -12F, -2F);

		emdf3Model[4].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F,
				-3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box005
		emdf3Model[4].setRotationPoint(-48F, -20F, 9F);

		emdf3Model[5].addShapeBox(0F, 0F, 0F, 57, 1, 2, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.25F, -0.75F, 0F,
				-0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box006
		emdf3Model[5].setRotationPoint(-47F, -23F, 9F);

		emdf3Model[6].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F,
				0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box007
		emdf3Model[6].setRotationPoint(-47F, -25F, -3F);

		emdf3Model[7].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box008
		emdf3Model[7].setRotationPoint(-47F, -22F, -11F);

		emdf3Model[8].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box009
		emdf3Model[8].setRotationPoint(-43F, -20F, -11F);

		emdf3Model[9].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box010
		emdf3Model[9].setRotationPoint(-43F, -20F, 10F);

		emdf3Model[10].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box011
		emdf3Model[10].setRotationPoint(-70F, 2F, -1.5F);

		emdf3Model[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box012
		emdf3Model[11].setRotationPoint(-46F, -25.9F, 1F);

		emdf3Model[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box013
		emdf3Model[12].setRotationPoint(-45F, -25.9F, -2F);

		emdf3Model[13].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box014
		emdf3Model[13].setRotationPoint(-47F, -22F, 9F);

		emdf3Model[14].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -3F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, 0F, 0F, 0F, -3F, 0F,
				0F, -3F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, -3F, -6F, 0F); // Box015
		emdf3Model[14].setRotationPoint(-70F, -9F, -8F);

		emdf3Model[15].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F,
				-6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6F, 0F, -3F, -6F, 0F); // Box016
		emdf3Model[15].setRotationPoint(-70F, -7F, -8F);

		emdf3Model[16].addShapeBox(0F, 0F, 0F, 52, 8, 8, 0F, 0F, -0.5F, -6.5F, -39F, -0.5F, -6.5F, -39F, 0F, 0F, 0F, 0F,
				0F, 0F, -6F, -6F, -39F, -6F, -6F, -39F, -6F, 0F, 0F, -6F, 0F); // Box017
		emdf3Model[16].setRotationPoint(-65.5F, -17.5F, -8F);

		emdf3Model[17].addShapeBox(0F, 0F, 0F, 52, 8, 8, 0F, 0F, 0F, -6F, -39F, 0F, -6F, -39F, 0F, 0F, 0F, 0F, 0F, 0F,
				-6.5F, -6.5F, -39F, -6.5F, -6.5F, -39F, -6F, 0F, 0F, -6F, 0F); // Box018
		emdf3Model[17].setRotationPoint(-65.5F, -15.5F, -8F);

		emdf3Model[18].addBox(0F, 0F, -11F, 4, 6, 22, 0F); // Box019
		emdf3Model[18].setRotationPoint(-32F, 2F, 0F);

		emdf3Model[19].addShapeBox(0F, 0F, -11F, 11, 3, 22, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box020
		emdf3Model[19].setRotationPoint(-28F, 2F, 0F);

		emdf3Model[20].addBox(0F, 0F, -11F, 9, 3, 22, 0F); // Box021
		emdf3Model[20].setRotationPoint(-27F, 5F, 0F);

		emdf3Model[21].addShapeBox(0F, 0F, -10F, 5, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F,
				-2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box022
		emdf3Model[21].setRotationPoint(-24F, 8F, 0F);

		emdf3Model[22].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F, 2F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 3F, 0.15F,
				0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F); // Box023
		emdf3Model[22].setRotationPoint(-48F, -21F, -1F);

		emdf3Model[23].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F, 3F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 2F, 0.15F,
				0F, 5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box024
		emdf3Model[23].setRotationPoint(-48F, -21F, 0F);

		emdf3Model[24].addShapeBox(0F, 0F, -2F, 18, 16, 8, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -0.25F, 0F,
				-6F, 0F, -12F, 0F, -3F, -12F, 0F, -3F, -12F, -6F, 0F, -12F, -6F); // Box025
		emdf3Model[24].setRotationPoint(-67F, -2F, 0F);

		emdf3Model[25].addShapeBox(0F, 0F, 0F, 21, 16, 16, 0F, -1.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -12F, -0.25F, 0F,
				-12F, -1.25F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, -12F, 0F, -12F, -12F); // Box026
		emdf3Model[25].setRotationPoint(-67F, -2F, -6F);

		emdf3Model[26].addShapeBox(0F, 0F, 0F, 29, 16, 16, 0F, -4.5F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -12F, -0.5F, 0F,
				-12F, -4.25F, -12F, 0F, -15F, -12F, 0F, -15F, -12F, -12F, -0.25F, -12F, -12F); // Box027
		emdf3Model[26].setRotationPoint(-66F, -2F, -10F);

		emdf3Model[27].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -2.75F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -3F, -0.5F, 0F,
				-3F, -2.75F, -12F, 0F, -30F, -12F, 0F, -30F, -12F, -3F, -0.25F, -12F, -3F); // Box028
		emdf3Model[27].setRotationPoint(-62F, -2F, -11F);

		emdf3Model[28].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -2.75F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -3F, -0.75F, 0F,
				-3F, -2.75F, -12F, 0F, -30F, -12F, 0F, -30F, -12F, -3F, -0.5F, -12F, -3F); // Box029
		emdf3Model[28].setRotationPoint(-62F, -6F, -11F);

		emdf3Model[29].addShapeBox(0F, 0F, 0F, 20, 16, 16, 0F, -4.75F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -12F, -0.75F, 0F,
				-12F, -4.5F, -12F, 0F, -15F, -12F, 0F, -15F, -12F, -12F, -0.5F, -12F, -12F); // Box030
		emdf3Model[29].setRotationPoint(-66F, -6F, -10F);

		emdf3Model[30].addShapeBox(0F, 0F, 0F, 8, 16, 16, 0F, -1.75F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -12F, -0.5F, 0F,
				-12F, -1.5F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, -12F, -0.25F, -12F, -12F); // Box031
		emdf3Model[30].setRotationPoint(-67F, -6F, -6F);

		emdf3Model[31].addShapeBox(0F, 0F, 0F, 8, 16, 16, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -12F, -0.75F, 0F, -12F,
				-1.75F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, -12F, -0.5F, -12F, -12F); // Box032
		emdf3Model[31].setRotationPoint(-67F, -10F, -6F);

		emdf3Model[32].addShapeBox(0F, 0F, 0F, 24, 16, 16, 0F, -5F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -12F, -1F, 0F, -12F,
				-4.75F, -12F, 0F, -18F, -12F, 0F, -18F, -12F, -12F, -0.75F, -12F, -12F); // Box033
		emdf3Model[32].setRotationPoint(-66F, -10F, -10F);

		emdf3Model[33].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -2.75F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -3F, -1F, 0F, -3F,
				-2.75F, -12F, 0F, -30F, -12F, 0F, -30F, -12F, -3F, -0.75F, -12F, -3F); // Box034
		emdf3Model[33].setRotationPoint(-62F, -10F, -11F);

		emdf3Model[34].addShapeBox(0F, 0F, 0F, 12, 8, 16, 0F, -2.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -12F, -1.5F, 0F,
				-12F, -2F, -6F, 0F, -9F, -6F, 0F, -9F, -6F, -12F, -0.75F, -6F, -12F); // Box035
		emdf3Model[34].setRotationPoint(-67F, -12F, -6F);

		emdf3Model[35].addShapeBox(0F, 0F, 0F, 28, 8, 16, 0F, -5.5F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -12F, -1.5F, 0F,
				-12F, -5F, -6F, 0F, -21F, -6F, 0F, -21F, -6F, -12F, -1F, -6F, -12F); // Box036
		emdf3Model[35].setRotationPoint(-66F, -12F, -10F);

		emdf3Model[36].addShapeBox(0F, 0F, 0F, 40, 8, 4, 0F, -3.25F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -3F, -1.5F, 0F,
				-3F, -2.75F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, -3F, -1F, -6F, -3F); // Box037
		emdf3Model[36].setRotationPoint(-62F, -12F, -11F);

		emdf3Model[37].addShapeBox(0F, 0F, 0F, 16, 8, 16, 0F, -3.5F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, -2.5F, 0F,
				-12F, -2.5F, -6F, 0F, -12F, -6F, 0F, -12F, -6F, -12F, -1.5F, -6F, -12F); // Box038
		emdf3Model[37].setRotationPoint(-67F, -14F, -6F);

		emdf3Model[38].addShapeBox(0F, 0F, 0F, 32, 8, 16, 0F, -6.5F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -12F, -2.5F, 0F,
				-12F, -5.5F, -6F, 0F, -24F, -6F, 0F, -24F, -6F, -12F, -1.5F, -6F, -12F); // Box039
		emdf3Model[38].setRotationPoint(-66F, -14F, -10F);

		emdf3Model[39].addShapeBox(0F, 0F, 0F, 40, 8, 4, 0F, -4.25F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -3F, -2.5F, 0F,
				-3F, -3.25F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, -3F, -1.5F, -6F, -3F); // Box040
		emdf3Model[39].setRotationPoint(-62F, -14F, -11F);

		emdf3Model[40].addShapeBox(0F, 0F, -2F, 8, 4, 8, 0F, -1.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, -1.5F, 0F, -6F,
				-0.5F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -6F, -0.5F, -3F, -6F); // Box041
		emdf3Model[40].setRotationPoint(-65F, -15F, 0F);

		emdf3Model[41].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -6F, -1.5F, 0F,
				-6F, -0.5F, -6F, 0F, -3.25F, -6F, 0F, -3.25F, -6F, -6F, -0.5F, -6F, -6F); // Box042
		emdf3Model[41].setRotationPoint(-66F, -14F, -2F);

		emdf3Model[42].addShapeBox(0F, 0F, 0F, 28, 4, 16, 0F, -6.5F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -12F, -2.55F, 0F,
				-12F, -5.5F, -3F, 0F, -21F, -3F, 0F, -21F, -3F, -12F, -1.5F, -3F, -12F); // Box043
		emdf3Model[42].setRotationPoint(-65F, -15F, -10F);

		emdf3Model[43].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, -3.55F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, -2.5F, 0F,
				-12F, -2.5F, -3F, 0F, -12F, -3F, 0F, -12F, -3F, -12F, -1.5F, -3F, -12F); // Box044
		emdf3Model[43].setRotationPoint(-66F, -15F, -6F);

		emdf3Model[44].addShapeBox(0F, 0F, 0F, 36, 4, 4, 0F, -4.25F, 0F, -0.25F, -27F, 0F, -0.25F, -27F, 0F, -3F, -2.5F,
				0F, -3F, -3.25F, -3F, 0F, -27F, -3F, 0F, -27F, -3F, -3F, -1.5F, -3F, -3F); // Box045
		emdf3Model[44].setRotationPoint(-61F, -15F, -11F);

		emdf3Model[45].addShapeBox(0F, 0F, 0F, 24, 4, 16, 0F, -4.05F, -0.5F, 0F, -18F, 0F, 0F, -18F, 0.25F, -12F, -2.5F,
				-0.25F, -12F, -2.55F, -3F, 0F, -18F, -3F, 0F, -18F, -3F, -12F, -1.5F, -3F, -12F); // Box046
		emdf3Model[45].setRotationPoint(-65F, -16F, -6F);

		emdf3Model[46].addShapeBox(0F, 0F, -2F, 16, 4, 8, 0F, -1.5F, -0.25F, 0F, -12F, 0F, 0F, -12F, 0F, -6F, -1.5F,
				-0.1F, -6F, -0.5F, -3F, 0F, -12F, -3F, 0F, -12F, -3F, -6F, -0.5F, -3F, -6F); // Box047
		emdf3Model[46].setRotationPoint(-64F, -16F, 0F);

		emdf3Model[47].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F, -1.45F, -0.6F, -0.45F, -17.75F, -0.6F, -0.45F, -17.75F,
				-0.6F, -3F, -0.5F, -0.6F, -3F, -1.25F, -3F, -0.25F, -17.75F, -3F, -0.25F, -17.75F, -3F, -3F, 0.5F, -3F,
				-3F); // Box048
		emdf3Model[47].setRotationPoint(-58F, -16F, -11F);

		emdf3Model[48].addShapeBox(0F, 0F, 0F, 20, 4, 16, 0F, 0F, -0.25F, 0F, -15F, -0.25F, 0F, -15F, 0.45F, -12F, 0F,
				0.45F, -12F, 0F, -2.75F, 0F, -15F, -2.75F, 0F, -15F, -3F, -12F, 0F, -3F, -12F); // Box049
		emdf3Model[48].setRotationPoint(-56F, -17F, -6F);

		emdf3Model[49].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, -0.75F, -3F, -15F, -0.75F, -2.5F, -15F, -0.25F, -15F,
				0F, -0.25F, -15F, 0F, -2.4F, -0.45F, -14.9F, -2.4F, -0.45F, -15F, -2.75F, -15F, 0F, -2.75F, -15F); // Box050
		emdf3Model[49].setRotationPoint(-56F, -17F, -11F);

		emdf3Model[50].addShapeBox(0F, 0F, 0F, 32, 4, 16, 0F, -6.5F, -0.6F, 0F, -24F, -0.6F, 0F, -24F, 0.05F, -12F,
				-3.05F, -0.5F, -12F, -5.5F, -3F, 0F, -24F, -3F, 0F, -24F, -3F, -12F, -1.55F, -3F, -12F); // Box051
		emdf3Model[50].setRotationPoint(-64F, -16F, -10F);

		emdf3Model[51].addShapeBox(0F, 0F, 0F, 20, 4, 8, 0F, 0F, 0.45F, 0F, -15F, 0.45F, 0F, -15F, 0.5F, -6F, 0F, 0.5F,
				-6F, 0F, -3F, 0F, -15F, -3F, 0F, -15F, -3F, -6F, 0F, -3F, -6F); // Box052
		emdf3Model[51].setRotationPoint(-56F, -17F, -2F);

		emdf3Model[52].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F,
				-3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F); // Box053
		emdf3Model[52].setRotationPoint(-48F, -20F, -11F);

		emdf3Model[53].addBox(0F, 0F, -10F, 1, 16, 20, 0F); // Box054
		emdf3Model[53].setRotationPoint(-52F, -15F, 0F);

		emdf3Model[54].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -0.25F, -0.5F, -0.75F, -3F, -0.5F, -0.75F, -3F, -0.4F, -3F,
				-0.05F, -0.45F, -3F, -0.45F, -3.4F, -0.45F, -3F, -3.4F, -0.45F, -3F, -3.4F, -3F, 0.5F, -3.4F, -3F); // Box055
		emdf3Model[54].setRotationPoint(-57F, -16F, -11F);

		emdf3Model[55].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F, 0F, 0.25F, 0F, -12F, 0.45F, 0F, -12F, 0.5F, -6F, 0F, 0.5F,
				-6F, 0F, -2.85F, 0F, -12F, -3F, 0F, -12F, -3F, -6F, 0F, -2.85F, -6F); // Box056
		emdf3Model[55].setRotationPoint(-60F, -17F, -2F);

		emdf3Model[56].addShapeBox(0F, 0F, -2F, 12, 4, 8, 0F, -1.95F, -0.25F, 0F, -9F, 0.25F, 0F, -9F, 0.5F, -6F,
				-1.95F, 0F, -6F, -0.5F, -2.75F, 0F, -9F, -3F, 0F, -9F, -3F, -6F, -0.5F, -2.9F, -6F); // Box057
		emdf3Model[56].setRotationPoint(-63F, -17F, 0F);

		emdf3Model[57].addShapeBox(0F, 0F, 0F, 32, 60, 0, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F,
				-45F, 0F, -24F, -45F, 0F, -24F, -45F, 0F, 0F, -45F, 0F); // Box058
		emdf3Model[57].setRotationPoint(-41F, -20F, -11F);

		emdf3Model[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F,
				-0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box059
		emdf3Model[58].setRotationPoint(-47F, -20F, -10.79F);

		emdf3Model[59].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box060
		emdf3Model[59].setRotationPoint(-47F, -20F, 9.79F);

		emdf3Model[60].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, -1.25F, -0.75F, 0F, -12F, -0.25F, 0F, -12F, 0.45F, -12F,
				0F, 0.25F, -12F, -1.25F, -2.55F, 0F, -12F, -2.75F, 0F, -12F, -3F, -12F, 0F, -3F, -12F); // Box061
		emdf3Model[60].setRotationPoint(-60F, -17F, -6F);

		emdf3Model[61].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, -4.4F, -1F, 0F, -10.75F, -0.75F, 0F, -12F, 0.25F, -12F,
				-2.95F, -0.25F, -12F, -3.05F, -2.5F, 0F, -10.75F, -2.5F, 0F, -12F, -3F, -12F, -1.5F, -2.75F, -12F); // Box062
		emdf3Model[61].setRotationPoint(-64F, -17F, -6F);

		emdf3Model[62].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, -3.05F, -0.45F, 0F, -0.9F, -0.45F, 0F, -2.75F, 0.25F, -12F,
				-0.4F, 0F, -12F, -2.45F, -3.4F, 0F, -1F, -3.25F, 0F, -3F, -3.25F, -12F, 0.95F, -3.5F, -12F); // Box063
		emdf3Model[62].setRotationPoint(-60F, -16F, -10F);

		emdf3Model[63].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, -0.05F, -1.05F, -2.3F, -6F, -0.75F, -2F, -6F, -0.25F, -12F,
				0.75F, -0.75F, -12F, -1.1F, -2.55F, 0F, -6F, -2.6F, 0F, -6F, -3F, -12F, 0.8F, -2.7F, -12F); // Box064
		emdf3Model[63].setRotationPoint(-58F, -17F, -10F);

		emdf3Model[64].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box065
		emdf3Model[64].setRotationPoint(-15F, -26.75F, 0F);

		emdf3Model[65].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box066
		emdf3Model[65].setRotationPoint(-3F, -26.75F, 0F);

		emdf3Model[66].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0.75F, 0.85F, 0F, 0.75F, 0.85F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box067
		emdf3Model[66].setRotationPoint(-53F, -17F, 0F);

		emdf3Model[67].addShapeBox(0F, 0F, 0F, 0, 8, 16, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 1.3F, 0F, -8F, -1.3F, 0F, -8F,
				0F, -3.45F, 0F, 0F, -3.45F, 0F, 0F, -4.85F, -8F, 0F, -4.85F, -8F); // Box068
		emdf3Model[67].setRotationPoint(-51F, -21F, -9F);

		emdf3Model[68].addShapeBox(0F, 0F, 0F, 0, 8, 16, 0F, -1.3F, 0F, -8F, 1.3F, 0F, -8F, 2F, -1F, 0F, -2F, -1F, 0F,
				0F, -4.85F, -8F, 0F, -4.85F, -8F, 0F, -3.45F, 0F, 0F, -3.45F, 0F); // Box069
		emdf3Model[68].setRotationPoint(-51F, -21F, -7F);

		emdf3Model[69].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F,
				0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box071
		emdf3Model[69].setRotationPoint(4F, -25F, -3F);

		emdf3Model[70].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box072
		emdf3Model[70].setRotationPoint(-19F, -25.75F, -2F);

		emdf3Model[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box073
		emdf3Model[71].setRotationPoint(-20F, -25.75F, -2F);

		emdf3Model[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box074
		emdf3Model[72].setRotationPoint(-17F, -25.75F, -2F);

		emdf3Model[73].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box075
		emdf3Model[73].setRotationPoint(-12F, -25.75F, -2F);

		emdf3Model[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box076
		emdf3Model[74].setRotationPoint(-13F, -25.75F, -2F);

		emdf3Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box077
		emdf3Model[75].setRotationPoint(-10F, -25.75F, -2F);

		emdf3Model[76].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box078
		emdf3Model[76].setRotationPoint(-7F, -25.75F, -2F);

		emdf3Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box079
		emdf3Model[77].setRotationPoint(-8F, -25.75F, -2F);

		emdf3Model[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box080
		emdf3Model[78].setRotationPoint(-5F, -25.75F, -2F);

		emdf3Model[79].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box081
		emdf3Model[79].setRotationPoint(0F, -25.75F, -2F);

		emdf3Model[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box082
		emdf3Model[80].setRotationPoint(-1F, -25.75F, -2F);

		emdf3Model[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box083
		emdf3Model[81].setRotationPoint(2F, -25.75F, -2F);

		emdf3Model[82].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box087
		emdf3Model[82].setRotationPoint(-50F, -22F, -11F);

		emdf3Model[83].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box088
		emdf3Model[83].setRotationPoint(-50F, -22F, 9F);

		emdf3Model[84].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -0.35F, -0.7F, 0F, 0F, -0.7F, 0F, -0.25F, 0.85F, 0F, 0F,
				1.05F, 1.2F, 0.35F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0.35F, 0F, 0F); // Box089
		emdf3Model[84].setRotationPoint(-52F, -17F, -10F);

		emdf3Model[85].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 1.05F, 1.2F, -0.25F, 0.85F, 0F, 0F, -0.7F, 0F, -0.35F,
				-0.7F, 0F, 0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.35F, 0.35F, 0F, -0.35F); // Box090
		emdf3Model[85].setRotationPoint(-52F, -17F, 1F);

		emdf3Model[86].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, -1.5F, -1F, 0F, 1F, -1F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F,
				-0.8F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 0F, 1F, -0.15F, 0F); // Box091
		emdf3Model[86].setRotationPoint(-50F, -23F, -9F);

		emdf3Model[87].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 1F, -1F, 0F, -1.5F, -1F, 0F,
				1F, -0.15F, 0F, 0F, 0F, 0F, 0.3F, 1F, 0F, -0.8F, 1F, 0F); // Box092
		emdf3Model[87].setRotationPoint(-50F, -23F, 0F);

		emdf3Model[88].addShapeBox(0F, 0F, -3F, 25, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F,
				-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box093
		emdf3Model[88].setRotationPoint(-21F, -25F, 0F);

		emdf3Model[89].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F,
				0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box094
		emdf3Model[89].setRotationPoint(-47F, -24F, 8F);

		emdf3Model[90].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box095
		emdf3Model[90].setRotationPoint(-33F, -24F, 0F);

		emdf3Model[91].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box096
		emdf3Model[91].setRotationPoint(9F, -24F, 0F);

		emdf3Model[92].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, -0.5F, 1F, 1.5F, -0.5F, 1F, 1F, -1F, 0F, 0F, -1F, 0F,
				0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box097
		emdf3Model[92].setRotationPoint(-47F, -25F, 6F);

		emdf3Model[93].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, -1.1F, 1F, 2F, -1.1F, 1F, 1.5F, -1.5F, 0F, 0F, -1.5F,
				0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box098
		emdf3Model[93].setRotationPoint(-47F, -26F, 4F);

		emdf3Model[94].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, -1.5F, 0F, 1.5F, -1.5F, 0F, 2F, -1.1F, 1F, 0F, -1.1F,
				1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F); // Box099
		emdf3Model[94].setRotationPoint(-47F, -26F, -5F);

		emdf3Model[95].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1.5F, -0.5F, 1F, 0F, -0.5F, 1F,
				0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Box100
		emdf3Model[95].setRotationPoint(-47F, -25F, -7F);

		emdf3Model[96].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 1F, 0F, 1F, 0F, 0F, 1F,
				0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box101
		emdf3Model[96].setRotationPoint(-47F, -24F, -9F);

		emdf3Model[97].addShapeBox(0F, 0F, 0F, 57, 1, 2, 0F, 0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.5F, 0.25F, 0F,
				0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box102
		emdf3Model[97].setRotationPoint(-47F, -23F, -11F);

		emdf3Model[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.15F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F,
				0F, 0F, -0.4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box103
		emdf3Model[98].setRotationPoint(-48F, -23F, -10F);

		emdf3Model[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.25F, -0.4F, -0.2F,
				-0.15F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.4F, 0F, 1F); // Box104
		emdf3Model[99].setRotationPoint(-48F, -23F, 9F);

		emdf3Model[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.75F, 0.5F, 0F,
				-0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.15F, 0F); // Box105
		emdf3Model[100].setRotationPoint(-49F, -23F, -9F);

		emdf3Model[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.75F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -0.65F, 0.9F,
				0F, 0.3F, -0.15F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0.8F, -0.35F, 0F); // Box106
		emdf3Model[101].setRotationPoint(-49F, -23F, -7F);

		emdf3Model[102].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F,
				-1.25F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box107
		emdf3Model[102].setRotationPoint(9F, -25F, 0F);

		emdf3Model[103].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F,
				-1.75F, -7F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F); // Box108
		emdf3Model[103].setRotationPoint(9F, -26F, 0F);

		emdf3Model[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 0.9F, 0F, 0F, 1.5F, 0F, 0F, 1.9F, 0F, -0.65F,
				1.25F, 0F, 0.8F, -0.35F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0F, 1.25F, -0.6F, 0F); // Box109
		emdf3Model[104].setRotationPoint(-49F, -23F, -5F);

		emdf3Model[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 1.25F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -0.65F,
				1.35F, 0F, 1.25F, -0.6F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 1.45F, -0.9F, 0F); // Box110
		emdf3Model[105].setRotationPoint(-49F, -23F, -3F);

		emdf3Model[106].addShapeBox(0F, 0F, 0F, 8, 10, 0, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 3F, -5F,
				0F, -4F, -5F, 0F, -4F, -5F, 0F, 3F, -5F, 0F); // Box111
		emdf3Model[106].setRotationPoint(-47F, -20F, -10.5F);

		emdf3Model[107].addShapeBox(0F, 0F, 0F, 8, 10, 0, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 3F, -5F,
				0F, -4F, -5F, 0F, -4F, -5F, 0F, 3F, -5F, 0F); // Box112
		emdf3Model[107].setRotationPoint(-47F, -20F, 10.5F);

		emdf3Model[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.75F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F,
				0.3F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0.05F, 0F); // Box113
		emdf3Model[108].setRotationPoint(-49F, -23F, 7F);

		emdf3Model[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 0.9F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, -0.75F, 0.5F,
				0F, 0.8F, -0.35F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0.3F, -0.15F, 0F); // Box114
		emdf3Model[109].setRotationPoint(-49F, -23F, 5F);

		emdf3Model[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 1.25F, 0F, 0F, 1.9F, 0F, 0F, 1.5F, 0F, -0.65F,
				0.9F, 0F, 1.25F, -0.6F, 0F, 0F, -2.25F, 0F, 0F, -1.75F, 0F, 0.8F, -0.35F, 0F); // Box115
		emdf3Model[110].setRotationPoint(-49F, -23F, 3F);

		emdf3Model[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 1.35F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -0.65F,
				1.25F, 0F, 1.45F, -0.9F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 1.25F, -0.6F, 0F); // Box116
		emdf3Model[111].setRotationPoint(-49F, -23F, 1F);

		emdf3Model[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.65F, 1.35F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -0.65F,
				1.35F, 0F, 1.45F, -0.9F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 1.45F, -0.9F, 0F); // Box117
		emdf3Model[112].setRotationPoint(-49F, -23F, -1F);

		emdf3Model[113].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box118
		emdf3Model[113].setRotationPoint(-68F, 5F, -2F);

		emdf3Model[114].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F,
				0F, 3.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box119
		emdf3Model[114].setRotationPoint(-67F, 2F, -11F);

		emdf3Model[115].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -4F, 0F, 0F, 3.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F,
				0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box120
		emdf3Model[115].setRotationPoint(-67F, 5F, -11F);

		emdf3Model[116].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3.75F, 0F, 0F, -4F, 0F, 0F, 1F,
				0F, 0F, -2F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F); // Box121
		emdf3Model[116].setRotationPoint(-67F, 5F, 2F);

		emdf3Model[117].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, -1F, 0F,
				0F, 0F, 0F, 0F, 3.75F, 0F, 0F, -4F, 0F, 0F); // Box122
		emdf3Model[117].setRotationPoint(-67F, 2F, 2F);

		emdf3Model[118].addShapeBox(0F, 0F, 0F, 4, 16, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -12F, -0.4F, -3.8F, -12F, -0.4F, -3.8F, -12F, -3.4F, 0F, -12F, -3.4F); // Box123
		emdf3Model[118].setRotationPoint(-67F, -10F, 2.5F);

		emdf3Model[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F,
				-0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box125
		emdf3Model[119].setRotationPoint(-67F, -10F, 2.5F);

		emdf3Model[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F,
				-0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box126
		emdf3Model[120].setRotationPoint(-67F, -6.2F, 2.5F);

		emdf3Model[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F,
				-0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box127
		emdf3Model[121].setRotationPoint(-67F, -10F, -3.5F);

		emdf3Model[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F,
				-0.4F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F); // Box128
		emdf3Model[122].setRotationPoint(-67F, -6.2F, -3.5F);

		emdf3Model[123].addShapeBox(0F, 0F, 0F, 32, 24, 0, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F,
				-18F, 0F, -24F, -18F, 0F, -24F, -18F, 0F, 0F, -18F, 0F); // Box130
		emdf3Model[123].setRotationPoint(-41F, -5F, -11F);

		emdf3Model[124].addShapeBox(0F, 0F, 0F, 4, 88, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -66F, -0.4F, -3.8F, -66F, -0.4F, -3.8F, -66F, -3.4F, 0F, -66F, -3.4F); // Box131
		emdf3Model[124].setRotationPoint(-41.5F, -21F, -12F);

		emdf3Model[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box132
		emdf3Model[125].setRotationPoint(-41.5F, -21F, -12F);

		emdf3Model[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box133
		emdf3Model[126].setRotationPoint(-32.7F, -21F, -12F);

		emdf3Model[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box134
		emdf3Model[127].setRotationPoint(-32.7F, 0.4F, -12F);

		emdf3Model[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box135
		emdf3Model[128].setRotationPoint(-41.5F, 0.4F, -12F);

		emdf3Model[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box136
		emdf3Model[129].setRotationPoint(-41.5F, -21F, 11F);

		emdf3Model[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box138
		emdf3Model[130].setRotationPoint(-32.7F, -21F, 11F);

		emdf3Model[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box140
		emdf3Model[131].setRotationPoint(-41.5F, 0.4F, 11F);

		emdf3Model[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box141
		emdf3Model[132].setRotationPoint(-32.7F, 0.4F, 11F);

		emdf3Model[133].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F,
				-54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box142
		emdf3Model[133].setRotationPoint(10F, -18F, -4F);

		emdf3Model[134].addShapeBox(0F, 0F, 0F, 4, 8, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F,
				-6F, 0F, -3F, -6F, 0F, -3F, -6F, -36F, 0F, -6F, -36F); // Box143
		emdf3Model[134].setRotationPoint(10F, -20F, -6F);

		emdf3Model[135].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box144
		emdf3Model[135].setRotationPoint(-1.25F, -11F, -12F);

		emdf3Model[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box145
		emdf3Model[136].setRotationPoint(-1.25F, -11F, -12F);

		emdf3Model[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box146
		emdf3Model[137].setRotationPoint(3F, -11F, -12F);

		emdf3Model[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box148
		emdf3Model[138].setRotationPoint(-1.25F, 0.4F, -12F);

		emdf3Model[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box149
		emdf3Model[139].setRotationPoint(3F, 0.4F, -12F);

		emdf3Model[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box151
		emdf3Model[140].setRotationPoint(3F, -11F, 11F);

		emdf3Model[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box152
		emdf3Model[141].setRotationPoint(3F, 0.4F, 11F);

		emdf3Model[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box153
		emdf3Model[142].setRotationPoint(-1.25F, 0.4F, 11F);

		emdf3Model[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box155
		emdf3Model[143].setRotationPoint(-1.25F, -11F, 11F);

		emdf3Model[144].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box156
		emdf3Model[144].setRotationPoint(4F, 2F, -1.5F);

		emdf3Model[145].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // Box157
		emdf3Model[145].setRotationPoint(-38.5F, -4F, -12F);

		emdf3Model[146].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box163
		emdf3Model[146].setRotationPoint(-39F, 2F, -11F);

		emdf3Model[147].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box164
		emdf3Model[147].setRotationPoint(-36F, 2F, -11F);

		emdf3Model[148].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box165
		emdf3Model[148].setRotationPoint(-38F, 3.5F, -11F);

		emdf3Model[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box168
		emdf3Model[149].setRotationPoint(-1F, 2F, -11F);

		emdf3Model[150].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box170
		emdf3Model[150].setRotationPoint(2F, 2F, -11F);

		emdf3Model[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box172
		emdf3Model[151].setRotationPoint(-39F, 2F, 10F);

		emdf3Model[152].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box174
		emdf3Model[152].setRotationPoint(-36F, 2F, 10F);

		emdf3Model[153].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box175
		emdf3Model[153].setRotationPoint(-1F, 2F, 10F);

		emdf3Model[154].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box177
		emdf3Model[154].setRotationPoint(2F, 2F, 10F);

		emdf3Model[155].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.55F, 0F, -1F, -0.55F, 0F, 0.9F, -0.15F, 0F, -1.85F,
				-0.55F, 0F, 0.45F, -0.55F, -0.8F, -1F, -0.55F, -0.8F, 0.9F, -0.15F, -0.8F, -1.85F, -0.55F, -0.8F,
				0.45F); // Box179
		emdf3Model[155].setRotationPoint(-66F, -3F, -9F);

		emdf3Model[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0F, -0.4F, -1.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.5F,
				0F, 0.4F, 0.4F, -0.8F, -0.4F, -1.2F, -0.8F, -0.2F, -0.4F, -0.8F, 0F, -0.5F, -0.8F, 0.4F); // Box180
		emdf3Model[156].setRotationPoint(-65F, -3F, -8F);

		emdf3Model[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0F, -0.4F, -1.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.5F,
				0F, 0.4F, 0.4F, -0.8F, -0.4F, -1.2F, -0.8F, -0.2F, -0.4F, -0.8F, 0F, -0.5F, -0.8F, 0.4F); // Box181
		emdf3Model[157].setRotationPoint(-63F, -3F, -10F);

		emdf3Model[158].addShapeBox(0F, 0F, 0F, 4, 4, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F,
				-3F, 0F, -3F, -3F, 0F, -3F, -3F, -36F, 0F, -3F, -36F); // Box182
		emdf3Model[158].setRotationPoint(10F, 0F, -6F);

		emdf3Model[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.55F, 0F, 0.45F, -0.15F, 0F, -1.85F, -0.55F, 0F, 0.9F,
				-0.55F, 0F, -1F, -0.55F, -0.8F, 0.45F, -0.15F, -0.8F, -1.85F, -0.55F, -0.8F, 0.9F, -0.55F, -0.8F, -1F); // Box183
		emdf3Model[159].setRotationPoint(-66F, -3F, 8F);

		emdf3Model[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.4F, -0.4F, 0F, 0F, -1.2F, 0F, -0.2F, 0.4F, 0F,
				-0.4F, -0.5F, -0.8F, 0.4F, -0.4F, -0.8F, 0F, -1.2F, -0.8F, -0.2F, 0.4F, -0.8F, -0.4F); // Box184
		emdf3Model[160].setRotationPoint(-65F, -3F, 7F);

		emdf3Model[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.4F, -0.4F, 0F, 0F, -1.2F, 0F, -0.2F, 0.4F, 0F,
				-0.4F, -0.5F, -0.8F, 0.4F, -0.4F, -0.8F, 0F, -1.2F, -0.8F, -0.2F, 0.4F, -0.8F, -0.4F); // Box185
		emdf3Model[161].setRotationPoint(-63F, -3F, 9F);

		emdf3Model[162].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box186
		emdf3Model[162].setRotationPoint(7.5F, -7F, -12F);

		emdf3Model[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box188
		emdf3Model[163].setRotationPoint(7.5F, 0.4F, -12F);

		emdf3Model[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box191
		emdf3Model[164].setRotationPoint(9.5F, 0.4F, -12F);

		emdf3Model[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box194
		emdf3Model[165].setRotationPoint(7.5F, 0.4F, 11F);

		emdf3Model[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box195
		emdf3Model[166].setRotationPoint(9.5F, -7F, 11F);

		emdf3Model[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box197
		emdf3Model[167].setRotationPoint(9.5F, 0.4F, 11F);

		emdf3Model[168].addShapeBox(0F, 0F, -2.5F, 1, 8, 20, 0F, -3.75F, -3F, -0.7F, 3.5F, -3F, -1.4F, -0.05F, -3F,
				-15.05F, -0.25F, -3F, -15.75F, -3.75F, -3F, -0.7F, 3.5F, -3F, -1.4F, -0.05F, -3F, -15.05F, -0.25F, -3F,
				-15.75F); // Box198
		emdf3Model[168].setRotationPoint(-65F, -15F, -8.3F);

		emdf3Model[169].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F,
				-54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box199
		emdf3Model[169].setRotationPoint(10F, -18F, 6F);

		emdf3Model[170].addShapeBox(0F, 0F, -2F, 4, 16, 8, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -0.5F, 0F, -6F,
				-0.25F, -12F, 0F, -3F, -12F, 0F, -3F, -12F, -6F, -0.25F, -12F, -6F); // Box200
		emdf3Model[170].setRotationPoint(-67F, -6F, 0F);

		emdf3Model[171].addShapeBox(0F, 0F, -2F, 4, 16, 8, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -0.75F, 0F,
				-6F, -0.5F, -12F, 0F, -3F, -12F, 0F, -3F, -12F, -6F, -0.5F, -12F, -6F); // Box201
		emdf3Model[171].setRotationPoint(-67F, -10F, 0F);

		emdf3Model[172].addShapeBox(0F, 0F, 0F, 44, 64, 1, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F,
				-48F, 0F, -33F, -48F, 0F, -33F, -48F, 0F, 0F, -48F, 0F); // Box202
		emdf3Model[172].setRotationPoint(-52F, -15F, 10F);

		emdf3Model[173].addShapeBox(0F, 0F, 0F, 32, 60, 0, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F,
				-45F, 0F, -24F, -45F, 0F, -24F, -45F, 0F, 0F, -45F, 0F); // Box203
		emdf3Model[173].setRotationPoint(-41F, -20F, 11F);

		emdf3Model[174].addShapeBox(0F, 0F, 0F, 32, 24, 0, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F,
				-18F, 0F, -24F, -18F, 0F, -24F, -18F, 0F, 0F, -18F, 0F); // Box204
		emdf3Model[174].setRotationPoint(-41F, -5F, 11F);

		emdf3Model[175].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -0.5F, 0F, -6F, -3.5F, 0F, -6F, -3.5F, 0F, 0F, -0.5F, 0F,
				0F, 0.25F, -6F, -6F, -3.5F, -6F, -6F, -3.5F, -6F, 0F, 0.25F, -6F, 0F); // Box205
		emdf3Model[175].setRotationPoint(-66F, -12F, -6F);

		emdf3Model[176].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6.5F, -3F, -0.5F,
				-6.5F, -3F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, -3F, -6F, -6F); // Box206
		emdf3Model[176].setRotationPoint(-70F, -9F, 0F);

		emdf3Model[177].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F,
				-6F, 0F, 0F, -6F, 0F, 0F, -6.5F, -6.5F, -3F, -6.5F, -6.5F); // Box207
		emdf3Model[177].setRotationPoint(-70F, -7F, 0F);

		emdf3Model[178].addShapeBox(0F, 0F, 0F, 52, 8, 8, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -0.5F, -6.5F, 0F, -0.5F,
				-6.5F, 0F, -6F, 0F, -39F, -6F, 0F, -39F, -6F, -6F, 0F, -6F, -6F); // Box208
		emdf3Model[178].setRotationPoint(-65.5F, -17.5F, 0F);

		emdf3Model[179].addShapeBox(0F, 0F, 0F, 52, 8, 8, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -6F, 0F, 0F, -6F, 0F,
				-6F, 0F, -39F, -6F, 0F, -39F, -6.5F, -6.5F, 0F, -6.5F, -6.5F); // Box209
		emdf3Model[179].setRotationPoint(-65.5F, -15.5F, 0F);

		emdf3Model[180].addShapeBox(0F, 0F, -2F, 18, 16, 8, 0F, -0.25F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -0.25F, 0F,
				0F, 0F, -12F, -6F, -3F, -12F, -6F, -3F, -12F, 0F, 0F, -12F, 0F); // Box210
		emdf3Model[180].setRotationPoint(-67F, -2F, -4F);

		emdf3Model[181].addShapeBox(0F, 0F, 0F, 21, 16, 16, 0F, -0.25F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -1.5F, 0F,
				0F, 0F, -12F, -12F, -6F, -12F, -12F, -6F, -12F, 0F, -1.25F, -12F, 0F); // Box211
		emdf3Model[181].setRotationPoint(-67F, -2F, -10F);

		emdf3Model[182].addShapeBox(0F, 0F, 0F, 29, 16, 16, 0F, -0.5F, 0F, -12F, -15F, 0F, -12F, -15F, 0F, 0F, -4.5F,
				0F, 0F, -0.25F, -12F, -12F, -15F, -12F, -12F, -15F, -12F, 0F, -4.25F, -12F, 0F); // Box212
		emdf3Model[182].setRotationPoint(-66F, -2F, -6F);

		emdf3Model[183].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -0.5F, 0F, -3F, -30F, 0F, -3F, -30F, 0F, 0F, -2.75F, 0F,
				0F, -0.25F, -12F, -3F, -30F, -12F, -3F, -30F, -12F, 0F, -2.75F, -12F, 0F); // Box213
		emdf3Model[183].setRotationPoint(-62F, -2F, 7F);

		emdf3Model[184].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -0.75F, 0F, -3F, -30F, 0F, -3F, -30F, 0F, 0F, -2.75F, 0F,
				0F, -0.5F, -12F, -3F, -30F, -12F, -3F, -30F, -12F, 0F, -2.75F, -12F, 0F); // Box214
		emdf3Model[184].setRotationPoint(-62F, -6F, 7F);

		emdf3Model[185].addShapeBox(0F, 0F, 0F, 20, 16, 16, 0F, -0.75F, 0F, -12F, -15F, 0F, -12F, -15F, 0F, 0F, -4.75F,
				0F, 0F, -0.5F, -12F, -12F, -15F, -12F, -12F, -15F, -12F, 0F, -4.5F, -12F, 0F); // Box215
		emdf3Model[185].setRotationPoint(-66F, -6F, -6F);

		emdf3Model[186].addShapeBox(0F, 0F, 0F, 8, 16, 16, 0F, -0.5F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -1.75F, 0F,
				0F, -0.25F, -12F, -12F, -6F, -12F, -12F, -6F, -12F, 0F, -1.5F, -12F, 0F); // Box216
		emdf3Model[186].setRotationPoint(-67F, -6F, -10F);

		emdf3Model[187].addShapeBox(0F, 0F, 0F, 8, 16, 16, 0F, -0.75F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -2F, 0F,
				0F, -0.5F, -12F, -12F, -6F, -12F, -12F, -6F, -12F, 0F, -1.75F, -12F, 0F); // Box217
		emdf3Model[187].setRotationPoint(-67F, -10F, -10F);

		emdf3Model[188].addShapeBox(0F, 0F, 0F, 24, 16, 16, 0F, -1F, 0F, -12F, -18F, 0F, -12F, -18F, 0F, 0F, -5F, 0F,
				0F, -0.75F, -12F, -12F, -18F, -12F, -12F, -18F, -12F, 0F, -4.75F, -12F, 0F); // Box218
		emdf3Model[188].setRotationPoint(-66F, -10F, -6F);

		emdf3Model[189].addShapeBox(0F, 0F, 0F, 40, 16, 4, 0F, -1F, 0F, -3F, -30F, 0F, -3F, -30F, 0F, 0F, -2.75F, 0F,
				0F, -0.75F, -12F, -3F, -30F, -12F, -3F, -30F, -12F, 0F, -2.75F, -12F, 0F); // Box219
		emdf3Model[189].setRotationPoint(-62F, -10F, 7F);

		emdf3Model[190].addShapeBox(0F, 0F, 0F, 12, 8, 16, 0F, -1.5F, 0F, -12F, -9F, 0F, -12F, -9F, 0F, 0F, -2.5F, 0F,
				0F, -0.75F, -6F, -12F, -9F, -6F, -12F, -9F, -6F, 0F, -2F, -6F, 0F); // Box220
		emdf3Model[190].setRotationPoint(-67F, -12F, -10F);

		emdf3Model[191].addShapeBox(0F, 0F, 0F, 28, 8, 16, 0F, -1.5F, 0F, -12F, -21F, 0F, -12F, -21F, 0F, 0F, -5.5F, 0F,
				0F, -1F, -6F, -12F, -21F, -6F, -12F, -21F, -6F, 0F, -5F, -6F, 0F); // Box221
		emdf3Model[191].setRotationPoint(-66F, -12F, -6F);

		emdf3Model[192].addShapeBox(0F, 0F, 0F, 40, 8, 4, 0F, -1.5F, 0F, -3F, -30F, 0F, -3F, -30F, 0F, 0F, -3.25F, 0F,
				0F, -1F, -6F, -3F, -30F, -6F, -3F, -30F, -6F, 0F, -2.75F, -6F, 0F); // Box222
		emdf3Model[192].setRotationPoint(-62F, -12F, 7F);

		emdf3Model[193].addShapeBox(0F, 0F, 0F, 16, 8, 16, 0F, -2.5F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -3.5F, 0F,
				0F, -1.5F, -6F, -12F, -12F, -6F, -12F, -12F, -6F, 0F, -2.5F, -6F, 0F); // Box223
		emdf3Model[193].setRotationPoint(-67F, -14F, -10F);

		emdf3Model[194].addShapeBox(0F, 0F, 0F, 32, 8, 16, 0F, -2.5F, 0F, -12F, -24F, 0F, -12F, -24F, 0F, 0F, -6.5F, 0F,
				0F, -1.5F, -6F, -12F, -24F, -6F, -12F, -24F, -6F, 0F, -5.5F, -6F, 0F); // Box224
		emdf3Model[194].setRotationPoint(-66F, -14F, -6F);

		emdf3Model[195].addShapeBox(0F, 0F, 0F, 40, 8, 4, 0F, -2.5F, 0F, -3F, -30F, 0F, -3F, -30F, 0F, 0F, -4.25F, 0F,
				0F, -1.5F, -6F, -3F, -30F, -6F, -3F, -30F, -6F, 0F, -3.25F, -6F, 0F); // Box225
		emdf3Model[195].setRotationPoint(-62F, -14F, 7F);

		emdf3Model[196].addShapeBox(0F, 0F, -2F, 8, 4, 8, 0F, -1.5F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -1.5F, 0F, 0F,
				-0.5F, -3F, -6F, -6F, -3F, -6F, -6F, -3F, 0F, -0.5F, -3F, 0F); // Box226
		emdf3Model[196].setRotationPoint(-65F, -15F, -4F);

		emdf3Model[197].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, -1.5F, 0F, -6F, -2.5F, 0F, -6F, -2.5F, 0F, 0F, -1.5F, 0F,
				0F, -0.5F, -6F, -6F, -3.25F, -6F, -6F, -3.25F, -6F, 0F, -0.5F, -6F, 0F); // Box227
		emdf3Model[197].setRotationPoint(-66F, -14F, -6F);

		emdf3Model[198].addShapeBox(0F, 0F, 0F, 28, 4, 16, 0F, -2.55F, 0F, -12F, -21F, 0F, -12F, -21F, 0F, 0F, -6.5F,
				0F, 0F, -1.5F, -3F, -12F, -21F, -3F, -12F, -21F, -3F, 0F, -5.5F, -3F, 0F); // Box228
		emdf3Model[198].setRotationPoint(-65F, -15F, -6F);

		emdf3Model[199].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, -2.5F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -3.55F,
				0F, 0F, -1.5F, -3F, -12F, -12F, -3F, -12F, -12F, -3F, 0F, -2.5F, -3F, 0F); // Box229
		emdf3Model[199].setRotationPoint(-66F, -15F, -10F);

		emdf3Model[200].addShapeBox(0F, 0F, 0F, 36, 4, 4, 0F, -2.5F, 0F, -3F, -27F, 0F, -3F, -27F, 0F, -0.25F, -4.25F,
				0F, -0.25F, -1.5F, -3F, -3F, -27F, -3F, -3F, -27F, -3F, 0F, -3.25F, -3F, 0F); // Box230
		emdf3Model[200].setRotationPoint(-61F, -15F, 7F);

		emdf3Model[201].addShapeBox(0F, 0F, 0F, 24, 4, 16, 0F, -2.5F, -0.25F, -12F, -18F, 0.25F, -12F, -18F, 0F, 0F,
				-4.05F, -0.5F, 0F, -1.5F, -3F, -12F, -18F, -3F, -12F, -18F, -3F, 0F, -2.55F, -3F, 0F); // Box231
		emdf3Model[201].setRotationPoint(-65F, -16F, -10F);

		emdf3Model[202].addShapeBox(0F, 0F, -2F, 16, 4, 8, 0F, -1.5F, -0.1F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -1.5F,
				-0.25F, 0F, -0.5F, -3F, -6F, -12F, -3F, -6F, -12F, -3F, 0F, -0.5F, -3F, 0F); // Box232
		emdf3Model[202].setRotationPoint(-64F, -16F, -4F);

		emdf3Model[203].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F, -0.5F, -0.6F, -3F, -17.75F, -0.6F, -3F, -17.75F, -0.6F,
				-0.45F, -1.45F, -0.6F, -0.45F, 0.5F, -3F, -3F, -17.75F, -3F, -3F, -17.75F, -3F, -0.25F, -1.25F, -3F,
				-0.25F); // Box233
		emdf3Model[203].setRotationPoint(-58F, -16F, 7F);

		emdf3Model[204].addShapeBox(0F, 0F, 0F, 20, 4, 16, 0F, 0F, 0.45F, -12F, -15F, 0.45F, -12F, -15F, -0.25F, 0F, 0F,
				-0.25F, 0F, 0F, -3F, -12F, -15F, -3F, -12F, -15F, -2.75F, 0F, 0F, -2.75F, 0F); // Box234
		emdf3Model[204].setRotationPoint(-56F, -17F, -10F);

		emdf3Model[205].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, -0.25F, -15F, -15F, -0.25F, -15F, -15F, -0.75F,
				-2.5F, 0F, -0.75F, -3F, 0F, -2.75F, -15F, -15F, -2.75F, -15F, -14.9F, -2.4F, -0.45F, 0F, -2.4F, -0.45F); // Box235
		emdf3Model[205].setRotationPoint(-56F, -17F, -9F);

		emdf3Model[206].addShapeBox(0F, 0F, 0F, 32, 4, 16, 0F, -3.05F, -0.5F, -12F, -24F, 0.05F, -12F, -24F, -0.6F, 0F,
				-6.5F, -0.6F, 0F, -1.55F, -3F, -12F, -24F, -3F, -12F, -24F, -3F, 0F, -5.5F, -3F, 0F); // Box236
		emdf3Model[206].setRotationPoint(-64F, -16F, -6F);

		emdf3Model[207].addShapeBox(0F, 0F, 0F, 20, 4, 8, 0F, 0F, 0.5F, -6F, -15F, 0.5F, -6F, -15F, 0.45F, 0F, 0F,
				0.45F, 0F, 0F, -3F, -6F, -15F, -3F, -6F, -15F, -3F, 0F, 0F, -3F, 0F); // Box237
		emdf3Model[207].setRotationPoint(-56F, -17F, -6F);

		emdf3Model[208].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -0.05F, -0.45F, -3F, -3F, -0.4F, -3F, -3F, -0.5F, -0.75F,
				-0.25F, -0.5F, -0.75F, 0.5F, -3.4F, -3F, -3F, -3.4F, -3F, -3F, -3.4F, -0.45F, -0.45F, -3.4F, -0.45F); // Box238
		emdf3Model[208].setRotationPoint(-57F, -16F, 7F);

		emdf3Model[209].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F, 0F, 0.5F, -6F, -12F, 0.5F, -6F, -12F, 0.45F, 0F, 0F,
				0.25F, 0F, 0F, -2.85F, -6F, -12F, -3F, -6F, -12F, -3F, 0F, 0F, -2.85F, 0F); // Box239
		emdf3Model[209].setRotationPoint(-60F, -17F, -6F);

		emdf3Model[210].addShapeBox(0F, 0F, -2F, 12, 4, 8, 0F, -1.95F, 0F, -6F, -9F, 0.5F, -6F, -9F, 0.25F, 0F, -1.95F,
				-0.25F, 0F, -0.5F, -2.9F, -6F, -9F, -3F, -6F, -9F, -3F, 0F, -0.5F, -2.75F, 0F); // Box240
		emdf3Model[210].setRotationPoint(-63F, -17F, -4F);

		emdf3Model[211].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, 0F, 0.25F, -12F, -12F, 0.45F, -12F, -12F, -0.25F, 0F,
				-1.25F, -0.75F, 0F, 0F, -3F, -12F, -12F, -3F, -12F, -12F, -2.75F, 0F, -1.25F, -2.55F, 0F); // Box241
		emdf3Model[211].setRotationPoint(-60F, -17F, -10F);

		emdf3Model[212].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F, -2.95F, -0.25F, -12F, -12F, 0.25F, -12F, -10.75F, -0.75F,
				0F, -4.4F, -1F, 0F, -1.5F, -2.75F, -12F, -12F, -3F, -12F, -10.75F, -2.5F, 0F, -3.05F, -2.5F, 0F); // Box242
		emdf3Model[212].setRotationPoint(-64F, -17F, -10F);

		emdf3Model[213].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, -0.4F, 0F, -12F, -2.75F, 0.25F, -12F, -0.9F, -0.45F, 0F,
				-3.05F, -0.45F, 0F, 0.95F, -3.5F, -12F, -3F, -3.25F, -12F, -1F, -3.25F, 0F, -2.45F, -3.4F, 0F); // Box243
		emdf3Model[213].setRotationPoint(-60F, -16F, -6F);

		emdf3Model[214].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0.75F, -0.75F, -12F, -6F, -0.25F, -12F, -6F, -0.75F, -2F,
				-0.05F, -1.05F, -2.3F, 0.8F, -2.7F, -12F, -6F, -3F, -12F, -6F, -2.6F, 0F, -1.1F, -2.55F, 0F); // Box244
		emdf3Model[214].setRotationPoint(-58F, -17F, -6F);

		emdf3Model[215].addShapeBox(0F, 0F, -2F, 4, 16, 8, 0F, -0.5F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -0.5F, 0F, 0F,
				-0.25F, -12F, -6F, -3F, -12F, -6F, -3F, -12F, 0F, -0.25F, -12F, 0F); // Box246
		emdf3Model[215].setRotationPoint(-67F, -6F, -4F);

		emdf3Model[216].addShapeBox(0F, 0F, -2F, 4, 16, 8, 0F, -0.75F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -0.75F, 0F,
				0F, -0.5F, -12F, -6F, -3F, -12F, -6F, -3F, -12F, 0F, -0.5F, -12F, 0F); // Box247
		emdf3Model[216].setRotationPoint(-67F, -10F, -4F);

		emdf3Model[217].addShapeBox(0F, 0F, 0F, 4, 88, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -66F, -0.4F, -3.8F, -66F, -0.4F, -3.8F, -66F, -3.4F, 0F, -66F, -3.4F); // Box
																									 // 337
		emdf3Model[217].setRotationPoint(-32.7F, -21F, -12F);

		emdf3Model[218].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box
																									 // 338
		emdf3Model[218].setRotationPoint(3F, -11F, -12F);

		emdf3Model[219].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box
																									 // 339
		emdf3Model[219].setRotationPoint(9.5F, -7F, -12F);

		emdf3Model[220].addShapeBox(0F, 0F, 0F, 4, 88, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -66F, -3.4F, -3.8F, -66F, -3.4F, -3.8F, -66F, -0.4F, 0F, -66F, -0.4F); // Box
																									 // 340
		emdf3Model[220].setRotationPoint(-41.5F, -21F, 8F);

		emdf3Model[221].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box
																									 // 341
		emdf3Model[221].setRotationPoint(-1.25F, -11F, 8F);

		emdf3Model[222].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box
																									 // 342
		emdf3Model[222].setRotationPoint(7.5F, -7F, 8F);

		emdf3Model[223].addShapeBox(0F, 0F, 0F, 4, 88, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -66F, -3.4F, -3.8F, -66F, -3.4F, -3.8F, -66F, -0.4F, 0F, -66F, -0.4F); // Box
																									 // 343
		emdf3Model[223].setRotationPoint(-32.7F, -21F, 8F);

		emdf3Model[224].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box
																									 // 344
		emdf3Model[224].setRotationPoint(3F, -11F, 8F);

		emdf3Model[225].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F,
				-0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box
																									 // 345
		emdf3Model[225].setRotationPoint(9.5F, -7F, 8F);

		emdf3Model[226].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 346
		emdf3Model[226].setRotationPoint(-15F, -11F, -9F);
		
		emdf3Model[227].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // Box 347
		emdf3Model[227].setRotationPoint(-38.5F, -1F, -12F);

		emdf3Model[228].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // Box 348
		emdf3Model[228].setRotationPoint(-0.5F, 0F, -12F);

		emdf3Model[229].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F,
				-0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 349
		emdf3Model[229].setRotationPoint(-38.5F, -4F, 8F);

		emdf3Model[230].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F,
				-0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 350
		emdf3Model[230].setRotationPoint(-38.5F, -1F, 8F);

		emdf3Model[231].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F,
				-0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 351
		emdf3Model[231].setRotationPoint(-0.5F, 0F, 8F);

		emdf3Model[232].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 352
		emdf3Model[232].setRotationPoint(-38F, 6F, -11F);

		emdf3Model[233].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 353
		emdf3Model[233].setRotationPoint(0F, 6F, -11F);

		emdf3Model[234].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F,
				-3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 354
		emdf3Model[234].setRotationPoint(0F, 3.5F, -11F);

		emdf3Model[235].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F,
				0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 355
		emdf3Model[235].setRotationPoint(-38F, 3.5F, 7F);

		emdf3Model[236].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F,
				0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 356
		emdf3Model[236].setRotationPoint(-38F, 6F, 7F);

		emdf3Model[237].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F,
				0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 357
		emdf3Model[237].setRotationPoint(0F, 6F, 7F);

		emdf3Model[238].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F,
				0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 358
		emdf3Model[238].setRotationPoint(0F, 3.5F, 7F);

		emdf3Model[239].addShapeBox(0F, 0F, 0F, 4, 16, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F,
				-3.4F, 0F, -12F, -0.4F, -3.8F, -12F, -0.4F, -3.8F, -12F, -3.4F, 0F, -12F, -3.4F); // Box
																									 // 248
		emdf3Model[239].setRotationPoint(-67F, -10F, -3.5F);

		emdf3Model[240].addShapeBox(0F, 0F, -2.5F, 1, 8, 20, 0F, -0.25F, -3F, -15.75F, -0.05F, -3F, -15.05F, 3.5F, -3F,
				-1.4F, -3.75F, -3F, -0.7F, -0.25F, -3F, -15.75F, -0.05F, -3F, -15.05F, 3.5F, -3F, -1.4F, -3.75F, -3F,
				-0.7F); // Box 249
		emdf3Model[240].setRotationPoint(-65F, -15F, -6.7F);

		emdf3Model[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F,
				0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box 248
		emdf3Model[241].setRotationPoint(7.5F, -7F, 11F);

		emdf3Model[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 249
		emdf3Model[242].setRotationPoint(9.5F, -7F, -12F);

		emdf3Model[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F,
				0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 250
		emdf3Model[243].setRotationPoint(7.5F, -7F, -12F);


    }

    private ModelBloombergTrucks fronttrucks = new ModelBloombergTrucks();
    private ModelBloombergTrucks backtrucks = new ModelBloombergTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 244; i++)
        {
            emdf3Model[i].render(f5);
        }
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
		GL11.glTranslated(-3.0, 0.6, 0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
		GL11.glTranslated(-0.2, 0.6, 0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo emdf3Model[];
}
