//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.10.2020 - 12:47:57
// Last changed on: 18.10.2020 - 12:47:57

package train.client.render.renderSwitch.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelowoSwitchStandOff extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelowoSwitchStandOff() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 80, 9, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3
		bodyModel[12] = new ModelRendererTurbo(this, 56, 16, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 77, 22, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34

		bodyModel[0].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 9F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-27F, 9F, 2F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(2F, -9F, -0.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 3
		bodyModel[3].setRotationPoint(1F, 5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[4].setRotationPoint(1F, 6F, 2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[5].setRotationPoint(1F, 6F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[6].setRotationPoint(1F, 4F, -3F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 3
		bodyModel[7].setRotationPoint(1F, -3F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 3
		bodyModel[8].setRotationPoint(1F, -3F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[9].setRotationPoint(1F, 4F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 3
		bodyModel[10].setRotationPoint(0.5F, -4F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[11].setRotationPoint(1.5F, -5F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(2F, -6F, -3.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 15
		bodyModel[13].setRotationPoint(2F, -4F, -3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 2
		bodyModel[14].setRotationPoint(2F, 6F, -0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 2
		bodyModel[15].setRotationPoint(1F, 8.5F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(1F, 9F, -2F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[17].setRotationPoint(1F, 7.5F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(2.5F, -19F, -0.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 2
		bodyModel[19].setRotationPoint(2F, -21F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(1.5F, -19F, -3.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[21].setRotationPoint(-25F, 9F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(-11F, 9F, -0.5F);
	}
}