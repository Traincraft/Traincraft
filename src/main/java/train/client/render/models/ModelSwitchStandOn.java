//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:22.08.2017 - 15:49:11
// Last changed on: 22.08.2017 - 15:49:11

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelSwitchStandOn extends ModelBase
{
	int textureX = 256;
	int textureY = 32;

	public ModelSwitchStandOn()
	{
		switchstandonModel = new ModelRendererTurbo[37];
		switchstandonModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		switchstandonModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		switchstandonModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		switchstandonModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		switchstandonModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 25
		switchstandonModel[5] = new ModelRendererTurbo(this, 50, 19, textureX, textureY); // Box 26
		switchstandonModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		switchstandonModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		switchstandonModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		switchstandonModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 30
		switchstandonModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 31
		switchstandonModel[11] = new ModelRendererTurbo(this, 97, 0, textureX, textureY); // Box 32
		switchstandonModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 33
		switchstandonModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34
		switchstandonModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 35
		switchstandonModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 36
		switchstandonModel[16] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 37
		switchstandonModel[17] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 41
		switchstandonModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 42
		switchstandonModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		switchstandonModel[20] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 44
		switchstandonModel[21] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 45
		switchstandonModel[22] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 47
		switchstandonModel[23] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 48
		switchstandonModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 49
		switchstandonModel[25] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 50
		switchstandonModel[26] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 51
		switchstandonModel[27] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 52
		switchstandonModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 53
		switchstandonModel[29] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 54
		switchstandonModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 55
		switchstandonModel[31] = new ModelRendererTurbo(this, 225, 7, textureX, textureY); // Box 64
		switchstandonModel[32] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 65
		switchstandonModel[33] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 34
		switchstandonModel[34] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 34
		switchstandonModel[35] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 35
		switchstandonModel[36] = new ModelRendererTurbo(this, 50, 19, textureX, textureY); // Box 36

		switchstandonModel[0].addBox(0F, 0F, 0F, 1, 32, 1, 0F); // Box 0
		switchstandonModel[0].setRotationPoint(-0.5F, -21F, -0.5F);

		switchstandonModel[1].addBox(0F, 0F, -1F, 2, 4, 1, 0F); // Box 1
		switchstandonModel[1].setRotationPoint(-1F, 7F, -4F);

		switchstandonModel[2].addBox(0F, 0F, -1F, 2, 4, 1, 0F); // Box 15
		switchstandonModel[2].setRotationPoint(1F, 7F, 4F);
		switchstandonModel[2].rotateAngleY = -3.14159265F;

		switchstandonModel[3].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 24
		switchstandonModel[3].setRotationPoint(-1F, 5.45F, -3.37F);
		switchstandonModel[3].rotateAngleX = -0.34906585F;

		switchstandonModel[4].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 25
		switchstandonModel[4].setRotationPoint(-1F, 3.87F, -2.45F);
		switchstandonModel[4].rotateAngleX = -0.52359878F;

		switchstandonModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 26
		switchstandonModel[5].setRotationPoint(-1F, -19F, -2.5F);

		switchstandonModel[6].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 27
		switchstandonModel[6].setRotationPoint(-1F, 2.9F, -2.12F);
		switchstandonModel[6].rotateAngleX = -0.31415927F;

		switchstandonModel[7].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 28
		switchstandonModel[7].setRotationPoint(-1F, 1.88F, -2.08F);
		switchstandonModel[7].rotateAngleX = -0.03490659F;

		switchstandonModel[8].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 29
		switchstandonModel[8].setRotationPoint(1F, 1.88F, 2.08F);
		switchstandonModel[8].rotateAngleX = -0.03490659F;
		switchstandonModel[8].rotateAngleY = -3.14159265F;

		switchstandonModel[9].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 30
		switchstandonModel[9].setRotationPoint(1F, 3.87F, 2.45F);
		switchstandonModel[9].rotateAngleX = -0.52359878F;
		switchstandonModel[9].rotateAngleY = -3.14159265F;

		switchstandonModel[10].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 31
		switchstandonModel[10].setRotationPoint(1F, 2.9F, 2.12F);
		switchstandonModel[10].rotateAngleX = -0.31415927F;
		switchstandonModel[10].rotateAngleY = -3.14159265F;

		switchstandonModel[11].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 32
		switchstandonModel[11].setRotationPoint(1F, 5.45F, 3.37F);
		switchstandonModel[11].rotateAngleX = -0.34906585F;
		switchstandonModel[11].rotateAngleY = -3.14159265F;

		switchstandonModel[12].addBox(0F, 0F, -1F, 32, 2, 3, 0F); // Box 33
		switchstandonModel[12].setRotationPoint(-8F, 9F, -5F);

		switchstandonModel[13].addBox(0F, 0F, -1F, 32, 2, 3, 0F); // Box 34
		switchstandonModel[13].setRotationPoint(-8F, 9F, 4F);

		switchstandonModel[14].addShapeBox(0F, 0F, -1F, 10, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 35
		switchstandonModel[14].setRotationPoint(-5F, 8.65F, -3F);

		switchstandonModel[15].addBox(0F, 0F, -1F, 2, 1, 7, 0F); // Box 36
		switchstandonModel[15].setRotationPoint(-1F, 1.2F, -2.5F);

		switchstandonModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Box 37
		switchstandonModel[16].setRotationPoint(-2.5F, -8F, 0.25F);

		switchstandonModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 41
		switchstandonModel[17].setRotationPoint(-1.5F, 1.25F, -3F);

		switchstandonModel[18].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 42
		switchstandonModel[18].setRotationPoint(0.5F, -1.1F, 1.5F);
		switchstandonModel[18].rotateAngleY = -1.57079633F;
		switchstandonModel[18].rotateAngleZ = 0.33161256F;

		switchstandonModel[19].addShapeBox(0F, 0F, -1F, 2, 1, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 43
		switchstandonModel[19].setRotationPoint(-1F, -1.8F, 0.8F);

		switchstandonModel[20].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 44
		switchstandonModel[20].setRotationPoint(-0.5F, -1.22F, 2.82F);
		switchstandonModel[20].rotateAngleY = -1.57079633F;
		switchstandonModel[20].rotateAngleZ = -0.50614548F;

		switchstandonModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 45
		switchstandonModel[21].setRotationPoint(-0.5F, -1.8F, 2.05F);
		switchstandonModel[21].rotateAngleY = -1.57079633F;
		switchstandonModel[21].rotateAngleZ = -0.9250245F;

		switchstandonModel[22].addBox(0F, 0F, -1F, 1, 1, 6, 0F); // Box 47
		switchstandonModel[22].setRotationPoint(-7F, 9.9F, -2F);

		switchstandonModel[23].addBox(0F, 0F, -1F, 1, 1, 6, 0F); // Box 48
		switchstandonModel[23].setRotationPoint(6F, 9.9F, -2F);

		switchstandonModel[24].addShapeBox(0F, 0F, -1F, 2, 1, 8, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 49
		switchstandonModel[24].setRotationPoint(-1F, 7F, -3F);

		switchstandonModel[25].addBox(0F, 0F, -1F, 5, 1, 1, 0F); // Box 50
		switchstandonModel[25].setRotationPoint(0F, 7.9F, 0.5F);

		switchstandonModel[26].addBox(0F, 0F, -1F, 4, 1, 1, 0F); // Box 51
		switchstandonModel[26].setRotationPoint(5F, 7.9F, 0.5F);
		switchstandonModel[26].rotateAngleZ = -0.2443461F;

		switchstandonModel[27].addBox(0F, 0F, -1F, 15, 1, 1, 0F); // Box 52
		switchstandonModel[27].setRotationPoint(8.8F, 8.7F, 0.35F);
		switchstandonModel[27].rotateAngleX = 0.34906585F;

		switchstandonModel[28].addBox(0F, 0F, -1F, 2, 1, 8, 0F); // Box 53
		switchstandonModel[28].setRotationPoint(8F, 8.6F, -3F);

		switchstandonModel[29].addBox(0F, 0F, -1F, 2, 2, 7, 0F); // Box 54
		switchstandonModel[29].setRotationPoint(22F, 8.7F, -2.5F);

		switchstandonModel[30].addBox(0F, 0F, -1F, 2, 2, 7, 0F); // Box 55
		switchstandonModel[30].setRotationPoint(15F, 8.7F, -2.5F);

		switchstandonModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 64
		switchstandonModel[31].setRotationPoint(-0.4F, -17.5F, -1.5F);

		switchstandonModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 65
		switchstandonModel[32].setRotationPoint(-1F, -9F, -0.6F);

		switchstandonModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		switchstandonModel[33].setRotationPoint(-2.5F, -11F, 0.25F);

		switchstandonModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 34
		switchstandonModel[34].setRotationPoint(-2.5F, -8F, -1.25F);

		switchstandonModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		switchstandonModel[35].setRotationPoint(-2.5F, -11F, -1.25F);

		switchstandonModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 36
		switchstandonModel[36].setRotationPoint(0F, -19F, -2.5F);

		fixRotation(switchstandonModel, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 37; i++)
		{
			switchstandonModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo switchstandonModel[];
}