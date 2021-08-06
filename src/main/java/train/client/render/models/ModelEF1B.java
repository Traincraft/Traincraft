//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.05.2020 - 17:36:30
// Last changed on: 23.05.2020 - 17:36:30

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelEF1B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEF1B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[85];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 2, 132, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 151, 99, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 307, 103, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 101, 37, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 109, 16, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 116, 30, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 116, 9, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 303, 21, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 315, 17, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 315, 35, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 424, 16, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 181, 70, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 181, 61, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 191, 60, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 191, 69, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 204, 70, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 204, 61, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 214, 69, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 228, 70, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 237, 60, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 238, 69, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 296, 9, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 296, 41, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 301, 48, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 306, 48, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 311, 48, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 316, 48, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 321, 48, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 336, 48, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 346, 48, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 351, 48, textureX, textureY); // Box 4
		bodyModel[36] = new ModelRendererTurbo(this, 356, 48, textureX, textureY); // Box 4
		bodyModel[37] = new ModelRendererTurbo(this, 361, 48, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 326, 48, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 331, 48, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 301, 5, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 306, 5, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 311, 5, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 316, 5, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 321, 5, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 336, 5, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 341, 5, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 346, 5, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 351, 5, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 356, 5, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 361, 5, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 326, 5, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 331, 5, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 178, 107, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 167, 91, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 219, 98, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 167, 99, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 202, 91, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 232, 107, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 266, 97, textureX, textureY); // Box 4
		bodyModel[63] = new ModelRendererTurbo(this, 235, 81, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 254, 83, textureX, textureY); // Box 4
		bodyModel[65] = new ModelRendererTurbo(this, 296, 16, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 296, 35, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 42, 161, textureX, textureY); // Box 427
		bodyModel[68] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 427
		bodyModel[69] = new ModelRendererTurbo(this, 168, 64, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 168, 76, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 166, 69, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 253, 76, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 251, 69, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 1, 72, textureX, textureY); // Box 4
		bodyModel[77] = new ModelRendererTurbo(this, 142, 64, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 126, 64, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 290, 9, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 26, 161, textureX, textureY); // Box 1
		bodyModel[81] = new ModelRendererTurbo(this, 26, 174, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 19, 176, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 42, 176, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 276, 58, textureX, textureY); // Box 4

		bodyModel[0].addBox(0F, 0F, 0F, 68, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 66, 1, 20, 0F); // Box 0
		bodyModel[1].setRotationPoint(-33F, -3F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 15, 12, 0F); // Box 4
		bodyModel[2].setRotationPoint(-22F, -18F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 4
		bodyModel[3].setRotationPoint(33F, -19F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 66, 1, 20, 0F); // Box 0
		bodyModel[4].setRotationPoint(-33F, -19F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 68, 1, 12, 0F); // Box 0
		bodyModel[5].setRotationPoint(-34F, -20F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 68, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-34F, -20F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 68, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-34F, -20F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 56, 1, 12, 0F); // Box 0
		bodyModel[8].setRotationPoint(-25F, -21F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 54, 3, 0, 0F); // Box 0
		bodyModel[9].setRotationPoint(-25F, -24F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 54, 3, 0, 0F); // Box 0
		bodyModel[10].setRotationPoint(-25F, -24F, 6F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[11].setRotationPoint(29F, -24F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[12].setRotationPoint(29F, -24F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-4F, -24F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-4F, -24F, 1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-3.5F, -22F, 1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-3.5F, -22F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(7F, -24F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(7F, -24F, 1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(7.5F, -22F, 1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(7.5F, -22F, -5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(19F, -24F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(19F, -24F, 1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(19.5F, -22F, 1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(19.5F, -22F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 68, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-34F, -20F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 68, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-34F, -20F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[27].setRotationPoint(-34F, -20F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[28].setRotationPoint(-28F, -20F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[29].setRotationPoint(-22F, -20F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[30].setRotationPoint(-16F, -20F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[31].setRotationPoint(-10F, -20F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[32].setRotationPoint(5.5F, -20F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[33].setRotationPoint(11.5F, -20F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[34].setRotationPoint(17.5F, -20F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[35].setRotationPoint(21F, -20F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[36].setRotationPoint(27F, -20F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[37].setRotationPoint(33F, -20F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[38].setRotationPoint(-6.5F, -20F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[39].setRotationPoint(-0.5F, -20F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[40].setRotationPoint(-34F, -20F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[41].setRotationPoint(-28F, -20F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[42].setRotationPoint(-22F, -20F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[43].setRotationPoint(-16F, -20F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[44].setRotationPoint(-10F, -20F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[45].setRotationPoint(5.5F, -20F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[46].setRotationPoint(11.5F, -20F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[47].setRotationPoint(17.5F, -20F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[48].setRotationPoint(21F, -20F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[49].setRotationPoint(27F, -20F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[50].setRotationPoint(33F, -20F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[51].setRotationPoint(-6.5F, -20F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[52].setRotationPoint(-0.5F, -20F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[53].setRotationPoint(-34F, -2F, 1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[54].setRotationPoint(-34F, -2F, -10.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 14, 7, 12, 0F); // Box 4
		bodyModel[55].setRotationPoint(-21F, -10F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // Box 4
		bodyModel[56].setRotationPoint(-21F, -14F, -2.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 11, 9, 0F); // Box 4
		bodyModel[57].setRotationPoint(-7F, -14F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[58].setRotationPoint(-21F, -16F, -2.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		bodyModel[59].setRotationPoint(-21F, -12F, -2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[60].setRotationPoint(-7F, -17F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 25, 15, 12, 0F); // Box 4
		bodyModel[61].setRotationPoint(-4F, -18F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[62].setRotationPoint(25F, -8F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 13, 12, 0F); // Box 4
		bodyModel[63].setRotationPoint(22F, -16F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[64].setRotationPoint(25F, -8F, 2F);

		bodyModel[65].addBox(0F, 0F, 0F, 9, 4, 0, 0F); // Box 0
		bodyModel[65].setRotationPoint(-34F, -24F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 9, 4, 0, 0F); // Box 0
		bodyModel[66].setRotationPoint(-34F, -24F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[67].setRotationPoint(-20F, -0.5F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[68].setRotationPoint(17F, -0.5F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(-6.5F, -25F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(-6.5F, -25F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[71].setRotationPoint(-6.5F, -23F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(21F, -25F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[73].setRotationPoint(21F, -25F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(21F, -23F, -2F);

		bodyModel[75].addBox(0F, 0F, 0F, 68, 17, 1, 0F); // Box 4
		bodyModel[75].setRotationPoint(-34F, -19F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 68, 17, 1, 0F); // Box 4
		bodyModel[76].setRotationPoint(-34F, -19F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[77].setRotationPoint(-4F, -21F, -11.02F);

		bodyModel[78].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[78].setRotationPoint(-4F, -21F, 11.02F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Box 0
		bodyModel[79].setRotationPoint(-32F, -24F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[80].setRotationPoint(31F, -2F, 1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[81].setRotationPoint(31F, -2F, -10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 0
		bodyModel[82].setRotationPoint(-34F, 0F, -1.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 0
		bodyModel[83].setRotationPoint(31F, 0F, -1.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 4
		bodyModel[84].setRotationPoint(-34F, -19F, -10F);
	}
	ModelEF1d theTrucks = new ModelEF1d();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 85; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));

		}
		GL11.glPushMatrix();
		GL11.glTranslatef(1.0625F, 0F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(-1.0625F, -0F, 0);
		GL11.glRotatef(180, 0, 1, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelEF1B[];
}