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

public class Model66centerbeam extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model66centerbeam() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

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
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 72
		bodyModel[23] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 86
		bodyModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 87
		bodyModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "cull"); // Box 66 cull
		bodyModel[27] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 73
		bodyModel[30] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 75
		bodyModel[31] = new ModelRendererTurbo(this, 233, 41, textureX, textureY, "cull"); // Box 80 cull
		bodyModel[32] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 82
		bodyModel[33] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 83
		bodyModel[34] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 84
		bodyModel[35] = new ModelRendererTurbo(this, 233, 113, textureX, textureY, "cull"); // Box 88 cull
		bodyModel[36] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 89
		bodyModel[37] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 90
		bodyModel[38] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 91
		bodyModel[39] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 92
		bodyModel[40] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 124
		bodyModel[42] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 25
		bodyModel[43] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 100
		bodyModel[48] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 100
		bodyModel[49] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 100
		bodyModel[50] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 100
		bodyModel[51] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 100
		bodyModel[54] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 100
		bodyModel[57] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 100
		bodyModel[59] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 100

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-58F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(54F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-43F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(39F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 108, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-54F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[5].setRotationPoint(39F, 3F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[6].setRotationPoint(-43F, 3F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[7].setRotationPoint(-43F, 3F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[8].setRotationPoint(-54F, 2F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[9].setRotationPoint(-54F, 2F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[10].setRotationPoint(53F, 2F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[11].setRotationPoint(53F, 2F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 12
		bodyModel[12].setRotationPoint(39F, 3F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 27, 2, 0F); // Box 15
		bodyModel[13].setRotationPoint(51F, -22F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 23, 18, 0F); // Box 17
		bodyModel[14].setRotationPoint(-52F, -22F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 102, 1, 22, 0F); // Box 18
		bodyModel[15].setRotationPoint(-51F, 1F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 23, 18, 0F); // Box 19
		bodyModel[16].setRotationPoint(51F, -22F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 25
		bodyModel[17].setRotationPoint(52.25F, -18F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(-51F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[19].setRotationPoint(46F, 3F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(-51F, 3F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(46F, 3F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 72
		bodyModel[22].setRotationPoint(-54.51F, -5.5F, 0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[23].setRotationPoint(-54F, -5F, 1F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[24].setRotationPoint(-54.5F, -4F, 2F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 27, 2, 0F); // Box 65
		bodyModel[25].setRotationPoint(51F, -22F, 9F);

		bodyModel[26].addBox(0F, 0F, 0F, 102, 25, 1, 0F); // Box 66 cull
		bodyModel[26].setRotationPoint(-51F, -24F, -0.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 27, 2, 0F); // Box 67
		bodyModel[27].setRotationPoint(-54F, -22F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 27, 2, 0F); // Box 68
		bodyModel[28].setRotationPoint(-54F, -22F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 73
		bodyModel[29].setRotationPoint(-54F, -22F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 75
		bodyModel[30].setRotationPoint(52F, -22F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80 cull
		bodyModel[31].setRotationPoint(-54.5F, -22F, 5.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 82
		bodyModel[32].setRotationPoint(52.25F, -4F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		bodyModel[33].setRotationPoint(-53.25F, -4F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[34].setRotationPoint(-53.25F, -18F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88 cull
		bodyModel[35].setRotationPoint(53.5F, -22F, -10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 89
		bodyModel[36].setRotationPoint(-56F, 1F, 0F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 90
		bodyModel[37].setRotationPoint(53F, 1F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 102, 1, 1, 0F); // Box 91
		bodyModel[38].setRotationPoint(-51F, 2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 102, 1, 1, 0F); // Box 92
		bodyModel[39].setRotationPoint(-51F, 2F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[40].setRotationPoint(51F, 1F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 124
		bodyModel[41].setRotationPoint(-53F, 1F, -9F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 25
		bodyModel[42].setRotationPoint(52.25F, -11F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[43].setRotationPoint(-53.25F, -11F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 73
		bodyModel[44].setRotationPoint(-54F, -23F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 75
		bodyModel[45].setRotationPoint(51F, -23F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[46].setRotationPoint(-8F, -24F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[47].setRotationPoint(49F, -24F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[48].setRotationPoint(-0.5F, -24F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[49].setRotationPoint(7F, -24F, -1.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[50].setRotationPoint(14F, -24F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[51].setRotationPoint(21F, -24F, -1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[52].setRotationPoint(28F, -24F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[53].setRotationPoint(35F, -24F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[54].setRotationPoint(42F, -24F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(-29F, -24F, -1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[56].setRotationPoint(-22F, -24F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[57].setRotationPoint(-15F, -24F, -1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[58].setRotationPoint(-50F, -24F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-43F, -24F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[60].setRotationPoint(-36F, -24F, -1.5F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogiebutawesome = new Model70TonTruck2();
	Modelwrappedwood load1 = new Modelwrappedwood();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 61; i++)
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=18 && cargo>9) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.65f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.65f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=27 && cargo>18) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.65f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.65f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.65f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.65f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=36 && cargo>27) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.65f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.65f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.65f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.65f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.65f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.65f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else if(cargo<=45 && cargo>36) {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.65f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.65f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.65f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a5
				GL11.glTranslated(-2.65f,-1.34,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.65f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.65f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.65f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b5
				GL11.glTranslated(-2.65f,-1.34,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();
			}
			else {
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==10 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==4) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_washaska.png"));
				} else {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_portbec.png"));
				}
				GL11.glPushMatrix();//side a1
				GL11.glTranslated(-2.65f,-0.1,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a2
				GL11.glTranslated(-2.65f,-0.41,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a3
				GL11.glTranslated(-2.65f,-0.72,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a4
				GL11.glTranslated(-2.65f,-1.03,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a5
				GL11.glTranslated(-2.65f,-1.34,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b1
				GL11.glTranslated(-2.65f,-0.1,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b2
				GL11.glTranslated(-2.65f,-0.41,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,-0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b3
				GL11.glTranslated(-2.65f,-0.72,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side b4
				GL11.glTranslated(-2.65f,-1.03,0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glPopMatrix();

				GL11.glPushMatrix();//side a5
				GL11.glTranslated(-2.65f,-1.34,-0.4);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
				load1.render(entity,f,f1,f2,f3,f4,f5);
				GL11.glTranslated(1.062f,-0.0,0.0);
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
		GL11.glTranslated(-2.695f,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.125f,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.57,-0.05,-0.0);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.15,0,0.00);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model66centerbeam[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}