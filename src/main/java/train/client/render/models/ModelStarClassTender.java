//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.08.2019 - 17:09:13
// Last changed on: 04.08.2019 - 17:09:13

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelStarClassTender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStarClassTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 118
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 119
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 120
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 121
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 122
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 124
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 125
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 127
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 129
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 131
		bodyModel[13] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 132
		bodyModel[14] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 133
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 5
		bodyModel[34] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 16
		bodyModel[35] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 21
		bodyModel[37] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 42

		bodyModel[0].addBox(0F, 0F, 0F, 22, 4, 18, 0F); // Box 116
		bodyModel[0].setRotationPoint(-11F, 0F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 117
		bodyModel[1].setRotationPoint(-12F, 1F, -0.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 7, 16, 0F); // Box 118
		bodyModel[2].setRotationPoint(10F, -7F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 19, 7, 1, 0F); // Box 119
		bodyModel[3].setRotationPoint(-9F, -7F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 19, 7, 1, 0F); // Box 120
		bodyModel[4].setRotationPoint(-9F, -7F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 121
		bodyModel[5].setRotationPoint(-10F, -7F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 122
		bodyModel[6].setRotationPoint(-10F, -7F, 3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 124
		bodyModel[7].setRotationPoint(-10F, -7F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[8].setRotationPoint(-10F, -7F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 20, 3, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[9].setRotationPoint(-9F, -9F, 10F);
		bodyModel[9].rotateAngleX = -0.78539816F;

		bodyModel[10].addBox(0F, 0F, 0F, 0, 3, 16, 0F); // Box 128
		bodyModel[10].setRotationPoint(13F, -9F, -8F);
		bodyModel[10].rotateAngleZ = -0.78539816F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -2F, -0.15F, 0F, -2F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 129
		bodyModel[11].setRotationPoint(11F, -9F, 10F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -2F, 0F, -0.15F, -2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 131
		bodyModel[12].setRotationPoint(13F, -9F, -10F);
		bodyModel[12].rotateAngleZ = -0.78539816F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -2F, -0.15F, 0F, -2F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 132
		bodyModel[13].setRotationPoint(11F, -9F, -10F);
		bodyModel[13].rotateAngleX = 0.78539816F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 3, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[14].setRotationPoint(-9F, -9F, -10F);
		bodyModel[14].rotateAngleX = 0.78539816F;

		bodyModel[15].addBox(0F, 0F, 0F, 19, 7, 14, 0F); // Box 15
		bodyModel[15].setRotationPoint(-9F, -6F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -2F, 0F, -0.15F, -2F); // Box 16
		bodyModel[16].setRotationPoint(13F, -9F, 8F);
		bodyModel[16].rotateAngleZ = -0.78539816F;

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 13
		bodyModel[17].setRotationPoint(-6F, 7F, 6F);

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 35
		bodyModel[18].setRotationPoint(-6F, 7F, -6F);

		bodyModel[19].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 46
		bodyModel[19].setRotationPoint(-6F, 7F, -7F);

		bodyModel[20].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 20
		bodyModel[20].setRotationPoint(6F, 7F, 6F);

		bodyModel[21].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 21
		bodyModel[21].setRotationPoint(6F, 7F, -6F);

		bodyModel[22].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 22
		bodyModel[22].setRotationPoint(6F, 7F, -7F);

		bodyModel[23].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-9F, 4.5F, -7F);

		bodyModel[24].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-5F, 4.5F, -7F);

		bodyModel[25].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 25
		bodyModel[25].setRotationPoint(7F, 4.5F, -7F);

		bodyModel[26].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F); // Box 26
		bodyModel[26].setRotationPoint(3F, 4.5F, -7F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-5F, 4.5F, 6F);

		bodyModel[28].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-9F, 4.5F, 6F);

		bodyModel[29].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F); // Box 29
		bodyModel[29].setRotationPoint(3F, 4.5F, 6F);

		bodyModel[30].addShapeBox(-0.5F, -0.5F, 0F, 3, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 30
		bodyModel[30].setRotationPoint(7F, 4.5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-6.5F, 4F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[32].setRotationPoint(5.5F, 4F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[33].setRotationPoint(14.5F, 0F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[34].setRotationPoint(14.5F, 0F, 6F);

		bodyModel[35].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[35].setRotationPoint(11F, 1.5F, 7.5F);
		bodyModel[35].rotateAngleX = 0.78539816F;

		bodyModel[36].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[36].setRotationPoint(11F, 1.5F, -7.5F);
		bodyModel[36].rotateAngleX = 0.78539816F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(11F, 1F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(13F, 2F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(14F, 1F, -0.5F);
	}
}