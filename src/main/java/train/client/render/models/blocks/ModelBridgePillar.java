/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBridgePillar extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBridgePillar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 14

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 16, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 1
		bodyModel[0].setRotationPoint(-6.4F, -16F, -6.4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-6.4F, -5.5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-6.4F, -13.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 16, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 6
		bodyModel[3].setRotationPoint(-6.4F, -16F, 3.4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 7
		bodyModel[4].setRotationPoint(-8F, -13.5F, -6.4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 8
		bodyModel[5].setRotationPoint(-8F, -13.5F, 3.4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 9
		bodyModel[6].setRotationPoint(-8F, -5.5F, -6.4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 10
		bodyModel[7].setRotationPoint(-8F, -5.5F, 3.4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(3.4F, -5.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(3.4F, -13.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 16, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 13
		bodyModel[10].setRotationPoint(3.4F, -16F, -6.4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 16, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 14
		bodyModel[11].setRotationPoint(3.4F, -16F, 3.4F);
	}
}