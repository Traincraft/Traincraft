//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.12.2018 - 12:53:02
// Last changed on: 14.12.2018 - 12:53:02

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelRoundHopper extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRoundHopper() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 46
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 48
		bodyModel[15] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 78
		bodyModel[21] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 79
		bodyModel[22] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 48
		bodyModel[23] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 49
		bodyModel[24] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 57
		bodyModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 58
		bodyModel[28] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 59
		bodyModel[29] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 62
		bodyModel[30] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 64
		bodyModel[32] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 65
		bodyModel[33] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 66
		bodyModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 69
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 71
		bodyModel[39] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 72
		bodyModel[40] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 73
		bodyModel[41] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 74
		bodyModel[42] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 75
		bodyModel[43] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 76
		bodyModel[44] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 77
		bodyModel[45] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 78
		bodyModel[46] = new ModelRendererTurbo(this, 181, 9, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 213, 9, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 33, 18, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 175, 57, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 213, 9, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 168, 57, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 181, 9, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 33, 18, textureX, textureY); // Box 53

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-46.5F, 4F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 87, 1, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 87, 1, 3, 0F); // Box 3
		bodyModel[2].setRotationPoint(-43.5F, 2F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 4
		bodyModel[3].setRotationPoint(44.5F, 4F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 22, 0F); // Box 5
		bodyModel[4].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 22, 0F); // Box 6
		bodyModel[5].setRotationPoint(36.5F, 3F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 1, 20, 0F); // Box 27
		bodyModel[6].setRotationPoint(-46.5F, 3F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 1, 20, 0F); // Box 28
		bodyModel[7].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 28, 0, 0F); // Box 40
		bodyModel[8].setRotationPoint(-46.5F, -21F, -11.01F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 28, 0, 0F); // Box 41
		bodyModel[9].setRotationPoint(-46.5F, -21F, 11.01F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 28, 0, 0F); // Box 42
		bodyModel[10].setRotationPoint(41.5F, -21F, 11.01F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 28, 0, 0F); // Box 43
		bodyModel[11].setRotationPoint(41.5F, -21F, -11.01F);

		bodyModel[12].addBox(0F, 0F, 0F, 79, 0, 4, 0F); // Box 46
		bodyModel[12].setRotationPoint(-39.5F, -21.01F, 4F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 47
		bodyModel[13].setRotationPoint(-48.5F, -21.01F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 48
		bodyModel[14].setRotationPoint(46.5F, -21.01F, -2F);

		bodyModel[15].addBox(0F, 0F, 0F, 79, 0, 4, 0F); // Box 49
		bodyModel[15].setRotationPoint(-39.5F, -21.01F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 50
		bodyModel[16].setRotationPoint(-46.5F, -21.01F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 51
		bodyModel[17].setRotationPoint(39.5F, -21.01F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 55
		bodyModel[18].setRotationPoint(-49.5F, 3F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 56
		bodyModel[19].setRotationPoint(46.5F, 3F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 78
		bodyModel[20].setRotationPoint(20.5F, 2F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		bodyModel[21].setRotationPoint(3.5F, 2F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 48
		bodyModel[22].setRotationPoint(-30.5F, 2F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		bodyModel[23].setRotationPoint(-13.5F, 2F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 75, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 50
		bodyModel[24].setRotationPoint(-37.5F, -22F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 79, 24, 15, 0F); // Box 56
		bodyModel[25].setRotationPoint(-39.5F, -21F, -7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[26].setRotationPoint(-39.5F, -13F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 58
		bodyModel[27].setRotationPoint(-39.5F, -13F, 7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[28].setRotationPoint(-39.5F, -20F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[29].setRotationPoint(-39.5F, -6F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[30].setRotationPoint(-39.5F, -6F, 7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 79, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[31].setRotationPoint(-39.5F, -20F, 7.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 81, 1, 4, 0F); // Box 65
		bodyModel[32].setRotationPoint(-40.5F, 1F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 81, 1, 4, 0F); // Box 66
		bodyModel[33].setRotationPoint(-40.5F, 1F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 26, 3, 0F); // Box 67
		bodyModel[34].setRotationPoint(-46.51F, -21F, 8F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 26, 3, 0F); // Box 68
		bodyModel[35].setRotationPoint(46.51F, -21F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 69
		bodyModel[36].setRotationPoint(-40.5F, -21F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 70
		bodyModel[37].setRotationPoint(-40.5F, -21F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 71
		bodyModel[38].setRotationPoint(-40.25F, -18F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 72
		bodyModel[39].setRotationPoint(39.25F, -18F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 73
		bodyModel[40].setRotationPoint(39.5F, -21F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 74
		bodyModel[41].setRotationPoint(39.5F, -21F, -7F);

		bodyModel[42].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 75
		bodyModel[42].setRotationPoint(-28.5F, 6.5F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 76
		bodyModel[43].setRotationPoint(-11.5F, 6.5F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 77
		bodyModel[44].setRotationPoint(19.5F, 6.5F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 78
		bodyModel[45].setRotationPoint(2.5F, 6.5F, -7F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 48
		bodyModel[46].setRotationPoint(-46.5F, -21F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 49
		bodyModel[47].setRotationPoint(45.5F, -21F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 48
		bodyModel[48].setRotationPoint(46.51F, -6F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 26, 3, 0F); // Box 49
		bodyModel[49].setRotationPoint(46.51F, -21F, 8F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 50
		bodyModel[50].setRotationPoint(45.5F, -21F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 26, 3, 0F); // Box 51
		bodyModel[51].setRotationPoint(-46.51F, -21F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 52
		bodyModel[52].setRotationPoint(-46.5F, -21F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 53
		bodyModel[53].setRotationPoint(-46.49F, -6F, -8F);
	}
	Model70Truck bogie = new Model70Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 53; i++) {
			if (i == 9999) { //36 37 38 39 40 41 42 43 44

			} else
				bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.85f);
		GL11.glTranslated(-2.4,0.55,-0.375);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.73,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}