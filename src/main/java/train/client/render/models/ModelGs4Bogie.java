//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 20:17:08
// Last changed on: 29.03.2018 - 20:17:08

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGs4Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGs4Bogie()
	{
		gs4bogieModel = new ModelRendererTurbo[60];
		gs4bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		gs4bogieModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		gs4bogieModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 155
		gs4bogieModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 156
		gs4bogieModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 157
		gs4bogieModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 158
		gs4bogieModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 162
		gs4bogieModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 164
		gs4bogieModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 165
		gs4bogieModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 166
		gs4bogieModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 167
		gs4bogieModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 168
		gs4bogieModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 169
		gs4bogieModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 173
		gs4bogieModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 180
		gs4bogieModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 181
		gs4bogieModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30
		gs4bogieModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 31
		gs4bogieModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		gs4bogieModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		gs4bogieModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 37
		gs4bogieModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		gs4bogieModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 45
		gs4bogieModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 46
		gs4bogieModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 47
		gs4bogieModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 49
		gs4bogieModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 50
		gs4bogieModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 47
		gs4bogieModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 48
		gs4bogieModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 49
		gs4bogieModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 50
		gs4bogieModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 51
		gs4bogieModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 52
		gs4bogieModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 53
		gs4bogieModel[34] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 54
		gs4bogieModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 55
		gs4bogieModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 56
		gs4bogieModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 57
		gs4bogieModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 58
		gs4bogieModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 59
		gs4bogieModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 61
		gs4bogieModel[41] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 62
		gs4bogieModel[42] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 63
		gs4bogieModel[43] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 64
		gs4bogieModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 65
		gs4bogieModel[45] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 66
		gs4bogieModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 67
		gs4bogieModel[47] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 69
		gs4bogieModel[48] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 70
		gs4bogieModel[49] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 71
		gs4bogieModel[50] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 73
		gs4bogieModel[51] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 74
		gs4bogieModel[52] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 75
		gs4bogieModel[53] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 76
		gs4bogieModel[54] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 78
		gs4bogieModel[55] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 79
		gs4bogieModel[56] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 80
		gs4bogieModel[57] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 81
		gs4bogieModel[58] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 82
		gs4bogieModel[59] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61

		gs4bogieModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gs4bogieModel[0].setRotationPoint(-8F, 6F, 6F);

		gs4bogieModel[1].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 154
		gs4bogieModel[1].setRotationPoint(-10F, 5F, 6F);

		gs4bogieModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gs4bogieModel[2].setRotationPoint(-7F, 6F, 6F);

		gs4bogieModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 156
		gs4bogieModel[3].setRotationPoint(-9F, 4F, 5.95F);

		gs4bogieModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gs4bogieModel[4].setRotationPoint(-5F, 6F, 6F);

		gs4bogieModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		gs4bogieModel[5].setRotationPoint(-9F, 8F, 6F);

		gs4bogieModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gs4bogieModel[6].setRotationPoint(5F, 6F, 6F);

		gs4bogieModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		gs4bogieModel[7].setRotationPoint(6F, 6F, 6F);

		gs4bogieModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		gs4bogieModel[8].setRotationPoint(8F, 6F, 6F);

		gs4bogieModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 166
		gs4bogieModel[9].setRotationPoint(11F, 4F, -6F);

		gs4bogieModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 167
		gs4bogieModel[10].setRotationPoint(-11F, 4F, -6F);

		gs4bogieModel[11].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 168
		gs4bogieModel[11].setRotationPoint(-1F, 3F, -2F);

		gs4bogieModel[12].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 169
		gs4bogieModel[12].setRotationPoint(-1F, 4F, -6F);

		gs4bogieModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gs4bogieModel[13].setRotationPoint(6F, 6F, -8F);

		gs4bogieModel[14].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 180
		gs4bogieModel[14].setRotationPoint(-9F, 4F, -5.95F);

		gs4bogieModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gs4bogieModel[15].setRotationPoint(-7F, 6F, -8F);

		gs4bogieModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gs4bogieModel[16].setRotationPoint(6.5F, 6.5F, -6F);

		gs4bogieModel[17].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 31
		gs4bogieModel[17].setRotationPoint(-6.5F, 6.5F, -6F);

		gs4bogieModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		gs4bogieModel[18].setRotationPoint(4F, 6F, 6F);

		gs4bogieModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		gs4bogieModel[19].setRotationPoint(-4F, 6F, 6F);

		gs4bogieModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gs4bogieModel[20].setRotationPoint(4F, 8F, 6F);

		gs4bogieModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		gs4bogieModel[21].setRotationPoint(-3F, 8F, -7F);

		gs4bogieModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		gs4bogieModel[22].setRotationPoint(-3F, 8F, 6F);

		gs4bogieModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		gs4bogieModel[23].setRotationPoint(-4F, 6F, 6F);

		gs4bogieModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gs4bogieModel[24].setRotationPoint(3F, 6F, 6F);

		gs4bogieModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gs4bogieModel[25].setRotationPoint(-2F, 6F, 6F);

		gs4bogieModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gs4bogieModel[26].setRotationPoint(-2F, 7F, 6F);

		gs4bogieModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		gs4bogieModel[27].setRotationPoint(-9F, 6F, 6F);

		gs4bogieModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		gs4bogieModel[28].setRotationPoint(9F, 6F, 6F);

		gs4bogieModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gs4bogieModel[29].setRotationPoint(10F, 6F, 6F);

		gs4bogieModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		gs4bogieModel[30].setRotationPoint(-10F, 6F, 6F);

		gs4bogieModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		gs4bogieModel[31].setRotationPoint(-10F, 6F, -7F);

		gs4bogieModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gs4bogieModel[32].setRotationPoint(-10F, 4F, 6F);

		gs4bogieModel[33].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 53
		gs4bogieModel[33].setRotationPoint(6F, 4F, 6F);

		gs4bogieModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gs4bogieModel[34].setRotationPoint(-1F, 4F, 6F);

		gs4bogieModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gs4bogieModel[35].setRotationPoint(4F, 4F, 6F);

		gs4bogieModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gs4bogieModel[36].setRotationPoint(-5F, 4F, 6F);

		gs4bogieModel[37].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 57
		gs4bogieModel[37].setRotationPoint(6F, 4F, -7F);

		gs4bogieModel[38].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 58
		gs4bogieModel[38].setRotationPoint(-10F, 5F, -7F);

		gs4bogieModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gs4bogieModel[39].setRotationPoint(4F, 4F, -7F);

		gs4bogieModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gs4bogieModel[40].setRotationPoint(8F, 6F, -7F);

		gs4bogieModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		gs4bogieModel[41].setRotationPoint(9F, 6F, -7F);

		gs4bogieModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gs4bogieModel[42].setRotationPoint(4F, 8F, -7F);

		gs4bogieModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gs4bogieModel[43].setRotationPoint(4F, 6F, -7F);

		gs4bogieModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gs4bogieModel[44].setRotationPoint(3F, 6F, -7F);

		gs4bogieModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gs4bogieModel[45].setRotationPoint(-2F, 6F, -7F);

		gs4bogieModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gs4bogieModel[46].setRotationPoint(-2F, 7F, -7F);

		gs4bogieModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 69
		gs4bogieModel[47].setRotationPoint(-4F, 6F, -7F);

		gs4bogieModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gs4bogieModel[48].setRotationPoint(-5F, 6F, -7F);

		gs4bogieModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gs4bogieModel[49].setRotationPoint(-9F, 8F, -7F);

		gs4bogieModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gs4bogieModel[50].setRotationPoint(-8F, 6F, -7F);

		gs4bogieModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		gs4bogieModel[51].setRotationPoint(-9F, 6F, -7F);

		gs4bogieModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gs4bogieModel[52].setRotationPoint(-4F, 6F, -7F);

		gs4bogieModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gs4bogieModel[53].setRotationPoint(10F, 6F, -7F);

		gs4bogieModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gs4bogieModel[54].setRotationPoint(-10F, 4F, -7F);

		gs4bogieModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gs4bogieModel[55].setRotationPoint(-5F, 4F, -7F);

		gs4bogieModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gs4bogieModel[56].setRotationPoint(-1F, 4F, -7F);

		gs4bogieModel[57].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 81
		gs4bogieModel[57].setRotationPoint(4F, 4F, 5.95F);

		gs4bogieModel[58].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 82
		gs4bogieModel[58].setRotationPoint(4F, 4F, -5.95F);

		gs4bogieModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gs4bogieModel[59].setRotationPoint(5F, 6F, -7F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 60; i++)
		{
			gs4bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gs4bogieModel[];
}