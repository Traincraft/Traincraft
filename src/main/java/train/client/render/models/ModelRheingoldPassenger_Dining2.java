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
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRheingoldPassenger_Dining2 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelRheingoldPassenger_Dining2()
	{
		rheingoldpassenger_dining2Model = new ModelRendererTurbo[121];
		rheingoldpassenger_dining2Model[0] = new ModelRendererTurbo(this, 36, 281, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		rheingoldpassenger_dining2Model[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 70
		rheingoldpassenger_dining2Model[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 193
		rheingoldpassenger_dining2Model[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 194
		rheingoldpassenger_dining2Model[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 195
		rheingoldpassenger_dining2Model[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 197
		rheingoldpassenger_dining2Model[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 198
		rheingoldpassenger_dining2Model[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 199
		rheingoldpassenger_dining2Model[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 200
		rheingoldpassenger_dining2Model[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 201
		rheingoldpassenger_dining2Model[11] = new ModelRendererTurbo(this, 55, 340, textureX, textureY); // Box 99
		rheingoldpassenger_dining2Model[12] = new ModelRendererTurbo(this, 46, 308, textureX, textureY); // Box 99
		rheingoldpassenger_dining2Model[13] = new ModelRendererTurbo(this, 56, 370, textureX, textureY); // Box 1
		rheingoldpassenger_dining2Model[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 110
		rheingoldpassenger_dining2Model[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 36
		rheingoldpassenger_dining2Model[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 36
		rheingoldpassenger_dining2Model[17] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 150
		rheingoldpassenger_dining2Model[18] = new ModelRendererTurbo(this, 40, 97, textureX, textureY); // Box 151
		rheingoldpassenger_dining2Model[19] = new ModelRendererTurbo(this, 6, 131, textureX, textureY); // Box 153
		rheingoldpassenger_dining2Model[20] = new ModelRendererTurbo(this, 56, 145, textureX, textureY); // Box 154
		rheingoldpassenger_dining2Model[21] = new ModelRendererTurbo(this, 56, 186, textureX, textureY); // Box 155
		rheingoldpassenger_dining2Model[22] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[23] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[24] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[25] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[26] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[28] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[29] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[30] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[31] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[32] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[33] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[34] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 169
		rheingoldpassenger_dining2Model[35] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 170
		rheingoldpassenger_dining2Model[36] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[37] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[38] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[39] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[40] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[41] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[42] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[43] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[44] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[45] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[46] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[47] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[48] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[49] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[50] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[51] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[52] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[53] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[54] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[55] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[56] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[57] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[58] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[59] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[60] = new ModelRendererTurbo(this, 482, 73, textureX, textureY); // Box 163
		rheingoldpassenger_dining2Model[61] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 164
		rheingoldpassenger_dining2Model[62] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 165
		rheingoldpassenger_dining2Model[63] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 166
		rheingoldpassenger_dining2Model[64] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 176
		rheingoldpassenger_dining2Model[65] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 182
		rheingoldpassenger_dining2Model[66] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 84
		rheingoldpassenger_dining2Model[67] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 85
		rheingoldpassenger_dining2Model[68] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 86
		rheingoldpassenger_dining2Model[69] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 87
		rheingoldpassenger_dining2Model[70] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 88
		rheingoldpassenger_dining2Model[71] = new ModelRendererTurbo(this, 132, 88, textureX, textureY); // Box 89
		rheingoldpassenger_dining2Model[72] = new ModelRendererTurbo(this, 65, 227, textureX, textureY); // Box 92
		rheingoldpassenger_dining2Model[73] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box55
		rheingoldpassenger_dining2Model[74] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box56
		rheingoldpassenger_dining2Model[75] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box57
		rheingoldpassenger_dining2Model[76] = new ModelRendererTurbo(this, 231, 112, textureX, textureY); // Box58
		rheingoldpassenger_dining2Model[77] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box59
		rheingoldpassenger_dining2Model[78] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box60
		rheingoldpassenger_dining2Model[79] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box61
		rheingoldpassenger_dining2Model[80] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box62
		rheingoldpassenger_dining2Model[81] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box63
		rheingoldpassenger_dining2Model[82] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box64
		rheingoldpassenger_dining2Model[83] = new ModelRendererTurbo(this, 247, 108, textureX, textureY); // Box65
		rheingoldpassenger_dining2Model[84] = new ModelRendererTurbo(this, 34, 84, textureX, textureY); // Box 86
		rheingoldpassenger_dining2Model[85] = new ModelRendererTurbo(this, 34, 84, textureX, textureY); // Box 87
		rheingoldpassenger_dining2Model[86] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 88
		rheingoldpassenger_dining2Model[87] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 89
		rheingoldpassenger_dining2Model[88] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 90
		rheingoldpassenger_dining2Model[89] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 91
		rheingoldpassenger_dining2Model[90] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 92
		rheingoldpassenger_dining2Model[91] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 93
		rheingoldpassenger_dining2Model[92] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 94
		rheingoldpassenger_dining2Model[93] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 95
		rheingoldpassenger_dining2Model[94] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 96
		rheingoldpassenger_dining2Model[95] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 97
		rheingoldpassenger_dining2Model[96] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 98
		rheingoldpassenger_dining2Model[97] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 99
		rheingoldpassenger_dining2Model[98] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 100
		rheingoldpassenger_dining2Model[99] = new ModelRendererTurbo(this, 9, 216, textureX, textureY); // Box 101
		rheingoldpassenger_dining2Model[100] = new ModelRendererTurbo(this, 340, 149, textureX, textureY); // Box 102
		rheingoldpassenger_dining2Model[101] = new ModelRendererTurbo(this, 341, 166, textureX, textureY); // Box 103
		rheingoldpassenger_dining2Model[102] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 104
		rheingoldpassenger_dining2Model[103] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 105
		rheingoldpassenger_dining2Model[104] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 106
		rheingoldpassenger_dining2Model[105] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 107
		rheingoldpassenger_dining2Model[106] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 108
		rheingoldpassenger_dining2Model[107] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 109
		rheingoldpassenger_dining2Model[108] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 110
		rheingoldpassenger_dining2Model[109] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 111
		rheingoldpassenger_dining2Model[110] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 112
		rheingoldpassenger_dining2Model[111] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 113
		rheingoldpassenger_dining2Model[112] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 114
		rheingoldpassenger_dining2Model[113] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 115
		rheingoldpassenger_dining2Model[114] = new ModelRendererTurbo(this, 382, 150, textureX, textureY); // Box 116
		rheingoldpassenger_dining2Model[115] = new ModelRendererTurbo(this, 343, 189, textureX, textureY); // Box 117
		rheingoldpassenger_dining2Model[116] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 93
		rheingoldpassenger_dining2Model[117] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 94
		rheingoldpassenger_dining2Model[118] = new ModelRendererTurbo(this, 281, 267, textureX, textureY); // Box 96
		rheingoldpassenger_dining2Model[119] = new ModelRendererTurbo(this, 298, 278, textureX, textureY); // Box 97
		rheingoldpassenger_dining2Model[120] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 99

		rheingoldpassenger_dining2Model[0].addShapeBox(0F, 0F, 0F, 83, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rheingoldpassenger_dining2Model[0].setRotationPoint(-61F, -26F, -8F);

		rheingoldpassenger_dining2Model[1].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
		rheingoldpassenger_dining2Model[1].setRotationPoint(-61F, -22F, -10F);

		rheingoldpassenger_dining2Model[2].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
		rheingoldpassenger_dining2Model[2].setRotationPoint(57F, -22F, -10F);

		rheingoldpassenger_dining2Model[3].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
		rheingoldpassenger_dining2Model[3].setRotationPoint(-63F, -20F, -6F);

		rheingoldpassenger_dining2Model[4].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
		rheingoldpassenger_dining2Model[4].setRotationPoint(-63F, -20F, 5F);

		rheingoldpassenger_dining2Model[5].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rheingoldpassenger_dining2Model[5].setRotationPoint(-63F, -2F, -5F);

		rheingoldpassenger_dining2Model[6].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		rheingoldpassenger_dining2Model[6].setRotationPoint(-63F, -21F, -5F);

		rheingoldpassenger_dining2Model[7].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		rheingoldpassenger_dining2Model[7].setRotationPoint(58F, -21F, -5F);

		rheingoldpassenger_dining2Model[8].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 199
		rheingoldpassenger_dining2Model[8].setRotationPoint(58F, -20F, 5F);

		rheingoldpassenger_dining2Model[9].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rheingoldpassenger_dining2Model[9].setRotationPoint(58F, -2F, -5F);

		rheingoldpassenger_dining2Model[10].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 201
		rheingoldpassenger_dining2Model[10].setRotationPoint(58F, -20F, -6F);

		rheingoldpassenger_dining2Model[11].addShapeBox(0F, 0F, 0F, 55, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining2Model[11].setRotationPoint(-61F, -24F, -11F);

		rheingoldpassenger_dining2Model[12].addShapeBox(0F, 0F, 0F, 64, 2, 22, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining2Model[12].setRotationPoint(-6F, -24F, -11F);

		rheingoldpassenger_dining2Model[13].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rheingoldpassenger_dining2Model[13].setRotationPoint(47F, -26F, -8F);

		rheingoldpassenger_dining2Model[14].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 110
		rheingoldpassenger_dining2Model[14].setRotationPoint(-61F, 0F, -11F);

		rheingoldpassenger_dining2Model[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassenger_dining2Model[15].setRotationPoint(-64F, -1F, 0F);

		rheingoldpassenger_dining2Model[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 36
		rheingoldpassenger_dining2Model[16].setRotationPoint(58F, -1F, 0F);

		rheingoldpassenger_dining2Model[17].addBox(0F, 0F, 0F, 1, 22, 14, 0F); // Box 150
		rheingoldpassenger_dining2Model[17].setRotationPoint(-6F, -22F, -4F);

		rheingoldpassenger_dining2Model[18].addBox(0F, 0F, 0F, 41, 22, 1, 0F); // Box 151
		rheingoldpassenger_dining2Model[18].setRotationPoint(-47F, -22F, -4F);

		rheingoldpassenger_dining2Model[19].addBox(0F, 0F, 0F, 1, 22, 14, 0F); // Box 153
		rheingoldpassenger_dining2Model[19].setRotationPoint(-48F, -22F, -4F);

		rheingoldpassenger_dining2Model[20].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 154
		rheingoldpassenger_dining2Model[20].setRotationPoint(-61F, -22F, 10F);

		rheingoldpassenger_dining2Model[21].addBox(0F, 0F, 0F, 119, 22, 1, 0F); // Box 155
		rheingoldpassenger_dining2Model[21].setRotationPoint(-61F, -22F, -11F);

		rheingoldpassenger_dining2Model[22].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[22].setRotationPoint(44F, -10F, 2F);

		rheingoldpassenger_dining2Model[23].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[23].setRotationPoint(45F, -10.2F, 3F);

		rheingoldpassenger_dining2Model[24].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[24].setRotationPoint(40F, -3F, 2F);

		rheingoldpassenger_dining2Model[25].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[25].setRotationPoint(41F, -1F, 2.5F);

		rheingoldpassenger_dining2Model[26].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[26].setRotationPoint(44F, -3F, 2F);

		rheingoldpassenger_dining2Model[27].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[27].setRotationPoint(40.45F, -5F, 1.5F);

		rheingoldpassenger_dining2Model[28].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[28].setRotationPoint(27F, -10F, 10F);
		rheingoldpassenger_dining2Model[28].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[29].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[29].setRotationPoint(26F, -10.2F, 9F);
		rheingoldpassenger_dining2Model[29].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[30].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[30].setRotationPoint(31F, -3F, 10F);
		rheingoldpassenger_dining2Model[30].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[31].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[31].setRotationPoint(30F, -1F, 9.5F);
		rheingoldpassenger_dining2Model[31].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[32].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[32].setRotationPoint(27F, -3F, 10F);
		rheingoldpassenger_dining2Model[32].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[33].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[33].setRotationPoint(30.45F, -5F, 2.5F);
		rheingoldpassenger_dining2Model[33].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[34].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		rheingoldpassenger_dining2Model[34].setRotationPoint(35F, -5F, 5F);

		rheingoldpassenger_dining2Model[35].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 170
		rheingoldpassenger_dining2Model[35].setRotationPoint(32F, -5.05F, 3F);

		rheingoldpassenger_dining2Model[36].addShapeBox(0F, 0F, 1F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[36].setRotationPoint(44F, -10F, -11F);

		rheingoldpassenger_dining2Model[37].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[37].setRotationPoint(45F, -10.2F, -9F);

		rheingoldpassenger_dining2Model[38].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[38].setRotationPoint(40F, -3F, -10F);

		rheingoldpassenger_dining2Model[39].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[39].setRotationPoint(41F, -1F, -9.5F);

		rheingoldpassenger_dining2Model[40].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[40].setRotationPoint(44F, -3F, -10F);

		rheingoldpassenger_dining2Model[41].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[41].setRotationPoint(40.45F, -5F, -2.5F);

		rheingoldpassenger_dining2Model[42].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[42].setRotationPoint(16F, -10F, 2F);

		rheingoldpassenger_dining2Model[43].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[43].setRotationPoint(17F, -10.2F, 3F);

		rheingoldpassenger_dining2Model[44].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[44].setRotationPoint(12F, -3F, 2F);

		rheingoldpassenger_dining2Model[45].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[45].setRotationPoint(13F, -1F, 2.5F);

		rheingoldpassenger_dining2Model[46].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[46].setRotationPoint(16F, -3F, 2F);

		rheingoldpassenger_dining2Model[47].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[47].setRotationPoint(12.45F, -5F, 1.5F);

		rheingoldpassenger_dining2Model[48].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[48].setRotationPoint(-1F, -10F, 10F);
		rheingoldpassenger_dining2Model[48].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[49].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[49].setRotationPoint(-2F, -10.2F, 9F);
		rheingoldpassenger_dining2Model[49].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[50].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[50].setRotationPoint(3F, -3F, 10F);
		rheingoldpassenger_dining2Model[50].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[51].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[51].setRotationPoint(2F, -1F, 9.5F);
		rheingoldpassenger_dining2Model[51].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[52].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[52].setRotationPoint(-1F, -3F, 10F);
		rheingoldpassenger_dining2Model[52].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[53].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[53].setRotationPoint(2.45F, -5F, 2.5F);
		rheingoldpassenger_dining2Model[53].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[54].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[54].setRotationPoint(16F, -10F, -10F);

		rheingoldpassenger_dining2Model[55].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[55].setRotationPoint(17F, -10.2F, -9F);

		rheingoldpassenger_dining2Model[56].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[56].setRotationPoint(12F, -3F, -10F);

		rheingoldpassenger_dining2Model[57].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[57].setRotationPoint(13F, -1F, -9.5F);

		rheingoldpassenger_dining2Model[58].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[58].setRotationPoint(16F, -3F, -10F);

		rheingoldpassenger_dining2Model[59].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[59].setRotationPoint(12.45F, -5F, -2.5F);

		rheingoldpassenger_dining2Model[60].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rheingoldpassenger_dining2Model[60].setRotationPoint(27F, -10F, -2F);
		rheingoldpassenger_dining2Model[60].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[61].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
		rheingoldpassenger_dining2Model[61].setRotationPoint(26F, -10.2F, -3F);
		rheingoldpassenger_dining2Model[61].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[62].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
		rheingoldpassenger_dining2Model[62].setRotationPoint(31F, -3F, -2F);
		rheingoldpassenger_dining2Model[62].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[63].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
		rheingoldpassenger_dining2Model[63].setRotationPoint(30F, -1F, -2.5F);
		rheingoldpassenger_dining2Model[63].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[64].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rheingoldpassenger_dining2Model[64].setRotationPoint(27F, -3F, -2F);
		rheingoldpassenger_dining2Model[64].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[65].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 182
		rheingoldpassenger_dining2Model[65].setRotationPoint(30.45F, -5F, -1.5F);
		rheingoldpassenger_dining2Model[65].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[66].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 84
		rheingoldpassenger_dining2Model[66].setRotationPoint(4F, -5.05F, 3F);

		rheingoldpassenger_dining2Model[67].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 85
		rheingoldpassenger_dining2Model[67].setRotationPoint(4F, -5.05F, -10F);

		rheingoldpassenger_dining2Model[68].addBox(0F, 0F, 0F, 7, 0, 7, 0F); // Box 86
		rheingoldpassenger_dining2Model[68].setRotationPoint(32F, -5.05F, -10F);

		rheingoldpassenger_dining2Model[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 87
		rheingoldpassenger_dining2Model[69].setRotationPoint(7F, -5F, 5F);

		rheingoldpassenger_dining2Model[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 88
		rheingoldpassenger_dining2Model[70].setRotationPoint(7F, -5F, -6F);

		rheingoldpassenger_dining2Model[71].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 89
		rheingoldpassenger_dining2Model[71].setRotationPoint(35F, -5F, -6F);

		rheingoldpassenger_dining2Model[72].addShapeBox(0F, 0F, 0F, 66, 2, 22, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rheingoldpassenger_dining2Model[72].setRotationPoint(-33F, 1F, -11F);

		rheingoldpassenger_dining2Model[73].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F); // Box55
		rheingoldpassenger_dining2Model[73].setRotationPoint(35F, -25F, 1F);
		rheingoldpassenger_dining2Model[73].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[74].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, -1F, 0F, 0F); // Box56
		rheingoldpassenger_dining2Model[74].setRotationPoint(35F, -28.5F, 3F);
		rheingoldpassenger_dining2Model[74].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[75].addShapeBox(-2F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box57
		rheingoldpassenger_dining2Model[75].setRotationPoint(39F, -29.5F, -4F);

		rheingoldpassenger_dining2Model[76].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, -1F, 0F, 0F); // Box58
		rheingoldpassenger_dining2Model[76].setRotationPoint(35F, -28.5F, -1F);
		rheingoldpassenger_dining2Model[76].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box59
		rheingoldpassenger_dining2Model[77].setRotationPoint(34F, -29.5F, -4F);

		rheingoldpassenger_dining2Model[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box60
		rheingoldpassenger_dining2Model[78].setRotationPoint(34F, -29.5F, 5F);

		rheingoldpassenger_dining2Model[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box61
		rheingoldpassenger_dining2Model[79].setRotationPoint(37F, -29.5F, 5F);

		rheingoldpassenger_dining2Model[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box62
		rheingoldpassenger_dining2Model[80].setRotationPoint(37F, -29.5F, -6F);

		rheingoldpassenger_dining2Model[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box63
		rheingoldpassenger_dining2Model[81].setRotationPoint(34F, -29.5F, -6F);

		rheingoldpassenger_dining2Model[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box64
		rheingoldpassenger_dining2Model[82].setRotationPoint(34F, -28.5F, -4F);

		rheingoldpassenger_dining2Model[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box65
		rheingoldpassenger_dining2Model[83].setRotationPoint(34F, -28.5F, 4F);

		rheingoldpassenger_dining2Model[84].addBox(0F, 0F, 0F, 25, 0, 1, 0F); // Box 86
		rheingoldpassenger_dining2Model[84].setRotationPoint(22F, -25.5F, 5F);

		rheingoldpassenger_dining2Model[85].addBox(0F, 0F, 0F, 25, 0, 1, 0F); // Box 87
		rheingoldpassenger_dining2Model[85].setRotationPoint(22F, -25.5F, -6F);

		rheingoldpassenger_dining2Model[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 88
		rheingoldpassenger_dining2Model[86].setRotationPoint(25F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 89
		rheingoldpassenger_dining2Model[87].setRotationPoint(25F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 90
		rheingoldpassenger_dining2Model[88].setRotationPoint(25F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 91
		rheingoldpassenger_dining2Model[89].setRotationPoint(43F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 92
		rheingoldpassenger_dining2Model[90].setRotationPoint(43F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 93
		rheingoldpassenger_dining2Model[91].setRotationPoint(43F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 94
		rheingoldpassenger_dining2Model[92].setRotationPoint(43F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 95
		rheingoldpassenger_dining2Model[93].setRotationPoint(37F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 96
		rheingoldpassenger_dining2Model[94].setRotationPoint(37F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 97
		rheingoldpassenger_dining2Model[95].setRotationPoint(31F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 98
		rheingoldpassenger_dining2Model[96].setRotationPoint(31F, -25.49F, -6F);

		rheingoldpassenger_dining2Model[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 99
		rheingoldpassenger_dining2Model[97].setRotationPoint(31F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 100
		rheingoldpassenger_dining2Model[98].setRotationPoint(31F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F); // Box 101
		rheingoldpassenger_dining2Model[99].setRotationPoint(37F, -25.49F, 5F);

		rheingoldpassenger_dining2Model[100].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 102
		rheingoldpassenger_dining2Model[100].setRotationPoint(40F, -27F, -3F);

		rheingoldpassenger_dining2Model[101].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, -2.8F, -1F, 0F, -2.8F, -1F, 0F, -2.8F, -1F, 0F, -2.8F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 103
		rheingoldpassenger_dining2Model[101].setRotationPoint(40F, -30F, -3F);

		rheingoldpassenger_dining2Model[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rheingoldpassenger_dining2Model[102].setRotationPoint(45F, -26.5F, 1.5F);

		rheingoldpassenger_dining2Model[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rheingoldpassenger_dining2Model[103].setRotationPoint(42F, -26.5F, -3F);
		rheingoldpassenger_dining2Model[103].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rheingoldpassenger_dining2Model[104].setRotationPoint(43.5F, -26.5F, -3F);
		rheingoldpassenger_dining2Model[104].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 107
		rheingoldpassenger_dining2Model[105].setRotationPoint(45F, -26.5F, -0.5F);

		rheingoldpassenger_dining2Model[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 108
		rheingoldpassenger_dining2Model[106].setRotationPoint(45F, -26.5F, -2.5F);

		rheingoldpassenger_dining2Model[107].addShapeBox(0F, 0F, -5F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 109
		rheingoldpassenger_dining2Model[107].setRotationPoint(45.5F, -26.5F, -3F);
		rheingoldpassenger_dining2Model[107].rotateAngleY = -1.57079633F;

		rheingoldpassenger_dining2Model[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 110
		rheingoldpassenger_dining2Model[108].setRotationPoint(45F, -26.5F, -2.5F);

		rheingoldpassenger_dining2Model[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 111
		rheingoldpassenger_dining2Model[109].setRotationPoint(40F, -26.5F, 2.5F);
		rheingoldpassenger_dining2Model[109].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 112
		rheingoldpassenger_dining2Model[110].setRotationPoint(40F, -26.5F, 0.5F);
		rheingoldpassenger_dining2Model[110].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rheingoldpassenger_dining2Model[111].setRotationPoint(40F, -26.5F, -1.5F);
		rheingoldpassenger_dining2Model[111].rotateAngleY = -3.14159265F;

		rheingoldpassenger_dining2Model[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rheingoldpassenger_dining2Model[112].setRotationPoint(41.5F, -26.5F, 3F);
		rheingoldpassenger_dining2Model[112].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 115
		rheingoldpassenger_dining2Model[113].setRotationPoint(43F, -26.5F, 3F);
		rheingoldpassenger_dining2Model[113].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 116
		rheingoldpassenger_dining2Model[114].setRotationPoint(44.5F, -26.5F, 3F);
		rheingoldpassenger_dining2Model[114].rotateAngleY = -4.71238898F;

		rheingoldpassenger_dining2Model[115].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.75F, -2.25F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0.75F, -2.25F, 0F, 0.75F, -0.75F, -1F, 0F, -2.7F, 0F, 0F, -2.7F, -1F, 0.75F, -0.75F, 0F); // Box 117
		rheingoldpassenger_dining2Model[115].setRotationPoint(36F, -27F, -1F);

		rheingoldpassenger_dining2Model[116].addBox(0F, 0F, 0F, 9, 8, 4, 0F); // Box 93
		rheingoldpassenger_dining2Model[116].setRotationPoint(-15F, -8F, -3F);

		rheingoldpassenger_dining2Model[117].addBox(0F, 0F, 0F, 9, 8, 4, 0F); // Box 94
		rheingoldpassenger_dining2Model[117].setRotationPoint(-25F, -8F, -3F);

		rheingoldpassenger_dining2Model[118].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 96
		rheingoldpassenger_dining2Model[118].setRotationPoint(-27F, -19F, -3F);

		rheingoldpassenger_dining2Model[119].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 97
		rheingoldpassenger_dining2Model[119].setRotationPoint(-18F, -22F, -3F);

		rheingoldpassenger_dining2Model[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rheingoldpassenger_dining2Model[120].setRotationPoint(-17F, -18.5F, -3F);

		fixRotation(rheingoldpassenger_dining2Model, false, true, true);
	}

	private ModelDeiticBogie bogie1 = new ModelDeiticBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 121; i++)
		{
			rheingoldpassenger_dining2Model[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Class85_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-3.35,-0.32,0);
		GL11.glScaled(0.7,0.7,0.9);
		GL11.glRotated(90,0,1,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(2.5,-0.32,0);
		GL11.glScaled(0.7,0.7,0.9);
		GL11.glRotated(90,0,1,0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rheingoldpassenger_dining2Model[];
}