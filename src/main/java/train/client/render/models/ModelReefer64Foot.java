//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.01.2021 - 00:25:49
// Last changed on: 31.01.2021 - 00:25:49

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelReefer64Foot extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelReefer64Foot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 80, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 109, 14, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 1, 128, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 66, 15, textureX, textureY); // Box 78
		bodyModel[5] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 104
		bodyModel[6] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 105
		bodyModel[7] = new ModelRendererTurbo(this, 173, 165, textureX, textureY); // Box 106
		bodyModel[8] = new ModelRendererTurbo(this, 66, 44, textureX, textureY); // Box 108
		bodyModel[9] = new ModelRendererTurbo(this, 236, 42, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 1, 72, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 236, 42, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 67, 128, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 173, 168, textureX, textureY); // Box 106
		bodyModel[14] = new ModelRendererTurbo(this, 173, 159, textureX, textureY); // Box 106
		bodyModel[15] = new ModelRendererTurbo(this, 173, 162, textureX, textureY); // Box 106
		bodyModel[16] = new ModelRendererTurbo(this, 210, 83, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 210, 83, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 210, 86, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 210, 86, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 39
		bodyModel[21] = new ModelRendererTurbo(this, 1, 116, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 209, 171, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 209, 171, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 66, 9, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 44, 128, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 220, 114, textureX, textureY); // Box 98
		bodyModel[28] = new ModelRendererTurbo(this, 67, 133, textureX, textureY); // Box 99
		bodyModel[29] = new ModelRendererTurbo(this, 193, 116, textureX, textureY); // Box 100
		bodyModel[30] = new ModelRendererTurbo(this, 67, 131, textureX, textureY); // Box 101
		bodyModel[31] = new ModelRendererTurbo(this, 67, 136, textureX, textureY); // Box 102
		bodyModel[32] = new ModelRendererTurbo(this, 233, 94, textureX, textureY); // Box 420
		bodyModel[33] = new ModelRendererTurbo(this, 242, 92, textureX, textureY); // Box 421
		bodyModel[34] = new ModelRendererTurbo(this, 240, 93, textureX, textureY); // Box 422
		bodyModel[35] = new ModelRendererTurbo(this, 231, 55, textureX, textureY, "cull"); // Box 40 cull
		bodyModel[36] = new ModelRendererTurbo(this, 245, 55, textureX, textureY, "cull"); // Box 40 cull
		bodyModel[37] = new ModelRendererTurbo(this, 240, 73, textureX, textureY); // Box 87
		bodyModel[38] = new ModelRendererTurbo(this, 230, 59, textureX, textureY); // Box 109
		bodyModel[39] = new ModelRendererTurbo(this, 195, 10, textureX, textureY); // Box 110
		bodyModel[40] = new ModelRendererTurbo(this, 225, 12, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 195, 38, textureX, textureY); // Box 112
		bodyModel[42] = new ModelRendererTurbo(this, 215, 38, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 114
		bodyModel[44] = new ModelRendererTurbo(this, 207, 85, textureX, textureY); // Box 115
		bodyModel[45] = new ModelRendererTurbo(this, 207, 89, textureX, textureY); // Box 116
		bodyModel[46] = new ModelRendererTurbo(this, 207, 89, textureX, textureY); // Box 117
		bodyModel[47] = new ModelRendererTurbo(this, 107, 138, textureX, textureY, "cull"); // Box 118 cull
		bodyModel[48] = new ModelRendererTurbo(this, 203, 138, textureX, textureY); // Box 119
		bodyModel[49] = new ModelRendererTurbo(this, 94, 158, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[50] = new ModelRendererTurbo(this, 152, 158, textureX, textureY, "cull"); // Box 121 cull
		bodyModel[51] = new ModelRendererTurbo(this, 246, 139, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 237, 139, textureX, textureY); // Box 123
		bodyModel[53] = new ModelRendererTurbo(this, 225, 42, textureX, textureY); // Box 124

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-49F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 39, 27, 1, 0F); // Box 3
		bodyModel[1].setRotationPoint(-49F, -25F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 31, 27, 1, 0F); // Box 5
		bodyModel[2].setRotationPoint(10F, -25F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 27, 20, 0F); // Box 8
		bodyModel[3].setRotationPoint(-49F, -25F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[4].setRotationPoint(-10F, -24F, -11.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 31, 27, 1, 0F); // Box 104
		bodyModel[5].setRotationPoint(10F, -25F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 39, 27, 1, 0F); // Box 105
		bodyModel[6].setRotationPoint(-49F, -25F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[7].setRotationPoint(-30F, -25F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[8].setRotationPoint(-10F, -24F, 10.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[9].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 106, 2, 5, 0F); // Box 0
		bodyModel[10].setRotationPoint(-53F, 3F, -2.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[11].setRotationPoint(-57F, 3F, -1.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 90, 2, 0, 0F); // Box 40
		bodyModel[12].setRotationPoint(-49F, 3F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[13].setRotationPoint(-30F, 2F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[14].setRotationPoint(-10F, -25F, -11.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[15].setRotationPoint(-10F, 2F, -11.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[16].setRotationPoint(-49F, 5F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(-49F, 5F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[18].setRotationPoint(44F, 4F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(44F, 4F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 90, 1, 10, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[20].setRotationPoint(-49F, -26F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 90, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 39
		bodyModel[21].setRotationPoint(-49F, -26F, 0F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // Box 42
		bodyModel[22].setRotationPoint(-31F, 2.8F, -10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // Box 44
		bodyModel[23].setRotationPoint(29F, 2.8F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 95
		bodyModel[24].setRotationPoint(-10F, -25F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 96
		bodyModel[25].setRotationPoint(-10F, -25F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 27, 20, 0F); // Box 97
		bodyModel[26].setRotationPoint(40F, -25F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 1, 8, 0F); // Box 98
		bodyModel[27].setRotationPoint(40F, 3F, -10.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 90, 2, 0, 0F); // Box 99
		bodyModel[28].setRotationPoint(-49F, 3F, 11F);

		bodyModel[29].addBox(0F, 0F, 0F, 9, 1, 8, 0F); // Box 100
		bodyModel[29].setRotationPoint(40F, 3F, 2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 86, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 101
		bodyModel[30].setRotationPoint(-45F, 5F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 86, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
		bodyModel[31].setRotationPoint(-45F, 5F, 11F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 420
		bodyModel[32].setRotationPoint(-49.5F, -4F, 2F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 421
		bodyModel[33].setRotationPoint(-50F, -5.5F, 1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[34].setRotationPoint(-50F, -4F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cull
		bodyModel[35].setRotationPoint(-50F, -7F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cull
		bodyModel[36].setRotationPoint(-50F, -7F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 87
		bodyModel[37].setRotationPoint(-51F, 2F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 109
		bodyModel[38].setRotationPoint(-50F, -7F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 15, 12, 0F); // Box 110
		bodyModel[39].setRotationPoint(41F, -25F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 111
		bodyModel[40].setRotationPoint(43F, -25F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[41].setRotationPoint(44F, -25F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[42].setRotationPoint(44F, -25F, 2F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 114
		bodyModel[43].setRotationPoint(44F, -25F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 6, 19, 0F); // Box 115
		bodyModel[44].setRotationPoint(44F, -3F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[45].setRotationPoint(42F, -1F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 117
		bodyModel[46].setRotationPoint(46F, -1F, -9.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 15, 21, 0F); // Box 118 cull
		bodyModel[47].setRotationPoint(48F, -12F, -10.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 7, 1, 19, 0F); // Box 119
		bodyModel[48].setRotationPoint(41F, -4F, -9.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 120 cull
		bodyModel[49].setRotationPoint(43F, -12F, -10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 121 cull
		bodyModel[50].setRotationPoint(43F, -12F, 9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[51].setRotationPoint(41F, -5F, -10.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[52].setRotationPoint(41F, -5F, 9.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 124
		bodyModel[53].setRotationPoint(41F, -10F, 3F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 54; i++)
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