//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2020 - 12:40:45
// Last changed on: 20.12.2020 - 12:40:45

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPE_Loco_RearTruck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPE_Loco_RearTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 37
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
		bodyModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 37

		bodyModel[0].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 27
		bodyModel[0].setRotationPoint(-6.5F, 6F, -5.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 27
		bodyModel[1].setRotationPoint(-6.5F, 6F, 5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[2].setRotationPoint(1.5F, 5F, -5.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[3].setRotationPoint(1.5F, 5F, 5.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 37
		bodyModel[4].setRotationPoint(-5.5F, 7F, -6.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 37
		bodyModel[5].setRotationPoint(3F, 6.5F, -6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 37
		bodyModel[6].setRotationPoint(-8F, 7F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 37
		bodyModel[7].setRotationPoint(7F, 7F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 37
		bodyModel[8].setRotationPoint(-7F, 5.5F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 37
		bodyModel[9].setRotationPoint(-7F, 5.5F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 37
		bodyModel[10].setRotationPoint(-8.5F, 6F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 37
		bodyModel[11].setRotationPoint(3F, 6.5F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[12].setRotationPoint(3F, 6.5F, -8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 37
		bodyModel[13].setRotationPoint(3F, 6.5F, 6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[14].setRotationPoint(3F, 6.5F, 7.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 37
		bodyModel[15].setRotationPoint(-5.5F, 7F, -7.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[16].setRotationPoint(-5.5F, 7F, -8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 37
		bodyModel[17].setRotationPoint(-5.5F, 7F, 6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[18].setRotationPoint(-5.5F, 7F, 7.5F);
	}
}