//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SkeletonLogCar
// Model Creator: Bida
// Created on: 06.08.2021 - 22:49:17
// Last changed on: 06.08.2021 - 22:49:17

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.loads.ModelBigLog;
import train.client.render.models.loads.ModelMixedLogs;
import train.common.api.Freight;
import train.common.library.Info;

import java.util.Arrays;
import java.util.List;

public class ModelSkeletonLogCar extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelSkeletonLogCar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 48, 8, textureX, textureY); // Box 66
		bodyModel[6] = new ModelRendererTurbo(this, 48, 8, textureX, textureY); // Box 67
		bodyModel[7] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 72
		bodyModel[8] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 28, 18, textureX, textureY); // Box 74
		bodyModel[10] = new ModelRendererTurbo(this, 28, 18, textureX, textureY); // Box 75
		bodyModel[11] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 76
		bodyModel[12] = new ModelRendererTurbo(this, 75, 32, textureX, textureY); // Box 77
		bodyModel[13] = new ModelRendererTurbo(this, 41, 8, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 41, 8, textureX, textureY); // Box 79
		bodyModel[15] = new ModelRendererTurbo(this, 48, 8, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 48, 8, textureX, textureY); // Box 81
		bodyModel[17] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 286
		bodyModel[18] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 287
		bodyModel[19] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[20] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 194
		bodyModel[22] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 195
		bodyModel[23] = new ModelRendererTurbo(this, -2, 38, textureX, textureY); // Box 196
		bodyModel[24] = new ModelRendererTurbo(this, 32, 32, textureX, textureY); // Box 197
		bodyModel[25] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 198
		bodyModel[26] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 199
		bodyModel[27] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 200
		bodyModel[28] = new ModelRendererTurbo(this, -3, 38, textureX, textureY); // Box 201
		bodyModel[29] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 203
		bodyModel[31] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 204
		bodyModel[32] = new ModelRendererTurbo(this, 32, 43, textureX, textureY); // Box 205
		bodyModel[33] = new ModelRendererTurbo(this, 32, 37, textureX, textureY); // Box 206
		bodyModel[34] = new ModelRendererTurbo(this, 41, 43, textureX, textureY); // Box 207
		bodyModel[35] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 208
		bodyModel[36] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 209
		bodyModel[37] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 210
		bodyModel[38] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 211
		bodyModel[39] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 212
		bodyModel[40] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 213
		bodyModel[41] = new ModelRendererTurbo(this, 54, 37, textureX, textureY); // Box 222
		bodyModel[42] = new ModelRendererTurbo(this, 38, 37, textureX, textureY); // Box 223
		bodyModel[43] = new ModelRendererTurbo(this, 59, 34, textureX, textureY); // Box 278
		bodyModel[44] = new ModelRendererTurbo(this, 41, 31, textureX, textureY); // Box 279

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-34F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(31F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 1
		bodyModel[2].setRotationPoint(-22F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 62, 2, 4, 0F); // Box 10
		bodyModel[3].setRotationPoint(-31F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 65
		bodyModel[4].setRotationPoint(18F, 5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 66
		bodyModel[5].setRotationPoint(-21.5F, 2F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 67
		bodyModel[6].setRotationPoint(18.5F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 72
		bodyModel[7].setRotationPoint(-21F, 1F, -10.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[8].setRotationPoint(-21F, 1F, 8.25F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 74
		bodyModel[9].setRotationPoint(19F, 1F, 8.25F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 75
		bodyModel[10].setRotationPoint(19F, 1F, -10.25F);

		bodyModel[11].addBox(0F, 0F, 0F, 9, 1, 20, 0F); // Box 76
		bodyModel[11].setRotationPoint(-30.5F, 2F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 9, 1, 20, 0F); // Box 77
		bodyModel[12].setRotationPoint(21.5F, 2F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[13].setRotationPoint(-21F, -11F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[14].setRotationPoint(19F, -11F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[15].setRotationPoint(19F, -11F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[16].setRotationPoint(-21F, -11F, 9F);

		bodyModel[17].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[17].setRotationPoint(2F, 6F, -2F);
		bodyModel[17].rotateAngleX = -0.78539816F;

		bodyModel[18].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[18].setRotationPoint(5F, 6F, -2F);
		bodyModel[18].rotateAngleX = -0.78539816F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[19].setRotationPoint(-21.5F, 3F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[20].setRotationPoint(-21.5F, 3F, 2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[21].setRotationPoint(18.5F, 3F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[22].setRotationPoint(18.5F, 3F, 2F);

		bodyModel[23].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[23].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[23].rotateAngleY = -0.52359878F;

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 197
		bodyModel[24].setRotationPoint(3F, 3.5F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[25].setRotationPoint(-4.5F, 6F, -2.5F);

		bodyModel[26].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[26].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[26].rotateAngleY = -0.52359878F;

		bodyModel[27].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[27].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[27].rotateAngleY = -0.26179939F;

		bodyModel[28].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[28].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[28].rotateAngleY = -0.26179939F;

		bodyModel[29].addBox(-14.5F, 0F, 2F, 16, 0, 1, 0F); // Box 202
		bodyModel[29].setRotationPoint(-3F, 6.01F, -0.5F);
		bodyModel[29].rotateAngleY = 0.17453293F;
		bodyModel[29].rotateAngleZ = 0.08726646F;

		bodyModel[30].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[30].setRotationPoint(-3F, 6F, 0F);

		bodyModel[31].addBox(-1F, 0F, -1.5F, 8, 0, 1, 0F); // Box 204
		bodyModel[31].setRotationPoint(11F, 6.01F, -0.5F);
		bodyModel[31].rotateAngleY = 0.17453293F;
		bodyModel[31].rotateAngleZ = -0.08726646F;

		bodyModel[32].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 205
		bodyModel[32].setRotationPoint(-31F, 3F, 2F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 206
		bodyModel[33].setRotationPoint(-31F, 3F, 3.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 207
		bodyModel[34].setRotationPoint(-30.5F, 3.5F, 2.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 208
		bodyModel[35].setRotationPoint(-21.5F, 1F, -10F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 209
		bodyModel[36].setRotationPoint(18.5F, 1F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 210
		bodyModel[37].setRotationPoint(-30.5F, 3F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 211
		bodyModel[38].setRotationPoint(-30.5F, 3F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 212
		bodyModel[39].setRotationPoint(26.5F, 3F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 213
		bodyModel[40].setRotationPoint(26.5F, 3F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 222
		bodyModel[41].setRotationPoint(-30.5F, -2F, 5F);

		bodyModel[42].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[42].setRotationPoint(-30F, -1.5F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 278
		bodyModel[43].setRotationPoint(-30.5F, -2F, 2F);

		bodyModel[44].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 279
		bodyModel[44].setRotationPoint(-30F, -1.5F, 2F);
	}
	ModelFrictionTruck bogie = new ModelFrictionTruck();
	ModelBigLog load1 = new ModelBigLog();
	ModelMixedLogs load2 = new ModelMixedLogs();

	List<String> redwoods = Arrays.asList(new String[]{"tile.logs3.redwoodWood", "anotherKindofRedwood"});

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		if (!(entity instanceof Freight)) {
			return;
		}

		Freight freight = (Freight)entity;
		for(int i = 0; i < 45; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(freight.getAmmountOfCargo() > 0) {
			for (ItemStack item : freight.cargoItems) {

				if (item!=null && redwoods.contains(item.getUnlocalizedName())) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Redwood.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load2.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
					break;
				}else if(item!=null && (item.getUnlocalizedName().equals("tile.log.spruce"))){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Spruce.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load2.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
					break;
				}else if(item!=null && (item.getUnlocalizedName().equals("tile.log.birch"))){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Birch.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load2.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
					break;
				}else{
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Oak.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f, -0.0, 0.0);
					load2.render(entity, f, f1, f2, f3, f4, f5);
					GL11.glPopMatrix();
					break;
				}
			}
				/*if (freight.getColor() == 8) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Spruce.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load2.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
				} else if(freight.getColor() == 7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/BigLog_Spruce.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load1.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/MixedLogs_Redwood.png"));
					GL11.glPushMatrix();
					GL11.glTranslated(-0f,-0.0,0.0);
					load2.render(entity,f,f1,f2,f3,f4,f5);
					GL11.glPopMatrix();
				}*/
		}
		if(freight.getColor() == 5465469){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.25,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.5,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}

	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }

}