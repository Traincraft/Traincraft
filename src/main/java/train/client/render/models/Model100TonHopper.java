//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:22.10.2017 - 21:23:15
// Last changed on: 22.10.2017 - 21:23:15

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class Model100TonHopper extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public Model100TonHopper()
	{
		model100tonhopperModel = new ModelRendererTurbo[48];
		model100tonhopperModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		model100tonhopperModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		model100tonhopperModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 10
		model100tonhopperModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 11
		model100tonhopperModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		model100tonhopperModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 51
		model100tonhopperModel[6] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 52
		model100tonhopperModel[7] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 53
		model100tonhopperModel[8] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 66
		model100tonhopperModel[9] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 69
		model100tonhopperModel[10] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 70
		model100tonhopperModel[11] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 72
		model100tonhopperModel[12] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 74
		model100tonhopperModel[13] = new ModelRendererTurbo(this, 369, 76, textureX, textureY); // Box 76
		model100tonhopperModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 102
		model100tonhopperModel[15] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 103
		model100tonhopperModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 112
		model100tonhopperModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 113
		model100tonhopperModel[18] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 120
		model100tonhopperModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 120
		model100tonhopperModel[20] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 121
		model100tonhopperModel[21] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 123
		model100tonhopperModel[22] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 149
		model100tonhopperModel[23] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 150
		model100tonhopperModel[24] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 151
		model100tonhopperModel[25] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 152
		model100tonhopperModel[26] = new ModelRendererTurbo(this, 337, 76, textureX, textureY); // Box 49
		model100tonhopperModel[27] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 50
		model100tonhopperModel[28] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 51
		model100tonhopperModel[29] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 52
		model100tonhopperModel[30] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 56
		model100tonhopperModel[31] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 57
		model100tonhopperModel[32] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 58
		model100tonhopperModel[33] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 59
		model100tonhopperModel[34] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 44
		model100tonhopperModel[35] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 46
		model100tonhopperModel[36] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 47
		model100tonhopperModel[37] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 49
		model100tonhopperModel[38] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 50
		model100tonhopperModel[39] = new ModelRendererTurbo(this, 385, 76, textureX, textureY); // Box 51
		model100tonhopperModel[40] = new ModelRendererTurbo(this, 10, 60, textureX, textureY); // Box 45
		model100tonhopperModel[41] = new ModelRendererTurbo(this, 10, 60, textureX, textureY); // Box 46
		model100tonhopperModel[42] = new ModelRendererTurbo(this, 10, 60, textureX, textureY); // Box 51
		model100tonhopperModel[43] = new ModelRendererTurbo(this, 400, 43, textureX, textureY); // Box 45
		model100tonhopperModel[44] = new ModelRendererTurbo(this, 400, 43, textureX, textureY); // Box 46
		model100tonhopperModel[45] = new ModelRendererTurbo(this, 400, 43, textureX, textureY); // Box 47
		model100tonhopperModel[46] = new ModelRendererTurbo(this, 400, 43, textureX, textureY); // Box 48
		model100tonhopperModel[47] = new ModelRendererTurbo(this, 10, 90, textureX, textureY); // Box 47

		model100tonhopperModel[0].addBox(0F, 0F, 0F, 80, 25, 1, 0F); // Box 0
		model100tonhopperModel[0].setRotationPoint(-40F, -25F, 8F);

		model100tonhopperModel[1].addBox(0F, 0F, 0F, 80, 25, 1, 0F); // Box 1
		model100tonhopperModel[1].setRotationPoint(-40F, -25F, -9F);

		model100tonhopperModel[2].addBox(0F, 0F, 0F, 1, 25, 16, 0F); // Box 10
		model100tonhopperModel[2].setRotationPoint(-40F, -25F, -8F);

		model100tonhopperModel[3].addBox(0F, 0F, 0F, 1, 24, 16, 0F); // Box 11
		model100tonhopperModel[3].setRotationPoint(39F, -25F, -8F);

		model100tonhopperModel[4].addBox(0F, 0F, 0F, 79, 1, 16, 0F); // Box 48
		model100tonhopperModel[4].setRotationPoint(-39F, -1F, -8F);

		model100tonhopperModel[5].addShapeBox(0F, 0F, 0F, 9, 11, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 51
		model100tonhopperModel[5].setRotationPoint(-49F, -25F, -9F);

		model100tonhopperModel[6].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 52
		model100tonhopperModel[6].setRotationPoint(-49F, -1F, -9F);

		model100tonhopperModel[7].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 53
		model100tonhopperModel[7].setRotationPoint(40F, -1F, -9F);

		model100tonhopperModel[8].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		model100tonhopperModel[8].setRotationPoint(-43F, -17F, -9F);

		model100tonhopperModel[9].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		model100tonhopperModel[9].setRotationPoint(-46F, -20F, -9F);

		model100tonhopperModel[10].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		model100tonhopperModel[10].setRotationPoint(-49F, -23F, -9F);

		model100tonhopperModel[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		model100tonhopperModel[11].setRotationPoint(-43F, -17F, 8F);

		model100tonhopperModel[12].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		model100tonhopperModel[12].setRotationPoint(-46F, -20F, 8F);

		model100tonhopperModel[13].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		model100tonhopperModel[13].setRotationPoint(-49F, -23F, 8F);

		model100tonhopperModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 102
		model100tonhopperModel[14].setRotationPoint(-52F, -1.5F, -1F);

		model100tonhopperModel[15].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		model100tonhopperModel[15].setRotationPoint(-49F, -23F, 5F);

		model100tonhopperModel[16].addBox(0F, 0F, -2F, 0, 5, 5, 0F); // Box 112
		model100tonhopperModel[16].setRotationPoint(50F, -12F, -3F);

		model100tonhopperModel[17].addBox(0F, 0F, -2F, 1, 1, 1, 0F); // Box 113
		model100tonhopperModel[17].setRotationPoint(49F, -10F, -1F);

		model100tonhopperModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 120
		model100tonhopperModel[18].setRotationPoint(48F, -1.5F, -1F);

		model100tonhopperModel[19].addTrapezoid(0F, 0F, 0F, 6, 6, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 120
		model100tonhopperModel[19].setRotationPoint(14F, 0F, -3F);

		model100tonhopperModel[20].addTrapezoid(0F, 0F, 0F, 6, 6, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 121
		model100tonhopperModel[20].setRotationPoint(-20F, 0F, -3F);

		model100tonhopperModel[21].addTrapezoid(0F, 0F, 0F, 6, 6, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 123
		model100tonhopperModel[21].setRotationPoint(-3F, 0F, -3F);

		model100tonhopperModel[22].addBox(0F, 0F, 0F, 4, 19, 0, 0F); // Box 149
		model100tonhopperModel[22].setRotationPoint(-49F, -16F, 9.05F);

		model100tonhopperModel[23].addBox(0F, 0F, 0F, 4, 19, 0, 0F); // Box 150
		model100tonhopperModel[23].setRotationPoint(45F, -16F, -9.05F);

		model100tonhopperModel[24].addBox(0F, 0F, 0F, 4, 19, 0, 0F); // Box 151
		model100tonhopperModel[24].setRotationPoint(-49F, -16F, -9.05F);

		model100tonhopperModel[25].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 152
		model100tonhopperModel[25].setRotationPoint(45F, -13F, 9.05F);

		model100tonhopperModel[26].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		model100tonhopperModel[26].setRotationPoint(48F, -23F, 8F);

		model100tonhopperModel[27].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		model100tonhopperModel[27].setRotationPoint(45F, -20F, 8F);

		model100tonhopperModel[28].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		model100tonhopperModel[28].setRotationPoint(42F, -17F, 8F);

		model100tonhopperModel[29].addShapeBox(0F, 0F, 0F, 9, 11, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 52
		model100tonhopperModel[29].setRotationPoint(40F, -25F, -9F);

		model100tonhopperModel[30].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		model100tonhopperModel[30].setRotationPoint(48F, -23F, -6F);

		model100tonhopperModel[31].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		model100tonhopperModel[31].setRotationPoint(42F, -17F, -9F);

		model100tonhopperModel[32].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		model100tonhopperModel[32].setRotationPoint(45F, -20F, -9F);

		model100tonhopperModel[33].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		model100tonhopperModel[33].setRotationPoint(48F, -23F, -9F);

		model100tonhopperModel[34].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		model100tonhopperModel[34].setRotationPoint(48F, -23F, 5F);

		model100tonhopperModel[35].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		model100tonhopperModel[35].setRotationPoint(48F, -23F, -3F);

		model100tonhopperModel[36].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		model100tonhopperModel[36].setRotationPoint(-49F, -23F, 0F);

		model100tonhopperModel[37].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		model100tonhopperModel[37].setRotationPoint(-49F, -23F, -6F);

		model100tonhopperModel[38].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		model100tonhopperModel[38].setRotationPoint(48F, -13F, 9F);
		model100tonhopperModel[38].rotateAngleX = -1.57079633F;

		model100tonhopperModel[39].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		model100tonhopperModel[39].setRotationPoint(-49F, -12F, -9F);
		model100tonhopperModel[39].rotateAngleX = 1.57079633F;

		model100tonhopperModel[40].addShapeBox(0F, -2F, 0F, 2, 3, 5, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 45
		model100tonhopperModel[40].setRotationPoint(40F, -2F, 3F);

		model100tonhopperModel[41].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 46
		model100tonhopperModel[41].setRotationPoint(42F, -4F, 3F);

		model100tonhopperModel[42].addShapeBox(0F, -2F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 51
		model100tonhopperModel[42].setRotationPoint(43F, -2F, 3F);

		model100tonhopperModel[43].addBox(0F, 0F, 0F, 0, 25, 4, 0F); // Box 45
		model100tonhopperModel[43].setRotationPoint(49F, -25F, -9.05F);

		model100tonhopperModel[44].addBox(0F, 0F, 0F, 0, 25, 4, 0F); // Box 46
		model100tonhopperModel[44].setRotationPoint(-49F, -25F, 5.05F);

		model100tonhopperModel[45].addBox(0F, 0F, 0F, 0, 13, 4, 0F); // Box 47
		model100tonhopperModel[45].setRotationPoint(49F, -13F, 4.95F);

		model100tonhopperModel[46].addBox(0F, 0F, 0F, 0, 13, 4, 0F); // Box 48
		model100tonhopperModel[46].setRotationPoint(-49F, -13F, -8.95F);

		model100tonhopperModel[47].addBox(0F, 0F, 0F, 78, 23, 16, 0F); // Box 47
		model100tonhopperModel[47].setRotationPoint(-39F, -25F, -8F);

		fixRotation(model100tonhopperModel, false, true, true);

	}
	private ModelFreightTruckM fronttrucks = new ModelFreightTruckM();
	private ModelFreightTruckM backtrucks = new ModelFreightTruckM();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 48; i++)
		{
			model100tonhopperModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-2.9,-0.16,-0.19);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.4,-0.16,-0.19);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo model100tonhopperModel[];
}