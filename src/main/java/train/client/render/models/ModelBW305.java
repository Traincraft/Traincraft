//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2022 - 18:41:59
// Last changed on: 12.06.2022 - 18:41:59

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

public class ModelBW305 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelBW305() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[169];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 43
		bodyModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 58
		bodyModel[21] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 59
		bodyModel[22] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 60
		bodyModel[23] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 61
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 64
		bodyModel[25] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 66
		bodyModel[27] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 70
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 71
		bodyModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 76
		bodyModel[35] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 78
		bodyModel[37] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 84
		bodyModel[43] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 87
		bodyModel[44] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 111
		bodyModel[45] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 112
		bodyModel[46] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 105
		bodyModel[48] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 103
		bodyModel[50] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 102
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 101
		bodyModel[52] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 98
		bodyModel[55] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 58
		bodyModel[60] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 57
		bodyModel[61] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 56
		bodyModel[62] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 55
		bodyModel[63] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 54
		bodyModel[64] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 53
		bodyModel[65] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 52
		bodyModel[66] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 51
		bodyModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		bodyModel[68] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 49
		bodyModel[69] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[70] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 47
		bodyModel[71] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 46
		bodyModel[72] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 45
		bodyModel[73] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 44
		bodyModel[74] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 41
		bodyModel[75] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 40
		bodyModel[76] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 39
		bodyModel[77] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 18
		bodyModel[78] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 14
		bodyModel[79] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 156
		bodyModel[82] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 157
		bodyModel[83] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 158
		bodyModel[84] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 159
		bodyModel[85] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 160
		bodyModel[86] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 161
		bodyModel[87] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 7
		bodyModel[88] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 177
		bodyModel[89] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 178
		bodyModel[90] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 179
		bodyModel[91] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[92] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 183
		bodyModel[93] = new ModelRendererTurbo(this, 497, 1, textureX, textureY, "lamp"); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 249, 9, textureX, textureY, "lamp"); // Box 152
		bodyModel[95] = new ModelRendererTurbo(this, 377, 9, textureX, textureY, "lamp"); // Box 151
		bodyModel[96] = new ModelRendererTurbo(this, 289, 17, textureX, textureY, "lamp"); // Box 153
		bodyModel[97] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 8
		bodyModel[99] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 9
		bodyModel[100] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 10
		bodyModel[101] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 192
		bodyModel[102] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 193
		bodyModel[103] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 194
		bodyModel[104] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 195
		bodyModel[105] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 196
		bodyModel[106] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 197
		bodyModel[107] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 198
		bodyModel[108] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 199
		bodyModel[109] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 209
		bodyModel[110] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 210
		bodyModel[111] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 211
		bodyModel[112] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 212
		bodyModel[113] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 213
		bodyModel[114] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 214
		bodyModel[115] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 215
		bodyModel[116] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 216
		bodyModel[117] = new ModelRendererTurbo(this, 321, 41, textureX, textureY, "lamp"); // Box 217
		bodyModel[118] = new ModelRendererTurbo(this, 329, 41, textureX, textureY, "lamp"); // Box 218
		bodyModel[119] = new ModelRendererTurbo(this, 433, 41, textureX, textureY, "lamp"); // Box 219
		bodyModel[120] = new ModelRendererTurbo(this, 481, 41, textureX, textureY, "lamp"); // Box 220
		bodyModel[121] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 221
		bodyModel[122] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 222
		bodyModel[123] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 223
		bodyModel[124] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 224
		bodyModel[125] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 225
		bodyModel[126] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 226
		bodyModel[127] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 227
		bodyModel[128] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 228
		bodyModel[129] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 229
		bodyModel[130] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 230
		bodyModel[131] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 231
		bodyModel[132] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 233
		bodyModel[133] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 235
		bodyModel[134] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 236
		bodyModel[135] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 237
		bodyModel[136] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 238
		bodyModel[137] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 239
		bodyModel[138] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 240
		bodyModel[139] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 241
		bodyModel[140] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 242
		bodyModel[141] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 243
		bodyModel[142] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 244
		bodyModel[143] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 245
		bodyModel[144] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 246
		bodyModel[145] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 247
		bodyModel[146] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 248
		bodyModel[147] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 249
		bodyModel[148] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 250
		bodyModel[149] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 251
		bodyModel[150] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 252
		bodyModel[151] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 294
		bodyModel[152] = new ModelRendererTurbo(this, 1, 96, textureX, textureY, "lamp"); // Box 170
		bodyModel[153] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 171
		bodyModel[154] = new ModelRendererTurbo(this, 1, 106, textureX, textureY, "lamp"); // Box 172
		bodyModel[155] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 235
		bodyModel[156] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 236
		bodyModel[157] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 237
		bodyModel[158] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 238
		bodyModel[159] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 239
		bodyModel[160] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 240
		bodyModel[161] = new ModelRendererTurbo(this, 506, 4, textureX, textureY); // Box 247
		bodyModel[162] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 248
		bodyModel[163] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 249
		bodyModel[164] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 506, 4, textureX, textureY); // Box 183
		bodyModel[166] = new ModelRendererTurbo(this, 497, 4, textureX, textureY); // Box 184
		bodyModel[167] = new ModelRendererTurbo(this, 245, 85, textureX, textureY, "lamp"); // Box 294
		bodyModel[168] = new ModelRendererTurbo(this, 245, 85, textureX, textureY, "lamp"); // Box 187

		bodyModel[0].addBox(0F, 0F, 0F, 31, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-15.5F, 2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 2
		bodyModel[1].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(14.5F, 3F, -10F);

		bodyModel[3].addBox(1F, 0F, 0F, 15, 1, 14, 0F); // Box 4
		bodyModel[3].setRotationPoint(-31.5F, 4F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 15, 1, 14, 0F); // Box 5
		bodyModel[4].setRotationPoint(-30.5F, -16F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 15, 1, 14, 0F); // Box 6
		bodyModel[5].setRotationPoint(15.5F, -16F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 15, 1, 14, 0F); // Box 7
		bodyModel[6].setRotationPoint(15.5F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(15.5F, 4F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(15.5F, -16F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-30.5F, -16F, -10F);

		bodyModel[10].addShapeBox(1F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-31.5F, 4F, -10F);

		bodyModel[11].addShapeBox(1F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		bodyModel[11].setRotationPoint(-31.5F, 4F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 14
		bodyModel[12].setRotationPoint(-30.5F, -16F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(15.5F, -16F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(15.5F, 4F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-31.5F, -15F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 31, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(-15.5F, -15F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 31, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(-15.5F, -15F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, -1F, 31, 1, 17, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[18].setRotationPoint(-15.5F, -19F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 52
		bodyModel[19].setRotationPoint(-15.5F, -19F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[20].setRotationPoint(-15.5F, -14F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[21].setRotationPoint(-15.5F, -14F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[22].setRotationPoint(14.5F, -14F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[23].setRotationPoint(14.5F, -14F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 64
		bodyModel[24].setRotationPoint(-32.5F, 6.5F, -0.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 65
		bodyModel[25].setRotationPoint(24.5F, 6.5F, -0.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 66
		bodyModel[26].setRotationPoint(-26.5F, 5F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 67
		bodyModel[27].setRotationPoint(24.5F, 5F, -2F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 70
		bodyModel[28].setRotationPoint(-13.5F, -2F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 5, 7, 0F); // Box 71
		bodyModel[29].setRotationPoint(-14.5F, -6F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 5, 7, 0F); // Box 72
		bodyModel[30].setRotationPoint(-0.5F, -6F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 73
		bodyModel[31].setRotationPoint(-4.5F, -2F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 74
		bodyModel[32].setRotationPoint(0.5F, -2F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 75
		bodyModel[33].setRotationPoint(9.5F, -2F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 7, 0F); // Box 76
		bodyModel[34].setRotationPoint(13.5F, -6F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 7, 0F); // Box 77
		bodyModel[35].setRotationPoint(-0.5F, -6F, 3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 78
		bodyModel[36].setRotationPoint(-4.5F, -2F, 3F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 79
		bodyModel[37].setRotationPoint(0.5F, -2F, 3F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 7, 0F); // Box 80
		bodyModel[38].setRotationPoint(13.5F, -6F, 3F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 81
		bodyModel[39].setRotationPoint(9.5F, -2F, 3F);

		bodyModel[40].addBox(0F, 0F, 14F, 1, 5, 7, 0F); // Box 82
		bodyModel[40].setRotationPoint(-14.5F, -6F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 83
		bodyModel[41].setRotationPoint(-13.5F, -2F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 8, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 84
		bodyModel[42].setRotationPoint(-23.5F, 7F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 87
		bodyModel[43].setRotationPoint(-23.5F, 5F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 111
		bodyModel[44].setRotationPoint(-30.5F, -4F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 112
		bodyModel[45].setRotationPoint(28.5F, -4F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 14, 6, 6, 0F); // Box 106
		bodyModel[46].setRotationPoint(-6.5F, 2.5F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 105
		bodyModel[47].setRotationPoint(-3.5F, 7F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Box 104
		bodyModel[48].setRotationPoint(-1.5F, 8F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 29, 1, 2, 0F); // Box 103
		bodyModel[49].setRotationPoint(-14.5F, 3F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[50].setRotationPoint(-6.5F, 4F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 101
		bodyModel[51].setRotationPoint(4.5F, 4F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 100
		bodyModel[52].setRotationPoint(-4.5F, 4F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 99
		bodyModel[53].setRotationPoint(13.5F, 4F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 98
		bodyModel[54].setRotationPoint(3.5F, 6F, -9F);

		bodyModel[55].addBox(0F, 0F, -2F, 12, 1, 1, 0F); // Box 96
		bodyModel[55].setRotationPoint(3.5F, 8F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 95
		bodyModel[56].setRotationPoint(8.5F, 5F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 61
		bodyModel[57].setRotationPoint(8.5F, 6F, -4F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 60
		bodyModel[58].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[59].addBox(0F, 0F, -2F, 12, 1, 1, 0F); // Box 58
		bodyModel[59].setRotationPoint(-15.5F, 8F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 57
		bodyModel[60].setRotationPoint(-14.5F, 4F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 56
		bodyModel[61].setRotationPoint(-11.5F, 5F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 55
		bodyModel[62].setRotationPoint(8.5F, 5F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 54
		bodyModel[63].setRotationPoint(9.5F, 7F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 53
		bodyModel[64].setRotationPoint(13.5F, 4F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 52
		bodyModel[65].setRotationPoint(3.5F, 6F, 7F);

		bodyModel[66].addBox(0F, 0F, -2F, 12, 1, 1, 0F); // Box 51
		bodyModel[66].setRotationPoint(3.5F, 8F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 50
		bodyModel[67].setRotationPoint(4.5F, 4F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 49
		bodyModel[68].setRotationPoint(-3.5F, 7F, 7F);

		bodyModel[69].addBox(0F, 0F, 0F, 29, 1, 2, 0F); // Box 48
		bodyModel[69].setRotationPoint(-14.5F, 3F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 47
		bodyModel[70].setRotationPoint(-4.5F, 4F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[71].setRotationPoint(-6.5F, 4F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 45
		bodyModel[72].setRotationPoint(-14.5F, 4F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 44
		bodyModel[73].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[74].addBox(0F, 0F, -2F, 12, 1, 1, 0F); // Box 41
		bodyModel[74].setRotationPoint(-15.5F, 8F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 40
		bodyModel[75].setRotationPoint(-11.5F, 5F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 39
		bodyModel[76].setRotationPoint(-10.5F, 7F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 18
		bodyModel[77].setRotationPoint(-11.5F, 6F, -4F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 14
		bodyModel[78].setRotationPoint(-8.5F, 7F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 108
		bodyModel[79].setRotationPoint(15.5F, 7.25F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 109
		bodyModel[80].setRotationPoint(-16.5F, 7.25F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 156
		bodyModel[81].setRotationPoint(-12.5F, 5F, 5F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 157
		bodyModel[82].setRotationPoint(7.5F, 5F, 5F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 158
		bodyModel[83].setRotationPoint(7.5F, 5F, -5F);

		bodyModel[84].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 159
		bodyModel[84].setRotationPoint(-12.5F, 5F, -5F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 160
		bodyModel[85].setRotationPoint(-3.5F, 9F, 4F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 161
		bodyModel[86].setRotationPoint(-3.5F, 9F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.25F, 1F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[87].setRotationPoint(-31.5F, -15F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 177
		bodyModel[88].setRotationPoint(-31.5F, -15F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 178
		bodyModel[89].setRotationPoint(-15.5F, -19F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, -1.5F, -2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 179
		bodyModel[90].setRotationPoint(-30.5F, -19F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 1F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[91].setRotationPoint(-31.5F, -17F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[92].setRotationPoint(-31.5F, -17F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[93].setRotationPoint(-31.6F, 0.5F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[94].setRotationPoint(-31.6F, 0.5F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 151
		bodyModel[95].setRotationPoint(-31.6F, 1.5F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[96].setRotationPoint(-31.6F, 1.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[97].setRotationPoint(-31.6F, 2.5F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 8
		bodyModel[98].setRotationPoint(-31.6F, 2.5F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 9
		bodyModel[99].setRotationPoint(-31.6F, 3.5F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 10
		bodyModel[100].setRotationPoint(-31.6F, 3.5F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 192
		bodyModel[101].setRotationPoint(-31.5F, -18F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, -3F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -3F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F); // Box 193
		bodyModel[102].setRotationPoint(-30.5F, -14F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, -3F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -3F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F); // Box 194
		bodyModel[103].setRotationPoint(-23F, -14F, -11.9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, 1F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -3F); // Box 195
		bodyModel[104].setRotationPoint(15.5F, -14F, -9.9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, 1F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -3F); // Box 196
		bodyModel[105].setRotationPoint(23F, -14F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, 0F, -0.25F, 1F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[106].setRotationPoint(30.5F, -15F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[107].setRotationPoint(30.5F, -15F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 199
		bodyModel[108].setRotationPoint(30.5F, -15F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, -3F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -3F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F); // Box 209
		bodyModel[109].setRotationPoint(23F, -14F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, -3F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -3F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F); // Box 210
		bodyModel[110].setRotationPoint(15.5F, -14F, 6.9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, 1F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -3F); // Box 211
		bodyModel[111].setRotationPoint(-23F, -14F, 8.9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0F, 1F, 1F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -3F); // Box 212
		bodyModel[112].setRotationPoint(-30.5F, -14F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 213
		bodyModel[113].setRotationPoint(-16.5F, 5F, -9.75F);

		bodyModel[114].addShapeBox(0F, 0F, -1F, 8, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 214
		bodyModel[114].setRotationPoint(15.5F, 7F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 215
		bodyModel[115].setRotationPoint(15.5F, 5F, -9.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 216
		bodyModel[116].setRotationPoint(22.5F, 5F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[117].setRotationPoint(30.6F, 0.5F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 218
		bodyModel[118].setRotationPoint(30.6F, 1.5F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[119].setRotationPoint(30.6F, 0.5F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[120].setRotationPoint(30.6F, 1.5F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 221
		bodyModel[121].setRotationPoint(30.6F, 2.5F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 222
		bodyModel[122].setRotationPoint(30.6F, 3.5F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[123].setRotationPoint(30.6F, 2.5F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 224
		bodyModel[124].setRotationPoint(30.6F, 3.5F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, -1F, 8, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 225
		bodyModel[125].setRotationPoint(15.5F, 7F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, -1F, 8, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 226
		bodyModel[126].setRotationPoint(-23.5F, 7F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 227
		bodyModel[127].setRotationPoint(15.5F, 5F, 8.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 228
		bodyModel[128].setRotationPoint(22.5F, 5F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 229
		bodyModel[129].setRotationPoint(-16.5F, 5F, 8.75F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 230
		bodyModel[130].setRotationPoint(-23.5F, 5F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, -0.9F, -30F, 0F, -0.9F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.9F, -30F, -3F, -0.9F, -30F, -3F, 0F, 0F, -3F, 0F); // Box 231
		bodyModel[131].setRotationPoint(-15F, -20F, 9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 233
		bodyModel[132].setRotationPoint(-27.5F, 4.5F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 235
		bodyModel[133].setRotationPoint(-30.5F, -19F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 1F, 0F, 1F, 1F, 0F, 0.5F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 236
		bodyModel[134].setRotationPoint(-31.5F, -17F, 6F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 237
		bodyModel[135].setRotationPoint(-33.5F, 6F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 238
		bodyModel[136].setRotationPoint(32.5F, 6F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -30F, -3F, 0F, -30F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 239
		bodyModel[137].setRotationPoint(-15F, -20F, -10.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, -1F, 2F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 240
		bodyModel[138].setRotationPoint(15.5F, -19F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1F, -0.5F, 0F, -1.5F, -0.25F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[139].setRotationPoint(30.5F, -17F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[140].setRotationPoint(30.5F, -18F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[141].setRotationPoint(30.5F, -17F, -6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 1F, -0.25F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 244
		bodyModel[142].setRotationPoint(30.5F, -17F, 6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 245
		bodyModel[143].setRotationPoint(15.5F, -19F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 246
		bodyModel[144].setRotationPoint(-30.5F, -18F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 247
		bodyModel[145].setRotationPoint(15.5F, -18F, -8F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 248
		bodyModel[146].setRotationPoint(-15.5F, -16F, -10F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 249
		bodyModel[147].setRotationPoint(-15.5F, -18F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[148].setRotationPoint(14.5F, -18F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 251
		bodyModel[149].setRotationPoint(14.5F, -16F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 252
		bodyModel[150].setRotationPoint(27.5F, 4.5F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[151].setRotationPoint(-31.5F, -19F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 170
		bodyModel[152].setRotationPoint(-31.51F, -19F, -7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F); // Box 171
		bodyModel[153].setRotationPoint(30.5F, -19F, -1.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 172
		bodyModel[154].setRotationPoint(30.51F, -19F, -7.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 235
		bodyModel[155].setRotationPoint(-12.5F, -16.25F, -0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 236
		bodyModel[156].setRotationPoint(-12.5F, -17.25F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[157].setRotationPoint(-12.5F, -18.25F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 238
		bodyModel[158].setRotationPoint(-5F, -16.25F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 239
		bodyModel[159].setRotationPoint(-5F, -17.25F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[160].setRotationPoint(-5F, -18.25F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 247
		bodyModel[161].setRotationPoint(3F, -16.25F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 248
		bodyModel[162].setRotationPoint(3F, -17.25F, -0.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[163].setRotationPoint(3F, -18.25F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 182
		bodyModel[164].setRotationPoint(11F, -17.25F, -0.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 183
		bodyModel[165].setRotationPoint(11F, -16.25F, -0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[166].setRotationPoint(11F, -18.25F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, -4F, -9F); // Box 294
		bodyModel[167].setRotationPoint(-31.53F, -15.5F, -4.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, -4F, -9F); // Box 187
		bodyModel[168].setRotationPoint(30.53F, -15.5F, -4.5F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 169; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp") ) {
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
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}


}