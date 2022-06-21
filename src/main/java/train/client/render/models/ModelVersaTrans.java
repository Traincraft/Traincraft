//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.12.2020 - 12:18:31
// Last changed on: 08.12.2020 - 12:18:31

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelVersaTrans extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelVersaTrans() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 106, 36, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 106, 36, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 103, 42, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 103, 42, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 64, 32, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 168, 21, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 43, 37, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 167, 60, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 43, 37, textureX, textureY); // Box 32
		bodyModel[12] = new ModelRendererTurbo(this, 146, 41, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 345, 34, textureX, textureY, "cull"); // Box 60 cull
		bodyModel[14] = new ModelRendererTurbo(this, 332, 34, textureX, textureY, "cull"); // Box 61 cull
		bodyModel[15] = new ModelRendererTurbo(this, 64, 32, textureX, textureY); // Box 94
		bodyModel[16] = new ModelRendererTurbo(this, 64, 42, textureX, textureY); // Box 95
		bodyModel[17] = new ModelRendererTurbo(this, 64, 42, textureX, textureY); // Box 96
		bodyModel[18] = new ModelRendererTurbo(this, 168, 2, textureX, textureY); // Box 97
		bodyModel[19] = new ModelRendererTurbo(this, 167, 60, textureX, textureY); // Box 98
		bodyModel[20] = new ModelRendererTurbo(this, 196, 41, textureX, textureY); // Box 99
		bodyModel[21] = new ModelRendererTurbo(this, 151, 41, textureX, textureY); // Box 100
		bodyModel[22] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 101
		bodyModel[23] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 102
		bodyModel[24] = new ModelRendererTurbo(this, 191, 41, textureX, textureY); // Box 103
		bodyModel[25] = new ModelRendererTurbo(this, 186, 41, textureX, textureY); // Box 104
		bodyModel[26] = new ModelRendererTurbo(this, 181, 41, textureX, textureY); // Box 105
		bodyModel[27] = new ModelRendererTurbo(this, 176, 41, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 166, 41, textureX, textureY); // Box 107
		bodyModel[29] = new ModelRendererTurbo(this, 22, 31, textureX, textureY); // Box 108
		bodyModel[30] = new ModelRendererTurbo(this, 43, 34, textureX, textureY); // Box 109
		bodyModel[31] = new ModelRendererTurbo(this, 82, 34, textureX, textureY); // Box 110
		bodyModel[32] = new ModelRendererTurbo(this, 103, 31, textureX, textureY); // Box 111
		bodyModel[33] = new ModelRendererTurbo(this, 124, 41, textureX, textureY); // Box 112
		bodyModel[34] = new ModelRendererTurbo(this, 43, 43, textureX, textureY); // Box 113
		bodyModel[35] = new ModelRendererTurbo(this, 43, 43, textureX, textureY); // Box 114
		bodyModel[36] = new ModelRendererTurbo(this, 310, 3, textureX, textureY, "cull"); // Box 115 LADDER CULL
		bodyModel[37] = new ModelRendererTurbo(this, 258, 3, textureX, textureY, "cull"); // Box 115 LADDER CULL
		bodyModel[38] = new ModelRendererTurbo(this, 171, 41, textureX, textureY); // Box 117
		bodyModel[39] = new ModelRendererTurbo(this, 31, 55, textureX, textureY); // Box 118
		bodyModel[40] = new ModelRendererTurbo(this, 22, 49, textureX, textureY); // Box 119
		bodyModel[41] = new ModelRendererTurbo(this, 259, 61, textureX, textureY); // Box 120
		bodyModel[42] = new ModelRendererTurbo(this, 259, 61, textureX, textureY); // Box 121
		bodyModel[43] = new ModelRendererTurbo(this, 226, 41, textureX, textureY); // Box 122
		bodyModel[44] = new ModelRendererTurbo(this, 221, 41, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 216, 41, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 211, 41, textureX, textureY); // Box 125
		bodyModel[47] = new ModelRendererTurbo(this, 206, 41, textureX, textureY); // Box 126
		bodyModel[48] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 231, 41, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 236, 41, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 246, 41, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 251, 41, textureX, textureY); // Box 132
		bodyModel[54] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 133
		bodyModel[55] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 134
		bodyModel[56] = new ModelRendererTurbo(this, 144, 27, textureX, textureY); // Box 303
		bodyModel[57] = new ModelRendererTurbo(this, 131, 25, textureX, textureY); // Box 136
		bodyModel[58] = new ModelRendererTurbo(this, 140, 6, textureX, textureY); // Box 137
		bodyModel[59] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 401, 39, textureX, textureY); // Box 139
		bodyModel[61] = new ModelRendererTurbo(this, 463, 39, textureX, textureY); // Box 140
		bodyModel[62] = new ModelRendererTurbo(this, 443, 25, textureX, textureY); // Box 141
		bodyModel[63] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 355, 34, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 343, 2, textureX, textureY); // Box 70 LOAD TILE
		bodyModel[67] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 292, 3, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 292, 3, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 292, 3, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 292, 3, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 432, 39, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 414, 25, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 355, 34, textureX, textureY); // Box 80

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-33F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(30F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-22F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(18F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 60, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-30F, 2F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-22F, 2F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 42, 17, 1, 0F); // Box 15
		bodyModel[6].setRotationPoint(-21F, -16F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 17
		bodyModel[7].setRotationPoint(-21F, -16F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 56, 1, 20, 0F); // Box 18
		bodyModel[8].setRotationPoint(-28F, 1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(-28F, 2F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 42, 1, 2, 0F); // Box 28
		bodyModel[10].setRotationPoint(-21F, -17F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[11].setRotationPoint(-28F, 2F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 38
		bodyModel[12].setRotationPoint(-20F, -16F, -10.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 cull
		bodyModel[13].setRotationPoint(-28.5F, -9.5F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61 cull
		bodyModel[14].setRotationPoint(27.5F, -9.5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		bodyModel[15].setRotationPoint(-22F, 2F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		bodyModel[16].setRotationPoint(18F, 2F, 2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[17].setRotationPoint(18F, 2F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 42, 17, 1, 0F); // Box 97
		bodyModel[18].setRotationPoint(-21F, -16F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 42, 1, 2, 0F); // Box 98
		bodyModel[19].setRotationPoint(-21F, -17F, 9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 99
		bodyModel[20].setRotationPoint(19F, -16F, -10.75F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 100
		bodyModel[21].setRotationPoint(-16F, -16F, -10.75F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 101
		bodyModel[22].setRotationPoint(-8F, -16F, -10.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 102
		bodyModel[23].setRotationPoint(-12F, -16F, -10.75F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 103
		bodyModel[24].setRotationPoint(15F, -16F, -10.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 104
		bodyModel[25].setRotationPoint(11F, -16F, -10.75F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 105
		bodyModel[26].setRotationPoint(7F, -16F, -10.75F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 106
		bodyModel[27].setRotationPoint(3F, -16F, -10.75F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 107
		bodyModel[28].setRotationPoint(-4F, -16F, -10.75F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 108
		bodyModel[29].setRotationPoint(-16F, -1F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 109
		bodyModel[30].setRotationPoint(-21F, -12F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 110
		bodyModel[31].setRotationPoint(20F, -12F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 111
		bodyModel[32].setRotationPoint(15F, -1F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 112
		bodyModel[33].setRotationPoint(20F, -16F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[34].setRotationPoint(24F, 2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[35].setRotationPoint(24F, 2F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 10, 20, 0F); // Box 115 LADDER CULL
		bodyModel[36].setRotationPoint(-28F, -9F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 10, 20, 0F); // Box 115 LADDER CULL
		bodyModel[37].setRotationPoint(23F, -9F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 117
		bodyModel[38].setRotationPoint(-0.5F, -16F, -10.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[39].setRotationPoint(-29F, -6.5F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[40].setRotationPoint(-29F, -8F, 3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[41].setRotationPoint(-23F, 1F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[42].setRotationPoint(-23F, 1F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 122
		bodyModel[43].setRotationPoint(-0.5F, -16F, 9.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 123
		bodyModel[44].setRotationPoint(3F, -16F, 9.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 124
		bodyModel[45].setRotationPoint(7F, -16F, 9.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 125
		bodyModel[46].setRotationPoint(11F, -16F, 9.75F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 126
		bodyModel[47].setRotationPoint(15F, -16F, 9.75F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 127
		bodyModel[48].setRotationPoint(19F, -16F, 9.75F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 128
		bodyModel[49].setRotationPoint(-4F, -16F, 9.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 129
		bodyModel[50].setRotationPoint(-8F, -16F, 9.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 130
		bodyModel[51].setRotationPoint(-12F, -16F, 9.75F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 131
		bodyModel[52].setRotationPoint(-16F, -16F, 9.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 132
		bodyModel[53].setRotationPoint(-20F, -16F, 9.75F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 133
		bodyModel[54].setRotationPoint(-23F, -7F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 134
		bodyModel[55].setRotationPoint(-23F, -7F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[56].setRotationPoint(-29F, 1F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[57].setRotationPoint(28F, 1F, -5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 137
		bodyModel[58].setRotationPoint(-21F, -7.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 138
		bodyModel[59].setRotationPoint(-11F, 2F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 139
		bodyModel[60].setRotationPoint(-11F, 2F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 140
		bodyModel[61].setRotationPoint(5F, 2F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 141
		bodyModel[62].setRotationPoint(5F, 2F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 63
		bodyModel[63].setRotationPoint(21F, -7F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 64
		bodyModel[64].setRotationPoint(21F, -7F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 9, 18, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-6F, -8F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 40, 1, 18, 0F); // Box 70 LOAD TILE
		bodyModel[66].setRotationPoint(-20F, -15F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 5, 18, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-21F, -4F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 5, 18, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(16F, -4F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-21F, -12F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[70].setRotationPoint(-21F, -12F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(20F, -12F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 77
		bodyModel[72].setRotationPoint(20F, -12F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-3F, 2F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(-3F, 2F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 9, 18, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(2F, -8F, -9F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 76; i++) {
			if (i == 66) {
				int cargo = ((Freight) entity).getAmmountOfCargo();
				if (cargo != 0) {
					if (cargo <= 9) { //less than or equal to 9 (27, 36, 45, 54) //fix this
						GL11.glPushMatrix();
						GL11.glTranslatef(0, 1f + ((Freight) entity).getAmmountOfCargo() * -0.018f, 0); // 1f is the "starting height", the *-0.whatever is the multiplier
						GL11.glScalef(0.8F, 1, 1);// 0.8
						bodyModel[66].render(f5);
						GL11.glPopMatrix();
					} else if (cargo <= 10) {
						GL11.glPushMatrix();
						GL11.glTranslatef(0, 1f + ((Freight) entity).getAmmountOfCargo() * -0.018f, 0);
						//GL11.glTranslatef(0, 0.0f + cargo * -0.015f, 0);
						GL11.glScalef(0.8f, 1, 1); // - (((Freight) entity).getSizeInventory() - cargo) * 0.0168f
						bodyModel[66].render(f5);
						GL11.glPopMatrix();
					} else if (cargo <= 28) {
						GL11.glPushMatrix();
						GL11.glTranslatef(0, 1f + ((Freight) entity).getAmmountOfCargo() * -0.018f, 0);
						//GL11.glTranslatef(0, 0.0f + cargo * -0.015f, 0);
						GL11.glScalef(0.8f, 1, 1); // - (((Freight) entity).getSizeInventory() - cargo) * 0.0168f
						bodyModel[66].render(f5);
						GL11.glPopMatrix();
					} else {
						GL11.glPushMatrix();
						GL11.glTranslatef(0, 0.57f + ((Freight) entity).getAmmountOfCargo() * -0.015f, 0);
						GL11.glScalef(1, 1, 1);
						bodyModel[66].render(f5);
						GL11.glPopMatrix();
					}
				}
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else
				bodyModel[i].render(f5);
		}
		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1, 1, 0.9f);
		GL11.glTranslated(-1.37, 0.55, -0.4);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(2.5, 0, 0.03);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.25,-0.05,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.5,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-0F, 0.10F, 0F}; }
}