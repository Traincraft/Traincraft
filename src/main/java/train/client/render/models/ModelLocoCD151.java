//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CD 151
// Model Creator: Ondar
// Created on: 07.07.2018 - 13:59:53
// Last changed on: 07.07.2018 - 13:59:53

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelLocoCD151 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;
	public ModelLocoCD151() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private ModelCD151Bogie bogie = new ModelCD151Bogie();
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		for (ModelRendererTurbo mrt : bodyModel){
			if(mrt.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(scale,false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(scale,false);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"cd151_front_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.15f,0.3f,-0.4f);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		GL11.glTranslatef(3.1f,0f,0);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 363, 59, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 373, 5, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 373, 5, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 153, 28, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 153, 28, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // lamp
		bodyModel[47] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // lamp
		bodyModel[48] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 161, 17, textureX, textureY, "lamp"); // lamp
		bodyModel[51] = new ModelRendererTurbo(this, 161, 17, textureX, textureY, "lamp"); // lamp
		bodyModel[52] = new ModelRendererTurbo(this, 369, 39, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 59

		bodyModel[0].addBox(0F, 0F, 0F, 53, 24, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, -20F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 53, 3, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-27F, -23F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 6, 22, 0F,0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-10F, -26F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 2, 22, 0F); // Box 3
		bodyModel[3].setRotationPoint(-6.5F, 4F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,0F, 0F, -3F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(26F, -23F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 2, 10, 0F); // Box 5
		bodyModel[5].setRotationPoint(18F, -25F, -5F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 2, 10, 0F); // Box 6
		bodyModel[6].setRotationPoint(-27F, -25F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 7
		bodyModel[7].setRotationPoint(28F, -8F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,1F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, -2F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-37F, -23F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(26F, -20F, 10F);

		bodyModel[10].addShapeBox(0F, -3F, 0F, 5, 9, 20, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-42F, -10F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 11
		bodyModel[11].setRotationPoint(-33F, -8F, -4F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 8, 22, 0F); // Box 12
		bodyModel[12].setRotationPoint(26F, -4F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 13
		bodyModel[13].setRotationPoint(26F, -20F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(38F, 4F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(29F, 4F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(29F, 4F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 18
		bodyModel[17].setRotationPoint(-39F, -20F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 12, 8, 22, 0F); // Box 19
		bodyModel[18].setRotationPoint(-39F, -4F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 20
		bodyModel[19].setRotationPoint(-39F, -20F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-39F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-35F, 4F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-35F, 4F, 11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(18F, -25F, -1F);
		bodyModel[23].rotateAngleZ = 0.41887902F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(18F, -32F, -1F);
		bodyModel[24].rotateAngleZ = -0.38397244F;

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 26
		bodyModel[25].setRotationPoint(17F, -33F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-27F, -29F, -1F);
		bodyModel[26].rotateAngleZ = 0.38397244F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-27.05F, -29F, -1F);
		bodyModel[27].rotateAngleZ = -0.46251225F;

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 29
		bodyModel[28].setRotationPoint(-19F, -33F, -3F);

		bodyModel[29].addShapeBox(0F, -3F, 0F, 5, 9, 20, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(36F, -10F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 31
		bodyModel[30].setRotationPoint(-36F, -18F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 32
		bodyModel[31].setRotationPoint(29F, -18F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 33
		bodyModel[32].setRotationPoint(-36F, -18F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 34
		bodyModel[33].setRotationPoint(29F, -18F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 35
		bodyModel[34].setRotationPoint(-3F, -8F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 36
		bodyModel[35].setRotationPoint(-3F, -8F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(41F, -4F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(41F, -20F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-43F, -20F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 8, 22, 0F); // Box 40
		bodyModel[39].setRotationPoint(41F, -12F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 8, 22, 0F); // Box 41
		bodyModel[40].setRotationPoint(-43F, -12F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-43F, -4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(38F, -20F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(38F, -20F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(-42F, -20F, 10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(-42F, -20F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // lamp
		bodyModel[46].setRotationPoint(-42.2F, -2F, 5F);
		bodyModel[46].rotateAngleZ = 0.45378561F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // lamp
		bodyModel[47].setRotationPoint(-42.2F, -2F, -7F);
		bodyModel[47].rotateAngleZ = 0.45378561F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-42.2F, -2F, -3F);
		bodyModel[48].rotateAngleZ = 0.45378561F;

		bodyModel[49].addShapeBox(-1F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 50
		bodyModel[49].setRotationPoint(41.2F, -2F, -3F);
		bodyModel[49].rotateAngleZ = -0.45378561F;

		bodyModel[50].addShapeBox(-1F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // lamp
		bodyModel[50].setRotationPoint(41.2F, -2F, 7F);
		bodyModel[50].rotateAngleZ = -0.45378561F;

		bodyModel[51].addShapeBox(-1F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // lamp
		bodyModel[51].setRotationPoint(41.2F, -2F, -9F);
		bodyModel[51].rotateAngleZ = -0.45378561F;

		bodyModel[52].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 52
		bodyModel[52].setRotationPoint(38F, 2F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 53
		bodyModel[53].setRotationPoint(-45F, 2F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 54
		bodyModel[54].setRotationPoint(38F, -12F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 55
		bodyModel[55].setRotationPoint(38F, -12F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 56
		bodyModel[56].setRotationPoint(-42F, -12F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 57
		bodyModel[57].setRotationPoint(-42F, -12F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-10.5F, 4F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(5.5F, 4F, -11F);
	}
}