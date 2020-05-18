//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.05.2018 - 18:43:45
// Last changed on: 24.05.2018 - 18:43:45

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.EntityRollingStock;
import train.common.library.Info;

public class ModelC62Locomotive extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	private ModelC62FrontBogie frontBogie = new ModelC62FrontBogie();
	private ModelC62RearBogie rearBogie = new ModelC62RearBogie();
	public ModelC62Locomotive() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[120];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		super.render(entity, f0, f1, f2, f3, f4, scale);
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"c62_front_"+((EntityRollingStock)entity).getColorAsString() + ".png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-5.75f,-0.15f,0);
		frontBogie.render();
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"c62_back_"+((EntityRollingStock)entity).getColorAsString() + ".png"));
		GL11.glTranslatef(5.75f,0.15f,0);
		rearBogie.render();
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 346, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 144, 33, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 43
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[26] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 49
		bodyModel[28] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 54
		bodyModel[30] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 55
		bodyModel[31] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 68
		bodyModel[33] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 80
		bodyModel[37] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 88
		bodyModel[40] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 90
		bodyModel[42] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 92
		bodyModel[44] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 94
		bodyModel[46] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 95
		bodyModel[47] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 96
		bodyModel[48] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 97
		bodyModel[49] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 98
		bodyModel[50] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 99
		bodyModel[51] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 101
		bodyModel[54] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 102
		bodyModel[55] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 103
		bodyModel[56] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 104
		bodyModel[57] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 105
		bodyModel[58] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 106
		bodyModel[59] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 107
		bodyModel[60] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 108
		bodyModel[61] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 109
		bodyModel[62] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 110
		bodyModel[63] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 113
		bodyModel[64] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 115
		bodyModel[66] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 116
		bodyModel[67] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 117
		bodyModel[68] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 93
		bodyModel[74] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 94
		bodyModel[75] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 95
		bodyModel[76] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 97
		bodyModel[77] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 98
		bodyModel[78] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 99
		bodyModel[79] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 101
		bodyModel[80] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 103
		bodyModel[81] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 112
		bodyModel[87] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 113
		bodyModel[88] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 114
		bodyModel[89] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 115
		bodyModel[90] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 116
		bodyModel[91] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 132
		bodyModel[92] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 133
		bodyModel[93] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 134
		bodyModel[94] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 135
		bodyModel[95] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 136
		bodyModel[96] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 137
		bodyModel[97] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 138
		bodyModel[98] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 139
		bodyModel[99] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 140
		bodyModel[100] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 142
		bodyModel[101] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 146
		bodyModel[102] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[103] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 148
		bodyModel[104] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 149
		bodyModel[105] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 150
		bodyModel[106] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 151
		bodyModel[107] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 152
		bodyModel[108] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 153
		bodyModel[109] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 154
		bodyModel[110] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 155
		bodyModel[111] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 157
		bodyModel[112] = new ModelRendererTurbo(this, 7, 110, textureX, textureY); // Box 134
		bodyModel[113] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 122
		bodyModel[115] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 126

		bodyModel[0].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29F, 7F, -6.05F);

		bodyModel[1].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 3
		bodyModel[1].setRotationPoint(-59F, 7F, 6.05F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 6
		bodyModel[2].setRotationPoint(-96F, 4F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 7, 4, 0F); // Box 9
		bodyModel[3].setRotationPoint(-83F, 27F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 31, 6, 6, 0F); // Box 10
		bodyModel[4].setRotationPoint(-69F, 26F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 16, 3, 14, 0F); // Box 11
		bodyModel[5].setRotationPoint(-21F, 12F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 12
		bodyModel[6].setRotationPoint(-8F, 15F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-91F, 8F, -10F);

		bodyModel[8].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 14
		bodyModel[8].setRotationPoint(-44F, 7F, 6.05F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 15
		bodyModel[9].setRotationPoint(-95F, 8F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 15, 20, 0F); // Box 16
		bodyModel[10].setRotationPoint(-10F, 15F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 3, 20, 0F); // Box 17
		bodyModel[11].setRotationPoint(1F, 12F, -10F);

		bodyModel[12].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 18
		bodyModel[12].setRotationPoint(-29F, 7F, 6.05F);

		bodyModel[13].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 19
		bodyModel[13].setRotationPoint(-10F, 33F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 40, 10, 12, 0F); // Box 23
		bodyModel[14].setRotationPoint(-64F, 3F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 5, 12, 0F); // Box 24
		bodyModel[15].setRotationPoint(-94F, 10F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 7, 12, 0F); // Box 25
		bodyModel[16].setRotationPoint(-9F, 8F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[17].setRotationPoint(-10F, 30F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 14, 5, 1, 0F); // Box 29
		bodyModel[18].setRotationPoint(-90F, 23F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 31
		bodyModel[19].setRotationPoint(-93F, 23F, 9F);

		bodyModel[20].addBox(0F, 0F, 0F, 13, 1, 20, 0F); // Box 34
		bodyModel[20].setRotationPoint(-23F, 18F, -10F);

		bodyModel[21].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 35
		bodyModel[21].setRotationPoint(-44F, 7F, -6.05F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 1, 20, 0F); // Box 39
		bodyModel[22].setRotationPoint(-33F, 21F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 40
		bodyModel[23].setRotationPoint(-8F, 15F, 9F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 43
		bodyModel[24].setRotationPoint(-92F, 29F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 44
		bodyModel[25].setRotationPoint(-101F, 5F, -2F);

		bodyModel[26].addBox(-7F, -7F, 0F, 14, 14, 0, 0F); // Box 47
		bodyModel[26].setRotationPoint(-59F, 7F, -6.05F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 49
		bodyModel[27].setRotationPoint(-78F, 27F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 53
		bodyModel[28].setRotationPoint(-8F, 28F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 54
		bodyModel[29].setRotationPoint(-8F, 28F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 16, 1, 18, 0F); // Box 55
		bodyModel[30].setRotationPoint(-8F, 15F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 48, 1, 20, 0F); // Box 60
		bodyModel[31].setRotationPoint(-84F, 18F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 68
		bodyModel[32].setRotationPoint(-88F, 27F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 16, 11, 0, 0F); // Box 70
		bodyModel[33].setRotationPoint(-9F, 4F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 16, 11, 0, 0F); // Box 71
		bodyModel[34].setRotationPoint(-9F, 4F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 77
		bodyModel[35].setRotationPoint(-93F, 9F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 8, 15, 7, 0F); // Box 80
		bodyModel[36].setRotationPoint(-84F, 3F, 3F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 83
		bodyModel[37].setRotationPoint(6F, 16F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 84
		bodyModel[38].setRotationPoint(6F, 16F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 88
		bodyModel[39].setRotationPoint(-77F, 19F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 89
		bodyModel[40].setRotationPoint(-85F, 3F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 90
		bodyModel[41].setRotationPoint(-76F, 3F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 15, 7, 0F); // Box 91
		bodyModel[42].setRotationPoint(-84F, 3F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 92
		bodyModel[43].setRotationPoint(-76F, 10F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 93
		bodyModel[44].setRotationPoint(-86F, 10F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 25, 4, 12, 0F); // Box 94
		bodyModel[45].setRotationPoint(-89F, 9F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 95
		bodyModel[46].setRotationPoint(-85F, 3F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 96
		bodyModel[47].setRotationPoint(-76F, 3F, 5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 97
		bodyModel[48].setRotationPoint(-76F, 10F, 7F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 98
		bodyModel[49].setRotationPoint(-86F, 10F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 99
		bodyModel[50].setRotationPoint(-91F, 29F, 3F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 100
		bodyModel[51].setRotationPoint(-34F, 29F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 101
		bodyModel[52].setRotationPoint(-31F, 29F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[53].setRotationPoint(-91F, 9F, 9F);

		bodyModel[54].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 102
		bodyModel[54].setRotationPoint(-91F, 19F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 103
		bodyModel[55].setRotationPoint(-84F, 22F, 9F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 104
		bodyModel[56].setRotationPoint(-93F, 9F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
		bodyModel[57].setRotationPoint(-77F, 19F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 106
		bodyModel[58].setRotationPoint(-84F, 22F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 14, 5, 1, 0F); // Box 107
		bodyModel[59].setRotationPoint(-90F, 23F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 108
		bodyModel[60].setRotationPoint(-93F, 23F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 109
		bodyModel[61].setRotationPoint(-91F, 19F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[62].setRotationPoint(-91F, 9F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 80, 6, 14, 0F); // Box 113
		bodyModel[63].setRotationPoint(-90F, 20F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 80, 4, 6, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[64].setRotationPoint(-90F, 26F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 80, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 115
		bodyModel[65].setRotationPoint(-90F, 16F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, -1F, 21, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 116
		bodyModel[66].setRotationPoint(-10F, 29F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, -1F, 21, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[67].setRotationPoint(-10F, 29F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,-5F, 0F, 0F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[68].setRotationPoint(-101F, 1F, -12F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, 0F); // Box 89
		bodyModel[69].setRotationPoint(-101F, 1F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[70].setRotationPoint(-36F, 18F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 91
		bodyModel[71].setRotationPoint(-26F, 18F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[72].setRotationPoint(-8F, 30F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 93
		bodyModel[73].setRotationPoint(-8F, 30F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 94
		bodyModel[74].setRotationPoint(-75F, 5F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 95
		bodyModel[75].setRotationPoint(-75F, 11F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 97
		bodyModel[76].setRotationPoint(-71F, 4F, 8.75F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 98
		bodyModel[77].setRotationPoint(-70F, 5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 99
		bodyModel[78].setRotationPoint(-69F, 4F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 101
		bodyModel[79].setRotationPoint(-45F, 3.5F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 103
		bodyModel[80].setRotationPoint(-45F, 3.5F, 6F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 104
		bodyModel[81].setRotationPoint(-60F, 3.5F, 6F);

		bodyModel[82].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 105
		bodyModel[82].setRotationPoint(-58F, 4F, 6F);

		bodyModel[83].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 106
		bodyModel[83].setRotationPoint(-43F, 4F, 6F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 107
		bodyModel[84].setRotationPoint(-30F, 3.5F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[85].setRotationPoint(-70F, 11F, 8.25F);

		bodyModel[86].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 112
		bodyModel[86].setRotationPoint(-75F, 7F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 113
		bodyModel[87].setRotationPoint(-67F, 7F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 2, 14, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[88].setRotationPoint(-21F, 10F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 40, 11, 0, 0F); // Box 115
		bodyModel[89].setRotationPoint(-58F, 9F, 7.05F);

		bodyModel[90].addBox(0F, 0F, 0F, 40, 11, 0, 0F); // Box 116
		bodyModel[90].setRotationPoint(-58F, 9F, -7.05F);

		bodyModel[91].addBox(0F, 0F, 0F, 11, 3, 14, 0F); // Box 132
		bodyModel[91].setRotationPoint(-21F, 15F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[92].setRotationPoint(-8F, 16F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		bodyModel[93].setRotationPoint(-60F, 8.25F, 8.75F);
		bodyModel[93].rotateAngleZ = 0.19198622F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[94].setRotationPoint(-60F, 8.5F, 8.25F);
		bodyModel[94].rotateAngleZ = 0.06108652F;

		bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
		bodyModel[95].setRotationPoint(-46F, 7F, 8F);

		bodyModel[96].addShapeBox(2F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 137
		bodyModel[96].setRotationPoint(-46.5F, 4F, 8F);
		bodyModel[96].rotateAngleZ = -0.29670597F;

		bodyModel[97].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 138
		bodyModel[97].setRotationPoint(-30F, 3.5F, -7F);

		bodyModel[98].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 139
		bodyModel[98].setRotationPoint(-43F, 4F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		bodyModel[99].setRotationPoint(-46F, 7F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 142
		bodyModel[100].setRotationPoint(-45F, 3.5F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 146
		bodyModel[101].setRotationPoint(-58F, 4F, -7F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 147
		bodyModel[102].setRotationPoint(-60F, 3.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 148
		bodyModel[103].setRotationPoint(-71F, 4F, -9.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[104].setRotationPoint(-69F, 4F, -8.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 150
		bodyModel[105].setRotationPoint(-71F, 4F, -8.75F);
		bodyModel[105].rotateAngleZ = -0.12217305F;

		bodyModel[106].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 151
		bodyModel[106].setRotationPoint(-70F, 5F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 152
		bodyModel[107].setRotationPoint(-67F, 7F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 153
		bodyModel[108].setRotationPoint(-75F, 7F, -8F);

		bodyModel[109].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 154
		bodyModel[109].setRotationPoint(-75F, 5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[110].setRotationPoint(-70F, 11F, -8.75F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 157
		bodyModel[111].setRotationPoint(-75F, 11F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 14, 14, 0F); // Box 134
		bodyModel[112].setRotationPoint(-90.05F, 16F, -7F);

		bodyModel[113].addShapeBox(2F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 120
		bodyModel[113].setRotationPoint(-46.5F, 4F, -9F);
		bodyModel[113].rotateAngleZ = -0.29670597F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 122
		bodyModel[114].setRotationPoint(-45F, 3.5F, -8.13F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 121
		bodyModel[115].setRotationPoint(-67F, 5F, 7F);
		bodyModel[115].rotateAngleZ = 0.04363323F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 122
		bodyModel[116].setRotationPoint(-67F, 5F, -8F);
		bodyModel[116].rotateAngleZ = 0.04363323F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
		bodyModel[117].setRotationPoint(-60F, 8.5F, -8.75F);
		bodyModel[117].rotateAngleZ = 0.06108652F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[118].setRotationPoint(-60F, 8.25F, -9.25F);
		bodyModel[118].rotateAngleZ = 0.19198622F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[119].setRotationPoint(-71F, 4F, 7.75F);
		bodyModel[119].rotateAngleZ = -0.12217305F;
	}
}