package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;

public class ModelPassenger extends ModelBase {

	public ModelPassenger() {

		bodyModel = new CustomModelRenderer[19];

		bodyModel[0] = new CustomModelRenderer(this, 41, 80, 128, 128);
		bodyModel[0].addBox(0F, 0F, 0F, 28, 1, 14, 0.0F);
		bodyModel[0].setPosition(0F, 0F, 0);

		bodyModel[1] = new CustomModelRenderer(this, 17, 10, 128, 128);
		bodyModel[1].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		bodyModel[1].setPosition(0F, -8F, 0);

		bodyModel[2] = new CustomModelRenderer(this, 58, 21, 128, 128);
		bodyModel[2].addBox(0F, 0F, 0F, 20, 7, 1, 0.0F);
		bodyModel[2].setPosition(4F, -7F, 0);

		bodyModel[3] = new CustomModelRenderer(this, 23, 10, 128, 128);
		bodyModel[3].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		bodyModel[3].setPosition(27F, -8F, 0);

		bodyModel[4] = new CustomModelRenderer(this, 10, 10, 128, 128);
		bodyModel[4].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		bodyModel[4].setPosition(0F, -8F, 13);

		bodyModel[5] = new CustomModelRenderer(this, 2, 10, 128, 128);
		bodyModel[5].addBox(0F, 0F, 0F, 1, 8, 1, 0.0F);
		bodyModel[5].setPosition(27F, -8F, 13);

		bodyModel[6] = new CustomModelRenderer(this, 5, 107, 128, 128);
		bodyModel[6].addBox(0F, 0F, 0F, 1, 7, 12, 0.0F);
		bodyModel[6].setPosition(4F, -7F, 1);

		bodyModel[7] = new CustomModelRenderer(this, 58, 35, 128, 128);
		bodyModel[7].addBox(0F, 0F, 0F, 20, 7, 1, 0.0F);
		bodyModel[7].setPosition(4F, -7F, 13);

		bodyModel[8] = new CustomModelRenderer(this, 4, 83, 128, 128);
		bodyModel[8].addBox(0F, 0F, 0F, 1, 7, 12, 0.0F);
		bodyModel[8].setPosition(23F, -7F, 1);

		bodyModel[9] = new CustomModelRenderer(this, 36, 26, 128, 128);
		bodyModel[9].addBox(0F, 0F, 0F, 1, 8, 2, 0.0F);
		bodyModel[9].setPosition(0F, -8F, 6);

		bodyModel[10] = new CustomModelRenderer(this, 36, 10, 128, 128);
		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 2, 0.0F);
		bodyModel[10].setPosition(27F, -8F, 6);

		bodyModel[11] = new CustomModelRenderer(this, 10, 29, 128, 128);
		bodyModel[11].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		bodyModel[11].setPosition(4F, -19F, 0);

		bodyModel[12] = new CustomModelRenderer(this, 24, 29, 128, 128);
		bodyModel[12].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		bodyModel[12].setPosition(4F, -19F, 13);

		bodyModel[13] = new CustomModelRenderer(this, 39, 106, 128, 128);
		bodyModel[13].addBox(0F, 0F, 0F, 28, 1, 16, 0.0F);
		bodyModel[13].setPosition(0F, -20F, -1);

		bodyModel[14] = new CustomModelRenderer(this, 3, 54, 128, 128);
		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 16, 0.0F);
		bodyModel[14].setPosition(0F, -9F, -1);

		bodyModel[15] = new CustomModelRenderer(this, 3, 54, 128, 128);
		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 16, 0.0F);
		bodyModel[15].setPosition(27F, -9F, -1);

		bodyModel[16] = new CustomModelRenderer(this, 52, 59, 128, 128);
		bodyModel[16].addBox(0F, 0F, 0F, 25, 2, 10, 0.0F);
		bodyModel[16].setPosition(2F, 1F, 2);

		bodyModel[17] = new CustomModelRenderer(this, 3, 29, 128, 128);
		bodyModel[17].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		bodyModel[17].setPosition(23F, -19F, 0);

		bodyModel[18] = new CustomModelRenderer(this, 17, 29, 128, 128);
		bodyModel[18].addBox(0F, 0F, 0F, 1, 12, 1, 0.0F);
		bodyModel[18].setPosition(23F, -19F, 13);



	}

}