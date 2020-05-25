//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:23.08.2017 - 15:44:59
// Last changed on: 23.08.2017 - 15:44:59

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelDeltic_Bogie extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelDeltic_Bogie()
	{
		deltic2_bogieModel = new ModelRendererTurbo[43];
		deltic2_bogieModel[0] = new ModelRendererTurbo(this, 169, -40, textureX, textureY); // Box 0
		deltic2_bogieModel[1] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 1
		deltic2_bogieModel[2] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 2
		deltic2_bogieModel[3] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 3
		deltic2_bogieModel[4] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 4
		deltic2_bogieModel[5] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 5
		deltic2_bogieModel[6] = new ModelRendererTurbo(this, 170, -40, textureX, textureY); // Box 6
		deltic2_bogieModel[7] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 7
		deltic2_bogieModel[8] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 8
		deltic2_bogieModel[9] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 9
		deltic2_bogieModel[10] = new ModelRendererTurbo(this, 169, -40, textureX, textureY); // Box 12
		deltic2_bogieModel[11] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 13
		deltic2_bogieModel[12] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 14
		deltic2_bogieModel[13] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 15
		deltic2_bogieModel[14] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 16
		deltic2_bogieModel[15] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 17
		deltic2_bogieModel[16] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 18
		deltic2_bogieModel[17] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 19
		deltic2_bogieModel[18] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 20
		deltic2_bogieModel[19] = new ModelRendererTurbo(this, 169, -40, textureX, textureY); // Box 21
		deltic2_bogieModel[20] = new ModelRendererTurbo(this, 169, -40, textureX, textureY); // Box 22
		deltic2_bogieModel[21] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 23
		deltic2_bogieModel[22] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 24
		deltic2_bogieModel[23] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 25
		deltic2_bogieModel[24] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 26
		deltic2_bogieModel[25] = new ModelRendererTurbo(this, 1, -39, textureX, textureY); // Box 27
		deltic2_bogieModel[26] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 28
		deltic2_bogieModel[27] = new ModelRendererTurbo(this, 1, -40, textureX, textureY); // Box 29
		deltic2_bogieModel[28] = new ModelRendererTurbo(this, 85, -40, textureX, textureY); // Box 30
		deltic2_bogieModel[29] = new ModelRendererTurbo(this, 170, -40, textureX, textureY); // Box 31
		deltic2_bogieModel[30] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 32
		deltic2_bogieModel[31] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 33
		deltic2_bogieModel[32] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 34
		deltic2_bogieModel[33] = new ModelRendererTurbo(this, 11, 64, textureX, textureY); // Box 36
		deltic2_bogieModel[34] = new ModelRendererTurbo(this, 26, 75, textureX, textureY); // Box 37
		deltic2_bogieModel[35] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 38
		deltic2_bogieModel[36] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 39
		deltic2_bogieModel[37] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 40
		deltic2_bogieModel[38] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 41
		deltic2_bogieModel[39] = new ModelRendererTurbo(this, 39, 105, textureX, textureY); // Box 42
		deltic2_bogieModel[40] = new ModelRendererTurbo(this, 39, 105, textureX, textureY); // Box 43
		deltic2_bogieModel[41] = new ModelRendererTurbo(this, 144, 93, textureX, textureY); // Box 44
		deltic2_bogieModel[42] = new ModelRendererTurbo(this, 102, 93, textureX, textureY); // Box 45

		deltic2_bogieModel[0].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		deltic2_bogieModel[0].setRotationPoint(-7F, -25F, -18F);

		deltic2_bogieModel[1].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		deltic2_bogieModel[1].setRotationPoint(-6.8F, -25F, -18F);

		deltic2_bogieModel[2].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		deltic2_bogieModel[2].setRotationPoint(-6.6F, -25F, -18F);

		deltic2_bogieModel[3].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		deltic2_bogieModel[3].setRotationPoint(-6.4F, -25F, -18F);

		deltic2_bogieModel[4].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		deltic2_bogieModel[4].setRotationPoint(-6.2F, -25F, -18F);

		deltic2_bogieModel[5].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		deltic2_bogieModel[5].setRotationPoint(4.2F, -25F, -18F);

		deltic2_bogieModel[6].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		deltic2_bogieModel[6].setRotationPoint(5F, -25F, -18F);

		deltic2_bogieModel[7].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		deltic2_bogieModel[7].setRotationPoint(4.8F, -25F, -18F);

		deltic2_bogieModel[8].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		deltic2_bogieModel[8].setRotationPoint(4.6F, -25F, -18F);

		deltic2_bogieModel[9].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		deltic2_bogieModel[9].setRotationPoint(4.4F, -25F, -18F);

		deltic2_bogieModel[10].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		deltic2_bogieModel[10].setRotationPoint(-7F, -25F, -30F);

		deltic2_bogieModel[11].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		deltic2_bogieModel[11].setRotationPoint(-6.6F, -25F, -30F);

		deltic2_bogieModel[12].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		deltic2_bogieModel[12].setRotationPoint(-6.4F, -25F, -30F);

		deltic2_bogieModel[13].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		deltic2_bogieModel[13].setRotationPoint(-6.8F, -25F, -30F);

		deltic2_bogieModel[14].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		deltic2_bogieModel[14].setRotationPoint(-6.2F, -25F, -30F);

		deltic2_bogieModel[15].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		deltic2_bogieModel[15].setRotationPoint(4.2F, -25F, -30F);

		deltic2_bogieModel[16].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		deltic2_bogieModel[16].setRotationPoint(4.4F, -25F, -30F);

		deltic2_bogieModel[17].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		deltic2_bogieModel[17].setRotationPoint(4.6F, -25F, -30F);

		deltic2_bogieModel[18].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		deltic2_bogieModel[18].setRotationPoint(4.8F, -25F, -30F);

		deltic2_bogieModel[19].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		deltic2_bogieModel[19].setRotationPoint(5F, -25F, -30F);

		deltic2_bogieModel[20].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		deltic2_bogieModel[20].setRotationPoint(-7F, -25F, -42F);

		deltic2_bogieModel[21].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		deltic2_bogieModel[21].setRotationPoint(-6.6F, -25F, -42F);

		deltic2_bogieModel[22].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		deltic2_bogieModel[22].setRotationPoint(-6.4F, -25F, -42F);

		deltic2_bogieModel[23].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		deltic2_bogieModel[23].setRotationPoint(-6.8F, -25F, -42F);

		deltic2_bogieModel[24].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		deltic2_bogieModel[24].setRotationPoint(-6.2F, -25F, -42F);

		deltic2_bogieModel[25].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		deltic2_bogieModel[25].setRotationPoint(4.2F, -25F, -42F);

		deltic2_bogieModel[26].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		deltic2_bogieModel[26].setRotationPoint(4.4F, -25F, -42F);

		deltic2_bogieModel[27].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		deltic2_bogieModel[27].setRotationPoint(4.6F, -25F, -42F);

		deltic2_bogieModel[28].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		deltic2_bogieModel[28].setRotationPoint(4.8F, -25F, -42F);

		deltic2_bogieModel[29].addShapeBox(0F, 0F, 0F, 0, 41, 41, 0F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		deltic2_bogieModel[29].setRotationPoint(5F, -25F, -42F);

		deltic2_bogieModel[30].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		deltic2_bogieModel[30].setRotationPoint(-8F, 7.5F, -9.5F);

		deltic2_bogieModel[31].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		deltic2_bogieModel[31].setRotationPoint(-8F, 7.5F, 2.5F);

		deltic2_bogieModel[32].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		deltic2_bogieModel[32].setRotationPoint(-8F, 7.5F, 14.5F);

		deltic2_bogieModel[33].addBox(0F, 0F, 0F, 10, 3, 33, 0F); // Box 36
		deltic2_bogieModel[33].setRotationPoint(-6F, 8F, -9F);

		deltic2_bogieModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		deltic2_bogieModel[34].setRotationPoint(-3.5F, 7F, -4F);

		deltic2_bogieModel[35].addShapeBox(0F, 0F, 0F, 0, 21, 66, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, -33F, 0F, -14F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F); // Box 38
		deltic2_bogieModel[35].setRotationPoint(-7.4F, -5F, -9F);

		deltic2_bogieModel[36].addShapeBox(0F, 0F, 0F, 0, 21, 66, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, -33F, 0F, -14F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F); // Box 39
		deltic2_bogieModel[36].setRotationPoint(-7.6F, -5F, -9F);

		deltic2_bogieModel[37].addShapeBox(0F, 0F, 0F, 0, 21, 66, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, -33F, 0F, -14F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F); // Box 40
		deltic2_bogieModel[37].setRotationPoint(5.4F, -5F, -9F);

		deltic2_bogieModel[38].addShapeBox(0F, 0F, 0F, 0, 21, 66, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, -33F, 0F, -14F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F); // Box 41
		deltic2_bogieModel[38].setRotationPoint(5.6F, -5F, -9F);

		deltic2_bogieModel[39].addBox(0F, 0F, 0F, 10, 3, 5, 0F); // Box 42
		deltic2_bogieModel[39].setRotationPoint(-6F, 11F, -1F);

		deltic2_bogieModel[40].addBox(0F, 0F, 0F, 10, 3, 5, 0F); // Box 43
		deltic2_bogieModel[40].setRotationPoint(-6F, 11F, 11F);

		deltic2_bogieModel[41].addBox(0F, 0F, 0F, 13, 7, 0, 0F); // Box 44
		deltic2_bogieModel[41].setRotationPoint(-7.5F, 9F, 24.2F);

		deltic2_bogieModel[42].addBox(0F, 0F, 0F, 13, 7, 0, 0F); // Box 45
		deltic2_bogieModel[42].setRotationPoint(-7.5F, 9F, -9.2F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 43; i++)
		{
			deltic2_bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo deltic2_bogieModel[];
}