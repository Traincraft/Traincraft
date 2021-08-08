//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelShay3TruckTender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelShay3TruckTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 47, 248, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 47, 248, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 33, 250, textureX, textureY); // Box coupler
		bodyModel[3] = new ModelRendererTurbo(this, 103, 204, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 25, 187, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 175, 208, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 76, 204, textureX, textureY); // Box 119
		bodyModel[7] = new ModelRendererTurbo(this, 166, 230, textureX, textureY); // Box 179
		bodyModel[8] = new ModelRendererTurbo(this, 356, 238, textureX, textureY); // Box 180
		bodyModel[9] = new ModelRendererTurbo(this, 321, 223, textureX, textureY); // Box 181
		bodyModel[10] = new ModelRendererTurbo(this, 422, 238, textureX, textureY); // Box 182
		bodyModel[11] = new ModelRendererTurbo(this, 387, 223, textureX, textureY); // Box 183
		bodyModel[12] = new ModelRendererTurbo(this, 437, 235, textureX, textureY); // Box 184
		bodyModel[13] = new ModelRendererTurbo(this, 26, 192, textureX, textureY); // Box 186
		bodyModel[14] = new ModelRendererTurbo(this, 175, 208, textureX, textureY, "lamp"); // Box 190 headlight rear
		bodyModel[15] = new ModelRendererTurbo(this, 162, 208, textureX, textureY); // Box 191
		bodyModel[16] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 243
		bodyModel[17] = new ModelRendererTurbo(this, 460, 227, textureX, textureY); // Box 244
		bodyModel[18] = new ModelRendererTurbo(this, 239, 162, textureX, textureY, "cull"); // Box 245 cull
		bodyModel[19] = new ModelRendererTurbo(this, 238, 163, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 238, 163, textureX, textureY); // Box 395
		bodyModel[21] = new ModelRendererTurbo(this, 246, 162, textureX, textureY); // Box 248
		bodyModel[22] = new ModelRendererTurbo(this, 246, 162, textureX, textureY); // Box 249
		bodyModel[23] = new ModelRendererTurbo(this, 238, 163, textureX, textureY); // Box 250
		bodyModel[24] = new ModelRendererTurbo(this, 238, 163, textureX, textureY); // Box 251
		bodyModel[25] = new ModelRendererTurbo(this, 270, 171, textureX, textureY); // Box 252
		bodyModel[26] = new ModelRendererTurbo(this, 284, 155, textureX, textureY); // Box 253
		bodyModel[27] = new ModelRendererTurbo(this, 282, 171, textureX, textureY); // Box 254
		bodyModel[28] = new ModelRendererTurbo(this, 272, 155, textureX, textureY); // Box 255
		bodyModel[29] = new ModelRendererTurbo(this, 274, 161, textureX, textureY); // Box 256
		bodyModel[30] = new ModelRendererTurbo(this, 271, 159, textureX, textureY); // Box 257
		bodyModel[31] = new ModelRendererTurbo(this, 283, 159, textureX, textureY); // Box 258
		bodyModel[32] = new ModelRendererTurbo(this, 162, 201, textureX, textureY); // Box 283
		bodyModel[33] = new ModelRendererTurbo(this, 175, 201, textureX, textureY, "lamp"); // Box 284 headlight rear other
		bodyModel[34] = new ModelRendererTurbo(this, 184, 204, textureX, textureY); // Box 285
		bodyModel[35] = new ModelRendererTurbo(this, 28, 186, textureX, textureY); // Box 590
		bodyModel[36] = new ModelRendererTurbo(this, 203, 204, textureX, textureY); // Box 594
		bodyModel[37] = new ModelRendererTurbo(this, 203, 204, textureX, textureY); // Box 595
		bodyModel[38] = new ModelRendererTurbo(this, 204, 203, textureX, textureY); // Box 596
		bodyModel[39] = new ModelRendererTurbo(this, 169, 222, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[40] = new ModelRendererTurbo(this, 169, 222, textureX, textureY, "lamp"); // Box 155 headlight glow
		bodyModel[41] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 367
		bodyModel[42] = new ModelRendererTurbo(this, 134, 247, textureX, textureY); // Box 368
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[47] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 24
		bodyModel[49] = new ModelRendererTurbo(this, 5, 24, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 35
		bodyModel[51] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 36
		bodyModel[52] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 37
		bodyModel[53] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 42
		bodyModel[54] = new ModelRendererTurbo(this, 15, 9, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 154 wheel gear
		bodyModel[56] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 62 wheel gear
		bodyModel[57] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 116
		bodyModel[58] = new ModelRendererTurbo(this, 21, 14, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 98
		bodyModel[65] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 115
		bodyModel[66] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 116
		bodyModel[67] = new ModelRendererTurbo(this, 2, 56, textureX, textureY); // Box 117 rod
		bodyModel[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118 rod gear
		bodyModel[69] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 119
		bodyModel[70] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 120
		bodyModel[71] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 121
		bodyModel[72] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 122
		bodyModel[73] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 123
		bodyModel[74] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 125
		bodyModel[75] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 126
		bodyModel[76] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 127
		bodyModel[77] = new ModelRendererTurbo(this, 43, 41, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 42, 39, textureX, textureY); // Box 129
		bodyModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 130 rod gear
		bodyModel[80] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 93
		bodyModel[81] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 94
		bodyModel[82] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 95
		bodyModel[83] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 96
		bodyModel[84] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 97
		bodyModel[85] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 98
		bodyModel[86] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 11
		bodyModel[91] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 12
		bodyModel[92] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 13
		bodyModel[93] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 18
		bodyModel[94] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 38
		bodyModel[95] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 39
		bodyModel[96] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 40
		bodyModel[97] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 41
		bodyModel[98] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 43
		bodyModel[99] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 44
		bodyModel[100] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 45
		bodyModel[101] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 46
		bodyModel[102] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 47
		bodyModel[103] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 48
		bodyModel[104] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 53
		bodyModel[105] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 54
		bodyModel[106] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 58
		bodyModel[107] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 59
		bodyModel[108] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 63
		bodyModel[109] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 64
		bodyModel[110] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 65
		bodyModel[111] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 70
		bodyModel[112] = new ModelRendererTurbo(this, 40, 10, textureX, textureY); // Box 73
		bodyModel[113] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 74
		bodyModel[114] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 75
		bodyModel[115] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 76
		bodyModel[116] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 77
		bodyModel[117] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 78
		bodyModel[118] = new ModelRendererTurbo(this, 29, 42, textureX, textureY); // Box 79
		bodyModel[119] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 80
		bodyModel[120] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 84
		bodyModel[121] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 85
		bodyModel[122] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 86
		bodyModel[123] = new ModelRendererTurbo(this, 6, 32, textureX, textureY); // Box 87
		bodyModel[124] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 89
		bodyModel[125] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 92
		bodyModel[126] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 94
		bodyModel[127] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 96
		bodyModel[128] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 97
		bodyModel[129] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 99
		bodyModel[130] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 100
		bodyModel[131] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 101
		bodyModel[132] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 102
		bodyModel[133] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 103
		bodyModel[134] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 104
		bodyModel[135] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 105
		bodyModel[136] = new ModelRendererTurbo(this, 14, 35, textureX, textureY); // Box 106
		bodyModel[137] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 107
		bodyModel[138] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 108
		bodyModel[139] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 109
		bodyModel[140] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 110
		bodyModel[141] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 111
		bodyModel[142] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		bodyModel[143] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 113
		bodyModel[144] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 114
		bodyModel[145] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 57

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[0].setRotationPoint(8F, 2.5F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(7F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box coupler
		bodyModel[2].setRotationPoint(9F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 10
		bodyModel[3].setRotationPoint(8F, 7F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 11
		bodyModel[4].setRotationPoint(7F, 0F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 17, 1, 20, 0F); // Box 12
		bodyModel[5].setRotationPoint(-10F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 119
		bodyModel[6].setRotationPoint(8F, 7F, 3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[7].setRotationPoint(-10F, 1F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 180
		bodyModel[8].setRotationPoint(-8F, -11F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 181
		bodyModel[9].setRotationPoint(6F, -11F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 182
		bodyModel[10].setRotationPoint(-8F, -11F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 183
		bodyModel[11].setRotationPoint(-9F, -11F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 14, 1, 16, 0F); // Box 184
		bodyModel[12].setRotationPoint(-8F, -10.5F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 3, 18, 0F); // Box 186
		bodyModel[13].setRotationPoint(8F, 4F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 headlight rear
		bodyModel[14].setRotationPoint(3.5F, -14F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 191
		bodyModel[15].setRotationPoint(1F, -14F, -1.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 243
		bodyModel[16].setRotationPoint(-7F, -12F, -2.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[17].setRotationPoint(-7.5F, -12.55F, -3F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 245 cull
		bodyModel[18].setRotationPoint(7F, -13F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[19].setRotationPoint(4F, -15F, 2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 395
		bodyModel[20].setRotationPoint(6F, -15F, 2F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 248
		bodyModel[21].setRotationPoint(4F, -13F, 2F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 249
		bodyModel[22].setRotationPoint(4F, -13F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[23].setRotationPoint(4F, -15F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 251
		bodyModel[24].setRotationPoint(6F, -15F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 252
		bodyModel[25].setRotationPoint(6.5F, -7F, 3F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 253
		bodyModel[26].setRotationPoint(6.5F, -8F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 254
		bodyModel[27].setRotationPoint(6.5F, -7F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 255
		bodyModel[28].setRotationPoint(6.5F, -8F, -6F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 256
		bodyModel[29].setRotationPoint(6.5F, -7F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 257
		bodyModel[30].setRotationPoint(6.5F, -4F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[31].setRotationPoint(6.5F, -4F, 0F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 283
		bodyModel[32].setRotationPoint(1F, -14F, -5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight rear other
		bodyModel[33].setRotationPoint(3.5F, -14F, -5.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 285
		bodyModel[34].setRotationPoint(0F, -11F, -5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 590
		bodyModel[35].setRotationPoint(8F, 1F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 594
		bodyModel[36].setRotationPoint(1F, -11F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 595
		bodyModel[37].setRotationPoint(1F, -11F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 596
		bodyModel[38].setRotationPoint(1F, -11F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 154 headlight glow
		bodyModel[39].setRotationPoint(1.5F, -13.5F, -5.51F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 155 headlight glow
		bodyModel[40].setRotationPoint(1.5F, -13.5F, -2.49F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[41].setRotationPoint(0F, 3F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[42].setRotationPoint(-4F, 3F, -1F);

		bodyModel[43].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[43].setRotationPoint(3F, 7F, 6F);

		bodyModel[44].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[44].setRotationPoint(-6F, 7F, 6F);

		bodyModel[45].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[45].setRotationPoint(-6F, 7F, -6F);

		bodyModel[46].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[46].setRotationPoint(3F, 7F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[47].setRotationPoint(-7F, 6F, -8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 24
		bodyModel[48].setRotationPoint(2F, 6F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[49].setRotationPoint(-3F, 3.5F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 35
		bodyModel[50].setRotationPoint(-2F, 3F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[51].setRotationPoint(-5F, 3F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 37
		bodyModel[52].setRotationPoint(-8F, 3F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[53].setRotationPoint(2F, 3F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 60
		bodyModel[54].setRotationPoint(-3F, 2.5F, -1.6F);

		bodyModel[55].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 154 wheel gear
		bodyModel[55].setRotationPoint(-6F, 7F, 6.75F);

		bodyModel[56].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 62 wheel gear
		bodyModel[56].setRotationPoint(3F, 7F, 6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[57].setRotationPoint(2F, 6F, 9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 69
		bodyModel[58].setRotationPoint(-7F, 6F, 9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 81
		bodyModel[59].setRotationPoint(-2F, 3F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[60].setRotationPoint(-5F, 3F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 83
		bodyModel[61].setRotationPoint(-8F, 3F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[62].setRotationPoint(2F, 3F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(2F, 6F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[64].setRotationPoint(-7F, 6F, -9.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 115
		bodyModel[65].setRotationPoint(-7F, 6F, 8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 116
		bodyModel[66].setRotationPoint(2F, 6F, 8.5F);

		bodyModel[67].addShapeBox(0F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117 rod
		bodyModel[67].setRotationPoint(-10F, 7F, 8.5F);
		bodyModel[67].rotateAngleX = 0.78539816F;

		bodyModel[68].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 118 rod gear
		bodyModel[68].setRotationPoint(-7.5F, 7F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[69].setRotationPoint(-8F, 5F, 7.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[70].setRotationPoint(-8F, 6F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[71].setRotationPoint(-8F, 9F, 7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 122
		bodyModel[72].setRotationPoint(-8F, 5F, 9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[73].setRotationPoint(-8F, 8F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[74].setRotationPoint(1F, 6F, 10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[75].setRotationPoint(1F, 5F, 7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 127
		bodyModel[76].setRotationPoint(1F, 5F, 9.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(1F, 9F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[78].setRotationPoint(1F, 8F, 9.5F);

		bodyModel[79].addShapeBox(0F, -2F, -2F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[79].setRotationPoint(1.5F, 7F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[80].setRotationPoint(-9F, 3F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[81].setRotationPoint(-9F, 3F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[82].setRotationPoint(-9F, 5F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 96
		bodyModel[83].setRotationPoint(-9F, 4F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[84].setRotationPoint(-9F, 4F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[85].setRotationPoint(5F, 5F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[86].setRotationPoint(5F, 3F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 100
		bodyModel[87].setRotationPoint(5F, 4F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[88].setRotationPoint(5F, 4F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(5F, 3F, 5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 11
		bodyModel[90].setRotationPoint(-5F, 5F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 12
		bodyModel[91].setRotationPoint(1F, 5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[92].setRotationPoint(-3.5F, 8F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 18
		bodyModel[93].setRotationPoint(-3.5F, 6F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[94].setRotationPoint(-8F, 4F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 39
		bodyModel[95].setRotationPoint(-5F, 5F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 40
		bodyModel[96].setRotationPoint(1F, 5F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[97].setRotationPoint(2F, 4F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		bodyModel[98].setRotationPoint(-3.5F, 8F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 44
		bodyModel[99].setRotationPoint(-1.25F, 7F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 45
		bodyModel[100].setRotationPoint(-2.75F, 7F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 46
		bodyModel[101].setRotationPoint(-3.5F, 6F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[102].setRotationPoint(-9F, 9F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[103].setRotationPoint(-9F, 4F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[104].setRotationPoint(2F, 5F, 7F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 54
		bodyModel[105].setRotationPoint(2F, 8F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		bodyModel[106].setRotationPoint(-2F, 3F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[107].setRotationPoint(-5F, 3F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[108].setRotationPoint(5F, 4F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[109].setRotationPoint(1F, 4F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[110].setRotationPoint(-5F, 4F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[111].setRotationPoint(-7F, 5F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[112].setRotationPoint(-7F, 8F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		bodyModel[113].setRotationPoint(-5F, 4F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 75
		bodyModel[114].setRotationPoint(-3.75F, 5F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[115].setRotationPoint(-9F, 4F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[116].setRotationPoint(6F, 4F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[117].setRotationPoint(-5F, 4F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[118].setRotationPoint(-5F, 3F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[119].setRotationPoint(-2F, 3F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[120].setRotationPoint(-8F, 4F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[121].setRotationPoint(-9F, 4F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[122].setRotationPoint(2F, 4F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[123].setRotationPoint(5F, 4F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 89
		bodyModel[124].setRotationPoint(2F, 8F, -8F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bodyModel[125].setRotationPoint(2F, 5F, -8.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[126].setRotationPoint(-7F, 5F, -8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
		bodyModel[127].setRotationPoint(-5F, 4F, -8.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 97
		bodyModel[128].setRotationPoint(-7F, 8F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[129].setRotationPoint(-9F, 9F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[130].setRotationPoint(-9F, 4F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[131].setRotationPoint(6F, 4F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.1F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F); // Box 102
		bodyModel[132].setRotationPoint(-3.75F, 5F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 103
		bodyModel[133].setRotationPoint(-2.75F, 7F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 104
		bodyModel[134].setRotationPoint(-1.25F, 7F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[135].setRotationPoint(-5F, 4F, -8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[136].setRotationPoint(1F, 4F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[137].setRotationPoint(-4F, 5F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		bodyModel[138].setRotationPoint(-7F, 4F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[139].setRotationPoint(2F, 4F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[140].setRotationPoint(4F, 4F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 111
		bodyModel[141].setRotationPoint(2F, 4F, 7.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 112
		bodyModel[142].setRotationPoint(4F, 4F, 7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 113
		bodyModel[143].setRotationPoint(-7F, 4F, 7.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 114
		bodyModel[144].setRotationPoint(-5F, 4F, 7.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
		bodyModel[145].setRotationPoint(-4F, 5F, 7F);
	}
	public float[] getTrans() {
		return new float[]{0F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 0F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			}
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
			}
			if(m.boxName.equals("cull")){
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
		}
	}
}