//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.05.2022 - 16:32:46
// Last changed on: 29.05.2022 - 16:32:46

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Modelasteri extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelasteri() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 4
		bodyModel[9] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 44, 5, 10, 0F); // Box 0
		bodyModel[0].setRotationPoint(-5F, 3F, -3F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 7, 12, 0F); // Box 0
		bodyModel[1].setRotationPoint(8F, 3F, -4F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 12, 0F); // Box 0
		bodyModel[2].setRotationPoint(19F, 3F, -4F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 12, 0F); // Box 0
		bodyModel[3].setRotationPoint(33F, 5F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 52, 1, 22, 0F); // Box 4
		bodyModel[4].setRotationPoint(-10F, 2F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 4
		bodyModel[5].setRotationPoint(-10F, 3F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 4
		bodyModel[6].setRotationPoint(41F, 3F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 33, 10, 10, 0F); // Box 4
		bodyModel[7].setRotationPoint(-4F, -13F, 2F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addBox(0F, 0F, 0F, 29, 10, 6, 0F); // Box 4
		bodyModel[8].setRotationPoint(-3F, -8F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 29, 10, 6, 0F); // Box 4
		bodyModel[9].setRotationPoint(-3F, -8F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 21, 22, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[10].setRotationPoint(26F, -19F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 4
		bodyModel[11].setRotationPoint(0F, -20F, 2F);
		bodyModel[11].rotateAngleY = -0.78539816F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 4
		bodyModel[12].setRotationPoint(8F, -15F, 2F);
		bodyModel[12].rotateAngleY = -0.78539816F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 4
		bodyModel[13].setRotationPoint(15F, -15F, 2F);
		bodyModel[13].rotateAngleY = -0.78539816F;

		bodyModel[14].addBox(0F, 0F, 0F, 5, 5, 12, 0F); // Box 0
		bodyModel[14].setRotationPoint(-3F, 5F, -4F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 0
		bodyModel[15].setRotationPoint(-5F, 3F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[16].setRotationPoint(0F, 4F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[17].setRotationPoint(0F, 3F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[18].setRotationPoint(0F, 5F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 0
		bodyModel[19].setRotationPoint(1F, 3F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[20].setRotationPoint(4F, 4F, -7F);
		bodyModel[20].rotateAngleZ = -0.19198622F;

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[21].setRotationPoint(24F, 8F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 0
		bodyModel[22].setRotationPoint(12F, 8F, -5F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 0
		bodyModel[23].setRotationPoint(-5F, 3F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[24].setRotationPoint(0F, 4F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[25].setRotationPoint(0F, 3F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[26].setRotationPoint(0F, 5F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 0
		bodyModel[27].setRotationPoint(1F, 3F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[28].setRotationPoint(4F, 4F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[29].setRotationPoint(22F, 4F, 9F);

		bodyModel[30].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(9F, 4F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 0
		bodyModel[31].setRotationPoint(-13F, 3F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 0
		bodyModel[32].setRotationPoint(-13F, 3F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 0
		bodyModel[33].setRotationPoint(42F, 3F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 0
		bodyModel[34].setRotationPoint(42F, 3F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[35].setRotationPoint(-9F, 0F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[36].setRotationPoint(-9F, 0F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[37].setRotationPoint(-9F, 0F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[38].setRotationPoint(-4F, -15F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 21, 22, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(35F, -19F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 13, 22, 0F); // Box 4
		bodyModel[40].setRotationPoint(36F, -11F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 4
		bodyModel[41].setRotationPoint(26F, -20F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(26F, -12F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 4
		bodyModel[43].setRotationPoint(26F, -12F, 12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 8, 14, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[44].setRotationPoint(26F, -6F, -5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[45].setRotationPoint(40F, -13F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 60, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -54F, 0F, 0F, -54F, 0F, 0F, -54F, -54F, 0F, -54F, -54F); // Box 0
		bodyModel[46].setRotationPoint(-5F, -9F, -1F);
	}
}