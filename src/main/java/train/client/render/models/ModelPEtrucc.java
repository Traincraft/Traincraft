//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.12.2020 - 10:50:54
// Last changed on: 05.12.2020 - 10:50:54

package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPEtrucc extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPEtrucc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[48];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 90
		bodyModel[1] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 91
		bodyModel[2] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 97
		bodyModel[3] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 31, 2, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 11, 2, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 27, 8, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 27, 8, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 27, 12, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 27, 12, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 6, 3, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 16, 3, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 21, 2, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 21, 7, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 27, 16, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 48
		bodyModel[26] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 27, 16, textureX, textureY); // Box 51
		bodyModel[29] = new ModelRendererTurbo(this, 27, 20, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 6, 8, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 27, 20, textureX, textureY); // Box 58
		bodyModel[33] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 59
		bodyModel[34] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 27, 48, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 46, 48, textureX, textureY); // Box 37
		bodyModel[39] = new ModelRendererTurbo(this, 46, 47, textureX, textureY); // Box 38
		bodyModel[40] = new ModelRendererTurbo(this, 43, 47, textureX, textureY); // Box 37
		bodyModel[41] = new ModelRendererTurbo(this, 44, 47, textureX, textureY); // Box 37
		bodyModel[42] = new ModelRendererTurbo(this, 45, 47, textureX, textureY); // Box 37
		bodyModel[43] = new ModelRendererTurbo(this, 51, 57, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 49, 56, textureX, textureY); // Box 37
		bodyModel[46] = new ModelRendererTurbo(this, 50, 56, textureX, textureY); // Box 37
		bodyModel[47] = new ModelRendererTurbo(this, 50, 56, textureX, textureY); // Box 37

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 90
		bodyModel[0].setRotationPoint(-8F, 7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 91
		bodyModel[1].setRotationPoint(-9F, 6F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 97
		bodyModel[2].setRotationPoint(7F, 6F, -8F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[3].setRotationPoint(8F, 7F, -6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[4].setRotationPoint(8F, 7F, 6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 13
		bodyModel[5].setRotationPoint(-8F, 7F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // Box 14
		bodyModel[6].setRotationPoint(-12.5F, 4.5F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[7].setRotationPoint(-10F, 4.5F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		bodyModel[8].setRotationPoint(-10F, 5.5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[9].setRotationPoint(-7F, 5.5F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[10].setRotationPoint(6F, 5.5F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(9F, 5.5F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(6F, 4.5F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(-9F, 6F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(7F, 6F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 27
		bodyModel[15].setRotationPoint(-5.5F, 7.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 29
		bodyModel[16].setRotationPoint(-7.5F, 6.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[17].setRotationPoint(5.5F, 6.5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 35
		bodyModel[18].setRotationPoint(-4F, 5.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bodyModel[19].setRotationPoint(2.5F, 5.5F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // Box 37
		bodyModel[20].setRotationPoint(-12.5F, 4.5F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(6F, 4.5F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[22].setRotationPoint(9F, 5.5F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(6F, 5.5F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[24].setRotationPoint(7F, 6F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[25].setRotationPoint(-7F, 5.5F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[26].setRotationPoint(-10F, 4.5F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[27].setRotationPoint(-10F, 5.5F, 7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[28].setRotationPoint(-9F, 6F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 52
		bodyModel[29].setRotationPoint(-7.5F, 6.5F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 53
		bodyModel[30].setRotationPoint(-5.5F, 7.5F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[31].setRotationPoint(-4F, 5.5F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[32].setRotationPoint(5.5F, 6.5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[33].setRotationPoint(2.5F, 5.5F, 7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 60
		bodyModel[34].setRotationPoint(-4.5F, 4.5F, -6.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 61
		bodyModel[35].setRotationPoint(2.5F, 4.5F, -6.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 62
		bodyModel[36].setRotationPoint(-4.5F, 5.5F, -1F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 63
		bodyModel[37].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[38].setRotationPoint(-1.5F, 5.5F, -7.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[39].setRotationPoint(-1.5F, 7F, -7.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[40].setRotationPoint(-1.5F, 6.6F, -8.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[41].setRotationPoint(-1.5F, 5.9F, -8.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[42].setRotationPoint(-1.5F, 6.25F, -9.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[43].setRotationPoint(-1.5F, 5.5F, 5.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[44].setRotationPoint(-1.5F, 7F, 5.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[45].setRotationPoint(-1.5F, 6.6F, 5.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[46].setRotationPoint(-1.5F, 5.9F, 5.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[47].setRotationPoint(-1.5F, 6.25F, 6.75F);
	}
}