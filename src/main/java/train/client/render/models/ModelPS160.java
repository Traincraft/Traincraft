//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hi Cube 60'
// Model Creator: 
// Created on: 21.01.2019 - 11:01:10
// Last changed on: 21.01.2019 - 11:01:10

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPS160 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS160() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[46];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 43
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 72
		bodyModel[12] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 78
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 87
		bodyModel[14] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 104
		bodyModel[15] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 105
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 106
		bodyModel[17] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 108
		bodyModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 106
		bodyModel[24] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 106
		bodyModel[25] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 106
		bodyModel[26] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[31] = new ModelRendererTurbo(this, 193, 9, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[32] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[33] = new ModelRendererTurbo(this, 337, 25, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[34] = new ModelRendererTurbo(this, 489, 33, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[35] = new ModelRendererTurbo(this, 353, 9, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[37] = new ModelRendererTurbo(this, 449, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 3
		bodyModel[41] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 3
		bodyModel[42] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 87
		bodyModel[43] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 40
		bodyModel[44] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 87

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27.5F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 81, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-40F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 32, 21, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(-40F, -19F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 21, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(9F, -19F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 21, 20, 0F); // Box 8
		bodyModel[4].setRotationPoint(-40F, -19F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 21, 20, 0F); // Box 9
		bodyModel[5].setRotationPoint(40F, -19F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[6].setRotationPoint(-35.5F, 3F, 11F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[7].setRotationPoint(-27.5F, 2.8F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[8].setRotationPoint(-27.5F, 2.8F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[9].setRotationPoint(24.5F, 2.8F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[10].setRotationPoint(24.5F, 2.8F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[11].setRotationPoint(-41.01F, -7F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[12].setRotationPoint(-8.5F, -18F, -11.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[13].setRotationPoint(-41F, -6F, 3F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 21, 1, 0F); // Box 104
		bodyModel[14].setRotationPoint(9F, -19F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 32, 21, 1, 0F); // Box 105
		bodyModel[15].setRotationPoint(-40F, -19F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[16].setRotationPoint(-26.5F, -19F, 10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[17].setRotationPoint(-8.5F, -18F, 10.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[18].setRotationPoint(44.5F, 3F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 89, 2, 5, 0F); // Box 0
		bodyModel[19].setRotationPoint(-44.5F, 3F, -2.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[20].setRotationPoint(-47.5F, 3F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[21].setRotationPoint(24.5F, 5F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(-35.5F, 3F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[23].setRotationPoint(-26.5F, 3F, 10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[24].setRotationPoint(-8.5F, -19F, -11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[25].setRotationPoint(-8.5F, 3F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-40F, 3F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-40F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(37F, 3F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(37F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[30].setRotationPoint(41F, -7F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[31].setRotationPoint(37F, -7F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[32].setRotationPoint(41F, -7F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[33].setRotationPoint(-41F, -7F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[34].setRotationPoint(-41F, -7F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[35].setRotationPoint(-40F, -7F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[36].setRotationPoint(37F, -7F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[37].setRotationPoint(-40F, -7F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 81, 1, 10, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-40F, -20F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 81, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 39
		bodyModel[39].setRotationPoint(-40F, -20F, 0F);

		bodyModel[40].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[40].setRotationPoint(-8F, -19F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[41].setRotationPoint(-8F, -19F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 87
		bodyModel[42].setRotationPoint(-42F, -2F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[43].setRotationPoint(-26F, 4F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(-26F, 4F, 11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 87
		bodyModel[45].setRotationPoint(-40.5F, -7F, 2F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 46; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.78375,0.575,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.25,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==15){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.65,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.25,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelPS160[];
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}