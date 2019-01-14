package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelLoco3 extends ModelBase {

	public ModelLoco3() {
		sideModels = new CustomModelRenderer[19];

		sideModels[0] = new CustomModelRenderer(this, 0, 0, 128, 128);
		sideModels[1] = new CustomModelRenderer(this, 43, 112, 128, 128);
		sideModels[2] = new CustomModelRenderer(this, 64, 0, 128, 128);
		sideModels[3] = new CustomModelRenderer(this, 0, 103, 128, 128);
		sideModels[4] = new CustomModelRenderer(this, 60, 42, 128, 128);
		sideModels[5] = new CustomModelRenderer(this, 18, 68, 128, 128);
		sideModels[6] = new CustomModelRenderer(this, 0, 24, 128, 128);
		sideModels[7] = new CustomModelRenderer(this, 0, 68, 128, 128);
		sideModels[8] = new CustomModelRenderer(this, 0, 24, 128, 128);
		sideModels[9] = new CustomModelRenderer(this, 88, 26, 128, 128);
		sideModels[10] = new CustomModelRenderer(this, 0, 12, 128, 128);
		sideModels[11] = new CustomModelRenderer(this, 88, 57, 128, 128);
		sideModels[12] = new CustomModelRenderer(this, 0, 40, 128, 128);
		sideModels[13] = new CustomModelRenderer(this, 0, 40, 128, 128);
		sideModels[14] = new CustomModelRenderer(this, 39, 0, 128, 128);
		sideModels[15] = new CustomModelRenderer(this, 60, 42, 128, 128);
		sideModels[16] = new CustomModelRenderer(this, 60, 94, 128, 128);
		sideModels[17] = new CustomModelRenderer(this, 7, 59, 128, 128);
		sideModels[18] = new CustomModelRenderer(this, 0, 37, 128, 128);

		sideModels[0].addBox(0F, 0F, 0F, 6, 4, 8, 0.0F);
		sideModels[0].setPosition(-3F, 8F, 8F);
		sideModels[1].addBox(0F, 0F, 0F, 4, 12, 4, 0.0F);
		sideModels[1].setPosition(-2F, 24F, 12F);
		sideModels[2].addBox(0F, 0F, 0F, 20, 4, 12, 0.0F);
		sideModels[2].setPosition(-10F, 4F, 8F);
		sideModels[3].addBox(0F, 0F, 0F, 20, 24, 1, 0.0F);
		sideModels[3].setPosition(-10F, 12F, -1F);
		sideModels[4].addBox(0F, 0F, 0F, 1, 1, 13, 0.0F);
		sideModels[4].setPosition(6F, 5F, -11F);
		sideModels[5].addBox(0F, 0F, 0F, 1, 12, 8, 0.0F);
		sideModels[5].setPosition(9F, 24F, -9F);
		sideModels[6].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		sideModels[6].setPosition(4F, 0F, -4F);
		sideModels[7].addBox(0F, 0F, 0F, 1, 12, 8, 0.0F);
		sideModels[7].setPosition(-10F, 24F, -9F);
		sideModels[8].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		sideModels[8].setPosition(4F, 0F, -16F);
		sideModels[9].addBox(0F, 0F, 0F, 1, 12, 19, 0.0F);
		sideModels[9].setPosition(-10F, 12F, -20F);
		sideModels[10].addBox(0F, 0F, 0F, 6, 6, 6, 0.0F);
		sideModels[10].setPosition(-3F, 24F, 3F);
		sideModels[11].addBox(0F, 0F, 0F, 1, 12, 19, 0.0F);
		sideModels[11].setPosition(9F, 12F, -20F);
		sideModels[12].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		sideModels[12].setPosition(-6F, 0F, -16F);
		sideModels[13].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		sideModels[13].setPosition(-6F, 0F, -4F);
		sideModels[14].addBox(0F, 0F, 0F, 6, 8, 6, 0.0F);
		sideModels[14].setPosition(-3F, 22F, 16F);
		sideModels[15].addBox(0F, 0F, 0F, 1, 1, 13, 0.0F);
		sideModels[15].setPosition(-7F, 5F, -14F);
		sideModels[16].addBox(0F, 0F, 0F, 12, 12, 22, 0.0F);
		sideModels[16].setPosition(-6F, 12F, -4F);
		sideModels[17].addBox(0F, 0F, 0F, 20, 4, 30, 0.0F);
		sideModels[17].setPosition(-10F, 8F, -22F);
		sideModels[18].addBox(0F, 0F, 0F, 20, 1, 20, 0.0F);
		sideModels[18].setPosition(-10F, 36F, -20F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		// super.render(entity, f, f1, f2, f3, f4, f5);

		for (int i = 0; i < 19; i++) {
			sideModels[i].render(f5);

		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public CustomModelRenderer sideModels[];

}
