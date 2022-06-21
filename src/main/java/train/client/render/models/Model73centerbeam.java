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

public class Model73centerbeam extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Model73centerbeam() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[77];

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
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 97, 14, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 87
		bodyModel[24] = new ModelRendererTurbo(this, 353, 9, textureX, textureY, "cull"); // Box 60 cull
		bodyModel[25] = new ModelRendererTurbo(this, 344, 17, textureX, textureY); // Box 62
		bodyModel[26] = new ModelRendererTurbo(this, 397, 17, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 413, 17, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 34, 34, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 337, 41, textureX, textureY, "cull"); // Box 80 cull
		bodyModel[36] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
		bodyModel[38] = new ModelRendererTurbo(this, 105, 17, textureX, textureY, "cull"); // Box 87 cull
		bodyModel[39] = new ModelRendererTurbo(this, 66, 54, textureX, textureY, "cull"); // Box 88 cull
		bodyModel[40] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 90
		bodyModel[42] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 92
		bodyModel[44] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 84
		bodyModel[48] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 83
		bodyModel[49] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 84
		bodyModel[52] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 81, 69, textureX, textureY); // Box 100
		bodyModel[54] = new ModelRendererTurbo(this, 200, 69, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 101, 69, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 110, 69, textureX, textureY); // Box 100
		bodyModel[57] = new ModelRendererTurbo(this, 119, 69, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 128, 69, textureX, textureY); // Box 100
		bodyModel[59] = new ModelRendererTurbo(this, 137, 69, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 146, 69, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 155, 69, textureX, textureY); // Box 100
		bodyModel[62] = new ModelRendererTurbo(this, 164, 69, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 173, 69, textureX, textureY); // Box 100
		bodyModel[64] = new ModelRendererTurbo(this, 182, 69, textureX, textureY); // Box 100
		bodyModel[65] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 100
		bodyModel[67] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 100
		bodyModel[68] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[69] = new ModelRendererTurbo(this, 81, 100, textureX, textureY); // Box 100
		bodyModel[70] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 100
		bodyModel[71] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 100
		bodyModel[72] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 3, 21, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 100
		bodyModel[76] = new ModelRendererTurbo(this, 191, 69, textureX, textureY); // Box 100

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-64.5F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(60.5F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-45.5F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(41.5F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 121, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-60.5F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[5].setRotationPoint(41.5F, 3F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[6].setRotationPoint(-45.5F, 3F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 1
		bodyModel[7].setRotationPoint(-45.5F, 3F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[8].setRotationPoint(-56.5F, 2F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[9].setRotationPoint(-56.5F, 2F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[10].setRotationPoint(55.5F, 2F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[11].setRotationPoint(55.5F, 2F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 9, 0F); // Box 12
		bodyModel[12].setRotationPoint(41.5F, 3F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 15
		bodyModel[13].setRotationPoint(53.5F, -24F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 25, 18, 0F); // Box 17
		bodyModel[14].setRotationPoint(-54.5F, -24F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 107, 1, 22, 0F); // Box 18
		bodyModel[15].setRotationPoint(-53.5F, 1F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 25, 18, 0F); // Box 19
		bodyModel[16].setRotationPoint(53.5F, -24F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-53.5F, 3F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(48.5F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-53.5F, 3F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(48.5F, 3F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 72
		bodyModel[21].setRotationPoint(-57.01F, -5.5F, 0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[22].setRotationPoint(-56.5F, -5F, 1F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[23].setRotationPoint(-57F, -4F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 cull
		bodyModel[24].setRotationPoint(-57F, -8F, -10.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 62
		bodyModel[25].setRotationPoint(53.5F, -25F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 65
		bodyModel[26].setRotationPoint(53.5F, -24F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 67
		bodyModel[27].setRotationPoint(-56.5F, -24F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 29, 2, 0F); // Box 68
		bodyModel[28].setRotationPoint(-56.5F, -24F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 70
		bodyModel[29].setRotationPoint(-56.5F, -25F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 25, 2, 0F); // Box 72
		bodyModel[30].setRotationPoint(-56F, -23F, -1F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 73
		bodyModel[31].setRotationPoint(-56.5F, -24F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 25, 2, 0F); // Box 74
		bodyModel[32].setRotationPoint(54F, -23F, -1F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 75
		bodyModel[33].setRotationPoint(54.5F, -24F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 107, 1, 8, 0F); // Box 79
		bodyModel[34].setRotationPoint(-53.5F, -25F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80 cull
		bodyModel[35].setRotationPoint(-57F, -24F, 5.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		bodyModel[36].setRotationPoint(-55.75F, -4F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[37].setRotationPoint(-55.75F, -20F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87 cull
		bodyModel[38].setRotationPoint(56F, -8F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88 cull
		bodyModel[39].setRotationPoint(56F, -24F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 89
		bodyModel[40].setRotationPoint(-58.5F, 1F, -5F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 90
		bodyModel[41].setRotationPoint(55.5F, 1F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 107, 1, 1, 0F); // Box 91
		bodyModel[42].setRotationPoint(-53.5F, 2F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 107, 1, 1, 0F); // Box 92
		bodyModel[43].setRotationPoint(-53.5F, 2F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[44].setRotationPoint(53.5F, 1F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 124
		bodyModel[45].setRotationPoint(-55.5F, 1F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[46].setRotationPoint(-55.75F, -14.5F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[47].setRotationPoint(-55.75F, -9.5F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 83
		bodyModel[48].setRotationPoint(54.75F, -4F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[49].setRotationPoint(54.75F, -20F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[50].setRotationPoint(54.75F, -14.5F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 84
		bodyModel[51].setRotationPoint(54.75F, -9.5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[52].setRotationPoint(-4.5F, -24F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[53].setRotationPoint(49F, -24F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[54].setRotationPoint(39F, -24F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(3.5F, -24F, -1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[56].setRotationPoint(11.5F, -24F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[57].setRotationPoint(19.5F, -24F, -1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[58].setRotationPoint(27.5F, -24F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(35.5F, -24F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[60].setRotationPoint(42.5F, -24F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[61].setRotationPoint(-28.5F, -24F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[62].setRotationPoint(-20.5F, -24F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[63].setRotationPoint(-12.5F, -24F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[64].setRotationPoint(-50F, -24F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[65].setRotationPoint(-43.5F, -24F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[66].setRotationPoint(-36.5F, -24F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 18, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[67].setRotationPoint(-53.5F, -24F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[68].setRotationPoint(35.5F, -24F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 71, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[69].setRotationPoint(-35.5F, -24F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[70].setRotationPoint(-20.5F, -24.5F, -0.5F);
		bodyModel[70].rotateAngleZ = -0.54105207F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[71].setRotationPoint(-4.5F, -24.5F, -0.5F);
		bodyModel[71].rotateAngleZ = -0.54105207F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[72].setRotationPoint(3.5F, -24.5F, -0.5F);
		bodyModel[72].rotateAngleZ = 0.54105207F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[73].setRotationPoint(19.5F, -24.5F, -0.5F);
		bodyModel[73].rotateAngleZ = 0.54105207F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[74].setRotationPoint(-54F, -14.5F, -0.5F);
		bodyModel[74].rotateAngleZ = 0.83775804F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[75].setRotationPoint(54F, -14.5F, -0.5F);
		bodyModel[75].rotateAngleZ = -0.88139127F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[76].setRotationPoint(-40F, -24F, -1.5F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogiebutawesome = new Model70TonTruck2();
	Modelwrappedwood load1 = new Modelwrappedwood();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 77; i++)
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
				if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_thickthin.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7345) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_canfor.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==13451) {
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/loads/wrappedwood_irving.png"));
				}else if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==6 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
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
		GL11.glTranslated(-2.84375f,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.4375f,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.73,-0.05,-0.0);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.45,0,0.00);
		bogiebutawesome.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model73centerbeam[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}