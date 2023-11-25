//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 06.07.2022 - 13:19:08
// Last changed on: 06.07.2022 - 13:19:08

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class  ModelMRCompoundTender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMRCompoundTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[130];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 102, 171, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 17, 210, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 385, 210, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[42] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[43] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[45] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[52] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[54] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[55] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[56] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[57] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[58] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[59] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[60] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[62] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[63] = new ModelRendererTurbo(this, 15, 260, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 15, 260, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 249, 228, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 169
		bodyModel[67] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 170
		bodyModel[68] = new ModelRendererTurbo(this, 417, 210, textureX, textureY); // Box 172
		bodyModel[69] = new ModelRendererTurbo(this, 433, 210, textureX, textureY); // Box 173
		bodyModel[70] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 161
		bodyModel[71] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 162
		bodyModel[72] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 163
		bodyModel[73] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 164
		bodyModel[74] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 169
		bodyModel[75] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 170
		bodyModel[76] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 172
		bodyModel[77] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 173
		bodyModel[78] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 161
		bodyModel[79] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 162
		bodyModel[80] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 163
		bodyModel[81] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 164
		bodyModel[82] = new ModelRendererTurbo(this, 24, 277, textureX, textureY); // Box 5
		bodyModel[83] = new ModelRendererTurbo(this, 12, 232, textureX, textureY); // Box 5
		bodyModel[84] = new ModelRendererTurbo(this, 132, 297, textureX, textureY); // Box 5
		bodyModel[85] = new ModelRendererTurbo(this, 318, 172, textureX, textureY); // Box 5
		bodyModel[86] = new ModelRendererTurbo(this, 457, 234, textureX, textureY); // Box 5
		bodyModel[87] = new ModelRendererTurbo(this, 457, 244, textureX, textureY); // Box 5
		bodyModel[88] = new ModelRendererTurbo(this, 145, 254, textureX, textureY); // Box 5
		bodyModel[89] = new ModelRendererTurbo(this, 1, 210, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 198
		bodyModel[91] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 198
		bodyModel[92] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 198
		bodyModel[93] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 198
		bodyModel[94] = new ModelRendererTurbo(this, 17, 171, textureX, textureY); // Box 5
		bodyModel[95] = new ModelRendererTurbo(this, 441, 222, textureX, textureY); // Box 119
		bodyModel[96] = new ModelRendererTurbo(this, 17, 210, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 33, 210, textureX, textureY); // Box 119
		bodyModel[98] = new ModelRendererTurbo(this, 41, 210, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 209, 210, textureX, textureY); // Box 119
		bodyModel[100] = new ModelRendererTurbo(this, 217, 210, textureX, textureY); // Box 119
		bodyModel[101] = new ModelRendererTurbo(this, 225, 210, textureX, textureY); // Box 119
		bodyModel[102] = new ModelRendererTurbo(this, 179, 237, textureX, textureY); // Box 5
		bodyModel[103] = new ModelRendererTurbo(this, 179, 237, textureX, textureY); // Box 5
		bodyModel[104] = new ModelRendererTurbo(this, 178, 240, textureX, textureY); // Box 5
		bodyModel[105] = new ModelRendererTurbo(this, 229, 225, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 249, 210, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 264, 256, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 431, 252, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 150, 230, textureX, textureY); // Box 108
		bodyModel[110] = new ModelRendererTurbo(this, 167, 230, textureX, textureY); // Box 108
		bodyModel[111] = new ModelRendererTurbo(this, 289, 210, textureX, textureY); // Box 108
		bodyModel[112] = new ModelRendererTurbo(this, 276, 264, textureX, textureY); // Box 1
		bodyModel[113] = new ModelRendererTurbo(this, 338, 274, textureX, textureY); // Box 212
		bodyModel[114] = new ModelRendererTurbo(this, 481, 210, textureX, textureY); // Box 5
		bodyModel[115] = new ModelRendererTurbo(this, 441, 210, textureX, textureY); // Box 212
		bodyModel[116] = new ModelRendererTurbo(this, 465, 210, textureX, textureY); // Box 5
		bodyModel[117] = new ModelRendererTurbo(this, 81, 210, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 497, 210, textureX, textureY); // Box 5
		bodyModel[119] = new ModelRendererTurbo(this, 211, 253, textureX, textureY); // Box 5
		bodyModel[120] = new ModelRendererTurbo(this, 409, 210, textureX, textureY); // Box 212
		bodyModel[121] = new ModelRendererTurbo(this, 145, 210, textureX, textureY); // Box 5
		bodyModel[122] = new ModelRendererTurbo(this, 329, 210, textureX, textureY); // Box 212
		bodyModel[123] = new ModelRendererTurbo(this, 57, 210, textureX, textureY); // Box 5
		bodyModel[124] = new ModelRendererTurbo(this, 177, 210, textureX, textureY); // Box 5
		bodyModel[125] = new ModelRendererTurbo(this, 97, 210, textureX, textureY); // Box 5
		bodyModel[126] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 183, 166, textureX, textureY); // Box 127
		bodyModel[129] = new ModelRendererTurbo(this, 17, 171, textureX, textureY); // Box 5

		bodyModel[0].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(26F, -0.5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 0
		bodyModel[1].setRotationPoint(29F, -1.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[2].setRotationPoint(29F, 0.5F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[3].setRotationPoint(29F, 0.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(27F, 0F, -7.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[5].setRotationPoint(27F, 1F, -8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[6].setRotationPoint(27F, 1F, -6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(27F, 0F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(27F, 0F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(27F, 2F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[10].setRotationPoint(27F, 2F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(29F, -1.5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(29F, 2.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(29F, -1.5F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0
		bodyModel[14].setRotationPoint(29F, 2.5F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 0
		bodyModel[15].setRotationPoint(29F, -1.5F, 6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[16].setRotationPoint(29F, 0.5F, 4F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[17].setRotationPoint(29F, 0.5F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[18].setRotationPoint(27F, 0F, 6.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[19].setRotationPoint(27F, 1F, 5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[20].setRotationPoint(27F, 1F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(27F, 0F, 5.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(27F, 0F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(27F, 2F, 5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[24].setRotationPoint(27F, 2F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(29F, -1.5F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(29F, 2.5F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(29F, -1.5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0
		bodyModel[28].setRotationPoint(29F, 2.5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(27F, 1F, -0.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[30].setRotationPoint(-5F, 0F, -6F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 0
		bodyModel[31].setRotationPoint(-0.5F, 4.5F, -7F);

		bodyModel[32].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[32].setRotationPoint(-5F, 0F, 6F);

		bodyModel[33].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[33].setRotationPoint(14F, 0F, -6F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 0
		bodyModel[34].setRotationPoint(18.5F, 4.5F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[35].setRotationPoint(14F, 0F, 6F);

		bodyModel[36].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[36].setRotationPoint(-25F, 0F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 0
		bodyModel[37].setRotationPoint(-20.5F, 4.5F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[38].setRotationPoint(-25F, 0F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[39].setRotationPoint(18F, 4F, 6.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[40].setRotationPoint(18F, 4F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[41].setRotationPoint(17.5F, 2.75F, 6.95F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[42].setRotationPoint(18F, 3F, 6.95F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[43].setRotationPoint(18.5F, 3.25F, 6.95F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[44].setRotationPoint(17.5F, 2.75F, -8.45F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[45].setRotationPoint(18F, 3F, -8.45F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[46].setRotationPoint(18.5F, 3.25F, -8.45F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[47].setRotationPoint(-1F, 4F, 6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[48].setRotationPoint(-1F, 4F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[49].setRotationPoint(-1.5F, 2.75F, 6.95F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[50].setRotationPoint(-1F, 3F, 6.95F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[51].setRotationPoint(-0.5F, 3.25F, 6.95F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[52].setRotationPoint(-1.5F, 2.75F, -8.45F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[53].setRotationPoint(-1F, 3F, -8.45F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[54].setRotationPoint(-0.5F, 3.25F, -8.45F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[55].setRotationPoint(-21F, 4F, 6.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[56].setRotationPoint(-21F, 4F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[57].setRotationPoint(-21.5F, 2.75F, 6.95F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[58].setRotationPoint(-21F, 3F, 6.95F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[59].setRotationPoint(-20.5F, 3.25F, 6.95F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[60].setRotationPoint(-21.5F, 2.75F, -8.45F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[61].setRotationPoint(-21F, 3F, -8.45F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[62].setRotationPoint(-20.5F, 3.25F, -8.45F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 53, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 0
		bodyModel[63].setRotationPoint(-27F, -0.5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 53, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-27F, -0.5F, -8.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 1
		bodyModel[65].setRotationPoint(-27F, -1.5F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[66].setRotationPoint(-25F, 0.5F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 170
		bodyModel[67].setRotationPoint(-27F, -0.5F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 172
		bodyModel[68].setRotationPoint(-27F, 5.5F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 173
		bodyModel[69].setRotationPoint(-27F, 1.5F, 10F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 161
		bodyModel[70].setRotationPoint(-27F, -0.5F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 162
		bodyModel[71].setRotationPoint(-27F, 1.5F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 163
		bodyModel[72].setRotationPoint(-27F, 5.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[73].setRotationPoint(-25F, 0.5F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[74].setRotationPoint(23F, 0.5F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 170
		bodyModel[75].setRotationPoint(24F, -0.5F, 9F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 172
		bodyModel[76].setRotationPoint(23F, 5.5F, 10F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 173
		bodyModel[77].setRotationPoint(24F, 1.5F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 161
		bodyModel[78].setRotationPoint(24F, -0.5F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 162
		bodyModel[79].setRotationPoint(24F, 1.5F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 163
		bodyModel[80].setRotationPoint(23F, 5.5F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[81].setRotationPoint(23F, 0.5F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 54, 11, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[82].setRotationPoint(-27F, -12.5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 54, 11, 1, 0F,0F, 0F, -0.95F, -0.05F, 0F, -0.95F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.05F, 0F, -0.95F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[83].setRotationPoint(-27F, -12.5F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 37, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[84].setRotationPoint(-20F, -17.5F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 37, 5, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[85].setRotationPoint(-20F, -17.5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -2F, -3F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[86].setRotationPoint(-26F, -16.5F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -2F, -3F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[87].setRotationPoint(-26F, -16.5F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[88].setRotationPoint(17F, -16.5F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[89].setRotationPoint(17F, -16.5F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 198
		bodyModel[90].setRotationPoint(-27F, -11F, -11.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 198
		bodyModel[91].setRotationPoint(25F, -11F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 198
		bodyModel[92].setRotationPoint(-27F, -11F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 198
		bodyModel[93].setRotationPoint(25F, -11F, 11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 9, 22, 0F,0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 5
		bodyModel[94].setRotationPoint(17F, -10.5F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 119
		bodyModel[95].setRotationPoint(24.5F, -11.5F, -1.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[96].setRotationPoint(25.5F, -11.5F, -0.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[97].setRotationPoint(23.5F, -11.5F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[98].setRotationPoint(23.5F, -11.5F, -1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[99].setRotationPoint(25.5F, -11.5F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 119
		bodyModel[100].setRotationPoint(23.5F, -11.5F, 0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[101].setRotationPoint(25.5F, -11.5F, 0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[102].setRotationPoint(-20F, -16.5F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[103].setRotationPoint(-20F, -16.5F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[104].setRotationPoint(-20F, -16.5F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 108
		bodyModel[105].setRotationPoint(17.25F, -12.5F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[106].setRotationPoint(17.25F, -12.5F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[107].setRotationPoint(21.25F, -12.5F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[108].setRotationPoint(21.25F, -12.5F, -1F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[109].setRotationPoint(19.25F, -12.5F, 3F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 108
		bodyModel[110].setRotationPoint(17.25F, -12.5F, 1F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[111].setRotationPoint(19.25F, -12.5F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 11, 22, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F); // Box 1
		bodyModel[112].setRotationPoint(26F, -12.5F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 212
		bodyModel[113].setRotationPoint(-21F, -17.5F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.999F, -1F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[114].setRotationPoint(-21F, -17.5F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 212
		bodyModel[115].setRotationPoint(-21F, -18.5F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.999F, -1F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[116].setRotationPoint(-21F, -18.5F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.999F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[117].setRotationPoint(-21F, -17.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.999F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[118].setRotationPoint(-21F, -18.5F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[119].setRotationPoint(17F, -16.5F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 212
		bodyModel[120].setRotationPoint(16F, -17.5F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.999F, -1F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[121].setRotationPoint(16F, -17.5F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 212
		bodyModel[122].setRotationPoint(16F, -18.5F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.999F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.999F, -1F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[123].setRotationPoint(16F, -18.5F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.999F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[124].setRotationPoint(16F, -17.5F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.999F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F); // Box 5
		bodyModel[125].setRotationPoint(16F, -18.5F, -8F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 0
		bodyModel[126].setRotationPoint(27F, -7.5F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 0
		bodyModel[127].setRotationPoint(27F, -7.5F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 37, 8, 22, 0F,-11F, -5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -11F, -5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 127
		bodyModel[128].setRotationPoint(-19F, -9.5F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 16, 9, 22, 0F,0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 5
		bodyModel[129].setRotationPoint(-21F, -9.5F, -11F);
	}
}