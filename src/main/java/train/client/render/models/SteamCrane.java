//FMT-Marker DFM-1.0
//Creator: broscolotos

//Using PER-GROUP-INIT mode with limit '500'!
package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SteamCrane extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public SteamCrane(){
		bodyModel = new ModelRendererTurbo[449];
		//
		initGroup_bodyModel();
		flipAll();
	}

	private final void initGroup_bodyModel(){
		bodyModel[0] = new ModelRendererTurbo(this, 291, 49, textureX, textureY); // Box 0
		bodyModel[0].addBox(0, 0, 0, 14, 11, 1, 0f);
		bodyModel[0].setRotationPoint(-7.0f, -11.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 143, 45, textureX, textureY); // Box 7
		bodyModel[1].addShapeBox(0, 0, 0, 17, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(14.0f, -12.01f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 350, 42, textureX, textureY); // Box 8
		bodyModel[2].addShapeBox(0, 0, 0, 1, 12, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(33.0f, -12.01f, -8.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 380, 31, textureX, textureY); // Box 9
		bodyModel[3].addShapeBox(0, 0, 0, 17, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[3].setRotationPoint(14.0f, -12.01f, 10.01f);

		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[4].addShapeBox(0, 0, 0, 92, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(-56.0f, 0.0f, -12.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 360, 0, textureX, textureY); // Box 11
		bodyModel[5].addShapeBox(0, 0, 0, 34, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(-56.0f, 0.0f, 5.01f);

		bodyModel[6] = new ModelRendererTurbo(this, 202, 0, textureX, textureY); // Box 12
		bodyModel[6].addShapeBox(0, 0, 0, 46, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[6].setRotationPoint(-10.0f, 0.0f, 5.01f);

		bodyModel[7] = new ModelRendererTurbo(this, 65, 76, textureX, textureY); // Box 15
		bodyModel[7].addShapeBox(0, 0, 0, 1, 12, 2, 0, 0.7f, 0, -0.6f, -0.8f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0.7f, 0, -0.5f, -0.85f, 0, 0.2f, 0, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(33.01f, -12.01f, -10.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 90, 76, textureX, textureY); // Box 19
		bodyModel[8].addShapeBox(0, 0, 0, 2, 12, 1, 0, 0, 0, 0, 0.2f, 0, -0.8f, -0.7f, 0, 0.6f, 0, 0, 0, 0, 0, 0, 0.1f, 0, -0.8f, -0.6f, 0, 0.6f, 0, 0, 0);
		bodyModel[8].setRotationPoint(31.0f, -12.01f, -11.01f);

		bodyModel[9] = new ModelRendererTurbo(this, 47, 76, textureX, textureY); // Box 20
		bodyModel[9].addShapeBox(0, 0, 0, 2, 12, 1, 0, 0, 0, 0, -0.7f, 0, 0.6f, 0.2f, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0.6f, 0.15f, 0, -0.8f, 0, 0, 0);
		bodyModel[9].setRotationPoint(31.0f, -12.01f, 9.99f);

		bodyModel[10] = new ModelRendererTurbo(this, 9, 76, textureX, textureY); // Box 21
		bodyModel[10].addShapeBox(0, 0, 0, 1, 12, 2, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0.2f, 0.7f, 0, -0.6f, 0, 0, 0, 0, 0, 0, -0.85f, 0, 0.15f, 0.7f, 0, -0.5f);
		bodyModel[10].setRotationPoint(32.99f, -12.01f, 8.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 453, 75, textureX, textureY); // Box 22
		bodyModel[11].addShapeBox(0, 0, 0, 2, 12, 1, 0, -0.7f, 0, 0.6f, 0, 0, 0, 0, 0, 0.05f, 0.15f, 0, -0.8f, -0.7f, 0, 0.6f, 0, 0, 0, 0, 0, 0.05f, 0.2f, 0, -0.8f);
		bodyModel[11].setRotationPoint(12.0f, -12.01f, 9.99f);

		bodyModel[12] = new ModelRendererTurbo(this, 377, 75, textureX, textureY); // Box 23
		bodyModel[12].addShapeBox(0, 0, 0, 1, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0.7f, 0, -0.6f, -0.85f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0.7f, 0, -0.5f, -0.85f, 0, 0.15f);
		bodyModel[12].setRotationPoint(10.99f, -12.01f, 8.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 303, 75, textureX, textureY); // Box 24
		bodyModel[13].addShapeBox(0, 0, 0, 1, 12, 2, 0, -0.85f, 0, 0.2f, 0.7f, 0, -0.6f, 0, 0, 0, 0, 0, 0, -0.85f, 0, 0.15f, 0.7f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[13].setRotationPoint(10.99f, -12.01f, -10.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 401, 75, textureX, textureY); // Box 25
		bodyModel[14].addShapeBox(0, 0, 0, 2, 12, 1, 0, 0.15f, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0.6f, 0.2f, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0.6f);
		bodyModel[14].setRotationPoint(12.0f, -12.01f, -11.01f);

		bodyModel[15] = new ModelRendererTurbo(this, 101, 47, textureX, textureY); // Box 27
		bodyModel[15].addBox(0, 0, 0, 14, 11, 1, 0f);
		bodyModel[15].setRotationPoint(-7.0f, -11.0f, 10.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 31, 83, textureX, textureY); // Box 29
		bodyModel[16].addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f);
		bodyModel[16].setRotationPoint(7.0f, -24.0f, 10.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 483, 82, textureX, textureY); // Box 30
		bodyModel[17].addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(7.0f, -24.0f, -11.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 421, 0, textureX, textureY); // Box 32
		bodyModel[18].addShapeBox(0, 0, 0, 16, 1, 22, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f);
		bodyModel[18].setRotationPoint(-8.0f, -25.0f, -10.99f);

		bodyModel[19] = new ModelRendererTurbo(this, 358, 9, textureX, textureY); // Box 33
		bodyModel[19].addShapeBox(0, 0, 0, 16, 1, 20, 0, 0, 0.55f, -3.9f, 0, 0.55f, -3.9f, 0, 0.55f, -3.9f, 0, 0.55f, -3.9f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f);
		bodyModel[19].setRotationPoint(-8.0f, -26.0f, -9.99f);

		bodyModel[20] = new ModelRendererTurbo(this, 469, 82, textureX, textureY); // Box 26
		bodyModel[20].addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(-8.0f, -24.0f, -11.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 364, 82, textureX, textureY); // Box 28
		bodyModel[21].addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f);
		bodyModel[21].setRotationPoint(-8.0f, -24.0f, 10.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 236, 29, textureX, textureY); // Box 29
		bodyModel[22].addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-7.0f, -12.0f, -11.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 236, 26, textureX, textureY); // Box 30
		bodyModel[23].addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f);
		bodyModel[23].setRotationPoint(-7.0f, -12.0f, 10.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 172, 23, textureX, textureY); // Box 32
		bodyModel[24].addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0.4f, -0.8f, 0, 0.4f, -0.8f, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0.4f, 0, 0.2f, 0.4f, 0, 0.6f, -1.25f, 0, 0.6f, -1.25f);
		bodyModel[24].setRotationPoint(-11.0f, -24.85f, -11.6f);

		bodyModel[25] = new ModelRendererTurbo(this, 53, 22, textureX, textureY); // Box 34
		bodyModel[25].addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, -0.8f, -3.3f, 0, -0.8f, -3.3f, 0, -1.05f, 2.8f, 0, -1.05f, 2.8f, 0, 1.2f, 1.2f, 0, 1.2f, 1.2f, 0, 1.4f, -1.8f, 0, 1.4f, -1.8f);
		bodyModel[25].setRotationPoint(-11.0f, -27.45f, -9.6f);

		bodyModel[26] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 35
		bodyModel[26].addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.4f, -0.8f, 0, 0.4f, -0.8f, 0, 0.6f, -1.25f, 0, 0.6f, -1.25f, 0, 0.2f, 0.4f, 0, 0.2f, 0.4f);
		bodyModel[26].setRotationPoint(-11.0f, -24.85f, 10.4f);

		bodyModel[27] = new ModelRendererTurbo(this, 316, 20, textureX, textureY); // Box 36
		bodyModel[27].addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, -1.1f, 2.85f, 0, -1.1f, 2.85f, 0, -0.8f, -3.3f, 0, -0.8f, -3.3f, 0, 1.4f, -1.8f, 0, 1.4f, -1.8f, 0, 1.2f, 1.2f, 0, 1.2f, 1.2f);
		bodyModel[27].setRotationPoint(-11.0f, -27.45f, 8.4f);

		bodyModel[28] = new ModelRendererTurbo(this, 207, 9, textureX, textureY); // Box 37
		bodyModel[28].addShapeBox(0, 0, 0, 25, 1, 12, 0, 0, -0.95f, 0.3f, 0, -0.95f, 0.3f, 0, -0.95f, 0.1f, 0, -0.95f, 0.1f, 0, 0.2f, -0.2f, 0, 0.2f, -0.2f, 0, 0.25f, -0.4f, 0, 0.25f, -0.4f);
		bodyModel[28].setRotationPoint(-11.0f, -27.6f, -5.99f);

		bodyModel[29] = new ModelRendererTurbo(this, 436, 58, textureX, textureY); // Box 34
		bodyModel[29].addShapeBox(0, 0, 0, 5, 27, 3, 0, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f);
		bodyModel[29].setRotationPoint(-16.0f, -21.0f, -1.5f);

		bodyModel[30] = new ModelRendererTurbo(this, 419, 58, textureX, textureY); // Box 36
		bodyModel[30].addShapeBox(0, 0, 0, 5, 27, 3, 0, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f);
		bodyModel[30].setRotationPoint(-21.0f, -21.0f, -1.5f);

		bodyModel[31] = new ModelRendererTurbo(this, 317, 58, textureX, textureY); // Box 36
		bodyModel[31].addShapeBox(0, 0, 0, 3, 27, 5, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[31].setRotationPoint(-17.5f, -21.0f, 0.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 211, 58, textureX, textureY); // Box 37
		bodyModel[32].addShapeBox(0, 0, 0, 3, 27, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0);
		bodyModel[32].setRotationPoint(-17.5f, -21.0f, -5.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 194, 57, textureX, textureY); // Box 41
		bodyModel[33].addShapeBox(0, 0, 0, 5, 27, 3, 0, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0);
		bodyModel[33].setRotationPoint(-21.0f, -21.0f, 0.5f);

		bodyModel[34] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 44
		bodyModel[34].addShapeBox(0, 0, 0, 5, 27, 3, 0, -1.25f, 0, 0, -1.25f, 0, 1.5f, 0, 0, 0.5f, 0, 0, -0.75f, -1.25f, 0, 0, -1.25f, 0, 1.5f, 0, 0, 0.5f, 0, 0, -0.75f);
		bodyModel[34].setRotationPoint(-21.0f, -21.0f, -3.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 45
		bodyModel[35].addShapeBox(0, 0, 0, 5, 27, 3, 0, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f);
		bodyModel[35].setRotationPoint(-16.0f, -21.0f, -3.5f);

		bodyModel[36] = new ModelRendererTurbo(this, 237, 55, textureX, textureY); // Box 46
		bodyModel[36].addShapeBox(0, 0, 0, 5, 27, 3, 0, 0, 0, 0.5f, 0, 0, -0.75f, -1.25f, 0, 0, -1.25f, 0, 1.5f, 0, 0, 0.5f, 0, 0, -0.75f, -1.25f, 0, 0, -1.25f, 0, 1.5f);
		bodyModel[36].setRotationPoint(-16.0f, -21.0f, 0.5f);

		bodyModel[37] = new ModelRendererTurbo(this, 316, 34, textureX, textureY); // Box 48
		bodyModel[37].addShapeBox(0, 0, 0, 5, 0, 3, 0, 0, 0, -0.25f, 0, 5, -1.5f, 0, 5, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f);
		bodyModel[37].setRotationPoint(-21.0f, -21.0f, -1.5f);

		bodyModel[38] = new ModelRendererTurbo(this, 147, 33, textureX, textureY); // Box 49
		bodyModel[38].addShapeBox(0, 0, 0, 5, 0, 3, 0, 0, 0, -0.75f, 0, 5, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0);
		bodyModel[38].setRotationPoint(-21.0f, -21.0f, 0.5f);

		bodyModel[39] = new ModelRendererTurbo(this, 94, 32, textureX, textureY); // Box 50
		bodyModel[39].addShapeBox(0, 0, 0, 5, 0, 3, 0, 0, 5, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 5, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f);
		bodyModel[39].setRotationPoint(-16.0f, -21.0f, -1.5f);

		bodyModel[40] = new ModelRendererTurbo(this, 294, 27, textureX, textureY); // Box 51
		bodyModel[40].addShapeBox(0, 0, 0, 3, 0, 5, 0, -1.5f, 5, 0, -1.5f, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[40].setRotationPoint(-17.5f, -21.0f, 0.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 264, 29, textureX, textureY); // Box 52
		bodyModel[41].addShapeBox(0, 0, 0, 5, 0, 3, 0, 0, 0, -0.75f, 0, 5, 0.5f, -1.25f, 0, 1.5f, -1.5f, 0, 0.2f, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.5f, 0, 0.2f);
		bodyModel[41].setRotationPoint(-15.5f, -21.0f, 5.0f);
		bodyModel[41].rotateAngleY = 1.5707964f;

		bodyModel[42] = new ModelRendererTurbo(this, 287, 26, textureX, textureY); // Box 53
		bodyModel[42].addShapeBox(0, 0, 0, 3, 0, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 5, 0, -1.5f, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0);
		bodyModel[42].setRotationPoint(-17.5f, -21.0f, -5.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 411, 24, textureX, textureY); // Box 54
		bodyModel[43].addShapeBox(0, 0, 0, 5, 0, 3, 0, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 5, 0.5f, -1.25f, 0, 1.5f, -1.25f, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f);
		bodyModel[43].setRotationPoint(-16.0f, -21.0f, -3.5f);

		bodyModel[44] = new ModelRendererTurbo(this, 354, 82, textureX, textureY); // Box 55
		bodyModel[44].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.15f, 0, 0.15f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.35f, 0, -0.35f, 0, 0, 0);
		bodyModel[44].setRotationPoint(-16.0f, -35.0f, 0.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 274, 82, textureX, textureY); // Box 56
		bodyModel[45].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.15f, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.35f, 0, -0.35f);
		bodyModel[45].setRotationPoint(-17.0f, -35.0f, 0.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 504, 81, textureX, textureY); // Box 57
		bodyModel[46].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0.15f, 0, 0.15f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, -0.35f, 0, -0.35f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[46].setRotationPoint(-17.0f, -35.0f, -1.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 499, 81, textureX, textureY); // Box 58
		bodyModel[47].addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0.5f, 0.15f, 0, 0.15f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.35f, 0, -0.35f, 0, 0, 0, 0, 0, 0);
		bodyModel[47].setRotationPoint(-16.0f, -35.0f, -1.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 202, 12, textureX, textureY); // Box 52
		bodyModel[48].addShapeBox(0, 0, 0, 5, 0, 3, 0, 0, 0, -0.75f, 0, 5, 0.5f, -1.25f, 0, 1.5f, -1.5f, 0, 0.3f, 0, 0, -0.75f, 0, 0, 0.5f, -1.25f, 0, 1.5f, -1.5f, 0, 0.3f);
		bodyModel[48].setRotationPoint(-16.5f, -21.0f, -5.0f);
		bodyModel[48].rotateAngleY = -1.5707964f;

		bodyModel[49] = new ModelRendererTurbo(this, 153, 74, textureX, textureY); // Box 52
		bodyModel[49].addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(-12.45f, -8.0f, 6.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 144, 74, textureX, textureY); // Box 53
		bodyModel[50].addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[50].setRotationPoint(-20.55f, -8.0f, 6.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 108, 66, textureX, textureY); // Box 54
		bodyModel[51].addShapeBox(0, 0, 0, 2, 5, 3, 0, -0.35f, -0.25f, -0.35f, 0.5f, -0.25f, -0.35f, 0.5f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, 0.5f, -0.25f, -0.35f, 0.5f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f);
		bodyModel[51].setRotationPoint(-20.1f, -8.0f, 6.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 463, 63, textureX, textureY); // Box 55
		bodyModel[52].addShapeBox(0, 0, 0, 3, 5, 3, 0, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f, -0.35f, -0.25f, -0.35f);
		bodyModel[52].setRotationPoint(-14.75f, -8.0f, 6.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 343, 23, textureX, textureY); // Box 56
		bodyModel[53].addShapeBox(0, 0, 0, 17, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[53].setRotationPoint(14.0f, -15.01f, 10.6f);

		bodyModel[54] = new ModelRendererTurbo(this, 172, 19, textureX, textureY); // Box 57
		bodyModel[54].addShapeBox(0, 0, 0, 17, 3, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[54].setRotationPoint(14.0f, -15.01f, -10.6f);

		bodyModel[55] = new ModelRendererTurbo(this, 386, 45, textureX, textureY); // Box 58
		bodyModel[55].addShapeBox(0, 0, 0, 0, 3, 16, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(33.6f, -15.01f, -8.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 359, 75, textureX, textureY); // Box 59
		bodyModel[56].addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0.75f, -0.3f, 0, -0.15f, -0.3f, 0, 0.15f, 0, 0, -0.75f, 0, 0, 0, -1.1f, 0, -0.65f, -1.1f, 0, 0.65f, 0, 0, 0);
		bodyModel[56].setRotationPoint(31.0f, -15.01f, -10.6f);

		bodyModel[57] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 60
		bodyModel[57].addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, -0.75f, -0.65f, 0, -0.05f, -0.65f, 0, 0.05f, 0, 0, 0.75f, 0, 0, 0, -1.1f, 0, 0.65f, -1.1f, 0, -0.65f, 0, 0, 0);
		bodyModel[57].setRotationPoint(31.0f, -15.01f, 10.6f);

		bodyModel[58] = new ModelRendererTurbo(this, 108, 75, textureX, textureY); // Box 61
		bodyModel[58].addShapeBox(0, 0, 0, 3, 3, 0, 0, 0.5f, 0, 0, -1.1f, 0, -0.7f, -1.1f, 0, 0.7f, 0.5f, 0, 0, 0, 0, 0.75f, -1.1f, 0, 0.05f, -1.1f, 0, -0.05f, 0, 0, -0.75f);
		bodyModel[58].setRotationPoint(12.1f, -15.01f, 10.65f);

		bodyModel[59] = new ModelRendererTurbo(this, 483, 74, textureX, textureY); // Box 62
		bodyModel[59].addShapeBox(0, 0, 0, 3, 3, 0, 0, 0.7f, 0, 0, -1.1f, 0, 0.7f, -1.1f, 0, -0.7f, 0.7f, 0, 0, -0.1f, 0, -0.75f, -1.1f, 0, -0.05f, -1.1f, 0, 0.05f, -0.1f, 0, 0.8f);
		bodyModel[59].setRotationPoint(12.1f, -15.01f, -10.65f);

		bodyModel[60] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 64
		bodyModel[60].addShapeBox(0, 0, 0, 0, 3, 2, 0, 1.25f, 0, 0.55f, -1.25f, 0, 0.55f, -0.5f, 0, 0, 0.5f, 0, 0, 0.75f, 0, 0.65f, -0.75f, 0, 0.65f, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[60].setRotationPoint(12.1f, -15.01f, 8.65f);

		bodyModel[61] = new ModelRendererTurbo(this, 140, 81, textureX, textureY); // Box 65
		bodyModel[61].addShapeBox(0, 0, 0, 0, 3, 2, 0, -0.3f, 0, -0.35f, 0.3f, 0, -0.35f, -0.7f, 0, 1, 0.7f, 0, 1, 0.45f, 0, -0.35f, -0.45f, 0, -0.35f, -1.15f, 0, 0.3f, 1.15f, 0, 0.3f);
		bodyModel[61].setRotationPoint(34.05f, -15.01f, 7.65f);

		bodyModel[62] = new ModelRendererTurbo(this, 205, 23, textureX, textureY); // Box 66
		bodyModel[62].addBox(0, 0, 0, 5, 11, 20, 0f);
		bodyModel[62].setRotationPoint(28.0f, -11.0f, -10.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 58, 74, textureX, textureY); // Box 67
		bodyModel[63].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0);
		bodyModel[63].setRotationPoint(30.5f, -12.01f, 0.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 343, 73, textureX, textureY); // Box 68
		bodyModel[64].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0);
		bodyModel[64].setRotationPoint(30.5f, -12.01f, -2.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 334, 73, textureX, textureY); // Box 69
		bodyModel[65].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f);
		bodyModel[65].setRotationPoint(28.5f, -12.01f, 0.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 296, 73, textureX, textureY); // Box 70
		bodyModel[66].addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(28.5f, -12.01f, -2.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 110, 81, textureX, textureY); // Box 71
		bodyModel[67].addShapeBox(0, 0, 0, 0, 3, 2, 0, -1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.9f, 0, 0.4f, -1.9f, 0, 0.4f, -0.45f, 0, -0.4f, 0.45f, 0, -0.4f, 1.15f, 0, 0.35f, -1.15f, 0, 0.35f);
		bodyModel[67].setRotationPoint(32.45f, -15.01f, -10.35f);

		bodyModel[68] = new ModelRendererTurbo(this, 372, 80, textureX, textureY); // Box 73
		bodyModel[68].addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, 0, 1.4f, 0, 0, 1.4f, -0.9f, 0, -0.8f, 0.9f, 0, -0.8f, -0.8f, 0, 0.6f, 0.8f, 0, 0.6f, 0, 0, -0.75f, 0, 0, -0.7f);
		bodyModel[68].setRotationPoint(11.4f, -15.01f, -9.25f);

		bodyModel[69] = new ModelRendererTurbo(this, 290, 81, textureX, textureY); // Box 74
		bodyModel[69].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[69].setRotationPoint(7.0f, -11.0f, 11.35f);

		bodyModel[70] = new ModelRendererTurbo(this, 228, 81, textureX, textureY); // Box 75
		bodyModel[70].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[70].setRotationPoint(7.0f, -10.64f, 11.35f);

		bodyModel[71] = new ModelRendererTurbo(this, 494, 80, textureX, textureY); // Box 76
		bodyModel[71].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[71].setRotationPoint(7.0f, -1.25f, 11.35f);

		bodyModel[72] = new ModelRendererTurbo(this, 135, 55, textureX, textureY); // Box 77
		bodyModel[72].addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[72].setRotationPoint(7.0f, -11.0f, 10.35f);

		bodyModel[73] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 78
		bodyModel[73].addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[73].setRotationPoint(7.0f, -1.25f, 10.35f);

		bodyModel[74] = new ModelRendererTurbo(this, 465, 80, textureX, textureY); // Box 79
		bodyModel[74].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[74].setRotationPoint(7.0f, -11.0f, -12.35f);

		bodyModel[75] = new ModelRendererTurbo(this, 460, 80, textureX, textureY); // Box 80
		bodyModel[75].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[75].setRotationPoint(7.0f, -1.25f, -12.35f);

		bodyModel[76] = new ModelRendererTurbo(this, 135, 80, textureX, textureY); // Box 81
		bodyModel[76].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[76].setRotationPoint(7.0f, -10.64f, -12.35f);

		bodyModel[77] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 82
		bodyModel[77].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[77].setRotationPoint(7.0f, -11.0f, -11.99f);

		bodyModel[78] = new ModelRendererTurbo(this, 36, 80, textureX, textureY); // Box 83
		bodyModel[78].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[78].setRotationPoint(7.0f, -1.25f, -11.99f);

		bodyModel[79] = new ModelRendererTurbo(this, 369, 79, textureX, textureY); // Box 84
		bodyModel[79].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.05f, -0.25f, -0.25f, -0.25f, -0.45f, -0.25f, -0.35f, -0.1f, -0.25f, -0.5f, -0.25f, -0.25f, -0.05f, -0.25f, -0.25f, -0.25f, -0.45f, -0.25f, -0.3f, -0.1f, -0.25f, -0.5f);
		bodyModel[79].setRotationPoint(12.0f, -11.0f, 10.35f);

		bodyModel[80] = new ModelRendererTurbo(this, 364, 79, textureX, textureY); // Box 85
		bodyModel[80].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.05f, -0.25f, -0.25f, -0.25f, -0.45f, -0.25f, -0.35f, -0.1f, -0.25f, -0.5f, -0.25f, -0.25f, -0.05f, -0.25f, -0.25f, -0.25f, -0.45f, -0.25f, -0.3f, -0.1f, -0.25f, -0.5f);
		bodyModel[80].setRotationPoint(12.0f, -1.25f, 10.35f);

		bodyModel[81] = new ModelRendererTurbo(this, 359, 79, textureX, textureY); // Box 86
		bodyModel[81].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.4f, -0.25f, -0.2f, -0.4f, -0.25f, -0.25f, -0.5f, -0.25f, -0.5f, -0.3f, -0.25f, -0.6f, -0.4f, -0.25f, -0.2f, -0.4f, -0.25f, -0.25f, -0.5f, -0.25f, -0.5f, -0.3f, -0.25f, -0.6f);
		bodyModel[81].setRotationPoint(12.0f, -10.65f, 10.35f);

		bodyModel[82] = new ModelRendererTurbo(this, 354, 79, textureX, textureY); // Box 87
		bodyModel[82].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.25f, -0.5f, -0.45f, -0.25f, -0.35f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.05f, -0.1f, -0.25f, -0.5f, -0.45f, -0.25f, -0.3f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.05f);
		bodyModel[82].setRotationPoint(12.0f, -11.0f, -11.3f);

		bodyModel[83] = new ModelRendererTurbo(this, 349, 79, textureX, textureY); // Box 88
		bodyModel[83].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.3f, -0.25f, -0.6f, -0.5f, -0.25f, -0.5f, -0.4f, -0.25f, -0.25f, -0.4f, -0.25f, -0.2f, -0.3f, -0.25f, -0.6f, -0.5f, -0.25f, -0.5f, -0.4f, -0.25f, -0.25f, -0.4f, -0.25f, -0.2f);
		bodyModel[83].setRotationPoint(12.0f, -10.65f, -11.3f);

		bodyModel[84] = new ModelRendererTurbo(this, 150, 74, textureX, textureY); // Box 89
		bodyModel[84].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.25f, -0.5f, -0.45f, -0.25f, -0.35f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.05f, -0.1f, -0.25f, -0.5f, -0.45f, -0.25f, -0.3f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.05f);
		bodyModel[84].setRotationPoint(12.0f, -1.25f, -11.3f);

		bodyModel[85] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 90
		bodyModel[85].addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[85].setRotationPoint(34.5f, -12.0f, -7.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 107, 79, textureX, textureY); // Box 91
		bodyModel[86].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[86].setRotationPoint(34.5f, -2.0f, -6.5f);

		bodyModel[87] = new ModelRendererTurbo(this, 102, 79, textureX, textureY); // Box 92
		bodyModel[87].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(34.5f, -2.0f, -4.5f);

		bodyModel[88] = new ModelRendererTurbo(this, 358, 42, textureX, textureY); // Box 93
		bodyModel[88].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(34.5f, -3.0f, -5.5f);

		bodyModel[89] = new ModelRendererTurbo(this, 483, 41, textureX, textureY); // Box 94
		bodyModel[89].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f);
		bodyModel[89].setRotationPoint(34.5f, -3.0f, -6.5f);

		bodyModel[90] = new ModelRendererTurbo(this, 287, 73, textureX, textureY); // Box 95
		bodyModel[90].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[90].setRotationPoint(34.5f, -3.0f, -6.5f);

		bodyModel[91] = new ModelRendererTurbo(this, 68, 73, textureX, textureY); // Box 96
		bodyModel[91].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[91].setRotationPoint(34.5f, -12.5f, 4.5f);

		bodyModel[92] = new ModelRendererTurbo(this, 501, 63, textureX, textureY); // Box 97
		bodyModel[92].addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[92].setRotationPoint(34.5f, -12.0f, 3.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 137, 69, textureX, textureY); // Box 98
		bodyModel[93].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[93].setRotationPoint(34.5f, -12.5f, -5.5f);

		bodyModel[94] = new ModelRendererTurbo(this, 272, 73, textureX, textureY); // Box 99
		bodyModel[94].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[94].setRotationPoint(34.5f, -3.0f, 3.5f);

		bodyModel[95] = new ModelRendererTurbo(this, 54, 40, textureX, textureY); // Box 100
		bodyModel[95].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0);
		bodyModel[95].setRotationPoint(34.5f, -3.0f, 4.5f);

		bodyModel[96] = new ModelRendererTurbo(this, 146, 39, textureX, textureY); // Box 102
		bodyModel[96].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f);
		bodyModel[96].setRotationPoint(34.5f, -3.0f, 3.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 97, 79, textureX, textureY); // Box 103
		bodyModel[97].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[97].setRotationPoint(34.5f, -2.0f, 3.5f);

		bodyModel[98] = new ModelRendererTurbo(this, 483, 78, textureX, textureY); // Box 104
		bodyModel[98].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[98].setRotationPoint(34.5f, -2.0f, 5.5f);

		bodyModel[99] = new ModelRendererTurbo(this, 287, 20, textureX, textureY); // Box 105
		bodyModel[99].addShapeBox(0, 0, 0, 2, 2, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[99].setRotationPoint(35.0f, 0.99f, -12.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 457, 24, textureX, textureY); // Box 106
		bodyModel[100].addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[100].setRotationPoint(36.0f, 0.0f, -11.5f);

		bodyModel[101] = new ModelRendererTurbo(this, 286, 78, textureX, textureY); // Box 107
		bodyModel[101].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[101].setRotationPoint(-57.0f, 0.25f, 10.85f);

		bodyModel[102] = new ModelRendererTurbo(this, 274, 78, textureX, textureY); // Box 108
		bodyModel[102].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[102].setRotationPoint(36.0f, 0.25f, -11.85f);

		bodyModel[103] = new ModelRendererTurbo(this, 269, 78, textureX, textureY); // Box 109
		bodyModel[103].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[103].setRotationPoint(36.75f, 1.5f, -9.85f);

		bodyModel[104] = new ModelRendererTurbo(this, 130, 78, textureX, textureY); // Box 110
		bodyModel[104].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[104].setRotationPoint(36.75f, 1.5f, 9.15f);

		bodyModel[105] = new ModelRendererTurbo(this, 143, 19, textureX, textureY); // Box 111
		bodyModel[105].addShapeBox(0, 0, 0, 2, 1, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[105].setRotationPoint(37.0f, 6.99f, -12.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 112
		bodyModel[106].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[106].setRotationPoint(37.0f, 0.5f, -1.25f);

		bodyModel[107] = new ModelRendererTurbo(this, 407, 65, textureX, textureY); // Box 113
		bodyModel[107].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[107].setRotationPoint(37.0f, 5.5f, -1.25f);

		bodyModel[108] = new ModelRendererTurbo(this, 228, 74, textureX, textureY); // Box 114
		bodyModel[108].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[108].setRotationPoint(37.0f, 1.5f, -2.5f);

		bodyModel[109] = new ModelRendererTurbo(this, 32, 56, textureX, textureY); // Box 115
		bodyModel[109].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f);
		bodyModel[109].setRotationPoint(37.0f, 1.5f, 0.5f);

		bodyModel[110] = new ModelRendererTurbo(this, 396, 65, textureX, textureY); // Box 116
		bodyModel[110].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(37.0f, 2.25f, -1.5f);

		bodyModel[111] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 117
		bodyModel[111].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[111].setRotationPoint(37.0f, 4.25f, -1.5f);

		bodyModel[112] = new ModelRendererTurbo(this, 90, 65, textureX, textureY); // Box 134
		bodyModel[112].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[112].setRotationPoint(37.0f, 6.0f, -0.5f);

		bodyModel[113] = new ModelRendererTurbo(this, 90, 19, textureX, textureY); // Box 135
		bodyModel[113].addShapeBox(0, 0, 0, 2, 3, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[113].setRotationPoint(-57.0f, 0.99f, -12.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 260, 54, textureX, textureY); // Box 136
		bodyModel[114].addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[114].setRotationPoint(-25.55f, -2.01f, 2.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 411, 9, textureX, textureY); // Box 137
		bodyModel[115].addShapeBox(0, 0, 0, 4, 1, 11, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f);
		bodyModel[115].setRotationPoint(-26.55f, -2.01f, 1.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 275, 42, textureX, textureY); // Box 138
		bodyModel[116].addBox(0, 0, 0, 2, 2, 5, 0f);
		bodyModel[116].setRotationPoint(-12.0f, -3.0f, -2.5f);

		bodyModel[117] = new ModelRendererTurbo(this, 434, 33, textureX, textureY); // Box 139
		bodyModel[117].addShapeBox(0, 0, 0, 3, 2, 5, 0, -1.5f, -0.8f, 0, 0, -0.45f, 0, 0, -0.45f, 0, -1.5f, -0.8f, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0);
		bodyModel[117].setRotationPoint(-21.5f, -1.53f, -7.8f);
		bodyModel[117].rotateAngleY = -0.4537856f;

		bodyModel[118] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 141
		bodyModel[118].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[118].setRotationPoint(-57.75f, 1.5f, 9.15f);

		bodyModel[119] = new ModelRendererTurbo(this, 258, 9, textureX, textureY); // Box 142
		bodyModel[119].addShapeBox(0, 0, 0, 2, 1, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[119].setRotationPoint(-59.0f, 6.99f, -12.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 87, 57, textureX, textureY); // Box 143
		bodyModel[120].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[120].setRotationPoint(-61.0f, 6.0f, -0.5f);

		bodyModel[121] = new ModelRendererTurbo(this, 59, 78, textureX, textureY); // Box 144
		bodyModel[121].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[121].setRotationPoint(-57.75f, 1.5f, -9.85f);

		bodyModel[122] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 145
		bodyModel[122].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[122].setRotationPoint(-59.0f, 0.5f, -1.25f);

		bodyModel[123] = new ModelRendererTurbo(this, 22, 65, textureX, textureY); // Box 146
		bodyModel[123].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(-59.0f, 2.25f, -1.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 480, 56, textureX, textureY); // Box 147
		bodyModel[124].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[124].setRotationPoint(-59.0f, 4.25f, -1.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 299, 39, textureX, textureY); // Box 148
		bodyModel[125].addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0);
		bodyModel[125].setRotationPoint(-59.0f, 5.5f, -1.25f);

		bodyModel[126] = new ModelRendererTurbo(this, 15, 51, textureX, textureY); // Box 149
		bodyModel[126].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[126].setRotationPoint(-59.0f, 1.5f, 0.75f);

		bodyModel[127] = new ModelRendererTurbo(this, 405, 49, textureX, textureY); // Box 150
		bodyModel[127].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[127].setRotationPoint(-59.0f, 1.5f, -2.5f);

		bodyModel[128] = new ModelRendererTurbo(this, 506, 77, textureX, textureY); // Box 151
		bodyModel[128].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[128].setRotationPoint(-57.0f, 0.25f, -11.85f);

		bodyModel[129] = new ModelRendererTurbo(this, 317, 24, textureX, textureY); // Box 153
		bodyModel[129].addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
		bodyModel[129].setRotationPoint(-57.0f, 0.0f, -11.5f);

		bodyModel[130] = new ModelRendererTurbo(this, 501, 77, textureX, textureY); // Box 146
		bodyModel[130].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[130].setRotationPoint(36.0f, 0.25f, 10.85f);

		bodyModel[131] = new ModelRendererTurbo(this, 343, 31, textureX, textureY); // Box 149
		bodyModel[131].addShapeBox(0, 0, 0, 9, 1, 9, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2.5f, -0.75f, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, -2.5f);
		bodyModel[131].setRotationPoint(-54.0f, -1.01f, 0.5f);

		bodyModel[132] = new ModelRendererTurbo(this, 119, 28, textureX, textureY); // Box 150
		bodyModel[132].addShapeBox(0, 0, 0, 9, 1, 9, 0, -2.5f, -0.75f, -2.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2.5f, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[132].setRotationPoint(-54.0f, -1.01f, -9.51f);

		bodyModel[133] = new ModelRendererTurbo(this, 66, 28, textureX, textureY); // Box 151
		bodyModel[133].addShapeBox(0, 0, 0, 9, 1, 9, 0, 0, -0.75f, 0, -2.5f, -0.75f, -2.4f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -2.5f, 0, -2.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[133].setRotationPoint(-44.0f, -1.01f, -9.51f);

		bodyModel[134] = new ModelRendererTurbo(this, 172, 26, textureX, textureY); // Box 152
		bodyModel[134].addShapeBox(0, 0, 0, 9, 1, 9, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2.5f, -0.75f, -2.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, -2.5f, 0, 0, 0);
		bodyModel[134].setRotationPoint(-44.0f, -1.01f, 0.49f);

		bodyModel[135] = new ModelRendererTurbo(this, 298, 62, textureX, textureY); // Box 153
		bodyModel[135].addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0);
		bodyModel[135].setRotationPoint(-44.5f, -3.01f, -0.01f);

		bodyModel[136] = new ModelRendererTurbo(this, 285, 62, textureX, textureY); // Box 154
		bodyModel[136].addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[136].setRotationPoint(-44.5f, -3.01f, -3.01f);

		bodyModel[137] = new ModelRendererTurbo(this, 131, 62, textureX, textureY); // Box 155
		bodyModel[137].addShapeBox(0, 0, 0, 3, 3, 3, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[137].setRotationPoint(-47.5f, -3.01f, -3.01f);

		bodyModel[138] = new ModelRendererTurbo(this, 118, 62, textureX, textureY); // Box 156
		bodyModel[138].addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1);
		bodyModel[138].setRotationPoint(-47.5f, -3.01f, -0.01f);

		bodyModel[139] = new ModelRendererTurbo(this, 15, 51, textureX, textureY); // Box 157
		bodyModel[139].addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, -2.75f, 0.5f, 0, -2.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f);
		bodyModel[139].setRotationPoint(-45.0f, -3.01f, 1.99f);

		bodyModel[140] = new ModelRendererTurbo(this, 491, 49, textureX, textureY); // Box 158
		bodyModel[140].addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, -2.75f, 0.5f, 0, -2.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[140].setRotationPoint(-45.0f, -3.01f, -9.01f);

		bodyModel[141] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 159
		bodyModel[141].addShapeBox(0, 0, 0, 7, 3, 1, 0, 0.5f, -2.75f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -2.75f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0);
		bodyModel[141].setRotationPoint(-53.5f, -3.01f, -0.5f);

		bodyModel[142] = new ModelRendererTurbo(this, 495, 9, textureX, textureY); // Box 160
		bodyModel[142].addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, 0.5f, -2.75f, 0, 0.5f, -2.75f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(-42.5f, -3.01f, -0.5f);

		bodyModel[143] = new ModelRendererTurbo(this, 90, 60, textureX, textureY); // Box 161
		bodyModel[143].addShapeBox(0, 0, 0, 6, 3, 1, 0, -1.85f, -2.75f, -3.95f, 0, 0, 0, 0.75f, 0, -0.35f, -2.5f, -2.75f, 3.75f, -1.8f, 0, -4, 0, 0, 0, 0.75f, 0, -0.35f, -2.5f, 0, 3.75f);
		bodyModel[143].setRotationPoint(-52.5f, -3.01f, 1.45f);

		bodyModel[144] = new ModelRendererTurbo(this, 162, 59, textureX, textureY); // Box 162
		bodyModel[144].addShapeBox(0, 0, 0, 6, 3, 1, 0, -2.5f, -2.75f, 3.75f, 0.75f, 0, -0.35f, 0, 0, 0, -1.85f, -2.75f, -3.95f, -2.5f, 0, 3.75f, 0.75f, 0, -0.35f, 0, 0, 0, -1.8f, 0, -4);
		bodyModel[144].setRotationPoint(-52.5f, -3.01f, -2.55f);

		bodyModel[145] = new ModelRendererTurbo(this, 343, 42, textureX, textureY); // Box 163
		bodyModel[145].addShapeBox(0, 0, 0, 6, 3, 1, 0, 0.75f, 0, -0.35f, -2.5f, -2.75f, 3.75f, -1.85f, -2.75f, -3.95f, 0, 0, 0, 0.75f, 0, -0.35f, -2.5f, 0, 3.75f, -1.8f, 0, -4, 0, 0, 0);
		bodyModel[145].setRotationPoint(-42.5f, -3.01f, -2.55f);

		bodyModel[146] = new ModelRendererTurbo(this, 66, 39, textureX, textureY); // Box 164
		bodyModel[146].addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, -1.85f, -2.75f, -3.95f, -2.5f, -2.75f, 3.75f, 0.75f, 0, -0.35f, 0, 0, 0, -1.8f, 0, -4, -2.5f, 0, 3.75f, 0.75f, 0, -0.35f);
		bodyModel[146].setRotationPoint(-42.5f, -3.01f, 1.45f);

		bodyModel[147] = new ModelRendererTurbo(this, 344, 49, textureX, textureY); // Box 165
		bodyModel[147].addShapeBox(0, 0, 0, 3, 5, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[147].setRotationPoint(-21.0f, -8.0f, 9.04f);

		bodyModel[148] = new ModelRendererTurbo(this, 322, 49, textureX, textureY); // Box 166
		bodyModel[148].addShapeBox(0, 0, 0, 3, 5, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[148].setRotationPoint(-14.0f, -8.0f, 9.04f);

		bodyModel[149] = new ModelRendererTurbo(this, 509, 81, textureX, textureY); // Box 167
		bodyModel[149].addShapeBox(0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[149].setRotationPoint(-13.9f, -3.3f, 7.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 234, 80, textureX, textureY); // Box 168
		bodyModel[150].addShapeBox(0, 0, 0, 0, 6, 1, 0, 0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0.1f, 0, 0);
		bodyModel[150].setRotationPoint(-18.0f, -3.3f, 7.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 263, 73, textureX, textureY); // Box 155
		bodyModel[151].addShapeBox(0, 0, 0, 2, 1, 2, 0, 1.5f, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 1.5f, 0, -0.25f, 0.3f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.3f, 0, -0.25f);
		bodyModel[151].setRotationPoint(-54.0f, -1.01f, -11.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 254, 73, textureX, textureY); // Box 156
		bodyModel[152].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.5f, 0, -0.7f, 0.5f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0.5f, -0.3f, 0);
		bodyModel[152].setRotationPoint(-55.0f, -3.01f, -11.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 300, 16, textureX, textureY); // Box 157
		bodyModel[153].addShapeBox(0, 0, 0, 3, 0, 1, 0, 0.5f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, 0.5f, 0, -0.15f, 0.5f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, 0.5f, 0, -0.15f);
		bodyModel[153].setRotationPoint(-56.0f, -3.03f, -10.5f);

		bodyModel[154] = new ModelRendererTurbo(this, 411, 18, textureX, textureY); // Box 158
		bodyModel[154].addShapeBox(0, 0, 0, 3, 1, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0.7f, 0.5f, 0, 0.7f, 0.1f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1f, -0.25f, 0);
		bodyModel[154].setRotationPoint(-56.0f, -3.02f, -11.04f);

		bodyModel[155] = new ModelRendererTurbo(this, 367, 16, textureX, textureY); // Box 159
		bodyModel[155].addShapeBox(0, 0, 0, 3, 1, 0, 0, 0.5f, 0, 0.7f, 0, 0, 0.7f, 0, 0, -0.7f, 0.5f, 0, -0.7f, 0.1f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1f, -0.25f, 0);
		bodyModel[155].setRotationPoint(-56.0f, -3.02f, -8.95f);

		bodyModel[156] = new ModelRendererTurbo(this, 360, 9, textureX, textureY); // Box 160
		bodyModel[156].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[156].setRotationPoint(-55.55f, -2.5100002f, -10.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 389, 77, textureX, textureY); // Box 161
		bodyModel[157].addShapeBox(0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[157].setRotationPoint(-17.01f, -3.3f, 7.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 300, 77, textureX, textureY); // Box 162
		bodyModel[158].addShapeBox(0, 0, 0, 0, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(-14.96f, -4.3f, 7.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 27, 38, textureX, textureY); // Box 163
		bodyModel[159].addShapeBox(0, 0, 0, 12, 1, 2, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f);
		bodyModel[159].setRotationPoint(-22.0f, 0.0f, 10.5f);

		bodyModel[160] = new ModelRendererTurbo(this, 57, 61, textureX, textureY); // Box 164
		bodyModel[160].addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[160].setRotationPoint(-19.1f, -8.5f, 6.0f);

		bodyModel[161] = new ModelRendererTurbo(this, 223, 58, textureX, textureY); // Box 165
		bodyModel[161].addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[161].setRotationPoint(-16.0f, -8.5f, 6.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 185, 39, textureX, textureY); // Box 166
		bodyModel[162].addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, -0.2f, -0.7f, -0.45f, -0.2f, -0.7f, -0.45f, -0.2f, -0.7f, -0.5f, -0.2f, -0.7f, -0.5f, -0.2f, -0.7f, -0.45f, -0.2f, -0.7f, -0.45f, -0.2f, -0.7f, -0.5f, -0.2f, -0.7f);
		bodyModel[162].setRotationPoint(-17.51f, 0.0f, 6.5f);

		bodyModel[163] = new ModelRendererTurbo(this, 316, 23, textureX, textureY); // Box 167
		bodyModel[163].addShapeBox(0, 0, 0, 2, 1, 9, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f);
		bodyModel[163].setRotationPoint(-17.0f, 0.0f, 3.25f);

		bodyModel[164] = new ModelRendererTurbo(this, 267, 26, textureX, textureY); // Box 168
		bodyModel[164].addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f);
		bodyModel[164].setRotationPoint(-19.0f, -6.0f, 5.65f);

		bodyModel[165] = new ModelRendererTurbo(this, 125, 73, textureX, textureY); // Box 169
		bodyModel[165].addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f);
		bodyModel[165].setRotationPoint(-19.0f, -6.0f, 3.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 471, 72, textureX, textureY); // Box 175
		bodyModel[166].addShapeBox(0, 0, 0, 1, 6, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0);
		bodyModel[166].setRotationPoint(-14.95f, -3.3f, 7.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 411, 22, textureX, textureY); // Box 176
		bodyModel[167].addShapeBox(0, 0, 0, 1, 6, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0);
		bodyModel[167].setRotationPoint(-18.05f, -3.3f, 7.0f);

		bodyModel[168] = new ModelRendererTurbo(this, 42, 55, textureX, textureY); // Box 177
		bodyModel[168].addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.05f, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, -0.05f, -0.2f, -0.7f, -0.05f, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, -0.05f, -0.2f, -0.7f);
		bodyModel[168].setRotationPoint(-13.95f, 0.0f, 6.5f);

		bodyModel[169] = new ModelRendererTurbo(this, 27, 42, textureX, textureY); // Box 178
		bodyModel[169].addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.2f, -0.7f, 0.4f, -0.2f, -0.7f, 0.4f, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0.4f, -0.2f, -0.7f, 0.4f, -0.2f, -0.7f, 0, -0.2f, -0.7f);
		bodyModel[169].setRotationPoint(-22.5f, 0.0f, 6.5f);

		bodyModel[170] = new ModelRendererTurbo(this, 462, 72, textureX, textureY); // Box 179
		bodyModel[170].addShapeBox(0, 0, 0, 2, 5, 2, 0, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f);
		bodyModel[170].setRotationPoint(-12.95f, -3.3f, 6.5f);

		bodyModel[171] = new ModelRendererTurbo(this, 495, 14, textureX, textureY); // Box 181
		bodyModel[171].addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[171].setRotationPoint(-18.0f, -4.0f, 9.04f);

		bodyModel[172] = new ModelRendererTurbo(this, 166, 71, textureX, textureY); // Box 180
		bodyModel[172].addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f);
		bodyModel[172].setRotationPoint(-14.0f, -6.0f, 3.5f);

		bodyModel[173] = new ModelRendererTurbo(this, 135, 72, textureX, textureY); // Box 181
		bodyModel[173].addShapeBox(0, 0, 0, 2, 5, 2, 0, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f, -0.65f, -0.2f, -0.65f);
		bodyModel[173].setRotationPoint(-21.05f, -3.3f, 6.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 489, 77, textureX, textureY); // Box 189
		bodyModel[174].addShapeBox(0, 0, 0, 1, 19, 1, 0, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.35f, -0.3f, -0.3f, -0.35f, -0.3f, -0.3f, -0.35f, -0.3f, -0.3f, -0.35f, -0.3f);
		bodyModel[174].setRotationPoint(-14.0f, -24.0f, 4.2f);

		bodyModel[175] = new ModelRendererTurbo(this, 384, 77, textureX, textureY); // Box 189
		bodyModel[175].addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.85f, 0, -0.25f, 0.35f, 0, -0.25f, 0.35f, 0, -0.25f, -0.85f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[175].setRotationPoint(-10.0f, -11.0f, 6.0f);

		bodyModel[176] = new ModelRendererTurbo(this, 344, 77, textureX, textureY); // Box 192
		bodyModel[176].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[176].setRotationPoint(-12.0f, -16.01f, -4.01f);

		bodyModel[177] = new ModelRendererTurbo(this, 49, 61, textureX, textureY); // Box 207
		bodyModel[177].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[177].setRotationPoint(-16.5f, -1.0f, -10.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 505, 38, textureX, textureY); // Box 208
		bodyModel[178].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[178].setRotationPoint(-11.5f, -14.0f, -1.01f);

		bodyModel[179] = new ModelRendererTurbo(this, 483, 38, textureX, textureY); // Box 209
		bodyModel[179].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(-12.4f, -1.0f, 3.65f);

		bodyModel[180] = new ModelRendererTurbo(this, 119, 25, textureX, textureY); // Box 212
		bodyModel[180].addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[180].setRotationPoint(-33.5f, -1.0f, -10.0f);

		bodyModel[181] = new ModelRendererTurbo(this, 339, 77, textureX, textureY); // Box 220
		bodyModel[181].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[181].setRotationPoint(-24.0f, -3.0f, -10.0f);

		bodyModel[182] = new ModelRendererTurbo(this, 461, 31, textureX, textureY); // Box 222
		bodyModel[182].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[182].setRotationPoint(-33.5f, -1.0f, -9.0f);

		bodyModel[183] = new ModelRendererTurbo(this, 343, 66, textureX, textureY); // Box 225
		bodyModel[183].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[183].setRotationPoint(-12.01f, -14.5f, 2.0f);
		bodyModel[183].rotateAngleY = -0.5061455f;

		bodyModel[184] = new ModelRendererTurbo(this, 334, 77, textureX, textureY); // Box 234
		bodyModel[184].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[184].setRotationPoint(-11.35f, -18.0f, -0.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 104, 66, textureX, textureY); // Box 236
		bodyModel[185].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[185].setRotationPoint(-11.65f, -18.5f, 0.6f);
		bodyModel[185].rotateAngleY = -0.2617994f;

		bodyModel[186] = new ModelRendererTurbo(this, 404, 65, textureX, textureY); // Box 237
		bodyModel[186].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[186].setRotationPoint(-11.7f, -16.5f, 1.2f);
		bodyModel[186].rotateAngleY = -0.5061455f;

		bodyModel[187] = new ModelRendererTurbo(this, 287, 15, textureX, textureY); // Box 241
		bodyModel[187].addShapeBox(0, 0, 0, 2, 0, 2, 0, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f);
		bodyModel[187].setRotationPoint(-24.5f, -3.02f, -10.5f);

		bodyModel[188] = new ModelRendererTurbo(this, 453, 58, textureX, textureY); // Box 264
		bodyModel[188].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.4f, 0, -0.8f, -0.4f, 0, -0.8f, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, -0.8f, -0.4f, 0, -0.8f, -0.4f, 0, 0, -0.4f, 0);
		bodyModel[188].setRotationPoint(-10.0f, -3.4f, -2.5f);

		bodyModel[189] = new ModelRendererTurbo(this, 377, 71, textureX, textureY); // Box 265
		bodyModel[189].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, 0, -0.4f);
		bodyModel[189].setRotationPoint(-10.0f, -3.0f, -2.9f);

		bodyModel[190] = new ModelRendererTurbo(this, 295, 77, textureX, textureY); // Box 266
		bodyModel[190].addShapeBox(0, 0, -3, 1, 7, 1, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[190].setRotationPoint(-14.0f, -28.64f, 4.35f);

		bodyModel[191] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 267
		bodyModel[191].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, -0.8f, 0, -0.4f, -0.8f, 0, -0.4f, 0, 0, -0.4f);
		bodyModel[191].setRotationPoint(-10.0f, -3.0f, 1.9f);

		bodyModel[192] = new ModelRendererTurbo(this, 326, 37, textureX, textureY); // Box 268
		bodyModel[192].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.4f, 0, -0.8f, -0.4f, 0, -0.8f, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, -0.8f, -0.4f, 0, -0.8f, -0.4f, 0, 0, -0.4f, 0);
		bodyModel[192].setRotationPoint(-10.0f, -1.6f, -2.5f);

		bodyModel[193] = new ModelRendererTurbo(this, 304, 35, textureX, textureY); // Box 272
		bodyModel[193].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.1f, -0.25f, -0.5f, -0.65f, -0.25f, -0.3f, -0.35f, -0.25f, -0.3f, -0.25f, -0.25f, -0.05f, -0.1f, -0.25f, -0.5f, -0.65f, -0.25f, -0.3f, -0.35f, -0.25f, -0.3f, -0.25f, -0.25f, -0.05f);
		bodyModel[193].setRotationPoint(-13.0f, -16.25f, -4.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 501, 52, textureX, textureY); // Box 291
		bodyModel[194].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.1f, -0.35f, -0.25f, -0.1f, -0.35f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.6f, -0.35f, -0.25f, -0.6f, -0.35f, -0.25f, -0.5f, -0.25f);
		bodyModel[194].setRotationPoint(-14.0f, -11.0f, -4.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 293
		bodyModel[195].addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0);
		bodyModel[195].setRotationPoint(-14.0f, -24.5f, 1.9f);

		bodyModel[196] = new ModelRendererTurbo(this, 68, 64, textureX, textureY); // Box 298
		bodyModel[196].addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[196].setRotationPoint(-10.99f, -12.5f, 3.75f);

		bodyModel[197] = new ModelRendererTurbo(this, 453, 72, textureX, textureY); // Box 310
		bodyModel[197].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f);
		bodyModel[197].setRotationPoint(-14.0f, -12.0f, 4.2f);

		bodyModel[198] = new ModelRendererTurbo(this, 496, 67, textureX, textureY); // Box 318
		bodyModel[198].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f);
		bodyModel[198].setRotationPoint(-14.0f, -28.75f, 1.35f);

		bodyModel[199] = new ModelRendererTurbo(this, 287, 20, textureX, textureY); // Box 356
		bodyModel[199].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[199].setRotationPoint(-42.5f, -1.0f, -2.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 264, 77, textureX, textureY); // Box 377
		bodyModel[200].addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.95f, -0.35f, -0.35f, 0.25f, -0.35f, -0.35f, 0.25f, -0.35f, -0.35f, -0.95f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f);
		bodyModel[200].setRotationPoint(-12.0f, -6.0f, 3.75f);

		bodyModel[201] = new ModelRendererTurbo(this, 494, 72, textureX, textureY); // Box 52
		bodyModel[201].addShapeBox(0, 0, 0, 1, 5, 2, 0, 0.6f, -0.5f, -0.1f, -1, -0.5f, 0.15f, -1, -0.5f, 0.15f, 0.6f, -0.5f, -0.1f, 0.6f, 0, -0.1f, -1, 0, 0.15f, -1, 0, 0.15f, 0.6f, 0, -0.1f);
		bodyModel[201].setRotationPoint(-14.4f, -8.25f, 6.5f);

		bodyModel[202] = new ModelRendererTurbo(this, 90, 68, textureX, textureY); // Box 53
		bodyModel[202].addShapeBox(0, 0, 0, 1, 5, 2, 0, -1, -0.5f, 0.15f, 0.6f, -0.5f, -0.1f, 0.6f, -0.5f, -0.1f, -1, -0.5f, 0.15f, -1, 0, 0.15f, 0.6f, 0, -0.1f, 0.6f, 0, -0.1f, -1, 0, 0.15f);
		bodyModel[202].setRotationPoint(-18.6f, -8.25f, 6.5f);

		bodyModel[203] = new ModelRendererTurbo(this, 38, 72, textureX, textureY); // Box 54
		bodyModel[203].addShapeBox(0, 0, 0, 2, 5, 2, 0, -1.4f, -0.5f, -0.1f, -0.15f, -0.5f, -0.6f, -0.15f, -0.5f, -0.6f, -1.4f, -0.5f, -0.1f, -1.4f, 0, -0.1f, -0.15f, 0, -0.6f, -0.15f, 0, -0.6f, -1.4f, 0, -0.1f);
		bodyModel[203].setRotationPoint(-18.4f, -8.25f, 6.5f);

		bodyModel[204] = new ModelRendererTurbo(this, 368, 71, textureX, textureY); // Box 55
		bodyModel[204].addShapeBox(0, 0, 0, 2, 5, 2, 0, -0.15f, -0.5f, -0.6f, -1.4f, -0.5f, -0.1f, -1.4f, -0.5f, -0.1f, -0.15f, -0.5f, -0.6f, -0.15f, 0, -0.6f, -1.4f, 0, -0.1f, -1.4f, 0, -0.1f, -0.15f, 0, -0.6f);
		bodyModel[204].setRotationPoint(-15.6f, -8.25f, 6.5f);

		bodyModel[205] = new ModelRendererTurbo(this, 259, 77, textureX, textureY); // Box 147
		bodyModel[205].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[205].setRotationPoint(-14.95f, -3.25f, 7.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 254, 77, textureX, textureY); // Box 148
		bodyModel[206].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[206].setRotationPoint(-18.05f, -3.25f, 7.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 359, 71, textureX, textureY); // Box 155
		bodyModel[207].addShapeBox(0, 0, 2, 2, 1, 2, 0, 0.5f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0.5f, -0.3f, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.5f, 0, -0.7f);
		bodyModel[207].setRotationPoint(-55.0f, -2.01f, -13.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 350, 71, textureX, textureY); // Box 156
		bodyModel[208].addShapeBox(0, 0, 2, 2, 1, 2, 0, 0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, -0.2f, 0, 0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, -0.2f, 0);
		bodyModel[208].setRotationPoint(-55.0f, -2.51f, -13.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 360, 16, textureX, textureY); // Box 158
		bodyModel[209].addShapeBox(0, 0, 0, 3, 1, 0, 0, 0.1f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.1f, -0.2f, 0, -0.3f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, -0.3f, -0.2f, 0);
		bodyModel[209].setRotationPoint(-56.0f, -2.47f, -11.03f);

		bodyModel[210] = new ModelRendererTurbo(this, 504, 14, textureX, textureY); // Box 159
		bodyModel[210].addShapeBox(0, 0, 2, 3, 1, 0, 0, 0.1f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.1f, -0.2f, 0, -0.3f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, -0.3f, -0.2f, 0);
		bodyModel[210].setRotationPoint(-56.0f, -2.48f, -10.95f);

		bodyModel[211] = new ModelRendererTurbo(this, 150, 25, textureX, textureY); // Box 164
		bodyModel[211].addShapeBox(0, 0, 0, 2, 1, 6, 0, 0.05f, -0.8f, -0.4f, -0.05f, -0.35f, -0.4f, -0.05f, -0.35f, -0.4f, 0.05f, -0.85f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f);
		bodyModel[211].setRotationPoint(-20.25f, -1.6f, -7.8f);
		bodyModel[211].rotateAngleY = -0.4537856f;

		bodyModel[212] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 171
		bodyModel[212].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f);
		bodyModel[212].setRotationPoint(-14.95f, 1.5f, 7.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 311, 65, textureX, textureY); // Box 172
		bodyModel[213].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f, -0.15f, -0.15f, -0.05f);
		bodyModel[213].setRotationPoint(-18.05f, 1.5f, 7.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 54, 77, textureX, textureY); // Box 173
		bodyModel[214].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.35f, -0.25f, 0, 0.35f, -0.25f, 0, -0.85f, -0.25f, 0, -0.85f);
		bodyModel[214].setRotationPoint(-14.95f, 1.75f, 7.0f);

		bodyModel[215] = new ModelRendererTurbo(this, 31, 77, textureX, textureY); // Box 183
		bodyModel[215].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.15f, 0, -0.25f, -0.15f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.85f, -0.25f, 0, -0.85f, -0.25f, 0, 0.35f, -0.25f, 0, 0.35f);
		bodyModel[215].setRotationPoint(-18.05f, 1.75f, 7.0f);

		bodyModel[216] = new ModelRendererTurbo(this, 160, 71, textureX, textureY); // Box 184
		bodyModel[216].addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.75f, -0.15f, -0.15f, 0.15f, -0.15f, -0.15f, 0.15f, -0.15f, -0.15f, -0.75f, -0.15f, -0.15f, -0.75f, -0.15f, -0.15f, 0.15f, -0.15f, -0.15f, 0.15f, -0.15f, -0.15f, -0.75f, -0.15f, -0.15f);
		bodyModel[216].setRotationPoint(-17.95f, 5.0f, 7.0f);

		bodyModel[217] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 185
		bodyModel[217].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[217].setRotationPoint(-18.63f, 4.4f, 7.6f);

		bodyModel[218] = new ModelRendererTurbo(this, 30, 65, textureX, textureY); // Box 186
		bodyModel[218].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
		bodyModel[218].setRotationPoint(-18.63f, 5.6f, 7.6f);

		bodyModel[219] = new ModelRendererTurbo(this, 487, 63, textureX, textureY); // Box 187
		bodyModel[219].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[219].setRotationPoint(-18.63f, 5.6f, 6.4f);

		bodyModel[220] = new ModelRendererTurbo(this, 295, 62, textureX, textureY); // Box 188
		bodyModel[220].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[220].setRotationPoint(-18.63f, 4.4f, 6.4f);

		bodyModel[221] = new ModelRendererTurbo(this, 141, 62, textureX, textureY); // Box 204
		bodyModel[221].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[221].setRotationPoint(5.5f, 4.4f, 7.6f);

		bodyModel[222] = new ModelRendererTurbo(this, 128, 62, textureX, textureY); // Box 221
		bodyModel[222].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[222].setRotationPoint(-15.52f, 4.4f, 7.6f);

		bodyModel[223] = new ModelRendererTurbo(this, 254, 61, textureX, textureY); // Box 226
		bodyModel[223].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[223].setRotationPoint(-17.47f, 4.4f, 6.4f);

		bodyModel[224] = new ModelRendererTurbo(this, 67, 61, textureX, textureY); // Box 229
		bodyModel[224].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[224].setRotationPoint(-15.52f, 4.4f, 6.4f);

		bodyModel[225] = new ModelRendererTurbo(this, 211, 60, textureX, textureY); // Box 230
		bodyModel[225].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[225].setRotationPoint(-14.4f, 4.4f, 7.6f);

		bodyModel[226] = new ModelRendererTurbo(this, 42, 60, textureX, textureY); // Box 231
		bodyModel[226].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[226].setRotationPoint(-17.47f, 4.4f, 7.6f);

		bodyModel[227] = new ModelRendererTurbo(this, 507, 59, textureX, textureY); // Box 233
		bodyModel[227].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[227].setRotationPoint(-14.4f, 4.4f, 6.4f);

		bodyModel[228] = new ModelRendererTurbo(this, 450, 58, textureX, textureY); // Box 239
		bodyModel[228].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[228].setRotationPoint(-14.4f, 5.6f, 6.4f);

		bodyModel[229] = new ModelRendererTurbo(this, 433, 58, textureX, textureY); // Box 242
		bodyModel[229].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
		bodyModel[229].setRotationPoint(-14.4f, 5.6f, 7.6f);

		bodyModel[230] = new ModelRendererTurbo(this, 329, 58, textureX, textureY); // Box 244
		bodyModel[230].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[230].setRotationPoint(5.5f, 5.6f, 8.6f);
		bodyModel[230].rotateAngleX = 4.712389f;

		bodyModel[231] = new ModelRendererTurbo(this, 208, 57, textureX, textureY); // Box 249
		bodyModel[231].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[231].setRotationPoint(5.5f, 6.6f, 7.4f);
		bodyModel[231].rotateAngleX = 3.1415927f;

		bodyModel[232] = new ModelRendererTurbo(this, 191, 57, textureX, textureY); // Box 253
		bodyModel[232].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
		bodyModel[232].setRotationPoint(-27.5f, 5.6f, 7.6f);

		bodyModel[233] = new ModelRendererTurbo(this, 394, 55, textureX, textureY); // Box 254
		bodyModel[233].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[233].setRotationPoint(-27.5f, 5.6f, 6.4f);

		bodyModel[234] = new ModelRendererTurbo(this, 251, 55, textureX, textureY); // Box 255
		bodyModel[234].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[234].setRotationPoint(-27.5f, 4.4f, 7.6f);

		bodyModel[235] = new ModelRendererTurbo(this, 456, 52, textureX, textureY); // Box 256
		bodyModel[235].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[235].setRotationPoint(-27.5f, 4.4f, 6.4f);

		bodyModel[236] = new ModelRendererTurbo(this, 76, 50, textureX, textureY); // Box 258
		bodyModel[236].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[236].setRotationPoint(5.5f, 5.4f, 6.4f);
		bodyModel[236].rotateAngleX = 1.5707964f;

		bodyModel[237] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 264
		bodyModel[237].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0.3f, -7, 0, 0, -7, 0, 0, 7, 0, 0.3f, 7, -2, -1, -0.6f, 2, -1, -0.8f, 2, 0.5f, 0.5f, -2, 0.5f, 0.5f);
		bodyModel[237].setRotationPoint(-32.0f, 1.02f, 1.2f);
		bodyModel[237].rotateAngleZ = 1.1693707f;

		bodyModel[238] = new ModelRendererTurbo(this, 21, 77, textureX, textureY); // Box 265
		bodyModel[238].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 7, 0, 0.7f, 7, 0, 1.3f, -7, 0, 0, -7, 2, 1.6f, 0, -2, 1.2f, 0, -2, 1.2f, 0, 2, 1.4f, 0);
		bodyModel[238].setRotationPoint(1.0f, 0.27f, -3.2f);
		bodyModel[238].rotateAngleZ = -1.1693707f;

		bodyModel[239] = new ModelRendererTurbo(this, 310, 76, textureX, textureY); // Box 267
		bodyModel[239].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -7, 0, 1, -7, 0, 1, 7, 0, 0, 7, 2, 1, 0, -2, 1, 0, -2, 1, 0, 2, 1, 0);
		bodyModel[239].setRotationPoint(1.0f, 0.27f, 2.2f);
		bodyModel[239].rotateAngleZ = -1.1693707f;

		bodyModel[240] = new ModelRendererTurbo(this, 281, 76, textureX, textureY); // Box 268
		bodyModel[240].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0.2f, 7, 0, 0, 7, 0, 0, -7, 0, 0.2f, -7, -2, 0.6f, -0.2f, 2, 0.4f, -0.2f, 2, 0.8f, 0.2f, -2, 0.8f, 0.2f);
		bodyModel[240].setRotationPoint(-32.0f, 1.02f, -3.2f);
		bodyModel[240].rotateAngleZ = 1.1693707f;

		bodyModel[241] = new ModelRendererTurbo(this, 287, 23, textureX, textureY); // Box 302
		bodyModel[241].addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.15f, -0.15f, 0.1f, -0.15f, -0.15f, 0.1f, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0.1f, -0.15f, -0.15f, 0.1f, -0.15f, -0.15f, 0, -0.15f, -0.15f);
		bodyModel[241].setRotationPoint(-27.0f, 5.0f, 7.0f);

		bodyModel[242] = new ModelRendererTurbo(this, 456, 49, textureX, textureY); // Box 306
		bodyModel[242].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[242].setRotationPoint(-15.52f, 5.6f, 6.4f);

		bodyModel[243] = new ModelRendererTurbo(this, 236, 23, textureX, textureY); // Box 321
		bodyModel[243].addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f);
		bodyModel[243].setRotationPoint(-14.1f, 5.0f, 7.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 76, 47, textureX, textureY); // Box 322
		bodyModel[244].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
		bodyModel[244].setRotationPoint(-15.52f, 5.6f, 7.6f);

		bodyModel[245] = new ModelRendererTurbo(this, 85, 43, textureX, textureY); // Box 341
		bodyModel[245].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
		bodyModel[245].setRotationPoint(-17.47f, 5.6f, 6.4f);

		bodyModel[246] = new ModelRendererTurbo(this, 275, 42, textureX, textureY); // Box 351
		bodyModel[246].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
		bodyModel[246].setRotationPoint(-17.47f, 5.6f, 7.6f);

		bodyModel[247] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 30
		bodyModel[247].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[247].setRotationPoint(-44.4f, -17.165f, 1.13f);

		bodyModel[248] = new ModelRendererTurbo(this, 172, 76, textureX, textureY); // Box 105
		bodyModel[248].addShapeBox(0, 0, 0, 1, 8, 1, 0, -2, 0, 0, 1.8f, -0.3f, 0, 1.8f, -0.3f, 0, -2, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0);
		bodyModel[248].setRotationPoint(-36.0f, -15.02f, -6.0f);

		bodyModel[249] = new ModelRendererTurbo(this, 291, 0, textureX, textureY); // Box 189
		bodyModel[249].addShapeBox(0, 0, 0, 25, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[249].setRotationPoint(-52.0f, -5.04f, -9.0f);

		bodyModel[250] = new ModelRendererTurbo(this, 11, 65, textureX, textureY); // Box 190
		bodyModel[250].addShapeBox(0, 0, 0, 3, 3, 2, 0, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[250].setRotationPoint(-51.0f, -7.86f, 6.25f);

		bodyModel[251] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 191
		bodyModel[251].addShapeBox(0, 0, 0, 3, 3, 2, 0, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[251].setRotationPoint(-51.0f, -7.86f, -8.25f);

		bodyModel[252] = new ModelRendererTurbo(this, 27, 51, textureX, textureY); // Box 192
		bodyModel[252].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f);
		bodyModel[252].setRotationPoint(-50.0f, -7.04f, -6.0f);

		bodyModel[253] = new ModelRendererTurbo(this, 434, 49, textureX, textureY); // Box 193
		bodyModel[253].addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, -0.05f, 0, 0, -0.05f, 0, -2.1f, -0.05f, -2.1f, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, -2.1f, 0, -2.1f, 0, 0, 0);
		bodyModel[253].setRotationPoint(-44.51f, -4.03f, -0.01f);

		bodyModel[254] = new ModelRendererTurbo(this, 405, 49, textureX, textureY); // Box 194
		bodyModel[254].addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, -2.1f, -0.05f, -2.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.1f, 0, -2.1f);
		bodyModel[254].setRotationPoint(-51.5f, -4.03f, -0.01f);

		bodyModel[255] = new ModelRendererTurbo(this, 322, 49, textureX, textureY); // Box 195
		bodyModel[255].addShapeBox(0, 0, 0, 7, 1, 7, 0, -2.1f, -0.05f, -2.1f, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, -2.1f, 0, -2.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[255].setRotationPoint(-51.5f, -4.03f, -7.01f);

		bodyModel[256] = new ModelRendererTurbo(this, 483, 38, textureX, textureY); // Box 196
		bodyModel[256].addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, -0.05f, 0, -2.1f, -0.05f, -2.1f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, -2.1f, 0, -2.1f, 0, 0, 0, 0, 0, 0);
		bodyModel[256].setRotationPoint(-44.49f, -4.03f, -7.0f);

		bodyModel[257] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 197
		bodyModel[257].addShapeBox(0, 0, 0, 4, 4, 18, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[257].setRotationPoint(-36.0f, -9.04f, -9.0f);

		bodyModel[258] = new ModelRendererTurbo(this, 434, 24, textureX, textureY); // Box 198
		bodyModel[258].addShapeBox(0, 0, 0, 4, 4, 18, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(-40.0f, -9.04f, -9.0f);

		bodyModel[259] = new ModelRendererTurbo(this, 167, 76, textureX, textureY); // Box 199
		bodyModel[259].addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.55f, -0.2f, 0, 0.5f, -0.3f, 0, 0.5f, -0.3f, 0, -0.55f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[259].setRotationPoint(-36.5f, -15.02f, -3.25f);

		bodyModel[260] = new ModelRendererTurbo(this, 199, 43, textureX, textureY); // Box 200
		bodyModel[260].addShapeBox(0, 0, 0, 1, 8, 1, 0, -3.05f, -0.15f, 0, 2.9f, -0.45f, 0, 2.9f, -0.45f, 0, -3.05f, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[260].setRotationPoint(-35.5f, -15.02f, -0.5f);

		bodyModel[261] = new ModelRendererTurbo(this, 147, 59, textureX, textureY); // Box 201
		bodyModel[261].addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[261].setRotationPoint(-39.5f, -10.02f, 9.25f);

		bodyModel[262] = new ModelRendererTurbo(this, 492, 60, textureX, textureY); // Box 203
		bodyModel[262].addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[262].setRotationPoint(-39.0f, -9.02f, -9.25f);

		bodyModel[263] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 204
		bodyModel[263].addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[263].setRotationPoint(-45.5f, -11.52f, 9.05f);

		bodyModel[264] = new ModelRendererTurbo(this, 434, 24, textureX, textureY); // Box 205
		bodyModel[264].addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[264].setRotationPoint(-45.5f, -11.52f, -9.05f);

		bodyModel[265] = new ModelRendererTurbo(this, 180, 39, textureX, textureY); // Box 206
		bodyModel[265].addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1);
		bodyModel[265].setRotationPoint(-42.0f, -8.04f, -8.0f);

		bodyModel[266] = new ModelRendererTurbo(this, 162, 64, textureX, textureY); // Box 207
		bodyModel[266].addShapeBox(0, 0, 0, 3, 4, 2, 0, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[266].setRotationPoint(-43.0f, -8.86f, 6.75f);

		bodyModel[267] = new ModelRendererTurbo(this, 476, 63, textureX, textureY); // Box 208
		bodyModel[267].addShapeBox(0, 0, 0, 3, 4, 2, 0, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.85f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
		bodyModel[267].setRotationPoint(-43.0f, -8.86f, -8.75f);

		bodyModel[268] = new ModelRendererTurbo(this, 120, 76, textureX, textureY); // Box 209
		bodyModel[268].addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[268].setRotationPoint(-41.8f, -17.02f, 7.0f);

		bodyModel[269] = new ModelRendererTurbo(this, 16, 76, textureX, textureY); // Box 210
		bodyModel[269].addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[269].setRotationPoint(-41.8f, -17.02f, -8.0f);

		bodyModel[270] = new ModelRendererTurbo(this, 66, 39, textureX, textureY); // Box 213
		bodyModel[270].addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.35f, -0.1f, 1, -0.1f, -0.1f, 1, -0.1f, -0.1f, 1, -0.35f, -0.1f, 1, -0.35f, -0.35f, 1, -0.1f, -0.35f, 1, -0.1f, -0.35f, 1, -0.35f, -0.35f, 1);
		bodyModel[270].setRotationPoint(-41.9f, -17.04f, -8.0f);

		bodyModel[271] = new ModelRendererTurbo(this, 162, 75, textureX, textureY); // Box 214
		bodyModel[271].addShapeBox(0, 0, 0, 1, 14, 1, 0, -4.8f, -2.1f, -0.3f, 3.8f, -2.6f, -0.3f, 3.8f, -2.6f, -0.3f, -4.8f, -2.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[271].setRotationPoint(-46.35f, -19.02f, 7.0f);

		bodyModel[272] = new ModelRendererTurbo(this, 115, 75, textureX, textureY); // Box 215
		bodyModel[272].addShapeBox(0, 0, 0, 1, 14, 1, 0, -4.8f, -2.1f, -0.3f, 3.8f, -2.6f, -0.3f, 3.8f, -2.6f, -0.3f, -4.8f, -2.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[272].setRotationPoint(-46.35f, -19.02f, -8.0f);

		bodyModel[273] = new ModelRendererTurbo(this, 9, 71, textureX, textureY); // Box 216
		bodyModel[273].addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[273].setRotationPoint(-43.2f, -18.77f, 1.25f);

		bodyModel[274] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 176
		bodyModel[274].addShapeBox(0, 0, 0, 2, 20, 2, 0, 27, 0, 0, -25, 0, 0, -25, 0, 0, 27, 0, 0, 0, 0, 0, -0.6f, -1.7f, 0, -0.6f, -1.7f, 0, 0, 0, 0);
		bodyModel[274].setRotationPoint(-51.0f, -26.02f, 8.0f);

		bodyModel[275] = new ModelRendererTurbo(this, 45, 28, textureX, textureY); // Box 177
		bodyModel[275].addShapeBox(0, 0, 0, 2, 2, 16, 0, -0.75f, 0, 0, 0.75f, -1.4f, 0, 0.75f, -1.4f, 0, -0.75f, 0, 0, -0.2f, -0.2f, 0, 0.1f, 1.1f, 0, 0, 1, 0, -0.2f, -0.2f, 0);
		bodyModel[275].setRotationPoint(-75.0f, -25.54f, -8.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 256, 35, textureX, textureY); // Box 178
		bodyModel[276].addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0.3f, -0.95f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0.3f, -0.95f, 0);
		bodyModel[276].setRotationPoint(-55.0f, -10.52f, -8.0f);

		bodyModel[277] = new ModelRendererTurbo(this, 474, 70, textureX, textureY); // Box 179
		bodyModel[277].addShapeBox(0, 0, 0, 2, 14, 2, 0, 19, 0, -5, -17, 0, -5, -17, 0, 5, 19, 0, 5, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0);
		bodyModel[277].setRotationPoint(-78.0f, -40.04f, -10.0f);

		bodyModel[278] = new ModelRendererTurbo(this, 410, 70, textureX, textureY); // Box 180
		bodyModel[278].addShapeBox(0, 0, 0, 2, 14, 2, 0, 19, 0, 5, -17, 0, 5, -17, 0, -5, 19, 0, -5, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0);
		bodyModel[278].setRotationPoint(-78.0f, -40.04f, 8.0f);

		bodyModel[279] = new ModelRendererTurbo(this, 389, 45, textureX, textureY); // Box 182
		bodyModel[279].addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.75f, 0.5f, 0.3f, -0.95f, 0.5f, -0.4f, -0.2f, 0.5f, -0.4f, -0.2f, 0.5f, 0.3f, -0.95f, 0.5f);
		bodyModel[279].setRotationPoint(-83.0f, -31.52f, -6.5f);

		bodyModel[280] = new ModelRendererTurbo(this, 401, 70, textureX, textureY); // Box 57
		bodyModel[280].addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[280].setRotationPoint(-75.5f, -26.02f, 2.25f);

		bodyModel[281] = new ModelRendererTurbo(this, 392, 70, textureX, textureY); // Box 59
		bodyModel[281].addShapeBox(0, 0, 0, 2, 20, 2, 0, 27, 0, 0, -25, 0, 0, -25, 0, 0, 27, 0, 0, 0, 0, 0, -0.6f, -1.7f, 0, -0.6f, -1.7f, 0, 0, 0, 0);
		bodyModel[281].setRotationPoint(-51.0f, -26.02f, -10.0f);

		bodyModel[282] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Box 60
		bodyModel[282].addShapeBox(0, 0, 0, 3, 2, 2, 0, -0.2f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0, -1.1f, 0, 0, -1.3f, 0, 0, -1.3f, 0, 0, -1.1f, 0, 0);
		bodyModel[282].setRotationPoint(-51.1f, -5.86f, 8.0f);
		bodyModel[282].rotateAngleZ = 0.89011794f;

		bodyModel[283] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 61
		bodyModel[283].addShapeBox(0, 0, 0, 3, 2, 2, 0, -0.2f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0, -1.1f, 0, 0, -1.3f, 0, 0, -1.3f, 0, 0, -1.1f, 0, 0);
		bodyModel[283].setRotationPoint(-51.1f, -5.86f, -10.0f);
		bodyModel[283].rotateAngleZ = 0.89011794f;

		bodyModel[284] = new ModelRendererTurbo(this, 105, 60, textureX, textureY); // Box 64
		bodyModel[284].addShapeBox(0, 0, 0, 4, 3, 2, 0, 3.2f, -1.5f, -1.4f, -6, 0, -1.4f, -6, 0, 1.4f, 3.2f, -1.5f, 1.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[284].setRotationPoint(-96.98f, -43.04f, -5.0f);

		bodyModel[285] = new ModelRendererTurbo(this, 461, 56, textureX, textureY); // Box 69
		bodyModel[285].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.9f, -0.6f, 0.15f, 0, 0.05f, 0.05f, 0, 0, 0, -0.9f, 0.6f, -2.1f, 0.2f, -0.6f, 2, -0.65f, 0.55f, 1.75f, -0.7f, 0, -2.1f, 0.2f, 0.6f);
		bodyModel[285].setRotationPoint(-107.93f, -43.28f, -2.6f);

		bodyModel[286] = new ModelRendererTurbo(this, 360, 9, textureX, textureY); // Box 70
		bodyModel[286].addShapeBox(0, 0, 0, 4, 2, 4, 0, -1.2f, -1.6f, 0, 0, 0, 0, 0, 0, 0, -1.2f, -1.6f, 0, -2.9f, 1.1f, 0, 2.1f, -0.7f, 0, 2.1f, -0.7f, 0, -2.9f, 1.1f, 0);
		bodyModel[286].setRotationPoint(-111.92f, -42.38f, -2.0f);

		bodyModel[287] = new ModelRendererTurbo(this, 25, 51, textureX, textureY); // Box 71
		bodyModel[287].addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.15f, -0.25f, -0.95f, 0.95f, -0.5f, 0, 0.95f, -0.5f, 0, -0.05f, -0.25f, 1, -1.9f, -0.4f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -1.75f, -0.45f, 1);
		bodyModel[287].setRotationPoint(-103.94f, -43.54f, -3.6f);

		bodyModel[288] = new ModelRendererTurbo(this, 417, 42, textureX, textureY); // Box 72
		bodyModel[288].addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.9f, 0.6f, 0.05f, 0, 0, 0.15f, 0, 0.05f, 0, -0.9f, -0.6f, -2.1f, 0.2f, 0.6f, 1.75f, -0.7f, 0, 2, -0.65f, 0.55f, -2.1f, 0.2f, -0.6f);
		bodyModel[288].setRotationPoint(-107.93f, -43.28f, 0.6f);

		bodyModel[289] = new ModelRendererTurbo(this, 427, 49, textureX, textureY); // Box 73
		bodyModel[289].addShapeBox(0, 0, 0, 4, 3, 2, 0, 3.2f, -1.5f, 1.4f, -6, 0, 1.4f, -6, 0, -1.4f, 3.2f, -1.5f, -1.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[289].setRotationPoint(-96.98f, -43.04f, 3.0f);

		bodyModel[290] = new ModelRendererTurbo(this, 417, 37, textureX, textureY); // Box 74
		bodyModel[290].addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.05f, -0.25f, 1, 0.95f, -0.5f, 0, 0.95f, -0.5f, 0, -0.15f, -0.25f, -0.95f, -1.75f, -0.45f, 1, -0.25f, 0, 0, -0.25f, 0, 0, -1.9f, -0.4f, -0.5f);
		bodyModel[290].setRotationPoint(-103.94f, -43.54f, 1.6f);

		bodyModel[291] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 1
		bodyModel[291].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[291].setRotationPoint(25.0f, 5.0f, -5.5f);

		bodyModel[292] = new ModelRendererTurbo(this, 334, 58, textureX, textureY); // Box 2
		bodyModel[292].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[292].setRotationPoint(22.0f, 2.0f, 6.58f);

		bodyModel[293] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 4
		bodyModel[293].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[293].setRotationPoint(11.5f, 5.0f, -5.5f);

		bodyModel[294] = new ModelRendererTurbo(this, 276, 54, textureX, textureY); // Box 5
		bodyModel[294].addBox(-18, 0, 0, 7, 7, 0, 0f);
		bodyModel[294].setRotationPoint(26.5f, 2.0f, 6.58f);

		bodyModel[295] = new ModelRendererTurbo(this, 351, 49, textureX, textureY); // Box 6
		bodyModel[295].addBox(-18, 0, 0, 7, 7, 0, 0f);
		bodyModel[295].setRotationPoint(26.5f, 2.0f, -5.58f);

		bodyModel[296] = new ModelRendererTurbo(this, 85, 47, textureX, textureY); // Box 7
		bodyModel[296].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[296].setRotationPoint(22.0f, 2.0f, -5.58f);

		bodyModel[297] = new ModelRendererTurbo(this, 57, 19, textureX, textureY); // Box 8
		bodyModel[297].addShapeBox(0, 0, 0, 27, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f);
		bodyModel[297].setRotationPoint(5.5f, 5.0f, 7.0f);

		bodyModel[298] = new ModelRendererTurbo(this, 383, 70, textureX, textureY); // Box 23
		bodyModel[298].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f);
		bodyModel[298].setRotationPoint(11.0f, 2.8f, 6.61f);

		bodyModel[299] = new ModelRendererTurbo(this, 202, 9, textureX, textureY); // Box 24
		bodyModel[299].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[299].setRotationPoint(7.5f, 2.5f, 6.8f);

		bodyModel[300] = new ModelRendererTurbo(this, 369, 45, textureX, textureY); // Box 33
		bodyModel[300].addShapeBox(0, 0, 0, 13, 6, 3, 0, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f);
		bodyModel[300].setRotationPoint(17.0f, 2.5f, 6.95f);
		bodyModel[300].rotateAngleY = 1.5707964f;

		bodyModel[301] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 34
		bodyModel[301].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[301].setRotationPoint(23.0f, 2.5f, 6.8f);

		bodyModel[302] = new ModelRendererTurbo(this, 505, 27, textureX, textureY); // Box 35
		bodyModel[302].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[302].setRotationPoint(17.5f, 2.6f, 6.8f);

		bodyModel[303] = new ModelRendererTurbo(this, 308, 62, textureX, textureY); // Box 40
		bodyModel[303].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[303].setRotationPoint(14.5f, 2.8f, 6.8f);

		bodyModel[304] = new ModelRendererTurbo(this, 501, 49, textureX, textureY); // Box 41
		bodyModel[304].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, -0.7f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.7f, -0.2f);
		bodyModel[304].setRotationPoint(19.0f, 2.8f, 6.8f);

		bodyModel[305] = new ModelRendererTurbo(this, 153, 37, textureX, textureY); // Box 42
		bodyModel[305].addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f);
		bodyModel[305].setRotationPoint(17.0f, 1.1f, 2.0f);
		bodyModel[305].rotateAngleY = 1.5707964f;

		bodyModel[306] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 47
		bodyModel[306].addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[306].setRotationPoint(7.5f, 7.7f, 6.5f);

		bodyModel[307] = new ModelRendererTurbo(this, 228, 70, textureX, textureY); // Box 48
		bodyModel[307].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[307].setRotationPoint(11.0f, 5.1f, 6.61f);

		bodyModel[308] = new ModelRendererTurbo(this, 29, 70, textureX, textureY); // Box 57
		bodyModel[308].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f);
		bodyModel[308].setRotationPoint(11.0f, 4.4f, 6.61f);

		bodyModel[309] = new ModelRendererTurbo(this, 483, 35, textureX, textureY); // Box 58
		bodyModel[309].addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[309].setRotationPoint(7.3f, 2.5f, 7.0f);
		bodyModel[309].rotateAngleY = 1.5707964f;

		bodyModel[310] = new ModelRendererTurbo(this, 275, 35, textureX, textureY); // Box 59
		bodyModel[310].addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[310].setRotationPoint(29.2f, 2.5f, 7.0f);
		bodyModel[310].rotateAngleY = 1.5707964f;

		bodyModel[311] = new ModelRendererTurbo(this, 40, 42, textureX, textureY); // Box 61
		bodyModel[311].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[311].setRotationPoint(29.2f, 3.5f, 6.0f);
		bodyModel[311].rotateAngleY = 1.5707964f;
		bodyModel[311].rotateAngleZ = 1.5707964f;

		bodyModel[312] = new ModelRendererTurbo(this, 334, 37, textureX, textureY); // Box 62
		bodyModel[312].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[312].setRotationPoint(29.2f, 3.5f, -4.0f);
		bodyModel[312].rotateAngleY = 1.5707964f;
		bodyModel[312].rotateAngleZ = 1.5707964f;

		bodyModel[313] = new ModelRendererTurbo(this, 119, 39, textureX, textureY); // Box 63
		bodyModel[313].addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f);
		bodyModel[313].setRotationPoint(29.2f, 7.1f, 6.0f);
		bodyModel[313].rotateAngleY = 1.5707964f;

		bodyModel[314] = new ModelRendererTurbo(this, 369, 42, textureX, textureY); // Box 64
		bodyModel[314].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[314].setRotationPoint(29.2f, 7.54f, 6.0f);
		bodyModel[314].rotateAngleY = 1.5707964f;
		bodyModel[314].rotateAngleZ = 1.5707964f;

		bodyModel[315] = new ModelRendererTurbo(this, 103, 36, textureX, textureY); // Box 65
		bodyModel[315].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[315].setRotationPoint(29.2f, 7.54f, -4.0f);
		bodyModel[315].rotateAngleY = 1.5707964f;
		bodyModel[315].rotateAngleZ = 1.5707964f;

		bodyModel[316] = new ModelRendererTurbo(this, 369, 55, textureX, textureY); // Box 66
		bodyModel[316].addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f);
		bodyModel[316].setRotationPoint(30.6f, 7.1f, 6.0f);
		bodyModel[316].rotateAngleY = 1.5707964f;

		bodyModel[317] = new ModelRendererTurbo(this, 446, 33, textureX, textureY); // Box 73
		bodyModel[317].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[317].setRotationPoint(7.2f, 3.5f, 6.0f);
		bodyModel[317].rotateAngleY = 1.5707964f;
		bodyModel[317].rotateAngleZ = 1.5707964f;

		bodyModel[318] = new ModelRendererTurbo(this, 247, 32, textureX, textureY); // Box 74
		bodyModel[318].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[318].setRotationPoint(7.2f, 7.54f, 6.0f);
		bodyModel[318].rotateAngleY = 1.5707964f;
		bodyModel[318].rotateAngleZ = 1.5707964f;

		bodyModel[319] = new ModelRendererTurbo(this, 434, 33, textureX, textureY); // Box 75
		bodyModel[319].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[319].setRotationPoint(7.2f, 3.5f, -4.0f);
		bodyModel[319].rotateAngleY = 1.5707964f;
		bodyModel[319].rotateAngleZ = 1.5707964f;

		bodyModel[320] = new ModelRendererTurbo(this, 236, 32, textureX, textureY); // Box 76
		bodyModel[320].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[320].setRotationPoint(7.2f, 7.54f, -4.0f);
		bodyModel[320].rotateAngleY = 1.5707964f;
		bodyModel[320].rotateAngleZ = 1.5707964f;

		bodyModel[321] = new ModelRendererTurbo(this, 85, 39, textureX, textureY); // Box 77
		bodyModel[321].addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f);
		bodyModel[321].setRotationPoint(6.4f, 7.1f, 6.0f);
		bodyModel[321].rotateAngleY = 1.5707964f;

		bodyModel[322] = new ModelRendererTurbo(this, 215, 55, textureX, textureY); // Box 78
		bodyModel[322].addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f);
		bodyModel[322].setRotationPoint(6.1f, 7.1f, 6.0f);
		bodyModel[322].rotateAngleY = 1.5707964f;

		bodyModel[323] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 79
		bodyModel[323].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[323].setRotationPoint(10.15f, 4.5f, 7.5f);

		bodyModel[324] = new ModelRendererTurbo(this, 108, 33, textureX, textureY); // Box 80
		bodyModel[324].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[324].setRotationPoint(10.15f, 4.5f, 6.5f);

		bodyModel[325] = new ModelRendererTurbo(this, 108, 30, textureX, textureY); // Box 81
		bodyModel[325].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[325].setRotationPoint(10.15f, 5.5f, 6.5f);

		bodyModel[326] = new ModelRendererTurbo(this, 306, 29, textureX, textureY); // Box 82
		bodyModel[326].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f);
		bodyModel[326].setRotationPoint(10.15f, 5.5f, 7.5f);

		bodyModel[327] = new ModelRendererTurbo(this, 20, 70, textureX, textureY); // Box 83
		bodyModel[327].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f);
		bodyModel[327].setRotationPoint(24.5f, 2.8f, 6.61f);

		bodyModel[328] = new ModelRendererTurbo(this, 343, 69, textureX, textureY); // Box 84
		bodyModel[328].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[328].setRotationPoint(24.5f, 5.1f, 6.11f);

		bodyModel[329] = new ModelRendererTurbo(this, 308, 69, textureX, textureY); // Box 89
		bodyModel[329].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f);
		bodyModel[329].setRotationPoint(24.5f, 4.4f, 6.61f);

		bodyModel[330] = new ModelRendererTurbo(this, 135, 47, textureX, textureY); // Box 91
		bodyModel[330].addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f);
		bodyModel[330].setRotationPoint(17.5f, 3.0f, 6.35f);

		bodyModel[331] = new ModelRendererTurbo(this, 299, 69, textureX, textureY); // Box 94
		bodyModel[331].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[331].setRotationPoint(17.5f, 6.1f, 6.15f);

		bodyModel[332] = new ModelRendererTurbo(this, 290, 69, textureX, textureY); // Box 95
		bodyModel[332].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1);
		bodyModel[332].setRotationPoint(17.5f, 5.8f, -7.39f);

		bodyModel[333] = new ModelRendererTurbo(this, 316, 38, textureX, textureY); // Box 97
		bodyModel[333].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.5f, -0.3f, -0.5f, 0.3f, -0.3f, -0.5f, -1.1f, -0.5f, -0.2f, -0.6f, -0.5f, -0.2f, -0.6f, -0.5f, -0.5f, -1.1f, -0.5f, -0.5f);
		bodyModel[333].setRotationPoint(17.1f, 8.3f, -6.3f);
		bodyModel[333].rotateAngleZ = 2.3038347f;

		bodyModel[334] = new ModelRendererTurbo(this, 281, 69, textureX, textureY); // Box 99
		bodyModel[334].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0);
		bodyModel[334].setRotationPoint(11.0f, 2.8f, -7.7f);

		bodyModel[335] = new ModelRendererTurbo(this, 128, 69, textureX, textureY); // Box 100
		bodyModel[335].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0);
		bodyModel[335].setRotationPoint(11.0f, 5.1f, -7.7f);

		bodyModel[336] = new ModelRendererTurbo(this, 119, 69, textureX, textureY); // Box 101
		bodyModel[336].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0);
		bodyModel[336].setRotationPoint(11.0f, 4.4f, -7.7f);

		bodyModel[337] = new ModelRendererTurbo(this, 51, 69, textureX, textureY); // Box 102
		bodyModel[337].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0);
		bodyModel[337].setRotationPoint(24.5f, 2.8f, -7.7f);

		bodyModel[338] = new ModelRendererTurbo(this, 42, 68, textureX, textureY); // Box 103
		bodyModel[338].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0);
		bodyModel[338].setRotationPoint(24.5f, 5.1f, -7.7f);

		bodyModel[339] = new ModelRendererTurbo(this, 487, 67, textureX, textureY); // Box 104
		bodyModel[339].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0);
		bodyModel[339].setRotationPoint(24.5f, 4.4f, -7.7f);

		bodyModel[340] = new ModelRendererTurbo(this, 498, 21, textureX, textureY); // Box 105
		bodyModel[340].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, -0.7f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.7f, -0.2f);
		bodyModel[340].setRotationPoint(19.0f, 2.8f, -6.8f);

		bodyModel[341] = new ModelRendererTurbo(this, 505, 24, textureX, textureY); // Box 106
		bodyModel[341].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[341].setRotationPoint(17.5f, 2.6f, -6.8f);

		bodyModel[342] = new ModelRendererTurbo(this, 330, 34, textureX, textureY); // Box 107
		bodyModel[342].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[342].setRotationPoint(14.5f, 2.8f, -6.8f);

		bodyModel[343] = new ModelRendererTurbo(this, 495, 6, textureX, textureY); // Box 108
		bodyModel[343].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[343].setRotationPoint(7.5f, 2.5f, -6.8f);

		bodyModel[344] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 109
		bodyModel[344].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[344].setRotationPoint(23.0f, 2.5f, -6.8f);

		bodyModel[345] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 110
		bodyModel[345].addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[345].setRotationPoint(7.5f, 7.7f, -6.5f);

		bodyModel[346] = new ModelRendererTurbo(this, 270, 18, textureX, textureY); // Box 111
		bodyModel[346].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.3f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, -0.5f, 0.3f, -0.2f, -0.5f, -0.9f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.9f, -0.2f);
		bodyModel[346].setRotationPoint(19.0f, 5.7f, -6.6f);
		bodyModel[346].rotateAngleX = 1.5707964f;

		bodyModel[347] = new ModelRendererTurbo(this, 287, 12, textureX, textureY); // Box 113
		bodyModel[347].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[347].setRotationPoint(17.5f, 5.7f, -7.0f);
		bodyModel[347].rotateAngleX = 1.5707964f;

		bodyModel[348] = new ModelRendererTurbo(this, 431, 15, textureX, textureY); // Box 114
		bodyModel[348].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.1f, -0.2f, -0.5f, 0.3f, -0.2f, -0.5f, 0.3f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.9f, -0.2f, -0.5f, -0.9f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[348].setRotationPoint(14.0f, 5.7f, -6.6f);
		bodyModel[348].rotateAngleX = 1.5707964f;

		bodyModel[349] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // Box 115
		bodyModel[349].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[349].setRotationPoint(12.0f, 5.7f, -6.6f);
		bodyModel[349].rotateAngleX = 1.5707964f;

		bodyModel[350] = new ModelRendererTurbo(this, 436, 3, textureX, textureY); // Box 116
		bodyModel[350].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[350].setRotationPoint(23.0f, 5.7f, -6.6f);
		bodyModel[350].rotateAngleX = 1.5707964f;

		bodyModel[351] = new ModelRendererTurbo(this, 287, 29, textureX, textureY); // Box 74
		bodyModel[351].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[351].setRotationPoint(23.65f, 4.5f, 7.5f);

		bodyModel[352] = new ModelRendererTurbo(this, 219, 29, textureX, textureY); // Box 75
		bodyModel[352].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[352].setRotationPoint(23.65f, 5.5f, 6.5f);

		bodyModel[353] = new ModelRendererTurbo(this, 161, 28, textureX, textureY); // Box 76
		bodyModel[353].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f);
		bodyModel[353].setRotationPoint(23.65f, 5.5f, 7.5f);

		bodyModel[354] = new ModelRendererTurbo(this, 94, 28, textureX, textureY); // Box 77
		bodyModel[354].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[354].setRotationPoint(23.65f, 4.5f, 6.5f);

		bodyModel[355] = new ModelRendererTurbo(this, 483, 24, textureX, textureY); // Box 78
		bodyModel[355].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0.1f, -0.6f, 0, 0.1f, -0.6f, 0, 0.1f, 0, 0, 0.1f, 0);
		bodyModel[355].setRotationPoint(17.5f, 2.8f, -7.0f);

		bodyModel[356] = new ModelRendererTurbo(this, 172, 37, textureX, textureY); // Box 70
		bodyModel[356].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.7f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.7f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f);
		bodyModel[356].setRotationPoint(24.1f, 3.8f, -6.5f);
		bodyModel[356].rotateAngleZ = -2.3038347f;

		bodyModel[357] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 71
		bodyModel[357].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.7f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.7f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.9f, -0.4f, -0.4f, -0.9f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f);
		bodyModel[357].setRotationPoint(24.1f, 3.8f, 6.55f);
		bodyModel[357].rotateAngleZ = -2.3038347f;

		bodyModel[358] = new ModelRendererTurbo(this, 343, 27, textureX, textureY); // Box 72
		bodyModel[358].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.5f, -0.3f, -0.5f, 0.3f, -0.3f, -0.5f, -1.1f, -0.5f, -0.2f, -0.6f, -0.5f, -0.2f, -0.6f, -0.5f, -0.5f, -1.1f, -0.5f, -0.5f);
		bodyModel[358].setRotationPoint(17.1f, 8.3f, 6.65f);
		bodyModel[358].rotateAngleZ = 2.3038347f;

		bodyModel[359] = new ModelRendererTurbo(this, 120, 48, textureX, textureY); // Box 1
		bodyModel[359].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[359].setRotationPoint(-34.2f, 5.0f, -5.5f);

		bodyModel[360] = new ModelRendererTurbo(this, 61, 47, textureX, textureY); // Box 2
		bodyModel[360].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[360].setRotationPoint(-37.2f, 2.0f, 6.58f);

		bodyModel[361] = new ModelRendererTurbo(this, 46, 47, textureX, textureY); // Box 4
		bodyModel[361].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[361].setRotationPoint(-47.7f, 5.0f, -5.5f);

		bodyModel[362] = new ModelRendererTurbo(this, 180, 45, textureX, textureY); // Box 5
		bodyModel[362].addBox(-18, 0, 0, 7, 7, 0, 0f);
		bodyModel[362].setRotationPoint(-32.7f, 2.0f, 6.58f);

		bodyModel[363] = new ModelRendererTurbo(this, 256, 42, textureX, textureY); // Box 6
		bodyModel[363].addBox(-18, 0, 0, 7, 7, 0, 0f);
		bodyModel[363].setRotationPoint(-32.7f, 2.0f, -5.58f);

		bodyModel[364] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Box 7
		bodyModel[364].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[364].setRotationPoint(-37.2f, 2.0f, -5.58f);

		bodyModel[365] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 8
		bodyModel[365].addShapeBox(0, 0, 0, 27, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f);
		bodyModel[365].setRotationPoint(-53.7f, 5.0f, 7.0f);

		bodyModel[366] = new ModelRendererTurbo(this, 151, 67, textureX, textureY); // Box 23
		bodyModel[366].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f);
		bodyModel[366].setRotationPoint(-48.2f, 2.8f, 6.61f);

		bodyModel[367] = new ModelRendererTurbo(this, 495, 3, textureX, textureY); // Box 24
		bodyModel[367].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[367].setRotationPoint(-51.7f, 2.5f, 6.8f);

		bodyModel[368] = new ModelRendererTurbo(this, 27, 28, textureX, textureY); // Box 33
		bodyModel[368].addShapeBox(0, 0, 0, 13, 6, 3, 0, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f);
		bodyModel[368].setRotationPoint(-42.2f, 2.5f, 6.95f);
		bodyModel[368].rotateAngleY = 1.5707964f;

		bodyModel[369] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 34
		bodyModel[369].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[369].setRotationPoint(-36.2f, 2.5f, 6.8f);

		bodyModel[370] = new ModelRendererTurbo(this, 360, 3, textureX, textureY); // Box 35
		bodyModel[370].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[370].setRotationPoint(-41.7f, 2.6f, 6.8f);

		bodyModel[371] = new ModelRendererTurbo(this, 147, 28, textureX, textureY); // Box 40
		bodyModel[371].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[371].setRotationPoint(-44.7f, 2.8f, 6.8f);

		bodyModel[372] = new ModelRendererTurbo(this, 411, 15, textureX, textureY); // Box 41
		bodyModel[372].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, -0.7f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.7f, -0.2f);
		bodyModel[372].setRotationPoint(-40.2f, 2.8f, 6.8f);

		bodyModel[373] = new ModelRendererTurbo(this, 417, 31, textureX, textureY); // Box 42
		bodyModel[373].addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f);
		bodyModel[373].setRotationPoint(-42.2f, 1.1f, 2.0f);
		bodyModel[373].rotateAngleY = 1.5707964f;

		bodyModel[374] = new ModelRendererTurbo(this, 119, 22, textureX, textureY); // Box 47
		bodyModel[374].addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[374].setRotationPoint(-51.7f, 7.7f, 6.5f);

		bodyModel[375] = new ModelRendererTurbo(this, 371, 36, textureX, textureY); // Box 48
		bodyModel[375].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[375].setRotationPoint(-48.2f, 5.1f, 6.61f);

		bodyModel[376] = new ModelRendererTurbo(this, 142, 67, textureX, textureY); // Box 57
		bodyModel[376].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f);
		bodyModel[376].setRotationPoint(-48.2f, 4.4f, 6.61f);

		bodyModel[377] = new ModelRendererTurbo(this, 236, 35, textureX, textureY); // Box 58
		bodyModel[377].addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[377].setRotationPoint(-51.9f, 2.5f, 7.0f);
		bodyModel[377].rotateAngleY = 1.5707964f;

		bodyModel[378] = new ModelRendererTurbo(this, 483, 32, textureX, textureY); // Box 59
		bodyModel[378].addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[378].setRotationPoint(-30.0f, 2.5f, 7.0f);
		bodyModel[378].rotateAngleY = 1.5707964f;

		bodyModel[379] = new ModelRendererTurbo(this, 474, 27, textureX, textureY); // Box 61
		bodyModel[379].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[379].setRotationPoint(-30.0f, 3.5f, 6.0f);
		bodyModel[379].rotateAngleY = 1.5707964f;
		bodyModel[379].rotateAngleZ = 1.5707964f;

		bodyModel[380] = new ModelRendererTurbo(this, 461, 27, textureX, textureY); // Box 62
		bodyModel[380].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[380].setRotationPoint(-30.0f, 3.5f, -4.0f);
		bodyModel[380].rotateAngleY = 1.5707964f;
		bodyModel[380].rotateAngleZ = 1.5707964f;

		bodyModel[381] = new ModelRendererTurbo(this, 275, 38, textureX, textureY); // Box 63
		bodyModel[381].addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f);
		bodyModel[381].setRotationPoint(-30.0f, 7.1f, 6.0f);
		bodyModel[381].rotateAngleY = 1.5707964f;

		bodyModel[382] = new ModelRendererTurbo(this, 270, 15, textureX, textureY); // Box 64
		bodyModel[382].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[382].setRotationPoint(-30.0f, 7.54f, 6.0f);
		bodyModel[382].rotateAngleY = 1.5707964f;
		bodyModel[382].rotateAngleZ = 1.5707964f;

		bodyModel[383] = new ModelRendererTurbo(this, 431, 12, textureX, textureY); // Box 65
		bodyModel[383].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[383].setRotationPoint(-30.0f, 7.54f, -4.0f);
		bodyModel[383].rotateAngleY = 1.5707964f;
		bodyModel[383].rotateAngleZ = 1.5707964f;

		bodyModel[384] = new ModelRendererTurbo(this, 199, 40, textureX, textureY); // Box 66
		bodyModel[384].addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f);
		bodyModel[384].setRotationPoint(-28.6f, 7.1f, 6.0f);
		bodyModel[384].rotateAngleY = 1.5707964f;

		bodyModel[385] = new ModelRendererTurbo(this, 306, 26, textureX, textureY); // Box 73
		bodyModel[385].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[385].setRotationPoint(-52.0f, 3.5f, 6.0f);
		bodyModel[385].rotateAngleY = 1.5707964f;
		bodyModel[385].rotateAngleZ = 1.5707964f;

		bodyModel[386] = new ModelRendererTurbo(this, 411, 12, textureX, textureY); // Box 74
		bodyModel[386].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[386].setRotationPoint(-52.0f, 7.54f, 6.0f);
		bodyModel[386].rotateAngleY = 1.5707964f;
		bodyModel[386].rotateAngleZ = 1.5707964f;

		bodyModel[387] = new ModelRendererTurbo(this, 287, 26, textureX, textureY); // Box 75
		bodyModel[387].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[387].setRotationPoint(-52.0f, 3.5f, -4.0f);
		bodyModel[387].rotateAngleY = 1.5707964f;
		bodyModel[387].rotateAngleZ = 1.5707964f;

		bodyModel[388] = new ModelRendererTurbo(this, 270, 12, textureX, textureY); // Box 76
		bodyModel[388].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0.05f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[388].setRotationPoint(-52.0f, 7.54f, -4.0f);
		bodyModel[388].rotateAngleY = 1.5707964f;
		bodyModel[388].rotateAngleZ = 1.5707964f;

		bodyModel[389] = new ModelRendererTurbo(this, 236, 38, textureX, textureY); // Box 77
		bodyModel[389].addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.2f, 0.05f, -0.3f, -0.2f, 0.05f, -0.3f, -0.4f, 0, -0.3f, -0.4f);
		bodyModel[389].setRotationPoint(-52.8f, 7.1f, 6.0f);
		bodyModel[389].rotateAngleY = 1.5707964f;

		bodyModel[390] = new ModelRendererTurbo(this, 199, 37, textureX, textureY); // Box 78
		bodyModel[390].addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.2f, 0, -0.5f);
		bodyModel[390].setRotationPoint(-53.1f, 7.1f, 6.0f);
		bodyModel[390].rotateAngleY = 1.5707964f;

		bodyModel[391] = new ModelRendererTurbo(this, 219, 26, textureX, textureY); // Box 79
		bodyModel[391].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[391].setRotationPoint(-49.05f, 4.5f, 7.5f);

		bodyModel[392] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 80
		bodyModel[392].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[392].setRotationPoint(-49.05f, 4.5f, 6.5f);

		bodyModel[393] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 81
		bodyModel[393].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[393].setRotationPoint(-49.05f, 5.5f, 6.5f);

		bodyModel[394] = new ModelRendererTurbo(this, 94, 25, textureX, textureY); // Box 82
		bodyModel[394].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f);
		bodyModel[394].setRotationPoint(-49.05f, 5.5f, 7.5f);

		bodyModel[395] = new ModelRendererTurbo(this, 334, 66, textureX, textureY); // Box 83
		bodyModel[395].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f);
		bodyModel[395].setRotationPoint(-34.7f, 2.8f, 6.61f);

		bodyModel[396] = new ModelRendererTurbo(this, 343, 36, textureX, textureY); // Box 84
		bodyModel[396].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[396].setRotationPoint(-34.7f, 5.1f, 6.61f);

		bodyModel[397] = new ModelRendererTurbo(this, 272, 66, textureX, textureY); // Box 89
		bodyModel[397].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f);
		bodyModel[397].setRotationPoint(-34.7f, 4.4f, 6.61f);

		bodyModel[398] = new ModelRendererTurbo(this, 107, 22, textureX, textureY); // Box 91
		bodyModel[398].addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f);
		bodyModel[398].setRotationPoint(-41.7f, 3.0f, 6.35f);

		bodyModel[399] = new ModelRendererTurbo(this, 263, 36, textureX, textureY); // Box 94
		bodyModel[399].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[399].setRotationPoint(-41.7f, 6.1f, 6.15f);

		bodyModel[400] = new ModelRendererTurbo(this, 119, 32, textureX, textureY); // Box 95
		bodyModel[400].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1);
		bodyModel[400].setRotationPoint(-41.7f, 5.8f, -7.39f);

		bodyModel[401] = new ModelRendererTurbo(this, 476, 12, textureX, textureY); // Box 97
		bodyModel[401].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.5f, -0.3f, -0.5f, 0.3f, -0.3f, -0.5f, -1.1f, -0.5f, -0.2f, -0.6f, -0.5f, -0.2f, -0.6f, -0.5f, -0.5f, -1.1f, -0.5f, -0.5f);
		bodyModel[401].setRotationPoint(-42.1f, 8.3f, -6.3f);
		bodyModel[401].rotateAngleZ = 2.3038347f;

		bodyModel[402] = new ModelRendererTurbo(this, 263, 66, textureX, textureY); // Box 99
		bodyModel[402].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0);
		bodyModel[402].setRotationPoint(-48.2f, 2.8f, -7.7f);

		bodyModel[403] = new ModelRendererTurbo(this, 66, 32, textureX, textureY); // Box 100
		bodyModel[403].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0);
		bodyModel[403].setRotationPoint(-48.2f, 5.1f, -7.7f);

		bodyModel[404] = new ModelRendererTurbo(this, 254, 66, textureX, textureY); // Box 101
		bodyModel[404].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0);
		bodyModel[404].setRotationPoint(-48.2f, 4.4f, -7.7f);

		bodyModel[405] = new ModelRendererTurbo(this, 453, 65, textureX, textureY); // Box 102
		bodyModel[405].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0);
		bodyModel[405].setRotationPoint(-34.7f, 2.8f, -7.7f);

		bodyModel[406] = new ModelRendererTurbo(this, 172, 31, textureX, textureY); // Box 103
		bodyModel[406].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0);
		bodyModel[406].setRotationPoint(-34.7f, 5.1f, -7.7f);

		bodyModel[407] = new ModelRendererTurbo(this, 228, 63, textureX, textureY); // Box 104
		bodyModel[407].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, -1.7f, -0.6f, 0, -1.7f, -0.6f, 0, -1.7f, 0, 0, -1.7f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0);
		bodyModel[407].setRotationPoint(-34.7f, 4.4f, -7.7f);

		bodyModel[408] = new ModelRendererTurbo(this, 431, 9, textureX, textureY); // Box 105
		bodyModel[408].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, -0.7f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.7f, -0.2f);
		bodyModel[408].setRotationPoint(-40.2f, 2.8f, -6.8f);

		bodyModel[409] = new ModelRendererTurbo(this, 302, 3, textureX, textureY); // Box 106
		bodyModel[409].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[409].setRotationPoint(-41.7f, 2.6f, -6.8f);

		bodyModel[410] = new ModelRendererTurbo(this, 369, 20, textureX, textureY); // Box 107
		bodyModel[410].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, 0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[410].setRotationPoint(-44.7f, 2.8f, -6.8f);

		bodyModel[411] = new ModelRendererTurbo(this, 495, 0, textureX, textureY); // Box 108
		bodyModel[411].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[411].setRotationPoint(-51.7f, 2.5f, -6.8f);

		bodyModel[412] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		bodyModel[412].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[412].setRotationPoint(-36.2f, 2.5f, -6.8f);

		bodyModel[413] = new ModelRendererTurbo(this, 119, 19, textureX, textureY); // Box 110
		bodyModel[413].addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0, -0.2f, -0.2f);
		bodyModel[413].setRotationPoint(-51.7f, 7.7f, -6.5f);

		bodyModel[414] = new ModelRendererTurbo(this, 411, 9, textureX, textureY); // Box 111
		bodyModel[414].addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0.3f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, -0.5f, 0.3f, -0.2f, -0.5f, -0.9f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.9f, -0.2f);
		bodyModel[414].setRotationPoint(-40.2f, 5.7f, -6.6f);
		bodyModel[414].rotateAngleX = 1.5707964f;

		bodyModel[415] = new ModelRendererTurbo(this, 436, 0, textureX, textureY); // Box 113
		bodyModel[415].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[415].setRotationPoint(-41.7f, 5.7f, -7.0f);
		bodyModel[415].rotateAngleX = 1.5707964f;

		bodyModel[416] = new ModelRendererTurbo(this, 270, 9, textureX, textureY); // Box 114
		bodyModel[416].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.1f, -0.2f, -0.5f, 0.3f, -0.2f, -0.5f, 0.3f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, -0.5f, -0.9f, -0.2f, -0.5f, -0.9f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[416].setRotationPoint(-45.2f, 5.7f, -6.6f);
		bodyModel[416].rotateAngleX = 1.5707964f;

		bodyModel[417] = new ModelRendererTurbo(this, 360, 0, textureX, textureY); // Box 115
		bodyModel[417].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[417].setRotationPoint(-47.2f, 5.7f, -6.6f);
		bodyModel[417].rotateAngleX = 1.5707964f;

		bodyModel[418] = new ModelRendererTurbo(this, 302, 0, textureX, textureY); // Box 116
		bodyModel[418].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f);
		bodyModel[418].setRotationPoint(-36.2f, 5.7f, -6.6f);
		bodyModel[418].rotateAngleX = 1.5707964f;

		bodyModel[419] = new ModelRendererTurbo(this, 474, 24, textureX, textureY); // Box 74
		bodyModel[419].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[419].setRotationPoint(-35.55f, 4.5f, 7.5f);

		bodyModel[420] = new ModelRendererTurbo(this, 461, 24, textureX, textureY); // Box 75
		bodyModel[420].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[420].setRotationPoint(-35.55f, 5.5f, 6.5f);

		bodyModel[421] = new ModelRendererTurbo(this, 425, 24, textureX, textureY); // Box 76
		bodyModel[421].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f);
		bodyModel[421].setRotationPoint(-35.55f, 5.5f, 7.5f);

		bodyModel[422] = new ModelRendererTurbo(this, 373, 9, textureX, textureY); // Box 77
		bodyModel[422].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.3f, -0.3f, -0.8f, -0.3f, -0.3f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0);
		bodyModel[422].setRotationPoint(-35.55f, 4.5f, 6.5f);

		bodyModel[423] = new ModelRendererTurbo(this, 202, 0, textureX, textureY); // Box 78
		bodyModel[423].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0.1f, -0.6f, 0, 0.1f, -0.6f, 0, 0.1f, 0, 0, 0.1f, 0);
		bodyModel[423].setRotationPoint(-41.7f, 2.8f, -7.0f);

		bodyModel[424] = new ModelRendererTurbo(this, 476, 8, textureX, textureY); // Box 70
		bodyModel[424].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.7f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.7f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f);
		bodyModel[424].setRotationPoint(-35.1f, 3.8f, -6.5f);
		bodyModel[424].rotateAngleZ = -2.3038347f;

		bodyModel[425] = new ModelRendererTurbo(this, 476, 4, textureX, textureY); // Box 71
		bodyModel[425].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.7f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.7f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.9f, -0.4f, -0.4f, -0.9f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f);
		bodyModel[425].setRotationPoint(-35.1f, 3.8f, 6.55f);
		bodyModel[425].rotateAngleZ = -2.3038347f;

		bodyModel[426] = new ModelRendererTurbo(this, 476, 0, textureX, textureY); // Box 72
		bodyModel[426].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.5f, -0.3f, -0.5f, 0.3f, -0.3f, -0.5f, -1.1f, -0.5f, -0.2f, -0.6f, -0.5f, -0.2f, -0.6f, -0.5f, -0.5f, -1.1f, -0.5f, -0.5f);
		bodyModel[426].setRotationPoint(-42.1f, 8.3f, 6.65f);
		bodyModel[426].rotateAngleZ = 2.3038347f;

		bodyModel[427] = new ModelRendererTurbo(this, 480, 49, textureX, textureY); // Box 57cp
		bodyModel[427].addShapeBox(0, 0, 0, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[427].setRotationPoint(-109.5f, -40.5f, 0.0f);

		bodyModel[428] = new ModelRendererTurbo(this, 15, 37, textureX, textureY); // Box 57cp
		bodyModel[428].addShapeBox(0, 0, 0, 0, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[428].setRotationPoint(-109.0f, -40.5f, -0.5f);

		bodyModel[429] = new ModelRendererTurbo(this, 471, 31, textureX, textureY); // Box 57cp
		bodyModel[429].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[429].setRotationPoint(-110.0f, -33.5f, -1.0f);

		bodyModel[430] = new ModelRendererTurbo(this, 316, 28, textureX, textureY); // Box 57cp
		bodyModel[430].addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[430].setRotationPoint(-110.0f, -30.5f, -1.0f);

		bodyModel[431] = new ModelRendererTurbo(this, 371, 31, textureX, textureY); // Box 57cp
		bodyModel[431].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -1.25f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, 0, -1.25f, -0.25f);
		bodyModel[431].setRotationPoint(-110.0f, -29.5f, -1.0f);

		bodyModel[432] = new ModelRendererTurbo(this, 343, 31, textureX, textureY); // Box 57cp
		bodyModel[432].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, 0.75f, -0.25f, 0.75f, -2, -0.25f, -1.5f, -1, -0.25f, -1.5f, -1, -0.25f, 0.75f, -2, -0.25f);
		bodyModel[432].setRotationPoint(-110.5f, -28.0f, -1.0f);

		bodyModel[433] = new ModelRendererTurbo(this, 119, 28, textureX, textureY); // Box 57cp
		bodyModel[433].addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, 1, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 1, -0.25f, 0.5f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f);
		bodyModel[433].setRotationPoint(-111.5f, -27.0f, -1.0f);

		bodyModel[434] = new ModelRendererTurbo(this, 66, 28, textureX, textureY); // Box 57cp
		bodyModel[434].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.5f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, -0.25f, 1, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 1, -0.25f);
		bodyModel[434].setRotationPoint(-111.5f, -26.5f, -1.0f);

		bodyModel[435] = new ModelRendererTurbo(this, 330, 27, textureX, textureY); // Box 57cp
		bodyModel[435].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, -1, -0.25f, -1.5f, -1, -0.25f, -1.5f, -1, -0.25f, -0.5f, -1, -0.25f);
		bodyModel[435].setRotationPoint(-109.5f, -24.75f, -1.0f);

		bodyModel[436] = new ModelRendererTurbo(this, 172, 26, textureX, textureY); // Box 57cp
		bodyModel[436].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.25f, -0.25f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -1.5f, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.25f, -1.5f, -1, -0.25f);
		bodyModel[436].setRotationPoint(-111.5f, -24.75f, -1.0f);

		bodyModel[437] = new ModelRendererTurbo(this, 330, 23, textureX, textureY); // Box 57cp
		bodyModel[437].addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -1.5f, 0.25f, -0.25f, -0.5f, 0, -0.25f, -0.25f, 1, -0.25f, -0.25f, 1, -0.25f, -0.5f, 0, -0.25f);
		bodyModel[437].setRotationPoint(-109.5f, -26.5f, -1.0f);

		bodyModel[438] = new ModelRendererTurbo(this, 316, 23, textureX, textureY); // Box 57cp
		bodyModel[438].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f);
		bodyModel[438].setRotationPoint(-110.5f, -25.75f, -1.0f);

		bodyModel[439] = new ModelRendererTurbo(this, 476, 0, textureX, textureY); // Box 66cp
		bodyModel[439].addBox(0, 0, 0, 1, 4, 16, 0f);
		bodyModel[439].setRotationPoint(11.0f, -4.0f, -8.0f);

		bodyModel[440] = new ModelRendererTurbo(this, 483, 24, textureX, textureY); // Box 66cp
		bodyModel[440].addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0);
		bodyModel[440].setRotationPoint(21.0f, -10.0f, -3.5f);

		bodyModel[441] = new ModelRendererTurbo(this, 477, 49, textureX, textureY); // Box 66cp
		bodyModel[441].addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -2, 0, 0, 1, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 2, 0);
		bodyModel[441].setRotationPoint(21.0f, -10.0f, -9.5f);

		bodyModel[442] = new ModelRendererTurbo(this, 456, 49, textureX, textureY); // Box 66cp
		bodyModel[442].addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, -2, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -1, 0, 0, 2, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 1, 0);
		bodyModel[442].setRotationPoint(21.0f, -10.0f, 4.0f);

		bodyModel[443] = new ModelRendererTurbo(this, 250, 54, textureX, textureY); // Box 66cp
		bodyModel[443].addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, -5, 0.5f, 0, -1, 0.5f, 0, 0, 0, 0, -3, 0, 0, 5, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 3, 0);
		bodyModel[443].setRotationPoint(15.0f, -9.0f, 4.0f);

		bodyModel[444] = new ModelRendererTurbo(this, 94, 25, textureX, textureY); // Box 66cp
		bodyModel[444].addShapeBox(0, 0, 0, 3, 0, 6, 0, 0, -5, 0.5f, 0, -2, 0.5f, 0, 0, 0, 0, -3, 0, 0, 5, 0.5f, 0, 2, 0.5f, 0, 0, 0, 0, 3, 0);
		bodyModel[444].setRotationPoint(12.0f, -6.0f, 4.0f);

		bodyModel[445] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 66cp
		bodyModel[445].addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0.5f, 0, -5, 0.5f, 0, 3, 0, 0, 0, 0, 0, 1, 0.5f, 0, 5, 0.5f);
		bodyModel[445].setRotationPoint(15.0f, -9.0f, -10.0f);

		bodyModel[446] = new ModelRendererTurbo(this, 461, 24, textureX, textureY); // Box 66cp
		bodyModel[446].addShapeBox(0, 0, 0, 3, 0, 6, 0, 0, -3, 0, 0, 0, 0, 0, -2, 0.5f, 0, -5, 0.5f, 0, 3, 0, 0, 0, 0, 0, 2, 0.5f, 0, 5, 0.5f);
		bodyModel[446].setRotationPoint(12.0f, -6.0f, -10.0f);

		bodyModel[447] = new ModelRendererTurbo(this, 38, 47, textureX, textureY); // Box 66cp
		bodyModel[447].addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0);
		bodyModel[447].setRotationPoint(15.0f, -8.0f, -3.5f);

		bodyModel[448] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // Box 66cp
		bodyModel[448].addShapeBox(0, 0, 0, 3, 0, 7, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0);
		bodyModel[448].setRotationPoint(12.0f, -4.0f, -3.5f);

	}

}
