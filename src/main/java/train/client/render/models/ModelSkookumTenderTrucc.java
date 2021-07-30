
package train.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSkookumTenderTrucc extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelSkookumTenderTrucc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 229
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 231
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 51
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 52
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 53
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 54
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 55
		bodyModel[11] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 56
		bodyModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 57
		bodyModel[13] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 58
		bodyModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		bodyModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 60
		bodyModel[16] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 64
		bodyModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 65
		bodyModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 66
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 68
		bodyModel[24] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 69
		bodyModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 70
		bodyModel[26] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 71
		bodyModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 72
		bodyModel[28] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 73
		bodyModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 74
		bodyModel[30] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 75
		bodyModel[31] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 31

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 229
		bodyModel[0].setRotationPoint(-5F, 6.5F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 230
		bodyModel[1].setRotationPoint(-5.5F, 6F, -8F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 231
		bodyModel[2].setRotationPoint(-5F, 6.5F, 6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[3].setRotationPoint(5F, 6.5F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 12
		bodyModel[4].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 13
		bodyModel[5].setRotationPoint(5F, 6.5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 51
		bodyModel[6].setRotationPoint(-6.5F, 5F, -7.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52
		bodyModel[7].setRotationPoint(3.5F, 5F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[8].setRotationPoint(-6.5F, 5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[9].setRotationPoint(3.5F, 5F, -8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 55
		bodyModel[10].setRotationPoint(-6.5F, 8.01F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 56
		bodyModel[11].setRotationPoint(-1.5F, 4F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 57
		bodyModel[12].setRotationPoint(0.5F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[13].setRotationPoint(-3.5F, 5F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
		bodyModel[14].setRotationPoint(1.5F, 5F, -7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[15].setRotationPoint(1.5F, 5F, -7.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[16].setRotationPoint(-1.5F, 5F, -7.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 62
		bodyModel[17].setRotationPoint(-0.5F, 4F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 63
		bodyModel[18].setRotationPoint(0.5F, 4F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 64
		bodyModel[19].setRotationPoint(-1.5F, 4F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 65
		bodyModel[20].setRotationPoint(-1.5F, 4F, 6F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 66
		bodyModel[21].setRotationPoint(0.5F, 4F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[22].setRotationPoint(3.5F, 5F, 7.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 68
		bodyModel[23].setRotationPoint(3.5F, 5F, 6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[24].setRotationPoint(-6.5F, 5F, 7.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 70
		bodyModel[25].setRotationPoint(-6.5F, 5F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[26].setRotationPoint(1.5F, 5F, 6.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 72
		bodyModel[27].setRotationPoint(-6.5F, 8.01F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[28].setRotationPoint(-1.5F, 5F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[29].setRotationPoint(-3.5F, 5F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		bodyModel[30].setRotationPoint(1.5F, 5F, 6.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 31
		bodyModel[31].setRotationPoint(-0.5F, 4F, 6F);
	}
}