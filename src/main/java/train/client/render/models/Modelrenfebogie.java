//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.01.2021 - 13:56:22
// Last changed on: 14.01.2021 - 13:56:22

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelrenfebogie extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public Modelrenfebogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 35
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 45
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 46
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 47
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 54
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 62
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 45
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 44
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 74

		bodyModel[0].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[0].setRotationPoint(-5.75F, 7.5F, 5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 4
		bodyModel[1].setRotationPoint(6.25F, 7F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 5
		bodyModel[2].setRotationPoint(-6.25F, 7F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 13
		bodyModel[3].setRotationPoint(5F, 4.5F, 6.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 14
		bodyModel[4].setRotationPoint(-8F, 4.5F, 6.5F);

		bodyModel[5].addShapeBox(0F, -1F, 0F, 5, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[5].setRotationPoint(-2F, 5.5F, 6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[6].setRotationPoint(-2.75F, 8F, 6.4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[7].setRotationPoint(-4.75F, 7F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 28
		bodyModel[8].setRotationPoint(3.75F, 8F, 6.4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 35
		bodyModel[9].setRotationPoint(-2F, 3.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[10].setRotationPoint(-8F, 7F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[11].setRotationPoint(4.75F, 7F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[12].setRotationPoint(8F, 7F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 45
		bodyModel[13].setRotationPoint(-8F, 4.5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 46
		bodyModel[14].setRotationPoint(-3F, 4.5F, -8.5F);

		bodyModel[15].addShapeBox(0F, -1F, 0F, 5, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[15].setRotationPoint(-2F, 5.5F, -8.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 49
		bodyModel[16].setRotationPoint(5F, 4.5F, -8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
		bodyModel[17].setRotationPoint(-1.5F, 8.5F, 6.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 55
		bodyModel[18].setRotationPoint(-1.5F, 8.5F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		bodyModel[19].setRotationPoint(-1F, 7.5F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		bodyModel[20].setRotationPoint(1F, 7.5F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[21].setRotationPoint(-1F, 6.5F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 42
		bodyModel[22].setRotationPoint(-3F, 4.5F, 6.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 43
		bodyModel[23].setRotationPoint(0F, 4.5F, 5.7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 44
		bodyModel[24].setRotationPoint(3F, 4.5F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 45
		bodyModel[25].setRotationPoint(3F, 4.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		bodyModel[26].setRotationPoint(4F, 6.5F, 3F);

		bodyModel[27].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
		bodyModel[27].setRotationPoint(-4F, 6.5F, -2F);

		bodyModel[28].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 43
		bodyModel[28].setRotationPoint(-5.75F, 7.5F, -5F);

		bodyModel[29].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 44
		bodyModel[29].setRotationPoint(6.75F, 7.5F, -5F);

		bodyModel[30].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 45
		bodyModel[30].setRotationPoint(6.75F, 7.5F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[31].setRotationPoint(2.75F, 8F, 6.4F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 44
		bodyModel[32].setRotationPoint(-6.75F, 8F, 6.4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 49
		bodyModel[33].setRotationPoint(-1F, 4.5F, 5.7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(1F, 4.5F, 5.7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 51
		bodyModel[35].setRotationPoint(-1F, 4.5F, -8.7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 52
		bodyModel[36].setRotationPoint(0F, 4.5F, -8.7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 53
		bodyModel[37].setRotationPoint(1F, 4.5F, -8.7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 54
		bodyModel[38].setRotationPoint(-1.25F, 4.5F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(-1F, 3.5F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(-8.25F, 8.5F, 6.4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(-6.75F, 7F, 7.3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(7.25F, 8.5F, 6.4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(5.75F, 7F, 7.3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[44].setRotationPoint(2.75F, 8F, -8.4F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 61
		bodyModel[45].setRotationPoint(3.75F, 8F, -8.4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(7.25F, 8.5F, -8.4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(8F, 7F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(4.75F, 7F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-2.75F, 8F, -8.4F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 66
		bodyModel[50].setRotationPoint(-6.75F, 8F, -8.4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-8.25F, 8.5F, -8.4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[52].setRotationPoint(-8F, 7F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-4.75F, 7F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[54].setRotationPoint(5.75F, 7F, -8.3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[55].setRotationPoint(-6.75F, 7F, -8.3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
		bodyModel[56].setRotationPoint(1F, 6.5F, 8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(0.75F, 4.5F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 74
		bodyModel[58].setRotationPoint(1F, 3.5F, 8.5F);
	}
}