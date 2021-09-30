//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.05.2019 - 11:39:08
// Last changed on: 07.05.2019 - 11:39:08

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.containers.Modelcontainer40;
import train.common.entity.rollingStock.EntityFreightBapHuskyStack;
import train.common.library.Info;

public class ModelHuskyStack extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHuskyStack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[48];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 83
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 84
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 89
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 90
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 91
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 92
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 93
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 95
		bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 96
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 97
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 98
		bodyModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 99
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
		bodyModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 102
		bodyModel[15] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 103
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 104
		bodyModel[17] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 110
		bodyModel[19] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 112
		bodyModel[20] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 114
		bodyModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 115
		bodyModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 116
		bodyModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 117
		bodyModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 118
		bodyModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 119
		bodyModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 121
		bodyModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 122
		bodyModel[28] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 101
		bodyModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 57
		bodyModel[30] = new ModelRendererTurbo(this, 422, 27, textureX, textureY); // Box 58
		bodyModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 69
		bodyModel[32] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 70
		bodyModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 71
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		bodyModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 163, 25, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 302, 17, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 302, 17, textureX, textureY); // Box 77

		bodyModel[0].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 62
		bodyModel[0].setRotationPoint(-41F, -3F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 83
		bodyModel[1].setRotationPoint(-51F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 84
		bodyModel[2].setRotationPoint(-50F, 2F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 89
		bodyModel[3].setRotationPoint(-41F, -3F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
		bodyModel[4].setRotationPoint(-41F, 2F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[5].setRotationPoint(-41F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 92
		bodyModel[6].setRotationPoint(-41F, -1F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 93
		bodyModel[7].setRotationPoint(-44F, -4F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 95
		bodyModel[8].setRotationPoint(-36F, -3F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 96
		bodyModel[9].setRotationPoint(-44F, 0F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[10].setRotationPoint(-44.5F, -4.5F, 0.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 98
		bodyModel[11].setRotationPoint(-44.5F, -6F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
		bodyModel[12].setRotationPoint(36F, 2F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[13].setRotationPoint(36F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
		bodyModel[14].setRotationPoint(-31F, 2F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[15].setRotationPoint(-31F, 2F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 104
		bodyModel[16].setRotationPoint(-36F, 2F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 106
		bodyModel[17].setRotationPoint(-36F, 2F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F); // Box 110
		bodyModel[18].setRotationPoint(31F, 2F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[19].setRotationPoint(31F, 2F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 114
		bodyModel[20].setRotationPoint(41F, 2F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 115
		bodyModel[21].setRotationPoint(44F, 1F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 116
		bodyModel[22].setRotationPoint(41F, -4F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 117
		bodyModel[23].setRotationPoint(42.5F, -4.5F, -1.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 118
		bodyModel[24].setRotationPoint(44.5F, -6F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 119
		bodyModel[25].setRotationPoint(31F, -1F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 121
		bodyModel[26].setRotationPoint(32F, -3F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 122
		bodyModel[27].setRotationPoint(41F, 0F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 101
		bodyModel[28].setRotationPoint(-31F, 7F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[29].setRotationPoint(-32F, 2F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[30].setRotationPoint(31F, 2F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 69
		bodyModel[31].setRotationPoint(-50F, 3F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 70
		bodyModel[32].setRotationPoint(31F, 3F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 71
		bodyModel[33].setRotationPoint(-53F, 2F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 72
		bodyModel[34].setRotationPoint(50F, 2F, -1.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 45
		bodyModel[35].setRotationPoint(34F, -4F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 46
		bodyModel[36].setRotationPoint(36F, -3F, -1.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 47
		bodyModel[37].setRotationPoint(-41F, -3F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 48
		bodyModel[38].setRotationPoint(-41F, -3F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 49
		bodyModel[39].setRotationPoint(36F, -3F, 8F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 50
		bodyModel[40].setRotationPoint(36F, -3F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 51
		bodyModel[41].setRotationPoint(-50F, -7F, -11.01F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 52
		bodyModel[42].setRotationPoint(45F, -7F, -11.01F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 53
		bodyModel[43].setRotationPoint(-40F, -4F, 0F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 54
		bodyModel[44].setRotationPoint(-50F, -7F, 11.01F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 55
		bodyModel[45].setRotationPoint(45F, -7F, 11.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 46
		bodyModel[46].setRotationPoint(-43F, 4F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 77
		bodyModel[47].setRotationPoint(39F, 4F, -2F);
	}
	Model70Truck bogie = new Model70Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 48; i++) {
			bodyModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1F, 1F, 1f);
		GL11.glTranslated(-2.7, 0.51, -0.4);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(5.15, 0, 0.03);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		if (entity instanceof EntityFreightBapHuskyStack) {
			EntityFreightBapHuskyStack wellcar = (EntityFreightBapHuskyStack)entity;
			if (wellcar.container1 != null && wellcar.container1.theType.equals("FortyFootContainer")) {
				Modelcontainer40 theContainer = new Modelcontainer40();
				Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container1.color + ".png"));

				GL11.glPushMatrix();
				GL11.glScalef(1,1,0.9f);
				GL11.glTranslated(0,-0.2,0);
				theContainer.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
			if (wellcar.container2 != null && wellcar.container2.theType.equals("FortyFootContainer")) {
				Modelcontainer40 theContainer = new Modelcontainer40();
				Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container2.color + ".png"));

				GL11.glPushMatrix();
				GL11.glScalef(1,1,0.9f);
				GL11.glTranslated(0,-1.5,0);
				theContainer.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		}
	}
}