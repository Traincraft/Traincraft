//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.05.2018 - 22:36:04
// Last changed on: 26.05.2018 - 22:36:04

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.EntityRollingStock;
import train.common.library.Info;

public class ModelC62Tender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	private ModelC62TenderBogie bogie = new ModelC62TenderBogie();

	public ModelC62Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		super.render(entity, f0, f1, f2, f3, f4, scale);
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"c62_tender_bogie_"+((EntityRollingStock)entity).getColorAsString() + ".png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(2.25f,0f,0);
		bogie.render();
		GL11.glTranslatef(-2.15f,0,0);
		bogie.render();
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 23

		bodyModel[0].addBox(0F, 0F, 0F, 22, 2, 1, 0F); // Box 10
		bodyModel[0].setRotationPoint(-24F, 27F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 2, 1, 0F); // Box 11
		bodyModel[1].setRotationPoint(-24F, 27F, 9F);

		bodyModel[2].addBox(0F, 0F, 0F, 8, 4, 16, 0F); // Box 12
		bodyModel[2].setRotationPoint(16F, 25F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 55, 16, 20, 0F); // Box 13
		bodyModel[3].setRotationPoint(-26F, 9F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 14
		bodyModel[4].setRotationPoint(29F, 24F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 15
		bodyModel[5].setRotationPoint(27F, 6F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 16
		bodyModel[6].setRotationPoint(-38F, 9F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 10, 8, 0F); // Box 17
		bodyModel[7].setRotationPoint(-29F, 15F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 44, 2, 20, 0F); // Box 23
		bodyModel[8].setRotationPoint(-26F, 25F, -10F);
	}
}