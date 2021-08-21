//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.02.2021 - 15:27:23
// Last changed on: 14.02.2021 - 15:27:23

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGETonnerTruck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelGETonnerTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[55];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 43, 16, textureX, textureY); // Box 30 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 43, 16, textureX, textureY); // Box 46 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 43, 16, textureX, textureY); // Box 47 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 43, 16, textureX, textureY); // Box 48 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 18, 13, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 104
		bodyModel[6] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 110
		bodyModel[7] = new ModelRendererTurbo(this, 10, 20, textureX, textureY); // Box 172
		bodyModel[8] = new ModelRendererTurbo(this, 10, 20, textureX, textureY); // Box 173
		bodyModel[9] = new ModelRendererTurbo(this, 18, 13, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 44, 6, textureX, textureY); // Box 176
		bodyModel[11] = new ModelRendererTurbo(this, 17, 20, textureX, textureY); // Box 177
		bodyModel[12] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 179
		bodyModel[13] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 180
		bodyModel[14] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 181
		bodyModel[15] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 182
		bodyModel[16] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 183
		bodyModel[17] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 184
		bodyModel[18] = new ModelRendererTurbo(this, 6, 5, textureX, textureY); // Box 70
		bodyModel[19] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 39, 23, textureX, textureY); // Box 174
		bodyModel[21] = new ModelRendererTurbo(this, 39, 23, textureX, textureY); // Box 175
		bodyModel[22] = new ModelRendererTurbo(this, 59, 9, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 59, 9, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 59, 6, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 17, 20, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 59, 6, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 6, 5, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 59, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 39, 23, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 39, 23, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 59, 9, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 44, 6, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 59, 6, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 17, 20, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 59, 6, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 17, 20, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 6, 5, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 6, 5, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 22, 16, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 22, 16, textureX, textureY); // Box 59

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[0].setRotationPoint(5.5F, 7F, 6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[1].setRotationPoint(-5.5F, 7F, 6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[2].setRotationPoint(-5.5F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[3].setRotationPoint(5.5F, 7F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[5].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[6].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[7].setRotationPoint(4.5F, 6F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[8].setRotationPoint(-6.5F, 6F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
		bodyModel[9].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 176
		bodyModel[10].setRotationPoint(-3F, 6.5F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 177
		bodyModel[11].setRotationPoint(-7F, 5F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 179
		bodyModel[12].setRotationPoint(-5F, 6F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		bodyModel[13].setRotationPoint(4F, 6F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[14].setRotationPoint(-5F, 5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[15].setRotationPoint(4F, 5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[16].setRotationPoint(-3F, 4.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[17].setRotationPoint(1F, 4.5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 70
		bodyModel[18].setRotationPoint(-2.5F, 5.5F, -7.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-4F, 6F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 174
		bodyModel[20].setRotationPoint(-8F, 8.5F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[21].setRotationPoint(3F, 8.5F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[22].setRotationPoint(-8F, 6F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[23].setRotationPoint(7F, 6F, -7.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 29
		bodyModel[24].setRotationPoint(-8F, 4F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-4F, 6F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(5F, 5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 32
		bodyModel[27].setRotationPoint(3F, 6F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-6.5F, 6F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 35
		bodyModel[30].setRotationPoint(1.5F, 5.5F, -7.75F);

		bodyModel[31].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 36
		bodyModel[31].setRotationPoint(-8F, 4F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-8F, 6F, 6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-8F, 8.5F, 6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-4F, 6F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[35].setRotationPoint(3F, 8.5F, 6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[36].setRotationPoint(7F, 6F, 6.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 42
		bodyModel[37].setRotationPoint(-3F, 6.5F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-4F, 6F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-5F, 6F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(-5F, 5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-7F, 5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[42].setRotationPoint(3F, 6F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[43].setRotationPoint(4F, 6F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(4F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(5F, 5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(1F, 4.5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-3F, 4.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-2.5F, 5.5F, 6.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 54
		bodyModel[49].setRotationPoint(1.5F, 5.5F, 6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[50].setRotationPoint(4.5F, 6F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[51].setRotationPoint(-6.5F, 6F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 16, 4, 10, 0F); // Box 57
		bodyModel[52].setRotationPoint(-8F, 4.5F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 58
		bodyModel[53].setRotationPoint(-2F, 4F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 59
		bodyModel[54].setRotationPoint(1F, 4F, -7F);
	}
}