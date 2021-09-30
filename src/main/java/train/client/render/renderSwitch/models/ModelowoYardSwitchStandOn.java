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

public class ModelowoYardSwitchStandOn extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelowoYardSwitchStandOn() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[31];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 33, 12, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 36, 38, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 15, 38, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 15, 34, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 36, 26, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 53, 28, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 10, 34, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 10, 37, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 42, 56, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 10, 40, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 43, 48, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 50, 37, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 34, 43, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 7, 26, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 43, 4, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 34

		bodyModel[0].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 9F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 0
		bodyModel[1].setRotationPoint(-27F, 9F, 1F);

		bodyModel[2].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-2.5F, -4F, 0F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 3
		bodyModel[3].setRotationPoint(-4F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-4F, 6F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 4
		bodyModel[5].setRotationPoint(-4F, 6F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[6].setRotationPoint(-4F, 4F, -3F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 3
		bodyModel[7].setRotationPoint(-4F, 1F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 3
		bodyModel[8].setRotationPoint(-4F, 1F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[9].setRotationPoint(-4F, 4F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 3
		bodyModel[10].setRotationPoint(-4F, 0F, -2F);

		bodyModel[11].addBox(3.5F, 0F, -1.5F, 1, 7, 1, 0F); // Box 15
		bodyModel[11].setRotationPoint(-2.5F, -3F, 0F);
		bodyModel[11].rotateAngleY = 1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 2
		bodyModel[12].setRotationPoint(-3F, 6F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 2
		bodyModel[13].setRotationPoint(-4F, 8.5F, -0.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 0
		bodyModel[14].setRotationPoint(-4F, 9F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[15].setRotationPoint(-4F, 7.5F, -0.5F);

		bodyModel[16].addShapeBox(-0.75F, 0F, -2.5F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-2.5F, -6F, 0F);
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[17].setRotationPoint(-25F, 9F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(-11F, 9F, -0.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23
		bodyModel[19].setRotationPoint(-14.25F, 8.75F, -1F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24
		bodyModel[20].setRotationPoint(-24.75F, 8.75F, -1F);

		bodyModel[21].addBox(0.5F, 0F, -0.5F, 4, 1, 1, 0F); // Box 25
		bodyModel[21].setRotationPoint(-2.5F, -2F, 0F);
		bodyModel[21].rotateAngleY = 1.57079633F;

		bodyModel[22].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 26
		bodyModel[22].setRotationPoint(-11F, 9F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 27
		bodyModel[23].setRotationPoint(-11F, 9F, -4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 28
		bodyModel[24].setRotationPoint(-9F, 8F, -1F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 29
		bodyModel[25].setRotationPoint(-9F, 9F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 30
		bodyModel[26].setRotationPoint(-9F, 9F, 1F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 31
		bodyModel[27].setRotationPoint(-13F, 11F, -2F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 32
		bodyModel[28].setRotationPoint(-13F, 11F, 1F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 33
		bodyModel[29].setRotationPoint(-14F, 11F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 34
		bodyModel[30].setRotationPoint(-25F, 11F, -4F);
	}
}