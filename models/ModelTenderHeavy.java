package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelTenderHeavy extends ModelBase
{
	private static final int textureX = 128;

	private static final int textureY = 256;

	public ModelTenderHeavy()
	{
		tenderheavyModel = new ModelRendererTurbo[31];
		tenderheavyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tenderheavyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // wheel
		tenderheavyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // wheel
		tenderheavyModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 4
		tenderheavyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		tenderheavyModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // coal
		tenderheavyModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 7
		tenderheavyModel[7] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 8
		tenderheavyModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 9
		tenderheavyModel[9] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 10
		tenderheavyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		tenderheavyModel[11] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 13
		tenderheavyModel[12] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 14
		tenderheavyModel[13] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // wheel
		tenderheavyModel[14] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // wheel
		tenderheavyModel[15] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 17
		tenderheavyModel[16] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 18
		tenderheavyModel[17] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // wheel
		tenderheavyModel[18] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // wheel
		tenderheavyModel[19] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 21
		tenderheavyModel[20] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // wheel
		tenderheavyModel[21] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // wheel
		tenderheavyModel[22] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 24
		tenderheavyModel[23] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 25
		tenderheavyModel[24] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 26
		tenderheavyModel[25] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 27
		tenderheavyModel[26] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 28
		tenderheavyModel[27] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 29
		tenderheavyModel[28] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 30
		tenderheavyModel[29] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 31
		tenderheavyModel[30] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 32

		tenderheavyModel[0].addBox(0F, 0F, 0F, 42, 15, 19, 0F); // Box 0
		tenderheavyModel[0].setRotationPoint(-21F, 4F, -10F);

		tenderheavyModel[1].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[1].setRotationPoint(-11F, 19F, -8F);

		tenderheavyModel[2].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[2].setRotationPoint(-18F, 19F, -8F);

		tenderheavyModel[3].addBox(0F, 0F, 0F, 32, 3, 1, 0F); // Box 4
		tenderheavyModel[3].setRotationPoint(-21F, 1F, 8F);

		tenderheavyModel[4].addBox(0F, 0F, 0F, 31, 4, 1, 0F); // Box 5
		tenderheavyModel[4].setRotationPoint(-24F, -1F, 8F);

		tenderheavyModel[5].addBox(0F, 0F, 0F, 26, 3, 13, 0F); // coal
		tenderheavyModel[5].setRotationPoint(-20F, 1F, -7F);

		tenderheavyModel[6].addBox(0F, 0F, 0F, 2, 4, 19, 0F); // Box 7
		tenderheavyModel[6].setRotationPoint(-21F, 19F, -10F);

		tenderheavyModel[7].addBox(0F, 0F, 0F, 2, 4, 19, 0F); // Box 8
		tenderheavyModel[7].setRotationPoint(20F, 19F, -10F);

		tenderheavyModel[8].addBox(0F, 0F, 0F, 39, 4, 13, 0F); // Box 9
		tenderheavyModel[8].setRotationPoint(-19F, 19F, -7F);

		tenderheavyModel[9].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 10
		tenderheavyModel[9].setRotationPoint(-16F, 21F, -9F);

		tenderheavyModel[10].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 12
		tenderheavyModel[10].setRotationPoint(22F, 20F, 5F);

		tenderheavyModel[11].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 13
		tenderheavyModel[11].setRotationPoint(22F, 20F, -7F);

		tenderheavyModel[12].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 14
		tenderheavyModel[12].setRotationPoint(-31F, 20F, -7F);

		tenderheavyModel[13].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[13].setRotationPoint(-18F, 19F, 6F);

		tenderheavyModel[14].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[14].setRotationPoint(-11F, 19F, 6F);

		tenderheavyModel[15].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 17
		tenderheavyModel[15].setRotationPoint(-16F, 21F, 7F);

		tenderheavyModel[16].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 18
		tenderheavyModel[16].setRotationPoint(-31F, 20F, 5F);

		tenderheavyModel[17].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[17].setRotationPoint(13F, 19F, -8F);

		tenderheavyModel[18].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[18].setRotationPoint(6F, 19F, -8F);

		tenderheavyModel[19].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 21
		tenderheavyModel[19].setRotationPoint(8F, 21F, -9F);

		tenderheavyModel[20].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[20].setRotationPoint(6F, 19F, 6F);

		tenderheavyModel[21].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // wheel
		tenderheavyModel[21].setRotationPoint(13F, 19F, 6F);

		tenderheavyModel[22].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 24
		tenderheavyModel[22].setRotationPoint(8F, 21F, 7F);

		tenderheavyModel[23].addBox(0F, 0F, 0F, 5, 3, 19, 0F); // Box 25
		tenderheavyModel[23].setRotationPoint(-26F, 17F, -10F);

		tenderheavyModel[24].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 26
		tenderheavyModel[24].setRotationPoint(-31F, 20F, -1F);

		tenderheavyModel[25].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 27
		tenderheavyModel[25].setRotationPoint(-24F, 3F, -10F);

		tenderheavyModel[26].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 28
		tenderheavyModel[26].setRotationPoint(-24F, 3F, 8F);

		tenderheavyModel[27].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 29
		tenderheavyModel[27].setRotationPoint(6F, -1F, -9F);

		tenderheavyModel[28].addBox(0F, 0F, 0F, 8, 4, 17, 0F); // Box 30
		tenderheavyModel[28].setRotationPoint(-3F, 19F, -9F);

		tenderheavyModel[29].addBox(0F, 0F, 0F, 32, 3, 1, 0F); // Box 31
		tenderheavyModel[29].setRotationPoint(-21F, 1F, -10F);

		tenderheavyModel[30].addBox(0F, 0F, 0F, 31, 4, 1, 0F); // Box 32
		tenderheavyModel[30].setRotationPoint(-24F, -1F, -10F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 31; i++)
		{
			tenderheavyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tenderheavyModel[];
}
