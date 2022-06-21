//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CD 151
// Model Creator: Ondar
// Created on: 07.07.2018 - 13:59:53
// Last changed on: 07.07.2018 - 13:59:53

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

public class ModelDB143 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelDB143() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 357, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 53
		bodyModel[26] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 61
		bodyModel[27] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 64
		bodyModel[28] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 65
		bodyModel[29] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 66
		bodyModel[30] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 67
		bodyModel[31] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 68
		bodyModel[32] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 69
		bodyModel[33] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 72
		bodyModel[36] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 65
		bodyModel[39] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 66
		bodyModel[40] = new ModelRendererTurbo(this, 159, 65, textureX, textureY); // Box 67
		bodyModel[41] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 155
		bodyModel[43] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 97
		bodyModel[52] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 98
		bodyModel[53] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 101
		bodyModel[56] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 102
		bodyModel[57] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 103
		bodyModel[58] = new ModelRendererTurbo(this, 37, 76, textureX, textureY); // Box 105
		bodyModel[59] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 106
		bodyModel[60] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 107
		bodyModel[61] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 108
		bodyModel[62] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 109
		bodyModel[63] = new ModelRendererTurbo(this, 37, 76, textureX, textureY); // Box 110
		bodyModel[64] = new ModelRendererTurbo(this, 37, 76, textureX, textureY); // Box 111
		bodyModel[65] = new ModelRendererTurbo(this, 37, 76, textureX, textureY); // Box 112
		bodyModel[66] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 113
		bodyModel[67] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 115
		bodyModel[69] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 116
		bodyModel[70] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 117
		bodyModel[71] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 118
		bodyModel[72] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 129
		bodyModel[83] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 130
		bodyModel[84] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 131
		bodyModel[85] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 132
		bodyModel[86] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 133
		bodyModel[87] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 134
		bodyModel[88] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 135
		bodyModel[89] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 146
		bodyModel[90] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 137
		bodyModel[91] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 138
		bodyModel[92] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 139
		bodyModel[93] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 140
		bodyModel[94] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 141
		bodyModel[95] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 142
		bodyModel[96] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 143
		bodyModel[97] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 144
		bodyModel[98] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 145
		bodyModel[99] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 146
		bodyModel[100] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 147
		bodyModel[101] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 148
		bodyModel[102] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 149
		bodyModel[103] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 150
		bodyModel[104] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 151
		bodyModel[105] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 152
		bodyModel[106] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 153
		bodyModel[107] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 154
		bodyModel[108] = new ModelRendererTurbo(this, 357, 1, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 334
		bodyModel[112] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 115
		bodyModel[114] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 113, 72, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 122

		bodyModel[0].addShapeBox(0F, 0F, 0F, 53, 24, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, -20F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 53, 3, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-27F, -22F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0.5F, 4F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 17, 3, 10, 0F); // Box 5
		bodyModel[3].setRotationPoint(9F, -24F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 17, 3, 10, 0F); // Box 6
		bodyModel[4].setRotationPoint(-27F, -24F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 7
		bodyModel[5].setRotationPoint(28F, -8F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(26F, -19F, 10F);

		bodyModel[7].addShapeBox(0F, -3F, 0F, 5, 8, 20, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-40F, -9F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 8, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(26F, -4F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(26F, -19F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(38F, 4F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(21F, 4F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(21F, 4F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 18
		bodyModel[13].setRotationPoint(-39F, -19F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 8, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-39F, -4F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 20
		bodyModel[15].setRotationPoint(-39F, -19F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-39F, 4F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-27F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-27F, 4F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(18F, -24F, -1F);
		bodyModel[19].rotateAngleZ = 0.41887902F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 25
		bodyModel[20].setRotationPoint(18F, -31F, -1F);
		bodyModel[20].rotateAngleZ = -0.38397244F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-27.05F, -25F, -1F);
		bodyModel[21].rotateAngleZ = -0.00872665F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 29
		bodyModel[22].setRotationPoint(-19F, -27F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -1F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 7F, 0F); // Box 46
		bodyModel[23].setRotationPoint(-41F, -20F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 52
		bodyModel[24].setRotationPoint(38F, 2F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 53
		bodyModel[25].setRotationPoint(-45F, 2F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -1F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 7F, 0F); // Box 61
		bodyModel[26].setRotationPoint(-42F, -20F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 64
		bodyModel[27].setRotationPoint(-41F, 2F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 65
		bodyModel[28].setRotationPoint(38F, 2F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,3F, 1F, 0F, -1.8F, 1F, 0F, -1.8F, 1F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 66
		bodyModel[29].setRotationPoint(41F, -6F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 1F, 5F, 0F, -0.8F, 5F, 0F, -0.8F, 5F, 0F, 1F, 5F, 0F); // Box 67
		bodyModel[30].setRotationPoint(40F, -20F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,0F, 0F, -3F, 2F, -1F, -2F, 2F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[31].setRotationPoint(26F, -22F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -0.9F, 7F, 0F, -0.9F, 7F, 0F, 0F, 7F, 0F); // Box 69
		bodyModel[32].setRotationPoint(37F, -19F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 0F, 7F, 0F); // Box 70
		bodyModel[33].setRotationPoint(37F, -20F, 10F);

		bodyModel[34].addShapeBox(0F, -3F, 0F, 5, 8, 20, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[34].setRotationPoint(34F, -9F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 72
		bodyModel[35].setRotationPoint(17F, -31.5F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 79
		bodyModel[36].setRotationPoint(40F, -9F, -0.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 63
		bodyModel[37].setRotationPoint(40F, -9F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,2F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, -1F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 65
		bodyModel[38].setRotationPoint(-37F, -22F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 1F, 5F, 0F, -0.8F, 5F, 0F, -0.8F, 5F, 0F, 1F, 5F, 0F); // Box 66
		bodyModel[39].setRotationPoint(-41F, -20F, 11F);
		bodyModel[39].rotateAngleY = 3.14159265F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,-1.8F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1.8F, 1F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[40].setRotationPoint(-43F, -6F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 69
		bodyModel[41].setRotationPoint(40F, -9F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[42].setRotationPoint(40F, -2.5F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[43].setRotationPoint(40F, -2.5F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[44].setRotationPoint(40F, -1.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 91
		bodyModel[45].setRotationPoint(40F, -1.5F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[46].setRotationPoint(40F, -1.5F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 93
		bodyModel[47].setRotationPoint(40F, -1.5F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[48].setRotationPoint(40F, -2.5F, 5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[49].setRotationPoint(40F, -2.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[50].setRotationPoint(40F, -2.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[51].setRotationPoint(40F, -2.5F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 98
		bodyModel[52].setRotationPoint(40F, -1.5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[53].setRotationPoint(40F, -1.5F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[54].setRotationPoint(40F, -2.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[55].setRotationPoint(40F, -2.5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[56].setRotationPoint(40F, -1.5F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 103
		bodyModel[57].setRotationPoint(40F, -1.5F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[58].setRotationPoint(40F, 0F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, -5F, 1F, -1F); // Box 106
		bodyModel[59].setRotationPoint(37F, 1F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, -5F, 1F, -1F); // Box 107
		bodyModel[60].setRotationPoint(37F, 1F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 108
		bodyModel[61].setRotationPoint(36F, 1.5F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 109
		bodyModel[62].setRotationPoint(36F, 1.5F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[63].setRotationPoint(40F, 0F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[64].setRotationPoint(-43F, 0F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[65].setRotationPoint(-43F, 0F, 1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 113
		bodyModel[66].setRotationPoint(-44F, 1.5F, 6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, -5F, 1F, -1F); // Box 114
		bodyModel[67].setRotationPoint(-49F, 1F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, -5F, 1F, -1F); // Box 115
		bodyModel[68].setRotationPoint(-49F, 1F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[69].setRotationPoint(-44F, 1.5F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[70].setRotationPoint(-42F, -2.5F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 118
		bodyModel[71].setRotationPoint(-42F, -1.5F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[72].setRotationPoint(-42F, -2.5F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[73].setRotationPoint(-42F, -1.5F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[74].setRotationPoint(-42F, -2.5F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[75].setRotationPoint(-42F, -2.5F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(-42F, -1.5F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 124
		bodyModel[77].setRotationPoint(-42F, -1.5F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 125
		bodyModel[78].setRotationPoint(-42F, -1.5F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[79].setRotationPoint(-42F, -1.5F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[80].setRotationPoint(-42F, -2.5F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-42F, -2.5F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[82].setRotationPoint(-42F, -2.5F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[83].setRotationPoint(-42F, -1.5F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 131
		bodyModel[84].setRotationPoint(-42F, -1.5F, -6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[85].setRotationPoint(-42F, -2.5F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 133
		bodyModel[86].setRotationPoint(-42F, -9F, -0.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 134
		bodyModel[87].setRotationPoint(-42F, -9F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 135
		bodyModel[88].setRotationPoint(-42F, -9F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 146
		bodyModel[89].setRotationPoint(-22F, -13.5F, -11.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 137
		bodyModel[90].setRotationPoint(-22F, -11.5F, -11.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 138
		bodyModel[91].setRotationPoint(-22F, -9.5F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 139
		bodyModel[92].setRotationPoint(-22F, -7.5F, -11.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 140
		bodyModel[93].setRotationPoint(-22F, -5.5F, -11.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 141
		bodyModel[94].setRotationPoint(-22F, -3.5F, -11.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 142
		bodyModel[95].setRotationPoint(-22F, -1.5F, -11.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 143
		bodyModel[96].setRotationPoint(-22F, -15.5F, -11.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 144
		bodyModel[97].setRotationPoint(-22F, -17.5F, -11.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 145
		bodyModel[98].setRotationPoint(-22F, -17.5F, 10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 146
		bodyModel[99].setRotationPoint(-22F, -15.5F, 10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 147
		bodyModel[100].setRotationPoint(-22F, -13.5F, 10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 148
		bodyModel[101].setRotationPoint(-22F, -11.5F, 10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 149
		bodyModel[102].setRotationPoint(-22F, -9.5F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 150
		bodyModel[103].setRotationPoint(-22F, -7.5F, 10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 151
		bodyModel[104].setRotationPoint(-22F, -5.5F, 10.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 152
		bodyModel[105].setRotationPoint(-22F, -3.5F, 10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 153
		bodyModel[106].setRotationPoint(-22F, -1.5F, 10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 4, 22, 0F,-3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F); // Box 154
		bodyModel[107].setRotationPoint(-9.5F, 4F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F); // Box 110
		bodyModel[108].setRotationPoint(24.5F, -11.5F, -9F);
		bodyModel[108].rotateAngleZ = 0.08726646F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 111
		bodyModel[109].setRotationPoint(-34F, -8F, 2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F); // Box 112
		bodyModel[110].setRotationPoint(-33.5F, -12F, 2F);
		bodyModel[110].rotateAngleZ = -0.08726646F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 334
		bodyModel[111].setRotationPoint(-27.05F, -7F, -12F);
		bodyModel[111].rotateAngleX = 1.57079633F;
		bodyModel[111].rotateAngleY = 1.57079633F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 114
		bodyModel[112].setRotationPoint(-22.05F, -7F, -12F);
		bodyModel[112].rotateAngleX = 1.57079633F;
		bodyModel[112].rotateAngleY = 1.57079633F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 115
		bodyModel[113].setRotationPoint(21.5F, -7F, -12F);
		bodyModel[113].rotateAngleX = 1.57079633F;
		bodyModel[113].rotateAngleY = 1.57079633F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 116
		bodyModel[114].setRotationPoint(26.1F, -7F, -12F);
		bodyModel[114].rotateAngleX = 1.57079633F;
		bodyModel[114].rotateAngleY = 1.57079633F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 117
		bodyModel[115].setRotationPoint(26.1F, -7F, 12F);
		bodyModel[115].rotateAngleX = 1.57079633F;
		bodyModel[115].rotateAngleY = -1.57079633F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 118
		bodyModel[116].setRotationPoint(21.1F, -7F, 12F);
		bodyModel[116].rotateAngleX = 1.57079633F;
		bodyModel[116].rotateAngleY = -1.57079633F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 119
		bodyModel[117].setRotationPoint(-22.5F, -7F, 12F);
		bodyModel[117].rotateAngleX = 1.57079633F;
		bodyModel[117].rotateAngleY = -1.57079633F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F, 0F, -0.8F, 3F); // Box 120
		bodyModel[118].setRotationPoint(-27.5F, -7F, 12F);
		bodyModel[118].rotateAngleX = 1.57079633F;
		bodyModel[118].rotateAngleY = -1.57079633F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 120
		bodyModel[119].setRotationPoint(18F, -31F, -1F);
		bodyModel[119].rotateAngleZ = -0.38397244F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 121
		bodyModel[120].setRotationPoint(-27.5F, -26F, -1F);
		bodyModel[120].rotateAngleZ = 0.08726646F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 122
		bodyModel[121].setRotationPoint(-27.5F, -26F, -1F);
		bodyModel[121].rotateAngleZ = 0.08726646F;
	}
	ModelDB143Bogis theTrucks = new ModelDB143Bogis();

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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/143_Bogie.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/143_Bogie.png"));
		}

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslatef(-1.6f, 0.1f,0.0f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslatef(-1.6f, 0.1f,0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}