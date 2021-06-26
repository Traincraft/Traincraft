//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.05.2018 - 20:34:51
// Last changed on: 16.05.2018 - 20:34:51

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelGermanPost extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGermanPost() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRheingoldBogie bogie1 = new ModelRheingoldBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Rheingold_Bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.75,0.20,-0.5);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.32,0,-0.05);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 50
		bodyModel[34] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 51
		bodyModel[35] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 55
		bodyModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 56
		bodyModel[40] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 57
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 58
		bodyModel[42] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 60
		bodyModel[44] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 173
		bodyModel[47] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 174
		bodyModel[48] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 175
		bodyModel[49] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 178
		bodyModel[50] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 180
		bodyModel[51] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 181
		bodyModel[52] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 182
		bodyModel[53] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 183
		bodyModel[54] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 184
		bodyModel[55] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 185
		bodyModel[56] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 187
		bodyModel[57] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 188
		bodyModel[58] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 189
		bodyModel[59] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 190
		bodyModel[60] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 191
		bodyModel[61] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 192
		bodyModel[62] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 193
		bodyModel[63] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 194
		bodyModel[64] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 195
		bodyModel[65] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 196
		bodyModel[66] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 197
		bodyModel[67] = new ModelRendererTurbo(this, 119, 88, textureX, textureY); // Box 198
		bodyModel[68] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 199
		bodyModel[69] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 279
		bodyModel[70] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 284
		bodyModel[71] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 285
		bodyModel[72] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 286
		bodyModel[73] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 287
		bodyModel[74] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 288
		bodyModel[75] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 289
		bodyModel[76] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 308
		bodyModel[77] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 309
		bodyModel[78] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 310
		bodyModel[79] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 311
		bodyModel[80] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 312
		bodyModel[81] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 313
		bodyModel[82] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 290
		bodyModel[83] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 291
		bodyModel[84] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 294
		bodyModel[85] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 297
		bodyModel[86] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 298
		bodyModel[87] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 157
		bodyModel[88] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 158
		bodyModel[89] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 159
		bodyModel[90] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 160
		bodyModel[91] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 161
		bodyModel[92] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 163
		bodyModel[93] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 164
		bodyModel[94] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 165
		bodyModel[95] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 166
		bodyModel[96] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 167
		bodyModel[97] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 168
		bodyModel[98] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 169
		bodyModel[99] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 170
		bodyModel[100] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 171
		bodyModel[101] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 172
		bodyModel[102] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 173
		bodyModel[103] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 174
		bodyModel[104] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 175
		bodyModel[105] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 176
		bodyModel[106] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 177
		bodyModel[107] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 178
		bodyModel[108] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 179
		bodyModel[109] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 180
		bodyModel[110] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 181
		bodyModel[111] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 182
		bodyModel[112] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 183
		bodyModel[113] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 184
		bodyModel[114] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 185
		bodyModel[115] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 186
		bodyModel[116] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 187
		bodyModel[117] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 121
		bodyModel[119] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 122, 145, textureX, textureY); // Box 13
		bodyModel[121] = new ModelRendererTurbo(this, 228, 139, textureX, textureY); // Box 173
		bodyModel[122] = new ModelRendererTurbo(this, 167, 144, textureX, textureY); // Box 177
		bodyModel[123] = new ModelRendererTurbo(this, 101, 145, textureX, textureY); // Box 178
		bodyModel[124] = new ModelRendererTurbo(this, 192, 139, textureX, textureY); // Box 179
		bodyModel[125] = new ModelRendererTurbo(this, 145, 144, textureX, textureY); // Box 180
		bodyModel[126] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 129
		bodyModel[127] = new ModelRendererTurbo(this, 392, 51, textureX, textureY); // Box 181
		bodyModel[128] = new ModelRendererTurbo(this, 406, 51, textureX, textureY); // Box 182

		bodyModel[0].addBox(0F, 0F, -1F, 5, 17, 1, 0F); // Box 1
		bodyModel[0].setRotationPoint(-46F, -15F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 133, 1, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-49F, 2F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(81F, -16F, 9F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(-49F, -16F, 9F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 6
		bodyModel[4].setRotationPoint(-46F, -16F, 9F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[5].setRotationPoint(73F, -16F, 9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-13F, 3F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-48F, -19F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 131, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[8].setRotationPoint(83F, -19F, -10F);
		bodyModel[8].rotateAngleY = -3.14159265F;

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 18
		bodyModel[9].setRotationPoint(-49F, -19F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[10].setRotationPoint(83F, -19F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 21
		bodyModel[11].setRotationPoint(-52F, 2F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(-52F, -17F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 24
		bodyModel[13].setRotationPoint(-52F, -15F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 25
		bodyModel[14].setRotationPoint(-52F, -15F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 26
		bodyModel[15].setRotationPoint(-49F, -16F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 28
		bodyModel[16].setRotationPoint(-51F, 2F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 29
		bodyModel[17].setRotationPoint(-51F, 2F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 30
		bodyModel[18].setRotationPoint(-49F, -16F, -12F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 31
		bodyModel[19].setRotationPoint(-46F, -16F, -12F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 32
		bodyModel[20].setRotationPoint(-46F, -15F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		bodyModel[21].setRotationPoint(-52F, 1F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		bodyModel[22].setRotationPoint(-52F, 1F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(48F, 3F, -11F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addBox(0F, 0F, 0F, 47, 5, 22, 0F); // Box 40
		bodyModel[24].setRotationPoint(-6F, 3F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-49F, -19F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[26].setRotationPoint(83F, -19F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(84F, -19F, -10F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(-48F, -19F, -10F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(41F, 3F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(-6F, 3F, -11F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 47
		bodyModel[31].setRotationPoint(73F, -16F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 49
		bodyModel[32].setRotationPoint(81F, -16F, -12F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 50
		bodyModel[33].setRotationPoint(83F, -16F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 51
		bodyModel[34].setRotationPoint(84F, 2F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 52
		bodyModel[35].setRotationPoint(84F, -15F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[36].setRotationPoint(84F, -17F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 54
		bodyModel[37].setRotationPoint(84F, -15F, -8F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		bodyModel[38].setRotationPoint(84F, 2F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[39].setRotationPoint(85.5F, 1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[40].setRotationPoint(85.5F, 1F, 6F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[41].setRotationPoint(84F, 2F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 59
		bodyModel[42].setRotationPoint(-46F, 2F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 60
		bodyModel[43].setRotationPoint(-41F, 2F, -12F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 54
		bodyModel[44].setRotationPoint(58F, 3F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 55
		bodyModel[45].setRotationPoint(-27F, 3F, -2F);

		bodyModel[46].addBox(0F, 0F, -1F, 28, 18, 1, 0F); // Box 173
		bodyModel[46].setRotationPoint(-41F, -16F, 10F);

		bodyModel[47].addBox(0F, 0F, -1F, 25, 18, 1, 0F); // Box 174
		bodyModel[47].setRotationPoint(48F, -16F, 10F);

		bodyModel[48].addBox(0F, 0F, 0F, 29, 18, 1, 0F); // Box 175
		bodyModel[48].setRotationPoint(3F, -16F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
		bodyModel[49].setRotationPoint(-13F, -15F, 9.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 180
		bodyModel[50].setRotationPoint(-5F, -15F, 9.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 181
		bodyModel[51].setRotationPoint(32F, -15F, 9.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 182
		bodyModel[52].setRotationPoint(40F, -15F, 9.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 183
		bodyModel[53].setRotationPoint(73F, -15F, 9.25F);

		bodyModel[54].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 184
		bodyModel[54].setRotationPoint(32F, -16F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 185
		bodyModel[55].setRotationPoint(-13F, -16F, 9F);

		bodyModel[56].addBox(0F, 0F, -1F, 28, 18, 1, 0F); // Box 187
		bodyModel[56].setRotationPoint(-41F, -16F, -11F);

		bodyModel[57].addBox(0F, 0F, -1F, 25, 18, 1, 0F); // Box 188
		bodyModel[57].setRotationPoint(48F, -16F, -11F);

		bodyModel[58].addBox(0F, 0F, -1F, 29, 18, 1, 0F); // Box 189
		bodyModel[58].setRotationPoint(3F, -16F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[59].setRotationPoint(-13F, -15F, -12.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[60].setRotationPoint(-5F, -15F, -12.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[61].setRotationPoint(32F, -15F, -12.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[62].setRotationPoint(40F, -15F, -12.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[63].setRotationPoint(73F, -15F, -12.25F);

		bodyModel[64].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 195
		bodyModel[64].setRotationPoint(32F, -16F, -12F);

		bodyModel[65].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 196
		bodyModel[65].setRotationPoint(-13F, -16F, -12F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 18, 7, 0F); // Box 197
		bodyModel[66].setRotationPoint(-24F, -16F, 2F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 18, 7, 0F); // Box 198
		bodyModel[67].setRotationPoint(-24F, -16F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 18, 13, 0F); // Box 199
		bodyModel[68].setRotationPoint(57F, -16F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[69].setRotationPoint(66F, -4F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 284
		bodyModel[70].setRotationPoint(-25F, -9F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[71].setRotationPoint(-29F, -3F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[72].setRotationPoint(-27F, -2F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[73].setRotationPoint(-40F, -2F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[74].setRotationPoint(-41F, -3F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[75].setRotationPoint(-41F, -9F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 308
		bodyModel[76].setRotationPoint(-25F, -9F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[77].setRotationPoint(-29F, -3F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[78].setRotationPoint(-27F, -2F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[79].setRotationPoint(-40F, -2F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[80].setRotationPoint(-41F, -3F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[81].setRotationPoint(-41F, -9F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, -1.1F); // Box 290
		bodyModel[82].setRotationPoint(-23F, -5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 291
		bodyModel[83].setRotationPoint(-14F, -15F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F); // Box 294
		bodyModel[84].setRotationPoint(-23F, -15F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[85].setRotationPoint(-23F, -15F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[86].setRotationPoint(-23F, -16F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, -1.1F); // Box 157
		bodyModel[87].setRotationPoint(3F, -5F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F); // Box 158
		bodyModel[88].setRotationPoint(3F, -15F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 159
		bodyModel[89].setRotationPoint(12F, -15F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[90].setRotationPoint(3F, -16F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[91].setRotationPoint(3F, -15F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F); // Box 163
		bodyModel[92].setRotationPoint(22F, -15F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 164
		bodyModel[93].setRotationPoint(31F, -15F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[94].setRotationPoint(22F, -16F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[95].setRotationPoint(22F, -15F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 167
		bodyModel[96].setRotationPoint(-23F, -5F, 4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 168
		bodyModel[97].setRotationPoint(-14F, -15F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 169
		bodyModel[98].setRotationPoint(-23F, -15F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[99].setRotationPoint(-23F, -15F, 6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[100].setRotationPoint(-23F, -16F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 172
		bodyModel[101].setRotationPoint(3F, -5F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 173
		bodyModel[102].setRotationPoint(3F, -15F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 174
		bodyModel[103].setRotationPoint(12F, -15F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[104].setRotationPoint(3F, -16F, 6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[105].setRotationPoint(3F, -15F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 177
		bodyModel[106].setRotationPoint(22F, -15F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		bodyModel[107].setRotationPoint(31F, -15F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[108].setRotationPoint(22F, -16F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[109].setRotationPoint(22F, -15F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 11, 13, 0F,-0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.1F, -1F, -0.5F); // Box 181
		bodyModel[110].setRotationPoint(54F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,-0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -1.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F); // Box 182
		bodyModel[111].setRotationPoint(52F, -5F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[112].setRotationPoint(54F, -15F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[113].setRotationPoint(54F, -16F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 185
		bodyModel[114].setRotationPoint(54F, -15F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[115].setRotationPoint(58F, -4F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[116].setRotationPoint(58F, -10F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[117].setRotationPoint(-24F, -19F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[118].setRotationPoint(57F, -19F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[119].setRotationPoint(57F, -19F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[120].setRotationPoint(-49F, -23F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[121].setRotationPoint(-49F, -23F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[122].setRotationPoint(-49F, -23F, 4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[123].setRotationPoint(79F, -23F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[124].setRotationPoint(79F, -23F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, -4F, -5F, -1F, -4F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[125].setRotationPoint(79F, -23F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 123, 3, 18, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[126].setRotationPoint(-44F, -22F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 181
		bodyModel[127].setRotationPoint(84F, 2.1F, -2F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 182
		bodyModel[128].setRotationPoint(-53F, 2.1F, -2F);
	}
}