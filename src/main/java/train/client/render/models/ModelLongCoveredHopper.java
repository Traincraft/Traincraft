//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.12.2018 - 12:53:02
// Last changed on: 14.12.2018 - 12:53:02

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelLongCoveredHopper extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelLongCoveredHopper()
	{
		longcoveredhopperModel = new ModelRendererTurbo[56];
		longcoveredhopperModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		longcoveredhopperModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		longcoveredhopperModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		longcoveredhopperModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		longcoveredhopperModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		longcoveredhopperModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		longcoveredhopperModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		longcoveredhopperModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		longcoveredhopperModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 30
		longcoveredhopperModel[9] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 33
		longcoveredhopperModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34
		longcoveredhopperModel[11] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 35
		longcoveredhopperModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		longcoveredhopperModel[13] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 37
		longcoveredhopperModel[14] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 38
		longcoveredhopperModel[15] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 39
		longcoveredhopperModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		longcoveredhopperModel[17] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 41
		longcoveredhopperModel[18] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 42
		longcoveredhopperModel[19] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 43
		longcoveredhopperModel[20] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 45
		longcoveredhopperModel[21] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 46
		longcoveredhopperModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		longcoveredhopperModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 48
		longcoveredhopperModel[24] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 49
		longcoveredhopperModel[25] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 50
		longcoveredhopperModel[26] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 51
		longcoveredhopperModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		longcoveredhopperModel[28] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 53
		longcoveredhopperModel[29] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 54
		longcoveredhopperModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 55
		longcoveredhopperModel[31] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 56
		longcoveredhopperModel[32] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 57
		longcoveredhopperModel[33] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 78
		longcoveredhopperModel[34] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 79
		longcoveredhopperModel[35] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 80
		longcoveredhopperModel[36] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 81
		longcoveredhopperModel[37] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 82
		longcoveredhopperModel[38] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 83
		longcoveredhopperModel[39] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 84
		longcoveredhopperModel[40] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 85
		longcoveredhopperModel[41] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 86
		longcoveredhopperModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		longcoveredhopperModel[43] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 88
		longcoveredhopperModel[44] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 89
		longcoveredhopperModel[45] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 90
		longcoveredhopperModel[46] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 91
		longcoveredhopperModel[47] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 48
		longcoveredhopperModel[48] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 49
		longcoveredhopperModel[49] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 50
		longcoveredhopperModel[50] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 51
		longcoveredhopperModel[51] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 52
		longcoveredhopperModel[52] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 53
		longcoveredhopperModel[53] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 54
		longcoveredhopperModel[54] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 55
		longcoveredhopperModel[55] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 56

		longcoveredhopperModel[0].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 0
		longcoveredhopperModel[0].setRotationPoint(-29F, -3F, 1F);

		longcoveredhopperModel[1].addBox(0F, 0F, 0F, 87, 1, 3, 0F); // Box 1
		longcoveredhopperModel[1].setRotationPoint(-26F, -5F, 0F);

		longcoveredhopperModel[2].addBox(0F, 0F, 0F, 87, 1, 3, 0F); // Box 3
		longcoveredhopperModel[2].setRotationPoint(-26F, -5F, 19F);

		longcoveredhopperModel[3].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 4
		longcoveredhopperModel[3].setRotationPoint(62F, -3F, 1F);

		longcoveredhopperModel[4].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 5
		longcoveredhopperModel[4].setRotationPoint(-22F, -4F, 0F);

		longcoveredhopperModel[5].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 6
		longcoveredhopperModel[5].setRotationPoint(55F, -4F, 0F);

		longcoveredhopperModel[6].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 27
		longcoveredhopperModel[6].setRotationPoint(-29F, -4F, 6F);

		longcoveredhopperModel[7].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 28
		longcoveredhopperModel[7].setRotationPoint(57F, -4F, 6F);

		longcoveredhopperModel[8].addShapeBox(0F, 0F, 0F, 79, 7, 20, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		longcoveredhopperModel[8].setRotationPoint(-22F, -12F, 1F);

		longcoveredhopperModel[9].addBox(0F, 0F, 0F, 79, 7, 22, 0F); // Box 33
		longcoveredhopperModel[9].setRotationPoint(-22F, -19F, 0F);

		longcoveredhopperModel[10].addShapeBox(0F, 0F, 0F, 79, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		longcoveredhopperModel[10].setRotationPoint(-22F, -26F, 1F);

		longcoveredhopperModel[11].addShapeBox(0F, 0F, 0F, 93, 1, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		longcoveredhopperModel[11].setRotationPoint(-29F, -27F, 1F);

		longcoveredhopperModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 36
		longcoveredhopperModel[12].setRotationPoint(-29F, -22F, 1F);

		longcoveredhopperModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 37
		longcoveredhopperModel[13].setRotationPoint(57F, -22F, 1F);

		longcoveredhopperModel[14].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 38
		longcoveredhopperModel[14].setRotationPoint(-29F, -26F, 1F);

		longcoveredhopperModel[15].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 39
		longcoveredhopperModel[15].setRotationPoint(57F, -26F, 1F);

		longcoveredhopperModel[16].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 40
		longcoveredhopperModel[16].setRotationPoint(-29F, -23F, 0F);

		longcoveredhopperModel[17].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 41
		longcoveredhopperModel[17].setRotationPoint(-29F, -23F, 21F);

		longcoveredhopperModel[18].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 42
		longcoveredhopperModel[18].setRotationPoint(61F, -23F, 21F);

		longcoveredhopperModel[19].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 43
		longcoveredhopperModel[19].setRotationPoint(61F, -23F, 0F);

		longcoveredhopperModel[20].addShapeBox(0F, 0F, 0F, 93, 1, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		longcoveredhopperModel[20].setRotationPoint(-29F, -28F, 3F);

		longcoveredhopperModel[21].addBox(0F, 0F, 0F, 93, 0, 4, 0F); // Box 46
		longcoveredhopperModel[21].setRotationPoint(-29F, -28.1F, 15F);

		longcoveredhopperModel[22].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 47
		longcoveredhopperModel[22].setRotationPoint(-31F, -28.1F, 9F);

		longcoveredhopperModel[23].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 48
		longcoveredhopperModel[23].setRotationPoint(64F, -28.1F, 9F);

		longcoveredhopperModel[24].addBox(0F, 0F, 0F, 93, 0, 4, 0F); // Box 49
		longcoveredhopperModel[24].setRotationPoint(-29F, -28.1F, 3F);

		longcoveredhopperModel[25].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 50
		longcoveredhopperModel[25].setRotationPoint(-29F, -28.1F, 7F);

		longcoveredhopperModel[26].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 51
		longcoveredhopperModel[26].setRotationPoint(60F, -28.1F, 7F);

		longcoveredhopperModel[27].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 52
		longcoveredhopperModel[27].setRotationPoint(54F, -29F, 9F);

		longcoveredhopperModel[28].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 53
		longcoveredhopperModel[28].setRotationPoint(-13.5F, -29F, 9F);

		longcoveredhopperModel[29].addBox(0F, 0F, 0F, 1, 26, 3, 0F); // Box 54
		longcoveredhopperModel[29].setRotationPoint(-30F, -28F, 16F);

		longcoveredhopperModel[30].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 55
		longcoveredhopperModel[30].setRotationPoint(-32F, -4F, 10F);

		longcoveredhopperModel[31].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 56
		longcoveredhopperModel[31].setRotationPoint(64F, -4F, 10F);

		longcoveredhopperModel[32].addBox(0F, 0F, 0F, 1, 26, 3, 0F); // Box 57
		longcoveredhopperModel[32].setRotationPoint(64F, -28F, 3F);

		longcoveredhopperModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 78
		longcoveredhopperModel[33].setRotationPoint(42F, -5F, 3F);

		longcoveredhopperModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		longcoveredhopperModel[34].setRotationPoint(24F, -5F, 3F);

		longcoveredhopperModel[35].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		longcoveredhopperModel[35].setRotationPoint(-26F, -26F, 0F);

		longcoveredhopperModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 81
		longcoveredhopperModel[36].setRotationPoint(-26F, -17F, 0F);

		longcoveredhopperModel[37].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 82
		longcoveredhopperModel[37].setRotationPoint(-26F, -19F, 0F);

		longcoveredhopperModel[38].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 83
		longcoveredhopperModel[38].setRotationPoint(57F, -19F, 0F);

		longcoveredhopperModel[39].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		longcoveredhopperModel[39].setRotationPoint(57F, -17F, 0F);

		longcoveredhopperModel[40].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		longcoveredhopperModel[40].setRotationPoint(57F, -26F, 0F);

		longcoveredhopperModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 86
		longcoveredhopperModel[41].setRotationPoint(57F, -17F, 21F);

		longcoveredhopperModel[42].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 87
		longcoveredhopperModel[42].setRotationPoint(57F, -19F, 21F);

		longcoveredhopperModel[43].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		longcoveredhopperModel[43].setRotationPoint(57F, -26F, 21F);

		longcoveredhopperModel[44].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		longcoveredhopperModel[44].setRotationPoint(-26F, -26F, 21F);

		longcoveredhopperModel[45].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 90
		longcoveredhopperModel[45].setRotationPoint(-26F, -19F, 21F);

		longcoveredhopperModel[46].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
		longcoveredhopperModel[46].setRotationPoint(-26F, -17F, 21F);

		longcoveredhopperModel[47].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 48
		longcoveredhopperModel[47].setRotationPoint(-12F, -5F, 3F);

		longcoveredhopperModel[48].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		longcoveredhopperModel[48].setRotationPoint(6F, -5F, 3F);

		longcoveredhopperModel[49].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 50
		longcoveredhopperModel[49].setRotationPoint(-23F, -29F, 9F);

		longcoveredhopperModel[50].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 51
		longcoveredhopperModel[50].setRotationPoint(44.5F, -29F, 9F);

		longcoveredhopperModel[51].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 52
		longcoveredhopperModel[51].setRotationPoint(35F, -29F, 9F);

		longcoveredhopperModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 53
		longcoveredhopperModel[52].setRotationPoint(25F, -29F, 9F);

		longcoveredhopperModel[53].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 54
		longcoveredhopperModel[53].setRotationPoint(6F, -29F, 9F);

		longcoveredhopperModel[54].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 55
		longcoveredhopperModel[54].setRotationPoint(-4F, -29F, 9F);

		longcoveredhopperModel[55].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 56
		longcoveredhopperModel[55].setRotationPoint(15.5F, -29F, 9F);


	}

	ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 56; i++)
		{
			longcoveredhopperModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.35,0.125,0.35);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.8,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo longcoveredhopperModel[];
}