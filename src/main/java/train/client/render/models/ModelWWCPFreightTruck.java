//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.09.2019 - 20:17:19
// Last changed on: 01.09.2019 - 20:17:19

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWWCPFreightTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWWCPFreightTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 144
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 14
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 144
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18
		bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 10
		bodyModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		bodyModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 18
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 14
		bodyModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 14
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		bodyModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 25
		bodyModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 15
		bodyModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 10
		bodyModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 10
		bodyModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 14
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[42] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 144
		bodyModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 6
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 14
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 15
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 144
		bodyModel[47] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 144
		bodyModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 25
		bodyModel[49] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 18
		bodyModel[50] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 15
		bodyModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 14
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
		bodyModel[53] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 10
		bodyModel[54] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 10
		bodyModel[55] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 18
		bodyModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 14
		bodyModel[57] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 14
		bodyModel[58] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 14
		bodyModel[59] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 25
		bodyModel[60] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 25

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 0
		bodyModel[0].setRotationPoint(-5.5F, 6.5F, -7.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-8F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-8F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 0
		bodyModel[3].setRotationPoint(5.5F, 6.5F, -7.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[4].setRotationPoint(3F, 4F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[5].setRotationPoint(3F, 4F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-1F, 7.75F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-7F, 4F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 15
		bodyModel[8].setRotationPoint(4.5F, 5F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		bodyModel[9].setRotationPoint(-1F, 4.5F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-1F, 4.5F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 23
		bodyModel[11].setRotationPoint(-1F, 4.5F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(0F, 3.5F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		bodyModel[13].setRotationPoint(8F, 4F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 10
		bodyModel[14].setRotationPoint(8F, 5.5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[15].setRotationPoint(5.5F, 5F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(2F, 5F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 144
		bodyModel[17].setRotationPoint(-1F, 5F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(-1F, 5F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.05F, -0.45F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.05F, -0.45F, 0F); // Box 14
		bodyModel[19].setRotationPoint(3.7F, 6.5F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[20].setRotationPoint(6F, 5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 144
		bodyModel[21].setRotationPoint(0F, 5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 144
		bodyModel[22].setRotationPoint(1F, 5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-2F, 5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -2F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.3F, -2.75F, 0F, -0.3F, -2.75F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[24].setRotationPoint(2F, 5.75F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[25].setRotationPoint(-4.5F, 5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[26].setRotationPoint(-5.5F, 5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[27].setRotationPoint(-7F, 5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 10
		bodyModel[28].setRotationPoint(-8F, 4F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 10
		bodyModel[29].setRotationPoint(-8F, 5.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.3F, 0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 0.75F, 0F, -0.3F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -2.75F, 0F); // Box 18
		bodyModel[30].setRotationPoint(-4F, 5.75F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0F, 0.25F, 0F); // Box 14
		bodyModel[31].setRotationPoint(-3.7F, 6.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[32].setRotationPoint(-5.5F, 7.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[33].setRotationPoint(5.5F, 7.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F); // Box 25
		bodyModel[34].setRotationPoint(-2F, 7F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F); // Box 25
		bodyModel[35].setRotationPoint(2F, 7F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[36].setRotationPoint(-7F, 4F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 15
		bodyModel[37].setRotationPoint(4.5F, 5F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		bodyModel[38].setRotationPoint(8F, 4F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 10
		bodyModel[39].setRotationPoint(8F, 5.5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[40].setRotationPoint(5.5F, 5F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[41].setRotationPoint(2F, 5F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[42].setRotationPoint(-1F, 5F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[43].setRotationPoint(-1F, 5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.05F, -0.45F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.05F, -0.45F, 0F); // Box 14
		bodyModel[44].setRotationPoint(3.7F, 6.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[45].setRotationPoint(6F, 5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[46].setRotationPoint(0F, 5F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[47].setRotationPoint(1F, 5F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 25
		bodyModel[48].setRotationPoint(-2F, 5F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -2F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.3F, -2.75F, 0F, -0.3F, -2.75F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[49].setRotationPoint(2F, 5.75F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[50].setRotationPoint(-4.5F, 5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[51].setRotationPoint(-5.5F, 5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[52].setRotationPoint(-7F, 5F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 10
		bodyModel[53].setRotationPoint(-8F, 4F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 10
		bodyModel[54].setRotationPoint(-8F, 5.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.3F, 0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 0.75F, 0F, -0.3F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -2.75F, 0F); // Box 18
		bodyModel[55].setRotationPoint(-4F, 5.75F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0F, 0.25F, 0F); // Box 14
		bodyModel[56].setRotationPoint(-3.7F, 6.5F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[57].setRotationPoint(-5.5F, 7.5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[58].setRotationPoint(5.5F, 7.5F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F); // Box 25
		bodyModel[59].setRotationPoint(-2F, 7F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F); // Box 25
		bodyModel[60].setRotationPoint(2F, 7F, -7F);
	}
}