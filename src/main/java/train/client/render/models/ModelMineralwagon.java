package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelMineralwagon extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMineralwagon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 46
		bodyModel[5] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 70
		bodyModel[7] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[8] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 105
		bodyModel[9] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 106
		bodyModel[10] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 107
		bodyModel[11] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 108
		bodyModel[12] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 109
		bodyModel[13] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 110
		bodyModel[14] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 121
		bodyModel[15] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 122
		bodyModel[16] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 124
		bodyModel[18] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 125
		bodyModel[19] = new ModelRendererTurbo(this, 304, 17, textureX, textureY); // Box 126
		bodyModel[20] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[21] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[24] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[25] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[28] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[29] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[30] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[32] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[33] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[34] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[36] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[37] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[40] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[42] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[44] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[47] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[48] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[50] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[51] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[52] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[53] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[58] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[64] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[68] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[69] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 123
		bodyModel[70] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[72] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[73] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[74] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[76] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[78] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 121
		bodyModel[79] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[80] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[82] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[83] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[84] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[85] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[86] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[87] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[88] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 127
		bodyModel[89] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[90] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[91] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[92] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[94] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[95] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[96] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[97] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[98] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[99] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[100] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[101] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[102] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 106
		bodyModel[108] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 106
		bodyModel[109] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 106
		bodyModel[110] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		bodyModel[114] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 106
		bodyModel[115] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 106
		bodyModel[116] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		bodyModel[117] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 106
		bodyModel[118] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 106
		bodyModel[119] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 106
		bodyModel[120] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 106
		bodyModel[121] = new ModelRendererTurbo(this, 59, 52, textureX, textureY); // Box 106
		bodyModel[122] = new ModelRendererTurbo(this, 59, 52, textureX, textureY); // Box 106
		bodyModel[123] = new ModelRendererTurbo(this, 92, 51, textureX, textureY); // Box 106
		bodyModel[124] = new ModelRendererTurbo(this, 258, 134, textureX, textureY); // Box 106
		bodyModel[125] = new ModelRendererTurbo(this, 92, 51, textureX, textureY); // Box 106
		bodyModel[126] = new ModelRendererTurbo(this, 183, 68, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 195, 68, textureX, textureY); // Box 1
		bodyModel[128] = new ModelRendererTurbo(this, 183, 68, textureX, textureY); // Box 1
		bodyModel[129] = new ModelRendererTurbo(this, 193, 68, textureX, textureY); // Box 1
		bodyModel[130] = new ModelRendererTurbo(this, 183, 68, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 193, 68, textureX, textureY); // Box 1
		bodyModel[132] = new ModelRendererTurbo(this, 182, 68, textureX, textureY); // Box 1
		bodyModel[133] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[134] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[135] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[136] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[137] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[138] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[139] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[140] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[141] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[142] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[143] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[144] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[145] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[146] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[147] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[148] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[149] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[150] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[151] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[152] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[153] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[154] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[155] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[156] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[157] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[158] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[159] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[160] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[161] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-21F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 14
		bodyModel[1].setRotationPoint(-20F, -11F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 27
		bodyModel[2].setRotationPoint(-20F, -11F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 40
		bodyModel[3].setRotationPoint(6F, -11F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 11, 1, 0F); // Box 46
		bodyModel[4].setRotationPoint(6F, -11F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 10, 11, 1, 0F); // Box 63
		bodyModel[5].setRotationPoint(-5F, -11F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 11, 1, 0F); // Box 70
		bodyModel[6].setRotationPoint(-5F, -11F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[7].setRotationPoint(-21F, -11F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[8].setRotationPoint(-14F, 5F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[9].setRotationPoint(12F, 5F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 107
		bodyModel[10].setRotationPoint(-18F, 1F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 108
		bodyModel[11].setRotationPoint(-18F, 1F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 109
		bodyModel[12].setRotationPoint(8F, 1F, 6F);

		bodyModel[13].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 110
		bodyModel[13].setRotationPoint(8F, 1F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		bodyModel[14].setRotationPoint(-22F, 0F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 122
		bodyModel[15].setRotationPoint(-23F, 1F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[16].setRotationPoint(-24F, 0F, -1F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 124
		bodyModel[17].setRotationPoint(21F, 0F, -1F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 125
		bodyModel[18].setRotationPoint(23F, 0F, -1F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 126
		bodyModel[19].setRotationPoint(22F, 1F, -1F);

		bodyModel[20].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[20].setRotationPoint(-20F, -11F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[21].setRotationPoint(-24F, 0.5F, -6.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[22].setRotationPoint(-24F, 0.5F, -10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[23].setRotationPoint(-24F, -1.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[24].setRotationPoint(-24F, -1.5F, -10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[25].setRotationPoint(-24F, -1.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[26].setRotationPoint(-24F, 2.5F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[27].setRotationPoint(-24F, 2.5F, -6.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[28].setRotationPoint(-23F, 1F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[29].setRotationPoint(-23F, 1F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[30].setRotationPoint(-23F, 0F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[31].setRotationPoint(-23F, 0F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[32].setRotationPoint(-23F, 0F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[33].setRotationPoint(-23F, 2F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[34].setRotationPoint(-23F, 2F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[35].setRotationPoint(-24F, 0.5F, 8.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[36].setRotationPoint(-24F, 0.5F, 4.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[37].setRotationPoint(-24F, -1.5F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[38].setRotationPoint(-24F, -1.5F, 4.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[39].setRotationPoint(-24F, -1.5F, 8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[40].setRotationPoint(-24F, 2.5F, 4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[41].setRotationPoint(-24F, 2.5F, 8.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[42].setRotationPoint(-23F, 1F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[43].setRotationPoint(-23F, 1F, 6F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[44].setRotationPoint(-23F, 0F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[45].setRotationPoint(-23F, 0F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[46].setRotationPoint(-23F, 2F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[47].setRotationPoint(-23F, 2F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[48].setRotationPoint(-23F, 0F, 6F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[49].setRotationPoint(23F, 0.5F, -6.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[50].setRotationPoint(23F, 0.5F, -10.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[51].setRotationPoint(23F, -1.5F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[52].setRotationPoint(23F, -1.5F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[53].setRotationPoint(23F, -1.5F, -6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[54].setRotationPoint(23F, 2.5F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[55].setRotationPoint(23F, 2.5F, -6.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[56].setRotationPoint(21F, 1F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[57].setRotationPoint(21F, 1F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[58].setRotationPoint(21F, 0F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[59].setRotationPoint(21F, 0F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[60].setRotationPoint(21F, 0F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[61].setRotationPoint(21F, 2F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[62].setRotationPoint(21F, 2F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[63].setRotationPoint(23F, 0.5F, 8.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 123
		bodyModel[64].setRotationPoint(23F, 0.5F, 4.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 123
		bodyModel[65].setRotationPoint(23F, -1.5F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[66].setRotationPoint(23F, -1.5F, 4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[67].setRotationPoint(23F, -1.5F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[68].setRotationPoint(23F, 2.5F, 4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[69].setRotationPoint(23F, 2.5F, 8.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[70].setRotationPoint(21F, 1F, 8F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[71].setRotationPoint(21F, 1F, 6F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[72].setRotationPoint(21F, 0F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[73].setRotationPoint(21F, 0F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[74].setRotationPoint(21F, 2F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[75].setRotationPoint(21F, 2F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(21F, 0F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[77].setRotationPoint(-21F, 1F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[78].setRotationPoint(20F, 1F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[79].setRotationPoint(-20F, -10F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[80].setRotationPoint(-20F, -9F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[81].setRotationPoint(-20F, -8F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[82].setRotationPoint(-20F, -7F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[83].setRotationPoint(-20F, -6F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[84].setRotationPoint(-20F, -5F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[85].setRotationPoint(-20F, -4F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[86].setRotationPoint(-20F, -3F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[87].setRotationPoint(-20F, -2F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 40, 1, 20, 0F); // Box 127
		bodyModel[88].setRotationPoint(-20F, -1F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 40
		bodyModel[89].setRotationPoint(20F, -11F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 40
		bodyModel[90].setRotationPoint(-21F, -11F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[91].setRotationPoint(-6F, -11F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[92].setRotationPoint(5F, -11F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[93].setRotationPoint(-21F, -12F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[94].setRotationPoint(-21F, -11F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[95].setRotationPoint(-21F, -12F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[96].setRotationPoint(20F, -11F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[97].setRotationPoint(20F, -11F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[98].setRotationPoint(-6F, -11F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[99].setRotationPoint(5F, -11F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[100].setRotationPoint(-21F, -12F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[101].setRotationPoint(20F, -12F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[102].setRotationPoint(-7F, 1F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[103].setRotationPoint(-5F, 1F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[104].setRotationPoint(-9F, 1F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[105].setRotationPoint(-6F, 6F, 7F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[106].setRotationPoint(4F, 1F, 8F);

		bodyModel[107].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 106
		bodyModel[107].setRotationPoint(-14F, 6F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[108].setRotationPoint(6F, 1F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[109].setRotationPoint(6F, 3F, 8F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[110].setRotationPoint(-14.5F, 2F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[111].setRotationPoint(-14F, 2F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[112].setRotationPoint(-14F, 2F, -8F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[113].setRotationPoint(5F, 1F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[114].setRotationPoint(7F, 1F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[115].setRotationPoint(3F, 1F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[116].setRotationPoint(-13F, 6F, -8F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[117].setRotationPoint(-7F, 1F, -9F);

		bodyModel[118].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 106
		bodyModel[118].setRotationPoint(-7F, 6F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[119].setRotationPoint(-8F, 1F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 106
		bodyModel[120].setRotationPoint(-13F, 3F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 106
		bodyModel[121].setRotationPoint(-2F, -8F, -11.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 106
		bodyModel[122].setRotationPoint(-2F, -8F, 10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 106
		bodyModel[123].setRotationPoint(0F, -1F, -11.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 106
		bodyModel[124].setRotationPoint(-1F, 2F, -11.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[125].setRotationPoint(-9F, -1F, 10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[126].setRotationPoint(-4.5F, 1F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[127].setRotationPoint(-1.5F, 1F, -3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[128].setRotationPoint(0.5F, 1F, -3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[129].setRotationPoint(-4.5F, 1F, 1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[130].setRotationPoint(-1.5F, 1F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[131].setRotationPoint(0.5F, 1F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[132].setRotationPoint(-4.5F, 1F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[133].setRotationPoint(-20F, 1.75F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[134].setRotationPoint(-20F, 1F, -8F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[135].setRotationPoint(-14.5F, 4.5F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[136].setRotationPoint(-15F, 1.25F, -8.95F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[137].setRotationPoint(-14.5F, 1.5F, -8.95F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[138].setRotationPoint(-14F, 1.75F, -8.95F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[139].setRotationPoint(11.5F, 2F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[140].setRotationPoint(12F, 2F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[141].setRotationPoint(12F, 2F, -8F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[142].setRotationPoint(11.5F, 4.5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[143].setRotationPoint(11F, 1.25F, -8.95F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[144].setRotationPoint(11.5F, 1.5F, -8.95F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[145].setRotationPoint(12F, 1.75F, -8.95F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[146].setRotationPoint(-14.5F, 2F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[147].setRotationPoint(-14F, 2F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[148].setRotationPoint(-14F, 2F, 7F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[149].setRotationPoint(-14.5F, 4.5F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[150].setRotationPoint(-15F, 1.25F, 7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[151].setRotationPoint(-14.5F, 1.5F, 7.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[152].setRotationPoint(-14F, 1.75F, 7.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[153].setRotationPoint(11.5F, 2F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[154].setRotationPoint(12F, 2F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[155].setRotationPoint(12F, 2F, 7F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[156].setRotationPoint(11.5F, 4.5F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[157].setRotationPoint(11F, 1.25F, 7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[158].setRotationPoint(11.5F, 1.5F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[159].setRotationPoint(12F, 1.75F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[160].setRotationPoint(-20F, 1.75F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[161].setRotationPoint(-20F, 1F, 7F);
	}
}