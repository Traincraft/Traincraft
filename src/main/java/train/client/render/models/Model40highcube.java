//you ever have a dream where you um you like um you want to up...

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Model40highcube extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model40highcube() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[82];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 42
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 45
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 86
		bodyModel[15] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 87
		bodyModel[16] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 104
		bodyModel[17] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 105
		bodyModel[18] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 106
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 108
		bodyModel[20] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 135
		bodyModel[27] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 106
		bodyModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		bodyModel[43] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 40
		bodyModel[44] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 40
		bodyModel[46] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 40
		bodyModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 40
		bodyModel[48] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 40
		bodyModel[49] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 40
		bodyModel[50] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 40
		bodyModel[51] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 40
		bodyModel[52] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 40
		bodyModel[53] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 40
		bodyModel[54] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 40
		bodyModel[55] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 40
		bodyModel[56] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 40
		bodyModel[57] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 40
		bodyModel[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 40
		bodyModel[59] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		bodyModel[60] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 40
		bodyModel[61] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 40
		bodyModel[62] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 40
		bodyModel[63] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 40
		bodyModel[64] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 40
		bodyModel[65] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 40
		bodyModel[66] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 40
		bodyModel[67] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 40
		bodyModel[68] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 40
		bodyModel[69] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 40
		bodyModel[70] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 40
		bodyModel[71] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 40
		bodyModel[72] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 40
		bodyModel[73] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 40
		bodyModel[74] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 40
		bodyModel[75] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 40
		bodyModel[76] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 40
		bodyModel[77] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 40
		bodyModel[78] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 40
		bodyModel[79] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 40
		bodyModel[80] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 40
		bodyModel[81] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 40

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-17F, 4F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 55, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-27F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(-27F, -24F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(8F, -24F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 8
		bodyModel[4].setRotationPoint(-27F, -24F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 9
		bodyModel[5].setRotationPoint(27F, -24F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 55, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[6].setRotationPoint(-27F, -25F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 43, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[7].setRotationPoint(-21F, 2F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[8].setRotationPoint(-17F, 1.8F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[9].setRotationPoint(-17F, 1.8F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[10].setRotationPoint(16F, 1.8F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[11].setRotationPoint(16F, 1.8F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[12].setRotationPoint(-28.51F, -6F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[13].setRotationPoint(-7F, -24F, -11.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[14].setRotationPoint(-28F, -6F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[15].setRotationPoint(-28.5F, -5F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 104
		bodyModel[16].setRotationPoint(8F, -24F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 20, 25, 1, 0F); // Box 105
		bodyModel[17].setRotationPoint(-27F, -24F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[18].setRotationPoint(-20F, -25F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[19].setRotationPoint(-7F, -24F, 10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 25, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 135
		bodyModel[20].setRotationPoint(-11.5F, 3F, 11F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[21].setRotationPoint(31F, 2F, -1.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 61, 2, 5, 0F); // Box 0
		bodyModel[22].setRotationPoint(-30F, 2F, -2.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[23].setRotationPoint(-33F, 2F, -1.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[24].setRotationPoint(16F, 4F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 43, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(-21F, 2F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 135
		bodyModel[26].setRotationPoint(-11.5F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[27].setRotationPoint(-20F, 1F, 10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[28].setRotationPoint(-7F, -25F, -11.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[29].setRotationPoint(-7F, 1F, -11.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-27F, 2F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[31].setRotationPoint(-27F, 2F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(24F, 2F, 11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(24F, 2F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(-28F, -8F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-28F, -8F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-28F, 1F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(-28F, -2F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-28F, -5F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-28F, -8F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-28F, -8F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[41].setRotationPoint(-28F, -8F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[42].setRotationPoint(-28F, 1F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[43].setRotationPoint(-28F, -2F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(-28F, -5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[45].setRotationPoint(-28F, -8F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[46].setRotationPoint(28F, -8F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[47].setRotationPoint(28F, -8F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[48].setRotationPoint(29F, 1F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[49].setRotationPoint(29F, -2F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[50].setRotationPoint(29F, -5F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[51].setRotationPoint(29F, -8F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[52].setRotationPoint(28F, -8F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[53].setRotationPoint(28F, -8F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[54].setRotationPoint(29F, 1F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[55].setRotationPoint(29F, -2F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[56].setRotationPoint(29F, -5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[57].setRotationPoint(29F, -8F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[58].setRotationPoint(-27F, 1F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[59].setRotationPoint(-27F, -2F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[60].setRotationPoint(-27F, -5F, -12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[61].setRotationPoint(-27F, -8F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[62].setRotationPoint(-27F, -8F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[63].setRotationPoint(-23F, -8F, -12F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[64].setRotationPoint(24F, 1F, -12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[65].setRotationPoint(24F, -2F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[66].setRotationPoint(24F, -5F, -12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[67].setRotationPoint(24F, -8F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[68].setRotationPoint(24F, -8F, -12F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[69].setRotationPoint(28F, -8F, -12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[70].setRotationPoint(-27F, 1F, 12F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[71].setRotationPoint(-27F, -2F, 12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[72].setRotationPoint(-27F, -5F, 12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[73].setRotationPoint(-27F, -8F, 12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[74].setRotationPoint(-27F, -8F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[75].setRotationPoint(-23F, -8F, 11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[76].setRotationPoint(24F, 1F, 12F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[77].setRotationPoint(24F, -2F, 12F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[78].setRotationPoint(24F, -5F, 12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[79].setRotationPoint(24F, -8F, 12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[80].setRotationPoint(24F, -8F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[81].setRotationPoint(28F, -8F, 11F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 82; i++)
		{
			bodyModel[i].render(f5);
		}
		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.125,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.055,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.0,-0.05,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.05,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model40highcube[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}