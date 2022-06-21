//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.10.2020 - 12:47:57
// Last changed on: 18.10.2020 - 12:47:57

package train.client.render.renderSwitch.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelautoSwitchOn extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelautoSwitchOn() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 29, 26, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 26, 44, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box Glow
		bodyModel[7] = new ModelRendererTurbo(this, 9, 36, textureX, textureY); // Box Glow
		bodyModel[8] = new ModelRendererTurbo(this, 16, 35, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 26, 15, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 26, 41, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 34

		bodyModel[0].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 9F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-27F, 9F, 2F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 7F, -3F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[3].setRotationPoint(-23F, 9F, 0.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[4].setRotationPoint(-9F, 9F, 0.75F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 2
		bodyModel[5].setRotationPoint(2F, 3F, 2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box Glow
		bodyModel[6].setRotationPoint(2F, 2.75F, 1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box Glow
		bodyModel[7].setRotationPoint(2F, 2.75F, 3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 2
		bodyModel[8].setRotationPoint(2F, 2.9F, 1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 3
		bodyModel[9].setRotationPoint(1F, 5F, 1F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 3
		bodyModel[10].setRotationPoint(1F, 6F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[11].setRotationPoint(-23F, 9F, -1.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[12].setRotationPoint(-9F, 9F, -1.75F);
	}
	/*
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 13; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}


		}

	}

	 */


}