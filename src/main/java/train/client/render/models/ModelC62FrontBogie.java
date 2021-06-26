//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.06.2018 - 16:00:28
// Last changed on: 04.06.2018 - 16:00:28

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelC62FrontBogie extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelC62FrontBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 69
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 75

		bodyModel[0].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[0].setRotationPoint(3F, 6F, -6.05F);

		bodyModel[1].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 2
		bodyModel[1].setRotationPoint(21F, 6F, -6.05F);

		bodyModel[2].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 58
		bodyModel[2].setRotationPoint(3F, 6F, 6.05F);

		bodyModel[3].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 69
		bodyModel[3].setRotationPoint(21F, 6F, 6.05F);

		bodyModel[4].addBox(0F, 0F, 0F, 23, 4, 12, 0F); // Box 75
		bodyModel[4].setRotationPoint(0F, 4F, -6F);
	}
}