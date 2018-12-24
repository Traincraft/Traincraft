//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.10.2018 - 10:29:06
// Last changed on: 30.10.2018 - 10:29:06

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelBP4 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4()
	{
		bp4Model = new ModelRendererTurbo[41];
		bp4Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bp4Model[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bp4Model[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 3r
		bp4Model[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bp4Model[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bp4Model[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bp4Model[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		bp4Model[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		bp4Model[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 15
		bp4Model[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		bp4Model[10] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 21
		bp4Model[11] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 25
		bp4Model[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		bp4Model[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 27
		bp4Model[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 28
		bp4Model[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 29
		bp4Model[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 30
		bp4Model[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 31
		bp4Model[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bp4Model[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 34
		bp4Model[20] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 38R
		bp4Model[21] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 40
		bp4Model[22] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 41
		bp4Model[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		bp4Model[24] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bp4Model[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 44
		bp4Model[26] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 45
		bp4Model[27] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 40
		bp4Model[28] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 42
		bp4Model[29] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 43
		bp4Model[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 44
		bp4Model[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bp4Model[32] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 47
		bp4Model[33] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 48
		bp4Model[34] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 40
		bp4Model[35] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 41
		bp4Model[36] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		bp4Model[37] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 43
		bp4Model[38] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 44
		bp4Model[39] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 45
		bp4Model[40] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 46

		bp4Model[0].addBox(0F, 0F, 0F, 84, 1, 22, 0F); // Box 1
		bp4Model[0].setRotationPoint(-16F, -3F, -1F);

		bp4Model[1].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 2
		bp4Model[1].setRotationPoint(-16F, -9F, -1F);

		bp4Model[2].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 3r
		bp4Model[2].setRotationPoint(68F, -9F, -1F);

		bp4Model[3].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 4
		bp4Model[3].setRotationPoint(-18F, -2F, 8.5F);

		bp4Model[4].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 5
		bp4Model[4].setRotationPoint(68F, -2F, 8.5F);

		bp4Model[5].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 9
		bp4Model[5].setRotationPoint(-5F, -16F, 20F);

		bp4Model[6].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 10
		bp4Model[6].setRotationPoint(-5F, -16F, -1F);

		bp4Model[7].addShapeBox(0F, 0F, 0F, 11, 2, 22, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bp4Model[7].setRotationPoint(-5F, -23F, -1F);

		bp4Model[8].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 15
		bp4Model[8].setRotationPoint(-5F, -16F, 0F);

		bp4Model[9].addBox(0F, 0F, 0F, 55, 20, 14, 0F); // Box 19
		bp4Model[9].setRotationPoint(6F, -23F, 3F);

		bp4Model[10].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 21
		bp4Model[10].setRotationPoint(5F, -16F, 0F);

		bp4Model[11].addShapeBox(0F, 0F, 0F, 33, 2, 14, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bp4Model[11].setRotationPoint(17F, -25F, 3F);

		bp4Model[12].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 26
		bp4Model[12].setRotationPoint(-3F, -24F, 5F);

		bp4Model[13].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 27
		bp4Model[13].setRotationPoint(56F, -24.5F, 14F);

		bp4Model[14].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
		bp4Model[14].setRotationPoint(56F, -25F, 13F);

		bp4Model[15].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 29
		bp4Model[15].setRotationPoint(56F, -24.5F, 12F);

		bp4Model[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 30
		bp4Model[16].setRotationPoint(57F, -24F, 13F);

		bp4Model[17].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 31
		bp4Model[17].setRotationPoint(62.5F, -21F, 9F);

		bp4Model[18].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 33
		bp4Model[18].setRotationPoint(6F, -7F, -1F);

		bp4Model[19].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 34
		bp4Model[19].setRotationPoint(6F, -7F, 17F);

		bp4Model[20].addBox(0F, 0F, 0F, 57, 8, 0, 0F); // Box 38R
		bp4Model[20].setRotationPoint(6F, -11F, 21.1F);

		bp4Model[21].addBox(0F, 0F, 0F, 34, 4, 22, 0F); // Box 40
		bp4Model[21].setRotationPoint(10F, -1F, -1F);

		bp4Model[22].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 41
		bp4Model[22].setRotationPoint(-16F, -2F, -1F);

		bp4Model[23].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 42
		bp4Model[23].setRotationPoint(-16F, -2F, 20F);

		bp4Model[24].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 43
		bp4Model[24].setRotationPoint(62F, -2F, 20F);

		bp4Model[25].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 44
		bp4Model[25].setRotationPoint(62F, -2F, -1F);

		bp4Model[26].addShapeBox(0F, 0F, 0F, 34, 1, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bp4Model[26].setRotationPoint(10F, -2F, -1F);

		bp4Model[27].addShapeBox(0F, 0F, 0F, 2, 20, 14, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 40
		bp4Model[27].setRotationPoint(61F, -23F, 3F);

		bp4Model[28].addShapeBox(0F, 0F, 0F, 6, 13, 14, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F); // Box 42
		bp4Model[28].setRotationPoint(-11F, -16F, 3F);

		bp4Model[29].addBox(0F, 0F, 0F, 3, 13, 14, 0F); // Box 43
		bp4Model[29].setRotationPoint(-8F, -16F, 3F);

		bp4Model[30].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 44
		bp4Model[30].setRotationPoint(-8F, -6F, -1F);

		bp4Model[31].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 45
		bp4Model[31].setRotationPoint(-8F, -6F, 17F);

		bp4Model[32].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 47
		bp4Model[32].setRotationPoint(-10F, -11F, 21.1F);

		bp4Model[33].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 48
		bp4Model[33].setRotationPoint(-7F, -23F, 4.5F);

		bp4Model[34].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 40
		bp4Model[34].setRotationPoint(-4F, -21F, -1F);

		bp4Model[35].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 41
		bp4Model[35].setRotationPoint(-4F, -21F, 20F);

		bp4Model[36].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 42
		bp4Model[36].setRotationPoint(5F, -21F, -1F);

		bp4Model[37].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 43
		bp4Model[37].setRotationPoint(-5F, -21F, -1F);

		bp4Model[38].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 44
		bp4Model[38].setRotationPoint(-4F, -16F, 7F);

		bp4Model[39].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 45
		bp4Model[39].setRotationPoint(-10F, -11F, -1.1F);

		bp4Model[40].addBox(0F, 0F, 0F, 57, 8, 0, 0F); // Box 46
		bp4Model[40].setRotationPoint(6F, -11F, -1.1F);


	}
	ModelWellcarBogie bogie = new ModelWellcarBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 41; i++)
		{
			bp4Model[i].render(f5);
		}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wellcar_bogie.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1.2f,1.2f,1f);
		GL11.glTranslatef(0f,-0.1f,0.225f);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(-0.5f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(3.6f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(-0.5f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bp4Model[];
}