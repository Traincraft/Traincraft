//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SwingMotionCabooseTruck
// Model Creator: Bidahochi
// Created on: 01.08.2021 - 22:09:46
// Last changed on: 01.08.2021 - 22:09:46

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelCabooseTruck2 extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCabooseTruck2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[127];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 104 cap
		bodyModel[4] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 31 cap
		bodyModel[5] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 36 cap
		bodyModel[6] = new ModelRendererTurbo(this, 8, 24, textureX, textureY); // Box 39 cap
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 76, 16, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 53, 15, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 48, 9, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 76, 12, textureX, textureY); // Box 71
		bodyModel[15] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 76, 8, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 68, 12, textureX, textureY); // Box 81
		bodyModel[20] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 87
		bodyModel[21] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Box 89
		bodyModel[22] = new ModelRendererTurbo(this, 112, 16, textureX, textureY); // Box 91
		bodyModel[23] = new ModelRendererTurbo(this, 48, 16, textureX, textureY); // Box 93
		bodyModel[24] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 63, 12, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 64, 15, textureX, textureY); // Box 96
		bodyModel[27] = new ModelRendererTurbo(this, 96, 15, textureX, textureY); // Box 97
		bodyModel[28] = new ModelRendererTurbo(this, 97, 12, textureX, textureY); // Box 98
		bodyModel[29] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 88
		bodyModel[30] = new ModelRendererTurbo(this, 67, 8, textureX, textureY); // Box 89
		bodyModel[31] = new ModelRendererTurbo(this, 89, 8, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 98, 9, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 101, 15, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 112, 12, textureX, textureY); // Box 99
		bodyModel[37] = new ModelRendererTurbo(this, 112, 12, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 60, 9, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 102
		bodyModel[40] = new ModelRendererTurbo(this, 90, 16, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 68, 16, textureX, textureY); // Box 104
		bodyModel[42] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 48, 34, textureX, textureY); // Box 106
		bodyModel[44] = new ModelRendererTurbo(this, 48, 30, textureX, textureY); // Box 107
		bodyModel[45] = new ModelRendererTurbo(this, 48, 27, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 48, 30, textureX, textureY); // Box 109
		bodyModel[47] = new ModelRendererTurbo(this, 60, 27, textureX, textureY); // Box 110
		bodyModel[48] = new ModelRendererTurbo(this, 67, 26, textureX, textureY); // Box 111
		bodyModel[49] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 112
		bodyModel[50] = new ModelRendererTurbo(this, 89, 26, textureX, textureY); // Box 113
		bodyModel[51] = new ModelRendererTurbo(this, 98, 27, textureX, textureY); // Box 114
		bodyModel[52] = new ModelRendererTurbo(this, 105, 27, textureX, textureY); // Box 115
		bodyModel[53] = new ModelRendererTurbo(this, 112, 27, textureX, textureY); // Box 116
		bodyModel[54] = new ModelRendererTurbo(this, 112, 34, textureX, textureY); // Box 117
		bodyModel[55] = new ModelRendererTurbo(this, 112, 30, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 112, 30, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 68, 30, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 121
		bodyModel[59] = new ModelRendererTurbo(this, 90, 30, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 90, 34, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 101, 33, textureX, textureY); // Box 124
		bodyModel[62] = new ModelRendererTurbo(this, 76, 34, textureX, textureY); // Box 125
		bodyModel[63] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 126
		bodyModel[64] = new ModelRendererTurbo(this, 53, 30, textureX, textureY); // Box 127
		bodyModel[65] = new ModelRendererTurbo(this, 103, 30, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 63, 30, textureX, textureY); // Box 129
		bodyModel[67] = new ModelRendererTurbo(this, 64, 33, textureX, textureY); // Box 130
		bodyModel[68] = new ModelRendererTurbo(this, 97, 30, textureX, textureY); // Box 131
		bodyModel[69] = new ModelRendererTurbo(this, 96, 33, textureX, textureY); // Box 132
		bodyModel[70] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 141
		bodyModel[71] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 142
		bodyModel[72] = new ModelRendererTurbo(this, 76, 30, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 89
		bodyModel[74] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 28
		bodyModel[75] = new ModelRendererTurbo(this, 30, 28, textureX, textureY); // Box 43
		bodyModel[76] = new ModelRendererTurbo(this, 30, 38, textureX, textureY); // Box 28
		bodyModel[77] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 43
		bodyModel[78] = new ModelRendererTurbo(this, 21, 38, textureX, textureY); // Box 28
		bodyModel[79] = new ModelRendererTurbo(this, 21, 28, textureX, textureY); // Box 43
		bodyModel[80] = new ModelRendererTurbo(this, 10, 28, textureX, textureY); // Box 43
		bodyModel[81] = new ModelRendererTurbo(this, 10, 38, textureX, textureY); // Box 28
		bodyModel[82] = new ModelRendererTurbo(this, 90, 20, textureX, textureY); // Box 103
		bodyModel[83] = new ModelRendererTurbo(this, 68, 20, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 68, 38, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 90, 38, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 31, 21, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 24, 21, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 10, 21, textureX, textureY); // Box 42
		bodyModel[89] = new ModelRendererTurbo(this, 17, 21, textureX, textureY); // Box 43
		bodyModel[90] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 59
		bodyModel[91] = new ModelRendererTurbo(this, 65, 50, textureX, textureY); // Box 60
		bodyModel[92] = new ModelRendererTurbo(this, 70, 52, textureX, textureY); // Box 61
		bodyModel[93] = new ModelRendererTurbo(this, 58, 52, textureX, textureY); // Box 62
		bodyModel[94] = new ModelRendererTurbo(this, 94, 52, textureX, textureY); // Box 63
		bodyModel[95] = new ModelRendererTurbo(this, 87, 52, textureX, textureY); // Box 65
		bodyModel[96] = new ModelRendererTurbo(this, 16, 52, textureX, textureY); // Box 66
		bodyModel[97] = new ModelRendererTurbo(this, 49, 52, textureX, textureY, "cull"); // Box 68 cull
		bodyModel[98] = new ModelRendererTurbo(this, 37, 52, textureX, textureY); // Box 69
		bodyModel[99] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 70
		bodyModel[100] = new ModelRendererTurbo(this, 13, 51, textureX, textureY); // Box 71
		bodyModel[101] = new ModelRendererTurbo(this, 27, 52, textureX, textureY); // Box 72
		bodyModel[102] = new ModelRendererTurbo(this, 27, 54, textureX, textureY); // Box 73
		bodyModel[103] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 64
		bodyModel[104] = new ModelRendererTurbo(this, 42, 52, textureX, textureY); // Box 67
		bodyModel[105] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 60
		bodyModel[106] = new ModelRendererTurbo(this, 70, 57, textureX, textureY); // Box 61
		bodyModel[107] = new ModelRendererTurbo(this, 87, 57, textureX, textureY); // Box 65
		bodyModel[108] = new ModelRendererTurbo(this, 49, 57, textureX, textureY, "cull"); // Box 68 cull
		bodyModel[109] = new ModelRendererTurbo(this, 42, 57, textureX, textureY); // Box 67
		bodyModel[110] = new ModelRendererTurbo(this, 37, 57, textureX, textureY); // Box 69
		bodyModel[111] = new ModelRendererTurbo(this, 27, 57, textureX, textureY); // Box 72
		bodyModel[112] = new ModelRendererTurbo(this, 27, 59, textureX, textureY); // Box 73
		bodyModel[113] = new ModelRendererTurbo(this, 21, 57, textureX, textureY); // Box 64
		bodyModel[114] = new ModelRendererTurbo(this, 16, 57, textureX, textureY); // Box 66
		bodyModel[115] = new ModelRendererTurbo(this, 10, 56, textureX, textureY); // Box 70
		bodyModel[116] = new ModelRendererTurbo(this, 13, 56, textureX, textureY); // Box 71
		bodyModel[117] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 59
		bodyModel[118] = new ModelRendererTurbo(this, 58, 57, textureX, textureY); // Box 62
		bodyModel[119] = new ModelRendererTurbo(this, 94, 57, textureX, textureY); // Box 124
		bodyModel[120] = new ModelRendererTurbo(this, 27, 12, textureX, textureY); // Box 89
		bodyModel[121] = new ModelRendererTurbo(this, 84, 37, textureX, textureY); // Box 89
		bodyModel[122] = new ModelRendererTurbo(this, 32, 37, textureX, textureY); // Box 89
		bodyModel[123] = new ModelRendererTurbo(this, 15, 48, textureX, textureY); // Box 22
		bodyModel[124] = new ModelRendererTurbo(this, 8, 48, textureX, textureY); // Box 22
		bodyModel[125] = new ModelRendererTurbo(this, 48, 46, textureX, textureY); // Box 14
		bodyModel[126] = new ModelRendererTurbo(this, 55, 46, textureX, textureY); // Box 14

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 14
		bodyModel[0].setRotationPoint(-6.5F, 6F, -8F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[1].setRotationPoint(-5.5F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 22
		bodyModel[2].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[3].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 cap
		bodyModel[3].setRotationPoint(-5.5F, 7F, -9F);

		bodyModel[4].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31 cap
		bodyModel[4].setRotationPoint(5.5F, 7F, -9F);

		bodyModel[5].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 cap
		bodyModel[5].setRotationPoint(-5.5F, 7F, 8F);

		bodyModel[6].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39 cap
		bodyModel[6].setRotationPoint(5.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[7].setRotationPoint(5.5F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[8].setRotationPoint(5.5F, 7F, 5.5F);

		bodyModel[9].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[9].setRotationPoint(-5.5F, 7F, 5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(-1.5F, 8F, -8.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0.25F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, -1F, 0F, -0.5F, 0F, -1F, 0.17F, 0F, 2F, 0.5F, 0F, 2F, -0.25F, 0F, -1F, -0.5F); // Box 18
		bodyModel[11].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 61
		bodyModel[12].setRotationPoint(-7.75F, 4.5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 63
		bodyModel[13].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 71
		bodyModel[14].setRotationPoint(-1.5F, 5.75F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-1.5F, 5.75F, -6.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 23
		bodyModel[16].setRotationPoint(-1.5F, 5.75F, -3.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-1.5F, 4.75F, -1.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 78
		bodyModel[18].setRotationPoint(-1.5F, 4.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[19].setRotationPoint(-2.5F, 5.5F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0.08F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.375F, 0.5F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 87
		bodyModel[20].setRotationPoint(5.5F, 4.25F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 89
		bodyModel[21].setRotationPoint(7.25F, 4.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 91
		bodyModel[22].setRotationPoint(6.5F, 5.5F, -7.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 93
		bodyModel[23].setRotationPoint(-7.5F, 5.5F, -7.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 94
		bodyModel[24].setRotationPoint(-7.5F, 5.5F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[25].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 96
		bodyModel[26].setRotationPoint(-4.5F, 7F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 97
		bodyModel[27].setRotationPoint(3.5F, 7F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[28].setRotationPoint(3.5F, 6F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 88
		bodyModel[29].setRotationPoint(-7.5F, 5.5F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[30].setRotationPoint(-3.5F, 4.5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[31].setRotationPoint(1.5F, 4.5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.375F, 0.08F, 0F, -0.375F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 92
		bodyModel[32].setRotationPoint(3.5F, 4.25F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 93
		bodyModel[33].setRotationPoint(3.5F, 5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -2F, 0.5F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0F, -2F, -0.25F, 0F, 2F, 0.5F, 0F, -1F, 0.17F, 0F, -1F, -0.5F, 0F, 2F, -0.25F); // Box 94
		bodyModel[34].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[35].setRotationPoint(1.5F, 5.5F, -8.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 99
		bodyModel[36].setRotationPoint(6.5F, 5.5F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 100
		bodyModel[37].setRotationPoint(6.5F, 5.5F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0.08F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.375F, 0.5F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 101
		bodyModel[38].setRotationPoint(-5.5F, 4.25F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.375F, 0.08F, 0F, -0.375F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 102
		bodyModel[39].setRotationPoint(-7.5F, 4.25F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[40].setRotationPoint(1.5F, 6.25F, -8.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0.15F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, -0.5F, 0.25F, 0F); // Box 104
		bodyModel[41].setRotationPoint(-2.5F, 6.25F, -8.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.375F, 0.08F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0.08F); // Box 105
		bodyModel[42].setRotationPoint(5.5F, 4.25F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 106
		bodyModel[43].setRotationPoint(6.5F, 5.5F, 6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 107
		bodyModel[44].setRotationPoint(6.5F, 5.5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 108
		bodyModel[45].setRotationPoint(7.25F, 4.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 109
		bodyModel[46].setRotationPoint(6.5F, 5.5F, 6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.08F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0.25F); // Box 110
		bodyModel[47].setRotationPoint(3.5F, 4.25F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 111
		bodyModel[48].setRotationPoint(1.5F, 4.5F, 6.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 112
		bodyModel[49].setRotationPoint(-1.5F, 4.5F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 113
		bodyModel[50].setRotationPoint(-3.5F, 4.5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.375F, 0.08F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.08F); // Box 114
		bodyModel[51].setRotationPoint(-5.5F, 4.25F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.08F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.08F, 0F, 0.25F, 0F); // Box 115
		bodyModel[52].setRotationPoint(-7.5F, 4.25F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[53].setRotationPoint(-7.75F, 4.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 117
		bodyModel[54].setRotationPoint(-7.5F, 5.5F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 118
		bodyModel[55].setRotationPoint(-7.5F, 5.5F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 119
		bodyModel[56].setRotationPoint(-7.5F, 5.5F, 6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, 0F, 0F, 0.25F); // Box 120
		bodyModel[57].setRotationPoint(1.5F, 5.5F, 6.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.15F, 0F, 0.75F, 0.25F); // Box 121
		bodyModel[58].setRotationPoint(1.5F, 6.25F, 6.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.15F); // Box 122
		bodyModel[59].setRotationPoint(-2.5F, 5.5F, 6.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.15F); // Box 123
		bodyModel[60].setRotationPoint(-2.5F, 6.25F, 6.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, -0.5F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, -1F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, 2F, -0.25F, 0F, 2F, 0.5F, 0F, -1F, 0.17F); // Box 124
		bodyModel[61].setRotationPoint(-4.5F, 6F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 125
		bodyModel[62].setRotationPoint(-1.5F, 8F, 6.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -2F, -0.25F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, 0F, -2F, 0.5F, 0F, 2F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, 0.17F, 0F, 2F, 0.5F); // Box 126
		bodyModel[63].setRotationPoint(1.5F, 6F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 127
		bodyModel[64].setRotationPoint(3.5F, 5F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-6.5F, 5F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[66].setRotationPoint(3.5F, 6F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 130
		bodyModel[67].setRotationPoint(3.5F, 7F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[68].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[69].setRotationPoint(-4.5F, 7F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[70].setRotationPoint(-1.5F, 4.75F, -5.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		bodyModel[71].setRotationPoint(-1.5F, 4.75F, 3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 88
		bodyModel[72].setRotationPoint(-1.5F, 5.75F, 6.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 89
		bodyModel[73].setRotationPoint(-1.5F, 5.75F, 3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[74].setRotationPoint(-1F, 7F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F); // Box 43
		bodyModel[75].setRotationPoint(-1F, 6.5F, 7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[76].setRotationPoint(-1F, 7F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[77].setRotationPoint(-1F, 6.5F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[78].setRotationPoint(-1F, 7F, 5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[79].setRotationPoint(-1F, 6.5F, 5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F); // Box 43
		bodyModel[80].setRotationPoint(-1F, 6.5F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[81].setRotationPoint(-1F, 7F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[82].setRotationPoint(1F, 6.25F, -8.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[83].setRotationPoint(-1.5F, 6.25F, -8.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[84].setRotationPoint(1F, 6.25F, 6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 103
		bodyModel[85].setRotationPoint(-1.5F, 6.25F, 6.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[86].setRotationPoint(-6.5F, 6F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(4.5F, 6F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[88].setRotationPoint(-6.5F, 6F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[89].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[90].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[90].setRotationPoint(5.5F, 7F, -10F);
		bodyModel[90].rotateAngleZ = 0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 60
		bodyModel[91].setRotationPoint(7.75F, 4.5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 61
		bodyModel[92].setRotationPoint(2.5F, 4.25F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.08F, 0F, -0.03F, 0F, 0F, -0.03F, 0F, 0F, -0.6F, -0.08F, 0F, -0.64F, 0F, -0.75F, -0.08F, 0F, -0.75F, -0.03F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.68F); // Box 62
		bodyModel[93].setRotationPoint(7.5F, 6F, -7.95F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.02F, -0.5F, 0F, -0.08F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.02F, -0.5F, -0.5F, -0.08F, -0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 63
		bodyModel[94].setRotationPoint(2.5F, 5.5F, -8.4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 65
		bodyModel[95].setRotationPoint(7F, 3.75F, -8F);

		bodyModel[96].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 66
		bodyModel[96].setRotationPoint(7.25F, 4F, -9.5F);
		bodyModel[96].rotateAngleZ = 0.78539816F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.01F, -0.08F, 0F, -0.01F, -0.08F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.01F, -0.08F, -0.25F, -0.01F, -0.08F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 68 cull
		bodyModel[97].setRotationPoint(2.79F, 3.5F, -8F);

		bodyModel[98].addShapeBox(-0.25F, -0.25F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[98].setRotationPoint(3.25F, 3.5F, -9F);
		bodyModel[98].rotateAngleZ = 0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[99].setRotationPoint(6.72F, 4F, -9.5F);
		bodyModel[99].rotateAngleZ = -0.65013515F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, -0.5F, 0F, 0.12F, -0.5F, 0F, 0.12F, 0F, 0F, 0.12F, 0F); // Box 71
		bodyModel[100].setRotationPoint(7.78F, 4F, -9.5F);
		bodyModel[100].rotateAngleZ = -0.28099801F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[101].setRotationPoint(3.25F, 3.15F, -9F);
		bodyModel[101].rotateAngleZ = 0.00872665F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0.13F, 0F, -0.5F, 0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.13F, 0F, -0.5F, 0.13F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[102].setRotationPoint(3.25F, 3.85F, -9F);
		bodyModel[102].rotateAngleZ = -0.25307274F;

		bodyModel[103].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 64
		bodyModel[103].setRotationPoint(7.25F, 4F, -9F);
		bodyModel[103].rotateAngleZ = 0.78539816F;

		bodyModel[104].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 67
		bodyModel[104].setRotationPoint(3.25F, 3.5F, -8.5F);
		bodyModel[104].rotateAngleZ = 0.78539816F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 60
		bodyModel[105].setRotationPoint(7.75F, 4.5F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 61
		bodyModel[106].setRotationPoint(2.5F, 4.25F, 6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 65
		bodyModel[107].setRotationPoint(7F, 3.75F, 6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.01F, -0.08F, 0F, -0.01F, -0.08F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.01F, -0.08F, -0.25F, -0.01F, -0.08F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 68 cull
		bodyModel[108].setRotationPoint(2.79F, 3.5F, 6.5F);

		bodyModel[109].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 67
		bodyModel[109].setRotationPoint(3.25F, 3.5F, 6F);
		bodyModel[109].rotateAngleZ = 0.78539816F;

		bodyModel[110].addShapeBox(-0.25F, -0.25F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[110].setRotationPoint(3.25F, 3.5F, 7.5F);
		bodyModel[110].rotateAngleZ = 0.78539816F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[111].setRotationPoint(3.25F, 3.15F, 7.5F);
		bodyModel[111].rotateAngleZ = 0.00872665F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0.13F, 0F, -0.5F, 0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.13F, 0F, -0.5F, 0.13F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[112].setRotationPoint(3.25F, 3.85F, 7.5F);
		bodyModel[112].rotateAngleZ = -0.25307274F;

		bodyModel[113].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 64
		bodyModel[113].setRotationPoint(7.25F, 4F, 7.5F);
		bodyModel[113].rotateAngleZ = 0.78539816F;

		bodyModel[114].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 66
		bodyModel[114].setRotationPoint(7.25F, 4F, 8F);
		bodyModel[114].rotateAngleZ = 0.78539816F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[115].setRotationPoint(6.72F, 4F, 8F);
		bodyModel[115].rotateAngleZ = -0.65013515F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, -0.5F, 0F, 0.12F, -0.5F, 0F, 0.12F, 0F, 0F, 0.12F, 0F); // Box 71
		bodyModel[116].setRotationPoint(7.78F, 4F, 8F);
		bodyModel[116].rotateAngleZ = -0.28099801F;

		bodyModel[117].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[117].setRotationPoint(5.5F, 7F, 7F);
		bodyModel[117].rotateAngleZ = 0.78539816F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.08F, 0F, -0.03F, 0F, 0F, -0.03F, 0F, 0F, -0.6F, -0.08F, 0F, -0.64F, 0F, -0.75F, -0.08F, 0F, -0.75F, -0.03F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.68F); // Box 62
		bodyModel[118].setRotationPoint(7.5F, 6F, 6.55F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.08F, 0F, 0F, -0.02F, 0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.08F, 0F, -0.5F, -0.02F); // Box 124
		bodyModel[119].setRotationPoint(2.5F, 5.5F, 6.4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[120].setRotationPoint(-1.5F, 7.75F, -6.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 89
		bodyModel[121].setRotationPoint(-2F, 5.75F, -6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 89
		bodyModel[122].setRotationPoint(1.5F, 5.75F, -6.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[123].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[124].setRotationPoint(4.5F, 6F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		bodyModel[125].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		bodyModel[126].setRotationPoint(-6.5F, 6F, 8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 127; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
		}
	}
}