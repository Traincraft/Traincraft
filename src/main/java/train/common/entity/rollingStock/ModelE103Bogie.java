//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.02.2018 - 18:37:29
// Last changed on: 21.02.2018 - 18:37:29

package train.common.entity.rollingStock; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelE103Bogie extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelE103Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 89, 3, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 121, 3, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 50, 29, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 50, 25, textureX, textureY); // Box 36
		bodyModel[9] = new ModelRendererTurbo(this, 203, 14, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, -1, 15, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[0].setRotationPoint(-12F, 1F, -8F);

		bodyModel[1].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[1].setRotationPoint(11.5F, 3.5F, 4.98F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[2].setRotationPoint(-12F, 3F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(16F, 3F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[4].setRotationPoint(11F, 3F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[5].setRotationPoint(-7F, 3F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 28
		bodyModel[6].setRotationPoint(1F, -1F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[7].setRotationPoint(-9F, 2.99F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[8].setRotationPoint(14F, 2.99F, 6F);
		bodyModel[8].rotateAngleY = -3.14159265F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(7F, 1F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 2, 14, 0F); // Box 28
		bodyModel[10].setRotationPoint(-2F, 1F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[11].setRotationPoint(-5F, 3F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[12].setRotationPoint(13F, 3F, 5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[13].setRotationPoint(13F, 3F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[14].setRotationPoint(-8F, 3F, -7F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[15].setRotationPoint(-8F, 3F, 6F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(-6.5F, 3.5F, 4.98F);

		bodyModel[17].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(11.5F, 3.5F, -6.98F);

		bodyModel[18].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(-6.5F, 3.5F, -6.98F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 32
		bodyModel[19].setRotationPoint(2F, 3F, -8F);

		bodyModel[20].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(2.5F, 3.5F, -6.98F);

		bodyModel[21].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(2.5F, 3.5F, 4.98F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(4F, 3F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-5F, 3F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[24].setRotationPoint(4F, 3F, -8F);
	}
}