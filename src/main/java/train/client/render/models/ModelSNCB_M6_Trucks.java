//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.09.2021 - 11:49:44
// Last changed on: 07.09.2021 - 11:49:44

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSNCB_M6_Trucks extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSNCB_M6_Trucks() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 7
		bodyModel[17] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[18] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[19] = new ModelRendererTurbo(this, 2, 9, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 2, 9, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[23] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 9
		bodyModel[24] = new ModelRendererTurbo(this, 74, 9, textureX, textureY); // Box 16
		bodyModel[25] = new ModelRendererTurbo(this, 61, 11, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 61, 11, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 29, 14, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 36, 29, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 83, 29, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 83, 29, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 39, 6, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 39, 6, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 36
		bodyModel[38] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 36
		bodyModel[39] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 36
		bodyModel[40] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 36

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-2F, 5F, 7.05F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-2F, 5F, -5.05F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 6
		bodyModel[2].setRotationPoint(12F, 7F, 9F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[3].setRotationPoint(3F, 8F, 9F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 6
		bodyModel[4].setRotationPoint(-2F, 7F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[5].setRotationPoint(2F, 7F, 9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(11F, 7F, 9F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 6
		bodyModel[7].setRotationPoint(12F, 7F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[8].setRotationPoint(3F, 8F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 6
		bodyModel[9].setRotationPoint(-2F, 7F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[10].setRotationPoint(2F, 7F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[11].setRotationPoint(11F, 7F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 18
		bodyModel[12].setRotationPoint(-2F, 5F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 19
		bodyModel[13].setRotationPoint(15F, 5F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 18
		bodyModel[14].setRotationPoint(-2F, 5F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 19
		bodyModel[15].setRotationPoint(15F, 5F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[16].setRotationPoint(3F, 5F, 9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[17].setRotationPoint(2F, 4F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[18].setRotationPoint(11F, 4F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 6
		bodyModel[19].setRotationPoint(12F, 4F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[20].setRotationPoint(3F, 5F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 6
		bodyModel[21].setRotationPoint(-2F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[22].setRotationPoint(2F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[23].setRotationPoint(11F, 4F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 3, 16, 0F); // Box 16
		bodyModel[24].setRotationPoint(3F, 5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[25].setRotationPoint(-1F, 5F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(11F, 5F, -4F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 1, 11, 0F); // Box 34
		bodyModel[27].setRotationPoint(2F, 4F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 35
		bodyModel[28].setRotationPoint(-1F, 3F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 36
		bodyModel[29].setRotationPoint(-2F, 2F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[30].setRotationPoint(11F, 5F, 7.05F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[31].setRotationPoint(11F, 5F, -5.05F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 36
		bodyModel[32].setRotationPoint(13F, 7F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 37
		bodyModel[33].setRotationPoint(0F, 7F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 36
		bodyModel[34].setRotationPoint(15F, 2F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 36
		bodyModel[35].setRotationPoint(-1F, 2F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(-1F, 2F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 36
		bodyModel[37].setRotationPoint(1F, 2F, 11F);

		bodyModel[38].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 36
		bodyModel[38].setRotationPoint(1F, 2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 36
		bodyModel[39].setRotationPoint(1F, 2F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 36
		bodyModel[40].setRotationPoint(1F, 2F, 10F);
	}
}