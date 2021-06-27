//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.05.2019 - 23:05:46
// Last changed on: 03.05.2019 - 23:05:46

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRibbedHopper extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRibbedHopper() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[110];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 35
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[11] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 39
		bodyModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 45
		bodyModel[16] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 49
		bodyModel[20] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 51
		bodyModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 53
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 54
		bodyModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		bodyModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 57
		bodyModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 80
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 81
		bodyModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 89
		bodyModel[34] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 55
		bodyModel[38] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 62
		bodyModel[41] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 64
		bodyModel[43] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 65
		bodyModel[44] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 66
		bodyModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 69
		bodyModel[48] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 72
		bodyModel[51] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 74
		bodyModel[53] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
		bodyModel[55] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 77
		bodyModel[56] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 88
		bodyModel[67] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 89
		bodyModel[68] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 77
		bodyModel[70] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 78
		bodyModel[71] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 79
		bodyModel[72] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 81
		bodyModel[74] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 82
		bodyModel[75] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 83
		bodyModel[76] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 0 truck mount
		bodyModel[77] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 0 truck mount
		bodyModel[78] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 84
		bodyModel[80] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 85
		bodyModel[81] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 92
		bodyModel[88] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 95
		bodyModel[91] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 97
		bodyModel[93] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 98
		bodyModel[94] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 109

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, 2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-35F, -2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // Box 3
		bodyModel[2].setRotationPoint(-35F, -2F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 4
		bodyModel[3].setRotationPoint(36F, 2F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-31F, -1F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(29F, -1F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 27
		bodyModel[6].setRotationPoint(-38F, 1F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 28
		bodyModel[7].setRotationPoint(31F, 1F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 62, 19, 22, 0F); // Box 34
		bodyModel[8].setRotationPoint(-31F, -21F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[9].setRotationPoint(-38F, -22F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[10].setRotationPoint(-38F, -17F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 37
		bodyModel[11].setRotationPoint(31F, -17F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 38
		bodyModel[12].setRotationPoint(-38F, -21F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 39
		bodyModel[13].setRotationPoint(31F, -21F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[14].setRotationPoint(35F, -21F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 76, 1, 18, 0F); // Box 45
		bodyModel[15].setRotationPoint(-38F, -22F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 76, 0, 4, 0F); // Box 46
		bodyModel[16].setRotationPoint(-38F, -23.1F, 4F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 47
		bodyModel[17].setRotationPoint(-40F, -23.1F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 48
		bodyModel[18].setRotationPoint(38F, -23.1F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 76, 0, 4, 0F); // Box 49
		bodyModel[19].setRotationPoint(-38F, -23.1F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 50
		bodyModel[20].setRotationPoint(-38F, -23.1F, -4F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 51
		bodyModel[21].setRotationPoint(34F, -23.1F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 64, 1, 8, 0F); // Box 53
		bodyModel[22].setRotationPoint(-32F, -24F, -4F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 26, 4, 0F); // Box 54
		bodyModel[23].setRotationPoint(-39F, -23F, 4F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 55
		bodyModel[24].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 56
		bodyModel[25].setRotationPoint(36F, 3F, -1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 26, 4, 0F); // Box 57
		bodyModel[26].setRotationPoint(38F, -23F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 80
		bodyModel[27].setRotationPoint(-35F, -21F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 81
		bodyModel[28].setRotationPoint(-35F, -12F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[29].setRotationPoint(31F, -12F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 85
		bodyModel[30].setRotationPoint(31F, -21F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[31].setRotationPoint(31F, -12F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 88
		bodyModel[32].setRotationPoint(31F, -21F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 89
		bodyModel[33].setRotationPoint(-35F, -21F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
		bodyModel[34].setRotationPoint(-35F, -12F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 62, 1, 16, 0F); // Box 48
		bodyModel[35].setRotationPoint(-31F, -2F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 51
		bodyModel[36].setRotationPoint(-28F, -1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[37].setRotationPoint(-24F, -1F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[38].setRotationPoint(-3F, -1F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[39].setRotationPoint(18F, -1F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 62
		bodyModel[40].setRotationPoint(-29F, -1F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[41].setRotationPoint(-11F, -1F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[42].setRotationPoint(10F, -1F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 65
		bodyModel[43].setRotationPoint(10F, -1F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 66
		bodyModel[44].setRotationPoint(-11F, -1F, 3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 67
		bodyModel[45].setRotationPoint(-33F, -6F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[46].setRotationPoint(-32F, -6F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[47].setRotationPoint(-34F, -6F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 70
		bodyModel[48].setRotationPoint(-33F, -5F, 3.99F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 71
		bodyModel[49].setRotationPoint(-33F, -5F, 9.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 72
		bodyModel[50].setRotationPoint(-38F, -16F, -5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 73
		bodyModel[51].setRotationPoint(-38F, -16F, 4F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 74
		bodyModel[52].setRotationPoint(37F, -16F, 4F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 75
		bodyModel[53].setRotationPoint(37F, -16F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 76
		bodyModel[54].setRotationPoint(-38.5F, -4.5F, -5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 77
		bodyModel[55].setRotationPoint(-38.52F, -6F, -7F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 78
		bodyModel[56].setRotationPoint(-30.5F, -21F, -11.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 79
		bodyModel[57].setRotationPoint(-25.5F, -21F, -11.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 80
		bodyModel[58].setRotationPoint(29.5F, -21F, -11.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 81
		bodyModel[59].setRotationPoint(24.5F, -21F, -11.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 82
		bodyModel[60].setRotationPoint(-20.5F, -21F, -11.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 83
		bodyModel[61].setRotationPoint(19.5F, -21F, -11.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 84
		bodyModel[62].setRotationPoint(14.5F, -21F, -11.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 85
		bodyModel[63].setRotationPoint(-15.5F, -21F, -11.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 86
		bodyModel[64].setRotationPoint(-10.5F, -21F, -11.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 87
		bodyModel[65].setRotationPoint(9.5F, -21F, -11.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 88
		bodyModel[66].setRotationPoint(4.5F, -21F, -11.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 89
		bodyModel[67].setRotationPoint(-5.5F, -21F, -11.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 90
		bodyModel[68].setRotationPoint(-0.5F, -21F, -11.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[69].setRotationPoint(-38F, -22F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[70].setRotationPoint(-38F, -23F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[71].setRotationPoint(-38F, -23F, 5F);

		bodyModel[72].addBox(0F, 0F, 0F, 76, 1, 10, 0F); // Box 80
		bodyModel[72].setRotationPoint(-38F, -23F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[73].setRotationPoint(35F, -21F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[74].setRotationPoint(-38F, -21F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[75].setRotationPoint(-38F, -21F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0 truck mount
		bodyModel[76].setRotationPoint(-33F, 2F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0 truck mount
		bodyModel[77].setRotationPoint(31F, 2F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[78].setRotationPoint(-24F, -1F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[79].setRotationPoint(-18F, -1F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 85
		bodyModel[80].setRotationPoint(-18F, -1F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 86
		bodyModel[81].setRotationPoint(-28F, -1F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 87
		bodyModel[82].setRotationPoint(-24F, -1F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 88
		bodyModel[83].setRotationPoint(-3F, -1F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 89
		bodyModel[84].setRotationPoint(3F, -1F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 90
		bodyModel[85].setRotationPoint(-7F, -1F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
		bodyModel[86].setRotationPoint(-7F, -1F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[87].setRotationPoint(-3F, -1F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[88].setRotationPoint(3F, -1F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 94
		bodyModel[89].setRotationPoint(18F, -1F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 95
		bodyModel[90].setRotationPoint(24F, -1F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 96
		bodyModel[91].setRotationPoint(14F, -1F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 97
		bodyModel[92].setRotationPoint(14F, -1F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[93].setRotationPoint(18F, -1F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[94].setRotationPoint(24F, -1F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 50, 6, 6, 0F); // Box 95
		bodyModel[95].setRotationPoint(-25F, -1F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[96].setRotationPoint(25F, -1F, -3F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 97
		bodyModel[97].setRotationPoint(-0.5F, -21F, 10.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 98
		bodyModel[98].setRotationPoint(29.5F, -21F, 10.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 99
		bodyModel[99].setRotationPoint(24.5F, -21F, 10.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 100
		bodyModel[100].setRotationPoint(19.5F, -21F, 10.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 101
		bodyModel[101].setRotationPoint(14.5F, -21F, 10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 102
		bodyModel[102].setRotationPoint(9.5F, -21F, 10.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 103
		bodyModel[103].setRotationPoint(4.5F, -21F, 10.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 104
		bodyModel[104].setRotationPoint(-5.5F, -21F, 10.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 105
		bodyModel[105].setRotationPoint(-10.5F, -21F, 10.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 106
		bodyModel[106].setRotationPoint(-15.5F, -21F, 10.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 107
		bodyModel[107].setRotationPoint(-20.5F, -21F, 10.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 108
		bodyModel[108].setRotationPoint(-25.5F, -21F, 10.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 109
		bodyModel[109].setRotationPoint(-30.5F, -21F, 10.5F);
	}
	/*ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 109; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-2.05,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}*/
	Model70Truck bogie = new Model70Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 109; i++) {
			if (i == 9999) { //36 37 38 39 40 41 42 43 44

			} else
				bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-2.13,0.5,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.0,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}