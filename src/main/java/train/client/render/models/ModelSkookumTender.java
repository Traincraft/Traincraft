package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelSkookumTender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelSkookumTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 222
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 223
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 224
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 225
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 226
		bodyModel[6] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 227
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 228
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 98
		bodyModel[10] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 121, 9, textureX, textureY, "lamp"); // Box 40 lamp
		bodyModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 76
		bodyModel[39] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 77
		bodyModel[40] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 87
		bodyModel[42] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 82
		bodyModel[44] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 84
		bodyModel[46] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 85
		bodyModel[47] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 86
		bodyModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 87
		bodyModel[49] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		bodyModel[50] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 89
		bodyModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		bodyModel[52] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 91
		bodyModel[53] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 92
		bodyModel[54] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 93
		bodyModel[55] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 94
		bodyModel[56] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 96
		bodyModel[58] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 97
		bodyModel[59] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 98
		bodyModel[60] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 99
		bodyModel[61] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 100
		bodyModel[62] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 101
		bodyModel[63] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 102
		bodyModel[64] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 103
		bodyModel[65] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 104
		bodyModel[66] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 105
		bodyModel[67] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 106
		bodyModel[68] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 107
		bodyModel[69] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 108
		bodyModel[70] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 109
		bodyModel[71] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 110
		bodyModel[72] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 111
		bodyModel[73] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 112
		bodyModel[74] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 113
		bodyModel[75] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 114

		bodyModel[0].addBox(0F, 0F, 0F, 45, 2, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-23F, 0.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 33, 12, 20, 0F); // Box 222
		bodyModel[1].setRotationPoint(-17F, -11.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Box 223
		bodyModel[2].setRotationPoint(-15F, -13.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[3].setRotationPoint(-17F, -13.5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[4].setRotationPoint(11F, -13.5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[5].setRotationPoint(11F, -13.5F, 11F);

		bodyModel[6].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Box 227
		bodyModel[6].setRotationPoint(-15F, -13.5F, 11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[7].setRotationPoint(-17F, -13.5F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 23
		bodyModel[8].setRotationPoint(22F, 2.5F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 98
		bodyModel[9].setRotationPoint(20F, 2F, 0.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 25
		bodyModel[10].setRotationPoint(22F, 6.5F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 23
		bodyModel[11].setRotationPoint(22F, 2.5F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 24
		bodyModel[12].setRotationPoint(17F, -13F, 0.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 25
		bodyModel[13].setRotationPoint(16F, -11.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(16F, -11.5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(16F, -11.5F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(-19F, -11.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[17].setRotationPoint(-19F, -11.5F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 30
		bodyModel[18].setRotationPoint(-19F, -11.5F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 31
		bodyModel[19].setRotationPoint(-19F, -11.5F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 32
		bodyModel[20].setRotationPoint(-19F, -11.5F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[21].setRotationPoint(-19F, -11.5F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 34
		bodyModel[22].setRotationPoint(5F, -13.5F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 35
		bodyModel[23].setRotationPoint(-3F, -14F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 22, 1, 0, 0F); // Box 36
		bodyModel[24].setRotationPoint(-17F, -12.5F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 22, 1, 0, 0F); // Box 37
		bodyModel[25].setRotationPoint(-17F, -12.5F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[26].setRotationPoint(5F, -13.5F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(5F, -13.5F, -1F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 40 lamp
		bodyModel[28].setRotationPoint(19.5F, -12.5F, 1F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 41
		bodyModel[29].setRotationPoint(8F, -13F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 42
		bodyModel[30].setRotationPoint(-14F, -13.5F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(17F, -10F, 1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(17F, -10F, 3F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 45
		bodyModel[33].setRotationPoint(21.75F, -1F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 46
		bodyModel[34].setRotationPoint(17.5F, 2F, -8.01F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 47
		bodyModel[35].setRotationPoint(17.5F, 2F, 12.01F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 48
		bodyModel[36].setRotationPoint(22F, 4.5F, -7F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 11, 4, 0F); // Box 50
		bodyModel[37].setRotationPoint(16.5F, -11F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 76
		bodyModel[38].setRotationPoint(-14F, 2F, 0F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 77
		bodyModel[39].setRotationPoint(11F, 2F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[40].setRotationPoint(-3.5F, 3.5F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 87
		bodyModel[41].setRotationPoint(-3.5F, 4.5F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[42].setRotationPoint(-3.5F, 5.5F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[43].setRotationPoint(-3.5F, 3.5F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 83
		bodyModel[44].setRotationPoint(-3.5F, 4.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
		bodyModel[45].setRotationPoint(-3.5F, 5.5F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 85
		bodyModel[46].setRotationPoint(-3F, 2.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 86
		bodyModel[47].setRotationPoint(0F, 2.5F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 87
		bodyModel[48].setRotationPoint(0F, 2.5F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 88
		bodyModel[49].setRotationPoint(-3F, 2.5F, -4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 89
		bodyModel[50].setRotationPoint(0F, 2.5F, 11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 90
		bodyModel[51].setRotationPoint(-3F, 2.5F, 11F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 91
		bodyModel[52].setRotationPoint(0F, 2.5F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 92
		bodyModel[53].setRotationPoint(-3F, 2.5F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 93
		bodyModel[54].setRotationPoint(-26F, 2F, 0.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 94
		bodyModel[55].setRotationPoint(-23F, -1.5F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 95
		bodyModel[56].setRotationPoint(-19F, -6.5F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 96
		bodyModel[57].setRotationPoint(-18F, -12.5F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 97
		bodyModel[58].setRotationPoint(-18F, -12.5F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 98
		bodyModel[59].setRotationPoint(-17F, -12.5F, 1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		bodyModel[60].setRotationPoint(-18F, -11F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[61].setRotationPoint(-18F, -11F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[62].setRotationPoint(17F, -11F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[63].setRotationPoint(17F, -11F, 11F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 103
		bodyModel[64].setRotationPoint(-23.01F, 1F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[65].setRotationPoint(-23F, 3F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[66].setRotationPoint(-20F, 3F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 106
		bodyModel[67].setRotationPoint(-20.01F, 1F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 107
		bodyModel[68].setRotationPoint(-23.5F, 6F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 108
		bodyModel[69].setRotationPoint(-23F, 3F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 109
		bodyModel[70].setRotationPoint(-23F, 3F, 11F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 110
		bodyModel[71].setRotationPoint(-23.5F, 6F, 11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 111
		bodyModel[72].setRotationPoint(-23F, 3F, 11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		bodyModel[73].setRotationPoint(-20F, 3F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 113
		bodyModel[74].setRotationPoint(-20.01F, 1F, 11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 114
		bodyModel[75].setRotationPoint(-23.01F, 1F, 11F);
	}
	public float[] getTrans() {
		return new float[]{0.1F, 0.08F, 0.13F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	ModelSkookumTenderTrucc bogie = new ModelSkookumTenderTrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 76; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/skookumtendertrucc_Black.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1f,1,0.9f);
		GL11.glTranslated(-0.85f,-0.05,0.15);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.58,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelSkookumTender[];
}