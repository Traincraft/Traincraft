//fox moment
package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelOWO60Verticube extends ModelConverter
{
	int textureX = 256;
	int textureY = 256;

	public ModelOWO60Verticube()
	{
		bodyModel = new ModelRendererTurbo[72];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 192, 56, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 40
		bodyModel[3] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 4, 134, textureX, textureY); // Box 43
		bodyModel[5] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 44
		bodyModel[6] = new ModelRendererTurbo(this, 25, 134, textureX, textureY); // Box 45
		bodyModel[7] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 72
		bodyModel[8] = new ModelRendererTurbo(this, 69, 42, textureX, textureY); // Box 78
		bodyModel[9] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 87
		bodyModel[10] = new ModelRendererTurbo(this, 174, 31, textureX, textureY); // Box 106
		bodyModel[11] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 108
		bodyModel[12] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 192, 60, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 174, 28, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 105, 75, textureX, textureY); // Box 106
		bodyModel[19] = new ModelRendererTurbo(this, 176, 1, textureX, textureY); // Box 106
		bodyModel[20] = new ModelRendererTurbo(this, 2, 116, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 2, 109, textureX, textureY); // Box 40
		bodyModel[22] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 176, 57, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[25] = new ModelRendererTurbo(this, 12, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[26] = new ModelRendererTurbo(this, 176, 42, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[27] = new ModelRendererTurbo(this, 191, 102, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[28] = new ModelRendererTurbo(this, 202, 102, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[29] = new ModelRendererTurbo(this, 12, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[30] = new ModelRendererTurbo(this, 1, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[31] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 3
		bodyModel[33] = new ModelRendererTurbo(this, 25, 36, textureX, textureY); // Box 3
		bodyModel[34] = new ModelRendererTurbo(this, 198, 8, textureX, textureY); // Box 87
		bodyModel[35] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 2, 131, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 3, 34, textureX, textureY); // Box 87
		bodyModel[38] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 3
		bodyModel[39] = new ModelRendererTurbo(this, 108, 42, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 213, 78, textureX, textureY); // Box 8
		bodyModel[41] = new ModelRendererTurbo(this, 187, 47, textureX, textureY); // Box 9
		bodyModel[42] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 39
		bodyModel[44] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 189, 117, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 165, 109, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 239, 70, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 234, 70, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 234, 73, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 239, 73, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[67] = new ModelRendererTurbo(this, 107, 1, textureX, textureY); // Box 105
		bodyModel[68] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 82

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27.5F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 81, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-40F, 2F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[2].setRotationPoint(-35.5F, 3F, 11F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[3].setRotationPoint(-27.5F, 2.8F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[4].setRotationPoint(-27.5F, 2.8F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[5].setRotationPoint(24.5F, 2.8F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[6].setRotationPoint(24.5F, 2.8F, 2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[7].setRotationPoint(-41.01F, -7.5F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[8].setRotationPoint(-8.5F, -26F, -11.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[9].setRotationPoint(-41F, -6.5F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[10].setRotationPoint(-26.5F, -27F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[11].setRotationPoint(-8.5F, -26F, 10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[12].setRotationPoint(44.5F, 3F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 89, 2, 5, 0F); // Box 0
		bodyModel[13].setRotationPoint(-44.5F, 3F, -2.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[14].setRotationPoint(-47.5F, 3F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[15].setRotationPoint(24.5F, 5F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[16].setRotationPoint(-35.5F, 3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[17].setRotationPoint(-26.5F, 3F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[18].setRotationPoint(-8.5F, -27F, -11.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[19].setRotationPoint(-8.5F, 3F, -11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(-40F, 3F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[21].setRotationPoint(-40F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(37F, 3F, 11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(37F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[24].setRotationPoint(41F, -7F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[25].setRotationPoint(37F, -7F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[26].setRotationPoint(41F, -7F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[27].setRotationPoint(-41F, -7F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[28].setRotationPoint(-41F, -7F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[29].setRotationPoint(-40F, -7F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[30].setRotationPoint(37F, -7F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[31].setRotationPoint(-40F, -7F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[32].setRotationPoint(-8F, -27F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[33].setRotationPoint(-8F, -27F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 87
		bodyModel[34].setRotationPoint(-42F, -2F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-26F, 4F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-26F, 4F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 87
		bodyModel[37].setRotationPoint(-40.5F, -7.5F, 2F);

		bodyModel[38].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 3
		bodyModel[38].setRotationPoint(-40F, -27F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 5
		bodyModel[39].setRotationPoint(9F, -27F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 8
		bodyModel[40].setRotationPoint(-39F, -27F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 9
		bodyModel[41].setRotationPoint(39F, -27F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[42].setRotationPoint(-39F, -28F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[43].setRotationPoint(-39F, -28F, 0F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 46
		bodyModel[44].setRotationPoint(40F, -1F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 47
		bodyModel[45].setRotationPoint(40F, -4F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 48
		bodyModel[46].setRotationPoint(40F, -7F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 49
		bodyModel[47].setRotationPoint(40F, -10F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 50
		bodyModel[48].setRotationPoint(40F, -13F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 51
		bodyModel[49].setRotationPoint(40F, -16F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 52
		bodyModel[50].setRotationPoint(40F, -22F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 53
		bodyModel[51].setRotationPoint(40F, -19F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 54
		bodyModel[52].setRotationPoint(40F, -25F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 57
		bodyModel[53].setRotationPoint(-40F, -25F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 58
		bodyModel[54].setRotationPoint(-40F, -22F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 59
		bodyModel[55].setRotationPoint(-40F, -19F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 60
		bodyModel[56].setRotationPoint(-40F, -16F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 61
		bodyModel[57].setRotationPoint(-40F, -13F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 62
		bodyModel[58].setRotationPoint(-40F, -10F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 63
		bodyModel[59].setRotationPoint(-40F, -7F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 64
		bodyModel[60].setRotationPoint(-40F, -4F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 65
		bodyModel[61].setRotationPoint(-40F, -1F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[62].setRotationPoint(-40F, -28F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[63].setRotationPoint(-40F, -28F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[64].setRotationPoint(40F, -28F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[65].setRotationPoint(40F, -28F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 104
		bodyModel[66].setRotationPoint(9F, -27F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 105
		bodyModel[67].setRotationPoint(-40F, -27F, 10F);

		bodyModel[68].addBox(0F, -0.5F, 0F, 9, 1, 0, 0F); // Box 79
		bodyModel[68].setRotationPoint(-44.5F, 4F, -2.5F);
		bodyModel[68].rotateAngleY = -0.62831853F;
		bodyModel[68].rotateAngleZ = 0.13962634F;

		bodyModel[69].addBox(0F, -0.5F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[69].setRotationPoint(-44.5F, 4F, 2.5F);
		bodyModel[69].rotateAngleY = 0.62831853F;
		bodyModel[69].rotateAngleZ = 0.13962634F;

		bodyModel[70].addBox(-9F, -0.5F, 0F, 9, 1, 0, 0F); // Box 81
		bodyModel[70].setRotationPoint(44.5F, 4F, -2.5F);
		bodyModel[70].rotateAngleY = 0.62831853F;
		bodyModel[70].rotateAngleZ = -0.13962634F;

		bodyModel[71].addBox(-9F, -0.5F, 0F, 9, 1, 0, 0F); // Box 82
		bodyModel[71].setRotationPoint(44.5F, 4F, 2.5F);
		bodyModel[71].rotateAngleY = -0.62831853F;
		bodyModel[71].rotateAngleZ = -0.13962634F;
	}
	Model70TonTruck2 bogie2 = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 72; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.65,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.25,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public ModelRendererTurbo ModelOWO60Verticube[];
}