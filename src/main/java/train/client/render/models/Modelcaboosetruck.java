//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.05.2020 - 18:37:44
// Last changed on: 15.05.2020 - 18:37:44

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelcaboosetruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelcaboosetruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[39];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 26
		bodyModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 26
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 26

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(1F, -4.5F, 5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, -4F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-6F, -4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-5F, -4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 14
		bodyModel[4].setRotationPoint(-5F, -3F, -2F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16
		bodyModel[5].setRotationPoint(-4F, -2F, 0F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 22
		bodyModel[6].setRotationPoint(7F, -3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[7].setRotationPoint(-5F, -3F, -2.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[8].setRotationPoint(-3F, -3F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[9].setRotationPoint(0F, -1F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 27
		bodyModel[10].setRotationPoint(4F, -3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[11].setRotationPoint(1F, -2F, -2.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-3F, -2F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(6F, -2F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31
		bodyModel[14].setRotationPoint(7F, -3F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[15].setRotationPoint(9F, -4F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 33
		bodyModel[16].setRotationPoint(-5F, -4F, 13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[17].setRotationPoint(-6F, -4F, 13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(-3F, -3F, 13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36
		bodyModel[19].setRotationPoint(-5F, -3F, 13.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 38
		bodyModel[20].setRotationPoint(4F, -3F, 13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39
		bodyModel[21].setRotationPoint(7F, -3F, 13.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[22].setRotationPoint(9F, -4F, 13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(6F, -2F, 13.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[24].setRotationPoint(-3F, -2F, 13.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 43
		bodyModel[25].setRotationPoint(1F, -3F, 12.5F);

		bodyModel[26].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44
		bodyModel[26].setRotationPoint(8F, -2F, 0F);

		bodyModel[27].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45
		bodyModel[27].setRotationPoint(8F, -2F, 12F);

		bodyModel[28].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[28].setRotationPoint(-4F, -2F, 12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[29].setRotationPoint(1F, -2F, 12.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[30].setRotationPoint(1F, -3F, -2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[31].setRotationPoint(1F, -2F, 10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[32].setRotationPoint(1F, -3F, 10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 43
		bodyModel[33].setRotationPoint(1F, -3F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[34].setRotationPoint(1F, -2F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[35].setRotationPoint(0F, -3F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[36].setRotationPoint(3F, -3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[37].setRotationPoint(0F, -3F, 13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[38].setRotationPoint(3F, -3F, 13F);
	}
}