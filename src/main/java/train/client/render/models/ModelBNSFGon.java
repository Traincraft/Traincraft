//FMT-Marker DFM-1.0
//Creator: Unregistered Account

//Using PER-GROUP-INIT mode with limit '500'!
package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelBNSFGon extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelBNSFGon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[779];

		initGroup_bodyModel0();
		initGroup_bodyModel1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private final void initGroup_bodyModel0(){
		bodyModel[0] = new ModelRendererTurbo(this, 360, 126, textureX, textureY);
		bodyModel[0].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[0].setRotationPoint(52.375f, 1.5f, -11.5f);

		bodyModel[1] = new ModelRendererTurbo(this, 349, 126, textureX, textureY);
		bodyModel[1].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[1].setRotationPoint(58.5f, 1.5f, -11.5f);

		bodyModel[2] = new ModelRendererTurbo(this, 344, 126, textureX, textureY);
		bodyModel[2].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[2].setRotationPoint(60.0f, 1.5f, -11.5f);

		bodyModel[3] = new ModelRendererTurbo(this, 339, 126, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[3].setRotationPoint(53.875f, 1.5f, -11.5f);

		bodyModel[4] = new ModelRendererTurbo(this, 334, 126, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[4].setRotationPoint(57.0f, 1.5f, -11.5f);

		bodyModel[5] = new ModelRendererTurbo(this, 329, 126, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[5].setRotationPoint(55.375f, 1.5f, -11.5f);

		bodyModel[6] = new ModelRendererTurbo(this, 324, 126, textureX, textureY);
		bodyModel[6].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[6].setRotationPoint(-57.25f, 1.5f, -11.5f);

		bodyModel[7] = new ModelRendererTurbo(this, 319, 126, textureX, textureY);
		bodyModel[7].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[7].setRotationPoint(-51.125f, 1.5f, -11.5f);

		bodyModel[8] = new ModelRendererTurbo(this, 314, 126, textureX, textureY);
		bodyModel[8].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[8].setRotationPoint(-49.625f, 1.5f, -11.5f);

		bodyModel[9] = new ModelRendererTurbo(this, 15, 126, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[9].setRotationPoint(-55.75f, 1.5f, -11.5f);

		bodyModel[10] = new ModelRendererTurbo(this, 503, 125, textureX, textureY);
		bodyModel[10].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[10].setRotationPoint(-52.625f, 1.5f, -11.5f);

		bodyModel[11] = new ModelRendererTurbo(this, 494, 125, textureX, textureY);
		bodyModel[11].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[11].setRotationPoint(-54.25f, 1.5f, -11.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 10, 125, textureX, textureY);
		bodyModel[12].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[12].setRotationPoint(-45.625f, 1.5f, -11.5f);

		bodyModel[13] = new ModelRendererTurbo(this, 489, 124, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[13].setRotationPoint(-44.625f, 1.5f, -11.5f);

		bodyModel[14] = new ModelRendererTurbo(this, 440, 124, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[14].setRotationPoint(-43.625f, 1.5f, -11.5f);

		bodyModel[15] = new ModelRendererTurbo(this, 435, 124, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[15].setRotationPoint(-42.625f, 1.5f, -11.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 430, 124, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[16].setRotationPoint(-38.625f, 1.5f, -11.5f);

		bodyModel[17] = new ModelRendererTurbo(this, 425, 124, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[17].setRotationPoint(-37.625f, 1.5f, -11.5f);

		bodyModel[18] = new ModelRendererTurbo(this, 420, 124, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[18].setRotationPoint(-36.625f, 1.5f, -11.5f);

		bodyModel[19] = new ModelRendererTurbo(this, 415, 124, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[19].setRotationPoint(-35.625f, 1.5f, -11.5f);

		bodyModel[20] = new ModelRendererTurbo(this, 410, 124, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[20].setRotationPoint(-31.625f, 1.5f, -11.5f);

		bodyModel[21] = new ModelRendererTurbo(this, 405, 124, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[21].setRotationPoint(-30.625f, 1.5f, -11.5f);

		bodyModel[22] = new ModelRendererTurbo(this, 5, 124, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[22].setRotationPoint(-29.625f, 1.5f, -11.5f);

		bodyModel[23] = new ModelRendererTurbo(this, 0, 124, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[23].setRotationPoint(-28.625f, 1.5f, -11.5f);

		bodyModel[24] = new ModelRendererTurbo(this, 499, 123, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[24].setRotationPoint(-24.625f, 1.5f, -11.5f);

		bodyModel[25] = new ModelRendererTurbo(this, 484, 123, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[25].setRotationPoint(-23.625f, 1.5f, -11.5f);

		bodyModel[26] = new ModelRendererTurbo(this, 479, 123, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[26].setRotationPoint(-22.625f, 1.5f, -11.5f);

		bodyModel[27] = new ModelRendererTurbo(this, 474, 123, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[27].setRotationPoint(-21.625f, 1.5f, -11.5f);

		bodyModel[28] = new ModelRendererTurbo(this, 466, 123, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[28].setRotationPoint(-17.625f, 1.5f, -11.5f);

		bodyModel[29] = new ModelRendererTurbo(this, 461, 123, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[29].setRotationPoint(-16.625f, 1.5f, -11.5f);

		bodyModel[30] = new ModelRendererTurbo(this, 456, 123, textureX, textureY);
		bodyModel[30].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[30].setRotationPoint(-15.625f, 1.5f, -11.5f);

		bodyModel[31] = new ModelRendererTurbo(this, 451, 123, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[31].setRotationPoint(-14.625f, 1.5f, -11.5f);

		bodyModel[32] = new ModelRendererTurbo(this, 15, 123, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[32].setRotationPoint(-10.625f, 1.5f, -11.5f);

		bodyModel[33] = new ModelRendererTurbo(this, 507, 122, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[33].setRotationPoint(-9.625f, 1.5f, -11.5f);

		bodyModel[34] = new ModelRendererTurbo(this, 494, 122, textureX, textureY);
		bodyModel[34].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[34].setRotationPoint(-8.625f, 1.5f, -11.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 10, 122, textureX, textureY);
		bodyModel[35].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[35].setRotationPoint(-7.625f, 1.5f, -11.5f);

		bodyModel[36] = new ModelRendererTurbo(this, 489, 121, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[36].setRotationPoint(-3.625f, 1.5f, -11.5f);

		bodyModel[37] = new ModelRendererTurbo(this, 5, 121, textureX, textureY);
		bodyModel[37].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[37].setRotationPoint(-2.625f, 1.5f, -11.5f);

		bodyModel[38] = new ModelRendererTurbo(this, 0, 121, textureX, textureY);
		bodyModel[38].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[38].setRotationPoint(-1.625f, 1.5f, -11.5f);

		bodyModel[39] = new ModelRendererTurbo(this, 503, 120, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[39].setRotationPoint(-0.625f, 1.5f, -11.5f);

		bodyModel[40] = new ModelRendererTurbo(this, 498, 120, textureX, textureY);
		bodyModel[40].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[40].setRotationPoint(3.375f, 1.5f, -11.5f);

		bodyModel[41] = new ModelRendererTurbo(this, 484, 120, textureX, textureY);
		bodyModel[41].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[41].setRotationPoint(4.375f, 1.5f, -11.5f);

		bodyModel[42] = new ModelRendererTurbo(this, 479, 120, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[42].setRotationPoint(5.375f, 1.5f, -11.5f);

		bodyModel[43] = new ModelRendererTurbo(this, 474, 120, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[43].setRotationPoint(6.375f, 1.5f, -11.5f);

		bodyModel[44] = new ModelRendererTurbo(this, 466, 120, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[44].setRotationPoint(10.375f, 1.5f, -11.5f);

		bodyModel[45] = new ModelRendererTurbo(this, 461, 120, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[45].setRotationPoint(11.375f, 1.5f, -11.5f);

		bodyModel[46] = new ModelRendererTurbo(this, 456, 120, textureX, textureY);
		bodyModel[46].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[46].setRotationPoint(12.375f, 1.5f, -11.5f);

		bodyModel[47] = new ModelRendererTurbo(this, 451, 120, textureX, textureY);
		bodyModel[47].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[47].setRotationPoint(13.375f, 1.5f, -11.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 329, 120, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[48].setRotationPoint(17.375f, 1.5f, -11.5f);

		bodyModel[49] = new ModelRendererTurbo(this, 324, 120, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[49].setRotationPoint(18.375f, 1.5f, -11.5f);

		bodyModel[50] = new ModelRendererTurbo(this, 319, 120, textureX, textureY);
		bodyModel[50].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[50].setRotationPoint(19.375f, 1.5f, -11.5f);

		bodyModel[51] = new ModelRendererTurbo(this, 314, 120, textureX, textureY);
		bodyModel[51].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[51].setRotationPoint(20.375f, 1.5f, -11.5f);

		bodyModel[52] = new ModelRendererTurbo(this, 15, 120, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[52].setRotationPoint(24.375f, 1.5f, -11.5f);

		bodyModel[53] = new ModelRendererTurbo(this, 493, 119, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[53].setRotationPoint(25.375f, 1.5f, -11.5f);

		bodyModel[54] = new ModelRendererTurbo(this, 420, 119, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[54].setRotationPoint(26.375f, 1.5f, -11.5f);

		bodyModel[55] = new ModelRendererTurbo(this, 415, 119, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[55].setRotationPoint(27.375f, 1.5f, -11.5f);

		bodyModel[56] = new ModelRendererTurbo(this, 410, 119, textureX, textureY);
		bodyModel[56].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[56].setRotationPoint(31.375f, 1.5f, -11.5f);

		bodyModel[57] = new ModelRendererTurbo(this, 405, 119, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[57].setRotationPoint(32.375f, 1.5f, -11.5f);

		bodyModel[58] = new ModelRendererTurbo(this, 400, 119, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[58].setRotationPoint(33.375f, 1.5f, -11.5f);

		bodyModel[59] = new ModelRendererTurbo(this, 395, 119, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[59].setRotationPoint(34.375f, 1.5f, -11.5f);

		bodyModel[60] = new ModelRendererTurbo(this, 390, 119, textureX, textureY);
		bodyModel[60].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[60].setRotationPoint(38.375f, 1.5f, -11.5f);

		bodyModel[61] = new ModelRendererTurbo(this, 385, 119, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[61].setRotationPoint(39.375f, 1.5f, -11.5f);

		bodyModel[62] = new ModelRendererTurbo(this, 377, 119, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[62].setRotationPoint(40.375f, 1.5f, -11.5f);

		bodyModel[63] = new ModelRendererTurbo(this, 372, 119, textureX, textureY);
		bodyModel[63].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[63].setRotationPoint(41.375f, 1.5f, -11.5f);

		bodyModel[64] = new ModelRendererTurbo(this, 367, 119, textureX, textureY);
		bodyModel[64].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[64].setRotationPoint(45.375f, 1.5f, -11.5f);

		bodyModel[65] = new ModelRendererTurbo(this, 362, 119, textureX, textureY);
		bodyModel[65].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[65].setRotationPoint(46.375f, 1.5f, -11.5f);

		bodyModel[66] = new ModelRendererTurbo(this, 10, 119, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[66].setRotationPoint(47.375f, 1.5f, -11.5f);

		bodyModel[67] = new ModelRendererTurbo(this, 443, 118, textureX, textureY);
		bodyModel[67].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[67].setRotationPoint(48.375f, 1.5f, -11.5f);

		bodyModel[68] = new ModelRendererTurbo(this, 438, 118, textureX, textureY);
		bodyModel[68].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[68].setRotationPoint(64.0f, 1.5f, -11.5f);

		bodyModel[69] = new ModelRendererTurbo(this, 433, 118, textureX, textureY);
		bodyModel[69].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[69].setRotationPoint(65.0f, 1.5f, -11.5f);

		bodyModel[70] = new ModelRendererTurbo(this, 428, 118, textureX, textureY);
		bodyModel[70].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[70].setRotationPoint(66.0f, 1.5f, -11.5f);

		bodyModel[71] = new ModelRendererTurbo(this, 5, 118, textureX, textureY);
		bodyModel[71].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[71].setRotationPoint(67.0f, 1.5f, -11.5f);

		bodyModel[72] = new ModelRendererTurbo(this, 0, 118, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[72].setRotationPoint(68.0f, 1.5f, -11.5f);

		bodyModel[73] = new ModelRendererTurbo(this, 506, 117, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[73].setRotationPoint(69.0f, 1.5f, -11.5f);

		bodyModel[74] = new ModelRendererTurbo(this, 501, 117, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[74].setRotationPoint(70.0f, 1.5f, -11.5f);

		bodyModel[75] = new ModelRendererTurbo(this, 489, 117, textureX, textureY);
		bodyModel[75].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[75].setRotationPoint(71.0f, 1.5f, -11.5f);

		bodyModel[76] = new ModelRendererTurbo(this, 484, 117, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[76].setRotationPoint(72.0f, 1.5f, -11.5f);

		bodyModel[77] = new ModelRendererTurbo(this, 479, 117, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[77].setRotationPoint(73.0f, 1.5f, -11.5f);

		bodyModel[78] = new ModelRendererTurbo(this, 474, 117, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[78].setRotationPoint(-69.25f, 1.5f, -11.5f);

		bodyModel[79] = new ModelRendererTurbo(this, 466, 117, textureX, textureY);
		bodyModel[79].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[79].setRotationPoint(-68.25f, 1.5f, -11.5f);

		bodyModel[80] = new ModelRendererTurbo(this, 461, 117, textureX, textureY);
		bodyModel[80].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[80].setRotationPoint(-67.25f, 1.5f, -11.5f);

		bodyModel[81] = new ModelRendererTurbo(this, 456, 117, textureX, textureY);
		bodyModel[81].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[81].setRotationPoint(-66.25f, 1.5f, -11.5f);

		bodyModel[82] = new ModelRendererTurbo(this, 451, 117, textureX, textureY);
		bodyModel[82].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[82].setRotationPoint(-65.25f, 1.5f, -11.5f);

		bodyModel[83] = new ModelRendererTurbo(this, 352, 117, textureX, textureY);
		bodyModel[83].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[83].setRotationPoint(-64.25f, 1.5f, -11.5f);

		bodyModel[84] = new ModelRendererTurbo(this, 347, 117, textureX, textureY);
		bodyModel[84].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[84].setRotationPoint(-63.25f, 1.5f, -11.5f);

		bodyModel[85] = new ModelRendererTurbo(this, 342, 117, textureX, textureY);
		bodyModel[85].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[85].setRotationPoint(-62.25f, 1.5f, -11.5f);

		bodyModel[86] = new ModelRendererTurbo(this, 337, 117, textureX, textureY);
		bodyModel[86].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[86].setRotationPoint(-61.25f, 1.5f, -11.5f);

		bodyModel[87] = new ModelRendererTurbo(this, 329, 117, textureX, textureY);
		bodyModel[87].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[87].setRotationPoint(51.25f, 4.125f, -11.5f);

		bodyModel[88] = new ModelRendererTurbo(this, 324, 117, textureX, textureY);
		bodyModel[88].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[88].setRotationPoint(51.25f, 3.625f, -11.5f);

		bodyModel[89] = new ModelRendererTurbo(this, 319, 117, textureX, textureY);
		bodyModel[89].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[89].setRotationPoint(51.25f, 2.5625f, -11.5f);

		bodyModel[90] = new ModelRendererTurbo(this, 314, 117, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[90].setRotationPoint(49.5f, 4.125f, -11.5f);

		bodyModel[91] = new ModelRendererTurbo(this, 15, 117, textureX, textureY);
		bodyModel[91].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[91].setRotationPoint(49.5f, 3.625f, -11.5f);

		bodyModel[92] = new ModelRendererTurbo(this, 496, 116, textureX, textureY);
		bodyModel[92].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[92].setRotationPoint(49.5f, 2.5625f, -11.5f);

		bodyModel[93] = new ModelRendererTurbo(this, 420, 116, textureX, textureY);
		bodyModel[93].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[93].setRotationPoint(62.875f, 4.125f, -11.5f);

		bodyModel[94] = new ModelRendererTurbo(this, 415, 116, textureX, textureY);
		bodyModel[94].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[94].setRotationPoint(62.875f, 3.625f, -11.5f);

		bodyModel[95] = new ModelRendererTurbo(this, 410, 116, textureX, textureY);
		bodyModel[95].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[95].setRotationPoint(62.875f, 2.5625f, -11.5f);

		bodyModel[96] = new ModelRendererTurbo(this, 405, 116, textureX, textureY);
		bodyModel[96].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[96].setRotationPoint(61.125f, 4.125f, -11.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 400, 116, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[97].setRotationPoint(61.125f, 3.625f, -11.5f);

		bodyModel[98] = new ModelRendererTurbo(this, 395, 116, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[98].setRotationPoint(61.125f, 2.5625f, -11.5f);

		bodyModel[99] = new ModelRendererTurbo(this, 390, 116, textureX, textureY);
		bodyModel[99].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[99].setRotationPoint(44.25f, 4.125f, -11.5f);

		bodyModel[100] = new ModelRendererTurbo(this, 385, 116, textureX, textureY);
		bodyModel[100].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[100].setRotationPoint(44.25f, 3.625f, -11.5f);

		bodyModel[101] = new ModelRendererTurbo(this, 377, 116, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[101].setRotationPoint(44.25f, 2.5625f, -11.5f);

		bodyModel[102] = new ModelRendererTurbo(this, 372, 116, textureX, textureY);
		bodyModel[102].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[102].setRotationPoint(42.5f, 4.125f, -11.5f);

		bodyModel[103] = new ModelRendererTurbo(this, 367, 116, textureX, textureY);
		bodyModel[103].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[103].setRotationPoint(42.5f, 3.625f, -11.5f);

		bodyModel[104] = new ModelRendererTurbo(this, 362, 116, textureX, textureY);
		bodyModel[104].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[104].setRotationPoint(42.5f, 2.5625f, -11.5f);

		bodyModel[105] = new ModelRendererTurbo(this, 10, 116, textureX, textureY);
		bodyModel[105].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[105].setRotationPoint(37.25f, 4.125f, -11.5f);

		bodyModel[106] = new ModelRendererTurbo(this, 443, 115, textureX, textureY);
		bodyModel[106].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[106].setRotationPoint(37.25f, 3.625f, -11.5f);

		bodyModel[107] = new ModelRendererTurbo(this, 438, 115, textureX, textureY);
		bodyModel[107].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[107].setRotationPoint(37.25f, 2.5625f, -11.5f);

		bodyModel[108] = new ModelRendererTurbo(this, 433, 115, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[108].setRotationPoint(35.5f, 4.125f, -11.5f);

		bodyModel[109] = new ModelRendererTurbo(this, 428, 115, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[109].setRotationPoint(35.5f, 3.625f, -11.5f);

		bodyModel[110] = new ModelRendererTurbo(this, 5, 115, textureX, textureY);
		bodyModel[110].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[110].setRotationPoint(35.5f, 2.5625f, -11.5f);

		bodyModel[111] = new ModelRendererTurbo(this, 0, 115, textureX, textureY);
		bodyModel[111].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[111].setRotationPoint(30.25f, 4.125f, -11.5f);

		bodyModel[112] = new ModelRendererTurbo(this, 505, 114, textureX, textureY);
		bodyModel[112].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[112].setRotationPoint(30.25f, 3.625f, -11.5f);

		bodyModel[113] = new ModelRendererTurbo(this, 500, 114, textureX, textureY);
		bodyModel[113].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[113].setRotationPoint(30.25f, 2.5625f, -11.5f);

		bodyModel[114] = new ModelRendererTurbo(this, 15, 114, textureX, textureY);
		bodyModel[114].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[114].setRotationPoint(28.5f, 4.125f, -11.5f);

		bodyModel[115] = new ModelRendererTurbo(this, 420, 113, textureX, textureY);
		bodyModel[115].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[115].setRotationPoint(28.5f, 3.625f, -11.5f);

		bodyModel[116] = new ModelRendererTurbo(this, 415, 113, textureX, textureY);
		bodyModel[116].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[116].setRotationPoint(28.5f, 2.5625f, -11.5f);

		bodyModel[117] = new ModelRendererTurbo(this, 410, 113, textureX, textureY);
		bodyModel[117].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[117].setRotationPoint(23.25f, 4.125f, -11.5f);

		bodyModel[118] = new ModelRendererTurbo(this, 405, 113, textureX, textureY);
		bodyModel[118].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[118].setRotationPoint(23.25f, 3.625f, -11.5f);

		bodyModel[119] = new ModelRendererTurbo(this, 400, 113, textureX, textureY);
		bodyModel[119].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[119].setRotationPoint(23.25f, 2.5625f, -11.5f);

		bodyModel[120] = new ModelRendererTurbo(this, 395, 113, textureX, textureY);
		bodyModel[120].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[120].setRotationPoint(21.5f, 4.125f, -11.5f);

		bodyModel[121] = new ModelRendererTurbo(this, 390, 113, textureX, textureY);
		bodyModel[121].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[121].setRotationPoint(21.5f, 3.625f, -11.5f);

		bodyModel[122] = new ModelRendererTurbo(this, 385, 113, textureX, textureY);
		bodyModel[122].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[122].setRotationPoint(21.5f, 2.5625f, -11.5f);

		bodyModel[123] = new ModelRendererTurbo(this, 10, 113, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[123].setRotationPoint(16.25f, 4.125f, -11.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 496, 112, textureX, textureY);
		bodyModel[124].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[124].setRotationPoint(16.25f, 3.625f, -11.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 491, 112, textureX, textureY);
		bodyModel[125].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[125].setRotationPoint(16.25f, 2.5625f, -11.5f);

		bodyModel[126] = new ModelRendererTurbo(this, 5, 112, textureX, textureY);
		bodyModel[126].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[126].setRotationPoint(14.5f, 4.125f, -11.5f);

		bodyModel[127] = new ModelRendererTurbo(this, 0, 112, textureX, textureY);
		bodyModel[127].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[127].setRotationPoint(14.5f, 3.625f, -11.5f);

		bodyModel[128] = new ModelRendererTurbo(this, 487, 110, textureX, textureY);
		bodyModel[128].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[128].setRotationPoint(14.5f, 2.5625f, -11.5f);

		bodyModel[129] = new ModelRendererTurbo(this, 482, 110, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[129].setRotationPoint(9.25f, 4.125f, -11.5f);

		bodyModel[130] = new ModelRendererTurbo(this, 477, 110, textureX, textureY);
		bodyModel[130].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[130].setRotationPoint(9.25f, 3.625f, -11.5f);

		bodyModel[131] = new ModelRendererTurbo(this, 469, 110, textureX, textureY);
		bodyModel[131].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[131].setRotationPoint(9.25f, 2.5625f, -11.5f);

		bodyModel[132] = new ModelRendererTurbo(this, 464, 110, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[132].setRotationPoint(7.5f, 4.125f, -11.5f);

		bodyModel[133] = new ModelRendererTurbo(this, 459, 110, textureX, textureY);
		bodyModel[133].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[133].setRotationPoint(7.5f, 3.625f, -11.5f);

		bodyModel[134] = new ModelRendererTurbo(this, 454, 110, textureX, textureY);
		bodyModel[134].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[134].setRotationPoint(7.5f, 2.5625f, -11.5f);

		bodyModel[135] = new ModelRendererTurbo(this, 420, 110, textureX, textureY);
		bodyModel[135].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[135].setRotationPoint(2.25f, 4.125f, -11.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 415, 110, textureX, textureY);
		bodyModel[136].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[136].setRotationPoint(2.25f, 3.625f, -11.5f);

		bodyModel[137] = new ModelRendererTurbo(this, 410, 110, textureX, textureY);
		bodyModel[137].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[137].setRotationPoint(2.25f, 2.5625f, -11.5f);

		bodyModel[138] = new ModelRendererTurbo(this, 405, 110, textureX, textureY);
		bodyModel[138].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[138].setRotationPoint(0.5f, 4.125f, -11.5f);

		bodyModel[139] = new ModelRendererTurbo(this, 400, 110, textureX, textureY);
		bodyModel[139].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[139].setRotationPoint(0.5f, 3.625f, -11.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 395, 110, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[140].setRotationPoint(0.5f, 2.5625f, -11.5f);

		bodyModel[141] = new ModelRendererTurbo(this, 390, 110, textureX, textureY);
		bodyModel[141].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[141].setRotationPoint(-4.75f, 4.125f, -11.5f);

		bodyModel[142] = new ModelRendererTurbo(this, 385, 110, textureX, textureY);
		bodyModel[142].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[142].setRotationPoint(-4.75f, 3.625f, -11.5f);

		bodyModel[143] = new ModelRendererTurbo(this, 443, 108, textureX, textureY);
		bodyModel[143].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[143].setRotationPoint(-4.75f, 2.5625f, -11.5f);

		bodyModel[144] = new ModelRendererTurbo(this, 438, 108, textureX, textureY);
		bodyModel[144].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[144].setRotationPoint(-6.5f, 4.125f, -11.5f);

		bodyModel[145] = new ModelRendererTurbo(this, 433, 108, textureX, textureY);
		bodyModel[145].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[145].setRotationPoint(-6.5f, 3.625f, -11.5f);

		bodyModel[146] = new ModelRendererTurbo(this, 428, 108, textureX, textureY);
		bodyModel[146].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[146].setRotationPoint(-6.5f, 2.5625f, -11.5f);

		bodyModel[147] = new ModelRendererTurbo(this, 487, 107, textureX, textureY);
		bodyModel[147].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[147].setRotationPoint(-11.75f, 4.125f, -11.5f);

		bodyModel[148] = new ModelRendererTurbo(this, 482, 107, textureX, textureY);
		bodyModel[148].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[148].setRotationPoint(-11.75f, 3.625f, -11.5f);

		bodyModel[149] = new ModelRendererTurbo(this, 477, 107, textureX, textureY);
		bodyModel[149].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[149].setRotationPoint(-11.75f, 2.5625f, -11.5f);

		bodyModel[150] = new ModelRendererTurbo(this, 469, 107, textureX, textureY);
		bodyModel[150].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[150].setRotationPoint(-13.5f, 4.125f, -11.5f);

		bodyModel[151] = new ModelRendererTurbo(this, 464, 107, textureX, textureY);
		bodyModel[151].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[151].setRotationPoint(-13.5f, 3.625f, -11.5f);

		bodyModel[152] = new ModelRendererTurbo(this, 459, 107, textureX, textureY);
		bodyModel[152].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[152].setRotationPoint(-13.5f, 2.5625f, -11.5f);

		bodyModel[153] = new ModelRendererTurbo(this, 454, 107, textureX, textureY);
		bodyModel[153].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[153].setRotationPoint(-18.75f, 4.125f, -11.5f);

		bodyModel[154] = new ModelRendererTurbo(this, 420, 107, textureX, textureY);
		bodyModel[154].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[154].setRotationPoint(-18.75f, 3.625f, -11.5f);

		bodyModel[155] = new ModelRendererTurbo(this, 415, 107, textureX, textureY);
		bodyModel[155].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[155].setRotationPoint(-18.75f, 2.5625f, -11.5f);

		bodyModel[156] = new ModelRendererTurbo(this, 410, 107, textureX, textureY);
		bodyModel[156].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[156].setRotationPoint(-20.5f, 4.125f, -11.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 405, 107, textureX, textureY);
		bodyModel[157].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[157].setRotationPoint(-20.5f, 3.625f, -11.5f);

		bodyModel[158] = new ModelRendererTurbo(this, 400, 107, textureX, textureY);
		bodyModel[158].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[158].setRotationPoint(-20.5f, 2.5625f, -11.5f);

		bodyModel[159] = new ModelRendererTurbo(this, 395, 107, textureX, textureY);
		bodyModel[159].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[159].setRotationPoint(-25.75f, 4.125f, -11.5f);

		bodyModel[160] = new ModelRendererTurbo(this, 390, 107, textureX, textureY);
		bodyModel[160].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[160].setRotationPoint(-25.75f, 3.625f, -11.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 385, 107, textureX, textureY);
		bodyModel[161].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[161].setRotationPoint(-25.75f, 2.5625f, -11.5f);

		bodyModel[162] = new ModelRendererTurbo(this, 443, 105, textureX, textureY);
		bodyModel[162].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[162].setRotationPoint(-27.5f, 4.125f, -11.5f);

		bodyModel[163] = new ModelRendererTurbo(this, 438, 105, textureX, textureY);
		bodyModel[163].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[163].setRotationPoint(-27.5f, 3.625f, -11.5f);

		bodyModel[164] = new ModelRendererTurbo(this, 433, 105, textureX, textureY);
		bodyModel[164].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[164].setRotationPoint(-27.5f, 2.5625f, -11.5f);

		bodyModel[165] = new ModelRendererTurbo(this, 428, 105, textureX, textureY);
		bodyModel[165].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[165].setRotationPoint(-32.75f, 4.125f, -11.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 420, 104, textureX, textureY);
		bodyModel[166].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[166].setRotationPoint(-32.75f, 3.625f, -11.5f);

		bodyModel[167] = new ModelRendererTurbo(this, 415, 104, textureX, textureY);
		bodyModel[167].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[167].setRotationPoint(-32.75f, 2.5625f, -11.5f);

		bodyModel[168] = new ModelRendererTurbo(this, 410, 104, textureX, textureY);
		bodyModel[168].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[168].setRotationPoint(-34.5f, 4.125f, -11.5f);

		bodyModel[169] = new ModelRendererTurbo(this, 405, 104, textureX, textureY);
		bodyModel[169].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[169].setRotationPoint(-34.5f, 3.625f, -11.5f);

		bodyModel[170] = new ModelRendererTurbo(this, 400, 104, textureX, textureY);
		bodyModel[170].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[170].setRotationPoint(-34.5f, 2.5625f, -11.5f);

		bodyModel[171] = new ModelRendererTurbo(this, 395, 104, textureX, textureY);
		bodyModel[171].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[171].setRotationPoint(-39.75f, 4.125f, -11.5f);

		bodyModel[172] = new ModelRendererTurbo(this, 390, 104, textureX, textureY);
		bodyModel[172].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[172].setRotationPoint(-39.75f, 3.625f, -11.5f);

		bodyModel[173] = new ModelRendererTurbo(this, 385, 104, textureX, textureY);
		bodyModel[173].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[173].setRotationPoint(-39.75f, 2.5625f, -11.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 443, 102, textureX, textureY);
		bodyModel[174].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[174].setRotationPoint(-41.5f, 4.125f, -11.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 438, 102, textureX, textureY);
		bodyModel[175].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[175].setRotationPoint(-41.5f, 3.625f, -11.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 433, 102, textureX, textureY);
		bodyModel[176].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[176].setRotationPoint(-41.5f, 2.5625f, -11.5f);

		bodyModel[177] = new ModelRendererTurbo(this, 428, 102, textureX, textureY);
		bodyModel[177].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[177].setRotationPoint(-46.75f, 4.125f, -11.5f);

		bodyModel[178] = new ModelRendererTurbo(this, 451, 88, textureX, textureY);
		bodyModel[178].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[178].setRotationPoint(-46.75f, 3.625f, -11.5f);

		bodyModel[179] = new ModelRendererTurbo(this, 489, 87, textureX, textureY);
		bodyModel[179].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[179].setRotationPoint(-46.75f, 2.5625f, -11.5f);

		bodyModel[180] = new ModelRendererTurbo(this, 484, 87, textureX, textureY);
		bodyModel[180].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[180].setRotationPoint(-48.5f, 4.125f, -11.5f);

		bodyModel[181] = new ModelRendererTurbo(this, 353, 87, textureX, textureY);
		bodyModel[181].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[181].setRotationPoint(-48.5f, 3.625f, -11.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 348, 87, textureX, textureY);
		bodyModel[182].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[182].setRotationPoint(-48.5f, 2.5625f, -11.5f);

		bodyModel[183] = new ModelRendererTurbo(this, 343, 87, textureX, textureY);
		bodyModel[183].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[183].setRotationPoint(-58.375f, 4.125f, -11.5f);

		bodyModel[184] = new ModelRendererTurbo(this, 338, 87, textureX, textureY);
		bodyModel[184].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[184].setRotationPoint(-58.375f, 3.625f, -11.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 329, 87, textureX, textureY);
		bodyModel[185].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[185].setRotationPoint(-58.375f, 2.5625f, -11.5f);

		bodyModel[186] = new ModelRendererTurbo(this, 324, 87, textureX, textureY);
		bodyModel[186].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[186].setRotationPoint(-60.125f, 4.125f, -11.5f);

		bodyModel[187] = new ModelRendererTurbo(this, 319, 87, textureX, textureY);
		bodyModel[187].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[187].setRotationPoint(-60.125f, 3.625f, -11.5f);

		bodyModel[188] = new ModelRendererTurbo(this, 314, 87, textureX, textureY);
		bodyModel[188].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[188].setRotationPoint(-60.125f, 2.5625f, -11.5f);

		bodyModel[189] = new ModelRendererTurbo(this, 479, 87, textureX, textureY);
		bodyModel[189].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[189].setRotationPoint(-60.25f, 2.5f, -11.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 474, 87, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[190].setRotationPoint(-58.5f, 2.5f, -11.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 465, 87, textureX, textureY);
		bodyModel[191].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[191].setRotationPoint(-48.625f, 2.5f, -11.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 460, 87, textureX, textureY);
		bodyModel[192].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[192].setRotationPoint(-46.875f, 2.5f, -11.0f);

		bodyModel[193] = new ModelRendererTurbo(this, 489, 83, textureX, textureY);
		bodyModel[193].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[193].setRotationPoint(-41.625f, 2.5f, -11.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 484, 83, textureX, textureY);
		bodyModel[194].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[194].setRotationPoint(-39.875f, 2.5f, -11.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 479, 83, textureX, textureY);
		bodyModel[195].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[195].setRotationPoint(-34.625f, 2.5f, -11.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 474, 83, textureX, textureY);
		bodyModel[196].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[196].setRotationPoint(-32.875f, 2.5f, -11.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 466, 83, textureX, textureY);
		bodyModel[197].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[197].setRotationPoint(-27.625f, 2.5f, -11.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 461, 83, textureX, textureY);
		bodyModel[198].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[198].setRotationPoint(-25.875f, 2.5f, -11.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 446, 83, textureX, textureY);
		bodyModel[199].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[199].setRotationPoint(-20.625f, 2.5f, -11.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 441, 83, textureX, textureY);
		bodyModel[200].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[200].setRotationPoint(-18.875f, 2.5f, -11.0f);

		bodyModel[201] = new ModelRendererTurbo(this, 436, 83, textureX, textureY);
		bodyModel[201].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[201].setRotationPoint(-13.625f, 2.5f, -11.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 431, 83, textureX, textureY);
		bodyModel[202].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[202].setRotationPoint(-11.875f, 2.5f, -11.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 420, 83, textureX, textureY);
		bodyModel[203].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[203].setRotationPoint(-6.625f, 2.5f, -11.0f);

		bodyModel[204] = new ModelRendererTurbo(this, 415, 83, textureX, textureY);
		bodyModel[204].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[204].setRotationPoint(-4.875f, 2.5f, -11.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 410, 83, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[205].setRotationPoint(0.375f, 2.5f, -11.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 405, 83, textureX, textureY);
		bodyModel[206].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[206].setRotationPoint(2.125f, 2.5f, -11.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 397, 83, textureX, textureY);
		bodyModel[207].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[207].setRotationPoint(7.375f, 2.5f, -11.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 392, 83, textureX, textureY);
		bodyModel[208].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[208].setRotationPoint(9.125f, 2.5f, -11.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 387, 83, textureX, textureY);
		bodyModel[209].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[209].setRotationPoint(14.375f, 2.5f, -11.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 382, 83, textureX, textureY);
		bodyModel[210].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[210].setRotationPoint(16.125f, 2.5f, -11.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 373, 83, textureX, textureY);
		bodyModel[211].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[211].setRotationPoint(21.375f, 2.5f, -11.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 368, 83, textureX, textureY);
		bodyModel[212].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[212].setRotationPoint(23.125f, 2.5f, -11.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 363, 83, textureX, textureY);
		bodyModel[213].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[213].setRotationPoint(28.375f, 2.5f, -11.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 358, 83, textureX, textureY);
		bodyModel[214].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[214].setRotationPoint(30.125f, 2.5f, -11.0f);

		bodyModel[215] = new ModelRendererTurbo(this, 353, 83, textureX, textureY);
		bodyModel[215].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[215].setRotationPoint(35.375f, 2.5f, -11.0f);

		bodyModel[216] = new ModelRendererTurbo(this, 348, 83, textureX, textureY);
		bodyModel[216].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[216].setRotationPoint(37.125f, 2.5f, -11.0f);

		bodyModel[217] = new ModelRendererTurbo(this, 343, 83, textureX, textureY);
		bodyModel[217].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[217].setRotationPoint(42.375f, 2.5f, -11.0f);

		bodyModel[218] = new ModelRendererTurbo(this, 338, 83, textureX, textureY);
		bodyModel[218].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[218].setRotationPoint(44.125f, 2.5f, -11.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 329, 83, textureX, textureY);
		bodyModel[219].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[219].setRotationPoint(49.375f, 2.5f, -11.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 324, 83, textureX, textureY);
		bodyModel[220].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[220].setRotationPoint(51.125f, 2.5f, -11.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 319, 83, textureX, textureY);
		bodyModel[221].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[221].setRotationPoint(61.0f, 2.5f, -11.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 314, 83, textureX, textureY);
		bodyModel[222].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[222].setRotationPoint(62.75f, 2.5f, -11.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 352, 103, textureX, textureY);
		bodyModel[223].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[223].setRotationPoint(-60.25f, -9.75f, -11.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 347, 103, textureX, textureY);
		bodyModel[224].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[224].setRotationPoint(-58.5f, -9.75f, -11.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 342, 103, textureX, textureY);
		bodyModel[225].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[225].setRotationPoint(-48.625f, -9.75f, -11.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 337, 103, textureX, textureY);
		bodyModel[226].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[226].setRotationPoint(-46.875f, -9.75f, -11.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 329, 103, textureX, textureY);
		bodyModel[227].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[227].setRotationPoint(-41.625f, -9.75f, -11.0f);

		bodyModel[228] = new ModelRendererTurbo(this, 324, 103, textureX, textureY);
		bodyModel[228].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[228].setRotationPoint(-39.875f, -9.75f, -11.0f);

		bodyModel[229] = new ModelRendererTurbo(this, 319, 103, textureX, textureY);
		bodyModel[229].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[229].setRotationPoint(-34.625f, -9.75f, -11.0f);

		bodyModel[230] = new ModelRendererTurbo(this, 314, 103, textureX, textureY);
		bodyModel[230].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[230].setRotationPoint(-32.875f, -9.75f, -11.0f);

		bodyModel[231] = new ModelRendererTurbo(this, 377, 102, textureX, textureY);
		bodyModel[231].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[231].setRotationPoint(-27.625f, -9.75f, -11.0f);

		bodyModel[232] = new ModelRendererTurbo(this, 372, 102, textureX, textureY);
		bodyModel[232].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[232].setRotationPoint(-25.875f, -9.75f, -11.0f);

		bodyModel[233] = new ModelRendererTurbo(this, 367, 102, textureX, textureY);
		bodyModel[233].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[233].setRotationPoint(-20.625f, -9.75f, -11.0f);

		bodyModel[234] = new ModelRendererTurbo(this, 362, 102, textureX, textureY);
		bodyModel[234].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[234].setRotationPoint(-18.875f, -9.75f, -11.0f);

		bodyModel[235] = new ModelRendererTurbo(this, 507, 100, textureX, textureY);
		bodyModel[235].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[235].setRotationPoint(-13.625f, -9.75f, -11.0f);

		bodyModel[236] = new ModelRendererTurbo(this, 502, 100, textureX, textureY);
		bodyModel[236].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[236].setRotationPoint(-11.875f, -9.75f, -11.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 15, 100, textureX, textureY);
		bodyModel[237].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[237].setRotationPoint(-6.625f, -9.75f, -11.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 10, 99, textureX, textureY);
		bodyModel[238].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[238].setRotationPoint(-4.875f, -9.75f, -11.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 497, 98, textureX, textureY);
		bodyModel[239].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[239].setRotationPoint(0.375f, -9.75f, -11.0f);

		bodyModel[240] = new ModelRendererTurbo(this, 492, 98, textureX, textureY);
		bodyModel[240].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[240].setRotationPoint(2.125f, -9.75f, -11.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 5, 98, textureX, textureY);
		bodyModel[241].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[241].setRotationPoint(7.375f, -9.75f, -11.0f);

		bodyModel[242] = new ModelRendererTurbo(this, 0, 98, textureX, textureY);
		bodyModel[242].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[242].setRotationPoint(9.125f, -9.75f, -11.0f);

		bodyModel[243] = new ModelRendererTurbo(this, 487, 93, textureX, textureY);
		bodyModel[243].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[243].setRotationPoint(14.375f, -9.75f, -11.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 482, 93, textureX, textureY);
		bodyModel[244].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[244].setRotationPoint(16.125f, -9.75f, -11.0f);

		bodyModel[245] = new ModelRendererTurbo(this, 477, 93, textureX, textureY);
		bodyModel[245].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[245].setRotationPoint(21.375f, -9.75f, -11.0f);

		bodyModel[246] = new ModelRendererTurbo(this, 469, 93, textureX, textureY);
		bodyModel[246].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[246].setRotationPoint(23.125f, -9.75f, -11.0f);

		bodyModel[247] = new ModelRendererTurbo(this, 464, 93, textureX, textureY);
		bodyModel[247].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[247].setRotationPoint(28.375f, -9.75f, -11.0f);

		bodyModel[248] = new ModelRendererTurbo(this, 459, 93, textureX, textureY);
		bodyModel[248].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[248].setRotationPoint(30.125f, -9.75f, -11.0f);

		bodyModel[249] = new ModelRendererTurbo(this, 454, 93, textureX, textureY);
		bodyModel[249].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[249].setRotationPoint(35.375f, -9.75f, -11.0f);

		bodyModel[250] = new ModelRendererTurbo(this, 504, 86, textureX, textureY);
		bodyModel[250].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[250].setRotationPoint(37.125f, -9.75f, -11.0f);

		bodyModel[251] = new ModelRendererTurbo(this, 15, 86, textureX, textureY);
		bodyModel[251].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[251].setRotationPoint(42.375f, -9.75f, -11.0f);

		bodyModel[252] = new ModelRendererTurbo(this, 10, 85, textureX, textureY);
		bodyModel[252].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[252].setRotationPoint(44.125f, -9.75f, -11.0f);

		bodyModel[253] = new ModelRendererTurbo(this, 499, 84, textureX, textureY);
		bodyModel[253].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[253].setRotationPoint(49.375f, -9.75f, -11.0f);

		bodyModel[254] = new ModelRendererTurbo(this, 494, 84, textureX, textureY);
		bodyModel[254].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[254].setRotationPoint(51.125f, -9.75f, -11.0f);

		bodyModel[255] = new ModelRendererTurbo(this, 5, 84, textureX, textureY);
		bodyModel[255].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[255].setRotationPoint(61.0f, -9.75f, -11.0f);

		bodyModel[256] = new ModelRendererTurbo(this, 0, 84, textureX, textureY);
		bodyModel[256].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[256].setRotationPoint(62.75f, -9.75f, -11.0f);

		bodyModel[257] = new ModelRendererTurbo(this, 473, 0, textureX, textureY);
		bodyModel[257].addShapeBox(0, 0, 0, 18, 4, 0, 0, 0, 0, 0, -9, 0, 0, -9, 0, 0, 0, 0, 0, 0, -2, 0, -9, -2, 0, -9, -2, 0, 0, -2, 0);
		bodyModel[257].setRotationPoint(-57.8125f, -7.125f, -10.51f);

		bodyModel[258] = new ModelRendererTurbo(this, 428, 0, textureX, textureY);
		bodyModel[258].addShapeBox(0, 0, 0, 18, 18, 0, 0, 0, 0, 0, -9, 0, 0, -9, 0, 0, 0, 0, 0, 0, -9, 0, -9, -9, 0, -9, -9, 0, 0, -9, 0);
		bodyModel[258].setRotationPoint(51.8125f, -7.125f, -10.51f);

		bodyModel[259] = new ModelRendererTurbo(this, 338, 23, textureX, textureY);
		bodyModel[259].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[259].setRotationPoint(38.0f, -6.125f, -10.51f);

		bodyModel[260] = new ModelRendererTurbo(this, 314, 23, textureX, textureY);
		bodyModel[260].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[260].setRotationPoint(31.0f, -6.125f, -10.51f);

		bodyModel[261] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[261].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[261].setRotationPoint(24.0f, -6.125f, -10.51f);

		bodyModel[262] = new ModelRendererTurbo(this, 490, 5, textureX, textureY);
		bodyModel[262].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[262].setRotationPoint(17.0f, -6.125f, -10.51f);

		bodyModel[263] = new ModelRendererTurbo(this, 506, 82, textureX, textureY);
		bodyModel[263].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f);
		bodyModel[263].setRotationPoint(-65.5f, -1.875f, -10.625f);

		bodyModel[264] = new ModelRendererTurbo(this, 15, 82, textureX, textureY);
		bodyModel[264].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f);
		bodyModel[264].setRotationPoint(-62.25f, -1.875f, -10.625f);

		bodyModel[265] = new ModelRendererTurbo(this, 501, 81, textureX, textureY);
		bodyModel[265].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.875f, 0, 0.5f, -0.875f);
		bodyModel[265].setRotationPoint(-63.75f, -1.875f, -10.625f);

		bodyModel[266] = new ModelRendererTurbo(this, 394, 16, textureX, textureY);
		bodyModel[266].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[266].setRotationPoint(-65.5f, -2.125f, -10.625f);

		bodyModel[267] = new ModelRendererTurbo(this, 383, 16, textureX, textureY);
		bodyModel[267].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[267].setRotationPoint(-65.5f, 0.125f, -10.625f);

		bodyModel[268] = new ModelRendererTurbo(this, 364, 32, textureX, textureY);
		bodyModel[268].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[268].setRotationPoint(-65.25f, -0.375f, -10.625f);

		bodyModel[269] = new ModelRendererTurbo(this, 489, 80, textureX, textureY);
		bodyModel[269].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[269].setRotationPoint(70.5f, -7.5f, -11.0f);

		bodyModel[270] = new ModelRendererTurbo(this, 484, 80, textureX, textureY);
		bodyModel[270].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[270].setRotationPoint(73.75f, -7.5f, -11.0f);

		bodyModel[271] = new ModelRendererTurbo(this, 479, 80, textureX, textureY);
		bodyModel[271].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[271].setRotationPoint(70.5f, -5.75f, -11.0f);

		bodyModel[272] = new ModelRendererTurbo(this, 474, 80, textureX, textureY);
		bodyModel[272].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[272].setRotationPoint(73.75f, -5.75f, -11.0f);

		bodyModel[273] = new ModelRendererTurbo(this, 466, 80, textureX, textureY);
		bodyModel[273].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[273].setRotationPoint(70.5f, -2.5f, -11.0f);

		bodyModel[274] = new ModelRendererTurbo(this, 461, 80, textureX, textureY);
		bodyModel[274].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[274].setRotationPoint(73.75f, -2.5f, -11.0f);

		bodyModel[275] = new ModelRendererTurbo(this, 420, 80, textureX, textureY);
		bodyModel[275].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[275].setRotationPoint(70.5f, 0.75f, -11.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 415, 80, textureX, textureY);
		bodyModel[276].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[276].setRotationPoint(73.75f, 0.75f, -11.0f);

		bodyModel[277] = new ModelRendererTurbo(this, 410, 80, textureX, textureY);
		bodyModel[277].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[277].setRotationPoint(70.5f, -5.875f, -11.125f);

		bodyModel[278] = new ModelRendererTurbo(this, 405, 80, textureX, textureY);
		bodyModel[278].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[278].setRotationPoint(73.25f, -5.875f, -11.125f);

		bodyModel[279] = new ModelRendererTurbo(this, 397, 80, textureX, textureY);
		bodyModel[279].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[279].setRotationPoint(70.5f, -2.625f, -11.125f);

		bodyModel[280] = new ModelRendererTurbo(this, 392, 80, textureX, textureY);
		bodyModel[280].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[280].setRotationPoint(73.25f, -2.625f, -11.125f);

		bodyModel[281] = new ModelRendererTurbo(this, 387, 80, textureX, textureY);
		bodyModel[281].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[281].setRotationPoint(70.5f, 0.625f, -11.125f);

		bodyModel[282] = new ModelRendererTurbo(this, 382, 80, textureX, textureY);
		bodyModel[282].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[282].setRotationPoint(73.25f, 0.625f, -11.125f);

		bodyModel[283] = new ModelRendererTurbo(this, 489, 77, textureX, textureY);
		bodyModel[283].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f);
		bodyModel[283].setRotationPoint(70.5f, -7.625f, -11.125f);

		bodyModel[284] = new ModelRendererTurbo(this, 484, 77, textureX, textureY);
		bodyModel[284].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f);
		bodyModel[284].setRotationPoint(73.25f, -7.625f, -11.125f);

		bodyModel[285] = new ModelRendererTurbo(this, 355, 32, textureX, textureY);
		bodyModel[285].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[285].setRotationPoint(70.875f, -8.0f, -11.125f);

		bodyModel[286] = new ModelRendererTurbo(this, 473, 30, textureX, textureY);
		bodyModel[286].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[286].setRotationPoint(70.875f, -5.5f, -11.125f);

		bodyModel[287] = new ModelRendererTurbo(this, 446, 30, textureX, textureY);
		bodyModel[287].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[287].setRotationPoint(70.875f, -2.25f, -11.125f);

		bodyModel[288] = new ModelRendererTurbo(this, 437, 29, textureX, textureY);
		bodyModel[288].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[288].setRotationPoint(70.875f, 1.0f, -11.125f);

		bodyModel[289] = new ModelRendererTurbo(this, 428, 29, textureX, textureY);
		bodyModel[289].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[289].setRotationPoint(-69.875f, -8.0f, -11.125f);

		bodyModel[290] = new ModelRendererTurbo(this, 401, 29, textureX, textureY);
		bodyModel[290].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[290].setRotationPoint(-69.875f, -5.5f, -11.125f);

		bodyModel[291] = new ModelRendererTurbo(this, 392, 29, textureX, textureY);
		bodyModel[291].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[291].setRotationPoint(-69.875f, -2.25f, -11.125f);

		bodyModel[292] = new ModelRendererTurbo(this, 383, 29, textureX, textureY);
		bodyModel[292].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[292].setRotationPoint(-69.875f, 1.0f, -11.125f);

		bodyModel[293] = new ModelRendererTurbo(this, 479, 77, textureX, textureY);
		bodyModel[293].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f);
		bodyModel[293].setRotationPoint(-70.25f, -7.625f, -11.125f);

		bodyModel[294] = new ModelRendererTurbo(this, 474, 77, textureX, textureY);
		bodyModel[294].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f);
		bodyModel[294].setRotationPoint(-67.5f, -7.625f, -11.125f);

		bodyModel[295] = new ModelRendererTurbo(this, 466, 77, textureX, textureY);
		bodyModel[295].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[295].setRotationPoint(-70.25f, -5.875f, -11.125f);

		bodyModel[296] = new ModelRendererTurbo(this, 461, 77, textureX, textureY);
		bodyModel[296].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[296].setRotationPoint(-67.5f, -5.875f, -11.125f);

		bodyModel[297] = new ModelRendererTurbo(this, 412, 75, textureX, textureY);
		bodyModel[297].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[297].setRotationPoint(-70.25f, -2.625f, -11.125f);

		bodyModel[298] = new ModelRendererTurbo(this, 407, 75, textureX, textureY);
		bodyModel[298].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[298].setRotationPoint(-67.5f, -2.625f, -11.125f);

		bodyModel[299] = new ModelRendererTurbo(this, 489, 74, textureX, textureY);
		bodyModel[299].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[299].setRotationPoint(-70.25f, 0.625f, -11.125f);

		bodyModel[300] = new ModelRendererTurbo(this, 484, 74, textureX, textureY);
		bodyModel[300].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[300].setRotationPoint(-67.5f, 0.625f, -11.125f);

		bodyModel[301] = new ModelRendererTurbo(this, 479, 74, textureX, textureY);
		bodyModel[301].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[301].setRotationPoint(-70.25f, 1.5f, -11.5f);

		bodyModel[302] = new ModelRendererTurbo(this, 474, 74, textureX, textureY);
		bodyModel[302].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[302].setRotationPoint(-70.25f, -7.5f, -11.0f);

		bodyModel[303] = new ModelRendererTurbo(this, 466, 74, textureX, textureY);
		bodyModel[303].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[303].setRotationPoint(-67.0f, -7.5f, -11.0f);

		bodyModel[304] = new ModelRendererTurbo(this, 461, 74, textureX, textureY);
		bodyModel[304].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[304].setRotationPoint(-70.25f, -5.75f, -11.0f);

		bodyModel[305] = new ModelRendererTurbo(this, 421, 74, textureX, textureY);
		bodyModel[305].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[305].setRotationPoint(-67.0f, -5.75f, -11.0f);

		bodyModel[306] = new ModelRendererTurbo(this, 397, 73, textureX, textureY);
		bodyModel[306].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[306].setRotationPoint(-70.25f, -2.5f, -11.0f);

		bodyModel[307] = new ModelRendererTurbo(this, 392, 73, textureX, textureY);
		bodyModel[307].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[307].setRotationPoint(-67.0f, -2.5f, -11.0f);

		bodyModel[308] = new ModelRendererTurbo(this, 387, 73, textureX, textureY);
		bodyModel[308].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[308].setRotationPoint(-70.25f, 0.75f, -11.0f);

		bodyModel[309] = new ModelRendererTurbo(this, 382, 73, textureX, textureY);
		bodyModel[309].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[309].setRotationPoint(-67.0f, 0.75f, -11.0f);

		bodyModel[310] = new ModelRendererTurbo(this, 0, 154, textureX, textureY);
		bodyModel[310].addShapeBox(0, 0, 0, 146, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[310].setRotationPoint(-70.75f, -9.75f, -10.5f);

		bodyModel[311] = new ModelRendererTurbo(this, 337, 124, textureX, textureY);
		bodyModel[311].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[311].setRotationPoint(-59.625f, 2.5f, -10.0f);

		bodyModel[312] = new ModelRendererTurbo(this, 451, 117, textureX, textureY);
		bodyModel[312].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[312].setRotationPoint(63.125f, 2.5f, -10.0f);

		bodyModel[313] = new ModelRendererTurbo(this, 428, 115, textureX, textureY);
		bodyModel[313].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[313].setRotationPoint(50.5f, 2.5f, -10.0f);

		bodyModel[314] = new ModelRendererTurbo(this, 362, 104, textureX, textureY);
		bodyModel[314].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[314].setRotationPoint(37.875f, 2.5f, -10.0f);

		bodyModel[315] = new ModelRendererTurbo(this, 314, 104, textureX, textureY);
		bodyModel[315].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[315].setRotationPoint(25.25f, 2.5f, -10.0f);

		bodyModel[316] = new ModelRendererTurbo(this, 405, 102, textureX, textureY);
		bodyModel[316].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[316].setRotationPoint(-47.0f, 2.5f, -10.0f);

		bodyModel[317] = new ModelRendererTurbo(this, 339, 102, textureX, textureY);
		bodyModel[317].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[317].setRotationPoint(-34.375f, 2.5f, -10.0f);

		bodyModel[318] = new ModelRendererTurbo(this, 454, 95, textureX, textureY);
		bodyModel[318].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[318].setRotationPoint(-21.75f, 2.5f, -10.0f);

		bodyModel[319] = new ModelRendererTurbo(this, 431, 93, textureX, textureY);
		bodyModel[319].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[319].setRotationPoint(-9.125f, 2.5f, -10.0f);

		bodyModel[320] = new ModelRendererTurbo(this, 382, 82, textureX, textureY);
		bodyModel[320].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[320].setRotationPoint(12.625f, 2.5f, -10.0f);

		bodyModel[321] = new ModelRendererTurbo(this, 451, 71, textureX, textureY);
		bodyModel[321].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0);
		bodyModel[321].setRotationPoint(2.0f, 2.5f, -10.0f);

		bodyModel[322] = new ModelRendererTurbo(this, 457, 26, textureX, textureY);
		bodyModel[322].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[322].setRotationPoint(-71.25f, 2.5f, 6.5f);

		bodyModel[323] = new ModelRendererTurbo(this, 412, 25, textureX, textureY);
		bodyModel[323].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, 0, -2);
		bodyModel[323].setRotationPoint(-71.25f, 2.5f, -10.5f);

		bodyModel[324] = new ModelRendererTurbo(this, 0, 110, textureX, textureY);
		bodyModel[324].addShapeBox(0, 0, 0, 146, 1, 21, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[324].setRotationPoint(-70.75f, 1.5f, -10.5f);

		bodyModel[778] = new ModelRendererTurbo(this, 0, 110, textureX, textureY);
		bodyModel[778].addShapeBox(0, 0, 0, 146, 1, 21, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[778].setRotationPoint(-70.75f, -0.15625f, -10.5f);

		bodyModel[325] = new ModelRendererTurbo(this, 473, 23, textureX, textureY);
		bodyModel[325].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[325].setRotationPoint(75.25f, 2.5f, 6.5f);

		bodyModel[326] = new ModelRendererTurbo(this, 450, 23, textureX, textureY);
		bodyModel[326].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2, 0, 0, -2);
		bodyModel[326].setRotationPoint(75.25f, 2.5f, -10.5f);

		bodyModel[327] = new ModelRendererTurbo(this, 0, 133, textureX, textureY);
		bodyModel[327].addShapeBox(0, 0, 0, 157, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[327].setRotationPoint(-76.25f, 2.5f, -1.0f);

		bodyModel[328] = new ModelRendererTurbo(this, 408, 69, textureX, textureY);
		bodyModel[328].addShapeBox(0, 0, 0, 1, 12, 20, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[328].setRotationPoint(74.75f, -9.75f, -10.0f);

		bodyModel[329] = new ModelRendererTurbo(this, 314, 69, textureX, textureY);
		bodyModel[329].addShapeBox(0, 0, 0, 1, 12, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[329].setRotationPoint(75.25f, -9.75f, -10.5f);

		bodyModel[330] = new ModelRendererTurbo(this, 383, 57, textureX, textureY);
		bodyModel[330].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[330].setRotationPoint(75.75f, -8.0f, -10.5f);

		bodyModel[331] = new ModelRendererTurbo(this, 452, 48, textureX, textureY);
		bodyModel[331].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[331].setRotationPoint(75.75f, -2.75f, -10.5f);

		bodyModel[332] = new ModelRendererTurbo(this, 428, 46, textureX, textureY);
		bodyModel[332].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[332].setRotationPoint(75.75f, -6.25f, -10.5f);

		bodyModel[333] = new ModelRendererTurbo(this, 359, 46, textureX, textureY);
		bodyModel[333].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[333].setRotationPoint(75.75f, -4.5f, -10.5f);

		bodyModel[334] = new ModelRendererTurbo(this, 314, 46, textureX, textureY);
		bodyModel[334].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[334].setRotationPoint(75.75f, -1.0f, -10.5f);

		bodyModel[335] = new ModelRendererTurbo(this, 449, 23, textureX, textureY);
		bodyModel[335].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[335].setRotationPoint(75.75f, 0.75f, -10.5f);

		bodyModel[336] = new ModelRendererTurbo(this, 456, 74, textureX, textureY);
		bodyModel[336].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[336].setRotationPoint(75.75f, -9.75f, 3.5f);

		bodyModel[337] = new ModelRendererTurbo(this, 451, 74, textureX, textureY);
		bodyModel[337].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[337].setRotationPoint(75.75f, -9.75f, -4.5f);

		bodyModel[338] = new ModelRendererTurbo(this, 485, 14, textureX, textureY);
		bodyModel[338].addShapeBox(0, 0, 0, 0, 12, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[338].setRotationPoint(76.26f, -9.75f, -4.5f);

		bodyModel[339] = new ModelRendererTurbo(this, 489, 71, textureX, textureY);
		bodyModel[339].addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, 0, 0, -0.3125f, 0, 0, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, -0.375f, 0, -0.75f, -0.5f, 0, -0.6875f, -0.25f, 0, -0.5625f, -0.25f);
		bodyModel[339].setRotationPoint(75.75f, -4.375f, -3.25f);

		bodyModel[340] = new ModelRendererTurbo(this, 484, 71, textureX, textureY);
		bodyModel[340].addShapeBox(0, -1, -0.5f, 1, 1, 1, 0, 0, -0.625f, -0.375f, 0, -0.75f, -0.5f, 0, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, 0, -0.3125f, 0, 0, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f);
		bodyModel[340].setRotationPoint(75.75f, -4.375f, -3.25f);

		bodyModel[341] = new ModelRendererTurbo(this, 479, 71, textureX, textureY);
		bodyModel[341].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.4375f, 0, 0, -0.3125f, 0, -0.5625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, 0, -0.625f, -0.375f);
		bodyModel[341].setRotationPoint(75.75f, -4.375f, -3.25f);

		bodyModel[342] = new ModelRendererTurbo(this, 474, 71, textureX, textureY);
		bodyModel[342].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, -0.5625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.4375f, 0, 0, -0.3125f);
		bodyModel[342].setRotationPoint(75.75f, -4.375f, -3.25f);

		bodyModel[343] = new ModelRendererTurbo(this, 466, 71, textureX, textureY);
		bodyModel[343].addShapeBox(0, -2.125f, -1, 1, 1, 1, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0);
		bodyModel[343].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[344] = new ModelRendererTurbo(this, 461, 71, textureX, textureY);
		bodyModel[344].addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[344].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[345] = new ModelRendererTurbo(this, 456, 71, textureX, textureY);
		bodyModel[345].addShapeBox(0, -1.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0);
		bodyModel[345].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[346] = new ModelRendererTurbo(this, 451, 71, textureX, textureY);
		bodyModel[346].addShapeBox(0, 1.125f, -1, 1, 1, 1, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[346].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[347] = new ModelRendererTurbo(this, 422, 71, textureX, textureY);
		bodyModel[347].addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f);
		bodyModel[347].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[348] = new ModelRendererTurbo(this, 467, 64, textureX, textureY);
		bodyModel[348].addShapeBox(0, 0.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[348].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[349] = new ModelRendererTurbo(this, 462, 64, textureX, textureY);
		bodyModel[349].addShapeBox(0, -2.125f, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f);
		bodyModel[349].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[350] = new ModelRendererTurbo(this, 457, 64, textureX, textureY);
		bodyModel[350].addShapeBox(0, -1, 1.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f);
		bodyModel[350].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[351] = new ModelRendererTurbo(this, 452, 64, textureX, textureY);
		bodyModel[351].addShapeBox(0, -1.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f);
		bodyModel[351].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[352] = new ModelRendererTurbo(this, 353, 64, textureX, textureY);
		bodyModel[352].addShapeBox(0, 1.125f, 0, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f);
		bodyModel[352].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[353] = new ModelRendererTurbo(this, 348, 64, textureX, textureY);
		bodyModel[353].addShapeBox(0, 0, 1.625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f);
		bodyModel[353].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[354] = new ModelRendererTurbo(this, 343, 64, textureX, textureY);
		bodyModel[354].addShapeBox(0, 0.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f);
		bodyModel[354].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[355] = new ModelRendererTurbo(this, 417, 71, textureX, textureY);
		bodyModel[355].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[355].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[356] = new ModelRendererTurbo(this, 412, 71, textureX, textureY);
		bodyModel[356].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[356].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[357] = new ModelRendererTurbo(this, 407, 71, textureX, textureY);
		bodyModel[357].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[357].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[357].rotateAngleX = 1.5707964f;

		bodyModel[358] = new ModelRendererTurbo(this, 397, 69, textureX, textureY);
		bodyModel[358].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[358].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[358].rotateAngleX = 1.5707964f;

		bodyModel[359] = new ModelRendererTurbo(this, 392, 69, textureX, textureY);
		bodyModel[359].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[359].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[359].rotateAngleX = 0.7853982f;

		bodyModel[360] = new ModelRendererTurbo(this, 387, 69, textureX, textureY);
		bodyModel[360].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[360].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[360].rotateAngleX = 0.7853982f;

		bodyModel[361] = new ModelRendererTurbo(this, 382, 69, textureX, textureY);
		bodyModel[361].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[361].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[361].rotateAngleX = 2.3561945f;

		bodyModel[362] = new ModelRendererTurbo(this, 486, 65, textureX, textureY);
		bodyModel[362].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[362].setRotationPoint(76.4375f, -4.375f, -3.0f);
		bodyModel[362].rotateAngleX = 2.3561945f;

		bodyModel[363] = new ModelRendererTurbo(this, 338, 64, textureX, textureY);
		bodyModel[363].addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f);
		bodyModel[363].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[364] = new ModelRendererTurbo(this, 329, 64, textureX, textureY);
		bodyModel[364].addShapeBox(0, -1, -0.75f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f);
		bodyModel[364].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[365] = new ModelRendererTurbo(this, 324, 64, textureX, textureY);
		bodyModel[365].addShapeBox(0, 0, -0.25f, 1, 1, 1, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f);
		bodyModel[365].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[366] = new ModelRendererTurbo(this, 319, 64, textureX, textureY);
		bodyModel[366].addShapeBox(0, -1, -0.25f, 1, 1, 1, 0, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f);
		bodyModel[366].setRotationPoint(76.4375f, -4.375f, -3.0f);

		bodyModel[367] = new ModelRendererTurbo(this, 314, 64, textureX, textureY);
		bodyModel[367].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[367].setRotationPoint(75.875f, -6.0f, -9.75f);

		bodyModel[368] = new ModelRendererTurbo(this, 442, 63, textureX, textureY);
		bodyModel[368].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[368].setRotationPoint(75.875f, -6.0f, -7.0f);

		bodyModel[369] = new ModelRendererTurbo(this, 437, 63, textureX, textureY);
		bodyModel[369].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[369].setRotationPoint(75.875f, -2.625f, -9.75f);

		bodyModel[370] = new ModelRendererTurbo(this, 432, 63, textureX, textureY);
		bodyModel[370].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[370].setRotationPoint(75.875f, -2.625f, -7.0f);

		bodyModel[371] = new ModelRendererTurbo(this, 427, 63, textureX, textureY);
		bodyModel[371].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[371].setRotationPoint(75.875f, 0.75f, -9.75f);

		bodyModel[372] = new ModelRendererTurbo(this, 486, 62, textureX, textureY);
		bodyModel[372].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[372].setRotationPoint(75.875f, 0.75f, -7.0f);

		bodyModel[373] = new ModelRendererTurbo(this, 398, 62, textureX, textureY);
		bodyModel[373].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[373].setRotationPoint(75.875f, -6.0f, 5.875f);

		bodyModel[374] = new ModelRendererTurbo(this, 393, 62, textureX, textureY);
		bodyModel[374].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[374].setRotationPoint(75.875f, -6.0f, 8.625f);

		bodyModel[375] = new ModelRendererTurbo(this, 388, 62, textureX, textureY);
		bodyModel[375].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[375].setRotationPoint(75.875f, -2.625f, 5.875f);

		bodyModel[376] = new ModelRendererTurbo(this, 383, 62, textureX, textureY);
		bodyModel[376].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[376].setRotationPoint(75.875f, -2.625f, 8.625f);

		bodyModel[377] = new ModelRendererTurbo(this, 373, 62, textureX, textureY);
		bodyModel[377].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[377].setRotationPoint(75.875f, 0.75f, 5.875f);

		bodyModel[378] = new ModelRendererTurbo(this, 368, 62, textureX, textureY);
		bodyModel[378].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[378].setRotationPoint(75.875f, 0.75f, 8.625f);

		bodyModel[379] = new ModelRendererTurbo(this, 363, 62, textureX, textureY);
		bodyModel[379].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[379].setRotationPoint(75.75f, -5.625f, -9.75f);

		bodyModel[380] = new ModelRendererTurbo(this, 358, 62, textureX, textureY);
		bodyModel[380].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[380].setRotationPoint(75.75f, -5.625f, -7.0f);

		bodyModel[381] = new ModelRendererTurbo(this, 467, 61, textureX, textureY);
		bodyModel[381].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[381].setRotationPoint(75.75f, -2.25f, -9.75f);

		bodyModel[382] = new ModelRendererTurbo(this, 462, 61, textureX, textureY);
		bodyModel[382].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[382].setRotationPoint(75.75f, -2.25f, -7.0f);

		bodyModel[383] = new ModelRendererTurbo(this, 457, 61, textureX, textureY);
		bodyModel[383].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f);
		bodyModel[383].setRotationPoint(75.75f, 1.125f, -9.75f);

		bodyModel[384] = new ModelRendererTurbo(this, 452, 61, textureX, textureY);
		bodyModel[384].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[384].setRotationPoint(75.75f, 1.125f, -7.0f);

		bodyModel[385] = new ModelRendererTurbo(this, 353, 61, textureX, textureY);
		bodyModel[385].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[385].setRotationPoint(75.75f, -5.625f, 5.875f);

		bodyModel[386] = new ModelRendererTurbo(this, 348, 61, textureX, textureY);
		bodyModel[386].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[386].setRotationPoint(75.75f, -5.625f, 8.625f);

		bodyModel[387] = new ModelRendererTurbo(this, 343, 61, textureX, textureY);
		bodyModel[387].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[387].setRotationPoint(75.75f, -2.25f, 5.875f);

		bodyModel[388] = new ModelRendererTurbo(this, 338, 61, textureX, textureY);
		bodyModel[388].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[388].setRotationPoint(75.75f, -2.25f, 8.625f);

		bodyModel[389] = new ModelRendererTurbo(this, 329, 61, textureX, textureY);
		bodyModel[389].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f);
		bodyModel[389].setRotationPoint(75.75f, 1.125f, 5.875f);

		bodyModel[390] = new ModelRendererTurbo(this, 324, 61, textureX, textureY);
		bodyModel[390].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[390].setRotationPoint(75.75f, 1.125f, 8.625f);

		bodyModel[391] = new ModelRendererTurbo(this, 439, 23, textureX, textureY);
		bodyModel[391].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[391].setRotationPoint(76.0f, -4.9375f, -9.75f);

		bodyModel[392] = new ModelRendererTurbo(this, 428, 23, textureX, textureY);
		bodyModel[392].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[392].setRotationPoint(76.0f, -1.5625f, -9.75f);

		bodyModel[393] = new ModelRendererTurbo(this, 405, 23, textureX, textureY);
		bodyModel[393].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[393].setRotationPoint(76.0f, 1.8125f, -9.75f);

		bodyModel[394] = new ModelRendererTurbo(this, 394, 23, textureX, textureY);
		bodyModel[394].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[394].setRotationPoint(76.0f, -4.9375f, 5.875f);

		bodyModel[395] = new ModelRendererTurbo(this, 383, 23, textureX, textureY);
		bodyModel[395].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[395].setRotationPoint(76.0f, -1.5625f, 5.875f);

		bodyModel[396] = new ModelRendererTurbo(this, 366, 23, textureX, textureY);
		bodyModel[396].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[396].setRotationPoint(76.0f, 1.8125f, 5.875f);

		bodyModel[397] = new ModelRendererTurbo(this, 359, 69, textureX, textureY);
		bodyModel[397].addShapeBox(0, 0, 0, 1, 12, 20, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[397].setRotationPoint(-70.75f, -9.75f, -10.0f);

		bodyModel[398] = new ModelRendererTurbo(this, 404, 23, textureX, textureY);
		bodyModel[398].addShapeBox(0, 0, 0, 1, 12, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[398].setRotationPoint(-71.25f, -9.75f, -10.5f);

		bodyModel[399] = new ModelRendererTurbo(this, 10, 71, textureX, textureY);
		bodyModel[399].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[399].setRotationPoint(-71.75f, -9.75f, 3.5f);

		bodyModel[400] = new ModelRendererTurbo(this, 496, 70, textureX, textureY);
		bodyModel[400].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[400].setRotationPoint(-71.75f, -9.75f, -4.5f);

		bodyModel[401] = new ModelRendererTurbo(this, 359, 23, textureX, textureY);
		bodyModel[401].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[401].setRotationPoint(-71.5f, -8.0f, -10.5f);

		bodyModel[402] = new ModelRendererTurbo(this, 314, 23, textureX, textureY);
		bodyModel[402].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[402].setRotationPoint(-71.5f, -2.75f, -10.5f);

		bodyModel[403] = new ModelRendererTurbo(this, 449, 0, textureX, textureY);
		bodyModel[403].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[403].setRotationPoint(-71.5f, -6.25f, -10.5f);

		bodyModel[404] = new ModelRendererTurbo(this, 404, 0, textureX, textureY);
		bodyModel[404].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[404].setRotationPoint(-71.5f, -4.5f, -10.5f);

		bodyModel[405] = new ModelRendererTurbo(this, 359, 0, textureX, textureY);
		bodyModel[405].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[405].setRotationPoint(-71.5f, -1.0f, -10.5f);

		bodyModel[406] = new ModelRendererTurbo(this, 314, 0, textureX, textureY);
		bodyModel[406].addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0);
		bodyModel[406].setRotationPoint(-71.5f, 0.75f, -10.5f);

		bodyModel[407] = new ModelRendererTurbo(this, 319, 61, textureX, textureY);
		bodyModel[407].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[407].setRotationPoint(-71.75f, -5.625f, -9.75f);

		bodyModel[408] = new ModelRendererTurbo(this, 314, 61, textureX, textureY);
		bodyModel[408].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[408].setRotationPoint(-71.75f, -5.625f, -7.0f);

		bodyModel[409] = new ModelRendererTurbo(this, 442, 60, textureX, textureY);
		bodyModel[409].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[409].setRotationPoint(-71.75f, -2.25f, -9.75f);

		bodyModel[410] = new ModelRendererTurbo(this, 437, 60, textureX, textureY);
		bodyModel[410].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[410].setRotationPoint(-71.75f, -2.25f, -7.0f);

		bodyModel[411] = new ModelRendererTurbo(this, 432, 60, textureX, textureY);
		bodyModel[411].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f);
		bodyModel[411].setRotationPoint(-72.0f, 1.125f, -9.75f);

		bodyModel[412] = new ModelRendererTurbo(this, 427, 60, textureX, textureY);
		bodyModel[412].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[412].setRotationPoint(-72.0f, 1.125f, -7.0f);

		bodyModel[413] = new ModelRendererTurbo(this, 486, 59, textureX, textureY);
		bodyModel[413].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[413].setRotationPoint(-71.75f, -5.625f, 5.875f);

		bodyModel[414] = new ModelRendererTurbo(this, 398, 59, textureX, textureY);
		bodyModel[414].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[414].setRotationPoint(-71.75f, -5.625f, 8.625f);

		bodyModel[415] = new ModelRendererTurbo(this, 393, 59, textureX, textureY);
		bodyModel[415].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[415].setRotationPoint(-71.75f, -2.25f, 5.875f);

		bodyModel[416] = new ModelRendererTurbo(this, 388, 59, textureX, textureY);
		bodyModel[416].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[416].setRotationPoint(-71.75f, -2.25f, 8.625f);

		bodyModel[417] = new ModelRendererTurbo(this, 383, 59, textureX, textureY);
		bodyModel[417].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f);
		bodyModel[417].setRotationPoint(-72.0f, 1.125f, 5.875f);

		bodyModel[418] = new ModelRendererTurbo(this, 373, 59, textureX, textureY);
		bodyModel[418].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[418].setRotationPoint(-72.0f, 1.125f, 8.625f);

		bodyModel[419] = new ModelRendererTurbo(this, 368, 59, textureX, textureY);
		bodyModel[419].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[419].setRotationPoint(-71.875f, -6.0f, -9.75f);

		bodyModel[420] = new ModelRendererTurbo(this, 363, 59, textureX, textureY);
		bodyModel[420].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[420].setRotationPoint(-71.875f, -6.0f, -7.0f);

		bodyModel[421] = new ModelRendererTurbo(this, 358, 59, textureX, textureY);
		bodyModel[421].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[421].setRotationPoint(-71.875f, -2.625f, -9.75f);

		bodyModel[422] = new ModelRendererTurbo(this, 467, 58, textureX, textureY);
		bodyModel[422].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[422].setRotationPoint(-71.875f, -2.625f, -7.0f);

		bodyModel[423] = new ModelRendererTurbo(this, 462, 58, textureX, textureY);
		bodyModel[423].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[423].setRotationPoint(-71.875f, 0.75f, -9.75f);

		bodyModel[424] = new ModelRendererTurbo(this, 457, 58, textureX, textureY);
		bodyModel[424].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[424].setRotationPoint(-71.875f, 0.75f, -7.0f);

		bodyModel[425] = new ModelRendererTurbo(this, 452, 58, textureX, textureY);
		bodyModel[425].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[425].setRotationPoint(-71.875f, -6.0f, 5.875f);

		bodyModel[426] = new ModelRendererTurbo(this, 353, 58, textureX, textureY);
		bodyModel[426].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[426].setRotationPoint(-71.875f, -6.0f, 8.625f);

		bodyModel[427] = new ModelRendererTurbo(this, 348, 58, textureX, textureY);
		bodyModel[427].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[427].setRotationPoint(-71.875f, -2.625f, 5.875f);

		bodyModel[428] = new ModelRendererTurbo(this, 343, 58, textureX, textureY);
		bodyModel[428].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[428].setRotationPoint(-71.875f, -2.625f, 8.625f);

		bodyModel[429] = new ModelRendererTurbo(this, 338, 58, textureX, textureY);
		bodyModel[429].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f, -0.125f, 0.1875f, -0.125f, -0.625f, 0.1875f, -0.125f, -0.625f, 0.4375f, -0.625f, -0.125f, 0.4375f, -0.625f);
		bodyModel[429].setRotationPoint(-71.875f, 0.75f, 5.875f);

		bodyModel[430] = new ModelRendererTurbo(this, 329, 58, textureX, textureY);
		bodyModel[430].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f, -0.625f, 0.1875f, -0.125f, -0.125f, 0.1875f, -0.125f);
		bodyModel[430].setRotationPoint(-71.875f, 0.75f, 8.625f);

		bodyModel[431] = new ModelRendererTurbo(this, 355, 23, textureX, textureY);
		bodyModel[431].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[431].setRotationPoint(-71.75f, -4.9375f, -9.75f);

		bodyModel[432] = new ModelRendererTurbo(this, 494, 16, textureX, textureY);
		bodyModel[432].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[432].setRotationPoint(-71.75f, -1.5625f, -9.75f);

		bodyModel[433] = new ModelRendererTurbo(this, 321, 13, textureX, textureY);
		bodyModel[433].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[433].setRotationPoint(-71.75f, 1.8125f, -9.75f);

		bodyModel[434] = new ModelRendererTurbo(this, 413, 12, textureX, textureY);
		bodyModel[434].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[434].setRotationPoint(-71.75f, -4.9375f, 5.875f);

		bodyModel[435] = new ModelRendererTurbo(this, 314, 11, textureX, textureY);
		bodyModel[435].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[435].setRotationPoint(-71.75f, -1.5625f, 5.875f);

		bodyModel[436] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		bodyModel[436].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[436].setRotationPoint(-71.75f, 1.8125f, 5.875f);

		bodyModel[437] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[437].addShapeBox(0, 0, 0, 0, 12, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[437].setRotationPoint(-71.76f, -9.75f, -4.5f);

		bodyModel[438] = new ModelRendererTurbo(this, 324, 58, textureX, textureY);
		bodyModel[438].addShapeBox(0, -2.125f, -1, 1, 1, 1, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0);
		bodyModel[438].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[439] = new ModelRendererTurbo(this, 319, 58, textureX, textureY);
		bodyModel[439].addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[439].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[440] = new ModelRendererTurbo(this, 314, 58, textureX, textureY);
		bodyModel[440].addShapeBox(0, -1.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0);
		bodyModel[440].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[441] = new ModelRendererTurbo(this, 442, 57, textureX, textureY);
		bodyModel[441].addShapeBox(0, 1.125f, -1, 1, 1, 1, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[441].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[442] = new ModelRendererTurbo(this, 437, 57, textureX, textureY);
		bodyModel[442].addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f);
		bodyModel[442].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[443] = new ModelRendererTurbo(this, 432, 57, textureX, textureY);
		bodyModel[443].addShapeBox(0, 0.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0);
		bodyModel[443].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[444] = new ModelRendererTurbo(this, 427, 57, textureX, textureY);
		bodyModel[444].addShapeBox(0, -2.125f, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f);
		bodyModel[444].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[445] = new ModelRendererTurbo(this, 486, 56, textureX, textureY);
		bodyModel[445].addShapeBox(0, -1, 1.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f);
		bodyModel[445].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[446] = new ModelRendererTurbo(this, 467, 55, textureX, textureY);
		bodyModel[446].addShapeBox(0, -1.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f);
		bodyModel[446].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[447] = new ModelRendererTurbo(this, 462, 55, textureX, textureY);
		bodyModel[447].addShapeBox(0, 1.125f, 0, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f);
		bodyModel[447].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[448] = new ModelRendererTurbo(this, 457, 55, textureX, textureY);
		bodyModel[448].addShapeBox(0, 0, 1.625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f);
		bodyModel[448].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[449] = new ModelRendererTurbo(this, 452, 55, textureX, textureY);
		bodyModel[449].addShapeBox(0, 0.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f);
		bodyModel[449].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[450] = new ModelRendererTurbo(this, 398, 55, textureX, textureY);
		bodyModel[450].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[450].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[451] = new ModelRendererTurbo(this, 393, 55, textureX, textureY);
		bodyModel[451].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[451].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[452] = new ModelRendererTurbo(this, 388, 55, textureX, textureY);
		bodyModel[452].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[452].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[452].rotateAngleX = 1.5707964f;

		bodyModel[453] = new ModelRendererTurbo(this, 383, 55, textureX, textureY);
		bodyModel[453].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[453].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[453].rotateAngleX = 1.5707964f;

		bodyModel[454] = new ModelRendererTurbo(this, 373, 55, textureX, textureY);
		bodyModel[454].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[454].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[454].rotateAngleX = 0.7853982f;

		bodyModel[455] = new ModelRendererTurbo(this, 368, 55, textureX, textureY);
		bodyModel[455].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[455].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[455].rotateAngleX = 0.7853982f;

		bodyModel[456] = new ModelRendererTurbo(this, 363, 55, textureX, textureY);
		bodyModel[456].addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f);
		bodyModel[456].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[456].rotateAngleX = 2.3561945f;

		bodyModel[457] = new ModelRendererTurbo(this, 358, 55, textureX, textureY);
		bodyModel[457].addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f);
		bodyModel[457].setRotationPoint(-72.6875f, -4.375f, 3.0f);
		bodyModel[457].rotateAngleX = 2.3561945f;

		bodyModel[458] = new ModelRendererTurbo(this, 353, 55, textureX, textureY);
		bodyModel[458].addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, 0, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, -0.5625f, -0.25f, 0, -0.6875f, -0.25f);
		bodyModel[458].setRotationPoint(-72.25f, -4.375f, 2.75f);

		bodyModel[459] = new ModelRendererTurbo(this, 348, 55, textureX, textureY);
		bodyModel[459].addShapeBox(0, -1, -0.5f, 1, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, -0.5625f, -0.25f, 0, -0.6875f, -0.25f, 0, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f);
		bodyModel[459].setRotationPoint(-72.25f, -4.375f, 2.75f);

		bodyModel[460] = new ModelRendererTurbo(this, 343, 55, textureX, textureY);
		bodyModel[460].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3125f, 0, 0, -0.4375f, 0, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.625f, -0.375f, 0, -0.75f, -0.5f);
		bodyModel[460].setRotationPoint(-72.25f, -4.375f, 2.75f);

		bodyModel[461] = new ModelRendererTurbo(this, 338, 55, textureX, textureY);
		bodyModel[461].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.625f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3125f, 0, 0, -0.4375f);
		bodyModel[461].setRotationPoint(-72.25f, -4.375f, 2.75f);

		bodyModel[462] = new ModelRendererTurbo(this, 329, 55, textureX, textureY);
		bodyModel[462].addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f);
		bodyModel[462].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[463] = new ModelRendererTurbo(this, 324, 55, textureX, textureY);
		bodyModel[463].addShapeBox(0, -1, -0.75f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f);
		bodyModel[463].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[464] = new ModelRendererTurbo(this, 319, 55, textureX, textureY);
		bodyModel[464].addShapeBox(0, 0, -0.25f, 1, 1, 1, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f);
		bodyModel[464].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[465] = new ModelRendererTurbo(this, 314, 55, textureX, textureY);
		bodyModel[465].addShapeBox(0, -1, -0.25f, 1, 1, 1, 0, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f);
		bodyModel[465].setRotationPoint(-72.6875f, -4.375f, 3.0f);

		bodyModel[466] = new ModelRendererTurbo(this, 5, 70, textureX, textureY);
		bodyModel[466].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[466].setRotationPoint(-60.25f, -9.75f, 10.0f);

		bodyModel[467] = new ModelRendererTurbo(this, 0, 70, textureX, textureY);
		bodyModel[467].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[467].setRotationPoint(-58.5f, -9.75f, 10.0f);

		bodyModel[468] = new ModelRendererTurbo(this, 446, 69, textureX, textureY);
		bodyModel[468].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[468].setRotationPoint(-48.625f, -9.75f, 10.0f);

		bodyModel[469] = new ModelRendererTurbo(this, 441, 69, textureX, textureY);
		bodyModel[469].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[469].setRotationPoint(-46.875f, -9.75f, 10.0f);

		bodyModel[470] = new ModelRendererTurbo(this, 436, 69, textureX, textureY);
		bodyModel[470].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[470].setRotationPoint(-41.625f, -9.75f, 10.0f);

		bodyModel[471] = new ModelRendererTurbo(this, 431, 69, textureX, textureY);
		bodyModel[471].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[471].setRotationPoint(-39.875f, -9.75f, 10.0f);

		bodyModel[472] = new ModelRendererTurbo(this, 373, 69, textureX, textureY);
		bodyModel[472].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[472].setRotationPoint(-34.625f, -9.75f, 10.0f);

		bodyModel[473] = new ModelRendererTurbo(this, 368, 69, textureX, textureY);
		bodyModel[473].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[473].setRotationPoint(-32.875f, -9.75f, 10.0f);

		bodyModel[474] = new ModelRendererTurbo(this, 363, 69, textureX, textureY);
		bodyModel[474].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[474].setRotationPoint(-27.625f, -9.75f, 10.0f);

		bodyModel[475] = new ModelRendererTurbo(this, 358, 69, textureX, textureY);
		bodyModel[475].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[475].setRotationPoint(-25.875f, -9.75f, 10.0f);

		bodyModel[476] = new ModelRendererTurbo(this, 353, 69, textureX, textureY);
		bodyModel[476].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[476].setRotationPoint(-20.625f, -9.75f, 10.0f);

		bodyModel[477] = new ModelRendererTurbo(this, 348, 69, textureX, textureY);
		bodyModel[477].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[477].setRotationPoint(-18.875f, -9.75f, 10.0f);

		bodyModel[478] = new ModelRendererTurbo(this, 343, 69, textureX, textureY);
		bodyModel[478].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[478].setRotationPoint(-13.625f, -9.75f, 10.0f);

		bodyModel[479] = new ModelRendererTurbo(this, 338, 69, textureX, textureY);
		bodyModel[479].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[479].setRotationPoint(-11.875f, -9.75f, 10.0f);

		bodyModel[480] = new ModelRendererTurbo(this, 329, 69, textureX, textureY);
		bodyModel[480].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[480].setRotationPoint(-6.625f, -9.75f, 10.0f);

		bodyModel[481] = new ModelRendererTurbo(this, 324, 69, textureX, textureY);
		bodyModel[481].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[481].setRotationPoint(-4.875f, -9.75f, 10.0f);

		bodyModel[482] = new ModelRendererTurbo(this, 319, 69, textureX, textureY);
		bodyModel[482].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[482].setRotationPoint(0.375f, -9.75f, 10.0f);

		bodyModel[483] = new ModelRendererTurbo(this, 314, 69, textureX, textureY);
		bodyModel[483].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[483].setRotationPoint(2.125f, -9.75f, 10.0f);

		bodyModel[484] = new ModelRendererTurbo(this, 506, 68, textureX, textureY);
		bodyModel[484].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[484].setRotationPoint(7.375f, -9.75f, 10.0f);

		bodyModel[485] = new ModelRendererTurbo(this, 15, 68, textureX, textureY);
		bodyModel[485].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[485].setRotationPoint(9.125f, -9.75f, 10.0f);

		bodyModel[486] = new ModelRendererTurbo(this, 501, 67, textureX, textureY);
		bodyModel[486].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[486].setRotationPoint(14.375f, -9.75f, 10.0f);

		bodyModel[487] = new ModelRendererTurbo(this, 422, 57, textureX, textureY);
		bodyModel[487].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[487].setRotationPoint(16.125f, -9.75f, 10.0f);

		bodyModel[488] = new ModelRendererTurbo(this, 417, 57, textureX, textureY);
		bodyModel[488].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[488].setRotationPoint(21.375f, -9.75f, 10.0f);

		bodyModel[489] = new ModelRendererTurbo(this, 412, 57, textureX, textureY);
		bodyModel[489].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[489].setRotationPoint(23.125f, -9.75f, 10.0f);

		bodyModel[490] = new ModelRendererTurbo(this, 407, 57, textureX, textureY);
		bodyModel[490].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[490].setRotationPoint(28.375f, -9.75f, 10.0f);

		bodyModel[491] = new ModelRendererTurbo(this, 10, 57, textureX, textureY);
		bodyModel[491].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[491].setRotationPoint(30.125f, -9.75f, 10.0f);

		bodyModel[492] = new ModelRendererTurbo(this, 5, 56, textureX, textureY);
		bodyModel[492].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[492].setRotationPoint(35.375f, -9.75f, 10.0f);

		bodyModel[493] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		bodyModel[493].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[493].setRotationPoint(37.125f, -9.75f, 10.0f);

		bodyModel[494] = new ModelRendererTurbo(this, 496, 55, textureX, textureY);
		bodyModel[494].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[494].setRotationPoint(42.375f, -9.75f, 10.0f);

		bodyModel[495] = new ModelRendererTurbo(this, 481, 55, textureX, textureY);
		bodyModel[495].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[495].setRotationPoint(44.125f, -9.75f, 10.0f);

		bodyModel[496] = new ModelRendererTurbo(this, 476, 55, textureX, textureY);
		bodyModel[496].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[496].setRotationPoint(49.375f, -9.75f, 10.0f);

		bodyModel[497] = new ModelRendererTurbo(this, 505, 54, textureX, textureY);
		bodyModel[497].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[497].setRotationPoint(51.125f, -9.75f, 10.0f);

		bodyModel[498] = new ModelRendererTurbo(this, 491, 54, textureX, textureY);
		bodyModel[498].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[498].setRotationPoint(61.0f, -9.75f, 10.0f);

		bodyModel[499] = new ModelRendererTurbo(this, 15, 54, textureX, textureY);
		bodyModel[499].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[499].setRotationPoint(62.75f, -9.75f, 10.0f);

	}

	private final void initGroup_bodyModel1(){
		bodyModel[500] = new ModelRendererTurbo(this, 10, 54, textureX, textureY);
		bodyModel[500].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[500].setRotationPoint(51.25f, 4.125f, 10.5f);

		bodyModel[501] = new ModelRendererTurbo(this, 500, 53, textureX, textureY);
		bodyModel[501].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[501].setRotationPoint(51.25f, 3.625f, 10.5f);

		bodyModel[502] = new ModelRendererTurbo(this, 486, 53, textureX, textureY);
		bodyModel[502].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[502].setRotationPoint(51.25f, 2.5625f, 10.5f);

		bodyModel[503] = new ModelRendererTurbo(this, 5, 53, textureX, textureY);
		bodyModel[503].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[503].setRotationPoint(49.5f, 4.125f, 10.5f);

		bodyModel[504] = new ModelRendererTurbo(this, 0, 53, textureX, textureY);
		bodyModel[504].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[504].setRotationPoint(49.5f, 3.625f, 10.5f);

		bodyModel[505] = new ModelRendererTurbo(this, 495, 52, textureX, textureY);
		bodyModel[505].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[505].setRotationPoint(49.5f, 2.5625f, 10.5f);

		bodyModel[506] = new ModelRendererTurbo(this, 481, 52, textureX, textureY);
		bodyModel[506].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[506].setRotationPoint(62.875f, 4.125f, 10.5f);

		bodyModel[507] = new ModelRendererTurbo(this, 476, 52, textureX, textureY);
		bodyModel[507].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[507].setRotationPoint(62.875f, 3.625f, 10.5f);

		bodyModel[508] = new ModelRendererTurbo(this, 467, 52, textureX, textureY);
		bodyModel[508].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[508].setRotationPoint(62.875f, 2.5625f, 10.5f);

		bodyModel[509] = new ModelRendererTurbo(this, 462, 52, textureX, textureY);
		bodyModel[509].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[509].setRotationPoint(61.125f, 4.125f, 10.5f);

		bodyModel[510] = new ModelRendererTurbo(this, 457, 52, textureX, textureY);
		bodyModel[510].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[510].setRotationPoint(61.125f, 3.625f, 10.5f);

		bodyModel[511] = new ModelRendererTurbo(this, 452, 52, textureX, textureY);
		bodyModel[511].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[511].setRotationPoint(61.125f, 2.5625f, 10.5f);

		bodyModel[512] = new ModelRendererTurbo(this, 398, 52, textureX, textureY);
		bodyModel[512].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[512].setRotationPoint(44.25f, 4.125f, 10.5f);

		bodyModel[513] = new ModelRendererTurbo(this, 393, 52, textureX, textureY);
		bodyModel[513].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[513].setRotationPoint(44.25f, 3.625f, 10.5f);

		bodyModel[514] = new ModelRendererTurbo(this, 388, 52, textureX, textureY);
		bodyModel[514].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[514].setRotationPoint(44.25f, 2.5625f, 10.5f);

		bodyModel[515] = new ModelRendererTurbo(this, 383, 52, textureX, textureY);
		bodyModel[515].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[515].setRotationPoint(42.5f, 4.125f, 10.5f);

		bodyModel[516] = new ModelRendererTurbo(this, 373, 52, textureX, textureY);
		bodyModel[516].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[516].setRotationPoint(42.5f, 3.625f, 10.5f);

		bodyModel[517] = new ModelRendererTurbo(this, 368, 52, textureX, textureY);
		bodyModel[517].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[517].setRotationPoint(42.5f, 2.5625f, 10.5f);

		bodyModel[518] = new ModelRendererTurbo(this, 363, 52, textureX, textureY);
		bodyModel[518].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[518].setRotationPoint(37.25f, 4.125f, 10.5f);

		bodyModel[519] = new ModelRendererTurbo(this, 358, 52, textureX, textureY);
		bodyModel[519].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[519].setRotationPoint(37.25f, 3.625f, 10.5f);

		bodyModel[520] = new ModelRendererTurbo(this, 353, 52, textureX, textureY);
		bodyModel[520].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[520].setRotationPoint(37.25f, 2.5625f, 10.5f);

		bodyModel[521] = new ModelRendererTurbo(this, 348, 52, textureX, textureY);
		bodyModel[521].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[521].setRotationPoint(35.5f, 4.125f, 10.5f);

		bodyModel[522] = new ModelRendererTurbo(this, 343, 52, textureX, textureY);
		bodyModel[522].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[522].setRotationPoint(35.5f, 3.625f, 10.5f);

		bodyModel[523] = new ModelRendererTurbo(this, 338, 52, textureX, textureY);
		bodyModel[523].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[523].setRotationPoint(35.5f, 2.5625f, 10.5f);

		bodyModel[524] = new ModelRendererTurbo(this, 329, 52, textureX, textureY);
		bodyModel[524].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[524].setRotationPoint(30.25f, 4.125f, 10.5f);

		bodyModel[525] = new ModelRendererTurbo(this, 324, 52, textureX, textureY);
		bodyModel[525].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[525].setRotationPoint(30.25f, 3.625f, 10.5f);

		bodyModel[526] = new ModelRendererTurbo(this, 319, 52, textureX, textureY);
		bodyModel[526].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[526].setRotationPoint(30.25f, 2.5625f, 10.5f);

		bodyModel[527] = new ModelRendererTurbo(this, 314, 52, textureX, textureY);
		bodyModel[527].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[527].setRotationPoint(28.5f, 4.125f, 10.5f);

		bodyModel[528] = new ModelRendererTurbo(this, 504, 51, textureX, textureY);
		bodyModel[528].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[528].setRotationPoint(28.5f, 3.625f, 10.5f);

		bodyModel[529] = new ModelRendererTurbo(this, 490, 51, textureX, textureY);
		bodyModel[529].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[529].setRotationPoint(28.5f, 2.5625f, 10.5f);

		bodyModel[530] = new ModelRendererTurbo(this, 15, 51, textureX, textureY);
		bodyModel[530].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[530].setRotationPoint(23.25f, 4.125f, 10.5f);

		bodyModel[531] = new ModelRendererTurbo(this, 10, 51, textureX, textureY);
		bodyModel[531].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[531].setRotationPoint(23.25f, 3.625f, 10.5f);

		bodyModel[532] = new ModelRendererTurbo(this, 5, 50, textureX, textureY);
		bodyModel[532].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[532].setRotationPoint(23.25f, 2.5625f, 10.5f);

		bodyModel[533] = new ModelRendererTurbo(this, 0, 50, textureX, textureY);
		bodyModel[533].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[533].setRotationPoint(21.5f, 4.125f, 10.5f);

		bodyModel[534] = new ModelRendererTurbo(this, 500, 49, textureX, textureY);
		bodyModel[534].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[534].setRotationPoint(21.5f, 3.625f, 10.5f);

		bodyModel[535] = new ModelRendererTurbo(this, 495, 49, textureX, textureY);
		bodyModel[535].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[535].setRotationPoint(21.5f, 2.5625f, 10.5f);

		bodyModel[536] = new ModelRendererTurbo(this, 486, 49, textureX, textureY);
		bodyModel[536].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[536].setRotationPoint(16.25f, 4.125f, 10.5f);

		bodyModel[537] = new ModelRendererTurbo(this, 481, 49, textureX, textureY);
		bodyModel[537].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[537].setRotationPoint(16.25f, 3.625f, 10.5f);

		bodyModel[538] = new ModelRendererTurbo(this, 476, 49, textureX, textureY);
		bodyModel[538].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[538].setRotationPoint(16.25f, 2.5625f, 10.5f);

		bodyModel[539] = new ModelRendererTurbo(this, 467, 49, textureX, textureY);
		bodyModel[539].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[539].setRotationPoint(14.5f, 4.125f, 10.5f);

		bodyModel[540] = new ModelRendererTurbo(this, 462, 49, textureX, textureY);
		bodyModel[540].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[540].setRotationPoint(14.5f, 3.625f, 10.5f);

		bodyModel[541] = new ModelRendererTurbo(this, 457, 49, textureX, textureY);
		bodyModel[541].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[541].setRotationPoint(14.5f, 2.5625f, 10.5f);

		bodyModel[542] = new ModelRendererTurbo(this, 452, 49, textureX, textureY);
		bodyModel[542].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[542].setRotationPoint(9.25f, 4.125f, 10.5f);

		bodyModel[543] = new ModelRendererTurbo(this, 398, 49, textureX, textureY);
		bodyModel[543].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[543].setRotationPoint(9.25f, 3.625f, 10.5f);

		bodyModel[544] = new ModelRendererTurbo(this, 393, 49, textureX, textureY);
		bodyModel[544].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[544].setRotationPoint(9.25f, 2.5625f, 10.5f);

		bodyModel[545] = new ModelRendererTurbo(this, 388, 49, textureX, textureY);
		bodyModel[545].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[545].setRotationPoint(7.5f, 4.125f, 10.5f);

		bodyModel[546] = new ModelRendererTurbo(this, 383, 49, textureX, textureY);
		bodyModel[546].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[546].setRotationPoint(7.5f, 3.625f, 10.5f);

		bodyModel[547] = new ModelRendererTurbo(this, 373, 49, textureX, textureY);
		bodyModel[547].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[547].setRotationPoint(7.5f, 2.5625f, 10.5f);

		bodyModel[548] = new ModelRendererTurbo(this, 368, 49, textureX, textureY);
		bodyModel[548].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[548].setRotationPoint(2.25f, 4.125f, 10.5f);

		bodyModel[549] = new ModelRendererTurbo(this, 363, 49, textureX, textureY);
		bodyModel[549].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[549].setRotationPoint(2.25f, 3.625f, 10.5f);

		bodyModel[550] = new ModelRendererTurbo(this, 358, 49, textureX, textureY);
		bodyModel[550].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[550].setRotationPoint(2.25f, 2.5625f, 10.5f);

		bodyModel[551] = new ModelRendererTurbo(this, 353, 49, textureX, textureY);
		bodyModel[551].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[551].setRotationPoint(0.5f, 4.125f, 10.5f);

		bodyModel[552] = new ModelRendererTurbo(this, 348, 49, textureX, textureY);
		bodyModel[552].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[552].setRotationPoint(0.5f, 3.625f, 10.5f);

		bodyModel[553] = new ModelRendererTurbo(this, 343, 49, textureX, textureY);
		bodyModel[553].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[553].setRotationPoint(0.5f, 2.5625f, 10.5f);

		bodyModel[554] = new ModelRendererTurbo(this, 338, 49, textureX, textureY);
		bodyModel[554].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[554].setRotationPoint(-4.75f, 4.125f, 10.5f);

		bodyModel[555] = new ModelRendererTurbo(this, 329, 49, textureX, textureY);
		bodyModel[555].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[555].setRotationPoint(-4.75f, 3.625f, 10.5f);

		bodyModel[556] = new ModelRendererTurbo(this, 324, 49, textureX, textureY);
		bodyModel[556].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[556].setRotationPoint(-4.75f, 2.5625f, 10.5f);

		bodyModel[557] = new ModelRendererTurbo(this, 319, 49, textureX, textureY);
		bodyModel[557].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[557].setRotationPoint(-6.5f, 4.125f, 10.5f);

		bodyModel[558] = new ModelRendererTurbo(this, 314, 49, textureX, textureY);
		bodyModel[558].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[558].setRotationPoint(-6.5f, 3.625f, 10.5f);

		bodyModel[559] = new ModelRendererTurbo(this, 507, 48, textureX, textureY);
		bodyModel[559].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[559].setRotationPoint(-6.5f, 2.5625f, 10.5f);

		bodyModel[560] = new ModelRendererTurbo(this, 15, 48, textureX, textureY);
		bodyModel[560].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[560].setRotationPoint(-11.75f, 4.125f, 10.5f);

		bodyModel[561] = new ModelRendererTurbo(this, 10, 48, textureX, textureY);
		bodyModel[561].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[561].setRotationPoint(-11.75f, 3.625f, 10.5f);

		bodyModel[562] = new ModelRendererTurbo(this, 491, 47, textureX, textureY);
		bodyModel[562].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[562].setRotationPoint(-11.75f, 2.5625f, 10.5f);

		bodyModel[563] = new ModelRendererTurbo(this, 5, 47, textureX, textureY);
		bodyModel[563].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[563].setRotationPoint(-13.5f, 4.125f, 10.5f);

		bodyModel[564] = new ModelRendererTurbo(this, 0, 47, textureX, textureY);
		bodyModel[564].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[564].setRotationPoint(-13.5f, 3.625f, 10.5f);

		bodyModel[565] = new ModelRendererTurbo(this, 503, 46, textureX, textureY);
		bodyModel[565].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[565].setRotationPoint(-13.5f, 2.5625f, 10.5f);

		bodyModel[566] = new ModelRendererTurbo(this, 498, 46, textureX, textureY);
		bodyModel[566].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[566].setRotationPoint(-18.75f, 4.125f, 10.5f);

		bodyModel[567] = new ModelRendererTurbo(this, 486, 46, textureX, textureY);
		bodyModel[567].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[567].setRotationPoint(-18.75f, 3.625f, 10.5f);

		bodyModel[568] = new ModelRendererTurbo(this, 481, 46, textureX, textureY);
		bodyModel[568].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[568].setRotationPoint(-18.75f, 2.5625f, 10.5f);

		bodyModel[569] = new ModelRendererTurbo(this, 476, 46, textureX, textureY);
		bodyModel[569].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[569].setRotationPoint(-20.5f, 4.125f, 10.5f);

		bodyModel[570] = new ModelRendererTurbo(this, 467, 46, textureX, textureY);
		bodyModel[570].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[570].setRotationPoint(-20.5f, 3.625f, 10.5f);

		bodyModel[571] = new ModelRendererTurbo(this, 462, 46, textureX, textureY);
		bodyModel[571].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[571].setRotationPoint(-20.5f, 2.5625f, 10.5f);

		bodyModel[572] = new ModelRendererTurbo(this, 457, 46, textureX, textureY);
		bodyModel[572].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[572].setRotationPoint(-25.75f, 4.125f, 10.5f);

		bodyModel[573] = new ModelRendererTurbo(this, 452, 46, textureX, textureY);
		bodyModel[573].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[573].setRotationPoint(-25.75f, 3.625f, 10.5f);

		bodyModel[574] = new ModelRendererTurbo(this, 398, 46, textureX, textureY);
		bodyModel[574].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[574].setRotationPoint(-25.75f, 2.5625f, 10.5f);

		bodyModel[575] = new ModelRendererTurbo(this, 393, 46, textureX, textureY);
		bodyModel[575].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[575].setRotationPoint(-27.5f, 4.125f, 10.5f);

		bodyModel[576] = new ModelRendererTurbo(this, 388, 46, textureX, textureY);
		bodyModel[576].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[576].setRotationPoint(-27.5f, 3.625f, 10.5f);

		bodyModel[577] = new ModelRendererTurbo(this, 383, 46, textureX, textureY);
		bodyModel[577].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[577].setRotationPoint(-27.5f, 2.5625f, 10.5f);

		bodyModel[578] = new ModelRendererTurbo(this, 373, 46, textureX, textureY);
		bodyModel[578].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[578].setRotationPoint(-32.75f, 4.125f, 10.5f);

		bodyModel[579] = new ModelRendererTurbo(this, 368, 46, textureX, textureY);
		bodyModel[579].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[579].setRotationPoint(-32.75f, 3.625f, 10.5f);

		bodyModel[580] = new ModelRendererTurbo(this, 363, 46, textureX, textureY);
		bodyModel[580].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[580].setRotationPoint(-32.75f, 2.5625f, 10.5f);

		bodyModel[581] = new ModelRendererTurbo(this, 358, 46, textureX, textureY);
		bodyModel[581].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[581].setRotationPoint(-34.5f, 4.125f, 10.5f);

		bodyModel[582] = new ModelRendererTurbo(this, 353, 46, textureX, textureY);
		bodyModel[582].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[582].setRotationPoint(-34.5f, 3.625f, 10.5f);

		bodyModel[583] = new ModelRendererTurbo(this, 348, 46, textureX, textureY);
		bodyModel[583].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[583].setRotationPoint(-34.5f, 2.5625f, 10.5f);

		bodyModel[584] = new ModelRendererTurbo(this, 343, 46, textureX, textureY);
		bodyModel[584].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[584].setRotationPoint(-39.75f, 4.125f, 10.5f);

		bodyModel[585] = new ModelRendererTurbo(this, 338, 46, textureX, textureY);
		bodyModel[585].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[585].setRotationPoint(-39.75f, 3.625f, 10.5f);

		bodyModel[586] = new ModelRendererTurbo(this, 329, 46, textureX, textureY);
		bodyModel[586].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[586].setRotationPoint(-39.75f, 2.5625f, 10.5f);

		bodyModel[587] = new ModelRendererTurbo(this, 324, 46, textureX, textureY);
		bodyModel[587].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[587].setRotationPoint(-41.5f, 4.125f, 10.5f);

		bodyModel[588] = new ModelRendererTurbo(this, 319, 46, textureX, textureY);
		bodyModel[588].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[588].setRotationPoint(-41.5f, 3.625f, 10.5f);

		bodyModel[589] = new ModelRendererTurbo(this, 314, 46, textureX, textureY);
		bodyModel[589].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[589].setRotationPoint(-41.5f, 2.5625f, 10.5f);

		bodyModel[590] = new ModelRendererTurbo(this, 15, 45, textureX, textureY);
		bodyModel[590].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[590].setRotationPoint(-46.75f, 4.125f, 10.5f);

		bodyModel[591] = new ModelRendererTurbo(this, 403, 41, textureX, textureY);
		bodyModel[591].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[591].setRotationPoint(-46.75f, 3.625f, 10.5f);

		bodyModel[592] = new ModelRendererTurbo(this, 398, 41, textureX, textureY);
		bodyModel[592].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[592].setRotationPoint(-46.75f, 2.5625f, 10.5f);

		bodyModel[593] = new ModelRendererTurbo(this, 393, 41, textureX, textureY);
		bodyModel[593].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[593].setRotationPoint(-48.5f, 4.125f, 10.5f);

		bodyModel[594] = new ModelRendererTurbo(this, 388, 41, textureX, textureY);
		bodyModel[594].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[594].setRotationPoint(-48.5f, 3.625f, 10.5f);

		bodyModel[595] = new ModelRendererTurbo(this, 383, 41, textureX, textureY);
		bodyModel[595].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[595].setRotationPoint(-48.5f, 2.5625f, 10.5f);

		bodyModel[596] = new ModelRendererTurbo(this, 373, 41, textureX, textureY);
		bodyModel[596].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[596].setRotationPoint(-58.375f, 4.125f, 10.5f);

		bodyModel[597] = new ModelRendererTurbo(this, 368, 41, textureX, textureY);
		bodyModel[597].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[597].setRotationPoint(-58.375f, 3.625f, 10.5f);

		bodyModel[598] = new ModelRendererTurbo(this, 363, 41, textureX, textureY);
		bodyModel[598].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[598].setRotationPoint(-58.375f, 2.5625f, 10.5f);

		bodyModel[599] = new ModelRendererTurbo(this, 358, 41, textureX, textureY);
		bodyModel[599].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[599].setRotationPoint(-60.125f, 4.125f, 10.5f);

		bodyModel[600] = new ModelRendererTurbo(this, 353, 41, textureX, textureY);
		bodyModel[600].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[600].setRotationPoint(-60.125f, 3.625f, 10.5f);

		bodyModel[601] = new ModelRendererTurbo(this, 324, 41, textureX, textureY);
		bodyModel[601].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		bodyModel[601].setRotationPoint(-60.125f, 2.5625f, 10.5f);

		bodyModel[602] = new ModelRendererTurbo(this, 10, 44, textureX, textureY);
		bodyModel[602].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[602].setRotationPoint(-60.25f, 2.5f, 10.0f);

		bodyModel[603] = new ModelRendererTurbo(this, 507, 43, textureX, textureY);
		bodyModel[603].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[603].setRotationPoint(-58.5f, 2.5f, 10.0f);

		bodyModel[604] = new ModelRendererTurbo(this, 494, 43, textureX, textureY);
		bodyModel[604].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[604].setRotationPoint(-48.625f, 2.5f, 10.0f);

		bodyModel[605] = new ModelRendererTurbo(this, 5, 43, textureX, textureY);
		bodyModel[605].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[605].setRotationPoint(-46.875f, 2.5f, 10.0f);

		bodyModel[606] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
		bodyModel[606].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[606].setRotationPoint(-41.625f, 2.5f, 10.0f);

		bodyModel[607] = new ModelRendererTurbo(this, 502, 42, textureX, textureY);
		bodyModel[607].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[607].setRotationPoint(-39.875f, 2.5f, 10.0f);

		bodyModel[608] = new ModelRendererTurbo(this, 15, 41, textureX, textureY);
		bodyModel[608].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[608].setRotationPoint(-34.625f, 2.5f, 10.0f);

		bodyModel[609] = new ModelRendererTurbo(this, 348, 40, textureX, textureY);
		bodyModel[609].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[609].setRotationPoint(-32.875f, 2.5f, 10.0f);

		bodyModel[610] = new ModelRendererTurbo(this, 343, 40, textureX, textureY);
		bodyModel[610].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[610].setRotationPoint(-27.625f, 2.5f, 10.0f);

		bodyModel[611] = new ModelRendererTurbo(this, 338, 40, textureX, textureY);
		bodyModel[611].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[611].setRotationPoint(-25.875f, 2.5f, 10.0f);

		bodyModel[612] = new ModelRendererTurbo(this, 319, 40, textureX, textureY);
		bodyModel[612].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[612].setRotationPoint(-20.625f, 2.5f, 10.0f);

		bodyModel[613] = new ModelRendererTurbo(this, 314, 40, textureX, textureY);
		bodyModel[613].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[613].setRotationPoint(-18.875f, 2.5f, 10.0f);

		bodyModel[614] = new ModelRendererTurbo(this, 10, 40, textureX, textureY);
		bodyModel[614].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[614].setRotationPoint(-13.625f, 2.5f, 10.0f);

		bodyModel[615] = new ModelRendererTurbo(this, 507, 39, textureX, textureY);
		bodyModel[615].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[615].setRotationPoint(-11.875f, 2.5f, 10.0f);

		bodyModel[616] = new ModelRendererTurbo(this, 498, 39, textureX, textureY);
		bodyModel[616].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[616].setRotationPoint(-6.625f, 2.5f, 10.0f);

		bodyModel[617] = new ModelRendererTurbo(this, 493, 39, textureX, textureY);
		bodyModel[617].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[617].setRotationPoint(-4.875f, 2.5f, 10.0f);

		bodyModel[618] = new ModelRendererTurbo(this, 488, 39, textureX, textureY);
		bodyModel[618].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[618].setRotationPoint(0.375f, 2.5f, 10.0f);

		bodyModel[619] = new ModelRendererTurbo(this, 483, 39, textureX, textureY);
		bodyModel[619].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[619].setRotationPoint(2.125f, 2.5f, 10.0f);

		bodyModel[620] = new ModelRendererTurbo(this, 478, 39, textureX, textureY);
		bodyModel[620].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[620].setRotationPoint(7.375f, 2.5f, 10.0f);

		bodyModel[621] = new ModelRendererTurbo(this, 473, 39, textureX, textureY);
		bodyModel[621].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[621].setRotationPoint(9.125f, 2.5f, 10.0f);

		bodyModel[622] = new ModelRendererTurbo(this, 463, 39, textureX, textureY);
		bodyModel[622].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[622].setRotationPoint(14.375f, 2.5f, 10.0f);

		bodyModel[623] = new ModelRendererTurbo(this, 458, 39, textureX, textureY);
		bodyModel[623].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[623].setRotationPoint(16.125f, 2.5f, 10.0f);

		bodyModel[624] = new ModelRendererTurbo(this, 453, 39, textureX, textureY);
		bodyModel[624].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[624].setRotationPoint(21.375f, 2.5f, 10.0f);

		bodyModel[625] = new ModelRendererTurbo(this, 448, 39, textureX, textureY);
		bodyModel[625].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[625].setRotationPoint(23.125f, 2.5f, 10.0f);

		bodyModel[626] = new ModelRendererTurbo(this, 443, 39, textureX, textureY);
		bodyModel[626].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[626].setRotationPoint(28.375f, 2.5f, 10.0f);

		bodyModel[627] = new ModelRendererTurbo(this, 329, 39, textureX, textureY);
		bodyModel[627].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[627].setRotationPoint(30.125f, 2.5f, 10.0f);

		bodyModel[628] = new ModelRendererTurbo(this, 5, 39, textureX, textureY);
		bodyModel[628].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[628].setRotationPoint(35.375f, 2.5f, 10.0f);

		bodyModel[629] = new ModelRendererTurbo(this, 0, 39, textureX, textureY);
		bodyModel[629].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[629].setRotationPoint(37.125f, 2.5f, 10.0f);

		bodyModel[630] = new ModelRendererTurbo(this, 438, 38, textureX, textureY);
		bodyModel[630].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[630].setRotationPoint(42.375f, 2.5f, 10.0f);

		bodyModel[631] = new ModelRendererTurbo(this, 433, 38, textureX, textureY);
		bodyModel[631].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[631].setRotationPoint(44.125f, 2.5f, 10.0f);

		bodyModel[632] = new ModelRendererTurbo(this, 428, 38, textureX, textureY);
		bodyModel[632].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[632].setRotationPoint(49.375f, 2.5f, 10.0f);

		bodyModel[633] = new ModelRendererTurbo(this, 418, 38, textureX, textureY);
		bodyModel[633].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[633].setRotationPoint(51.125f, 2.5f, 10.0f);

		bodyModel[634] = new ModelRendererTurbo(this, 413, 38, textureX, textureY);
		bodyModel[634].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[634].setRotationPoint(61.0f, 2.5f, 10.0f);

		bodyModel[635] = new ModelRendererTurbo(this, 408, 38, textureX, textureY);
		bodyModel[635].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, -2, 0);
		bodyModel[635].setRotationPoint(62.75f, 2.5f, 10.0f);

		bodyModel[636] = new ModelRendererTurbo(this, 403, 38, textureX, textureY);
		bodyModel[636].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[636].setRotationPoint(52.375f, 1.5f, 9.625f);

		bodyModel[637] = new ModelRendererTurbo(this, 398, 38, textureX, textureY);
		bodyModel[637].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[637].setRotationPoint(58.5f, 1.5f, 9.625f);

		bodyModel[638] = new ModelRendererTurbo(this, 393, 38, textureX, textureY);
		bodyModel[638].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[638].setRotationPoint(60.0f, 1.5f, 9.625f);

		bodyModel[639] = new ModelRendererTurbo(this, 388, 38, textureX, textureY);
		bodyModel[639].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[639].setRotationPoint(53.875f, 1.5f, 9.625f);

		bodyModel[640] = new ModelRendererTurbo(this, 383, 38, textureX, textureY);
		bodyModel[640].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[640].setRotationPoint(57.0f, 1.5f, 9.625f);

		bodyModel[641] = new ModelRendererTurbo(this, 373, 38, textureX, textureY);
		bodyModel[641].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[641].setRotationPoint(55.375f, 1.5f, 9.625f);

		bodyModel[642] = new ModelRendererTurbo(this, 368, 38, textureX, textureY);
		bodyModel[642].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[642].setRotationPoint(-57.25f, 1.5f, 9.625f);

		bodyModel[643] = new ModelRendererTurbo(this, 363, 38, textureX, textureY);
		bodyModel[643].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[643].setRotationPoint(-51.125f, 1.5f, 9.625f);

		bodyModel[644] = new ModelRendererTurbo(this, 358, 38, textureX, textureY);
		bodyModel[644].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[644].setRotationPoint(-49.625f, 1.5f, 9.625f);

		bodyModel[645] = new ModelRendererTurbo(this, 353, 38, textureX, textureY);
		bodyModel[645].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[645].setRotationPoint(-55.75f, 1.5f, 9.625f);

		bodyModel[646] = new ModelRendererTurbo(this, 324, 38, textureX, textureY);
		bodyModel[646].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[646].setRotationPoint(-52.625f, 1.5f, 9.625f);

		bodyModel[647] = new ModelRendererTurbo(this, 15, 38, textureX, textureY);
		bodyModel[647].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[647].setRotationPoint(-54.25f, 1.5f, 9.625f);

		bodyModel[648] = new ModelRendererTurbo(this, 503, 37, textureX, textureY);
		bodyModel[648].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[648].setRotationPoint(-45.625f, 1.5f, 9.625f);

		bodyModel[649] = new ModelRendererTurbo(this, 348, 37, textureX, textureY);
		bodyModel[649].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[649].setRotationPoint(-44.625f, 1.5f, 9.625f);

		bodyModel[650] = new ModelRendererTurbo(this, 343, 37, textureX, textureY);
		bodyModel[650].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[650].setRotationPoint(-43.625f, 1.5f, 9.625f);

		bodyModel[651] = new ModelRendererTurbo(this, 338, 37, textureX, textureY);
		bodyModel[651].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[651].setRotationPoint(-42.625f, 1.5f, 9.625f);

		bodyModel[652] = new ModelRendererTurbo(this, 319, 37, textureX, textureY);
		bodyModel[652].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[652].setRotationPoint(-38.625f, 1.5f, 9.625f);

		bodyModel[653] = new ModelRendererTurbo(this, 314, 37, textureX, textureY);
		bodyModel[653].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[653].setRotationPoint(-37.625f, 1.5f, 9.625f);

		bodyModel[654] = new ModelRendererTurbo(this, 10, 37, textureX, textureY);
		bodyModel[654].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[654].setRotationPoint(-36.625f, 1.5f, 9.625f);

		bodyModel[655] = new ModelRendererTurbo(this, 498, 36, textureX, textureY);
		bodyModel[655].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[655].setRotationPoint(-35.625f, 1.5f, 9.625f);

		bodyModel[656] = new ModelRendererTurbo(this, 493, 36, textureX, textureY);
		bodyModel[656].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[656].setRotationPoint(-31.625f, 1.5f, 9.625f);

		bodyModel[657] = new ModelRendererTurbo(this, 488, 36, textureX, textureY);
		bodyModel[657].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[657].setRotationPoint(-30.625f, 1.5f, 9.625f);

		bodyModel[658] = new ModelRendererTurbo(this, 483, 36, textureX, textureY);
		bodyModel[658].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[658].setRotationPoint(-29.625f, 1.5f, 9.625f);

		bodyModel[659] = new ModelRendererTurbo(this, 478, 36, textureX, textureY);
		bodyModel[659].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[659].setRotationPoint(-28.625f, 1.5f, 9.625f);

		bodyModel[660] = new ModelRendererTurbo(this, 473, 36, textureX, textureY);
		bodyModel[660].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[660].setRotationPoint(-24.625f, 1.5f, 9.625f);

		bodyModel[661] = new ModelRendererTurbo(this, 463, 36, textureX, textureY);
		bodyModel[661].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[661].setRotationPoint(-23.625f, 1.5f, 9.625f);

		bodyModel[662] = new ModelRendererTurbo(this, 458, 36, textureX, textureY);
		bodyModel[662].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[662].setRotationPoint(-22.625f, 1.5f, 9.625f);

		bodyModel[663] = new ModelRendererTurbo(this, 453, 36, textureX, textureY);
		bodyModel[663].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[663].setRotationPoint(-21.625f, 1.5f, 9.625f);

		bodyModel[664] = new ModelRendererTurbo(this, 448, 36, textureX, textureY);
		bodyModel[664].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[664].setRotationPoint(-17.625f, 1.5f, 9.625f);

		bodyModel[665] = new ModelRendererTurbo(this, 443, 36, textureX, textureY);
		bodyModel[665].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[665].setRotationPoint(-16.625f, 1.5f, 9.625f);

		bodyModel[666] = new ModelRendererTurbo(this, 328, 36, textureX, textureY);
		bodyModel[666].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[666].setRotationPoint(-15.625f, 1.5f, 9.625f);

		bodyModel[667] = new ModelRendererTurbo(this, 5, 36, textureX, textureY);
		bodyModel[667].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[667].setRotationPoint(-14.625f, 1.5f, 9.625f);

		bodyModel[668] = new ModelRendererTurbo(this, 0, 36, textureX, textureY);
		bodyModel[668].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[668].setRotationPoint(-10.625f, 1.5f, 9.625f);

		bodyModel[669] = new ModelRendererTurbo(this, 438, 35, textureX, textureY);
		bodyModel[669].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[669].setRotationPoint(-9.625f, 1.5f, 9.625f);

		bodyModel[670] = new ModelRendererTurbo(this, 433, 35, textureX, textureY);
		bodyModel[670].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[670].setRotationPoint(-8.625f, 1.5f, 9.625f);

		bodyModel[671] = new ModelRendererTurbo(this, 428, 35, textureX, textureY);
		bodyModel[671].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[671].setRotationPoint(-7.625f, 1.5f, 9.625f);

		bodyModel[672] = new ModelRendererTurbo(this, 418, 35, textureX, textureY);
		bodyModel[672].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[672].setRotationPoint(-3.625f, 1.5f, 9.625f);

		bodyModel[673] = new ModelRendererTurbo(this, 413, 35, textureX, textureY);
		bodyModel[673].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[673].setRotationPoint(-2.625f, 1.5f, 9.625f);

		bodyModel[674] = new ModelRendererTurbo(this, 408, 35, textureX, textureY);
		bodyModel[674].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[674].setRotationPoint(-1.625f, 1.5f, 9.625f);

		bodyModel[675] = new ModelRendererTurbo(this, 403, 35, textureX, textureY);
		bodyModel[675].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[675].setRotationPoint(-0.625f, 1.5f, 9.625f);

		bodyModel[676] = new ModelRendererTurbo(this, 398, 35, textureX, textureY);
		bodyModel[676].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[676].setRotationPoint(3.375f, 1.5f, 9.625f);

		bodyModel[677] = new ModelRendererTurbo(this, 393, 35, textureX, textureY);
		bodyModel[677].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[677].setRotationPoint(4.375f, 1.5f, 9.625f);

		bodyModel[678] = new ModelRendererTurbo(this, 388, 35, textureX, textureY);
		bodyModel[678].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[678].setRotationPoint(5.375f, 1.5f, 9.625f);

		bodyModel[679] = new ModelRendererTurbo(this, 383, 35, textureX, textureY);
		bodyModel[679].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[679].setRotationPoint(6.375f, 1.5f, 9.625f);

		bodyModel[680] = new ModelRendererTurbo(this, 373, 35, textureX, textureY);
		bodyModel[680].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[680].setRotationPoint(10.375f, 1.5f, 9.625f);

		bodyModel[681] = new ModelRendererTurbo(this, 368, 35, textureX, textureY);
		bodyModel[681].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[681].setRotationPoint(11.375f, 1.5f, 9.625f);

		bodyModel[682] = new ModelRendererTurbo(this, 363, 35, textureX, textureY);
		bodyModel[682].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[682].setRotationPoint(12.375f, 1.5f, 9.625f);

		bodyModel[683] = new ModelRendererTurbo(this, 358, 35, textureX, textureY);
		bodyModel[683].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[683].setRotationPoint(13.375f, 1.5f, 9.625f);

		bodyModel[684] = new ModelRendererTurbo(this, 353, 35, textureX, textureY);
		bodyModel[684].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[684].setRotationPoint(17.375f, 1.5f, 9.625f);

		bodyModel[685] = new ModelRendererTurbo(this, 14, 35, textureX, textureY);
		bodyModel[685].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[685].setRotationPoint(18.375f, 1.5f, 9.625f);

		bodyModel[686] = new ModelRendererTurbo(this, 504, 34, textureX, textureY);
		bodyModel[686].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[686].setRotationPoint(19.375f, 1.5f, 9.625f);

		bodyModel[687] = new ModelRendererTurbo(this, 348, 34, textureX, textureY);
		bodyModel[687].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[687].setRotationPoint(20.375f, 1.5f, 9.625f);

		bodyModel[688] = new ModelRendererTurbo(this, 343, 34, textureX, textureY);
		bodyModel[688].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[688].setRotationPoint(24.375f, 1.5f, 9.625f);

		bodyModel[689] = new ModelRendererTurbo(this, 338, 34, textureX, textureY);
		bodyModel[689].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[689].setRotationPoint(25.375f, 1.5f, 9.625f);

		bodyModel[690] = new ModelRendererTurbo(this, 324, 34, textureX, textureY);
		bodyModel[690].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[690].setRotationPoint(26.375f, 1.5f, 9.625f);

		bodyModel[691] = new ModelRendererTurbo(this, 319, 34, textureX, textureY);
		bodyModel[691].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[691].setRotationPoint(27.375f, 1.5f, 9.625f);

		bodyModel[692] = new ModelRendererTurbo(this, 314, 34, textureX, textureY);
		bodyModel[692].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[692].setRotationPoint(31.375f, 1.5f, 9.625f);

		bodyModel[693] = new ModelRendererTurbo(this, 478, 33, textureX, textureY);
		bodyModel[693].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[693].setRotationPoint(32.375f, 1.5f, 9.625f);

		bodyModel[694] = new ModelRendererTurbo(this, 473, 33, textureX, textureY);
		bodyModel[694].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[694].setRotationPoint(33.375f, 1.5f, 9.625f);

		bodyModel[695] = new ModelRendererTurbo(this, 463, 33, textureX, textureY);
		bodyModel[695].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[695].setRotationPoint(34.375f, 1.5f, 9.625f);

		bodyModel[696] = new ModelRendererTurbo(this, 458, 33, textureX, textureY);
		bodyModel[696].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[696].setRotationPoint(38.375f, 1.5f, 9.625f);

		bodyModel[697] = new ModelRendererTurbo(this, 453, 33, textureX, textureY);
		bodyModel[697].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[697].setRotationPoint(39.375f, 1.5f, 9.625f);

		bodyModel[698] = new ModelRendererTurbo(this, 448, 33, textureX, textureY);
		bodyModel[698].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[698].setRotationPoint(40.375f, 1.5f, 9.625f);

		bodyModel[699] = new ModelRendererTurbo(this, 443, 33, textureX, textureY);
		bodyModel[699].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[699].setRotationPoint(41.375f, 1.5f, 9.625f);

		bodyModel[700] = new ModelRendererTurbo(this, 330, 33, textureX, textureY);
		bodyModel[700].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[700].setRotationPoint(45.375f, 1.5f, 9.625f);

		bodyModel[701] = new ModelRendererTurbo(this, 10, 33, textureX, textureY);
		bodyModel[701].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[701].setRotationPoint(46.375f, 1.5f, 9.625f);

		bodyModel[702] = new ModelRendererTurbo(this, 5, 33, textureX, textureY);
		bodyModel[702].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[702].setRotationPoint(47.375f, 1.5f, 9.625f);

		bodyModel[703] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[703].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[703].setRotationPoint(48.375f, 1.5f, 9.625f);

		bodyModel[704] = new ModelRendererTurbo(this, 438, 32, textureX, textureY);
		bodyModel[704].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[704].setRotationPoint(64.0f, 1.5f, 9.625f);

		bodyModel[705] = new ModelRendererTurbo(this, 433, 32, textureX, textureY);
		bodyModel[705].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[705].setRotationPoint(65.0f, 1.5f, 9.625f);

		bodyModel[706] = new ModelRendererTurbo(this, 428, 32, textureX, textureY);
		bodyModel[706].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[706].setRotationPoint(66.0f, 1.5f, 9.625f);

		bodyModel[707] = new ModelRendererTurbo(this, 418, 32, textureX, textureY);
		bodyModel[707].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[707].setRotationPoint(67.0f, 1.5f, 9.625f);

		bodyModel[708] = new ModelRendererTurbo(this, 413, 32, textureX, textureY);
		bodyModel[708].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[708].setRotationPoint(68.0f, 1.5f, 9.625f);

		bodyModel[709] = new ModelRendererTurbo(this, 408, 32, textureX, textureY);
		bodyModel[709].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[709].setRotationPoint(69.0f, 1.5f, 9.625f);

		bodyModel[710] = new ModelRendererTurbo(this, 403, 32, textureX, textureY);
		bodyModel[710].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[710].setRotationPoint(70.0f, 1.5f, 9.625f);

		bodyModel[711] = new ModelRendererTurbo(this, 398, 32, textureX, textureY);
		bodyModel[711].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[711].setRotationPoint(71.0f, 1.5f, 9.625f);

		bodyModel[712] = new ModelRendererTurbo(this, 393, 32, textureX, textureY);
		bodyModel[712].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[712].setRotationPoint(72.0f, 1.5f, 9.625f);

		bodyModel[713] = new ModelRendererTurbo(this, 388, 32, textureX, textureY);
		bodyModel[713].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[713].setRotationPoint(73.0f, 1.5f, 9.625f);

		bodyModel[714] = new ModelRendererTurbo(this, 383, 32, textureX, textureY);
		bodyModel[714].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[714].setRotationPoint(-70.25f, 1.5f, 9.625f);

		bodyModel[715] = new ModelRendererTurbo(this, 373, 32, textureX, textureY);
		bodyModel[715].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[715].setRotationPoint(-69.25f, 1.5f, 9.625f);

		bodyModel[716] = new ModelRendererTurbo(this, 16, 32, textureX, textureY);
		bodyModel[716].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[716].setRotationPoint(-68.25f, 1.5f, 9.625f);

		bodyModel[717] = new ModelRendererTurbo(this, 504, 31, textureX, textureY);
		bodyModel[717].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[717].setRotationPoint(-67.25f, 1.5f, 9.625f);

		bodyModel[718] = new ModelRendererTurbo(this, 373, 29, textureX, textureY);
		bodyModel[718].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[718].setRotationPoint(-66.25f, 1.5f, 9.625f);

		bodyModel[719] = new ModelRendererTurbo(this, 504, 28, textureX, textureY);
		bodyModel[719].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[719].setRotationPoint(-65.25f, 1.5f, 9.625f);

		bodyModel[720] = new ModelRendererTurbo(this, 419, 26, textureX, textureY);
		bodyModel[720].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[720].setRotationPoint(-64.25f, 1.5f, 9.625f);

		bodyModel[721] = new ModelRendererTurbo(this, 504, 25, textureX, textureY);
		bodyModel[721].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[721].setRotationPoint(-63.25f, 1.5f, 9.625f);

		bodyModel[722] = new ModelRendererTurbo(this, 465, 25, textureX, textureY);
		bodyModel[722].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[722].setRotationPoint(-62.25f, 1.5f, 9.625f);

		bodyModel[723] = new ModelRendererTurbo(this, 480, 23, textureX, textureY);
		bodyModel[723].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[723].setRotationPoint(-61.25f, 1.5f, 9.625f);

		bodyModel[724] = new ModelRendererTurbo(this, 10, 2, textureX, textureY);
		bodyModel[724].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[724].setRotationPoint(65.4375f, -2.125f, 10.5f);

		bodyModel[725] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[725].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[725].setRotationPoint(65.4375f, 0.125f, 10.5f);

		bodyModel[726] = new ModelRendererTurbo(this, 446, 23, textureX, textureY);
		bodyModel[726].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f);
		bodyModel[726].setRotationPoint(65.4375f, -1.875f, 10.5f);

		bodyModel[727] = new ModelRendererTurbo(this, 435, 23, textureX, textureY);
		bodyModel[727].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f);
		bodyModel[727].setRotationPoint(68.6875f, -1.875f, 10.5f);

		bodyModel[728] = new ModelRendererTurbo(this, 419, 23, textureX, textureY);
		bodyModel[728].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.875f, 0, 0.5f, -0.875f);
		bodyModel[728].setRotationPoint(67.1875f, -1.875f, 10.5f);

		bodyModel[729] = new ModelRendererTurbo(this, 364, 29, textureX, textureY);
		bodyModel[729].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[729].setRotationPoint(65.6875f, -0.375f, 10.5f);

		bodyModel[730] = new ModelRendererTurbo(this, 401, 23, textureX, textureY);
		bodyModel[730].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[730].setRotationPoint(70.5f, -7.5f, 10.5f);

		bodyModel[731] = new ModelRendererTurbo(this, 390, 23, textureX, textureY);
		bodyModel[731].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[731].setRotationPoint(73.75f, -7.5f, 10.5f);

		bodyModel[732] = new ModelRendererTurbo(this, 373, 23, textureX, textureY);
		bodyModel[732].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[732].setRotationPoint(70.5f, -5.75f, 10.5f);

		bodyModel[733] = new ModelRendererTurbo(this, 362, 23, textureX, textureY);
		bodyModel[733].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[733].setRotationPoint(73.75f, -5.75f, 10.5f);

		bodyModel[734] = new ModelRendererTurbo(this, 504, 22, textureX, textureY);
		bodyModel[734].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[734].setRotationPoint(70.5f, -2.5f, 10.5f);

		bodyModel[735] = new ModelRendererTurbo(this, 505, 19, textureX, textureY);
		bodyModel[735].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[735].setRotationPoint(73.75f, -2.5f, 10.5f);

		bodyModel[736] = new ModelRendererTurbo(this, 464, 18, textureX, textureY);
		bodyModel[736].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[736].setRotationPoint(70.5f, 0.75f, 10.5f);

		bodyModel[737] = new ModelRendererTurbo(this, 374, 18, textureX, textureY);
		bodyModel[737].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[737].setRotationPoint(73.75f, 0.75f, 10.5f);

		bodyModel[738] = new ModelRendererTurbo(this, 314, 17, textureX, textureY);
		bodyModel[738].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[738].setRotationPoint(70.5f, -5.875f, 10.625f);

		bodyModel[739] = new ModelRendererTurbo(this, 491, 16, textureX, textureY);
		bodyModel[739].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[739].setRotationPoint(73.25f, -5.875f, 10.625f);

		bodyModel[740] = new ModelRendererTurbo(this, 465, 15, textureX, textureY);
		bodyModel[740].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[740].setRotationPoint(70.5f, -2.625f, 10.625f);

		bodyModel[741] = new ModelRendererTurbo(this, 375, 15, textureX, textureY);
		bodyModel[741].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[741].setRotationPoint(73.25f, -2.625f, 10.625f);

		bodyModel[742] = new ModelRendererTurbo(this, 328, 13, textureX, textureY);
		bodyModel[742].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[742].setRotationPoint(70.5f, 0.625f, 10.625f);

		bodyModel[743] = new ModelRendererTurbo(this, 465, 12, textureX, textureY);
		bodyModel[743].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[743].setRotationPoint(73.25f, 0.625f, 10.625f);

		bodyModel[744] = new ModelRendererTurbo(this, 420, 12, textureX, textureY);
		bodyModel[744].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f);
		bodyModel[744].setRotationPoint(70.5f, -7.625f, 10.625f);

		bodyModel[745] = new ModelRendererTurbo(this, 375, 12, textureX, textureY);
		bodyModel[745].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f);
		bodyModel[745].setRotationPoint(73.25f, -7.625f, 10.625f);

		bodyModel[746] = new ModelRendererTurbo(this, 355, 29, textureX, textureY);
		bodyModel[746].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[746].setRotationPoint(70.875f, -8.0f, 10.625f);

		bodyModel[747] = new ModelRendererTurbo(this, 457, 23, textureX, textureY);
		bodyModel[747].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[747].setRotationPoint(70.875f, -5.5f, 10.625f);

		bodyModel[748] = new ModelRendererTurbo(this, 414, 18, textureX, textureY);
		bodyModel[748].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[748].setRotationPoint(70.875f, -2.25f, 10.625f);

		bodyModel[749] = new ModelRendererTurbo(this, 405, 17, textureX, textureY);
		bodyModel[749].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[749].setRotationPoint(70.875f, 1.0f, 10.625f);

		bodyModel[750] = new ModelRendererTurbo(this, 507, 11, textureX, textureY);
		bodyModel[750].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[750].setRotationPoint(-70.25f, -7.5f, 10.5f);

		bodyModel[751] = new ModelRendererTurbo(this, 330, 10, textureX, textureY);
		bodyModel[751].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[751].setRotationPoint(-67.0f, -7.5f, 10.5f);

		bodyModel[752] = new ModelRendererTurbo(this, 465, 9, textureX, textureY);
		bodyModel[752].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[752].setRotationPoint(-70.25f, -5.75f, 10.5f);

		bodyModel[753] = new ModelRendererTurbo(this, 417, 9, textureX, textureY);
		bodyModel[753].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[753].setRotationPoint(-67.0f, -5.75f, 10.5f);

		bodyModel[754] = new ModelRendererTurbo(this, 375, 9, textureX, textureY);
		bodyModel[754].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[754].setRotationPoint(-70.25f, -2.5f, 10.5f);

		bodyModel[755] = new ModelRendererTurbo(this, 507, 8, textureX, textureY);
		bodyModel[755].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[755].setRotationPoint(-67.0f, -2.5f, 10.5f);

		bodyModel[756] = new ModelRendererTurbo(this, 465, 6, textureX, textureY);
		bodyModel[756].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[756].setRotationPoint(-70.25f, 0.75f, 10.5f);

		bodyModel[757] = new ModelRendererTurbo(this, 417, 6, textureX, textureY);
		bodyModel[757].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[757].setRotationPoint(-67.0f, 0.75f, 10.5f);

		bodyModel[758] = new ModelRendererTurbo(this, 375, 6, textureX, textureY);
		bodyModel[758].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.875f, -0.125f, -0.625f, -0.875f, -0.125f, -0.625f, -0.875f, -0.625f, -0.125f, -0.875f, -0.625f);
		bodyModel[758].setRotationPoint(-70.25f, -7.625f, 10.625f);

		bodyModel[759] = new ModelRendererTurbo(this, 507, 5, textureX, textureY);
		bodyModel[759].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f);
		bodyModel[759].setRotationPoint(-67.5f, -7.625f, 10.625f);

		bodyModel[760] = new ModelRendererTurbo(this, 465, 3, textureX, textureY);
		bodyModel[760].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[760].setRotationPoint(-70.25f, -5.875f, 10.625f);

		bodyModel[761] = new ModelRendererTurbo(this, 420, 3, textureX, textureY);
		bodyModel[761].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[761].setRotationPoint(-67.5f, -5.875f, 10.625f);

		bodyModel[762] = new ModelRendererTurbo(this, 375, 3, textureX, textureY);
		bodyModel[762].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[762].setRotationPoint(-70.25f, -2.625f, 10.625f);

		bodyModel[763] = new ModelRendererTurbo(this, 465, 0, textureX, textureY);
		bodyModel[763].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[763].setRotationPoint(-67.5f, -2.625f, 10.625f);

		bodyModel[764] = new ModelRendererTurbo(this, 420, 0, textureX, textureY);
		bodyModel[764].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, -0.125f, -0.625f, 0.25f, -0.125f, -0.625f, 0.25f, -0.625f, -0.125f, 0, -0.625f);
		bodyModel[764].setRotationPoint(-70.25f, 0.625f, 10.625f);

		bodyModel[765] = new ModelRendererTurbo(this, 375, 0, textureX, textureY);
		bodyModel[765].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.625f, -0.625f, 0.25f, -0.625f);
		bodyModel[765].setRotationPoint(-67.5f, 0.625f, 10.625f);

		bodyModel[766] = new ModelRendererTurbo(this, 501, 16, textureX, textureY);
		bodyModel[766].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f);
		bodyModel[766].setRotationPoint(-69.875f, -8.0f, 10.625f);

		bodyModel[767] = new ModelRendererTurbo(this, 482, 16, textureX, textureY);
		bodyModel[767].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[767].setRotationPoint(-69.875f, -5.5f, 10.625f);

		bodyModel[768] = new ModelRendererTurbo(this, 473, 16, textureX, textureY);
		bodyModel[768].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[768].setRotationPoint(-69.875f, -2.25f, 10.625f);

		bodyModel[769] = new ModelRendererTurbo(this, 11, 5, textureX, textureY);
		bodyModel[769].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f);
		bodyModel[769].setRotationPoint(-69.875f, 1.0f, 10.625f);

		bodyModel[770] = new ModelRendererTurbo(this, 383, 0, textureX, textureY);
		bodyModel[770].addShapeBox(0, 0, 0, 18, 4, 0, 0, 0, 0, 0, -9, 0, 0, -9, 0, 0, 0, 0, 0, 0, -2, 0, -9, -2, 0, -9, -2, 0, 0, -2, 0);
		bodyModel[770].setRotationPoint(51.8125f, -7.125f, 10.51f);

		bodyModel[771] = new ModelRendererTurbo(this, 338, 0, textureX, textureY);
		bodyModel[771].addShapeBox(0, 0, 0, 18, 18, 0, 0, 0, 0, 0, -9, 0, 0, -9, 0, 0, 0, 0, 0, 0, -9, 0, -9, -9, 0, -9, -9, 0, 0, -9, 0);
		bodyModel[771].setRotationPoint(-57.8125f, -7.125f, 10.51f);

		bodyModel[772] = new ModelRendererTurbo(this, 473, 5, textureX, textureY);
		bodyModel[772].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[772].setRotationPoint(-18.0f, -6.125f, 10.51f);

		bodyModel[773] = new ModelRendererTurbo(this, 400, 5, textureX, textureY);
		bodyModel[773].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[773].setRotationPoint(-25.0f, -6.125f, 10.51f);

		bodyModel[774] = new ModelRendererTurbo(this, 383, 5, textureX, textureY);
		bodyModel[774].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[774].setRotationPoint(-32.0f, -6.125f, 10.51f);

		bodyModel[775] = new ModelRendererTurbo(this, 314, 0, textureX, textureY);
		bodyModel[775].addShapeBox(0, 0, 0, 8, 10, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, -5, 0, -4, -5, 0, -4, -5, 0, 0, -5, 0);
		bodyModel[775].setRotationPoint(-39.0f, -6.125f, 10.51f);

		bodyModel[776] = new ModelRendererTurbo(this, 0, 138, textureX, textureY);
		bodyModel[776].addShapeBox(0, 0, 0, 146, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f);
		bodyModel[776].setRotationPoint(-70.75f, -9.75f, 10.0f);

		bodyModel[777] = new ModelRendererTurbo(this, 0, 88, textureX, textureY);
		bodyModel[777].addShapeBox(0, 0, 0, 146, 0, 21, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[777].setRotationPoint(-70.75f, 0.5f, -10.5f);
	}
	public float[] getTrans() {
		return new float[]{0.09375F, 0.1875F, 0.0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 0F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	private ModelFreightTruckM fronttrucks = new ModelFreightTruckM();
	private ModelFreightTruckM backtrucks = new ModelFreightTruckM();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 779; i++) {
			if (i == 777) {
				int cargo = ((Freight) entity).getAmmountOfCargo();
				if (cargo != 0) {
					GL11.glPushMatrix();
					GL11.glTranslatef(0, 0 + ((Freight) entity).getAmmountOfCargo() * -0.013f, 0);
					// 0.57f is the "starting height", the *-0.whatever is the multiplier
					//System.out.println(-0.51f + ((Freight) entity).getAmmountOfCargo() * 0.016f);
					bodyModel[777].render(f5);
					GL11.glPopMatrix();
				}
			} else
				bodyModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/freighttruckm.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-3.65625, 0, -0.1875);
		fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(2.4375, 0, -0.1875);
		backtrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}
