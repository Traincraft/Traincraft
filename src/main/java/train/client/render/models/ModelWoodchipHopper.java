package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelWoodchipHopper extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWoodchipHopper() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[81];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 1
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 1
		bodyModel[25] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 1
		bodyModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 1
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 1
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 1
		bodyModel[33] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 1
		bodyModel[34] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 1
		bodyModel[35] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 1
		bodyModel[36] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // load 3
		bodyModel[37] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // load 2
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // load 1
		bodyModel[39] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // load 4
		bodyModel[40] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // load 5
		bodyModel[41] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // load 6
		bodyModel[42] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // load 9
		bodyModel[43] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // load 8
		bodyModel[44] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // load 7
		bodyModel[45] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 1
		bodyModel[51] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 1
		bodyModel[53] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 1
		bodyModel[57] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 1
		bodyModel[58] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 1
		bodyModel[59] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 1
		bodyModel[60] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 1
		bodyModel[62] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 1
		bodyModel[63] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 1
		bodyModel[64] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 1
		bodyModel[65] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 1
		bodyModel[67] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 1
		bodyModel[69] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 1
		bodyModel[72] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1
		bodyModel[73] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 1
		bodyModel[74] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 1
		bodyModel[75] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 1
		bodyModel[77] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 1
		bodyModel[78] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-45F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(42F, 2F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 82, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-41F, -20F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 82, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[4].setRotationPoint(-41F, -20F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 21, 11, 0F); // Box 0
		bodyModel[5].setRotationPoint(-42F, -20F, 0F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 21, 11, 0F); // Box 0
		bodyModel[6].setRotationPoint(-42F, -20F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 21, 11, 0F); // Box 0
		bodyModel[7].setRotationPoint(41F, -20F, 0F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 21, 11, 0F); // Box 0
		bodyModel[8].setRotationPoint(41F, -20F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[9].setRotationPoint(-32F, 4F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[10].setRotationPoint(28F, 4F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 84, 2, 4, 0F); // Box 13
		bodyModel[11].setRotationPoint(-42F, 2F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box 1
		bodyModel[12].setRotationPoint(28F, 2F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box 1
		bodyModel[13].setRotationPoint(28F, 2F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box 1
		bodyModel[14].setRotationPoint(-32F, 2F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box 1
		bodyModel[15].setRotationPoint(-32F, 2F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 0
		bodyModel[16].setRotationPoint(-42F, 2F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 0
		bodyModel[17].setRotationPoint(-42F, 2F, 2F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 0
		bodyModel[18].setRotationPoint(41F, 2F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 0
		bodyModel[19].setRotationPoint(41F, 2F, 2F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 1
		bodyModel[20].setRotationPoint(-36F, -5F, 11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bodyModel[21].setRotationPoint(-35F, -4F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 1
		bodyModel[22].setRotationPoint(-41F, -20F, 11F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 1
		bodyModel[23].setRotationPoint(-43F, -20F, 7F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 1
		bodyModel[24].setRotationPoint(37F, -20F, -12F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 22, 4, 0F); // Box 1
		bodyModel[25].setRotationPoint(42F, -20F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 1
		bodyModel[26].setRotationPoint(-41F, 2F, 11F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 1
		bodyModel[27].setRotationPoint(-41F, 2F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 1
		bodyModel[28].setRotationPoint(37F, 2F, 11F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 1
		bodyModel[29].setRotationPoint(37F, 2F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 1
		bodyModel[30].setRotationPoint(37F, -7F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 1
		bodyModel[31].setRotationPoint(-41F, -7F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 1
		bodyModel[32].setRotationPoint(-25F, -18F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 1
		bodyModel[33].setRotationPoint(-10F, -18F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 1
		bodyModel[34].setRotationPoint(7F, -18F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 1
		bodyModel[35].setRotationPoint(24F, -18F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 66, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // load 3
		bodyModel[36].setRotationPoint(-33F, -20F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 66, 0, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 2
		bodyModel[37].setRotationPoint(-33F, -20F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 66, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 1
		bodyModel[38].setRotationPoint(-33F, -25F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 4
		bodyModel[39].setRotationPoint(-41F, -20F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 5
		bodyModel[40].setRotationPoint(33F, -20F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 6
		bodyModel[41].setRotationPoint(33F, -25F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 9
		bodyModel[42].setRotationPoint(33F, -25F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 8
		bodyModel[43].setRotationPoint(-41F, -25F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 7
		bodyModel[44].setRotationPoint(-41F, -25F, 3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[45].setRotationPoint(29.5F, -20F, 10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[46].setRotationPoint(-30.5F, -20F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[47].setRotationPoint(-19F, -20F, 10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[48].setRotationPoint(18F, -20F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[49].setRotationPoint(13F, -20F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[50].setRotationPoint(8F, -20F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[51].setRotationPoint(3F, -20F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[52].setRotationPoint(-9F, -20F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[53].setRotationPoint(-14F, -20F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[54].setRotationPoint(-3F, -20F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[55].setRotationPoint(30.5F, -5F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[56].setRotationPoint(30.5F, -13F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[57].setRotationPoint(19F, -5F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[58].setRotationPoint(19F, -13F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[59].setRotationPoint(-29.5F, -5F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[60].setRotationPoint(-29.5F, -13F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[61].setRotationPoint(-41F, -7F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[62].setRotationPoint(-41F, -13F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[63].setRotationPoint(29.5F, -20F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[64].setRotationPoint(-30.5F, -20F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[65].setRotationPoint(-19F, -20F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[66].setRotationPoint(18F, -20F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[67].setRotationPoint(13F, -20F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[68].setRotationPoint(8F, -20F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[69].setRotationPoint(3F, -20F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[70].setRotationPoint(-9F, -20F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[71].setRotationPoint(-14F, -20F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[72].setRotationPoint(-3F, -20F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[73].setRotationPoint(30.5F, -5F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[74].setRotationPoint(30.5F, -13F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[75].setRotationPoint(19F, -5F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[76].setRotationPoint(19F, -13F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[77].setRotationPoint(-29.5F, -5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[78].setRotationPoint(-29.5F, -13F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[79].setRotationPoint(-41F, -5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[80].setRotationPoint(-41F, -13F, -11F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 81; i++) {
			if (i == 9999) { //36 37 38 39 40 41 42 43 44
				/*int cargo = ((Freight) entity).getAmmountOfCargo();
				if (cargo != 0) {
					GL11.glPushMatrix();
					GL11.glTranslatef(0, 0.57f + ((Freight) entity).getAmmountOfCargo() * -0.013f, 0);
					// 0.57f is the "starting height", the *-0.whatever is the multiplier
					bodyModel[36].render(f5);
					bodyModel[37].render(f5);
					bodyModel[38].render(f5);
					bodyModel[39].render(f5);
					bodyModel[40].render(f5);
					bodyModel[41].render(f5);
					bodyModel[42].render(f5);
					bodyModel[43].render(f5);
					bodyModel[44].render(f5);
					GL11.glPopMatrix();
				} else if (cargo == 0){
					GL11.glPushMatrix();
					GL11.glTranslatef(0, 0.57f + ((Freight) entity).getAmmountOfCargo() * -0.013f, 0);
					GL11.glPopMatrix(); //this is supposed to not render the load bits if it doesnt have anything in it
				}*/
			} else
				bodyModel[i].render(f5);
		}

		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-2.0,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.75,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.87,-0.05,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.73,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{ }
	public ModelRendererTurbo ModelWoodchipHopper[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}