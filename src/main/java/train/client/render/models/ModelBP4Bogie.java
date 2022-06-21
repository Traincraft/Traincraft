package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBP4Bogie extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[105];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 66
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 96
		bodyModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 69
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 71
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
		bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 77
		bodyModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 79
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 81
		bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 116
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 117
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 122
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 123
		bodyModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 124
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 24
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 91
		bodyModel[29] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 92
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 95
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 95
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 98
		bodyModel[34] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 102
		bodyModel[35] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 103
		bodyModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 104
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 110
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 111
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 112
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 113
		bodyModel[41] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 114
		bodyModel[42] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 116
		bodyModel[43] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 117
		bodyModel[44] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 119
		bodyModel[45] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 121
		bodyModel[46] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 123
		bodyModel[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 124
		bodyModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 125
		bodyModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 126
		bodyModel[50] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 127
		bodyModel[51] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 129
		bodyModel[53] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 130
		bodyModel[54] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 144
		bodyModel[58] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 145
		bodyModel[59] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 146
		bodyModel[60] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 147
		bodyModel[61] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 148
		bodyModel[62] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 149
		bodyModel[63] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 150
		bodyModel[64] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 151
		bodyModel[65] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 152
		bodyModel[66] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 153
		bodyModel[67] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 154
		bodyModel[68] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 155
		bodyModel[69] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 156
		bodyModel[70] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 161
		bodyModel[71] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 162
		bodyModel[72] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 163
		bodyModel[73] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 164
		bodyModel[74] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 172
		bodyModel[75] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 173
		bodyModel[76] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 37
		bodyModel[77] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 66
		bodyModel[79] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 67
		bodyModel[80] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		bodyModel[81] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 37
		bodyModel[82] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 37
		bodyModel[83] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 37
		bodyModel[84] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 37
		bodyModel[85] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		bodyModel[86] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 109
		bodyModel[89] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 134
		bodyModel[90] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 135
		bodyModel[91] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 136
		bodyModel[92] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 137
		bodyModel[93] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 80
		bodyModel[94] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 25
		bodyModel[95] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 116
		bodyModel[97] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 110
		bodyModel[102] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 111
		bodyModel[103] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 112
		bodyModel[104] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 113

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 3F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 3F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[2].setRotationPoint(7F, 4F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[3].setRotationPoint(8F, 2F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[4].setRotationPoint(-3.5F, 1.5F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 1, 15, 0F); // Box 96
		bodyModel[5].setRotationPoint(-3F, 1.75F, -7.5F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[6].setRotationPoint(-7F, 4F, 6F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[7].setRotationPoint(-7F, 4F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bodyModel[8].setRotationPoint(7F, 4F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 63
		bodyModel[9].setRotationPoint(5.5F, 6.01F, -8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 69
		bodyModel[10].setRotationPoint(-8.5F, 6.01F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[11].setRotationPoint(-11.5F, 1F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 73
		bodyModel[12].setRotationPoint(-11.5F, 2F, -4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[13].setRotationPoint(-11.5F, 1F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 76
		bodyModel[14].setRotationPoint(-11.5F, 1F, 3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[15].setRotationPoint(10.5F, 1F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[16].setRotationPoint(10.5F, 1F, 3.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[17].setRotationPoint(10.5F, 2F, -4.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[18].setRotationPoint(10.5F, 1F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 116
		bodyModel[19].setRotationPoint(-11.5F, 1F, 4.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 117
		bodyModel[20].setRotationPoint(10.5F, 1F, 4.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 7, 3, 11, 0F); // Box 122
		bodyModel[21].setRotationPoint(-9F, 2.5F, -5.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 3, 11, 0F); // Box 123
		bodyModel[22].setRotationPoint(2F, 2.5F, -5.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[23].setRotationPoint(-2F, 1F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 3
		bodyModel[24].setRotationPoint(-10.5F, 1F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 24
		bodyModel[25].setRotationPoint(-3F, 0F, -8.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 27
		bodyModel[26].setRotationPoint(-2.5F, 2F, -8.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 89
		bodyModel[27].setRotationPoint(-8F, 2F, -8.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 91
		bodyModel[28].setRotationPoint(-10.5F, 5F, -7.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 92
		bodyModel[29].setRotationPoint(4F, 2F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[30].setRotationPoint(-3.5F, 4.5F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[31].setRotationPoint(2.5F, 1.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[32].setRotationPoint(2.5F, 4.5F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 98
		bodyModel[33].setRotationPoint(2.5F, 5F, -7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		bodyModel[34].setRotationPoint(-2.5F, 0.75F, -8.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
		bodyModel[35].setRotationPoint(1.5F, 0.75F, -8.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[36].setRotationPoint(-8F, 3F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[37].setRotationPoint(6F, 3F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[38].setRotationPoint(-10F, 0F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[39].setRotationPoint(4F, 0F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[40].setRotationPoint(-10F, 2F, -8.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 114
		bodyModel[41].setRotationPoint(-10.5F, 1F, 7.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 116
		bodyModel[42].setRotationPoint(-8F, 2F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[43].setRotationPoint(-10F, 2F, 7.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 119
		bodyModel[44].setRotationPoint(-2.5F, 2F, 7.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 121
		bodyModel[45].setRotationPoint(4F, 2F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[46].setRotationPoint(8F, 2F, 7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 124
		bodyModel[47].setRotationPoint(5.5F, 6.01F, 7.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 125
		bodyModel[48].setRotationPoint(-8.5F, 6.01F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[49].setRotationPoint(4F, 0F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[50].setRotationPoint(-3F, 0F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-10F, 0F, 7.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 129
		bodyModel[52].setRotationPoint(2.5F, 5F, 7.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 130
		bodyModel[53].setRotationPoint(-10.5F, 5F, 7.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 60
		bodyModel[54].setRotationPoint(4F, 0.5F, 8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 61
		bodyModel[55].setRotationPoint(3F, 0.5F, 5.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 62
		bodyModel[56].setRotationPoint(5.5F, 0.05F, 8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 144
		bodyModel[57].setRotationPoint(-4F, 0.5F, 5.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 145
		bodyModel[58].setRotationPoint(-6F, 0.5F, 8.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 146
		bodyModel[59].setRotationPoint(-7.5F, 0.05F, 8.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 147
		bodyModel[60].setRotationPoint(-6F, 0.5F, -9.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 148
		bodyModel[61].setRotationPoint(5.5F, 0.05F, -9.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 149
		bodyModel[62].setRotationPoint(4F, 0.5F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[63].setRotationPoint(3F, 0.5F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bodyModel[64].setRotationPoint(-4F, 0.5F, -9.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 152
		bodyModel[65].setRotationPoint(-7.5F, 0.05F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[66].setRotationPoint(2.5F, 1.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[67].setRotationPoint(2.5F, 4.5F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[68].setRotationPoint(-3.5F, 1.5F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 156
		bodyModel[69].setRotationPoint(-3.5F, 4.5F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[70].setRotationPoint(-2.5F, 0.75F, 7.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162
		bodyModel[71].setRotationPoint(1.5F, 0.75F, 7.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 163
		bodyModel[72].setRotationPoint(6.5F, 0.75F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 164
		bodyModel[73].setRotationPoint(6.5F, 0.75F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[74].setRotationPoint(6F, 3F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[75].setRotationPoint(-8F, 3F, 8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[76].setRotationPoint(-2F, 3F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[77].setRotationPoint(-2F, 4.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[78].setRotationPoint(-2F, 3F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[79].setRotationPoint(-2F, 4.5F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[80].setRotationPoint(-2F, 4.1F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[81].setRotationPoint(-2F, 3.4F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[82].setRotationPoint(-2F, 3.75F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[83].setRotationPoint(-2F, 4.1F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[84].setRotationPoint(-2F, 3.4F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[85].setRotationPoint(-2F, 3.75F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[86].setRotationPoint(-2.25F, 2.25F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bodyModel[87].setRotationPoint(-2.25F, 5.5F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 109
		bodyModel[88].setRotationPoint(-2.75F, 1F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 134
		bodyModel[89].setRotationPoint(1.25F, 1F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 135
		bodyModel[90].setRotationPoint(-2.25F, 5.5F, 8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 136
		bodyModel[91].setRotationPoint(1.25F, 1F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 137
		bodyModel[92].setRotationPoint(-2.75F, 1F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[93].setRotationPoint(-6F, 3F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[94].setRotationPoint(-4F, 2.5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-6F, 3F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 116
		bodyModel[96].setRotationPoint(2F, 2.5F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 105
		bodyModel[97].setRotationPoint(4F, 3F, -8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[98].setRotationPoint(4F, 3F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[99].setRotationPoint(4F, 3F, 7.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[100].setRotationPoint(4F, 3F, 7.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 110
		bodyModel[101].setRotationPoint(2F, 2.5F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[102].setRotationPoint(-4F, 2.5F, 7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[103].setRotationPoint(-6F, 3F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[104].setRotationPoint(-6F, 3F, 7.5F);
	}
}