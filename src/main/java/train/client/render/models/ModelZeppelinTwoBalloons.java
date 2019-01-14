package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;

public class ModelZeppelinTwoBalloons extends ModelBase {

	public ModelZeppelinTwoBalloons() {
		l = 24;
		zepSides = new CustomModelRenderer[l];

		lastframe = System.nanoTime();
		helice = 0.0F;

		zepSides[2] = new CustomModelRenderer(this, 5, 127, 512, 256);
		zepSides[11] = new CustomModelRenderer(this, 24, 137, 512, 256);
		zepSides[22] = new CustomModelRenderer(this, 246, 17, 512, 256);
		zepSides[19] = new CustomModelRenderer(this, 103, 144, 512, 256);
		zepSides[0] = new CustomModelRenderer(this, 1, 71, 512, 256);
		zepSides[13] = new CustomModelRenderer(this, 4, 116, 512, 256);
		zepSides[21] = new CustomModelRenderer(this, 394, 133, 512, 256);
		zepSides[9] = new CustomModelRenderer(this, 2, 42, 512, 256);
		zepSides[7] = new CustomModelRenderer(this, 133, 2, 512, 256);
		zepSides[14] = new CustomModelRenderer(this, 104, 83, 512, 256);
		zepSides[20] = new CustomModelRenderer(this, 103, 144, 512, 256);
		zepSides[5] = new CustomModelRenderer(this, 104, 131, 512, 256);
		zepSides[10] = new CustomModelRenderer(this, 100, 99, 512, 256);
		zepSides[23] = new CustomModelRenderer(this, 1, 72, 512, 256);
		zepSides[18] = new CustomModelRenderer(this, 105, 82, 512, 256);
		zepSides[12] = new CustomModelRenderer(this, 4, 116, 512, 256);
		zepSides[3] = new CustomModelRenderer(this, 5, 127, 512, 256);
		zepSides[16] = new CustomModelRenderer(this, 4, 116, 512, 256);
		zepSides[6] = new CustomModelRenderer(this, 133, 2, 512, 256);
		zepSides[4] = new CustomModelRenderer(this, 101, 130, 512, 256);
		zepSides[8] = new CustomModelRenderer(this, 98, 87, 512, 256);
		zepSides[15] = new CustomModelRenderer(this, 4, 116, 512, 256);
		zepSides[1] = new CustomModelRenderer(this, 1, 79, 512, 256);
		zepSides[17] = new CustomModelRenderer(this, 246, 17, 512, 256);

		zepSides[2].addBox(0F, 0F, 0F, 32, 4, 4, 0.0F);
		zepSides[2].setPosition(10F, 1F, -1F);
		zepSides[11].addBox(0F, 0F, 0F, 22, 11, 12, 0.0F);
		zepSides[11].setPosition(-11F, -2F, -27F);
		zepSides[22].addBox(0F, 0F, 0F, 54, 4, 7, 0.0F);
		zepSides[22].setPosition(-27F, 46F, 19F);
		zepSides[19].addBox(0F, 0F, 0F, 6, 4, 10, 0.0F);
		zepSides[19].setPosition(7F, 0F, -23F);
		zepSides[0].addBox(0F, 0F, 0F, 3, 9, 32, 0.0F);
		zepSides[0].setPosition(8F, 0F, -15F);
		zepSides[13].addBox(0F, 0F, 0F, 4, 44, 4, 0.0F);
		zepSides[13].setPosition(-12F, 6F, 13F);
		zepSides[21].addBox(0F, 0F, 0F, 16, 10, 1, 0.0F);
		zepSides[21].setPosition(-8F, -1F, -15F);
		zepSides[9].addBox(0F, 0F, 0F, 6, 18, 7, 0.0F);
		zepSides[9].setPosition(-3F, 11F, 25F);
		zepSides[7].addBox(-2F, -16F, 0F, 4, 34, 2, 0.0F);
		zepSides[7].setPosition(-41F, 3F, -13F);
		zepSides[14].addBox(0F, 0F, 0F, 39, 32, 140, 0.0F);
		zepSides[14].setPosition(-65F, 46F, -71F);
		zepSides[20].addBox(0F, 0F, 0F, 6, 4, 10, 0.0F);
		zepSides[20].setPosition(-11F, 0F, -26F);
		zepSides[5].addBox(0F, 0F, -13F, 4, 4, 10, 0.0F);
		zepSides[5].setPosition(-43F, 1F, 2F);
		zepSides[10].addBox(0F, 0F, 0F, 12, 5, 12, 0.0F);
		zepSides[10].setPosition(-6F, 25F, 37F);
		zepSides[23].addBox(0F, 0F, 0F, 3, 9, 32, 0.0F);
		zepSides[23].setPosition(-11F, 0F, -15F);
		zepSides[18].addBox(0F, 0F, 0F, 39, 32, 140, 0.0F);
		zepSides[18].setPosition(26F, 46F, -70F);
		zepSides[12].addBox(-1F, -1F, -8F, 4, 44, 4, 0.0F);
		zepSides[12].setPosition(7F, 9F, 20F);
		zepSides[3].addBox(0F, 0F, 0F, 32, 4, 4, 0.0F);
		zepSides[3].setPosition(-43F, 1F, -1F);
		zepSides[16].addBox(1F, 0F, 0F, 4, 44, 4, 0.0F);
		zepSides[16].setPosition(-12F, 6F, -15F);
		zepSides[6].addBox(-2F, -17F, 0F, 4, 34, 2, 0.0F);
		zepSides[6].setPosition(40F, 3F, -13F);
		zepSides[4].addBox(0F, 0F, -14F, 4, 4, 10, 0.0F);
		zepSides[4].setPosition(38F, 1F, 3F);
		zepSides[8].addBox(0F, 0F, 0F, 22, 14, 12, 0.0F);
		zepSides[8].setPosition(-11F, -2F, 17F);
		zepSides[15].addBox(3F, 0F, -6F, 4, 44, 4, 0.0F);
		zepSides[15].setPosition(7F, 9F, -8F);
		zepSides[1].addBox(0F, 0F, 0F, 22, 2, 32, 0.0F);
		zepSides[1].setPosition(-11F, -2F, -15F);
		zepSides[17].addBox(0F, 0F, 0F, 54, 4, 7, 0.0F);
		zepSides[17].setPosition(-27F, 46F, -23F);

		zepSides[19].rotateAngleY = -5.567600313861911F;
		zepSides[13].rotateAngleY = -5.846852994181004F;
		zepSides[13].rotateAngleZ = -5.846852994181004F;
		zepSides[9].rotateAngleX = -5.427973973702365F;
		// zepSides[9].rotateAngleY = 6.283185307179586F;
		zepSides[7].rotateAngleZ = 5.759586531581287F;// hélice
		zepSides[20].rotateAngleY = -0.7155849933176751F;
		zepSides[10].rotateAngleX = -5.427973973702365F;
		zepSides[12].rotateAngleY = -0.4363323129985824F;
		zepSides[12].rotateAngleZ = -0.4363323129985824F;
		zepSides[16].rotateAngleY = -0.4363323129985824F;
		zepSides[16].rotateAngleZ = -5.846852994181004F;
		zepSides[6].rotateAngleZ = 0.4188790204786391F;// hélice
		zepSides[15].rotateAngleY = -5.846852994181004F;
		zepSides[15].rotateAngleZ = -0.4363323129985824F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}

		if (((EntityZeppelinTwoBalloons) entity).getFuel() > 0) {
			long now = System.nanoTime();
			int elapsed = (int) ((now - lastframe) / (1000 * 1000));
			helice -= (float) elapsed / 300.0f;
			lastframe = now;

			zepSides[6].rotateAngleZ = helice + helice1;
			zepSides[7].rotateAngleZ = helice + helice2;
		}

		for (int i = 0; i < l; i++) {
			zepSides[i].render(f5);

		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public CustomModelRenderer zepSides[];
	public float helice1 = 0.4188790204786391F;
	public float helice2 = 5.759586531581287F;
	private long lastframe;
	private float helice;
	private int l;
}
