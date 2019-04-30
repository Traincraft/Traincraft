//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.10.2018 - 10:29:06
// Last changed on: 30.10.2018 - 10:29:06

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelBP4 extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelBP4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[111];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 31 lamp
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38R
		bodyModel[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 40
		bodyModel[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 48 lamp
		bodyModel[28] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 77 lamp
		bodyModel[56] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 78 lamp
		bodyModel[57] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 88
		bodyModel[67] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 89
		bodyModel[68] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 91
		bodyModel[70] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 92 lamp
		bodyModel[71] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 93 lamp
		bodyModel[72] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // box64
		bodyModel[73] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // box65
		bodyModel[74] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 96
		bodyModel[75] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 98
		bodyModel[77] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 162 light
		bodyModel[78] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 101
		bodyModel[80] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 102
		bodyModel[81] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 108 liveryimg 1
		bodyModel[95] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 109 liveryimg 1
		bodyModel[96] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 115 liveryimg 2
		bodyModel[102] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 116 liveryimg 2
		bodyModel[103] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 117 liveryimg 2
		bodyModel[104] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 118 liveryimg 2
		bodyModel[105] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 119 liveryimg 3
		bodyModel[106] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 120 liveryimg 3
		bodyModel[107] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 163
		bodyModel[108] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 166
		bodyModel[109] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 168
		bodyModel[110] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 169

		bodyModel[0].addBox(0F, 0F, 0F, 74, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-11F, -3F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 2
		bodyModel[1].setRotationPoint(-15F, -11F, 3F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(-18F, -1F, 8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[3].setRotationPoint(67F, -1F, 8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 18, 1, 0F); // Box 9
		bodyModel[4].setRotationPoint(-5F, -21F, 20F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 18, 1, 0F); // Box 10
		bodyModel[5].setRotationPoint(-5F, -21F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-5F, -24F, -1F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 15
		bodyModel[7].setRotationPoint(-5F, -21F, 0F);

		bodyModel[8].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 19
		bodyModel[8].setRotationPoint(6F, -24F, 3F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 21
		bodyModel[9].setRotationPoint(5F, -21F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[10].setRotationPoint(45F, -26F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[11].setRotationPoint(-2F, -26F, 5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 27
		bodyModel[12].setRotationPoint(57F, -25.5F, 14F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
		bodyModel[13].setRotationPoint(57F, -26F, 13F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 29
		bodyModel[14].setRotationPoint(57F, -25.5F, 12F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 30
		bodyModel[15].setRotationPoint(58F, -25F, 13F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 31 lamp
		bodyModel[16].setRotationPoint(63.5F, -21F, 8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 33
		bodyModel[17].setRotationPoint(6F, -10F, -1F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 34
		bodyModel[18].setRotationPoint(6F, -7F, 17F);

		bodyModel[19].addBox(0F, 0F, 0F, 48, 8, 0, 0F); // Box 38R
		bodyModel[19].setRotationPoint(15F, -11F, 21.01F);

		bodyModel[20].addBox(0F, 0F, 0F, 26, 6, 20, 0F); // Box 40
		bodyModel[20].setRotationPoint(13F, -1F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[21].setRotationPoint(61F, -24F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[22].setRotationPoint(-12F, -16F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 13, 14, 0F); // Box 43
		bodyModel[23].setRotationPoint(-9F, -16F, 3F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 44
		bodyModel[24].setRotationPoint(-8F, -5F, -1F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 45
		bodyModel[25].setRotationPoint(-7F, -6F, 17F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 47
		bodyModel[26].setRotationPoint(-10F, -11F, 21.01F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 48 lamp
		bodyModel[27].setRotationPoint(-7F, -24F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 44
		bodyModel[28].setRotationPoint(-4F, -16F, 6F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 45
		bodyModel[29].setRotationPoint(-10F, -11F, -1.01F);

		bodyModel[30].addBox(0F, 0F, 0F, 53, 8, 0, 0F); // Box 46
		bodyModel[30].setRotationPoint(10F, -11F, -1.01F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(61F, -24F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-7F, -24F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(-7F, -24F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-12F, -16F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 46
		bodyModel[35].setRotationPoint(6F, -16F, -1F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 7, 14, 0F); // Box 47
		bodyModel[36].setRotationPoint(-15F, -3F, 3F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 48
		bodyModel[37].setRotationPoint(-15.01F, -3F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 53
		bodyModel[38].setRotationPoint(67.01F, -3F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(11F, -2F, 1F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 56
		bodyModel[40].setRotationPoint(-7F, -7F, -1F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 57
		bodyModel[41].setRotationPoint(-15F, 2F, 0F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 58
		bodyModel[42].setRotationPoint(-15F, 4F, -1F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 6, 22, 0F); // Box 59
		bodyModel[43].setRotationPoint(-10.99F, -2F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[44].setRotationPoint(-15.01F, -11F, 2F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(-15F, -5F, 20F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(-15.01F, -11F, 18F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(-15F, -5F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(-5F, -24F, 17F);

		bodyModel[49].addBox(0F, 0F, 0F, 11, 3, 14, 0F); // Box 65
		bodyModel[49].setRotationPoint(-5F, -24F, 3F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 6, 22, 0F); // Box 66
		bodyModel[50].setRotationPoint(62.99F, -2F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 69
		bodyModel[51].setRotationPoint(67F, -5F, 20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[52].setRotationPoint(66.99F, -11F, 18F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[53].setRotationPoint(66.99F, -11F, 2F);
		bodyModel[53].rotateAngleY = -3.14159265F;

		bodyModel[54].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 72
		bodyModel[54].setRotationPoint(67F, -5F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 77 lamp
		bodyModel[55].setRotationPoint(-15F, -5F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 78 lamp
		bodyModel[56].setRotationPoint(-15F, -5F, 15F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 79
		bodyModel[57].setRotationPoint(-15F, -11F, 13F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[58].setRotationPoint(-15F, -11F, 2F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[59].setRotationPoint(-15F, -11F, 17F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 82
		bodyModel[60].setRotationPoint(-15F, -10F, 13F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 83
		bodyModel[61].setRotationPoint(-15F, -10F, 6F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 84
		bodyModel[62].setRotationPoint(-15F, -11F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 85
		bodyModel[63].setRotationPoint(67F, -11F, 17F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 86
		bodyModel[64].setRotationPoint(67F, -11F, 13F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 87
		bodyModel[65].setRotationPoint(67F, -10F, 13F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 88
		bodyModel[66].setRotationPoint(67F, -11F, 7F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 89
		bodyModel[67].setRotationPoint(67F, -10F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 90
		bodyModel[68].setRotationPoint(67F, -11F, 3F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 91
		bodyModel[69].setRotationPoint(67F, -11F, 2F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 92 lamp
		bodyModel[70].setRotationPoint(66F, -5F, 3F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 93 lamp
		bodyModel[71].setRotationPoint(66F, -5F, 15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[72].setRotationPoint(-2F, -21F, 21F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[73].setRotationPoint(-2F, -21F, -2F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 96
		bodyModel[74].setRotationPoint(6F, -13F, 21.1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 97
		bodyModel[75].setRotationPoint(10F, -13F, 21.1F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 98
		bodyModel[76].setRotationPoint(9F, -12F, 21.1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[77].setRotationPoint(-5.68F, -26F, 9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[78].setRotationPoint(-5.5F, -25F, 9.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 33, 2, 14, 0F); // Box 101
		bodyModel[79].setRotationPoint(12F, -26F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[80].setRotationPoint(10F, -26F, 3F);

		bodyModel[81].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 88
		bodyModel[81].setRotationPoint(24F, -1F, -1F);
		bodyModel[81].rotateAngleX = 0.78539816F;

		bodyModel[82].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 89
		bodyModel[82].setRotationPoint(24F, -1F, 18F);
		bodyModel[82].rotateAngleX = 0.78539816F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[83].setRotationPoint(-17F, 3F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 98
		bodyModel[84].setRotationPoint(-17F, -1F, 12F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 99
		bodyModel[85].setRotationPoint(-15F, 0F, 1F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 16, 0F); // Box 100
		bodyModel[86].setRotationPoint(-15F, -2F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(-17F, 3F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(-17F, -1F, -1F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 7, 14, 0F); // Box 103
		bodyModel[89].setRotationPoint(63F, -3F, 3F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 0, 16, 0F); // Box 104
		bodyModel[90].setRotationPoint(63F, -2F, 2F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 105
		bodyModel[91].setRotationPoint(63F, 0F, 1F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 106
		bodyModel[92].setRotationPoint(63F, 2F, 0F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 107
		bodyModel[93].setRotationPoint(63F, 4F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 108 liveryimg 1
		bodyModel[94].setRotationPoint(-3F, -14F, -1.01F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 109 liveryimg 1
		bodyModel[95].setRotationPoint(-3F, -14F, 21.01F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[96].setRotationPoint(67F, -1F, 12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[97].setRotationPoint(67F, 3F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[98].setRotationPoint(67F, 3F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[99].setRotationPoint(67F, -1F, -1F);

		bodyModel[100].addBox(0F, 0F, 0F, 74, 2, 14, 0F); // Box 114
		bodyModel[100].setRotationPoint(-11F, -2F, 3F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[101].setRotationPoint(61.45F, -19F, 4F);
		bodyModel[101].rotateAngleY = -0.41887902F;

		bodyModel[102].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[102].setRotationPoint(61.45F, -19F, 16F);
		bodyModel[102].rotateAngleY = 0.41887902F;

		bodyModel[103].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[103].setRotationPoint(-5.05F, -23.5F, 4F);
		bodyModel[103].rotateAngleY = 0.38397244F;

		bodyModel[104].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[104].setRotationPoint(-5.05F, -23.5F, 16F);
		bodyModel[104].rotateAngleY = -0.38397244F;

		bodyModel[105].addBox(0F, 0F, 0F, 26, 6, 0, 0F); // Box 119 liveryimg 3
		bodyModel[105].setRotationPoint(16F, -20F, 2.99F);

		bodyModel[106].addBox(0F, 0F, 0F, 26, 6, 0, 0F); // Box 120 liveryimg 3
		bodyModel[106].setRotationPoint(16F, -20F, 17.01F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[107].setRotationPoint(-1F, 0F, 8F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[108].setRotationPoint(49F, 0F, 8F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 168
		bodyModel[109].setRotationPoint(0F, -2F, -0.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 169
		bodyModel[110].setRotationPoint(50F, -2F, -0.5F);
	}

	ModelBP4Bogie bogie = new ModelBP4Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(ModelRendererTurbo m :bodyModel)
		{
			m.render(f5);
		}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/bp4bogie.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1f,1f,0.9f);
		GL11.glTranslatef(-0.025f,0.025f,0.1f);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslatef(3.125f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

}