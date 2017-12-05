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

public class ModelRhBTe extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelRhBTe()
	{
		rhbteModel = new ModelRendererTurbo[112];
		rhbteModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rhbteModel[1] = new ModelRendererTurbo(this, 113, 116, textureX, textureY); // Box 1
		rhbteModel[2] = new ModelRendererTurbo(this, 113, 116, textureX, textureY); // Box 2
		rhbteModel[3] = new ModelRendererTurbo(this, 113, 116, textureX, textureY); // Box 4
		rhbteModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		rhbteModel[5] = new ModelRendererTurbo(this, 113, 116, textureX, textureY); // Box 6
		rhbteModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 7
		rhbteModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 8
		rhbteModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		rhbteModel[9] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 11
		rhbteModel[10] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 12
		rhbteModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 14
		rhbteModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		rhbteModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 16
		rhbteModel[14] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 17
		rhbteModel[15] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 18
		rhbteModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		rhbteModel[17] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 20
		rhbteModel[18] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 21
		rhbteModel[19] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 22
		rhbteModel[20] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 23
		rhbteModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 24
		rhbteModel[22] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 25
		rhbteModel[23] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 26
		rhbteModel[24] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 27
		rhbteModel[25] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 28
		rhbteModel[26] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 29
		rhbteModel[27] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 30
		rhbteModel[28] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 31
		rhbteModel[29] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 32
		rhbteModel[30] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 33
		rhbteModel[31] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 34
		rhbteModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		rhbteModel[33] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 37
		rhbteModel[34] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Shape 38
		rhbteModel[35] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Shape 39
		rhbteModel[36] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Shape 40
		rhbteModel[37] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Shape 41
		rhbteModel[38] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 42
		rhbteModel[39] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 43
		rhbteModel[40] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 44
		rhbteModel[41] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 45
		rhbteModel[42] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 46
		rhbteModel[43] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 47
		rhbteModel[44] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 48
		rhbteModel[45] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 49
		rhbteModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50
		rhbteModel[47] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 51
		rhbteModel[48] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 52
		rhbteModel[49] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 53
		rhbteModel[50] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 54
		rhbteModel[51] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 55
		rhbteModel[52] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 56
		rhbteModel[53] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 57
		rhbteModel[54] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 58
		rhbteModel[55] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 59
		rhbteModel[56] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 60
		rhbteModel[57] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 61
		rhbteModel[58] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 62
		rhbteModel[59] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 63
		rhbteModel[60] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 64
		rhbteModel[61] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 65
		rhbteModel[62] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 66
		rhbteModel[63] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 67
		rhbteModel[64] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Shape 68
		rhbteModel[65] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Shape 69
		rhbteModel[66] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 70
		rhbteModel[67] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 71
		rhbteModel[68] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 72
		rhbteModel[69] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 73
		rhbteModel[70] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 74
		rhbteModel[71] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 75
		rhbteModel[72] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 76
		rhbteModel[73] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 77
		rhbteModel[74] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 78
		rhbteModel[75] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 80
		rhbteModel[76] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 81
		rhbteModel[77] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 82
		rhbteModel[78] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 83
		rhbteModel[79] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 84
		rhbteModel[80] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 85
		rhbteModel[81] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 86
		rhbteModel[82] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 87
		rhbteModel[83] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 88
		rhbteModel[84] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 89
		rhbteModel[85] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 90
		rhbteModel[86] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 91
		rhbteModel[87] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 92
		rhbteModel[88] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 93
		rhbteModel[89] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Shape 95
		rhbteModel[90] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Shape 96
		rhbteModel[91] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 91
		rhbteModel[92] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 92
		rhbteModel[93] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 93
		rhbteModel[94] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 94
		rhbteModel[95] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 95
		rhbteModel[96] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 96
		rhbteModel[97] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 97
		rhbteModel[98] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 98
		rhbteModel[99] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 99
		rhbteModel[100] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 100
		rhbteModel[101] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 101
		rhbteModel[102] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 102
		rhbteModel[103] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 103
		rhbteModel[104] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 104
		rhbteModel[105] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 105
		rhbteModel[106] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 106
		rhbteModel[107] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 107
		rhbteModel[108] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 108
		rhbteModel[109] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Shape 110
		rhbteModel[110] = new ModelRendererTurbo(this, 11, 2, textureX, textureY); // Box 111
		rhbteModel[111] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 112

		rhbteModel[0].addBox(0F, 0F, 0F, 42, 1, 19, 0F); // Box 0
		rhbteModel[0].setRotationPoint(-11F, 0F, -9.5F);

		rhbteModel[1].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 1
		rhbteModel[1].setRotationPoint(-3F, 5F, -6F);

		rhbteModel[2].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 2
		rhbteModel[2].setRotationPoint(23F, 5F, -6F);

		rhbteModel[3].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 4
		rhbteModel[3].setRotationPoint(23F, 5F, 6F);

		rhbteModel[4].addBox(0F, 0F, 0F, 42, 5, 13, 0F); // Box 5
		rhbteModel[4].setRotationPoint(-11F, 1F, -6.5F);

		rhbteModel[5].addBox(-4F, -4F, 0F, 9, 9, 0, 0F); // Box 6
		rhbteModel[5].setRotationPoint(-3F, 5F, 6F);

		rhbteModel[6].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 7
		rhbteModel[6].setRotationPoint(-3.5F, 5.5F, -7F);

		rhbteModel[7].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 8
		rhbteModel[7].setRotationPoint(-3.5F, 5.5F, 6F);

		rhbteModel[8].addBox(0F, -1.5F, 0F, 4, 3, 1, 0F); // Box 10
		rhbteModel[8].setRotationPoint(-3F, 6F, -7.25F);
		rhbteModel[8].rotateAngleZ = 0.78539816F;

		rhbteModel[9].addBox(0F, -1.5F, 0F, 4, 3, 1, 0F); // Box 11
		rhbteModel[9].setRotationPoint(24F, 6F, -7.25F);
		rhbteModel[9].rotateAngleZ = 0.78539816F;

		rhbteModel[10].addBox(0F, -1.5F, 0F, 4, 3, 1, 0F); // Box 12
		rhbteModel[10].setRotationPoint(24F, 6F, 6.25F);
		rhbteModel[10].rotateAngleZ = 2.35619449F;

		rhbteModel[11].addBox(0F, -1.5F, 0F, 4, 3, 1, 0F); // Box 14
		rhbteModel[11].setRotationPoint(-3F, 6F, 6.25F);
		rhbteModel[11].rotateAngleZ = 2.35619449F;

		rhbteModel[12].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 15
		rhbteModel[12].setRotationPoint(-11F, 1F, -9.5F);

		rhbteModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 16
		rhbteModel[13].setRotationPoint(-11F, 1F, 6.5F);

		rhbteModel[14].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 17
		rhbteModel[14].setRotationPoint(30F, 1F, 6.5F);

		rhbteModel[15].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 18
		rhbteModel[15].setRotationPoint(30F, 1F, -9.5F);

		rhbteModel[16].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 19
		rhbteModel[16].setRotationPoint(-9F, 1F, -9.5F);

		rhbteModel[17].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 20
		rhbteModel[17].setRotationPoint(5F, 1F, -9.5F);

		rhbteModel[18].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 21
		rhbteModel[18].setRotationPoint(29F, 1F, -9.5F);

		rhbteModel[19].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 22
		rhbteModel[19].setRotationPoint(25F, 1F, -9.5F);

		rhbteModel[20].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 23
		rhbteModel[20].setRotationPoint(29F, 1F, 8.5F);

		rhbteModel[21].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 24
		rhbteModel[21].setRotationPoint(25F, 1F, 8.5F);

		rhbteModel[22].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 25
		rhbteModel[22].setRotationPoint(5F, 1F, 8.5F);

		rhbteModel[23].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 26
		rhbteModel[23].setRotationPoint(-9F, 1F, 8.5F);

		rhbteModel[24].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 27
		rhbteModel[24].setRotationPoint(-9F, 6F, 8.5F);

		rhbteModel[25].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 28
		rhbteModel[25].setRotationPoint(-9F, 2F, 8.5F);

		rhbteModel[26].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 29
		rhbteModel[26].setRotationPoint(-9F, 2F, -10.5F);

		rhbteModel[27].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 30
		rhbteModel[27].setRotationPoint(-9F, 6F, -10.5F);

		rhbteModel[28].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 31
		rhbteModel[28].setRotationPoint(25F, 6F, -10.5F);

		rhbteModel[29].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 32
		rhbteModel[29].setRotationPoint(25F, 2F, -10.5F);

		rhbteModel[30].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 33
		rhbteModel[30].setRotationPoint(25F, 6F, 8.5F);

		rhbteModel[31].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 34
		rhbteModel[31].setRotationPoint(25F, 2F, 8.5F);

		rhbteModel[32].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 36
		rhbteModel[32].setRotationPoint(-14F, 4F, -2F);

		rhbteModel[33].addBox(2F, 0F, 0F, 3, 2, 4, 0F); // Box 37
		rhbteModel[33].setRotationPoint(29F, 4F, -2F);

		rhbteModel[34].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 38
		rhbteModel[34].setRotationPoint(-3F, 7.3F, 0F);
		rhbteModel[34].rotateAngleX = 1.43116999F;
		rhbteModel[34].rotateAngleY = -1.57079633F;

		rhbteModel[35].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 39
		rhbteModel[35].setRotationPoint(-3.4F, 10.3F, 0F);
		rhbteModel[35].rotateAngleX = 1.71042267F;
		rhbteModel[35].rotateAngleY = -1.57079633F;
		rhbteModel[35].rotateAngleZ = 3.14159265F;

		rhbteModel[36].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 40
		rhbteModel[36].setRotationPoint(23.05F, 7.3F, 0F);
		rhbteModel[36].rotateAngleX = 1.43116999F;
		rhbteModel[36].rotateAngleY = 1.57079633F;

		rhbteModel[37].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(7, 7, 7, 7), new Coord2D(8, 6, 8, 6), new Coord2D(0, 8, 0, 8) }), 3, 8, 10, 21, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,9 ,2 ,8}); // Shape 41
		rhbteModel[37].setRotationPoint(23.45F, 10.3F, 0F);
		rhbteModel[37].rotateAngleX = 1.71042267F;
		rhbteModel[37].rotateAngleY = 1.57079633F;
		rhbteModel[37].rotateAngleZ = 3.14159265F;

		rhbteModel[38].addBox(0F, 0F, 0F, 0, 9, 17, 0F); // Box 42
		rhbteModel[38].setRotationPoint(-10.5F, -12F, -8.5F);

		rhbteModel[39].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 43
		rhbteModel[39].setRotationPoint(-11F, -20F, -9.5F);

		rhbteModel[40].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 44
		rhbteModel[40].setRotationPoint(-11F, -20F, 8.5F);

		rhbteModel[41].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 45
		rhbteModel[41].setRotationPoint(30F, -20F, 8.5F);

		rhbteModel[42].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 46
		rhbteModel[42].setRotationPoint(30F, -20F, -9.5F);

		rhbteModel[43].addBox(0F, 0F, 0F, 5, 20, 1, 0F); // Box 47
		rhbteModel[43].setRotationPoint(-6F, -20F, -9.5F);

		rhbteModel[44].addBox(0F, 0F, 0F, 5, 20, 1, 0F); // Box 48
		rhbteModel[44].setRotationPoint(-6F, -20F, 8.5F);

		rhbteModel[45].addBox(0F, 0F, 0F, 7, 20, 1, 0F); // Box 49
		rhbteModel[45].setRotationPoint(5F, -20F, 8.5F);

		rhbteModel[46].addBox(0F, 0F, 0F, 7, 20, 1, 0F); // Box 50
		rhbteModel[46].setRotationPoint(5F, -20F, -9.5F);

		rhbteModel[47].addBox(0F, 0F, 0F, 6, 20, 0, 0F); // Box 51
		rhbteModel[47].setRotationPoint(-1F, -20F, 9F);

		rhbteModel[48].addBox(0F, 0F, 0F, 6, 20, 0, 0F); // Box 52
		rhbteModel[48].setRotationPoint(-1F, -20F, -9F);

		rhbteModel[49].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 53
		rhbteModel[49].setRotationPoint(-6F, -12F, -8.5F);

		rhbteModel[50].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 54
		rhbteModel[50].setRotationPoint(-6F, -19F, -2F);

		rhbteModel[51].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 55
		rhbteModel[51].setRotationPoint(11F, -12F, -8.5F);

		rhbteModel[52].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 56
		rhbteModel[52].setRotationPoint(11F, -19F, -2F);

		rhbteModel[53].addBox(0F, 0F, 0F, 0, 9, 17, 0F); // Box 57
		rhbteModel[53].setRotationPoint(30.5F, -12F, -8.5F);

		rhbteModel[54].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 58
		rhbteModel[54].setRotationPoint(23F, -12F, -9.5F);

		rhbteModel[55].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 59
		rhbteModel[55].setRotationPoint(23F, -12F, 8.5F);

		rhbteModel[56].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 60
		rhbteModel[56].setRotationPoint(-11.3F, -4.5F, 4F);

		rhbteModel[57].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 61
		rhbteModel[57].setRotationPoint(-11.3F, -4.5F, -7F);

		rhbteModel[58].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 62
		rhbteModel[58].setRotationPoint(-11.3F, -13.5F, -1.5F);

		rhbteModel[59].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 63
		rhbteModel[59].setRotationPoint(30.3F, -13.5F, -1.5F);

		rhbteModel[60].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 64
		rhbteModel[60].setRotationPoint(30.3F, -4.5F, -7F);

		rhbteModel[61].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 65
		rhbteModel[61].setRotationPoint(30.3F, -4.5F, 4F);

		rhbteModel[62].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 66
		rhbteModel[62].setRotationPoint(-6F, -20F, -8.5F);

		rhbteModel[63].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 67
		rhbteModel[63].setRotationPoint(11F, -20F, -8.5F);

		rhbteModel[64].addShape3D(0F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 11, 0, 11), new Coord2D(2, 11, 2, 11), new Coord2D(8, 10, 8, 10), new Coord2D(10, 9, 10, 9), new Coord2D(9, 8, 9, 8), new Coord2D(0, 10, 0, 10) }), 44, 10, 11, 25, 44, ModelRendererTurbo.MR_FRONT, new float[] {1 ,10 ,2 ,3 ,7 ,2}); // Shape 68
		rhbteModel[64].setRotationPoint(32F, -20F, 0F);
		rhbteModel[64].rotateAngleY = -1.57079633F;

		rhbteModel[65].addShape3D(0F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 11, 0, 11), new Coord2D(2, 11, 2, 11), new Coord2D(8, 10, 8, 10), new Coord2D(10, 9, 10, 9), new Coord2D(9, 8, 9, 8), new Coord2D(0, 10, 0, 10) }), 44, 10, 11, 25, 44, ModelRendererTurbo.MR_FRONT, new float[] {1 ,10 ,2 ,3 ,7 ,2}); // Shape 69
		rhbteModel[65].setRotationPoint(-12F, -20F, 0F);
		rhbteModel[65].rotateAngleY = 1.57079633F;

		rhbteModel[66].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 70
		rhbteModel[66].setRotationPoint(-6F, -21F, -4.5F);

		rhbteModel[67].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 71
		rhbteModel[67].setRotationPoint(11F, -21F, -4.5F);

		rhbteModel[68].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 72
		rhbteModel[68].setRotationPoint(-4F, -23F, -3.5F);

		rhbteModel[69].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 73
		rhbteModel[69].setRotationPoint(-4F, -23F, 2.5F);

		rhbteModel[70].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 74
		rhbteModel[70].setRotationPoint(9F, -23F, -3.5F);

		rhbteModel[71].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 75
		rhbteModel[71].setRotationPoint(9F, -23F, 2.5F);

		rhbteModel[72].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 76
		rhbteModel[72].setRotationPoint(-4F, -24F, 2.5F);

		rhbteModel[73].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 77
		rhbteModel[73].setRotationPoint(-4F, -24F, -3.5F);

		rhbteModel[74].addBox(0F, 0F, 0F, 12, 2, 3, 0F); // Box 78
		rhbteModel[74].setRotationPoint(-3F, -25.5F, -1.5F);

		rhbteModel[75].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 80
		rhbteModel[75].setRotationPoint(13F, -23.6F, -2.5F);

		rhbteModel[76].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 81
		rhbteModel[76].setRotationPoint(16F, -23.6F, -1.5F);

		rhbteModel[77].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 82
		rhbteModel[77].setRotationPoint(18.2F, -23.6F, -1.5F);

		rhbteModel[78].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 83
		rhbteModel[78].setRotationPoint(-2F, -24F, -2.5F);

		rhbteModel[79].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 84
		rhbteModel[79].setRotationPoint(7F, -24F, -2.5F);

		rhbteModel[80].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 85
		rhbteModel[80].setRotationPoint(14F, -35F, -3.5F);
		rhbteModel[80].rotateAngleZ = -0.78539816F;

		rhbteModel[81].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 86
		rhbteModel[81].setRotationPoint(-8F, -35F, -2.5F);
		rhbteModel[81].rotateAngleY = 3.14159265F;
		rhbteModel[81].rotateAngleZ = -0.78539816F;

		rhbteModel[82].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 87
		rhbteModel[82].setRotationPoint(14F, -35F, 2.5F);
		rhbteModel[82].rotateAngleZ = -0.78539816F;

		rhbteModel[83].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 88
		rhbteModel[83].setRotationPoint(-8F, -35F, 3.5F);
		rhbteModel[83].rotateAngleY = 3.14159265F;
		rhbteModel[83].rotateAngleZ = -0.78539816F;

		rhbteModel[84].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 89
		rhbteModel[84].setRotationPoint(3.3F, -44.9F, 3.5F);
		rhbteModel[84].rotateAngleY = 3.14159265F;
		rhbteModel[84].rotateAngleZ = 0.78539816F;

		rhbteModel[85].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 90
		rhbteModel[85].setRotationPoint(3.3F, -44.9F, -2.5F);
		rhbteModel[85].rotateAngleY = 3.14159265F;
		rhbteModel[85].rotateAngleZ = 0.78539816F;

		rhbteModel[86].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 91
		rhbteModel[86].setRotationPoint(2.7F, -44.9F, 2.5F);
		rhbteModel[86].rotateAngleZ = 0.78539816F;

		rhbteModel[87].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 92
		rhbteModel[87].setRotationPoint(2.7F, -44.9F, -3.5F);
		rhbteModel[87].rotateAngleZ = 0.78539816F;

		rhbteModel[88].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 93
		rhbteModel[88].setRotationPoint(2F, -46F, -6F);

		rhbteModel[89].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(5, 0, 5, 0), new Coord2D(0, 1, 0, 1) }), 2, 5, 2, 13, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,6}); // Shape 95
		rhbteModel[89].setRotationPoint(2F, -44F, -6F);
		rhbteModel[89].rotateAngleY = 1.57079633F;

		rhbteModel[90].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(5, 0, 5, 0), new Coord2D(0, 1, 0, 1) }), 2, 5, 2, 13, 2, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,6}); // Shape 96
		rhbteModel[90].setRotationPoint(4F, -44F, 6F);
		rhbteModel[90].rotateAngleY = -1.57079633F;

		rhbteModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 91
		rhbteModel[91].setRotationPoint(-6F, -2F, -10.5F);

		rhbteModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		rhbteModel[92].setRotationPoint(-2F, -2F, -10.5F);

		rhbteModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		rhbteModel[93].setRotationPoint(5F, -2F, -10.5F);

		rhbteModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		rhbteModel[94].setRotationPoint(5F, -12F, -10.5F);

		rhbteModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		rhbteModel[95].setRotationPoint(-2F, -12F, -10.5F);

		rhbteModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		rhbteModel[96].setRotationPoint(-6F, -12F, -10.5F);

		rhbteModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		rhbteModel[97].setRotationPoint(-6F, -12F, 9.5F);

		rhbteModel[98].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 98
		rhbteModel[98].setRotationPoint(-2F, -12F, 9.5F);

		rhbteModel[99].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		rhbteModel[99].setRotationPoint(5F, -12F, 9.5F);

		rhbteModel[100].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 100
		rhbteModel[100].setRotationPoint(-6F, -2F, 9.5F);

		rhbteModel[101].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		rhbteModel[101].setRotationPoint(-2F, -2F, 9.5F);

		rhbteModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		rhbteModel[102].setRotationPoint(5F, -2F, 9.5F);

		rhbteModel[103].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 103
		rhbteModel[103].setRotationPoint(-6F, -11F, -10.5F);

		rhbteModel[104].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 104
		rhbteModel[104].setRotationPoint(-2F, -11F, -10.5F);

		rhbteModel[105].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 105
		rhbteModel[105].setRotationPoint(5F, -11F, -10.5F);

		rhbteModel[106].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 106
		rhbteModel[106].setRotationPoint(5F, -11F, 10.5F);

		rhbteModel[107].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 107
		rhbteModel[107].setRotationPoint(-2F, -11F, 10.5F);

		rhbteModel[108].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 108
		rhbteModel[108].setRotationPoint(-6F, -11F, 10.5F);

		rhbteModel[109].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(1, 2, 1, 2), new Coord2D(2, 1, 2, 1), new Coord2D(2, 0, 2, 0), new Coord2D(0, 0, 0, 0) }), 1, 2, 2, 8, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,1 ,2 ,1}); // Shape 110
		rhbteModel[109].setRotationPoint(-5.5F, -11.5F, 0.5F);

		rhbteModel[110].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 111
		rhbteModel[110].setRotationPoint(-6.5F, -11.5F, -0.5F);

		rhbteModel[111].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 112
		rhbteModel[111].setRotationPoint(-6.5F, -21.5F, -0.5F);

		fixRotations(rhbteModel);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 112; i++)
		{
			rhbteModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rhbteModel[];
}