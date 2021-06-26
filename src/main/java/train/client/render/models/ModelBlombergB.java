//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: blomb
// Model Creator: bidahochi
// Created on: 11.06.2021 - 23:11:50
// Last changed on: 11.06.2021 - 23:11:50

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBlombergB extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelBlombergB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 114
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 117
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 119
		bodyModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 108
		bodyModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 113
		bodyModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 124
		bodyModel[13] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 129
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		bodyModel[15] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 127
		bodyModel[16] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 129
		bodyModel[18] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 130
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 126
		bodyModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 60
		bodyModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 127
		bodyModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 141
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 142
		bodyModel[25] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 143
		bodyModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 144
		bodyModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 145
		bodyModel[28] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 146
		bodyModel[29] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 147
		bodyModel[30] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 148
		bodyModel[31] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 149
		bodyModel[32] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 150
		bodyModel[33] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 151
		bodyModel[34] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 152
		bodyModel[35] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 153
		bodyModel[36] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 154
		bodyModel[37] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 155
		bodyModel[38] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 156
		bodyModel[39] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 172
		bodyModel[40] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 158
		bodyModel[41] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 159
		bodyModel[42] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 122
		bodyModel[44] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 166
		bodyModel[47] = new ModelRendererTurbo(this, 78, 43, textureX, textureY); // Box 167
		bodyModel[48] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 168
		bodyModel[49] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 169
		bodyModel[50] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 170
		bodyModel[51] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 171
		bodyModel[52] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 173
		bodyModel[54] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 174
		bodyModel[55] = new ModelRendererTurbo(this, 107, 49, textureX, textureY); // Box 175
		bodyModel[56] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 176
		bodyModel[57] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 177

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7F, 7F, 6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[3].setRotationPoint(-7F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-7F, 7F, -6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(7F, 7F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 114
		bodyModel[6].setRotationPoint(-8F, 5F, 7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[7].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[8].setRotationPoint(-2F, 8F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[9].setRotationPoint(8F, 5F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[10].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[11].setRotationPoint(-6F, 6F, 7.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 124
		bodyModel[12].setRotationPoint(-11F, 4F, 7.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 129
		bodyModel[13].setRotationPoint(2.5F, 8F, 7.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 130
		bodyModel[14].setRotationPoint(-10.5F, 8F, 7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[15].setRotationPoint(-3F, 4F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(2F, 4F, 8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 129
		bodyModel[17].setRotationPoint(2.5F, 5F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 130
		bodyModel[18].setRotationPoint(-3.5F, 5F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[19].setRotationPoint(4F, 3F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(-10F, 3F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[21].setRotationPoint(4F, 4.5F, 8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[22].setRotationPoint(-3F, 3F, 7.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 141
		bodyModel[23].setRotationPoint(-11F, 4F, -8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 142
		bodyModel[24].setRotationPoint(-8F, 5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[25].setRotationPoint(-6F, 6F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 144
		bodyModel[26].setRotationPoint(-10F, 5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[27].setRotationPoint(-10F, 3F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 146
		bodyModel[28].setRotationPoint(-3F, 3F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[29].setRotationPoint(4F, 3F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 148
		bodyModel[30].setRotationPoint(4F, 6F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[31].setRotationPoint(8F, 5F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 150
		bodyModel[32].setRotationPoint(2.5F, 5F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 151
		bodyModel[33].setRotationPoint(2.5F, 8F, -7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 152
		bodyModel[34].setRotationPoint(-10.5F, 8F, -7.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 153
		bodyModel[35].setRotationPoint(-3.5F, 5F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[36].setRotationPoint(-2F, 8F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[37].setRotationPoint(-3F, 4F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[38].setRotationPoint(2F, 4F, -9.5F);

		bodyModel[39].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 172
		bodyModel[39].setRotationPoint(5.5F, 4.5F, 9F);
		bodyModel[39].rotateAngleX = 0.78539816F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[40].setRotationPoint(-6F, 4.5F, 8.5F);

		bodyModel[41].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 159
		bodyModel[41].setRotationPoint(-7.5F, 4.5F, 9F);
		bodyModel[41].rotateAngleX = 0.78539816F;

		bodyModel[42].addBox(0F, 0F, 0F, 6, 1, 15, 0F); // Box 96
		bodyModel[42].setRotationPoint(-3F, 4.75F, -7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 3, 11, 0F); // Box 122
		bodyModel[43].setRotationPoint(-9F, 5.5F, -5.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 3, 11, 0F); // Box 123
		bodyModel[44].setRotationPoint(2F, 5.5F, -5.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[45].setRotationPoint(-2F, 4F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 166
		bodyModel[46].setRotationPoint(-2F, 7F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 167
		bodyModel[47].setRotationPoint(-2F, 6F, -9F);

		bodyModel[48].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 168
		bodyModel[48].setRotationPoint(-7.5F, 4.5F, -9F);
		bodyModel[48].rotateAngleX = 0.78539816F;

		bodyModel[49].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 169
		bodyModel[49].setRotationPoint(5.5F, 4.5F, -9F);
		bodyModel[49].rotateAngleX = 0.78539816F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 170
		bodyModel[50].setRotationPoint(4F, 4.5F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[51].setRotationPoint(-6F, 4.5F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[52].setRotationPoint(-11F, 5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 173
		bodyModel[53].setRotationPoint(-11F, 4F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[54].setRotationPoint(-11F, 4F, 4.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 175
		bodyModel[55].setRotationPoint(10F, 5F, -4.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 176
		bodyModel[56].setRotationPoint(10F, 4F, -7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[57].setRotationPoint(10F, 4F, 4.5F);
	}
}