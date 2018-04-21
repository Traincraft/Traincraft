//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:17.02.2018 - 17:42:19
// Last changed on: 17.02.2018 - 17:42:19

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelHeavyweight extends ModelBase
{
	int textureX = 512;
	int textureY = 128;

	public ModelHeavyweight()
	{
		heavyweightModel = new ModelRendererTurbo[91];
		heavyweightModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		heavyweightModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		heavyweightModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		heavyweightModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		heavyweightModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		heavyweightModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		heavyweightModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		heavyweightModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		heavyweightModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		heavyweightModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		heavyweightModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 13
		heavyweightModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		heavyweightModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		heavyweightModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
		heavyweightModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		heavyweightModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 18
		heavyweightModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		heavyweightModel[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 20
		heavyweightModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 21
		heavyweightModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 22
		heavyweightModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 23
		heavyweightModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		heavyweightModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
		heavyweightModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		heavyweightModel[24] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 27
		heavyweightModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 28
		heavyweightModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 48
		heavyweightModel[27] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 49
		heavyweightModel[28] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 50
		heavyweightModel[29] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 61
		heavyweightModel[30] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 62
		heavyweightModel[31] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 66
		heavyweightModel[32] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 100
		heavyweightModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 98
		heavyweightModel[34] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 99
		heavyweightModel[35] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 100
		heavyweightModel[36] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 101
		heavyweightModel[37] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 104
		heavyweightModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 105
		heavyweightModel[39] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 106
		heavyweightModel[40] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 107
		heavyweightModel[41] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 108
		heavyweightModel[42] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 110
		heavyweightModel[43] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 111
		heavyweightModel[44] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 112
		heavyweightModel[45] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 113
		heavyweightModel[46] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 111
		heavyweightModel[47] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 112
		heavyweightModel[48] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 114
		heavyweightModel[49] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 115
		heavyweightModel[50] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 116
		heavyweightModel[51] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 117
		heavyweightModel[52] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 118
		heavyweightModel[53] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 119
		heavyweightModel[54] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 129
		heavyweightModel[55] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 130
		heavyweightModel[56] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 133
		heavyweightModel[57] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 138
		heavyweightModel[58] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 139
		heavyweightModel[59] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 133
		heavyweightModel[60] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 135
		heavyweightModel[61] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 136
		heavyweightModel[62] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 137
		heavyweightModel[63] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 138
		heavyweightModel[64] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 141
		heavyweightModel[65] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 142
		heavyweightModel[66] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 143
		heavyweightModel[67] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 144
		heavyweightModel[68] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 145
		heavyweightModel[69] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 146
		heavyweightModel[70] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 147
		heavyweightModel[71] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 148
		heavyweightModel[72] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 149
		heavyweightModel[73] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 137
		heavyweightModel[74] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 138
		heavyweightModel[75] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 139
		heavyweightModel[76] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 140
		heavyweightModel[77] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 141
		heavyweightModel[78] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 142
		heavyweightModel[79] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 143
		heavyweightModel[80] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 144
		heavyweightModel[81] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 145
		heavyweightModel[82] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 146
		heavyweightModel[83] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 147
		heavyweightModel[84] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 148
		heavyweightModel[85] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 149
		heavyweightModel[86] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 92
		heavyweightModel[87] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 94
		heavyweightModel[88] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 95
		heavyweightModel[89] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 96
		heavyweightModel[90] = new ModelRendererTurbo(this, 432, 99, textureX, textureY); // Box 97

		heavyweightModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		heavyweightModel[0].setRotationPoint(-44F, 4F, 5.99F);

		heavyweightModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		heavyweightModel[1].setRotationPoint(-33F, 4F, 5.99F);

		heavyweightModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 3
		heavyweightModel[2].setRotationPoint(-22F, 4F, 5.99F);

		heavyweightModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 4
		heavyweightModel[3].setRotationPoint(-44F, 4F, -5.99F);

		heavyweightModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
		heavyweightModel[4].setRotationPoint(-33F, 4F, -5.99F);

		heavyweightModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 6
		heavyweightModel[5].setRotationPoint(-22F, 4F, -5.99F);

		heavyweightModel[6].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 9
		heavyweightModel[6].setRotationPoint(-42F, 6F, 0F);

		heavyweightModel[7].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 10
		heavyweightModel[7].setRotationPoint(-31F, 6F, 0F);

		heavyweightModel[8].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 11
		heavyweightModel[8].setRotationPoint(-20F, 6F, 0F);

		heavyweightModel[9].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 12
		heavyweightModel[9].setRotationPoint(-46F, 4F, 6F);

		heavyweightModel[10].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 13
		heavyweightModel[10].setRotationPoint(-46F, 4F, -7F);

		heavyweightModel[11].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 14
		heavyweightModel[11].setRotationPoint(-46F, 4F, 0F);

		heavyweightModel[12].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 15
		heavyweightModel[12].setRotationPoint(-15F, 4F, 0F);

		heavyweightModel[13].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 16
		heavyweightModel[13].setRotationPoint(14F, 4F, 0F);

		heavyweightModel[14].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 17
		heavyweightModel[14].setRotationPoint(14F, 4F, -7F);

		heavyweightModel[15].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 18
		heavyweightModel[15].setRotationPoint(18F, 6F, 0F);

		heavyweightModel[16].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 19
		heavyweightModel[16].setRotationPoint(16F, 4F, 5.99F);

		heavyweightModel[17].addBox(0F, 0F, 0F, 32, 5, 1, 0F); // Box 20
		heavyweightModel[17].setRotationPoint(14F, 4F, 6F);

		heavyweightModel[18].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 21
		heavyweightModel[18].setRotationPoint(27F, 4F, 5.99F);

		heavyweightModel[19].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 22
		heavyweightModel[19].setRotationPoint(29F, 6F, 0F);

		heavyweightModel[20].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 23
		heavyweightModel[20].setRotationPoint(38F, 4F, 5.99F);

		heavyweightModel[21].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 24
		heavyweightModel[21].setRotationPoint(40F, 6F, 0F);

		heavyweightModel[22].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 25
		heavyweightModel[22].setRotationPoint(45F, 4F, 0F);

		heavyweightModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 26
		heavyweightModel[23].setRotationPoint(16F, 4F, -5.99F);

		heavyweightModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		heavyweightModel[24].setRotationPoint(27F, 4F, -5.99F);

		heavyweightModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 28
		heavyweightModel[25].setRotationPoint(38F, 4F, -5.99F);

		heavyweightModel[26].addBox(0F, 0F, -10F, 94, 1, 20, 0F); // Box 48
		heavyweightModel[26].setRotationPoint(-47F, 1F, 0F);

		heavyweightModel[27].addBox(0F, 0F, -6F, 30, 2, 12, 0F); // Box 49
		heavyweightModel[27].setRotationPoint(-45F, 2F, 0F);

		heavyweightModel[28].addBox(0F, 0F, -6F, 30, 2, 12, 0F); // Box 50
		heavyweightModel[28].setRotationPoint(15F, 2F, 0F);

		heavyweightModel[29].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 61
		heavyweightModel[29].setRotationPoint(-55F, -22F, -11F);

		heavyweightModel[30].addBox(0F, 0F, 0F, 1, 25, 6, 0F); // Box 62
		heavyweightModel[30].setRotationPoint(-56F, -22F, 5F);

		heavyweightModel[31].addBox(0F, 0F, -10F, 8, 1, 20, 0F); // Box 66
		heavyweightModel[31].setRotationPoint(-55F, 1F, 0F);

		heavyweightModel[32].addBox(0F, 0F, 0F, 21, 21, 0, 0F); // Box 100
		heavyweightModel[32].setRotationPoint(-35F, -20F, -10F);

		heavyweightModel[33].addShapeBox(0F, 0F, 0F, 102, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		heavyweightModel[33].setRotationPoint(-51F, -25F, 7F);

		heavyweightModel[34].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 99
		heavyweightModel[34].setRotationPoint(-58F, -20F, 4F);

		heavyweightModel[35].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 100
		heavyweightModel[35].setRotationPoint(-58F, -20F, -6F);

		heavyweightModel[36].addShapeBox(0F, 0F, -6F, 1, 3, 12, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		heavyweightModel[36].setRotationPoint(-58F, -23F, 0F);

		heavyweightModel[37].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 104
		heavyweightModel[37].setRotationPoint(-58F, 0F, 0F);

		heavyweightModel[38].addShapeBox(0F, 0F, 0F, 102, 3, 4, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		heavyweightModel[38].setRotationPoint(-51F, -25F, -11F);

		heavyweightModel[39].addShapeBox(0F, 0F, -7F, 5, 5, 14, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		heavyweightModel[39].setRotationPoint(-56F, -27F, 0F);

		heavyweightModel[40].addShapeBox(0F, 0F, -7F, 5, 5, 14, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		heavyweightModel[40].setRotationPoint(51F, -27F, 0F);

		heavyweightModel[41].addBox(0F, 0F, -7F, 102, 2, 14, 0F); // Box 108
		heavyweightModel[41].setRotationPoint(-51F, -27F, 0F);

		heavyweightModel[42].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 110
		heavyweightModel[42].setRotationPoint(-57F, -20F, 4F);

		heavyweightModel[43].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 111
		heavyweightModel[43].setRotationPoint(-57F, -20F, -5F);

		heavyweightModel[44].addBox(0F, 0F, -4F, 3, 1, 8, 0F); // Box 112
		heavyweightModel[44].setRotationPoint(-58F, -20F, 0F);

		heavyweightModel[45].addBox(0F, 0F, -5F, 2, 1, 10, 0F); // Box 113
		heavyweightModel[45].setRotationPoint(-57F, 0F, 0F);

		heavyweightModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.5F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 111
		heavyweightModel[46].setRotationPoint(-56F, -25F, -11F);

		heavyweightModel[47].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.5F, -1F, -1.5F, 0F, 0F, -4F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		heavyweightModel[47].setRotationPoint(-56F, -25F, -11F);

		heavyweightModel[48].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, -4F, -1.5F, -1F, -1.5F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		heavyweightModel[48].setRotationPoint(51F, -25F, -11F);

		heavyweightModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -1F, -1.5F, -1.5F, -1F, -1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		heavyweightModel[49].setRotationPoint(51F, -25F, -11F);

		heavyweightModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -1.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 116
		heavyweightModel[50].setRotationPoint(51F, -25F, 7F);

		heavyweightModel[51].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1.5F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		heavyweightModel[51].setRotationPoint(51F, -25F, 7F);

		heavyweightModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.5F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 118
		heavyweightModel[52].setRotationPoint(-56F, -25F, 7F);

		heavyweightModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -1.5F, -1F, -1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		heavyweightModel[53].setRotationPoint(-56F, -25F, 7F);

		heavyweightModel[54].addBox(0F, 0F, 0F, 1, 25, 6, 0F); // Box 129
		heavyweightModel[54].setRotationPoint(-56F, -22F, -11F);

		heavyweightModel[55].addBox(0F, 0F, -5F, 1, 2, 10, 0F); // Box 130
		heavyweightModel[55].setRotationPoint(-56F, -22F, 0F);

		heavyweightModel[56].addBox(0F, 0F, -5F, 1, 2, 10, 0F); // Box 133
		heavyweightModel[56].setRotationPoint(-56F, 1F, 0F);

		heavyweightModel[57].addBox(0F, 0F, -1.5F, 13, 2, 3, 0F); // Box 138
		heavyweightModel[57].setRotationPoint(46F, 4F, 0F);

		heavyweightModel[58].addBox(0F, 0F, -1.5F, 13, 2, 3, 0F); // Box 139
		heavyweightModel[58].setRotationPoint(-59F, 4F, 0F);

		heavyweightModel[59].addBox(0F, 0F, -10F, 8, 1, 20, 0F); // Box 133
		heavyweightModel[59].setRotationPoint(47F, 1F, 0F);

		heavyweightModel[60].addBox(0F, 0F, 0F, 21, 21, 0, 0F); // Box 135
		heavyweightModel[60].setRotationPoint(14F, -20F, -10F);

		heavyweightModel[61].addBox(0F, 0F, 0F, 1, 25, 6, 0F); // Box 136
		heavyweightModel[61].setRotationPoint(55F, -22F, -11F);

		heavyweightModel[62].addBox(0F, 0F, -5F, 1, 2, 10, 0F); // Box 137
		heavyweightModel[62].setRotationPoint(55F, -22F, 0F);

		heavyweightModel[63].addBox(0F, 0F, 0F, 1, 25, 6, 0F); // Box 138
		heavyweightModel[63].setRotationPoint(55F, -22F, 5F);

		heavyweightModel[64].addBox(0F, 0F, -5F, 2, 1, 10, 0F); // Box 141
		heavyweightModel[64].setRotationPoint(55F, 0F, 0F);

		heavyweightModel[65].addBox(0F, 0F, -5F, 1, 2, 10, 0F); // Box 142
		heavyweightModel[65].setRotationPoint(55F, 1F, 0F);

		heavyweightModel[66].addBox(0F, 0F, -6F, 1, 2, 12, 0F); // Box 143
		heavyweightModel[66].setRotationPoint(57F, 0F, 0F);

		heavyweightModel[67].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 144
		heavyweightModel[67].setRotationPoint(57F, -20F, 4F);

		heavyweightModel[68].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 145
		heavyweightModel[68].setRotationPoint(57F, -20F, -6F);

		heavyweightModel[69].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 146
		heavyweightModel[69].setRotationPoint(55F, -20F, -5F);

		heavyweightModel[70].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 147
		heavyweightModel[70].setRotationPoint(55F, -20F, 4F);

		heavyweightModel[71].addBox(0F, 0F, -4F, 3, 1, 8, 0F); // Box 148
		heavyweightModel[71].setRotationPoint(55F, -20F, 0F);

		heavyweightModel[72].addShapeBox(0F, 0F, -6F, 1, 3, 12, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		heavyweightModel[72].setRotationPoint(57F, -23F, 0F);

		heavyweightModel[73].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 137
		heavyweightModel[73].setRotationPoint(-35F, -22F, -11F);

		heavyweightModel[74].addBox(0F, 0F, 0F, 28, 25, 1, 0F); // Box 138
		heavyweightModel[74].setRotationPoint(-14F, -22F, -11F);

		heavyweightModel[75].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 139
		heavyweightModel[75].setRotationPoint(14F, -22F, -11F);

		heavyweightModel[76].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 140
		heavyweightModel[76].setRotationPoint(35F, -22F, -11F);

		heavyweightModel[77].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 141
		heavyweightModel[77].setRotationPoint(35F, -22F, 10F);

		heavyweightModel[78].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 142
		heavyweightModel[78].setRotationPoint(14F, -22F, 10F);

		heavyweightModel[79].addBox(0F, 0F, 0F, 28, 25, 1, 0F); // Box 143
		heavyweightModel[79].setRotationPoint(-14F, -22F, 10F);

		heavyweightModel[80].addBox(0F, 0F, 0F, 21, 21, 0, 0F); // Box 144
		heavyweightModel[80].setRotationPoint(14F, -20F, 10F);

		heavyweightModel[81].addBox(0F, 0F, 0F, 21, 21, 0, 0F); // Box 145
		heavyweightModel[81].setRotationPoint(-35F, -20F, 10F);

		heavyweightModel[82].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 146
		heavyweightModel[82].setRotationPoint(-55F, -22F, 10F);

		heavyweightModel[83].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 147
		heavyweightModel[83].setRotationPoint(-35F, -22F, 10F);

		heavyweightModel[84].addBox(0F, 0F, 0F, 0, 19, 8, 0F); // Box 148
		heavyweightModel[84].setRotationPoint(-57F, -19F, -4F);

		heavyweightModel[85].addBox(0F, 0F, 0F, 0, 19, 8, 0F); // Box 149
		heavyweightModel[85].setRotationPoint(57F, -19F, -4F);

		heavyweightModel[86].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 92
		heavyweightModel[86].setRotationPoint(14F, 2F, 10F);

		heavyweightModel[87].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 94
		heavyweightModel[87].setRotationPoint(-22F, 2F, 10F);

		heavyweightModel[88].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 95
		heavyweightModel[88].setRotationPoint(-22F, 2F, -10F);

		heavyweightModel[89].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 96
		heavyweightModel[89].setRotationPoint(14F, 2F, -10F);

		heavyweightModel[90].addBox(0F, 0F, -9F, 16, 5, 18, 0F); // Box 97
		heavyweightModel[90].setRotationPoint(-8F, 2F, 0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 91; i++)
		{
			heavyweightModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo heavyweightModel[];
}