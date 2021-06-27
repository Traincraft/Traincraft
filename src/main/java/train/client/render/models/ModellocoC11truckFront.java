//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.06.2021 - 14:26:11
// Last changed on: 06.06.2021 - 14:26:11

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModellocoC11truckFront extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModellocoC11truckFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 336
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 428
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 429
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 430

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 3
		bodyModel[0].setRotationPoint(-6F, 4F, -5.05F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 336
		bodyModel[1].setRotationPoint(-6F, 4F, 5.04999999999999F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 428
		bodyModel[2].setRotationPoint(-4F, 6F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 429
		bodyModel[3].setRotationPoint(-5F, 5F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 10, 1, 4, 0F); // Box 430
		bodyModel[4].setRotationPoint(-5F, 4F, -2F);
	}
}