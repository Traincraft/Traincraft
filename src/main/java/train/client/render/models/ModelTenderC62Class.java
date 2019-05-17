package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTenderC62Class extends ModelConverter {

	int textureX = 256;
	int textureY = 128;
	public ModelTenderC62Class() {
		bodyModel = new ModelRendererTurbo[31];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 42, 90, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 30

		bodyModel[0].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-13F, 4F, -6F);

		bodyModel[1].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(24F, 4F, -6F);

		bodyModel[2].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-27F, 4F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-33F, 1F, -6.05F);

		bodyModel[4].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 4
		bodyModel[4].setRotationPoint(-33F, 1F, 6.05F);

		bodyModel[5].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 5
		bodyModel[5].setRotationPoint(4F, 1F, 6.05F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 6
		bodyModel[6].setRotationPoint(4F, 1F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 7
		bodyModel[7].setRotationPoint(29F, 1F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 8
		bodyModel[8].setRotationPoint(-8F, 1F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 9
		bodyModel[9].setRotationPoint(-33F, 1F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 22, 2, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-24F, 27F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 22, 2, 1, 0F); // Box 11
		bodyModel[11].setRotationPoint(-24F, 27F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 4, 16, 0F); // Box 12
		bodyModel[12].setRotationPoint(16F, 25F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 55, 16, 20, 0F); // Box 13
		bodyModel[13].setRotationPoint(-26F, 9F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 14
		bodyModel[14].setRotationPoint(29F, 24F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 15
		bodyModel[15].setRotationPoint(27F, 6F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 16
		bodyModel[16].setRotationPoint(-38F, 9F, -4F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 10, 8, 0F); // Box 17
		bodyModel[17].setRotationPoint(-29F, 15F, -4F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 18
		bodyModel[18].setRotationPoint(-28F, 3F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 6, 12, 0F); // Box 19
		bodyModel[19].setRotationPoint(-22F, 3F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 6, 12, 0F); // Box 20
		bodyModel[20].setRotationPoint(15F, 3F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 21
		bodyModel[21].setRotationPoint(23F, 3F, -6F);

		bodyModel[22].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 22
		bodyModel[22].setRotationPoint(10F, 4F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 44, 2, 20, 0F); // Box 23
		bodyModel[23].setRotationPoint(-26F, 25F, -10F);

		bodyModel[24].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 24
		bodyModel[24].setRotationPoint(-27F, 4F, 6F);

		bodyModel[25].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 25
		bodyModel[25].setRotationPoint(-13F, 4F, 6F);

		bodyModel[26].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 26
		bodyModel[26].setRotationPoint(10F, 4F, 6F);

		bodyModel[27].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 27
		bodyModel[27].setRotationPoint(24F, 4F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 28
		bodyModel[28].setRotationPoint(4F, 1F, -6.05F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 29
		bodyModel[29].setRotationPoint(-14F, 3F, -6F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 30
		bodyModel[30].setRotationPoint(9F, 3F, -6F);
	}
}