//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FOL-M1 Trucks
// Model Creator:
// Created on:06.12.2018 - 11:26:06
// Last changed on: 06.12.2018 - 11:26:06

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelFOL_M1Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelFOL_M1Bogie()
	{
		fol_m1bogiesModel = new ModelRendererTurbo[58];
		fol_m1bogiesModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		fol_m1bogiesModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 124 wheel
		fol_m1bogiesModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 125 wheel
		fol_m1bogiesModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 126 wheel
		fol_m1bogiesModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 127 wheel
		fol_m1bogiesModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 128
		fol_m1bogiesModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 129
		fol_m1bogiesModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 130
		fol_m1bogiesModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 133
		fol_m1bogiesModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 134
		fol_m1bogiesModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 136
		fol_m1bogiesModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 138
		fol_m1bogiesModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 32
		fol_m1bogiesModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		fol_m1bogiesModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 34
		fol_m1bogiesModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 59
		fol_m1bogiesModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 36
		fol_m1bogiesModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 37
		fol_m1bogiesModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 38
		fol_m1bogiesModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 39
		fol_m1bogiesModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 40
		fol_m1bogiesModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 41
		fol_m1bogiesModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 42
		fol_m1bogiesModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 43
		fol_m1bogiesModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 44
		fol_m1bogiesModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 45
		fol_m1bogiesModel[26] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		fol_m1bogiesModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 47
		fol_m1bogiesModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 48
		fol_m1bogiesModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		fol_m1bogiesModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 50
		fol_m1bogiesModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 51
		fol_m1bogiesModel[32] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 52
		fol_m1bogiesModel[33] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 36
		fol_m1bogiesModel[34] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 39
		fol_m1bogiesModel[35] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 40
		fol_m1bogiesModel[36] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 41
		fol_m1bogiesModel[37] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 42
		fol_m1bogiesModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 43
		fol_m1bogiesModel[39] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 44
		fol_m1bogiesModel[40] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 45
		fol_m1bogiesModel[41] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 46
		fol_m1bogiesModel[42] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 49 traction motor
		fol_m1bogiesModel[43] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 50 traction motor
		fol_m1bogiesModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 68 wheel
		fol_m1bogiesModel[45] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 69 wheel
		fol_m1bogiesModel[46] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 70
		fol_m1bogiesModel[47] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 71
		fol_m1bogiesModel[48] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 72
		fol_m1bogiesModel[49] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 73
		fol_m1bogiesModel[50] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 74
		fol_m1bogiesModel[51] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 75
		fol_m1bogiesModel[52] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 76
		fol_m1bogiesModel[53] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 77
		fol_m1bogiesModel[54] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 78
		fol_m1bogiesModel[55] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 79
		fol_m1bogiesModel[56] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 80
		fol_m1bogiesModel[57] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 81

		fol_m1bogiesModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 122
		fol_m1bogiesModel[0].setRotationPoint(-21.5F, 3.5F, -9.5F);

		fol_m1bogiesModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 124 wheel
		fol_m1bogiesModel[1].setRotationPoint(-2.5F, 4.5F, -8F);

		fol_m1bogiesModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 125 wheel
		fol_m1bogiesModel[2].setRotationPoint(-20.5F, 4.5F, -8F);

		fol_m1bogiesModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 126 wheel
		fol_m1bogiesModel[3].setRotationPoint(-20.5F, 4.5F, 4F);

		fol_m1bogiesModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 127 wheel
		fol_m1bogiesModel[4].setRotationPoint(-2.5F, 4.5F, 4F);

		fol_m1bogiesModel[5].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 128
		fol_m1bogiesModel[5].setRotationPoint(-24F, 2F, -9F);

		fol_m1bogiesModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 129
		fol_m1bogiesModel[6].setRotationPoint(-24F, 3F, -9F);

		fol_m1bogiesModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		fol_m1bogiesModel[7].setRotationPoint(-22.5F, 4F, -9F);

		fol_m1bogiesModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133
		fol_m1bogiesModel[8].setRotationPoint(-19.5F, 4F, -9F);

		fol_m1bogiesModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		fol_m1bogiesModel[9].setRotationPoint(-17.5F, 2F, -9F);

		fol_m1bogiesModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		fol_m1bogiesModel[10].setRotationPoint(-17.5F, 6F, -9.5F);

		fol_m1bogiesModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 138
		fol_m1bogiesModel[11].setRotationPoint(-16.5F, 5.5F, -10F);

		fol_m1bogiesModel[12].addShapeBox(0F, 0F, 0F, 7, 4, 11, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 32
		fol_m1bogiesModel[12].setRotationPoint(-15F, 2F, -7.5F);

		fol_m1bogiesModel[13].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 33
		fol_m1bogiesModel[13].setRotationPoint(-21F, 3F, -9F);

		fol_m1bogiesModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		fol_m1bogiesModel[14].setRotationPoint(-2F, 3F, -9F);

		fol_m1bogiesModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		fol_m1bogiesModel[15].setRotationPoint(-20.5F, 1.5F, -9.5F);

		fol_m1bogiesModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		fol_m1bogiesModel[16].setRotationPoint(-4.5F, 1.5F, -9.5F);

		fol_m1bogiesModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		fol_m1bogiesModel[17].setRotationPoint(-4.5F, 4F, -9F);

		fol_m1bogiesModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		fol_m1bogiesModel[18].setRotationPoint(-1.5F, 4F, -9F);

		fol_m1bogiesModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		fol_m1bogiesModel[19].setRotationPoint(-22.5F, 1F, -9F);

		fol_m1bogiesModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		fol_m1bogiesModel[20].setRotationPoint(-4.5F, 1F, -9F);

		fol_m1bogiesModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		fol_m1bogiesModel[21].setRotationPoint(-14.5F, 1F, -9F);

		fol_m1bogiesModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		fol_m1bogiesModel[22].setRotationPoint(-14.5F, 1F, 4F);

		fol_m1bogiesModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		fol_m1bogiesModel[23].setRotationPoint(-22.5F, 1F, 4F);

		fol_m1bogiesModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		fol_m1bogiesModel[24].setRotationPoint(-4.5F, 1F, 4F);

		fol_m1bogiesModel[25].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 45
		fol_m1bogiesModel[25].setRotationPoint(-24F, 2F, 4F);

		fol_m1bogiesModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		fol_m1bogiesModel[26].setRotationPoint(-2F, 3F, 4F);

		fol_m1bogiesModel[27].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 47
		fol_m1bogiesModel[27].setRotationPoint(-21F, 3F, 4F);

		fol_m1bogiesModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 48
		fol_m1bogiesModel[28].setRotationPoint(-24F, 3F, 4F);

		fol_m1bogiesModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 49
		fol_m1bogiesModel[29].setRotationPoint(-22.5F, 4F, 4F);

		fol_m1bogiesModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		fol_m1bogiesModel[30].setRotationPoint(-19.5F, 4F, 4F);

		fol_m1bogiesModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 51
		fol_m1bogiesModel[31].setRotationPoint(-4.5F, 4F, 4F);

		fol_m1bogiesModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		fol_m1bogiesModel[32].setRotationPoint(-1.5F, 4F, 4F);

		fol_m1bogiesModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		fol_m1bogiesModel[33].setRotationPoint(-17.5F, 2F, 4F);

		fol_m1bogiesModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		fol_m1bogiesModel[34].setRotationPoint(-17.5F, 6F, 4.5F);

		fol_m1bogiesModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40
		fol_m1bogiesModel[35].setRotationPoint(-4.5F, 1.5F, 5F);

		fol_m1bogiesModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		fol_m1bogiesModel[36].setRotationPoint(-20.5F, 1.5F, 5F);

		fol_m1bogiesModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 42
		fol_m1bogiesModel[37].setRotationPoint(-21F, 4F, -9.5F);

		fol_m1bogiesModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		fol_m1bogiesModel[38].setRotationPoint(-3.5F, 3.5F, -9.5F);

		fol_m1bogiesModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 44
		fol_m1bogiesModel[39].setRotationPoint(-3F, 4F, -9.5F);

		fol_m1bogiesModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 45
		fol_m1bogiesModel[40].setRotationPoint(-3.5F, 3.5F, 4F);

		fol_m1bogiesModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 46
		fol_m1bogiesModel[41].setRotationPoint(-21.5F, 3.5F, 4F);

		fol_m1bogiesModel[42].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 49 traction motor
		fol_m1bogiesModel[42].setRotationPoint(-22F, 2F, -7F);

		fol_m1bogiesModel[43].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 50 traction motor
		fol_m1bogiesModel[43].setRotationPoint(-8F, 2F, -7F);

		fol_m1bogiesModel[44].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 68 wheel
		fol_m1bogiesModel[44].setRotationPoint(-11.5F, 4.5F, -8F);

		fol_m1bogiesModel[45].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 69 wheel
		fol_m1bogiesModel[45].setRotationPoint(-11.5F, 4.5F, 4F);

		fol_m1bogiesModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		fol_m1bogiesModel[46].setRotationPoint(-10.5F, 4F, 4F);

		fol_m1bogiesModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		fol_m1bogiesModel[47].setRotationPoint(-13.5F, 4F, 4F);

		fol_m1bogiesModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
		fol_m1bogiesModel[48].setRotationPoint(-12.5F, 3.5F, 4F);

		fol_m1bogiesModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 73
		fol_m1bogiesModel[49].setRotationPoint(-12F, 4F, -9.5F);

		fol_m1bogiesModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		fol_m1bogiesModel[50].setRotationPoint(-13.5F, 4F, -9F);

		fol_m1bogiesModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 75
		fol_m1bogiesModel[51].setRotationPoint(-12.5F, 3.5F, -9.5F);

		fol_m1bogiesModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		fol_m1bogiesModel[52].setRotationPoint(-10.5F, 4F, -9F);

		fol_m1bogiesModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		fol_m1bogiesModel[53].setRotationPoint(-9.5F, 6F, -9.5F);

		fol_m1bogiesModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 78
		fol_m1bogiesModel[54].setRotationPoint(-7.5F, 5.5F, -10F);

		fol_m1bogiesModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		fol_m1bogiesModel[55].setRotationPoint(-6.5F, 2F, -9F);

		fol_m1bogiesModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		fol_m1bogiesModel[56].setRotationPoint(-9.5F, 6F, 4.5F);

		fol_m1bogiesModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		fol_m1bogiesModel[57].setRotationPoint(-6.5F, 2F, 4F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 58; i++)
		{
			fol_m1bogiesModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo fol_m1bogiesModel[];
}