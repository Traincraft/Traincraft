//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hi Cube 60'
// Model Creator: 
// Created on: 21.01.2019 - 11:01:10
// Last changed on: 21.01.2019 - 11:01:10

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelWVcaboose extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWVcaboose() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[154];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 43
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 72
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 78
		bodyModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 87
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 104
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 105
		bodyModel[16] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 108
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		bodyModel[23] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Back door
		bodyModel[26] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Front door
		bodyModel[27] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		bodyModel[34] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 87
		bodyModel[35] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 40
		bodyModel[42] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 40
		bodyModel[43] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 40
		bodyModel[44] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 40
		bodyModel[47] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 40
		bodyModel[48] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 40
		bodyModel[49] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 40
		bodyModel[50] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 40
		bodyModel[51] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 40
		bodyModel[52] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 40
		bodyModel[53] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 40
		bodyModel[54] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 40
		bodyModel[55] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 40
		bodyModel[56] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[57] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 40
		bodyModel[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 40
		bodyModel[59] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 40
		bodyModel[60] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 40
		bodyModel[61] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 40
		bodyModel[62] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 39
		bodyModel[63] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 39
		bodyModel[64] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 8
		bodyModel[65] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 9
		bodyModel[66] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Back door
		bodyModel[67] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Back door
		bodyModel[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 39
		bodyModel[69] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 39
		bodyModel[70] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 40
		bodyModel[71] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 40
		bodyModel[72] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 40
		bodyModel[73] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 40
		bodyModel[74] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 106
		bodyModel[75] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
		bodyModel[80] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 106
		bodyModel[91] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 106
		bodyModel[96] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		bodyModel[100] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 106
		bodyModel[108] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 106
		bodyModel[109] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 106
		bodyModel[110] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 106
		bodyModel[111] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 106
		bodyModel[112] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 106
		bodyModel[113] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 106
		bodyModel[114] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 106
		bodyModel[115] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 106
		bodyModel[116] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 106
		bodyModel[117] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 106
		bodyModel[118] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 106
		bodyModel[119] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 106
		bodyModel[120] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 106
		bodyModel[121] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 106
		bodyModel[122] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 106
		bodyModel[123] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 106
		bodyModel[124] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 3
		bodyModel[125] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 40
		bodyModel[126] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 3
		bodyModel[127] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 39
		bodyModel[128] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 39
		bodyModel[129] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 39
		bodyModel[130] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 39
		bodyModel[131] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 39
		bodyModel[132] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 39
		bodyModel[133] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 39
		bodyModel[134] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 39
		bodyModel[135] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 39
		bodyModel[136] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 39
		bodyModel[137] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[138] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 40
		bodyModel[139] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 40
		bodyModel[140] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 40
		bodyModel[141] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 40
		bodyModel[142] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 40
		bodyModel[143] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 40
		bodyModel[144] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 40
		bodyModel[145] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 40
		bodyModel[146] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 40
		bodyModel[147] = new ModelRendererTurbo(this, 425, 9, textureX, textureY, "lamp"); // glow
		bodyModel[148] = new ModelRendererTurbo(this, 281, 9, textureX, textureY, "lamp"); // glow
		bodyModel[149] = new ModelRendererTurbo(this, 401, 17, textureX, textureY, "lamp"); // glow
		bodyModel[150] = new ModelRendererTurbo(this, 1, 25, textureX, textureY, "lamp"); // glow
		bodyModel[151] = new ModelRendererTurbo(this, 57, 25, textureX, textureY, "lamp"); // glow
		bodyModel[152] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 40
		bodyModel[153] = new ModelRendererTurbo(this, 2, 59, textureX, textureY); // Box 40

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-15.5F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 45, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(-22.5F, -14F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(8.5F, -14F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 8
		bodyModel[4].setRotationPoint(-22.5F, -14F, 3F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 9
		bodyModel[5].setRotationPoint(21.5F, -14F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[6].setRotationPoint(-27.5F, -16F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[7].setRotationPoint(-15.5F, 2.8F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[8].setRotationPoint(-15.5F, 2.8F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[9].setRotationPoint(13.5F, 2.8F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[10].setRotationPoint(13.5F, 2.8F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[11].setRotationPoint(-25.5F, -5F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[12].setRotationPoint(-2.5F, -10F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[13].setRotationPoint(-26.5F, -4F, 3F);

		bodyModel[14].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 104
		bodyModel[14].setRotationPoint(8.5F, -14F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 105
		bodyModel[15].setRotationPoint(-22.5F, -14F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[16].setRotationPoint(-2.5F, -10F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[17].setRotationPoint(28.5F, 3F, -1.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 57, 2, 5, 0F); // Box 0
		bodyModel[18].setRotationPoint(-28.5F, 3F, -2.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[19].setRotationPoint(-31.5F, 3F, -1.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[20].setRotationPoint(13.5F, 5F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[21].setRotationPoint(-2.5F, -11F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[22].setRotationPoint(-2.5F, -11F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(26.5F, 4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(7.5F, -22F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back door
		bodyModel[25].setRotationPoint(21.5F, -12F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front door
		bodyModel[26].setRotationPoint(-22.5F, -12F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-2.5F, -20F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(-2.5F, -20F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-2.5F, -20F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-6.5F, -21F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 24, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-26.5F, -16F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 24, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(-26.5F, -16F, 0F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 3
		bodyModel[33].setRotationPoint(-6.5F, -22F, -7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 19, 0, 4, 0F); // Box 87
		bodyModel[34].setRotationPoint(8.5F, -16F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 18, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-26.5F, -14F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-26.5F, 6F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(-26.5F, 4F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-26.5F, 6F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-26.5F, 4F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 1
		bodyModel[40].setRotationPoint(-26.5F, 2F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[41].setRotationPoint(22.5F, 6F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[42].setRotationPoint(22.5F, 4F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[43].setRotationPoint(22.5F, 6F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 1
		bodyModel[45].setRotationPoint(22.5F, 2F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[46].setRotationPoint(22.5F, 3F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[47].setRotationPoint(26.5F, 4F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[48].setRotationPoint(22.5F, 3F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[49].setRotationPoint(-22.5F, 3F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[50].setRotationPoint(-26.5F, 4F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[51].setRotationPoint(-22.5F, 3F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[52].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[53].setRotationPoint(-26.5F, 4F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[54].setRotationPoint(-26.5F, 3F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[55].setRotationPoint(-26.5F, 4F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[56].setRotationPoint(-26.5F, 3F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[57].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[58].setRotationPoint(22.5F, 3F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[59].setRotationPoint(22.5F, 4F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[60].setRotationPoint(22.5F, 3F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 18, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[61].setRotationPoint(26.5F, -14F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[62].setRotationPoint(8.5F, -16F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[63].setRotationPoint(8.5F, -16F, 0F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 8
		bodyModel[64].setRotationPoint(-22.5F, -14F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 9
		bodyModel[65].setRotationPoint(21.5F, -14F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back door
		bodyModel[66].setRotationPoint(21.5F, -14F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back door
		bodyModel[67].setRotationPoint(-22.5F, -14F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 39
		bodyModel[68].setRotationPoint(-3.5F, -22.1F, -12F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 39
		bodyModel[69].setRotationPoint(-3.5F, -22.1F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[70].setRotationPoint(7.5F, -20F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[71].setRotationPoint(7.5F, -22F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[72].setRotationPoint(-2.5F, -22F, -12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[73].setRotationPoint(-2.5F, -22F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[74].setRotationPoint(-2.5F, -14F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[75].setRotationPoint(7.5F, -14F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[76].setRotationPoint(-2.5F, -14F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[77].setRotationPoint(7.5F, -14F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 87
		bodyModel[78].setRotationPoint(-26.5F, -4F, 4F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[79].setRotationPoint(25.5F, -5F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 87
		bodyModel[80].setRotationPoint(25.5F, -4F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(25.5F, -4F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[82].setRotationPoint(-2.5F, -10F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(7.5F, -10F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(-2.5F, -10F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[85].setRotationPoint(7.5F, -10F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[86].setRotationPoint(8.5F, -1F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[87].setRotationPoint(17.5F, -14F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[88].setRotationPoint(12.5F, -14F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[89].setRotationPoint(8.5F, -14F, 4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[90].setRotationPoint(18.5F, -14F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[91].setRotationPoint(18.5F, -5F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[92].setRotationPoint(-21.5F, -1F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[93].setRotationPoint(-21F, -1.5F, 4.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(15.5F, -2F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[95].setRotationPoint(14.5F, -6F, 5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[96].setRotationPoint(15.5F, -1F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[97].setRotationPoint(-21.5F, -5F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[98].setRotationPoint(-18.5F, -2F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[99].setRotationPoint(-15.5F, -6F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[100].setRotationPoint(-17.5F, -1F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[101].setRotationPoint(-9.5F, -4F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(-11.5F, -3F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[103].setRotationPoint(-1.5F, -10F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[104].setRotationPoint(4.5F, -10F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[105].setRotationPoint(-1.5F, -10F, -5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[106].setRotationPoint(4.5F, -10F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[107].setRotationPoint(9F, -1.5F, -9.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[108].setRotationPoint(1.5F, -10F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[109].setRotationPoint(1.5F, 1F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[110].setRotationPoint(1.5F, -2F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[111].setRotationPoint(1.5F, -5F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[112].setRotationPoint(1.5F, -8F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[113].setRotationPoint(1.5F, -10F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[114].setRotationPoint(1.5F, 1F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[115].setRotationPoint(1.5F, -2F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[116].setRotationPoint(1.5F, -5F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[117].setRotationPoint(1.5F, -8F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[118].setRotationPoint(2.5F, -13F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[119].setRotationPoint(5.5F, -17F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[120].setRotationPoint(0.5F, -13F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[121].setRotationPoint(-0.5F, -17F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[122].setRotationPoint(0.5F, -12F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[123].setRotationPoint(3.5F, -12F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 3
		bodyModel[124].setRotationPoint(-6.5F, -13F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[125].setRotationPoint(-7.5F, -12F, -9F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 3
		bodyModel[126].setRotationPoint(-7.5F, -13F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[127].setRotationPoint(-26.5F, -16F, 2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[128].setRotationPoint(-26.5F, -16F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[129].setRotationPoint(-20.5F, -16F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[130].setRotationPoint(20.5F, -16F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[131].setRotationPoint(20.5F, -16F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[132].setRotationPoint(26.5F, -16F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[133].setRotationPoint(22.5F, -21F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[134].setRotationPoint(22.5F, -21F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[135].setRotationPoint(-26.5F, -21F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[136].setRotationPoint(-26.5F, -21F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 3
		bodyModel[137].setRotationPoint(-2.5F, -22.85F, 6.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[138].setRotationPoint(-22.5F, 3F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[139].setRotationPoint(12.5F, 3F, 11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[140].setRotationPoint(-22.5F, 3F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[141].setRotationPoint(12.5F, 3F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[142].setRotationPoint(-4.5F, 4F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[143].setRotationPoint(-4.5F, 5F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[144].setRotationPoint(-4.5F, 3F, -9.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[145].setRotationPoint(1.5F, 3F, -9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[146].setRotationPoint(0.5F, 3F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // glow
		bodyModel[147].setRotationPoint(26F, -16F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // glow
		bodyModel[148].setRotationPoint(21.5F, -8F, -12F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // glow
		bodyModel[149].setRotationPoint(21.5F, -8F, 11F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // glow
		bodyModel[150].setRotationPoint(-22.5F, -8F, -12F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // glow
		bodyModel[151].setRotationPoint(-22.5F, -8F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 15, 47, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -39F, 0F, -12F, -39F); // Box 40
		bodyModel[152].setRotationPoint(-1.49F, -18F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 15, 47, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -39F, 0F, -12F, -39F); // Box 40
		bodyModel[153].setRotationPoint(7.49F, -18F, -2F);
	}
	Modelcaboosetruck bogie = new Modelcaboosetruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 154; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/cb_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.03125f,0.5625,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.8125,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelWVcaboose[];
}