//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.06.2018 - 16:12:21
// Last changed on: 04.06.2018 - 16:12:21

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelC62RearBogie extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelC62RearBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 52
		bodyModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 72
		bodyModel[6] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 76
		bodyModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 111
		bodyModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 112

		bodyModel[0].addBox(0F, 0F, 0F, 1, 4, 16, 0F); // Box 7
		bodyModel[0].setRotationPoint(0F, 2F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 17, 7, 1, 0F); // Box 20
		bodyModel[1].setRotationPoint(-17F, 2F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 17, 7, 1, 0F); // Box 22
		bodyModel[2].setRotationPoint(-17F, 2F, 7F);

		bodyModel[3].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 50
		bodyModel[3].setRotationPoint(-4F, 4F, -6.05F);

		bodyModel[4].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 52
		bodyModel[4].setRotationPoint(-13F, 4F, -6.05F);

		bodyModel[5].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 72
		bodyModel[5].setRotationPoint(-13F, 4F, 6.05F);

		bodyModel[6].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 73
		bodyModel[6].setRotationPoint(-4F, 4F, 6.05F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 4, 16, 0F); // Box 76
		bodyModel[7].setRotationPoint(-18F, 2F, -8F);

		bodyModel[8].addBox(-1F, -1F, 0F, 2, 2, 12, 0F); // Box 111
		bodyModel[8].setRotationPoint(-13F, 4F, -6F);

		bodyModel[9].addBox(-1F, -1F, 0F, 2, 2, 12, 0F); // Box 112
		bodyModel[9].setRotationPoint(-4F, 4F, -6F);
	}
}