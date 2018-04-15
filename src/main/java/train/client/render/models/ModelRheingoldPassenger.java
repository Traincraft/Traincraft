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

public class ModelRheingoldPassenger extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelRheingoldPassenger()
	{
		rheingoldpassengerModel = new ModelRendererTurbo[114];
		rheingoldpassengerModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		rheingoldpassengerModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 70
		rheingoldpassengerModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 193
		rheingoldpassengerModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 194
		rheingoldpassengerModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 195
		rheingoldpassengerModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 197
		rheingoldpassengerModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 198
		rheingoldpassengerModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 199
		rheingoldpassengerModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 200
		rheingoldpassengerModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 201
		rheingoldpassengerModel[10] = new ModelRendererTurbo(this, 35, 224, textureX, textureY); // Box 99
		rheingoldpassengerModel[11] = new ModelRendererTurbo(this, 41, 256, textureX, textureY); // Box 1
		rheingoldpassengerModel[12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 110
		rheingoldpassengerModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 36
		rheingoldpassengerModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 36
		rheingoldpassengerModel[15] = new ModelRendererTurbo(this, 56, 145, textureX, textureY); // Box 154
		rheingoldpassengerModel[16] = new ModelRendererTurbo(this, 56, 186, textureX, textureY); // Box 155
		rheingoldpassengerModel[17] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[18] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[19] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[20] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[21] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[23] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[24] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[25] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[26] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[27] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[28] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[29] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[31] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[32] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[33] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[34] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[35] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[36] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[37] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[38] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[39] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[40] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[41] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[42] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[43] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[44] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[45] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[46] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[47] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[48] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[49] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[50] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[51] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[53] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[54] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[55] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[56] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[57] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[58] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[59] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[60] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[61] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[62] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[63] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[64] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[65] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[66] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[67] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[68] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[69] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[70] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[71] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[72] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[73] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[74] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[75] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[76] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[77] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[78] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[79] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[80] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[81] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[82] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[83] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[84] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[85] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[86] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[87] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[88] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[89] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[90] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[91] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[92] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[93] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[94] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[95] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[96] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[97] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[98] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[99] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[100] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[101] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[102] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[103] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[104] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[105] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[106] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[107] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassengerModel[108] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassengerModel[109] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassengerModel[110] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassengerModel[111] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassengerModel[112] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassengerModel[113] = new ModelRendererTurbo(this, 37, 280, textureX, textureY); // Box 92

		rheingoldpassengerModel[0].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		rheingoldpassengerModel[0].setRotationPoint(-59F, -22F, -10F);

		rheingoldpassengerModel[1].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		rheingoldpassengerModel[1].setRotationPoint(59F, -22F, -10F);

		rheingoldpassengerModel[2].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		rheingoldpassengerModel[2].setRotationPoint(-61F, -20F, -6F);

		rheingoldpassengerModel[3].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		rheingoldpassengerModel[3].setRotationPoint(-61F, -20F, 5F);

		rheingoldpassengerModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rheingoldpassengerModel[4].setRotationPoint(-61F, -2F, -5F);

		rheingoldpassengerModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		rheingoldpassengerModel[5].setRotationPoint(-61F, -21F, -5F);

		rheingoldpassengerModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		rheingoldpassengerModel[6].setRotationPoint(60F, -21F, -5F);

		rheingoldpassengerModel[7].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		rheingoldpassengerModel[7].setRotationPoint(60F, -20F, 5F);

		rheingoldpassengerModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rheingoldpassengerModel[8].setRotationPoint(60F, -2F, -5F);

		rheingoldpassengerModel[9].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		rheingoldpassengerModel[9].setRotationPoint(60F, -20F, -6F);

		rheingoldpassengerModel[10].addShapeBox(0F, 0F, 0F, 119, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassengerModel[10].setRotationPoint(-59F, -24F, -11F);

		rheingoldpassengerModel[11].addShapeBox(0F, 0F, 0F, 119, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rheingoldpassengerModel[11].setRotationPoint(-59F, -26F, -8F);

		rheingoldpassengerModel[12].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 110
		rheingoldpassengerModel[12].setRotationPoint(-59F, 0F, -11F);

		rheingoldpassengerModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassengerModel[13].setRotationPoint(-62F, -1F, 0F);

		rheingoldpassengerModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassengerModel[14].setRotationPoint(60F, -1F, 0F);

		rheingoldpassengerModel[15].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 154
		rheingoldpassengerModel[15].setRotationPoint(-59F, -22F, 10F);

		rheingoldpassengerModel[16].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 155
		rheingoldpassengerModel[16].setRotationPoint(-59F, -22F, -11F);

		rheingoldpassengerModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[17].setRotationPoint(46F, -10F, 2F);

		rheingoldpassengerModel[18].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[18].setRotationPoint(47F, -10.2F, 3F);

		rheingoldpassengerModel[19].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[19].setRotationPoint(42F, -3F, 2F);

		rheingoldpassengerModel[20].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[20].setRotationPoint(43F, -1F, 2.5F);

		rheingoldpassengerModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[21].setRotationPoint(46F, -3F, 2F);

		rheingoldpassengerModel[22].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[22].setRotationPoint(42.45F, -5F, 1.5F);

		rheingoldpassengerModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[23].setRotationPoint(34F, -10F, 2F);

		rheingoldpassengerModel[24].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[24].setRotationPoint(35F, -10.2F, 3F);

		rheingoldpassengerModel[25].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[25].setRotationPoint(30F, -3F, 2F);

		rheingoldpassengerModel[26].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[26].setRotationPoint(31F, -1F, 2.5F);

		rheingoldpassengerModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[27].setRotationPoint(34F, -3F, 2F);

		rheingoldpassengerModel[28].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[28].setRotationPoint(30.45F, -5F, 1.5F);

		rheingoldpassengerModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[29].setRotationPoint(22F, -10F, 2F);

		rheingoldpassengerModel[30].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[30].setRotationPoint(23F, -10.2F, 3F);

		rheingoldpassengerModel[31].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[31].setRotationPoint(18F, -3F, 2F);

		rheingoldpassengerModel[32].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[32].setRotationPoint(19F, -1F, 2.5F);

		rheingoldpassengerModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[33].setRotationPoint(22F, -3F, 2F);

		rheingoldpassengerModel[34].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[34].setRotationPoint(18.45F, -5F, 1.5F);

		rheingoldpassengerModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[35].setRotationPoint(10F, -10F, 2F);

		rheingoldpassengerModel[36].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[36].setRotationPoint(11F, -10.2F, 3F);

		rheingoldpassengerModel[37].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[37].setRotationPoint(6F, -3F, 2F);

		rheingoldpassengerModel[38].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[38].setRotationPoint(7F, -1F, 2.5F);

		rheingoldpassengerModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[39].setRotationPoint(10F, -3F, 2F);

		rheingoldpassengerModel[40].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[40].setRotationPoint(6.45F, -5F, 1.5F);

		rheingoldpassengerModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[41].setRotationPoint(-6F, -10F, 2F);

		rheingoldpassengerModel[42].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[42].setRotationPoint(-5F, -10.2F, 3F);

		rheingoldpassengerModel[43].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[43].setRotationPoint(-10F, -3F, 2F);

		rheingoldpassengerModel[44].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[44].setRotationPoint(-9F, -1F, 2.5F);

		rheingoldpassengerModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[45].setRotationPoint(-6F, -3F, 2F);

		rheingoldpassengerModel[46].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[46].setRotationPoint(-9.55F, -5F, 1.5F);

		rheingoldpassengerModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[47].setRotationPoint(-18F, -10F, 2F);

		rheingoldpassengerModel[48].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[48].setRotationPoint(-17F, -10.2F, 3F);

		rheingoldpassengerModel[49].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[49].setRotationPoint(-22F, -3F, 2F);

		rheingoldpassengerModel[50].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[50].setRotationPoint(-21F, -1F, 2.5F);

		rheingoldpassengerModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[51].setRotationPoint(-18F, -3F, 2F);

		rheingoldpassengerModel[52].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[52].setRotationPoint(-21.55F, -5F, 1.5F);

		rheingoldpassengerModel[53].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[53].setRotationPoint(-42F, -10F, 2F);

		rheingoldpassengerModel[54].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[54].setRotationPoint(-41F, -10.2F, 3F);

		rheingoldpassengerModel[55].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[55].setRotationPoint(-46F, -3F, 2F);

		rheingoldpassengerModel[56].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[56].setRotationPoint(-45F, -1F, 2.5F);

		rheingoldpassengerModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[57].setRotationPoint(-42F, -3F, 2F);

		rheingoldpassengerModel[58].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[58].setRotationPoint(-45.55F, -5F, 1.5F);

		rheingoldpassengerModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[59].setRotationPoint(-30F, -10F, 2F);

		rheingoldpassengerModel[60].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[60].setRotationPoint(-29F, -10.2F, 3F);

		rheingoldpassengerModel[61].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[61].setRotationPoint(-34F, -3F, 2F);

		rheingoldpassengerModel[62].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[62].setRotationPoint(-33F, -1F, 2.5F);

		rheingoldpassengerModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[63].setRotationPoint(-30F, -3F, 2F);

		rheingoldpassengerModel[64].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[64].setRotationPoint(-33.55F, -5F, 1.5F);

		rheingoldpassengerModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[65].setRotationPoint(-42F, -10F, -10F);

		rheingoldpassengerModel[66].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[66].setRotationPoint(-41F, -10.2F, -9F);

		rheingoldpassengerModel[67].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[67].setRotationPoint(-46F, -3F, -10F);

		rheingoldpassengerModel[68].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[68].setRotationPoint(-45F, -1F, -9.5F);

		rheingoldpassengerModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[69].setRotationPoint(-42F, -3F, -10F);

		rheingoldpassengerModel[70].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[70].setRotationPoint(-45.55F, -5F, -2.5F);

		rheingoldpassengerModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[71].setRotationPoint(-30F, -10F, -10F);

		rheingoldpassengerModel[72].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[72].setRotationPoint(-29F, -10.2F, -9F);

		rheingoldpassengerModel[73].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[73].setRotationPoint(-34F, -3F, -10F);

		rheingoldpassengerModel[74].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[74].setRotationPoint(-33F, -1F, -9.5F);

		rheingoldpassengerModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[75].setRotationPoint(-30F, -3F, -10F);

		rheingoldpassengerModel[76].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[76].setRotationPoint(-33.55F, -5F, -2.5F);

		rheingoldpassengerModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[77].setRotationPoint(46F, -10F, -10F);

		rheingoldpassengerModel[78].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[78].setRotationPoint(47F, -10.2F, -9F);

		rheingoldpassengerModel[79].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[79].setRotationPoint(42F, -3F, -10F);

		rheingoldpassengerModel[80].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[80].setRotationPoint(43F, -1F, -9.5F);

		rheingoldpassengerModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[81].setRotationPoint(46F, -3F, -10F);

		rheingoldpassengerModel[82].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[82].setRotationPoint(42.45F, -5F, -2.5F);

		rheingoldpassengerModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[83].setRotationPoint(34F, -10F, -10F);

		rheingoldpassengerModel[84].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[84].setRotationPoint(35F, -10.2F, -9F);

		rheingoldpassengerModel[85].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[85].setRotationPoint(30F, -3F, -10F);

		rheingoldpassengerModel[86].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[86].setRotationPoint(31F, -1F, -9.5F);

		rheingoldpassengerModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[87].setRotationPoint(34F, -3F, -10F);

		rheingoldpassengerModel[88].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[88].setRotationPoint(30.45F, -5F, -2.5F);

		rheingoldpassengerModel[89].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[89].setRotationPoint(22F, -10F, -10F);

		rheingoldpassengerModel[90].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[90].setRotationPoint(23F, -10.2F, -9F);

		rheingoldpassengerModel[91].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[91].setRotationPoint(18F, -3F, -10F);

		rheingoldpassengerModel[92].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[92].setRotationPoint(19F, -1F, -9.5F);

		rheingoldpassengerModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[93].setRotationPoint(22F, -3F, -10F);

		rheingoldpassengerModel[94].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[94].setRotationPoint(18.45F, -5F, -2.5F);

		rheingoldpassengerModel[95].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[95].setRotationPoint(10F, -10F, -10F);

		rheingoldpassengerModel[96].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[96].setRotationPoint(11F, -10.2F, -9F);

		rheingoldpassengerModel[97].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[97].setRotationPoint(6F, -3F, -10F);

		rheingoldpassengerModel[98].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[98].setRotationPoint(7F, -1F, -9.5F);

		rheingoldpassengerModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[99].setRotationPoint(10F, -3F, -10F);

		rheingoldpassengerModel[100].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[100].setRotationPoint(6.45F, -5F, -2.5F);

		rheingoldpassengerModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[101].setRotationPoint(-6F, -10F, -10F);

		rheingoldpassengerModel[102].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[102].setRotationPoint(-5F, -10.2F, -9F);

		rheingoldpassengerModel[103].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[103].setRotationPoint(-10F, -3F, -10F);

		rheingoldpassengerModel[104].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[104].setRotationPoint(-9F, -1F, -9.5F);

		rheingoldpassengerModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[105].setRotationPoint(-6F, -3F, -10F);

		rheingoldpassengerModel[106].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[106].setRotationPoint(-9.55F, -5F, -2.5F);

		rheingoldpassengerModel[107].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassengerModel[107].setRotationPoint(-18F, -10F, -10F);

		rheingoldpassengerModel[108].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassengerModel[108].setRotationPoint(-17F, -10.2F, -9F);

		rheingoldpassengerModel[109].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassengerModel[109].setRotationPoint(-22F, -3F, -10F);

		rheingoldpassengerModel[110].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassengerModel[110].setRotationPoint(-21F, -1F, -9.5F);

		rheingoldpassengerModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassengerModel[111].setRotationPoint(-18F, -3F, -10F);

		rheingoldpassengerModel[112].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassengerModel[112].setRotationPoint(-21.55F, -5F, -2.5F);

		rheingoldpassengerModel[113].addShapeBox(0F, 0F, 0F, 66, 2, 22, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rheingoldpassengerModel[113].setRotationPoint(-31F, 1F, -11F);


	}
	private ModelDeiticBogie bogie1 = new ModelDeiticBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 114; i++)
		{
			rheingoldpassengerModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class85_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-3.2,-0.32,0);
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

	public ModelRendererTurbo rheingoldpassengerModel[];
}