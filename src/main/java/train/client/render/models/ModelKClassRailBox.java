//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.12.2018 - 11:22:23
// Last changed on: 14.12.2018 - 11:22:23

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelKClassRailBox extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelKClassRailBox()
	{
		kclassrailboxModel = new ModelRendererTurbo[53];
		kclassrailboxModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		kclassrailboxModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		kclassrailboxModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		kclassrailboxModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		kclassrailboxModel[4] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 4
		kclassrailboxModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		kclassrailboxModel[6] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 6
		kclassrailboxModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		kclassrailboxModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		kclassrailboxModel[9] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		kclassrailboxModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		kclassrailboxModel[11] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 12
		kclassrailboxModel[12] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 13
		kclassrailboxModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		kclassrailboxModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		kclassrailboxModel[15] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 16
		kclassrailboxModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		kclassrailboxModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 18
		kclassrailboxModel[18] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 19
		kclassrailboxModel[19] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 20
		kclassrailboxModel[20] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 21
		kclassrailboxModel[21] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 22
		kclassrailboxModel[22] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 23
		kclassrailboxModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 24
		kclassrailboxModel[24] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 25
		kclassrailboxModel[25] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 37
		kclassrailboxModel[26] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 38
		kclassrailboxModel[27] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 39
		kclassrailboxModel[28] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 40
		kclassrailboxModel[29] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 41
		kclassrailboxModel[30] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 42
		kclassrailboxModel[31] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 43
		kclassrailboxModel[32] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 44
		kclassrailboxModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 45
		kclassrailboxModel[34] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 47
		kclassrailboxModel[35] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
		kclassrailboxModel[36] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 49
		kclassrailboxModel[37] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 50
		kclassrailboxModel[38] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 51
		kclassrailboxModel[39] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 52
		kclassrailboxModel[40] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 93
		kclassrailboxModel[41] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 94
		kclassrailboxModel[42] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 7
		kclassrailboxModel[43] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 8
		kclassrailboxModel[44] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 9
		kclassrailboxModel[45] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 10
		kclassrailboxModel[46] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 11
		kclassrailboxModel[47] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 100
		kclassrailboxModel[48] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 101
		kclassrailboxModel[49] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 122
		kclassrailboxModel[50] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 123
		kclassrailboxModel[51] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 124
		kclassrailboxModel[52] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 125

		kclassrailboxModel[0].addBox(0F, 0F, 0F, 50, 22, 14, 0F); // Box 0
		kclassrailboxModel[0].setRotationPoint(-1F, -20F, -5F);

		kclassrailboxModel[1].addShapeBox(0F, 0F, 0F, 50, 7, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		kclassrailboxModel[1].setRotationPoint(-1F, -20F, -9F);

		kclassrailboxModel[2].addShapeBox(0F, 0F, 0F, 50, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		kclassrailboxModel[2].setRotationPoint(-1F, -20F, 9F);

		kclassrailboxModel[3].addShapeBox(0F, 0F, 0F, 50, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 3
		kclassrailboxModel[3].setRotationPoint(-1F, -13F, 9F);

		kclassrailboxModel[4].addShapeBox(0F, 0F, 0F, 50, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		kclassrailboxModel[4].setRotationPoint(-1F, -13F, -9F);

		kclassrailboxModel[5].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 5
		kclassrailboxModel[5].setRotationPoint(-2F, 1F, -5F);

		kclassrailboxModel[6].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 6
		kclassrailboxModel[6].setRotationPoint(-2F, -20F, -5F);

		kclassrailboxModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		kclassrailboxModel[7].setRotationPoint(-2F, -20F, 9F);

		kclassrailboxModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 9
		kclassrailboxModel[8].setRotationPoint(-2F, -20F, -9F);

		kclassrailboxModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 10
		kclassrailboxModel[9].setRotationPoint(-2F, -19F, -5F);

		kclassrailboxModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		kclassrailboxModel[10].setRotationPoint(-2F, -19F, 8F);

		kclassrailboxModel[11].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 12
		kclassrailboxModel[11].setRotationPoint(-2F, -13F, 9F);

		kclassrailboxModel[12].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 13
		kclassrailboxModel[12].setRotationPoint(-2F, -13F, -9F);

		kclassrailboxModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		kclassrailboxModel[13].setRotationPoint(-2F, -1F, -5F);

		kclassrailboxModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		kclassrailboxModel[14].setRotationPoint(-2F, -1F, 7F);

		kclassrailboxModel[15].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 16
		kclassrailboxModel[15].setRotationPoint(49F, 1F, -5F);

		kclassrailboxModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		kclassrailboxModel[16].setRotationPoint(49F, -1F, 7F);

		kclassrailboxModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		kclassrailboxModel[17].setRotationPoint(49F, -1F, -5F);

		kclassrailboxModel[18].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 19
		kclassrailboxModel[18].setRotationPoint(49F, -13F, -9F);

		kclassrailboxModel[19].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 20
		kclassrailboxModel[19].setRotationPoint(49F, -13F, 9F);

		kclassrailboxModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		kclassrailboxModel[20].setRotationPoint(49F, -20F, 9F);

		kclassrailboxModel[21].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 22
		kclassrailboxModel[21].setRotationPoint(49F, -20F, -5F);

		kclassrailboxModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		kclassrailboxModel[22].setRotationPoint(49F, -19F, 8F);

		kclassrailboxModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 24
		kclassrailboxModel[23].setRotationPoint(49F, -19F, -5F);

		kclassrailboxModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 25
		kclassrailboxModel[24].setRotationPoint(49F, -20F, -9F);

		kclassrailboxModel[25].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		kclassrailboxModel[25].setRotationPoint(0F, -6F, -8F);

		kclassrailboxModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		kclassrailboxModel[26].setRotationPoint(43F, -6F, -8F);

		kclassrailboxModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		kclassrailboxModel[27].setRotationPoint(34F, -6F, -8F);

		kclassrailboxModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		kclassrailboxModel[28].setRotationPoint(9F, -6F, -8F);

		kclassrailboxModel[29].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		kclassrailboxModel[29].setRotationPoint(9F, -6F, 9F);

		kclassrailboxModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		kclassrailboxModel[30].setRotationPoint(0F, -6F, 9F);

		kclassrailboxModel[31].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 43
		kclassrailboxModel[31].setRotationPoint(34F, -6F, 9F);

		kclassrailboxModel[32].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 44
		kclassrailboxModel[32].setRotationPoint(43F, -6F, 9F);

		kclassrailboxModel[33].addBox(0F, 0F, 0F, 5, 19, 0, 0F); // Box 45
		kclassrailboxModel[33].setRotationPoint(21.5F, -13F, -9F);

		kclassrailboxModel[34].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 47
		kclassrailboxModel[34].setRotationPoint(21.5F, 1F, -9F);

		kclassrailboxModel[35].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 48
		kclassrailboxModel[35].setRotationPoint(26.5F, 1F, -9F);

		kclassrailboxModel[36].addBox(0F, 0F, 0F, 5, 19, 0, 0F); // Box 49
		kclassrailboxModel[36].setRotationPoint(21.5F, -13F, 13F);

		kclassrailboxModel[37].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 50
		kclassrailboxModel[37].setRotationPoint(26.5F, 1F, 9F);

		kclassrailboxModel[38].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 51
		kclassrailboxModel[38].setRotationPoint(21.5F, 1F, 9F);

		kclassrailboxModel[39].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		kclassrailboxModel[39].setRotationPoint(0F, 2F, -1F);

		kclassrailboxModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		kclassrailboxModel[40].setRotationPoint(-5F, 2F, 0.5F);

		kclassrailboxModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		kclassrailboxModel[41].setRotationPoint(48F, 2F, 0.5F);

		kclassrailboxModel[42].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 7
		kclassrailboxModel[42].setRotationPoint(-2F, -19F, -3F);

		kclassrailboxModel[43].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 8
		kclassrailboxModel[43].setRotationPoint(-2F, -19F, 6F);

		kclassrailboxModel[44].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 9
		kclassrailboxModel[44].setRotationPoint(49F, -19F, 6F);

		kclassrailboxModel[45].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 10
		kclassrailboxModel[45].setRotationPoint(49F, -19F, -3F);

		kclassrailboxModel[46].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 11
		kclassrailboxModel[46].setRotationPoint(-2.1F, -17F, -5F);

		kclassrailboxModel[47].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 100
		kclassrailboxModel[47].setRotationPoint(3F, -21F, 0F);

		kclassrailboxModel[48].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 101
		kclassrailboxModel[48].setRotationPoint(41F, -21F, 0F);

		kclassrailboxModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		kclassrailboxModel[49].setRotationPoint(5F, 3F, 1F);

		kclassrailboxModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		kclassrailboxModel[50].setRotationPoint(8F, 3F, 1F);

		kclassrailboxModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 124
		kclassrailboxModel[51].setRotationPoint(42F, 3F, 1F);

		kclassrailboxModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 125
		kclassrailboxModel[52].setRotationPoint(39F, 3F, 1F);


	}

	ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 53; i++)
		{
			kclassrailboxModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(0.375,0.45,-0.225);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.125,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo kclassrailboxModel[];
}