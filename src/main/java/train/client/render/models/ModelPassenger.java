package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;

public class ModelPassenger extends ModelBase {

	public ModelPassenger() {

		sideModels = new CustomModelRenderer[19];

		sideModels[0] = new CustomModelRenderer(this, 41, 80, 128, 128);
		sideModels[0].addBox(0F, 0F, 0F, 28, 1, 14, 0.0F);
		sideModels[0].setPosition(0F, 0F, 0);

		sideModels[1] = new CustomModelRenderer(this, 17, 10, 128, 128);
		sideModels[1].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		sideModels[1].setPosition(0F, -8F, 0);

		sideModels[2] = new CustomModelRenderer(this, 58, 21, 128, 128);
		sideModels[2].addBox(0F, 0F, 0F, 20, 7, 1, 0.0F);
		sideModels[2].setPosition(4F, -7F, 0);

		sideModels[3] = new CustomModelRenderer(this, 23, 10, 128, 128);
		sideModels[3].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		sideModels[3].setPosition(27F, -8F, 0);

		sideModels[4] = new CustomModelRenderer(this, 10, 10, 128, 128);
		sideModels[4].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		sideModels[4].setPosition(0F, -8F, 13);

		sideModels[5] = new CustomModelRenderer(this, 2, 10, 128, 128);
		sideModels[5].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		sideModels[5].setPosition(27F, -8F, 13);

		sideModels[6] = new CustomModelRenderer(this, 5, 107, 128, 128);
		sideModels[6].addBox(0F, 0F, 0F, 1, 7, 12, 0.0F);
		sideModels[6].setPosition(4F, -7F, 1);

		sideModels[7] = new CustomModelRenderer(this, 58, 35, 128, 128);
		sideModels[7].addBox(0F, 0F, 0F, 20, 7, 1, 0.0F);
		sideModels[7].setPosition(4F, -7F, 13);

		sideModels[8] = new CustomModelRenderer(this, 4, 83, 128, 128);
		sideModels[8].addBox(0F, 0F, 0F, 1, 7, 12, 0.0F);
		sideModels[8].setPosition(23F, -7F, 1);

		sideModels[9] = new CustomModelRenderer(this, 36, 26, 128, 128);
		sideModels[9].addBox(0F, 0F, 0F, 1, 8, 2, 0.0F);
		sideModels[9].setPosition(0F, -8F, 6);

		sideModels[10] = new CustomModelRenderer(this, 36, 10, 128, 128);
		sideModels[10].addBox(0F, 0F, 0F, 1, 8, 2, 0.0F);
		sideModels[10].setPosition(27F, -8F, 6);

		sideModels[11] = new CustomModelRenderer(this, 10, 29, 128, 128);
		sideModels[11].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		sideModels[11].setPosition(4F, -19F, 0);

		sideModels[12] = new CustomModelRenderer(this, 24, 29, 128, 128);
		sideModels[12].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		sideModels[12].setPosition(4F, -19F, 13);

		sideModels[13] = new CustomModelRenderer(this, 39, 106, 128, 128);
		sideModels[13].addBox(0F, 0F, 0F, 28, 1, 16, 0.0F);
		sideModels[13].setPosition(0F, -20F, -1);

		sideModels[14] = new CustomModelRenderer(this, 3, 54, 128, 128);
		sideModels[14].addBox(0F, 0F, 0F, 1, 1, 16, 0.0F);
		sideModels[14].setPosition(0F, -9F, -1);

		sideModels[15] = new CustomModelRenderer(this, 3, 54, 128, 128);
		sideModels[15].addBox(0F, 0F, 0F, 1, 1, 16, 0.0F);
		sideModels[15].setPosition(27F, -9F, -1);

		sideModels[16] = new CustomModelRenderer(this, 52, 59, 128, 128);
		sideModels[16].addBox(0F, 0F, 0F, 25, 2, 10, 0.0F);
		sideModels[16].setPosition(2F, 1F, 2);

		sideModels[17] = new CustomModelRenderer(this, 3, 29, 128, 128);
		sideModels[17].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		sideModels[17].setPosition(23F, -19F, 0);

		sideModels[18] = new CustomModelRenderer(this, 17, 29, 128, 128);
		sideModels[18].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		sideModels[18].setPosition(23F, -19F, 13);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 19; i++) {
			sideModels[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public CustomModelRenderer sideModels[];

}