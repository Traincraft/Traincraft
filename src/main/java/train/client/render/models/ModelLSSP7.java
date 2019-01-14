//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.11.2018 - 08:28:34
// Last changed on: 02.11.2018 - 08:28:34

package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelLSSP7 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelLSSP7()
	{
		lssp7Model = new ModelRendererTurbo[75];
		lssp7Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		lssp7Model[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		lssp7Model[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		lssp7Model[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		lssp7Model[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		lssp7Model[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		lssp7Model[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		lssp7Model[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 7
		lssp7Model[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		lssp7Model[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		lssp7Model[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		lssp7Model[11] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		lssp7Model[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		lssp7Model[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		lssp7Model[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 14
		lssp7Model[15] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		lssp7Model[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		lssp7Model[17] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		lssp7Model[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 18
		lssp7Model[19] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 19
		lssp7Model[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		lssp7Model[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		lssp7Model[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		lssp7Model[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 24
		lssp7Model[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 25
		lssp7Model[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 26
		lssp7Model[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		lssp7Model[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		lssp7Model[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 29
		lssp7Model[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 30
		lssp7Model[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 31
		lssp7Model[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 32
		lssp7Model[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		lssp7Model[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		lssp7Model[34] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 35
		lssp7Model[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 36
		lssp7Model[36] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 37
		lssp7Model[37] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 39
		lssp7Model[38] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 40
		lssp7Model[39] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 43
		lssp7Model[40] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 44
		lssp7Model[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		lssp7Model[42] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46
		lssp7Model[43] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 47
		lssp7Model[44] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 48
		lssp7Model[45] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 49
		lssp7Model[46] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 50
		lssp7Model[47] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 51
		lssp7Model[48] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 52
		lssp7Model[49] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 53
		lssp7Model[50] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 56
		lssp7Model[51] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 114
		lssp7Model[52] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 74
		lssp7Model[53] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 75
		lssp7Model[54] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 76
		lssp7Model[55] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 77
		lssp7Model[56] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 78
		lssp7Model[57] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 79
		lssp7Model[58] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 80
		lssp7Model[59] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 81
		lssp7Model[60] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 82
		lssp7Model[61] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 83
		lssp7Model[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 84
		lssp7Model[63] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 86
		lssp7Model[64] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 87
		lssp7Model[65] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 89
		lssp7Model[66] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 90
		lssp7Model[67] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 79
		lssp7Model[68] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 80
		lssp7Model[69] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 81
		lssp7Model[70] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 82
		lssp7Model[71] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 84
		lssp7Model[72] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 85
		lssp7Model[73] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 86
		lssp7Model[74] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 87

		lssp7Model[0].addBox(0F, 0F, 0F, 4, 11, 18, 0F); // Box 0
		lssp7Model[0].setRotationPoint(17F, -13F, 4F);

		lssp7Model[1].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 1
		lssp7Model[1].setRotationPoint(17F, -14F, 4F);

		lssp7Model[2].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 2
		lssp7Model[2].setRotationPoint(20F, -14F, 4F);

		lssp7Model[3].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 3
		lssp7Model[3].setRotationPoint(18F, -14F, 4F);

		lssp7Model[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 4
		lssp7Model[4].setRotationPoint(18F, -14F, 21F);

		lssp7Model[5].addBox(0F, 0F, 0F, 4, 4, 20, 0F); // Box 5
		lssp7Model[5].setRotationPoint(17F, -2F, 3F);

		lssp7Model[6].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 6
		lssp7Model[6].setRotationPoint(12F, -2F, 3F);

		lssp7Model[7].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 7
		lssp7Model[7].setRotationPoint(-8F, -2F, 17F);

		lssp7Model[8].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 8
		lssp7Model[8].setRotationPoint(-9F, -2F, 3F);

		lssp7Model[9].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 9
		lssp7Model[9].setRotationPoint(-10F, 1F, 3F);

		lssp7Model[10].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 10
		lssp7Model[10].setRotationPoint(21F, 1F, 3F);

		lssp7Model[11].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 11
		lssp7Model[11].setRotationPoint(-4F, -1F, 6.9F);

		lssp7Model[12].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 12
		lssp7Model[12].setRotationPoint(7F, -1F, 6.9F);

		lssp7Model[13].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 13
		lssp7Model[13].setRotationPoint(-4F, -1F, 19.1F);

		lssp7Model[14].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 14
		lssp7Model[14].setRotationPoint(7F, -1F, 19.1F);

		lssp7Model[15].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 15
		lssp7Model[15].setRotationPoint(3.5F, -0.5F, 6.9F);

		lssp7Model[16].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 16
		lssp7Model[16].setRotationPoint(3.5F, -0.5F, 19.1F);

		lssp7Model[17].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 17
		lssp7Model[17].setRotationPoint(4.5F, 0.5F, 7F);

		lssp7Model[18].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 18
		lssp7Model[18].setRotationPoint(13F, -2F, 4F);

		lssp7Model[19].addBox(0F, 0F, 0F, 8, 18, 1, 0F); // Box 19
		lssp7Model[19].setRotationPoint(5F, -20F, 3F);

		lssp7Model[20].addBox(0F, 0F, 0F, 8, 18, 1, 0F); // Box 20
		lssp7Model[20].setRotationPoint(5F, -20F, 22F);

		lssp7Model[21].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		lssp7Model[21].setRotationPoint(5F, -2F, 3F);

		lssp7Model[22].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		lssp7Model[22].setRotationPoint(5F, -2F, 19F);

		lssp7Model[23].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 24
		lssp7Model[23].setRotationPoint(-2F, 1F, 7F);

		lssp7Model[24].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 25
		lssp7Model[24].setRotationPoint(9F, 1F, 7F);

		lssp7Model[25].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 26
		lssp7Model[25].setRotationPoint(-8F, -2F, 7F);

		lssp7Model[26].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 27
		lssp7Model[26].setRotationPoint(3F, 1F, 12.5F);

		lssp7Model[27].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 28
		lssp7Model[27].setRotationPoint(3F, -8F, 6F);
		lssp7Model[27].rotateAngleX = -0.78539816F;

		lssp7Model[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 29
		lssp7Model[28].setRotationPoint(4F, -8F, 6F);
		lssp7Model[28].rotateAngleX = -0.78539816F;

		lssp7Model[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 30
		lssp7Model[29].setRotationPoint(2F, -8F, 6F);
		lssp7Model[29].rotateAngleX = -0.78539816F;

		lssp7Model[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		lssp7Model[30].setRotationPoint(4F, -6F, 22F);
		lssp7Model[30].rotateAngleX = -2.35619449F;

		lssp7Model[31].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 32
		lssp7Model[31].setRotationPoint(3F, -6F, 22F);
		lssp7Model[31].rotateAngleX = -2.35619449F;

		lssp7Model[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 33
		lssp7Model[32].setRotationPoint(2F, -6F, 22F);
		lssp7Model[32].rotateAngleX = -2.35619449F;

		lssp7Model[33].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 34
		lssp7Model[33].setRotationPoint(3F, -4.5F, 8F);
		lssp7Model[33].rotateAngleX = -0.78539816F;

		lssp7Model[34].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 35
		lssp7Model[34].setRotationPoint(3F, -4F, 18.5F);
		lssp7Model[34].rotateAngleX = -2.35619449F;

		lssp7Model[35].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		lssp7Model[35].setRotationPoint(2.5F, -1F, 11.5F);

		lssp7Model[36].addBox(0F, 0F, 0F, 20, 10, 4, 0F); // Box 37
		lssp7Model[36].setRotationPoint(-9F, -14F, 11F);

		lssp7Model[37].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		lssp7Model[37].setRotationPoint(-9F, -14F, 8F);

		lssp7Model[38].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 40
		lssp7Model[38].setRotationPoint(-9F, -14F, 15F);

		lssp7Model[39].addBox(0F, 0F, 0F, 7, 3, 8, 0F); // Box 43
		lssp7Model[39].setRotationPoint(-8F, -2F, 9F);

		lssp7Model[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		lssp7Model[40].setRotationPoint(-8F, -6F, 7F);

		lssp7Model[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		lssp7Model[41].setRotationPoint(-8F, -6F, 18F);

		lssp7Model[42].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 46
		lssp7Model[42].setRotationPoint(-9.5F, -11F, 12F);

		lssp7Model[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 47
		lssp7Model[43].setRotationPoint(-9.5F, -11F, 14F);

		lssp7Model[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		lssp7Model[44].setRotationPoint(-9.5F, -11F, 11F);

		lssp7Model[45].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		lssp7Model[45].setRotationPoint(-3F, 1.9F, 5.9F);

		lssp7Model[46].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 50
		lssp7Model[46].setRotationPoint(-3F, 1.9F, 19.1F);

		lssp7Model[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 51
		lssp7Model[47].setRotationPoint(9F, 0F, 8F);

		lssp7Model[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		lssp7Model[48].setRotationPoint(9F, 0F, 17F);

		lssp7Model[49].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		lssp7Model[49].setRotationPoint(5F, -2F, 9F);

		lssp7Model[50].addBox(0F, 0F, 0F, 1, 18, 18, 0F); // Box 56
		lssp7Model[50].setRotationPoint(5F, -20F, 4F);

		lssp7Model[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		lssp7Model[51].setRotationPoint(-3F, -16F, 12.5F);

		lssp7Model[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		lssp7Model[52].setRotationPoint(-3F, -17F, 12.5F);

		lssp7Model[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 75
		lssp7Model[53].setRotationPoint(-2.75F, -18F, 11.5F);

		lssp7Model[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		lssp7Model[54].setRotationPoint(-2.75F, -18F, 11F);

		lssp7Model[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		lssp7Model[55].setRotationPoint(-2.75F, -18F, 14F);

		lssp7Model[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		lssp7Model[56].setRotationPoint(-2.75F, -15.5F, 12.75F);

		lssp7Model[57].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F); // Box 79
		lssp7Model[57].setRotationPoint(12F, -24F, 11F);

		lssp7Model[58].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 80
		lssp7Model[58].setRotationPoint(-9F, -18F, 12.5F);

		lssp7Model[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 81
		lssp7Model[59].setRotationPoint(-9F, -18F, 13.5F);

		lssp7Model[60].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		lssp7Model[60].setRotationPoint(-9F, -18F, 11.5F);

		lssp7Model[61].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 83
		lssp7Model[61].setRotationPoint(-9F, -15F, 11.5F);

		lssp7Model[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 84
		lssp7Model[62].setRotationPoint(-8.5F, -19F, 12.5F);

		lssp7Model[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 86
		lssp7Model[63].setRotationPoint(8F, -25F, 12.5F);

		lssp7Model[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 87
		lssp7Model[64].setRotationPoint(8F, -24F, 12.5F);

		lssp7Model[65].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 89
		lssp7Model[65].setRotationPoint(-11F, -2F, 12F);

		lssp7Model[66].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 90
		lssp7Model[66].setRotationPoint(21F, -2F, 12F);

		lssp7Model[67].addShapeBox(0F, 0F, 0F, 13, 2, 20, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		lssp7Model[67].setRotationPoint(5F, -22F, 3F);

		lssp7Model[68].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		lssp7Model[68].setRotationPoint(5F, -23F, 7F);

		lssp7Model[69].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 81
		lssp7Model[69].setRotationPoint(1F, -17F, 11F);

		lssp7Model[70].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 82
		lssp7Model[70].setRotationPoint(3F, -17F, 11F);

		lssp7Model[71].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 84
		lssp7Model[71].setRotationPoint(0F, -17F, 11F);

		lssp7Model[72].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		lssp7Model[72].setRotationPoint(1F, -18F, 11F);

		lssp7Model[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 86
		lssp7Model[73].setRotationPoint(0F, -18F, 11F);

		lssp7Model[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		lssp7Model[74].setRotationPoint(3F, -18F, 11F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 75; i++)
		{
			lssp7Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo lssp7Model[];
}