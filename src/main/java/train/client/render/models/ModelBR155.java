//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.09.2018 - 18:36:28
// Last changed on: 21.09.2018 - 18:36:28

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

public class ModelBR155 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR155() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[212];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 56
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 57
		bodyModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 33, 10, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 22
		bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 22
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[26] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		bodyModel[28] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
		bodyModel[29] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 22
		bodyModel[30] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 22
		bodyModel[31] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 22
		bodyModel[33] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 22
		bodyModel[35] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 22
		bodyModel[36] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 22
		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		bodyModel[38] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 22
		bodyModel[39] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 22
		bodyModel[40] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 22
		bodyModel[41] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 22
		bodyModel[42] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 22
		bodyModel[43] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 22
		bodyModel[44] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 22
		bodyModel[45] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 22
		bodyModel[46] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 22
		bodyModel[47] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 22
		bodyModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		bodyModel[49] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 22
		bodyModel[50] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 22
		bodyModel[51] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		bodyModel[56] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 22
		bodyModel[57] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 22
		bodyModel[58] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 22
		bodyModel[59] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 22
		bodyModel[60] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 22
		bodyModel[61] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 22
		bodyModel[62] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 22
		bodyModel[63] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 22
		bodyModel[64] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 22
		bodyModel[65] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 22
		bodyModel[66] = new ModelRendererTurbo(this, 273, 66, textureX, textureY); // Box 22
		bodyModel[67] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 22
		bodyModel[68] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 22
		bodyModel[69] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 22
		bodyModel[70] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 22
		bodyModel[71] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 22
		bodyModel[72] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 22
		bodyModel[73] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 22
		bodyModel[74] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 22
		bodyModel[75] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 22
		bodyModel[76] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 22
		bodyModel[77] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 22
		bodyModel[78] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 22
		bodyModel[79] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 22
		bodyModel[80] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 22
		bodyModel[81] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 22
		bodyModel[82] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 22
		bodyModel[83] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 22
		bodyModel[84] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 22
		bodyModel[85] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 22
		bodyModel[86] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 163
		bodyModel[87] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 164
		bodyModel[88] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 9
		bodyModel[89] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 136
		bodyModel[90] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 163
		bodyModel[91] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 164
		bodyModel[92] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 165
		bodyModel[93] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 9
		bodyModel[94] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 156
		bodyModel[95] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 157
		bodyModel[96] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 158
		bodyModel[97] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 159
		bodyModel[98] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 160
		bodyModel[99] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 161
		bodyModel[100] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 162
		bodyModel[101] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 164
		bodyModel[103] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 156
		bodyModel[104] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 157
		bodyModel[105] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 158
		bodyModel[106] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 159
		bodyModel[107] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 160
		bodyModel[108] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 161
		bodyModel[109] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 162
		bodyModel[110] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 163
		bodyModel[111] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 164
		bodyModel[112] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 181
		bodyModel[113] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 181
		bodyModel[114] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 22
		bodyModel[115] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 22
		bodyModel[116] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 22
		bodyModel[117] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 22
		bodyModel[118] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 22
		bodyModel[119] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 22
		bodyModel[120] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 22
		bodyModel[121] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 157
		bodyModel[122] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 157
		bodyModel[123] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 157
		bodyModel[125] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 157
		bodyModel[126] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 157
		bodyModel[127] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 157
		bodyModel[128] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 157
		bodyModel[129] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 157
		bodyModel[130] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 157
		bodyModel[131] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 157
		bodyModel[132] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 157
		bodyModel[134] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 157
		bodyModel[135] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 157
		bodyModel[136] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 157
		bodyModel[137] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 22
		bodyModel[138] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 22
		bodyModel[139] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 22
		bodyModel[140] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 22
		bodyModel[141] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 22
		bodyModel[142] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 22
		bodyModel[143] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 22
		bodyModel[144] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 22
		bodyModel[145] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 22
		bodyModel[146] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 22
		bodyModel[147] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 22
		bodyModel[148] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 22
		bodyModel[149] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 22
		bodyModel[150] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 22
		bodyModel[151] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 22
		bodyModel[152] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 22
		bodyModel[153] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 22
		bodyModel[154] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 22
		bodyModel[155] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 22
		bodyModel[156] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		bodyModel[157] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 22
		bodyModel[158] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 22
		bodyModel[159] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 22
		bodyModel[160] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 22
		bodyModel[161] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 22
		bodyModel[162] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 22
		bodyModel[163] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 22
		bodyModel[164] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[165] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[166] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[167] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[168] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[169] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[170] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[171] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[172] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[173] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[174] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[175] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Headlight
		bodyModel[176] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[177] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[178] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[179] = new ModelRendererTurbo(this, 10, 109, textureX, textureY, "lamp"); // A
		bodyModel[180] = new ModelRendererTurbo(this, 5, 112, textureX, textureY, "lamp"); // A
		bodyModel[181] = new ModelRendererTurbo(this, 5, 112, textureX, textureY, "lamp"); // A
		bodyModel[182] = new ModelRendererTurbo(this, 5, 112, textureX, textureY, "lamp"); // A
		bodyModel[183] = new ModelRendererTurbo(this, 5, 112, textureX, textureY, "lamp"); // A
		bodyModel[184] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[185] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[186] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[187] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[188] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[189] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[190] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[191] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[192] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[193] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[194] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[195] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Headlight
		bodyModel[196] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[197] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[198] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[199] = new ModelRendererTurbo(this, 5, 109, textureX, textureY, "lamp"); // A
		bodyModel[200] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Headlight
		bodyModel[201] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Headlight
		bodyModel[202] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Headlight
		bodyModel[203] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Headlight
		bodyModel[204] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 239
		bodyModel[205] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 240
		bodyModel[206] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 241
		bodyModel[207] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 242
		bodyModel[208] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 243
		bodyModel[209] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 244
		bodyModel[210] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 245
		bodyModel[211] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 246

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[0].setRotationPoint(-49F, -1F, 8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 20
		bodyModel[1].setRotationPoint(-50F, -2F, 7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 21
		bodyModel[2].setRotationPoint(-50F, -2F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[3].setRotationPoint(-49F, -1F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[4].setRotationPoint(46F, -1F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[5].setRotationPoint(46F, -1F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[6].setRotationPoint(48.5F, -2F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[7].setRotationPoint(48.5F, -2F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[8].setRotationPoint(-46F, -1F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(-30F, -20F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-30F, -21F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-30F, -21F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(24F, -21F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(24F, -21F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, -1F, 6, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[14].setRotationPoint(-30F, -20F, 11F);

		bodyModel[15].addShapeBox(-6F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(30F, -20F, -11F);

		bodyModel[16].addShapeBox(-6F, 0F, -1F, 6, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[16].setRotationPoint(30F, -20F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-24F, -21F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-24F, -21F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-30F, -22F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-47F, -22F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(-47F, -22F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-47F, -21F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[23].setRotationPoint(46F, -22F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[24].setRotationPoint(46F, -22F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[25].setRotationPoint(46F, -22F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(46F, -22F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[27].setRotationPoint(46F, -22F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		bodyModel[28].setRotationPoint(46F, -22F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[29].setRotationPoint(-30F, -22F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 22
		bodyModel[30].setRotationPoint(30F, -23F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 22
		bodyModel[31].setRotationPoint(30F, -23F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 72, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[32].setRotationPoint(-36F, -23.25F, -10F);

		bodyModel[33].addShapeBox(-6F, 0F, -1F, 16, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[33].setRotationPoint(-40F, -21F, 11F);

		bodyModel[34].addShapeBox(-6F, 0F, -1F, 16, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[34].setRotationPoint(36F, -21F, 11F);

		bodyModel[35].addShapeBox(-6F, 0F, -1F, 16, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[35].setRotationPoint(-40F, -21F, -10F);

		bodyModel[36].addShapeBox(-6F, 0F, -1F, 16, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[36].setRotationPoint(36F, -21F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 24, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[37].setRotationPoint(10F, -23.75F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 17, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[38].setRotationPoint(-9F, -23.75F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[39].setRotationPoint(-34F, -23.75F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 22
		bodyModel[40].setRotationPoint(36F, -23F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 22
		bodyModel[41].setRotationPoint(36F, -23F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 22
		bodyModel[42].setRotationPoint(-4F, -26.25F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[43].setRotationPoint(-4F, -26.25F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[44].setRotationPoint(-5F, -26.25F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[45].setRotationPoint(8F, -26.25F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		bodyModel[46].setRotationPoint(8F, -23.75F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 22
		bodyModel[47].setRotationPoint(-31F, -17F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 22
		bodyModel[48].setRotationPoint(-24F, -17F, -12F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 22
		bodyModel[49].setRotationPoint(23F, -17F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 22
		bodyModel[50].setRotationPoint(30F, -17F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F); // Box 69
		bodyModel[51].setRotationPoint(-31F, -17F, 11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F); // Box 70
		bodyModel[52].setRotationPoint(-24F, -17F, 11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F); // Box 71
		bodyModel[53].setRotationPoint(23F, -17F, 11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F); // Box 72
		bodyModel[54].setRotationPoint(30F, -17F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[55].setRotationPoint(-47F, -3F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[56].setRotationPoint(47F, -3F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[57].setRotationPoint(46F, -3F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[58].setRotationPoint(-48F, -3F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[59].setRotationPoint(-47F, -3F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[60].setRotationPoint(-47F, -3F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[61].setRotationPoint(-44F, -10F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[62].setRotationPoint(-42F, -9F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[63].setRotationPoint(-42F, -9F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 10, 13, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[64].setRotationPoint(-44F, -11F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[65].setRotationPoint(-42F, -9F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 18, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[66].setRotationPoint(46F, -21F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[67].setRotationPoint(-45F, -13F, -3F);
		bodyModel[67].rotateAngleY = 0.33161256F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[68].setRotationPoint(-46F, -10F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[69].setRotationPoint(-45F, -12F, -3F);
		bodyModel[69].rotateAngleY = 0.33161256F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[70].setRotationPoint(-45F, -14F, -3F);
		bodyModel[70].rotateAngleY = 0.33161256F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F); // Box 22
		bodyModel[71].setRotationPoint(-40F, -10F, 1F);
		bodyModel[71].rotateAngleZ = -0.34906585F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F); // Box 22
		bodyModel[72].setRotationPoint(-37.5F, -8F, -3.5F);
		bodyModel[72].rotateAngleZ = -1.57079633F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22
		bodyModel[73].setRotationPoint(-38.5F, -7.13F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[74].setRotationPoint(44F, -10F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[75].setRotationPoint(38F, -10F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[76].setRotationPoint(38F, -9F, 1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 9, 13, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[77].setRotationPoint(42F, -11F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[78].setRotationPoint(38F, -9F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[79].setRotationPoint(40F, -9F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[80].setRotationPoint(44F, -13F, 1F);
		bodyModel[80].rotateAngleY = 0.33161256F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[81].setRotationPoint(45F, -12F, 2F);
		bodyModel[81].rotateAngleY = 0.33161256F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[82].setRotationPoint(44F, -14F, 1F);
		bodyModel[82].rotateAngleY = 0.33161256F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F); // Box 22
		bodyModel[83].setRotationPoint(37.5F, -8F, 0.5F);
		bodyModel[83].rotateAngleZ = -1.57079633F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22
		bodyModel[84].setRotationPoint(37.5F, -7.13F, 1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F); // Box 22
		bodyModel[85].setRotationPoint(39F, -10F, -3F);
		bodyModel[85].rotateAngleZ = 0.34906585F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[86].setRotationPoint(-32F, -16F, -2F);
		bodyModel[86].rotateAngleY = -6.28318531F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		bodyModel[87].setRotationPoint(-30.75F, -16.2F, -1F);
		bodyModel[87].rotateAngleY = -6.28318531F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[88].setRotationPoint(-35.5F, -5F, -2F);
		bodyModel[88].rotateAngleY = -6.28318531F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[89].setRotationPoint(-36F, -6F, -2F);
		bodyModel[89].rotateAngleY = -6.28318531F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[90].setRotationPoint(31F, -16F, 2F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		bodyModel[91].setRotationPoint(30F, -16.2F, 1F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[92].setRotationPoint(35F, -6F, 2F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[93].setRotationPoint(34.5F, -5F, 2F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 156
		bodyModel[94].setRotationPoint(28F, -34F, 4F);
		bodyModel[94].rotateAngleZ = 0.62831853F;

		bodyModel[95].addBox(0F, -8F, 0F, 2, 1, 12, 0F); // Box 157
		bodyModel[95].setRotationPoint(27F, -27F, -6F);

		bodyModel[96].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 158
		bodyModel[96].setRotationPoint(28F, -34F, 4F);
		bodyModel[96].rotateAngleZ = 2.51327412F;

		bodyModel[97].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 159
		bodyModel[97].setRotationPoint(29F, -25.1F, 4F);
		bodyModel[97].rotateAngleZ = -2.44346095F;

		bodyModel[98].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 160
		bodyModel[98].setRotationPoint(27F, -25.1F, 4F);
		bodyModel[98].rotateAngleZ = -0.6981317F;

		bodyModel[99].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 161
		bodyModel[99].setRotationPoint(27F, -25.1F, -5F);
		bodyModel[99].rotateAngleZ = -0.6981317F;

		bodyModel[100].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 162
		bodyModel[100].setRotationPoint(28F, -34F, -5F);
		bodyModel[100].rotateAngleZ = 0.62831853F;

		bodyModel[101].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 163
		bodyModel[101].setRotationPoint(29F, -25.1F, -5F);
		bodyModel[101].rotateAngleZ = -2.44346095F;

		bodyModel[102].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 164
		bodyModel[102].setRotationPoint(28F, -34F, -5F);
		bodyModel[102].rotateAngleZ = 2.51327412F;

		bodyModel[103].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 156
		bodyModel[103].setRotationPoint(-28F, -28F, 4F);
		bodyModel[103].rotateAngleZ = 0.17453293F;

		bodyModel[104].addBox(0F, -8F, 0F, 2, 1, 12, 0F); // Box 157
		bodyModel[104].setRotationPoint(-29F, -21F, -6F);

		bodyModel[105].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 158
		bodyModel[105].setRotationPoint(-28F, -28F, 4F);
		bodyModel[105].rotateAngleZ = 2.98451302F;

		bodyModel[106].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 159
		bodyModel[106].setRotationPoint(-27F, -26.1F, 4F);
		bodyModel[106].rotateAngleZ = -3.00196631F;

		bodyModel[107].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 160
		bodyModel[107].setRotationPoint(-29F, -26.25F, 4F);
		bodyModel[107].rotateAngleZ = -0.12217305F;

		bodyModel[108].addBox(-8F, 0F, 0F, 8, 1, 1, 0F); // Box 161
		bodyModel[108].setRotationPoint(-29F, -26.25F, -5F);
		bodyModel[108].rotateAngleZ = -0.12217305F;

		bodyModel[109].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 162
		bodyModel[109].setRotationPoint(-28F, -28F, -5F);
		bodyModel[109].rotateAngleZ = 0.17453293F;

		bodyModel[110].addBox(-8F, -1F, 0F, 8, 1, 1, 0F); // Box 163
		bodyModel[110].setRotationPoint(-27F, -26.1F, -5F);
		bodyModel[110].rotateAngleZ = -3.00196631F;

		bodyModel[111].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 164
		bodyModel[111].setRotationPoint(-28F, -28F, -5F);
		bodyModel[111].rotateAngleZ = 2.98451302F;

		bodyModel[112].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 181
		bodyModel[112].setRotationPoint(46F, 0F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 181
		bodyModel[113].setRotationPoint(-51F, 0F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 3, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[114].setRotationPoint(-4F, -26.25F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[115].setRotationPoint(-16F, -26.25F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		bodyModel[116].setRotationPoint(-16F, -24.25F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[117].setRotationPoint(-16F, -27.25F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[118].setRotationPoint(-16F, -26.25F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		bodyModel[119].setRotationPoint(-16F, -24.25F, -4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[120].setRotationPoint(-16F, -27.25F, -4F);

		bodyModel[121].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[121].setRotationPoint(-25F, -17.75F, 6F);

		bodyModel[122].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[122].setRotationPoint(-32F, -17.75F, 6F);

		bodyModel[123].addShapeBox(0F, -8F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[123].setRotationPoint(-31F, -17.75F, -7F);

		bodyModel[124].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[124].setRotationPoint(-25F, -17.75F, -7F);

		bodyModel[125].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[125].setRotationPoint(-32F, -17.75F, -7F);

		bodyModel[126].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[126].setRotationPoint(31F, -17.75F, 6F);

		bodyModel[127].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[127].setRotationPoint(24F, -17.75F, 6F);

		bodyModel[128].addShapeBox(0F, -8F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[128].setRotationPoint(25F, -17.75F, -7F);

		bodyModel[129].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[129].setRotationPoint(31F, -17.75F, -7F);

		bodyModel[130].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[130].setRotationPoint(24F, -17.75F, -7F);

		bodyModel[131].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[131].setRotationPoint(17F, -17.75F, 6F);

		bodyModel[132].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[132].setRotationPoint(10F, -17.75F, 6F);

		bodyModel[133].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[133].setRotationPoint(5F, -19.75F, 6F);

		bodyModel[134].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[134].setRotationPoint(-2F, -19.75F, 6F);

		bodyModel[135].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[135].setRotationPoint(-11F, -17.75F, 6F);

		bodyModel[136].addShapeBox(0F, -8F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[136].setRotationPoint(-18F, -17.75F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 22, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[137].setRotationPoint(-23F, -22.25F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 22, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[138].setRotationPoint(22F, -22.25F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[139].setRotationPoint(-30F, -1F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 48, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[140].setRotationPoint(-24F, -1F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[141].setRotationPoint(24F, -1F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[142].setRotationPoint(30F, -1F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[143].setRotationPoint(24F, -1F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[144].setRotationPoint(24F, 0F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[145].setRotationPoint(24F, 1F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[146].setRotationPoint(24F, -1F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[147].setRotationPoint(24F, 0F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[148].setRotationPoint(24F, 1F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[149].setRotationPoint(-30F, -1F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[150].setRotationPoint(-30F, 0F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[151].setRotationPoint(-30F, 1F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[152].setRotationPoint(-30F, -1F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[153].setRotationPoint(-30F, 0F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[154].setRotationPoint(-30F, 1F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[155].setRotationPoint(-27F, 2F, -1.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 22
		bodyModel[156].setRotationPoint(-1F, -27.25F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 22
		bodyModel[157].setRotationPoint(-17F, -24.75F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 22
		bodyModel[158].setRotationPoint(11F, -25F, 6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -2.125F, 0F); // Box 22
		bodyModel[159].setRotationPoint(6F, -25F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 2.625F, 0F); // Box 22
		bodyModel[160].setRotationPoint(-10F, -27.25F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 22
		bodyModel[161].setRotationPoint(-24F, -24.75F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 22
		bodyModel[162].setRotationPoint(18F, -24.75F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[163].setRotationPoint(24F, 2F, -1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight
		bodyModel[164].setRotationPoint(-48F, -5.5F, 4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Headlight
		bodyModel[165].setRotationPoint(-48F, -5.5F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Headlight
		bodyModel[166].setRotationPoint(-48F, -4.5F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Headlight
		bodyModel[167].setRotationPoint(-48F, -4.5F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // A
		bodyModel[168].setRotationPoint(-48F, -4.5F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // A
		bodyModel[169].setRotationPoint(-48F, -5.5F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // A
		bodyModel[170].setRotationPoint(-48F, -5.5F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // A
		bodyModel[171].setRotationPoint(-48F, -4.5F, 8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Headlight
		bodyModel[172].setRotationPoint(-48F, -4.5F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight
		bodyModel[173].setRotationPoint(-48F, -5.5F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Headlight
		bodyModel[174].setRotationPoint(-48F, -5.5F, -5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Headlight
		bodyModel[175].setRotationPoint(-48F, -4.5F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // A
		bodyModel[176].setRotationPoint(-48F, -4.5F, -8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // A
		bodyModel[177].setRotationPoint(-48F, -5.5F, -8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // A
		bodyModel[178].setRotationPoint(-48F, -5.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // A
		bodyModel[179].setRotationPoint(-48F, -4.5F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // A
		bodyModel[180].setRotationPoint(-47.8F, -11.5F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // A
		bodyModel[181].setRotationPoint(-47.8F, -11.5F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // A
		bodyModel[182].setRotationPoint(-47.8F, -10.5F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // A
		bodyModel[183].setRotationPoint(-47.8F, -10.5F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // A
		bodyModel[184].setRotationPoint(47F, -5.5F, 4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // A
		bodyModel[185].setRotationPoint(47F, -5.5F, 5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // A
		bodyModel[186].setRotationPoint(47F, -4.5F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // A
		bodyModel[187].setRotationPoint(47F, -4.5F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Headlight
		bodyModel[188].setRotationPoint(47F, -4.5F, 7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Headlight
		bodyModel[189].setRotationPoint(47F, -5.5F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight
		bodyModel[190].setRotationPoint(47F, -5.5F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Headlight
		bodyModel[191].setRotationPoint(47F, -4.5F, 8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Headlight
		bodyModel[192].setRotationPoint(47F, -4.5F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Headlight
		bodyModel[193].setRotationPoint(47F, -4.5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Headlight
		bodyModel[194].setRotationPoint(47F, -5.5F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight
		bodyModel[195].setRotationPoint(47F, -5.5F, -9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // A
		bodyModel[196].setRotationPoint(47F, -4.5F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // A
		bodyModel[197].setRotationPoint(47F, -4.5F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // A
		bodyModel[198].setRotationPoint(47F, -5.5F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // A
		bodyModel[199].setRotationPoint(47F, -5.5F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Headlight
		bodyModel[200].setRotationPoint(46.8F, -10.5F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight
		bodyModel[201].setRotationPoint(46.8F, -11.5F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Headlight
		bodyModel[202].setRotationPoint(46.8F, -11.5F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Headlight
		bodyModel[203].setRotationPoint(46.8F, -10.5F, 0F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[204].setRotationPoint(-46F, -23F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[205].setRotationPoint(-47F, -22F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[206].setRotationPoint(-46F, -23F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[207].setRotationPoint(-47F, -22F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 243
		bodyModel[208].setRotationPoint(-47F, -22F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 244
		bodyModel[209].setRotationPoint(-46F, -23F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 245
		bodyModel[210].setRotationPoint(-46F, -23F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[211].setRotationPoint(-47F, -22F, -11F);
	}
	ModelBR155Bogie theTrucks = new ModelBR155Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(ModelRendererTurbo m :bodyModel)
		{
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==5465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BR155_bogies_noised.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BR155_bogies_noised.png"));
		}

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-1.6f, -0.05f,0.0f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslatef(-1.6f, -0.05f,0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}