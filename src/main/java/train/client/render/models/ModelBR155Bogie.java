//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.10.2018 - 15:12:22
// Last changed on: 05.10.2018 - 15:12:22

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBR155Bogie extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR155Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[57];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		bodyModel[28] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 26
		bodyModel[30] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 16
		bodyModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 32
		bodyModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 16
		bodyModel[36] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		bodyModel[38] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		bodyModel[39] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		bodyModel[41] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		bodyModel[43] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		bodyModel[45] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		bodyModel[46] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[47] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[49] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 16
		bodyModel[51] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[52] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[54] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 36
		bodyModel[55] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 36
		bodyModel[56] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35

		bodyModel[0].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 15
		bodyModel[0].setRotationPoint(-10.75F, 4F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[1].setRotationPoint(-20.75F, 4F, -7F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[2].setRotationPoint(-15.25F, 6.5F, 5.98F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(-15.25F, 6.5F, -5.98F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(-0.25F, 6.5F, -5.98F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-0.25F, 6.5F, 5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(-20.75F, 4F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 16
		bodyModel[7].setRotationPoint(-8.75F, 4F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[8].setRotationPoint(-20.75F, 5F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(19.25F, 5F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[10].setRotationPoint(-0.75F, 6F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[11].setRotationPoint(-15.75F, 6F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-6.75F, 4F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[13].setRotationPoint(-8.75F, 4F, 3F);
		bodyModel[13].rotateAngleY = -3.14159265F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[14].setRotationPoint(-8.75F, 4F, -1F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(0.25F, 6F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-16.75F, 6F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[17].setRotationPoint(-13.75F, 6F, 7F);
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[18].setRotationPoint(1.25F, 6F, 7F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(10.25F, 4F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(-16.75F, 6F, -6F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(-16.75F, 6F, 7F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(1.25F, 6F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(20.25F, 6F, 7F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 15
		bodyModel[24].setRotationPoint(-10.75F, 4F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(10.25F, 4F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(20.25F, 6F, -6F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[27].setRotationPoint(14.75F, 6.5F, -5.98F);

		bodyModel[28].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[28].setRotationPoint(14.75F, 6.5F, 5.98F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[29].setRotationPoint(14.25F, 6F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(13.25F, 6F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(16.25F, 6F, 7F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 16
		bodyModel[32].setRotationPoint(6.25F, 4F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[33].setRotationPoint(19.25F, 4F, 3F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[34].setRotationPoint(19.25F, 4F, -1F);
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 16
		bodyModel[35].setRotationPoint(-1.75F, 4F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[36].setRotationPoint(-6.75F, 4F, 1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[37].setRotationPoint(1.25F, 4F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[38].setRotationPoint(1.25F, 4F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[39].setRotationPoint(9.25F, 8F, 8F);
		bodyModel[39].rotateAngleY = -3.14159265F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[40].setRotationPoint(1.25F, 6F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[41].setRotationPoint(9.25F, 8F, -5.5F);
		bodyModel[41].rotateAngleY = -3.14159265F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[42].setRotationPoint(-13.75F, 6F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[43].setRotationPoint(-5.75F, 8F, 8F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[44].setRotationPoint(-13.75F, 6F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[45].setRotationPoint(-5.75F, 8F, -5.5F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[46].setRotationPoint(-24F, 5.75F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-3.75F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(-24F, 5.75F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,2.25F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 2.25F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 24
		bodyModel[48].setRotationPoint(-21F, 4.75F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 2.25F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(-21F, 4.75F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[50].setRotationPoint(-1.75F, 2F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[51].setRotationPoint(-1.75F, 6F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[52].setRotationPoint(-14.75F, 6F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[53].setRotationPoint(15.25F, 6F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[54].setRotationPoint(14.25F, 6F, 7F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[55].setRotationPoint(-0.75F, 6F, 7F);
		bodyModel[55].rotateAngleY = -3.14159265F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[56].setRotationPoint(-15.75F, 6F, 7F);
		bodyModel[56].rotateAngleY = -3.14159265F;
	}
}