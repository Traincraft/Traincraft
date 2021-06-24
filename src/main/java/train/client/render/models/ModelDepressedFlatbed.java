//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.10.2017 - 14:43:42
// Last changed on: 29.10.2017 - 14:43:42

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.RenderRollingStock;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelDepressedFlatbed extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelDepressedFlatbed() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private ModelFreightTruckM trucks = new ModelFreightTruckM();
	private ModelCharB1 tank1 = new ModelCharB1();
	private ModelFT17 tank2 = new ModelFT17();
	private ModelPanzerI tank3 = new ModelPanzerI();
	private ModelGP7 gp7 = new ModelGP7();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		Tessellator.bindTexture(RenderRollingStock.getTexture(entity));
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-3.15,0,-0.25);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glTranslated(5.45,0,0);
		trucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		if( entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/CharB1.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0.9, 0.14, -0.0425);
			GL11.glScalef(0.55f, 0.55f, 0.55f);
			tank1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if( entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/PanzerI.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0.45,0.025,-0.11);
			GL11.glScalef(0.55f,0.55f,0.55f);
			tank3.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}else if( entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==11) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/gp7_Yellow.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0.3,0.45,-0.1);
			GL11.glRotatef(180, 0, 0, 1);
			gp7.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		} else {     Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FT17.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0.5,0.04,-0.0425);
			GL11.glScalef(0.55f,0.55f,0.55f);
			tank2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 96
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 97
		bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 98
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 83
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 84
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		bodyModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 87
		bodyModel[10] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 88
		bodyModel[11] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 89
		bodyModel[12] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 90
		/*bodyModel[13] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 314
		bodyModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 86
		bodyModel[15] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 87
		bodyModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 88
		bodyModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 89
		bodyModel[18] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 90
		bodyModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 91
		bodyModel[20] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 92
		bodyModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[22] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 94
		bodyModel[23] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 96
		bodyModel[25] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 98
		bodyModel[27] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 99
		bodyModel[28] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 100
		bodyModel[29] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 101
		bodyModel[30] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 102
		bodyModel[31] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 103
		bodyModel[32] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		bodyModel[33] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 105
		bodyModel[34] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 106
		bodyModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 107
		bodyModel[36] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 108
		bodyModel[37] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 109
		bodyModel[38] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 110
		bodyModel[39] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 111
		bodyModel[40] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 112
		bodyModel[41] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 113
		bodyModel[42] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 114
		bodyModel[43] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 115
		bodyModel[44] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 116
		bodyModel[45] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 117
		bodyModel[46] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 118
		bodyModel[47] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 119
		bodyModel[48] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 120
		bodyModel[49] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 121
		bodyModel[50] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 122
		bodyModel[51] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 123
		bodyModel[52] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 124
		bodyModel[53] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 125
		bodyModel[54] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 126
		bodyModel[55] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 127
		bodyModel[56] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 129
		bodyModel[58] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 130
		bodyModel[59] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 131
		bodyModel[60] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 132
		bodyModel[61] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 133
		bodyModel[62] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 134
		bodyModel[63] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 135
		bodyModel[64] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 136
		bodyModel[65] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 137
		bodyModel[66] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 138
		bodyModel[67] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 139
		bodyModel[68] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 140
		bodyModel[69] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 141
		bodyModel[70] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 142
		bodyModel[71] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 143
		bodyModel[72] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 144
		bodyModel[73] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 145
		bodyModel[74] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 146
		bodyModel[75] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 147
		bodyModel[76] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 148
		bodyModel[77] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 149
		bodyModel[78] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 150
		bodyModel[79] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 151
		bodyModel[80] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 152
		bodyModel[81] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 153
		bodyModel[82] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 154
		bodyModel[83] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 155
		bodyModel[84] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 156*/

		bodyModel[0].addBox(0F, 0F, 0F, 23, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-51F, 0F, -12.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 94
		bodyModel[1].setRotationPoint(-58F, 1F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 95
		bodyModel[2].setRotationPoint(63F, 1F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 96
		bodyModel[3].setRotationPoint(36F, 0F, -12.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 23, 2, 22, 0F); // Box 97
		bodyModel[4].setRotationPoint(38F, 0F, -12.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 50, 2, 22, 0F); // Box 98
		bodyModel[5].setRotationPoint(-20F, 6F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 83
		bodyModel[6].setRotationPoint(32F, 1F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[7].setRotationPoint(30F, 6F, -12.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 86
		bodyModel[8].setRotationPoint(-22F, 6F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[9].setRotationPoint(-26F, 1F, -12.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[10].setRotationPoint(-28F, 0F, -12.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 4, 22, 0F); // Box 89
		bodyModel[11].setRotationPoint(61F, 0F, -12.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 4, 22, 0F); // Box 90
		bodyModel[12].setRotationPoint(-53F, 0F, -12.5F);

		/*bodyModel[13].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 314
		bodyModel[13].setRotationPoint(-19F, 0F, -4.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 86
		bodyModel[14].setRotationPoint(-19F, 0F, 1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 87
		bodyModel[15].setRotationPoint(-13F, 0F, 1.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 88
		bodyModel[16].setRotationPoint(-13F, 0F, -4.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 89
		bodyModel[17].setRotationPoint(-1F, 0F, 1.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 90
		bodyModel[18].setRotationPoint(-1F, 0F, -4.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 91
		bodyModel[19].setRotationPoint(-7F, 0F, -4.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 92
		bodyModel[20].setRotationPoint(-7F, 0F, 1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 93
		bodyModel[21].setRotationPoint(11F, 0F, 1.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 94
		bodyModel[22].setRotationPoint(11F, 0F, -4.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 95
		bodyModel[23].setRotationPoint(5F, 0F, -4.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 96
		bodyModel[24].setRotationPoint(5F, 0F, 1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 97
		bodyModel[25].setRotationPoint(23F, 0F, 1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 98
		bodyModel[26].setRotationPoint(23F, 0F, -4.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 99
		bodyModel[27].setRotationPoint(17F, 0F, -4.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 100
		bodyModel[28].setRotationPoint(17F, 0F, 1.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 101
		bodyModel[29].setRotationPoint(23F, 0F, -10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 102
		bodyModel[30].setRotationPoint(17F, 0F, -10.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 103
		bodyModel[31].setRotationPoint(11F, 0F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 104
		bodyModel[32].setRotationPoint(5F, 0F, -10.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 105
		bodyModel[33].setRotationPoint(-1F, 0F, -10.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 106
		bodyModel[34].setRotationPoint(-7F, 0F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 107
		bodyModel[35].setRotationPoint(-13F, 0F, -10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 108
		bodyModel[36].setRotationPoint(-19F, 0F, -10.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 109
		bodyModel[37].setRotationPoint(23F, -6F, -10.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 110
		bodyModel[38].setRotationPoint(17F, -6F, -10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 111
		bodyModel[39].setRotationPoint(11F, -6F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 112
		bodyModel[40].setRotationPoint(5F, -6F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 113
		bodyModel[41].setRotationPoint(-1F, -6F, -10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 114
		bodyModel[42].setRotationPoint(-7F, -6F, -10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 115
		bodyModel[43].setRotationPoint(-13F, -6F, -10.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 116
		bodyModel[44].setRotationPoint(-19F, -6F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 117
		bodyModel[45].setRotationPoint(23F, -6F, -4.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 118
		bodyModel[46].setRotationPoint(23F, -6F, 1.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 119
		bodyModel[47].setRotationPoint(17F, -6F, 1.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 120
		bodyModel[48].setRotationPoint(17F, -6F, -4.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 121
		bodyModel[49].setRotationPoint(11F, -6F, -4.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 122
		bodyModel[50].setRotationPoint(11F, -6F, 1.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 123
		bodyModel[51].setRotationPoint(5F, -6F, 1.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 124
		bodyModel[52].setRotationPoint(5F, -6F, -4.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 125
		bodyModel[53].setRotationPoint(-1F, -6F, -4.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 126
		bodyModel[54].setRotationPoint(-1F, -6F, 1.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 127
		bodyModel[55].setRotationPoint(-7F, -6F, 1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 128
		bodyModel[56].setRotationPoint(-7F, -6F, -4.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 129
		bodyModel[57].setRotationPoint(-13F, -6F, -4.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 130
		bodyModel[58].setRotationPoint(-19F, -6F, -4.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 131
		bodyModel[59].setRotationPoint(-19F, -6F, 1.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 132
		bodyModel[60].setRotationPoint(-13F, -6F, 1.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 133
		bodyModel[61].setRotationPoint(23F, -12F, -10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 134
		bodyModel[62].setRotationPoint(17F, -12F, -10.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 135
		bodyModel[63].setRotationPoint(11F, -12F, -10.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 136
		bodyModel[64].setRotationPoint(5F, -12F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 137
		bodyModel[65].setRotationPoint(-1F, -12F, -10.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 138
		bodyModel[66].setRotationPoint(-7F, -12F, -10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[67].setRotationPoint(-13F, -12F, -10.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 140
		bodyModel[68].setRotationPoint(-19F, -12F, -10.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 141
		bodyModel[69].setRotationPoint(23F, -12F, -4.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 142
		bodyModel[70].setRotationPoint(23F, -12F, 1.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 143
		bodyModel[71].setRotationPoint(17F, -12F, 1.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 144
		bodyModel[72].setRotationPoint(17F, -12F, -4.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 145
		bodyModel[73].setRotationPoint(11F, -12F, -4.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 146
		bodyModel[74].setRotationPoint(11F, -12F, 1.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 147
		bodyModel[75].setRotationPoint(5F, -12F, 1.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 148
		bodyModel[76].setRotationPoint(5F, -12F, -4.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 149
		bodyModel[77].setRotationPoint(-1F, -12F, -4.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 150
		bodyModel[78].setRotationPoint(-1F, -12F, 1.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 151
		bodyModel[79].setRotationPoint(-7F, -12F, 1.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 152
		bodyModel[80].setRotationPoint(-7F, -12F, -4.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 153
		bodyModel[81].setRotationPoint(-13F, -12F, -4.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 154
		bodyModel[82].setRotationPoint(-19F, -12F, -4.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 155
		bodyModel[83].setRotationPoint(-19F, -12F, 1.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 156
		bodyModel[84].setRotationPoint(-13F, -12F, 1.5F);*/
	}
}