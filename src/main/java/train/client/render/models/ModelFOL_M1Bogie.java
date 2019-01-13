//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FOL-M1 Trucks
// Model Creator:
// Created on:06.12.2018 - 11:26:06
// Last changed on: 06.12.2018 - 11:26:06

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelFOL_M1Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelFOL_M1Bogie()
	{
		fol_m1bogiesModel = new ModelRendererTurbo[17];
		fol_m1bogiesModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 273
		fol_m1bogiesModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 274
		fol_m1bogiesModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 276
		fol_m1bogiesModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 277
		fol_m1bogiesModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 278
		fol_m1bogiesModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 279
		fol_m1bogiesModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 280
		fol_m1bogiesModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 281
		fol_m1bogiesModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 282
		fol_m1bogiesModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 283
		fol_m1bogiesModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 284
		fol_m1bogiesModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 285
		fol_m1bogiesModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 286
		fol_m1bogiesModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 287
		fol_m1bogiesModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 288
		fol_m1bogiesModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 289
		fol_m1bogiesModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 290

		fol_m1bogiesModel[0].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 273
		fol_m1bogiesModel[0].setRotationPoint(-16F, 2F, 12F);

		fol_m1bogiesModel[1].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 274
		fol_m1bogiesModel[1].setRotationPoint(-22F, 5F, 7F);

		fol_m1bogiesModel[2].addBox(0F, 0F, 0F, 16, 1, 6, 0F); // Box 276
		fol_m1bogiesModel[2].setRotationPoint(-22F, 6F, 11F);

		fol_m1bogiesModel[3].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 277
		fol_m1bogiesModel[3].setRotationPoint(-7F, 5F, 7F);

		fol_m1bogiesModel[4].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 278
		fol_m1bogiesModel[4].setRotationPoint(-22F, 4F, 9F);

		fol_m1bogiesModel[5].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 279
		fol_m1bogiesModel[5].setRotationPoint(-22F, 4F, 18F);

		fol_m1bogiesModel[6].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 280
		fol_m1bogiesModel[6].setRotationPoint(-24F, 3F, 8F);

		fol_m1bogiesModel[7].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 281
		fol_m1bogiesModel[7].setRotationPoint(-9F, 3F, 8F);

		fol_m1bogiesModel[8].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 282
		fol_m1bogiesModel[8].setRotationPoint(-9F, 3F, 20F);

		fol_m1bogiesModel[9].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 283
		fol_m1bogiesModel[9].setRotationPoint(-24F, 3F, 20F);

		fol_m1bogiesModel[10].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 284
		fol_m1bogiesModel[10].setRotationPoint(-14.5F, 5F, 7F);

		fol_m1bogiesModel[11].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 285
		fol_m1bogiesModel[11].setRotationPoint(-16.5F, 3F, 20F);

		fol_m1bogiesModel[12].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 286
		fol_m1bogiesModel[12].setRotationPoint(-16.5F, 3F, 8F);

		fol_m1bogiesModel[13].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 287
		fol_m1bogiesModel[13].setRotationPoint(-22F, 4F, 7F);

		fol_m1bogiesModel[14].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 288
		fol_m1bogiesModel[14].setRotationPoint(-22F, 4F, 20F);

		fol_m1bogiesModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		fol_m1bogiesModel[15].setRotationPoint(-21F, 3F, 12F);

		fol_m1bogiesModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		fol_m1bogiesModel[16].setRotationPoint(-12F, 3F, 12F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 17; i++)
		{
			fol_m1bogiesModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo fol_m1bogiesModel[];
}