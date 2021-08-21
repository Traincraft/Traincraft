//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MixedLogs
// Model Creator: Bida
// Created on: 07.08.2021 - 10:54:17
// Last changed on: 07.08.2021 - 10:54:17

package train.client.render.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMixedLogs extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMixedLogs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 199 W2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 W1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 47 W3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 48 W10
		bodyModel[4] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 49 W4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 50 W7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 51 W9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 52 W6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 53 W8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 54 W11
		bodyModel[10] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 55 W5
		bodyModel[11] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 56 W12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 57 W13

		bodyModel[0].addBox(0F, 0F, 0F, 55, 3, 3, 0F); // Box 199 W2
		bodyModel[0].setRotationPoint(-27F, -1F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 57, 6, 6, 0F); // Box 46 W1
		bodyModel[1].setRotationPoint(-28F, -4F, 1F);

		bodyModel[2].addBox(0F, -2F, -2F, 47, 4, 4, 0F); // Box 47 W3
		bodyModel[2].setRotationPoint(-24F, -1F, -1F);
		bodyModel[2].rotateAngleX = 0.45378561F;

		bodyModel[3].addBox(0F, -1.5F, -1.5F, 50, 3, 3, 0F); // Box 48 W10
		bodyModel[3].setRotationPoint(-25F, -5.5F, 7F);
		bodyModel[3].rotateAngleX = 0.99483767F;

		bodyModel[4].addBox(0F, -1F, -1F, 47, 2, 2, 0F); // Box 49 W4
		bodyModel[4].setRotationPoint(-24F, 0F, 8F);

		bodyModel[5].addBox(0F, -2F, -2F, 51, 4, 4, 0F); // Box 50 W7
		bodyModel[5].setRotationPoint(-26F, -3F, -6.25F);
		bodyModel[5].rotateAngleX = -1.09955743F;

		bodyModel[6].addBox(0F, -3F, -3F, 49, 6, 6, 0F); // Box 51 W9
		bodyModel[6].setRotationPoint(-24F, -7F, -1.25F);
		bodyModel[6].rotateAngleX = -0.2268928F;
		bodyModel[6].rotateAngleY = -0.03490659F;

		bodyModel[7].addBox(0F, -1F, -1F, 52, 2, 2, 0F); // Box 52 W6
		bodyModel[7].setRotationPoint(-26F, -2F, 8F);

		bodyModel[8].addBox(0F, -1F, -1F, 52, 2, 2, 0F); // Box 53 W8
		bodyModel[8].setRotationPoint(-26F, -5F, 2.5F);
		bodyModel[8].rotateAngleY = 0.03490659F;

		bodyModel[9].addBox(0F, -2F, -2F, 53, 4, 4, 0F); // Box 54 W11
		bodyModel[9].setRotationPoint(-27F, -8F, 4F);

		bodyModel[10].addBox(0F, -1F, -1F, 50, 2, 2, 0F); // Box 55 W5
		bodyModel[10].setRotationPoint(-24F, -0.5F, -8F);
		bodyModel[10].rotateAngleX = -0.80285146F;

		bodyModel[11].addBox(0F, -1.5F, -1.5F, 53, 3, 3, 0F); // Box 56 W12
		bodyModel[11].setRotationPoint(-25F, -6.5F, -7F);
		bodyModel[11].rotateAngleX = 2.00712864F;

		bodyModel[12].addBox(0F, -1F, -1F, 54, 2, 2, 0F); // Box 57 W13
		bodyModel[12].setRotationPoint(-28F, -9F, -5.5F);
		bodyModel[12].rotateAngleX = 0.64577182F;
		bodyModel[12].rotateAngleY = -0.01745329F;
	}
}