//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.06.2021 - 14:24:15
// Last changed on: 06.06.2021 - 14:24:15

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModellocoC11truckRear extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModellocoC11truckRear() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 167
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 168
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 170
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 172
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 175
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 177
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 182
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 183
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 398
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 399
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 400
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 401
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 402
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 403
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 54
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 55
		bodyModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 56
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 57
		bodyModel[25] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 58
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 59
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 60
		bodyModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 61
		bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 62
		bodyModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 64
		bodyModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 65

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 12
		bodyModel[0].setRotationPoint(-8.5F, 4F, -5.05F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 14
		bodyModel[1].setRotationPoint(2.5F, 4F, -5.05F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[2].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[3].setRotationPoint(-6.5F, 6F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[4].setRotationPoint(-7.5F, 5F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 172
		bodyModel[5].setRotationPoint(-4.5F, 5F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 175
		bodyModel[6].setRotationPoint(-1.5F, 6.5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[7].setRotationPoint(-7.5F, 5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[8].setRotationPoint(-7F, 9F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[9].setRotationPoint(-1.5F, 7F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 20
		bodyModel[10].setRotationPoint(-6.5F, 6F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 21
		bodyModel[11].setRotationPoint(4.5F, 6F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[12].setRotationPoint(4.5F, 5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 399
		bodyModel[13].setRotationPoint(-7.5F, 6F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[14].setRotationPoint(-4.5F, 6F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 401
		bodyModel[15].setRotationPoint(3.5F, 6F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[16].setRotationPoint(6.5F, 6F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 403
		bodyModel[17].setRotationPoint(1.5F, 5F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 51
		bodyModel[18].setRotationPoint(-8.5F, 4F, 5.05F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 52
		bodyModel[19].setRotationPoint(2.5F, 4F, 5.05F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[20].setRotationPoint(4.5F, 6F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[21].setRotationPoint(-6.5F, 6F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[22].setRotationPoint(-7.5F, 5F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 56
		bodyModel[23].setRotationPoint(-4.5F, 5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[24].setRotationPoint(-1.5F, 6.5F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[25].setRotationPoint(-7.5F, 5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[26].setRotationPoint(-7F, 9F, 5.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[27].setRotationPoint(4.5F, 5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[28].setRotationPoint(-7.5F, 6F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[29].setRotationPoint(-4.5F, 6F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[30].setRotationPoint(3.5F, 6F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[31].setRotationPoint(6.5F, 6F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 65
		bodyModel[32].setRotationPoint(1.5F, 5F, 6F);
	}
}