//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.12.2018 - 12:53:02
// Last changed on: 14.12.2018 - 12:53:02

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelShortCoveredHopper extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelShortCoveredHopper()
	{
		shortcoveredhopperModel = new ModelRendererTurbo[47];
		shortcoveredhopperModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		shortcoveredhopperModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		shortcoveredhopperModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		shortcoveredhopperModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		shortcoveredhopperModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 5
		shortcoveredhopperModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		shortcoveredhopperModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 27
		shortcoveredhopperModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 28
		shortcoveredhopperModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30
		shortcoveredhopperModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 33
		shortcoveredhopperModel[10] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 34
		shortcoveredhopperModel[11] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 35
		shortcoveredhopperModel[12] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 36
		shortcoveredhopperModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		shortcoveredhopperModel[14] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 38
		shortcoveredhopperModel[15] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 39
		shortcoveredhopperModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		shortcoveredhopperModel[17] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 41
		shortcoveredhopperModel[18] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 42
		shortcoveredhopperModel[19] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 43
		shortcoveredhopperModel[20] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 45
		shortcoveredhopperModel[21] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 46
		shortcoveredhopperModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		shortcoveredhopperModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 48
		shortcoveredhopperModel[24] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 49
		shortcoveredhopperModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 50
		shortcoveredhopperModel[26] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 51
		shortcoveredhopperModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 52
		shortcoveredhopperModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		shortcoveredhopperModel[29] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 54
		shortcoveredhopperModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 55
		shortcoveredhopperModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 56
		shortcoveredhopperModel[32] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 57
		shortcoveredhopperModel[33] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 78
		shortcoveredhopperModel[34] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 79
		shortcoveredhopperModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 80
		shortcoveredhopperModel[36] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 81
		shortcoveredhopperModel[37] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 82
		shortcoveredhopperModel[38] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 83
		shortcoveredhopperModel[39] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 84
		shortcoveredhopperModel[40] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 85
		shortcoveredhopperModel[41] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 86
		shortcoveredhopperModel[42] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 87
		shortcoveredhopperModel[43] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 88
		shortcoveredhopperModel[44] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 89
		shortcoveredhopperModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		shortcoveredhopperModel[46] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 91

		shortcoveredhopperModel[0].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 0
		shortcoveredhopperModel[0].setRotationPoint(6F, -3F, 1F);

		shortcoveredhopperModel[1].addBox(0F, 0F, 0F, 52, 1, 3, 0F); // Box 1
		shortcoveredhopperModel[1].setRotationPoint(9F, -5F, 0F);

		shortcoveredhopperModel[2].addBox(0F, 0F, 0F, 52, 1, 3, 0F); // Box 3
		shortcoveredhopperModel[2].setRotationPoint(9F, -5F, 19F);

		shortcoveredhopperModel[3].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 4
		shortcoveredhopperModel[3].setRotationPoint(62F, -3F, 1F);

		shortcoveredhopperModel[4].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 5
		shortcoveredhopperModel[4].setRotationPoint(13F, -4F, 0F);

		shortcoveredhopperModel[5].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 6
		shortcoveredhopperModel[5].setRotationPoint(55F, -4F, 0F);

		shortcoveredhopperModel[6].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 27
		shortcoveredhopperModel[6].setRotationPoint(6F, -4F, 6F);

		shortcoveredhopperModel[7].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 28
		shortcoveredhopperModel[7].setRotationPoint(57F, -4F, 6F);

		shortcoveredhopperModel[8].addShapeBox(0F, 0F, 0F, 44, 7, 20, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		shortcoveredhopperModel[8].setRotationPoint(13F, -12F, 1F);

		shortcoveredhopperModel[9].addBox(0F, 0F, 0F, 44, 7, 22, 0F); // Box 33
		shortcoveredhopperModel[9].setRotationPoint(13F, -19F, 0F);

		shortcoveredhopperModel[10].addShapeBox(0F, 0F, 0F, 44, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		shortcoveredhopperModel[10].setRotationPoint(13F, -26F, 1F);

		shortcoveredhopperModel[11].addShapeBox(0F, 0F, 0F, 58, 1, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		shortcoveredhopperModel[11].setRotationPoint(6F, -27F, 1F);

		shortcoveredhopperModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 36
		shortcoveredhopperModel[12].setRotationPoint(6F, -22F, 1F);

		shortcoveredhopperModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 37
		shortcoveredhopperModel[13].setRotationPoint(57F, -22F, 1F);

		shortcoveredhopperModel[14].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 38
		shortcoveredhopperModel[14].setRotationPoint(6F, -26F, 1F);

		shortcoveredhopperModel[15].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 39
		shortcoveredhopperModel[15].setRotationPoint(57F, -26F, 1F);

		shortcoveredhopperModel[16].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 40
		shortcoveredhopperModel[16].setRotationPoint(6F, -23F, 0F);

		shortcoveredhopperModel[17].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 41
		shortcoveredhopperModel[17].setRotationPoint(6F, -23F, 21F);

		shortcoveredhopperModel[18].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 42
		shortcoveredhopperModel[18].setRotationPoint(61F, -23F, 21F);

		shortcoveredhopperModel[19].addBox(0F, 0F, 0F, 3, 23, 1, 0F); // Box 43
		shortcoveredhopperModel[19].setRotationPoint(61F, -23F, 0F);

		shortcoveredhopperModel[20].addShapeBox(0F, 0F, 0F, 58, 1, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		shortcoveredhopperModel[20].setRotationPoint(6F, -28F, 3F);

		shortcoveredhopperModel[21].addBox(0F, 0F, 0F, 58, 0, 4, 0F); // Box 46
		shortcoveredhopperModel[21].setRotationPoint(6F, -28.1F, 15F);

		shortcoveredhopperModel[22].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 47
		shortcoveredhopperModel[22].setRotationPoint(4F, -28.1F, 9F);

		shortcoveredhopperModel[23].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 48
		shortcoveredhopperModel[23].setRotationPoint(64F, -28.1F, 9F);

		shortcoveredhopperModel[24].addBox(0F, 0F, 0F, 58, 0, 4, 0F); // Box 49
		shortcoveredhopperModel[24].setRotationPoint(6F, -28.1F, 3F);

		shortcoveredhopperModel[25].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 50
		shortcoveredhopperModel[25].setRotationPoint(6F, -28.1F, 7F);

		shortcoveredhopperModel[26].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 51
		shortcoveredhopperModel[26].setRotationPoint(60F, -28.1F, 7F);

		shortcoveredhopperModel[27].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 52
		shortcoveredhopperModel[27].setRotationPoint(48F, -29F, 9F);

		shortcoveredhopperModel[28].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 53
		shortcoveredhopperModel[28].setRotationPoint(18F, -29F, 9F);

		shortcoveredhopperModel[29].addBox(0F, 0F, 0F, 1, 26, 3, 0F); // Box 54
		shortcoveredhopperModel[29].setRotationPoint(5F, -28F, 16F);

		shortcoveredhopperModel[30].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 55
		shortcoveredhopperModel[30].setRotationPoint(3F, -4F, 10F);

		shortcoveredhopperModel[31].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 56
		shortcoveredhopperModel[31].setRotationPoint(64F, -4F, 10F);

		shortcoveredhopperModel[32].addBox(0F, 0F, 0F, 1, 26, 3, 0F); // Box 57
		shortcoveredhopperModel[32].setRotationPoint(64F, -28F, 3F);

		shortcoveredhopperModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 78
		shortcoveredhopperModel[33].setRotationPoint(42F, -5F, 3F);

		shortcoveredhopperModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		shortcoveredhopperModel[34].setRotationPoint(22F, -5F, 3F);

		shortcoveredhopperModel[35].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		shortcoveredhopperModel[35].setRotationPoint(9F, -26F, 0F);

		shortcoveredhopperModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 81
		shortcoveredhopperModel[36].setRotationPoint(9F, -17F, 0F);

		shortcoveredhopperModel[37].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 82
		shortcoveredhopperModel[37].setRotationPoint(9F, -19F, 0F);

		shortcoveredhopperModel[38].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 83
		shortcoveredhopperModel[38].setRotationPoint(57F, -19F, 0F);

		shortcoveredhopperModel[39].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		shortcoveredhopperModel[39].setRotationPoint(57F, -17F, 0F);

		shortcoveredhopperModel[40].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		shortcoveredhopperModel[40].setRotationPoint(57F, -26F, 0F);

		shortcoveredhopperModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 86
		shortcoveredhopperModel[41].setRotationPoint(57F, -17F, 21F);

		shortcoveredhopperModel[42].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 87
		shortcoveredhopperModel[42].setRotationPoint(57F, -19F, 21F);

		shortcoveredhopperModel[43].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		shortcoveredhopperModel[43].setRotationPoint(57F, -26F, 21F);

		shortcoveredhopperModel[44].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		shortcoveredhopperModel[44].setRotationPoint(9F, -26F, 21F);

		shortcoveredhopperModel[45].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 90
		shortcoveredhopperModel[45].setRotationPoint(9F, -19F, 21F);

		shortcoveredhopperModel[46].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
		shortcoveredhopperModel[46].setRotationPoint(9F, -17F, 21F);


	}

	ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 47; i++)
		{
			shortcoveredhopperModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(0.8,0.125,0.35);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.65,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo shortcoveredhopperModel[];
}