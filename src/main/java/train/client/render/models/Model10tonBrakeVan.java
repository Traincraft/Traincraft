//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 28.12.2022 - 21:40:09
// Last changed on: 28.12.2022 - 21:40:09

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Model10tonBrakeVan extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model10tonBrakeVan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[212];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 105
		bodyModel[2] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 106
		bodyModel[3] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 107
		bodyModel[4] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 108
		bodyModel[5] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 109
		bodyModel[6] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 110
		bodyModel[7] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 121
		bodyModel[8] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 122
		bodyModel[9] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 124
		bodyModel[11] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 125
		bodyModel[12] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 126
		bodyModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[16] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[19] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[20] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[22] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[24] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[26] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[28] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[29] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[30] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[31] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[32] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[33] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[34] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[35] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[36] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[37] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[38] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[40] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[42] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[44] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[47] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[48] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[50] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[51] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[52] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[53] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[58] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[64] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[68] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[69] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[70] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 121
		bodyModel[71] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 106
		bodyModel[73] = new ModelRendererTurbo(this, 210, 36, textureX, textureY); // Box 106
		bodyModel[74] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 106
		bodyModel[75] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[80] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[81] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[82] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[92] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[93] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[94] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[95] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[96] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[98] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[99] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[100] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[101] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[102] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[103] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[106] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[107] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[108] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[109] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[110] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[114] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[115] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[116] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[117] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[118] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[119] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[120] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[121] = new ModelRendererTurbo(this, 23, 74, textureX, textureY); // Box 83
		bodyModel[122] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[123] = new ModelRendererTurbo(this, 30, 74, textureX, textureY); // Box 83
		bodyModel[124] = new ModelRendererTurbo(this, 52, 74, textureX, textureY); // Box 83
		bodyModel[125] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[126] = new ModelRendererTurbo(this, 100, 101, textureX, textureY); // Box 40
		bodyModel[127] = new ModelRendererTurbo(this, 245, 160, textureX, textureY); // Box 5
		bodyModel[128] = new ModelRendererTurbo(this, 245, 160, textureX, textureY); // Box 5
		bodyModel[129] = new ModelRendererTurbo(this, 245, 160, textureX, textureY); // Box 5
		bodyModel[130] = new ModelRendererTurbo(this, 245, 160, textureX, textureY); // Box 5
		bodyModel[131] = new ModelRendererTurbo(this, 196, 152, textureX, textureY); // Box 5
		bodyModel[132] = new ModelRendererTurbo(this, 275, 129, textureX, textureY); // Box 212
		bodyModel[133] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 5
		bodyModel[134] = new ModelRendererTurbo(this, 215, 88, textureX, textureY); // Box 212
		bodyModel[135] = new ModelRendererTurbo(this, 429, 50, textureX, textureY); // Box 5
		bodyModel[136] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 5
		bodyModel[137] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 55, 105, textureX, textureY); // Box 212
		bodyModel[139] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 5
		bodyModel[140] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 212
		bodyModel[141] = new ModelRendererTurbo(this, 252, 55, textureX, textureY); // Box 5
		bodyModel[142] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 5
		bodyModel[143] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 5
		bodyModel[144] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[145] = new ModelRendererTurbo(this, 100, 101, textureX, textureY); // Box 40
		bodyModel[146] = new ModelRendererTurbo(this, 47, 75, textureX, textureY); // Box 83
		bodyModel[147] = new ModelRendererTurbo(this, 47, 75, textureX, textureY); // Box 83
		bodyModel[148] = new ModelRendererTurbo(this, 37, 75, textureX, textureY); // Box 83
		bodyModel[149] = new ModelRendererTurbo(this, 59, 75, textureX, textureY); // Box 83
		bodyModel[150] = new ModelRendererTurbo(this, 283, 205, textureX, textureY); // Box 182
		bodyModel[151] = new ModelRendererTurbo(this, 200, 205, textureX, textureY); // Box 182
		bodyModel[152] = new ModelRendererTurbo(this, 340, 163, textureX, textureY); // Box 1
		bodyModel[153] = new ModelRendererTurbo(this, 201, 163, textureX, textureY); // Box 1
		bodyModel[154] = new ModelRendererTurbo(this, 161, 43, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 180, 92, textureX, textureY); // Box 5
		bodyModel[156] = new ModelRendererTurbo(this, 167, 79, textureX, textureY); // Box 212
		bodyModel[157] = new ModelRendererTurbo(this, 180, 92, textureX, textureY); // Box 5
		bodyModel[158] = new ModelRendererTurbo(this, 175, 88, textureX, textureY); // Box 212
		bodyModel[159] = new ModelRendererTurbo(this, 179, 92, textureX, textureY); // Box 5
		bodyModel[160] = new ModelRendererTurbo(this, 179, 92, textureX, textureY); // Box 5
		bodyModel[161] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 173, 63, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 153, 69, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 153, 74, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 152, 65, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 247, 163, textureX, textureY); // Box 1
		bodyModel[167] = new ModelRendererTurbo(this, 294, 163, textureX, textureY); // Box 1
		bodyModel[168] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 67
		bodyModel[169] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 70
		bodyModel[170] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 64
		bodyModel[171] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 70
		bodyModel[172] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 33
		bodyModel[173] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 29
		bodyModel[174] = new ModelRendererTurbo(this, 180, 92, textureX, textureY); // Box 5
		bodyModel[175] = new ModelRendererTurbo(this, 167, 79, textureX, textureY); // Box 212
		bodyModel[176] = new ModelRendererTurbo(this, 180, 92, textureX, textureY); // Box 5
		bodyModel[177] = new ModelRendererTurbo(this, 175, 88, textureX, textureY); // Box 212
		bodyModel[178] = new ModelRendererTurbo(this, 179, 92, textureX, textureY); // Box 5
		bodyModel[179] = new ModelRendererTurbo(this, 179, 92, textureX, textureY); // Box 5
		bodyModel[180] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 83
		bodyModel[181] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[182] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[183] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 83
		bodyModel[184] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 83
		bodyModel[185] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 83
		bodyModel[186] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 83
		bodyModel[187] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[188] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[189] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[190] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[191] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 101
		bodyModel[192] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 102
		bodyModel[193] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[194] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 111
		bodyModel[195] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[196] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[197] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[198] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[199] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[200] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[201] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // lamp
		bodyModel[202] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 101
		bodyModel[203] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 102
		bodyModel[204] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[205] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 111
		bodyModel[206] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[207] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[208] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[209] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[210] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 83
		bodyModel[211] = new ModelRendererTurbo(this, 37, 105, textureX, textureY); // Box 83

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-21F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[1].setRotationPoint(-14F, 5F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[2].setRotationPoint(12F, 5F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 107
		bodyModel[3].setRotationPoint(-18F, 1F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 108
		bodyModel[4].setRotationPoint(-18F, 1F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 109
		bodyModel[5].setRotationPoint(8F, 1F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 110
		bodyModel[6].setRotationPoint(8F, 1F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[7].setRotationPoint(-22F, 0F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[8].setRotationPoint(-23F, 1F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[9].setRotationPoint(-24F, 0F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 124
		bodyModel[10].setRotationPoint(21F, 0F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 125
		bodyModel[11].setRotationPoint(23F, 0F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 126
		bodyModel[12].setRotationPoint(22F, 1F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[13].setRotationPoint(-24F, 0.5F, -6.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[14].setRotationPoint(-24F, 0.5F, -10.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[15].setRotationPoint(-24F, -1.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[16].setRotationPoint(-24F, -1.5F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(-24F, -1.5F, -6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[18].setRotationPoint(-24F, 2.5F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[19].setRotationPoint(-24F, 2.5F, -6.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[20].setRotationPoint(-23F, 1F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[21].setRotationPoint(-23F, 1F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[22].setRotationPoint(-23F, 0F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[23].setRotationPoint(-23F, 0F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[24].setRotationPoint(-23F, 0F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[25].setRotationPoint(-23F, 2F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[26].setRotationPoint(-23F, 2F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[27].setRotationPoint(-24F, 0.5F, 8.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[28].setRotationPoint(-24F, 0.5F, 4.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[29].setRotationPoint(-24F, -1.5F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[30].setRotationPoint(-24F, -1.5F, 4.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[31].setRotationPoint(-24F, -1.5F, 8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[32].setRotationPoint(-24F, 2.5F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[33].setRotationPoint(-24F, 2.5F, 8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[34].setRotationPoint(-23F, 1F, 8F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[35].setRotationPoint(-23F, 1F, 6F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[36].setRotationPoint(-23F, 0F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[37].setRotationPoint(-23F, 0F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[38].setRotationPoint(-23F, 2F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[39].setRotationPoint(-23F, 2F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[40].setRotationPoint(-23F, 0F, 6F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[41].setRotationPoint(23F, 0.5F, -6.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[42].setRotationPoint(23F, 0.5F, -10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[43].setRotationPoint(23F, -1.5F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[44].setRotationPoint(23F, -1.5F, -10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[45].setRotationPoint(23F, -1.5F, -6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[46].setRotationPoint(23F, 2.5F, -10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[47].setRotationPoint(23F, 2.5F, -6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[48].setRotationPoint(21F, 1F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[49].setRotationPoint(21F, 1F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[50].setRotationPoint(21F, 0F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[51].setRotationPoint(21F, 0F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[52].setRotationPoint(21F, 0F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[53].setRotationPoint(21F, 2F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[54].setRotationPoint(21F, 2F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[55].setRotationPoint(23F, 0.5F, 8.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[56].setRotationPoint(23F, 0.5F, 4.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[57].setRotationPoint(23F, -1.5F, 6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[58].setRotationPoint(23F, -1.5F, 4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[59].setRotationPoint(23F, -1.5F, 8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[60].setRotationPoint(23F, 2.5F, 4.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[61].setRotationPoint(23F, 2.5F, 8.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[62].setRotationPoint(21F, 1F, 8F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[63].setRotationPoint(21F, 1F, 6F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[64].setRotationPoint(21F, 0F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[65].setRotationPoint(21F, 0F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[66].setRotationPoint(21F, 2F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[67].setRotationPoint(21F, 2F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[68].setRotationPoint(21F, 0F, 6F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[69].setRotationPoint(-21F, 1F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[70].setRotationPoint(20F, 1F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[71].setRotationPoint(-7F, 1F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[72].setRotationPoint(-5F, 1F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[73].setRotationPoint(-9F, 1F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[74].setRotationPoint(-6F, 6F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[75].setRotationPoint(4F, 1F, 8F);

		bodyModel[76].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 106
		bodyModel[76].setRotationPoint(-14F, 6F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[77].setRotationPoint(6F, 1F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[78].setRotationPoint(6F, 3F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[79].setRotationPoint(-14.5F, 2F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[80].setRotationPoint(-14F, 2F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[81].setRotationPoint(-14F, 2F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[82].setRotationPoint(5F, 1F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(7F, 1F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[84].setRotationPoint(3F, 1F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[85].setRotationPoint(-13F, 6F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[86].setRotationPoint(-7F, 1F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 106
		bodyModel[87].setRotationPoint(-7F, 6F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[88].setRotationPoint(-8F, 1F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-13F, 3F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[90].setRotationPoint(-20F, 1.75F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[91].setRotationPoint(-20F, 1F, -8F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[92].setRotationPoint(-14.5F, 4.5F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[93].setRotationPoint(-15F, 1.25F, -8.95F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[94].setRotationPoint(-14.5F, 1.5F, -8.95F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[95].setRotationPoint(-14F, 1.75F, -8.95F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[96].setRotationPoint(11.5F, 2F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[97].setRotationPoint(12F, 2F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[98].setRotationPoint(12F, 2F, -8F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[99].setRotationPoint(11.5F, 4.5F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[100].setRotationPoint(11F, 1.25F, -8.95F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[101].setRotationPoint(11.5F, 1.5F, -8.95F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[102].setRotationPoint(12F, 1.75F, -8.95F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[103].setRotationPoint(-14.5F, 2F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[104].setRotationPoint(-14F, 2F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[105].setRotationPoint(-14F, 2F, 7F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[106].setRotationPoint(-14.5F, 4.5F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[107].setRotationPoint(-15F, 1.25F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[108].setRotationPoint(-14.5F, 1.5F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[109].setRotationPoint(-14F, 1.75F, 7.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[110].setRotationPoint(11.5F, 2F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[111].setRotationPoint(12F, 2F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[112].setRotationPoint(12F, 2F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[113].setRotationPoint(11.5F, 4.5F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[114].setRotationPoint(11F, 1.25F, 7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[115].setRotationPoint(11.5F, 1.5F, 7.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[116].setRotationPoint(12F, 1.75F, 7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[117].setRotationPoint(-20F, 1.75F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[118].setRotationPoint(-20F, 1F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[119].setRotationPoint(-21F, -19F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[120].setRotationPoint(-21F, -20F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[121].setRotationPoint(-21F, -19F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[122].setRotationPoint(-21F, -20F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[123].setRotationPoint(20F, -19F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[124].setRotationPoint(20F, -19F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[125].setRotationPoint(-21F, -20F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[126].setRotationPoint(20F, -20F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, -2F, 0.05F, 0F, -2F, 0.05F, 0F, 1.05F, 0.05F, 0F, 1.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F); // Box 5
		bodyModel[127].setRotationPoint(-20F, -21F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, -4F, 0.05F, 0F, -4F, 0.05F, -0.05F, 3F, 0.05F, -0.05F, 3F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F); // Box 5
		bodyModel[128].setRotationPoint(-20F, -22F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, 1.05F, 0.05F, 0F, 1.05F, 0.05F, 0F, -2F, 0.05F, 0F, -2F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 5
		bodyModel[129].setRotationPoint(-20F, -21F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, -0.05F, 3F, 0.05F, -0.05F, 3F, 0.05F, 0F, -4F, 0.05F, 0F, -4F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 5
		bodyModel[130].setRotationPoint(-20F, -22F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 40, 1, 10, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F); // Box 5
		bodyModel[131].setRotationPoint(-20F, -22F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[132].setRotationPoint(-21.05F, -21F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[133].setRotationPoint(-21.05F, -21F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[134].setRotationPoint(-21.05F, -22F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[135].setRotationPoint(-21.05F, -22F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[136].setRotationPoint(-21.05F, -22F, 5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[137].setRotationPoint(20.05F, -21F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[138].setRotationPoint(20.05F, -21F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[139].setRotationPoint(20.05F, -21F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[140].setRotationPoint(20.05F, -22F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[141].setRotationPoint(20.05F, -22F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[142].setRotationPoint(20.05F, -22F, 5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[143].setRotationPoint(-21.05F, -21F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[144].setRotationPoint(-21F, -12F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[145].setRotationPoint(20F, -12F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[146].setRotationPoint(11F, -19F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[147].setRotationPoint(11F, -19F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[148].setRotationPoint(-12F, -19F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[149].setRotationPoint(-12F, -19F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 40, 19, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[150].setRotationPoint(-20F, -19F, 10.02F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 40, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 182
		bodyModel[151].setRotationPoint(-20F, -19F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 20, 22, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 1
		bodyModel[152].setRotationPoint(11F, -20F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 20, 22, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[153].setRotationPoint(-12F, -20F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[154].setRotationPoint(-4F, -16F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.975F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[155].setRotationPoint(11F, -21F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 212
		bodyModel[156].setRotationPoint(11F, -21F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.975F, -1F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[157].setRotationPoint(11F, -21F, 9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 212
		bodyModel[158].setRotationPoint(11F, -22F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.975F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[159].setRotationPoint(11F, -22F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.975F, 0F, -4F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F); // Box 5
		bodyModel[160].setRotationPoint(11F, -22F, 5F);

		bodyModel[161].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 0
		bodyModel[161].setRotationPoint(-4F, -14F, -12F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[162].setRotationPoint(-4F, -8F, -12F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[163].setRotationPoint(-4F, -16F, 11F);

		bodyModel[164].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 0
		bodyModel[164].setRotationPoint(-4F, -14F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[165].setRotationPoint(-4F, -8F, 11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 19, 22, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[166].setRotationPoint(-21F, -19F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 19, 22, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 1
		bodyModel[167].setRotationPoint(20F, -19F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 67
		bodyModel[168].setRotationPoint(-16.5F, 1F, 8.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[169].setRotationPoint(15.5F, 1F, 8.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 64
		bodyModel[170].setRotationPoint(-16.5F, 1F, -8.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
		bodyModel[171].setRotationPoint(15.5F, 1F, -8.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[172].setRotationPoint(-16F, 4.75F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		bodyModel[173].setRotationPoint(-16F, 4.75F, 8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.975F, -1F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[174].setRotationPoint(-12F, -21F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[175].setRotationPoint(-12F, -21F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[176].setRotationPoint(-12F, -21F, 9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[177].setRotationPoint(-12F, -22F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.975F, -1F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[178].setRotationPoint(-12F, -22F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[179].setRotationPoint(-12F, -22F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, -1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -1F, -1F, 0F, -10F, 0F, 0.05F, 10F, 0F, 0.05F, 10F, 0F, 0F, -10F, 0F, 0F); // Box 83
		bodyModel[180].setRotationPoint(-12F, -11F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.05F, -1F, -1F, 0.05F, -1F, -1F, 0F, 0F, 0F, 0F, 10F, 0F, 0.05F, -10F, 0F, 0.05F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 83
		bodyModel[181].setRotationPoint(20F, -11F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -1F, -1F, 0.05F, -10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0.05F, -10F, 0F, 0.05F); // Box 83
		bodyModel[182].setRotationPoint(-12F, -11F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[183].setRotationPoint(9F, -19F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[184].setRotationPoint(9F, -19F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[185].setRotationPoint(-1F, -19F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[186].setRotationPoint(-1F, -19F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[187].setRotationPoint(-23.49F, -6.5F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[188].setRotationPoint(-23.49F, -6.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[189].setRotationPoint(-23.49F, -5.5F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[190].setRotationPoint(-23.49F, -5.5F, -1F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[191].setRotationPoint(-23F, -7F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 102
		bodyModel[192].setRotationPoint(-22F, -9F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[193].setRotationPoint(-23F, -8F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[194].setRotationPoint(-22F, -9F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[195].setRotationPoint(-22F, -8F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 103
		bodyModel[196].setRotationPoint(-23F, -8F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 103
		bodyModel[197].setRotationPoint(-22F, -8F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[198].setRotationPoint(22.51F, -6.5F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[199].setRotationPoint(22.51F, -6.5F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[200].setRotationPoint(22.51F, -5.5F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[201].setRotationPoint(22.51F, -5.5F, -1F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[202].setRotationPoint(21F, -7F, -1F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 102
		bodyModel[203].setRotationPoint(22F, -9F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[204].setRotationPoint(21F, -8F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[205].setRotationPoint(21F, -9F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[206].setRotationPoint(22F, -8F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 103
		bodyModel[207].setRotationPoint(21F, -8F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 103
		bodyModel[208].setRotationPoint(22F, -8F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.05F, 0F, 0F, 0.05F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0.05F, 10F, 0F, 0.05F); // Box 83
		bodyModel[209].setRotationPoint(20F, -11F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[210].setRotationPoint(20F, -19F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[211].setRotationPoint(20F, -19F, -4F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 212; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}

}
