//canada!? since when!?

package train.client.render.models.cabs; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelD9_Cab4Window extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelD9_Cab4Window() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 95
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 29
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 32
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 406
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 314 door swing left
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY, "lamp"); // Box 448 front headlight
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "lamp"); // Box 449 front headlight
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 114
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 74
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 78
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 875
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 876
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 877
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 481
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 238
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // box64
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // box65
		bodyModel[17] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 71
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 209, 12, textureX, textureY); // Box 74
		bodyModel[20] = new ModelRendererTurbo(this, 73, 21, textureX, textureY); // Box 35
		bodyModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 74 door swing right
		bodyModel[25] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 84
		bodyModel[26] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 85
		bodyModel[27] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 86
		bodyModel[28] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 87
		bodyModel[29] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 94
		bodyModel[30] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 95
		bodyModel[31] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 96
		bodyModel[32] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 97
		bodyModel[33] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 105, 17, textureX, textureY, "lamp"); // Box 136 liveryimg 7
		bodyModel[35] = new ModelRendererTurbo(this, 105, 42, textureX, textureY, "lamp"); // Box 137 liveryimg 7
		bodyModel[36] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 346 door swing right
		bodyModel[37] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 347
		bodyModel[38] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 348
		bodyModel[39] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 350
		bodyModel[40] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 353
		bodyModel[41] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 355
		bodyModel[42] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 356
		bodyModel[43] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 357
		bodyModel[44] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 359
		bodyModel[45] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 361
		bodyModel[46] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 2, 33, textureX, textureY, "lamp"); // Box 63 glowey
		bodyModel[52] = new ModelRendererTurbo(this, 14, 5, textureX, textureY, "lamp"); // Box 64 glowey
		bodyModel[53] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 65

		bodyModel[0].addBox(0F, 0F, 0F, 15, 7, 22, 0F); // Box 95
		bodyModel[0].setRotationPoint(-37F, -8F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 29
		bodyModel[1].setRotationPoint(-37F, -22F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 32
		bodyModel[2].setRotationPoint(-37F, -22F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 12, 14, 0F); // Box 406
		bodyModel[3].setRotationPoint(-23F, -20F, -7F);

		bodyModel[4].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 314 door swing left
		bodyModel[4].setRotationPoint(-22.5F, -20F, 7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 front headlight
		bodyModel[5].setRotationPoint(-46.75F, -16F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 front headlight
		bodyModel[6].setRotationPoint(-46.75F, -14F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[7].setRotationPoint(-41.5F, -22.75F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[8].setRotationPoint(-41.5F, -23.75F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[9].setRotationPoint(-41.25F, -22.25F, -0.25F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 875
		bodyModel[10].setRotationPoint(-41.5F, -24F, -1F);

		bodyModel[11].addTrapezoid(0F, 0F, 0F, 2, 1, 0, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 876
		bodyModel[11].setRotationPoint(-41.5F, -24F, 1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[12].setRotationPoint(-41.25F, -24.25F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 481
		bodyModel[13].setRotationPoint(-41.5F, -24F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[14].setRotationPoint(-44.5F, -17.25F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[15].setRotationPoint(-35F, -22F, 11F);
		bodyModel[15].rotateAngleX = 0.26179939F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[16].setRotationPoint(-35F, -22.25F, -11.97F);
		bodyModel[16].rotateAngleX = -0.26179939F;

		bodyModel[17].addBox(0F, 0F, 0F, 15, 2, 14, 0F); // Box 71
		bodyModel[17].setRotationPoint(-37F, -24F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[18].setRotationPoint(-38F, -24F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 74
		bodyModel[19].setRotationPoint(-38F, -24F, -7F);

		bodyModel[20].addShapeBox(0F, -1F, 0F, 8, 16, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[20].setRotationPoint(-45.5F, -16F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[21].setRotationPoint(-45F, -17F, -11F);

		bodyModel[22].addBox(0F, -1F, 0F, 7, 13, 6, 0F); // Box 35
		bodyModel[22].setRotationPoint(-44F, -13F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[23].setRotationPoint(-45F, -17F, 5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 74 door swing right
		bodyModel[24].setRotationPoint(-46F, -16F, -5F);
		bodyModel[24].rotateAngleY = 0.2443461F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 84
		bodyModel[25].setRotationPoint(-46.5F, -17F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 85
		bodyModel[26].setRotationPoint(-46.5F, -17F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[27].setRotationPoint(-44F, -17F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[28].setRotationPoint(-44F, -17F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[29].setRotationPoint(-37F, -24F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[30].setRotationPoint(-37F, -24F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 96
		bodyModel[31].setRotationPoint(-40F, -24F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 97
		bodyModel[32].setRotationPoint(-40F, -24F, 0F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 74
		bodyModel[33].setRotationPoint(-46.5F, -16F, -1F);

		bodyModel[34].addBox(0F, 0F, -6F, 0, 2, 6, 0F); // Box 136 liveryimg 7
		bodyModel[34].setRotationPoint(-38.05F, -24F, 7F);
		bodyModel[34].rotateAngleY = -0.2443461F;

		bodyModel[35].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 137 liveryimg 7
		bodyModel[35].setRotationPoint(-38.05F, -24F, -7F);
		bodyModel[35].rotateAngleY = 0.2443461F;

		bodyModel[36].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 346 door swing right
		bodyModel[36].setRotationPoint(-22.5F, -20F, -7.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 347
		bodyModel[37].setRotationPoint(-23F, -22F, -11F);

		bodyModel[38].addBox(0F, -1F, 0F, 7, 13, 6, 0F); // Box 348
		bodyModel[38].setRotationPoint(-44F, -13F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[39].setRotationPoint(-38F, -22F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 353
		bodyModel[40].setRotationPoint(-38F, -22F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 355
		bodyModel[41].setRotationPoint(-45F, -14F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[42].setRotationPoint(-45F, -14F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[43].setRotationPoint(-38F, -22F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 359
		bodyModel[44].setRotationPoint(-38F, -22F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 361
		bodyModel[45].setRotationPoint(-44.5F, -17.25F, 5F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 86
		bodyModel[46].setRotationPoint(-37.1F, -15F, -5F);
		bodyModel[46].rotateAngleY = -0.38397244F;

		bodyModel[47].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 87
		bodyModel[47].setRotationPoint(-37F, -15F, -4F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 86
		bodyModel[48].setRotationPoint(-35F, -17F, -5F);
		bodyModel[48].rotateAngleY = -0.38397244F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[49].setRotationPoint(-38F, -22F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-38F, -22F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 63 glowey
		bodyModel[51].setRotationPoint(-44.75F, -13.5F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 64 glowey
		bodyModel[52].setRotationPoint(-44.75F, -13.5F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[53].setRotationPoint(-38F, -24F, -11F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 54; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}