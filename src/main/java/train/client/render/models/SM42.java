//FMT-Marker DFM-1.0
//Creator: OfflineUser

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SM42 extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public SM42(){
		bodyModel = new ModelRendererTurbo[663];
		model = new ModelRendererTurbo[0];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[0].addBox(0, 0, 0, 63, 3, 22, 0f);
		bodyModel[0].setRotationPoint(-33.0f, -1.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 1
		bodyModel[1].addBox(0, 0, 0, 17, 3, 22, 0f);
		bodyModel[1].setRotationPoint(33.0f, -1.0f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[2].addBox(0, 0, 0, 3, 3, 20, 0f);
		bodyModel[2].setRotationPoint(51.0f, 2.0f, -10.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		bodyModel[3].addShapeBox(0, 0, 0, 2, 3, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[3].setRotationPoint(49.0f, 2.0f, -11.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 3
		bodyModel[4].addBox(0, 0, 0, 3, 3, 20, 0f);
		bodyModel[4].setRotationPoint(-37.0f, 2.0f, -10.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 3
		bodyModel[5].addShapeBox(0, 0, 0, 2, 3, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(-34.0f, 2.0f, -11.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[6].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[6].setRotationPoint(33.0f, 2.0f, -11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[7].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[7].setRotationPoint(28.0f, 2.0f, -11.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[8].addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0);
		bodyModel[8].setRotationPoint(30.0f, 0.0f, -10.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 1
		bodyModel[9].addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(30.0f, -1.0f, -11.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		bodyModel[10].addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(30.0f, 1.0f, -11.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		bodyModel[11].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(30.0f, 3.0f, -11.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[12].addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[12].setRotationPoint(30.0f, 4.0f, -11.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		bodyModel[13].addShapeBox(0, 0, 0, 2, 2, 10, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[13].setRotationPoint(50.0f, -17.0f, -5.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 14
		bodyModel[14].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, -0.5f, 0, 0, 0, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f);
		bodyModel[14].setRotationPoint(52.0f, -17.0f, -5.0f);
		bodyModel[14].rotateAngleY = -3.1415927f;

		bodyModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 14
		bodyModel[15].addShapeBox(0, 0, 0, 54, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-33.0f, -17.0f, 5.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 14
		bodyModel[16].addBox(0, 0, 0, 2, 14, 10, 0f);
		bodyModel[16].setRotationPoint(-35.0f, -15.0f, -5.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 14
		bodyModel[17].addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(50.0f, -15.0f, -7.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		bodyModel[18].addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(52.0f, -17.0f, -7.0f);
		bodyModel[18].rotateAngleY = 1.5707964f;

		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 14
		bodyModel[19].addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, -0.5f, -0.5f, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[19].setRotationPoint(52.0f, -17.0f, 5.0f);
		bodyModel[19].rotateAngleY = 1.5707964f;

		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 14
		bodyModel[20].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f);
		bodyModel[20].setRotationPoint(50.0f, -17.0f, 5.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 14
		bodyModel[21].addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0);
		bodyModel[21].setRotationPoint(50.0f, -15.0f, 5.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 14
		bodyModel[22].addShapeBox(0, 0, 0, 54, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-33.0f, -17.0f, -7.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 14
		bodyModel[23].addBox(0, 0, 0, 7, 14, 1, 0f);
		bodyModel[23].setRotationPoint(-33.0f, -15.0f, 6.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 14
		bodyModel[24].addBox(0, 0, 0, 11, 2, 1, 0f);
		bodyModel[24].setRotationPoint(-26.0f, -3.0f, 6.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 14
		bodyModel[25].addBox(0, 0, 0, 27, 12, 1, 0f);
		bodyModel[25].setRotationPoint(-15.0f, -13.0f, 6.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		bodyModel[26].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[26].setRotationPoint(-21.0f, -13.0f, 6.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 14
		bodyModel[27].addBox(0, 0, 0, 46, 2, 1, 0f);
		bodyModel[27].setRotationPoint(-26.0f, -15.0f, 6.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 14
		bodyModel[28].addBox(0, 0, 0, 53, 14, 12, 0f);
		bodyModel[28].setRotationPoint(-33.0f, -15.0f, -6.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 14
		bodyModel[29].addBox(0, 0, 0, 7, 14, 1, 0f);
		bodyModel[29].setRotationPoint(-33.0f, -15.0f, -7.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 14
		bodyModel[30].addBox(0, 0, 0, 11, 2, 1, 0f);
		bodyModel[30].setRotationPoint(-26.0f, -3.0f, -7.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 14
		bodyModel[31].addBox(0, 0, 0, 27, 12, 1, 0f);
		bodyModel[31].setRotationPoint(-15.0f, -13.0f, -7.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 14
		bodyModel[32].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[32].setRotationPoint(-21.0f, -13.0f, -7.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 14
		bodyModel[33].addBox(0, 0, 0, 46, 2, 1, 0f);
		bodyModel[33].setRotationPoint(-26.0f, -15.0f, -7.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 14
		bodyModel[34].addShapeBox(0, 0, 0, 7, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[34].setRotationPoint(-33.0f, -17.0f, -5.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 38
		bodyModel[35].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[35].setRotationPoint(-35.0f, -17.0f, -0.5f);

		bodyModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 38
		bodyModel[36].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[36].setRotationPoint(-33.15f, -18.0f, -0.5f);

		bodyModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		bodyModel[37].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[37].setRotationPoint(-33.15f, -18.0f, -1.5f);

		bodyModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
		bodyModel[38].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[38].setRotationPoint(-35.0f, -17.0f, -1.5f);

		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 38
		bodyModel[39].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[39].setRotationPoint(-35.0f, -18.0f, -0.5f);

		bodyModel[40] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 38
		bodyModel[40].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[40].setRotationPoint(-35.0f, -18.0f, -1.5f);

		bodyModel[41] = new ModelRendererTurbo(this, 305, 9, textureX, textureY, "lamp"); // Lamp
		bodyModel[41].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[41].setRotationPoint(-35.15f, -17.0f, -0.5f);

		bodyModel[42] = new ModelRendererTurbo(this, 313, 9, textureX, textureY, "lamp"); // Lamp
		bodyModel[42].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[42].setRotationPoint(-35.15f, -17.0f, -1.5f);

		bodyModel[43] = new ModelRendererTurbo(this, 337, 9, textureX, textureY, "lamp"); // Lamp
		bodyModel[43].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[43].setRotationPoint(-35.15f, -18.0f, -0.5f);

		bodyModel[44] = new ModelRendererTurbo(this, 345, 9, textureX, textureY, "lamp"); // Lamp
		bodyModel[44].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[44].setRotationPoint(-35.15f, -18.0f, -1.5f);

		bodyModel[45] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 52
		bodyModel[45].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(55.0f, -1.0f, 7.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 38
		bodyModel[46].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[46].setRotationPoint(-39.6f, -3.0f, 8.5f);

		bodyModel[47] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 38
		bodyModel[47].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[47].setRotationPoint(-38.25f, -3.0f, 8.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 38
		bodyModel[48].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[48].setRotationPoint(-38.25f, -3.0f, 7.5f);

		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
		bodyModel[49].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[49].setRotationPoint(-39.6f, -3.0f, 7.5f);

		bodyModel[50] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 38
		bodyModel[50].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[50].setRotationPoint(-39.6f, -4.0f, 8.5f);

		bodyModel[51] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 38
		bodyModel[51].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[51].setRotationPoint(-39.6f, -4.0f, 7.5f);

		bodyModel[52] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "lamp"); // Lamp
		bodyModel[52].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[52].setRotationPoint(-39.75f, -3.0f, 8.5f);

		bodyModel[53] = new ModelRendererTurbo(this, 185, 17, textureX, textureY, "lamp"); // Lamp
		bodyModel[53].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[53].setRotationPoint(-39.75f, -3.0f, 7.5f);

		bodyModel[54] = new ModelRendererTurbo(this, 241, 17, textureX, textureY, "lamp"); // Lamp
		bodyModel[54].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[54].setRotationPoint(-39.75f, -4.0f, 8.5f);

		bodyModel[55] = new ModelRendererTurbo(this, 249, 17, textureX, textureY, "lamp"); // Lamp
		bodyModel[55].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[55].setRotationPoint(-39.75f, -4.0f, 7.5f);

		bodyModel[56] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 38
		bodyModel[56].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[56].setRotationPoint(-38.25f, -4.0f, 8.5f);

		bodyModel[57] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 38
		bodyModel[57].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[57].setRotationPoint(-38.25f, -4.0f, 7.5f);

		bodyModel[58] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 52
		bodyModel[58].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(55.0f, -1.0f, -11.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 66
		bodyModel[59].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[59].setRotationPoint(-39.45f, -2.5f, 7.5f);

		bodyModel[60] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 67
		bodyModel[60].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[60].setRotationPoint(-39.55f, -5.0f, 8.5f);

		bodyModel[61] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 38
		bodyModel[61].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[61].setRotationPoint(-39.6f, -3.0f, -9.5f);

		bodyModel[62] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 38
		bodyModel[62].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[62].setRotationPoint(-38.25f, -3.0f, -9.5f);

		bodyModel[63] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 38
		bodyModel[63].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[63].setRotationPoint(-38.25f, -3.0f, -10.5f);

		bodyModel[64] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 38
		bodyModel[64].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[64].setRotationPoint(-39.6f, -3.0f, -10.5f);

		bodyModel[65] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 38
		bodyModel[65].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[65].setRotationPoint(-39.6f, -4.0f, -9.5f);

		bodyModel[66] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 38
		bodyModel[66].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[66].setRotationPoint(-39.6f, -4.0f, -10.5f);

		bodyModel[67] = new ModelRendererTurbo(this, 369, 25, textureX, textureY, "lamp"); // Lamp
		bodyModel[67].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[67].setRotationPoint(-39.75f, -3.0f, -9.5f);

		bodyModel[68] = new ModelRendererTurbo(this, 377, 25, textureX, textureY, "lamp"); // Lamp
		bodyModel[68].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[68].setRotationPoint(-39.75f, -3.0f, -10.5f);

		bodyModel[69] = new ModelRendererTurbo(this, 385, 25, textureX, textureY, "lamp"); // Lamp
		bodyModel[69].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[69].setRotationPoint(-39.75f, -4.0f, -9.5f);

		bodyModel[70] = new ModelRendererTurbo(this, 393, 25, textureX, textureY, "lamp"); // Lamp
		bodyModel[70].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[70].setRotationPoint(-39.75f, -4.0f, -10.5f);

		bodyModel[71] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 38
		bodyModel[71].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[71].setRotationPoint(-38.25f, -4.0f, -9.5f);

		bodyModel[72] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 38
		bodyModel[72].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[72].setRotationPoint(-38.25f, -4.0f, -10.5f);

		bodyModel[73] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 66
		bodyModel[73].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[73].setRotationPoint(-39.45f, -2.5f, -10.5f);

		bodyModel[74] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 67
		bodyModel[74].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[74].setRotationPoint(-39.55f, -5.0f, -9.5f);

		bodyModel[75] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 82
		bodyModel[75].addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[75].setRotationPoint(-35.1f, -14.8f, -3.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 82
		bodyModel[76].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[76].setRotationPoint(-35.1f, -14.3f, -2.5f);

		bodyModel[77] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 82
		bodyModel[77].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[77].setRotationPoint(-35.1f, -13.8f, -2.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 85
		bodyModel[78].addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f);
		bodyModel[78].setRotationPoint(-35.2f, -14.8f, -2.5f);

		bodyModel[79] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 86
		bodyModel[79].addBox(0, 0, 0, 1, 7, 20, 0f);
		bodyModel[79].setRotationPoint(20.0f, -12.0f, -10.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 14
		bodyModel[80].addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[80].setRotationPoint(19.25f, -13.0f, 6.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 14
		bodyModel[81].addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[81].setRotationPoint(19.25f, -13.0f, -7.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 3
		bodyModel[82].addBox(0, 0, 0, 4, 3, 20, 0f);
		bodyModel[82].setRotationPoint(-37.0f, -1.0f, -10.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 1
		bodyModel[83].addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(-37.0f, 4.0f, -11.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 3
		bodyModel[84].addBox(0, 0, 0, 1, 6, 2, 0f);
		bodyModel[84].setRotationPoint(-38.0f, -1.0f, -11.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 3
		bodyModel[85].addBox(0, 0, 0, 4, 3, 20, 0f);
		bodyModel[85].setRotationPoint(50.0f, -1.0f, -10.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 1
		bodyModel[86].addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[86].setRotationPoint(51.0f, 4.0f, -11.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 52
		bodyModel[87].addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0);
		bodyModel[87].setRotationPoint(55.0f, -1.0f, -7.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 3
		bodyModel[88].addBox(0, 0, 0, 1, 6, 2, 0f);
		bodyModel[88].setRotationPoint(-38.0f, -1.0f, 9.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 3
		bodyModel[89].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[89].setRotationPoint(-38.0f, -1.0f, -9.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 3
		bodyModel[90].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[90].setRotationPoint(-38.0f, 2.0f, -1.5f);

		bodyModel[91] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 14
		bodyModel[91].addBox(0, 0, 0, 14, 14, 12, 0f);
		bodyModel[91].setRotationPoint(36.0f, -15.0f, -6.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 14
		bodyModel[92].addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[92].setRotationPoint(35.0f, -17.0f, 5.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 14
		bodyModel[93].addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[93].setRotationPoint(35.0f, -17.0f, -7.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 14
		bodyModel[94].addShapeBox(0, 0, 0, 2, 2, 10, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[94].setRotationPoint(-35.0f, -17.0f, -5.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 14
		bodyModel[95].addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, -0.5f, -0.5f, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[95].setRotationPoint(-33.0f, -17.0f, 7.0f);
		bodyModel[95].rotateAngleY = -3.1415927f;

		bodyModel[96] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 14
		bodyModel[96].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f);
		bodyModel[96].setRotationPoint(-33.0f, -17.0f, 5.0f);
		bodyModel[96].rotateAngleY = 1.5707964f;

		bodyModel[97] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 14
		bodyModel[97].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, -0.5f, 0, 0, 0, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f);
		bodyModel[97].setRotationPoint(-33.0f, -17.0f, -7.0f);
		bodyModel[97].rotateAngleY = 1.5707964f;

		bodyModel[98] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 14
		bodyModel[98].addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[98].setRotationPoint(-35.0f, -17.0f, -7.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 14
		bodyModel[99].addBox(0, 0, 0, 2, 14, 10, 0f);
		bodyModel[99].setRotationPoint(50.0f, -15.0f, -5.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 14
		bodyModel[100].addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f);
		bodyModel[100].setRotationPoint(-35.0f, -15.0f, 5.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 14
		bodyModel[101].addShapeBox(0, 0, 0, 2, 14, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[101].setRotationPoint(-35.0f, -15.0f, -7.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 14
		bodyModel[102].addBox(0, 0, 0, 2, 14, 1, 0f);
		bodyModel[102].setRotationPoint(36.0f, -15.0f, -7.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 14
		bodyModel[103].addBox(0, 0, 0, 5, 14, 1, 0f);
		bodyModel[103].setRotationPoint(45.0f, -15.0f, -7.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 14
		bodyModel[104].addBox(0, 0, 0, 7, 7, 1, 0f);
		bodyModel[104].setRotationPoint(38.0f, -8.0f, -7.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 14
		bodyModel[105].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[105].setRotationPoint(38.0f, -15.0f, -7.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 14
		bodyModel[106].addBox(0, 0, 0, 2, 14, 1, 0f);
		bodyModel[106].setRotationPoint(36.0f, -15.0f, 6.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 14
		bodyModel[107].addBox(0, 0, 0, 5, 14, 1, 0f);
		bodyModel[107].setRotationPoint(45.0f, -15.0f, 6.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 14
		bodyModel[108].addBox(0, 0, 0, 7, 7, 1, 0f);
		bodyModel[108].setRotationPoint(38.0f, -8.0f, 6.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 14
		bodyModel[109].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[109].setRotationPoint(38.0f, -15.0f, 6.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 14
		bodyModel[110].addShapeBox(0, 0, 0, 15, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[110].setRotationPoint(35.0f, -17.0f, -5.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 86
		bodyModel[111].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[111].setRotationPoint(20.0f, -16.0f, -10.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 14
		bodyModel[112].addBox(0, 0, 0, 17, 4, 6, 0f);
		bodyModel[112].setRotationPoint(4.0f, -21.0f, -3.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 86
		bodyModel[113].addShapeBox(0, 0, 0, 1, 5, 7, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[113].setRotationPoint(20.0f, -21.0f, -3.5f);

		bodyModel[114] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 86
		bodyModel[114].addShapeBox(0, 0, 0, 1, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[114].setRotationPoint(20.0f, -16.0f, -7.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 86
		bodyModel[115].addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, -1.25f, 0, 0.25f, -1.25f, 0, 0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[115].setRotationPoint(20.0f, -18.0f, -7.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 86
		bodyModel[116].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0);
		bodyModel[116].setRotationPoint(20.0f, -16.75f, -9.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 86
		bodyModel[117].addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0.05f, 0, -1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[117].setRotationPoint(20.0f, -20.0f, -9.25f);

		bodyModel[118] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 86
		bodyModel[118].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.075f, -1.75f, -0.25f, 0.075f, -1.75f, -0.25f, 0.2f, 0, 0, -0.2f, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[118].setRotationPoint(21.0f, -22.0f, -8.5f);

		bodyModel[119] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 124
		bodyModel[119].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[119].setRotationPoint(20.0f, -16.0f, -8.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 124
		bodyModel[120].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, -0.5f, 0, -1.2f, -0.5f);
		bodyModel[120].setRotationPoint(20.0f, -15.25f, -9.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 124
		bodyModel[121].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[121].setRotationPoint(20.0f, -13.0f, -8.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 124
		bodyModel[122].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[122].setRotationPoint(20.0f, -13.0f, -9.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 128
		bodyModel[123].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, -0.125f, 0, 0, 0.125f, 0, 0);
		bodyModel[123].setRotationPoint(21.0f, -21.5f, -4.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 128
		bodyModel[124].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1125f, -1.175f, -0.5f, -0.1125f, -1.175f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1125f, 0.175f, -0.5f, -0.1125f, 0.175f, -0.5f, -0.1f, 0, 0, 0.1f, 0, 0);
		bodyModel[124].setRotationPoint(20.5f, -19.0f, -4.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 128
		bodyModel[125].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[125].setRotationPoint(21.0f, -22.0f, -3.5f);

		bodyModel[126] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 86
		bodyModel[126].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[126].setRotationPoint(20.0f, -16.0f, 9.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 86
		bodyModel[127].addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.4f, 0, -0.5f, 0.4f, 0, -0.5f, 0.25f, -1.25f, 0, -0.25f, -1.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[127].setRotationPoint(20.0f, -18.0f, 3.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 86
		bodyModel[128].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[128].setRotationPoint(20.0f, -16.75f, 7.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 86
		bodyModel[129].addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0.05f, 0, 1, 0.05f, 0, 1, 0, -0.75f, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[129].setRotationPoint(20.0f, -20.0f, 8.25f);

		bodyModel[130] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 86
		bodyModel[130].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.075f, -1.75f, -0.25f, -0.075f, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0);
		bodyModel[130].setRotationPoint(21.0f, -22.0f, 3.5f);

		bodyModel[131] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 124
		bodyModel[131].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f);
		bodyModel[131].setRotationPoint(20.0f, -16.0f, 7.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 124
		bodyModel[132].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.2f, -0.5f, 0, -1.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[132].setRotationPoint(20.0f, -15.25f, 8.0f);

		bodyModel[133] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 124
		bodyModel[133].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[133].setRotationPoint(20.0f, -13.0f, 7.0f);

		bodyModel[134] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 124
		bodyModel[134].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(20.0f, -13.0f, 8.0f);

		bodyModel[135] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 128
		bodyModel[135].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0.125f, 0, 0, -0.125f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f);
		bodyModel[135].setRotationPoint(21.0f, -21.5f, 3.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 128
		bodyModel[136].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1125f, -1.175f, -0.5f, 0.1125f, -1.175f, -0.5f, 0.1f, 0, 0, -0.1f, 0, 0, -0.1125f, 0.175f, -0.5f, 0.1125f, 0.175f, -0.5f);
		bodyModel[136].setRotationPoint(20.5f, -19.0f, 3.5f);

		bodyModel[137] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 124
		bodyModel[137].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f, -0.135f, -0.5f, 0.1f, 0.135f, -0.5f, 0.1f);
		bodyModel[137].setRotationPoint(21.0f, -20.0f, 7.25f);

		bodyModel[138] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 124
		bodyModel[138].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0.135f, -0.5f, 0.1f, -0.135f, -0.5f, 0.1f, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f);
		bodyModel[138].setRotationPoint(21.0f, -20.0f, -8.25f);

		bodyModel[139] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 142
		bodyModel[139].addBox(0, 0, 0, 16, 4, 20, 0f);
		bodyModel[139].setRotationPoint(20.0f, -5.0f, -10.0f);

		bodyModel[140] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 86
		bodyModel[140].addBox(0, 0, 0, 1, 7, 20, 0f);
		bodyModel[140].setRotationPoint(35.0f, -12.0f, -10.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 86
		bodyModel[141].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[141].setRotationPoint(35.0f, -16.0f, -10.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 86
		bodyModel[142].addShapeBox(0, 0, 0, 1, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(35.0f, -16.0f, -7.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 124
		bodyModel[143].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[143].setRotationPoint(35.0f, -13.0f, -8.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 124
		bodyModel[144].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[144].setRotationPoint(35.0f, -13.0f, -9.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 124
		bodyModel[145].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[145].setRotationPoint(35.0f, -13.0f, 7.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 124
		bodyModel[146].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[146].setRotationPoint(35.0f, -13.0f, 8.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 86
		bodyModel[147].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[147].setRotationPoint(35.0f, -16.0f, 9.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 86
		bodyModel[148].addShapeBox(0, 0, 0, 1, 5, 7, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[148].setRotationPoint(35.0f, -21.0f, -3.5f);

		bodyModel[149] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 86
		bodyModel[149].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.25f, -1.25f, 0, -0.25f, -1.25f, 0, -0.4f, 0, -0.5f, 0.4f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[149].setRotationPoint(35.0f, -18.0f, -7.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 86
		bodyModel[150].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0);
		bodyModel[150].setRotationPoint(35.0f, -16.75f, -9.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 86
		bodyModel[151].addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[151].setRotationPoint(35.0f, -20.0f, -9.25f);

		bodyModel[152] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 86
		bodyModel[152].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.075f, -1.75f, -0.25f, -0.075f, -1.75f, -0.25f, -0.2f, 0, 0, 0.2f, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[152].setRotationPoint(34.0f, -22.0f, -8.5f);

		bodyModel[153] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 128
		bodyModel[153].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0.125f, 0, 0, -0.125f, 0, 0);
		bodyModel[153].setRotationPoint(34.0f, -21.5f, -4.5f);

		bodyModel[154] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 128
		bodyModel[154].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1125f, -1.175f, -0.5f, 0.1125f, -1.175f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.1125f, 0.175f, -0.5f, 0.1125f, 0.175f, -0.5f, 0.1f, 0, 0, -0.1f, 0, 0);
		bodyModel[154].setRotationPoint(34.5f, -19.0f, -4.5f);

		bodyModel[155] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 128
		bodyModel[155].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[155].setRotationPoint(34.0f, -22.0f, -3.5f);

		bodyModel[156] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 86
		bodyModel[156].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.25f, -1.25f, 0, 0.25f, -1.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[156].setRotationPoint(35.0f, -18.0f, 3.0f);

		bodyModel[157] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 86
		bodyModel[157].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[157].setRotationPoint(35.0f, -16.75f, 7.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 86
		bodyModel[158].addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(35.0f, -20.0f, 8.25f);

		bodyModel[159] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 86
		bodyModel[159].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.075f, -1.75f, -0.25f, 0.075f, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0);
		bodyModel[159].setRotationPoint(34.0f, -22.0f, 3.5f);

		bodyModel[160] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 128
		bodyModel[160].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, -0.125f, 0, 0, 0.125f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f);
		bodyModel[160].setRotationPoint(34.0f, -21.5f, 3.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 128
		bodyModel[161].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.1125f, -1.175f, -0.5f, -0.1125f, -1.175f, -0.5f, -0.1f, 0, 0, 0.1f, 0, 0, 0.1125f, 0.175f, -0.5f, -0.1125f, 0.175f, -0.5f);
		bodyModel[161].setRotationPoint(34.5f, -19.0f, 3.5f);

		bodyModel[162] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 124
		bodyModel[162].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f, 0.135f, -0.5f, 0.1f, -0.135f, -0.5f, 0.1f);
		bodyModel[162].setRotationPoint(34.0f, -20.0f, 7.25f);

		bodyModel[163] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 124
		bodyModel[163].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, -0.135f, -0.5f, 0.1f, 0.135f, -0.5f, 0.1f, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f);
		bodyModel[163].setRotationPoint(34.0f, -20.0f, -8.25f);

		bodyModel[164] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 166
		bodyModel[164].addShapeBox(0, 0, 0, 22, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0);
		bodyModel[164].setRotationPoint(17.0f, -22.1f, -3.5f);

		bodyModel[165] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 166
		bodyModel[165].addShapeBox(0, 0, 0, 22, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, -0.7f, 0, -0.9f, -0.7f);
		bodyModel[165].setRotationPoint(17.0f, -22.1f, 3.5f);
		bodyModel[165].rotateAngleX = -0.36651915f;

		bodyModel[166] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 166
		bodyModel[166].addShapeBox(0, 0, -6, 22, 1, 6, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.7f, 0, -0.9f, -0.7f, 0, -0.9f, 0, 0, -0.9f, 0);
		bodyModel[166].setRotationPoint(17.0f, -22.1f, -3.5f);
		bodyModel[166].rotateAngleX = 0.36651915f;

		bodyModel[167] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 170
		bodyModel[167].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, -2, 0, 0, 0, 0, 0, 0, 0, -0.9f, -2, 0, -0.9f);
		bodyModel[167].setRotationPoint(17.0f, -20.18f, -8.5f);
		bodyModel[167].rotateAngleX = -0.19198622f;

		bodyModel[168] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 170
		bodyModel[168].addShapeBox(0, 0, 0, 14, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f);
		bodyModel[168].setRotationPoint(21.0f, -20.18f, -8.5f);
		bodyModel[168].rotateAngleX = -0.19198622f;

		bodyModel[169] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 170
		bodyModel[169].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -2, 0, 0, -2, 0, -0.9f, 0, 0, -0.9f);
		bodyModel[169].setRotationPoint(35.0f, -20.18f, -8.5f);
		bodyModel[169].rotateAngleX = -0.19198622f;

		bodyModel[170] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 170
		bodyModel[170].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, -2, 0, 0, 0, 0, 0, 0, 0, -0.9f, -2, 0, -0.9f);
		bodyModel[170].setRotationPoint(17.0f, -20.15f, 8.41f);
		bodyModel[170].rotateAngleX = 0.19198622f;

		bodyModel[171] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 170
		bodyModel[171].addShapeBox(0, 0, 0, 14, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f);
		bodyModel[171].setRotationPoint(21.0f, -20.15f, 8.41f);
		bodyModel[171].rotateAngleX = 0.19198622f;

		bodyModel[172] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 170
		bodyModel[172].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -2, 0, 0, -2, 0, -0.9f, 0, 0, -0.9f);
		bodyModel[172].setRotationPoint(35.0f, -20.15f, 8.41f);
		bodyModel[172].rotateAngleX = 0.19198622f;

		bodyModel[173] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 14
		bodyModel[173].addShapeBox(0, 0, 0, 2, 3, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0);
		bodyModel[173].setRotationPoint(2.0f, -20.0f, -3.0f);

		bodyModel[174] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 178
		bodyModel[174].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[174].setRotationPoint(3.0f, -21.0f, -3.0f);

		bodyModel[175] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 52
		bodyModel[175].addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0);
		bodyModel[175].setRotationPoint(30.5f, -3.0f, -11.0f);

		bodyModel[176] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 180
		bodyModel[176].addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -1, -0.8f, 0, -1, -0.8f, 0, -1, 0, 0, -1);
		bodyModel[176].setRotationPoint(30.5f, -2.8f, -11.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 180
		bodyModel[177].addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -1, -0.8f, 0, -1, -0.8f, 0, -1, 0, 0, -1);
		bodyModel[177].setRotationPoint(33.3f, -2.8f, -11.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 86
		bodyModel[178].addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0.05f, 0, -1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[178].setRotationPoint(21.0f, -20.0f, -9.25f);

		bodyModel[179] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 86
		bodyModel[179].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.5f, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 0.5f, 0.05f, 0, 0.5f, 0, -0.375f, -1, 0, -0.375f, -1, 0, -0.375f, 0.5f, 0, -0.375f);
		bodyModel[179].setRotationPoint(29.0f, -20.0f, -9.25f);

		bodyModel[180] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 86
		bodyModel[180].addShapeBox(0, 0, 0, 6, 2, 1, 0, -1, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.05f, 0, -1, 0.05f, 0, -0.5f, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -0.5f, 0, -0.375f);
		bodyModel[180].setRotationPoint(22.0f, -20.0f, -9.25f);

		bodyModel[181] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 86
		bodyModel[181].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 0, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[181].setRotationPoint(34.0f, -20.0f, -9.25f);

		bodyModel[182] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 86
		bodyModel[182].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[182].setRotationPoint(34.0f, -16.0f, -10.0f);

		bodyModel[183] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 86
		bodyModel[183].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[183].setRotationPoint(34.0f, -12.0f, -10.0f);

		bodyModel[184] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 86
		bodyModel[184].addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f);
		bodyModel[184].setRotationPoint(33.75f, -18.0f, -10.0f);

		bodyModel[185] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 86
		bodyModel[185].addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f);
		bodyModel[185].setRotationPoint(30.0f, -18.0f, -10.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 86
		bodyModel[186].addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f);
		bodyModel[186].setRotationPoint(33.75f, -12.0f, -10.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 86
		bodyModel[187].addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f);
		bodyModel[187].setRotationPoint(30.0f, -12.0f, -10.0f);

		bodyModel[188] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 86
		bodyModel[188].addShapeBox(0, 0, 0, 9, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[188].setRotationPoint(21.0f, -12.0f, -10.0f);

		bodyModel[189] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 86
		bodyModel[189].addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0, 0, -1, 0, 0, -1, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -1, 0, -0.375f);
		bodyModel[189].setRotationPoint(20.0f, -16.0f, -10.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 86
		bodyModel[190].addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[190].setRotationPoint(21.0f, -14.0f, -10.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 124
		bodyModel[191].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[191].setRotationPoint(35.0f, -16.0f, -8.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 124
		bodyModel[192].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f);
		bodyModel[192].setRotationPoint(35.0f, -16.0f, 7.0f);

		bodyModel[193] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 3
		bodyModel[193].addBox(0, 0, 0, 1, 6, 2, 0f);
		bodyModel[193].setRotationPoint(54.0f, -1.0f, -11.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 3
		bodyModel[194].addBox(0, 0, 0, 1, 6, 2, 0f);
		bodyModel[194].setRotationPoint(54.0f, -1.0f, 9.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 3
		bodyModel[195].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[195].setRotationPoint(54.0f, -1.0f, -9.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 3
		bodyModel[196].addBox(0, 0, 0, 1, 3, 3, 0f);
		bodyModel[196].setRotationPoint(54.0f, 2.0f, -1.5f);

		bodyModel[197] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 86
		bodyModel[197].addShapeBox(-3.5f, 0, -0.25f, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[197].setRotationPoint(33.75f, -14.0f, -8.65f);

		bodyModel[198] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 86
		bodyModel[198].addShapeBox(-3.5f, 0, -0.25f, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[198].setRotationPoint(33.75f, -18.0f, -8.65f);

		bodyModel[199] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 86
		bodyModel[199].addShapeBox(-0.5f, 0, -0.25f, 1, 4, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f);
		bodyModel[199].setRotationPoint(33.75f, -17.5f, -8.65f);

		bodyModel[200] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 86
		bodyModel[200].addShapeBox(-3.5f, 0, -0.25f, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[200].setRotationPoint(33.75f, -17.5f, -8.65f);

		bodyModel[201] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 86
		bodyModel[201].addShapeBox(-1.25f, 0, -0.25f, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f);
		bodyModel[201].setRotationPoint(33.75f, -18.0f, -8.65f);

		bodyModel[202] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 86
		bodyModel[202].addShapeBox(-3.25f, 0, -0.25f, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f);
		bodyModel[202].setRotationPoint(33.75f, -18.0f, -8.65f);

		bodyModel[203] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 86
		bodyModel[203].addShapeBox(-1.25f, 0, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f);
		bodyModel[203].setRotationPoint(33.75f, -14.5f, -8.65f);

		bodyModel[204] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 86
		bodyModel[204].addShapeBox(-3.25f, 0, -0.25f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[204].setRotationPoint(33.75f, -14.5f, -8.65f);

		bodyModel[205] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 213
		bodyModel[205].addShapeBox(-3, 1, -0.65f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[205].setRotationPoint(33.75f, -14.0f, -8.65f);

		bodyModel[206] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 213
		bodyModel[206].addShapeBox(-2.75f, 1, -0.65f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[206].setRotationPoint(33.75f, -14.0f, -8.65f);

		bodyModel[207] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 213
		bodyModel[207].addShapeBox(-2.75f, 1, 0.22f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[207].setRotationPoint(33.75f, -14.0f, -8.65f);

		bodyModel[208] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 3
		bodyModel[208].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[208].setRotationPoint(33.0f, 2.0f, 9.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 3
		bodyModel[209].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[209].setRotationPoint(28.0f, 2.0f, 9.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 1
		bodyModel[210].addShapeBox(-1, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0);
		bodyModel[210].setRotationPoint(31.0f, 0.0f, 9.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 1
		bodyModel[211].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[211].setRotationPoint(30.0f, 3.0f, 10.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 1
		bodyModel[212].addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[212].setRotationPoint(30.0f, 4.0f, 9.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 14
		bodyModel[213].addShapeBox(0, 0, 0, 2, 2, 3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[213].setRotationPoint(16.5f, -23.0f, -1.5f);

		bodyModel[214] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 86
		bodyModel[214].addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0.05f, 0, 1, 0.05f, 0, 1, 0, -0.75f, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[214].setRotationPoint(21.0f, -20.0f, 8.25f);

		bodyModel[215] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 86
		bodyModel[215].addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.5f, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.375f, -1, 0, -0.375f, -1, 0, -0.375f, 0.5f, 0, -0.375f);
		bodyModel[215].setRotationPoint(29.0f, -20.0f, 8.25f);

		bodyModel[216] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 86
		bodyModel[216].addShapeBox(0, 0, 0, 6, 2, 1, 0, -1, 0.05f, 0, 0.5f, 0.05f, 0, 0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -0.5f, 0, -0.375f);
		bodyModel[216].setRotationPoint(22.0f, -20.0f, 8.25f);

		bodyModel[217] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 86
		bodyModel[217].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[217].setRotationPoint(34.0f, -20.0f, 8.25f);

		bodyModel[218] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 86
		bodyModel[218].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[218].setRotationPoint(34.0f, -16.0f, 9.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 86
		bodyModel[219].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[219].setRotationPoint(34.0f, -12.0f, 9.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 86
		bodyModel[220].addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[220].setRotationPoint(33.75f, -18.0f, 8.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 86
		bodyModel[221].addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[221].setRotationPoint(30.0f, -18.0f, 8.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 86
		bodyModel[222].addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[222].setRotationPoint(33.75f, -12.0f, 8.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 86
		bodyModel[223].addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[223].setRotationPoint(30.0f, -12.0f, 8.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 86
		bodyModel[224].addShapeBox(0, 0, 0, 9, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[224].setRotationPoint(21.0f, -12.0f, 9.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 86
		bodyModel[225].addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, -0.75f, -1, 0, -0.75f, -1, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -1, 0, -0.375f);
		bodyModel[225].setRotationPoint(20.0f, -16.0f, 9.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 86
		bodyModel[226].addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[226].setRotationPoint(21.0f, -14.0f, 9.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 86
		bodyModel[227].addShapeBox(-3.5f, 0, 0, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[227].setRotationPoint(33.75f, -14.0f, 8.65f);

		bodyModel[228] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 86
		bodyModel[228].addShapeBox(-3.5f, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[228].setRotationPoint(33.75f, -18.0f, 8.65f);

		bodyModel[229] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 86
		bodyModel[229].addShapeBox(-0.5f, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f);
		bodyModel[229].setRotationPoint(33.75f, -17.5f, 8.65f);

		bodyModel[230] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 86
		bodyModel[230].addShapeBox(-3.5f, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[230].setRotationPoint(33.75f, -17.5f, 8.65f);

		bodyModel[231] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 86
		bodyModel[231].addShapeBox(-1.25f, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f);
		bodyModel[231].setRotationPoint(33.75f, -18.0f, 8.65f);

		bodyModel[232] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 86
		bodyModel[232].addShapeBox(-3.25f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f);
		bodyModel[232].setRotationPoint(33.75f, -18.0f, 8.65f);

		bodyModel[233] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 86
		bodyModel[233].addShapeBox(-1.25f, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f);
		bodyModel[233].setRotationPoint(33.75f, -14.5f, 8.65f);

		bodyModel[234] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 86
		bodyModel[234].addShapeBox(-3.25f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[234].setRotationPoint(33.75f, -14.5f, 8.65f);

		bodyModel[235] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 213
		bodyModel[235].addShapeBox(-3, 1, -0.4f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[235].setRotationPoint(33.75f, -14.0f, 8.65f);

		bodyModel[236] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 213
		bodyModel[236].addShapeBox(-2.75f, 1, -0.4f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[236].setRotationPoint(33.75f, -14.0f, 8.65f);

		bodyModel[237] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 213
		bodyModel[237].addShapeBox(-2.75f, 1, 0.48f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f);
		bodyModel[237].setRotationPoint(33.75f, -14.0f, 8.64f);

		bodyModel[238] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 82
		bodyModel[238].addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[238].setRotationPoint(51.1f, -14.8f, -3.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 82
		bodyModel[239].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[239].setRotationPoint(51.1f, -14.3f, -2.5f);

		bodyModel[240] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 82
		bodyModel[240].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f);
		bodyModel[240].setRotationPoint(51.1f, -13.8f, -2.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 85
		bodyModel[241].addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f);
		bodyModel[241].setRotationPoint(51.2f, -14.8f, -2.5f);

		bodyModel[242] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 52
		bodyModel[242].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0);
		bodyModel[242].setRotationPoint(-40.0f, -1.0f, 7.0f);

		bodyModel[243] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 52
		bodyModel[243].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0);
		bodyModel[243].setRotationPoint(-40.0f, -1.0f, -11.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 52
		bodyModel[244].addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0);
		bodyModel[244].setRotationPoint(-40.0f, -1.0f, -7.0f);

		bodyModel[245] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 253
		bodyModel[245].addBox(0, 0, 0, 5, 7, 9, 0f);
		bodyModel[245].setRotationPoint(21.0f, -12.0f, -4.5f);

		bodyModel[246] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 253
		bodyModel[246].addShapeBox(0, 0, 0, 2, 3, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[246].setRotationPoint(20.75f, -15.0f, -4.5f);

		bodyModel[247] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 255
		bodyModel[247].addBox(0, 0, 0, 1, 3, 2, 0f);
		bodyModel[247].setRotationPoint(22.0f, -21.0f, -1.0f);

		bodyModel[248] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 255
		bodyModel[248].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9f, 0, 0, 1, 0, 0, 1, -0.75f, 0, -0.9f, -0.75f, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, -0.75f, 0, 0, -0.75f);
		bodyModel[248].setRotationPoint(20.0f, -17.0f, -1.2f);

		bodyModel[249] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 255
		bodyModel[249].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9f, 0, 0, 1, 0, 0, 1, -0.75f, 0, -0.9f, -0.75f, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, -0.75f, 0, 0, -0.75f);
		bodyModel[249].setRotationPoint(20.0f, -17.0f, 0.9f);

		bodyModel[250] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 253
		bodyModel[250].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0);
		bodyModel[250].setRotationPoint(25.75f, -11.0f, 2.0f);

		bodyModel[251] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 253
		bodyModel[251].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, 0, 0, -0.3f);
		bodyModel[251].setRotationPoint(26.75f, -10.4f, 2.75f);

		bodyModel[252] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 253
		bodyModel[252].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, 0, 0, -0.3f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[252].setRotationPoint(26.75f, -10.4f, 2.75f);

		bodyModel[253] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 253
		bodyModel[253].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, 0, -0.5f, -0.3f, 0, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, 0, -0.2f, -0.3f);
		bodyModel[253].setRotationPoint(26.75f, -9.9f, 2.75f);

		bodyModel[254] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 256
		bodyModel[254].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f);
		bodyModel[254].setRotationPoint(21.55f, -14.75f, -3.5f);

		bodyModel[255] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 255
		bodyModel[255].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4f, 0, -0.9f, -0.5f, 0, -0.9f, -0.5f, -0.75f, 0, -0.4f, -0.75f);
		bodyModel[255].setRotationPoint(22.0f, -21.5f, -1.2f);

		bodyModel[256] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 255
		bodyModel[256].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4f, 0, -0.9f, -0.5f, 0, -0.9f, -0.5f, -0.75f, 0, -0.4f, -0.75f);
		bodyModel[256].setRotationPoint(22.0f, -21.5f, 0.9f);

		bodyModel[257] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 262
		bodyModel[257].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[257].setRotationPoint(24.75f, -10.0f, -9.75f);

		bodyModel[258] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 262
		bodyModel[258].addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(29.75f, -13.75f, -9.75f);

		bodyModel[259] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 264
		bodyModel[259].addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[259].setRotationPoint(24.75f, -10.25f, -9.75f);

		bodyModel[260] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 264
		bodyModel[260].addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f);
		bodyModel[260].setRotationPoint(29.5f, -13.75f, -9.75f);

		bodyModel[261] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 256
		bodyModel[261].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f);
		bodyModel[261].setRotationPoint(21.55f, -14.75f, -2.75f);

		bodyModel[262] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 256
		bodyModel[262].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f);
		bodyModel[262].setRotationPoint(21.55f, -14.75f, -2.0f);

		bodyModel[263] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 256
		bodyModel[263].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f);
		bodyModel[263].setRotationPoint(21.55f, -14.75f, -1.25f);

		bodyModel[264] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 253
		bodyModel[264].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[264].setRotationPoint(26.8f, -10.2f, 2.95f);

		bodyModel[265] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 253
		bodyModel[265].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[265].setRotationPoint(26.8f, -10.2f, 3.05f);

		bodyModel[266] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 253
		bodyModel[266].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[266].setRotationPoint(26.8f, -10.2f, 3.15f);

		bodyModel[267] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 253
		bodyModel[267].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[267].setRotationPoint(26.8f, -10.2f, 3.25f);

		bodyModel[268] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 253
		bodyModel[268].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[268].setRotationPoint(26.8f, -10.2f, 3.35f);

		bodyModel[269] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 253
		bodyModel[269].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f);
		bodyModel[269].setRotationPoint(26.8f, -10.2f, 3.45f);

		bodyModel[270] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 253
		bodyModel[270].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, 0, -0.5f, -0.3f, 0, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, 0, -0.2f, -0.3f);
		bodyModel[270].setRotationPoint(26.7f, -10.8f, 2.5f);

		bodyModel[271] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 272
		bodyModel[271].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[271].setRotationPoint(-26.0f, -3.0f, -6.87f);
		bodyModel[271].rotateAngleX = 0.7853982f;

		bodyModel[272] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 272
		bodyModel[272].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[272].setRotationPoint(-26.0f, -3.5f, -6.87f);
		bodyModel[272].rotateAngleX = 0.7853982f;

		bodyModel[273] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 272
		bodyModel[273].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[273].setRotationPoint(-26.0f, -4.0f, -6.87f);
		bodyModel[273].rotateAngleX = 0.7853982f;

		bodyModel[274] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 272
		bodyModel[274].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[274].setRotationPoint(-26.0f, -4.5f, -6.87f);
		bodyModel[274].rotateAngleX = 0.7853982f;

		bodyModel[275] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 272
		bodyModel[275].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[275].setRotationPoint(-26.0f, -5.0f, -6.87f);
		bodyModel[275].rotateAngleX = 0.7853982f;

		bodyModel[276] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 272
		bodyModel[276].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[276].setRotationPoint(-26.0f, -5.5f, -6.87f);
		bodyModel[276].rotateAngleX = 0.7853982f;

		bodyModel[277] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 272
		bodyModel[277].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[277].setRotationPoint(-26.0f, -6.0f, -6.87f);
		bodyModel[277].rotateAngleX = 0.7853982f;

		bodyModel[278] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 272
		bodyModel[278].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[278].setRotationPoint(-26.0f, -6.5f, -6.87f);
		bodyModel[278].rotateAngleX = 0.7853982f;

		bodyModel[279] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 272
		bodyModel[279].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[279].setRotationPoint(-26.0f, -7.0f, -6.87f);
		bodyModel[279].rotateAngleX = 0.7853982f;

		bodyModel[280] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 272
		bodyModel[280].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[280].setRotationPoint(-26.0f, -7.5f, -6.87f);
		bodyModel[280].rotateAngleX = 0.7853982f;

		bodyModel[281] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 272
		bodyModel[281].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[281].setRotationPoint(-26.0f, -8.0f, -6.87f);
		bodyModel[281].rotateAngleX = 0.7853982f;

		bodyModel[282] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 272
		bodyModel[282].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[282].setRotationPoint(-26.0f, -8.5f, -6.87f);
		bodyModel[282].rotateAngleX = 0.7853982f;

		bodyModel[283] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 272
		bodyModel[283].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[283].setRotationPoint(-26.0f, -9.0f, -6.87f);
		bodyModel[283].rotateAngleX = 0.7853982f;

		bodyModel[284] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 272
		bodyModel[284].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[284].setRotationPoint(-26.0f, -9.5f, -6.87f);
		bodyModel[284].rotateAngleX = 0.7853982f;

		bodyModel[285] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 272
		bodyModel[285].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[285].setRotationPoint(-26.0f, -10.0f, -6.87f);
		bodyModel[285].rotateAngleX = 0.7853982f;

		bodyModel[286] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 272
		bodyModel[286].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[286].setRotationPoint(-26.0f, -10.5f, -6.87f);
		bodyModel[286].rotateAngleX = 0.7853982f;

		bodyModel[287] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 272
		bodyModel[287].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[287].setRotationPoint(-26.0f, -11.0f, -6.87f);
		bodyModel[287].rotateAngleX = 0.7853982f;

		bodyModel[288] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 272
		bodyModel[288].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[288].setRotationPoint(-26.0f, -11.5f, -6.87f);
		bodyModel[288].rotateAngleX = 0.7853982f;

		bodyModel[289] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 272
		bodyModel[289].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[289].setRotationPoint(-26.0f, -12.0f, -6.87f);
		bodyModel[289].rotateAngleX = 0.7853982f;

		bodyModel[290] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 272
		bodyModel[290].addBox(0, 0, 0, 11, 0, 1, 0f);
		bodyModel[290].setRotationPoint(-26.0f, -12.5f, -6.87f);
		bodyModel[290].rotateAngleX = 0.7853982f;

		bodyModel[291] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 272
		bodyModel[291].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[291].setRotationPoint(-26.0f, -3.0f, 6.85f);
		bodyModel[291].rotateAngleX = -0.7853982f;

		bodyModel[292] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 272
		bodyModel[292].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[292].setRotationPoint(-26.0f, -3.5f, 6.85f);
		bodyModel[292].rotateAngleX = -0.7853982f;

		bodyModel[293] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 272
		bodyModel[293].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[293].setRotationPoint(-26.0f, -4.0f, 6.85f);
		bodyModel[293].rotateAngleX = -0.7853982f;

		bodyModel[294] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 272
		bodyModel[294].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[294].setRotationPoint(-26.0f, -4.5f, 6.85f);
		bodyModel[294].rotateAngleX = -0.7853982f;

		bodyModel[295] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 272
		bodyModel[295].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[295].setRotationPoint(-26.0f, -5.0f, 6.85f);
		bodyModel[295].rotateAngleX = -0.7853982f;

		bodyModel[296] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 272
		bodyModel[296].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[296].setRotationPoint(-26.0f, -5.5f, 6.85f);
		bodyModel[296].rotateAngleX = -0.7853982f;

		bodyModel[297] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 272
		bodyModel[297].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[297].setRotationPoint(-26.0f, -6.0f, 6.85f);
		bodyModel[297].rotateAngleX = -0.7853982f;

		bodyModel[298] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 272
		bodyModel[298].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[298].setRotationPoint(-26.0f, -6.5f, 6.85f);
		bodyModel[298].rotateAngleX = -0.7853982f;

		bodyModel[299] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 272
		bodyModel[299].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[299].setRotationPoint(-26.0f, -7.0f, 6.85f);
		bodyModel[299].rotateAngleX = -0.7853982f;

		bodyModel[300] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 272
		bodyModel[300].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[300].setRotationPoint(-26.0f, -7.5f, 6.85f);
		bodyModel[300].rotateAngleX = -0.7853982f;

		bodyModel[301] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 272
		bodyModel[301].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[301].setRotationPoint(-26.0f, -8.0f, 6.85f);
		bodyModel[301].rotateAngleX = -0.7853982f;

		bodyModel[302] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 272
		bodyModel[302].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[302].setRotationPoint(-26.0f, -8.5f, 6.85f);
		bodyModel[302].rotateAngleX = -0.7853982f;

		bodyModel[303] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 272
		bodyModel[303].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[303].setRotationPoint(-26.0f, -9.0f, 6.85f);
		bodyModel[303].rotateAngleX = -0.7853982f;

		bodyModel[304] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 272
		bodyModel[304].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[304].setRotationPoint(-26.0f, -9.5f, 6.85f);
		bodyModel[304].rotateAngleX = -0.7853982f;

		bodyModel[305] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 272
		bodyModel[305].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[305].setRotationPoint(-26.0f, -10.0f, 6.85f);
		bodyModel[305].rotateAngleX = -0.7853982f;

		bodyModel[306] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 272
		bodyModel[306].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[306].setRotationPoint(-26.0f, -10.5f, 6.85f);
		bodyModel[306].rotateAngleX = -0.7853982f;

		bodyModel[307] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 272
		bodyModel[307].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[307].setRotationPoint(-26.0f, -11.0f, 6.85f);
		bodyModel[307].rotateAngleX = -0.7853982f;

		bodyModel[308] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 272
		bodyModel[308].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[308].setRotationPoint(-26.0f, -11.5f, 6.85f);
		bodyModel[308].rotateAngleX = -0.7853982f;

		bodyModel[309] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 272
		bodyModel[309].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[309].setRotationPoint(-26.0f, -12.0f, 6.85f);
		bodyModel[309].rotateAngleX = -0.7853982f;

		bodyModel[310] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 272
		bodyModel[310].addBox(0, 0, -1, 11, 0, 1, 0f);
		bodyModel[310].setRotationPoint(-26.0f, -12.5f, 6.85f);
		bodyModel[310].rotateAngleX = -0.7853982f;

		bodyModel[311] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 331
		bodyModel[311].addShapeBox(0, 0, 0, 1, 12, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[311].setRotationPoint(15.5f, -13.0f, -7.0f);

		bodyModel[312] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 332
		bodyModel[312].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[312].setRotationPoint(12.13f, -13.0f, 6.0f);
		bodyModel[312].rotateAngleY = -0.7853982f;

		bodyModel[313] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 332
		bodyModel[313].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[313].setRotationPoint(12.63f, -13.0f, 6.0f);
		bodyModel[313].rotateAngleY = -0.7853982f;

		bodyModel[314] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 332
		bodyModel[314].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[314].setRotationPoint(13.13f, -13.0f, 6.0f);
		bodyModel[314].rotateAngleY = -0.7853982f;

		bodyModel[315] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 332
		bodyModel[315].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[315].setRotationPoint(13.63f, -13.0f, 6.0f);
		bodyModel[315].rotateAngleY = -0.7853982f;

		bodyModel[316] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 332
		bodyModel[316].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[316].setRotationPoint(14.13f, -13.0f, 6.0f);
		bodyModel[316].rotateAngleY = -0.7853982f;

		bodyModel[317] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 332
		bodyModel[317].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[317].setRotationPoint(14.63f, -13.0f, 6.0f);
		bodyModel[317].rotateAngleY = -0.7853982f;

		bodyModel[318] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 332
		bodyModel[318].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[318].setRotationPoint(18.63f, -13.0f, 6.75f);
		bodyModel[318].rotateAngleY = 0.7853982f;

		bodyModel[319] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 332
		bodyModel[319].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[319].setRotationPoint(18.13f, -13.0f, 6.75f);
		bodyModel[319].rotateAngleY = 0.7853982f;

		bodyModel[320] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 332
		bodyModel[320].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[320].setRotationPoint(17.63f, -13.0f, 6.75f);
		bodyModel[320].rotateAngleY = 0.7853982f;

		bodyModel[321] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 332
		bodyModel[321].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[321].setRotationPoint(17.13f, -13.0f, 6.75f);
		bodyModel[321].rotateAngleY = 0.7853982f;

		bodyModel[322] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 332
		bodyModel[322].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[322].setRotationPoint(16.63f, -13.0f, 6.75f);
		bodyModel[322].rotateAngleY = 0.7853982f;

		bodyModel[323] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 332
		bodyModel[323].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[323].setRotationPoint(16.13f, -13.0f, 6.75f);
		bodyModel[323].rotateAngleY = 0.7853982f;

		bodyModel[324] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 332
		bodyModel[324].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[324].setRotationPoint(16.13f, -13.0f, -6.75f);
		bodyModel[324].rotateAngleY = -0.7853982f;

		bodyModel[325] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 332
		bodyModel[325].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[325].setRotationPoint(16.63f, -13.0f, -6.75f);
		bodyModel[325].rotateAngleY = -0.7853982f;

		bodyModel[326] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 332
		bodyModel[326].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[326].setRotationPoint(17.13f, -13.0f, -6.75f);
		bodyModel[326].rotateAngleY = -0.7853982f;

		bodyModel[327] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 332
		bodyModel[327].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[327].setRotationPoint(17.63f, -13.0f, -6.75f);
		bodyModel[327].rotateAngleY = -0.7853982f;

		bodyModel[328] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 332
		bodyModel[328].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[328].setRotationPoint(18.13f, -13.0f, -6.75f);
		bodyModel[328].rotateAngleY = -0.7853982f;

		bodyModel[329] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 332
		bodyModel[329].addBox(0, 0, 0, 0, 12, 1, 0f);
		bodyModel[329].setRotationPoint(18.63f, -13.0f, -6.75f);
		bodyModel[329].rotateAngleY = -0.7853982f;

		bodyModel[330] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 332
		bodyModel[330].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[330].setRotationPoint(14.63f, -13.0f, -6.0f);
		bodyModel[330].rotateAngleY = 0.7853982f;

		bodyModel[331] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 332
		bodyModel[331].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[331].setRotationPoint(14.13f, -13.0f, -6.0f);
		bodyModel[331].rotateAngleY = 0.7853982f;

		bodyModel[332] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 332
		bodyModel[332].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[332].setRotationPoint(13.63f, -13.0f, -6.0f);
		bodyModel[332].rotateAngleY = 0.7853982f;

		bodyModel[333] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 332
		bodyModel[333].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[333].setRotationPoint(13.13f, -13.0f, -6.0f);
		bodyModel[333].rotateAngleY = 0.7853982f;

		bodyModel[334] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 332
		bodyModel[334].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[334].setRotationPoint(12.63f, -13.0f, -6.0f);
		bodyModel[334].rotateAngleY = 0.7853982f;

		bodyModel[335] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 332
		bodyModel[335].addBox(0, 0, -1, 0, 12, 1, 0f);
		bodyModel[335].setRotationPoint(12.13f, -13.0f, -6.0f);
		bodyModel[335].rotateAngleY = 0.7853982f;

		bodyModel[336] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 272
		bodyModel[336].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[336].setRotationPoint(38.0f, -8.0f, 6.85f);
		bodyModel[336].rotateAngleX = -0.7853982f;

		bodyModel[337] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 272
		bodyModel[337].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[337].setRotationPoint(38.0f, -8.5f, 6.85f);
		bodyModel[337].rotateAngleX = -0.7853982f;

		bodyModel[338] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 272
		bodyModel[338].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[338].setRotationPoint(38.0f, -9.0f, 6.85f);
		bodyModel[338].rotateAngleX = -0.7853982f;

		bodyModel[339] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 272
		bodyModel[339].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[339].setRotationPoint(38.0f, -9.5f, 6.85f);
		bodyModel[339].rotateAngleX = -0.7853982f;

		bodyModel[340] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 272
		bodyModel[340].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[340].setRotationPoint(38.0f, -10.0f, 6.85f);
		bodyModel[340].rotateAngleX = -0.7853982f;

		bodyModel[341] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 272
		bodyModel[341].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[341].setRotationPoint(38.0f, -10.5f, 6.85f);
		bodyModel[341].rotateAngleX = -0.7853982f;

		bodyModel[342] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 272
		bodyModel[342].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[342].setRotationPoint(38.0f, -11.0f, 6.85f);
		bodyModel[342].rotateAngleX = -0.7853982f;

		bodyModel[343] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 272
		bodyModel[343].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[343].setRotationPoint(38.0f, -11.5f, 6.85f);
		bodyModel[343].rotateAngleX = -0.7853982f;

		bodyModel[344] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 272
		bodyModel[344].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[344].setRotationPoint(38.0f, -12.0f, 6.85f);
		bodyModel[344].rotateAngleX = -0.7853982f;

		bodyModel[345] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 272
		bodyModel[345].addBox(0, 0, -1, 7, 0, 1, 0f);
		bodyModel[345].setRotationPoint(38.0f, -12.5f, 6.85f);
		bodyModel[345].rotateAngleX = -0.7853982f;

		bodyModel[346] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 272
		bodyModel[346].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[346].setRotationPoint(38.0f, -8.0f, -6.87f);
		bodyModel[346].rotateAngleX = 0.7853982f;

		bodyModel[347] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 272
		bodyModel[347].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[347].setRotationPoint(38.0f, -8.5f, -6.87f);
		bodyModel[347].rotateAngleX = 0.7853982f;

		bodyModel[348] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 272
		bodyModel[348].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[348].setRotationPoint(38.0f, -9.0f, -6.87f);
		bodyModel[348].rotateAngleX = 0.7853982f;

		bodyModel[349] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 272
		bodyModel[349].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[349].setRotationPoint(38.0f, -9.5f, -6.87f);
		bodyModel[349].rotateAngleX = 0.7853982f;

		bodyModel[350] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 272
		bodyModel[350].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[350].setRotationPoint(38.0f, -10.0f, -6.87f);
		bodyModel[350].rotateAngleX = 0.7853982f;

		bodyModel[351] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 272
		bodyModel[351].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[351].setRotationPoint(38.0f, -10.5f, -6.87f);
		bodyModel[351].rotateAngleX = 0.7853982f;

		bodyModel[352] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 272
		bodyModel[352].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[352].setRotationPoint(38.0f, -11.0f, -6.87f);
		bodyModel[352].rotateAngleX = 0.7853982f;

		bodyModel[353] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 272
		bodyModel[353].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[353].setRotationPoint(38.0f, -11.5f, -6.87f);
		bodyModel[353].rotateAngleX = 0.7853982f;

		bodyModel[354] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 272
		bodyModel[354].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[354].setRotationPoint(38.0f, -12.0f, -6.87f);
		bodyModel[354].rotateAngleX = 0.7853982f;

		bodyModel[355] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 272
		bodyModel[355].addBox(0, 0, 0, 7, 0, 1, 0f);
		bodyModel[355].setRotationPoint(38.0f, -12.5f, -6.87f);
		bodyModel[355].rotateAngleX = 0.7853982f;

		bodyModel[356] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 382
		bodyModel[356].addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, -1, 0, 0, -1, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[356].setRotationPoint(-36.75f, 5.0f, -9.5f);
		bodyModel[356].rotateAngleY = 0.034906585f;

		bodyModel[357] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 382
		bodyModel[357].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.75f, 0, -1.25f, -1.25f, 0, 0, 0.5f, 0, 0);
		bodyModel[357].setRotationPoint(-36.75f, 7.0f, -8.5f);
		bodyModel[357].rotateAngleY = 0.034906585f;

		bodyModel[358] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 382
		bodyModel[358].addShapeBox(0, 0, -7, 1, 2, 7, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, -1, -0.75f, 0, -1);
		bodyModel[358].setRotationPoint(-36.75f, 5.0f, 9.5f);
		bodyModel[358].rotateAngleY = -0.034906585f;

		bodyModel[359] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 382
		bodyModel[359].addShapeBox(0, 0, -7, 1, 1, 6, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, 0, 0, -1.25f, 0, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f);
		bodyModel[359].setRotationPoint(-36.75f, 7.0f, 9.5f);
		bodyModel[359].rotateAngleY = -0.034906585f;

		bodyModel[360] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 382
		bodyModel[360].addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, -1, -0.75f, 0, -1, 0, 0, 0, -0.75f, 0, 0);
		bodyModel[360].setRotationPoint(52.75f, 5.0f, -9.5f);
		bodyModel[360].rotateAngleY = -0.034906585f;

		bodyModel[361] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 382
		bodyModel[361].addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f, 0.5f, 0, 0, -1.25f, 0, 0);
		bodyModel[361].setRotationPoint(52.75f, 7.0f, -8.5f);
		bodyModel[361].rotateAngleY = -0.034906585f;

		bodyModel[362] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 382
		bodyModel[362].addShapeBox(0, 0, -7, 1, 2, 7, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, -1, 0, 0, -1);
		bodyModel[362].setRotationPoint(52.75f, 5.0f, 9.5f);
		bodyModel[362].rotateAngleY = 0.034906585f;

		bodyModel[363] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 382
		bodyModel[363].addShapeBox(0, 0, -7, 1, 1, 6, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -1.25f, -0.75f, 0, -1.25f);
		bodyModel[363].setRotationPoint(52.75f, 7.0f, 9.5f);
		bodyModel[363].rotateAngleY = 0.034906585f;

		bodyModel[364] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 392
		bodyModel[364].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[364].setRotationPoint(-41.0f, 0.0f, 4.0f);

		bodyModel[365] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 392
		bodyModel[365].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[365].setRotationPoint(-41.0f, 0.0f, -7.0f);

		bodyModel[366] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 394
		bodyModel[366].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[366].setRotationPoint(-40.75f, 0.5f, 4.5f);

		bodyModel[367] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 394
		bodyModel[367].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[367].setRotationPoint(-40.75f, 0.5f, -6.5f);

		bodyModel[368] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 392
		bodyModel[368].addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0);
		bodyModel[368].setRotationPoint(57.0f, 0.0f, 4.0f);

		bodyModel[369] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 394
		bodyModel[369].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[369].setRotationPoint(54.75f, 0.5f, 4.5f);

		bodyModel[370] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 392
		bodyModel[370].addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0);
		bodyModel[370].setRotationPoint(57.0f, 0.0f, -7.0f);

		bodyModel[371] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 394
		bodyModel[371].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[371].setRotationPoint(54.75f, 0.5f, -6.5f);

		bodyModel[372] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 38
		bodyModel[372].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f);
		bodyModel[372].setRotationPoint(50.0f, -17.0f, -0.5f);

		bodyModel[373] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 38
		bodyModel[373].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0);
		bodyModel[373].setRotationPoint(49.15f, -18.0f, -0.5f);

		bodyModel[374] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 38
		bodyModel[374].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f);
		bodyModel[374].setRotationPoint(49.15f, -18.0f, -1.5f);

		bodyModel[375] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 38
		bodyModel[375].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.15f, 0, -0.5f);
		bodyModel[375].setRotationPoint(50.0f, -17.0f, -1.5f);

		bodyModel[376] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 38
		bodyModel[376].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0);
		bodyModel[376].setRotationPoint(50.0f, -18.0f, -0.5f);

		bodyModel[377] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 38
		bodyModel[377].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f);
		bodyModel[377].setRotationPoint(50.0f, -18.0f, -1.5f);

		bodyModel[378] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 38
		bodyModel[378].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f);
		bodyModel[378].setRotationPoint(51.15f, -17.0f, -0.5f);

		bodyModel[379] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 38
		bodyModel[379].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f);
		bodyModel[379].setRotationPoint(51.15f, -17.0f, -1.5f);

		bodyModel[380] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 38
		bodyModel[380].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0);
		bodyModel[380].setRotationPoint(51.15f, -18.0f, -0.5f);

		bodyModel[381] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 38
		bodyModel[381].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f);
		bodyModel[381].setRotationPoint(51.15f, -18.0f, -1.5f);

		bodyModel[382] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 3
		bodyModel[382].addBox(0, 0, 0, 1, 2, 4, 0f);
		bodyModel[382].setRotationPoint(-39.0f, -0.5f, -2.0f);

		bodyModel[383] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 411
		bodyModel[383].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[383].setRotationPoint(-42.0f, -0.5f, -1.0f);

		bodyModel[384] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 3
		bodyModel[384].addBox(0, 0, 0, 1, 2, 4, 0f);
		bodyModel[384].setRotationPoint(55.0f, -0.5f, -2.0f);

		bodyModel[385] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 411
		bodyModel[385].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[385].setRotationPoint(56.0f, -0.5f, -1.0f);

		bodyModel[386] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 38
		bodyModel[386].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f);
		bodyModel[386].setRotationPoint(54.6f, -3.0f, 8.5f);

		bodyModel[387] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 38
		bodyModel[387].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f);
		bodyModel[387].setRotationPoint(54.25f, -3.0f, 8.5f);

		bodyModel[388] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 38
		bodyModel[388].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f);
		bodyModel[388].setRotationPoint(54.25f, -3.0f, 7.5f);

		bodyModel[389] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 38
		bodyModel[389].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f);
		bodyModel[389].setRotationPoint(54.6f, -3.0f, 7.5f);

		bodyModel[390] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 38
		bodyModel[390].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0);
		bodyModel[390].setRotationPoint(54.6f, -4.0f, 8.5f);

		bodyModel[391] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 38
		bodyModel[391].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f);
		bodyModel[391].setRotationPoint(54.6f, -4.0f, 7.5f);

		bodyModel[392] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 38
		bodyModel[392].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f);
		bodyModel[392].setRotationPoint(55.75f, -3.0f, 8.5f);

		bodyModel[393] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 38
		bodyModel[393].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f);
		bodyModel[393].setRotationPoint(55.75f, -3.0f, 7.5f);

		bodyModel[394] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 38
		bodyModel[394].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0);
		bodyModel[394].setRotationPoint(55.75f, -4.0f, 8.5f);

		bodyModel[395] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 38
		bodyModel[395].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f);
		bodyModel[395].setRotationPoint(55.75f, -4.0f, 7.5f);

		bodyModel[396] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 38
		bodyModel[396].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0);
		bodyModel[396].setRotationPoint(54.25f, -4.0f, 8.5f);

		bodyModel[397] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 38
		bodyModel[397].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f);
		bodyModel[397].setRotationPoint(54.25f, -4.0f, 7.5f);

		bodyModel[398] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 66
		bodyModel[398].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[398].setRotationPoint(55.45f, -2.5f, 7.5f);

		bodyModel[399] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 67
		bodyModel[399].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[399].setRotationPoint(55.45f, -5.0f, 8.5f);

		bodyModel[400] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 38
		bodyModel[400].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f);
		bodyModel[400].setRotationPoint(54.6f, -3.0f, -9.5f);

		bodyModel[401] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 38
		bodyModel[401].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f);
		bodyModel[401].setRotationPoint(54.25f, -3.0f, -9.5f);

		bodyModel[402] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 38
		bodyModel[402].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f);
		bodyModel[402].setRotationPoint(54.25f, -3.0f, -10.5f);

		bodyModel[403] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 38
		bodyModel[403].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f);
		bodyModel[403].setRotationPoint(54.6f, -3.0f, -10.5f);

		bodyModel[404] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 38
		bodyModel[404].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0);
		bodyModel[404].setRotationPoint(54.6f, -4.0f, -9.5f);

		bodyModel[405] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 38
		bodyModel[405].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f);
		bodyModel[405].setRotationPoint(54.6f, -4.0f, -10.5f);

		bodyModel[406] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 38
		bodyModel[406].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f);
		bodyModel[406].setRotationPoint(55.75f, -3.0f, -9.5f);

		bodyModel[407] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 38
		bodyModel[407].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f);
		bodyModel[407].setRotationPoint(55.75f, -3.0f, -10.5f);

		bodyModel[408] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 38
		bodyModel[408].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0);
		bodyModel[408].setRotationPoint(55.75f, -4.0f, -9.5f);

		bodyModel[409] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 38
		bodyModel[409].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f);
		bodyModel[409].setRotationPoint(55.75f, -4.0f, -10.5f);

		bodyModel[410] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 38
		bodyModel[410].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0);
		bodyModel[410].setRotationPoint(54.25f, -4.0f, -9.5f);

		bodyModel[411] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 38
		bodyModel[411].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f);
		bodyModel[411].setRotationPoint(54.25f, -4.0f, -10.5f);

		bodyModel[412] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 66
		bodyModel[412].addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0);
		bodyModel[412].setRotationPoint(55.45f, -2.5f, -10.5f);

		bodyModel[413] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 67
		bodyModel[413].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[413].setRotationPoint(55.45f, -5.0f, -9.5f);

		bodyModel[414] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 442
		bodyModel[414].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f);
		bodyModel[414].setRotationPoint(21.35f, -14.75f, -0.5f);

		bodyModel[415] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 442
		bodyModel[415].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[415].setRotationPoint(21.35f, -14.75f, -0.5f);

		bodyModel[416] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 442
		bodyModel[416].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.1f, -0.125f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[416].setRotationPoint(21.35f, -14.75f, -0.5f);

		bodyModel[417] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 442
		bodyModel[417].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0.1f, -0.125f, -0.125f, 0.125f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[417].setRotationPoint(21.35f, -14.75f, -0.5f);

		bodyModel[418] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 442
		bodyModel[418].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f);
		bodyModel[418].setRotationPoint(21.35f, -14.75f, 0.5f);

		bodyModel[419] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 442
		bodyModel[419].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[419].setRotationPoint(21.35f, -14.75f, 0.5f);

		bodyModel[420] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 442
		bodyModel[420].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.1f, -0.125f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[420].setRotationPoint(21.35f, -14.75f, 0.5f);

		bodyModel[421] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 442
		bodyModel[421].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0.1f, -0.125f, -0.125f, 0.125f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[421].setRotationPoint(21.35f, -14.75f, 0.5f);

		bodyModel[422] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 451
		bodyModel[422].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[422].setRotationPoint(21.4f, -14.5f, 1.75f);

		bodyModel[423] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 451
		bodyModel[423].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[423].setRotationPoint(21.4f, -14.5f, 2.35f);

		bodyModel[424] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 451
		bodyModel[424].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[424].setRotationPoint(21.4f, -14.5f, 2.95f);

		bodyModel[425] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 451
		bodyModel[425].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[425].setRotationPoint(21.4f, -14.5f, 3.55f);

		bodyModel[426] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 451
		bodyModel[426].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[426].setRotationPoint(21.6f, -13.75f, 2.05f);

		bodyModel[427] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 451
		bodyModel[427].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[427].setRotationPoint(21.6f, -13.75f, 2.65f);

		bodyModel[428] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 451
		bodyModel[428].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[428].setRotationPoint(21.6f, -13.75f, 3.25f);

		bodyModel[429] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 459
		bodyModel[429].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 2.75f, -1, -0.5f, 2.75f, -1, -0.5f, 0, 0, 0, 0, 0, 0, -3.5f, -1, -0.5f, -3.5f, -1);
		bodyModel[429].setRotationPoint(28.75f, -7.0f, -9.75f);

		bodyModel[430] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 459
		bodyModel[430].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 2.75f, -1, -0.5f, 2.75f, -1, -0.5f, 0, 0, 0, 0, 0, 0, -3.5f, -1, -0.5f, -3.5f, -1);
		bodyModel[430].setRotationPoint(24.75f, -7.0f, -9.75f);

		bodyModel[431] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 262
		bodyModel[431].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[431].setRotationPoint(24.75f, -10.0f, 4.75f);

		bodyModel[432] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 262
		bodyModel[432].addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[432].setRotationPoint(29.75f, -13.75f, 4.75f);

		bodyModel[433] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 264
		bodyModel[433].addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[433].setRotationPoint(24.75f, -10.25f, 4.75f);

		bodyModel[434] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 264
		bodyModel[434].addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f);
		bodyModel[434].setRotationPoint(29.5f, -13.75f, 4.75f);

		bodyModel[435] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 459
		bodyModel[435].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 2.75f, -1, 0, 2.75f, -1, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -3.5f, -1, 0, -3.5f, -1, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[435].setRotationPoint(28.75f, -7.0f, 3.75f);

		bodyModel[436] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 459
		bodyModel[436].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 2.75f, -1, 0, 2.75f, -1, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -3.5f, -1, 0, -3.5f, -1, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[436].setRotationPoint(24.75f, -7.0f, 3.75f);

		bodyModel[437] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 467
		bodyModel[437].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[437].setRotationPoint(21.0f, -14.0f, 5.25f);

		bodyModel[438] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 469
		bodyModel[438].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[438].setRotationPoint(29.0f, -22.0f, -2.0f);

		bodyModel[439] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 469
		bodyModel[439].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.875f);
		bodyModel[439].setRotationPoint(29.0f, -22.0f, 0.0f);

		bodyModel[440] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 469
		bodyModel[440].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[440].setRotationPoint(31.0f, -22.0f, -2.0f);

		bodyModel[441] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 469
		bodyModel[441].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.5f);
		bodyModel[441].setRotationPoint(31.0f, -22.0f, 0.0f);

		bodyModel[442] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 473
		bodyModel[442].addBox(0, 0, 0, 1, 1, 2, 0f);
		bodyModel[442].setRotationPoint(26.0f, -22.0f, -1.0f);

		bodyModel[443] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 14
		bodyModel[443].addShapeBox(0, 0, 0, 37, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[443].setRotationPoint(-16.0f, -17.0f, -5.0f);

		bodyModel[444] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 476
		bodyModel[444].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0);
		bodyModel[444].setRotationPoint(-21.0f, -16.75f, 0.0f);

		bodyModel[445] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 476
		bodyModel[445].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f);
		bodyModel[445].setRotationPoint(-23.0f, -16.75f, 0.0f);

		bodyModel[446] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 476
		bodyModel[446].addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[446].setRotationPoint(-21.0f, -16.75f, -2.0f);

		bodyModel[447] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 476
		bodyModel[447].addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[447].setRotationPoint(-23.0f, -16.75f, -2.0f);

		bodyModel[448] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 480
		bodyModel[448].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[448].setRotationPoint(-20.0f, -17.0f, 4.0f);

		bodyModel[449] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 480
		bodyModel[449].addShapeBox(0, 0, 0, 1, 2, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[449].setRotationPoint(-17.0f, -17.0f, 1.0f);

		bodyModel[450] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 482
		bodyModel[450].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[450].setRotationPoint(-18.0f, -17.0f, 3.0f);

		bodyModel[451] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 483
		bodyModel[451].addBox(0, 0, 0, 2, 2, 1, 0f);
		bodyModel[451].setRotationPoint(-26.0f, -17.0f, -5.0f);

		bodyModel[452] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 483
		bodyModel[452].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[452].setRotationPoint(-26.0f, -17.0f, -4.0f);

		bodyModel[453] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 480
		bodyModel[453].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[453].setRotationPoint(-24.0f, -17.0f, 4.0f);

		bodyModel[454] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 480
		bodyModel[454].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[454].setRotationPoint(-26.0f, -17.0f, 1.0f);

		bodyModel[455] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 483
		bodyModel[455].addBox(0, 0, 0, 2, 2, 1, 0f);
		bodyModel[455].setRotationPoint(-18.0f, -17.0f, -5.0f);

		bodyModel[456] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 483
		bodyModel[456].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[456].setRotationPoint(-17.0f, -17.0f, -4.0f);

		bodyModel[457] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 482
		bodyModel[457].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[457].setRotationPoint(-25.0f, -17.0f, 3.0f);

		bodyModel[458] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 480
		bodyModel[458].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[458].setRotationPoint(-20.0f, -17.0f, -5.0f);

		bodyModel[459] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 480
		bodyModel[459].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[459].setRotationPoint(-17.0f, -17.0f, -3.0f);

		bodyModel[460] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 482
		bodyModel[460].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[460].setRotationPoint(-18.0f, -17.0f, -4.0f);

		bodyModel[461] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 480
		bodyModel[461].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[461].setRotationPoint(-24.0f, -17.0f, -5.0f);

		bodyModel[462] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 480
		bodyModel[462].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[462].setRotationPoint(-26.0f, -17.0f, -3.0f);

		bodyModel[463] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 482
		bodyModel[463].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[463].setRotationPoint(-25.0f, -17.0f, -4.0f);

		bodyModel[464] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 483
		bodyModel[464].addBox(0, 0, 0, 2, 2, 1, 0f);
		bodyModel[464].setRotationPoint(-26.0f, -17.0f, 4.0f);

		bodyModel[465] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 483
		bodyModel[465].addBox(0, 0, 0, 2, 2, 1, 0f);
		bodyModel[465].setRotationPoint(-18.0f, -17.0f, 4.0f);

		bodyModel[466] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 483
		bodyModel[466].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[466].setRotationPoint(-26.0f, -17.0f, 3.0f);

		bodyModel[467] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 483
		bodyModel[467].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[467].setRotationPoint(-17.0f, -17.0f, 3.0f);

		bodyModel[468] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 500
		bodyModel[468].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[468].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[468].rotateAngleX = 0.34906584f;
		bodyModel[468].rotateAngleY = -4.3196898f;

		bodyModel[469] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 500
		bodyModel[469].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[469].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[469].rotateAngleX = 0.34906584f;
		bodyModel[469].rotateAngleY = -1.1780972f;

		bodyModel[470] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 500
		bodyModel[470].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[470].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[470].rotateAngleX = 0.34906584f;
		bodyModel[470].rotateAngleY = -2.7488935f;

		bodyModel[471] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 500
		bodyModel[471].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[471].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[471].rotateAngleX = 0.34906584f;
		bodyModel[471].rotateAngleY = 0.3926991f;

		bodyModel[472] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 500
		bodyModel[472].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[472].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[472].rotateAngleX = 0.34906584f;
		bodyModel[472].rotateAngleY = -3.5342917f;

		bodyModel[473] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 500
		bodyModel[473].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[473].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[473].rotateAngleX = 0.34906584f;
		bodyModel[473].rotateAngleY = -0.3926991f;

		bodyModel[474] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 500
		bodyModel[474].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[474].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[474].rotateAngleX = 0.34906584f;
		bodyModel[474].rotateAngleY = -1.9634954f;

		bodyModel[475] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 500
		bodyModel[475].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[475].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[475].rotateAngleX = 0.34906584f;
		bodyModel[475].rotateAngleY = 1.1780972f;

		bodyModel[476] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 500
		bodyModel[476].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[476].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[476].rotateAngleX = 0.34906584f;
		bodyModel[476].rotateAngleY = -3.9269907f;

		bodyModel[477] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 500
		bodyModel[477].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[477].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[477].rotateAngleX = 0.34906584f;
		bodyModel[477].rotateAngleY = -0.7853982f;

		bodyModel[478] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 500
		bodyModel[478].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[478].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[478].rotateAngleX = 0.34906584f;
		bodyModel[478].rotateAngleY = -2.3561945f;

		bodyModel[479] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 500
		bodyModel[479].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[479].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[479].rotateAngleX = 0.34906584f;
		bodyModel[479].rotateAngleY = 0.7853982f;

		bodyModel[480] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 500
		bodyModel[480].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[480].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[480].rotateAngleX = 0.34906584f;
		bodyModel[480].rotateAngleY = -3.1415927f;

		bodyModel[481] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 500
		bodyModel[481].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[481].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[481].rotateAngleX = 0.34906584f;

		bodyModel[482] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 500
		bodyModel[482].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[482].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[482].rotateAngleX = 0.34906584f;
		bodyModel[482].rotateAngleY = -1.5707964f;

		bodyModel[483] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 500
		bodyModel[483].addBox(0, 0, -0.5f, 5, 0, 1, 0f);
		bodyModel[483].setRotationPoint(-21.0f, -16.0f, 0.0f);
		bodyModel[483].rotateAngleX = 0.34906584f;
		bodyModel[483].rotateAngleY = 1.5707964f;

		bodyModel[484] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 516
		bodyModel[484].addShapeBox(-5, 0, -1.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[484].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[485] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 516
		bodyModel[485].addShapeBox(-5, 0, -0.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[485].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[486] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 516
		bodyModel[486].addShapeBox(-5, 0, 0.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[486].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[487] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 516
		bodyModel[487].addShapeBox(-5, 0, 1, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[487].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[488] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 516
		bodyModel[488].addShapeBox(-5, 0, 1.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[488].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[489] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 516
		bodyModel[489].addShapeBox(-5, 0, 2.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[489].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[490] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 516
		bodyModel[490].addShapeBox(-5, 0, 3.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[490].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[491] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 516
		bodyModel[491].addShapeBox(-5, 0, 4, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[491].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[492] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 516
		bodyModel[492].addShapeBox(-5, 0, -4.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[492].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[493] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 516
		bodyModel[493].addShapeBox(-5, 0, -3.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[493].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[494] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 516
		bodyModel[494].addShapeBox(-5, 0, -2.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[494].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[495] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 516
		bodyModel[495].addShapeBox(-5, 0, -2, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[495].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[496] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 573
		bodyModel[496].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[496].setRotationPoint(17.0f, -11.0f, -11.0f);

		bodyModel[497] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 573
		bodyModel[497].addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[497].setRotationPoint(-32.25f, -11.25f, -11.0f);

		bodyModel[498] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 573
		bodyModel[498].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[498].setRotationPoint(7.8f, -10.5f, -11.0f);

		bodyModel[499] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 573
		bodyModel[499].addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[499].setRotationPoint(-32.25f, -5.0f, -11.0f);

		bodyModel[500] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 602
		bodyModel[500].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[500].setRotationPoint(-38.0f, -11.0f, 6.25f);

		bodyModel[501] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 602
		bodyModel[501].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[501].setRotationPoint(-38.0f, -6.0f, -11.25f);

		bodyModel[502] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 602
		bodyModel[502].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[502].setRotationPoint(-38.0f, -11.0f, -12.0f);

		bodyModel[503] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 602
		bodyModel[503].addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0);
		bodyModel[503].setRotationPoint(-38.0f, -11.25f, -6.5f);

		bodyModel[504] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 618
		bodyModel[504].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f);
		bodyModel[504].setRotationPoint(19.75f, -21.65f, -4.25f);

		bodyModel[505] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 626
		bodyModel[505].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[505].setRotationPoint(20.75f, -21.65f, -4.25f);

		bodyModel[506] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 626
		bodyModel[506].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f);
		bodyModel[506].setRotationPoint(18.75f, -21.4f, -4.0f);

		bodyModel[507] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 618
		bodyModel[507].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f);
		bodyModel[507].setRotationPoint(19.75f, -21.65f, -4.25f);

		bodyModel[508] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 618
		bodyModel[508].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[508].setRotationPoint(19.75f, -21.65f, -4.25f);

		bodyModel[509] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 618
		bodyModel[509].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0);
		bodyModel[509].setRotationPoint(19.75f, -21.65f, -4.25f);

		bodyModel[510] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 626
		bodyModel[510].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0);
		bodyModel[510].setRotationPoint(18.75f, -21.9f, -4.0f);

		bodyModel[511] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 626
		bodyModel[511].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f);
		bodyModel[511].setRotationPoint(18.75f, -21.4f, -4.5f);

		bodyModel[512] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 626
		bodyModel[512].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f);
		bodyModel[512].setRotationPoint(18.75f, -21.9f, -4.5f);

		bodyModel[513] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 618
		bodyModel[513].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f);
		bodyModel[513].setRotationPoint(19.75f, -21.65f, 3.2f);

		bodyModel[514] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 626
		bodyModel[514].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[514].setRotationPoint(20.75f, -21.65f, 3.2f);

		bodyModel[515] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 626
		bodyModel[515].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f);
		bodyModel[515].setRotationPoint(18.75f, -21.4f, 3.45f);

		bodyModel[516] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 618
		bodyModel[516].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f);
		bodyModel[516].setRotationPoint(19.75f, -21.65f, 3.2f);

		bodyModel[517] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 618
		bodyModel[517].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[517].setRotationPoint(19.75f, -21.65f, 3.2f);

		bodyModel[518] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 618
		bodyModel[518].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0);
		bodyModel[518].setRotationPoint(19.75f, -21.65f, 3.2f);

		bodyModel[519] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 626
		bodyModel[519].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0);
		bodyModel[519].setRotationPoint(18.75f, -21.9f, 3.45f);

		bodyModel[520] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 626
		bodyModel[520].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f);
		bodyModel[520].setRotationPoint(18.75f, -21.4f, 2.95f);

		bodyModel[521] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 626
		bodyModel[521].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f);
		bodyModel[521].setRotationPoint(18.75f, -21.9f, 2.95f);

		bodyModel[522] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 516
		bodyModel[522].addShapeBox(-5, 0, -5, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[522].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[523] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 516
		bodyModel[523].addShapeBox(-5, 0, 4.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f);
		bodyModel[523].setRotationPoint(-21.0f, -16.95f, 0.0f);

		bodyModel[524] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 570
		bodyModel[524].addShapeBox(-2.5f, 0, -2.5f, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[524].setRotationPoint(30.0f, -5.25f, -1.0f);
		bodyModel[524].rotateAngleY = -0.54105204f;

		bodyModel[525] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 602
		bodyModel[525].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[525].setRotationPoint(-38.0f, -11.0f, -7.25f);

		bodyModel[526] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 602
		bodyModel[526].addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0);
		bodyModel[526].setRotationPoint(-38.0f, -5.0f, -6.5f);

		bodyModel[527] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 602
		bodyModel[527].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f);
		bodyModel[527].setRotationPoint(-38.0f, -6.0f, 10.25f);

		bodyModel[528] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 602
		bodyModel[528].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f);
		bodyModel[528].setRotationPoint(-38.0f, -11.0f, 7.0f);

		bodyModel[529] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 602
		bodyModel[529].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[529].setRotationPoint(54.0f, -11.0f, 6.25f);

		bodyModel[530] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 602
		bodyModel[530].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[530].setRotationPoint(54.0f, -6.0f, -11.25f);

		bodyModel[531] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 602
		bodyModel[531].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0);
		bodyModel[531].setRotationPoint(54.0f, -11.0f, -12.0f);

		bodyModel[532] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 602
		bodyModel[532].addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0);
		bodyModel[532].setRotationPoint(54.0f, -11.25f, -6.5f);

		bodyModel[533] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 602
		bodyModel[533].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[533].setRotationPoint(54.0f, -11.0f, -7.25f);

		bodyModel[534] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 602
		bodyModel[534].addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0);
		bodyModel[534].setRotationPoint(54.0f, -5.0f, -6.5f);

		bodyModel[535] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 602
		bodyModel[535].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f);
		bodyModel[535].setRotationPoint(54.0f, -6.0f, 10.25f);

		bodyModel[536] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 602
		bodyModel[536].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f);
		bodyModel[536].setRotationPoint(54.0f, -11.0f, 7.0f);

		bodyModel[537] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 573
		bodyModel[537].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[537].setRotationPoint(-33.0f, -11.0f, -11.0f);

		bodyModel[538] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 573
		bodyModel[538].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[538].setRotationPoint(-22.8f, -10.5f, -11.0f);

		bodyModel[539] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 573
		bodyModel[539].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[539].setRotationPoint(-12.6f, -10.5f, -11.0f);

		bodyModel[540] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 573
		bodyModel[540].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[540].setRotationPoint(-2.4f, -10.5f, -11.0f);

		bodyModel[541] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 573
		bodyModel[541].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[541].setRotationPoint(17.0f, -11.0f, 10.0f);

		bodyModel[542] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 573
		bodyModel[542].addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[542].setRotationPoint(-32.25f, -11.25f, 10.0f);

		bodyModel[543] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 573
		bodyModel[543].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[543].setRotationPoint(7.8f, -10.5f, 10.0f);

		bodyModel[544] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 573
		bodyModel[544].addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[544].setRotationPoint(-32.25f, -5.0f, 10.0f);

		bodyModel[545] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 573
		bodyModel[545].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[545].setRotationPoint(-33.0f, -11.0f, 10.0f);

		bodyModel[546] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 573
		bodyModel[546].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[546].setRotationPoint(-22.8f, -10.5f, 10.0f);

		bodyModel[547] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 573
		bodyModel[547].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[547].setRotationPoint(-12.6f, -10.5f, 10.0f);

		bodyModel[548] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 573
		bodyModel[548].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[548].setRotationPoint(-2.4f, -10.5f, 10.0f);

		bodyModel[549] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 573
		bodyModel[549].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[549].setRotationPoint(38.0f, -11.0f, 10.0f);

		bodyModel[550] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 573
		bodyModel[550].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[550].setRotationPoint(49.0f, -11.0f, 10.0f);

		bodyModel[551] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 573
		bodyModel[551].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[551].setRotationPoint(38.75f, -11.25f, 10.0f);

		bodyModel[552] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 573
		bodyModel[552].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[552].setRotationPoint(38.75f, -5.0f, 10.0f);

		bodyModel[553] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 573
		bodyModel[553].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[553].setRotationPoint(38.0f, -11.0f, -11.0f);

		bodyModel[554] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 573
		bodyModel[554].addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[554].setRotationPoint(49.0f, -11.0f, -11.0f);

		bodyModel[555] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 573
		bodyModel[555].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[555].setRotationPoint(38.75f, -11.25f, -11.0f);

		bodyModel[556] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 573
		bodyModel[556].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		bodyModel[556].setRotationPoint(38.75f, -5.0f, -11.0f);

		bodyModel[557] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 559
		bodyModel[557].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f);
		bodyModel[557].setRotationPoint(21.0f, -10.5f, 5.5f);

		bodyModel[558] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 467
		bodyModel[558].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[558].setRotationPoint(20.75f, -12.0f, 5.25f);

		bodyModel[559] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 467
		bodyModel[559].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f);
		bodyModel[559].setRotationPoint(20.75f, -12.0f, 5.75f);

		bodyModel[560] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 467
		bodyModel[560].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
		bodyModel[560].setRotationPoint(21.25f, -12.0f, 5.25f);

		bodyModel[561] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 467
		bodyModel[561].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f);
		bodyModel[561].setRotationPoint(21.25f, -12.0f, 5.75f);

		bodyModel[562] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 559
		bodyModel[562].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f);
		bodyModel[562].setRotationPoint(21.0f, -12.0f, 6.12f);

		bodyModel[563] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 559
		bodyModel[563].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f);
		bodyModel[563].setRotationPoint(21.0f, -8.87f, 5.75f);
		bodyModel[563].rotateAngleX = 1.5707964f;

		bodyModel[564] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 573
		bodyModel[564].addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0);
		bodyModel[564].setRotationPoint(23.0f, -14.0f, 8.37f);

		bodyModel[565] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 574
		bodyModel[565].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f);
		bodyModel[565].setRotationPoint(23.0f, -14.3f, 8.17f);
		bodyModel[565].rotateAngleZ = -0.10471976f;

		bodyModel[566] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 575
		bodyModel[566].addShapeBox(-0.5f, -0.5f, 0, 1, 1, 2, 0, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0);
		bodyModel[566].setRotationPoint(23.47f, -14.05f, 7.0f);
		bodyModel[566].rotateAngleZ = -0.10471976f;

		bodyModel[567] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 576
		bodyModel[567].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[567].setRotationPoint(24.0f, -13.25f, -9.5f);

		bodyModel[568] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 576
		bodyModel[568].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[568].setRotationPoint(24.0f, -13.75f, -9.5f);

		bodyModel[569] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 576
		bodyModel[569].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[569].setRotationPoint(25.0f, -13.75f, 8.35f);

		bodyModel[570] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 576
		bodyModel[570].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f);
		bodyModel[570].setRotationPoint(24.0f, -13.25f, 8.5f);

		bodyModel[571] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 576
		bodyModel[571].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f);
		bodyModel[571].setRotationPoint(24.0f, -13.75f, 8.5f);

		bodyModel[572] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 576
		bodyModel[572].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[572].setRotationPoint(25.0f, -13.75f, -10.1f);

		bodyModel[573] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 598
		bodyModel[573].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[573].setRotationPoint(21.75f, -15.9f, 3.25f);
		bodyModel[573].rotateAngleY = 0.57595867f;

		bodyModel[574] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 255
		bodyModel[574].addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f);
		bodyModel[574].setRotationPoint(21.75f, -16.4f, 3.25f);
		bodyModel[574].rotateAngleY = 0.57595867f;

		bodyModel[575] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 598
		bodyModel[575].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[575].setRotationPoint(21.75f, -15.9f, 3.25f);
		bodyModel[575].rotateAngleX = 2.0943952f;
		bodyModel[575].rotateAngleY = 0.57595867f;

		bodyModel[576] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 598
		bodyModel[576].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[576].setRotationPoint(21.75f, -15.9f, 3.25f);
		bodyModel[576].rotateAngleX = 4.1887903f;
		bodyModel[576].rotateAngleY = 0.57595867f;

		bodyModel[577] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 255
		bodyModel[577].addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f);
		bodyModel[577].setRotationPoint(21.75f, -16.0f, 3.25f);
		bodyModel[577].rotateAngleY = 0.57595867f;

		bodyModel[578] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 598
		bodyModel[578].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[578].setRotationPoint(21.75f, -15.9f, -3.25f);
		bodyModel[578].rotateAngleX = 0.4537856f;
		bodyModel[578].rotateAngleY = -0.62831855f;

		bodyModel[579] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 255
		bodyModel[579].addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f);
		bodyModel[579].setRotationPoint(21.75f, -16.4f, -3.25f);
		bodyModel[579].rotateAngleY = -0.6457718f;

		bodyModel[580] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 598
		bodyModel[580].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[580].setRotationPoint(21.75f, -15.9f, -3.25f);
		bodyModel[580].rotateAngleX = 2.5481808f;
		bodyModel[580].rotateAngleY = -0.62831855f;

		bodyModel[581] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 598
		bodyModel[581].addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f);
		bodyModel[581].setRotationPoint(21.75f, -15.9f, -3.25f);
		bodyModel[581].rotateAngleX = 4.6425757f;
		bodyModel[581].rotateAngleY = -0.62831855f;

		bodyModel[582] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 255
		bodyModel[582].addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f);
		bodyModel[582].setRotationPoint(21.75f, -16.0f, -3.25f);
		bodyModel[582].rotateAngleY = -0.6457718f;

		bodyModel[583] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 576
		bodyModel[583].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[583].setRotationPoint(21.25f, -16.75f, -8.5f);
		bodyModel[583].rotateAngleX = 0.34906584f;

		bodyModel[584] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 576
		bodyModel[584].addShapeBox(0, 0, -2, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[584].setRotationPoint(21.25f, -16.75f, 8.75f);
		bodyModel[584].rotateAngleX = -0.34906584f;

		bodyModel[585] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 576
		bodyModel[585].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[585].setRotationPoint(34.0f, -16.75f, -8.5f);
		bodyModel[585].rotateAngleX = 0.34906584f;

		bodyModel[586] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 576
		bodyModel[586].addShapeBox(0, 0, -2, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		bodyModel[586].setRotationPoint(34.0f, -16.75f, 8.75f);
		bodyModel[586].rotateAngleX = -0.34906584f;

		bodyModel[587] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 587
		bodyModel[587].addShapeBox(-0.5f, 0, 0, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[587].setRotationPoint(24.5f, -10.5f, 4.55f);
		bodyModel[587].rotateAngleZ = 3.4732053f;

		bodyModel[588] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 587
		bodyModel[588].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0);
		bodyModel[588].setRotationPoint(23.0f, -10.0f, -4.63f);
		bodyModel[588].rotateAngleZ = 1.5707964f;

		bodyModel[589] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 587
		bodyModel[589].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0);
		bodyModel[589].setRotationPoint(23.0f, -12.0f, -4.63f);

		bodyModel[590] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 587
		bodyModel[590].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0);
		bodyModel[590].setRotationPoint(24.0f, -12.0f, -4.63f);

		bodyModel[591] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 587
		bodyModel[591].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0);
		bodyModel[591].setRotationPoint(24.0f, -10.0f, -4.63f);
		bodyModel[591].rotateAngleZ = 1.5707964f;

		bodyModel[592] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 587
		bodyModel[592].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0);
		bodyModel[592].setRotationPoint(23.0f, -9.0f, -4.63f);
		bodyModel[592].rotateAngleZ = 1.5707964f;

		bodyModel[593] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 587
		bodyModel[593].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0);
		bodyModel[593].setRotationPoint(24.0f, -9.0f, -4.63f);
		bodyModel[593].rotateAngleZ = 1.5707964f;

		bodyModel[594] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 587
		bodyModel[594].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0);
		bodyModel[594].setRotationPoint(23.0f, -11.0f, -4.63f);

		bodyModel[595] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 587
		bodyModel[595].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0);
		bodyModel[595].setRotationPoint(24.0f, -11.0f, -4.63f);

		bodyModel[596] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 608
		bodyModel[596].addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0);
		bodyModel[596].setRotationPoint(24.5f, -10.5f, -4.63f);

		bodyModel[597] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 608
		bodyModel[597].addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0);
		bodyModel[597].setRotationPoint(24.5f, -10.5f, -4.63f);
		bodyModel[597].rotateAngleZ = 1.5707964f;

		bodyModel[598] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 587
		bodyModel[598].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0);
		bodyModel[598].setRotationPoint(23.0f, -10.0f, 4.63f);
		bodyModel[598].rotateAngleZ = 1.5707964f;

		bodyModel[599] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 587
		bodyModel[599].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0);
		bodyModel[599].setRotationPoint(23.0f, -12.0f, 4.63f);

		bodyModel[600] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 587
		bodyModel[600].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0);
		bodyModel[600].setRotationPoint(24.0f, -12.0f, 4.63f);

		bodyModel[601] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 587
		bodyModel[601].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0);
		bodyModel[601].setRotationPoint(24.0f, -10.0f, 4.63f);
		bodyModel[601].rotateAngleZ = 1.5707964f;

		bodyModel[602] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 587
		bodyModel[602].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0);
		bodyModel[602].setRotationPoint(23.0f, -9.0f, 4.63f);
		bodyModel[602].rotateAngleZ = 1.5707964f;

		bodyModel[603] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 587
		bodyModel[603].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0);
		bodyModel[603].setRotationPoint(24.0f, -9.0f, 4.63f);
		bodyModel[603].rotateAngleZ = 1.5707964f;

		bodyModel[604] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 587
		bodyModel[604].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0);
		bodyModel[604].setRotationPoint(23.0f, -11.0f, 4.63f);

		bodyModel[605] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 587
		bodyModel[605].addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0);
		bodyModel[605].setRotationPoint(24.0f, -11.0f, 4.63f);

		bodyModel[606] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 608
		bodyModel[606].addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0);
		bodyModel[606].setRotationPoint(24.5f, -10.5f, 4.63f);

		bodyModel[607] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 608
		bodyModel[607].addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0);
		bodyModel[607].setRotationPoint(24.5f, -10.5f, 4.63f);
		bodyModel[607].rotateAngleZ = 1.5707964f;

		bodyModel[608] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 608
		bodyModel[608].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[608].setRotationPoint(25.0f, -12.0f, -11.0f);

		bodyModel[609] = new ModelRendererTurbo(this, 14, 29, textureX, textureY); // Box 608
		bodyModel[609].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[609].setRotationPoint(25.0f, -9.75f, -11.0f);

		bodyModel[610] = new ModelRendererTurbo(this, 26, 29, textureX, textureY); // Box 608
		bodyModel[610].addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[610].setRotationPoint(25.5f, -7.5f, -11.0f);

		bodyModel[611] = new ModelRendererTurbo(this, 35, 29, textureX, textureY); // Box 608
		bodyModel[611].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[611].setRotationPoint(25.0f, -12.0f, 10.0f);

		bodyModel[612] = new ModelRendererTurbo(this, 46, 29, textureX, textureY); // Box 608
		bodyModel[612].addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[612].setRotationPoint(25.0f, -9.75f, 10.0f);

		bodyModel[613] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 608
		bodyModel[613].addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[613].setRotationPoint(25.5f, -7.5f, 10.0f);

		bodyModel[614] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 614
		bodyModel[614].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[614].setRotationPoint(-39.8f, -2.2f, -9.5f);

		bodyModel[615] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 614
		bodyModel[615].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[615].setRotationPoint(-39.8f, -2.2f, 8.5f);

		bodyModel[616] = new ModelRendererTurbo(this, 0, 6, textureX, textureY, "lamp"); // Lamp
		bodyModel[616].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[616].setRotationPoint(56.8f, -2.2f, -9.5f);

		bodyModel[617] = new ModelRendererTurbo(this, 0, 6, textureX, textureY, "lamp"); // Lamp
		bodyModel[617].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[617].setRotationPoint(56.8f, -2.2f, 8.5f);

		bodyModel[618] = new ModelRendererTurbo(this, 452, 172, textureX, textureY);
		bodyModel[618].addShapeBox(0, 0, 0, 6, 4, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[618].setRotationPoint(11.75f, 2.0f, -9.0f);

		bodyModel[619] = new ModelRendererTurbo(this, 501, 173, textureX, textureY);
		bodyModel[619].flip = true;
		bodyModel[619].addCylinder(0, 0, 0, 2, 16, 10, 1.1875f, 1.1875f, 1);
		bodyModel[619].setRotationPoint(1.1875f, 4.375f, -8.0f);

		bodyModel[620] = new ModelRendererTurbo(this, 270, 0, textureX, textureY);
		bodyModel[620].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[620].setRotationPoint(-1.075f, 1.6375f, 6.0f);

		bodyModel[621] = new ModelRendererTurbo(this, 314, 3, textureX, textureY);
		bodyModel[621].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[621].setRotationPoint(4.5f, 2.0f, -10.0f);

		bodyModel[622] = new ModelRendererTurbo(this, 120, 27, textureX, textureY);
		bodyModel[622].addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f);
		bodyModel[622].setRotationPoint(13.75f, 2.0f, -9.0625f);

		bodyModel[623] = new ModelRendererTurbo(this, 360, 5, textureX, textureY);
		bodyModel[623].addBox(-1, 0, -1, 2, 1, 2, 0f);
		bodyModel[623].setRotationPoint(35.5f, 2.0f, 0.0f);

		bodyModel[624] = new ModelRendererTurbo(this, 162, 180, textureX, textureY);
		bodyModel[624].addShapeBox(0, 0, 0, 5, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[624].setRotationPoint(12.25f, 6.0f, -9.0f);

		bodyModel[625] = new ModelRendererTurbo(this, 228, 164, textureX, textureY);
		bodyModel[625].addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0);
		bodyModel[625].setRotationPoint(11.75f, 6.0f, -9.0f);

		bodyModel[626] = new ModelRendererTurbo(this, 308, 163, textureX, textureY);
		bodyModel[626].addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0);
		bodyModel[626].setRotationPoint(16.75f, 6.0f, -9.0f);

		bodyModel[627] = new ModelRendererTurbo(this, 211, 186, textureX, textureY);
		bodyModel[627].addShapeBox(0, 0, 0, 3, 4, 18, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0);
		bodyModel[627].setRotationPoint(8.25f, 2.0f, -9.0f);

		bodyModel[628] = new ModelRendererTurbo(this, 386, 117, textureX, textureY);
		bodyModel[628].addShapeBox(0, 0, 0, 2, 1, 18, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0);
		bodyModel[628].setRotationPoint(8.75f, 6.0f, -9.0f);

		bodyModel[629] = new ModelRendererTurbo(this, 420, 156, textureX, textureY);
		bodyModel[629].addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0);
		bodyModel[629].setRotationPoint(8.0f, 6.0f, -9.0f);

		bodyModel[630] = new ModelRendererTurbo(this, 195, 140, textureX, textureY);
		bodyModel[630].addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0);
		bodyModel[630].setRotationPoint(10.5f, 6.0f, -9.0f);

		bodyModel[631] = new ModelRendererTurbo(this, 116, 180, textureX, textureY);
		bodyModel[631].addShapeBox(0, 0, 0, 4, 4, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[631].setRotationPoint(3.75f, 2.0f, -9.0f);

		bodyModel[632] = new ModelRendererTurbo(this, 344, 132, textureX, textureY);
		bodyModel[632].addShapeBox(0, 0, 0, 3, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[632].setRotationPoint(4.25f, 6.0f, -9.0f);

		bodyModel[633] = new ModelRendererTurbo(this, 52, 137, textureX, textureY);
		bodyModel[633].addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0);
		bodyModel[633].setRotationPoint(3.75f, 6.0f, -9.0f);

		bodyModel[634] = new ModelRendererTurbo(this, 444, 125, textureX, textureY);
		bodyModel[634].addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0);
		bodyModel[634].setRotationPoint(6.75f, 6.0f, -9.0f);

		bodyModel[635] = new ModelRendererTurbo(this, 84, 27, textureX, textureY);
		bodyModel[635].flip = true;
		bodyModel[635].addCylinder(0, 0, 0, 2, 1, 10, 1.1875f, 1.0625f, 1);
		bodyModel[635].setRotationPoint(1.1875f, 4.375f, -9.0f);

		bodyModel[636] = new ModelRendererTurbo(this, 75, 27, textureX, textureY);
		bodyModel[636].flip = true;
		bodyModel[636].addCylinder(0, 0, 0, 2, 1, 10, 1.0625f, 0.625f, 1);
		bodyModel[636].setRotationPoint(1.1875f, 4.375f, -9.75f);

		bodyModel[637] = new ModelRendererTurbo(this, 66, 27, textureX, textureY);
		bodyModel[637].flip = true;
		bodyModel[637].addCylinder(0, 0, 0, 2, 1, 10, 1.0625f, 1.1875f, 1);
		bodyModel[637].setRotationPoint(1.1875f, 4.375f, 7.75f);

		bodyModel[638] = new ModelRendererTurbo(this, 234, 13, textureX, textureY);
		bodyModel[638].flip = true;
		bodyModel[638].addCylinder(0, 0, 0, 2, 1, 10, 0.625f, 1.0625f, 1);
		bodyModel[638].setRotationPoint(1.1875f, 4.375f, 8.0f);

		bodyModel[639] = new ModelRendererTurbo(this, 237, 0, textureX, textureY);
		bodyModel[639].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[639].setRotationPoint(-1.075f, 1.6375f, -7.0f);

		bodyModel[640] = new ModelRendererTurbo(this, 234, 0, textureX, textureY);
		bodyModel[640].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[640].setRotationPoint(-1.075f, 1.6375f, 2.0f);

		bodyModel[641] = new ModelRendererTurbo(this, 194, 0, textureX, textureY);
		bodyModel[641].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[641].setRotationPoint(-1.075f, 1.6375f, -3.0f);

		bodyModel[642] = new ModelRendererTurbo(this, 181, 0, textureX, textureY);
		bodyModel[642].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[642].setRotationPoint(3.4375f, 1.6375f, 6.0f);

		bodyModel[643] = new ModelRendererTurbo(this, 178, 0, textureX, textureY);
		bodyModel[643].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[643].setRotationPoint(3.4375f, 1.6375f, -7.0f);

		bodyModel[644] = new ModelRendererTurbo(this, 150, 0, textureX, textureY);
		bodyModel[644].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[644].setRotationPoint(3.4375f, 1.6375f, 2.0f);

		bodyModel[645] = new ModelRendererTurbo(this, 14, 0, textureX, textureY);
		bodyModel[645].addBox(0, 0, 0, 0, 2, 1, 0f);
		bodyModel[645].setRotationPoint(3.4375f, 1.6375f, -3.0f);

		bodyModel[646] = new ModelRendererTurbo(this, 298, 3, textureX, textureY);
		bodyModel[646].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0);
		bodyModel[646].setRotationPoint(6.0f, 2.0f, -10.0f);

		bodyModel[647] = new ModelRendererTurbo(this, 266, 3, textureX, textureY);
		bodyModel[647].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[647].setRotationPoint(8.75f, 2.0f, -10.0f);

		bodyModel[648] = new ModelRendererTurbo(this, 10, 3, textureX, textureY);
		bodyModel[648].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0);
		bodyModel[648].setRotationPoint(9.75f, 2.0f, -10.0f);

		bodyModel[649] = new ModelRendererTurbo(this, 506, 0, textureX, textureY);
		bodyModel[649].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, -0.75f, -0.75f, 0.5f, -0.75f, -0.75f, 0.5f, 0, 0, 0.5f, 0);
		bodyModel[649].setRotationPoint(14.0f, 2.0f, -10.0f);

		bodyModel[650] = new ModelRendererTurbo(this, 436, 0, textureX, textureY);
		bodyModel[650].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0);
		bodyModel[650].setRotationPoint(15.0f, 2.0f, -10.0f);

		bodyModel[651] = new ModelRendererTurbo(this, 426, 0, textureX, textureY);
		bodyModel[651].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f);
		bodyModel[651].setRotationPoint(4.5f, 2.0f, 9.0f);

		bodyModel[652] = new ModelRendererTurbo(this, 410, 0, textureX, textureY);
		bodyModel[652].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f);
		bodyModel[652].setRotationPoint(6.0f, 2.0f, 9.0f);

		bodyModel[653] = new ModelRendererTurbo(this, 388, 0, textureX, textureY);
		bodyModel[653].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[653].setRotationPoint(8.75f, 2.0f, 9.0f);

		bodyModel[654] = new ModelRendererTurbo(this, 362, 0, textureX, textureY);
		bodyModel[654].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f);
		bodyModel[654].setRotationPoint(9.75f, 2.0f, 9.0f);

		bodyModel[655] = new ModelRendererTurbo(this, 332, 0, textureX, textureY);
		bodyModel[655].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f);
		bodyModel[655].setRotationPoint(14.0f, 2.0f, 9.0f);

		bodyModel[656] = new ModelRendererTurbo(this, 284, 0, textureX, textureY);
		bodyModel[656].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.75f, 0.5f, -0.75f);
		bodyModel[656].setRotationPoint(15.0f, 2.0f, 9.0f);

		bodyModel[657] = new ModelRendererTurbo(this, 111, 27, textureX, textureY);
		bodyModel[657].addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.75f, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f);
		bodyModel[657].setRotationPoint(8.5f, 2.0f, -9.0625f);

		bodyModel[658] = new ModelRendererTurbo(this, 187, 4, textureX, textureY);
		bodyModel[658].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f);
		bodyModel[658].setRotationPoint(4.25f, 2.0f, -9.0625f);

		bodyModel[659] = new ModelRendererTurbo(this, 102, 27, textureX, textureY);
		bodyModel[659].addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f);
		bodyModel[659].setRotationPoint(13.75f, 2.0f, 9.0f);

		bodyModel[660] = new ModelRendererTurbo(this, 93, 27, textureX, textureY);
		bodyModel[660].addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.75f, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f);
		bodyModel[660].setRotationPoint(8.5f, 2.0f, 9.0f);

		bodyModel[661] = new ModelRendererTurbo(this, 178, 4, textureX, textureY);
		bodyModel[661].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f);
		bodyModel[661].setRotationPoint(4.25f, 2.0f, 9.0f);

		bodyModel[662] = new ModelRendererTurbo(this, 234, 4, textureX, textureY);
		bodyModel[662].addBox(-1, 0, -1, 2, 1, 2, 0f);
		bodyModel[662].setRotationPoint(-18.5f, 2.0f, 0.0f);

		flipAll();
	}
	ModelSM42_Bogie bogie = new ModelSM42_Bogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 663; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/SM42_bogies.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(2.2f,-0.05,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(-3.3,0,0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}
