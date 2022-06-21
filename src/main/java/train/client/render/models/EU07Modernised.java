//FMT-Marker DFM-1.0
//Creator: IceWelder

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.3 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class EU07Modernised extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;

	public EU07Modernised(){
		bodyModel = new ModelRendererTurbo[305];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 78, 2, 22, 0f);
		bodyModel[0].setRotationPoint(-39.0f, 0.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 38, 139, textureX, textureY);
		bodyModel[1].addShapeBox(0, 0, 0, 1, 11, 8, 0, 1, 0, 0, -1, 0, 0, -3, 0, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1);
		bodyModel[1].setRotationPoint(38.0f, -11.0f, 3.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 207, 148, textureX, textureY);
		bodyModel[2].addShapeBox(0, 0, 0, 1, 11, 6, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(38.0f, -11.0f, -3.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 129, 135, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 1, 7, 8, 0, 2, 0, 0, -2, 0, 0, -3.5f, 0, 0, 2.5f, 0, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 0, -1);
		bodyModel[3].setRotationPoint(37.0f, -18.0f, 3.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 57, 147, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 1, 7, 6, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(37.0f, -18.0f, -3.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 179, 83, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, 0, 0, 0, -3, 0, -1.5f, -3, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(29.0f, -21.0f, 3.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 179, 115, textureX, textureY);
		bodyModel[6].addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[6].setRotationPoint(29.0f, -21.0f, -3.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 210, 93, textureX, textureY);
		bodyModel[7].addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(34.0f, -18.0f, 10.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 28, 151, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[8].setRotationPoint(34.0f, -11.0f, 10.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 248, 148, textureX, textureY);
		bodyModel[9].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[9].setRotationPoint(34.0f, -11.0f, -11.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 237, 76, textureX, textureY); // test
		bodyModel[10].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[10].setRotationPoint(36.65f, -4.0f, 6.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 206, 120, textureX, textureY); // test
		bodyModel[11].addBox(0, 0, 0, 8, 3, 3, 0f);
		bodyModel[11].setRotationPoint(29.0f, -21.01f, -1.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 118, 45, textureX, textureY);
		bodyModel[12].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[12].setRotationPoint(38.0f, -3.0f, -2.5f);

		bodyModel[13] = new ModelRendererTurbo(this, 75, 93, textureX, textureY);
		bodyModel[13].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[13].setRotationPoint(38.0f, -9.0f, -1.5f);

		bodyModel[14] = new ModelRendererTurbo(this, 54, 81, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[14].setRotationPoint(39.0f, -8.5f, -1.5f);

		bodyModel[15] = new ModelRendererTurbo(this, 79, 80, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(39.0f, -8.0f, -0.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 74, 80, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(39.0f, -9.0f, 0.5f);

		bodyModel[17] = new ModelRendererTurbo(this, 0, 147, textureX, textureY);
		bodyModel[17].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[17].setRotationPoint(27.0f, -18.0f, 10.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 66, 93, textureX, textureY);
		bodyModel[18].addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(34.0f, -18.0f, -11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 110, 135, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 1, 7, 8, 0, 2.5f, 0, -1, -3.5f, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[19].setRotationPoint(37.0f, -18.0f, -11.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 27, 65, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, -2, 0, -1.5f, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(29.0f, -21.0f, -11.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 91, 135, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 1, 11, 8, 0, -1, 0, 0, 1, 0, 0, 2, 0, -1, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0);
		bodyModel[21].setRotationPoint(-39.0f, -11.0f, 3.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 222, 142, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 1, 11, 6, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-39.0f, -11.0f, -3.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 72, 135, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 1, 11, 8, 0, -3, 0, 0, 2, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(-39.0f, -11.0f, -11.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 19, 135, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 1, 7, 8, 0, -2, 0, 0, 2, 0, 0, 2.5f, 0, -1, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, -2, 0, 0);
		bodyModel[24].setRotationPoint(-38.0f, -18.0f, 3.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 1, 7, 8, 0, -3.5f, 0, 0, 2.5f, 0, -1, 2, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(-38.0f, -18.0f, -11.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 240, 114, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 1, 7, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(-38.0f, -18.0f, -3.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0, -1.82f, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(36.0f, -11.0f, 10.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 241, 89, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 3, 7, 1, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[28].setRotationPoint(-37.0f, -18.0f, 10.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 182, 144, textureX, textureY);
		bodyModel[29].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[29].setRotationPoint(-36.0f, -11.0f, 10.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 165, 144, textureX, textureY);
		bodyModel[30].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[30].setRotationPoint(-34.0f, -18.0f, 10.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 219, 61, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 7, 3, 8, 0, 0, -3, 0, 0, 0, 0, 0, -2, 0, -1.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0);
		bodyModel[31].setRotationPoint(-36.0f, -21.0f, 3.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 7, 3, 8, 0, -1.5f, -3, 0, 0, -2, 0, 0, 0, 0, 0, -3, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(-36.0f, -21.0f, -11.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 152, 115, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[33].setRotationPoint(-36.0f, -21.0f, -3.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 42, 119, textureX, textureY); // test
		bodyModel[34].addBox(0, 0, 0, 8, 3, 3, 0f);
		bodyModel[34].setRotationPoint(-37.0f, -21.01f, -1.5f);

		bodyModel[35] = new ModelRendererTurbo(this, 55, 74, textureX, textureY); // test
		bodyModel[35].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[35].setRotationPoint(-39.0f, -4.0f, 6.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 232, 128, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 1, 11, 8, 0, 2, 0, -1, -3, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(38.0f, -11.0f, -11.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 121, 151, textureX, textureY); // door swing right
		bodyModel[37].addBox(0, 0, -1, 4, 16, 1, 0f);
		bodyModel[37].setRotationPoint(23.0f, -18.0f, 11.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 74, 76, textureX, textureY);
		bodyModel[38].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[38].setRotationPoint(23.0f, -2.0f, 10.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 110, 151, textureX, textureY); // door swing left
		bodyModel[39].addBox(-4, 0, 0, 4, 16, 1, 0f);
		bodyModel[39].setRotationPoint(27.0f, -18.0f, -11.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 245, 75, textureX, textureY);
		bodyModel[40].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[40].setRotationPoint(23.0f, -2.0f, -11.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 17, 151, textureX, textureY); // door swing left
		bodyModel[41].addBox(0, 0, -1, 4, 16, 1, 0f);
		bodyModel[41].setRotationPoint(-27.0f, -18.0f, 11.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 224, 89, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 3, 7, 1, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[42].setRotationPoint(-37.0f, -18.0f, -11.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 244, 101, textureX, textureY);
		bodyModel[43].addBox(0, 0, 0, 2, 11, 1, 0f);
		bodyModel[43].setRotationPoint(-36.0f, -11.0f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 148, 144, textureX, textureY);
		bodyModel[44].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[44].setRotationPoint(-34.0f, -18.0f, -11.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 237, 148, textureX, textureY); // door swing right
		bodyModel[45].addBox(-4, 0, 0, 4, 16, 1, 0f);
		bodyModel[45].setRotationPoint(-23.0f, -18.0f, -11.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 74, 72, textureX, textureY);
		bodyModel[46].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[46].setRotationPoint(-27.0f, -2.0f, 10.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 179, 25, textureX, textureY);
		bodyModel[47].addBox(0, 0, 0, 4, 2, 1, 0f);
		bodyModel[47].setRotationPoint(-27.0f, -2.0f, -11.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 127, 29, textureX, textureY);
		bodyModel[48].addBox(0, 0, 0, 58, 3, 6, 0f);
		bodyModel[48].setRotationPoint(-29.0f, -21.0f, -3.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
		bodyModel[49].addBox(0, 0, 0, 46, 18, 1, 0f);
		bodyModel[49].setRotationPoint(-23.0f, -18.0f, 10.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 133, 39, textureX, textureY);
		bodyModel[50].addBox(0, 0, 0, 46, 18, 1, 0f);
		bodyModel[50].setRotationPoint(-23.0f, -18.0f, -11.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 132, 106, textureX, textureY);
		bodyModel[51].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[51].setRotationPoint(-21.0f, -17.0f, 11.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 132, 99, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[52].setRotationPoint(-5.0f, -17.0f, 11.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 42, 96, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[53].setRotationPoint(5.0f, -17.0f, 11.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 109, 96, textureX, textureY);
		bodyModel[54].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[54].setRotationPoint(22.0f, -18.0f, -10.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 66, 96, textureX, textureY);
		bodyModel[55].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[55].setRotationPoint(-23.0f, -18.0f, -10.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 21, 113, textureX, textureY);
		bodyModel[56].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[56].setRotationPoint(38.0f, 2.0f, -9.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 250, 79, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(38.0f, 2.0f, -10.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 185, 72, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[58].setRotationPoint(38.0f, 2.0f, 9.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 179, 16, textureX, textureY);
		bodyModel[59].addBox(0, 0, 0, 4, 2, 2, 0f);
		bodyModel[59].setRotationPoint(39.0f, 3.0f, -1.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 0, 109, textureX, textureY);
		bodyModel[60].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[60].setRotationPoint(-39.0f, 2.0f, -9.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 250, 68, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[61].setRotationPoint(-39.0f, 2.0f, 9.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 61, 68, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(-39.0f, 2.0f, -10.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 27, 68, textureX, textureY);
		bodyModel[63].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[63].setRotationPoint(39.0f, 3.0f, 6.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 210, 87, textureX, textureY);
		bodyModel[64].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[64].setRotationPoint(40.0f, 2.5f, 5.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 50, 87, textureX, textureY);
		bodyModel[65].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[65].setRotationPoint(40.0f, 2.5f, -8.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 61, 65, textureX, textureY);
		bodyModel[66].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[66].setRotationPoint(39.0f, 3.0f, -7.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // unnamed
		bodyModel[67].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[67].setRotationPoint(36.8f, -3.0f, 6.01f);

		bodyModel[68] = new ModelRendererTurbo(this, 232, 3, textureX, textureY); // unnamed
		bodyModel[68].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[68].setRotationPoint(36.8f, -3.0f, -7.01f);

		bodyModel[69] = new ModelRendererTurbo(this, 223, 115, textureX, textureY);
		bodyModel[69].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[69].setRotationPoint(-9.5f, -21.0f, 8.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 200, 115, textureX, textureY);
		bodyModel[70].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[70].setRotationPoint(0.5f, -21.0f, 8.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 42, 114, textureX, textureY);
		bodyModel[71].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[71].setRotationPoint(0.5f, -22.0f, 3.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 89, 111, textureX, textureY);
		bodyModel[72].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[72].setRotationPoint(-9.5f, -22.0f, 3.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 42, 109, textureX, textureY);
		bodyModel[73].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[73].setRotationPoint(0.5f, -21.0f, -10.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 106, 104, textureX, textureY);
		bodyModel[74].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[74].setRotationPoint(-9.5f, -21.0f, -10.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 106, 99, textureX, textureY);
		bodyModel[75].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[75].setRotationPoint(0.5f, -22.0f, -5.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 232, 12, textureX, textureY);
		bodyModel[76].addBox(0, 0, 0, 9, 2, 2, 0f);
		bodyModel[76].setRotationPoint(-9.5f, -22.0f, -5.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 27, 65, textureX, textureY);
		bodyModel[77].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[77].setRotationPoint(10.0f, -21.0f, 4.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 219, 64, textureX, textureY);
		bodyModel[78].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[78].setRotationPoint(21.0f, -21.0f, 4.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 164, 62, textureX, textureY);
		bodyModel[79].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[79].setRotationPoint(21.0f, -21.0f, -5.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 219, 61, textureX, textureY);
		bodyModel[80].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[80].setRotationPoint(10.0f, -21.0f, -5.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 129, 84, textureX, textureY);
		bodyModel[81].addShapeBox(0, 0, 0, 12, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[81].setRotationPoint(10.0f, -22.0f, -5.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 164, 59, textureX, textureY);
		bodyModel[82].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[82].setRotationPoint(-11.0f, -21.0f, 4.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 84, 84, textureX, textureY);
		bodyModel[83].addShapeBox(0, 0, 0, 12, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(-22.0f, -22.0f, -5.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 126, 55, textureX, textureY);
		bodyModel[84].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[84].setRotationPoint(-22.0f, -21.0f, 4.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 228, 54, textureX, textureY);
		bodyModel[85].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[85].setRotationPoint(-11.0f, -21.0f, -5.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 126, 52, textureX, textureY);
		bodyModel[86].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[86].setRotationPoint(-22.0f, -21.0f, -5.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 89, 99, textureX, textureY);
		bodyModel[87].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[87].setRotationPoint(14.5f, -22.5f, -5.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 174, 69, textureX, textureY); // test
		bodyModel[88].addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(36.65f, -4.0f, -9.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // desk6
		bodyModel[89].addShapeBox(0, 0, 0, 2, 11, 7, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[89].setRotationPoint(36.0f, -11.0f, -10.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 53, 128, textureX, textureY); // desk9
		bodyModel[90].addShapeBox(0, 0, 0, 2, 11, 7, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(36.0f, -11.0f, 3.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 21, 109, textureX, textureY); // desk8
		bodyModel[91].addShapeBox(0, 0, 0, 2, 11, 6, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[91].setRotationPoint(36.0f, -11.0f, -3.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 199, 83, textureX, textureY); // desk7
		bodyModel[92].addBox(0, 0, 0, 2, 11, 20, 0f);
		bodyModel[92].setRotationPoint(34.0f, -11.0f, -10.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 47, 65, textureX, textureY); // desk5
		bodyModel[93].addBox(0, 0, 0, 3, 1, 20, 0f);
		bodyModel[93].setRotationPoint(31.0f, -11.0f, -10.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 43, 87, textureX, textureY); // desk9
		bodyModel[94].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0);
		bodyModel[94].setRotationPoint(33.0f, -10.0f, -10.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 179, 7, textureX, textureY);
		bodyModel[95].addBox(0, 0, 0, 4, 2, 2, 0f);
		bodyModel[95].setRotationPoint(-43.0f, 3.0f, -1.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 228, 51, textureX, textureY);
		bodyModel[96].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[96].setRotationPoint(-40.0f, 3.0f, 6.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 9, 87, textureX, textureY);
		bodyModel[97].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[97].setRotationPoint(-41.0f, 2.5f, 5.0f);

		bodyModel[98] = new ModelRendererTurbo(this, 9, 79, textureX, textureY);
		bodyModel[98].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[98].setRotationPoint(-41.0f, 2.5f, -8.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 228, 48, textureX, textureY);
		bodyModel[99].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[99].setRotationPoint(-40.0f, 3.0f, -7.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		bodyModel[100].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[100].setRotationPoint(12.0f, -17.0f, -11.25f);

		bodyModel[101] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[101].setRotationPoint(-4.0f, -17.0f, -11.25f);

		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[102].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[102].setRotationPoint(-14.0f, -17.0f, -11.25f);

		bodyModel[103] = new ModelRendererTurbo(this, 23, 96, textureX, textureY); // Box 136
		bodyModel[103].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[103].setRotationPoint(24.0f, -4.0f, -4.0f);
		bodyModel[103].rotateAngleY = 6.2831855f;

		bodyModel[104] = new ModelRendererTurbo(this, 190, 141, textureX, textureY);
		bodyModel[104].addBox(0, 0, 0, 7, 18, 1, 0f);
		bodyModel[104].setRotationPoint(27.0f, -18.0f, -11.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 190, 125, textureX, textureY); // Box 136cp
		bodyModel[105].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[105].setRotationPoint(24.0f, -11.0f, -4.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 224, 89, textureX, textureY);
		bodyModel[106].addBox(0, 0, 0, 3, 1, 10, 0f);
		bodyModel[106].setRotationPoint(-17.5f, -22.5f, -5.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[107].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[107].setRotationPoint(-39.0f, -9.0f, -1.5f);

		bodyModel[108] = new ModelRendererTurbo(this, 250, 31, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[108].setRotationPoint(-39.5f, -8.5f, 0.5f);

		bodyModel[109] = new ModelRendererTurbo(this, 125, 28, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[109].setRotationPoint(-39.5f, -8.0f, -0.5f);

		bodyModel[110] = new ModelRendererTurbo(this, 250, 27, textureX, textureY);
		bodyModel[110].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-39.5f, -9.0f, -1.5f);

		bodyModel[111] = new ModelRendererTurbo(this, 74, 65, textureX, textureY); // test
		bodyModel[111].addBox(0, 0, 0, 2, 3, 3, 0f);
		bodyModel[111].setRotationPoint(-39.0f, -4.0f, -9.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 211, 3, textureX, textureY); // unnamedcp
		bodyModel[112].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[112].setRotationPoint(-39.2f, -3.0f, 6.01f);

		bodyModel[113] = new ModelRendererTurbo(this, 196, 3, textureX, textureY); // unnamedcp
		bodyModel[113].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[113].setRotationPoint(-39.2f, -3.0f, -7.01f);

		bodyModel[114] = new ModelRendererTurbo(this, 85, 59, textureX, textureY);
		bodyModel[114].addBox(0, 0, 0, 34, 14, 10, 0f);
		bodyModel[114].setRotationPoint(-17.0f, -14.0f, -5.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 164, 84, textureX, textureY);
		bodyModel[115].addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.82f, 0, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, 0, 0, 0, 0, 0);
		bodyModel[115].setRotationPoint(36.0f, -10.0f, 10.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 50, 65, textureX, textureY);
		bodyModel[116].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -2.9f, 0, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[116].setRotationPoint(36.0f, -5.0f, 10.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 0, 65, textureX, textureY);
		bodyModel[117].addShapeBox(0, 0, 0, 4, 5, 1, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2.9f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[117].setRotationPoint(-40.0f, -5.0f, 10.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 242, 61, textureX, textureY);
		bodyModel[118].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -2.9f, 0, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[118].setRotationPoint(36.0f, -5.0f, -11.0f);

		bodyModel[119] = new ModelRendererTurbo(this, 236, 45, textureX, textureY);
		bodyModel[119].addShapeBox(0, 0, 0, 4, 5, 1, 0, -2.9f, 0, 0, 0, 0, 0, 0, 0, 0, -2.9f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[119].setRotationPoint(-40.0f, -5.0f, -11.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 171, 125, textureX, textureY); // desk4
		bodyModel[120].addShapeBox(0, 0, 0, 2, 11, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[120].setRotationPoint(-38.0f, -11.0f, 3.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 152, 125, textureX, textureY); // desk2
		bodyModel[121].addShapeBox(0, 0, 0, 2, 11, 7, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[121].setRotationPoint(-38.0f, -11.0f, -10.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // desk
		bodyModel[122].addShapeBox(0, 0, 0, 2, 11, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[122].setRotationPoint(-38.0f, -11.0f, -3.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // desk1
		bodyModel[123].addBox(0, 0, 0, 3, 1, 20, 0f);
		bodyModel[123].setRotationPoint(-34.0f, -11.0f, -10.0f);

		bodyModel[124] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // desk10
		bodyModel[124].addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		bodyModel[124].setRotationPoint(-34.0f, -10.0f, -10.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 232, 0, textureX, textureY); // Box 136cp
		bodyModel[125].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[125].setRotationPoint(25.0f, -3.0f, -4.0f);
		bodyModel[125].rotateAngleY = 6.2831855f;

		bodyModel[126] = new ModelRendererTurbo(this, 196, 0, textureX, textureY); // Box 136cp
		bodyModel[126].addBox(0, 0, 0, 3, 3, 8, 0f);
		bodyModel[126].setRotationPoint(-28.0f, -3.0f, -4.0f);
		bodyModel[126].rotateAngleY = 6.2831855f;

		bodyModel[127] = new ModelRendererTurbo(this, 164, 59, textureX, textureY); // Box 136cp
		bodyModel[127].addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[127].setRotationPoint(-29.0f, -4.0f, -4.0f);
		bodyModel[127].rotateAngleY = 6.2831855f;

		bodyModel[128] = new ModelRendererTurbo(this, 221, 120, textureX, textureY); // Box 136cp
		bodyModel[128].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[128].setRotationPoint(-25.0f, -11.0f, -4.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 232, 0, textureX, textureY);
		bodyModel[129].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0, -1.82f, 0, 0, 0, 0, 0);
		bodyModel[129].setRotationPoint(36.0f, -11.0f, -11.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 128, 84, textureX, textureY);
		bodyModel[130].addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.82f, 0, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, 0, 0, 0, 0, 0);
		bodyModel[130].setRotationPoint(36.0f, -10.0f, -11.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 119, 84, textureX, textureY);
		bodyModel[131].addShapeBox(0, 0, 0, 3, 5, 1, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -2.82f, 0, 0, -1.9f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0);
		bodyModel[131].setRotationPoint(-39.0f, -10.0f, 10.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 211, 0, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0);
		bodyModel[132].setRotationPoint(-38.0f, -11.0f, 10.0f);

		bodyModel[133] = new ModelRendererTurbo(this, 202, 83, textureX, textureY);
		bodyModel[133].addShapeBox(0, 0, 0, 3, 5, 1, 0, -2.82f, 0, 0, 0, 0, 0, 0, 0, 0, -2.82f, 0, 0, -1.9f, 0, 0, 0, 0, 0, 0, 0, 0, -1.9f, 0, 0);
		bodyModel[133].setRotationPoint(-39.0f, -10.0f, -11.0f);

		bodyModel[134] = new ModelRendererTurbo(this, 196, 0, textureX, textureY);
		bodyModel[134].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.82f, -1, 0, 0, 0, 0, 0, 0, 0, -1.82f, -1, 0, -1.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.82f, 0, 0);
		bodyModel[134].setRotationPoint(-38.0f, -11.0f, -11.0f);

		bodyModel[135] = new ModelRendererTurbo(this, 182, 69, textureX, textureY); // horny4
		bodyModel[135].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[135].setRotationPoint(29.0f, -20.75f, 2.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 250, 20, textureX, textureY); // horny5
		bodyModel[136].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[136].setRotationPoint(32.0f, -20.75f, 2.5f);

		bodyModel[137] = new ModelRendererTurbo(this, 82, 65, textureX, textureY); // horny7
		bodyModel[137].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[137].setRotationPoint(29.0f, -20.75f, -4.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 250, 17, textureX, textureY); // horny6
		bodyModel[138].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0.2f, -0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.2f, -0.2f, 0, -0.2f, 0.2f, 0, -0.5f, 0);
		bodyModel[138].setRotationPoint(32.0f, -20.75f, -4.0f);

		bodyModel[139] = new ModelRendererTurbo(this, 247, 50, textureX, textureY); // horny1
		bodyModel[139].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[139].setRotationPoint(-32.0f, -20.75f, 2.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 190, 25, textureX, textureY); // horny2
		bodyModel[140].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[140].setRotationPoint(-32.0f, -20.75f, -4.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 187, 0, textureX, textureY); // horny
		bodyModel[141].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[141].setRotationPoint(-33.0f, -20.75f, 2.5f);

		bodyModel[142] = new ModelRendererTurbo(this, 179, 0, textureX, textureY); // horny3
		bodyModel[142].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0.2f, 0.2f, 0, -0.2f, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.2f, 0.2f);
		bodyModel[142].setRotationPoint(-33.0f, -20.75f, -4.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 66, 93, textureX, textureY);
		bodyModel[143].addShapeBox(0, 0, 0, 0, 4, 9, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 3, 0, 0, -3, 0, 0);
		bodyModel[143].setRotationPoint(38.0f, 5.0f, -9.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[144].addShapeBox(0, 0, 0, 0, 4, 9, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 1, 0, 0, -1, 0, 0);
		bodyModel[144].setRotationPoint(38.0f, 5.0f, 0.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 0, 65, textureX, textureY);
		bodyModel[145].addShapeBox(0, 0, 0, 0, 4, 9, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -1, 0, 0, 1, 0, 0);
		bodyModel[145].setRotationPoint(-38.0f, 5.0f, 0.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 236, 45, textureX, textureY);
		bodyModel[146].addShapeBox(0, 0, 0, 0, 4, 9, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -3, 0, 0, 3, 0, 0);
		bodyModel[146].setRotationPoint(-38.0f, 5.0f, -9.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 174, 59, textureX, textureY);
		bodyModel[147].addBox(0, 0, 0, 13, 5, 18, 0f);
		bodyModel[147].setRotationPoint(-2.5f, 2.0f, -9.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 201, 0, textureX, textureY);
		bodyModel[148].addBox(0, 0, 0, 6, 5, 18, 0f);
		bodyModel[148].setRotationPoint(-9.5f, 2.0f, -9.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 141, 151, textureX, textureY); // unnamedcp
		bodyModel[149].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[149].setRotationPoint(31.0f, -18.0f, 12.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 138, 151, textureX, textureY); // unnamedcp
		bodyModel[150].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[150].setRotationPoint(27.0f, -18.0f, 12.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 135, 151, textureX, textureY); // unnamedcp
		bodyModel[151].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[151].setRotationPoint(-19.0f, -18.0f, 12.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 132, 151, textureX, textureY); // unnamed
		bodyModel[152].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[152].setRotationPoint(-23.0f, -18.0f, 12.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 35, 151, textureX, textureY); // unnamedcp
		bodyModel[153].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[153].setRotationPoint(-23.0f, -18.0f, -10.5f);

		bodyModel[154] = new ModelRendererTurbo(this, 251, 128, textureX, textureY); // unnamedcp
		bodyModel[154].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[154].setRotationPoint(-19.0f, -18.0f, -10.5f);

		bodyModel[155] = new ModelRendererTurbo(this, 253, 101, textureX, textureY); // unnamedcp
		bodyModel[155].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[155].setRotationPoint(27.0f, -18.0f, -10.5f);

		bodyModel[156] = new ModelRendererTurbo(this, 251, 84, textureX, textureY); // unnamedcp
		bodyModel[156].addShapeBox(-4, 0, -1, 0, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[156].setRotationPoint(31.0f, -18.0f, -10.5f);

		bodyModel[157] = new ModelRendererTurbo(this, 0, 79, textureX, textureY);
		bodyModel[157].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[157].setRotationPoint(23.0f, 2.0f, 11.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 11, 65, textureX, textureY);
		bodyModel[158].addBox(0, 0, 0, 4, 6, 0, 0f);
		bodyModel[158].setRotationPoint(-27.0f, 2.0f, 11.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 183, 59, textureX, textureY);
		bodyModel[159].addBox(0, 0, 0, 4, 6, 0, 0f);
		bodyModel[159].setRotationPoint(23.0f, 2.0f, -11.0f);

		bodyModel[160] = new ModelRendererTurbo(this, 247, 45, textureX, textureY);
		bodyModel[160].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[160].setRotationPoint(-27.0f, 2.0f, -11.0f);

		bodyModel[161] = new ModelRendererTurbo(this, 192, 16, textureX, textureY);
		bodyModel[161].addBox(0, 0, 0, 2, 1, 2, 0f);
		bodyModel[161].setRotationPoint(23.0f, 2.0f, -1.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 210, 12, textureX, textureY);
		bodyModel[162].addBox(0, 0, 0, 2, 1, 2, 0f);
		bodyModel[162].setRotationPoint(-24.0f, 2.0f, -1.0f);

		bodyModel[163] = new ModelRendererTurbo(this, 247, 3, textureX, textureY);
		bodyModel[163].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[163].setRotationPoint(-27.0f, 6.0f, -11.0f);

		bodyModel[164] = new ModelRendererTurbo(this, 247, 0, textureX, textureY);
		bodyModel[164].addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[164].setRotationPoint(23.0f, 6.0f, 11.0f);

		bodyModel[165] = new ModelRendererTurbo(this, 179, 0, textureX, textureY);
		bodyModel[165].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[165].setRotationPoint(-39.0f, -3.0f, -2.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 154, 83, textureX, textureY); // desk
		bodyModel[166].addBox(0, 0, 0, 2, 11, 20, 0f);
		bodyModel[166].setRotationPoint(-36.0f, -11.0f, -10.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[167].addShapeBox(0, 0, 0, 58, 1, 8, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[167].setRotationPoint(-29.0f, -19.0f, 3.0f);

		bodyModel[168] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[168].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, -1, 1, 0, -1, 1, 0, 0, -1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0);
		bodyModel[168].setRotationPoint(-16.0f, -23.5f, 4.01f);

		bodyModel[169] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[169].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, -1, 1, 0, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, -2, 0);
		bodyModel[169].setRotationPoint(-28.0f, -23.5f, 4.01f);

		bodyModel[170] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[170].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, -1, 1, 0, -1, 1, 0, 0, -1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0);
		bodyModel[170].setRotationPoint(-16.0f, -23.5f, -4.99f);

		bodyModel[171] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[171].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, -1, 1, 0, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, -2, 0);
		bodyModel[171].setRotationPoint(-28.0f, -23.5f, -4.99f);

		bodyModel[172] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[172].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 4, 0, 0, -1, 0, 0, -1, 0, -1, 4, 0, 0, -5, 0, -1, 0, 0, -1, 0, 0, 0, -5, 0);
		bodyModel[172].setRotationPoint(4.0f, -23.5f, 4.01f);

		bodyModel[173] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[173].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, -1, 4, 0, -1, 4, 0, 0, -1, 0, -1, 0, 0, 0, -5, 0, 0, -5, 0, -1, 0, 0);
		bodyModel[173].setRotationPoint(16.0f, -23.5f, 4.01f);

		bodyModel[174] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[174].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, -1, 4, 0, -1, 4, 0, 0, -1, 0, -1, 0, 0, 0, -5, 0, 0, -5, 0, -1, 0, 0);
		bodyModel[174].setRotationPoint(16.0f, -23.5f, -4.99f);

		bodyModel[175] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[175].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 4, 0, 0, -1, 0, 0, -1, 0, -1, 4, 0, 0, -5, 0, -1, 0, 0, -1, 0, 0, 0, -5, 0);
		bodyModel[175].setRotationPoint(4.0f, -23.5f, -4.99f);

		bodyModel[176] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[176].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -5, 0, -1, 0, 0, -1, 0, 0, 0, -5, 0, -1, 4, 0, 0, -1, 0, 0, -1, 0, -1, 4, 0);
		bodyModel[176].setRotationPoint(4.0f, -32.5f, -4.99f);

		bodyModel[177] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[177].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 0, 0, -5, 0, 0, -5, 0, -1, 0, 0, 0, -1, 0, -1, 4, 0, -1, 4, 0, 0, -1, 0);
		bodyModel[177].setRotationPoint(16.0f, -32.5f, -4.99f);

		bodyModel[178] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[178].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 0, 0, -5, 0, 0, -5, 0, -1, 0, 0, 0, -1, 0, -1, 4, 0, -1, 4, 0, 0, -1, 0);
		bodyModel[178].setRotationPoint(16.0f, -32.5f, 4.01f);

		bodyModel[179] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[179].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -5, 0, -1, 0, 0, -1, 0, 0, 0, -5, 0, -1, 4, 0, 0, -1, 0, 0, -1, 0, -1, 4, 0);
		bodyModel[179].setRotationPoint(4.0f, -32.5f, 4.01f);

		bodyModel[180] = new ModelRendererTurbo(this, 179, 0, textureX, textureY);
		bodyModel[180].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[180].setRotationPoint(15.5f, -33.5f, -7.01f);

		bodyModel[181] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[181].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[181].setRotationPoint(15.5f, -33.5f, 6.99f);

		bodyModel[182] = new ModelRendererTurbo(this, 0, 38, textureX, textureY);
		bodyModel[182].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[182].setRotationPoint(15.5f, -32.5f, 6.99f);

		bodyModel[183] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[183].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[183].setRotationPoint(15.5f, -33.5f, -8.01f);

		bodyModel[184] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[184].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[184].setRotationPoint(15.5f, -32.5f, -8.01f);

		bodyModel[185] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[185].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -2, 0, -1, 3, 9, -1, 3, -9, 0, -2, 0, -1, 1, 0, 0, -4, 9, 0, -4, -9, -1, 1, 0);
		bodyModel[185].setRotationPoint(4.0f, -29.5f, 4.01f);

		bodyModel[186] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[186].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 3, 9, 0, -2, 0, 0, -2, 0, -1, 3, -9, 0, -4, 9, -1, 1, 0, -1, 1, 0, 0, -4, -9);
		bodyModel[186].setRotationPoint(16.0f, -29.5f, 4.01f);

		bodyModel[187] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[187].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 0, -1, 0, -1, 1, 0, -1, 1, 0, 0, -1, 0);
		bodyModel[187].setRotationPoint(-16.0f, -26.5f, 4.01f);

		bodyModel[188] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[188].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, -2, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, -1, 1, 0);
		bodyModel[188].setRotationPoint(-28.0f, -26.5f, 4.01f);

		bodyModel[189] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[189].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, -2, 0, -1, 1, 0, 0, -1, 0, 0, -1, 0, -1, 1, 0);
		bodyModel[189].setRotationPoint(-28.0f, -26.5f, -4.99f);

		bodyModel[190] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 0, -1, 0, -1, 1, 0, -1, 1, 0, 0, -1, 0);
		bodyModel[190].setRotationPoint(-16.0f, -26.5f, -4.99f);

		bodyModel[191] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[191].addShapeBox(0, 0, 0, 12, 1, 1, 0, -1, 0, -9, 0, -2, 0, 0, -2, 0, -1, 0, 9, 0, -1, -9, -1, 1, 0, -1, 1, 0, 0, -1, 9);
		bodyModel[191].setRotationPoint(-16.0f, -26.5f, -4.99f);

		bodyModel[192] = new ModelRendererTurbo(this, 27, 77, textureX, textureY);
		bodyModel[192].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -2, 0, -1, 0, -9, -1, 0, 9, 0, -2, 0, -1, 1, 0, 0, -1, -9, 0, -1, 9, -1, 1, 0);
		bodyModel[192].setRotationPoint(-28.0f, -26.5f, -4.99f);

		bodyModel[193] = new ModelRendererTurbo(this, 179, 0, textureX, textureY);
		bodyModel[193].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[193].setRotationPoint(-16.5f, -27.5f, -7.01f);

		bodyModel[194] = new ModelRendererTurbo(this, 125, 39, textureX, textureY);
		bodyModel[194].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[194].setRotationPoint(-16.5f, -27.5f, -8.01f);

		bodyModel[195] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		bodyModel[195].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[195].setRotationPoint(-16.5f, -26.5f, -8.01f);

		bodyModel[196] = new ModelRendererTurbo(this, 95, 45, textureX, textureY);
		bodyModel[196].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[196].setRotationPoint(-16.5f, -27.5f, 6.99f);

		bodyModel[197] = new ModelRendererTurbo(this, 0, 38, textureX, textureY);
		bodyModel[197].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[197].setRotationPoint(-16.5f, -26.5f, 6.99f);

		bodyModel[198] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[198].addShapeBox(0, 0, 0, 58, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[198].setRotationPoint(-29.0f, -19.0f, -11.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 156, 180, textureX, textureY);
		bodyModel[199].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[199].setRotationPoint(30.5f, 6.5f, -5.5f);

		bodyModel[200] = new ModelRendererTurbo(this, 39, 183, textureX, textureY);
		bodyModel[200].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[200].setRotationPoint(31.0f, 7.0f, 5.5f);

		bodyModel[201] = new ModelRendererTurbo(this, 127, 180, textureX, textureY);
		bodyModel[201].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[201].setRotationPoint(16.5f, 6.5f, -5.5f);

		bodyModel[202] = new ModelRendererTurbo(this, 0, 186, textureX, textureY);
		bodyModel[202].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[202].setRotationPoint(30.5f, 6.5f, 5.5f);

		bodyModel[203] = new ModelRendererTurbo(this, 141, 184, textureX, textureY);
		bodyModel[203].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[203].setRotationPoint(16.5f, 6.5f, 5.5f);

		bodyModel[204] = new ModelRendererTurbo(this, 26, 183, textureX, textureY);
		bodyModel[204].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[204].setRotationPoint(28.5f, 7.5f, 6.5f);

		bodyModel[205] = new ModelRendererTurbo(this, 13, 183, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[205].setRotationPoint(14.5f, 7.5f, 6.5f);

		bodyModel[206] = new ModelRendererTurbo(this, 156, 185, textureX, textureY);
		bodyModel[206].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[206].setRotationPoint(31.5f, 3.5f, 6.5f);

		bodyModel[207] = new ModelRendererTurbo(this, 33, 180, textureX, textureY);
		bodyModel[207].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[207].setRotationPoint(16.5f, 3.5f, 6.5f);

		bodyModel[208] = new ModelRendererTurbo(this, 127, 185, textureX, textureY);
		bodyModel[208].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[208].setRotationPoint(33.5f, 5.5f, 6.5f);

		bodyModel[209] = new ModelRendererTurbo(this, 115, 184, textureX, textureY);
		bodyModel[209].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[209].setRotationPoint(12.5f, 5.5f, 6.5f);

		bodyModel[210] = new ModelRendererTurbo(this, 181, 187, textureX, textureY);
		bodyModel[210].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[210].setRotationPoint(23.5f, 4.5f, 6.5f);

		bodyModel[211] = new ModelRendererTurbo(this, 115, 187, textureX, textureY);
		bodyModel[211].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[211].setRotationPoint(25.0f, 4.5f, 6.5f);

		bodyModel[212] = new ModelRendererTurbo(this, 101, 187, textureX, textureY);
		bodyModel[212].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[212].setRotationPoint(22.0f, 4.5f, 6.5f);

		bodyModel[213] = new ModelRendererTurbo(this, 127, 180, textureX, textureY);
		bodyModel[213].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[213].setRotationPoint(23.0f, 2.0f, -1.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 140, 180, textureX, textureY);
		bodyModel[214].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[214].setRotationPoint(34.5f, 5.5f, -6.5f);

		bodyModel[215] = new ModelRendererTurbo(this, 111, 180, textureX, textureY);
		bodyModel[215].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[215].setRotationPoint(12.5f, 5.5f, -6.5f);

		bodyModel[216] = new ModelRendererTurbo(this, 108, 184, textureX, textureY);
		bodyModel[216].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[216].setRotationPoint(14.5f, 3.5f, 6.5f);

		bodyModel[217] = new ModelRendererTurbo(this, 95, 180, textureX, textureY);
		bodyModel[217].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[217].setRotationPoint(24.0f, 3.0f, -1.0f);

		bodyModel[218] = new ModelRendererTurbo(this, 185, 180, textureX, textureY);
		bodyModel[218].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[218].setRotationPoint(23.0f, 2.0f, 1.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 170, 180, textureX, textureY);
		bodyModel[219].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[219].setRotationPoint(23.0f, 2.0f, -3.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 66, 180, textureX, textureY);
		bodyModel[220].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[220].setRotationPoint(12.0f, 3.0f, 0.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 101, 184, textureX, textureY);
		bodyModel[221].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[221].setRotationPoint(33.5f, 5.5f, -7.5f);

		bodyModel[222] = new ModelRendererTurbo(this, 94, 184, textureX, textureY);
		bodyModel[222].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[222].setRotationPoint(31.5f, 3.5f, -7.5f);

		bodyModel[223] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		bodyModel[223].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[223].setRotationPoint(16.5f, 3.5f, -7.5f);

		bodyModel[224] = new ModelRendererTurbo(this, 87, 184, textureX, textureY);
		bodyModel[224].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[224].setRotationPoint(14.5f, 3.5f, -7.5f);

		bodyModel[225] = new ModelRendererTurbo(this, 80, 184, textureX, textureY);
		bodyModel[225].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[225].setRotationPoint(12.5f, 5.5f, -7.5f);

		bodyModel[226] = new ModelRendererTurbo(this, 73, 184, textureX, textureY);
		bodyModel[226].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[226].setRotationPoint(30.5f, 6.5f, -7.5f);

		bodyModel[227] = new ModelRendererTurbo(this, 0, 183, textureX, textureY);
		bodyModel[227].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[227].setRotationPoint(14.5f, 7.5f, -7.5f);

		bodyModel[228] = new ModelRendererTurbo(this, 239, 180, textureX, textureY);
		bodyModel[228].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[228].setRotationPoint(28.5f, 7.5f, -7.5f);

		bodyModel[229] = new ModelRendererTurbo(this, 79, 187, textureX, textureY);
		bodyModel[229].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[229].setRotationPoint(23.5f, 4.5f, -7.5f);

		bodyModel[230] = new ModelRendererTurbo(this, 58, 187, textureX, textureY);
		bodyModel[230].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[230].setRotationPoint(22.0f, 4.5f, -7.5f);

		bodyModel[231] = new ModelRendererTurbo(this, 148, 186, textureX, textureY);
		bodyModel[231].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[231].setRotationPoint(25.0f, 4.5f, -7.5f);

		bodyModel[232] = new ModelRendererTurbo(this, 32, 186, textureX, textureY);
		bodyModel[232].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[232].setRotationPoint(30.5f, 4.5f, -7.5f);

		bodyModel[233] = new ModelRendererTurbo(this, 146, 182, textureX, textureY);
		bodyModel[233].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[233].setRotationPoint(16.5f, 6.5f, -7.5f);

		bodyModel[234] = new ModelRendererTurbo(this, 226, 180, textureX, textureY);
		bodyModel[234].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[234].setRotationPoint(31.0f, 7.0f, -5.5f);

		bodyModel[235] = new ModelRendererTurbo(this, 213, 180, textureX, textureY);
		bodyModel[235].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[235].setRotationPoint(17.0f, 7.0f, -5.5f);

		bodyModel[236] = new ModelRendererTurbo(this, 200, 180, textureX, textureY);
		bodyModel[236].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[236].setRotationPoint(17.0f, 7.0f, 5.5f);

		bodyModel[237] = new ModelRendererTurbo(this, 27, 186, textureX, textureY);
		bodyModel[237].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[237].setRotationPoint(14.5f, 6.5f, -7.5f);

		bodyModel[238] = new ModelRendererTurbo(this, 66, 184, textureX, textureY);
		bodyModel[238].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[238].setRotationPoint(18.5f, 4.5f, -7.5f);

		bodyModel[239] = new ModelRendererTurbo(this, 246, 183, textureX, textureY);
		bodyModel[239].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[239].setRotationPoint(27.5f, 4.5f, -7.5f);

		bodyModel[240] = new ModelRendererTurbo(this, 239, 183, textureX, textureY);
		bodyModel[240].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[240].setRotationPoint(31.5f, 4.5f, -7.5f);

		bodyModel[241] = new ModelRendererTurbo(this, 22, 186, textureX, textureY);
		bodyModel[241].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[241].setRotationPoint(32.5f, 6.5f, -7.5f);

		bodyModel[242] = new ModelRendererTurbo(this, 59, 183, textureX, textureY);
		bodyModel[242].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[242].setRotationPoint(14.5f, 4.5f, -7.5f);

		bodyModel[243] = new ModelRendererTurbo(this, 17, 186, textureX, textureY);
		bodyModel[243].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[243].setRotationPoint(16.5f, 4.5f, -7.5f);

		bodyModel[244] = new ModelRendererTurbo(this, 52, 183, textureX, textureY);
		bodyModel[244].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[244].setRotationPoint(27.5f, 4.5f, 6.5f);

		bodyModel[245] = new ModelRendererTurbo(this, 12, 186, textureX, textureY);
		bodyModel[245].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[245].setRotationPoint(30.5f, 4.5f, 6.5f);

		bodyModel[246] = new ModelRendererTurbo(this, 7, 186, textureX, textureY);
		bodyModel[246].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[246].setRotationPoint(32.5f, 6.5f, 6.5f);

		bodyModel[247] = new ModelRendererTurbo(this, 180, 180, textureX, textureY);
		bodyModel[247].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[247].setRotationPoint(31.5f, 4.5f, 6.5f);

		bodyModel[248] = new ModelRendererTurbo(this, 156, 180, textureX, textureY);
		bodyModel[248].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[248].setRotationPoint(18.5f, 4.5f, 6.5f);

		bodyModel[249] = new ModelRendererTurbo(this, 195, 180, textureX, textureY);
		bodyModel[249].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[249].setRotationPoint(16.5f, 4.5f, 6.5f);

		bodyModel[250] = new ModelRendererTurbo(this, 170, 180, textureX, textureY);
		bodyModel[250].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[250].setRotationPoint(14.5f, 6.5f, 6.5f);

		bodyModel[251] = new ModelRendererTurbo(this, 141, 180, textureX, textureY);
		bodyModel[251].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[251].setRotationPoint(14.5f, 4.5f, 6.5f);

		bodyModel[252] = new ModelRendererTurbo(this, 156, 180, textureX, textureY);
		bodyModel[252].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[252].setRotationPoint(-16.5f, 6.5f, -5.5f);

		bodyModel[253] = new ModelRendererTurbo(this, 39, 183, textureX, textureY);
		bodyModel[253].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[253].setRotationPoint(-16.0f, 7.0f, 5.5f);

		bodyModel[254] = new ModelRendererTurbo(this, 127, 180, textureX, textureY);
		bodyModel[254].addBox(0, 0, 0, 1, 1, 11, 0f);
		bodyModel[254].setRotationPoint(-30.5f, 6.5f, -5.5f);

		bodyModel[255] = new ModelRendererTurbo(this, 0, 186, textureX, textureY);
		bodyModel[255].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[255].setRotationPoint(-16.5f, 6.5f, 5.5f);

		bodyModel[256] = new ModelRendererTurbo(this, 141, 184, textureX, textureY);
		bodyModel[256].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[256].setRotationPoint(-30.5f, 6.5f, 5.5f);

		bodyModel[257] = new ModelRendererTurbo(this, 26, 183, textureX, textureY);
		bodyModel[257].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[257].setRotationPoint(-18.5f, 7.5f, 6.5f);

		bodyModel[258] = new ModelRendererTurbo(this, 13, 183, textureX, textureY);
		bodyModel[258].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[258].setRotationPoint(-32.5f, 7.5f, 6.5f);

		bodyModel[259] = new ModelRendererTurbo(this, 156, 185, textureX, textureY);
		bodyModel[259].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[259].setRotationPoint(-15.5f, 3.5f, 6.5f);

		bodyModel[260] = new ModelRendererTurbo(this, 33, 180, textureX, textureY);
		bodyModel[260].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[260].setRotationPoint(-30.5f, 3.5f, 6.5f);

		bodyModel[261] = new ModelRendererTurbo(this, 127, 185, textureX, textureY);
		bodyModel[261].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[261].setRotationPoint(-13.5f, 5.5f, 6.5f);

		bodyModel[262] = new ModelRendererTurbo(this, 115, 184, textureX, textureY);
		bodyModel[262].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[262].setRotationPoint(-34.5f, 5.5f, 6.5f);

		bodyModel[263] = new ModelRendererTurbo(this, 181, 187, textureX, textureY);
		bodyModel[263].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[263].setRotationPoint(-23.5f, 4.5f, 6.5f);

		bodyModel[264] = new ModelRendererTurbo(this, 115, 187, textureX, textureY);
		bodyModel[264].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[264].setRotationPoint(-22.0f, 4.5f, 6.5f);

		bodyModel[265] = new ModelRendererTurbo(this, 101, 187, textureX, textureY);
		bodyModel[265].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[265].setRotationPoint(-25.0f, 4.5f, 6.5f);

		bodyModel[266] = new ModelRendererTurbo(this, 127, 180, textureX, textureY);
		bodyModel[266].addBox(0, 0, 0, 2, 2, 2, 0f);
		bodyModel[266].setRotationPoint(-24.0f, 2.0f, -1.0f);

		bodyModel[267] = new ModelRendererTurbo(this, 140, 180, textureX, textureY);
		bodyModel[267].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[267].setRotationPoint(-12.5f, 5.5f, -6.5f);

		bodyModel[268] = new ModelRendererTurbo(this, 111, 180, textureX, textureY);
		bodyModel[268].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[268].setRotationPoint(-34.5f, 5.5f, -6.5f);

		bodyModel[269] = new ModelRendererTurbo(this, 108, 184, textureX, textureY);
		bodyModel[269].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[269].setRotationPoint(-32.5f, 3.5f, 6.5f);

		bodyModel[270] = new ModelRendererTurbo(this, 95, 180, textureX, textureY);
		bodyModel[270].addShapeBox(0, 0, 0, 12, 1, 2, 0, -1, 0, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0);
		bodyModel[270].setRotationPoint(-23.0f, 3.0f, -1.0f);

		bodyModel[271] = new ModelRendererTurbo(this, 185, 180, textureX, textureY);
		bodyModel[271].addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0, 0, 1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f);
		bodyModel[271].setRotationPoint(-24.0f, 2.0f, 1.0f);

		bodyModel[272] = new ModelRendererTurbo(this, 170, 180, textureX, textureY);
		bodyModel[272].addShapeBox(0, 0, -3, 2, 1, 5, 0, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1, 0, 0, 1, 0);
		bodyModel[272].setRotationPoint(-24.0f, 2.0f, -3.0f);

		bodyModel[273] = new ModelRendererTurbo(this, 66, 180, textureX, textureY);
		bodyModel[273].addShapeBox(0, 0, -1, 12, 1, 2, 0, -0.5f, -2.5f, 0, -1, 0, 0, -1, 0, 0, -0.5f, -2.5f, 0, -1.5f, 1.5f, 0, -1, 0, 0, -1, 0, 0, -1.5f, 1.5f, 0);
		bodyModel[273].setRotationPoint(-35.0f, 3.0f, 0.0f);

		bodyModel[274] = new ModelRendererTurbo(this, 101, 184, textureX, textureY);
		bodyModel[274].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[274].setRotationPoint(-13.5f, 5.5f, -7.5f);

		bodyModel[275] = new ModelRendererTurbo(this, 94, 184, textureX, textureY);
		bodyModel[275].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[275].setRotationPoint(-15.5f, 3.5f, -7.5f);

		bodyModel[276] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		bodyModel[276].addBox(0, 0, 0, 15, 1, 1, 0f);
		bodyModel[276].setRotationPoint(-30.5f, 3.5f, -7.5f);

		bodyModel[277] = new ModelRendererTurbo(this, 87, 184, textureX, textureY);
		bodyModel[277].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[277].setRotationPoint(-32.5f, 3.5f, -7.5f);

		bodyModel[278] = new ModelRendererTurbo(this, 80, 184, textureX, textureY);
		bodyModel[278].addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[278].setRotationPoint(-34.5f, 5.5f, -7.5f);

		bodyModel[279] = new ModelRendererTurbo(this, 73, 184, textureX, textureY);
		bodyModel[279].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[279].setRotationPoint(-16.5f, 6.5f, -7.5f);

		bodyModel[280] = new ModelRendererTurbo(this, 0, 183, textureX, textureY);
		bodyModel[280].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[280].setRotationPoint(-32.5f, 7.5f, -7.5f);

		bodyModel[281] = new ModelRendererTurbo(this, 239, 180, textureX, textureY);
		bodyModel[281].addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0);
		bodyModel[281].setRotationPoint(-18.5f, 7.5f, -7.5f);

		bodyModel[282] = new ModelRendererTurbo(this, 79, 187, textureX, textureY);
		bodyModel[282].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[282].setRotationPoint(-23.5f, 4.5f, -7.5f);

		bodyModel[283] = new ModelRendererTurbo(this, 58, 187, textureX, textureY);
		bodyModel[283].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[283].setRotationPoint(-25.0f, 4.5f, -7.5f);

		bodyModel[284] = new ModelRendererTurbo(this, 148, 186, textureX, textureY);
		bodyModel[284].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[284].setRotationPoint(-22.0f, 4.5f, -7.5f);

		bodyModel[285] = new ModelRendererTurbo(this, 32, 186, textureX, textureY);
		bodyModel[285].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[285].setRotationPoint(-16.5f, 4.5f, -7.5f);

		bodyModel[286] = new ModelRendererTurbo(this, 146, 182, textureX, textureY);
		bodyModel[286].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[286].setRotationPoint(-30.5f, 6.5f, -7.5f);

		bodyModel[287] = new ModelRendererTurbo(this, 226, 180, textureX, textureY);
		bodyModel[287].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[287].setRotationPoint(-16.0f, 7.0f, -5.5f);

		bodyModel[288] = new ModelRendererTurbo(this, 213, 180, textureX, textureY);
		bodyModel[288].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[288].setRotationPoint(-30.0f, 7.0f, -5.5f);

		bodyModel[289] = new ModelRendererTurbo(this, 200, 180, textureX, textureY);
		bodyModel[289].addBox(-3, -3, 0, 6, 6, 0, 0f);
		bodyModel[289].setRotationPoint(-30.0f, 7.0f, 5.5f);

		bodyModel[290] = new ModelRendererTurbo(this, 27, 186, textureX, textureY);
		bodyModel[290].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[290].setRotationPoint(-32.5f, 6.5f, -7.5f);

		bodyModel[291] = new ModelRendererTurbo(this, 66, 184, textureX, textureY);
		bodyModel[291].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[291].setRotationPoint(-28.5f, 4.5f, -7.5f);

		bodyModel[292] = new ModelRendererTurbo(this, 246, 183, textureX, textureY);
		bodyModel[292].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[292].setRotationPoint(-19.5f, 4.5f, -7.5f);

		bodyModel[293] = new ModelRendererTurbo(this, 239, 183, textureX, textureY);
		bodyModel[293].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[293].setRotationPoint(-15.5f, 4.5f, -7.5f);

		bodyModel[294] = new ModelRendererTurbo(this, 22, 186, textureX, textureY);
		bodyModel[294].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[294].setRotationPoint(-14.5f, 6.5f, -7.5f);

		bodyModel[295] = new ModelRendererTurbo(this, 59, 183, textureX, textureY);
		bodyModel[295].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[295].setRotationPoint(-32.5f, 4.5f, -7.5f);

		bodyModel[296] = new ModelRendererTurbo(this, 17, 186, textureX, textureY);
		bodyModel[296].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[296].setRotationPoint(-30.5f, 4.5f, -7.5f);

		bodyModel[297] = new ModelRendererTurbo(this, 52, 183, textureX, textureY);
		bodyModel[297].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[297].setRotationPoint(-19.5f, 4.5f, 6.5f);

		bodyModel[298] = new ModelRendererTurbo(this, 12, 186, textureX, textureY);
		bodyModel[298].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[298].setRotationPoint(-16.5f, 4.5f, 6.5f);

		bodyModel[299] = new ModelRendererTurbo(this, 7, 186, textureX, textureY);
		bodyModel[299].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[299].setRotationPoint(-14.5f, 6.5f, 6.5f);

		bodyModel[300] = new ModelRendererTurbo(this, 180, 180, textureX, textureY);
		bodyModel[300].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[300].setRotationPoint(-15.5f, 4.5f, 6.5f);

		bodyModel[301] = new ModelRendererTurbo(this, 156, 180, textureX, textureY);
		bodyModel[301].addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[301].setRotationPoint(-28.5f, 4.5f, 6.5f);

		bodyModel[302] = new ModelRendererTurbo(this, 195, 180, textureX, textureY);
		bodyModel[302].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[302].setRotationPoint(-30.5f, 4.5f, 6.5f);

		bodyModel[303] = new ModelRendererTurbo(this, 170, 180, textureX, textureY);
		bodyModel[303].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[303].setRotationPoint(-32.5f, 6.5f, 6.5f);

		bodyModel[304] = new ModelRendererTurbo(this, 141, 180, textureX, textureY);
		bodyModel[304].addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[304].setRotationPoint(-32.5f, 4.5f, 6.5f);

		flipAll();
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 305; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
	public float[] getTrans() {
		return new float[]{-1.7F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

}
