//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:23.10.2017 - 20:46:58
// Last changed on: 23.10.2017 - 20:46:58

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.Coord2D;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;

public class ModelRhBDe extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelRhBDe()
	{
		rhbdeModel = new ModelRendererTurbo[121];
		rhbdeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rhbdeModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		rhbdeModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		rhbdeModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		rhbdeModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		rhbdeModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		rhbdeModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 7
		rhbdeModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 8
		rhbdeModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		rhbdeModel[9] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 16
		rhbdeModel[10] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 17
		rhbdeModel[11] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 18
		rhbdeModel[12] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 19
		rhbdeModel[13] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 20
		rhbdeModel[14] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 21
		rhbdeModel[15] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 22
		rhbdeModel[16] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 23
		rhbdeModel[17] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 24
		rhbdeModel[18] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 25
		rhbdeModel[19] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 26
		rhbdeModel[20] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 27
		rhbdeModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 28
		rhbdeModel[22] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 29
		rhbdeModel[23] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 30
		rhbdeModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 31
		rhbdeModel[25] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 32
		rhbdeModel[26] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 33
		rhbdeModel[27] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 34
		rhbdeModel[28] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 36
		rhbdeModel[29] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 37
		rhbdeModel[30] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Shape 38
		rhbdeModel[31] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Shape 39
		rhbdeModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Shape 40
		rhbdeModel[33] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Shape 41
		rhbdeModel[34] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 47
		rhbdeModel[35] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 48
		rhbdeModel[36] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 49
		rhbdeModel[37] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 50
		rhbdeModel[38] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 51
		rhbdeModel[39] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 52
		rhbdeModel[40] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 53
		rhbdeModel[41] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 60
		rhbdeModel[42] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 61
		rhbdeModel[43] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 62
		rhbdeModel[44] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 63
		rhbdeModel[45] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 64
		rhbdeModel[46] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 65
		rhbdeModel[47] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 66
		rhbdeModel[48] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 67
		rhbdeModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Shape 68
		rhbdeModel[50] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Shape 69
		rhbdeModel[51] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 70
		rhbdeModel[52] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 71
		rhbdeModel[53] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 72
		rhbdeModel[54] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 73
		rhbdeModel[55] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 74
		rhbdeModel[56] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 75
		rhbdeModel[57] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 83
		rhbdeModel[58] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 84
		rhbdeModel[59] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 86
		rhbdeModel[60] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 89
		rhbdeModel[61] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 90
		rhbdeModel[62] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 93
		rhbdeModel[63] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Shape 95
		rhbdeModel[64] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Shape 96
		rhbdeModel[65] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 91
		rhbdeModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 92
		rhbdeModel[67] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 95
		rhbdeModel[68] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 96
		rhbdeModel[69] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 97
		rhbdeModel[70] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 98
		rhbdeModel[71] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 100
		rhbdeModel[72] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 101
		rhbdeModel[73] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 103
		rhbdeModel[74] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 104
		rhbdeModel[75] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 107
		rhbdeModel[76] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 108
		rhbdeModel[77] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 112
		rhbdeModel[78] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 113
		rhbdeModel[79] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 114
		rhbdeModel[80] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 115
		rhbdeModel[81] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 116
		rhbdeModel[82] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 117
		rhbdeModel[83] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 118
		rhbdeModel[84] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 119
		rhbdeModel[85] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 120
		rhbdeModel[86] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 121
		rhbdeModel[87] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 122
		rhbdeModel[88] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 123
		rhbdeModel[89] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 124
		rhbdeModel[90] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 125
		rhbdeModel[91] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 126
		rhbdeModel[92] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 127
		rhbdeModel[93] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 128
		rhbdeModel[94] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 129
		rhbdeModel[95] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 130
		rhbdeModel[96] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 131
		rhbdeModel[97] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 132
		rhbdeModel[98] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 133
		rhbdeModel[99] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 135
		rhbdeModel[100] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 136
		rhbdeModel[101] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 137
		rhbdeModel[102] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 138
		rhbdeModel[103] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 139
		rhbdeModel[104] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 140
		rhbdeModel[105] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 141
		rhbdeModel[106] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 142
		rhbdeModel[107] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 143
		rhbdeModel[108] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 144
		rhbdeModel[109] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 145
		rhbdeModel[110] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 146
		rhbdeModel[111] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 147
		rhbdeModel[112] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 148
		rhbdeModel[113] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 149
		rhbdeModel[114] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 150
		rhbdeModel[115] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 151
		rhbdeModel[116] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 152
		rhbdeModel[117] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 153
		rhbdeModel[118] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 154
		rhbdeModel[119] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 155
		rhbdeModel[120] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 156

		rhbdeModel[0].addBox(0F, 0F, 0F, 42, 1, 19, 0F); // Box 0
		rhbdeModel[0].setRotationPoint(-30F, 0F, -9.5F);

		rhbdeModel[1].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 1
		rhbdeModel[1].setRotationPoint(-22F, 5F, -6F);

		rhbdeModel[2].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 2
		rhbdeModel[2].setRotationPoint(4F, 5F, -6F);

		rhbdeModel[3].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 4
		rhbdeModel[3].setRotationPoint(4F, 5F, 6F);

		rhbdeModel[4].addBox(0F, 0F, 0F, 42, 5, 13, 0F); // Box 5
		rhbdeModel[4].setRotationPoint(-30F, 1F, -6.5F);

		rhbdeModel[5].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 6
		rhbdeModel[5].setRotationPoint(-22F, 5F, 6F);

		rhbdeModel[6].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 7
		rhbdeModel[6].setRotationPoint(-22.5F, 7.5F, -9F);

		rhbdeModel[7].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 8
		rhbdeModel[7].setRotationPoint(-22.5F, 7.5F, 8F);

		rhbdeModel[8].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 15
		rhbdeModel[8].setRotationPoint(-30F, 1F, -9.5F);

		rhbdeModel[9].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 16
		rhbdeModel[9].setRotationPoint(-30F, 1F, 6.5F);

		rhbdeModel[10].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 17
		rhbdeModel[10].setRotationPoint(11F, 1F, 6.5F);

		rhbdeModel[11].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 18
		rhbdeModel[11].setRotationPoint(11F, 1F, -9.5F);

		rhbdeModel[12].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 19
		rhbdeModel[12].setRotationPoint(-28F, 1F, -9.5F);

		rhbdeModel[13].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 20
		rhbdeModel[13].setRotationPoint(-22F, 1F, -9.5F);

		rhbdeModel[14].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 21
		rhbdeModel[14].setRotationPoint(-4F, 1F, -9.5F);

		rhbdeModel[15].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 22
		rhbdeModel[15].setRotationPoint(-14F, 1F, -9.5F);

		rhbdeModel[16].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 23
		rhbdeModel[16].setRotationPoint(-4F, 1F, 8.5F);

		rhbdeModel[17].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 24
		rhbdeModel[17].setRotationPoint(-14F, 1F, 8.5F);

		rhbdeModel[18].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 25
		rhbdeModel[18].setRotationPoint(-22F, 1F, 8.5F);

		rhbdeModel[19].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 26
		rhbdeModel[19].setRotationPoint(-28F, 1F, 8.5F);

		rhbdeModel[20].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 27
		rhbdeModel[20].setRotationPoint(-28F, 6F, 8.5F);

		rhbdeModel[21].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 28
		rhbdeModel[21].setRotationPoint(-28F, 2F, 8.5F);

		rhbdeModel[22].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 29
		rhbdeModel[22].setRotationPoint(-28F, 2F, -10.5F);

		rhbdeModel[23].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 30
		rhbdeModel[23].setRotationPoint(-28F, 6F, -10.5F);

		rhbdeModel[24].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 31
		rhbdeModel[24].setRotationPoint(-14F, 6F, -10.5F);

		rhbdeModel[25].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 32
		rhbdeModel[25].setRotationPoint(-14F, 2F, -10.5F);

		rhbdeModel[26].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 33
		rhbdeModel[26].setRotationPoint(-14F, 6F, 8.5F);

		rhbdeModel[27].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 34
		rhbdeModel[27].setRotationPoint(-14F, 2F, 8.5F);

		rhbdeModel[28].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 36
		rhbdeModel[28].setRotationPoint(-33F, 4F, -2F);

		rhbdeModel[29].addBox(2F, 0F, 0F, 3, 2, 4, 0F); // Box 37
		rhbdeModel[29].setRotationPoint(10F, 4F, -2F);

		rhbdeModel[30].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 38
		rhbdeModel[30].setRotationPoint(-22F, 7.3F, 0F);
		rhbdeModel[30].rotateAngleX = 1.43116999F;
		rhbdeModel[30].rotateAngleY = -1.57079633F;

		rhbdeModel[31].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 39
		rhbdeModel[31].setRotationPoint(-22.4F, 10.3F, 0F);
		rhbdeModel[31].rotateAngleX = 1.71042267F;
		rhbdeModel[31].rotateAngleY = -1.57079633F;
		rhbdeModel[31].rotateAngleZ = 3.14159265F;

		rhbdeModel[32].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 40
		rhbdeModel[32].setRotationPoint(4.05F, 7.3F, 0F);
		rhbdeModel[32].rotateAngleX = 1.43116999F;
		rhbdeModel[32].rotateAngleY = 1.57079633F;

		rhbdeModel[33].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 41
		rhbdeModel[33].setRotationPoint(4.45F, 10.3F, 0F);
		rhbdeModel[33].rotateAngleX = 1.71042267F;
		rhbdeModel[33].rotateAngleY = 1.57079633F;
		rhbdeModel[33].rotateAngleZ = 3.14159265F;

		rhbdeModel[34].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 47
		rhbdeModel[34].setRotationPoint(-30F, -20F, -9.5F);

		rhbdeModel[35].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 48
		rhbdeModel[35].setRotationPoint(10F, -20F, 8.5F);

		rhbdeModel[36].addBox(0F, 0F, 0F, 8, 20, 1, 0F); // Box 49
		rhbdeModel[36].setRotationPoint(-4F, -20F, 8.5F);

		rhbdeModel[37].addBox(0F, 0F, 0F, 8, 20, 1, 0F); // Box 50
		rhbdeModel[37].setRotationPoint(-22F, -20F, -9.5F);

		rhbdeModel[38].addBox(0F, 0F, 0F, 6, 20, 0, 0F); // Box 51
		rhbdeModel[38].setRotationPoint(4F, -20F, 9F);

		rhbdeModel[39].addBox(0F, 0F, 0F, 6, 20, 0, 0F); // Box 52
		rhbdeModel[39].setRotationPoint(-28F, -20F, -9F);

		rhbdeModel[40].addBox(0F, 0F, 0F, 1, 11, 17, 0F); // Box 53
		rhbdeModel[40].setRotationPoint(-30F, -11F, -8.5F);

		rhbdeModel[41].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 60
		rhbdeModel[41].setRotationPoint(-31F, -4.5F, 4F);

		rhbdeModel[42].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 61
		rhbdeModel[42].setRotationPoint(-31F, -4.5F, -7F);

		rhbdeModel[43].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 62
		rhbdeModel[43].setRotationPoint(-31F, -21.5F, -1.5F);

		rhbdeModel[44].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 63
		rhbdeModel[44].setRotationPoint(12F, -21.5F, -1.5F);

		rhbdeModel[45].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 64
		rhbdeModel[45].setRotationPoint(12F, -4.5F, -7F);

		rhbdeModel[46].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 65
		rhbdeModel[46].setRotationPoint(12F, -4.5F, 4F);

		rhbdeModel[47].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 66
		rhbdeModel[47].setRotationPoint(-30F, -20F, -8.5F);

		rhbdeModel[48].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 67
		rhbdeModel[48].setRotationPoint(11F, -20F, -8.5F);

		rhbdeModel[49].addShape3D(0F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 11, 0, 11), new Coord2D(2, 11, 2, 11), new Coord2D(8, 10, 8, 10), new Coord2D(10, 9, 10, 9), new Coord2D(9, 8, 9, 8), new Coord2D(0, 10, 0, 10) }), 43, 10, 11, 25, 43, ModelRendererTurbo.MR_FRONT, new float[] {1 ,10 ,2 ,3 ,7 ,2}); // Shape 68
		rhbdeModel[49].setRotationPoint(12.5F, -20F, 0F);
		rhbdeModel[49].rotateAngleY = -1.57079633F;

		rhbdeModel[50].addShape3D(0F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 11, 0, 11), new Coord2D(2, 11, 2, 11), new Coord2D(8, 10, 8, 10), new Coord2D(10, 9, 10, 9), new Coord2D(9, 8, 9, 8), new Coord2D(0, 10, 0, 10) }), 43, 10, 11, 25, 43, ModelRendererTurbo.MR_FRONT, new float[] {1 ,10 ,2 ,3 ,7 ,2}); // Shape 69
		rhbdeModel[50].setRotationPoint(-30.5F, -20F, 0F);
		rhbdeModel[50].rotateAngleY = 1.57079633F;

		rhbdeModel[51].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 70
		rhbdeModel[51].setRotationPoint(-30F, -21F, -4.5F);

		rhbdeModel[52].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 71
		rhbdeModel[52].setRotationPoint(11F, -21F, -4.5F);

		rhbdeModel[53].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 72
		rhbdeModel[53].setRotationPoint(-24F, -24F, -4.5F);

		rhbdeModel[54].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 73
		rhbdeModel[54].setRotationPoint(-24F, -24F, 3.5F);

		rhbdeModel[55].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 74
		rhbdeModel[55].setRotationPoint(-15F, -24F, -4.5F);

		rhbdeModel[56].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 75
		rhbdeModel[56].setRotationPoint(-15F, -24F, 3.5F);

		rhbdeModel[57].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 83
		rhbdeModel[57].setRotationPoint(-24F, -24F, -3.5F);

		rhbdeModel[58].addBox(-3F, 0F, 0F, 1, 1, 7, 0F); // Box 84
		rhbdeModel[58].setRotationPoint(-12F, -24F, -3.5F);

		rhbdeModel[59].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 86
		rhbdeModel[59].setRotationPoint(-27F, -35F, 1F);
		rhbdeModel[59].rotateAngleY = 3.14159265F;
		rhbdeModel[59].rotateAngleZ = -0.78539816F;

		rhbdeModel[60].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 89
		rhbdeModel[60].setRotationPoint(-15.7F, -44.9F, 4F);
		rhbdeModel[60].rotateAngleX = 0.17453293F;
		rhbdeModel[60].rotateAngleY = 3.14159265F;
		rhbdeModel[60].rotateAngleZ = 0.78539816F;

		rhbdeModel[61].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 90
		rhbdeModel[61].setRotationPoint(-15.6F, -45F, -3F);
		rhbdeModel[61].rotateAngleX = -0.17453293F;
		rhbdeModel[61].rotateAngleY = 3.14159265F;
		rhbdeModel[61].rotateAngleZ = 0.78539816F;

		rhbdeModel[62].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 93
		rhbdeModel[62].setRotationPoint(-17F, -46F, -6F);

		rhbdeModel[63].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(5, 0, 5, 0), new Coord2D(0, 1, 0, 1) }), 2, 5, 2, 13, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,6}); // Shape 95
		rhbdeModel[63].setRotationPoint(-17F, -44F, -6F);
		rhbdeModel[63].rotateAngleY = 1.57079633F;

		rhbdeModel[64].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(5, 0, 5, 0), new Coord2D(0, 1, 0, 1) }), 2, 5, 2, 13, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,6}); // Shape 96
		rhbdeModel[64].setRotationPoint(-15F, -44F, 6F);
		rhbdeModel[64].rotateAngleY = -1.57079633F;

		rhbdeModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 91
		rhbdeModel[65].setRotationPoint(-29F, -2F, -10.5F);

		rhbdeModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		rhbdeModel[66].setRotationPoint(-22F, -2F, -10.5F);

		rhbdeModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		rhbdeModel[67].setRotationPoint(-22F, -12F, -10.5F);

		rhbdeModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		rhbdeModel[68].setRotationPoint(-29F, -12F, -10.5F);

		rhbdeModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		rhbdeModel[69].setRotationPoint(3F, -12F, 9.5F);

		rhbdeModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 98
		rhbdeModel[70].setRotationPoint(10F, -12F, 9.5F);

		rhbdeModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 100
		rhbdeModel[71].setRotationPoint(3F, -2F, 9.5F);

		rhbdeModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		rhbdeModel[72].setRotationPoint(10F, -2F, 9.5F);

		rhbdeModel[73].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 103
		rhbdeModel[73].setRotationPoint(-29F, -11F, -10.5F);

		rhbdeModel[74].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 104
		rhbdeModel[74].setRotationPoint(-22F, -11F, -10.5F);

		rhbdeModel[75].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 107
		rhbdeModel[75].setRotationPoint(10F, -11F, 10.5F);

		rhbdeModel[76].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 108
		rhbdeModel[76].setRotationPoint(3F, -11F, 10.5F);

		rhbdeModel[77].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 112
		rhbdeModel[77].setRotationPoint(-23F, -24F, -1.5F);

		rhbdeModel[78].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 113
		rhbdeModel[78].setRotationPoint(-30F, -18F, -3.5F);

		rhbdeModel[79].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 114
		rhbdeModel[79].setRotationPoint(-30F, -18F, 2.5F);

		rhbdeModel[80].addBox(0F, 0F, 0F, 1, 11, 17, 0F); // Box 115
		rhbdeModel[80].setRotationPoint(11F, -11F, -8.5F);

		rhbdeModel[81].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 116
		rhbdeModel[81].setRotationPoint(11F, -18F, 2.5F);

		rhbdeModel[82].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 117
		rhbdeModel[82].setRotationPoint(11F, -18F, -3.5F);

		rhbdeModel[83].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 118
		rhbdeModel[83].setRotationPoint(9F, -20F, -9.5F);

		rhbdeModel[84].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 119
		rhbdeModel[84].setRotationPoint(-30F, -20F, 8.5F);

		rhbdeModel[85].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 120
		rhbdeModel[85].setRotationPoint(5F, -11F, -9.5F);

		rhbdeModel[86].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 121
		rhbdeModel[86].setRotationPoint(-27F, -11F, 8.5F);

		rhbdeModel[87].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 122
		rhbdeModel[87].setRotationPoint(-23F, -20F, 8.5F);

		rhbdeModel[88].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 123
		rhbdeModel[88].setRotationPoint(-4F, -20F, -9.5F);

		rhbdeModel[89].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 124
		rhbdeModel[89].setRotationPoint(5F, -20F, -9.5F);

		rhbdeModel[90].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 125
		rhbdeModel[90].setRotationPoint(-27F, -20F, 8.5F);

		rhbdeModel[91].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rhbdeModel[91].setRotationPoint(-15F, -19.5F, -10.5F);

		rhbdeModel[92].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 127
		rhbdeModel[92].setRotationPoint(-30F, -19.5F, 9.5F);

		rhbdeModel[93].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 128
		rhbdeModel[93].setRotationPoint(-14F, -20F, 8.5F);

		rhbdeModel[94].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 129
		rhbdeModel[94].setRotationPoint(-14F, -20F, -9.5F);

		rhbdeModel[95].addBox(0F, 0F, 0F, 10, 11, 1, 0F); // Box 130
		rhbdeModel[95].setRotationPoint(-14F, -11F, 9.5F);

		rhbdeModel[96].addBox(0F, 0F, 0F, 10, 11, 1, 0F); // Box 131
		rhbdeModel[96].setRotationPoint(-14F, -11F, -10.5F);

		rhbdeModel[97].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 132
		rhbdeModel[97].setRotationPoint(-14F, -17F, -10.5F);

		rhbdeModel[98].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 133
		rhbdeModel[98].setRotationPoint(-6F, -17F, -10.5F);

		rhbdeModel[99].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 135
		rhbdeModel[99].setRotationPoint(-14F, -17F, 9.5F);

		rhbdeModel[100].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 136
		rhbdeModel[100].setRotationPoint(-6F, -17F, 9.5F);

		rhbdeModel[101].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 137
		rhbdeModel[101].setRotationPoint(-14F, -19F, -10.5F);

		rhbdeModel[102].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 138
		rhbdeModel[102].setRotationPoint(-14F, -19F, 9.5F);

		rhbdeModel[103].addBox(-3F, 0F, 0F, 5, 4, 7, 0F); // Box 139
		rhbdeModel[103].setRotationPoint(-10F, -25F, -3.5F);

		rhbdeModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 140
		rhbdeModel[104].setRotationPoint(-7F, -22F, 3.5F);

		rhbdeModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 141
		rhbdeModel[105].setRotationPoint(11F, -22F, 3.5F);

		rhbdeModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		rhbdeModel[106].setRotationPoint(-7F, -22F, -4.5F);

		rhbdeModel[107].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 143
		rhbdeModel[107].setRotationPoint(11F, -22F, -4.5F);

		rhbdeModel[108].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 144
		rhbdeModel[108].setRotationPoint(-7F, -23F, -4.5F);

		rhbdeModel[109].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 145
		rhbdeModel[109].setRotationPoint(-7F, -23F, 3.5F);

		rhbdeModel[110].addBox(-3F, 0F, 0F, 3, 2, 9, 0F); // Box 146
		rhbdeModel[110].setRotationPoint(-4F, -25F, -4.5F);

		rhbdeModel[111].addBox(-3F, 0F, 0F, 3, 2, 9, 0F); // Box 147
		rhbdeModel[111].setRotationPoint(0F, -25F, -4.5F);

		rhbdeModel[112].addBox(-3F, 0F, 0F, 3, 2, 9, 0F); // Box 148
		rhbdeModel[112].setRotationPoint(4F, -25F, -4.5F);

		rhbdeModel[113].addBox(-3F, 0F, 0F, 3, 2, 9, 0F); // Box 149
		rhbdeModel[113].setRotationPoint(8F, -25F, -4.5F);

		rhbdeModel[114].addBox(-3F, 0F, 0F, 3, 2, 9, 0F); // Box 150
		rhbdeModel[114].setRotationPoint(12F, -25F, -4.5F);

		rhbdeModel[115].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 151
		rhbdeModel[115].setRotationPoint(-28F, -24F, -1.5F);

		rhbdeModel[116].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 152
		rhbdeModel[116].setRotationPoint(-29F, -25F, -0.5F);

		rhbdeModel[117].addBox(0F, 0F, 0F, 5, 6, 2, 0F); // Box 153
		rhbdeModel[117].setRotationPoint(-24F, 2F, -8.5F);

		rhbdeModel[118].addBox(0F, 0F, 0F, 5, 6, 2, 0F); // Box 154
		rhbdeModel[118].setRotationPoint(2F, 2F, -8.5F);

		rhbdeModel[119].addBox(0F, 0F, 0F, 5, 6, 2, 0F); // Box 155
		rhbdeModel[119].setRotationPoint(2F, 2F, 6.5F);

		rhbdeModel[120].addBox(0F, 0F, 0F, 5, 6, 2, 0F); // Box 156
		rhbdeModel[120].setRotationPoint(-24F, 2F, 6.5F);

		fixRotations(rhbdeModel);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 121; i++)
		{
			rhbdeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rhbdeModel[];
}