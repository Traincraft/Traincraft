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

public class ModelSwitchStandOff extends ModelBase
{
	int textureX = 256;
	int textureY = 32;

	public ModelSwitchStandOff()
	{
		switchstandoffModel = new ModelRendererTurbo[37];
		switchstandoffModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		switchstandoffModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		switchstandoffModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		switchstandoffModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		switchstandoffModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 25
		switchstandoffModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		switchstandoffModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		switchstandoffModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		switchstandoffModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		switchstandoffModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 30
		switchstandoffModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 31
		switchstandoffModel[11] = new ModelRendererTurbo(this, 97, 0, textureX, textureY); // Box 32
		switchstandoffModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 33
		switchstandoffModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34
		switchstandoffModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 35
		switchstandoffModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 36
		switchstandoffModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		switchstandoffModel[17] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 41
		switchstandoffModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 42
		switchstandoffModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		switchstandoffModel[20] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 44
		switchstandoffModel[21] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 45
		switchstandoffModel[22] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 47
		switchstandoffModel[23] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 48
		switchstandoffModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 49
		switchstandoffModel[25] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 50
		switchstandoffModel[26] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 51
		switchstandoffModel[27] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 52
		switchstandoffModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 53
		switchstandoffModel[29] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 54
		switchstandoffModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 55
		switchstandoffModel[31] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 56
		switchstandoffModel[32] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 64
		switchstandoffModel[33] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 65
		switchstandoffModel[34] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		switchstandoffModel[35] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 35
		switchstandoffModel[36] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 36

		switchstandoffModel[0].addBox(0F, 0F, 0F, 1, 32, 1, 0F); // Box 0
		switchstandoffModel[0].setRotationPoint(-0.5F, -21F, -0.5F);

		switchstandoffModel[1].addBox(0F, 0F, -1F, 2, 4, 1, 0F); // Box 1
		switchstandoffModel[1].setRotationPoint(-1F, 7F, -4F);

		switchstandoffModel[2].addBox(0F, 0F, -1F, 2, 4, 1, 0F); // Box 15
		switchstandoffModel[2].setRotationPoint(1F, 7F, 4F);
		switchstandoffModel[2].rotateAngleY = -3.14159265F;

		switchstandoffModel[3].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 24
		switchstandoffModel[3].setRotationPoint(-1F, 5.45F, -3.37F);
		switchstandoffModel[3].rotateAngleX = -0.34906585F;

		switchstandoffModel[4].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 25
		switchstandoffModel[4].setRotationPoint(-1F, 3.87F, -2.45F);
		switchstandoffModel[4].rotateAngleX = -0.52359878F;

		switchstandoffModel[5].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 26
		switchstandoffModel[5].setRotationPoint(-2.5F, -19F, -1F);

		switchstandoffModel[6].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 27
		switchstandoffModel[6].setRotationPoint(-1F, 2.9F, -2.12F);
		switchstandoffModel[6].rotateAngleX = -0.31415927F;

		switchstandoffModel[7].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 28
		switchstandoffModel[7].setRotationPoint(-1F, 1.88F, -2.08F);
		switchstandoffModel[7].rotateAngleX = -0.03490659F;

		switchstandoffModel[8].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 29
		switchstandoffModel[8].setRotationPoint(1F, 1.88F, 2.08F);
		switchstandoffModel[8].rotateAngleX = -0.03490659F;
		switchstandoffModel[8].rotateAngleY = -3.14159265F;

		switchstandoffModel[9].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 30
		switchstandoffModel[9].setRotationPoint(1F, 3.87F, 2.45F);
		switchstandoffModel[9].rotateAngleX = -0.52359878F;
		switchstandoffModel[9].rotateAngleY = -3.14159265F;

		switchstandoffModel[10].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 31
		switchstandoffModel[10].setRotationPoint(1F, 2.9F, 2.12F);
		switchstandoffModel[10].rotateAngleX = -0.31415927F;
		switchstandoffModel[10].rotateAngleY = -3.14159265F;

		switchstandoffModel[11].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // Box 32
		switchstandoffModel[11].setRotationPoint(1F, 5.45F, 3.37F);
		switchstandoffModel[11].rotateAngleX = -0.34906585F;
		switchstandoffModel[11].rotateAngleY = -3.14159265F;

		switchstandoffModel[12].addBox(0F, 0F, -1F, 32, 2, 3, 0F); // Box 33
		switchstandoffModel[12].setRotationPoint(-8F, 9F, -5F);

		switchstandoffModel[13].addBox(0F, 0F, -1F, 32, 2, 3, 0F); // Box 34
		switchstandoffModel[13].setRotationPoint(-8F, 9F, 4F);

		switchstandoffModel[14].addShapeBox(0F, 0F, -1F, 10, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 35
		switchstandoffModel[14].setRotationPoint(-5F, 8.65F, -3F);

		switchstandoffModel[15].addBox(0F, 0F, -1F, 2, 1, 7, 0F); // Box 36
		switchstandoffModel[15].setRotationPoint(-1F, 1.2F, -2.5F);

		switchstandoffModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 37
		switchstandoffModel[16].setRotationPoint(-1F, -8F, -0.5F);

		switchstandoffModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 41
		switchstandoffModel[17].setRotationPoint(-1.5F, 1.25F, -3F);

		switchstandoffModel[18].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 42
		switchstandoffModel[18].setRotationPoint(-1.3F, -1.1F, 0.5F);
		switchstandoffModel[18].rotateAngleZ = 0.33161256F;

		switchstandoffModel[19].addShapeBox(0F, 0F, -1F, 2, 1, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 43
		switchstandoffModel[19].setRotationPoint(-1.8F, -2F, 0F);

		switchstandoffModel[20].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 44
		switchstandoffModel[20].setRotationPoint(-2.65F, -0.800000000000001F, -0.5F);
		switchstandoffModel[20].rotateAngleZ = -0.15707963F;

		switchstandoffModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 45
		switchstandoffModel[21].setRotationPoint(-2.2F, -1.8F, -0.5F);
		switchstandoffModel[21].rotateAngleZ = -0.43633231F;

		switchstandoffModel[22].addBox(0F, 0F, -1F, 1, 1, 6, 0F); // Box 47
		switchstandoffModel[22].setRotationPoint(-7F, 9.9F, -2F);

		switchstandoffModel[23].addBox(0F, 0F, -1F, 1, 1, 6, 0F); // Box 48
		switchstandoffModel[23].setRotationPoint(6F, 9.9F, -2F);

		switchstandoffModel[24].addShapeBox(0F, 0F, -1F, 2, 1, 8, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 49
		switchstandoffModel[24].setRotationPoint(-1F, 7F, -3F);

		switchstandoffModel[25].addBox(0F, 0F, -1F, 5, 1, 1, 0F); // Box 50
		switchstandoffModel[25].setRotationPoint(0F, 7.9F, 0.5F);

		switchstandoffModel[26].addBox(0F, 0F, -1F, 4, 1, 1, 0F); // Box 51
		switchstandoffModel[26].setRotationPoint(5F, 7.9F, 0.5F);
		switchstandoffModel[26].rotateAngleZ = -0.2443461F;

		switchstandoffModel[27].addBox(0F, 0F, -1F, 15, 1, 1, 0F); // Box 52
		switchstandoffModel[27].setRotationPoint(8.8F, 8.7F, 0.35F);
		switchstandoffModel[27].rotateAngleX = 0.34906585F;

		switchstandoffModel[28].addBox(0F, 0F, -1F, 2, 1, 8, 0F); // Box 53
		switchstandoffModel[28].setRotationPoint(8F, 8.6F, -3F);

		switchstandoffModel[29].addBox(0F, 0F, -1F, 2, 2, 7, 0F); // Box 54
		switchstandoffModel[29].setRotationPoint(22F, 8.7F, -2.5F);

		switchstandoffModel[30].addBox(0F, 0F, -1F, 2, 2, 7, 0F); // Box 55
		switchstandoffModel[30].setRotationPoint(15F, 8.7F, -2.5F);

		switchstandoffModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F); // Box 56
		switchstandoffModel[31].setRotationPoint(-1F, -11F, -0.5F);

		switchstandoffModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 64
		switchstandoffModel[32].setRotationPoint(-1.5F, -17.5F, -0.4F);

		switchstandoffModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 65
		switchstandoffModel[33].setRotationPoint(-0.4F, -9F, -1F);

		switchstandoffModel[34].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 34
		switchstandoffModel[34].setRotationPoint(-2.5F, -19F, 0F);

		switchstandoffModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 35
		switchstandoffModel[35].setRotationPoint(0F, -8F, -0.5F);

		switchstandoffModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F); // Box 36
		switchstandoffModel[36].setRotationPoint(0F, -11F, -0.5F);

		fixRotation(switchstandoffModel, false, true, true);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 37; i++)
		{
			switchstandoffModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo switchstandoffModel[];
}