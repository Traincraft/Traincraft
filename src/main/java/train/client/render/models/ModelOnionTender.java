//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.04.2019 - 10:00:29
// Last changed on: 16.04.2019 - 10:00:29

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelOnionTender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOnionTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 15
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 44 liveryimg 1
		bodyModel[41] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 45 liveryimg 1
		bodyModel[42] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 393, 25, textureX, textureY, "lamp"); // Box 49 lamp
		bodyModel[46] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 50

		bodyModel[0].addBox(0F, 0F, 0F, 25, 11, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-11F, -12.5F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-11F, -16.5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-11F, -16.5F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-11F, -16.5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 25, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-11F, -1.5F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[5].setRotationPoint(-11F, -1.5F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 25, 4, 16, 0F); // Box 6
		bodyModel[6].setRotationPoint(-11F, -1.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 7
		bodyModel[7].setRotationPoint(-12F, -2.5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 9
		bodyModel[8].setRotationPoint(-6.5F, 6F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 26, 1, 22, 0F); // Box 11
		bodyModel[9].setRotationPoint(-12F, 2F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 13
		bodyModel[10].setRotationPoint(5.5F, 6F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 15
		bodyModel[11].setRotationPoint(-9F, 4F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-9F, 6F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-5F, 6F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 18
		bodyModel[14].setRotationPoint(7F, 6F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(3F, 6F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-7F, 5F, -7.5F);
		bodyModel[16].rotateAngleX = -0.43633231F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(5F, 5F, -7.5F);
		bodyModel[17].rotateAngleX = -0.43633231F;

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 15
		bodyModel[18].setRotationPoint(-6F, 6.5F, -6F);

		bodyModel[19].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 23
		bodyModel[19].setRotationPoint(-6F, 6.5F, 6F);

		bodyModel[20].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 24
		bodyModel[20].setRotationPoint(6F, 6.5F, 6F);

		bodyModel[21].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 25
		bodyModel[21].setRotationPoint(6F, 6.5F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 3, 15, 0F); // Box 26
		bodyModel[22].setRotationPoint(-3F, 5F, -7.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[23].setRotationPoint(-6.5F, 7F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 28
		bodyModel[24].setRotationPoint(5.5F, 7F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 29
		bodyModel[25].setRotationPoint(5.5F, 7F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 30
		bodyModel[26].setRotationPoint(-6.5F, 7F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-5F, 6F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-9F, 6F, 6F);

		bodyModel[29].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 33
		bodyModel[29].setRotationPoint(-9F, 4F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(3F, 6F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 35
		bodyModel[31].setRotationPoint(7F, 6F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(5F, 5.8F, 5.5F);
		bodyModel[32].rotateAngleX = 0.43633231F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-7F, 5.8F, 5.5F);
		bodyModel[33].rotateAngleX = 0.43633231F;

		bodyModel[34].addBox(0F, 0F, 0F, 4, 4, 18, 0F); // Box 38
		bodyModel[34].setRotationPoint(9.5F, 3F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-11.5F, 3F, -5.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 40
		bodyModel[36].setRotationPoint(-14F, 0F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 41
		bodyModel[37].setRotationPoint(-8F, -0.5F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 42
		bodyModel[38].setRotationPoint(-14F, 0F, -11.06F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 43
		bodyModel[39].setRotationPoint(-14F, 0F, 11.06F);

		bodyModel[40].addBox(0F, 0F, 0F, 13, 4, 0, 0F); // Box 44 liveryimg 1
		bodyModel[40].setRotationPoint(-5F, -8F, -11.01F);

		bodyModel[41].addBox(0F, 0F, 0F, 13, 4, 0, 0F); // Box 45 liveryimg 1
		bodyModel[41].setRotationPoint(-5F, -8F, 11.01F);

		bodyModel[42].addBox(0F, 0F, 0F, 36, 2, 3, 0F); // Box 46
		bodyModel[42].setRotationPoint(-18F, 3F, -1.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 17, 16, 0F); // Box 47
		bodyModel[43].setRotationPoint(13F, -11F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 48
		bodyModel[44].setRotationPoint(-11.5F, -10F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 49 lamp
		bodyModel[45].setRotationPoint(12.5F, -13F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 50
		bodyModel[46].setRotationPoint(-4F, -17F, -2F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (ModelRendererTurbo m : bodyModel) {
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if (m.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
}