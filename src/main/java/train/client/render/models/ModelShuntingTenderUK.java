//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.06.2022 - 20:47:19
// Last changed on: 13.06.2022 - 20:47:19

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
import tmt.ModelConverter;

public class ModelShuntingTenderUK extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelShuntingTenderUK() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[150];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 31
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 44
		bodyModel[16] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 48
		bodyModel[18] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 49
		bodyModel[19] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 50
		bodyModel[20] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 51
		bodyModel[21] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63
		bodyModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 64
		bodyModel[23] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 65
		bodyModel[24] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 66
		bodyModel[25] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 67
		bodyModel[26] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 70
		bodyModel[27] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 71
		bodyModel[28] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 72
		bodyModel[29] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 73
		bodyModel[30] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 74
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[32] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 105
		bodyModel[33] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 106
		bodyModel[34] = new ModelRendererTurbo(this, 221, 13, textureX, textureY); // Box 107
		bodyModel[35] = new ModelRendererTurbo(this, 221, 13, textureX, textureY); // Box 108
		bodyModel[36] = new ModelRendererTurbo(this, 221, 13, textureX, textureY); // Box 109
		bodyModel[37] = new ModelRendererTurbo(this, 221, 13, textureX, textureY); // Box 110
		bodyModel[38] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 121
		bodyModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 122
		bodyModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 124
		bodyModel[42] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 126
		bodyModel[44] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 127
		bodyModel[45] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 123
		bodyModel[47] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 123
		bodyModel[48] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 123
		bodyModel[50] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 123
		bodyModel[51] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 123
		bodyModel[52] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 123
		bodyModel[53] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 123
		bodyModel[58] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 123
		bodyModel[64] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 123
		bodyModel[68] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 123
		bodyModel[69] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 123
		bodyModel[70] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[72] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 123
		bodyModel[73] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 123
		bodyModel[74] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 123
		bodyModel[76] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 123
		bodyModel[79] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 123
		bodyModel[80] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 123
		bodyModel[81] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 123
		bodyModel[83] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 123
		bodyModel[84] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 123
		bodyModel[85] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 123
		bodyModel[86] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 123
		bodyModel[88] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 123
		bodyModel[89] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 123
		bodyModel[91] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 123
		bodyModel[92] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 123
		bodyModel[93] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 123
		bodyModel[94] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 123
		bodyModel[95] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 123
		bodyModel[96] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 123
		bodyModel[97] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 123
		bodyModel[98] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 123
		bodyModel[99] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 123
		bodyModel[100] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 121
		bodyModel[102] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[103] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[104] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 41
		bodyModel[105] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 42
		bodyModel[106] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 43
		bodyModel[107] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 44
		bodyModel[108] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 113
		bodyModel[109] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 83
		bodyModel[112] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 83
		bodyModel[113] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 83
		bodyModel[114] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 83
		bodyModel[115] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 83
		bodyModel[116] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 83
		bodyModel[117] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 83
		bodyModel[118] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 83
		bodyModel[119] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 83
		bodyModel[120] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 83
		bodyModel[121] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 40
		bodyModel[122] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 113
		bodyModel[123] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 113
		bodyModel[124] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 113
		bodyModel[125] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 106
		bodyModel[126] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 106
		bodyModel[127] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 106
		bodyModel[128] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 106
		bodyModel[129] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 106
		bodyModel[130] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 106
		bodyModel[131] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 106
		bodyModel[132] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 106
		bodyModel[133] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 113
		bodyModel[134] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 113
		bodyModel[135] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 113
		bodyModel[136] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 113
		bodyModel[137] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 113
		bodyModel[138] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 113
		bodyModel[139] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 106
		bodyModel[140] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 106
		bodyModel[141] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 106
		bodyModel[142] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 106
		bodyModel[143] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 106
		bodyModel[144] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 106
		bodyModel[145] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 106
		bodyModel[146] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		bodyModel[147] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 83
		bodyModel[148] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 83
		bodyModel[149] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 83

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-22F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 5
		bodyModel[1].setRotationPoint(-21F, -4.25F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 9
		bodyModel[2].setRotationPoint(-21F, -2F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 12
		bodyModel[3].setRotationPoint(-21F, -6.5F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 14
		bodyModel[4].setRotationPoint(-21F, -11F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 15
		bodyModel[5].setRotationPoint(-21F, -8.75F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 27
		bodyModel[6].setRotationPoint(-21F, -11F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 28
		bodyModel[7].setRotationPoint(-21F, -6.5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 29
		bodyModel[8].setRotationPoint(-21F, -8.75F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 30
		bodyModel[9].setRotationPoint(-21F, -4.25F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 31
		bodyModel[10].setRotationPoint(-21F, -2F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 40
		bodyModel[11].setRotationPoint(5F, -11F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 41
		bodyModel[12].setRotationPoint(5F, -8.75F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 42
		bodyModel[13].setRotationPoint(5F, -6.5F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 43
		bodyModel[14].setRotationPoint(5F, -4.25F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 44
		bodyModel[15].setRotationPoint(5F, -2F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 46
		bodyModel[16].setRotationPoint(5F, -11F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 48
		bodyModel[17].setRotationPoint(5F, -8.75F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 49
		bodyModel[18].setRotationPoint(5F, -6.5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 50
		bodyModel[19].setRotationPoint(5F, -4.25F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 51
		bodyModel[20].setRotationPoint(5F, -2F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 63
		bodyModel[21].setRotationPoint(-6F, -11F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 64
		bodyModel[22].setRotationPoint(-6F, -4.25F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 65
		bodyModel[23].setRotationPoint(-6F, -2F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 66
		bodyModel[24].setRotationPoint(-6F, -6.5F, 10F);

		bodyModel[25].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 67
		bodyModel[25].setRotationPoint(-6F, -8.75F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 70
		bodyModel[26].setRotationPoint(-6F, -11F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 71
		bodyModel[27].setRotationPoint(-6F, -8.75F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 72
		bodyModel[28].setRotationPoint(-6F, -6.5F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 73
		bodyModel[29].setRotationPoint(-6F, -4.25F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 74
		bodyModel[30].setRotationPoint(-6F, -2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[31].setRotationPoint(-22F, -11F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[32].setRotationPoint(-15F, 6F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[33].setRotationPoint(11F, 6F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 107
		bodyModel[34].setRotationPoint(-19F, 2F, -6F);

		bodyModel[35].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 108
		bodyModel[35].setRotationPoint(-19F, 2F, 6F);

		bodyModel[36].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 109
		bodyModel[36].setRotationPoint(7F, 2F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 110
		bodyModel[37].setRotationPoint(7F, 2F, -6F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[38].setRotationPoint(-23F, 0F, -1F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[39].setRotationPoint(-24F, 1F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[40].setRotationPoint(-25F, 0F, -1F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 124
		bodyModel[41].setRotationPoint(20F, 0F, -1F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 125
		bodyModel[42].setRotationPoint(22F, 0F, -1F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 126
		bodyModel[43].setRotationPoint(21F, 1F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 40, 11, 20, 0F,-11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[44].setRotationPoint(-21F, -11F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[45].setRotationPoint(-25F, 0.5F, -6.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[46].setRotationPoint(-25F, 0.5F, -10.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[47].setRotationPoint(-25F, -1.5F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[48].setRotationPoint(-25F, -1.5F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[49].setRotationPoint(-25F, -1.5F, -6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[50].setRotationPoint(-25F, 2.5F, -10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[51].setRotationPoint(-25F, 2.5F, -6.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[52].setRotationPoint(-24F, 1F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[53].setRotationPoint(-24F, 1F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[54].setRotationPoint(-24F, 0F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[55].setRotationPoint(-24F, 0F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[56].setRotationPoint(-24F, 0F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[57].setRotationPoint(-24F, 2F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[58].setRotationPoint(-24F, 2F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[59].setRotationPoint(-25F, 0.5F, 8.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[60].setRotationPoint(-25F, 0.5F, 4.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[61].setRotationPoint(-25F, -1.5F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[62].setRotationPoint(-25F, -1.5F, 4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[63].setRotationPoint(-25F, -1.5F, 8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[64].setRotationPoint(-25F, 2.5F, 4.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[65].setRotationPoint(-25F, 2.5F, 8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[66].setRotationPoint(-24F, 1F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[67].setRotationPoint(-24F, 1F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[68].setRotationPoint(-24F, 0F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[69].setRotationPoint(-24F, 0F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[70].setRotationPoint(-24F, 2F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[71].setRotationPoint(-24F, 2F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[72].setRotationPoint(-24F, 0F, 6F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[73].setRotationPoint(22F, 0.5F, -6.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[74].setRotationPoint(22F, 0.5F, -10.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[75].setRotationPoint(22F, -1.5F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(22F, -1.5F, -10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[77].setRotationPoint(22F, -1.5F, -6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[78].setRotationPoint(22F, 2.5F, -10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[79].setRotationPoint(22F, 2.5F, -6.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[80].setRotationPoint(20F, 1F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[81].setRotationPoint(20F, 1F, -9F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[82].setRotationPoint(20F, 0F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[83].setRotationPoint(20F, 0F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[84].setRotationPoint(20F, 0F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[85].setRotationPoint(20F, 2F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[86].setRotationPoint(20F, 2F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[87].setRotationPoint(22F, 0.5F, 8.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[88].setRotationPoint(22F, 0.5F, 4.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[89].setRotationPoint(22F, -1.5F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[90].setRotationPoint(22F, -1.5F, 4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[91].setRotationPoint(22F, -1.5F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[92].setRotationPoint(22F, 2.5F, 4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[93].setRotationPoint(22F, 2.5F, 8.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[94].setRotationPoint(20F, 1F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[95].setRotationPoint(20F, 1F, 6F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[96].setRotationPoint(20F, 0F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[97].setRotationPoint(20F, 0F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[98].setRotationPoint(20F, 2F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[99].setRotationPoint(20F, 2F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[100].setRotationPoint(20F, 0F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[101].setRotationPoint(-22F, 1F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[102].setRotationPoint(19F, 1F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 40
		bodyModel[103].setRotationPoint(19F, -11F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 41
		bodyModel[104].setRotationPoint(19F, -8.75F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 42
		bodyModel[105].setRotationPoint(19F, -6.5F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 43
		bodyModel[106].setRotationPoint(19F, -4.25F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 44
		bodyModel[107].setRotationPoint(19F, -2F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[108].setRotationPoint(-15F, 1F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[109].setRotationPoint(-15F, 1F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[110].setRotationPoint(-15F, 1F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -1F, -1F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F); // Box 83
		bodyModel[111].setRotationPoint(-22F, -11F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[112].setRotationPoint(-7F, -11F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[113].setRotationPoint(4F, -11F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[114].setRotationPoint(-22F, -12F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[115].setRotationPoint(-22F, -11F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[116].setRotationPoint(-22F, -12F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[117].setRotationPoint(19F, -11F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[118].setRotationPoint(19F, -11F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[119].setRotationPoint(-7F, -11F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[120].setRotationPoint(4F, -11F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[121].setRotationPoint(19F, -12F, -9F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[122].setRotationPoint(11F, 1F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[123].setRotationPoint(11F, 1F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[124].setRotationPoint(11F, 1F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[125].setRotationPoint(-8F, 1F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[126].setRotationPoint(-6F, 1F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[127].setRotationPoint(-10F, 1F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[128].setRotationPoint(-7F, 6F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[129].setRotationPoint(3F, 1F, 8F);

		bodyModel[130].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 106
		bodyModel[130].setRotationPoint(-15F, 6F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[131].setRotationPoint(5F, 1F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[132].setRotationPoint(5F, 3F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[133].setRotationPoint(-15F, 1F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[134].setRotationPoint(-15F, 1F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[135].setRotationPoint(-15F, 1F, -8F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 113
		bodyModel[136].setRotationPoint(11F, 1F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[137].setRotationPoint(11F, 1F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[138].setRotationPoint(11F, 1F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[139].setRotationPoint(4F, 1F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[140].setRotationPoint(6F, 1F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[141].setRotationPoint(2F, 1F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[142].setRotationPoint(-14F, 6F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[143].setRotationPoint(-8F, 1F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 106
		bodyModel[144].setRotationPoint(-8F, 6F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[145].setRotationPoint(-9F, 1F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 106
		bodyModel[146].setRotationPoint(-14F, 3F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.05F, 0F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F); // Box 83
		bodyModel[147].setRotationPoint(19F, -11F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-1F, -1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -1F, -1F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 83
		bodyModel[148].setRotationPoint(-22F, -11F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0.05F, -1F, -1F, 0.05F, -1F, -1F, 0F, 0F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F); // Box 83
		bodyModel[149].setRotationPoint(19F, -11F, -11F);
	}
}