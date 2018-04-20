//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:12.10.2017 - 23:59:30
// Last changed on: 12.10.2017 - 23:59:30

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class BR185_BogieModel extends ModelBase
{
	int textureX = 128;
	int textureY = 32;

	public BR185_BogieModel()
	{
		br101_bogieModel = new ModelRendererTurbo[13];
		br101_bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		br101_bogieModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		br101_bogieModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		br101_bogieModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		br101_bogieModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		br101_bogieModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		br101_bogieModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		br101_bogieModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		br101_bogieModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		br101_bogieModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		br101_bogieModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 17
		br101_bogieModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 18
		br101_bogieModel[12] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 19

		br101_bogieModel[0].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		br101_bogieModel[0].setRotationPoint(-9F, 0F, 5F);

		br101_bogieModel[1].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		br101_bogieModel[1].setRotationPoint(2F, 0F, 5F);

		br101_bogieModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		br101_bogieModel[2].setRotationPoint(-7F, 2F, 5F);

		br101_bogieModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		br101_bogieModel[3].setRotationPoint(-7F, 0F, 5F);

		br101_bogieModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		br101_bogieModel[4].setRotationPoint(4F, 0F, 5F);

		br101_bogieModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		br101_bogieModel[5].setRotationPoint(-2F, 0F, 5F);

		br101_bogieModel[6].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		br101_bogieModel[6].setRotationPoint(2F, 0F, -6.5F);

		br101_bogieModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		br101_bogieModel[7].setRotationPoint(-9F, 0F, -6.5F);

		br101_bogieModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		br101_bogieModel[8].setRotationPoint(4F, 0F, -7.5F);

		br101_bogieModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		br101_bogieModel[9].setRotationPoint(-7F, 2F, -7.5F);

		br101_bogieModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		br101_bogieModel[10].setRotationPoint(-2F, 0F, -7.5F);

		br101_bogieModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		br101_bogieModel[11].setRotationPoint(-7F, 0F, -7.5F);

		br101_bogieModel[12].addShapeBox(0F, 0F, 0F, 12, 3, 12, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 19
		br101_bogieModel[12].setRotationPoint(-7F, 0F, -7F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 13; i++)
		{
			br101_bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo br101_bogieModel[];
}