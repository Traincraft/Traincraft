//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hi Cube 60'
// Model Creator: 
// Created on: 21.01.2019 - 11:01:10
// Last changed on: 21.01.2019 - 11:01:10

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelMILW40boxcar extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILW40boxcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[110];

		initbodyModel_1();

		translateAll(0F, -0.75F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 40
		bodyModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 44
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 87
		bodyModel[15] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 104
		bodyModel[16] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 105
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 108
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 106
		bodyModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 106
		bodyModel[26] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 106
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 497, 17, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[32] = new ModelRendererTurbo(this, 497, 33, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[34] = new ModelRendererTurbo(this, 17, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[35] = new ModelRendererTurbo(this, 33, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[36] = new ModelRendererTurbo(this, 81, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[37] = new ModelRendererTurbo(this, 97, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[38] = new ModelRendererTurbo(this, 113, 41, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[39] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 39
		bodyModel[41] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 3
		bodyModel[42] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 3
		bodyModel[43] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 87
		bodyModel[44] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 40
		bodyModel[46] = new ModelRendererTurbo(this, 12, 70, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 12, 88, textureX, textureY); // Box 106
		bodyModel[48] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 106
		bodyModel[49] = new ModelRendererTurbo(this, 12, 76, textureX, textureY); // Box 106
		bodyModel[50] = new ModelRendererTurbo(this, 12, 73, textureX, textureY); // Box 106
		bodyModel[51] = new ModelRendererTurbo(this, 12, 82, textureX, textureY); // Box 106
		bodyModel[52] = new ModelRendererTurbo(this, 12, 79, textureX, textureY); // Box 106
		bodyModel[53] = new ModelRendererTurbo(this, 12, 85, textureX, textureY); // Box 106
		bodyModel[54] = new ModelRendererTurbo(this, 52, 70, textureX, textureY); // Box 106
		bodyModel[55] = new ModelRendererTurbo(this, 52, 88, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 52, 67, textureX, textureY); // Box 106
		bodyModel[57] = new ModelRendererTurbo(this, 52, 76, textureX, textureY); // Box 106
		bodyModel[58] = new ModelRendererTurbo(this, 52, 73, textureX, textureY); // Box 106
		bodyModel[59] = new ModelRendererTurbo(this, 52, 82, textureX, textureY); // Box 106
		bodyModel[60] = new ModelRendererTurbo(this, 52, 79, textureX, textureY); // Box 106
		bodyModel[61] = new ModelRendererTurbo(this, 52, 85, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 123, 70, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 123, 88, textureX, textureY); // Box 106
		bodyModel[64] = new ModelRendererTurbo(this, 123, 67, textureX, textureY); // Box 106
		bodyModel[65] = new ModelRendererTurbo(this, 123, 76, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 123, 73, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 123, 82, textureX, textureY); // Box 106
		bodyModel[68] = new ModelRendererTurbo(this, 123, 79, textureX, textureY); // Box 106
		bodyModel[69] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 106
		bodyModel[70] = new ModelRendererTurbo(this, 163, 70, textureX, textureY); // Box 106
		bodyModel[71] = new ModelRendererTurbo(this, 163, 88, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 163, 67, textureX, textureY); // Box 106
		bodyModel[73] = new ModelRendererTurbo(this, 163, 76, textureX, textureY); // Box 106
		bodyModel[74] = new ModelRendererTurbo(this, 163, 73, textureX, textureY); // Box 106
		bodyModel[75] = new ModelRendererTurbo(this, 163, 82, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 163, 79, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 163, 85, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 106
		bodyModel[80] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 106
		bodyModel[82] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 1, 85, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 91, 70, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 91, 88, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 91, 67, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 91, 76, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 91, 73, textureX, textureY); // Box 106
		bodyModel[91] = new ModelRendererTurbo(this, 91, 82, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 91, 79, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 91, 85, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 202, 70, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 202, 88, textureX, textureY); // Box 106
		bodyModel[96] = new ModelRendererTurbo(this, 202, 67, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 202, 76, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 202, 73, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 106
		bodyModel[100] = new ModelRendererTurbo(this, 202, 79, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 202, 85, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 112, 70, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 112, 88, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 112, 67, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 112, 76, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 112, 73, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 112, 82, textureX, textureY); // Box 106
		bodyModel[108] = new ModelRendererTurbo(this, 112, 79, textureX, textureY); // Box 106
		bodyModel[109] = new ModelRendererTurbo(this, 112, 85, textureX, textureY); // Box 106

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 58, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-29F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(-29F, -18F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(5F, -18F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 8
		bodyModel[4].setRotationPoint(-29F, -18F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 9
		bodyModel[5].setRotationPoint(28F, -18F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 62, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[6].setRotationPoint(-31F, -20F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 58, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[7].setRotationPoint(-29F, 3F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[8].setRotationPoint(-20F, 2.8F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[9].setRotationPoint(-20F, 2.8F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[10].setRotationPoint(18F, 2.8F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[11].setRotationPoint(18F, 2.8F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[12].setRotationPoint(-29.51F, -19F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[13].setRotationPoint(-5.5F, -16F, -11.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[14].setRotationPoint(-29.5F, -18F, 3F);

		bodyModel[15].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 104
		bodyModel[15].setRotationPoint(5F, -18F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 105
		bodyModel[16].setRotationPoint(-29F, -18F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[17].setRotationPoint(-15.5F, -17F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[18].setRotationPoint(-5.5F, -16F, 10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[19].setRotationPoint(29F, 3F, -1.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Box 0
		bodyModel[20].setRotationPoint(-29F, 3F, -2.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[21].setRotationPoint(-32F, 3F, -1.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[22].setRotationPoint(18F, 5F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 58, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(-29F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[24].setRotationPoint(-15.5F, 2F, 10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[25].setRotationPoint(-5.5F, -17F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[26].setRotationPoint(-5.5F, 2F, -11.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-29F, 3F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(-29F, 3F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(25F, 3F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(25F, 3F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[31].setRotationPoint(28.5F, -7F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[32].setRotationPoint(24.99F, -7F, 10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[33].setRotationPoint(28.5F, -17F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[34].setRotationPoint(-29.5F, -17F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[35].setRotationPoint(-29.5F, -7F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[36].setRotationPoint(-28.99F, -17F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[37].setRotationPoint(24.99F, -17F, -11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[38].setRotationPoint(-28.99F, -7F, -11.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 58, 2, 11, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-29F, -20F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 58, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[40].setRotationPoint(-29F, -20F, 0F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 3
		bodyModel[41].setRotationPoint(-5F, -18F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 3
		bodyModel[42].setRotationPoint(-5F, -18F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 87
		bodyModel[43].setRotationPoint(-30.5F, -14F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(-10F, 4F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 20, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[45].setRotationPoint(-10F, 4F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[46].setRotationPoint(6F, -14.25F, 10.2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[47].setRotationPoint(6F, 0.75F, 10.2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[48].setRotationPoint(6F, -16.75F, 10.2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[49].setRotationPoint(6F, -9.25F, 10.2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[50].setRotationPoint(6F, -11.75F, 10.2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[51].setRotationPoint(6F, -4.25F, 10.2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[52].setRotationPoint(6F, -6.75F, 10.2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[53].setRotationPoint(6F, -1.75F, 10.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[54].setRotationPoint(-24F, -14.25F, 10.2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[55].setRotationPoint(-24F, 0.75F, 10.2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[56].setRotationPoint(-24F, -16.75F, 10.2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[57].setRotationPoint(-24F, -9.25F, 10.2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[58].setRotationPoint(-24F, -11.75F, 10.2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[59].setRotationPoint(-24F, -4.25F, 10.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[60].setRotationPoint(-24F, -6.75F, 10.2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[61].setRotationPoint(-24F, -1.75F, 10.2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[62].setRotationPoint(6F, -14.25F, -11.2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[63].setRotationPoint(6F, 0.75F, -11.2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[64].setRotationPoint(6F, -16.75F, -11.2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[65].setRotationPoint(6F, -9.25F, -11.2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[66].setRotationPoint(6F, -11.75F, -11.2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[67].setRotationPoint(6F, -4.25F, -11.2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[68].setRotationPoint(6F, -6.75F, -11.2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[69].setRotationPoint(6F, -1.75F, -11.2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[70].setRotationPoint(-24F, -14.25F, -11.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[71].setRotationPoint(-24F, 0.75F, -11.2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[72].setRotationPoint(-24F, -16.75F, -11.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[73].setRotationPoint(-24F, -9.25F, -11.2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[74].setRotationPoint(-24F, -11.75F, -11.2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[75].setRotationPoint(-24F, -4.25F, -11.2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[76].setRotationPoint(-24F, -6.75F, -11.2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[77].setRotationPoint(-24F, -1.75F, -11.2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[78].setRotationPoint(24F, -14.25F, 10.2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[79].setRotationPoint(24F, 0.75F, 10.2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[80].setRotationPoint(24F, -16.75F, 10.2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[81].setRotationPoint(24F, -9.25F, 10.2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[82].setRotationPoint(24F, -11.75F, 10.2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(24F, -4.25F, 10.2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(24F, -6.75F, 10.2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[85].setRotationPoint(24F, -1.75F, 10.2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[86].setRotationPoint(-28F, -14.25F, 10.2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[87].setRotationPoint(-28F, 0.75F, 10.2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[88].setRotationPoint(-28F, -16.75F, 10.2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-28F, -9.25F, 10.2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[90].setRotationPoint(-28F, -11.75F, 10.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[91].setRotationPoint(-28F, -4.25F, 10.2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[92].setRotationPoint(-28F, -6.75F, 10.2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[93].setRotationPoint(-28F, -1.75F, 10.2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[94].setRotationPoint(-28F, -14.25F, -11.2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[95].setRotationPoint(-28F, 0.75F, -11.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[96].setRotationPoint(-28F, -16.75F, -11.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[97].setRotationPoint(-28F, -9.25F, -11.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[98].setRotationPoint(-28F, -11.75F, -11.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[99].setRotationPoint(-28F, -4.25F, -11.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[100].setRotationPoint(-28F, -6.75F, -11.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[101].setRotationPoint(-28F, -1.75F, -11.2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[102].setRotationPoint(24F, -14.25F, -11.2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[103].setRotationPoint(24F, 0.75F, -11.2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[104].setRotationPoint(24F, -16.75F, -11.2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[105].setRotationPoint(24F, -9.25F, -11.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[106].setRotationPoint(24F, -11.75F, -11.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[107].setRotationPoint(24F, -4.25F, -11.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[108].setRotationPoint(24F, -6.75F, -11.2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
		bodyModel[109].setRotationPoint(24F, -1.75F, -11.2F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 110; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.31F,0.55,-0.375);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.375F,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.18,-0.05,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.37,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelMILW40boxcar[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}