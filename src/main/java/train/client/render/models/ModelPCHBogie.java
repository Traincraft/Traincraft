//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:01.06.2020 - 12:24:49
// Last changed on: 01.06.2020 - 12:24:49

package train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelRendererTurbo;

public class ModelPCHBogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelPCHBogie()
	{
		pchbogieModel = new ModelRendererTurbo[66];
		pchbogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		pchbogieModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		pchbogieModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 96
		pchbogieModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		pchbogieModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		pchbogieModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 98
		pchbogieModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 99
		pchbogieModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 100
		pchbogieModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 102
		pchbogieModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 104
		pchbogieModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 105
		pchbogieModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 106
		pchbogieModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 110
		pchbogieModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 111
		pchbogieModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 122
		pchbogieModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 123
		pchbogieModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 124
		pchbogieModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 80
		pchbogieModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 81
		pchbogieModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 82
		pchbogieModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 83
		pchbogieModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 84
		pchbogieModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 85
		pchbogieModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 91
		pchbogieModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 92
		pchbogieModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 93
		pchbogieModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 96
		pchbogieModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 97
		pchbogieModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 98
		pchbogieModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 99
		pchbogieModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 100
		pchbogieModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 101
		pchbogieModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 102
		pchbogieModel[33] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 104
		pchbogieModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 107
		pchbogieModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 108
		pchbogieModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 109
		pchbogieModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 110
		pchbogieModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 111
		pchbogieModel[39] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 112
		pchbogieModel[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 113
		pchbogieModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 114
		pchbogieModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 115
		pchbogieModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 118
		pchbogieModel[44] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 119
		pchbogieModel[45] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 120
		pchbogieModel[46] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 121
		pchbogieModel[47] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 122
		pchbogieModel[48] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 123
		pchbogieModel[49] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 124
		pchbogieModel[50] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 125
		pchbogieModel[51] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 126
		pchbogieModel[52] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 127
		pchbogieModel[53] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 74
		pchbogieModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 173
		pchbogieModel[55] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 76
		pchbogieModel[56] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 77
		pchbogieModel[57] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 78
		pchbogieModel[58] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 79
		pchbogieModel[59] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 80
		pchbogieModel[60] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 81
		pchbogieModel[61] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 82
		pchbogieModel[62] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 83
		pchbogieModel[63] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 84
		pchbogieModel[64] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 85
		pchbogieModel[65] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 87

		pchbogieModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		pchbogieModel[0].setRotationPoint(-8F, 1.5F, -9F);

		pchbogieModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		pchbogieModel[1].setRotationPoint(4F, 1.5F, -9F);

		pchbogieModel[2].addBox(0F, 0F, 0F, 6, 4, 13, 0F); // Box 96
		pchbogieModel[2].setRotationPoint(-4F, 0.25F, -6.5F);

		pchbogieModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		pchbogieModel[3].setRotationPoint(-7F, 2.5F, -6F);

		pchbogieModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		pchbogieModel[4].setRotationPoint(-4F, -0.5F, -8.5F);

		pchbogieModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 98
		pchbogieModel[5].setRotationPoint(6F, 1.5F, -7F);

		pchbogieModel[6].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 99
		pchbogieModel[6].setRotationPoint(-2.5F, 3.5F, -8.5F);

		pchbogieModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		pchbogieModel[7].setRotationPoint(1.5F, 0.5F, -7.5F);

		pchbogieModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		pchbogieModel[8].setRotationPoint(-11F, -0.5F, -7F);

		pchbogieModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		pchbogieModel[9].setRotationPoint(8F, 0.5F, -7F);

		pchbogieModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 105
		pchbogieModel[10].setRotationPoint(0.5F, 1.5F, -7.5F);

		pchbogieModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F); // Box 106
		pchbogieModel[11].setRotationPoint(5.5F, 1.5F, -7.5F);

		pchbogieModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		pchbogieModel[12].setRotationPoint(8F, 3F, -9F);

		pchbogieModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 111
		pchbogieModel[13].setRotationPoint(2F, -0.5F, -8.5F);

		pchbogieModel[14].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 122
		pchbogieModel[14].setRotationPoint(-9F, 1F, -5F);

		pchbogieModel[15].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 123
		pchbogieModel[15].setRotationPoint(2F, 1F, -5F);

		pchbogieModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		pchbogieModel[16].setRotationPoint(-3F, 0F, -2F);

		pchbogieModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
		pchbogieModel[17].setRotationPoint(3F, 1F, -9F);

		pchbogieModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		pchbogieModel[18].setRotationPoint(-6F, 1F, -9F);

		pchbogieModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 82
		pchbogieModel[19].setRotationPoint(-5F, -0.5F, -8.5F);

		pchbogieModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 83
		pchbogieModel[20].setRotationPoint(5F, 3.5F, -8F);

		pchbogieModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		pchbogieModel[21].setRotationPoint(-8.5F, 0.5F, -7.5F);

		pchbogieModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 85
		pchbogieModel[22].setRotationPoint(-5.5F, 1.5F, -7.5F);

		pchbogieModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F); // Box 91
		pchbogieModel[23].setRotationPoint(-10F, 3.5F, -8F);

		pchbogieModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		pchbogieModel[24].setRotationPoint(-11F, 3F, -9F);

		pchbogieModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
		pchbogieModel[25].setRotationPoint(-11F, 0.5F, -7F);

		pchbogieModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 96
		pchbogieModel[26].setRotationPoint(-8.5F, 1.5F, -7.5F);

		pchbogieModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 97
		pchbogieModel[27].setRotationPoint(-10F, 1.5F, -7F);

		pchbogieModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		pchbogieModel[28].setRotationPoint(7F, -0.5F, -7F);

		pchbogieModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		pchbogieModel[29].setRotationPoint(-2F, -0.5F, -7.5F);

		pchbogieModel[30].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 100
		pchbogieModel[30].setRotationPoint(5F, 2.5F, -6F);

		pchbogieModel[31].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 101
		pchbogieModel[31].setRotationPoint(5F, 2.5F, 6F);

		pchbogieModel[32].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 102
		pchbogieModel[32].setRotationPoint(-7F, 2.5F, 6F);

		pchbogieModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		pchbogieModel[33].setRotationPoint(-2F, -0.5F, 6.5F);

		pchbogieModel[34].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 107
		pchbogieModel[34].setRotationPoint(-2.5F, 3.5F, 6.5F);

		pchbogieModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 108
		pchbogieModel[35].setRotationPoint(-5.5F, 1.5F, 6.5F);

		pchbogieModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 109
		pchbogieModel[36].setRotationPoint(0.5F, 1.5F, 6.5F);

		pchbogieModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		pchbogieModel[37].setRotationPoint(-8.5F, 0.5F, 6.5F);

		pchbogieModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		pchbogieModel[38].setRotationPoint(1.5F, 0.5F, 6.5F);

		pchbogieModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F); // Box 112
		pchbogieModel[39].setRotationPoint(5.5F, 1.5F, 6.5F);

		pchbogieModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 113
		pchbogieModel[40].setRotationPoint(-8.5F, 1.5F, 6.5F);

		pchbogieModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 114
		pchbogieModel[41].setRotationPoint(3F, 1F, 7F);

		pchbogieModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 115
		pchbogieModel[42].setRotationPoint(-6F, 1F, 7F);

		pchbogieModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 118
		pchbogieModel[43].setRotationPoint(-10F, 3.5F, 6F);

		pchbogieModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 119
		pchbogieModel[44].setRotationPoint(5F, 3.5F, 6F);

		pchbogieModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		pchbogieModel[45].setRotationPoint(8F, 3F, 7F);

		pchbogieModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		pchbogieModel[46].setRotationPoint(-11F, 3F, 7F);

		pchbogieModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 122
		pchbogieModel[47].setRotationPoint(8F, 0.5F, 6F);

		pchbogieModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		pchbogieModel[48].setRotationPoint(6F, 1.5F, 6F);

		pchbogieModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		pchbogieModel[49].setRotationPoint(7F, -0.5F, 6F);

		pchbogieModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
		pchbogieModel[50].setRotationPoint(-11F, 0.5F, 6F);

		pchbogieModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 126
		pchbogieModel[51].setRotationPoint(-10F, 1.5F, 6F);

		pchbogieModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		pchbogieModel[52].setRotationPoint(-11F, -0.5F, 6F);

		pchbogieModel[53].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 74
		pchbogieModel[53].setRotationPoint(-2.5F, 2F, -8.5F);

		pchbogieModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		pchbogieModel[54].setRotationPoint(-8F, 1.5F, 8.5F);

		pchbogieModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 76
		pchbogieModel[55].setRotationPoint(4F, 1.5F, 8.5F);

		pchbogieModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 77
		pchbogieModel[56].setRotationPoint(4F, 1.5F, -9.5F);

		pchbogieModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 78
		pchbogieModel[57].setRotationPoint(-8F, 1.5F, -9.5F);

		pchbogieModel[58].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 79
		pchbogieModel[58].setRotationPoint(-2.51F, 1.5F, -8.5F);

		pchbogieModel[59].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 80
		pchbogieModel[59].setRotationPoint(0.51F, 1.5F, -8.5F);

		pchbogieModel[60].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		pchbogieModel[60].setRotationPoint(-4F, -0.5F, 7.5F);

		pchbogieModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 82
		pchbogieModel[61].setRotationPoint(-5F, -0.5F, 7.5F);

		pchbogieModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 83
		pchbogieModel[62].setRotationPoint(2F, -0.5F, 7.5F);

		pchbogieModel[63].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 84
		pchbogieModel[63].setRotationPoint(0.51F, 1.5F, 7.5F);

		pchbogieModel[64].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 85
		pchbogieModel[64].setRotationPoint(-2.5F, 2F, 6.5F);

		pchbogieModel[65].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 87
		pchbogieModel[65].setRotationPoint(-2.51F, 1.5F, 7.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 66; i++)
		{
			pchbogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo pchbogieModel[];
}