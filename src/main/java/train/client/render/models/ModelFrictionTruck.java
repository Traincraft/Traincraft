//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FrictionTruck
// Model Creator: Bidahochi
// Created on: 06.08.2021 - 22:57:38
// Last changed on: 06.08.2021 - 22:57:38

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFrictionTruck extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelFrictionTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 72, 7, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 82, 16, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 83, 7, textureX, textureY); // Box 71
		bodyModel[10] = new ModelRendererTurbo(this, 38, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 38, 1, textureX, textureY); // Box 89
		bodyModel[14] = new ModelRendererTurbo(this, 9, 13, textureX, textureY); // Box 88
		bodyModel[15] = new ModelRendererTurbo(this, 60, 3, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 60, 12, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 71, 3, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 69, 14, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 144
		bodyModel[20] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 144
		bodyModel[21] = new ModelRendererTurbo(this, 85, 11, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Box 45
		bodyModel[23] = new ModelRendererTurbo(this, 95, 3, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 97, 14, textureX, textureY); // Box 47
		bodyModel[25] = new ModelRendererTurbo(this, 106, 12, textureX, textureY); // Box 48
		bodyModel[26] = new ModelRendererTurbo(this, 96, 7, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 106, 3, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 9, 13, textureX, textureY); // Box 51
		bodyModel[29] = new ModelRendererTurbo(this, 92, 10, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 54
		bodyModel[32] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 55
		bodyModel[33] = new ModelRendererTurbo(this, 69, 14, textureX, textureY); // Box 57
		bodyModel[34] = new ModelRendererTurbo(this, 60, 12, textureX, textureY); // Box 58
		bodyModel[35] = new ModelRendererTurbo(this, 97, 14, textureX, textureY); // Box 59
		bodyModel[36] = new ModelRendererTurbo(this, 106, 12, textureX, textureY); // Box 60
		bodyModel[37] = new ModelRendererTurbo(this, 96, 7, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 106, 3, textureX, textureY); // Box 62
		bodyModel[39] = new ModelRendererTurbo(this, 95, 3, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 71, 3, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 60, 3, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 72, 7, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 92, 10, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 83, 7, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 85, 11, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 82, 16, textureX, textureY); // Box 77

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 4
		bodyModel[0].setRotationPoint(-2F, 5F, -8.25F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 14
		bodyModel[1].setRotationPoint(-7F, 6F, -8F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[2].setRotationPoint(-6F, 7F, -5.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 22
		bodyModel[3].setRotationPoint(5F, 6F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[4].setRotationPoint(-5F, 6F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[5].setRotationPoint(-2F, 8F, -8.25F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[6].setRotationPoint(6F, 7F, -5.5F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[7].setRotationPoint(6F, 7F, 5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[8].setRotationPoint(-6F, 7F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 71
		bodyModel[9].setRotationPoint(-1.5F, 5.75F, -8.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-2F, 5.75F, -6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 23
		bodyModel[11].setRotationPoint(-2F, 5.75F, -3.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-1.5F, 4.75F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F); // Box 89
		bodyModel[13].setRotationPoint(-2F, 5.75F, 3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[14].setRotationPoint(-7F, 6F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[15].setRotationPoint(-7.5F, 5.5F, -8.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(-7.5F, 7.5F, -8.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[17].setRotationPoint(-4.5F, 5.5F, -8.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-5F, 8F, -8.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[19].setRotationPoint(-1.1F, 5F, -8.74F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[20].setRotationPoint(0.1F, 5F, -8.74F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[21].setRotationPoint(-1F, 4.75F, -8.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[22].setRotationPoint(-2F, 6F, -8.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Box 46
		bodyModel[23].setRotationPoint(1.5F, 5.5F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[24].setRotationPoint(2F, 8F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[25].setRotationPoint(4.5F, 7.5F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 49
		bodyModel[26].setRotationPoint(2F, 6F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[27].setRotationPoint(4.5F, 5.5F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[28].setRotationPoint(5F, 6F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 52
		bodyModel[29].setRotationPoint(1F, 6F, -8.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 53
		bodyModel[30].setRotationPoint(0.1F, 5F, -7.74F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 54
		bodyModel[31].setRotationPoint(-1.1F, 5F, -7.74F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 55
		bodyModel[32].setRotationPoint(-2F, 5F, 6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 57
		bodyModel[33].setRotationPoint(-5F, 8F, 6.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[34].setRotationPoint(-7.5F, 7.5F, 6.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[35].setRotationPoint(2F, 8F, 6.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[36].setRotationPoint(4.5F, 7.5F, 6.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 61
		bodyModel[37].setRotationPoint(2F, 6F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[38].setRotationPoint(4.5F, 5.5F, 6.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Box 63
		bodyModel[39].setRotationPoint(1.5F, 5.5F, 6.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[40].setRotationPoint(-4.5F, 5.5F, 6.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[41].setRotationPoint(-7.5F, 5.5F, 6.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[42].setRotationPoint(-5F, 6F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(-7F, 6F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(5F, 6F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 69
		bodyModel[45].setRotationPoint(1F, 6F, 6.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[46].setRotationPoint(-2F, 6F, 6.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 71
		bodyModel[47].setRotationPoint(-1.1F, 5F, 6.74F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 72
		bodyModel[48].setRotationPoint(0.1F, 5F, 6.74F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 73
		bodyModel[49].setRotationPoint(-1.5F, 5.75F, 6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[50].setRotationPoint(-1F, 4.75F, 7.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 75
		bodyModel[51].setRotationPoint(-1.1F, 5F, 7.74F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 76
		bodyModel[52].setRotationPoint(0.1F, 5F, 7.74F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 77
		bodyModel[53].setRotationPoint(-2F, 8F, 6.25F);
	}
}