// Model: GP15
// Model Creator: Bida
// Created on: 27.04.2021 - 10:45:43
// Last changed on: 27.04.2021 - 10:45:43

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

public class ModelGP15 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelGP15() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 183, 158, textureX, textureY); // Box 489
		bodyModel[5] = new ModelRendererTurbo(this, 151, 204, textureX, textureY); // Box 281
		bodyModel[6] = new ModelRendererTurbo(this, 191, 184, textureX, textureY); // Box 288
		bodyModel[7] = new ModelRendererTurbo(this, 145, 210, textureX, textureY); // Box 316
		bodyModel[8] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 515
		bodyModel[9] = new ModelRendererTurbo(this, 195, 99, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 235, 71, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 211, 71, textureX, textureY); // Box 45
		bodyModel[12] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 115, 38, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 136, 38, textureX, textureY); // Box 41
		bodyModel[15] = new ModelRendererTurbo(this, 177, 19, textureX, textureY); // Box 273
		bodyModel[16] = new ModelRendererTurbo(this, 239, 98, textureX, textureY); // Box 528
		bodyModel[17] = new ModelRendererTurbo(this, 239, 103, textureX, textureY); // Box 529
		bodyModel[18] = new ModelRendererTurbo(this, 118, 214, textureX, textureY); // Box 3
		bodyModel[19] = new ModelRendererTurbo(this, 1, 108, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 56
		bodyModel[21] = new ModelRendererTurbo(this, 49, 83, textureX, textureY); // Box 9
		bodyModel[22] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 10
		bodyModel[23] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 15
		bodyModel[24] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 21
		bodyModel[25] = new ModelRendererTurbo(this, 207, 4, textureX, textureY, "lamp"); // Box 48 headlight front
		bodyModel[26] = new ModelRendererTurbo(this, 216, 1, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 192, 1, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 201
		bodyModel[29] = new ModelRendererTurbo(this, 109, 80, textureX, textureY); // Box 314 door swing right
		bodyModel[30] = new ModelRendererTurbo(this, 38, 80, textureX, textureY); // Box 315 door swing right
		bodyModel[31] = new ModelRendererTurbo(this, 96, 106, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 131, 102, textureX, textureY); // Box 210
		bodyModel[33] = new ModelRendererTurbo(this, 68, 108, textureX, textureY); // Box 211
		bodyModel[34] = new ModelRendererTurbo(this, 131, 104, textureX, textureY); // Box 219
		bodyModel[35] = new ModelRendererTurbo(this, 98, 108, textureX, textureY); // Box 220
		bodyModel[36] = new ModelRendererTurbo(this, 85, 114, textureX, textureY); // Box 221
		bodyModel[37] = new ModelRendererTurbo(this, 85, 126, textureX, textureY); // Box 222
		bodyModel[38] = new ModelRendererTurbo(this, 131, 110, textureX, textureY); // Box 223
		bodyModel[39] = new ModelRendererTurbo(this, 85, 106, textureX, textureY); // Box 224
		bodyModel[40] = new ModelRendererTurbo(this, 46, 99, textureX, textureY); // Box 36
		bodyModel[41] = new ModelRendererTurbo(this, 46, 106, textureX, textureY); // Box 305
		bodyModel[42] = new ModelRendererTurbo(this, 118, 214, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 79, 236, textureX, textureY); // Box 516
		bodyModel[44] = new ModelRendererTurbo(this, 39, 236, textureX, textureY); // Box 517
		bodyModel[45] = new ModelRendererTurbo(this, 39, 211, textureX, textureY); // Box 518
		bodyModel[46] = new ModelRendererTurbo(this, 79, 211, textureX, textureY); // Box 519
		bodyModel[47] = new ModelRendererTurbo(this, 241, 125, textureX, textureY); // Box 274 stack
		bodyModel[48] = new ModelRendererTurbo(this, 241, 125, textureX, textureY); // Box 275 stack
		bodyModel[49] = new ModelRendererTurbo(this, 178, 206, textureX, textureY); // Box 306
		bodyModel[50] = new ModelRendererTurbo(this, 217, 206, textureX, textureY); // Box 308
		bodyModel[51] = new ModelRendererTurbo(this, 45, 195, textureX, textureY); // Box 38R
		bodyModel[52] = new ModelRendererTurbo(this, 82, 204, textureX, textureY); // Box 176
		bodyModel[53] = new ModelRendererTurbo(this, 146, 225, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 90, 234, textureX, textureY); // Box 174
		bodyModel[55] = new ModelRendererTurbo(this, 95, 235, textureX, textureY); // Box 293
		bodyModel[56] = new ModelRendererTurbo(this, 131, 223, textureX, textureY); // Box 258
		bodyModel[57] = new ModelRendererTurbo(this, 76, 206, textureX, textureY); // Box 313
		bodyModel[58] = new ModelRendererTurbo(this, 76, 204, textureX, textureY); // Box 314
		bodyModel[59] = new ModelRendererTurbo(this, 82, 213, textureX, textureY); // Box 315
		bodyModel[60] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 316
		bodyModel[61] = new ModelRendererTurbo(this, 39, 206, textureX, textureY); // Box 306
		bodyModel[62] = new ModelRendererTurbo(this, 33, 208, textureX, textureY); // Box 307
		bodyModel[63] = new ModelRendererTurbo(this, 193, 146, textureX, textureY); // Box 291
		bodyModel[64] = new ModelRendererTurbo(this, 193, 146, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 193, 146, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 193, 146, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 220, 150, textureX, textureY); // Box 327
		bodyModel[68] = new ModelRendererTurbo(this, 239, 150, textureX, textureY); // Box 328
		bodyModel[69] = new ModelRendererTurbo(this, 232, 150, textureX, textureY); // Box 329
		bodyModel[70] = new ModelRendererTurbo(this, 236, 158, textureX, textureY); // Box 354
		bodyModel[71] = new ModelRendererTurbo(this, 234, 172, textureX, textureY); // Box 355
		bodyModel[72] = new ModelRendererTurbo(this, 234, 164, textureX, textureY); // Box 356
		bodyModel[73] = new ModelRendererTurbo(this, 159, 36, textureX, textureY, "lamp"); // Box 31 headlight rear
		bodyModel[74] = new ModelRendererTurbo(this, 181, 50, textureX, textureY); // Box 340
		bodyModel[75] = new ModelRendererTurbo(this, 173, 49, textureX, textureY); // Box 341
		bodyModel[76] = new ModelRendererTurbo(this, 10, 129, textureX, textureY); // Box 341
		bodyModel[77] = new ModelRendererTurbo(this, 10, 126, textureX, textureY); // Box 342
		bodyModel[78] = new ModelRendererTurbo(this, 10, 132, textureX, textureY); // Box 343
		bodyModel[79] = new ModelRendererTurbo(this, 10, 135, textureX, textureY); // Box 344
		bodyModel[80] = new ModelRendererTurbo(this, 158, 25, textureX, textureY); // Box 264
		bodyModel[81] = new ModelRendererTurbo(this, 148, 196, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 148, 200, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 148, 192, textureX, textureY); // Box 255
		bodyModel[84] = new ModelRendererTurbo(this, 148, 188, textureX, textureY); // Box 256
		bodyModel[85] = new ModelRendererTurbo(this, 154, 222, textureX, textureY); // Box 278
		bodyModel[86] = new ModelRendererTurbo(this, 148, 216, textureX, textureY); // Box 315
		bodyModel[87] = new ModelRendererTurbo(this, 152, 20, textureX, textureY); // Box 389 support cull
		bodyModel[88] = new ModelRendererTurbo(this, 153, 13, textureX, textureY, "lamp"); // Box 162 beacon L
		bodyModel[89] = new ModelRendererTurbo(this, 152, 17, textureX, textureY); // Box 165
		bodyModel[90] = new ModelRendererTurbo(this, 164, 20, textureX, textureY); // Box 356 support cull
		bodyModel[91] = new ModelRendererTurbo(this, 167, 13, textureX, textureY, "lamp"); // Box 404 beacon R
		bodyModel[92] = new ModelRendererTurbo(this, 166, 17, textureX, textureY); // Box 405
		bodyModel[93] = new ModelRendererTurbo(this, 215, 42, textureX, textureY); // Box 143 sandcap
		bodyModel[94] = new ModelRendererTurbo(this, 210, 36, textureX, textureY); // Box 351 sandcap
		bodyModel[95] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 280
		bodyModel[96] = new ModelRendererTurbo(this, 14, 201, textureX, textureY); // Box 281
		bodyModel[97] = new ModelRendererTurbo(this, 1, 215, textureX, textureY); // Box 282
		bodyModel[98] = new ModelRendererTurbo(this, 1, 228, textureX, textureY); // Box 283
		bodyModel[99] = new ModelRendererTurbo(this, 1, 203, textureX, textureY); // Box 284
		bodyModel[100] = new ModelRendererTurbo(this, 12, 191, textureX, textureY); // Box 285
		bodyModel[101] = new ModelRendererTurbo(this, 133, 204, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 133, 204, textureX, textureY); // Box 166
		bodyModel[103] = new ModelRendererTurbo(this, 239, 186, textureX, textureY); // Box 409
		bodyModel[104] = new ModelRendererTurbo(this, 239, 186, textureX, textureY); // Box 300
		bodyModel[105] = new ModelRendererTurbo(this, 239, 192, textureX, textureY); // Box 302
		bodyModel[106] = new ModelRendererTurbo(this, 239, 192, textureX, textureY); // Box 304
		bodyModel[107] = new ModelRendererTurbo(this, 108, 124, textureX, textureY); // Box 380
		bodyModel[108] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 381
		bodyModel[109] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 382
		bodyModel[110] = new ModelRendererTurbo(this, 108, 124, textureX, textureY); // Box 383
		bodyModel[111] = new ModelRendererTurbo(this, 102, 124, textureX, textureY); // Box 384
		bodyModel[112] = new ModelRendererTurbo(this, 102, 124, textureX, textureY); // Box 385
		bodyModel[113] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 386
		bodyModel[114] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 387
		bodyModel[115] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 121
		bodyModel[120] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 127
		bodyModel[126] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 32, 136, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[128] = new ModelRendererTurbo(this, 32, 136, textureX, textureY, "lamp"); // Box 370 ditchlight front
		bodyModel[129] = new ModelRendererTurbo(this, 48, 136, textureX, textureY, "lamp"); // Box 370 ditchlight rear
		bodyModel[130] = new ModelRendererTurbo(this, 48, 136, textureX, textureY, "lamp"); // Box 370 ditchlight rear
		bodyModel[131] = new ModelRendererTurbo(this, 92, 67, textureX, textureY); // Box 86
		bodyModel[132] = new ModelRendererTurbo(this, 120, 79, textureX, textureY); // Box 87
		bodyModel[133] = new ModelRendererTurbo(this, 93, 79, textureX, textureY); // Box 86

		bodyModel[0].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-30F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 68, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-35F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(-38F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[3].setRotationPoint(32F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 3, 22, 0F); // Box 489
		bodyModel[4].setRotationPoint(-8F, 3F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[5].setRotationPoint(-8F, 6F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[6].setRotationPoint(-8F, 6F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[7].setRotationPoint(-8F, 6F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 515
		bodyModel[8].setRotationPoint(-30F, 0F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 43
		bodyModel[9].setRotationPoint(-31F, -13F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[10].setRotationPoint(-34F, -13F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[11].setRotationPoint(-34F, -13F, 0F);

		bodyModel[12].addBox(0F, 0F, 0F, 42, 21, 14, 0F); // Box 19
		bodyModel[12].setRotationPoint(-13F, -21F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[13].setRotationPoint(29F, -21F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[14].setRotationPoint(29F, -21F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[15].setRotationPoint(-12F, -22F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[16].setRotationPoint(-11F, -15F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 11, 2, 0F); // Box 529
		bodyModel[17].setRotationPoint(-11F, -13F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 3
		bodyModel[18].setRotationPoint(-35F, -8F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 45
		bodyModel[19].setRotationPoint(-29F, -4F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 56
		bodyModel[20].setRotationPoint(-28F, -4F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[21].setRotationPoint(-24F, -18F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[22].setRotationPoint(-23F, -18F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[23].setRotationPoint(-24F, -18F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[24].setRotationPoint(-14F, -18F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 48 headlight front
		bodyModel[25].setRotationPoint(-26F, -21F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[26].setRotationPoint(-26F, -21F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[27].setRotationPoint(-26F, -21F, 1F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[28].setRotationPoint(-24F, -4F, -11F);

		bodyModel[29].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[29].setRotationPoint(-13.5F, -18F, 10.5F);

		bodyModel[30].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[30].setRotationPoint(-23.5F, -18F, -10.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[31].setRotationPoint(-24F, -21F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[32].setRotationPoint(-14F, -21F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[33].setRotationPoint(-24F, -21F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[34].setRotationPoint(-14F, -21F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[35].setRotationPoint(-23F, -21F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[36].setRotationPoint(-23F, -21F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[37].setRotationPoint(-23F, -21F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[38].setRotationPoint(-14F, -21F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[39].setRotationPoint(-24F, -21F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 36
		bodyModel[40].setRotationPoint(-13F, -2F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[41].setRotationPoint(-13F, -4F, 7F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 42
		bodyModel[42].setRotationPoint(33F, -8F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[43].setRotationPoint(-35F, -8F, -10F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[44].setRotationPoint(-35F, -8F, 11F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[45].setRotationPoint(33F, -8F, 11F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[46].setRotationPoint(33F, -8F, -10F);
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 274 stack
		bodyModel[47].setRotationPoint(-1.5F, -22.5F, -2.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 275 stack
		bodyModel[48].setRotationPoint(7.5F, -22.5F, -2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[49].setRotationPoint(15F, -22F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[50].setRotationPoint(15F, -22F, 1F);

		bodyModel[51].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 38R
		bodyModel[51].setRotationPoint(-8F, -8F, 11.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 24, 8, 0, 0F); // Box 176
		bodyModel[52].setRotationPoint(-10F, -10F, -11.01F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 10, 0, 0F); // Box 61
		bodyModel[53].setRotationPoint(-31F, -10F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[54].setRotationPoint(-28F, -11F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 293
		bodyModel[55].setRotationPoint(-26F, -12F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 258
		bodyModel[56].setRotationPoint(-31F, -12F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[57].setRotationPoint(-12F, -12F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[58].setRotationPoint(-13F, -12F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[59].setRotationPoint(14F, -10F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 316
		bodyModel[60].setRotationPoint(16F, -8F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 306
		bodyModel[61].setRotationPoint(-13F, -12F, 11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[62].setRotationPoint(-12F, -12F, 11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 291
		bodyModel[63].setRotationPoint(-31F, 0F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 66
		bodyModel[64].setRotationPoint(-31F, 0F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 67
		bodyModel[65].setRotationPoint(28F, 0F, 7F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 68
		bodyModel[66].setRotationPoint(28F, 0F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[67].setRotationPoint(33F, 0F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[68].setRotationPoint(33F, 0F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 329
		bodyModel[69].setRotationPoint(33F, 0F, -2F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 354
		bodyModel[70].setRotationPoint(-37F, 0F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[71].setRotationPoint(-37F, 0F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[72].setRotationPoint(-37F, 0F, 2F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 headlight rear
		bodyModel[73].setRotationPoint(30.25F, -18F, -2F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 10, 14, 0F); // Box 340
		bodyModel[74].setRotationPoint(18F, -10F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 11, 0, 14, 0F); // Box 341
		bodyModel[75].setRotationPoint(18F, -10F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 341
		bodyModel[76].setRotationPoint(-24F, -23.5F, -0.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 342
		bodyModel[77].setRotationPoint(-26F, -23.5F, 0.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[78].setRotationPoint(-25F, -23.5F, -1.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 344
		bodyModel[79].setRotationPoint(-24F, -22.5F, -0.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 264
		bodyModel[80].setRotationPoint(-21F, -22.5F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[81].setRotationPoint(-4F, 0.5F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[82].setRotationPoint(-4F, 1.5F, 9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[83].setRotationPoint(-4F, 1.5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[84].setRotationPoint(-4F, 0.5F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[85].setRotationPoint(-8F, 2F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[86].setRotationPoint(-8F, 2F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389 support cull
		bodyModel[87].setRotationPoint(-23F, -21F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 beacon L
		bodyModel[88].setRotationPoint(-22.47F, -23F, -8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[89].setRotationPoint(-22.32F, -22F, -8.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 356 support cull
		bodyModel[90].setRotationPoint(-23F, -21F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 404 beacon R
		bodyModel[91].setRotationPoint(-22.47F, -23F, 7.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 405
		bodyModel[92].setRotationPoint(-22.32F, -22F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143 sandcap
		bodyModel[93].setRotationPoint(-32.5F, -13.5F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[94].setRotationPoint(29F, -21.5F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[95].setRotationPoint(-38F, 5F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[96].setRotationPoint(-38F, 6F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[97].setRotationPoint(-39F, 7F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[98].setRotationPoint(-39F, 7F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[99].setRotationPoint(-38F, 6F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[100].setRotationPoint(-38F, 5F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[101].setRotationPoint(-21F, 3F, -2F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[102].setRotationPoint(15F, 3F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 409
		bodyModel[103].setRotationPoint(-20.5F, 1F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[104].setRotationPoint(-20.5F, 1F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 302
		bodyModel[105].setRotationPoint(15.5F, 1F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[106].setRotationPoint(15.5F, 1F, 7F);

		bodyModel[107].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 380
		bodyModel[107].setRotationPoint(-30F, 1F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 17, 1, 0, 0F); // Box 381
		bodyModel[108].setRotationPoint(11F, 1F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 17, 1, 0, 0F); // Box 382
		bodyModel[109].setRotationPoint(11F, 1F, 11F);

		bodyModel[110].addBox(0F, 0F, 0F, 21, 1, 0, 0F); // Box 383
		bodyModel[110].setRotationPoint(-30F, 1F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[111].setRotationPoint(-9F, 1F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[112].setRotationPoint(-9F, 1F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 386
		bodyModel[113].setRotationPoint(10F, 1F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 387
		bodyModel[114].setRotationPoint(10F, 1F, 11F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 117
		bodyModel[115].setRotationPoint(-35F, 8F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 118
		bodyModel[116].setRotationPoint(-35F, 5F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 119
		bodyModel[117].setRotationPoint(-35F, 1F, -8F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 120
		bodyModel[118].setRotationPoint(29F, 8F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 121
		bodyModel[119].setRotationPoint(29F, 5F, -9F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 122
		bodyModel[120].setRotationPoint(29F, 1F, -8F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 123
		bodyModel[121].setRotationPoint(-35F, 8F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 124
		bodyModel[122].setRotationPoint(-35F, 5F, 5F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 125
		bodyModel[123].setRotationPoint(-35F, 1F, 4F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 126
		bodyModel[124].setRotationPoint(29F, 1F, 4F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 127
		bodyModel[125].setRotationPoint(29F, 5F, 5F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 128
		bodyModel[126].setRotationPoint(29F, 8F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[127].setRotationPoint(-36F, -2.5F, -6F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight front
		bodyModel[128].setRotationPoint(-36F, -2.5F, 4F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[129].setRotationPoint(33F, -2.5F, -6F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 370 ditchlight rear
		bodyModel[130].setRotationPoint(33F, -2.5F, 4F);

		bodyModel[131].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[131].setRotationPoint(-23.1F, -12F, -5F);
		bodyModel[131].rotateAngleY = -0.38397244F;

		bodyModel[132].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[132].setRotationPoint(-23F, -13F, -4F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[133].setRotationPoint(-22F, -14F, -5F);
		bodyModel[133].rotateAngleY = -0.38397244F;
	}
	ModelBlombergB theTrucks = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(ModelRendererTurbo m :bodyModel)
		{
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14651){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/classic_blomberg_b_black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/classic_blomberg_b_harbor_grey.png"));
		}

		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,1f);
		GL11.glTranslated(-1.2, -0.0, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(2.27f, 0f,0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}