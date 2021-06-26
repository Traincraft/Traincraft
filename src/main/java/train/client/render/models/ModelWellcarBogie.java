//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:21.02.2018 - 18:37:29
// Last changed on: 21.02.2018 - 18:37:29

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelWellcarBogie extends ModelBase
{
	int textureX = 256;
	int textureY = 32;

	public ModelWellcarBogie()
	{
		wellcarbogieModel = new ModelRendererTurbo[13];
		wellcarbogieModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		wellcarbogieModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		wellcarbogieModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		wellcarbogieModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		wellcarbogieModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 15
		wellcarbogieModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 18
		wellcarbogieModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 19
		wellcarbogieModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 20
		wellcarbogieModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		wellcarbogieModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		wellcarbogieModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		wellcarbogieModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		wellcarbogieModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15

		wellcarbogieModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 5
		wellcarbogieModel[0].setRotationPoint(1F, 3F, -2F);

		wellcarbogieModel[1].addBox(0F, 0F, 0F, 7, 2, 0, 0F); // Box 10
		wellcarbogieModel[1].setRotationPoint(-2F, 3F, 13F);

		wellcarbogieModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 12
		wellcarbogieModel[2].setRotationPoint(-3F, 3F, -1.02F);

		wellcarbogieModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		wellcarbogieModel[3].setRotationPoint(0.5F, 0F, 5F);

		wellcarbogieModel[4].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 15
		wellcarbogieModel[4].setRotationPoint(-3F, 2F, 12F);

		wellcarbogieModel[5].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 18
		wellcarbogieModel[5].setRotationPoint(-3F, 2F, -1F);

		wellcarbogieModel[6].addBox(0F, 0F, 0F, 7, 2, 0, 0F); // Box 19
		wellcarbogieModel[6].setRotationPoint(-2F, 3F, -1F);

		wellcarbogieModel[7].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 20
		wellcarbogieModel[7].setRotationPoint(5F, 3F, -1.02F);

		wellcarbogieModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
		wellcarbogieModel[8].setRotationPoint(-2F, 3F, 5F);

		wellcarbogieModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		wellcarbogieModel[9].setRotationPoint(-5F, 1F, 11.98F);

		wellcarbogieModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		wellcarbogieModel[10].setRotationPoint(-5F, 1F, 0.02F);

		wellcarbogieModel[11].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		wellcarbogieModel[11].setRotationPoint(3F, 1F, 0.02F);

		wellcarbogieModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		wellcarbogieModel[12].setRotationPoint(3F, 1F, 11.98F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 13; i++)
		{
			wellcarbogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo wellcarbogieModel[];
}