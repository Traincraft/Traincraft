//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.07.2021 - 15:56:40
// Last changed on: 15.07.2021 - 15:56:40

package train.client.render.renderSwitch.models; //Path where the model is located


import tmt.Coord2D;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;

public class ModelkSignal extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelkSignal() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[67];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42 unlit
		bodyModel[39] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 43 unlit
		bodyModel[40] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 47 unlit
		bodyModel[44] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 54 unlit
		bodyModel[48] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 57 unlit
		bodyModel[49] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 61 unlit
		bodyModel[50] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 63 unlit
		bodyModel[51] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 64 unlit
		bodyModel[52] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 65 unlit
		bodyModel[53] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 35, 89, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 3
		bodyModel[62] = new ModelRendererTurbo(this, 57, 80, textureX, textureY); // Box 3
		bodyModel[63] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 3
		bodyModel[64] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 3
		bodyModel[65] = new ModelRendererTurbo(this, 8, 89, textureX, textureY); // Box 3
		bodyModel[66] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 3

		bodyModel[0].addBox(-5F, 0F, -5F, 10, 8, 10, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-4F, 0F, -3F, 8, 1, 6, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, -1F, 0F);

		bodyModel[2].addBox(-3F, -39F, -2F, 6, 39, 4, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, -1F, 0F);

		bodyModel[3].addBox(-2F, 0F, -9F, 4, 4, 12, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, -41F, 0F);

		bodyModel[4].addBox(-3F, -16F, -1F, 1, 16, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, -41F, -7F);

		bodyModel[5].addBox(0F, -16F, -4F, 2, 16, 8, 0F); // Box 5
		bodyModel[5].setRotationPoint(1F, -53F, -7F);

		bodyModel[6].addBox(-4F, 0F, -5F, 14, 1, 10, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, -42F, 0F);

		bodyModel[7].addBox(-0.5F, -40F, -0.5F, 1, 40, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-4F, -1F, 0F);

		bodyModel[8].addBox(0F, -16F, -1F, 1, 16, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(0F, -41F, -7F);

		bodyModel[9].addBox(-2F, -4F, -0.5F, 2, 4, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, -41F, -7F);

		bodyModel[10].addBox(-2F, -10F, -0.5F, 2, 2, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(0F, -41F, -7F);

		bodyModel[11].addBox(-2F, -16F, -0.5F, 2, 2, 1, 0F); // Box 12
		bodyModel[11].setRotationPoint(0F, -41F, -7F);

		bodyModel[12].addBox(0F, -14F, 0F, 1, 14, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(-4F, -42F, -5F);

		bodyModel[13].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 14
		bodyModel[13].setRotationPoint(9F, -42F, -5F);

		bodyModel[14].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(9F, -42F, 4F);

		bodyModel[15].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(-4F, -42F, 4F);

		bodyModel[16].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 17
		bodyModel[16].setRotationPoint(1F, -42F, -5F);

		bodyModel[17].addBox(0F, -10F, 0F, 7, 1, 1, 0F); // Box 18
		bodyModel[17].setRotationPoint(2F, -42F, -5F);

		bodyModel[18].addBox(0F, -6F, 0F, 7, 1, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(2F, -42F, -5F);

		bodyModel[19].addBox(0F, -10F, 0F, 1, 1, 8, 0F); // Box 20
		bodyModel[19].setRotationPoint(9F, -42F, -4F);

		bodyModel[20].addBox(0F, -6F, 0F, 1, 1, 8, 0F); // Box 21
		bodyModel[20].setRotationPoint(9F, -42F, -4F);

		bodyModel[21].addBox(0F, -10F, 0F, 12, 1, 1, 0F); // Box 22
		bodyModel[21].setRotationPoint(-3F, -42F, 4F);

		bodyModel[22].addBox(0F, -6F, 0F, 12, 1, 1, 0F); // Box 23
		bodyModel[22].setRotationPoint(-3F, -42F, 4F);

		bodyModel[23].addBox(-10F, 0F, -5F, 7, 1, 8, 0F); // Box 24
		bodyModel[23].setRotationPoint(0F, -57F, -7F);

		bodyModel[24].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 25
		bodyModel[24].setRotationPoint(-4F, -57F, -5F);

		bodyModel[25].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 27
		bodyModel[25].setRotationPoint(-10F, -57F, -12F);

		bodyModel[26].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 28
		bodyModel[26].setRotationPoint(-10F, -57F, -5F);

		bodyModel[27].addBox(0F, -10F, 0F, 1, 1, 6, 0F); // Box 29
		bodyModel[27].setRotationPoint(-10F, -57F, -11F);

		bodyModel[28].addBox(0F, -6F, 0F, 1, 1, 6, 0F); // Box 30
		bodyModel[28].setRotationPoint(-10F, -57F, -11F);

		bodyModel[29].addBox(0F, -10F, 0F, 9, 1, 1, 0F); // Box 31
		bodyModel[29].setRotationPoint(-9F, -57F, -12F);

		bodyModel[30].addBox(0F, -10F, 0F, 5, 1, 1, 0F); // Box 32
		bodyModel[30].setRotationPoint(-9F, -57F, -5F);

		bodyModel[31].addBox(0F, -6F, 0F, 5, 1, 1, 0F); // Box 33
		bodyModel[31].setRotationPoint(-9F, -57F, -5F);

		bodyModel[32].addBox(0F, -6F, 0F, 9, 1, 1, 0F); // Box 34
		bodyModel[32].setRotationPoint(-9F, -57F, -12F);

		bodyModel[33].addBox(-3F, 0F, -5F, 4, 1, 4, 0F); // Box 35
		bodyModel[33].setRotationPoint(0F, -57F, -7F);

		bodyModel[34].addBox(0F, -10F, 0F, 1, 10, 1, 0F); // Box 36
		bodyModel[34].setRotationPoint(0F, -57F, -12F);

		bodyModel[35].addBox(0F, -1.5F, -1.5F, 4, 0, 3, 0F); // Box 37
		bodyModel[35].setRotationPoint(3F, -65F, -7F);

		bodyModel[36].addBox(0F, -1.5F, -1.5F, 3, 3, 0, 0F); // Box 38
		bodyModel[36].setRotationPoint(3F, -65F, -7F);

		bodyModel[37].addBox(0F, -1.5F, 1.5F, 3, 3, 0, 0F); // Box 39
		bodyModel[37].setRotationPoint(3F, -65F, -7F);

		bodyModel[38].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 42 unlit
		bodyModel[38].setRotationPoint(3F, -65F, -7F);

		bodyModel[39].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 43 unlit
		bodyModel[39].setRotationPoint(3F, -61.5F, -9F);

		bodyModel[40].addBox(0F, -1.5F, 1.5F, 3, 3, 0, 0F); // Box 44
		bodyModel[40].setRotationPoint(3F, -61.5F, -9F);

		bodyModel[41].addBox(0F, -1.5F, -1.5F, 4, 0, 3, 0F); // Box 45
		bodyModel[41].setRotationPoint(3F, -61.5F, -9F);

		bodyModel[42].addBox(0F, -1.5F, -1.5F, 3, 3, 0, 0F); // Box 46
		bodyModel[42].setRotationPoint(3F, -61.5F, -9F);

		bodyModel[43].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 47 unlit
		bodyModel[43].setRotationPoint(3F, -61.5F, -5F);

		bodyModel[44].addBox(0F, -1.5F, 1.5F, 3, 3, 0, 0F); // Box 48
		bodyModel[44].setRotationPoint(3F, -61.5F, -5F);

		bodyModel[45].addBox(0F, -1.5F, -1.5F, 4, 0, 3, 0F); // Box 49
		bodyModel[45].setRotationPoint(3F, -61.5F, -5F);

		bodyModel[46].addBox(0F, -1.5F, -1.5F, 3, 3, 0, 0F); // Box 50
		bodyModel[46].setRotationPoint(3F, -61.5F, -5F);

		bodyModel[47].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 54 unlit
		bodyModel[47].setRotationPoint(3F, -58.5F, -7F);

		bodyModel[48].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 57 unlit
		bodyModel[48].setRotationPoint(3F, -58.5F, -9F);

		bodyModel[49].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 61 unlit
		bodyModel[49].setRotationPoint(3F, -58.5F, -5F);

		bodyModel[50].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 63 unlit
		bodyModel[50].setRotationPoint(3F, -56.5F, -10F);

		bodyModel[51].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 64 unlit
		bodyModel[51].setRotationPoint(3F, -56.5F, -8F);

		bodyModel[52].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 65 unlit
		bodyModel[52].setRotationPoint(3F, -67.5F, -9F);

		bodyModel[53].addBox(-0.5F, -1F, 0.5F, 1, 1, 4, 0F); // Box 66
		bodyModel[53].setRotationPoint(-4F, -5F, 0F);

		bodyModel[54].addBox(-0.5F, -1F, -4.5F, 1, 1, 4, 0F); // Box 67
		bodyModel[54].setRotationPoint(-4F, -10F, 0F);

		bodyModel[55].addBox(-0.5F, -1F, -4.5F, 1, 1, 4, 0F); // Box 68
		bodyModel[55].setRotationPoint(-4F, -20F, 0F);

		bodyModel[56].addBox(-0.5F, -1F, 0.5F, 1, 1, 4, 0F); // Box 69
		bodyModel[56].setRotationPoint(-4F, -15F, 0F);

		bodyModel[57].addBox(-0.5F, -1F, -4.5F, 1, 1, 4, 0F); // Box 70
		bodyModel[57].setRotationPoint(-4F, -30F, 0F);

		bodyModel[58].addBox(-0.5F, -1F, 0.5F, 1, 1, 4, 0F); // Box 71
		bodyModel[58].setRotationPoint(-4F, -25F, 0F);

		bodyModel[59].addBox(-0.5F, -1F, 0.5F, 1, 1, 4, 0F); // Box 73
		bodyModel[59].setRotationPoint(-4F, -35F, 0F);

		bodyModel[60].addBox(3F, -33F, -2F, 1, 12, 4, 0F); // Box 78
		bodyModel[60].setRotationPoint(0F, -1F, 0F);

		bodyModel[61].addShapeBox(-2F, 0F, -9F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[61].setRotationPoint(4F, -41F, 8F);

		bodyModel[62].addShapeBox(-2F, 0F, -9F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[62].setRotationPoint(1F, -37F, 1F);

		bodyModel[63].addShapeBox(-2F, 0F, -9F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[63].setRotationPoint(-2F, -41F, 1F);

		bodyModel[64].addShapeBox(-2F, 0F, -9F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[64].setRotationPoint(-6F, -56F, 1F);

		bodyModel[65].addShapeBox(-2F, 0F, -9F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		bodyModel[65].setRotationPoint(5F, -21F, 9F);

		bodyModel[66].addShapeBox(-2F, 0F, -9F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[66].setRotationPoint(5F, -21F, 7F);
	}
}