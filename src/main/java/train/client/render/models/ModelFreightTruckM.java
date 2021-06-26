//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:28.11.2017 - 23:11:28
// Last changed on: 28.11.2017 - 23:11:28

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelFreightTruckM extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelFreightTruckM()
	{
		freighttruckmModel = new ModelRendererTurbo[52];
		freighttruckmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		freighttruckmModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		freighttruckmModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		freighttruckmModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		freighttruckmModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		freighttruckmModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 12
		freighttruckmModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		freighttruckmModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
		freighttruckmModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 19
		freighttruckmModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 24
		freighttruckmModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 28
		freighttruckmModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 29
		freighttruckmModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30
		freighttruckmModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 31
		freighttruckmModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 33
		freighttruckmModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 34
		freighttruckmModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 35
		freighttruckmModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 38
		freighttruckmModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 39
		freighttruckmModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 55
		freighttruckmModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 56
		freighttruckmModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 57
		freighttruckmModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 60
		freighttruckmModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 61
		freighttruckmModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 63
		freighttruckmModel[25] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 66
		freighttruckmModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 67
		freighttruckmModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 68
		freighttruckmModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 73
		freighttruckmModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		freighttruckmModel[30] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75
		freighttruckmModel[31] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 76
		freighttruckmModel[32] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 77
		freighttruckmModel[33] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 78
		freighttruckmModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 79
		freighttruckmModel[35] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 80
		freighttruckmModel[36] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 85
		freighttruckmModel[37] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 86
		freighttruckmModel[38] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 67
		freighttruckmModel[39] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 68
		freighttruckmModel[40] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 69
		freighttruckmModel[41] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 70
		freighttruckmModel[42] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 71
		freighttruckmModel[43] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 72
		freighttruckmModel[44] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 73
		freighttruckmModel[45] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 74
		freighttruckmModel[46] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 75
		freighttruckmModel[47] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 76
		freighttruckmModel[48] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 77
		freighttruckmModel[49] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 69
		freighttruckmModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		freighttruckmModel[51] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 71

		freighttruckmModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		freighttruckmModel[0].setRotationPoint(1.5F, 6.5F, 9.05F);

		freighttruckmModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 4
		freighttruckmModel[1].setRotationPoint(1F, 3.75F, 9.05F);

		freighttruckmModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
		freighttruckmModel[2].setRotationPoint(4.5F, 5.5F, 9.05F);

		freighttruckmModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0.5F, -4F, 0F, 0.5F); // Box 8
		freighttruckmModel[3].setRotationPoint(5.5F, 5.5F, 9.05F);

		freighttruckmModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 10
		freighttruckmModel[4].setRotationPoint(10.5F, 6.5F, 9.05F);

		freighttruckmModel[5].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 12
		freighttruckmModel[5].setRotationPoint(17F, 3F, 9F);

		freighttruckmModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		freighttruckmModel[6].setRotationPoint(18.5F, 5.5F, 9.05F);

		freighttruckmModel[7].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 18
		freighttruckmModel[7].setRotationPoint(0.5F, 4.5F, 9.05F);

		freighttruckmModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 19
		freighttruckmModel[8].setRotationPoint(8.5F, 5.5F, 9.05F);

		freighttruckmModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 3F, -1F, 0.5F); // Box 24
		freighttruckmModel[9].setRotationPoint(17.5F, 5.5F, 9.05F);

		freighttruckmModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		freighttruckmModel[10].setRotationPoint(2.5F, 5.5F, -4.95F);

		freighttruckmModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 29
		freighttruckmModel[11].setRotationPoint(14.5F, 5.5F, 9.05F);

		freighttruckmModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 30
		freighttruckmModel[12].setRotationPoint(9.5F, 8.5F, 9.05F);

		freighttruckmModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 31
		freighttruckmModel[13].setRotationPoint(13.5F, 5.5F, 9.05F);

		freighttruckmModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 33
		freighttruckmModel[14].setRotationPoint(9.5F, 5.5F, 9.05F);

		freighttruckmModel[15].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, -1.5F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0.5F, -1.5F, -0.25F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 34
		freighttruckmModel[15].setRotationPoint(1.75F, 3F, 9.05F);

		freighttruckmModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 35
		freighttruckmModel[16].setRotationPoint(0.5F, 5.5F, 9.05F);

		freighttruckmModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 38
		freighttruckmModel[17].setRotationPoint(21.5F, 6.5F, 9.05F);

		freighttruckmModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 39
		freighttruckmModel[18].setRotationPoint(21.5F, 5.5F, 9.05F);

		freighttruckmModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		freighttruckmModel[19].setRotationPoint(1.5F, 6.5F, -4.05F);

		freighttruckmModel[20].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		freighttruckmModel[20].setRotationPoint(1F, 3.75F, -4.05F);

		freighttruckmModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		freighttruckmModel[21].setRotationPoint(4.5F, 5.5F, -4.05F);

		freighttruckmModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, 3F, -1F, 0.5F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 60
		freighttruckmModel[22].setRotationPoint(5.5F, 5.5F, -4.05F);

		freighttruckmModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		freighttruckmModel[23].setRotationPoint(10.5F, 6.5F, -4.05F);

		freighttruckmModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		freighttruckmModel[24].setRotationPoint(18.5F, 5.5F, -4.05F);

		freighttruckmModel[25].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 66
		freighttruckmModel[25].setRotationPoint(0.5F, 4.5F, -4.05F);

		freighttruckmModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		freighttruckmModel[26].setRotationPoint(8.5F, 5.5F, -4.05F);

		freighttruckmModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 68
		freighttruckmModel[27].setRotationPoint(17.5F, 5.5F, -4.05F);

		freighttruckmModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 73
		freighttruckmModel[28].setRotationPoint(14.5F, 5.5F, -4.05F);

		freighttruckmModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		freighttruckmModel[29].setRotationPoint(9.5F, 8.5F, -4.05F);

		freighttruckmModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 75
		freighttruckmModel[30].setRotationPoint(13.5F, 5.5F, -4.05F);

		freighttruckmModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		freighttruckmModel[31].setRotationPoint(9.5F, 5.5F, -4.05F);

		freighttruckmModel[32].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, -1.5F, -0.25F, 0.5F, -1.75F, -0.25F, 0.5F, -1.75F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		freighttruckmModel[32].setRotationPoint(1.75F, 3F, -4.05F);

		freighttruckmModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 78
		freighttruckmModel[33].setRotationPoint(0.5F, 5.5F, -4.05F);

		freighttruckmModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		freighttruckmModel[34].setRotationPoint(21.5F, 6.5F, -4.05F);

		freighttruckmModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		freighttruckmModel[35].setRotationPoint(21.5F, 5.5F, -4.05F);

		freighttruckmModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		freighttruckmModel[36].setRotationPoint(10.5F, 3F, -3F);

		freighttruckmModel[37].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		freighttruckmModel[37].setRotationPoint(11F, 1.35F, 2F);

		freighttruckmModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Box 67
		freighttruckmModel[38].setRotationPoint(2.5F, 6.5F, -4.95F);

		freighttruckmModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 68
		freighttruckmModel[39].setRotationPoint(3.5F, 6.5F, -4.95F);

		freighttruckmModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		freighttruckmModel[40].setRotationPoint(3.5F, 5.5F, -4.95F);

		freighttruckmModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		freighttruckmModel[41].setRotationPoint(20.5F, 5.5F, -4.95F);

		freighttruckmModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		freighttruckmModel[42].setRotationPoint(19.5F, 5.5F, -4.95F);

		freighttruckmModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Box 72
		freighttruckmModel[43].setRotationPoint(19.5F, 6.5F, -4.95F);

		freighttruckmModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 73
		freighttruckmModel[44].setRotationPoint(20.5F, 6.5F, -4.95F);

		freighttruckmModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		freighttruckmModel[45].setRotationPoint(3F, 6.1F, -6F);

		freighttruckmModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		freighttruckmModel[46].setRotationPoint(20F, 6.1F, -6F);

		freighttruckmModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 76
		freighttruckmModel[47].setRotationPoint(20F, 6.1F, 11F);

		freighttruckmModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 77
		freighttruckmModel[48].setRotationPoint(3F, 6.1F, 11F);

		freighttruckmModel[49].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 69
		freighttruckmModel[49].setRotationPoint(0F, 3F, 9F);

		freighttruckmModel[50].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 70
		freighttruckmModel[50].setRotationPoint(0F, 3F, -3F);

		freighttruckmModel[51].addShapeBox(0F, 0F, 0F, 21, 21, 0, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, 0F, -14F, 0F); // Box 71
		freighttruckmModel[51].setRotationPoint(17F, 3F, -3F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 52; i++)
		{
			freighttruckmModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo freighttruckmModel[];
}