//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 20:17:08
// Last changed on: 29.03.2018 - 20:17:08

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGs4Bogie extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelGs4Bogie()
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 155
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 156
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 158
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 166
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 167
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 168
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 169
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 173
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 180
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 181
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 46
		bodyModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 47
		bodyModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 47
		bodyModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 48
		bodyModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 54
		bodyModel[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 55
		bodyModel[31] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 56
		bodyModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 57
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 64
		bodyModel[38] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 65
		bodyModel[39] = new ModelRendererTurbo(this, 94, 4, textureX, textureY); // Box 66
		bodyModel[40] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 74
		bodyModel[43] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 75
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 76
		bodyModel[45] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 78
		bodyModel[46] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 79
		bodyModel[47] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 80
		bodyModel[48] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 81
		bodyModel[49] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 82
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[53] = new ModelRendererTurbo(this, 94, 4, textureX, textureY); // Box 63

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[0].setRotationPoint(11F, 4F, 6F);

		bodyModel[1].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 154
		bodyModel[1].setRotationPoint(9F, 3F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[2].setRotationPoint(12F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 156
		bodyModel[3].setRotationPoint(10F, 2F, 5.95F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[4].setRotationPoint(10F, 6F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(25F, 4F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 166
		bodyModel[6].setRotationPoint(30F, 2F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 167
		bodyModel[7].setRotationPoint(8F, 2F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 168
		bodyModel[8].setRotationPoint(18F, 1F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 169
		bodyModel[9].setRotationPoint(18F, 2F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[10].setRotationPoint(25F, 4F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 180
		bodyModel[11].setRotationPoint(10F, 2F, -5.95F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[12].setRotationPoint(12F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(25.5F, 4.5F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 31
		bodyModel[14].setRotationPoint(12.5F, 4.5F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[15].setRotationPoint(23F, 4F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[16].setRotationPoint(15F, 4F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[17].setRotationPoint(23F, 6F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[18].setRotationPoint(17F, 6F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[19].setRotationPoint(16F, 6F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[20].setRotationPoint(15F, 4F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[21].setRotationPoint(22F, 4F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[22].setRotationPoint(10F, 4F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[23].setRotationPoint(28F, 4F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[24].setRotationPoint(29F, 4F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[25].setRotationPoint(9F, 4F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(9F, 4F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[27].setRotationPoint(9F, 2F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 53
		bodyModel[28].setRotationPoint(25F, 2F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[29].setRotationPoint(18F, 2F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[30].setRotationPoint(23F, 2F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[31].setRotationPoint(14F, 2F, 6F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 57
		bodyModel[32].setRotationPoint(25F, 2F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 58
		bodyModel[33].setRotationPoint(9F, 3F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[34].setRotationPoint(23F, 2F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[35].setRotationPoint(28F, 4F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[36].setRotationPoint(23F, 6F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[37].setRotationPoint(23F, 4F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[38].setRotationPoint(22F, 4F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[39].setRotationPoint(17F, 3.4F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[40].setRotationPoint(15F, 4F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[41].setRotationPoint(10F, 6F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[42].setRotationPoint(10F, 4F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[43].setRotationPoint(15F, 4F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[44].setRotationPoint(29F, 4F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[45].setRotationPoint(9F, 2F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[46].setRotationPoint(14F, 2F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[47].setRotationPoint(18F, 2F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 81
		bodyModel[48].setRotationPoint(23F, 2F, 5.95F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 82
		bodyModel[49].setRotationPoint(23F, 2F, -5.95F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[50].setRotationPoint(24F, 4F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[51].setRotationPoint(24F, 4F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[52].setRotationPoint(11F, 4F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[53].setRotationPoint(17F, 3.4F, 6.5F);
	}
}