//spooky!
package train.client.render.models.cabs;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelD9_CabSquareWindow extends ModelConverter
{
	int textureX = 256;
	int textureY = 256;

	public ModelD9_CabSquareWindow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 100
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 112
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 123
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 120
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 99
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 135
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 190
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 150
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 152
		bodyModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 153
		bodyModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 154
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 119
		bodyModel[15] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 120
		bodyModel[16] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 121
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 127
		bodyModel[18] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 137
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 94
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 95
		bodyModel[22] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 155
		bodyModel[23] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 19
		bodyModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 20
		bodyModel[25] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 21
		bodyModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 24
		bodyModel[28] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 172
		bodyModel[29] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 177
		bodyModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, "lamp"); // Box 247 lamp front
		bodyModel[32] = new ModelRendererTurbo(this, 137, 9, textureX, textureY, "lamp"); // Box 248 lamp front
		bodyModel[33] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 185
		bodyModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 186
		bodyModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 187
		bodyModel[36] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 227
		bodyModel[37] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 228
		bodyModel[38] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 229
		bodyModel[39] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 230
		bodyModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 232
		bodyModel[41] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 233
		bodyModel[42] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 234
		bodyModel[43] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 314 door swing right
		bodyModel[44] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 238 light cover
		bodyModel[45] = new ModelRendererTurbo(this, 153, 33, textureX, textureY, "lamp"); // Box 239 glow liveryimg 1
		bodyModel[46] = new ModelRendererTurbo(this, 49, 41, textureX, textureY, "lamp"); // Box 240 glow liveryimg 1
		bodyModel[47] = new ModelRendererTurbo(this, 177, 41, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY, "lamp"); // Box 242 glow liveryimg 2
		bodyModel[49] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 210
		bodyModel[50] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 211
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 235
		bodyModel[52] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 131
		bodyModel[55] = new ModelRendererTurbo(this, 97, 17, textureX, textureY, "lamp"); // Box 154 lamp front
		bodyModel[56] = new ModelRendererTurbo(this, 249, 17, textureX, textureY, "lamp"); // Box 155 lamp front
		bodyModel[57] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 236
		bodyModel[58] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 86
		bodyModel[59] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 216
		bodyModel[60] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 217

		bodyModel[0].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 94
		bodyModel[0].setRotationPoint(-47F, -17F, -1F);

		bodyModel[1].addShapeBox(3F, 0F, 0F, 1, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[1].setRotationPoint(-26F, -21F, -11F);

		bodyModel[2].addShapeBox(3F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[2].setRotationPoint(-38F, -16F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[3].setRotationPoint(-38F, -21F, -11F);

		bodyModel[4].addBox(3F, 0F, 0F, 9, 5, 1, 0F); // Box 120
		bodyModel[4].setRotationPoint(-35F, -21F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-47F, -14F, -11F);

		bodyModel[6].addShapeBox(3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[6].setRotationPoint(-38F, -17F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[7].setRotationPoint(-35F, -17F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 190
		bodyModel[8].setRotationPoint(-34F, -21F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 123
		bodyModel[9].setRotationPoint(-38F, -21F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,-9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 150
		bodyModel[10].setRotationPoint(-44F, -17F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 152
		bodyModel[11].setRotationPoint(-44F, -17F, 1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[12].setRotationPoint(-44F, -17F, 1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F); // Box 154
		bodyModel[13].setRotationPoint(-44F, -17F, -11F);

		bodyModel[14].addBox(3F, 0F, 0F, 9, 5, 1, 0F); // Box 119
		bodyModel[14].setRotationPoint(-35F, -21F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 120
		bodyModel[15].setRotationPoint(-47F, -14F, 1F);

		bodyModel[16].addShapeBox(3F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[16].setRotationPoint(-38F, -16F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[17].setRotationPoint(-34F, -21F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 13, 5, 22, 0F); // Box 137
		bodyModel[18].setRotationPoint(-35F, -6F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[19].setRotationPoint(-45.75F, -15F, -6F);
		bodyModel[19].rotateAngleY = 0.29670597F;

		bodyModel[20].addShapeBox(0F, 0F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[20].setRotationPoint(-45.75F, -16F, -6F);
		bodyModel[20].rotateAngleY = 0.29670597F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[21].setRotationPoint(-45.75F, -16F, -6F);
		bodyModel[21].rotateAngleY = 0.29670597F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 155
		bodyModel[22].setRotationPoint(-34.2F, -23F, -8.2F);
		bodyModel[22].rotateAngleY = 0.26179939F;

		bodyModel[23].addBox(0F, 0F, 0F, 11, 3, 14, 0F); // Box 19
		bodyModel[23].setRotationPoint(-33F, -24F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[24].setRotationPoint(-33F, -24F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[25].setRotationPoint(-33F, -24F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 22
		bodyModel[26].setRotationPoint(-36F, -24F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2.5F, 0F, 4F); // Box 24
		bodyModel[27].setRotationPoint(-36F, -24F, 0F);

		bodyModel[28].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 172
		bodyModel[28].setRotationPoint(-34.2F, -23F, 7.8F);
		bodyModel[28].rotateAngleY = -0.26179939F;

		bodyModel[29].addBox(0F, 0F, 0F, 12, 11, 2, 0F); // Box 177
		bodyModel[29].setRotationPoint(-47F, -12F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[30].setRotationPoint(-36.5F, -23.5F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 lamp front
		bodyModel[31].setRotationPoint(-36.75F, -23.5F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 lamp front
		bodyModel[32].setRotationPoint(-36.75F, -23.5F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, -4F, 1, 14, 4, 0F,0F, 0F, 0F, -0.34F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[33].setRotationPoint(-45.75F, -15F, 6F);
		bodyModel[33].rotateAngleY = -0.29670597F;

		bodyModel[34].addShapeBox(0F, 0F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[34].setRotationPoint(-45.75F, -16F, 6F);
		bodyModel[34].rotateAngleY = -0.29670597F;

		bodyModel[35].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[35].setRotationPoint(-45.75F, -16F, 6F);
		bodyModel[35].rotateAngleY = -0.29670597F;

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 227
		bodyModel[36].setRotationPoint(-44.5F, -13F, -10.2F);
		bodyModel[36].rotateAngleY = 0.27925268F;

		bodyModel[37].addBox(0F, 0F, -4F, 1, 2, 4, 0F); // Box 228
		bodyModel[37].setRotationPoint(-44.5F, -13F, 10.2F);
		bodyModel[37].rotateAngleY = -0.27925268F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 229
		bodyModel[38].setRotationPoint(-42.5F, -16.5F, -8F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 230
		bodyModel[39].setRotationPoint(-42.5F, -16.5F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 232
		bodyModel[40].setRotationPoint(-30F, -25F, 1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[41].setRotationPoint(-30F, -25F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[42].setRotationPoint(-30F, -25F, -6F);

		bodyModel[43].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[43].setRotationPoint(-22.5F, -21F, 10.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 238 light cover
		bodyModel[44].setRotationPoint(-47F, -16F, -1F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 239 glow liveryimg 1
		bodyModel[45].setRotationPoint(-44.51F, -13F, -10.2F);
		bodyModel[45].rotateAngleY = 0.27925268F;

		bodyModel[46].addBox(0F, 0F, -4F, 0, 2, 4, 0F); // Box 240 glow liveryimg 1
		bodyModel[46].setRotationPoint(-44.51F, -13F, 10.2F);
		bodyModel[46].rotateAngleY = -0.27925268F;

		bodyModel[47].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 241 glow liveryimg 2
		bodyModel[47].setRotationPoint(-34.21F, -23F, -8.2F);
		bodyModel[47].rotateAngleY = 0.26179939F;

		bodyModel[48].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 242 glow liveryimg 2
		bodyModel[48].setRotationPoint(-34.21F, -23F, 7.8F);
		bodyModel[48].rotateAngleY = -0.26179939F;

		bodyModel[49].addBox(0F, 0F, 0F, 9, 13, 10, 0F); // Box 210
		bodyModel[49].setRotationPoint(-44F, -14F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 13, 10, 0F); // Box 211
		bodyModel[50].setRotationPoint(-44F, -14F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[51].setRotationPoint(-28F, -25F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[52].setRotationPoint(-47F, -16F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 11, 20, 0F); // Box 131
		bodyModel[53].setRotationPoint(-35F, -17F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[54].setRotationPoint(-34F, -17F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 lamp front
		bodyModel[55].setRotationPoint(-46.75F, -16F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 lamp front
		bodyModel[56].setRotationPoint(-46.75F, -14F, -1F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 236
		bodyModel[57].setRotationPoint(-34F, -15F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 10, 3, 0F); // Box 86
		bodyModel[58].setRotationPoint(-35.1F, -16F, -3F);
		bodyModel[58].rotateAngleY = -0.38397244F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 216
		bodyModel[59].setRotationPoint(-37F, -17F, 1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[60].setRotationPoint(-37F, -17F, -8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 61; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}