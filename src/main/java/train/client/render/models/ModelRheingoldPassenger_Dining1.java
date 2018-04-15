//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 18:04:12
// Last changed on: 29.03.2018 - 18:04:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRheingoldPassenger_Dining1 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelRheingoldPassenger_Dining1()
	{
		rheingoldpassenger_dining1Model = new ModelRendererTurbo[97];
		rheingoldpassenger_dining1Model[0] = new ModelRendererTurbo(this, 351, 144, textureX, textureY); // Box 1
		rheingoldpassenger_dining1Model[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		rheingoldpassenger_dining1Model[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 70
		rheingoldpassenger_dining1Model[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 193
		rheingoldpassenger_dining1Model[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 194
		rheingoldpassenger_dining1Model[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 195
		rheingoldpassenger_dining1Model[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 197
		rheingoldpassenger_dining1Model[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 198
		rheingoldpassenger_dining1Model[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 199
		rheingoldpassenger_dining1Model[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 200
		rheingoldpassenger_dining1Model[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 201
		rheingoldpassenger_dining1Model[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 99
		rheingoldpassenger_dining1Model[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 99
		rheingoldpassenger_dining1Model[13] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 1
		rheingoldpassenger_dining1Model[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 110
		rheingoldpassenger_dining1Model[15] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 50
		rheingoldpassenger_dining1Model[16] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 51
		rheingoldpassenger_dining1Model[17] = new ModelRendererTurbo(this, 361, 29, textureX, textureY); // Box 52
		rheingoldpassenger_dining1Model[18] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 53
		rheingoldpassenger_dining1Model[19] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 54
		rheingoldpassenger_dining1Model[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 55
		rheingoldpassenger_dining1Model[21] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 56
		rheingoldpassenger_dining1Model[22] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 36
		rheingoldpassenger_dining1Model[23] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 36
		rheingoldpassenger_dining1Model[24] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 41
		rheingoldpassenger_dining1Model[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 42
		rheingoldpassenger_dining1Model[26] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 43
		rheingoldpassenger_dining1Model[27] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 44
		rheingoldpassenger_dining1Model[28] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 45
		rheingoldpassenger_dining1Model[29] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 46
		rheingoldpassenger_dining1Model[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 47
		rheingoldpassenger_dining1Model[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 48
		rheingoldpassenger_dining1Model[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 49
		rheingoldpassenger_dining1Model[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 50
		rheingoldpassenger_dining1Model[34] = new ModelRendererTurbo(this, 29, 10, textureX, textureY); // Box 51
		rheingoldpassenger_dining1Model[35] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 150
		rheingoldpassenger_dining1Model[36] = new ModelRendererTurbo(this, 40, 97, textureX, textureY); // Box 151
		rheingoldpassenger_dining1Model[37] = new ModelRendererTurbo(this, 6, 131, textureX, textureY); // Box 153
		rheingoldpassenger_dining1Model[38] = new ModelRendererTurbo(this, 56, 145, textureX, textureY); // Box 154
		rheingoldpassenger_dining1Model[39] = new ModelRendererTurbo(this, 56, 186, textureX, textureY); // Box 155
		rheingoldpassenger_dining1Model[40] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[41] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[42] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[43] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[44] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[45] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[46] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[47] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[48] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[49] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[50] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[51] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[52] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 169
		rheingoldpassenger_dining1Model[53] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 170
		rheingoldpassenger_dining1Model[54] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[55] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[56] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[57] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[58] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[59] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[60] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[61] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[62] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[63] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[64] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[65] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[66] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[67] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[68] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[69] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[70] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[71] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[72] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[73] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[74] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[75] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[76] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[77] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[78] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining1Model[79] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining1Model[80] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining1Model[81] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining1Model[82] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining1Model[83] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining1Model[84] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 84
		rheingoldpassenger_dining1Model[85] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 85
		rheingoldpassenger_dining1Model[86] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 86
		rheingoldpassenger_dining1Model[87] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 87
		rheingoldpassenger_dining1Model[88] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 88
		rheingoldpassenger_dining1Model[89] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 89
		rheingoldpassenger_dining1Model[90] = new ModelRendererTurbo(this, 63, 226, textureX, textureY); // Box 92
		rheingoldpassenger_dining1Model[91] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 93
		rheingoldpassenger_dining1Model[92] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 94
		rheingoldpassenger_dining1Model[93] = new ModelRendererTurbo(this, 21, 278, textureX, textureY); // Box 96
		rheingoldpassenger_dining1Model[94] = new ModelRendererTurbo(this, 211, 281, textureX, textureY); // Box 97
		rheingoldpassenger_dining1Model[95] = new ModelRendererTurbo(this, 86, 269, textureX, textureY); // Box 98
		rheingoldpassenger_dining1Model[96] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 99

		rheingoldpassenger_dining1Model[0].addShapeBox(0F, 0F, 0F, 14, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rheingoldpassenger_dining1Model[0].setRotationPoint(-60F, -26F, -8F);

		rheingoldpassenger_dining1Model[1].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		rheingoldpassenger_dining1Model[1].setRotationPoint(-60F, -22F, -10F);

		rheingoldpassenger_dining1Model[2].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		rheingoldpassenger_dining1Model[2].setRotationPoint(58F, -22F, -10F);

		rheingoldpassenger_dining1Model[3].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		rheingoldpassenger_dining1Model[3].setRotationPoint(-62F, -20F, -6F);

		rheingoldpassenger_dining1Model[4].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		rheingoldpassenger_dining1Model[4].setRotationPoint(-62F, -20F, 5F);

		rheingoldpassenger_dining1Model[5].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rheingoldpassenger_dining1Model[5].setRotationPoint(-62F, -2F, -5F);

		rheingoldpassenger_dining1Model[6].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		rheingoldpassenger_dining1Model[6].setRotationPoint(-62F, -21F, -5F);

		rheingoldpassenger_dining1Model[7].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		rheingoldpassenger_dining1Model[7].setRotationPoint(59F, -21F, -5F);

		rheingoldpassenger_dining1Model[8].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		rheingoldpassenger_dining1Model[8].setRotationPoint(59F, -20F, 5F);

		rheingoldpassenger_dining1Model[9].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rheingoldpassenger_dining1Model[9].setRotationPoint(59F, -2F, -5F);

		rheingoldpassenger_dining1Model[10].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		rheingoldpassenger_dining1Model[10].setRotationPoint(59F, -20F, -6F);

		rheingoldpassenger_dining1Model[11].addShapeBox(0F, 0F, 0F, 14, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining1Model[11].setRotationPoint(-60F, -24F, -11F);

		rheingoldpassenger_dining1Model[12].addShapeBox(0F, 0F, 0F, 64, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining1Model[12].setRotationPoint(-5F, -24F, -11F);

		rheingoldpassenger_dining1Model[13].addShapeBox(0F, 0F, 0F, 64, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rheingoldpassenger_dining1Model[13].setRotationPoint(-5F, -26F, -8F);

		rheingoldpassenger_dining1Model[14].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 110
		rheingoldpassenger_dining1Model[14].setRotationPoint(-60F, 0F, -11F);

		rheingoldpassenger_dining1Model[15].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rheingoldpassenger_dining1Model[15].setRotationPoint(-43F, -25F, -11F);

		rheingoldpassenger_dining1Model[16].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		rheingoldpassenger_dining1Model[16].setRotationPoint(-43F, -28F, -8F);

		rheingoldpassenger_dining1Model[17].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		rheingoldpassenger_dining1Model[17].setRotationPoint(-43F, -29F, -4F);

		rheingoldpassenger_dining1Model[18].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rheingoldpassenger_dining1Model[18].setRotationPoint(-43F, -29F, 3F);

		rheingoldpassenger_dining1Model[19].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rheingoldpassenger_dining1Model[19].setRotationPoint(-43F, -28F, 7F);

		rheingoldpassenger_dining1Model[20].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rheingoldpassenger_dining1Model[20].setRotationPoint(-43F, -25F, 10F);

		rheingoldpassenger_dining1Model[21].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 56
		rheingoldpassenger_dining1Model[21].setRotationPoint(-46F, -29F, 0F);

		rheingoldpassenger_dining1Model[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassenger_dining1Model[22].setRotationPoint(-63F, -1F, 0F);

		rheingoldpassenger_dining1Model[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassenger_dining1Model[23].setRotationPoint(59F, -1F, 0F);

		rheingoldpassenger_dining1Model[24].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F); // Box 41
		rheingoldpassenger_dining1Model[24].setRotationPoint(-46F, -28F, 4F);

		rheingoldpassenger_dining1Model[25].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 42
		rheingoldpassenger_dining1Model[25].setRotationPoint(-46F, -25F, 8F);

		rheingoldpassenger_dining1Model[26].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 43
		rheingoldpassenger_dining1Model[26].setRotationPoint(-46F, -25F, -11F);

		rheingoldpassenger_dining1Model[27].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 44
		rheingoldpassenger_dining1Model[27].setRotationPoint(-46F, -28F, -8F);

		rheingoldpassenger_dining1Model[28].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 45
		rheingoldpassenger_dining1Model[28].setRotationPoint(-46F, -29F, -4F);

		rheingoldpassenger_dining1Model[29].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 46
		rheingoldpassenger_dining1Model[29].setRotationPoint(-8F, -25F, 8F);

		rheingoldpassenger_dining1Model[30].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F); // Box 47
		rheingoldpassenger_dining1Model[30].setRotationPoint(-8F, -28F, 4F);

		rheingoldpassenger_dining1Model[31].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 48
		rheingoldpassenger_dining1Model[31].setRotationPoint(-8F, -29F, 0F);

		rheingoldpassenger_dining1Model[32].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 49
		rheingoldpassenger_dining1Model[32].setRotationPoint(-8F, -29F, -4F);

		rheingoldpassenger_dining1Model[33].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 50
		rheingoldpassenger_dining1Model[33].setRotationPoint(-8F, -28F, -8F);

		rheingoldpassenger_dining1Model[34].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 51
		rheingoldpassenger_dining1Model[34].setRotationPoint(-8F, -25F, -11F);

		rheingoldpassenger_dining1Model[35].addBox(0F, 0F, 0F, 1, 22, 14, 0F); // Box 150
		rheingoldpassenger_dining1Model[35].setRotationPoint(-5F, -22F, -4F);

		rheingoldpassenger_dining1Model[36].addBox(0F, 0F, 0F, 41, 26, 1, 0F); // Box 151
		rheingoldpassenger_dining1Model[36].setRotationPoint(-46F, -26F, -4F);

		rheingoldpassenger_dining1Model[37].addBox(0F, 0F, 0F, 1, 22, 14, 0F); // Box 153
		rheingoldpassenger_dining1Model[37].setRotationPoint(-47F, -22F, -4F);

		rheingoldpassenger_dining1Model[38].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 154
		rheingoldpassenger_dining1Model[38].setRotationPoint(-60F, -22F, 10F);

		rheingoldpassenger_dining1Model[39].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 155
		rheingoldpassenger_dining1Model[39].setRotationPoint(-60F, -22F, -11F);

		rheingoldpassenger_dining1Model[40].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[40].setRotationPoint(45F, -10F, 2F);

		rheingoldpassenger_dining1Model[41].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[41].setRotationPoint(46F, -10.2F, 3F);

		rheingoldpassenger_dining1Model[42].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[42].setRotationPoint(41F, -3F, 2F);

		rheingoldpassenger_dining1Model[43].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[43].setRotationPoint(42F, -1F, 2.5F);

		rheingoldpassenger_dining1Model[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[44].setRotationPoint(45F, -3F, 2F);

		rheingoldpassenger_dining1Model[45].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[45].setRotationPoint(41.45F, -5F, 1.5F);

		rheingoldpassenger_dining1Model[46].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[46].setRotationPoint(28F, -10F, 10F);
		rheingoldpassenger_dining1Model[46].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[47].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[47].setRotationPoint(27F, -10.2F, 9F);
		rheingoldpassenger_dining1Model[47].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[48].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[48].setRotationPoint(32F, -3F, 10F);
		rheingoldpassenger_dining1Model[48].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[49].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[49].setRotationPoint(31F, -1F, 9.5F);
		rheingoldpassenger_dining1Model[49].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[50].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[50].setRotationPoint(28F, -3F, 10F);
		rheingoldpassenger_dining1Model[50].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[51].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[51].setRotationPoint(31.45F, -5F, 2.5F);
		rheingoldpassenger_dining1Model[51].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[52].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		rheingoldpassenger_dining1Model[52].setRotationPoint(36F, -5F, 5F);

		rheingoldpassenger_dining1Model[53].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 170
		rheingoldpassenger_dining1Model[53].setRotationPoint(33F, -5.05F, 3F);

		rheingoldpassenger_dining1Model[54].addShapeBox(0F, 0F, 1F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[54].setRotationPoint(45F, -10F, -11F);

		rheingoldpassenger_dining1Model[55].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[55].setRotationPoint(46F, -10.2F, -9F);

		rheingoldpassenger_dining1Model[56].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[56].setRotationPoint(41F, -3F, -10F);

		rheingoldpassenger_dining1Model[57].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[57].setRotationPoint(42F, -1F, -9.5F);

		rheingoldpassenger_dining1Model[58].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[58].setRotationPoint(45F, -3F, -10F);

		rheingoldpassenger_dining1Model[59].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[59].setRotationPoint(41.45F, -5F, -2.5F);

		rheingoldpassenger_dining1Model[60].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[60].setRotationPoint(17F, -10F, 2F);

		rheingoldpassenger_dining1Model[61].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[61].setRotationPoint(18F, -10.2F, 3F);

		rheingoldpassenger_dining1Model[62].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[62].setRotationPoint(13F, -3F, 2F);

		rheingoldpassenger_dining1Model[63].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[63].setRotationPoint(14F, -1F, 2.5F);

		rheingoldpassenger_dining1Model[64].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[64].setRotationPoint(17F, -3F, 2F);

		rheingoldpassenger_dining1Model[65].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[65].setRotationPoint(13.45F, -5F, 1.5F);

		rheingoldpassenger_dining1Model[66].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[66].setRotationPoint(0F, -10F, 10F);
		rheingoldpassenger_dining1Model[66].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[67].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[67].setRotationPoint(-1F, -10.2F, 9F);
		rheingoldpassenger_dining1Model[67].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[68].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[68].setRotationPoint(4F, -3F, 10F);
		rheingoldpassenger_dining1Model[68].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[69].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[69].setRotationPoint(3F, -1F, 9.5F);
		rheingoldpassenger_dining1Model[69].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[70].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[70].setRotationPoint(0F, -3F, 10F);
		rheingoldpassenger_dining1Model[70].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[71].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[71].setRotationPoint(3.45F, -5F, 2.5F);
		rheingoldpassenger_dining1Model[71].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[72].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[72].setRotationPoint(17F, -10F, -10F);

		rheingoldpassenger_dining1Model[73].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[73].setRotationPoint(18F, -10.2F, -9F);

		rheingoldpassenger_dining1Model[74].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[74].setRotationPoint(13F, -3F, -10F);

		rheingoldpassenger_dining1Model[75].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[75].setRotationPoint(14F, -1F, -9.5F);

		rheingoldpassenger_dining1Model[76].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[76].setRotationPoint(17F, -3F, -10F);

		rheingoldpassenger_dining1Model[77].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[77].setRotationPoint(13.45F, -5F, -2.5F);

		rheingoldpassenger_dining1Model[78].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining1Model[78].setRotationPoint(28F, -10F, -2F);
		rheingoldpassenger_dining1Model[78].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[79].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining1Model[79].setRotationPoint(27F, -10.2F, -3F);
		rheingoldpassenger_dining1Model[79].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[80].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining1Model[80].setRotationPoint(32F, -3F, -2F);
		rheingoldpassenger_dining1Model[80].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[81].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining1Model[81].setRotationPoint(31F, -1F, -2.5F);
		rheingoldpassenger_dining1Model[81].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[82].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining1Model[82].setRotationPoint(28F, -3F, -2F);
		rheingoldpassenger_dining1Model[82].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[83].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining1Model[83].setRotationPoint(31.45F, -5F, -1.5F);
		rheingoldpassenger_dining1Model[83].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining1Model[84].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 84
		rheingoldpassenger_dining1Model[84].setRotationPoint(5F, -5.05F, 3F);

		rheingoldpassenger_dining1Model[85].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 85
		rheingoldpassenger_dining1Model[85].setRotationPoint(5F, -5.05F, -10F);

		rheingoldpassenger_dining1Model[86].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 86
		rheingoldpassenger_dining1Model[86].setRotationPoint(33F, -5.05F, -10F);

		rheingoldpassenger_dining1Model[87].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 87
		rheingoldpassenger_dining1Model[87].setRotationPoint(8F, -5F, 5F);

		rheingoldpassenger_dining1Model[88].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 88
		rheingoldpassenger_dining1Model[88].setRotationPoint(8F, -5F, -6F);

		rheingoldpassenger_dining1Model[89].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 89
		rheingoldpassenger_dining1Model[89].setRotationPoint(36F, -5F, -6F);

		rheingoldpassenger_dining1Model[90].addShapeBox(0F, 0F, 0F, 66, 2, 22, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rheingoldpassenger_dining1Model[90].setRotationPoint(-32F, 1F, -11F);

		rheingoldpassenger_dining1Model[91].addBox(0F, 0F, 0F, 9, 8, 4, 0F); // Box 93
		rheingoldpassenger_dining1Model[91].setRotationPoint(-14F, -8F, -3F);

		rheingoldpassenger_dining1Model[92].addBox(0F, 0F, 0F, 9, 8, 4, 0F); // Box 94
		rheingoldpassenger_dining1Model[92].setRotationPoint(-24F, -8F, -3F);

		rheingoldpassenger_dining1Model[93].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 96
		rheingoldpassenger_dining1Model[93].setRotationPoint(-26F, -19F, -3F);

		rheingoldpassenger_dining1Model[94].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 97
		rheingoldpassenger_dining1Model[94].setRotationPoint(-17F, -22F, -3F);

		rheingoldpassenger_dining1Model[95].addBox(0F, 0F, 0F, 41, 0, 13, 0F); // Box 98
		rheingoldpassenger_dining1Model[95].setRotationPoint(-46F, -22F, -3F);

		rheingoldpassenger_dining1Model[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining1Model[96].setRotationPoint(-16F, -18.5F, -3F);


	}

	private ModelDeiticBogie bogie1 = new ModelDeiticBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 97; i++)
		{
			rheingoldpassenger_dining1Model[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class85_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-3.3,-0.32,0);
		GL11.glScaled(0.7,0.7,0.9);
		GL11.glRotated(90,0,1,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(2.6,-0.32,0);
		GL11.glScaled(0.7,0.7,0.9);
		GL11.glRotated(90,0,1,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rheingoldpassenger_dining1Model[];
}