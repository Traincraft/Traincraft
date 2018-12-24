//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.11.2018 - 18:18:15
// Last changed on: 05.11.2018 - 18:18:15

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelHeavyweightBaggage extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelHeavyweightBaggage()
	{
		heavyweightboxcarModel = new ModelRendererTurbo[79];
		heavyweightboxcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		heavyweightboxcarModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		heavyweightboxcarModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		heavyweightboxcarModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		heavyweightboxcarModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		heavyweightboxcarModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		heavyweightboxcarModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		heavyweightboxcarModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		heavyweightboxcarModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		heavyweightboxcarModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		heavyweightboxcarModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 13
		heavyweightboxcarModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 14
		heavyweightboxcarModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		heavyweightboxcarModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 21
		heavyweightboxcarModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		heavyweightboxcarModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 23
		heavyweightboxcarModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 24
		heavyweightboxcarModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 25
		heavyweightboxcarModel[18] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 54
		heavyweightboxcarModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 60
		heavyweightboxcarModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 61
		heavyweightboxcarModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 63
		heavyweightboxcarModel[22] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 64
		heavyweightboxcarModel[23] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 65
		heavyweightboxcarModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 70
		heavyweightboxcarModel[25] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		heavyweightboxcarModel[26] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 72
		heavyweightboxcarModel[27] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 73
		heavyweightboxcarModel[28] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 74
		heavyweightboxcarModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 75
		heavyweightboxcarModel[30] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 76
		heavyweightboxcarModel[31] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 78
		heavyweightboxcarModel[32] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 82
		heavyweightboxcarModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 86
		heavyweightboxcarModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 87
		heavyweightboxcarModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 88
		heavyweightboxcarModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 89
		heavyweightboxcarModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 90
		heavyweightboxcarModel[38] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 91
		heavyweightboxcarModel[39] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 82
		heavyweightboxcarModel[40] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 85
		heavyweightboxcarModel[41] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 104
		heavyweightboxcarModel[42] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 105
		heavyweightboxcarModel[43] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 106
		heavyweightboxcarModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 107
		heavyweightboxcarModel[45] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108
		heavyweightboxcarModel[46] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 109
		heavyweightboxcarModel[47] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 110
		heavyweightboxcarModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 111
		heavyweightboxcarModel[49] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 112
		heavyweightboxcarModel[50] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 113
		heavyweightboxcarModel[51] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 114
		heavyweightboxcarModel[52] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 115
		heavyweightboxcarModel[53] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 116
		heavyweightboxcarModel[54] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 117
		heavyweightboxcarModel[55] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 118
		heavyweightboxcarModel[56] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 119
		heavyweightboxcarModel[57] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 120
		heavyweightboxcarModel[58] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 121
		heavyweightboxcarModel[59] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 122
		heavyweightboxcarModel[60] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 123
		heavyweightboxcarModel[61] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 124
		heavyweightboxcarModel[62] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 125
		heavyweightboxcarModel[63] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 126
		heavyweightboxcarModel[64] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 127
		heavyweightboxcarModel[65] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 129
		heavyweightboxcarModel[66] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 130
		heavyweightboxcarModel[67] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 131
		heavyweightboxcarModel[68] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 132
		heavyweightboxcarModel[69] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 133
		heavyweightboxcarModel[70] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 134
		heavyweightboxcarModel[71] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 135
		heavyweightboxcarModel[72] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 136
		heavyweightboxcarModel[73] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 75
		heavyweightboxcarModel[74] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 76
		heavyweightboxcarModel[75] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 77
		heavyweightboxcarModel[76] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		heavyweightboxcarModel[77] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 79
		heavyweightboxcarModel[78] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 80

		heavyweightboxcarModel[0].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 3
		heavyweightboxcarModel[0].setRotationPoint(-77F, -20F, 4F);

		heavyweightboxcarModel[1].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 4
		heavyweightboxcarModel[1].setRotationPoint(-77F, -20F, -6F);

		heavyweightboxcarModel[2].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 5
		heavyweightboxcarModel[2].setRotationPoint(-77F, 0F, -6F);

		heavyweightboxcarModel[3].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 6
		heavyweightboxcarModel[3].setRotationPoint(-77F, -23F, -6F);

		heavyweightboxcarModel[4].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 7
		heavyweightboxcarModel[4].setRotationPoint(77F, -23F, -6F);

		heavyweightboxcarModel[5].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 8
		heavyweightboxcarModel[5].setRotationPoint(77F, -20F, 4F);

		heavyweightboxcarModel[6].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 9
		heavyweightboxcarModel[6].setRotationPoint(77F, -20F, -6F);

		heavyweightboxcarModel[7].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 10
		heavyweightboxcarModel[7].setRotationPoint(77F, 0F, -6F);

		heavyweightboxcarModel[8].addBox(0F, 0F, -11F, 1, 27, 22, 0F); // Box 11
		heavyweightboxcarModel[8].setRotationPoint(-75F, -24F, 0F);

		heavyweightboxcarModel[9].addBox(0F, 0F, 0F, 1, 22, 10, 0F); // Box 12
		heavyweightboxcarModel[9].setRotationPoint(-76F, -21F, -5F);

		heavyweightboxcarModel[10].addBox(0F, 0F, 0F, 1, 22, 10, 0F); // Box 13
		heavyweightboxcarModel[10].setRotationPoint(76F, -21F, -5F);

		heavyweightboxcarModel[11].addBox(0F, 0F, -11F, 1, 27, 22, 0F); // Box 14
		heavyweightboxcarModel[11].setRotationPoint(75F, -24F, 0F);

		heavyweightboxcarModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.75F, -1F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 17
		heavyweightboxcarModel[12].setRotationPoint(-75F, -27F, 7F);

		heavyweightboxcarModel[13].addShapeBox(0F, 0F, 0F, 141, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		heavyweightboxcarModel[13].setRotationPoint(-70F, -27F, 7F);

		heavyweightboxcarModel[14].addShapeBox(0F, 0F, 0F, 141, 3, 4, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		heavyweightboxcarModel[14].setRotationPoint(-70F, -27F, -11F);

		heavyweightboxcarModel[15].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		heavyweightboxcarModel[15].setRotationPoint(71F, -29F, -7F);

		heavyweightboxcarModel[16].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		heavyweightboxcarModel[16].setRotationPoint(-75F, -29F, -7F);

		heavyweightboxcarModel[17].addBox(0F, 0F, 0F, 141, 5, 14, 0F); // Box 25
		heavyweightboxcarModel[17].setRotationPoint(-70F, -29F, -7F);

		heavyweightboxcarModel[18].addBox(0F, 0F, 0F, 149, 1, 20, 0F); // Box 54
		heavyweightboxcarModel[18].setRotationPoint(-74F, 2F, -10F);

		heavyweightboxcarModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 60
		heavyweightboxcarModel[19].setRotationPoint(-36F, 3F, -6F);

		heavyweightboxcarModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 61
		heavyweightboxcarModel[20].setRotationPoint(34F, 3F, -6F);

		heavyweightboxcarModel[21].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 63
		heavyweightboxcarModel[21].setRotationPoint(-33F, 3F, -6F);

		heavyweightboxcarModel[22].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 64
		heavyweightboxcarModel[22].setRotationPoint(17F, 3F, -6F);

		heavyweightboxcarModel[23].addBox(0F, 0F, 0F, 33, 4, 12, 0F); // Box 65
		heavyweightboxcarModel[23].setRotationPoint(-16F, 3F, -6F);

		heavyweightboxcarModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 70
		heavyweightboxcarModel[24].setRotationPoint(16F, 3F, 6F);

		heavyweightboxcarModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 71
		heavyweightboxcarModel[25].setRotationPoint(-16F, 3F, 6F);

		heavyweightboxcarModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		heavyweightboxcarModel[26].setRotationPoint(-16F, 3F, -10F);

		heavyweightboxcarModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		heavyweightboxcarModel[27].setRotationPoint(16F, 3F, -10F);

		heavyweightboxcarModel[28].addBox(0F, 0F, 0F, 29, 4, 0, 0F); // Box 74
		heavyweightboxcarModel[28].setRotationPoint(-14F, 3F, 11F);

		heavyweightboxcarModel[29].addBox(0F, 0F, 0F, 29, 4, 0, 0F); // Box 75
		heavyweightboxcarModel[29].setRotationPoint(-14F, 3F, -11F);

		heavyweightboxcarModel[30].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 76
		heavyweightboxcarModel[30].setRotationPoint(-8F, 3F, 6F);

		heavyweightboxcarModel[31].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 78
		heavyweightboxcarModel[31].setRotationPoint(2F, 3F, -10F);

		heavyweightboxcarModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -1.75F, -1F, -1.45F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		heavyweightboxcarModel[32].setRotationPoint(-75F, -27F, 7F);

		heavyweightboxcarModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.75F, -1F, -1.45F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 86
		heavyweightboxcarModel[33].setRotationPoint(-75F, -27F, -11F);

		heavyweightboxcarModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -1.75F, -1F, -1.45F, 0F, 0F, -4F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		heavyweightboxcarModel[34].setRotationPoint(-75F, -27F, -11F);

		heavyweightboxcarModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -1F, -1.5F, -1.75F, -1F, -1.45F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		heavyweightboxcarModel[35].setRotationPoint(71F, -27F, -11F);

		heavyweightboxcarModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, -4F, -1.75F, -1F, -1.45F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		heavyweightboxcarModel[36].setRotationPoint(71F, -27F, -11F);

		heavyweightboxcarModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.75F, -1F, -1.45F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 90
		heavyweightboxcarModel[37].setRotationPoint(71F, -27F, 7F);

		heavyweightboxcarModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1.75F, -1F, -1.45F, 0F, -1F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		heavyweightboxcarModel[38].setRotationPoint(71F, -27F, 7F);

		heavyweightboxcarModel[39].addShapeBox(0F, 0F, 0F, 27, 23, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 82
		heavyweightboxcarModel[39].setRotationPoint(10F, -22F, 10F);

		heavyweightboxcarModel[40].addShapeBox(0F, 0F, 0F, 17, 23, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 85
		heavyweightboxcarModel[40].setRotationPoint(-26F, -22F, 10F);

		heavyweightboxcarModel[41].addBox(0F, 0F, 0F, 48, 27, 1, 0F); // Box 104
		heavyweightboxcarModel[41].setRotationPoint(-74F, -24F, 10F);

		heavyweightboxcarModel[42].addBox(0F, 0F, 0F, 38, 27, 1, 0F); // Box 105
		heavyweightboxcarModel[42].setRotationPoint(37F, -24F, 10F);

		heavyweightboxcarModel[43].addBox(0F, 0F, 0F, 19, 23, 1, 0F); // Box 106
		heavyweightboxcarModel[43].setRotationPoint(-9F, -22F, 10F);

		heavyweightboxcarModel[44].addBox(0F, 0F, 0F, 63, 2, 1, 0F); // Box 107
		heavyweightboxcarModel[44].setRotationPoint(-26F, -24F, 10F);

		heavyweightboxcarModel[45].addBox(0F, 0F, 0F, 63, 2, 1, 0F); // Box 108
		heavyweightboxcarModel[45].setRotationPoint(-26F, 1F, 10F);

		heavyweightboxcarModel[46].addBox(0F, 0F, 0F, 48, 27, 1, 0F); // Box 109
		heavyweightboxcarModel[46].setRotationPoint(-74F, -24F, -11F);

		heavyweightboxcarModel[47].addBox(0F, 0F, 0F, 38, 27, 1, 0F); // Box 110
		heavyweightboxcarModel[47].setRotationPoint(37F, -24F, -11F);

		heavyweightboxcarModel[48].addBox(0F, 0F, 0F, 63, 2, 1, 0F); // Box 111
		heavyweightboxcarModel[48].setRotationPoint(-26F, -24F, -11F);

		heavyweightboxcarModel[49].addShapeBox(0F, 0F, 0F, 27, 23, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 112
		heavyweightboxcarModel[49].setRotationPoint(10F, -22F, -11F);

		heavyweightboxcarModel[50].addBox(0F, 0F, 0F, 19, 23, 1, 0F); // Box 113
		heavyweightboxcarModel[50].setRotationPoint(-9F, -22F, -11F);

		heavyweightboxcarModel[51].addShapeBox(0F, 0F, 0F, 17, 23, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 114
		heavyweightboxcarModel[51].setRotationPoint(-26F, -22F, -11F);

		heavyweightboxcarModel[52].addBox(0F, 0F, 0F, 63, 2, 1, 0F); // Box 115
		heavyweightboxcarModel[52].setRotationPoint(-26F, 1F, -11F);

		heavyweightboxcarModel[53].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 116
		heavyweightboxcarModel[53].setRotationPoint(-8F, -29F, -8F);

		heavyweightboxcarModel[54].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 117
		heavyweightboxcarModel[54].setRotationPoint(-43F, -29F, -8F);

		heavyweightboxcarModel[55].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 118
		heavyweightboxcarModel[55].setRotationPoint(6F, -29F, -8F);

		heavyweightboxcarModel[56].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 119
		heavyweightboxcarModel[56].setRotationPoint(23F, -29F, -8F);

		heavyweightboxcarModel[57].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 120
		heavyweightboxcarModel[57].setRotationPoint(41F, -29F, -8F);

		heavyweightboxcarModel[58].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 121
		heavyweightboxcarModel[58].setRotationPoint(60F, -29F, -8F);

		heavyweightboxcarModel[59].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 122
		heavyweightboxcarModel[59].setRotationPoint(60F, -29F, 7F);

		heavyweightboxcarModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 123
		heavyweightboxcarModel[60].setRotationPoint(41F, -29F, 7F);

		heavyweightboxcarModel[61].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 124
		heavyweightboxcarModel[61].setRotationPoint(23F, -29F, 7F);

		heavyweightboxcarModel[62].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 125
		heavyweightboxcarModel[62].setRotationPoint(6F, -29F, 7F);

		heavyweightboxcarModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 126
		heavyweightboxcarModel[63].setRotationPoint(-8F, -29F, 7F);

		heavyweightboxcarModel[64].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 127
		heavyweightboxcarModel[64].setRotationPoint(-43F, -29F, 7F);

		heavyweightboxcarModel[65].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 129
		heavyweightboxcarModel[65].setRotationPoint(58F, -14F, -8F);

		heavyweightboxcarModel[66].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 130
		heavyweightboxcarModel[66].setRotationPoint(41F, -14F, -8F);

		heavyweightboxcarModel[67].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 131
		heavyweightboxcarModel[67].setRotationPoint(-57F, -14F, 8F);
		heavyweightboxcarModel[67].rotateAngleY = -3.14159265F;

		heavyweightboxcarModel[68].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 132
		heavyweightboxcarModel[68].setRotationPoint(-40F, -14F, 8F);
		heavyweightboxcarModel[68].rotateAngleY = -3.14159265F;

		heavyweightboxcarModel[69].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 133
		heavyweightboxcarModel[69].setRotationPoint(-23F, -14F, 8F);
		heavyweightboxcarModel[69].rotateAngleY = -3.14159265F;

		heavyweightboxcarModel[70].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 134
		heavyweightboxcarModel[70].setRotationPoint(-6F, -14F, 8F);
		heavyweightboxcarModel[70].rotateAngleY = -3.14159265F;

		heavyweightboxcarModel[71].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 135
		heavyweightboxcarModel[71].setRotationPoint(7F, -14F, -8F);

		heavyweightboxcarModel[72].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 136
		heavyweightboxcarModel[72].setRotationPoint(24F, -14F, -8F);

		heavyweightboxcarModel[73].addBox(0F, 0F, 0F, 1, 20, 8, 0F); // Box 75
		heavyweightboxcarModel[73].setRotationPoint(76F, -20F, -4F);

		heavyweightboxcarModel[74].addBox(0F, 0F, 0F, 1, 20, 8, 0F); // Box 76
		heavyweightboxcarModel[74].setRotationPoint(-76F, -20F, -4F);

		heavyweightboxcarModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		heavyweightboxcarModel[75].setRotationPoint(-16F, 3F, 10F);

		heavyweightboxcarModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		heavyweightboxcarModel[76].setRotationPoint(16F, 3F, 10F);

		heavyweightboxcarModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 79
		heavyweightboxcarModel[77].setRotationPoint(16F, 3F, -11F);

		heavyweightboxcarModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 80
		heavyweightboxcarModel[78].setRotationPoint(-16F, 3F, -11F);


	}
	ModelHeavyweightBogie bogie = new ModelHeavyweightBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 79; i++)
		{
			heavyweightboxcarModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HeavyweightBogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-3.7,-0.025,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(7.5,0,0);
		GL11.glScalef(-1,1,1);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo heavyweightboxcarModel[];
}