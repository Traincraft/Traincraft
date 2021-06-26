//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CD151-bogie
// Model Creator:
// Created on:15.10.2018 - 18:32:20
// Last changed on: 15.10.2018 - 18:32:20

package train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelRendererTurbo;

public class ModelCD151Bogie extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelCD151Bogie()
	{
		cd151bogieModel = new ModelRendererTurbo[28];
		cd151bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		cd151bogieModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		cd151bogieModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		cd151bogieModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		cd151bogieModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		cd151bogieModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		cd151bogieModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		cd151bogieModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		cd151bogieModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 10
		cd151bogieModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		cd151bogieModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		cd151bogieModel[11] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 13
		cd151bogieModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		cd151bogieModel[13] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 15
		cd151bogieModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 16
		cd151bogieModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 17
		cd151bogieModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 18
		cd151bogieModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		cd151bogieModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
		cd151bogieModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 21
		cd151bogieModel[20] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 22
		cd151bogieModel[21] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 23
		cd151bogieModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		cd151bogieModel[23] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 26
		cd151bogieModel[24] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 27
		cd151bogieModel[25] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 28
		cd151bogieModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		cd151bogieModel[27] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 30

		cd151bogieModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		cd151bogieModel[0].setRotationPoint(1.5F, 0F, 0F);

		cd151bogieModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		cd151bogieModel[1].setRotationPoint(1.5F, 0F, 12F);

		cd151bogieModel[2].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 2
		cd151bogieModel[2].setRotationPoint(3.5F, 2F, -1.5F);

		cd151bogieModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 3
		cd151bogieModel[3].setRotationPoint(2.5F, 1F, -1.5F);

		cd151bogieModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 4
		cd151bogieModel[4].setRotationPoint(4.5F, 1F, -1.5F);

		cd151bogieModel[5].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		cd151bogieModel[5].setRotationPoint(0F, -1F, -1.5F);

		cd151bogieModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 8
		cd151bogieModel[6].setRotationPoint(4.5F, 1F, 12.5F);

		cd151bogieModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 9
		cd151bogieModel[7].setRotationPoint(2.5F, 1F, 12.5F);

		cd151bogieModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		cd151bogieModel[8].setRotationPoint(0F, -1F, 12.5F);

		cd151bogieModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 11
		cd151bogieModel[9].setRotationPoint(13.5F, 1F, 12.5F);

		cd151bogieModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 12
		cd151bogieModel[10].setRotationPoint(11.5F, 1F, 12.5F);

		cd151bogieModel[11].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 13
		cd151bogieModel[11].setRotationPoint(12.5F, 2F, -1.5F);

		cd151bogieModel[12].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 14
		cd151bogieModel[12].setRotationPoint(10.5F, 0F, 12F);

		cd151bogieModel[13].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 15
		cd151bogieModel[13].setRotationPoint(10.5F, 0F, 0F);

		cd151bogieModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 16
		cd151bogieModel[14].setRotationPoint(13.5F, 1F, -1.5F);

		cd151bogieModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 17
		cd151bogieModel[15].setRotationPoint(11.5F, 1F, -1.5F);

		cd151bogieModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		cd151bogieModel[16].setRotationPoint(0F, -1F, -0.5F);

		cd151bogieModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		cd151bogieModel[17].setRotationPoint(16F, -1F, -0.5F);

		cd151bogieModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
		cd151bogieModel[18].setRotationPoint(7F, 1F, -1.5F);

		cd151bogieModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 21
		cd151bogieModel[19].setRotationPoint(6F, 1F, -1.5F);

		cd151bogieModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 22
		cd151bogieModel[20].setRotationPoint(10F, 1F, -1.5F);

		cd151bogieModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 23
		cd151bogieModel[21].setRotationPoint(6F, 1F, 12.5F);

		cd151bogieModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 25
		cd151bogieModel[22].setRotationPoint(10F, 1F, 12.5F);

		cd151bogieModel[23].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		cd151bogieModel[23].setRotationPoint(7F, -1F, 1F);

		cd151bogieModel[24].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 27
		cd151bogieModel[24].setRotationPoint(7F, -1F, 8F);

		cd151bogieModel[25].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 28
		cd151bogieModel[25].setRotationPoint(12F, 1.5F, 2F);

		cd151bogieModel[26].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 29
		cd151bogieModel[26].setRotationPoint(3F, 1.5F, 2F);

		cd151bogieModel[27].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 30
		cd151bogieModel[27].setRotationPoint(7.5F, -3F, 5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 28; i++)
		{
			cd151bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo cd151bogieModel[];
}