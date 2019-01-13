//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.06.2018 - 20:20:16
// Last changed on: 05.06.2018 - 20:20:16

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelC62TenderBogie extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelC62TenderBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29

		bodyModel[0].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-13F, 4F, -6F);

		bodyModel[1].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 2
		bodyModel[1].setRotationPoint(-27F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 3
		bodyModel[2].setRotationPoint(-33F, 1F, -6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 4
		bodyModel[3].setRotationPoint(-33F, 1F, 6.05F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 8
		bodyModel[4].setRotationPoint(-8F, 1F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 9
		bodyModel[5].setRotationPoint(-33F, 1F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 18
		bodyModel[6].setRotationPoint(-28F, 3F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 6, 12, 0F); // Box 19
		bodyModel[7].setRotationPoint(-22F, 3F, -6F);

		bodyModel[8].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 24
		bodyModel[8].setRotationPoint(-27F, 4F, 6F);

		bodyModel[9].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 25
		bodyModel[9].setRotationPoint(-13F, 4F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 29
		bodyModel[10].setRotationPoint(-14F, 3F, -6F);
	}
}