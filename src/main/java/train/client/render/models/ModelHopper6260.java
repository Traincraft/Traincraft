//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.01.2021 - 11:28:11
// Last changed on: 31.01.2021 - 11:28:11

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelHopper6260 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHopper6260() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 107, 128, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 409, 219, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 43, 137, textureX, textureY); // Box 41
		bodyModel[8] = new ModelRendererTurbo(this, 381, 222, textureX, textureY); // Box 42
		bodyModel[9] = new ModelRendererTurbo(this, 67, 136, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 43, 129, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 67, 141, textureX, textureY); // Box 46
		bodyModel[12] = new ModelRendererTurbo(this, 43, 141, textureX, textureY); // Box 47
		bodyModel[13] = new ModelRendererTurbo(this, 43, 133, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 173
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 175
		bodyModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 176
		bodyModel[17] = new ModelRendererTurbo(this, 408, 196, textureX, textureY); // Box 178
		bodyModel[18] = new ModelRendererTurbo(this, 382, 200, textureX, textureY); // Box 180
		bodyModel[19] = new ModelRendererTurbo(this, 281, 130, textureX, textureY); // Box 184
		bodyModel[20] = new ModelRendererTurbo(this, 303, 220, textureX, textureY); // Box 188
		bodyModel[21] = new ModelRendererTurbo(this, 276, 89, textureX, textureY); // Box 190
		bodyModel[22] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 191
		bodyModel[23] = new ModelRendererTurbo(this, 298, 81, textureX, textureY); // Box 192
		bodyModel[24] = new ModelRendererTurbo(this, 292, 59, textureX, textureY); // Box 193
		bodyModel[25] = new ModelRendererTurbo(this, 294, 71, textureX, textureY); // Box 194
		bodyModel[26] = new ModelRendererTurbo(this, 294, 49, textureX, textureY); // Box 195
		bodyModel[27] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 196
		bodyModel[28] = new ModelRendererTurbo(this, 234, 101, textureX, textureY); // Box 197
		bodyModel[29] = new ModelRendererTurbo(this, 234, 107, textureX, textureY); // Box 198
		bodyModel[30] = new ModelRendererTurbo(this, 144, 37, textureX, textureY); // Box 199
		bodyModel[31] = new ModelRendererTurbo(this, 143, 71, textureX, textureY); // Box 200
		bodyModel[32] = new ModelRendererTurbo(this, 243, 101, textureX, textureY); // Box 201
		bodyModel[33] = new ModelRendererTurbo(this, 243, 107, textureX, textureY); // Box 202
		bodyModel[34] = new ModelRendererTurbo(this, 198, 70, textureX, textureY); // Box 203
		bodyModel[35] = new ModelRendererTurbo(this, 111, 231, textureX, textureY); // Box 204
		bodyModel[36] = new ModelRendererTurbo(this, 300, 32, textureX, textureY); // Box 205
		bodyModel[37] = new ModelRendererTurbo(this, 341, 215, textureX, textureY); // Box 206
		bodyModel[38] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 207
		bodyModel[39] = new ModelRendererTurbo(this, 237, 70, textureX, textureY); // Box 208
		bodyModel[40] = new ModelRendererTurbo(this, 237, 76, textureX, textureY); // Box 209
		bodyModel[41] = new ModelRendererTurbo(this, 246, 76, textureX, textureY); // Box 210
		bodyModel[42] = new ModelRendererTurbo(this, 210, 47, textureX, textureY); // Box 211
		bodyModel[43] = new ModelRendererTurbo(this, 177, 42, textureX, textureY); // Box 212
		bodyModel[44] = new ModelRendererTurbo(this, 143, 65, textureX, textureY); // Box 213
		bodyModel[45] = new ModelRendererTurbo(this, 246, 70, textureX, textureY); // Box 214
		bodyModel[46] = new ModelRendererTurbo(this, 191, 20, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 94
		bodyModel[48] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 96
		bodyModel[49] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 252
		bodyModel[50] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 253
		bodyModel[51] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 254
		bodyModel[52] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 255
		bodyModel[53] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 256
		bodyModel[54] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 265
		bodyModel[55] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 268
		bodyModel[56] = new ModelRendererTurbo(this, 165, 82, textureX, textureY, "cull"); // Box 330 cull
		bodyModel[57] = new ModelRendererTurbo(this, 154, 82, textureX, textureY, "cull"); // Box 331 cull
		bodyModel[58] = new ModelRendererTurbo(this, 359, 4, textureX, textureY); // Box 53
		bodyModel[59] = new ModelRendererTurbo(this, 123, 10, textureX, textureY); // Box 335
		bodyModel[60] = new ModelRendererTurbo(this, 131, 5, textureX, textureY); // Box 336
		bodyModel[61] = new ModelRendererTurbo(this, 131, 5, textureX, textureY); // Box 337
		bodyModel[62] = new ModelRendererTurbo(this, -17, 1, textureX, textureY); // Box 338
		bodyModel[63] = new ModelRendererTurbo(this, -17, 1, textureX, textureY); // Box 339
		bodyModel[64] = new ModelRendererTurbo(this, 176, 82, textureX, textureY, "cull"); // Box 340 cull
		bodyModel[65] = new ModelRendererTurbo(this, 187, 82, textureX, textureY, "cull"); // Box 341 cull
		bodyModel[66] = new ModelRendererTurbo(this, 252, 42, textureX, textureY); // Box 342
		bodyModel[67] = new ModelRendererTurbo(this, 252, 42, textureX, textureY); // Box 343
		bodyModel[68] = new ModelRendererTurbo(this, 252, 42, textureX, textureY); // Box 344
		bodyModel[69] = new ModelRendererTurbo(this, 252, 42, textureX, textureY); // Box 345
		bodyModel[70] = new ModelRendererTurbo(this, 243, 42, textureX, textureY); // Box 346
		bodyModel[71] = new ModelRendererTurbo(this, 243, 42, textureX, textureY); // Box 347
		bodyModel[72] = new ModelRendererTurbo(this, 225, 99, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[73] = new ModelRendererTurbo(this, 216, 99, textureX, textureY, "cull"); // Box 349 cull
		bodyModel[74] = new ModelRendererTurbo(this, 207, 99, textureX, textureY, "cull"); // Box 350 cull
		bodyModel[75] = new ModelRendererTurbo(this, 198, 99, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[76] = new ModelRendererTurbo(this, 79, 205, textureX, textureY); // Box 352
		bodyModel[77] = new ModelRendererTurbo(this, 300, 41, textureX, textureY); // Box 353
		bodyModel[78] = new ModelRendererTurbo(this, 110, 117, textureX, textureY); // Box 354
		bodyModel[79] = new ModelRendererTurbo(this, 110, 121, textureX, textureY); // Box 355
		bodyModel[80] = new ModelRendererTurbo(this, 240, 42, textureX, textureY); // Box 356
		bodyModel[81] = new ModelRendererTurbo(this, 240, 42, textureX, textureY); // Box 357
		bodyModel[82] = new ModelRendererTurbo(this, 240, 44, textureX, textureY); // Box 358
		bodyModel[83] = new ModelRendererTurbo(this, 240, 44, textureX, textureY); // Box 359
		bodyModel[84] = new ModelRendererTurbo(this, 119, 1, textureX, textureY); // Box 360
		bodyModel[85] = new ModelRendererTurbo(this, 119, 1, textureX, textureY); // Box 361
		bodyModel[86] = new ModelRendererTurbo(this, 228, 21, textureX, textureY); // Box 362
		bodyModel[87] = new ModelRendererTurbo(this, 228, 12, textureX, textureY); // Box 363
		bodyModel[88] = new ModelRendererTurbo(this, 219, 26, textureX, textureY); // Box 420
		bodyModel[89] = new ModelRendererTurbo(this, 218, 17, textureX, textureY); // Box 421
		bodyModel[90] = new ModelRendererTurbo(this, 217, 26, textureX, textureY); // Box 422
		bodyModel[91] = new ModelRendererTurbo(this, 12, 13, textureX, textureY); // Box 453
		bodyModel[92] = new ModelRendererTurbo(this, 12, 13, textureX, textureY); // Box 454
		bodyModel[93] = new ModelRendererTurbo(this, 21, 13, textureX, textureY); // Box 455
		bodyModel[94] = new ModelRendererTurbo(this, 21, 13, textureX, textureY); // Box 456
		bodyModel[95] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 170
		bodyModel[96] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 175
		bodyModel[97] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 177
		bodyModel[98] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 179
		bodyModel[99] = new ModelRendererTurbo(this, 191, 20, textureX, textureY); // Box 180
		bodyModel[100] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 181
		bodyModel[101] = new ModelRendererTurbo(this, 157, 21, textureX, textureY); // Box 182
		bodyModel[102] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 183
		bodyModel[103] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 184
		bodyModel[104] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 185
		bodyModel[105] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 186
		bodyModel[106] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 187
		bodyModel[107] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 188
		bodyModel[108] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 189
		bodyModel[109] = new ModelRendererTurbo(this, 174, 21, textureX, textureY); // Box 190
		bodyModel[110] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 191
		bodyModel[111] = new ModelRendererTurbo(this, 191, 20, textureX, textureY); // Box 192
		bodyModel[112] = new ModelRendererTurbo(this, 191, 20, textureX, textureY); // Box 193
		bodyModel[113] = new ModelRendererTurbo(this, 272, 39, textureX, textureY); // Box 224
		bodyModel[114] = new ModelRendererTurbo(this, 279, 39, textureX, textureY); // Box 225
		bodyModel[115] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 226
		bodyModel[116] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 227
		bodyModel[117] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 228
		bodyModel[118] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 229
		bodyModel[119] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 230
		bodyModel[120] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 231
		bodyModel[121] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 232
		bodyModel[122] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 233
		bodyModel[123] = new ModelRendererTurbo(this, 268, 236, textureX, textureY); // Box 234

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-33F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(29F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 82, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-41F, 3F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-33F, 3F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 10
		bodyModel[6].setRotationPoint(-41F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 41
		bodyModel[7].setRotationPoint(-38F, 2F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box 42
		bodyModel[8].setRotationPoint(38F, 2F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 74, 2, 2, 0F); // Box 44
		bodyModel[9].setRotationPoint(-37F, 0F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 45
		bodyModel[10].setRotationPoint(29F, 2F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 74, 2, 2, 0F); // Box 46
		bodyModel[11].setRotationPoint(-37F, 0F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 47
		bodyModel[12].setRotationPoint(-38F, 2F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 48
		bodyModel[13].setRotationPoint(29F, 2F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 173
		bodyModel[14].setRotationPoint(-33F, 3F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Box 175
		bodyModel[15].setRotationPoint(29F, 3F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 176
		bodyModel[16].setRotationPoint(29F, 3F, 2F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 178
		bodyModel[17].setRotationPoint(-33F, 2F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 180
		bodyModel[18].setRotationPoint(29F, 2F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 58, 2, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 184
		bodyModel[19].setRotationPoint(-29F, 1F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 3, 22, 0F); // Box 188
		bodyModel[20].setRotationPoint(-40F, -12F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 66, 7, 22, 0F); // Box 190
		bodyModel[21].setRotationPoint(-33F, -12F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 66, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[22].setRotationPoint(-33F, -5F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 80, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[23].setRotationPoint(-40F, -17F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 80, 2, 8, 0F); // Box 193
		bodyModel[24].setRotationPoint(-40F, -19F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[25].setRotationPoint(-40F, -19F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[26].setRotationPoint(-40F, -19F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 196
		bodyModel[27].setRotationPoint(-40F, -9F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 197
		bodyModel[28].setRotationPoint(-36F, -9F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.33F, 0F, 0F, -1.33F, 0F, 0F, 0.5F, -3F, 0F, 0.5F); // Box 198
		bodyModel[29].setRotationPoint(-36F, -5F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 199
		bodyModel[30].setRotationPoint(-39F, -9F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 200
		bodyModel[31].setRotationPoint(-40F, -9F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 201
		bodyModel[32].setRotationPoint(-36F, -9F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.33F, -3F, 0F, -1.33F); // Box 202
		bodyModel[33].setRotationPoint(-36F, -5F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 203
		bodyModel[34].setRotationPoint(-34F, -5F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 66, 6, 18, 0F); // Box 204
		bodyModel[35].setRotationPoint(-33F, -5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 66, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 205
		bodyModel[36].setRotationPoint(-33F, -5F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 7, 3, 22, 0F); // Box 206
		bodyModel[37].setRotationPoint(33F, -12F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[38].setRotationPoint(36F, -9F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 208
		bodyModel[39].setRotationPoint(33F, -9F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -3F, 0F, -1.33F, -3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 209
		bodyModel[40].setRotationPoint(33F, -5F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1.33F, 0F, 0F, -1.33F); // Box 210
		bodyModel[41].setRotationPoint(33F, -5F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[42].setRotationPoint(33F, -5F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[43].setRotationPoint(33F, -9F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[44].setRotationPoint(36F, -9F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 214
		bodyModel[45].setRotationPoint(33F, -9F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(-20F, 2F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 94
		bodyModel[47].setRotationPoint(-20F, 2F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 96
		bodyModel[48].setRotationPoint(-23F, 2F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F); // Box 252
		bodyModel[49].setRotationPoint(-16F, 2F, 3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[50].setRotationPoint(-16F, 2F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 254
		bodyModel[51].setRotationPoint(-23F, 2F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[52].setRotationPoint(-20F, 2F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[53].setRotationPoint(16F, 2F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[54].setRotationPoint(-8F, 2F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 268
		bodyModel[55].setRotationPoint(-8F, 2F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 330 cull
		bodyModel[56].setRotationPoint(-41F, -20F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 331 cull
		bodyModel[57].setRotationPoint(-41F, -20F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 68, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 53
		bodyModel[58].setRotationPoint(-34F, -21F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 70, 1, 8, 0F); // Box 335
		bodyModel[59].setRotationPoint(-35F, -20F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 72, 0, 4, 0F); // Box 336
		bodyModel[60].setRotationPoint(-36F, -20F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 72, 0, 4, 0F); // Box 337
		bodyModel[61].setRotationPoint(-36F, -20F, 5F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 0, 18, 0F); // Box 338
		bodyModel[62].setRotationPoint(-41F, -20F, -9F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 0, 18, 0F); // Box 339
		bodyModel[63].setRotationPoint(36F, -20F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 340 cull
		bodyModel[64].setRotationPoint(40F, -20F, 6F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 341 cull
		bodyModel[65].setRotationPoint(40F, -20F, -10F);

		bodyModel[66].addShapeBox(0F, -2F, 0F, 1, 2, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[66].setRotationPoint(-41F, -18F, -10F);

		bodyModel[67].addShapeBox(0F, -2F, 0F, 1, 2, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[67].setRotationPoint(-41F, -18F, 10F);

		bodyModel[68].addShapeBox(0F, -2F, 0F, 1, 2, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[68].setRotationPoint(40F, -18F, 10F);

		bodyModel[69].addShapeBox(0F, -2F, 0F, 1, 2, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[69].setRotationPoint(40F, -18F, -10F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 346
		bodyModel[70].setRotationPoint(-43F, -20F, -2F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 347
		bodyModel[71].setRotationPoint(41F, -20F, -2F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 348 cull
		bodyModel[72].setRotationPoint(-40F, -6F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 349 cull
		bodyModel[73].setRotationPoint(-40F, -6F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 350 cull
		bodyModel[74].setRotationPoint(37F, -6F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 351 cull
		bodyModel[75].setRotationPoint(37F, -6F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 80, 5, 20, 0F); // Box 352
		bodyModel[76].setRotationPoint(-40F, -17F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 80, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[77].setRotationPoint(-40F, -17F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 80, 2, 1, 0F); // Box 354
		bodyModel[78].setRotationPoint(-40F, -18F, -10.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 80, 2, 1, 0F); // Box 355
		bodyModel[79].setRotationPoint(-40F, -18F, 9.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 356
		bodyModel[80].setRotationPoint(-43F, -20F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 357
		bodyModel[81].setRotationPoint(-43F, -20F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 358
		bodyModel[82].setRotationPoint(40F, -20F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 359
		bodyModel[83].setRotationPoint(40F, -20F, -2F);

		bodyModel[84].addBox(0F, 0F, 0F, 80, 3, 0, 0F); // Box 360
		bodyModel[84].setRotationPoint(-40F, -20F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 80, 3, 0, 0F); // Box 361
		bodyModel[85].setRotationPoint(-40F, -20F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 8, 12, 0F); // Box 362
		bodyModel[86].setRotationPoint(-41F, -6F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 8, 12, 0F); // Box 363
		bodyModel[87].setRotationPoint(41F, -6F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 420
		bodyModel[88].setRotationPoint(-41.5F, -5F, 2F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 421
		bodyModel[89].setRotationPoint(-42F, -6.5F, 1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[90].setRotationPoint(-42F, -5F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 453
		bodyModel[91].setRotationPoint(-41F, 3F, -10F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 454
		bodyModel[92].setRotationPoint(-41F, 3F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 455
		bodyModel[93].setRotationPoint(37F, 3F, 10F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 456
		bodyModel[94].setRotationPoint(37F, 3F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 170
		bodyModel[95].setRotationPoint(4F, 2F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[96].setRotationPoint(4F, 2F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[97].setRotationPoint(20F, 2F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 179
		bodyModel[98].setRotationPoint(13F, 2F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[99].setRotationPoint(16F, 2F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 181
		bodyModel[100].setRotationPoint(13F, 2F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 182
		bodyModel[101].setRotationPoint(16F, 2F, 3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F); // Box 183
		bodyModel[102].setRotationPoint(20F, 2F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[103].setRotationPoint(-4F, 2F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 185
		bodyModel[104].setRotationPoint(-11F, 2F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 186
		bodyModel[105].setRotationPoint(-11F, 2F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F); // Box 187
		bodyModel[106].setRotationPoint(-4F, 2F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[107].setRotationPoint(8F, 2F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 189
		bodyModel[108].setRotationPoint(1F, 2F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 190
		bodyModel[109].setRotationPoint(1F, 2F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F); // Box 191
		bodyModel[110].setRotationPoint(8F, 2F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[111].setRotationPoint(-8F, 2F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[112].setRotationPoint(4F, 2F, -3F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 224
		bodyModel[113].setRotationPoint(-41F, -19F, -1F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 225
		bodyModel[114].setRotationPoint(40F, -19F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 226
		bodyModel[115].setRotationPoint(-34F, -21F, -2F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 227
		bodyModel[116].setRotationPoint(30F, -21F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 228
		bodyModel[117].setRotationPoint(22F, -21F, -2F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 229
		bodyModel[118].setRotationPoint(-26F, -21F, -2F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 230
		bodyModel[119].setRotationPoint(-18F, -21F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 231
		bodyModel[120].setRotationPoint(14F, -21F, -2F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 232
		bodyModel[121].setRotationPoint(-10F, -21F, -2F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 233
		bodyModel[122].setRotationPoint(6F, -21F, -2F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 234
		bodyModel[123].setRotationPoint(-2F, -21F, -2F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 124; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.93,-0.05,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.87,0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}