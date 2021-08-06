//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2020 - 13:20:13
// Last changed on: 20.12.2020 - 13:20:13

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelPE_Tender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPE_Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 1F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 3
		bodyModel[12] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 8
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 8
		bodyModel[15] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 8
		bodyModel[16] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 8
		bodyModel[18] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[23] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		bodyModel[28] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 8
		bodyModel[29] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		bodyModel[30] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		bodyModel[31] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 8
		bodyModel[32] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 8
		bodyModel[33] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "cull"); // Box 8 Cull
		bodyModel[34] = new ModelRendererTurbo(this, 185, 9, textureX, textureY, "cull"); // Box 8 Cull
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "lamp"); // Rear light top
		bodyModel[36] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Rear light socket
		bodyModel[40] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 25, 17, textureX, textureY, "lamp"); // Red Marker light
		bodyModel[44] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 3
		bodyModel[45] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 3
		bodyModel[46] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 8
		bodyModel[47] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 8
		bodyModel[48] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 3
		bodyModel[49] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 3
		bodyModel[51] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 3
		bodyModel[52] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 3
		bodyModel[53] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 8
		bodyModel[54] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 8
		bodyModel[55] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // fyuifyg
		bodyModel[56] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Rear light socket
		bodyModel[57] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 8
		bodyModel[58] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 8
		bodyModel[59] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 8
		bodyModel[60] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 3
		bodyModel[61] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 115, 136, textureX, textureY); // Box 8
		bodyModel[64] = new ModelRendererTurbo(this, 3, 140, textureX, textureY); // Box 3
		bodyModel[65] = new ModelRendererTurbo(this, 115, 121, textureX, textureY); // Box 3
		bodyModel[66] = new ModelRendererTurbo(this, 59, 140, textureX, textureY); // Box 3
		bodyModel[67] = new ModelRendererTurbo(this, 64, 121, textureX, textureY); // Box 3
		bodyModel[68] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 3
		bodyModel[69] = new ModelRendererTurbo(this, 115, 146, textureX, textureY); // Box 8

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(29F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-33F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 56, 1, 22, 0F); // Box 3
		bodyModel[2].setRotationPoint(-29F, 1F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 3
		bodyModel[3].setRotationPoint(-31F, -1F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Box 5
		bodyModel[4].setRotationPoint(-29F, 2F, -2.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 3
		bodyModel[5].setRotationPoint(27F, 1F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 29, 16, 22, 0F); // Box 8
		bodyModel[6].setRotationPoint(-2F, -15F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 27, 16, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-29F, -15F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 27, 16, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(-29F, -15F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 27, 2, 20, 0F); // Box 3
		bodyModel[9].setRotationPoint(-29F, -1F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 12, 20, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[10].setRotationPoint(-16F, -15F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 14, 2, 20, 0F); // Box 3
		bodyModel[11].setRotationPoint(-16F, -3F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[12].setRotationPoint(2.23F, -19.23F, -10F);
		bodyModel[12].rotateAngleZ = -0.78539816F;

		bodyModel[13].addBox(0F, 0F, 0F, 5, 14, 6, 0F); // Box 8
		bodyModel[13].setRotationPoint(-29F, -15F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 14, 6, 0F); // Box 8
		bodyModel[14].setRotationPoint(-29F, -15F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[15].setRotationPoint(-25F, -17F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[16].setRotationPoint(-25F, -17F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 8
		bodyModel[17].setRotationPoint(-25F, -19F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[18].setRotationPoint(-25F, -19F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 3
		bodyModel[19].setRotationPoint(-25F, -17F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 3
		bodyModel[20].setRotationPoint(-25F, -19F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[21].setRotationPoint(-25F, -17F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[22].setRotationPoint(-25F, -18F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-25F, -17F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[24].setRotationPoint(-25F, -18F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,-1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[25].setRotationPoint(-28F, -17F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,-0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 8
		bodyModel[26].setRotationPoint(-27F, -19F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,-1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[27].setRotationPoint(-28F, -17F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F); // Box 8
		bodyModel[28].setRotationPoint(-27F, -19F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[29].setRotationPoint(2F, -17F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[30].setRotationPoint(2F, -19F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[31].setRotationPoint(2F, -17F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[32].setRotationPoint(2F, -19F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 8 Cull
		bodyModel[33].setRotationPoint(27F, -15F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 8 Cull
		bodyModel[34].setRotationPoint(25F, -19F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Rear light top
		bodyModel[35].setRotationPoint(26.5F, -18.5F, -1.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 43
		bodyModel[36].setRotationPoint(27.5F, -18F, -1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 43
		bodyModel[37].setRotationPoint(27.5F, -18F, 1F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 43
		bodyModel[38].setRotationPoint(27.5F, -18F, -1F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Rear light socket
		bodyModel[39].setRotationPoint(26F, -18.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 43
		bodyModel[40].setRotationPoint(26F, -16F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(24F, -18F, -1.51F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(24F, -18F, 1.51F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Red Marker light
		bodyModel[43].setRotationPoint(27.5F, -12F, -1F);

		bodyModel[44].addBox(0F, 0F, 0F, 56, 1, 0, 0F); // Box 3
		bodyModel[44].setRotationPoint(-29F, 2F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 56, 1, 0, 0F); // Box 3
		bodyModel[45].setRotationPoint(-29F, 2F, 11F);

		bodyModel[46].addBox(0F, 0F, -1F, 0, 16, 1, 0F); // Box 8
		bodyModel[46].setRotationPoint(27F, -15F, -11F);
		bodyModel[46].rotateAngleY = 0.6981317F;

		bodyModel[47].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 8
		bodyModel[47].setRotationPoint(27F, -15F, 11F);
		bodyModel[47].rotateAngleY = -0.6981317F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[48].setRotationPoint(27F, 2F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[49].setRotationPoint(-31F, 2F, -10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 3
		bodyModel[50].setRotationPoint(-31F, 1F, -10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[51].setRotationPoint(-31F, 2F, 10.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 3
		bodyModel[52].setRotationPoint(-31F, 1F, 5.5F);

		bodyModel[53].addBox(0F, 0F, -1F, 0, 16, 1, 0F); // Box 8
		bodyModel[53].setRotationPoint(-29F, -15F, -11F);
		bodyModel[53].rotateAngleY = -0.6981317F;

		bodyModel[54].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 8
		bodyModel[54].setRotationPoint(-29F, -15F, 11F);
		bodyModel[54].rotateAngleY = 0.6981317F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // fyuifyg
		bodyModel[55].setRotationPoint(27.5F, -12.5F, -1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Rear light socket
		bodyModel[56].setRotationPoint(27F, -12.5F, -1.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 22, 2, 0, 0F); // Box 8
		bodyModel[57].setRotationPoint(5F, -17F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 22, 2, 0, 0F); // Box 8
		bodyModel[58].setRotationPoint(5F, -17F, 11F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 2, 22, 0F); // Box 8
		bodyModel[59].setRotationPoint(27F, -17F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[60].setRotationPoint(27F, 2F, 10.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[61].setRotationPoint(13F, 4F, -1F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[62].setRotationPoint(-17F, 4F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 53, 9, 0, 0F); // Box 8
		bodyModel[63].setRotationPoint(-28F, -11F, 11.02F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 18, 0F,0F, -4F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 3
		bodyModel[64].setRotationPoint(-15F, -21F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F,-8F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[65].setRotationPoint(-15F, -21F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 4, 18, 0F,0F, 0F, -9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 3
		bodyModel[66].setRotationPoint(-7F, -21F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F,0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F); // Box 3
		bodyModel[67].setRotationPoint(-15F, -21F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 16, 20, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[68].setRotationPoint(-23F, -17F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 53, 9, 0, 0F); // Box 8
		bodyModel[69].setRotationPoint(-28F, -11F, -11.02F);
	}
	Modelbuckeye3axletruck theTrucc = new Modelbuckeye3axletruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 70; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/buckeye_3Axle_Black_friccbearing.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.0, -0.0, 0);
		theTrucc.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(1.8, 0, 0);
		theTrucc.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}