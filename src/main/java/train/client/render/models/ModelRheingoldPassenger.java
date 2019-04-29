//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 18:04:12
// Last changed on: 29.03.2018 - 18:04:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRheingoldPassenger extends ModelConverter
{
	int textureX = 512;
	int textureY = 256;

		public ModelRheingoldPassenger() //Same as Filename
		{
			bodyModel = new ModelRendererTurbo[183];

			initbodyModel_1();

			translateAll(0F, 0F, 0F);


			flipAll();
		}

		private void initbodyModel_1()
		{
			bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
			bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
			bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
			bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
			bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 4
			bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
			bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
			bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
			bodyModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
			bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
			bodyModel[10] = new ModelRendererTurbo(this, 104, 65, textureX, textureY); // Box 13
			bodyModel[11] = new ModelRendererTurbo(this, 79, 106, textureX, textureY); // Box 15
			bodyModel[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
			bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
			bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
			bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
			bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 23
			bodyModel[17] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 24
			bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
			bodyModel[19] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 26
			bodyModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
			bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 29
			bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
			bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 31
			bodyModel[24] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 32
			bodyModel[25] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 33
			bodyModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 35
			bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
			bodyModel[28] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 37
			bodyModel[29] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 39
			bodyModel[30] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 40
			bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
			bodyModel[32] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 42
			bodyModel[33] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 43
			bodyModel[34] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
			bodyModel[35] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 45
			bodyModel[36] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 46
			bodyModel[37] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
			bodyModel[38] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
			bodyModel[39] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 49
			bodyModel[40] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 50
			bodyModel[41] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 51
			bodyModel[42] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 52
			bodyModel[43] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 53
			bodyModel[44] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 54
			bodyModel[45] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
			bodyModel[46] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 56
			bodyModel[47] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 57
			bodyModel[48] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 58
			bodyModel[49] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 59
			bodyModel[50] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 60
			bodyModel[51] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 61
			bodyModel[52] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 54
			bodyModel[53] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 55
			bodyModel[54] = new ModelRendererTurbo(this, 5, 120, textureX, textureY); // Box 59
			bodyModel[55] = new ModelRendererTurbo(this, 22, 120, textureX, textureY); // Box 60
			bodyModel[56] = new ModelRendererTurbo(this, 49, 91, textureX, textureY); // Box 61
			bodyModel[57] = new ModelRendererTurbo(this, 22, 89, textureX, textureY); // Box 62
			bodyModel[58] = new ModelRendererTurbo(this, 5, 94, textureX, textureY); // Box 63
			bodyModel[59] = new ModelRendererTurbo(this, 48, 122, textureX, textureY); // Box 64
			bodyModel[60] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 67
			bodyModel[61] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 68
			bodyModel[62] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 69
			bodyModel[63] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
			bodyModel[64] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 71
			bodyModel[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 72
			bodyModel[66] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 73
			bodyModel[67] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 74
			bodyModel[68] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[69] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[70] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[71] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[72] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[73] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[74] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[75] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[76] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[77] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[78] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[79] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[80] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[81] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[82] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[83] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[84] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[85] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[86] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[87] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[88] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[89] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[90] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[91] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[92] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[93] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[94] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[95] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[96] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[97] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[98] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[99] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[100] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[101] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[102] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[103] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[104] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[105] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[106] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[107] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[108] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[109] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[110] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[111] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[112] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[113] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[114] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[115] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[116] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[117] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[118] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[119] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
			bodyModel[120] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[121] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
			bodyModel[122] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[123] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
			bodyModel[124] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[125] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[126] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[127] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[128] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[129] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[130] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[131] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[132] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[133] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[134] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[135] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[136] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[137] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[138] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[139] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[140] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[141] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[142] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[143] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[144] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[145] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[146] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[147] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[148] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[149] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[150] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[151] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[152] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[153] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[154] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[155] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[156] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[157] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[158] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[159] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[160] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[161] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[162] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[163] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[164] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[165] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[166] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
			bodyModel[167] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
			bodyModel[168] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
			bodyModel[169] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
			bodyModel[170] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
			bodyModel[171] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
			bodyModel[172] = new ModelRendererTurbo(this, 185, 59, textureX, textureY); // Box 173
			bodyModel[173] = new ModelRendererTurbo(this, 124, 65, textureX, textureY); // Box 177
			bodyModel[174] = new ModelRendererTurbo(this, 104, 65, textureX, textureY); // Box 178
			bodyModel[175] = new ModelRendererTurbo(this, 185, 59, textureX, textureY); // Box 179
			bodyModel[176] = new ModelRendererTurbo(this, 124, 65, textureX, textureY); // Box 180
			bodyModel[177] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 177
			bodyModel[178] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 178
			bodyModel[179] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 179
			bodyModel[180] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 180
			bodyModel[181] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 181
			bodyModel[182] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 182

			bodyModel[0].addBox(0F, 0F, 0F, 117, 18, 1, 0F); // Box 0
			bodyModel[0].setRotationPoint(-87F, -16F, -1F);

			bodyModel[1].addBox(0F, 0F, -1F, 5, 17, 1, 0F); // Box 1
			bodyModel[1].setRotationPoint(-92F, -15F, 0F);

			bodyModel[2].addBox(0F, 0F, 0F, 133, 1, 22, 0F); // Box 2
			bodyModel[2].setRotationPoint(-95F, 2F, -22F);

			bodyModel[3].addBox(-5F, 0F, -1F, 5, 17, 1, 0F); // Box 3
			bodyModel[3].setRotationPoint(35F, -15F, 0F);

			bodyModel[4].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 4
			bodyModel[4].setRotationPoint(35F, -16F, -1F);

			bodyModel[5].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 5
			bodyModel[5].setRotationPoint(-95F, -16F, -1F);

			bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 6
			bodyModel[6].setRotationPoint(-92F, -16F, -1F);

			bodyModel[7].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 7
			bodyModel[7].setRotationPoint(30F, -16F, -1F);

			bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 8
			bodyModel[8].setRotationPoint(-59F, 3F, -1F);

			bodyModel[9].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
			bodyModel[9].setRotationPoint(-94F, -19F, -2F);

			bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
			bodyModel[10].setRotationPoint(-95F, -23F, -20F);

			bodyModel[11].addShapeBox(0F, 0F, 0F, 123, 4, 18, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
			bodyModel[11].setRotationPoint(-90F, -23F, -20F);

			bodyModel[12].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
			bodyModel[12].setRotationPoint(37F, -19F, -20F);
			bodyModel[12].rotateAngleY = -3.14159265F;

			bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 18
			bodyModel[13].setRotationPoint(-95F, -19F, -20F);

			bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
			bodyModel[14].setRotationPoint(37F, -19F, -20F);

			bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 21
			bodyModel[15].setRotationPoint(-98F, 2F, -17F);

			bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
			bodyModel[16].setRotationPoint(-98F, -17F, -18F);

			bodyModel[17].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 24
			bodyModel[17].setRotationPoint(-98F, -15F, -5F);

			bodyModel[18].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 25
			bodyModel[18].setRotationPoint(-98F, -15F, -18F);

			bodyModel[19].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 26
			bodyModel[19].setRotationPoint(-95F, -16F, -21F);

			bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 28
			bodyModel[20].setRotationPoint(-97F, 2F, -3F);

			bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 29
			bodyModel[21].setRotationPoint(-97F, 2F, -20F);

			bodyModel[22].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 30
			bodyModel[22].setRotationPoint(-95F, -16F, -22F);

			bodyModel[23].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 31
			bodyModel[23].setRotationPoint(-92F, -16F, -22F);

			bodyModel[24].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 32
			bodyModel[24].setRotationPoint(-92F, -15F, -22F);

			bodyModel[25].addBox(0F, 0F, 0F, 117, 18, 1, 0F); // Box 33
			bodyModel[25].setRotationPoint(-87F, -16F, -22F);

			bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
			bodyModel[26].setRotationPoint(-98F, 1F, -21F);

			bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
			bodyModel[27].setRotationPoint(-98F, 1F, -4F);

			bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 37
			bodyModel[28].setRotationPoint(30F, 2F, 0F);

			bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 39
			bodyModel[29].setRotationPoint(2F, 3F, -21F);
			bodyModel[29].rotateAngleY = -3.14159265F;

			bodyModel[30].addBox(0F, 0F, 0F, 47, 5, 22, 0F); // Box 40
			bodyModel[30].setRotationPoint(-52F, 3F, -22F);

			bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
			bodyModel[31].setRotationPoint(-95F, -19F, -2F);

			bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
			bodyModel[32].setRotationPoint(37F, -19F, -2F);

			bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
			bodyModel[33].setRotationPoint(38F, -19F, -20F);
			bodyModel[33].rotateAngleY = -3.14159265F;

			bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
			bodyModel[34].setRotationPoint(-94F, -19F, -20F);
			bodyModel[34].rotateAngleY = -3.14159265F;

			bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 45
			bodyModel[35].setRotationPoint(-5F, 3F, -1F);

			bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 46
			bodyModel[36].setRotationPoint(-52F, 3F, -21F);
			bodyModel[36].rotateAngleY = -3.14159265F;

			bodyModel[37].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 47
			bodyModel[37].setRotationPoint(30F, -16F, -22F);

			bodyModel[38].addBox(-5F, 0F, 0F, 5, 17, 1, 0F); // Box 48
			bodyModel[38].setRotationPoint(35F, -15F, -22F);

			bodyModel[39].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 49
			bodyModel[39].setRotationPoint(35F, -16F, -22F);

			bodyModel[40].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 50
			bodyModel[40].setRotationPoint(37F, -16F, -21F);

			bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 51
			bodyModel[41].setRotationPoint(38F, 2F, -17F);

			bodyModel[42].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 52
			bodyModel[42].setRotationPoint(38F, -15F, -5F);

			bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
			bodyModel[43].setRotationPoint(38F, -17F, -18F);

			bodyModel[44].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 54
			bodyModel[44].setRotationPoint(38F, -15F, -18F);

			bodyModel[45].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
			bodyModel[45].setRotationPoint(38F, 2F, -20F);

			bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
			bodyModel[46].setRotationPoint(39.5F, 1F, -21F);

			bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
			bodyModel[47].setRotationPoint(39.5F, 1F, -4F);

			bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
			bodyModel[48].setRotationPoint(38F, 2F, -3F);

			bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 59
			bodyModel[49].setRotationPoint(-92F, 2F, 0F);

			bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 60
			bodyModel[50].setRotationPoint(-87F, 2F, -22F);
			bodyModel[50].rotateAngleY = -3.14159265F;

			bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 61
			bodyModel[51].setRotationPoint(35F, 2F, -22F);
			bodyModel[51].rotateAngleY = -3.14159265F;

			bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 54
			bodyModel[52].setRotationPoint(12F, 3F, -12F);

			bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 55
			bodyModel[53].setRotationPoint(-73F, 3F, -12F);

			bodyModel[54].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 59
			bodyModel[54].setRotationPoint(13F, -16F, -21F);

			bodyModel[55].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 60
			bodyModel[55].setRotationPoint(13F, -16F, -11F);

			bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
			bodyModel[56].setRotationPoint(13F, -19F, -21F);

			bodyModel[57].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 62
			bodyModel[57].setRotationPoint(-71F, -16F, -11F);

			bodyModel[58].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 63
			bodyModel[58].setRotationPoint(-71F, -16F, -21F);

			bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
			bodyModel[59].setRotationPoint(-71F, -19F, -21F);

			bodyModel[60].addBox(0F, 0F, 0F, 14, 0, 7, 0F); // Box 67
			bodyModel[60].setRotationPoint(14F, -5.01F, -8F);

			bodyModel[61].addBox(0F, 0F, 0F, 14, 0, 7, 0F); // Box 68
			bodyModel[61].setRotationPoint(-85F, -5.01F, -8F);

			bodyModel[62].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 69
			bodyModel[62].setRotationPoint(27F, -5F, -8F);

			bodyModel[63].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 70
			bodyModel[63].setRotationPoint(14F, -5F, -8F);

			bodyModel[64].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 71
			bodyModel[64].setRotationPoint(-72F, -5F, -8F);

			bodyModel[65].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 72
			bodyModel[65].setRotationPoint(-85F, -5F, -8F);

			bodyModel[66].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 73
			bodyModel[66].setRotationPoint(-85F, -5F, -2F);

			bodyModel[67].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 74
			bodyModel[67].setRotationPoint(27F, -5F, -2F);

			bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[68].setRotationPoint(-68F, -8.2F, -2F);
			bodyModel[68].rotateAngleY = -3.14159265F;

			bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[69].setRotationPoint(-63.55F, -3F, -10F);
			bodyModel[69].rotateAngleY = -3.14159265F;

			bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[70].setRotationPoint(-67F, -8F, -1F);
			bodyModel[70].rotateAngleY = -3.14159265F;

			bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[71].setRotationPoint(-68F, -8.2F, -7F);
			bodyModel[71].rotateAngleY = -3.14159265F;

			bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[72].setRotationPoint(-63F, -1F, -1F);
			bodyModel[72].rotateAngleY = -3.14159265F;

			bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[73].setRotationPoint(-67.55F, -3F, -2F);
			bodyModel[73].rotateAngleY = -6.28318531F;

			bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[74].setRotationPoint(-63.5F, 0F, -1F);
			bodyModel[74].rotateAngleY = -3.14159265F;

			bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[75].setRotationPoint(-58F, -8.2F, -2F);
			bodyModel[75].rotateAngleY = -3.14159265F;

			bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[76].setRotationPoint(-53.55F, -3F, -10F);
			bodyModel[76].rotateAngleY = -3.14159265F;

			bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[77].setRotationPoint(-57F, -8F, -1F);
			bodyModel[77].rotateAngleY = -3.14159265F;

			bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[78].setRotationPoint(-58F, -8.2F, -7F);
			bodyModel[78].rotateAngleY = -3.14159265F;

			bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[79].setRotationPoint(-53F, -1F, -1F);
			bodyModel[79].rotateAngleY = -3.14159265F;

			bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[80].setRotationPoint(-57.55F, -3F, -2F);
			bodyModel[80].rotateAngleY = -6.28318531F;

			bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[81].setRotationPoint(-53.5F, 0F, -1F);
			bodyModel[81].rotateAngleY = -3.14159265F;

			bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[82].setRotationPoint(-48F, -8.2F, -2F);
			bodyModel[82].rotateAngleY = -3.14159265F;

			bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[83].setRotationPoint(-43.55F, -3F, -10F);
			bodyModel[83].rotateAngleY = -3.14159265F;

			bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[84].setRotationPoint(-47F, -8F, -1F);
			bodyModel[84].rotateAngleY = -3.14159265F;

			bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[85].setRotationPoint(-48F, -8.2F, -7F);
			bodyModel[85].rotateAngleY = -3.14159265F;

			bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[86].setRotationPoint(-43F, -1F, -1F);
			bodyModel[86].rotateAngleY = -3.14159265F;

			bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[87].setRotationPoint(-47.55F, -3F, -2F);
			bodyModel[87].rotateAngleY = -6.28318531F;

			bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[88].setRotationPoint(-43.5F, 0F, -1F);
			bodyModel[88].rotateAngleY = -3.14159265F;

			bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[89].setRotationPoint(-38F, -8.2F, -2F);
			bodyModel[89].rotateAngleY = -3.14159265F;

			bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[90].setRotationPoint(-33.55F, -3F, -10F);
			bodyModel[90].rotateAngleY = -3.14159265F;

			bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[91].setRotationPoint(-37F, -8F, -1F);
			bodyModel[91].rotateAngleY = -3.14159265F;

			bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[92].setRotationPoint(-38F, -8.2F, -7F);
			bodyModel[92].rotateAngleY = -3.14159265F;

			bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[93].setRotationPoint(-33F, -1F, -1F);
			bodyModel[93].rotateAngleY = -3.14159265F;

			bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[94].setRotationPoint(-37.55F, -3F, -2F);
			bodyModel[94].rotateAngleY = -6.28318531F;

			bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[95].setRotationPoint(-33.5F, 0F, -1F);
			bodyModel[95].rotateAngleY = -3.14159265F;

			bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[96].setRotationPoint(-19F, -8.2F, -5F);

			bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[97].setRotationPoint(-23.55F, -3F, -2F);

			bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[98].setRotationPoint(-20F, -8F, -11F);

			bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[99].setRotationPoint(-19F, -8.2F, -10F);

			bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[100].setRotationPoint(-24F, -1F, -11F);

			bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[101].setRotationPoint(-19.55F, -3F, -10F);
			bodyModel[101].rotateAngleY = -3.14159265F;

			bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[102].setRotationPoint(-23.5F, 0F, -11F);

			bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[103].setRotationPoint(-9F, -8.2F, -5F);

			bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[104].setRotationPoint(-13.55F, -3F, -2F);

			bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[105].setRotationPoint(-10F, -8F, -11F);

			bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[106].setRotationPoint(-9F, -8.2F, -10F);

			bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[107].setRotationPoint(-14F, -1F, -11F);

			bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[108].setRotationPoint(-9.55F, -3F, -10F);
			bodyModel[108].rotateAngleY = -3.14159265F;

			bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[109].setRotationPoint(-13.5F, 0F, -11F);

			bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[110].setRotationPoint(1F, -8.2F, -5F);

			bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[111].setRotationPoint(-3.55F, -3F, -2F);

			bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[112].setRotationPoint(0F, -8F, -11F);

			bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[113].setRotationPoint(1F, -8.2F, -10F);

			bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[114].setRotationPoint(-4F, -1F, -11F);

			bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[115].setRotationPoint(0.450000000000003F, -3F, -10F);
			bodyModel[115].rotateAngleY = -3.14159265F;

			bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[116].setRotationPoint(-3.5F, 0F, -11F);

			bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[117].setRotationPoint(11F, -8.2F, -5F);

			bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[118].setRotationPoint(6.45F, -3F, -2F);

			bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[119].setRotationPoint(10F, -8F, -11F);

			bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[120].setRotationPoint(11F, -8.2F, -10F);

			bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[121].setRotationPoint(6F, -1F, -11F);

			bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[122].setRotationPoint(10.45F, -3F, -10F);
			bodyModel[122].rotateAngleY = -3.14159265F;

			bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[123].setRotationPoint(6.5F, 0F, -11F);

			bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[124].setRotationPoint(10F, -8F, -21F);

			bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[125].setRotationPoint(11F, -8.2F, -20F);

			bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[126].setRotationPoint(6F, -1F, -21F);

			bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[127].setRotationPoint(10.45F, -3F, -20F);
			bodyModel[127].rotateAngleY = -3.14159265F;

			bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[128].setRotationPoint(6.45F, -3F, -17F);

			bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[129].setRotationPoint(6.5F, 0F, -21F);

			bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[130].setRotationPoint(0F, -8F, -21F);

			bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[131].setRotationPoint(1F, -8.2F, -20F);

			bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[132].setRotationPoint(-4F, -1F, -21F);

			bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[133].setRotationPoint(0.450000000000003F, -3F, -20F);
			bodyModel[133].rotateAngleY = -3.14159265F;

			bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[134].setRotationPoint(-3.55F, -3F, -17F);

			bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[135].setRotationPoint(-3.5F, 0F, -21F);

			bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[136].setRotationPoint(-10F, -8F, -21F);

			bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[137].setRotationPoint(-9F, -8.2F, -20F);

			bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[138].setRotationPoint(-14F, -1F, -21F);

			bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[139].setRotationPoint(-9.55F, -3F, -20F);
			bodyModel[139].rotateAngleY = -3.14159265F;

			bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[140].setRotationPoint(-13.55F, -3F, -17F);

			bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[141].setRotationPoint(-13.5F, 0F, -21F);

			bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[142].setRotationPoint(-20F, -8F, -21F);

			bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[143].setRotationPoint(-19F, -8.2F, -20F);

			bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[144].setRotationPoint(-24F, -1F, -21F);

			bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[145].setRotationPoint(-19.55F, -3F, -20F);
			bodyModel[145].rotateAngleY = -3.14159265F;

			bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[146].setRotationPoint(-23.55F, -3F, -17F);

			bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[147].setRotationPoint(-23.5F, 0F, -21F);

			bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[148].setRotationPoint(-67F, -8F, -16F);
			bodyModel[148].rotateAngleY = -3.14159265F;

			bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[149].setRotationPoint(-68F, -8.2F, -17F);
			bodyModel[149].rotateAngleY = -3.14159265F;

			bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[150].setRotationPoint(-63F, -1F, -16F);
			bodyModel[150].rotateAngleY = -3.14159265F;

			bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[151].setRotationPoint(-67.55F, -3F, -17F);
			bodyModel[151].rotateAngleY = -6.28318531F;

			bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[152].setRotationPoint(-63.55F, -3F, -20F);
			bodyModel[152].rotateAngleY = -3.14159265F;

			bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[153].setRotationPoint(-63.5F, 0F, -16F);
			bodyModel[153].rotateAngleY = -3.14159265F;

			bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[154].setRotationPoint(-57F, -8F, -16F);
			bodyModel[154].rotateAngleY = -3.14159265F;

			bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[155].setRotationPoint(-58F, -8.2F, -17F);
			bodyModel[155].rotateAngleY = -3.14159265F;

			bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[156].setRotationPoint(-53F, -1F, -16F);
			bodyModel[156].rotateAngleY = -3.14159265F;

			bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[157].setRotationPoint(-57.55F, -3F, -17F);
			bodyModel[157].rotateAngleY = -6.28318531F;

			bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[158].setRotationPoint(-53.55F, -3F, -20F);
			bodyModel[158].rotateAngleY = -3.14159265F;

			bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[159].setRotationPoint(-53.5F, 0F, -16F);
			bodyModel[159].rotateAngleY = -3.14159265F;

			bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[160].setRotationPoint(-47F, -8F, -16F);
			bodyModel[160].rotateAngleY = -3.14159265F;

			bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[161].setRotationPoint(-48F, -8.2F, -17F);
			bodyModel[161].rotateAngleY = -3.14159265F;

			bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[162].setRotationPoint(-43F, -1F, -16F);
			bodyModel[162].rotateAngleY = -3.14159265F;

			bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[163].setRotationPoint(-47.55F, -3F, -17F);
			bodyModel[163].rotateAngleY = -6.28318531F;

			bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[164].setRotationPoint(-43.55F, -3F, -20F);
			bodyModel[164].rotateAngleY = -3.14159265F;

			bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[165].setRotationPoint(-43.5F, 0F, -16F);
			bodyModel[165].rotateAngleY = -3.14159265F;

			bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
			bodyModel[166].setRotationPoint(-37F, -8F, -16F);
			bodyModel[166].rotateAngleY = -3.14159265F;

			bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 164
			bodyModel[167].setRotationPoint(-38F, -8.2F, -17F);
			bodyModel[167].rotateAngleY = -3.14159265F;

			bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
			bodyModel[168].setRotationPoint(-33F, -1F, -16F);
			bodyModel[168].rotateAngleY = -3.14159265F;

			bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
			bodyModel[169].setRotationPoint(-37.55F, -3F, -17F);
			bodyModel[169].rotateAngleY = -6.28318531F;

			bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
			bodyModel[170].setRotationPoint(-33.55F, -3F, -20F);
			bodyModel[170].rotateAngleY = -3.14159265F;

			bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
			bodyModel[171].setRotationPoint(-33.5F, 0F, -16F);
			bodyModel[171].rotateAngleY = -3.14159265F;

			bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
			bodyModel[172].setRotationPoint(-95F, -23F, -16F);

			bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
			bodyModel[173].setRotationPoint(-95F, -23F, -6F);

			bodyModel[174].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
			bodyModel[174].setRotationPoint(33F, -23F, -6F);

			bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
			bodyModel[175].setRotationPoint(33F, -23F, -16F);

			bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, -4F, -5F, -1F, -4F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
			bodyModel[176].setRotationPoint(33F, -23F, -20F);

			bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
			bodyModel[177].setRotationPoint(-84F, -5F, -23F);

			bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
			bodyModel[178].setRotationPoint(-84F, -5F, 0F);

			bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179
			bodyModel[179].setRotationPoint(21F, -5F, 0F);

			bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
			bodyModel[180].setRotationPoint(21F, -5F, -23F);

			bodyModel[181].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 181
			bodyModel[181].setRotationPoint(38F, 2.1F, -12F);

			bodyModel[182].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 182
			bodyModel[182].setRotationPoint(-99F, 2.1F, -12F);
		}
	private ModelRheingoldBogie bogie1 = new ModelRheingoldBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Rheingold_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-4.625,0.20,-1.045);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.32,0, 0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}