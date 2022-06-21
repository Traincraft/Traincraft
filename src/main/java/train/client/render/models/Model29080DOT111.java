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
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Model29080DOT111 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Model29080DOT111() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[103];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 5
		bodyModel[10] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 75
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 5
		bodyModel[17] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 5
		bodyModel[18] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 75
		bodyModel[27] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 75
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 106
		bodyModel[30] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 108
		bodyModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 108
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 108
		bodyModel[33] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 108
		bodyModel[34] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 108
		bodyModel[35] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 108
		bodyModel[36] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 108
		bodyModel[37] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 108
		bodyModel[38] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 73
		bodyModel[39] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 73
		bodyModel[41] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 73
		bodyModel[42] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 73
		bodyModel[43] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 124
		bodyModel[48] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 126
		bodyModel[49] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 126
		bodyModel[50] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 126
		bodyModel[51] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 126
		bodyModel[52] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 108
		bodyModel[56] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 108
		bodyModel[57] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 139
		bodyModel[62] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 140
		bodyModel[63] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 141
		bodyModel[64] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 141
		bodyModel[65] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 139
		bodyModel[66] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 146
		bodyModel[69] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 147
		bodyModel[70] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 148
		bodyModel[71] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[73] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 5
		bodyModel[74] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 5
		bodyModel[75] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 4
		bodyModel[77] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 5
		bodyModel[78] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 5
		bodyModel[79] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 3
		bodyModel[81] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 3
		bodyModel[82] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 3
		bodyModel[83] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 3
		bodyModel[84] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 4
		bodyModel[85] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 5
		bodyModel[86] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 5
		bodyModel[87] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 4
		bodyModel[88] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 4
		bodyModel[89] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 5
		bodyModel[91] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 3
		bodyModel[93] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 4
		bodyModel[94] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 5
		bodyModel[95] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 5
		bodyModel[96] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 4
		bodyModel[97] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 5
		bodyModel[99] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 5
		bodyModel[100] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 4
		bodyModel[101] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 108
		bodyModel[102] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 108

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(40.5F, 2.5F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-44.5F, 2.5F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 32, 7, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-32.5F, -12F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, -1.5F, -6F, 0F, -2.5F, -6F, 0F, -2.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-32.5F, -19F, 0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 5
		bodyModel[4].setRotationPoint(-32.5F, -20F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, -2.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-32.5F, -20F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, -1.5F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[6].setRotationPoint(-32.5F, -19F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[7].setRotationPoint(-32.5F, -5F, 0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 5
		bodyModel[8].setRotationPoint(-32.5F, -5F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[9].setRotationPoint(-32.5F, -5F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[10].setRotationPoint(-32.5F, -5F, -10.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[11].setRotationPoint(26.5F, 5F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 73
		bodyModel[12].setRotationPoint(-28.5F, 5F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 13, 2, 4, 0F); // Box 75
		bodyModel[13].setRotationPoint(26.5F, 3F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 2, 4, 0F); // Box 75
		bodyModel[14].setRotationPoint(-39.5F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-36.5F, -19F, 3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, -3F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 5
		bodyModel[16].setRotationPoint(-36.5F, -20F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, -3F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[17].setRotationPoint(-36.5F, -20F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[18].setRotationPoint(-36.5F, -19F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 4
		bodyModel[19].setRotationPoint(-36.5F, -5F, 3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, -3F, -2.5F, 0.5F); // Box 5
		bodyModel[20].setRotationPoint(-36.5F, -5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 5
		bodyModel[21].setRotationPoint(-36.5F, -5F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 4
		bodyModel[22].setRotationPoint(-36.5F, -5F, -10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-36.5F, -12F, -10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 3
		bodyModel[24].setRotationPoint(-36.5F, -12F, 3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[25].setRotationPoint(-36.5F, -12F, -3.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 13, 1, 22, 0F); // Box 75
		bodyModel[26].setRotationPoint(26.5F, 2F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 13, 1, 22, 0F); // Box 75
		bodyModel[27].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 106
		bodyModel[28].setRotationPoint(39.5F, 2F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 106
		bodyModel[29].setRotationPoint(-40.5F, 2F, -2F);

		bodyModel[30].addShapeBox(-1F, 0F, -0.5F, 2, 4, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 108
		bodyModel[30].setRotationPoint(-27.5F, -4F, -10.25F);
		bodyModel[30].rotateAngleX = 0.62831853F;

		bodyModel[31].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 108
		bodyModel[31].setRotationPoint(-28.5F, -4F, -11F);

		bodyModel[32].addShapeBox(-1F, 0F, -0.5F, 2, 4, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 108
		bodyModel[32].setRotationPoint(27.5F, -4F, -10.25F);
		bodyModel[32].rotateAngleX = 0.62831853F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 108
		bodyModel[33].setRotationPoint(26.5F, -4F, -11F);

		bodyModel[34].addShapeBox(-1F, 0F, -0.5F, 2, 4, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 108
		bodyModel[34].setRotationPoint(-27.5F, -4F, 10.5F);
		bodyModel[34].rotateAngleX = -0.62831853F;

		bodyModel[35].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 108
		bodyModel[35].setRotationPoint(-28.5F, -4F, 10F);

		bodyModel[36].addShapeBox(-1F, 0F, -0.5F, 2, 4, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 108
		bodyModel[36].setRotationPoint(27.5F, -4F, 10.5F);
		bodyModel[36].rotateAngleX = -0.62831853F;

		bodyModel[37].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 108
		bodyModel[37].setRotationPoint(26.5F, -4F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[38].setRotationPoint(-28.5F, 3F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[39].setRotationPoint(-28.5F, 3F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[40].setRotationPoint(-39.5F, 3F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[41].setRotationPoint(-39.5F, 3F, 2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[42].setRotationPoint(37.5F, 3F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[43].setRotationPoint(37.5F, 3F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[44].setRotationPoint(26.5F, 3F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[45].setRotationPoint(26.5F, 3F, 2F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[46].setRotationPoint(-35.5F, -8F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[47].setRotationPoint(35.5F, -8F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 126
		bodyModel[48].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 126
		bodyModel[49].setRotationPoint(-39.5F, 3F, 11F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 126
		bodyModel[50].setRotationPoint(35.5F, 3F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 126
		bodyModel[51].setRotationPoint(35.5F, 3F, 11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(-26.5F, 2F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 75
		bodyModel[53].setRotationPoint(19.5F, 2F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 53, 0, 5, 0F); // Box 108
		bodyModel[54].setRotationPoint(-26.5F, 2F, 11F);
		bodyModel[54].rotateAngleX = 2.44346095F;

		bodyModel[55].addBox(0F, 0F, 0F, 53, 0, 5, 0F); // Box 108
		bodyModel[55].setRotationPoint(-26.5F, 2F, -11F);
		bodyModel[55].rotateAngleX = 0.6981317F;

		bodyModel[56].addBox(0F, 0F, 0F, 4, 17, 0, 0F); // Box 108
		bodyModel[56].setRotationPoint(0.5F, -12.5F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 17, 0, 0F); // Box 108
		bodyModel[57].setRotationPoint(0.5F, -12.5F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F); // Box 108
		bodyModel[58].setRotationPoint(0.5F, -17.5F, -6F);
		bodyModel[58].rotateAngleX = -0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F); // Box 108
		bodyModel[59].setRotationPoint(0.5F, -17.5F, 6F);
		bodyModel[59].rotateAngleX = 0.78539816F;

		bodyModel[60].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 138
		bodyModel[60].setRotationPoint(-7F, -22F, -2.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 15, 6, 0, 0F); // Box 139
		bodyModel[61].setRotationPoint(-8.5F, -23.5F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 15, 0, 12, 0F); // Box 140
		bodyModel[62].setRotationPoint(-8.5F, -17.5F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 141
		bodyModel[63].setRotationPoint(-8.5F, -23.5F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 141
		bodyModel[64].setRotationPoint(6.5F, -23.5F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 15, 6, 0, 0F); // Box 139
		bodyModel[65].setRotationPoint(-8.5F, -23.5F, 6F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 108
		bodyModel[66].setRotationPoint(0.5F, -12.5F, 11F);
		bodyModel[66].rotateAngleX = 3.92699082F;

		bodyModel[67].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 108
		bodyModel[67].setRotationPoint(0.5F, -12.5F, -11F);
		bodyModel[67].rotateAngleX = -0.78539816F;

		bodyModel[68].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 146
		bodyModel[68].setRotationPoint(-35.5F, -1F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147
		bodyModel[69].setRotationPoint(-37.5F, -6F, 2F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 148
		bodyModel[70].setRotationPoint(-37.5F, -7F, 1F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 82
		bodyModel[71].setRotationPoint(-1F, 3F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[72].setRotationPoint(32.5F, -19F, 3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 5
		bodyModel[73].setRotationPoint(32.5F, -20F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, -2.5F, 0.5F, -3F, -2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[74].setRotationPoint(32.5F, -20F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[75].setRotationPoint(32.5F, -19F, -10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[76].setRotationPoint(32.5F, -5F, 3.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 5
		bodyModel[77].setRotationPoint(32.5F, -5F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, -3F, -2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[78].setRotationPoint(32.5F, -5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 4
		bodyModel[79].setRotationPoint(32.5F, -5F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[80].setRotationPoint(32.5F, -12F, -10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[81].setRotationPoint(32.5F, -12F, 3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[82].setRotationPoint(32.5F, -12F, -3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 32, 7, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[83].setRotationPoint(0.5F, -12F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, -2.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[84].setRotationPoint(0.5F, -19F, 0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 5
		bodyModel[85].setRotationPoint(0.5F, -20F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, -3.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[86].setRotationPoint(0.5F, -20F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, -2.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -2.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[87].setRotationPoint(0.5F, -19F, -10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -0.5F, -4F); // Box 4
		bodyModel[88].setRotationPoint(0.5F, -5F, 0.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 5
		bodyModel[89].setRotationPoint(0.5F, -5F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 32, 8, 6, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[90].setRotationPoint(0.5F, -5F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 32, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -0.5F, -6F); // Box 4
		bodyModel[91].setRotationPoint(0.5F, -5F, -10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[92].setRotationPoint(-0.5F, -12F, -10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F, 0F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[93].setRotationPoint(-0.5F, -19F, 0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 5
		bodyModel[94].setRotationPoint(-0.5F, -20F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[95].setRotationPoint(-0.5F, -20F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[96].setRotationPoint(-0.5F, -19F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 4
		bodyModel[97].setRotationPoint(-0.5F, -5F, 0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 5
		bodyModel[98].setRotationPoint(-0.5F, -5F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[99].setRotationPoint(-0.5F, -5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 4
		bodyModel[100].setRotationPoint(-0.5F, -5F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[101].setRotationPoint(27.5F, -3F, 11.03F);
		bodyModel[101].rotateAngleZ = -0.78539816F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[102].setRotationPoint(-27.5F, -3F, -11.03F);
		bodyModel[102].rotateAngleZ = -0.78539816F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	//Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 103; i++)
		{
			bodyModel[i].render(f5);
		}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==15){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}

		/*GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.85,0.6,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.4375,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.73,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.45,0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model29080DOT111[];
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}