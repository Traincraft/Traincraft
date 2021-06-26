//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.07.2018 - 16:22:39
// Last changed on: 22.07.2018 - 16:22:39

package train.client.render.models; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelD51LongStreamlining extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelD51LongStreamlining() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[128];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelD51FrontBogie frontBogie = new ModelD51FrontBogie();
	private ModelD51RearBogie rearBogie = new ModelD51RearBogie();
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		super.render(entity, f0, f1, f2, f3, f4, scale);
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"d51_front_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(0f,0f,0);
		frontBogie.render();
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix +"d51_rear_bogie.png"));
		GL11.glTranslatef(0f,-0.05f,0);
		rearBogie.render();
		GL11.glPopMatrix();
	}
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 44
		bodyModel[21] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 53
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 54
		bodyModel[24] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 55
		bodyModel[25] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 60
		bodyModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[27] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 70
		bodyModel[28] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 83
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 84
		bodyModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 101
		bodyModel[40] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 104
		bodyModel[41] = new ModelRendererTurbo(this, 316, 112, textureX, textureY); // Box 107
		bodyModel[42] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 110
		bodyModel[44] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 113
		bodyModel[45] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 115
		bodyModel[46] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 116
		bodyModel[47] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 90
		bodyModel[49] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 91
		bodyModel[50] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 92
		bodyModel[51] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 93
		bodyModel[52] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 94
		bodyModel[53] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 95
		bodyModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 97
		bodyModel[55] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 98
		bodyModel[56] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 99
		bodyModel[57] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 101
		bodyModel[59] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 112
		bodyModel[66] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 113
		bodyModel[67] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 133
		bodyModel[69] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 134
		bodyModel[70] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 135
		bodyModel[71] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 136
		bodyModel[72] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 137
		bodyModel[73] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 103
		bodyModel[81] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 110
		bodyModel[84] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 111
		bodyModel[85] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 112
		bodyModel[86] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 113
		bodyModel[87] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 114
		bodyModel[88] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 142
		bodyModel[115] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Numberboard L
		bodyModel[116] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Numberboard R
		bodyModel[117] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 145
		bodyModel[118] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 147
		bodyModel[119] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 155
		bodyModel[121] = new ModelRendererTurbo(this, 493, 100, textureX, textureY); // Box 146
		bodyModel[122] = new ModelRendererTurbo(this, 486, 100, textureX, textureY); // Box 147
		bodyModel[123] = new ModelRendererTurbo(this, 354, 105, textureX, textureY); // Box 154
		bodyModel[124] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 149
		bodyModel[125] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 151
		bodyModel[126] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 102
		bodyModel[127] = new ModelRendererTurbo(this, 298, 105, textureX, textureY); // Box 133

		bodyModel[0].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 3
		bodyModel[0].setRotationPoint(-68F, 7F, 6F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 6
		bodyModel[1].setRotationPoint(-96F, 4F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[2].setRotationPoint(-80F, 30F, -3F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 11
		bodyModel[3].setRotationPoint(-22F, 15F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 12
		bodyModel[4].setRotationPoint(-10F, 15F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(-91F, 8F, -10F);

		bodyModel[6].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 14
		bodyModel[6].setRotationPoint(-55F, 7F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 15
		bodyModel[7].setRotationPoint(-95F, 8F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 15, 20, 0F); // Box 16
		bodyModel[8].setRotationPoint(-12F, 15F, -10F);

		bodyModel[9].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 18
		bodyModel[9].setRotationPoint(-42F, 7F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 19
		bodyModel[10].setRotationPoint(-12F, 33F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 49, 9, 12, 0F); // Box 23
		bodyModel[11].setRotationPoint(-73F, 3F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-94F, 9F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[13].setRotationPoint(-12F, 30F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 5, 1, 0F); // Box 29
		bodyModel[14].setRotationPoint(-90F, 23F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(-93F, 23F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 11, 1, 20, 0F); // Box 34
		bodyModel[16].setRotationPoint(-23F, 18F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 1, 20, 0F); // Box 39
		bodyModel[17].setRotationPoint(-32F, 21F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 40
		bodyModel[18].setRotationPoint(-10F, 15F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 43
		bodyModel[19].setRotationPoint(-92F, 29F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 44
		bodyModel[20].setRotationPoint(-100F, 5F, -1F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 49
		bodyModel[21].setRotationPoint(-78F, 27F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 53
		bodyModel[22].setRotationPoint(-10F, 28F, 9F);

		bodyModel[23].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 54
		bodyModel[23].setRotationPoint(-10F, 28F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 1, 18, 0F); // Box 55
		bodyModel[24].setRotationPoint(-10F, 15F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 49, 1, 20, 0F); // Box 60
		bodyModel[25].setRotationPoint(-84F, 18F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 68
		bodyModel[26].setRotationPoint(-88F, 27F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 15, 5, 0, 0F); // Box 70
		bodyModel[27].setRotationPoint(-10F, 10F, -3.05F);

		bodyModel[28].addBox(0F, 0F, 0F, 25, 10, 0, 0F); // Box 71
		bodyModel[28].setRotationPoint(-48F, 12F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 77
		bodyModel[29].setRotationPoint(-93F, 9F, 9F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 13, 7, 0F); // Box 80
		bodyModel[30].setRotationPoint(-84F, 5F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 83
		bodyModel[31].setRotationPoint(4F, 16F, 6F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 84
		bodyModel[32].setRotationPoint(4F, 16F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 95
		bodyModel[33].setRotationPoint(-85F, 5F, 5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 96
		bodyModel[34].setRotationPoint(-77F, 5F, 5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 97
		bodyModel[35].setRotationPoint(-77F, 11F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 98
		bodyModel[36].setRotationPoint(-86F, 11F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 100
		bodyModel[37].setRotationPoint(-33F, 29F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 101
		bodyModel[38].setRotationPoint(-30F, 29F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[39].setRotationPoint(-91F, 9F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 104
		bodyModel[40].setRotationPoint(-93F, 9F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 13, 5, 1, 0F); // Box 107
		bodyModel[41].setRotationPoint(-90F, 23F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 108
		bodyModel[42].setRotationPoint(-93F, 23F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[43].setRotationPoint(-91F, 9F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 78, 6, 14, 0F); // Box 113
		bodyModel[44].setRotationPoint(-90F, 20F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 78, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 115
		bodyModel[45].setRotationPoint(-90F, 16F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, -1F, 21, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 116
		bodyModel[46].setRotationPoint(-12F, 29F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, -1F, 21, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[47].setRotationPoint(-12F, 29F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[48].setRotationPoint(-35F, 18F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 91
		bodyModel[49].setRotationPoint(-26F, 18F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[50].setRotationPoint(-10F, 30F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 93
		bodyModel[51].setRotationPoint(-10F, 30F, 9F);

		bodyModel[52].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 94
		bodyModel[52].setRotationPoint(-81F, 6F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 95
		bodyModel[53].setRotationPoint(-78F, 12F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 97
		bodyModel[54].setRotationPoint(-72F, 5F, 8.75F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 98
		bodyModel[55].setRotationPoint(-71F, 6F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 99
		bodyModel[56].setRotationPoint(-70F, 5F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 100
		bodyModel[57].setRotationPoint(-68.5F, 6F, 7.05F);
		bodyModel[57].rotateAngleZ = 0.09599311F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 101
		bodyModel[58].setRotationPoint(-43F, 3F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 103
		bodyModel[59].setRotationPoint(-43F, 3F, 6F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 104
		bodyModel[60].setRotationPoint(-56F, 3F, 6F);

		bodyModel[61].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 105
		bodyModel[61].setRotationPoint(-54F, 3.5F, 6F);

		bodyModel[62].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 106
		bodyModel[62].setRotationPoint(-41F, 3.5F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 107
		bodyModel[63].setRotationPoint(-30F, 3F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[64].setRotationPoint(-71F, 12F, 8.25F);

		bodyModel[65].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 112
		bodyModel[65].setRotationPoint(-81F, 8F, 7F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 113
		bodyModel[66].setRotationPoint(-68F, 8F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 114
		bodyModel[67].setRotationPoint(-18F, 10F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[68].setRotationPoint(-10F, 16F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		bodyModel[69].setRotationPoint(-61F, 9.25F, 8.75F);
		bodyModel[69].rotateAngleZ = 0.26179939F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[70].setRotationPoint(-61F, 9.5F, 8F);
		bodyModel[70].rotateAngleZ = 0.14835299F;

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
		bodyModel[71].setRotationPoint(-44F, 6.5F, 8F);

		bodyModel[72].addShapeBox(2F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 137
		bodyModel[72].setRotationPoint(-44.5F, 3.5F, 8F);
		bodyModel[72].rotateAngleZ = -0.29670597F;

		bodyModel[73].addBox(0F, 0F, 0F, 0, 14, 14, 0F); // Box 134
		bodyModel[73].setRotationPoint(-90.05F, 16F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 60, 6, 12, 0F); // Box 120
		bodyModel[74].setRotationPoint(-84F, 12F, -6F);

		bodyModel[75].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 122
		bodyModel[75].setRotationPoint(-29F, 7F, 6F);

		bodyModel[76].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 123
		bodyModel[76].setRotationPoint(-67F, 3.5F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 124
		bodyModel[77].setRotationPoint(-69F, 3F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[78].setRotationPoint(-72F, 5F, 8.25F);
		bodyModel[78].rotateAngleZ = -0.10471976F;

		bodyModel[79].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 102
		bodyModel[79].setRotationPoint(-29F, 7F, -6F);

		bodyModel[80].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 103
		bodyModel[80].setRotationPoint(-42F, 7F, -6F);

		bodyModel[81].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 104
		bodyModel[81].setRotationPoint(-55F, 7F, -6F);

		bodyModel[82].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Box 105
		bodyModel[82].setRotationPoint(-68F, 7F, -6F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 110
		bodyModel[83].setRotationPoint(-85F, 5F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 111
		bodyModel[84].setRotationPoint(-77F, 5F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 13, 7, 0F); // Box 112
		bodyModel[85].setRotationPoint(-84F, 5F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 113
		bodyModel[86].setRotationPoint(-77F, 11F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 114
		bodyModel[87].setRotationPoint(-86F, 11F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 102
		bodyModel[88].setRotationPoint(-30F, 3F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 103
		bodyModel[89].setRotationPoint(-41F, 3.5F, -7F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 104
		bodyModel[90].setRotationPoint(-43F, 3F, -7F);

		bodyModel[91].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 105
		bodyModel[91].setRotationPoint(-54F, 3.5F, -7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 106
		bodyModel[92].setRotationPoint(-56F, 3F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 107
		bodyModel[93].setRotationPoint(-67F, 3.5F, -7F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 108
		bodyModel[94].setRotationPoint(-69F, 3F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 109
		bodyModel[95].setRotationPoint(-68.5F, 6F, -7.95F);
		bodyModel[95].rotateAngleZ = 0.09599311F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[96].setRotationPoint(-43F, 3F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 111
		bodyModel[97].setRotationPoint(-71F, 6F, -8F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 112
		bodyModel[98].setRotationPoint(-68F, 8F, -8F);

		bodyModel[99].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 113
		bodyModel[99].setRotationPoint(-79F, 6F, -8F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 114
		bodyModel[100].setRotationPoint(-79F, 8F, -8F);

		bodyModel[101].addShapeBox(2F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 115
		bodyModel[101].setRotationPoint(-44.5F, 3.5F, -9F);
		bodyModel[101].rotateAngleZ = -0.29670597F;

		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 116
		bodyModel[102].setRotationPoint(-44F, 6.5F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		bodyModel[103].setRotationPoint(-61F, 9.5F, -9F);
		bodyModel[103].rotateAngleZ = 0.14835299F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		bodyModel[104].setRotationPoint(-71F, 12F, -8.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 119
		bodyModel[105].setRotationPoint(-78F, 12F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[106].setRotationPoint(-72F, 5F, -8.75F);
		bodyModel[106].rotateAngleZ = -0.10471976F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[107].setRotationPoint(-61F, 9.25F, -9.25F);
		bodyModel[107].rotateAngleZ = 0.26179939F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[108].setRotationPoint(-70F, 5F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[109].setRotationPoint(-72F, 5F, -9.75F);

		bodyModel[110].addBox(0F, 0F, 0F, 25, 10, 0, 0F); // Box 124
		bodyModel[110].setRotationPoint(-48F, 12F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 138
		bodyModel[111].setRotationPoint(-21F, 13F, -7F);

		bodyModel[112].addBox(0F, 0F, 0F, 22, 5, 6, 0F); // Box 139
		bodyModel[112].setRotationPoint(-17F, 10F, -3F);

		bodyModel[113].addBox(0F, 0F, 0F, 15, 5, 0, 0F); // Box 140
		bodyModel[113].setRotationPoint(-10F, 10F, 3.05F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 32, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[114].setRotationPoint(-80F, 34F, -2F);

		bodyModel[115].addBox(0F, 0F, 0F, 9, 2, 0, 0F); // Numberboard L
		bodyModel[115].setRotationPoint(-9F, 19F, 10.01F);

		bodyModel[116].addBox(0F, 0F, 0F, 9, 2, 0, 0F); // Numberboard R
		bodyModel[116].setRotationPoint(-9F, 19F, -10.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 145
		bodyModel[117].setRotationPoint(-82F, 30F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F); // Box 147
		bodyModel[118].setRotationPoint(-82F, 34F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 153
		bodyModel[119].setRotationPoint(-80F, 30F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 78, 4, 6, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[120].setRotationPoint(-90F, 26F, -3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[121].setRotationPoint(-45F, 30F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[122].setRotationPoint(-48F, 34F, -1.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 154
		bodyModel[123].setRotationPoint(-87F, 29F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[124].setRotationPoint(4F, 32F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 151
		bodyModel[125].setRotationPoint(4F, 32F, 6F);

		bodyModel[126].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 102
		bodyModel[126].setRotationPoint(-91F, 19F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 133
		bodyModel[127].setRotationPoint(-91F, 19F, -10F);
	}
}