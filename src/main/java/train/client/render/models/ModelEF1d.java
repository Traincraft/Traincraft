//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EF-1 truck
// Model Creator: 
// Created on: 26.10.2020 - 13:23:13
// Last changed on: 26.10.2020 - 13:23:13

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelEF1d extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelEF1d() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[100];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 16, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1
		bodyModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 1
		bodyModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 99
		bodyModel[18] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 1
		bodyModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 1
		bodyModel[25] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 147
		bodyModel[27] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 148
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 150
		bodyModel[30] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 151
		bodyModel[31] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 152
		bodyModel[32] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 153
		bodyModel[33] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 154
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 155
		bodyModel[35] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 156
		bodyModel[36] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 157
		bodyModel[37] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 158
		bodyModel[38] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 159
		bodyModel[39] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 160
		bodyModel[40] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 161
		bodyModel[41] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 162
		bodyModel[42] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 163
		bodyModel[43] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 164
		bodyModel[44] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 165
		bodyModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 167
		bodyModel[47] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 168
		bodyModel[48] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 169
		bodyModel[49] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 170
		bodyModel[50] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 171
		bodyModel[51] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 184
		bodyModel[52] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 185
		bodyModel[53] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 187 wheel
		bodyModel[54] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 188 wheel
		bodyModel[55] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 191
		bodyModel[56] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 192
		bodyModel[57] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 193
		bodyModel[58] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 194
		bodyModel[59] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 195
		bodyModel[60] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 196
		bodyModel[61] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 197
		bodyModel[62] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 198
		bodyModel[63] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 199
		bodyModel[64] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 153
		bodyModel[65] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 202
		bodyModel[66] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 203
		bodyModel[67] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 204
		bodyModel[68] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 133
		bodyModel[69] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 134
		bodyModel[70] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 207
		bodyModel[71] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 208
		bodyModel[72] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 209
		bodyModel[73] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 210
		bodyModel[74] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 213
		bodyModel[75] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 214
		bodyModel[76] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 215
		bodyModel[77] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 216
		bodyModel[78] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 217
		bodyModel[79] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 218
		bodyModel[80] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 219
		bodyModel[81] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 220
		bodyModel[82] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 221
		bodyModel[83] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 222
		bodyModel[84] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 223
		bodyModel[85] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 224
		bodyModel[86] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 225
		bodyModel[87] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 226
		bodyModel[88] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 227
		bodyModel[89] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 228
		bodyModel[90] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 229
		bodyModel[91] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 230
		bodyModel[92] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 231
		bodyModel[93] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 232
		bodyModel[94] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 233
		bodyModel[95] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 427
		bodyModel[96] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 189 wheel
		bodyModel[97] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 190 wheel
		bodyModel[98] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 1
		bodyModel[99] = new ModelRendererTurbo(this, 85, 108, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(16F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 1
		bodyModel[1].setRotationPoint(15F, 1.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Box 1
		bodyModel[2].setRotationPoint(-14F, 3F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 1
		bodyModel[3].setRotationPoint(-9F, 7F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 1
		bodyModel[4].setRotationPoint(16F, 4F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1
		bodyModel[5].setRotationPoint(14F, 6F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 1
		bodyModel[6].setRotationPoint(-14F, 4F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1
		bodyModel[7].setRotationPoint(-14F, 6F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 1
		bodyModel[8].setRotationPoint(12F, 6F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[9].setRotationPoint(-11F, 6F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 1
		bodyModel[10].setRotationPoint(7F, 4F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 1
		bodyModel[11].setRotationPoint(-7F, 4F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 1
		bodyModel[12].setRotationPoint(-8F, 8F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 1
		bodyModel[13].setRotationPoint(6F, 8F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[14].setRotationPoint(-2.5F, 5F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 1
		bodyModel[15].setRotationPoint(-2.5F, 4.5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[16].setRotationPoint(1.5F, 4.5F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[17].setRotationPoint(4.5F, 5F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[18].setRotationPoint(8.5F, 1F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[19].setRotationPoint(4.5F, 1F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[20].setRotationPoint(4.5F, 0F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[21].setRotationPoint(-5.5F, 1F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[22].setRotationPoint(-9.5F, 1F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[23].setRotationPoint(-9.5F, 0F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bodyModel[24].setRotationPoint(11.5F, 4F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bodyModel[25].setRotationPoint(-9.5F, 4F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[26].setRotationPoint(6F, 8F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 148
		bodyModel[27].setRotationPoint(-8F, 8F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 149
		bodyModel[28].setRotationPoint(-9F, 7F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 150
		bodyModel[29].setRotationPoint(-7F, 4F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 151
		bodyModel[30].setRotationPoint(7F, 4F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
		bodyModel[31].setRotationPoint(12F, 6F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 153
		bodyModel[32].setRotationPoint(14F, 6F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 154
		bodyModel[33].setRotationPoint(16F, 4F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Box 155
		bodyModel[34].setRotationPoint(-14F, 3F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[35].setRotationPoint(-11F, 6F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 157
		bodyModel[36].setRotationPoint(-14F, 6F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 158
		bodyModel[37].setRotationPoint(-14F, 4F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[38].setRotationPoint(-9.5F, 1F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[39].setRotationPoint(-5.5F, 1F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[40].setRotationPoint(-9.5F, 0F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 162
		bodyModel[41].setRotationPoint(4.5F, 1F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[42].setRotationPoint(8.5F, 1F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[43].setRotationPoint(4.5F, 0F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 165
		bodyModel[44].setRotationPoint(8F, 1.5F, -9.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[45].setRotationPoint(4.5F, 5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[46].setRotationPoint(1.5F, 4.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 168
		bodyModel[47].setRotationPoint(-2.5F, 4.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[48].setRotationPoint(-2.5F, 5F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 170
		bodyModel[49].setRotationPoint(11.5F, 4F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 171
		bodyModel[50].setRotationPoint(-9.5F, 4F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 184
		bodyModel[51].setRotationPoint(-6.5F, 4.5F, -8.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 185
		bodyModel[52].setRotationPoint(7.5F, 4.5F, -8.5F);

		bodyModel[53].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 187 wheel
		bodyModel[53].setRotationPoint(-5.5F, 5.5F, -6F);

		bodyModel[54].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 188 wheel
		bodyModel[54].setRotationPoint(8.5F, 5.5F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[55].setRotationPoint(-6.5F, 5F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[56].setRotationPoint(7.5F, 5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[57].setRotationPoint(7.5F, 5F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[58].setRotationPoint(-6.5F, 5F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 195
		bodyModel[59].setRotationPoint(14.75F, 4F, -8.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 196
		bodyModel[60].setRotationPoint(-13.75F, 4F, -8.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 197
		bodyModel[61].setRotationPoint(-6F, 1.5F, -9.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 198
		bodyModel[62].setRotationPoint(8F, 1.5F, 8.25F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 199
		bodyModel[63].setRotationPoint(-6F, 1.5F, 8.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[64].setRotationPoint(4.5F, 0.5F, 8.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[65].setRotationPoint(11.5F, 0.5F, 8.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 203
		bodyModel[66].setRotationPoint(-2.5F, 0.5F, 8.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 204
		bodyModel[67].setRotationPoint(-9.5F, 0.5F, 8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		bodyModel[68].setRotationPoint(0.5F, 2F, 7.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[69].setRotationPoint(0.5F, 1F, 7.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[70].setRotationPoint(-0.5F, 1.5F, 7.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 208
		bodyModel[71].setRotationPoint(0.5F, 3.5F, 8.75F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 209
		bodyModel[72].setRotationPoint(-0.25F, 3.5F, 7.75F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 210
		bodyModel[73].setRotationPoint(2.25F, 3.5F, 7.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[74].setRotationPoint(4.5F, 0.5F, 7.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[75].setRotationPoint(11.5F, 0.5F, 7.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[76].setRotationPoint(-2.5F, 0.5F, 7.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[77].setRotationPoint(-9.5F, 0.5F, 7.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 217
		bodyModel[78].setRotationPoint(4.5F, 0.5F, -8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[79].setRotationPoint(4.5F, 0.5F, -9.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		bodyModel[80].setRotationPoint(11.5F, 0.5F, -9.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 220
		bodyModel[81].setRotationPoint(11.5F, 0.5F, -8.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 221
		bodyModel[82].setRotationPoint(-2.5F, 0.5F, -9.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 222
		bodyModel[83].setRotationPoint(-2.5F, 0.5F, -8.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		bodyModel[84].setRotationPoint(-9.5F, 0.5F, -9.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 224
		bodyModel[85].setRotationPoint(-9.5F, 0.5F, -8.25F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 225
		bodyModel[86].setRotationPoint(2.25F, 3.5F, -8.75F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 226
		bodyModel[87].setRotationPoint(-0.25F, 3.5F, -8.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 227
		bodyModel[88].setRotationPoint(0.5F, 3.5F, -9.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 228
		bodyModel[89].setRotationPoint(0.5F, 2F, -9.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[90].setRotationPoint(0.5F, 1F, -9.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[91].setRotationPoint(-0.5F, 1.5F, -8.75F);

		bodyModel[92].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 231
		bodyModel[92].setRotationPoint(-9F, 2F, -5F);

		bodyModel[93].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 232
		bodyModel[93].setRotationPoint(5F, 2F, -5F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 233
		bodyModel[94].setRotationPoint(-2F, 1F, -5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[95].setRotationPoint(-0.5F, 0.5F, -2F);

		bodyModel[96].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 189 wheel
		bodyModel[96].setRotationPoint(-5.5F, 5.5F, 6F);

		bodyModel[97].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 190 wheel
		bodyModel[97].setRotationPoint(8.5F, 5.5F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[98].setRotationPoint(15F, 1.5F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[99].setRotationPoint(15F, 1.5F, -8F);
	}
}