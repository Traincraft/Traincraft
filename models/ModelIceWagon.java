//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:25.08.2017 - 18:48:36
// Last changed on: 25.08.2017 - 18:48:36

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelIceWagon extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelIceWagon()
	{
		icewagonModel = new ModelRendererTurbo[34];
		icewagonModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		icewagonModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		icewagonModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		icewagonModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		icewagonModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		icewagonModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		icewagonModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		icewagonModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		icewagonModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		icewagonModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		icewagonModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		icewagonModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		icewagonModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		icewagonModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		icewagonModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
		icewagonModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
		icewagonModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		icewagonModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
		icewagonModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 21
		icewagonModel[19] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
		icewagonModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		icewagonModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 26
		icewagonModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		icewagonModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		icewagonModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 29
		icewagonModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 30
		icewagonModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		icewagonModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 32
		icewagonModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 33
		icewagonModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
		icewagonModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 35
		icewagonModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		icewagonModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 37
		icewagonModel[33] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 53

		icewagonModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		icewagonModel[0].setRotationPoint(-7F, 5F, -5.99F);

		icewagonModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		icewagonModel[1].setRotationPoint(3F, 5F, -5.99F);

		icewagonModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
		icewagonModel[2].setRotationPoint(3F, 5F, 5.99F);

		icewagonModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
		icewagonModel[3].setRotationPoint(-7F, 5F, 5.99F);

		icewagonModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
		icewagonModel[4].setRotationPoint(-5F, 7F, -6F);

		icewagonModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
		icewagonModel[5].setRotationPoint(5F, 7F, -6F);

		icewagonModel[6].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		icewagonModel[6].setRotationPoint(4F, 4F, -7F);

		icewagonModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		icewagonModel[7].setRotationPoint(4F, 4F, 6F);

		icewagonModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		icewagonModel[8].setRotationPoint(-6F, 4F, 6F);

		icewagonModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		icewagonModel[9].setRotationPoint(-6F, 4F, -7F);

		icewagonModel[10].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 11
		icewagonModel[10].setRotationPoint(-10F, 3F, -7F);

		icewagonModel[11].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 12
		icewagonModel[11].setRotationPoint(-10F, -2F, -7F);

		icewagonModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 13
		icewagonModel[12].setRotationPoint(10F, -2F, -7F);

		icewagonModel[13].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 15
		icewagonModel[13].setRotationPoint(-9F, -2F, -7F);

		icewagonModel[14].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 16
		icewagonModel[14].setRotationPoint(-9F, 0F, -7F);

		icewagonModel[15].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 17
		icewagonModel[15].setRotationPoint(10F, -2F, 6F);

		icewagonModel[16].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 18
		icewagonModel[16].setRotationPoint(-10F, -2F, 6F);

		icewagonModel[17].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 20
		icewagonModel[17].setRotationPoint(-9F, -2F, 6F);

		icewagonModel[18].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 21
		icewagonModel[18].setRotationPoint(-9F, 0F, 6F);

		icewagonModel[19].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 22
		icewagonModel[19].setRotationPoint(-10F, 0F, -6F);

		icewagonModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 23
		icewagonModel[20].setRotationPoint(-10F, -2F, -6F);

		icewagonModel[21].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
		icewagonModel[21].setRotationPoint(10F, -2F, -6F);

		icewagonModel[22].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
		icewagonModel[22].setRotationPoint(10F, 0F, -6F);

		icewagonModel[23].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 28
		icewagonModel[23].setRotationPoint(-11F, 3F, -7F);

		icewagonModel[24].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 29
		icewagonModel[24].setRotationPoint(11F, 3F, -7F);

		icewagonModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 30
		icewagonModel[25].setRotationPoint(-12F, 4F, -6F);

		icewagonModel[26].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 31
		icewagonModel[26].setRotationPoint(-13F, 3F, -7F);

		icewagonModel[27].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 32
		icewagonModel[27].setRotationPoint(-13F, 3F, 4F);

		icewagonModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 33
		icewagonModel[28].setRotationPoint(-12F, 4F, 5F);

		icewagonModel[29].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 34
		icewagonModel[29].setRotationPoint(13F, 3F, 4F);

		icewagonModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		icewagonModel[30].setRotationPoint(12F, 4F, 5F);

		icewagonModel[31].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 36
		icewagonModel[31].setRotationPoint(13F, 3F, -7F);

		icewagonModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		icewagonModel[32].setRotationPoint(12F, 4F, -6F);

		icewagonModel[33].addShapeBox(0F, 0F, 0F, 19, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 53
		icewagonModel[33].setRotationPoint(-9F, -5F, -6F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 34; i++)
		{
			icewagonModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo icewagonModel[];
}