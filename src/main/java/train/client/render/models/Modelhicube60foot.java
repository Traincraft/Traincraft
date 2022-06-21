//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.05.2021 - 12:23:10
// Last changed on: 23.05.2021 - 12:23:10

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Modelhicube60foot extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelhicube60foot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[137];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 202, 237, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 234, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 237, 199, textureX, textureY); // Box 42
		bodyModel[3] = new ModelRendererTurbo(this, 237, 199, textureX, textureY); // Box 44
		bodyModel[4] = new ModelRendererTurbo(this, 3, 188, textureX, textureY); // Box 72
		bodyModel[5] = new ModelRendererTurbo(this, 63, 154, textureX, textureY); // Box 78 door L B end
		bodyModel[6] = new ModelRendererTurbo(this, 14, 193, textureX, textureY); // Box 87
		bodyModel[7] = new ModelRendererTurbo(this, 92, 75, textureX, textureY); // Box 108 door R B end
		bodyModel[8] = new ModelRendererTurbo(this, 194, 231, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 203, 222, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 194, 231, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 202, 237, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 208, 148, textureX, textureY); // Box 106 26 for half
		bodyModel[13] = new ModelRendererTurbo(this, 172, 226, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 172, 230, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 181, 226, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 181, 230, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 36, 114, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[18] = new ModelRendererTurbo(this, 58, 114, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[19] = new ModelRendererTurbo(this, 25, 114, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[20] = new ModelRendererTurbo(this, 25, 194, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[21] = new ModelRendererTurbo(this, 36, 194, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[22] = new ModelRendererTurbo(this, 47, 194, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[23] = new ModelRendererTurbo(this, 47, 114, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[24] = new ModelRendererTurbo(this, 58, 194, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[25] = new ModelRendererTurbo(this, 198, 211, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 11, 196, textureX, textureY); // Box 87
		bodyModel[27] = new ModelRendererTurbo(this, 2, 154, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 121, 154, textureX, textureY); // Box 5
		bodyModel[29] = new ModelRendererTurbo(this, 2, 186, textureX, textureY); // Box 8
		bodyModel[30] = new ModelRendererTurbo(this, 2, 106, textureX, textureY); // Box 9
		bodyModel[31] = new ModelRendererTurbo(this, 190, 230, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 45, 130, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 68, 127, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 91, 204, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 68, 207, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 45, 210, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 207, 249, textureX, textureY); // Box 82
		bodyModel[38] = new ModelRendererTurbo(this, 202, 249, textureX, textureY); // Box 83
		bodyModel[39] = new ModelRendererTurbo(this, 192, 249, textureX, textureY); // Box 84
		bodyModel[40] = new ModelRendererTurbo(this, 197, 249, textureX, textureY); // Box 85
		bodyModel[41] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 104
		bodyModel[42] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 215, 219, textureX, textureY); // Box 80
		bodyModel[44] = new ModelRendererTurbo(this, 215, 216, textureX, textureY); // Box 81
		bodyModel[45] = new ModelRendererTurbo(this, 198, 211, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 63, 75, textureX, textureY); // Box 74 door R A end
		bodyModel[47] = new ModelRendererTurbo(this, 92, 154, textureX, textureY); // Box 75 door L A end
		bodyModel[48] = new ModelRendererTurbo(this, 114, 121, textureX, textureY); // Box 77
		bodyModel[49] = new ModelRendererTurbo(this, 91, 124, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 160, 115, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 137, 118, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 137, 198, textureX, textureY); // Box 82
		bodyModel[53] = new ModelRendererTurbo(this, 114, 201, textureX, textureY); // Box 83
		bodyModel[54] = new ModelRendererTurbo(this, 160, 195, textureX, textureY); // Box 85
		bodyModel[55] = new ModelRendererTurbo(this, 63, 183, textureX, textureY); // Box 86
		bodyModel[56] = new ModelRendererTurbo(this, 35, 188, textureX, textureY); // Box 87
		bodyModel[57] = new ModelRendererTurbo(this, 27, 209, textureX, textureY); // Box 118
		bodyModel[58] = new ModelRendererTurbo(this, 63, 104, textureX, textureY); // Box 119
		bodyModel[59] = new ModelRendererTurbo(this, 35, 109, textureX, textureY); // Box 120
		bodyModel[60] = new ModelRendererTurbo(this, 152, 185, textureX, textureY); // Box 121
		bodyModel[61] = new ModelRendererTurbo(this, 202, 154, textureX, textureY); // Box 122
		bodyModel[62] = new ModelRendererTurbo(this, 273, 155, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 148, 151, textureX, textureY); // Box 124
		bodyModel[64] = new ModelRendererTurbo(this, 208, 151, textureX, textureY); // Box 125
		bodyModel[65] = new ModelRendererTurbo(this, 273, 75, textureX, textureY); // Box 126
		bodyModel[66] = new ModelRendererTurbo(this, 202, 75, textureX, textureY); // Box 127
		bodyModel[67] = new ModelRendererTurbo(this, 152, 106, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 148, 72, textureX, textureY); // Box 129
		bodyModel[69] = new ModelRendererTurbo(this, 208, 72, textureX, textureY); // Box 130
		bodyModel[70] = new ModelRendererTurbo(this, 208, 69, textureX, textureY); // Box 131
		bodyModel[71] = new ModelRendererTurbo(this, 19, 192, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 182, 154, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 187, 154, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 192, 154, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 197, 154, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 283, 155, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 278, 155, textureX, textureY); // Box 138
		bodyModel[78] = new ModelRendererTurbo(this, 293, 155, textureX, textureY); // Box 139
		bodyModel[79] = new ModelRendererTurbo(this, 288, 155, textureX, textureY); // Box 140
		bodyModel[80] = new ModelRendererTurbo(this, 278, 75, textureX, textureY); // Box 141
		bodyModel[81] = new ModelRendererTurbo(this, 283, 75, textureX, textureY); // Box 142
		bodyModel[82] = new ModelRendererTurbo(this, 288, 75, textureX, textureY); // Box 143
		bodyModel[83] = new ModelRendererTurbo(this, 293, 75, textureX, textureY); // Box 144
		bodyModel[84] = new ModelRendererTurbo(this, 197, 75, textureX, textureY); // Box 145
		bodyModel[85] = new ModelRendererTurbo(this, 192, 75, textureX, textureY); // Box 146
		bodyModel[86] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 182, 75, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 212, 158, textureX, textureY); // Box 149 door L B end
		bodyModel[89] = new ModelRendererTurbo(this, 235, 155, textureX, textureY); // Box 149 door L B end
		bodyModel[90] = new ModelRendererTurbo(this, 240, 155, textureX, textureY); // Box 75 door L A end
		bodyModel[91] = new ModelRendererTurbo(this, 268, 155, textureX, textureY); // Box 75 door L A end
		bodyModel[92] = new ModelRendererTurbo(this, 207, 154, textureX, textureY); // Box 149 door L B end
		bodyModel[93] = new ModelRendererTurbo(this, 212, 161, textureX, textureY); // Box 149 door L B end
		bodyModel[94] = new ModelRendererTurbo(this, 245, 159, textureX, textureY); // Box 75 door L A end
		bodyModel[95] = new ModelRendererTurbo(this, 245, 162, textureX, textureY); // Box 75 door L A end
		bodyModel[96] = new ModelRendererTurbo(this, 268, 75, textureX, textureY); // Box 108 door R B end
		bodyModel[97] = new ModelRendererTurbo(this, 240, 75, textureX, textureY); // Box 108 door R B end
		bodyModel[98] = new ModelRendererTurbo(this, 245, 79, textureX, textureY); // Box 108 door R B end
		bodyModel[99] = new ModelRendererTurbo(this, 245, 82, textureX, textureY); // Box 108 door R B end
		bodyModel[100] = new ModelRendererTurbo(this, 235, 75, textureX, textureY); // Box 74 door R A end
		bodyModel[101] = new ModelRendererTurbo(this, 207, 75, textureX, textureY); // Box 74 door R A end
		bodyModel[102] = new ModelRendererTurbo(this, 212, 79, textureX, textureY); // Box 74 door R A end
		bodyModel[103] = new ModelRendererTurbo(this, 212, 82, textureX, textureY); // Box 74 door R A end
		bodyModel[104] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 149 door L B end
		bodyModel[105] = new ModelRendererTurbo(this, 245, 156, textureX, textureY); // Box 75 door L A end
		bodyModel[106] = new ModelRendererTurbo(this, 212, 164, textureX, textureY); // Box 149 door L B end
		bodyModel[107] = new ModelRendererTurbo(this, 245, 165, textureX, textureY); // Box 75 door L A end
		bodyModel[108] = new ModelRendererTurbo(this, 245, 85, textureX, textureY); // Box 108 door R B end
		bodyModel[109] = new ModelRendererTurbo(this, 212, 85, textureX, textureY); // Box 74 door R A end
		bodyModel[110] = new ModelRendererTurbo(this, 245, 76, textureX, textureY); // Box 108 door R B end
		bodyModel[111] = new ModelRendererTurbo(this, 212, 76, textureX, textureY); // Box 74 door R A end
		bodyModel[112] = new ModelRendererTurbo(this, 299, 156, textureX, textureY); // Box 149 door L B end
		bodyModel[113] = new ModelRendererTurbo(this, 302, 156, textureX, textureY); // Box 149 door L B end
		bodyModel[114] = new ModelRendererTurbo(this, 308, 156, textureX, textureY); // Box 75 door L A end
		bodyModel[115] = new ModelRendererTurbo(this, 305, 156, textureX, textureY); // Box 75 door L A end
		bodyModel[116] = new ModelRendererTurbo(this, 299, 76, textureX, textureY); // Box 74 door R A end
		bodyModel[117] = new ModelRendererTurbo(this, 302, 76, textureX, textureY); // Box 74 door R A end
		bodyModel[118] = new ModelRendererTurbo(this, 308, 76, textureX, textureY); // Box 108 door R B end
		bodyModel[119] = new ModelRendererTurbo(this, 305, 76, textureX, textureY); // Box 108 door R B end
		bodyModel[120] = new ModelRendererTurbo(this, 212, 91, textureX, textureY); // Box 183
		bodyModel[121] = new ModelRendererTurbo(this, 212, 88, textureX, textureY); // Box 184
		bodyModel[122] = new ModelRendererTurbo(this, 223, 88, textureX, textureY); // Box 185
		bodyModel[123] = new ModelRendererTurbo(this, 223, 91, textureX, textureY); // Box 186
		bodyModel[124] = new ModelRendererTurbo(this, 252, 171, textureX, textureY); // Box 187
		bodyModel[125] = new ModelRendererTurbo(this, 257, 171, textureX, textureY); // Box 188
		bodyModel[126] = new ModelRendererTurbo(this, 252, 168, textureX, textureY); // Box 189
		bodyModel[127] = new ModelRendererTurbo(this, 257, 168, textureX, textureY); // Box 190
		bodyModel[128] = new ModelRendererTurbo(this, 212, 170, textureX, textureY); // Box 191
		bodyModel[129] = new ModelRendererTurbo(this, 223, 170, textureX, textureY); // Box 192
		bodyModel[130] = new ModelRendererTurbo(this, 212, 167, textureX, textureY); // Box 193
		bodyModel[131] = new ModelRendererTurbo(this, 223, 167, textureX, textureY); // Box 194
		bodyModel[132] = new ModelRendererTurbo(this, 252, 91, textureX, textureY); // Box 195
		bodyModel[133] = new ModelRendererTurbo(this, 257, 91, textureX, textureY); // Box 196
		bodyModel[134] = new ModelRendererTurbo(this, 252, 88, textureX, textureY); // Box 197
		bodyModel[135] = new ModelRendererTurbo(this, 257, 88, textureX, textureY); // Box 198
		bodyModel[136] = new ModelRendererTurbo(this, 27, 129, textureX, textureY); // Box 136

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31.5F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 84, 1, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(-42F, 2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 42
		bodyModel[2].setRotationPoint(-31.5F, 2.8F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 44
		bodyModel[3].setRotationPoint(28.5F, 2.8F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[4].setRotationPoint(-43.51F, -5.5F, 1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 door L B end
		bodyModel[5].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[6].setRotationPoint(-43.5F, -4F, 2.5F);

		bodyModel[7].addShapeBox(0F, 0F, -1F, 13, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[7].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 0
		bodyModel[8].setRotationPoint(43F, 3F, -1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 86, 2, 5, 0F); // Box 0
		bodyModel[9].setRotationPoint(-43F, 3F, -2.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 0
		bodyModel[10].setRotationPoint(-48F, 3F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[11].setRotationPoint(28.5F, 5F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106 26 for half
		bodyModel[12].setRotationPoint(-26F, -25F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[13].setRotationPoint(-42F, 5F, 11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[14].setRotationPoint(-42F, 5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[15].setRotationPoint(37F, 5F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[16].setRotationPoint(37F, 5F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[17].setRotationPoint(42F, -5F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[18].setRotationPoint(38F, -8F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[19].setRotationPoint(42F, -5F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[20].setRotationPoint(-43F, -5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[21].setRotationPoint(-43F, -5F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[22].setRotationPoint(-42F, -8F, 11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[23].setRotationPoint(38F, -8F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[24].setRotationPoint(-42F, -8F, -12F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 10, 0F); // Box 87
		bodyModel[25].setRotationPoint(-44.5F, 2F, -5F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 87
		bodyModel[26].setRotationPoint(-42.5F, -5.5F, 1.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 29, 29, 1, 0F); // Box 3
		bodyModel[27].setRotationPoint(-42F, -24F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 29, 29, 1, 0F); // Box 5
		bodyModel[28].setRotationPoint(13F, -24F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 8
		bodyModel[29].setRotationPoint(-41F, -24F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 9
		bodyModel[30].setRotationPoint(40F, -24F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 82, 1, 22, 0F); // Box 38
		bodyModel[31].setRotationPoint(-41F, -25F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 46
		bodyModel[32].setRotationPoint(41F, -1F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 47
		bodyModel[33].setRotationPoint(41F, -5F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 63
		bodyModel[34].setRotationPoint(-42F, -9F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 64
		bodyModel[35].setRotationPoint(-42F, -5F, -10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 65
		bodyModel[36].setRotationPoint(-42F, -1F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		bodyModel[37].setRotationPoint(-42F, -25F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 83
		bodyModel[38].setRotationPoint(-42F, -25F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 84
		bodyModel[39].setRotationPoint(41F, -25F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 85
		bodyModel[40].setRotationPoint(41F, -25F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 29, 29, 1, 0F); // Box 104
		bodyModel[41].setRotationPoint(13F, -24F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 29, 29, 1, 0F); // Box 105
		bodyModel[42].setRotationPoint(-42F, -24F, 10F);

		bodyModel[43].addBox(0F, -0.5F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[43].setRotationPoint(-45.5F, 4F, 1.5F);
		bodyModel[43].rotateAngleY = 1.20427718F;

		bodyModel[44].addBox(-10F, -0.5F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[44].setRotationPoint(45.5F, 4F, -1.5F);
		bodyModel[44].rotateAngleY = 1.20427718F;

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 10, 0F); // Box 73
		bodyModel[45].setRotationPoint(41.5F, 2F, -5F);

		bodyModel[46].addShapeBox(-13F, 0F, -1F, 13, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[46].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[47].addShapeBox(-13F, 0F, 0F, 13, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[47].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 77
		bodyModel[48].setRotationPoint(41F, -13F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 78
		bodyModel[49].setRotationPoint(41F, -9F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 79
		bodyModel[50].setRotationPoint(41F, -21F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 80
		bodyModel[51].setRotationPoint(41F, -17F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 82
		bodyModel[52].setRotationPoint(-42F, -17F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 83
		bodyModel[53].setRotationPoint(-42F, -13F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 85
		bodyModel[54].setRotationPoint(-42F, -21F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 86
		bodyModel[55].setRotationPoint(-13F, 2F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 54, 1, 1, 0F); // Box 87
		bodyModel[56].setRotationPoint(-27F, 5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[57].setRotationPoint(-43F, -8F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 119
		bodyModel[58].setRotationPoint(-13F, 2F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 54, 1, 1, 0F); // Box 120
		bodyModel[59].setRotationPoint(-27F, 5F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[60].setRotationPoint(-13F, 3F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[61].setRotationPoint(-14F, -24F, -11.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		bodyModel[62].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[63].setRotationPoint(-14F, -25F, -12F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[64].setRotationPoint(-26F, 3F, -12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[65].setRotationPoint(-14F, -24F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[66].setRotationPoint(13F, -24F, 10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-13F, 3F, 10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 129
		bodyModel[68].setRotationPoint(-14F, -25F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[69].setRotationPoint(-26F, 3F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[70].setRotationPoint(-26F, -25F, 11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 132
		bodyModel[71].setRotationPoint(-43.25F, -3F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[72].setRotationPoint(-38F, -25F, -11.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		bodyModel[73].setRotationPoint(-32F, -25F, -11.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[74].setRotationPoint(-26F, -24F, -11.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
		bodyModel[75].setRotationPoint(-20F, -24F, -11.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
		bodyModel[76].setRotationPoint(25F, -24F, -11.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 138
		bodyModel[77].setRotationPoint(19F, -24F, -11.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 139
		bodyModel[78].setRotationPoint(37F, -25F, -11.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[79].setRotationPoint(31F, -25F, -11.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[80].setRotationPoint(-20F, -24F, 10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[81].setRotationPoint(-26F, -24F, 10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[82].setRotationPoint(-32F, -25F, 10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[83].setRotationPoint(-38F, -25F, 10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[84].setRotationPoint(19F, -24F, 10.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[85].setRotationPoint(25F, -24F, 10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[86].setRotationPoint(31F, -25F, 10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[87].setRotationPoint(37F, -25F, 10.5F);

		bodyModel[88].addShapeBox(1.5F, 8F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[88].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[89].addShapeBox(11.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[89].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[90].addShapeBox(-12.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[90].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[91].addShapeBox(-1.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[91].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[92].addShapeBox(0.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[92].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[93].addShapeBox(1.5F, 18F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[93].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[94].addShapeBox(-11.5F, 8F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[94].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[95].addShapeBox(-11.5F, 18F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[95].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[96].addShapeBox(0.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[96].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[97].addShapeBox(11.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[97].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[98].addShapeBox(1.5F, 8F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[98].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[99].addShapeBox(1.5F, 18F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[99].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[100].addShapeBox(-12.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[100].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[101].addShapeBox(-1.5F, 0F, -0.5F, 1, 27, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[101].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[102].addShapeBox(-11.5F, 8F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[102].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[103].addShapeBox(-11.5F, 18F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[103].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[104].addShapeBox(1.5F, 0F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[104].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[105].addShapeBox(-11.5F, 0F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[105].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[106].addShapeBox(1.5F, 26F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[106].setRotationPoint(-13F, -24F, -11.5F);

		bodyModel[107].addShapeBox(-11.5F, 26F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75 door L A end
		bodyModel[107].setRotationPoint(13F, -24F, -11.5F);

		bodyModel[108].addShapeBox(1.5F, 26F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[108].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[109].addShapeBox(-11.5F, 26F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[109].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[110].addShapeBox(1.5F, 0F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[110].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[111].addShapeBox(-11.5F, 0F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 door R A end
		bodyModel[111].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[112].addBox(2.5F, 0F, -0.5F, 1, 27, 0, 0F); // Box 149 door L B end
		bodyModel[112].setRotationPoint(-13F, -24F, -11.51F);

		bodyModel[113].addBox(9.5F, 0F, -0.5F, 1, 27, 0, 0F); // Box 149 door L B end
		bodyModel[113].setRotationPoint(-13F, -24F, -11.51F);

		bodyModel[114].addTrapezoid(-3.5F, 0F, -0.5F, 1, 27, 0, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 75 door L A end
		bodyModel[114].setRotationPoint(13F, -24F, -11.51F);

		bodyModel[115].addTrapezoid(-10.5F, 0F, -0.5F, 1, 27, 0, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 75 door L A end
		bodyModel[115].setRotationPoint(13F, -24F, -11.51F);

		bodyModel[116].addBox(-3.5F, 0F, 0.51F, 1, 27, 0, 0F); // Box 74 door R A end
		bodyModel[116].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[117].addBox(-10.5F, 0F, 0.51F, 1, 27, 0, 0F); // Box 74 door R A end
		bodyModel[117].setRotationPoint(13F, -24F, 11.5F);

		bodyModel[118].addBox(2.5F, 0F, 0.51F, 1, 27, 0, 0F); // Box 108 door R B end
		bodyModel[118].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[119].addBox(9.5F, 0F, 0.51F, 1, 27, 0, 0F); // Box 108 door R B end
		bodyModel[119].setRotationPoint(-13F, -24F, 11.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[120].setRotationPoint(27F, -1F, 10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[121].setRotationPoint(27F, -21F, 10.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 185
		bodyModel[122].setRotationPoint(26F, -21F, 11F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 186
		bodyModel[123].setRotationPoint(26F, -1F, 11F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 187
		bodyModel[124].setRotationPoint(26F, -1F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 188
		bodyModel[125].setRotationPoint(27F, -1F, -11.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 189
		bodyModel[126].setRotationPoint(26F, -21F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[127].setRotationPoint(27F, -21F, -11.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 191
		bodyModel[128].setRotationPoint(-31F, -1F, -11.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[129].setRotationPoint(-27F, -1F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 193
		bodyModel[130].setRotationPoint(-31F, -21F, -11.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 194
		bodyModel[131].setRotationPoint(-27F, -21F, -12F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 195
		bodyModel[132].setRotationPoint(-27F, -1F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[133].setRotationPoint(-31F, -1F, 10.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 197
		bodyModel[134].setRotationPoint(-27F, -21F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[135].setRotationPoint(-31F, -21F, 10.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[136].setRotationPoint(42F, -8F, -10F);
	}
	/*Model70Truck bogie = new Model70Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 137; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-2.03,0.575,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.75,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}*/
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 137; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.9,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.75,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}
}