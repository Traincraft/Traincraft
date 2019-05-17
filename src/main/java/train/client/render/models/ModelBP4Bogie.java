//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.01.2019 - 10:43:19
// Last changed on: 14.01.2019 - 10:43:19

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBP4Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4Bogie()
	{
		bp4bogieModel = new ModelRendererTurbo[50];
		bp4bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		bp4bogieModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 124 wheel
		bp4bogieModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 125 wheel
		bp4bogieModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 126 wheel
		bp4bogieModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 127 wheel
		bp4bogieModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 128
		bp4bogieModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 129
		bp4bogieModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 130
		bp4bogieModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 133
		bp4bogieModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 134
		bp4bogieModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 136
		bp4bogieModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 137
		bp4bogieModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 138
		bp4bogieModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 32
		bp4bogieModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 32
		bp4bogieModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 33
		bp4bogieModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		bp4bogieModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 59
		bp4bogieModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 36 texture optional
		bp4bogieModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 37
		bp4bogieModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 38
		bp4bogieModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 39
		bp4bogieModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 40
		bp4bogieModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 41
		bp4bogieModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 42
		bp4bogieModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 43
		bp4bogieModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 44
		bp4bogieModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 45
		bp4bogieModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 46
		bp4bogieModel[29] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 47
		bp4bogieModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
		bp4bogieModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 49
		bp4bogieModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		bp4bogieModel[33] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 51
		bp4bogieModel[34] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 52
		bp4bogieModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 36
		bp4bogieModel[36] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 37
		bp4bogieModel[37] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		bp4bogieModel[38] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 39
		bp4bogieModel[39] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 40 texture optional
		bp4bogieModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 41
		bp4bogieModel[41] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 42
		bp4bogieModel[42] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 43
		bp4bogieModel[43] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 44
		bp4bogieModel[44] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 45
		bp4bogieModel[45] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 46
		bp4bogieModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 47 texture optional
		bp4bogieModel[47] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 48 texture optional
		bp4bogieModel[48] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 49 traction motor
		bp4bogieModel[49] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 50 traction motor

		bp4bogieModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 122
		bp4bogieModel[0].setRotationPoint(-6.5F, 2.5F, 2.5F);

		bp4bogieModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 124 wheel
		bp4bogieModel[1].setRotationPoint(7.5F, 3.5F, 4F);

		bp4bogieModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 125 wheel
		bp4bogieModel[2].setRotationPoint(-5.5F, 3.5F, 4F);

		bp4bogieModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 126 wheel
		bp4bogieModel[3].setRotationPoint(-5.5F, 3.5F, 16F);

		bp4bogieModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 127 wheel
		bp4bogieModel[4].setRotationPoint(7.5F, 3.5F, 16F);

		bp4bogieModel[5].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 128
		bp4bogieModel[5].setRotationPoint(-9F, 1F, 3F);

		bp4bogieModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 129
		bp4bogieModel[6].setRotationPoint(-9F, 2F, 3F);

		bp4bogieModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		bp4bogieModel[7].setRotationPoint(-7.5F, 3F, 3F);

		bp4bogieModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bp4bogieModel[8].setRotationPoint(-4.5F, 3F, 3F);

		bp4bogieModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		bp4bogieModel[9].setRotationPoint(-1F, 1F, 3F);

		bp4bogieModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		bp4bogieModel[10].setRotationPoint(-1F, 5F, 2.5F);

		bp4bogieModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
		bp4bogieModel[11].setRotationPoint(2F, 1F, 3F);

		bp4bogieModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 138
		bp4bogieModel[12].setRotationPoint(0F, 4.5F, 2F);

		bp4bogieModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bp4bogieModel[13].setRotationPoint(0F, 3.5F, 3F);

		bp4bogieModel[14].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 32
		bp4bogieModel[14].setRotationPoint(-2.5F, 1F, 4F);

		bp4bogieModel[15].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 33
		bp4bogieModel[15].setRotationPoint(-6F, 2F, 3F);

		bp4bogieModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bp4bogieModel[16].setRotationPoint(8F, 2F, 3F);

		bp4bogieModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bp4bogieModel[17].setRotationPoint(-5.5F, 0.5F, 2.5F);

		bp4bogieModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36 texture optional
		bp4bogieModel[18].setRotationPoint(5.5F, 0.5F, 2.5F);

		bp4bogieModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		bp4bogieModel[19].setRotationPoint(5.5F, 3F, 3F);

		bp4bogieModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bp4bogieModel[20].setRotationPoint(8.5F, 3F, 3F);

		bp4bogieModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bp4bogieModel[21].setRotationPoint(-7.5F, 0F, 3F);

		bp4bogieModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bp4bogieModel[22].setRotationPoint(5.5F, 0F, 3F);

		bp4bogieModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bp4bogieModel[23].setRotationPoint(-2F, 0F, 3F);

		bp4bogieModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bp4bogieModel[24].setRotationPoint(-2F, 0F, 16F);

		bp4bogieModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bp4bogieModel[25].setRotationPoint(-7.5F, 0F, 16F);

		bp4bogieModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bp4bogieModel[26].setRotationPoint(5.5F, 0F, 16F);

		bp4bogieModel[27].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 45
		bp4bogieModel[27].setRotationPoint(-9F, 1F, 16F);

		bp4bogieModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bp4bogieModel[28].setRotationPoint(8F, 2F, 16F);

		bp4bogieModel[29].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 47
		bp4bogieModel[29].setRotationPoint(-6F, 2F, 16F);

		bp4bogieModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 48
		bp4bogieModel[30].setRotationPoint(-9F, 2F, 16F);

		bp4bogieModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 49
		bp4bogieModel[31].setRotationPoint(-7.5F, 3F, 16F);

		bp4bogieModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bp4bogieModel[32].setRotationPoint(-4.5F, 3F, 16F);

		bp4bogieModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 51
		bp4bogieModel[33].setRotationPoint(5.5F, 3F, 16F);

		bp4bogieModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bp4bogieModel[34].setRotationPoint(8.5F, 3F, 16F);

		bp4bogieModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bp4bogieModel[35].setRotationPoint(-1F, 1F, 16F);

		bp4bogieModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bp4bogieModel[36].setRotationPoint(0F, 3.5F, 10F);

		bp4bogieModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 38
		bp4bogieModel[37].setRotationPoint(2F, 1F, 16F);

		bp4bogieModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bp4bogieModel[38].setRotationPoint(-1F, 5F, 16.5F);

		bp4bogieModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40 texture optional
		bp4bogieModel[39].setRotationPoint(5.5F, 0.5F, 17F);

		bp4bogieModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bp4bogieModel[40].setRotationPoint(-5.5F, 0.5F, 17F);

		bp4bogieModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 42
		bp4bogieModel[41].setRotationPoint(-6F, 3F, 2.5F);

		bp4bogieModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bp4bogieModel[42].setRotationPoint(6.5F, 2.5F, 2.5F);

		bp4bogieModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 44
		bp4bogieModel[43].setRotationPoint(7F, 3F, 2.5F);

		bp4bogieModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 45
		bp4bogieModel[44].setRotationPoint(6.5F, 2.5F, 16F);

		bp4bogieModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 46
		bp4bogieModel[45].setRotationPoint(-6.5F, 2.5F, 16F);

		bp4bogieModel[46].addShapeBox(0F, -3F, 0F, 1, 3, 0, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 47 texture optional
		bp4bogieModel[46].setRotationPoint(7F, 3.5F, 2.15F);
		bp4bogieModel[46].rotateAngleX = -0.27925268F;

		bp4bogieModel[47].addShapeBox(0F, -3F, 0F, 1, 3, 0, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 48 texture optional
		bp4bogieModel[47].setRotationPoint(7F, 3.5F, 17.85F);
		bp4bogieModel[47].rotateAngleX = 0.27925268F;

		bp4bogieModel[48].addBox(0F, 0F, 0F, 5, 4, 10, 0F); // Box 49 traction motor
		bp4bogieModel[48].setRotationPoint(-7F, 1F, 5F);

		bp4bogieModel[49].addBox(0F, 0F, 0F, 5, 4, 10, 0F); // Box 50 traction motor
		bp4bogieModel[49].setRotationPoint(4F, 1F, 5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 50; i++)
		{
			bp4bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bp4bogieModel[];
}