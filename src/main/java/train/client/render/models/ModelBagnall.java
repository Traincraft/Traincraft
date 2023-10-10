//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.01.2023 - 13:34:54
// Last changed on: 04.01.2023 - 13:34:54

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelBagnall extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBagnall() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[133];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 93, 69, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 92, 97, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 244, 118, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 272, 118, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 330, 109, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 246, 114, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 240, 79, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 242, 88, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 330, 98, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 84
		bodyModel[80] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 85
		bodyModel[81] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 92
		bodyModel[88] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[112] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[113] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[114] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[115] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 123
		bodyModel[118] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 124
		bodyModel[119] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 125
		bodyModel[120] = new ModelRendererTurbo(this, 238, 66, textureX, textureY); // Box 126
		bodyModel[121] = new ModelRendererTurbo(this, 218, 64, textureX, textureY); // Box 125
		bodyModel[122] = new ModelRendererTurbo(this, 218, 64, textureX, textureY); // Box 125
		bodyModel[123] = new ModelRendererTurbo(this, 218, 68, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 218, 68, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[126] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[127] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[128] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[129] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[130] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[131] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp
		bodyModel[132] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Lamp

		bodyModel[0].addBox(0F, 0F, 0F, 1, 8, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, -1F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-21F, 0F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 47, 6, 12, 0F); // Box 2
		bodyModel[2].setRotationPoint(-26F, 1F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Box 4
		bodyModel[3].setRotationPoint(20F, -21F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 5
		bodyModel[4].setRotationPoint(4F, -14F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 6
		bodyModel[5].setRotationPoint(4F, -14F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 7
		bodyModel[6].setRotationPoint(4F, -14F, 4F);

		bodyModel[7].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(4F, -14F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 28, 14, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(-24F, -14F, 5F);

		bodyModel[9].addBox(0F, 0F, 0F, 28, 14, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(-24F, -14F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-24F, -15F, 5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-24F, -15F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-24F, -15F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-24F, -15F, 1F);

		bodyModel[14].addBox(0F, 0F, 0F, 28, 1, 2, 0F); // Box 15
		bodyModel[14].setRotationPoint(-24F, -16F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 16
		bodyModel[15].setRotationPoint(4F, -14F, -4F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 7, 22, 0F); // Box 19
		bodyModel[16].setRotationPoint(4F, -21F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 20
		bodyModel[17].setRotationPoint(5F, -21F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 21
		bodyModel[18].setRotationPoint(5F, -21F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 22
		bodyModel[19].setRotationPoint(-27F, -1F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 23
		bodyModel[20].setRotationPoint(-27F, -1F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 24
		bodyModel[21].setRotationPoint(-25F, -14F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-25F, -14F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[23].setRotationPoint(-25F, -14F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		bodyModel[24].setRotationPoint(-25F, -15F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-25F, -15F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-25F, -15F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 30
		bodyModel[27].setRotationPoint(-25F, -16F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-25F, -15F, 1F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 32
		bodyModel[29].setRotationPoint(-25F, -15F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-25F, -15F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-25F, -15F, 1F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 35
		bodyModel[32].setRotationPoint(21F, -1F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 8, 18, 0F); // Box 36
		bodyModel[33].setRotationPoint(21F, -1F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 37
		bodyModel[34].setRotationPoint(21F, -1F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 38
		bodyModel[35].setRotationPoint(-4F, -6F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 39
		bodyModel[36].setRotationPoint(-5F, -6F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 40
		bodyModel[37].setRotationPoint(-5F, -6F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 41
		bodyModel[38].setRotationPoint(-4F, -6F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 21, 1, 0F); // Box 42
		bodyModel[39].setRotationPoint(15F, -21F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 21, 1, 0F); // Box 43
		bodyModel[40].setRotationPoint(15F, -21F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 44
		bodyModel[41].setRotationPoint(4F, -23F, 4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 45
		bodyModel[42].setRotationPoint(4F, -23F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 46
		bodyModel[43].setRotationPoint(4F, -24F, -4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 47
		bodyModel[44].setRotationPoint(4F, -23F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 48
		bodyModel[45].setRotationPoint(20F, -23F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(4F, -23F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[47].setRotationPoint(4F, -23F, 4F);

		bodyModel[48].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 51
		bodyModel[48].setRotationPoint(-5F, -7F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 52
		bodyModel[49].setRotationPoint(-5F, -7F, 6F);

		bodyModel[50].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 55
		bodyModel[50].setRotationPoint(-17F, 2F, 6.1F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 56
		bodyModel[51].setRotationPoint(3F, 2F, 6.1F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 57
		bodyModel[52].setRotationPoint(3F, 2F, -6.05F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 58
		bodyModel[53].setRotationPoint(-17F, 2F, -6.05F);

		bodyModel[54].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 59
		bodyModel[54].setRotationPoint(-12F, 8F, 6.2F);

		bodyModel[55].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 60
		bodyModel[55].setRotationPoint(-12F, 8F, -6.1F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 61
		bodyModel[56].setRotationPoint(-21F, 1F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 62
		bodyModel[57].setRotationPoint(-24F, 3F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 63
		bodyModel[58].setRotationPoint(-24F, 6F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 64
		bodyModel[59].setRotationPoint(-24F, 1F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 65
		bodyModel[60].setRotationPoint(-25F, 1F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 66
		bodyModel[61].setRotationPoint(-25F, 1F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 67
		bodyModel[62].setRotationPoint(-24F, 1F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 68
		bodyModel[63].setRotationPoint(-24F, 6F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 69
		bodyModel[64].setRotationPoint(-24F, 3F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 70
		bodyModel[65].setRotationPoint(-21F, 1F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 71
		bodyModel[66].setRotationPoint(-24F, 0F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 72
		bodyModel[67].setRotationPoint(-26F, 0F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 73
		bodyModel[68].setRotationPoint(20F, 1F, 9F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 74
		bodyModel[69].setRotationPoint(17F, 1F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 75
		bodyModel[70].setRotationPoint(17F, 3F, 10F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 76
		bodyModel[71].setRotationPoint(17F, 6F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 77
		bodyModel[72].setRotationPoint(16F, 1F, 9F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 78
		bodyModel[73].setRotationPoint(20F, 1F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 79
		bodyModel[74].setRotationPoint(17F, 3F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 80
		bodyModel[75].setRotationPoint(17F, 1F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 81
		bodyModel[76].setRotationPoint(17F, 6F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 82
		bodyModel[77].setRotationPoint(16F, 1F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[78].setRotationPoint(20F, -23F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[79].setRotationPoint(20F, -23F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[80].setRotationPoint(4F, -22F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[81].setRotationPoint(4F, -22F, -12F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 87
		bodyModel[82].setRotationPoint(22F, 0F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 88
		bodyModel[83].setRotationPoint(22F, 0F, 5F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 89
		bodyModel[84].setRotationPoint(-30F, 0F, 5F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 90
		bodyModel[85].setRotationPoint(-30F, 0F, -7F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 91
		bodyModel[86].setRotationPoint(-31F, -1F, 4F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 92
		bodyModel[87].setRotationPoint(-31F, -1F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 93
		bodyModel[88].setRotationPoint(25F, -1F, -8F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 94
		bodyModel[89].setRotationPoint(25F, -1F, 4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 96
		bodyModel[90].setRotationPoint(3F, -24F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 97
		bodyModel[91].setRotationPoint(3F, -24F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[92].setRotationPoint(-2F, -16F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 99
		bodyModel[93].setRotationPoint(-2F, -16F, -4F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 100
		bodyModel[94].setRotationPoint(5F, -11F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 101
		bodyModel[95].setRotationPoint(5F, -11F, 4F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 98
		bodyModel[96].setRotationPoint(9F, -4F, 6F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 99
		bodyModel[97].setRotationPoint(9F, -5F, 6F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 100
		bodyModel[98].setRotationPoint(9F, -5F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 101
		bodyModel[99].setRotationPoint(9F, -4F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[100].setRotationPoint(13F, -10F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[101].setRotationPoint(13F, -5F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[102].setRotationPoint(13F, -5F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[103].setRotationPoint(13F, -10F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[104].setRotationPoint(5F, -13F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[105].setRotationPoint(5F, -13F, 4F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 107
		bodyModel[106].setRotationPoint(5F, -10F, 4F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 108
		bodyModel[107].setRotationPoint(5F, -10F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[108].setRotationPoint(6F, -10F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[109].setRotationPoint(6F, -10F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[110].setRotationPoint(-6F, -17F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[111].setRotationPoint(-25.5F, -16F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[112].setRotationPoint(-25.5F, -16F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Lamp
		bodyModel[113].setRotationPoint(-25.5F, -15F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[114].setRotationPoint(-25.5F, -15F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[115].setRotationPoint(-28F, 1F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[116].setRotationPoint(-29F, 2F, -1F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[117].setRotationPoint(-30F, 1F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 124
		bodyModel[118].setRotationPoint(22F, 1F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 125
		bodyModel[119].setRotationPoint(24F, 1F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 126
		bodyModel[120].setRotationPoint(23F, 2F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 125
		bodyModel[121].setRotationPoint(23.5F, 1F, -2F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 125
		bodyModel[122].setRotationPoint(-28.5F, 1F, -2F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 125
		bodyModel[123].setRotationPoint(21.5F, 3F, 0F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 125
		bodyModel[124].setRotationPoint(-30.5F, 3F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[125].setRotationPoint(20.5F, -6F, -8.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[126].setRotationPoint(20.5F, -6F, -7.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Lamp
		bodyModel[127].setRotationPoint(20.5F, -5F, -7.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[128].setRotationPoint(20.5F, -5F, -8.25F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[129].setRotationPoint(20.5F, -6F, 5.75F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[130].setRotationPoint(20.5F, -6F, 6.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Lamp
		bodyModel[131].setRotationPoint(20.5F, -5F, 6.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[132].setRotationPoint(20.5F, -5F, 5.75F);
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.6, 1.5D, 0});
			}
		};
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 133; i++) {
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