//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:11.06.2018 - 21:27:03
// Last changed on: 11.06.2018 - 21:27:03

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelPassenger_DB_oriental_bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelPassenger_DB_oriental_bogie()
	{
		passenger_db_oriental_bogieModel = new ModelRendererTurbo[9];
		passenger_db_oriental_bogieModel[0] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 1
		passenger_db_oriental_bogieModel[1] = new ModelRendererTurbo(this, 22, 10, textureX, textureY); // Box 2
		passenger_db_oriental_bogieModel[2] = new ModelRendererTurbo(this, 22, 10, textureX, textureY); // Box 14
		passenger_db_oriental_bogieModel[3] = new ModelRendererTurbo(this, 92, 1, textureX, textureY); // Box 24
		passenger_db_oriental_bogieModel[4] = new ModelRendererTurbo(this, 92, 1, textureX, textureY); // Box 35
		passenger_db_oriental_bogieModel[5] = new ModelRendererTurbo(this, 22, 10, textureX, textureY); // Box 89
		passenger_db_oriental_bogieModel[6] = new ModelRendererTurbo(this, 64, 23, textureX, textureY); // Box 91
		passenger_db_oriental_bogieModel[7] = new ModelRendererTurbo(this, 22, 10, textureX, textureY); // Box 99
		passenger_db_oriental_bogieModel[8] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 9

		passenger_db_oriental_bogieModel[0].addBox(0F, 0F, 0F, 21, 5, 1, 0F); // Box 1
		passenger_db_oriental_bogieModel[0].setRotationPoint(-28F, 1F, -6F);

		passenger_db_oriental_bogieModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2
		passenger_db_oriental_bogieModel[1].setRotationPoint(-12F, 3F, 5.05F);

		passenger_db_oriental_bogieModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 14
		passenger_db_oriental_bogieModel[2].setRotationPoint(-12F, 3F, -5.05F);

		passenger_db_oriental_bogieModel[3].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 24
		passenger_db_oriental_bogieModel[3].setRotationPoint(-13F, 2F, -7F);

		passenger_db_oriental_bogieModel[4].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 35
		passenger_db_oriental_bogieModel[4].setRotationPoint(-24F, 2F, -7F);

		passenger_db_oriental_bogieModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 89
		passenger_db_oriental_bogieModel[5].setRotationPoint(-23F, 3F, -5.05F);

		passenger_db_oriental_bogieModel[6].addBox(0F, 0F, 0F, 21, 3, 10, 0F); // Box 91
		passenger_db_oriental_bogieModel[6].setRotationPoint(-28F, 3F, -5F);

		passenger_db_oriental_bogieModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 99
		passenger_db_oriental_bogieModel[7].setRotationPoint(-23F, 3F, 5.05F);

		passenger_db_oriental_bogieModel[8].addBox(0F, 0F, 0F, 21, 5, 1, 0F); // Box 9
		passenger_db_oriental_bogieModel[8].setRotationPoint(-7F, 1F, 6F);
		passenger_db_oriental_bogieModel[8].rotateAngleY = -3.14159265F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			passenger_db_oriental_bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo passenger_db_oriental_bogieModel[];
}