//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.09.2018 - 18:38:17
// Last changed on: 26.09.2018 - 18:38:17

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelD51Tender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelD51Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private ModelC62TenderBogie bogie = new ModelC62TenderBogie();
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		super.render(entity, f0, f1, f2, f3, f4, scale);
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"c62_tender_bogie_Black.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1,-1,1);
		GL11.glTranslatef(5.25f,-0.8f,0);
		bogie.render();
		GL11.glTranslatef(-2f,0,0);
		bogie.render();
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 19, 19, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 14, 14, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 18

		bodyModel[0].addBox(0F, 0F, 0F, 4, 5, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(26F, -13F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 35, 3, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(30F, -16F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(29F, -16F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(65F, -16F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 35, 3, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(30F, -16F, 9F);

		bodyModel[5].addBox(0F, 0F, 0F, 15, 3, 18, 0F); // Box 10
		bodyModel[5].setRotationPoint(50F, -16F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 57, 3, 22, 0F); // Box 11
		bodyModel[6].setRotationPoint(20F, 1F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 20, 14, 1, 0F); // Box 12
		bodyModel[7].setRotationPoint(30F, -13F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 20, 13, 1, 0F); // Box 13
		bodyModel[8].setRotationPoint(30F, -13F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 27, 14, 22, 0F); // Box 14
		bodyModel[9].setRotationPoint(50F, -13F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 14, 1, 0F); // Box 15
		bodyModel[10].setRotationPoint(30F, -13F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 20, 14, 1, 0F); // Box 16
		bodyModel[11].setRotationPoint(30F, -13F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 20, 15, 18, 0F); // Box 17
		bodyModel[12].setRotationPoint(30F, -15F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 18
		bodyModel[13].setRotationPoint(77F, 0F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(26F, -4F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 9, 9, 0F); // Box 15
		bodyModel[15].setRotationPoint(26F, -8F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 9, 9, 0F); // Box 16
		bodyModel[16].setRotationPoint(26F, -8F, 2F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 18
		bodyModel[17].setRotationPoint(75F, -16F, -2F);
	}
}