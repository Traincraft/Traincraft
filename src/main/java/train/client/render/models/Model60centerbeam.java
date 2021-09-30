//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.10.2020 - 20:01:15
// Last changed on: 15.10.2020 - 20:01:15

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.loads.Modelwrappedwood;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

public class Model60centerbeam extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model60centerbeam() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 87
		bodyModel[24] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "cull"); // Box 66 cull
		bodyModel[26] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 73
		bodyModel[29] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 75
		bodyModel[30] = new ModelRendererTurbo(this, 209, 49, textureX, textureY, "cull"); // Box 80 cull
		bodyModel[31] = new ModelRendererTurbo(this, 233, 57, textureX, textureY, "cull"); // Box 88 cull
		bodyModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 89
		bodyModel[33] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 123
		bodyModel[37] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 124
		bodyModel[38] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 24
		bodyModel[39] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 25
		bodyModel[40] = new ModelRendererTurbo(this, 153, 33, textureX, textureY, "cull"); // Box 60 cull
		bodyModel[41] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 62
		bodyModel[42] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
		bodyModel[43] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 64
		bodyModel[44] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 69
		bodyModel[45] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 70
		bodyModel[46] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 71
		bodyModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 72
		bodyModel[48] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 81
		bodyModel[51] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 82
		bodyModel[52] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 83
		bodyModel[53] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 84
		bodyModel[54] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 85
		bodyModel[55] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 86
		bodyModel[56] = new ModelRendererTurbo(this, 241, 89, textureX, textureY, "cull"); // Box 87 cull
		bodyModel[57] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 100
		bodyModel[59] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 100
		bodyModel[62] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 100
		bodyModel[64] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 100
		bodyModel[65] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 100
		bodyModel[67] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 100
		bodyModel[68] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 100
		bodyModel[69] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 100

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-54.5F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(50.5F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-37.5F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(33.5F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 101, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-50.5F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[5].setRotationPoint(33.5F, 3F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[6].setRotationPoint(-37.5F, 3F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[7].setRotationPoint(-37.5F, 3F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[8].setRotationPoint(-48.5F, 2F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[9].setRotationPoint(-48.5F, 2F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[10].setRotationPoint(47.5F, 2F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[11].setRotationPoint(47.5F, 2F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 12
		bodyModel[12].setRotationPoint(33.5F, 3F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 15
		bodyModel[13].setRotationPoint(45.5F, -24F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 25, 18, 0F); // Box 17
		bodyModel[14].setRotationPoint(-46.5F, -24F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 91, 1, 22, 0F); // Box 18
		bodyModel[15].setRotationPoint(-45.5F, 1F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 25, 18, 0F); // Box 19
		bodyModel[16].setRotationPoint(45.5F, -24F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-45.5F, 3F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(40.5F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-45.5F, 3F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(40.5F, 3F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 72
		bodyModel[21].setRotationPoint(-49.01F, -5.5F, 0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[22].setRotationPoint(-48.5F, -5F, 1F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[23].setRotationPoint(-49F, -4F, 2F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 65
		bodyModel[24].setRotationPoint(45.5F, -24F, 9F);

		bodyModel[25].addBox(0F, 0F, 0F, 91, 25, 1, 0F); // Box 66 cull
		bodyModel[25].setRotationPoint(-45.5F, -24F, -0.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 67
		bodyModel[26].setRotationPoint(-48.5F, -24F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 68
		bodyModel[27].setRotationPoint(-48.5F, -24F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 73
		bodyModel[28].setRotationPoint(-48.5F, -24F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 75
		bodyModel[29].setRotationPoint(46.5F, -24F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80 cull
		bodyModel[30].setRotationPoint(-49F, -24F, 5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88 cull
		bodyModel[31].setRotationPoint(48F, -24F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 89
		bodyModel[32].setRotationPoint(-50.5F, 1F, -5.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 90
		bodyModel[33].setRotationPoint(47.5F, 1F, -5.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 91, 1, 1, 0F); // Box 91
		bodyModel[34].setRotationPoint(-45.5F, 2F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 91, 1, 1, 0F); // Box 92
		bodyModel[35].setRotationPoint(-45.5F, 2F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[36].setRotationPoint(45.5F, 1F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 124
		bodyModel[37].setRotationPoint(-47.5F, 1F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 24
		bodyModel[38].setRotationPoint(47F, -23F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 25
		bodyModel[39].setRotationPoint(47.25F, -17F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 cull
		bodyModel[40].setRotationPoint(-49.5F, -8F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Box 62
		bodyModel[41].setRotationPoint(45.5F, -25F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[42].setRotationPoint(45.5F, -25F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[43].setRotationPoint(45.5F, -25F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[44].setRotationPoint(-48.5F, -25F, 8F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Box 70
		bodyModel[45].setRotationPoint(-48.5F, -25F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[46].setRotationPoint(-48.5F, -25F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 25, 2, 0F); // Box 72
		bodyModel[47].setRotationPoint(-48.5F, -23F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 25, 2, 0F); // Box 74
		bodyModel[48].setRotationPoint(46.5F, -23F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 91, 1, 8, 0F); // Box 79
		bodyModel[49].setRotationPoint(-45.5F, -25F, -4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 81
		bodyModel[50].setRotationPoint(47F, -23F, 5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 82
		bodyModel[51].setRotationPoint(47.25F, -6F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		bodyModel[52].setRotationPoint(-48.25F, -6F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[53].setRotationPoint(-48.25F, -17F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 85
		bodyModel[54].setRotationPoint(-47.5F, -23F, 5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 86
		bodyModel[55].setRotationPoint(-47.5F, -23F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87 cull
		bodyModel[56].setRotationPoint(48.5F, -8F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[57].setRotationPoint(-40.5F, -24F, -1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[58].setRotationPoint(-36.5F, -24F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-32.5F, -24F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[60].setRotationPoint(31.5F, -24F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[61].setRotationPoint(35.5F, -24F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[62].setRotationPoint(39.5F, -24F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[63].setRotationPoint(-24.5F, -24F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[64].setRotationPoint(-16.5F, -24F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[65].setRotationPoint(-8.5F, -24F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[66].setRotationPoint(-0.5F, -24F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[67].setRotationPoint(7.5F, -24F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[68].setRotationPoint(15.5F, -24F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[69].setRotationPoint(23.5F, -24F, -1.5F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogiebutawesome = new Model70TonTruck2();
	Modelwrappedwood load1 = new Modelwrappedwood();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 70; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
			if(cargo<=9) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=18 && cargo>9) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.09f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.09f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=27 && cargo>18) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.09f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.09f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.09f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.09f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=36 && cargo>27) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.09f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.09f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.09f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.09f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.09f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.09f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=45 && cargo>36) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.09f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.09f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.09f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a5
				GL11.glTranslated(-2.09f,-1.34,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.09f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.09f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.09f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b5
				GL11.glTranslated(-2.09f,-1.34,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.09f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.09f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.09f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.09f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a5
				GL11.glTranslated(-2.09f,-1.34,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.09f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.09f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.09f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.09f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b5
				GL11.glTranslated(-2.09f,-1.34,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.06f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.045f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
		}
		//Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==2){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}
		/*GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-2.3332f,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.3332f,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.23,-0.05,-0.0);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.45,0,0.00);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{ }
	public ModelRendererTurbo Model60centerbeam[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}
