//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.03.2018 - 18:04:12
// Last changed on: 29.03.2018 - 18:04:12

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRheingoldPassenger_Dining1 extends ModelConverter
{
	int textureX = 512;
	int textureY = 256;

	public ModelRheingoldPassenger_Dining1()
	{
		bodyModel = new ModelRendererTurbo[125];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 39
		bodyModel[21] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 40
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 43
		bodyModel[25] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
		bodyModel[26] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 45
		bodyModel[27] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 51
		bodyModel[33] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 274, 104, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 54
		bodyModel[36] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
		bodyModel[37] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 56
		bodyModel[38] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 49, 88, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 146, 142, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 66, 91, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 118, 92, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 10, 123, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 6, 92, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 118, 105, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 65, 93, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 65, 93, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 65, 93, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 65, 93, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 186, 155, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 118, 92, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 204, 90, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 77
		bodyModel[60] = new ModelRendererTurbo(this, 79, 135, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 220, 127, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 293, 106, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 29, 133, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 376, 181, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 164, 118, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 241, 106, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 117, 120, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 103, 139, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 71, 159, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 326, 51, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 353, 128, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 396, 47, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 451, 129, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 397, 128, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 396, 47, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 451, 129, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 397, 128, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 483, 56, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 326, 51, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 353, 128, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 97, 168, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 459, 151, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 352, 114, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 97, 168, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 459, 151, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 352, 114, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 436, 57, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 323, 140, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 386, 120, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 436, 57, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 323, 140, textureX, textureY); // Box 1
		bodyModel[97] = new ModelRendererTurbo(this, 386, 120, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 108
		bodyModel[103] = new ModelRendererTurbo(this, 12, 172, textureX, textureY); // Box 109
		bodyModel[104] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 110
		bodyModel[105] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 111
		bodyModel[106] = new ModelRendererTurbo(this, 35, 182, textureX, textureY); // Box 112
		bodyModel[107] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 113
		bodyModel[108] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 7, 190, textureX, textureY); // Box 115
		bodyModel[110] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 13
		bodyModel[111] = new ModelRendererTurbo(this, 68, 165, textureX, textureY); // Box 15
		bodyModel[112] = new ModelRendererTurbo(this, 221, 58, textureX, textureY); // Box 173
		bodyModel[113] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 177
		bodyModel[114] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 178
		bodyModel[115] = new ModelRendererTurbo(this, 221, 58, textureX, textureY); // Box 179
		bodyModel[116] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 180
		bodyModel[117] = new ModelRendererTurbo(this, 135, 106, textureX, textureY); // Box 177
		bodyModel[118] = new ModelRendererTurbo(this, 135, 106, textureX, textureY); // Box 178
		bodyModel[119] = new ModelRendererTurbo(this, 135, 106, textureX, textureY); // Box 179
		bodyModel[120] = new ModelRendererTurbo(this, 135, 106, textureX, textureY); // Box 180
		bodyModel[121] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 181
		bodyModel[122] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 182
		bodyModel[123] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 483, 75, textureX, textureY); // Box 129

		bodyModel[0].addBox(0F, 0F, 0F, 125, 18, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-95F, -16F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 133, 1, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-95F, 2F, -22F);

		bodyModel[2].addBox(-5F, 0F, -1F, 5, 17, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(35F, -15F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(35F, -16F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(30F, -16F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-59F, 3F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[6].setRotationPoint(-94F, -19F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[7].setRotationPoint(37F, -19F, -20F);
		bodyModel[7].rotateAngleY = -3.14159265F;

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 18
		bodyModel[8].setRotationPoint(-95F, -19F, -20F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[9].setRotationPoint(37F, -19F, -20F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 21
		bodyModel[10].setRotationPoint(-98F, 2F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[11].setRotationPoint(-98F, -17F, -18F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 24
		bodyModel[12].setRotationPoint(-98F, -15F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 25
		bodyModel[13].setRotationPoint(-98F, -15F, -18F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 26
		bodyModel[14].setRotationPoint(-95F, -16F, -21F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 28
		bodyModel[15].setRotationPoint(-97F, 2F, -3F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 29
		bodyModel[16].setRotationPoint(-97F, 2F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		bodyModel[17].setRotationPoint(-98F, 1F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		bodyModel[18].setRotationPoint(-98F, 1F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 37
		bodyModel[19].setRotationPoint(30F, 2F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 39
		bodyModel[20].setRotationPoint(2F, 3F, -21F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addBox(0F, 0F, 0F, 47, 5, 22, 0F); // Box 40
		bodyModel[21].setRotationPoint(-52F, 3F, -22F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[22].setRotationPoint(-95F, -19F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[23].setRotationPoint(37F, -19F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[24].setRotationPoint(38F, -19F, -20F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[25].setRotationPoint(-94F, -19F, -20F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[26].setRotationPoint(-5F, 3F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[27].setRotationPoint(-52F, 3F, -21F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 47
		bodyModel[28].setRotationPoint(30F, -16F, -22F);

		bodyModel[29].addBox(-5F, 0F, 0F, 5, 17, 1, 0F); // Box 48
		bodyModel[29].setRotationPoint(35F, -15F, -22F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 49
		bodyModel[30].setRotationPoint(35F, -16F, -22F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 50
		bodyModel[31].setRotationPoint(37F, -16F, -21F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 51
		bodyModel[32].setRotationPoint(38F, 2F, -17F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 52
		bodyModel[33].setRotationPoint(38F, -15F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[34].setRotationPoint(38F, -17F, -18F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 54
		bodyModel[35].setRotationPoint(38F, -15F, -18F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		bodyModel[36].setRotationPoint(38F, 2F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[37].setRotationPoint(39.5F, 1F, -21F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[38].setRotationPoint(39.5F, 1F, -4F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[39].setRotationPoint(38F, 2F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 61
		bodyModel[40].setRotationPoint(35F, 2F, -22F);
		bodyModel[40].rotateAngleY = -3.14159265F;

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 54
		bodyModel[41].setRotationPoint(12F, 3F, -12F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 55
		bodyModel[42].setRotationPoint(-72F, 3F, -12F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 59
		bodyModel[43].setRotationPoint(28F, -16F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 60
		bodyModel[44].setRotationPoint(28F, -16F, -21F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,-8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(-87F, -24F, -17F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 31, 2, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 63
		bodyModel[46].setRotationPoint(-79F, -24F, -17F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 47, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[47].setRotationPoint(-87F, -22F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,-8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[48].setRotationPoint(-40F, -24F, -5F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 31, 2, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 67
		bodyModel[49].setRotationPoint(-48F, -24F, -5F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 47, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[50].setRotationPoint(-40F, -22F, -17F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 69
		bodyModel[51].setRotationPoint(-40F, -22F, -20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 70
		bodyModel[52].setRotationPoint(-87F, -22F, -2F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F); // Box 71
		bodyModel[53].setRotationPoint(-88F, -22F, -20F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F); // Box 72
		bodyModel[54].setRotationPoint(-39F, -22F, -2F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addBox(0F, 0F, 0F, 125, 18, 1, 0F); // Box 73
		bodyModel[55].setRotationPoint(-95F, -16F, -22F);

		bodyModel[56].addBox(0F, 0F, 0F, 31, 0, 4, 0F); // Box 74
		bodyModel[56].setRotationPoint(-79F, -24F, -13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[57].setRotationPoint(28F, -19F, -21F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 18, 13, 0F); // Box 76
		bodyModel[58].setRotationPoint(-88F, -16F, -21F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 77
		bodyModel[59].setRotationPoint(-49F, -16F, -21F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 78
		bodyModel[60].setRotationPoint(-49F, -16F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 19, 21, 1, 0F); // Box 80
		bodyModel[61].setRotationPoint(-87F, -19F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(-88F, -19F, -21F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[63].setRotationPoint(-49F, -19F, -21F);

		bodyModel[64].addBox(0F, 0F, 0F, 47, 0, 18, 0F); // Box 68
		bodyModel[64].setRotationPoint(-87F, -19.02F, -20F);

		bodyModel[65].addBox(0F, 0F, 0F, 11, 8, 5, 0F); // Box 70
		bodyModel[65].setRotationPoint(-87F, -6F, -14F);

		bodyModel[66].addBox(0F, 0F, 0F, 18, 4, 1, 0F); // Box 72
		bodyModel[66].setRotationPoint(-87F, -16F, -21F);

		bodyModel[67].addBox(0F, 0F, 0F, 7, 16, 3, 0F); // Box 73
		bodyModel[67].setRotationPoint(-76F, -14F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-69F, -16F, -21F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(-69F, -19F, -21F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 76
		bodyModel[70].setRotationPoint(-68F, -19F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 77
		bodyModel[71].setRotationPoint(-68F, -7F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-63F, -19F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-63F, -7F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 81
		bodyModel[74].setRotationPoint(-63F, -16F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 1
		bodyModel[75].setRotationPoint(20F, -2F, -21F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 3, 10, 0F); // Box 2
		bodyModel[76].setRotationPoint(22F, -1F, -21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(1F, -9F, -21F);

		bodyModel[78].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Box 1
		bodyModel[78].setRotationPoint(-4F, -2F, -21F);

		bodyModel[79].addBox(0F, 0F, 0F, 8, 3, 10, 0F); // Box 2
		bodyModel[79].setRotationPoint(-1F, -1F, -21F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[80].setRotationPoint(-23F, -9F, -21F);

		bodyModel[81].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Box 1
		bodyModel[81].setRotationPoint(-28F, -2F, -21F);

		bodyModel[82].addBox(0F, 0F, 0F, 8, 3, 10, 0F); // Box 2
		bodyModel[82].setRotationPoint(-25F, -1F, -21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(-45F, -9F, -21F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 1
		bodyModel[84].setRotationPoint(-45F, -2F, -21F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 3, 10, 0F); // Box 2
		bodyModel[85].setRotationPoint(-44F, -1F, -21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(1F, -9F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 14, 1, 5, 0F); // Box 1
		bodyModel[87].setRotationPoint(-4F, -2F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		bodyModel[88].setRotationPoint(-1F, -1F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[89].setRotationPoint(-23F, -9F, -6F);

		bodyModel[90].addBox(0F, 0F, 0F, 14, 1, 5, 0F); // Box 1
		bodyModel[90].setRotationPoint(-28F, -2F, -6F);

		bodyModel[91].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		bodyModel[91].setRotationPoint(-25F, -1F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(25F, -9F, -6F);

		bodyModel[93].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 1
		bodyModel[93].setRotationPoint(20F, -2F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 2
		bodyModel[94].setRotationPoint(22F, -1F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-45F, -9F, -6F);

		bodyModel[96].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 1
		bodyModel[96].setRotationPoint(-45F, -2F, -6F);

		bodyModel[97].addBox(4F, 0F, 0F, 4, 3, 5, 0F); // Box 2
		bodyModel[97].setRotationPoint(-48F, -1F, -6F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 104
		bodyModel[98].setRotationPoint(-10F, -6F, -4F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 105
		bodyModel[99].setRotationPoint(14F, -6F, -4F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 106
		bodyModel[100].setRotationPoint(-34F, -6F, -4F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 107
		bodyModel[101].setRotationPoint(-34F, -6F, -17F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 108
		bodyModel[102].setRotationPoint(-10F, -6F, -17F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 109
		bodyModel[103].setRotationPoint(14F, -6F, -17F);

		bodyModel[104].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 110
		bodyModel[104].setRotationPoint(-13F, -6.05F, -6F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 111
		bodyModel[105].setRotationPoint(11F, -6.05F, -6F);

		bodyModel[106].addBox(0F, 0F, 0F, 8, 0, 5, 0F); // Box 112
		bodyModel[106].setRotationPoint(-37F, -6.05F, -6F);

		bodyModel[107].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 113
		bodyModel[107].setRotationPoint(-37F, -6.05F, -21F);

		bodyModel[108].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 114
		bodyModel[108].setRotationPoint(-13F, -6.05F, -21F);

		bodyModel[109].addBox(0F, 0F, 0F, 8, 0, 10, 0F); // Box 115
		bodyModel[109].setRotationPoint(11F, -6.05F, -21F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[110].setRotationPoint(-95F, -23F, -20F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[111].setRotationPoint(-90F, -23F, -20F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[112].setRotationPoint(-95F, -23F, -16F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[113].setRotationPoint(-95F, -23F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[114].setRotationPoint(33F, -23F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[115].setRotationPoint(33F, -23F, -16F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, -4F, -5F, -1F, -4F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[116].setRotationPoint(33F, -23F, -20F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[117].setRotationPoint(-94F, -5F, -23F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
		bodyModel[118].setRotationPoint(-94F, -5F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179
		bodyModel[119].setRotationPoint(21F, -5F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[120].setRotationPoint(21F, -5F, -23F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 181
		bodyModel[121].setRotationPoint(38F, 2.1F, -12F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 182
		bodyModel[122].setRotationPoint(-99F, 2.1F, -12F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 73, 4, 18, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-40F, -23F, -20F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[124].setRotationPoint(25F, -9F, -21F);
	}

	private ModelRheingoldBogie bogie1 = new ModelRheingoldBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo m : bodyModel)
		{
			m.render(f5);
		}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Rheingold_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-4.55,0.20,-1.045);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.25,0,-0.0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}