//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.10.2018 - 18:40:30
// Last changed on: 01.10.2018 - 18:40:30

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelD51FrontBogie extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelD51FrontBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 106
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 107
		bodyModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 143

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 94
		bodyModel[0].setRotationPoint(-90F, 3F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 106
		bodyModel[1].setRotationPoint(-89F, 4F, -6.05F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 107
		bodyModel[2].setRotationPoint(-89F, 4F, 6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 143
		bodyModel[3].setRotationPoint(-88F, 3F, -2F);
	}
}