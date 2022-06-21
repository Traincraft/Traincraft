//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.07.2021 - 08:46:22
// Last changed on: 03.07.2021 - 08:46:22

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTrimountTrucc extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelTrimountTrucc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[110];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 82, 34, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 82, 56, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 82, 79, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 80, 102, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 93, 33, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 63, 95, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 49, 90, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 110, 34, textureX, textureY); // Box 107
		bodyModel[20] = new ModelRendererTurbo(this, 58, 77, textureX, textureY); // Box 108
		bodyModel[21] = new ModelRendererTurbo(this, 85, 33, textureX, textureY); // Box 109
		bodyModel[22] = new ModelRendererTurbo(this, 82, 56, textureX, textureY); // Box 110
		bodyModel[23] = new ModelRendererTurbo(this, 50, 107, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 51, 114, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 32, 99, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 106, 47, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 52, 97, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 59, 90, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 118, 89, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 68, 77, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 4, 92, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 39, 113, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 92, 39, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 117, 46, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 7, 84, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 439
		bodyModel[37] = new ModelRendererTurbo(this, 77, 89, textureX, textureY); // Box 440
		bodyModel[38] = new ModelRendererTurbo(this, 115, 68, textureX, textureY); // Box 551
		bodyModel[39] = new ModelRendererTurbo(this, 16, 113, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 50, 113, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 88, 111, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 22, 99, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 86, 80, textureX, textureY); // Box 367
		bodyModel[44] = new ModelRendererTurbo(this, 10, 106, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 70, 89, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 70, 83, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 120, 34, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 116, 116, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 56, 102, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 80, 80, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 76, 74, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 18, 91, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 35, 83, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 80, 106, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 12, 91, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 29, 83, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 24, 92, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 30, 92, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 36, 92, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 58, 84, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 106, 81, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 74, 62, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 42, 98, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 2, 114, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 2, 98, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 77
		bodyModel[67] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 18, 116, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 68, 102, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 85, 90, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 75, 67, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 91, 67, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 83, 67, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 49, 82, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 12, 99, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 106, 39, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 16, 106, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 22, 105, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 87, 45, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 93, 45, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 111, 88, textureX, textureY); // Box 93
		bodyModel[83] = new ModelRendererTurbo(this, 105, 88, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 68, 107, textureX, textureY); // Box 95
		bodyModel[85] = new ModelRendererTurbo(this, 58, 107, textureX, textureY); // Box 96
		bodyModel[86] = new ModelRendererTurbo(this, 84, 62, textureX, textureY); // Box 97
		bodyModel[87] = new ModelRendererTurbo(this, 41, 83, textureX, textureY); // Box 79
		bodyModel[88] = new ModelRendererTurbo(this, 78, 110, textureX, textureY); // Box 81
		bodyModel[89] = new ModelRendererTurbo(this, 12, 84, textureX, textureY); // Box 82
		bodyModel[90] = new ModelRendererTurbo(this, 39, 112, textureX, textureY); // Box 101
		bodyModel[91] = new ModelRendererTurbo(this, 18, 83, textureX, textureY); // Box 102
		bodyModel[92] = new ModelRendererTurbo(this, 23, 83, textureX, textureY); // Box 103
		bodyModel[93] = new ModelRendererTurbo(this, 30, 106, textureX, textureY); // Box 104
		bodyModel[94] = new ModelRendererTurbo(this, 40, 106, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 61, 70, textureX, textureY); // Box 442
		bodyModel[96] = new ModelRendererTurbo(this, 114, 60, textureX, textureY); // Box 60
		bodyModel[97] = new ModelRendererTurbo(this, 61, 70, textureX, textureY); // Box 110
		bodyModel[98] = new ModelRendererTurbo(this, 114, 64, textureX, textureY); // Box 111
		bodyModel[99] = new ModelRendererTurbo(this, 107, 56, textureX, textureY); // Box 112
		bodyModel[100] = new ModelRendererTurbo(this, 42, 92, textureX, textureY); // Box 113
		bodyModel[101] = new ModelRendererTurbo(this, 77, 93, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 115, 40, textureX, textureY); // Box 115
		bodyModel[103] = new ModelRendererTurbo(this, 115, 40, textureX, textureY); // Box 116
		bodyModel[104] = new ModelRendererTurbo(this, 115, 40, textureX, textureY); // Box 117
		bodyModel[105] = new ModelRendererTurbo(this, 115, 40, textureX, textureY); // Box 118
		bodyModel[106] = new ModelRendererTurbo(this, 105, 69, textureX, textureY); // Box 119
		bodyModel[107] = new ModelRendererTurbo(this, 105, 60, textureX, textureY); // Box 120
		bodyModel[108] = new ModelRendererTurbo(this, 105, 63, textureX, textureY); // Box 121
		bodyModel[109] = new ModelRendererTurbo(this, 105, 66, textureX, textureY); // Box 122

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-9F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(-1F, 7F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-10F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-9F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(-1F, 7F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(-2F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(8F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(9F, 7F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(9F, 7F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[9].setRotationPoint(-10F, 6F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-2F, 6F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[11].setRotationPoint(8F, 6F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[12].setRotationPoint(-2F, 6F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[13].setRotationPoint(-10F, 6F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[14].setRotationPoint(8F, 6F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-10F, 4.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 66
		bodyModel[16].setRotationPoint(7F, 5.5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[17].setRotationPoint(10F, 5.5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 25
		bodyModel[18].setRotationPoint(11.5F, 4.25F, 4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[19].setRotationPoint(8F, 4.5F, 6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 108
		bodyModel[20].setRotationPoint(6.5F, 5.5F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[21].setRotationPoint(6.5F, 6.5F, 6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[22].setRotationPoint(2.5F, 7F, 6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(7F, 4.5F, 6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(7.5F, 5.5F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 32
		bodyModel[25].setRotationPoint(8F, 5.5F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-1F, 4.5F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 36
		bodyModel[27].setRotationPoint(-2F, 5.5F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[28].setRotationPoint(-3F, 4.5F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-7.5F, 5.5F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-10F, 4.5F, 6.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-8F, 4.5F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-8.5F, 5.5F, 6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[33].setRotationPoint(-7.5F, 6.5F, 6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-6.5F, 7F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(-11F, 4.5F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 439
		bodyModel[36].setRotationPoint(-4F, 3.75F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 440
		bodyModel[37].setRotationPoint(1F, 3.75F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		bodyModel[38].setRotationPoint(-3F, 3.75F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 51
		bodyModel[39].setRotationPoint(-11F, 4.5F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // Box 52
		bodyModel[40].setRotationPoint(3F, 4.5F, -5F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 6, 10, 0F); // Box 53
		bodyModel[41].setRotationPoint(-5F, 3.5F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 53
		bodyModel[42].setRotationPoint(-10F, 5.5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 367
		bodyModel[43].setRotationPoint(5.5F, 5.5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[44].setRotationPoint(0F, 5.5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 56
		bodyModel[45].setRotationPoint(-3F, 5.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[46].setRotationPoint(-8F, 5.5F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 58
		bodyModel[47].setRotationPoint(-11F, 5.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[48].setRotationPoint(0.5F, 5F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2F, 0F, -1F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F); // Box 60
		bodyModel[49].setRotationPoint(-5.5F, 5F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 61
		bodyModel[50].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		bodyModel[51].setRotationPoint(-11F, 7.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[52].setRotationPoint(-12F, 6.5F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[53].setRotationPoint(11F, 4.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[54].setRotationPoint(-10F, 4.5F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 66
		bodyModel[55].setRotationPoint(-11F, 5.5F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[56].setRotationPoint(-11F, 4.5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 68
		bodyModel[57].setRotationPoint(-11F, 7.5F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 69
		bodyModel[58].setRotationPoint(-12F, 6.5F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[59].setRotationPoint(11F, 4.5F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 71
		bodyModel[60].setRotationPoint(11.5F, 4.25F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[61].setRotationPoint(0.5F, 5F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[62].setRotationPoint(-1F, 4.5F, -8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[63].setRotationPoint(-3F, 4.5F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2F, 0F, -1F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F); // Box 75
		bodyModel[64].setRotationPoint(-5.5F, 5F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[65].setRotationPoint(-6.5F, 7F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[66].setRotationPoint(-7.5F, 6.5F, -8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[67].setRotationPoint(-7.5F, 5.5F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[68].setRotationPoint(-8F, 4.5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[69].setRotationPoint(-10F, 4.5F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[70].setRotationPoint(2.5F, 7F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[71].setRotationPoint(6.5F, 6.5F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 83
		bodyModel[72].setRotationPoint(6.5F, 5.5F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[73].setRotationPoint(7.5F, 5.5F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 85
		bodyModel[74].setRotationPoint(7F, 4.5F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[75].setRotationPoint(8F, 4.5F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[76].setRotationPoint(-8.5F, 5.5F, -8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[77].setRotationPoint(-8F, 5.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[78].setRotationPoint(-3F, 5.5F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[79].setRotationPoint(0F, 5.5F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 91
		bodyModel[80].setRotationPoint(7F, 5.5F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[81].setRotationPoint(10F, 5.5F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 93
		bodyModel[82].setRotationPoint(5.5F, 5.5F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 94
		bodyModel[83].setRotationPoint(-6.5F, 5.5F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 95
		bodyModel[84].setRotationPoint(-2F, 5.5F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 96
		bodyModel[85].setRotationPoint(8F, 5.5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 97
		bodyModel[86].setRotationPoint(-10F, 5.5F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[87].setRotationPoint(11.5F, 4.5F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[88].setRotationPoint(11.5F, 5.5F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[89].setRotationPoint(11.5F, 4.5F, -4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 101
		bodyModel[90].setRotationPoint(-12.5F, 7.5F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[91].setRotationPoint(-12.5F, 6.5F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[92].setRotationPoint(-12.5F, 6.5F, 3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[93].setRotationPoint(-12.5F, 6.5F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(-12.5F, 6.5F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 442
		bodyModel[95].setRotationPoint(4F, 3.5F, 8.5F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[96].setRotationPoint(3F, 4.5F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 110
		bodyModel[97].setRotationPoint(4F, 3.5F, -8.5F);
		bodyModel[97].rotateAngleX = -0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[98].setRotationPoint(3F, 4.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[99].setRotationPoint(-3F, 3.75F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[100].setRotationPoint(-4F, 3.75F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[101].setRotationPoint(1F, 3.75F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 115
		bodyModel[102].setRotationPoint(10F, 3.5F, -8.5F);
		bodyModel[102].rotateAngleX = -0.78539816F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 116
		bodyModel[103].setRotationPoint(10F, 3.5F, 8.5F);
		bodyModel[103].rotateAngleX = -0.78539816F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[104].setRotationPoint(-12F, 3.5F, 8.5F);
		bodyModel[104].rotateAngleX = -0.78539816F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 118
		bodyModel[105].setRotationPoint(-12F, 3.5F, -8.5F);
		bodyModel[105].rotateAngleX = -0.78539816F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[106].setRotationPoint(7F, 4.5F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 120
		bodyModel[107].setRotationPoint(7F, 4.5F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[108].setRotationPoint(-10F, 4.5F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[109].setRotationPoint(-10F, 4.5F, -9F);
	}
}