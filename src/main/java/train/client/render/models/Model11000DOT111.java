//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.11.2020 - 16:00:36
// Last changed on: 06.11.2020 - 16:00:36

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class Model11000DOT111 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model11000DOT111() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[84];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 5
		bodyModel[10] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 75
		bodyModel[15] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 5
		bodyModel[17] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 5
		bodyModel[18] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 5
		bodyModel[29] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 5
		bodyModel[32] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 5
		bodyModel[33] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 3
		bodyModel[36] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 3
		bodyModel[37] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 75
		bodyModel[38] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 108
		bodyModel[42] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 108
		bodyModel[47] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 124
		bodyModel[58] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 124
		bodyModel[59] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 126
		bodyModel[60] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 126
		bodyModel[61] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 126
		bodyModel[62] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 108
		bodyModel[70] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 108
		bodyModel[71] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 141
		bodyModel[76] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 139
		bodyModel[77] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 146
		bodyModel[80] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 147
		bodyModel[81] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 148
		bodyModel[82] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 108

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(27F, 2.5F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-31F, 2.5F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 6, 20, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-19F, -11F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 38, 6, 10, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-19F, -18F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F); // Box 5
		bodyModel[4].setRotationPoint(-19F, -18.5F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 38, 6, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-19F, -18.5F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 38, 6, 10, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[6].setRotationPoint(-19F, -18F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 38, 6, 10, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[7].setRotationPoint(-19F, -4F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 6, 6, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[8].setRotationPoint(-19F, -3.5F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 38, 6, 6, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[9].setRotationPoint(-19F, -3.5F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 38, 6, 10, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[10].setRotationPoint(-19F, -4F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[11].setRotationPoint(13F, 5F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[12].setRotationPoint(-15F, 5F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 13, 2, 4, 0F); // Box 75
		bodyModel[13].setRotationPoint(13F, 3F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 2, 4, 0F); // Box 75
		bodyModel[14].setRotationPoint(-26F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-23F, -18F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[16].setRotationPoint(-23F, -18.5F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[17].setRotationPoint(-23F, -18.5F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[18].setRotationPoint(-23F, -18F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 4
		bodyModel[19].setRotationPoint(-23F, -4F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 5
		bodyModel[20].setRotationPoint(-23F, -3.5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 5
		bodyModel[21].setRotationPoint(-23F, -3.5F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 4
		bodyModel[22].setRotationPoint(-23F, -4F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[23].setRotationPoint(-23F, -11F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F); // Box 3
		bodyModel[24].setRotationPoint(-23F, -11F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[25].setRotationPoint(-23F, -11F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[26].setRotationPoint(19F, -18F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[27].setRotationPoint(19F, -18.5F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[28].setRotationPoint(19F, -18.5F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[29].setRotationPoint(19F, -18F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[30].setRotationPoint(19F, -4F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[31].setRotationPoint(19F, -3.5F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[32].setRotationPoint(19F, -3.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 4
		bodyModel[33].setRotationPoint(19F, -4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[34].setRotationPoint(19F, -11F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[35].setRotationPoint(19F, -11F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[36].setRotationPoint(19F, -11F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 13, 1, 22, 0F); // Box 75
		bodyModel[37].setRotationPoint(13F, 2F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 13, 1, 22, 0F); // Box 75
		bodyModel[38].setRotationPoint(-26F, 2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 106
		bodyModel[39].setRotationPoint(26F, 2F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 106
		bodyModel[40].setRotationPoint(-27F, 2F, -2F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 108
		bodyModel[41].setRotationPoint(-15F, -2F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 108
		bodyModel[42].setRotationPoint(-15F, -2F, -11F);
		bodyModel[42].rotateAngleX = 0.6981317F;

		bodyModel[43].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 108
		bodyModel[43].setRotationPoint(13F, -2F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 108
		bodyModel[44].setRotationPoint(13F, -2F, -11F);
		bodyModel[44].rotateAngleX = 0.6981317F;

		bodyModel[45].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 108
		bodyModel[45].setRotationPoint(-15F, -2F, 11F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 108
		bodyModel[46].setRotationPoint(-15F, -2F, 11F);
		bodyModel[46].rotateAngleX = 2.44346095F;

		bodyModel[47].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 108
		bodyModel[47].setRotationPoint(13F, -2F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 108
		bodyModel[48].setRotationPoint(13F, -2F, 11F);
		bodyModel[48].rotateAngleX = 2.44346095F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(-15F, 3F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-15F, 3F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[51].setRotationPoint(-26F, 3F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[52].setRotationPoint(-26F, 3F, 2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(24F, 3F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[54].setRotationPoint(24F, 3F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[55].setRotationPoint(13F, 3F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[56].setRotationPoint(13F, 3F, 2F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[57].setRotationPoint(-23.02F, -8F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[58].setRotationPoint(23.02F, -8F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 126
		bodyModel[59].setRotationPoint(-26F, 3F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 126
		bodyModel[60].setRotationPoint(-26F, 3F, 11F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 126
		bodyModel[61].setRotationPoint(23F, 3F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 126
		bodyModel[62].setRotationPoint(23F, 3F, 11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-13F, 2F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 75
		bodyModel[64].setRotationPoint(6F, 2F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 26, 1, 0, 0F); // Box 108
		bodyModel[65].setRotationPoint(-13F, 2F, 11F);

		bodyModel[66].addBox(0F, 0F, 0F, 26, 1, 0, 0F); // Box 108
		bodyModel[66].setRotationPoint(-13F, 2F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 108
		bodyModel[67].setRotationPoint(-2F, -11.5F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 108
		bodyModel[68].setRotationPoint(-2F, -11.5F, 11F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 108
		bodyModel[69].setRotationPoint(-2F, -17.75F, -6F);
		bodyModel[69].rotateAngleX = -0.67413342F;

		bodyModel[70].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 108
		bodyModel[70].setRotationPoint(-2F, -17.75F, 6F);
		bodyModel[70].rotateAngleX = 0.67413342F;

		bodyModel[71].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[71].setRotationPoint(-2F, -21F, -2F);

		bodyModel[72].addBox(0F, 0F, 0F, 12, 5, 0, 0F); // Box 139
		bodyModel[72].setRotationPoint(-6F, -22.75F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 12, 0, 12, 0F); // Box 140
		bodyModel[73].setRotationPoint(-6F, -17.75F, -6F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 141
		bodyModel[74].setRotationPoint(-6F, -22.75F, -6F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 141
		bodyModel[75].setRotationPoint(6F, -22.75F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 12, 5, 0, 0F); // Box 139
		bodyModel[76].setRotationPoint(-6F, -22.75F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 108
		bodyModel[77].setRotationPoint(-2F, -11.5F, 11F);
		bodyModel[77].rotateAngleX = 3.29867229F;

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 108
		bodyModel[78].setRotationPoint(-2F, -11.5F, -11F);
		bodyModel[78].rotateAngleX = -0.15707963F;

		bodyModel[79].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 146
		bodyModel[79].setRotationPoint(-22F, -1F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147
		bodyModel[80].setRotationPoint(-24.02F, -7F, 3F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 148
		bodyModel[81].setRotationPoint(-24.02F, -8F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[82].setRotationPoint(14F, -3F, 11.03F);
		bodyModel[82].rotateAngleZ = -0.78539816F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[83].setRotationPoint(-14F, -3F, -11.03F);
		bodyModel[83].rotateAngleZ = -0.78539816F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 84; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-0.87,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.73,0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model11000DOT111[];
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}