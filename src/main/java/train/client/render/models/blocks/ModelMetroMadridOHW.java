//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.05.2022 - 12:00:51
// Last changed on: 15.05.2022 - 12:00:51

package train.client.render.models.blocks;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMetroMadridOHW extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelMetroMadridOHW() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 58

		bodyModel[0].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -6F, 7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, -2F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.9F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, -1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F); // Box 14
		bodyModel[2].setRotationPoint(-0.5F, 5.42F, 9.85F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 19
		bodyModel[3].setRotationPoint(-0.0499999999999998F, 6.4F, 14.55F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 20
		bodyModel[4].setRotationPoint(0F, 6.8F, 16.55F);
		bodyModel[4].rotateAngleY = -1.57079633F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 22
		bodyModel[5].setRotationPoint(0.35F, 6.6F, 16.55F);
		bodyModel[5].rotateAngleY = -1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-0.0499999999999998F, 6.2F, 15.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(0F, -6F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(0F, 5.7F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F); // Box 11
		bodyModel[9].setRotationPoint(0F, 5.7F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(0F, 5.7F, 21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(0F, 5.7F, 22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(0F, 0F, 23F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 16
		bodyModel[13].setRotationPoint(0F, -6F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(0F, -2F, -23F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.9F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, -1F, 0F, -0.9F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.9F, 0.1F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-0.5F, 5.42F, -21.15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-0.0499999999999998F, 6.4F, -17.45F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 20
		bodyModel[17].setRotationPoint(0F, 6.8F, -15.45F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 21
		bodyModel[18].setRotationPoint(0.35F, 6.6F, -15.45F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-0.0499999999999998F, 6.2F, -16.95F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 46, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(0F, 4F, -23F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(0F, 5.7F, -23F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F); // Box 25
		bodyModel[22].setRotationPoint(0F, 5.7F, -22F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(0F, 5.7F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(0F, 5.7F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(0F, 0F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(0F, 6.75F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 32
		bodyModel[27].setRotationPoint(0F, 6F, -4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[28].setRotationPoint(0F, 7F, -4.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 34
		bodyModel[29].setRotationPoint(0F, 7F, -2.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		bodyModel[30].setRotationPoint(0F, 6F, -2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 36
		bodyModel[31].setRotationPoint(0F, 7F, 1.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[32].setRotationPoint(0F, 6F, 1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 38
		bodyModel[33].setRotationPoint(0F, 7F, 3.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 39
		bodyModel[34].setRotationPoint(0F, 6F, 3.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 57
		bodyModel[35].setRotationPoint(0.35F, 6F, -15.45F);
		bodyModel[35].rotateAngleY = -1.57079633F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 58
		bodyModel[36].setRotationPoint(0.35F, 6F, 16.55F);
		bodyModel[36].rotateAngleY = -1.57079633F;
	}
}