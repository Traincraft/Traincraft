//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.11.2018 - 13:33:34
// Last changed on: 11.11.2018 - 13:33:34

package train.client.render.renderSwitch.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModeloverheadWireDouble extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModeloverheadWireDouble() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 15
		bodyModel[17] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 97, 3, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 42, 1, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 42, 1, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 97, 3, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 42

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 50, 1, 0F,0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-1F, -42F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, 3F, -1F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 3
		bodyModel[2].setRotationPoint(-1F, -3F, -1F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-1F, -9F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 5
		bodyModel[4].setRotationPoint(-1F, -15F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
		bodyModel[5].setRotationPoint(-1F, -21F, -1F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 7
		bodyModel[6].setRotationPoint(-1F, -57F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 8F, -2F); // Box 8
		bodyModel[7].setRotationPoint(-0.5F, -38F, -47F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[8].setRotationPoint(-0.5F, -39F, -56F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-0.5F, -39F, -60F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[10].setRotationPoint(-0.5F, -30F, -60F);
		bodyModel[10].rotateAngleX = 1.57079633F;

		bodyModel[11].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 12
		bodyModel[11].setRotationPoint(-0.5F, -31F, -59F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 13
		bodyModel[12].setRotationPoint(-1F, -41.5F, -53F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 14
		bodyModel[13].setRotationPoint(-0.5F, -41F, -50F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(-0.5F, -41F, -54F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 16
		bodyModel[15].setRotationPoint(-2F, 8F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.8F, 0F, 4F); // Box 15
		bodyModel[16].setRotationPoint(-1F, -38.5F, -49F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 50, 1, 0F,0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-1F, -42F, 1F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 19
		bodyModel[18].setRotationPoint(-1F, -27F, -1F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 20
		bodyModel[19].setRotationPoint(-1F, -33F, -1F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 21
		bodyModel[20].setRotationPoint(-1F, -39F, -1F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 58, 0F); // Box 22
		bodyModel[21].setRotationPoint(-1F, -44F, -60F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 32
		bodyModel[22].setRotationPoint(-1F, -45F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -8F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[23].setRotationPoint(-0.5F, -38F, -36F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 4F, -0.8F, -0.8F, 4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.8F, 0F, 4F); // Box 35
		bodyModel[24].setRotationPoint(-1F, -38.5F, -39F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 36
		bodyModel[25].setRotationPoint(-0.5F, -39F, -25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 37
		bodyModel[26].setRotationPoint(-0.5F, -39F, -16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(-0.5F, -30F, -11F);
		bodyModel[27].rotateAngleX = 1.57079633F;

		bodyModel[28].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 39
		bodyModel[28].setRotationPoint(-0.5F, -31F, -18F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 40
		bodyModel[29].setRotationPoint(-0.5F, -41F, -17F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 41
		bodyModel[30].setRotationPoint(-1F, -41.5F, -20F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 42
		bodyModel[31].setRotationPoint(-0.5F, -41F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-1F, -37F, -37F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 45F, -0.8F, 13.2F, 45F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 45F, -0.8F, -14F, 45F); // Box 45
		bodyModel[33].setRotationPoint(-1.8F, -45.5F, -59F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 46
		bodyModel[34].setRotationPoint(-1F, -61F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 45F, -0.8F, 13.2F, 45F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 45F, -0.8F, -14F, 45F); // Box 47
		bodyModel[35].setRotationPoint(0F, -45.5F, -59F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-1F, -45F, -60F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-1F, -45F, -35F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 20F, -0.8F, 13.2F, 20F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 20F, -0.8F, -14F, 20F); // Box 51
		bodyModel[38].setRotationPoint(-1.8F, -45.5F, -34F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 20F, -0.8F, 13.2F, 20F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 20F, -0.8F, -14F, 20F); // Box 53
		bodyModel[39].setRotationPoint(0F, -45.5F, -34F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-1F, -37F, -34F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 41
		bodyModel[41].setRotationPoint(-1F, -31F, -36F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 42
		bodyModel[42].setRotationPoint(-1F, -38F, -36F);
	}
}