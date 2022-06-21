//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.07.2021 - 13:08:08
// Last changed on: 13.07.2021 - 13:08:08

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelLightCrane extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLightCrane() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[72];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 246, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 489, 46, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 235, 122, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 231, 53, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 284, 106, textureX, textureY); // Box 51
		bodyModel[33] = new ModelRendererTurbo(this, 284, 86, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 284, 141, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 284, 67, textureX, textureY); // Box 54
		bodyModel[36] = new ModelRendererTurbo(this, 269, 145, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 285, 127, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 269, 126, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 269, 106, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 269, 86, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 268, 67, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 299, 52, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 300, 65, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 300, 79, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 299, 92, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 296, 106, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 221, 137, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[62] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 72
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[68] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80

		bodyModel[0].addBox(0F, 0F, 0F, 65, 4, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-32F, 0F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 2, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-9F, -2F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 2
		bodyModel[2].setRotationPoint(-18F, -3F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 52, 16, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-17F, -19F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 52, 16, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-17F, -19F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 5
		bodyModel[5].setRotationPoint(35F, -19F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 6
		bodyModel[6].setRotationPoint(-18F, -19F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 60, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-60F, -44F, -4F);
		bodyModel[7].rotateAngleZ = 0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 54, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-18F, -22F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 11
		bodyModel[9].setRotationPoint(-34F, 3F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 12
		bodyModel[10].setRotationPoint(-32F, 4F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 13
		bodyModel[11].setRotationPoint(32F, 4F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 14
		bodyModel[12].setRotationPoint(32F, 3F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 61, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[13].setRotationPoint(-41F, -39F, -3F);
		bodyModel[13].rotateAngleZ = 1.27409035F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-48F, -41F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-59F, -43F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-55F, -42.25F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-60.5F, -27F, -1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-60.5F, -23F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-57.5F, -16F, -0.5F);
		bodyModel[19].rotateAngleZ = 0.50614548F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-56.5F, -14.25F, -0.5F);
		bodyModel[20].rotateAngleZ = -1.08210414F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-60.6F, -15.5F, -0.5F);
		bodyModel[21].rotateAngleZ = 0.48869219F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(-51.5F, -19F, -3.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(-51.5F, -16F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-51.5F, -14F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-48.5F, -7F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(-48.5F, -4.05F, -0.5F);
		bodyModel[26].rotateAngleZ = -1.25663706F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-47.8F, -3.1F, -0.5F);
		bodyModel[27].rotateAngleZ = 1.25663706F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-50.45F, -3.4F, -0.5F);
		bodyModel[28].rotateAngleZ = -2.82743339F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-44.65F, -3.1F, -0.5F);
		bodyModel[29].rotateAngleZ = -3.45575192F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[30].setRotationPoint(-42F, -30F, 3F);
		bodyModel[30].rotateAngleZ = 0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 60, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[31].setRotationPoint(-60F, -44F, 3F);
		bodyModel[31].rotateAngleZ = 0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[32].setRotationPoint(-60F, -44F, -4F);
		bodyModel[32].rotateAngleX = 0.49741884F;
		bodyModel[32].rotateAngleZ = 0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[33].setRotationPoint(-59.75F, -44F, 3F);
		bodyModel[33].rotateAngleX = -0.46251225F;
		bodyModel[33].rotateAngleZ = 0.78539816F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[34].setRotationPoint(-60F, -44F, 3F);
		bodyModel[34].rotateAngleX = -1.57079633F;
		bodyModel[34].rotateAngleZ = 0.78539816F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[35].setRotationPoint(-50.75F, -35F, 3F);
		bodyModel[35].rotateAngleX = -0.47996554F;
		bodyModel[35].rotateAngleZ = 0.78539816F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-50F, -34.5F, -4F);
		bodyModel[36].rotateAngleX = 0.47996554F;
		bodyModel[36].rotateAngleZ = 0.78539816F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-46F, -38.25F, 3F);
		bodyModel[37].rotateAngleX = -1.57079633F;
		bodyModel[37].rotateAngleZ = 1.04719755F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[38].setRotationPoint(-41F, -25.25F, -4F);
		bodyModel[38].rotateAngleX = 0.47996554F;
		bodyModel[38].rotateAngleZ = 0.78539816F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(-40.75F, -25F, 3F);
		bodyModel[39].rotateAngleX = -0.47996554F;
		bodyModel[39].rotateAngleZ = 0.78539816F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(-31.75F, -16F, 3F);
		bodyModel[40].rotateAngleX = -0.47996554F;
		bodyModel[40].rotateAngleZ = 0.78539816F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[41].setRotationPoint(-32F, -16.25F, -4F);
		bodyModel[41].rotateAngleX = 0.47996554F;
		bodyModel[41].rotateAngleZ = 0.78539816F;

		bodyModel[42].addBox(0F, 0F, 0F, 5, 5, 11, 0F); // Box 51
		bodyModel[42].setRotationPoint(-17F, -8F, -5.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 52
		bodyModel[43].setRotationPoint(-15F, -11F, -4.5F);
		bodyModel[43].rotateAngleZ = -0.20943951F;

		bodyModel[44].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 53
		bodyModel[44].setRotationPoint(-15F, -11F, -1F);
		bodyModel[44].rotateAngleZ = -0.08726646F;

		bodyModel[45].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 54
		bodyModel[45].setRotationPoint(-16F, -11F, 2.5F);
		bodyModel[45].rotateAngleZ = 0.20943951F;

		bodyModel[46].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 55
		bodyModel[46].setRotationPoint(-16F, -11F, 2.5F);
		bodyModel[46].rotateAngleZ = 0.20943951F;

		bodyModel[47].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 56
		bodyModel[47].setRotationPoint(-16F, -11F, 2.5F);
		bodyModel[47].rotateAngleZ = 0.20943951F;

		bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 57
		bodyModel[48].setRotationPoint(-16F, -11F, 2.5F);
		bodyModel[48].rotateAngleZ = 0.20943951F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[49].setRotationPoint(-48F, -28F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[50].setRotationPoint(-40.5F, -38.85F, -3F);
		bodyModel[50].rotateAngleZ = -1.85004901F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[51].setRotationPoint(-48.25F, -41F, -0.5F);
		bodyModel[51].rotateAngleZ = -1.74532925F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[52].setRotationPoint(-42F, -30F, -4F);
		bodyModel[52].rotateAngleZ = 0.78539816F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[53].setRotationPoint(-42F, -30F, -4F);
		bodyModel[53].rotateAngleZ = 0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-48.4F, -36.45F, -3F);
		bodyModel[54].rotateAngleX = -1.57079633F;
		bodyModel[54].rotateAngleZ = 0.78539816F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(-48.4F, -36.45F, 4F);
		bodyModel[55].rotateAngleX = -1.57079633F;
		bodyModel[55].rotateAngleZ = 0.78539816F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(-48.4F, -36.45F, 4F);
		bodyModel[56].rotateAngleX = -1.57079633F;
		bodyModel[56].rotateAngleZ = 0.78539816F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[57].setRotationPoint(-48.4F, -36.45F, 4F);
		bodyModel[57].rotateAngleX = -1.57079633F;
		bodyModel[57].rotateAngleZ = 0.78539816F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[58].setRotationPoint(-58.15F, -46.2F, 4F);
		bodyModel[58].rotateAngleX = -1.57079633F;
		bodyModel[58].rotateAngleZ = 0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(-58.15F, -46.2F, -3F);
		bodyModel[59].rotateAngleX = -1.57079633F;
		bodyModel[59].rotateAngleZ = 0.78539816F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[60].setRotationPoint(-17F, -6F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[61].setRotationPoint(-17F, -17F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[62].setRotationPoint(-17F, -6F, -9.5F);
		bodyModel[62].rotateAngleX = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[63].setRotationPoint(-8F, -6F, -9.5F);
		bodyModel[63].rotateAngleX = 1.57079633F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[64].setRotationPoint(-8F, -17F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[65].setRotationPoint(-8F, -6F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		bodyModel[66].setRotationPoint(-8F, -6F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		bodyModel[67].setRotationPoint(-17F, -6F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[68].setRotationPoint(-8F, -6F, 8.5F);
		bodyModel[68].rotateAngleX = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[69].setRotationPoint(-17F, -6F, 8.5F);
		bodyModel[69].rotateAngleX = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[70].setRotationPoint(-17F, -17F, 7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[71].setRotationPoint(-8F, -17F, 7.5F);
	}
	//Model70Truck bogie = new Model70Truck();
	Modelbuckeye3axletruck bogie = new Modelbuckeye3axletruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 72; i++)
		{
			bodyModel[i].render(f5);
		}

		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.6,0.575,-0.4);//front
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.4,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.4,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		//GL11.glTranslated(1.1,0,0.0);
		//bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/buckeye_3Axle_Black_friccbearing.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.0, -0.0, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(2.0, 0, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}