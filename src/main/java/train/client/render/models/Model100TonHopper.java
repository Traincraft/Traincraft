//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:22.10.2017 - 21:23:15
// Last changed on: 22.10.2017 - 21:23:15

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.Traincraft;
import train.common.library.Info;

public class Model100TonHopper extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public Model100TonHopper()
	{
		model100tonhopper = new ModelRendererTurbo[44];
		model100tonhopper[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		model100tonhopper[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		model100tonhopper[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10
		model100tonhopper[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		model100tonhopper[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 48
		model100tonhopper[5] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 49
		model100tonhopper[6] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 51
		model100tonhopper[7] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
		model100tonhopper[8] = new ModelRendererTurbo(this, 233, 35, textureX, textureY); // Box 53
		model100tonhopper[9] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 55
		model100tonhopper[10] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 56
		model100tonhopper[11] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 59
		model100tonhopper[12] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 60
		model100tonhopper[13] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 63
		model100tonhopper[14] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 64
		model100tonhopper[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
		model100tonhopper[16] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 69
		model100tonhopper[17] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 70
		model100tonhopper[18] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 72
		model100tonhopper[19] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 74
		model100tonhopper[20] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 76
		model100tonhopper[21] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 78
		model100tonhopper[22] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 80
		model100tonhopper[23] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 82
		model100tonhopper[24] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 86
		model100tonhopper[25] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 87
		model100tonhopper[26] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 88
		model100tonhopper[27] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 102
		model100tonhopper[28] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 103
		model100tonhopper[29] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 106
		model100tonhopper[30] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 107
		model100tonhopper[31] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 109
		model100tonhopper[32] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 111
		model100tonhopper[33] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 112
		model100tonhopper[34] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 113
		model100tonhopper[35] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 114
		model100tonhopper[36] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 120
		model100tonhopper[37] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 120
		model100tonhopper[38] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 121
		model100tonhopper[39] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 123
		model100tonhopper[40] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 149
		model100tonhopper[41] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 150
		model100tonhopper[42] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 151
		model100tonhopper[43] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 152

		model100tonhopper[0].addBox(0F, 0F, 0F, 80, 16, 1, 0F); // Box 0
		model100tonhopper[0].setRotationPoint(-50F, -16F, 2F);

		model100tonhopper[1].addBox(0F, 0F, 0F, 80, 16, 1, 0F); // Box 1
		model100tonhopper[1].setRotationPoint(-50F, -16F, -15F);

		model100tonhopper[2].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 10
		model100tonhopper[2].setRotationPoint(-50F, -16F, -14F);

		model100tonhopper[3].addBox(0F, 0F, 0F, 1, 15, 16, 0F); // Box 11
		model100tonhopper[3].setRotationPoint(29F, -16F, -14F);

		model100tonhopper[4].addBox(0F, 0F, 0F, 79, 1, 16, 0F); // Box 48
		model100tonhopper[4].setRotationPoint(-49F, -1F, -14F);

		model100tonhopper[5].addShapeBox(0F, 0F, 0F, 9, 9, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 49
		model100tonhopper[5].setRotationPoint(30F, -16F, -15F);

		model100tonhopper[6].addShapeBox(0F, 0F, 0F, 9, 9, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 51
		model100tonhopper[6].setRotationPoint(-59F, -16F, -15F);

		model100tonhopper[7].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 52
		model100tonhopper[7].setRotationPoint(-59F, -1F, -15F);

		model100tonhopper[8].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 53
		model100tonhopper[8].setRotationPoint(30F, -1F, -15F);

		model100tonhopper[9].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		model100tonhopper[9].setRotationPoint(38F, -16F, -15F);

		model100tonhopper[10].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		model100tonhopper[10].setRotationPoint(35F, -13F, -15F);

		model100tonhopper[11].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		model100tonhopper[11].setRotationPoint(32F, -10F, -15F);

		model100tonhopper[12].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		model100tonhopper[12].setRotationPoint(32F, -10F, 2F);

		model100tonhopper[13].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		model100tonhopper[13].setRotationPoint(35F, -13F, 2F);

		model100tonhopper[14].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		model100tonhopper[14].setRotationPoint(38F, -16F, 2F);

		model100tonhopper[15].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		model100tonhopper[15].setRotationPoint(-53F, -10F, -15F);

		model100tonhopper[16].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		model100tonhopper[16].setRotationPoint(-56F, -13F, -15F);

		model100tonhopper[17].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		model100tonhopper[17].setRotationPoint(-59F, -16F, -15F);

		model100tonhopper[18].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		model100tonhopper[18].setRotationPoint(-53F, -10F, 2F);

		model100tonhopper[19].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		model100tonhopper[19].setRotationPoint(-56F, -13F, 2F);

		model100tonhopper[20].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		model100tonhopper[20].setRotationPoint(-59F, -16F, 2F);

		model100tonhopper[21].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		model100tonhopper[21].setRotationPoint(-59F, -16F, -4F);

		model100tonhopper[22].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		model100tonhopper[22].setRotationPoint(-59F, -16F, -9F);

		model100tonhopper[23].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		model100tonhopper[23].setRotationPoint(-59F, -16F, -12F);

		model100tonhopper[24].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		model100tonhopper[24].setRotationPoint(38F, -16F, -6.5F);

		model100tonhopper[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		model100tonhopper[25].setRotationPoint(38F, -16F, -4F);

		model100tonhopper[26].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		model100tonhopper[26].setRotationPoint(38F, -16F, -9F);

		model100tonhopper[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 102
		model100tonhopper[27].setRotationPoint(-62F, -1.5F, -7F);

		model100tonhopper[28].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		model100tonhopper[28].setRotationPoint(-59F, -16F, -1F);

		model100tonhopper[29].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		model100tonhopper[29].setRotationPoint(-59F, -16F, -6.5F);

		model100tonhopper[30].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		model100tonhopper[30].setRotationPoint(38F, -16F, -12F);

		model100tonhopper[31].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		model100tonhopper[31].setRotationPoint(38F, -16F, -1F);

		model100tonhopper[32].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 111
		model100tonhopper[32].setRotationPoint(-60F, -10F, -3F);

		model100tonhopper[33].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 112
		model100tonhopper[33].setRotationPoint(40F, -10F, -14F);

		model100tonhopper[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 113
		model100tonhopper[34].setRotationPoint(39F, -8F, -12F);

		model100tonhopper[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
		model100tonhopper[35].setRotationPoint(-60F, -8F, -1F);

		model100tonhopper[36].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 120
		model100tonhopper[36].setRotationPoint(39F, -1.5F, -7F);

		model100tonhopper[37].addTrapezoid(0F, 0F, 0F, 4, 5, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 120
		model100tonhopper[37].setRotationPoint(4F, 0F, -9F);

		model100tonhopper[38].addTrapezoid(0F, 0F, 0F, 4, 5, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 121
		model100tonhopper[38].setRotationPoint(-28F, 0F, -9F);

		model100tonhopper[39].addTrapezoid(0F, 0F, 0F, 4, 5, 6, 0F, 4.00F, ModelRendererTurbo.MR_TOP); // Box 123
		model100tonhopper[39].setRotationPoint(-12F, 0F, -9F);

		model100tonhopper[40].addBox(0F, 0F, 0F, 4, 18, 0, 0F); // Box 149
		model100tonhopper[40].setRotationPoint(-59F, -16F, 3.05F);

		model100tonhopper[41].addBox(0F, 0F, 0F, 4, 18, 0, 0F); // Box 150
		model100tonhopper[41].setRotationPoint(35F, -16F, -15.05F);

		model100tonhopper[42].addBox(0F, 0F, 0F, 4, 18, 0, 0F); // Box 151
		model100tonhopper[42].setRotationPoint(-59F, -16F, -15.05F);

		model100tonhopper[43].addBox(0F, 0F, 0F, 4, 18, 0, 0F); // Box 152
		model100tonhopper[43].setRotationPoint(35F, -16F, 3.05F);


	}
	private ModelFreightTruckM fronttrucks = new ModelFreightTruckM();
	private ModelFreightTruckM backtrucks = new ModelFreightTruckM();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 44; i++)
		{
			model100tonhopper[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-3.5,-0.1,-0.575);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1,-0.1,-0.575);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo model100tonhopper[];
}