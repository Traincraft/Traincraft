//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:25.11.2017 - 14:47:07
// Last changed on: 25.11.2017 - 14:47:07

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelWellcar extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelWellcar()
	{
		wellcarModel = new ModelRendererTurbo[12];
		wellcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		wellcarModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 35
		wellcarModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 37
		wellcarModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 38
		wellcarModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		wellcarModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 40
		wellcarModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 41
		wellcarModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 42
		wellcarModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 46
		wellcarModel[9] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 47
		wellcarModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		wellcarModel[11] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 14

		wellcarModel[0].addBox(0F, 0F, 0F, 56, 2, 1, 0F); // Box 34
		wellcarModel[0].setRotationPoint(-28F, 0F, -9F);

		wellcarModel[1].addBox(0F, 0F, 0F, 5, 3, 16, 0F); // Box 35
		wellcarModel[1].setRotationPoint(-28F, -1F, -8F);

		wellcarModel[2].addBox(0F, 0F, 0F, 56, 2, 1, 0F); // Box 37
		wellcarModel[2].setRotationPoint(-28F, 0F, 8F);

		wellcarModel[3].addBox(0F, 0F, 0F, 5, 3, 16, 0F); // Box 38
		wellcarModel[3].setRotationPoint(23F, -1F, -8F);

		wellcarModel[4].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 39
		wellcarModel[4].setRotationPoint(-28F, -1F, -9F);

		wellcarModel[5].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 40
		wellcarModel[5].setRotationPoint(-28F, -1F, 8F);

		wellcarModel[6].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 41
		wellcarModel[6].setRotationPoint(19F, -1F, 8F);

		wellcarModel[7].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 42
		wellcarModel[7].setRotationPoint(19F, -1F, -9F);

		wellcarModel[8].addBox(0F, 0F, 0F, 64, 2, 4, 0F); // Box 46
		wellcarModel[8].setRotationPoint(-32F, 1F, -2F);

		wellcarModel[9].addBox(0F, 0F, 0F, 46, 13, 16, 0F); // Box 47
		wellcarModel[9].setRotationPoint(-23F, -24.06F, -8F);

		wellcarModel[10].addShapeBox(0F, 0F, 0F, 26, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 13
		wellcarModel[10].setRotationPoint(-13F, 2F, -9F);

		wellcarModel[11].addBox(0F, 0F, 0F, 46, 13, 16, 0F); // Box 14
		wellcarModel[11].setRotationPoint(-23F, -11.05F, -8F);


	}
	private ModelWellcarBogie fronttrucks = new ModelWellcarBogie();
	private ModelWellcarBogie backtrucks = new ModelWellcarBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 12; i++)
		{
			wellcarModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wellcar_bogie.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.4,0.1,-0.375);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(1.2,0.1,-0.375);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo wellcarModel[];
}