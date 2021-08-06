//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.07.2021 - 13:08:08
// Last changed on: 13.07.2021 - 13:08:08

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelLightCrane extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLightCrane() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 40

		bodyModel[0].addBox(0F, 0F, 0F, 65, 4, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, 0F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 2, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-11F, -2F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 2
		bodyModel[2].setRotationPoint(-20F, -3F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 52, 16, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-19F, -19F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 52, 16, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-19F, -19F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 5
		bodyModel[5].setRotationPoint(33F, -19F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 6
		bodyModel[6].setRotationPoint(-20F, -19F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 60, 8, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-60F, -46F, -4F);
		bodyModel[7].rotateAngleZ = 0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 60, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-62F, -44F, -4F);
		bodyModel[8].rotateAngleZ = 0.78539816F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 54, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-20F, -22F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 11
		bodyModel[10].setRotationPoint(-36F, 3F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 12
		bodyModel[11].setRotationPoint(-34F, 4F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 13
		bodyModel[12].setRotationPoint(30F, 4F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 14
		bodyModel[13].setRotationPoint(30F, 3F, -1F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(30F, 3.5F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(30F, 3.5F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(33F, 2.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(33F, 2.5F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(-36F, 3.5F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 20
		bodyModel[19].setRotationPoint(-36F, 3.5F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 21
		bodyModel[20].setRotationPoint(-37F, 2.5F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 22
		bodyModel[21].setRotationPoint(-37F, 2.5F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 61, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-43F, -39F, -3F);
		bodyModel[22].rotateAngleZ = 1.27409035F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-50F, -32F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-61F, -43F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-57F, -39F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-62.5F, -27F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-62.5F, -23F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-59.5F, -16F, -0.5F);
		bodyModel[28].rotateAngleZ = 0.50614548F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-58.5F, -14.25F, -0.5F);
		bodyModel[29].rotateAngleZ = -1.08210414F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-62.6F, -15.5F, -0.5F);
		bodyModel[30].rotateAngleZ = 0.48869219F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-53.5F, -19F, -3.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-53.5F, -16F, -3.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-53.5F, -14F, -3.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-50.5F, -7F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-50.5F, -4.05F, -0.5F);
		bodyModel[35].rotateAngleZ = -1.25663706F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-49.8F, -3.1F, -0.5F);
		bodyModel[36].rotateAngleZ = 1.25663706F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-52.45F, -3.4F, -0.5F);
		bodyModel[37].rotateAngleZ = -2.82743339F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-46.65F, -3.1F, -0.5F);
		bodyModel[38].rotateAngleZ = -3.45575192F;

		bodyModel[39].addBox(0F, 0F, 0F, 63, 2, 6, 0F); // Box 40
		bodyModel[39].setRotationPoint(-33F, 4F, -3F);
	}
	Model70Truck bogie = new Model70Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 40; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.6,0.575,-0.4);//front
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.4,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.4,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		//GL11.glTranslated(1.1,0,0.0);
		//bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}