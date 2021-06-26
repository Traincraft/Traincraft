//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:22.07.2018 - 19:36:12
// Last changed on: 22.07.2018 - 19:36:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelFreightCarL extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelFreightCarL()
	{
		freightcarlModel = new ModelRendererTurbo[42];
		freightcarlModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		freightcarlModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 1
		freightcarlModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		freightcarlModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		freightcarlModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 6
		freightcarlModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 7
		freightcarlModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		freightcarlModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 9
		freightcarlModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 10
		freightcarlModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		freightcarlModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 12
		freightcarlModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 13
		freightcarlModel[12] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 14
		freightcarlModel[13] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 15
		freightcarlModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 16
		freightcarlModel[15] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 17
		freightcarlModel[16] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 18
		freightcarlModel[17] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 19
		freightcarlModel[18] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 20
		freightcarlModel[19] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 21
		freightcarlModel[20] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 22
		freightcarlModel[21] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		freightcarlModel[22] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 31
		freightcarlModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		freightcarlModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		freightcarlModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 51
		freightcarlModel[26] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 52
		freightcarlModel[27] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 53
		freightcarlModel[28] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 54
		freightcarlModel[29] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 57
		freightcarlModel[30] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 58
		freightcarlModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 59
		freightcarlModel[32] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 60
		freightcarlModel[33] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 59
		freightcarlModel[34] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 60
		freightcarlModel[35] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 61
		freightcarlModel[36] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 62
		freightcarlModel[37] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 63
		freightcarlModel[38] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 64
		freightcarlModel[39] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 65
		freightcarlModel[40] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 40
		freightcarlModel[41] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41

		freightcarlModel[0].addBox(0F, 0F, 0F, 84, 1, 22, 0F); // Box 0
		freightcarlModel[0].setRotationPoint(-41F, 4F, 2F);

		freightcarlModel[1].addBox(0F, 0F, 0F, 6, 24, 22, 0F); // Box 1
		freightcarlModel[1].setRotationPoint(-41F, -20F, 2F);

		freightcarlModel[2].addBox(0F, 0F, 0F, 6, 24, 22, 0F); // Box 4
		freightcarlModel[2].setRotationPoint(37F, -20F, 2F);

		freightcarlModel[3].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 5
		freightcarlModel[3].setRotationPoint(-35F, -20F, 5F);

		freightcarlModel[4].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 6
		freightcarlModel[4].setRotationPoint(-35F, -20F, 20F);

		freightcarlModel[5].addBox(0F, 0F, 0F, 15, 24, 3, 0F); // Box 7
		freightcarlModel[5].setRotationPoint(-26F, -20F, 21F);

		freightcarlModel[6].addBox(0F, 0F, 0F, 15, 24, 3, 0F); // Box 8
		freightcarlModel[6].setRotationPoint(-26F, -20F, 2F);

		freightcarlModel[7].addBox(0F, 0F, 0F, 2, 24, 3, 0F); // Box 9
		freightcarlModel[7].setRotationPoint(-2F, -20F, 21F);

		freightcarlModel[8].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 10
		freightcarlModel[8].setRotationPoint(-11F, -20F, 20F);

		freightcarlModel[9].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 11
		freightcarlModel[9].setRotationPoint(-11F, -20F, 5F);

		freightcarlModel[10].addBox(0F, 0F, 0F, 2, 24, 3, 0F); // Box 12
		freightcarlModel[10].setRotationPoint(2F, -20F, 21F);

		freightcarlModel[11].addBox(0F, 0F, 0F, 2, 24, 2, 0F); // Box 13
		freightcarlModel[11].setRotationPoint(0F, -20F, 21F);

		freightcarlModel[12].addBox(0F, 0F, 0F, 2, 24, 3, 0F); // Box 14
		freightcarlModel[12].setRotationPoint(-2F, -20F, 2F);

		freightcarlModel[13].addBox(0F, 0F, 0F, 2, 24, 3, 0F); // Box 15
		freightcarlModel[13].setRotationPoint(2F, -20F, 2F);

		freightcarlModel[14].addBox(0F, 0F, 0F, 2, 24, 2, 0F); // Box 16
		freightcarlModel[14].setRotationPoint(0F, -20F, 3F);

		freightcarlModel[15].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 17
		freightcarlModel[15].setRotationPoint(4F, -20F, 20F);

		freightcarlModel[16].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 18
		freightcarlModel[16].setRotationPoint(4F, -20F, 5F);

		freightcarlModel[17].addBox(0F, 0F, 0F, 15, 24, 3, 0F); // Box 19
		freightcarlModel[17].setRotationPoint(13F, -20F, 2F);

		freightcarlModel[18].addBox(0F, 0F, 0F, 15, 24, 3, 0F); // Box 20
		freightcarlModel[18].setRotationPoint(13F, -20F, 21F);

		freightcarlModel[19].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 21
		freightcarlModel[19].setRotationPoint(28F, -20F, 5F);

		freightcarlModel[20].addBox(0F, 0F, 0F, 9, 24, 1, 0F); // Box 22
		freightcarlModel[20].setRotationPoint(28F, -20F, 20F);

		freightcarlModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		freightcarlModel[21].setRotationPoint(-35F, 2F, 2F);

		freightcarlModel[22].addBox(0F, 0F, 0F, 1, 22, 6, 0F); // Box 31
		freightcarlModel[22].setRotationPoint(43F, -18F, 17F);

		freightcarlModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 43
		freightcarlModel[23].setRotationPoint(43F, -1F, 4F);

		freightcarlModel[24].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 44
		freightcarlModel[24].setRotationPoint(44F, -3F, 2F);

		freightcarlModel[25].addBox(0F, 0F, 0F, 88, 1, 24, 0F); // Box 51
		freightcarlModel[25].setRotationPoint(-43F, -21F, 1F);

		freightcarlModel[26].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		freightcarlModel[26].setRotationPoint(-43F, -24F, 1F);

		freightcarlModel[27].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		freightcarlModel[27].setRotationPoint(-43F, -24F, 17F);

		freightcarlModel[28].addBox(0F, 0F, 0F, 41, 3, 8, 0F); // Box 54
		freightcarlModel[28].setRotationPoint(-43F, -24F, 9F);

		freightcarlModel[29].addBox(0F, 0F, 0F, 41, 3, 8, 0F); // Box 57
		freightcarlModel[29].setRotationPoint(4F, -24F, 9F);

		freightcarlModel[30].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		freightcarlModel[30].setRotationPoint(-2F, -25F, 15F);

		freightcarlModel[31].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		freightcarlModel[31].setRotationPoint(-2F, -25F, 9F);

		freightcarlModel[32].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		freightcarlModel[32].setRotationPoint(-2F, -25F, 11F);

		freightcarlModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		freightcarlModel[33].setRotationPoint(-11F, 2F, 2F);

		freightcarlModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		freightcarlModel[34].setRotationPoint(4F, 2F, 2F);

		freightcarlModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		freightcarlModel[35].setRotationPoint(28F, 2F, 2F);

		freightcarlModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		freightcarlModel[36].setRotationPoint(-35F, 2F, 21F);

		freightcarlModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		freightcarlModel[37].setRotationPoint(-11F, 2F, 21F);

		freightcarlModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		freightcarlModel[38].setRotationPoint(4F, 2F, 21F);

		freightcarlModel[39].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		freightcarlModel[39].setRotationPoint(28F, 2F, 21F);

		freightcarlModel[40].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 40
		freightcarlModel[40].setRotationPoint(-44F, 3F, 12F);

		freightcarlModel[41].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 41
		freightcarlModel[41].setRotationPoint(43F, 3F, 12F);
		fixRotation(freightcarlModel, false, true, true);

	}
	ModelWellcarBogie bogie = new ModelWellcarBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 42; i++)
		{
			freightcarlModel[i].render(f5);
		}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wellcar_bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-2,0.3,0.45);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glTranslated(4,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo freightcarlModel[];
}