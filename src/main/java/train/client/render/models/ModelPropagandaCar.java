//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.10.2017 - 14:43:42
// Last changed on: 29.10.2017 - 14:43:42

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelPropagandaCar extends ModelBase
{
	int textureX = 512;
	int textureY = 256;

	public ModelPropagandaCar()
	{
		propagandacarModel = new ModelRendererTurbo[18];
		propagandacarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		propagandacarModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 94
		propagandacarModel[2] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 95
		propagandacarModel[3] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 133
		propagandacarModel[4] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 134
		propagandacarModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 135
		propagandacarModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 136
		propagandacarModel[7] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 133
		propagandacarModel[8] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 134
		propagandacarModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 135
		propagandacarModel[10] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 136
		propagandacarModel[11] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 83
		propagandacarModel[12] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 86
		propagandacarModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 87
		propagandacarModel[14] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 89
		propagandacarModel[15] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 90
		propagandacarModel[16] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 91
		propagandacarModel[17] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 74

		propagandacarModel[0].addBox(0F, 0F, 0F, 112, 2, 22, 0F); // Box 2
		propagandacarModel[0].setRotationPoint(-73F, 0F, -12F);

		propagandacarModel[1].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 94
		propagandacarModel[1].setRotationPoint(-78F, 0F, -1.5F);

		propagandacarModel[2].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 95
		propagandacarModel[2].setRotationPoint(39F, 0F, -1.5F);

		propagandacarModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		propagandacarModel[3].setRotationPoint(39F, 0.5F, 6.5F);

		propagandacarModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		propagandacarModel[4].setRotationPoint(39F, 0.5F, -8.5F);

		propagandacarModel[5].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 135
		propagandacarModel[5].setRotationPoint(40F, -0.5F, -9.5F);

		propagandacarModel[6].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 136
		propagandacarModel[6].setRotationPoint(40F, -0.5F, 5.5F);

		propagandacarModel[7].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		propagandacarModel[7].setRotationPoint(-74F, 0.5F, -8.5F);

		propagandacarModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		propagandacarModel[8].setRotationPoint(-74F, 0.5F, 6.5F);

		propagandacarModel[9].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 135
		propagandacarModel[9].setRotationPoint(-75F, -0.5F, 5.5F);

		propagandacarModel[10].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 136
		propagandacarModel[10].setRotationPoint(-75F, -0.5F, -9.5F);

		propagandacarModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		propagandacarModel[11].setRotationPoint(-53F, -5F, -12F);

		propagandacarModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		propagandacarModel[12].setRotationPoint(17F, -5F, -12F);

		propagandacarModel[13].addBox(0F, 0F, 0F, 72, 30, 2, 0F); // Box 87
		propagandacarModel[13].setRotationPoint(-53F, -35F, -2F);

		propagandacarModel[14].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F, 0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 89
		propagandacarModel[14].setRotationPoint(-53F, -35F, 0.05F);

		propagandacarModel[15].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		propagandacarModel[15].setRotationPoint(7F, -5F, -2F);

		propagandacarModel[16].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		propagandacarModel[16].setRotationPoint(-63F, -5F, -2F);

		propagandacarModel[17].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F, 0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 74
		propagandacarModel[17].setRotationPoint(-53F, -35F, -2.05F);


	}
	private ModelFreightTruckM fronttrucks = new ModelFreightTruckM();
	private ModelFreightTruckM backtrucks = new ModelFreightTruckM();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 18; i++)
		{
			propagandacarModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-4.5, 0, -0.27);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.9, 0, -0.27);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo propagandacarModel[];
}