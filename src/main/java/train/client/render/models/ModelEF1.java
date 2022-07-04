//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.05.2020 - 17:36:30
// Last changed on: 23.05.2020 - 17:36:30

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

public class ModelEF1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEF1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[196];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 2, 132, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 53, 91, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 151, 99, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 53, 72, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 42, 31, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 307, 103, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 101, 37, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 109, 16, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 116, 30, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 116, 9, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 303, 21, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 315, 17, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 315, 35, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 446, 16, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 446, 35, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 181, 70, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 181, 61, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 191, 60, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 191, 69, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 204, 70, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 204, 61, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 214, 69, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 228, 70, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 237, 60, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 238, 69, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 296, 9, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 296, 41, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 301, 48, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 371, 48, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 306, 48, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 311, 48, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 316, 48, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 321, 48, textureX, textureY); // Box 4
		bodyModel[36] = new ModelRendererTurbo(this, 336, 48, textureX, textureY); // Box 4
		bodyModel[37] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 346, 48, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 351, 48, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 356, 48, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 361, 48, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 366, 48, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 326, 48, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 331, 48, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 301, 5, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 371, 5, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 306, 5, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 311, 5, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 316, 5, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 321, 5, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 336, 5, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 341, 5, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 346, 5, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 351, 5, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 356, 5, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 361, 5, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 366, 5, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 326, 5, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 331, 5, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 52, 35, textureX, textureY); // Box 1
		bodyModel[62] = new ModelRendererTurbo(this, 56, 22, textureX, textureY); // Box 1
		bodyModel[63] = new ModelRendererTurbo(this, 24, 161, textureX, textureY); // Box 1
		bodyModel[64] = new ModelRendererTurbo(this, 24, 173, textureX, textureY); // Box 1
		bodyModel[65] = new ModelRendererTurbo(this, 77, 22, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Headlight body
		bodyModel[67] = new ModelRendererTurbo(this, 12, 15, textureX, textureY); // Headlight body
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Headlight body
		bodyModel[69] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Headlight body
		bodyModel[70] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Headlight body
		bodyModel[71] = new ModelRendererTurbo(this, 23, 15, textureX, textureY); // Headlight body
		bodyModel[72] = new ModelRendererTurbo(this, 178, 107, textureX, textureY); // Box 4
		bodyModel[73] = new ModelRendererTurbo(this, 167, 91, textureX, textureY); // Box 4
		bodyModel[74] = new ModelRendererTurbo(this, 219, 98, textureX, textureY); // Box 4
		bodyModel[75] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 167, 99, textureX, textureY); // Box 4
		bodyModel[77] = new ModelRendererTurbo(this, 202, 91, textureX, textureY); // Box 4
		bodyModel[78] = new ModelRendererTurbo(this, 232, 107, textureX, textureY); // Box 4
		bodyModel[79] = new ModelRendererTurbo(this, 266, 97, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 235, 81, textureX, textureY); // Box 4
		bodyModel[81] = new ModelRendererTurbo(this, 254, 83, textureX, textureY); // Box 4
		bodyModel[82] = new ModelRendererTurbo(this, 275, 77, textureX, textureY); // Box 4
		bodyModel[83] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 1
		bodyModel[84] = new ModelRendererTurbo(this, 86, 22, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 37, 22, textureX, textureY); // Box 4
		bodyModel[86] = new ModelRendererTurbo(this, 53, 32, textureX, textureY); // Box 4
		bodyModel[87] = new ModelRendererTurbo(this, 296, 16, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 296, 35, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 8, 6, textureX, textureY); // Headlight body
		bodyModel[90] = new ModelRendererTurbo(this, 40, 13, textureX, textureY, "lamp"); // Headlight top left
		bodyModel[91] = new ModelRendererTurbo(this, 2, 6, textureX, textureY); // Number board right
		bodyModel[92] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Number board left
		bodyModel[93] = new ModelRendererTurbo(this, 34, 13, textureX, textureY, "lamp"); // Headlight top right
		bodyModel[94] = new ModelRendererTurbo(this, 40, 17, textureX, textureY, "lamp"); // Headlight bottom left
		bodyModel[95] = new ModelRendererTurbo(this, 34, 17, textureX, textureY, "lamp"); // Headlight bottom right
		bodyModel[96] = new ModelRendererTurbo(this, 42, 161, textureX, textureY); // Box 427
		bodyModel[97] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 427
		bodyModel[98] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 427
		bodyModel[99] = new ModelRendererTurbo(this, 49, 174, textureX, textureY); // Box 427
		bodyModel[100] = new ModelRendererTurbo(this, 49, 162, textureX, textureY); // Box 427
		bodyModel[101] = new ModelRendererTurbo(this, 3, 163, textureX, textureY); // Box 427
		bodyModel[102] = new ModelRendererTurbo(this, 3, 176, textureX, textureY); // Box 427
		bodyModel[103] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 427
		bodyModel[104] = new ModelRendererTurbo(this, 91, 177, textureX, textureY); // Box 427
		bodyModel[105] = new ModelRendererTurbo(this, 67, 177, textureX, textureY); // Box 427
		bodyModel[106] = new ModelRendererTurbo(this, 4, 185, textureX, textureY); // Box 427
		bodyModel[107] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 427
		bodyModel[108] = new ModelRendererTurbo(this, 4, 190, textureX, textureY); // Box 427
		bodyModel[109] = new ModelRendererTurbo(this, 168, 64, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 168, 76, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 166, 69, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 253, 76, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 251, 69, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 45, 9, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 69, 2, textureX, textureY); // Box 1
		bodyModel[118] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 1
		bodyModel[119] = new ModelRendererTurbo(this, 91, 2, textureX, textureY); // Box 1
		bodyModel[120] = new ModelRendererTurbo(this, 87, 2, textureX, textureY); // Box 1
		bodyModel[121] = new ModelRendererTurbo(this, 3, 141, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 13, 22, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 14, 29, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 26, 29, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 4
		bodyModel[126] = new ModelRendererTurbo(this, 1, 72, textureX, textureY); // Box 4
		bodyModel[127] = new ModelRendererTurbo(this, 12, 116, textureX, textureY); // Box 4
		bodyModel[128] = new ModelRendererTurbo(this, 34, 116, textureX, textureY); // Box 4
		bodyModel[129] = new ModelRendererTurbo(this, 60, 2, textureX, textureY); // Box 1
		bodyModel[130] = new ModelRendererTurbo(this, 56, 2, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // Box 1
		bodyModel[132] = new ModelRendererTurbo(this, 77, 2, textureX, textureY); // Box 1
		bodyModel[133] = new ModelRendererTurbo(this, 72, 31, textureX, textureY); // Box 4
		bodyModel[134] = new ModelRendererTurbo(this, 61, 51, textureX, textureY); // Box 4
		bodyModel[135] = new ModelRendererTurbo(this, 142, 64, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 126, 64, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 344, 90, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 397, 89, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 344, 68, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 397, 67, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 358, 96, textureX, textureY); // Box 4
		bodyModel[142] = new ModelRendererTurbo(this, 402, 92, textureX, textureY); // Box 4
		bodyModel[143] = new ModelRendererTurbo(this, 411, 92, textureX, textureY); // Box 4
		bodyModel[144] = new ModelRendererTurbo(this, 402, 96, textureX, textureY); // Box 4
		bodyModel[145] = new ModelRendererTurbo(this, 411, 96, textureX, textureY); // Box 4
		bodyModel[146] = new ModelRendererTurbo(this, 363, 52, textureX, textureY); // Box 9
		bodyModel[147] = new ModelRendererTurbo(this, 351, 54, textureX, textureY); // Box 9
		bodyModel[148] = new ModelRendererTurbo(this, 369, 68, textureX, textureY); // Box 11
		bodyModel[149] = new ModelRendererTurbo(this, 360, 68, textureX, textureY); // Box 11
		bodyModel[150] = new ModelRendererTurbo(this, 339, 68, textureX, textureY); // Box 13
		bodyModel[151] = new ModelRendererTurbo(this, 392, 67, textureX, textureY); // Box 14
		bodyModel[152] = new ModelRendererTurbo(this, 339, 90, textureX, textureY); // Box 15
		bodyModel[153] = new ModelRendererTurbo(this, 325, 92, textureX, textureY); // Box 16
		bodyModel[154] = new ModelRendererTurbo(this, 330, 92, textureX, textureY); // Box 17
		bodyModel[155] = new ModelRendererTurbo(this, 330, 96, textureX, textureY); // Box 18
		bodyModel[156] = new ModelRendererTurbo(this, 325, 96, textureX, textureY); // Box 19
		bodyModel[157] = new ModelRendererTurbo(this, 358, 92, textureX, textureY); // Box 20
		bodyModel[158] = new ModelRendererTurbo(this, 392, 89, textureX, textureY); // Box 21
		bodyModel[159] = new ModelRendererTurbo(this, 419, 90, textureX, textureY); // Box 23
		bodyModel[160] = new ModelRendererTurbo(this, 407, 92, textureX, textureY); // Box 23
		bodyModel[161] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 23
		bodyModel[162] = new ModelRendererTurbo(this, 300, 79, textureX, textureY); // Box 23
		bodyModel[163] = new ModelRendererTurbo(this, 341, 96, textureX, textureY); // Box 4
		bodyModel[164] = new ModelRendererTurbo(this, 380, 95, textureX, textureY); // Box 4
		bodyModel[165] = new ModelRendererTurbo(this, 349, 57, textureX, textureY); // Box 33
		bodyModel[166] = new ModelRendererTurbo(this, 349, 65, textureX, textureY); // Box 34
		bodyModel[167] = new ModelRendererTurbo(this, 375, 55, textureX, textureY); // Box 33
		bodyModel[168] = new ModelRendererTurbo(this, 378, 65, textureX, textureY); // Box 34
		bodyModel[169] = new ModelRendererTurbo(this, 378, 72, textureX, textureY); // Box 37
		bodyModel[170] = new ModelRendererTurbo(this, 411, 72, textureX, textureY); // Box 37
		bodyModel[171] = new ModelRendererTurbo(this, 402, 75, textureX, textureY); // Box 39
		bodyModel[172] = new ModelRendererTurbo(this, 383, 75, textureX, textureY); // Box 40
		bodyModel[173] = new ModelRendererTurbo(this, 402, 85, textureX, textureY); // Box 39
		bodyModel[174] = new ModelRendererTurbo(this, 383, 85, textureX, textureY); // Box 40
		bodyModel[175] = new ModelRendererTurbo(this, 325, 72, textureX, textureY); // Box 37
		bodyModel[176] = new ModelRendererTurbo(this, 358, 72, textureX, textureY); // Box 37
		bodyModel[177] = new ModelRendererTurbo(this, 349, 75, textureX, textureY); // Box 39
		bodyModel[178] = new ModelRendererTurbo(this, 330, 75, textureX, textureY); // Box 40
		bodyModel[179] = new ModelRendererTurbo(this, 349, 85, textureX, textureY); // Box 39
		bodyModel[180] = new ModelRendererTurbo(this, 332, 85, textureX, textureY); // Box 40
		bodyModel[181] = new ModelRendererTurbo(this, 419, 78, textureX, textureY); // Box 23
		bodyModel[182] = new ModelRendererTurbo(this, 407, 81, textureX, textureY); // Box 23
		bodyModel[183] = new ModelRendererTurbo(this, 300, 90, textureX, textureY); // Box 23
		bodyModel[184] = new ModelRendererTurbo(this, 313, 92, textureX, textureY); // Box 23
		bodyModel[185] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 4
		bodyModel[186] = new ModelRendererTurbo(this, 34, 110, textureX, textureY); // Box 4
		bodyModel[187] = new ModelRendererTurbo(this, 1, 110, textureX, textureY); // Engineer's body door
		bodyModel[188] = new ModelRendererTurbo(this, 23, 110, textureX, textureY); // Fireman's body door
		bodyModel[189] = new ModelRendererTurbo(this, 61, 44, textureX, textureY); // Box 4
		bodyModel[190] = new ModelRendererTurbo(this, 30, 38, textureX, textureY); // Front cab door
		bodyModel[191] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 290, 9, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 1
		bodyModel[195] = new ModelRendererTurbo(this, 77, 19, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 79, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 0
		bodyModel[1].setRotationPoint(-36F, -3F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 53, 17, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(-11F, -19F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 15, 12, 0F); // Box 4
		bodyModel[3].setRotationPoint(-25F, -18F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 53, 17, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-11F, -19F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 4
		bodyModel[5].setRotationPoint(-37F, -19F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 4
		bodyModel[6].setRotationPoint(41F, -19F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 0
		bodyModel[7].setRotationPoint(-36F, -19F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 79, 1, 12, 0F); // Box 0
		bodyModel[8].setRotationPoint(-37F, -20F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 79, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-37F, -20F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 79, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-37F, -20F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 65, 1, 12, 0F); // Box 0
		bodyModel[11].setRotationPoint(-28F, -21F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 65, 3, 0, 0F); // Box 0
		bodyModel[12].setRotationPoint(-28F, -24F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 65, 3, 0, 0F); // Box 0
		bodyModel[13].setRotationPoint(-28F, -24F, 6F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[14].setRotationPoint(37F, -24F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[15].setRotationPoint(37F, -24F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-7F, -24F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-7F, -24F, 1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-6.5F, -22F, 1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-6.5F, -22F, -5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(4F, -24F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(4F, -24F, 1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(4.5F, -22F, 1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(4.5F, -22F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(16F, -24F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(16F, -24F, 1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(16.5F, -22F, 1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(16.5F, -22F, -5.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 79, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-37F, -20F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 79, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-37F, -20F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[30].setRotationPoint(-37F, -20F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[31].setRotationPoint(41F, -20F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[32].setRotationPoint(-31F, -20F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[33].setRotationPoint(-25F, -20F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[34].setRotationPoint(-19F, -20F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[35].setRotationPoint(-13F, -20F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[36].setRotationPoint(2F, -20F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[37].setRotationPoint(7.5F, -20F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[38].setRotationPoint(13.5F, -20F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[39].setRotationPoint(17F, -20F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[40].setRotationPoint(23F, -20F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[41].setRotationPoint(29F, -20F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[42].setRotationPoint(35F, -20F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[43].setRotationPoint(-9.5F, -20F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[44].setRotationPoint(-3.5F, -20F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[45].setRotationPoint(-37F, -20F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[46].setRotationPoint(41F, -20F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[47].setRotationPoint(-31F, -20F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[48].setRotationPoint(-25F, -20F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[49].setRotationPoint(-19F, -20F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[50].setRotationPoint(-13F, -20F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[51].setRotationPoint(2F, -20F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[52].setRotationPoint(7.5F, -20F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[53].setRotationPoint(13.5F, -20F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[54].setRotationPoint(17F, -20F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[55].setRotationPoint(23F, -20F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[56].setRotationPoint(29F, -20F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[57].setRotationPoint(35F, -20F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[58].setRotationPoint(-9.5F, -20F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[59].setRotationPoint(-3.5F, -20F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 1
		bodyModel[60].setRotationPoint(-40F, -2F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 1
		bodyModel[61].setRotationPoint(-40F, -11F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[62].setRotationPoint(-37F, -2F, 11F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 1
		bodyModel[63].setRotationPoint(-37F, -2F, 1.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 1
		bodyModel[64].setRotationPoint(-37F, -2F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[65].setRotationPoint(-37F, -2F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight body
		bodyModel[66].setRotationPoint(-37F, -24.75F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight body
		bodyModel[67].setRotationPoint(-37F, -21.75F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight body
		bodyModel[68].setRotationPoint(-37F, -24.75F, 0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F); // Headlight body
		bodyModel[69].setRotationPoint(-37F, -21.75F, 0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight body
		bodyModel[70].setRotationPoint(-37F, -24.75F, -2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight body
		bodyModel[71].setRotationPoint(-37F, -21.75F, -2.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 14, 7, 12, 0F); // Box 4
		bodyModel[72].setRotationPoint(-24F, -10F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // Box 4
		bodyModel[73].setRotationPoint(-24F, -14F, -2.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 11, 9, 0F); // Box 4
		bodyModel[74].setRotationPoint(-10F, -14F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[75].setRotationPoint(-24F, -16F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		bodyModel[76].setRotationPoint(-24F, -12F, -2.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[77].setRotationPoint(-10F, -17F, -3F);

		bodyModel[78].addBox(0F, 0F, 0F, 25, 15, 12, 0F); // Box 4
		bodyModel[78].setRotationPoint(-7F, -18F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[79].setRotationPoint(26F, -8F, -6F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 13, 12, 0F); // Box 4
		bodyModel[80].setRotationPoint(23F, -16F, -6F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[81].setRotationPoint(26F, -8F, 2F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 13, 6, 0F); // Box 4
		bodyModel[82].setRotationPoint(35F, -16F, 4F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[83].setRotationPoint(-15F, -2F, 11F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[84].setRotationPoint(-15F, -2F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 4
		bodyModel[85].setRotationPoint(-36F, -16F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[86].setRotationPoint(-36F, -12F, -3F);

		bodyModel[87].addBox(0F, 0F, 0F, 9, 4, 0, 0F); // Box 0
		bodyModel[87].setRotationPoint(-37F, -24F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 4, 0, 0F); // Box 0
		bodyModel[88].setRotationPoint(-37F, -24F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Headlight body
		bodyModel[89].setRotationPoint(-37F, -23.25F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight top left
		bodyModel[90].setRotationPoint(-37.25F, -23.5F, -1.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number board right
		bodyModel[91].setRotationPoint(-37F, -23.25F, 2.25F);
		bodyModel[91].rotateAngleY = -0.68067841F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number board left
		bodyModel[92].setRotationPoint(-35.1F, -23.25F, -4.58F);
		bodyModel[92].rotateAngleY = 0.68067841F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight top right
		bodyModel[93].setRotationPoint(-37.25F, -23.5F, 0.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight bottom left
		bodyModel[94].setRotationPoint(-37.25F, -22F, -1.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight bottom right
		bodyModel[95].setRotationPoint(-37.25F, -22F, 0.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[96].setRotationPoint(-10F, -0.5F, -1.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[97].setRotationPoint(24F, -0.5F, -1.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 427
		bodyModel[98].setRotationPoint(-24.5F, -0.5F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 427
		bodyModel[99].setRotationPoint(-24.5F, -2.5F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 427
		bodyModel[100].setRotationPoint(-24.5F, -2.5F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[101].setRotationPoint(-33F, -2F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 427
		bodyModel[102].setRotationPoint(-33F, 1F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[103].setRotationPoint(-33F, -1F, 6.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[104].setRotationPoint(-24F, 0.5F, -4F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[105].setRotationPoint(-24F, 0.5F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[106].setRotationPoint(-33F, -2F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 427
		bodyModel[107].setRotationPoint(-33F, 0F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[108].setRotationPoint(-33F, -1F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(-10.5F, -25F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(-10.5F, -25F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[111].setRotationPoint(-10.5F, -23F, -2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[112].setRotationPoint(18F, -25F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[113].setRotationPoint(18F, -25F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[114].setRotationPoint(18F, -23F, -2F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[115].setRotationPoint(-36F, -21.5F, 4.75F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[116].setRotationPoint(-33F, -20.5F, 4.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[117].setRotationPoint(-37F, -10F, 11F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[118].setRotationPoint(-33F, -10F, 11F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[119].setRotationPoint(-37F, -10F, -12F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[120].setRotationPoint(-33F, -10F, -12F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 1
		bodyModel[121].setRotationPoint(-40F, -1F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 0
		bodyModel[122].setRotationPoint(-38F, -20F, -6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[123].setRotationPoint(-38F, -20F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[124].setRotationPoint(-38F, -20F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 22, 17, 1, 0F); // Box 4
		bodyModel[125].setRotationPoint(-37F, -19F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 22, 17, 1, 0F); // Box 4
		bodyModel[126].setRotationPoint(-37F, -19F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[127].setRotationPoint(-15F, -3F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[128].setRotationPoint(-15F, -3F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[129].setRotationPoint(-15F, -15F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[130].setRotationPoint(-11F, -15F, 11F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[131].setRotationPoint(-15F, -15F, -12F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[132].setRotationPoint(-11F, -15F, -12F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 4
		bodyModel[133].setRotationPoint(-37F, -19F, 2F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 4
		bodyModel[134].setRotationPoint(-37F, -3F, -2F);

		bodyModel[135].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[135].setRotationPoint(2F, -21F, -11.02F);

		bodyModel[136].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[136].setRotationPoint(2F, -21F, 11.02F);

		bodyModel[137].addBox(-0.5F, 0F, -0.5F, 1, 13, 1, 0F); // Box 0
		bodyModel[137].setRotationPoint(-32F, -34.5F, -5F);
		bodyModel[137].rotateAngleZ = 0.52359878F;

		bodyModel[138].addBox(-0.5F, 0F, -0.5F, 1, 13, 1, 0F); // Box 0
		bodyModel[138].setRotationPoint(-7F, -34.5F, -5F);
		bodyModel[138].rotateAngleZ = -0.52359878F;

		bodyModel[139].addShapeBox(-0.5F, 0F, -0.5F, 1, 17, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-19.95F, -45.65F, -5F);
		bodyModel[139].rotateAngleZ = -0.78539816F;

		bodyModel[140].addShapeBox(-0.5F, 0F, -0.5F, 1, 17, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-19.05F, -45.65F, -5F);
		bodyModel[140].rotateAngleZ = 0.78539816F;

		bodyModel[141].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 4
		bodyModel[141].setRotationPoint(-26F, -24F, -5.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 4
		bodyModel[142].setRotationPoint(-26F, -22F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 4
		bodyModel[143].setRotationPoint(-25.5F, -23F, -5.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 4
		bodyModel[144].setRotationPoint(-15F, -22F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 4
		bodyModel[145].setRotationPoint(-14.5F, -23F, -5.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 9
		bodyModel[146].setRotationPoint(-20.95F, -47F, -4.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 9
		bodyModel[147].setRotationPoint(-18.95F, -47F, -4.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[148].setRotationPoint(-20.95F, -46F, -4.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[149].setRotationPoint(-20.95F, -46F, 3.5F);

		bodyModel[150].addShapeBox(-0.5F, 0F, -0.5F, 1, 17, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[150].setRotationPoint(-19.95F, -45.65F, 5F);
		bodyModel[150].rotateAngleZ = -0.78539816F;

		bodyModel[151].addShapeBox(-0.5F, 0F, -0.5F, 1, 17, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[151].setRotationPoint(-19.05F, -45.65F, 5F);
		bodyModel[151].rotateAngleZ = 0.78539816F;

		bodyModel[152].addBox(-0.5F, 0F, -0.5F, 1, 13, 1, 0F); // Box 15
		bodyModel[152].setRotationPoint(-31.87F, -34.5F, 5F);
		bodyModel[152].rotateAngleZ = 0.52359878F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 16
		bodyModel[153].setRotationPoint(-25.5F, -23F, 4.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 17
		bodyModel[154].setRotationPoint(-26F, -22F, 4F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
		bodyModel[155].setRotationPoint(-15F, -22F, 4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 19
		bodyModel[156].setRotationPoint(-14.5F, -23F, 4.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 20
		bodyModel[157].setRotationPoint(-26F, -24F, 4.5F);

		bodyModel[158].addBox(-0.5F, 0F, -0.5F, 1, 13, 1, 0F); // Box 21
		bodyModel[158].setRotationPoint(-7F, -34.5F, 5F);
		bodyModel[158].rotateAngleZ = -0.52359878F;

		bodyModel[159].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, -0.5F, 9F, 0F); // Box 23
		bodyModel[159].setRotationPoint(-8.77F, -32.5F, -4.5F);
		bodyModel[159].rotateAngleZ = -0.52359878F;

		bodyModel[160].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, -0.5F, 9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F); // Box 23
		bodyModel[160].setRotationPoint(-12.77F, -24.5F, -4.5F);
		bodyModel[160].rotateAngleZ = -0.52359878F;

		bodyModel[161].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -13F, -1F, 0F, -13F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 13F, -0.9F, 0F, 13F, -0.9F); // Box 23
		bodyModel[161].setRotationPoint(-21.25F, -44.35F, -3.65F);
		bodyModel[161].rotateAngleZ = -0.78539816F;

		bodyModel[162].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -1F, -0.5F, 13F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -0.9F, -0.5F, -13F, -0.9F); // Box 23
		bodyModel[162].setRotationPoint(-30.25F, -35.35F, -4.4F);
		bodyModel[162].rotateAngleZ = -0.78539816F;

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 4
		bodyModel[163].setRotationPoint(-25F, -24F, -4.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 4
		bodyModel[164].setRotationPoint(-15F, -24F, -4.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 33
		bodyModel[165].setRotationPoint(-18.95F, -47F, 4.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 34
		bodyModel[166].setRotationPoint(-20.95F, -47F, 4.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[167].setRotationPoint(-18.95F, -47F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[168].setRotationPoint(-20.95F, -47F, -8.5F);

		bodyModel[169].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[169].setRotationPoint(-17.5F, -44.1F, 8F);
		bodyModel[169].rotateAngleZ = 0.78539816F;

		bodyModel[170].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[170].setRotationPoint(-17.5F, -44.1F, -8F);
		bodyModel[170].rotateAngleZ = 0.78539816F;

		bodyModel[171].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[171].setRotationPoint(-17.5F, -44.1F, -7F);
		bodyModel[171].rotateAngleZ = 0.78539816F;

		bodyModel[172].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[172].setRotationPoint(-17.5F, -44.1F, 5F);
		bodyModel[172].rotateAngleZ = 0.78539816F;

		bodyModel[173].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[173].setRotationPoint(-10.43F, -37.03F, -7F);
		bodyModel[173].rotateAngleZ = 0.78539816F;

		bodyModel[174].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[174].setRotationPoint(-10.43F, -37.03F, 5F);
		bodyModel[174].rotateAngleZ = 0.78539816F;

		bodyModel[175].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[175].setRotationPoint(-21.5F, -44.1F, 8F);
		bodyModel[175].rotateAngleZ = -0.78539816F;

		bodyModel[176].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[176].setRotationPoint(-21.5F, -44.1F, -8F);
		bodyModel[176].rotateAngleZ = -0.78539816F;

		bodyModel[177].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[177].setRotationPoint(-21.5F, -44.1F, -7F);
		bodyModel[177].rotateAngleZ = -0.78539816F;

		bodyModel[178].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[178].setRotationPoint(-21.5F, -44.1F, 5F);
		bodyModel[178].rotateAngleZ = -0.78539816F;

		bodyModel[179].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[179].setRotationPoint(-28.57F, -37.03F, -7F);
		bodyModel[179].rotateAngleZ = -0.78539816F;

		bodyModel[180].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[180].setRotationPoint(-28.57F, -37.03F, 5F);
		bodyModel[180].rotateAngleZ = -0.78539816F;

		bodyModel[181].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -13F, -1F, 0F, -13F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 13F, -0.9F, 0F, 13F, -0.9F); // Box 23
		bodyModel[181].setRotationPoint(-17.75F, -44.35F, -3.65F);
		bodyModel[181].rotateAngleZ = 0.78539816F;

		bodyModel[182].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -1F, -0.5F, 13F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -0.9F, -0.5F, -13F, -0.9F); // Box 23
		bodyModel[182].setRotationPoint(-8.75F, -35.35F, -4.4F);
		bodyModel[182].rotateAngleZ = 0.78539816F;

		bodyModel[183].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 9F, 0F, 0F, 9F, 0F); // Box 23
		bodyModel[183].setRotationPoint(-30.85F, -32.5F, -4.5F);
		bodyModel[183].rotateAngleZ = 0.54105207F;

		bodyModel[184].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, -9F, 0F); // Box 23
		bodyModel[184].setRotationPoint(-25.65F, -24.5F, -4.5F);
		bodyModel[184].rotateAngleZ = 0.50614548F;

		bodyModel[185].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 4
		bodyModel[185].setRotationPoint(-15F, -19F, 10F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 4
		bodyModel[186].setRotationPoint(-15F, -19F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Engineer's body door
		bodyModel[187].setRotationPoint(-15F, -17F, 10F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Fireman's body door
		bodyModel[188].setRotationPoint(-15F, -17F, -11F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 4
		bodyModel[189].setRotationPoint(-37F, -19F, -2F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Front cab door
		bodyModel[190].setRotationPoint(-37F, -17F, -2F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 0
		bodyModel[191].setRotationPoint(-39F, -17F, -2F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 2, 12, 0F); // Box 0
		bodyModel[192].setRotationPoint(-37.02F, -20F, -6F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 0
		bodyModel[193].setRotationPoint(-33F, -24F, -6F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 1
		bodyModel[194].setRotationPoint(-40F, -1F, 11F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 1
		bodyModel[195].setRotationPoint(-40F, -1F, -11F);
	}
	ModelEF1d theTrucksRear = new ModelEF1d();
	ModelEF1tp theTrucksFront = new ModelEF1tp();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 196; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1tp_black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));

		}
		GL11.glPushMatrix();
		GL11.glTranslatef(1.5F, 0F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucksRear.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1tp_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.3125F, -0F, 0);
		theTrucksFront.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelEF1[];
}