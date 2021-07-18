//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.11.2020 - 16:21:37
// Last changed on: 01.11.2020 - 16:21:37

package train.client.render.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelwrappedwood extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelwrappedwood() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 7, 8, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 17, 5, 8, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8.5F, -2.5F, -4F);
	}
}