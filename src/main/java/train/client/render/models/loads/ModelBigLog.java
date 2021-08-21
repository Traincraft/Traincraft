//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2021 - 00:43:59
// Last changed on: 07.08.2021 - 00:43:59

package train.client.render.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBigLog extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelBigLog() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // big log

		bodyModel[0].addBox(0F, 0F, 0F, 52, 16, 16, 0F); // big log
		bodyModel[0].setRotationPoint(-26F, -15F, -8F);
	}
}