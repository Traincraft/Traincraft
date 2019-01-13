//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.02.2018 - 18:37:29
// Last changed on: 21.02.2018 - 18:37:29

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelRheingoldBogie extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelRheingoldBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 215, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 228, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 105, 24, textureX, textureY); // Box 34

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(0F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 15
		bodyModel[1].setRotationPoint(-2F, 2F, 12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[2].setRotationPoint(-14F, 2F, -1F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(-8.5F, 3.5F, 11.98F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(5F, 5F, 14F);
		bodyModel[4].rotateAngleY = -3.14159265F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[5].setRotationPoint(-14F, 2F, 12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(-2F, 1F, -1F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 16
		bodyModel[7].setRotationPoint(1F, 1F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[8].setRotationPoint(-2F, 1F, 12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(7F, 1F, 0F);
		bodyModel[9].rotateAngleY = -3.14159265F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(7F, 1F, 13F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-14F, 2F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(18F, 2F, 0F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[13].setRotationPoint(13F, 3F, -1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[14].setRotationPoint(-9F, 3F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 28
		bodyModel[15].setRotationPoint(1F, -1F, 5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[16].setRotationPoint(4F, 1F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 30
		bodyModel[17].setRotationPoint(4F, 1F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[18].setRotationPoint(1F, 1F, 9F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[19].setRotationPoint(1F, 1F, 5F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(12F, 3F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(-10F, 3F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(-7F, 3F, 13F);
		bodyModel[22].rotateAngleY = -3.14159265F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(15F, 3F, 13F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(7F, 2F, 12F);

		bodyModel[25].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 28
		bodyModel[25].setRotationPoint(-2F, 2F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(7F, 2F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-3F, 3F, 12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-3F, 3F, -1F);

		bodyModel[29].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(13.5F, 3.5F, 11.98F);

		bodyModel[30].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-8.5F, 3.5F, 0.02F);

		bodyModel[31].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(13.5F, 3.5F, 0.02F);
	}
}