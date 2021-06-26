//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:27.11.2017 - 20:37:29
// Last changed on: 27.11.2017 - 20:37:29

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGS4Loco extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelGS4Loco()
	{
		gs4locoModel = new ModelRendererTurbo[129];
		gs4locoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box002
		gs4locoModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box003
		gs4locoModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box004
		gs4locoModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box005
		gs4locoModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box006
		gs4locoModel[5] = new ModelRendererTurbo(this, 8, 183, textureX, textureY); // Box007
		gs4locoModel[6] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box008
		gs4locoModel[7] = new ModelRendererTurbo(this, 224, 32, textureX, textureY); // Box014
		gs4locoModel[8] = new ModelRendererTurbo(this, 142, 8, textureX, textureY); // Box021
		gs4locoModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box026
		gs4locoModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box034
		gs4locoModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box043
		gs4locoModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box046
		gs4locoModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box053
		gs4locoModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box054
		gs4locoModel[15] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box058
		gs4locoModel[16] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box073
		gs4locoModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box075
		gs4locoModel[18] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box077
		gs4locoModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box078
		gs4locoModel[20] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box082
		gs4locoModel[21] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box084
		gs4locoModel[22] = new ModelRendererTurbo(this, 399, 65, textureX, textureY); // Box085
		gs4locoModel[23] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box086
		gs4locoModel[24] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box087
		gs4locoModel[25] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box088
		gs4locoModel[26] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box090
		gs4locoModel[27] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box091
		gs4locoModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box092
		gs4locoModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box094
		gs4locoModel[30] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box110
		gs4locoModel[31] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box112
		gs4locoModel[32] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box116
		gs4locoModel[33] = new ModelRendererTurbo(this, 233, 198, textureX, textureY); // Box123
		gs4locoModel[34] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box124
		gs4locoModel[35] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box130
		gs4locoModel[36] = new ModelRendererTurbo(this, 479, 163, textureX, textureY); // Box131
		gs4locoModel[37] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box146
		gs4locoModel[38] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box151
		gs4locoModel[39] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box157
		gs4locoModel[40] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box160
		gs4locoModel[41] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box166
		gs4locoModel[42] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box168
		gs4locoModel[43] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box169
		gs4locoModel[44] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box170
		gs4locoModel[45] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box171
		gs4locoModel[46] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box189
		gs4locoModel[47] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box196
		gs4locoModel[48] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box198
		gs4locoModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box199
		gs4locoModel[50] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box200
		gs4locoModel[51] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box201
		gs4locoModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box209
		gs4locoModel[53] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box211
		gs4locoModel[54] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box212
		gs4locoModel[55] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box214
		gs4locoModel[56] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box215
		gs4locoModel[57] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box216
		gs4locoModel[58] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box217
		gs4locoModel[59] = new ModelRendererTurbo(this, 285, 121, textureX, textureY); // Box221
		gs4locoModel[60] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box231
		gs4locoModel[61] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box232
		gs4locoModel[62] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box233
		gs4locoModel[63] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box234
		gs4locoModel[64] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 228
		gs4locoModel[65] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 229
		gs4locoModel[66] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 230
		gs4locoModel[67] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 232
		gs4locoModel[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 233
		gs4locoModel[69] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 234
		gs4locoModel[70] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 235
		gs4locoModel[71] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 237
		gs4locoModel[72] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 240
		gs4locoModel[73] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 111
		gs4locoModel[74] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 120
		gs4locoModel[75] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 121
		gs4locoModel[76] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 122
		gs4locoModel[77] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 123
		gs4locoModel[78] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 125
		gs4locoModel[79] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 126
		gs4locoModel[80] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 127
		gs4locoModel[81] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 128
		gs4locoModel[82] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 129
		gs4locoModel[83] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 130
		gs4locoModel[84] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 131
		gs4locoModel[85] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 132
		gs4locoModel[86] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 133
		gs4locoModel[87] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 134
		gs4locoModel[88] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 135
		gs4locoModel[89] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 136
		gs4locoModel[90] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 137
		gs4locoModel[91] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 138
		gs4locoModel[92] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 139
		gs4locoModel[93] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 140
		gs4locoModel[94] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 141
		gs4locoModel[95] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 142
		gs4locoModel[96] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 143
		gs4locoModel[97] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 144
		gs4locoModel[98] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 145
		gs4locoModel[99] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 146
		gs4locoModel[100] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 147
		gs4locoModel[101] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 148
		gs4locoModel[102] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 149
		gs4locoModel[103] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 150
		gs4locoModel[104] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 151
		gs4locoModel[105] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 155
		gs4locoModel[106] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 156
		gs4locoModel[107] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 157
		gs4locoModel[108] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 158
		gs4locoModel[109] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 159
		gs4locoModel[110] = new ModelRendererTurbo(this, 106, 156, textureX, textureY); // Box 124
		gs4locoModel[111] = new ModelRendererTurbo(this, 297, 156, textureX, textureY); // Box 125
		gs4locoModel[112] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 128
		gs4locoModel[113] = new ModelRendererTurbo(this, 479, 182, textureX, textureY); // Box 125
		gs4locoModel[114] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 126
		gs4locoModel[115] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 127
		gs4locoModel[116] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 128
		gs4locoModel[117] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, "lamp"); // Box 118
		gs4locoModel[118] = new ModelRendererTurbo(this, 81, 1, textureX, textureY, "lamp"); // Box 119
		gs4locoModel[119] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "lamp"); // Box 120
		gs4locoModel[120] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 121
		gs4locoModel[121] = new ModelRendererTurbo(this, 1, 162, textureX, textureY); // Box 122
		gs4locoModel[122] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 123
		gs4locoModel[123] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 124
		gs4locoModel[124] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 125
		gs4locoModel[125] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 126
		gs4locoModel[126] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 127
		gs4locoModel[127] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Box 127
		gs4locoModel[128] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 128

		gs4locoModel[0].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box002
		gs4locoModel[0].setRotationPoint(-105F, 7F, -6F);

		gs4locoModel[1].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box003
		gs4locoModel[1].setRotationPoint(-92F, 7F, -6F);

		gs4locoModel[2].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box004
		gs4locoModel[2].setRotationPoint(-81F, 3F, -6F);

		gs4locoModel[3].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box005
		gs4locoModel[3].setRotationPoint(-66F, 3F, -6F);

		gs4locoModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box006
		gs4locoModel[4].setRotationPoint(-51F, 3F, -6F);

		gs4locoModel[5].addShapeBox(0F, 0F, 0F, 86, 10, 24, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box007
		gs4locoModel[5].setRotationPoint(-96F, -14F, -12F);

		gs4locoModel[6].addBox(0F, 0F, 0F, 94, 6, 18, 0F); // Box008
		gs4locoModel[6].setRotationPoint(-105F, -18F, -9F);

		gs4locoModel[7].addShapeBox(0F, 0F, 0F, 94, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box014
		gs4locoModel[7].setRotationPoint(-105F, -12F, -9F);

		gs4locoModel[8].addShapeBox(0F, 0F, 0F, 94, 6, 18, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box021
		gs4locoModel[8].setRotationPoint(-105F, -24F, -9F);

		gs4locoModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F); // Box026
		gs4locoModel[9].setRotationPoint(-107F, -17F, -7F);

		gs4locoModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, -2.4F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.4F, -5F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F); // Box034
		gs4locoModel[10].setRotationPoint(-107F, -22F, -7F);

		gs4locoModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box043
		gs4locoModel[11].setRotationPoint(-109.5F, -17F, -1F);

		gs4locoModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box046
		gs4locoModel[12].setRotationPoint(-109.5F, -13F, -1F);

		gs4locoModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -1F, -3F, -3.45F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, -1F, -3F, -3.45F, -1F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.45F); // Box053
		gs4locoModel[13].setRotationPoint(-110F, -19F, -4F);

		gs4locoModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, -1F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.45F, -1F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.45F); // Box054
		gs4locoModel[14].setRotationPoint(-110F, -16F, -4F);

		gs4locoModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 24, 0F, 0F, 0F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -4F); // Box058
		gs4locoModel[15].setRotationPoint(-113F, 1F, -12F);

		gs4locoModel[16].addShapeBox(0F, 0F, 0F, 92, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box073
		gs4locoModel[16].setRotationPoint(-104F, -26F, -5F);

		gs4locoModel[17].addShapeBox(0F, 0F, 0F, 54, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box075
		gs4locoModel[17].setRotationPoint(-95F, -28F, -4F);

		gs4locoModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -1F, 0F, -1.55F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box077
		gs4locoModel[18].setRotationPoint(-103F, -29F, -5F);

		gs4locoModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box078
		gs4locoModel[19].setRotationPoint(-103F, -29F, 3F);

		gs4locoModel[20].addShapeBox(0F, 0F, 0F, 29, 2, 6, 0F, 0F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box082
		gs4locoModel[20].setRotationPoint(-41F, -28F, -3F);

		gs4locoModel[21].addShapeBox(0F, 5F, 0F, 21, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 1F, 0F, 0.4F, -4.2F, 0F, 0.4F, -4.2F, 0F, -2.8F, 1F, 0F); // Box084
		gs4locoModel[21].setRotationPoint(-30F, -12F, -8F);

		gs4locoModel[22].addShapeBox(0F, 0F, 0F, 21, 8, 20, 0F, 0F, 0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box085
		gs4locoModel[22].setRotationPoint(-31F, -17F, -10F);

		gs4locoModel[23].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box086
		gs4locoModel[23].setRotationPoint(-36F, 3F, -6F);

		gs4locoModel[24].addShapeBox(0F, 0F, 0F, 5, 7, 16, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box087
		gs4locoModel[24].setRotationPoint(-118F, 1F, -8F);

		gs4locoModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box088
		gs4locoModel[25].setRotationPoint(-107F, -3F, -6F);

		gs4locoModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -2.4F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.4F, -5F); // Box090
		gs4locoModel[26].setRotationPoint(-107F, -13F, -7F);

		gs4locoModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -0.6F, -1F, 0F, -0.6F, 2F, 0F, -0.6F, 2F, 0F, -0.6F, -1F); // Box091
		gs4locoModel[27].setRotationPoint(-110F, -3F, -4F);

		gs4locoModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box092
		gs4locoModel[28].setRotationPoint(-109F, -3F, -3F);

		gs4locoModel[29].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box094
		gs4locoModel[29].setRotationPoint(-101F, -27F, -2F);

		gs4locoModel[30].addBox(0F, 0F, 0F, 8, 1, 24, 0F); // Box110
		gs4locoModel[30].setRotationPoint(-110.4F, 1F, -12F);

		gs4locoModel[31].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box112
		gs4locoModel[31].setRotationPoint(-104F, -5F, -7F);

		gs4locoModel[32].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box116
		gs4locoModel[32].setRotationPoint(-101.5F, -7F, -11.98F);

		gs4locoModel[33].addShapeBox(0F, 0F, 0F, 110, 7, 10, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box123
		gs4locoModel[33].setRotationPoint(-103F, -6F, -5.5F);

		gs4locoModel[34].addShapeBox(0F, 0F, 0F, 1, 18, 22, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -2F, 0F, -0.05F, 2F, 0F, -0.05F, 2F, 0F, -0.05F, -2F, 0F, -0.05F); // Box124
		gs4locoModel[34].setRotationPoint(-12F, -25F, -11F);

		gs4locoModel[35].addBox(0F, 0F, 0F, 1, 18, 22, 0F); // Box130
		gs4locoModel[35].setRotationPoint(8F, -25F, -11F);

		gs4locoModel[36].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box131
		gs4locoModel[36].setRotationPoint(-10F, -25F, -11F);

		gs4locoModel[37].addBox(0F, 0F, 0F, 20, 4, 10, 0F); // Box146
		gs4locoModel[37].setRotationPoint(-108F, 5F, -5F);

		gs4locoModel[38].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box151
		gs4locoModel[38].setRotationPoint(-42F, -3F, -6F);

		gs4locoModel[39].addBox(0F, 0F, 0F, 9, 8, 5, 0F); // Box157
		gs4locoModel[39].setRotationPoint(-102F, -3F, 5F);

		gs4locoModel[40].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box160
		gs4locoModel[40].setRotationPoint(-94F, 5F, -6F);

		gs4locoModel[41].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0.125F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box166
		gs4locoModel[41].setRotationPoint(-10F, -9F, -12F);

		gs4locoModel[42].addBox(0F, 0F, 0F, 18, 1, 20, 0F); // Box168
		gs4locoModel[42].setRotationPoint(-9F, -7.1F, -10F);

		gs4locoModel[43].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box169
		gs4locoModel[43].setRotationPoint(-17F, 6F, -5F);

		gs4locoModel[44].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box170
		gs4locoModel[44].setRotationPoint(-6F, 6F, -5F);

		gs4locoModel[45].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box171
		gs4locoModel[45].setRotationPoint(-9F, 3F, -5F);

		gs4locoModel[46].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box189
		gs4locoModel[46].setRotationPoint(-23F, 6F, 5F);

		gs4locoModel[47].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F); // Box196
		gs4locoModel[47].setRotationPoint(-20F, 3F, 5F);

		gs4locoModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box198
		gs4locoModel[48].setRotationPoint(-17.5F, 5F, 6F);

		gs4locoModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box199
		gs4locoModel[49].setRotationPoint(-6.5F, 5F, 6F);

		gs4locoModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box200
		gs4locoModel[50].setRotationPoint(-5.5F, 5F, -7F);

		gs4locoModel[51].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box201
		gs4locoModel[51].setRotationPoint(-23F, 6F, -6F);

		gs4locoModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box209
		gs4locoModel[52].setRotationPoint(-17.5F, 5F, -7F);

		gs4locoModel[53].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box211
		gs4locoModel[53].setRotationPoint(-24F, 6F, -6F);

		gs4locoModel[54].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box212
		gs4locoModel[54].setRotationPoint(1F, 6F, -6F);

		gs4locoModel[55].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F); // Box214
		gs4locoModel[55].setRotationPoint(-38F, 6F, -6F);

		gs4locoModel[56].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box215
		gs4locoModel[56].setRotationPoint(-38F, 6F, 5F);

		gs4locoModel[57].addBox(0F, 0F, 0F, 50, 2, 6, 0F); // Box216
		gs4locoModel[57].setRotationPoint(-88F, 5F, -3F);

		gs4locoModel[58].addBox(0F, 0F, 0F, 53, 4, 8, 0F); // Box217
		gs4locoModel[58].setRotationPoint(-87F, 1F, -4F);

		gs4locoModel[59].addShapeBox(0F, 0F, 0F, 21, 4, 18, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box221
		gs4locoModel[59].setRotationPoint(-12F, -29F, -9F);

		gs4locoModel[60].addShapeBox(0F, 0F, 0F, 4, 33, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box231
		gs4locoModel[60].setRotationPoint(4F, -25F, -11F);

		gs4locoModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.5F, 0F, 0F, -2.6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2.6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box232
		gs4locoModel[61].setRotationPoint(-115.4F, 5F, 8F);

		gs4locoModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, 0F, 0.5F, 0F, 0F); // Box233
		gs4locoModel[62].setRotationPoint(-115.4F, 5F, -12F);

		gs4locoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0.2F, 0.3F, -0.6F, 0.2F, 0.3F, -0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F); // Box234
		gs4locoModel[63].setRotationPoint(-104F, -4F, 9F);

		gs4locoModel[64].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 228
		gs4locoModel[64].setRotationPoint(-103F, -5F, -11.98F);

		gs4locoModel[65].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 229
		gs4locoModel[65].setRotationPoint(-104.5F, -3F, -11.98F);

		gs4locoModel[66].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 230
		gs4locoModel[66].setRotationPoint(-106F, -1F, -11.98F);

		gs4locoModel[67].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 232
		gs4locoModel[67].setRotationPoint(-101.5F, -7F, 7.98F);

		gs4locoModel[68].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 233
		gs4locoModel[68].setRotationPoint(-103F, -5F, 7.98F);

		gs4locoModel[69].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 234
		gs4locoModel[69].setRotationPoint(-104.5F, -3F, 7.98F);

		gs4locoModel[70].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 235
		gs4locoModel[70].setRotationPoint(-106F, -1F, 7.98F);

		gs4locoModel[71].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F); // Box 237
		gs4locoModel[71].setRotationPoint(-20F, 3F, -6F);

		gs4locoModel[72].addShapeBox(0F, 0F, 0F, 4, 33, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 240
		gs4locoModel[72].setRotationPoint(4F, -25F, 10F);

		gs4locoModel[73].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 111
		gs4locoModel[73].setRotationPoint(-96F, 0.5F, 7F);

		gs4locoModel[74].addBox(0F, 0F, 0F, 9, 8, 5, 0F); // Box 120
		gs4locoModel[74].setRotationPoint(-102F, -3F, -10F);

		gs4locoModel[75].addBox(0F, 0F, 0F, 48, 2, 1, 0F); // Box 121
		gs4locoModel[75].setRotationPoint(-81F, 6F, -7F);

		gs4locoModel[76].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gs4locoModel[76].setRotationPoint(-84F, 2.5F, -8F);
		gs4locoModel[76].rotateAngleZ = -0.19198622F;

		gs4locoModel[77].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 123
		gs4locoModel[77].setRotationPoint(-96F, 0.5F, -8F);

		gs4locoModel[78].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 125
		gs4locoModel[78].setRotationPoint(-94F, -1F, -9F);

		gs4locoModel[79].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 126
		gs4locoModel[79].setRotationPoint(-90F, 3F, -9F);

		gs4locoModel[80].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 127
		gs4locoModel[80].setRotationPoint(-90F, 3F, -9F);
		gs4locoModel[80].rotateAngleZ = 1.15191731F;

		gs4locoModel[81].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 128
		gs4locoModel[81].setRotationPoint(-88F, -2.5F, -9F);

		gs4locoModel[82].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 129
		gs4locoModel[82].setRotationPoint(-77F, -3F, -9F);
		gs4locoModel[82].rotateAngleZ = 0.34906585F;

		gs4locoModel[83].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 130
		gs4locoModel[83].setRotationPoint(-74.5F, 2.5F, -9F);
		gs4locoModel[83].rotateAngleZ = -0.17453293F;

		gs4locoModel[84].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 131
		gs4locoModel[84].setRotationPoint(-66.75F, 4F, -9F);

		gs4locoModel[85].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 132
		gs4locoModel[85].setRotationPoint(-57F, -3F, -6F);

		gs4locoModel[86].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 133
		gs4locoModel[86].setRotationPoint(-87F, -3F, -6F);

		gs4locoModel[87].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 134
		gs4locoModel[87].setRotationPoint(-72F, -3F, -6F);

		gs4locoModel[88].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 135
		gs4locoModel[88].setRotationPoint(-87F, -3F, 6F);

		gs4locoModel[89].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 136
		gs4locoModel[89].setRotationPoint(-72F, -3F, 6F);

		gs4locoModel[90].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 137
		gs4locoModel[90].setRotationPoint(-57F, -3F, 6F);

		gs4locoModel[91].addBox(0F, 0F, 0F, 13, 13, 0, 0F); // Box 138
		gs4locoModel[91].setRotationPoint(-42F, -3F, 6F);

		gs4locoModel[92].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 139
		gs4locoModel[92].setRotationPoint(-20F, 3F, -5F);

		gs4locoModel[93].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 140
		gs4locoModel[93].setRotationPoint(-9F, 3F, 5F);

		gs4locoModel[94].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 141
		gs4locoModel[94].setRotationPoint(-20F, 3F, 5F);

		gs4locoModel[95].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 142
		gs4locoModel[95].setRotationPoint(-107F, 5F, -6F);

		gs4locoModel[96].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 143
		gs4locoModel[96].setRotationPoint(-107F, 5F, 6F);

		gs4locoModel[97].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 144
		gs4locoModel[97].setRotationPoint(-94F, 5F, 6F);

		gs4locoModel[98].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -1F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.45F, -1F, -3F, -3.45F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, -1F, -3F, -3.45F); // Box 145
		gs4locoModel[98].setRotationPoint(-110F, -14F, -4F);

		gs4locoModel[99].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 146
		gs4locoModel[99].setRotationPoint(-96F, 3F, -8F);

		gs4locoModel[100].addBox(0F, 0F, 0F, 48, 2, 1, 0F); // Box 147
		gs4locoModel[100].setRotationPoint(-81F, 6F, 6F);

		gs4locoModel[101].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gs4locoModel[101].setRotationPoint(-84F, 2.5F, 7F);
		gs4locoModel[101].rotateAngleZ = -0.19198622F;

		gs4locoModel[102].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 149
		gs4locoModel[102].setRotationPoint(-94F, -1F, 8F);

		gs4locoModel[103].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 150
		gs4locoModel[103].setRotationPoint(-90F, 3F, 8F);

		gs4locoModel[104].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 151
		gs4locoModel[104].setRotationPoint(-90F, 3F, 8F);
		gs4locoModel[104].rotateAngleZ = 1.15191731F;

		gs4locoModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 155
		gs4locoModel[105].setRotationPoint(-66.75F, 4F, 8F);

		gs4locoModel[106].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 156
		gs4locoModel[106].setRotationPoint(-96F, 3F, 7F);

		gs4locoModel[107].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 157
		gs4locoModel[107].setRotationPoint(-88F, -2.5F, 8F);

		gs4locoModel[108].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 158
		gs4locoModel[108].setRotationPoint(-77F, -3F, 8F);
		gs4locoModel[108].rotateAngleZ = 0.34906585F;

		gs4locoModel[109].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 159
		gs4locoModel[109].setRotationPoint(-74.5F, 2.5F, 8F);
		gs4locoModel[109].rotateAngleZ = -0.17453293F;

		gs4locoModel[110].addBox(0F, 0F, 0F, 92, 1, 1, 0F); // Box 124
		gs4locoModel[110].setRotationPoint(-104F, -25F, -6F);

		gs4locoModel[111].addBox(0F, 0F, 0F, 92, 1, 1, 0F); // Box 125
		gs4locoModel[111].setRotationPoint(-104F, -25F, 5F);

		gs4locoModel[112].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 128
		gs4locoModel[112].setRotationPoint(-10F, -9F, 10F);

		gs4locoModel[113].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 125
		gs4locoModel[113].setRotationPoint(-10F, -25F, 10F);

		gs4locoModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126
		gs4locoModel[114].setRotationPoint(-106F, -23F, -6F);

		gs4locoModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 127
		gs4locoModel[115].setRotationPoint(-106F, -23F, 5F);

		gs4locoModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		gs4locoModel[116].setRotationPoint(-95F, -29F, -3.5F);

		gs4locoModel[117].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		gs4locoModel[117].setRotationPoint(-109.55F, -17F, -1F);

		gs4locoModel[118].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 119
		gs4locoModel[118].setRotationPoint(-109.55F, -13F, -1F);

		gs4locoModel[119].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 120
		gs4locoModel[119].setRotationPoint(-106.05F, -23F, 5F);

		gs4locoModel[120].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 121
		gs4locoModel[120].setRotationPoint(-106.05F, -23F, -6F);

		gs4locoModel[121].addBox(0F, 0F, 0F, 14, 15, 0, 0F); // Box 122
		gs4locoModel[121].setRotationPoint(-110F, -14F, 12F);

		gs4locoModel[122].addBox(0F, 0F, 0F, 14, 16, 0, 0F); // Box 123
		gs4locoModel[122].setRotationPoint(-110F, -15F, -12F);

		gs4locoModel[123].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 124
		gs4locoModel[123].setRotationPoint(-99.5F, -9F, -11.98F);

		gs4locoModel[124].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 125
		gs4locoModel[124].setRotationPoint(-99.5F, -9F, 7.98F);

		gs4locoModel[125].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 126
		gs4locoModel[125].setRotationPoint(-97.5F, -11F, -11.98F);

		gs4locoModel[126].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 127
		gs4locoModel[126].setRotationPoint(-97.5F, -11F, 7.98F);

		gs4locoModel[127].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 127
		gs4locoModel[127].setRotationPoint(-110.4F, 2F, 11F);

		gs4locoModel[128].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 128
		gs4locoModel[128].setRotationPoint(-110.4F, 2F, -12F);

		fixRotation(gs4locoModel, false, true, true);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 129; i++)
		{

			if(gs4locoModel[i].boxName!= null && gs4locoModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				gs4locoModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				gs4locoModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gs4locoModel[];
}