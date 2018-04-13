//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:10.04.2018 - 11:41:24
// Last changed on: 10.04.2018 - 11:41:24

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGS4TenderBogie extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelGS4TenderBogie()
	{
		gs4tenderbogieModel = new ModelRendererTurbo[27];
		gs4tenderbogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gs4tenderbogieModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gs4tenderbogieModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gs4tenderbogieModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		gs4tenderbogieModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		gs4tenderbogieModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		gs4tenderbogieModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		gs4tenderbogieModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gs4tenderbogieModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		gs4tenderbogieModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		gs4tenderbogieModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 10
		gs4tenderbogieModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 11
		gs4tenderbogieModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 12
		gs4tenderbogieModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		gs4tenderbogieModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		gs4tenderbogieModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 15
		gs4tenderbogieModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 16
		gs4tenderbogieModel[17] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 17
		gs4tenderbogieModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 18
		gs4tenderbogieModel[19] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 19
		gs4tenderbogieModel[20] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 20
		gs4tenderbogieModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 21
		gs4tenderbogieModel[22] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 22
		gs4tenderbogieModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 23
		gs4tenderbogieModel[24] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 24
		gs4tenderbogieModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		gs4tenderbogieModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26

		gs4tenderbogieModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 0
		gs4tenderbogieModel[0].setRotationPoint(-10.5F, 4.5F, 6F);

		gs4tenderbogieModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		gs4tenderbogieModel[1].setRotationPoint(-3F, 4.5F, 6F);

		gs4tenderbogieModel[2].addBox(0F, 0F, 0F, 24, 5, 0, 0F); // Box 2
		gs4tenderbogieModel[2].setRotationPoint(-12F, 4F, 6.05F);

		gs4tenderbogieModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 3
		gs4tenderbogieModel[3].setRotationPoint(4.5F, 4.5F, 6F);

		gs4tenderbogieModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
		gs4tenderbogieModel[4].setRotationPoint(-8F, 7F, -6F);

		gs4tenderbogieModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
		gs4tenderbogieModel[5].setRotationPoint(-0.5F, 7F, -6F);

		gs4tenderbogieModel[6].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 6
		gs4tenderbogieModel[6].setRotationPoint(7F, 7F, -6F);

		gs4tenderbogieModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		gs4tenderbogieModel[7].setRotationPoint(-8F, 7F, 6F);

		gs4tenderbogieModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		gs4tenderbogieModel[8].setRotationPoint(7F, 7F, 6F);

		gs4tenderbogieModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		gs4tenderbogieModel[9].setRotationPoint(-0.5F, 7F, 6F);

		gs4tenderbogieModel[10].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 10
		gs4tenderbogieModel[10].setRotationPoint(3F, 4F, -6F);

		gs4tenderbogieModel[11].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 11
		gs4tenderbogieModel[11].setRotationPoint(-5F, 4F, -6F);

		gs4tenderbogieModel[12].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 12
		gs4tenderbogieModel[12].setRotationPoint(-12F, 5F, -6F);

		gs4tenderbogieModel[13].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 13
		gs4tenderbogieModel[13].setRotationPoint(11F, 5F, -6F);

		gs4tenderbogieModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		gs4tenderbogieModel[14].setRotationPoint(-4.75F, 6F, 6F);

		gs4tenderbogieModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		gs4tenderbogieModel[15].setRotationPoint(2.75F, 6F, 6F);

		gs4tenderbogieModel[16].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 16
		gs4tenderbogieModel[16].setRotationPoint(-10.5F, 4.5F, -6F);

		gs4tenderbogieModel[17].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 17
		gs4tenderbogieModel[17].setRotationPoint(-3F, 4.5F, -6F);

		gs4tenderbogieModel[18].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 18
		gs4tenderbogieModel[18].setRotationPoint(4.5F, 4.5F, -6F);

		gs4tenderbogieModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gs4tenderbogieModel[19].setRotationPoint(-8F, 7F, -7F);

		gs4tenderbogieModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gs4tenderbogieModel[20].setRotationPoint(7F, 7F, -7F);

		gs4tenderbogieModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gs4tenderbogieModel[21].setRotationPoint(-0.5F, 7F, -7F);

		gs4tenderbogieModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gs4tenderbogieModel[22].setRotationPoint(-4.75F, 6F, -7F);

		gs4tenderbogieModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gs4tenderbogieModel[23].setRotationPoint(2.75F, 6F, -7F);

		gs4tenderbogieModel[24].addBox(0F, 0F, 0F, 24, 5, 0, 0F); // Box 24
		gs4tenderbogieModel[24].setRotationPoint(-12F, 4F, -6.05F);

		gs4tenderbogieModel[25].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 25
		gs4tenderbogieModel[25].setRotationPoint(-11F, 4F, -2F);

		gs4tenderbogieModel[26].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 26
		gs4tenderbogieModel[26].setRotationPoint(-15F, 4F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 27; i++)
		{
			gs4tenderbogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gs4tenderbogieModel[];
}