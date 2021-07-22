//FMT-Marker DFM-1.0
//Creator: Green PC

//Using PER-GROUP-INIT mode with limit '250'!
package train.client.render.models.blocks;


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.PositionTransformVertex;
import tmt.TexturedPolygon;
import train.common.tile.TileMFPBWigWag;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelMFPBWigWag extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;
	private ModelRendererTurbo[] group0, Signal;

	public ModelMFPBWigWag(){
		group0 = new ModelRendererTurbo[246];
		Signal = new ModelRendererTurbo[26];
		//
		initGroup_group0();
		initGroup_Signal();
		flipAll();
	}

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		render(group0);
		for (ModelRendererTurbo t : Signal){
			t.rotateAngleX=f0*0.0174533f;
		}
		render(Signal);
	}

	private final void initGroup_group0(){
		group0[0] = new ModelRendererTurbo(this, 117, 0, textureX, textureY);
		group0[0].addShapeBox(0, 0, 0, 7, 1, 7, 0, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f);
		group0[0].setRotationPoint(-3.5f, -1.0f, -3.5f);

		group0[1] = new ModelRendererTurbo(this, 80, 33, textureX, textureY);
		group0[1].flip = false;
		group0[1].addCylinder(0, 0, 0, 1, 4, 8, 1, 1, 4);
		group0[1].setRotationPoint(0.0f, -5.3125f, 0.0f);

		group0[2] = new ModelRendererTurbo(this, 18, 9, textureX, textureY);
		group0[2].addShapeBox(0, 0, 0, 4, 1, 4, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f);
		group0[2].setRotationPoint(-2.0f, -2.25f, -2.0f);

		group0[3] = new ModelRendererTurbo(this, 75, 33, textureX, textureY);
		group0[3].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, 0, -0.4375f);
		group0[3].setRotationPoint(-0.125f, -5.25f, -1.5f);

		group0[4] = new ModelRendererTurbo(this, 70, 33, textureX, textureY);
		group0[4].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.4375f, 0, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f);
		group0[4].setRotationPoint(0.5f, -5.25f, -0.125f);

		group0[5] = new ModelRendererTurbo(this, 221, 0, textureX, textureY);
		group0[5].addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		group0[5].setRotationPoint(-1.5f, -21.75f, -3.0f);

		group0[6] = new ModelRendererTurbo(this, 102, 12, textureX, textureY);
		group0[6].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f);
		group0[6].setRotationPoint(-1.375f, -29.375f, -8.0625f);

		group0[7] = new ModelRendererTurbo(this, 153, 17, textureX, textureY);
		group0[7].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f);
		group0[7].setRotationPoint(-1.375f, -24.0625f, -7.8125f);

		group0[8] = new ModelRendererTurbo(this, 65, 33, textureX, textureY);
		group0[8].addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0);
		group0[8].setRotationPoint(0.5625f, -43.125f, -0.5f);

		group0[9] = new ModelRendererTurbo(this, 165, 0, textureX, textureY);
		group0[9].addShapeBox(0, -1.5f, -7.5f, 1, 3, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0);
		group0[9].setRotationPoint(0.625f, -41.75f, 0.0f);
		group0[9].rotateAngleX = 0.7853982f;

		group0[10] = new ModelRendererTurbo(this, 202, 0, textureX, textureY);
		group0[10].addShapeBox(0, 0, 0, 5, 4, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		group0[10].setRotationPoint(-2.0f, -36.0f, -2.0f);

		group0[11] = new ModelRendererTurbo(this, 247, 12, textureX, textureY);
		group0[11].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		group0[11].setRotationPoint(1.5f, -32.5f, -1.5f);

		group0[12] = new ModelRendererTurbo(this, 208, 9, textureX, textureY);
		group0[12].flip = false;
		group0[12].addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.875f, 3);
		group0[12].setRotationPoint(2.5f, -34.25f, 0.0f);

		group0[13] = new ModelRendererTurbo(this, 248, 32, textureX, textureY);
		group0[13].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[13].setRotationPoint(2.375f, -34.75f, -0.5f);

		group0[14] = new ModelRendererTurbo(this, 84, 0, textureX, textureY);
		group0[14].addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f);
		group0[14].setRotationPoint(-3.5f, -1.5f, -3.5f);

		group0[15] = new ModelRendererTurbo(this, 51, 0, textureX, textureY);
		group0[15].addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0);
		group0[15].setRotationPoint(-3.5f, -1.75f, -3.5f);

		group0[16] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		group0[16].addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f);
		group0[16].setRotationPoint(-3.5f, -2.0f, -3.5f);

		group0[17] = new ModelRendererTurbo(this, 228, 32, textureX, textureY);
		group0[17].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, 0, 0, 0, 0, 0);
		group0[17].setRotationPoint(-0.125f, -5.25f, 0.5f);

		group0[18] = new ModelRendererTurbo(this, 219, 32, textureX, textureY);
		group0[18].addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, -0.25f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.3125f, -0.25f, -0.75f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f);
		group0[18].setRotationPoint(-1.5f, -5.25f, -0.125f);

		group0[19] = new ModelRendererTurbo(this, 150, 32, textureX, textureY);
		group0[19].flip = false;
		group0[19].addCylinder(0, 0, 0, 1, 13, 8, 0.625f, 0.625f, 4);
		group0[19].setRotationPoint(0.0f, -18.25f, 0.0f);

		group0[20] = new ModelRendererTurbo(this, 145, 32, textureX, textureY);
		group0[20].flip = false;
		group0[20].addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 4);
		group0[20].setRotationPoint(0.0f, -21.25f, 0.0f);

		group0[21] = new ModelRendererTurbo(this, 143, 17, textureX, textureY);
		group0[21].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2);
		group0[21].setRotationPoint(-1.5f, -24.5f, -8.0f);

		group0[22] = new ModelRendererTurbo(this, 126, 17, textureX, textureY);
		group0[22].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2);
		group0[22].setRotationPoint(-1.4375f, -24.5f, -8.0f);

		group0[23] = new ModelRendererTurbo(this, 109, 17, textureX, textureY);
		group0[23].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f);
		group0[23].setRotationPoint(-1.5f, -30.0f, -8.0f);

		group0[24] = new ModelRendererTurbo(this, 140, 32, textureX, textureY);
		group0[24].addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, -1, -0.5f, 0, -1, -0.5f);
		group0[24].setRotationPoint(-1.5f, -29.5f, -8.0f);

		group0[25] = new ModelRendererTurbo(this, 92, 17, textureX, textureY);
		group0[25].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f);
		group0[25].setRotationPoint(-1.4375f, -30.0f, -8.0f);

		group0[26] = new ModelRendererTurbo(this, 135, 32, textureX, textureY);
		group0[26].addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, -0.9375f, 0, -0.0625f, -0.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f);
		group0[26].setRotationPoint(-1.4375f, -29.5f, -8.0f);

		group0[27] = new ModelRendererTurbo(this, 51, 17, textureX, textureY);
		group0[27].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, -0.5f, 0, 0, -0.5f, 0);
		group0[27].setRotationPoint(-1.5f, -24.5f, 1.0f);

		group0[28] = new ModelRendererTurbo(this, 34, 17, textureX, textureY);
		group0[28].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		group0[28].setRotationPoint(-1.4375f, -24.5f, 1.0f);

		group0[29] = new ModelRendererTurbo(this, 17, 17, textureX, textureY);
		group0[29].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, 0, -0.5f, 0, 0, -0.5f);
		group0[29].setRotationPoint(-1.5f, -30.0f, 1.0f);

		group0[30] = new ModelRendererTurbo(this, 130, 32, textureX, textureY);
		group0[30].addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.9375f, -1, -0.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0);
		group0[30].setRotationPoint(-1.5f, -29.5f, 7.0f);

		group0[31] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
		group0[31].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f);
		group0[31].setRotationPoint(-1.4375f, -30.0f, 1.0f);

		group0[32] = new ModelRendererTurbo(this, 125, 32, textureX, textureY);
		group0[32].addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.0625f, -0.9375f, -0.5f, -0.0625f, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5625f, -0.9375f, -0.5f, -0.5625f, -0.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		group0[32].setRotationPoint(-1.4375f, -29.5f, 7.0f);

		group0[33] = new ModelRendererTurbo(this, 234, 16, textureX, textureY);
		group0[33].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2);
		group0[33].setRotationPoint(0.5f, -24.5f, -8.0f);

		group0[34] = new ModelRendererTurbo(this, 224, 14, textureX, textureY);
		group0[34].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2);
		group0[34].setRotationPoint(0.4375f, -24.5f, -8.0f);

		group0[35] = new ModelRendererTurbo(this, 198, 10, textureX, textureY);
		group0[35].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f);
		group0[35].setRotationPoint(0.5f, -30.0f, -8.0f);

		group0[36] = new ModelRendererTurbo(this, 120, 32, textureX, textureY);
		group0[36].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -1, -0.5f, -0.9375f, -1, -0.5f);
		group0[36].setRotationPoint(0.5f, -29.5f, -8.0f);

		group0[37] = new ModelRendererTurbo(this, 214, 8, textureX, textureY);
		group0[37].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f);
		group0[37].setRotationPoint(0.4375f, -30.0f, -8.0f);

		group0[38] = new ModelRendererTurbo(this, 115, 32, textureX, textureY);
		group0[38].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.9375f, -0.5f, -0.0625f, -0.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5625f, -0.9375f, -0.5f, -0.5625f, -0.9375f);
		group0[38].setRotationPoint(0.4375f, -29.5f, -8.0f);

		group0[39] = new ModelRendererTurbo(this, 183, 6, textureX, textureY);
		group0[39].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.9375f, -0.5f, 0);
		group0[39].setRotationPoint(0.5f, -24.5f, 1.0f);

		group0[40] = new ModelRendererTurbo(this, 150, 6, textureX, textureY);
		group0[40].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.5f, -0.5f, 0);
		group0[40].setRotationPoint(0.4375f, -24.5f, 1.0f);

		group0[41] = new ModelRendererTurbo(this, 233, 5, textureX, textureY);
		group0[41].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f);
		group0[41].setRotationPoint(0.5f, -30.0f, 1.0f);

		group0[42] = new ModelRendererTurbo(this, 110, 32, textureX, textureY);
		group0[42].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.9375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, -1, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0);
		group0[42].setRotationPoint(0.5f, -29.5f, 7.0f);

		group0[43] = new ModelRendererTurbo(this, 162, 0, textureX, textureY);
		group0[43].addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f);
		group0[43].setRotationPoint(0.4375f, -30.0f, 1.0f);

		group0[44] = new ModelRendererTurbo(this, 105, 32, textureX, textureY);
		group0[44].addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.0625f, -0.9375f, 0, -0.0625f, -0.9375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0);
		group0[44].setRotationPoint(0.4375f, -29.5f, 7.0f);

		group0[45] = new ModelRendererTurbo(this, 100, 32, textureX, textureY);
		group0[45].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, 0, 0, -0.5625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f);
		group0[45].setRotationPoint(0.5f, -21.25f, -1.3125f);

		group0[46] = new ModelRendererTurbo(this, 95, 32, textureX, textureY);
		group0[46].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.25f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.8125f, 0, 0, -0.5625f);
		group0[46].setRotationPoint(0.5f, -21.25f, 0.3125f);

		group0[47] = new ModelRendererTurbo(this, 90, 32, textureX, textureY);
		group0[47].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.8125f, 0, 0, -0.5625f, 0, 0, -0.4375f, -0.75f, 0, -0.1875f);
		group0[47].setRotationPoint(-1.5f, -21.25f, -1.3125f);

		group0[48] = new ModelRendererTurbo(this, 60, 32, textureX, textureY);
		group0[48].addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, 0, 0, -0.5625f, -0.75f, 0, -0.8125f);
		group0[48].setRotationPoint(-1.5f, -21.25f, 0.3125f);

		group0[49] = new ModelRendererTurbo(this, 55, 32, textureX, textureY);
		group0[49].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[49].setRotationPoint(-1.6875f, -29.6875f, -8.125f);

		group0[50] = new ModelRendererTurbo(this, 50, 32, textureX, textureY);
		group0[50].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[50].setRotationPoint(0.6875f, -29.6875f, -8.125f);

		group0[51] = new ModelRendererTurbo(this, 169, 9, textureX, textureY);
		group0[51].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f);
		group0[51].setRotationPoint(-1.375f, -24.5f, -8.0625f);

		group0[52] = new ModelRendererTurbo(this, 45, 32, textureX, textureY);
		group0[52].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[52].setRotationPoint(-1.6875f, -24.8125f, -8.125f);

		group0[53] = new ModelRendererTurbo(this, 40, 32, textureX, textureY);
		group0[53].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[53].setRotationPoint(0.6875f, -24.8125f, -8.125f);

		group0[54] = new ModelRendererTurbo(this, 160, 9, textureX, textureY);
		group0[54].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f);
		group0[54].setRotationPoint(-1.375f, -24.5f, 8.0f);

		group0[55] = new ModelRendererTurbo(this, 30, 32, textureX, textureY);
		group0[55].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[55].setRotationPoint(-1.6875f, -24.8125f, 7.875f);

		group0[56] = new ModelRendererTurbo(this, 214, 31, textureX, textureY);
		group0[56].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[56].setRotationPoint(0.6875f, -24.8125f, 7.875f);

		group0[57] = new ModelRendererTurbo(this, 135, 9, textureX, textureY);
		group0[57].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f);
		group0[57].setRotationPoint(-1.375f, -29.375f, 8.0f);

		group0[58] = new ModelRendererTurbo(this, 195, 31, textureX, textureY);
		group0[58].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[58].setRotationPoint(-1.6875f, -29.6875f, 7.875f);

		group0[59] = new ModelRendererTurbo(this, 190, 31, textureX, textureY);
		group0[59].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f);
		group0[59].setRotationPoint(0.6875f, -29.6875f, 7.875f);

		group0[60] = new ModelRendererTurbo(this, 185, 31, textureX, textureY);
		group0[60].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1);
		group0[60].setRotationPoint(-1.625f, -24.4375f, -7.625f);

		group0[61] = new ModelRendererTurbo(this, 180, 31, textureX, textureY);
		group0[61].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1);
		group0[61].setRotationPoint(0.625f, -22.15f, -3.4375f);

		group0[62] = new ModelRendererTurbo(this, 136, 17, textureX, textureY);
		group0[62].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f);
		group0[62].setRotationPoint(0.375f, -24.125f, -7.8125f);

		group0[63] = new ModelRendererTurbo(this, 175, 31, textureX, textureY);
		group0[63].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1);
		group0[63].setRotationPoint(0.625f, -24.5f, -7.625f);

		group0[64] = new ModelRendererTurbo(this, 170, 31, textureX, textureY);
		group0[64].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1);
		group0[64].setRotationPoint(-1.625f, -22.2125f, -3.4375f);

		group0[65] = new ModelRendererTurbo(this, 165, 31, textureX, textureY);
		group0[65].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1);
		group0[65].setRotationPoint(-0.5f, -23.3375f, -5.5f);

		group0[66] = new ModelRendererTurbo(this, 119, 17, textureX, textureY);
		group0[66].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f);
		group0[66].setRotationPoint(-1.375f, -30.375f, -7.8125f);

		group0[67] = new ModelRendererTurbo(this, 85, 31, textureX, textureY);
		group0[67].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f);
		group0[67].setRotationPoint(0.625f, -30.0625f, -7.625f);

		group0[68] = new ModelRendererTurbo(this, 224, 30, textureX, textureY);
		group0[68].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f);
		group0[68].setRotationPoint(-1.625f, -32.3375f, -3.4375f);

		group0[69] = new ModelRendererTurbo(this, 102, 17, textureX, textureY);
		group0[69].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f);
		group0[69].setRotationPoint(0.375f, -30.4375f, -7.8125f);

		group0[70] = new ModelRendererTurbo(this, 160, 30, textureX, textureY);
		group0[70].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f);
		group0[70].setRotationPoint(-1.625f, -30.0f, -7.625f);

		group0[71] = new ModelRendererTurbo(this, 155, 30, textureX, textureY);
		group0[71].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f);
		group0[71].setRotationPoint(0.625f, -32.275f, -3.4375f);

		group0[72] = new ModelRendererTurbo(this, 80, 30, textureX, textureY);
		group0[72].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f);
		group0[72].setRotationPoint(-0.5f, -31.175f, -5.5f);

		group0[73] = new ModelRendererTurbo(this, 44, 17, textureX, textureY);
		group0[73].addShapeBox(0, 0, 0, 1, 1, 5, 0, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f);
		group0[73].setRotationPoint(-1.375f, -24.0625f, 2.8125f);

		group0[74] = new ModelRendererTurbo(this, 75, 30, textureX, textureY);
		group0[74].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f);
		group0[74].setRotationPoint(-1.625f, -24.4375f, 6.625f);

		group0[75] = new ModelRendererTurbo(this, 70, 30, textureX, textureY);
		group0[75].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f);
		group0[75].setRotationPoint(0.625f, -22.15f, 2.4375f);

		group0[76] = new ModelRendererTurbo(this, 27, 17, textureX, textureY);
		group0[76].addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0);
		group0[76].setRotationPoint(0.375f, -24.125f, 2.8125f);

		group0[77] = new ModelRendererTurbo(this, 65, 30, textureX, textureY);
		group0[77].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f);
		group0[77].setRotationPoint(0.625f, -24.5f, 6.625f);

		group0[78] = new ModelRendererTurbo(this, 248, 29, textureX, textureY);
		group0[78].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f);
		group0[78].setRotationPoint(-1.625f, -22.2125f, 2.4375f);

		group0[79] = new ModelRendererTurbo(this, 219, 29, textureX, textureY);
		group0[79].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f);
		group0[79].setRotationPoint(-0.5f, -23.3375f, 4.5f);

		group0[80] = new ModelRendererTurbo(this, 10, 17, textureX, textureY);
		group0[80].addShapeBox(0, 0, 0, 1, 1, 5, 0, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f);
		group0[80].setRotationPoint(-1.375f, -30.375f, 2.8125f);

		group0[81] = new ModelRendererTurbo(this, 150, 29, textureX, textureY);
		group0[81].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0);
		group0[81].setRotationPoint(0.625f, -30.0625f, 6.625f);

		group0[82] = new ModelRendererTurbo(this, 145, 29, textureX, textureY);
		group0[82].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0);
		group0[82].setRotationPoint(-1.625f, -32.3375f, 2.4375f);

		group0[83] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		group0[83].addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0);
		group0[83].setRotationPoint(0.375f, -30.4375f, 2.8125f);

		group0[84] = new ModelRendererTurbo(this, 140, 29, textureX, textureY);
		group0[84].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0);
		group0[84].setRotationPoint(-1.625f, -30.0f, 6.625f);

		group0[85] = new ModelRendererTurbo(this, 135, 29, textureX, textureY);
		group0[85].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0);
		group0[85].setRotationPoint(0.625f, -32.275f, 2.4375f);

		group0[86] = new ModelRendererTurbo(this, 130, 29, textureX, textureY);
		group0[86].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0);
		group0[86].setRotationPoint(-0.5f, -31.2375f, 4.375f);

		group0[87] = new ModelRendererTurbo(this, 125, 29, textureX, textureY);
		group0[87].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		group0[87].setRotationPoint(-0.5f, -3.5f, -1.5f);

		group0[88] = new ModelRendererTurbo(this, 120, 29, textureX, textureY);
		group0[88].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		group0[88].setRotationPoint(-0.5f, -4.625f, -1.5f);

		group0[89] = new ModelRendererTurbo(this, 115, 29, textureX, textureY);
		group0[89].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		group0[89].setRotationPoint(-0.5f, -3.5f, 0.5f);

		group0[90] = new ModelRendererTurbo(this, 110, 29, textureX, textureY);
		group0[90].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f);
		group0[90].setRotationPoint(-0.5f, -4.625f, 0.5f);

		group0[91] = new ModelRendererTurbo(this, 105, 29, textureX, textureY);
		group0[91].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[91].setRotationPoint(-0.4375f, -3.5f, -1.5f);

		group0[92] = new ModelRendererTurbo(this, 100, 29, textureX, textureY);
		group0[92].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[92].setRotationPoint(-0.4375f, -4.625f, -1.5f);

		group0[93] = new ModelRendererTurbo(this, 95, 29, textureX, textureY);
		group0[93].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[93].setRotationPoint(-0.4375f, -3.5f, 0.5f);

		group0[94] = new ModelRendererTurbo(this, 90, 29, textureX, textureY);
		group0[94].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[94].setRotationPoint(-0.4375f, -4.625f, 0.5f);

		group0[95] = new ModelRendererTurbo(this, 60, 29, textureX, textureY);
		group0[95].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[95].setRotationPoint(-0.5625f, -3.5f, -1.5f);

		group0[96] = new ModelRendererTurbo(this, 55, 29, textureX, textureY);
		group0[96].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[96].setRotationPoint(-0.5625f, -4.625f, -1.5f);

		group0[97] = new ModelRendererTurbo(this, 50, 29, textureX, textureY);
		group0[97].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[97].setRotationPoint(-0.5625f, -3.5f, 0.5f);

		group0[98] = new ModelRendererTurbo(this, 45, 29, textureX, textureY);
		group0[98].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f);
		group0[98].setRotationPoint(-0.5625f, -4.625f, 0.5f);

		group0[99] = new ModelRendererTurbo(this, 160, 19, textureX, textureY);
		group0[99].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f);
		group0[99].setRotationPoint(-2.4375f, -32.75f, -3.0f);

		group0[100] = new ModelRendererTurbo(this, 68, 19, textureX, textureY);
		group0[100].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f);
		group0[100].setRotationPoint(0.5f, -32.75f, -3.0f);

		group0[101] = new ModelRendererTurbo(this, 209, 17, textureX, textureY);
		group0[101].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f);
		group0[101].setRotationPoint(-1.9375f, -32.75f, -3.0f);

		group0[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		group0[102].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f);
		group0[102].setRotationPoint(0.4375f, -32.75f, -3.0f);

		group0[103] = new ModelRendererTurbo(this, 126, 9, textureX, textureY);
		group0[103].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f);
		group0[103].setRotationPoint(-1.5f, -33.25f, -3.0f);

		group0[104] = new ModelRendererTurbo(this, 117, 9, textureX, textureY);
		group0[104].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5625f, 0, -0.9375f, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f);
		group0[104].setRotationPoint(-1.5f, -33.25f, -2.9375f);

		group0[105] = new ModelRendererTurbo(this, 102, 9, textureX, textureY);
		group0[105].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f);
		group0[105].setRotationPoint(-1.5f, -33.25f, 2.9375f);

		group0[106] = new ModelRendererTurbo(this, 217, 0, textureX, textureY);
		group0[106].addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5625f, 0, -0.9375f, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f);
		group0[106].setRotationPoint(-1.5f, -33.25f, 2.5f);

		group0[107] = new ModelRendererTurbo(this, 40, 29, textureX, textureY);
		group0[107].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.6875f, -0.5f, -0.9375f, -0.6875f, -0.5f, -0.9375f, 0.6875f, 0.25f, 0, 0.6875f, 0.25f, 0, 0, 0, -0.9375f, 0, 0);
		group0[107].setRotationPoint(0.5f, -33.25f, -4.0f);

		group0[108] = new ModelRendererTurbo(this, 35, 29, textureX, textureY);
		group0[108].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.21f, 0, -0.9375f, -0.21f, 0, -0.9375f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, -0.9375f, 0, 0);
		group0[108].setRotationPoint(0.5f, -36.25f, -4.0f);

		group0[109] = new ModelRendererTurbo(this, 30, 29, textureX, textureY);
		group0[109].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, -1.25f, 0.5f, -0.9375f, -1.25f, 0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0.6875f, 0.25f, -0.9375f, 0.6875f, 0.25f);
		group0[109].setRotationPoint(0.5f, -33.25f, 3.0f);

		group0[110] = new ModelRendererTurbo(this, 25, 29, textureX, textureY);
		group0[110].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, -0.21f, 0, 0, -0.21f, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.5f, -0.9375f, -0.3125f, -0.5f);
		group0[110].setRotationPoint(0.5f, -36.25f, 3.0f);

		group0[111] = new ModelRendererTurbo(this, 20, 29, textureX, textureY);
		group0[111].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, 0, -1, 0, 0, -1, 0, -0.6875f, 0, -0.9375f, -0.6875f, 0, -0.9375f, -1, 2.5f, 0, -1, 2.5f, 0, -0.79f, -3, -0.9375f, -0.79f, -3);
		group0[111].setRotationPoint(0.5f, -39.25f, -1.0f);

		group0[112] = new ModelRendererTurbo(this, 15, 29, textureX, textureY);
		group0[112].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, -1, -0.9375f, 0, -1, -0.9375f, -0.79f, -3, 0, -0.79f, -3, 0, -1, 2.5f, -0.9375f, -1, 2.5f);
		group0[112].setRotationPoint(0.5f, -39.25f, 0.0f);

		group0[113] = new ModelRendererTurbo(this, 10, 29, textureX, textureY);
		group0[113].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.185f, -0.9375f, 0, -0.185f, -0.9375f, 0, -0.21f, 0, -0.5f, -0.21f, 0, -0.5f, 0.03125f, -0.9375f, 0, 0.03125f, -0.9375f, 0, 0, 0, -0.5f, 0, 0);
		group0[113].setRotationPoint(0.4375f, -36.25f, -4.0f);

		group0[114] = new ModelRendererTurbo(this, 5, 29, textureX, textureY);
		group0[114].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.21f, 0, 0, -0.21f, 0, 0, -0.185f, -0.9375f, -0.5f, -0.185f, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, 0.03125f, -0.9375f, -0.5f, 0.03125f, -0.9375f);
		group0[114].setRotationPoint(0.4375f, -36.25f, 3.0f);

		group0[115] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
		group0[115].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.625f, -1, 0, -0.625f, -1, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.815f, 2.0625f, 0, -0.815f, 2.0625f, 0, -0.79f, -3, -0.5f, -0.79f, -3);
		group0[115].setRotationPoint(0.4375f, -39.25f, -1.0f);

		group0[116] = new ModelRendererTurbo(this, 243, 28, textureX, textureY);
		group0[116].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.625f, -1, -0.5f, -0.625f, -1, -0.5f, -0.79f, -3, 0, -0.79f, -3, 0, -0.815f, 2.0625f, -0.5f, -0.815f, 2.0625f);
		group0[116].setRotationPoint(0.4375f, -39.25f, 0.0f);

		group0[117] = new ModelRendererTurbo(this, 238, 28, textureX, textureY);
		group0[117].addShapeBox(0, -1.5f, -7.5f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[117].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[117].rotateAngleX = 0.7853982f;

		group0[118] = new ModelRendererTurbo(this, 233, 28, textureX, textureY);
		group0[118].addShapeBox(0, -1.5f, 7.25f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[118].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[118].rotateAngleX = 0.7853982f;

		group0[119] = new ModelRendererTurbo(this, 132, 0, textureX, textureY);
		group0[119].addShapeBox(0, -1.5f, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f);
		group0[119].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[119].rotateAngleX = 0.7853982f;

		group0[120] = new ModelRendererTurbo(this, 99, 0, textureX, textureY);
		group0[120].addShapeBox(0, 1, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f);
		group0[120].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[120].rotateAngleX = 0.7853982f;

		group0[121] = new ModelRendererTurbo(this, 214, 28, textureX, textureY);
		group0[121].addShapeBox(0, -1, -6.375f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[121].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[121].rotateAngleX = 0.7853982f;

		group0[122] = new ModelRendererTurbo(this, 193, 28, textureX, textureY);
		group0[122].addShapeBox(0, -0.625f, -6.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[122].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[122].rotateAngleX = 0.7853982f;

		group0[123] = new ModelRendererTurbo(this, 188, 28, textureX, textureY);
		group0[123].addShapeBox(0, 0, -6.375f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[123].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[123].rotateAngleX = 0.7853982f;

		group0[124] = new ModelRendererTurbo(this, 183, 28, textureX, textureY);
		group0[124].addShapeBox(0, -0.875f, -6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[124].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[124].rotateAngleX = 0.7853982f;

		group0[125] = new ModelRendererTurbo(this, 178, 28, textureX, textureY);
		group0[125].addShapeBox(0, 0.625f, -6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[125].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[125].rotateAngleX = 0.7853982f;

		group0[126] = new ModelRendererTurbo(this, 173, 28, textureX, textureY);
		group0[126].addShapeBox(0, -1, -6.125f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[126].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[126].rotateAngleX = 0.7853982f;

		group0[127] = new ModelRendererTurbo(this, 85, 28, textureX, textureY);
		group0[127].addShapeBox(0, 0, -6.125f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[127].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[127].rotateAngleX = 0.7853982f;

		group0[128] = new ModelRendererTurbo(this, 228, 27, textureX, textureY);
		group0[128].addShapeBox(0, -0.625f, -5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[128].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[128].rotateAngleX = 0.7853982f;

		group0[129] = new ModelRendererTurbo(this, 223, 27, textureX, textureY);
		group0[129].addShapeBox(0, 0.375f, -5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[129].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[129].rotateAngleX = 0.7853982f;

		group0[130] = new ModelRendererTurbo(this, 168, 27, textureX, textureY);
		group0[130].addShapeBox(0, -0.875f, -4.625f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[130].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[130].rotateAngleX = 0.7853982f;

		group0[131] = new ModelRendererTurbo(this, 163, 27, textureX, textureY);
		group0[131].addShapeBox(0, -0.875f, -4.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[131].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[131].rotateAngleX = 0.7853982f;

		group0[132] = new ModelRendererTurbo(this, 158, 27, textureX, textureY);
		group0[132].addShapeBox(0, -1, -4.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[132].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[132].rotateAngleX = 0.7853982f;

		group0[133] = new ModelRendererTurbo(this, 80, 27, textureX, textureY);
		group0[133].addShapeBox(0, -0.125f, -4.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[133].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[133].rotateAngleX = 0.7853982f;

		group0[134] = new ModelRendererTurbo(this, 75, 27, textureX, textureY);
		group0[134].addShapeBox(0, -0.625f, -3.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[134].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[134].rotateAngleX = 0.7853982f;

		group0[135] = new ModelRendererTurbo(this, 70, 27, textureX, textureY);
		group0[135].addShapeBox(0, -0.75f, -4.375f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[135].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[135].rotateAngleX = 0.7853982f;

		group0[136] = new ModelRendererTurbo(this, 65, 27, textureX, textureY);
		group0[136].addShapeBox(0, 0, -4.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0);
		group0[136].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[136].rotateAngleX = 0.7853982f;

		group0[137] = new ModelRendererTurbo(this, 249, 26, textureX, textureY);
		group0[137].addShapeBox(0, -1, -2.875f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[137].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[137].rotateAngleX = 0.7853982f;

		group0[138] = new ModelRendererTurbo(this, 153, 26, textureX, textureY);
		group0[138].addShapeBox(0, -0.625f, -2.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[138].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[138].rotateAngleX = 0.7853982f;

		group0[139] = new ModelRendererTurbo(this, 148, 26, textureX, textureY);
		group0[139].addShapeBox(0, 0, -2.875f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[139].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[139].rotateAngleX = 0.7853982f;

		group0[140] = new ModelRendererTurbo(this, 143, 26, textureX, textureY);
		group0[140].addShapeBox(0, -0.875f, -2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[140].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[140].rotateAngleX = 0.7853982f;

		group0[141] = new ModelRendererTurbo(this, 138, 26, textureX, textureY);
		group0[141].addShapeBox(0, 0.625f, -2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[141].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[141].rotateAngleX = 0.7853982f;

		group0[142] = new ModelRendererTurbo(this, 133, 26, textureX, textureY);
		group0[142].addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[142].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[142].rotateAngleX = 0.7853982f;

		group0[143] = new ModelRendererTurbo(this, 128, 26, textureX, textureY);
		group0[143].addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[143].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[143].rotateAngleX = 0.7853982f;

		group0[144] = new ModelRendererTurbo(this, 123, 26, textureX, textureY);
		group0[144].addShapeBox(0, -0.625f, -1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[144].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[144].rotateAngleX = 0.7853982f;

		group0[145] = new ModelRendererTurbo(this, 118, 26, textureX, textureY);
		group0[145].addShapeBox(0, -1, -1.125f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[145].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[145].rotateAngleX = 0.7853982f;

		group0[146] = new ModelRendererTurbo(this, 113, 26, textureX, textureY);
		group0[146].addShapeBox(0, -0.625f, -1.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[146].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[146].rotateAngleX = 0.7853982f;

		group0[147] = new ModelRendererTurbo(this, 108, 26, textureX, textureY);
		group0[147].addShapeBox(0, 0, -1.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[147].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[147].rotateAngleX = 0.7853982f;

		group0[148] = new ModelRendererTurbo(this, 103, 26, textureX, textureY);
		group0[148].addShapeBox(0, -0.875f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[148].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[148].rotateAngleX = 0.7853982f;

		group0[149] = new ModelRendererTurbo(this, 98, 26, textureX, textureY);
		group0[149].addShapeBox(0, 0.625f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[149].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[149].rotateAngleX = 0.7853982f;

		group0[150] = new ModelRendererTurbo(this, 93, 26, textureX, textureY);
		group0[150].addShapeBox(0, -1, -0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[150].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[150].rotateAngleX = 0.7853982f;

		group0[151] = new ModelRendererTurbo(this, 60, 26, textureX, textureY);
		group0[151].addShapeBox(0, 0, -0.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[151].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[151].rotateAngleX = 0.7853982f;

		group0[152] = new ModelRendererTurbo(this, 55, 26, textureX, textureY);
		group0[152].addShapeBox(0, -0.625f, -0.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[152].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[152].rotateAngleX = 0.7853982f;

		group0[153] = new ModelRendererTurbo(this, 50, 26, textureX, textureY);
		group0[153].addShapeBox(0, 0.375f, -1.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[153].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[153].rotateAngleX = 0.7853982f;

		group0[154] = new ModelRendererTurbo(this, 45, 26, textureX, textureY);
		group0[154].addShapeBox(0, -0.125f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[154].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[154].rotateAngleX = 0.7853982f;

		group0[155] = new ModelRendererTurbo(this, 40, 26, textureX, textureY);
		group0[155].addShapeBox(0, 0.125f, -0.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[155].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[155].rotateAngleX = 0.7853982f;

		group0[156] = new ModelRendererTurbo(this, 35, 26, textureX, textureY);
		group0[156].addShapeBox(0, -0.25f, -0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[156].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[156].rotateAngleX = 0.7853982f;

		group0[157] = new ModelRendererTurbo(this, 30, 26, textureX, textureY);
		group0[157].addShapeBox(0, -0.75f, -1.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[157].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[157].rotateAngleX = 0.7853982f;

		group0[158] = new ModelRendererTurbo(this, 25, 26, textureX, textureY);
		group0[158].addShapeBox(0, -1, 0.625f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[158].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[158].rotateAngleX = 0.7853982f;

		group0[159] = new ModelRendererTurbo(this, 20, 26, textureX, textureY);
		group0[159].addShapeBox(0, -0.625f, 0.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[159].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[159].rotateAngleX = 0.7853982f;

		group0[160] = new ModelRendererTurbo(this, 15, 26, textureX, textureY);
		group0[160].addShapeBox(0, 0, 0.625f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[160].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[160].rotateAngleX = 0.7853982f;

		group0[161] = new ModelRendererTurbo(this, 10, 26, textureX, textureY);
		group0[161].addShapeBox(0, -0.875f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[161].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[161].rotateAngleX = 0.7853982f;

		group0[162] = new ModelRendererTurbo(this, 5, 26, textureX, textureY);
		group0[162].addShapeBox(0, 0.625f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[162].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[162].rotateAngleX = 0.7853982f;

		group0[163] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		group0[163].addShapeBox(0, -1, 0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[163].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[163].rotateAngleX = 0.7853982f;

		group0[164] = new ModelRendererTurbo(this, 244, 25, textureX, textureY);
		group0[164].addShapeBox(0, 0, 0.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[164].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[164].rotateAngleX = 0.7853982f;

		group0[165] = new ModelRendererTurbo(this, 239, 25, textureX, textureY);
		group0[165].addShapeBox(0, -0.625f, 1.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[165].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[165].rotateAngleX = 0.7853982f;

		group0[166] = new ModelRendererTurbo(this, 234, 25, textureX, textureY);
		group0[166].addShapeBox(0, 0.375f, 0.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[166].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[166].rotateAngleX = 0.7853982f;

		group0[167] = new ModelRendererTurbo(this, 219, 25, textureX, textureY);
		group0[167].addShapeBox(0, -0.125f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[167].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[167].rotateAngleX = 0.7853982f;

		group0[168] = new ModelRendererTurbo(this, 214, 25, textureX, textureY);
		group0[168].addShapeBox(0, 0.125f, 1.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[168].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[168].rotateAngleX = 0.7853982f;

		group0[169] = new ModelRendererTurbo(this, 88, 25, textureX, textureY);
		group0[169].addShapeBox(0, -0.25f, 0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[169].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[169].rotateAngleX = 0.7853982f;

		group0[170] = new ModelRendererTurbo(this, 251, 23, textureX, textureY);
		group0[170].addShapeBox(0, -0.75f, 0.625f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[170].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[170].rotateAngleX = 0.7853982f;

		group0[171] = new ModelRendererTurbo(this, 229, 23, textureX, textureY);
		group0[171].addShapeBox(0, -0.875f, 2.375f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[171].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[171].rotateAngleX = 0.7853982f;

		group0[172] = new ModelRendererTurbo(this, 224, 23, textureX, textureY);
		group0[172].addShapeBox(0, -0.875f, 3.125f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[172].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[172].rotateAngleX = 0.7853982f;

		group0[173] = new ModelRendererTurbo(this, 83, 23, textureX, textureY);
		group0[173].addShapeBox(0, -0.875f, 4.375f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[173].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[173].rotateAngleX = 0.7853982f;

		group0[174] = new ModelRendererTurbo(this, 201, 22, textureX, textureY);
		group0[174].addShapeBox(0, -0.875f, 3.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, -1.375f, 0, -0.9375f, -1.375f, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, 0.75f, 0, -0.9375f, 0.75f, 0);
		group0[174].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[174].rotateAngleX = 0.7853982f;

		group0[175] = new ModelRendererTurbo(this, 169, 22, textureX, textureY);
		group0[175].addShapeBox(0, -1, 5.125f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[175].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[175].rotateAngleX = 0.7853982f;

		group0[176] = new ModelRendererTurbo(this, 77, 22, textureX, textureY);
		group0[176].addShapeBox(0, -0.625f, 5.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[176].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[176].rotateAngleX = 0.7853982f;

		group0[177] = new ModelRendererTurbo(this, 69, 21, textureX, textureY);
		group0[177].addShapeBox(0, 0, 5.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[177].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[177].rotateAngleX = 0.7853982f;

		group0[178] = new ModelRendererTurbo(this, 61, 21, textureX, textureY);
		group0[178].addShapeBox(0, -0.875f, 5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[178].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[178].rotateAngleX = 0.7853982f;

		group0[179] = new ModelRendererTurbo(this, 0, 21, textureX, textureY);
		group0[179].addShapeBox(0, 0.625f, 5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[179].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[179].rotateAngleX = 0.7853982f;

		group0[180] = new ModelRendererTurbo(this, 249, 20, textureX, textureY);
		group0[180].addShapeBox(0, -1, 5.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[180].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[180].rotateAngleX = 0.7853982f;

		group0[181] = new ModelRendererTurbo(this, 244, 20, textureX, textureY);
		group0[181].addShapeBox(0, 0, 5.375f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[181].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[181].rotateAngleX = 0.7853982f;

		group0[182] = new ModelRendererTurbo(this, 206, 19, textureX, textureY);
		group0[182].addShapeBox(0, -0.625f, 6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f);
		group0[182].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[182].rotateAngleX = 0.7853982f;

		group0[183] = new ModelRendererTurbo(this, 201, 19, textureX, textureY);
		group0[183].addShapeBox(0, 0.125f, 6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[183].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[183].rotateAngleX = 0.7853982f;

		group0[184] = new ModelRendererTurbo(this, 169, 19, textureX, textureY);
		group0[184].addShapeBox(0, 0.125f, 5.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f);
		group0[184].setRotationPoint(0.6875f, -41.75f, 0.0f);
		group0[184].rotateAngleX = 0.7853982f;

		group0[185] = new ModelRendererTurbo(this, 66, 0, textureX, textureY);
		group0[185].addShapeBox(0, -1.5f, -7.5f, 1, 3, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0);
		group0[185].setRotationPoint(0.4375f, -41.75f, 0.0f);
		group0[185].rotateAngleX = -0.7853982f;

		group0[186] = new ModelRendererTurbo(this, 92, 19, textureX, textureY);
		group0[186].addShapeBox(0, -1.5f, -7.5f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[186].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[186].rotateAngleX = -0.7853982f;

		group0[187] = new ModelRendererTurbo(this, 87, 19, textureX, textureY);
		group0[187].addShapeBox(0, -1.5f, 7.25f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[187].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[187].rotateAngleX = -0.7853982f;

		group0[188] = new ModelRendererTurbo(this, 33, 0, textureX, textureY);
		group0[188].addShapeBox(0, -1.5f, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f);
		group0[188].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[188].rotateAngleX = -0.7853982f;

		group0[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		group0[189].addShapeBox(0, 1, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f);
		group0[189].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[189].rotateAngleX = -0.7853982f;

		group0[190] = new ModelRendererTurbo(this, 82, 19, textureX, textureY);
		group0[190].addShapeBox(0, -0.875f, -7, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[190].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[190].rotateAngleX = -0.7853982f;

		group0[191] = new ModelRendererTurbo(this, 77, 19, textureX, textureY);
		group0[191].addShapeBox(0, -0.875f, -6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[191].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[191].rotateAngleX = -0.7853982f;

		group0[192] = new ModelRendererTurbo(this, 65, 19, textureX, textureY);
		group0[192].addShapeBox(0, -1, -6.75f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[192].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[192].rotateAngleX = -0.7853982f;

		group0[193] = new ModelRendererTurbo(this, 234, 18, textureX, textureY);
		group0[193].addShapeBox(0, -0.125f, -6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[193].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[193].rotateAngleX = -0.7853982f;

		group0[194] = new ModelRendererTurbo(this, 161, 18, textureX, textureY);
		group0[194].addShapeBox(0, -0.625f, -6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[194].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[194].rotateAngleX = -0.7853982f;

		group0[195] = new ModelRendererTurbo(this, 249, 17, textureX, textureY);
		group0[195].addShapeBox(0, -0.75f, -6.75f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[195].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[195].rotateAngleX = -0.7853982f;

		group0[196] = new ModelRendererTurbo(this, 244, 17, textureX, textureY);
		group0[196].addShapeBox(0, 0, -6.75f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0);
		group0[196].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[196].rotateAngleX = -0.7853982f;

		group0[197] = new ModelRendererTurbo(this, 223, 17, textureX, textureY);
		group0[197].addShapeBox(0, -0.875f, -5.25f, 1, 2, 1, 0, -0.9375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.9375f, -0.25f, -0.375f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[197].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[197].rotateAngleX = -0.7853982f;

		group0[198] = new ModelRendererTurbo(this, 218, 17, textureX, textureY);
		group0[198].addShapeBox(0, -0.875f, -4.25f, 1, 2, 1, 0, -0.9375f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.9375f, -0.25f, -1.125f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[198].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[198].rotateAngleX = -0.7853982f;

		group0[199] = new ModelRendererTurbo(this, 153, 17, textureX, textureY);
		group0[199].addShapeBox(0, -0.875f, -4.875f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f);
		group0[199].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[199].rotateAngleX = -0.7853982f;

		group0[200] = new ModelRendererTurbo(this, 144, 17, textureX, textureY);
		group0[200].addShapeBox(0, 0.125f, -4.875f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f);
		group0[200].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[200].rotateAngleX = -0.7853982f;

		group0[201] = new ModelRendererTurbo(this, 136, 17, textureX, textureY);
		group0[201].addShapeBox(0, -0.875f, -3.5f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[201].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[201].rotateAngleX = -0.7853982f;

		group0[202] = new ModelRendererTurbo(this, 127, 17, textureX, textureY);
		group0[202].addShapeBox(0, -0.875f, -2.75f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[202].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[202].rotateAngleX = -0.7853982f;

		group0[203] = new ModelRendererTurbo(this, 119, 17, textureX, textureY);
		group0[203].addShapeBox(0, 0.625f, -2.5f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[203].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[203].rotateAngleX = -0.7853982f;

		group0[204] = new ModelRendererTurbo(this, 110, 17, textureX, textureY);
		group0[204].addShapeBox(0, -0.875f, 1.625f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[204].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[204].rotateAngleX = -0.7853982f;

		group0[205] = new ModelRendererTurbo(this, 102, 17, textureX, textureY);
		group0[205].addShapeBox(0, -0.875f, 1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[205].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[205].rotateAngleX = -0.7853982f;

		group0[206] = new ModelRendererTurbo(this, 61, 17, textureX, textureY);
		group0[206].addShapeBox(0, -1, 1.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[206].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[206].rotateAngleX = -0.7853982f;

		group0[207] = new ModelRendererTurbo(this, 52, 17, textureX, textureY);
		group0[207].addShapeBox(0, -0.125f, 1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[207].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[207].rotateAngleX = -0.7853982f;

		group0[208] = new ModelRendererTurbo(this, 44, 17, textureX, textureY);
		group0[208].addShapeBox(0, -0.625f, 2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f);
		group0[208].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[208].rotateAngleX = -0.7853982f;

		group0[209] = new ModelRendererTurbo(this, 35, 17, textureX, textureY);
		group0[209].addShapeBox(0, -0.75f, 1.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[209].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[209].rotateAngleX = -0.7853982f;

		group0[210] = new ModelRendererTurbo(this, 27, 17, textureX, textureY);
		group0[210].addShapeBox(0, 0, 1.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0);
		group0[210].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[210].rotateAngleX = -0.7853982f;

		group0[211] = new ModelRendererTurbo(this, 18, 17, textureX, textureY);
		group0[211].addShapeBox(0, -1, 3, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f);
		group0[211].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[211].rotateAngleX = -0.7853982f;

		group0[212] = new ModelRendererTurbo(this, 10, 17, textureX, textureY);
		group0[212].addShapeBox(0, -0.625f, 3, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[212].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[212].rotateAngleX = -0.7853982f;

		group0[213] = new ModelRendererTurbo(this, 172, 12, textureX, textureY);
		group0[213].addShapeBox(0, 0, 3, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f);
		group0[213].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[213].rotateAngleX = -0.7853982f;

		group0[214] = new ModelRendererTurbo(this, 167, 12, textureX, textureY);
		group0[214].addShapeBox(0, -0.875f, 3.25f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[214].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[214].rotateAngleX = -0.7853982f;

		group0[215] = new ModelRendererTurbo(this, 142, 12, textureX, textureY);
		group0[215].addShapeBox(0, 0.625f, 3.25f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[215].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[215].rotateAngleX = -0.7853982f;

		group0[216] = new ModelRendererTurbo(this, 137, 12, textureX, textureY);
		group0[216].addShapeBox(0, -1, 3.25f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[216].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[216].rotateAngleX = -0.7853982f;

		group0[217] = new ModelRendererTurbo(this, 132, 12, textureX, textureY);
		group0[217].addShapeBox(0, 0, 3.25f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[217].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[217].rotateAngleX = -0.7853982f;

		group0[218] = new ModelRendererTurbo(this, 127, 12, textureX, textureY);
		group0[218].addShapeBox(0, -0.625f, 4, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[218].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[218].rotateAngleX = -0.7853982f;

		group0[219] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
		group0[219].addShapeBox(0, -0.875f, 4.375f, 1, 2, 1, 0, -0.9375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.9375f, -0.25f, -0.375f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[219].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[219].rotateAngleX = -0.7853982f;

		group0[220] = new ModelRendererTurbo(this, 234, 14, textureX, textureY);
		group0[220].addShapeBox(0, -0.875f, 5.375f, 1, 2, 1, 0, -0.9375f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.9375f, -0.25f, -1.125f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[220].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[220].rotateAngleX = -0.7853982f;

		group0[221] = new ModelRendererTurbo(this, 122, 12, textureX, textureY);
		group0[221].addShapeBox(0, -0.875f, 4.75f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f);
		group0[221].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[221].rotateAngleX = -0.7853982f;

		group0[222] = new ModelRendererTurbo(this, 117, 12, textureX, textureY);
		group0[222].addShapeBox(0, 0.125f, 4.75f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f);
		group0[222].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[222].rotateAngleX = -0.7853982f;

		group0[223] = new ModelRendererTurbo(this, 200, 12, textureX, textureY);
		group0[223].addShapeBox(0, -0.875f, 5.75f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f);
		group0[223].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[223].rotateAngleX = -0.7853982f;

		group0[224] = new ModelRendererTurbo(this, 150, 10, textureX, textureY);
		group0[224].addShapeBox(0, -0.875f, 6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[224].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[224].rotateAngleX = -0.7853982f;

		group0[225] = new ModelRendererTurbo(this, 183, 9, textureX, textureY);
		group0[225].addShapeBox(0, -1, 6, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0);
		group0[225].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[225].rotateAngleX = -0.7853982f;

		group0[226] = new ModelRendererTurbo(this, 233, 8, textureX, textureY);
		group0[226].addShapeBox(0, 0.625f, 6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f);
		group0[226].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[226].rotateAngleX = -0.7853982f;

		group0[227] = new ModelRendererTurbo(this, 8, 8, textureX, textureY);
		group0[227].addShapeBox(0, -0.625f, 6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f);
		group0[227].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[227].rotateAngleX = -0.7853982f;

		group0[228] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		group0[228].addShapeBox(0, 0, 6, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0);
		group0[228].setRotationPoint(0.5f, -41.75f, 0.0f);
		group0[228].rotateAngleX = -0.7853982f;

		group0[229] = new ModelRendererTurbo(this, 183, 0, textureX, textureY);
		group0[229].addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f);
		group0[229].setRotationPoint(-2.0f, -36.25f, -2.0f);

		group0[230] = new ModelRendererTurbo(this, 150, 0, textureX, textureY);
		group0[230].addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f);
		group0[230].setRotationPoint(-2.0f, -36.5f, -2.0f);

		group0[231] = new ModelRendererTurbo(this, 234, 0, textureX, textureY);
		group0[231].addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, -1.25f, 0, 0, -1.25f, 0, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, 0, -0.875f, -0.5f);
		group0[231].setRotationPoint(-2.0f, -36.625f, -1.5f);

		group0[232] = new ModelRendererTurbo(this, 93, 9, textureX, textureY);
		group0[232].flip = false;
		group0[232].addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.8125f, 3);
		group0[232].setRotationPoint(2.625f, -34.25f, 0.0f);

		group0[233] = new ModelRendererTurbo(this, 84, 9, textureX, textureY);
		group0[233].flip = false;
		group0[233].addCylinder(0, 0, 0, 2, 1, 10, 0.8125f, 0.625f, 3);
		group0[233].setRotationPoint(2.875f, -34.25f, 0.0f);

		group0[234] = new ModelRendererTurbo(this, 69, 9, textureX, textureY);
		group0[234].flip = false;
		group0[234].addCylinder(0, 0, 0, 2, 1, 10, 0.625f, 0.375f, 3);
		group0[234].setRotationPoint(3.125f, -34.25f, 0.0f);

		group0[235] = new ModelRendererTurbo(this, 183, 6, textureX, textureY);
		group0[235].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.875f, -0.375f, -0.375f);
		group0[235].setRotationPoint(2.5f, -34.75f, -0.5f);

		group0[236] = new ModelRendererTurbo(this, 177, 34, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[18]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.7038108f, 0.14694545f);
			vertices[1] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.69921875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.69921875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.69921875f, 0.1484375f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.7066489f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.69921875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.69921875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.7038108f, 0.14694545f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.7066489f, 0.1382108f);
			vertices[1] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.69921875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.69921875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.7066489f, 0.1430392f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.7038108f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.69921875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.69921875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.7066489f, 0.1382108f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.71484375f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.71484375f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.71484375f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.7194358f, 0.14694545f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.7194358f, 0.14694545f);
			vertices[1] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.71484375f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.71484375f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.7222739f, 0.1430392f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.7222739f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.71484375f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.71484375f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.7222739f, 0.1382108f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.7222739f, 0.1382108f);
			vertices[1] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.71484375f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.71484375f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.7194358f, 0.13430455f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.69140625f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.69140625f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.69453126f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.69453126f, 0.1484375f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.69453126f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.69453126f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.69140625f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.69140625f, 0.15234375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.69453126f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.69453126f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6976563f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.6976563f, 0.1484375f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.6976563f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.6976563f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.69453126f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.69453126f, 0.15234375f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.6976563f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6976563f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.7007812f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.7007812f, 0.1484375f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.7007812f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.7007812f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.6976563f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.6976563f, 0.15234375f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.7007812f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.7007812f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.70390624f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.70390624f, 0.1484375f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.70390624f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.70390624f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.7007812f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.7007812f, 0.15234375f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.73046875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.73046875f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.72265625f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.72265625f, 0.1484375f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.72265625f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.72265625f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.73046875f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.73046875f, 0.15234375f);
			faces[17] = new TexturedPolygon(vertices);
			//
			group0[236].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		group0[236].setRotationPoint(2.5625f, -34.25f, 0.0f);
		group0[236].rotateAngleX = -1.8849556f;

		group0[237] = new ModelRendererTurbo(this, 166, 34, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[18]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.66084206f, 0.14694545f);
			vertices[1] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.65625f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.65625f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.65625f, 0.1484375f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.66368014f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.65625f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.65625f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.66084206f, 0.14694545f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.66368014f, 0.1382108f);
			vertices[1] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.65625f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.65625f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.66368014f, 0.1430392f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.66084206f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.65625f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.65625f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.66368014f, 0.1382108f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 1.75f, -1.5298987E-7f, 0.671875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 8.7499996E-10f, -7.649493E-17f, 0.671875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.25f, 7.078898E-10f, -5.1431215E-10f, 0.671875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.25f, 1.4157796f, -1.0286243f, 0.67646706f, 0.14694545f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 1.4157796f, -1.0286243f, 0.67646706f, 0.14694545f);
			vertices[1] = new PositionTransformVertex(0.25f, 7.078898E-10f, -5.1431215E-10f, 0.671875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.25f, 2.7038996E-10f, -8.321744E-10f, 0.671875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.25f, 0.54077995f, -1.6643488f, 0.67930514f, 0.1430392f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 0.54077995f, -1.6643488f, 0.67930514f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.25f, 2.7038996E-10f, -8.321744E-10f, 0.671875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.25f, -2.7039E-10f, -8.321744E-10f, 0.671875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.25f, -0.54077995f, -1.6643488f, 0.67930514f, 0.1382108f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, -0.54077995f, -1.6643488f, 0.67930514f, 0.1382108f);
			vertices[1] = new PositionTransformVertex(0.25f, -2.7039E-10f, -8.321744E-10f, 0.671875f, 0.140625f);
			vertices[2] = new PositionTransformVertex(0.25f, -7.078901E-10f, -5.143118E-10f, 0.671875f, 0.140625f);
			vertices[3] = new PositionTransformVertex(0.25f, -1.4157802f, -1.0286236f, 0.67646706f, 0.13430455f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.6484375f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 1.75f, -1.5298987E-7f, 0.6484375f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 1.4157796f, -1.0286243f, 0.6515625f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.6515625f, 0.1484375f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.6515625f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.25f, 7.078898E-10f, -5.1431215E-10f, 0.6515625f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.25f, 8.7499996E-10f, -7.649493E-17f, 0.6484375f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.6484375f, 0.15234375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.5169067f, -1.1020975f, 0.6515625f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 1.4157796f, -1.0286243f, 0.6515625f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 0.54077995f, -1.6643488f, 0.6546875f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.6546875f, 0.1484375f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.6546875f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.25f, 2.7038996E-10f, -8.321744E-10f, 0.6546875f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.25f, 7.078898E-10f, -5.1431215E-10f, 0.6515625f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 7.5845336E-10f, -5.5104876E-10f, 0.6515625f, 0.15234375f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5794071f, -1.7832309f, 0.6546875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 0.54077995f, -1.6643488f, 0.6546875f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, -0.54077995f, -1.6643488f, 0.6578125f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.6578125f, 0.1484375f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.6578125f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.25f, -2.7039E-10f, -8.321744E-10f, 0.6578125f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.25f, 2.7038996E-10f, -8.321744E-10f, 0.6546875f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, 2.8970354E-10f, -8.9161545E-10f, 0.6546875f, 0.15234375f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.5794071f, -1.7832309f, 0.6578125f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, -0.54077995f, -1.6643488f, 0.6578125f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, -1.4157802f, -1.0286236f, 0.6609375f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.6609375f, 0.1484375f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.6609375f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.25f, -7.078901E-10f, -5.143118E-10f, 0.6609375f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.25f, -2.7039E-10f, -8.321744E-10f, 0.6578125f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, -2.8970354E-10f, -8.916154E-10f, 0.6578125f, 0.15234375f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 9.375E-10f, -8.1958855E-17f, 0.6875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 8.7499996E-10f, -7.649493E-17f, 0.6875f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 1.75f, -1.5298987E-7f, 0.6796875f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.875f, -1.6391772E-7f, 0.6796875f, 0.1484375f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.5169073f, -1.1020968f, 0.6796875f, 0.15234375f);
			vertices[1] = new PositionTransformVertex(0.25f, -1.4157802f, -1.0286236f, 0.6796875f, 0.15625f);
			vertices[2] = new PositionTransformVertex(0.25f, -7.078901E-10f, -5.143118E-10f, 0.6875f, 0.15625f);
			vertices[3] = new PositionTransformVertex(0.0f, -7.5845363E-10f, -5.510484E-10f, 0.6875f, 0.15234375f);
			faces[17] = new TexturedPolygon(vertices);
			//
			group0[237].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		group0[237].setRotationPoint(2.625f, -34.25f, 0.0f);
		group0[237].rotateAngleX = -1.8849556f;

		group0[238] = new ModelRendererTurbo(this, 233, 33, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[18]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.4157796f, -1.0286243f, 0.9225608f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0f, 7.078898E-10f, -5.1431215E-10f, 0.91796875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 8.7499996E-10f, -7.649493E-17f, 0.91796875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.75f, -1.5298987E-7f, 0.91796875f, 0.14453125f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.54077995f, -1.6643488f, 0.9253989f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.0f, 2.7038996E-10f, -8.321744E-10f, 0.91796875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 7.078898E-10f, -5.1431215E-10f, 0.91796875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.4157796f, -1.0286243f, 0.9225608f, 0.1430392f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.54077995f, -1.6643488f, 0.9253989f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0f, -2.7039E-10f, -8.321744E-10f, 0.91796875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 2.7038996E-10f, -8.321744E-10f, 0.91796875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.54077995f, -1.6643488f, 0.9253989f, 0.13913295f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.4157802f, -1.0286236f, 0.9225608f, 0.1303983f);
			vertices[1] = new PositionTransformVertex(0.0f, -7.078901E-10f, -5.143118E-10f, 0.91796875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, -2.7039E-10f, -8.321744E-10f, 0.91796875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.54077995f, -1.6643488f, 0.9253989f, 0.13430455f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 1.375f, -1.2020632E-7f, 0.93359375f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, 6.875E-10f, -6.010316E-17f, 0.93359375f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.25f, 5.5619914E-10f, -4.0410242E-10f, 0.93359375f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.25f, 1.1123983f, -0.8082048f, 0.9381858f, 0.1430392f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 1.1123983f, -0.8082048f, 0.9381858f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.25f, 5.5619914E-10f, -4.0410242E-10f, 0.93359375f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.25f, 2.1244925E-10f, -6.538513E-10f, 0.93359375f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.25f, 0.4248985f, -1.3077027f, 0.9410239f, 0.13913295f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, 0.4248985f, -1.3077027f, 0.9410239f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.25f, 2.1244925E-10f, -6.538513E-10f, 0.93359375f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.25f, -2.1244927E-10f, -6.538513E-10f, 0.93359375f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.25f, -0.42489856f, -1.3077027f, 0.9410239f, 0.13430455f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.25f, -0.42489856f, -1.3077027f, 0.9410239f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.25f, -2.1244927E-10f, -6.538513E-10f, 0.93359375f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.25f, -5.561993E-10f, -4.0410214E-10f, 0.93359375f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.25f, -1.1123987f, -0.8082043f, 0.9381858f, 0.1303983f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.75f, -1.5298987E-7f, 0.91015625f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, 1.375f, -1.2020632E-7f, 0.91015625f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.25f, 1.1123983f, -0.8082048f, 0.91328126f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.4157796f, -1.0286243f, 0.91328126f, 0.14453125f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 7.078898E-10f, -5.1431215E-10f, 0.91328126f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 5.5619914E-10f, -4.0410242E-10f, 0.91328126f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 6.875E-10f, -6.010316E-17f, 0.91015625f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 8.7499996E-10f, -7.649493E-17f, 0.91015625f, 0.1484375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.4157796f, -1.0286243f, 0.91328126f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, 1.1123983f, -0.8082048f, 0.91328126f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.25f, 0.4248985f, -1.3077027f, 0.9164063f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.54077995f, -1.6643488f, 0.9164063f, 0.14453125f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 2.7038996E-10f, -8.321744E-10f, 0.9164063f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, 2.1244925E-10f, -6.538513E-10f, 0.9164063f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 5.5619914E-10f, -4.0410242E-10f, 0.91328126f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 7.078898E-10f, -5.1431215E-10f, 0.91328126f, 0.1484375f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.54077995f, -1.6643488f, 0.9164063f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, 0.4248985f, -1.3077027f, 0.9164063f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.25f, -0.42489856f, -1.3077027f, 0.9195312f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.54077995f, -1.6643488f, 0.9195312f, 0.14453125f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -2.7039E-10f, -8.321744E-10f, 0.9195312f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, -2.1244927E-10f, -6.538513E-10f, 0.9195312f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, 2.1244925E-10f, -6.538513E-10f, 0.9164063f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 2.7038996E-10f, -8.321744E-10f, 0.9164063f, 0.1484375f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.54077995f, -1.6643488f, 0.9195312f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, -0.42489856f, -1.3077027f, 0.9195312f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.25f, -1.1123987f, -0.8082043f, 0.92265624f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -1.4157802f, -1.0286236f, 0.92265624f, 0.14453125f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -7.078901E-10f, -5.143118E-10f, 0.92265624f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, -5.561993E-10f, -4.0410214E-10f, 0.92265624f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, -2.1244927E-10f, -6.538513E-10f, 0.9195312f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -2.7039E-10f, -8.321744E-10f, 0.9195312f, 0.1484375f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 8.7499996E-10f, -7.649493E-17f, 0.94921875f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.25f, 6.875E-10f, -6.010316E-17f, 0.94921875f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.25f, 1.375f, -1.2020632E-7f, 0.94140625f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.75f, -1.5298987E-7f, 0.94140625f, 0.14453125f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.4157802f, -1.0286236f, 0.94140625f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.25f, -1.1123987f, -0.8082043f, 0.94140625f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.25f, -5.561993E-10f, -4.0410214E-10f, 0.94921875f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -7.078901E-10f, -5.143118E-10f, 0.94921875f, 0.1484375f);
			faces[17] = new TexturedPolygon(vertices);
			//
			group0[238].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		group0[238].setRotationPoint(2.875f, -34.25f, 0.0f);
		group0[238].rotateAngleX = -1.8849556f;

		group0[239] = new ModelRendererTurbo(this, 200, 33, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[18]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.1123983f, -0.8082048f, 0.79365456f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0f, 5.5619914E-10f, -4.0410242E-10f, 0.7890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 6.875E-10f, -6.010316E-17f, 0.7890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.375f, -1.2020632E-7f, 0.7890625f, 0.14453125f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.4248985f, -1.3077027f, 0.79649264f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.0f, 2.1244925E-10f, -6.538513E-10f, 0.7890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 5.5619914E-10f, -4.0410242E-10f, 0.7890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.1123983f, -0.8082048f, 0.79365456f, 0.1430392f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.42489856f, -1.3077027f, 0.79649264f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0f, -2.1244927E-10f, -6.538513E-10f, 0.7890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 2.1244925E-10f, -6.538513E-10f, 0.7890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.4248985f, -1.3077027f, 0.79649264f, 0.13913295f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.1123987f, -0.8082043f, 0.79365456f, 0.1303983f);
			vertices[1] = new PositionTransformVertex(0.0f, -5.561993E-10f, -4.0410214E-10f, 0.7890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, -2.1244927E-10f, -6.538513E-10f, 0.7890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.42489856f, -1.3077027f, 0.79649264f, 0.13430455f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.1875f, 0.75f, -6.5567086E-8f, 0.8046875f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, 3.7499998E-10f, -3.278354E-17f, 0.8046875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.1875f, 3.0338135E-10f, -2.204195E-10f, 0.8046875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.1875f, 0.6067627f, -0.440839f, 0.80927956f, 0.1430392f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.1875f, 0.6067627f, -0.440839f, 0.80927956f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.1875f, 3.0338135E-10f, -2.204195E-10f, 0.8046875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.1875f, 1.1588141E-10f, -3.5664616E-10f, 0.8046875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.1875f, 0.23176283f, -0.71329236f, 0.81211764f, 0.13913295f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.1875f, 0.23176283f, -0.71329236f, 0.81211764f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.1875f, 1.1588141E-10f, -3.5664616E-10f, 0.8046875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.1875f, -1.1588142E-10f, -3.5664616E-10f, 0.8046875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.1875f, -0.23176284f, -0.71329236f, 0.81211764f, 0.13430455f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.1875f, -0.23176284f, -0.71329236f, 0.81211764f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.1875f, -1.1588142E-10f, -3.5664616E-10f, 0.8046875f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.1875f, -3.0338146E-10f, -2.2041935E-10f, 0.8046875f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.1875f, -0.60676295f, -0.4408387f, 0.80927956f, 0.1303983f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.375f, -1.2020632E-7f, 0.78125f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, 0.75f, -6.5567086E-8f, 0.78125f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 0.6067627f, -0.440839f, 0.784375f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.1123983f, -0.8082048f, 0.784375f, 0.14453125f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 5.5619914E-10f, -4.0410242E-10f, 0.784375f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.1875f, 3.0338135E-10f, -2.204195E-10f, 0.784375f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 3.7499998E-10f, -3.278354E-17f, 0.78125f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 6.875E-10f, -6.010316E-17f, 0.78125f, 0.1484375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.1123983f, -0.8082048f, 0.784375f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, 0.6067627f, -0.440839f, 0.784375f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 0.23176283f, -0.71329236f, 0.7875f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.4248985f, -1.3077027f, 0.7875f, 0.14453125f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 2.1244925E-10f, -6.538513E-10f, 0.7875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.1875f, 1.1588141E-10f, -3.5664616E-10f, 0.7875f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 3.0338135E-10f, -2.204195E-10f, 0.784375f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 5.5619914E-10f, -4.0410242E-10f, 0.784375f, 0.1484375f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.4248985f, -1.3077027f, 0.7875f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, 0.23176283f, -0.71329236f, 0.7875f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.1875f, -0.23176284f, -0.71329236f, 0.790625f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.42489856f, -1.3077027f, 0.790625f, 0.14453125f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -2.1244927E-10f, -6.538513E-10f, 0.790625f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.1875f, -1.1588142E-10f, -3.5664616E-10f, 0.790625f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 1.1588141E-10f, -3.5664616E-10f, 0.7875f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 2.1244925E-10f, -6.538513E-10f, 0.7875f, 0.1484375f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.42489856f, -1.3077027f, 0.790625f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, -0.23176284f, -0.71329236f, 0.790625f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.1875f, -0.60676295f, -0.4408387f, 0.79375f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -1.1123987f, -0.8082043f, 0.79375f, 0.14453125f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -5.561993E-10f, -4.0410214E-10f, 0.79375f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.1875f, -3.0338146E-10f, -2.2041935E-10f, 0.79375f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.1875f, -1.1588142E-10f, -3.5664616E-10f, 0.790625f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -2.1244927E-10f, -6.538513E-10f, 0.790625f, 0.1484375f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 6.875E-10f, -6.010316E-17f, 0.8203125f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.1875f, 3.7499998E-10f, -3.278354E-17f, 0.8203125f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.1875f, 0.75f, -6.5567086E-8f, 0.8125f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.375f, -1.2020632E-7f, 0.8125f, 0.14453125f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.1123987f, -0.8082043f, 0.8125f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.1875f, -0.60676295f, -0.4408387f, 0.8125f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.1875f, -3.0338146E-10f, -2.2041935E-10f, 0.8203125f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -5.561993E-10f, -4.0410214E-10f, 0.8203125f, 0.1484375f);
			faces[17] = new TexturedPolygon(vertices);
			//
			group0[239].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		group0[239].setRotationPoint(3.125f, -34.25f, 0.0f);
		group0[239].rotateAngleX = -1.8849556f;

		group0[240] = new ModelRendererTurbo(this, 155, 33, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[18]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.4885912f, -1.0815251f, 0.6178733f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0f, 7.4429557E-10f, -5.407625E-10f, 0.61328125f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 9.1999997E-10f, -8.0428955E-17f, 0.61328125f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.84f, -1.6085792E-7f, 0.61328125f, 0.14453125f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5685915f, -1.749944f, 0.6207114f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.0f, 2.8429573E-10f, -8.7497193E-10f, 0.61328125f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 7.4429557E-10f, -5.407625E-10f, 0.61328125f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.4885912f, -1.0815251f, 0.6178733f, 0.1430392f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.56859154f, -1.749944f, 0.6207114f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0f, -2.8429575E-10f, -8.7497193E-10f, 0.61328125f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, 2.8429573E-10f, -8.7497193E-10f, 0.61328125f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5685915f, -1.749944f, 0.6207114f, 0.13913295f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.4885917f, -1.0815243f, 0.6178733f, 0.1303983f);
			vertices[1] = new PositionTransformVertex(0.0f, -7.4429585E-10f, -5.4076216E-10f, 0.61328125f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0f, -2.8429575E-10f, -8.7497193E-10f, 0.61328125f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.56859154f, -1.749944f, 0.6207114f, 0.13430455f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.62890625f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.62890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.62890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.6334983f, 0.1430392f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.6334983f, 0.1430392f);
			vertices[1] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.62890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.62890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6363364f, 0.13913295f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6363364f, 0.13913295f);
			vertices[1] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.62890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.62890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.6363364f, 0.13430455f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.6363364f, 0.13430455f);
			vertices[1] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.62890625f, 0.13671875f);
			vertices[2] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.62890625f, 0.13671875f);
			vertices[3] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.6334983f, 0.1303983f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.84f, -1.6085792E-7f, 0.60546875f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.60546875f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.60859376f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.4885912f, -1.0815251f, 0.60859376f, 0.14453125f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 7.4429557E-10f, -5.407625E-10f, 0.60859376f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.60859376f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.60546875f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 9.1999997E-10f, -8.0428955E-17f, 0.60546875f, 0.1484375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 1.4885912f, -1.0815251f, 0.60859376f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, 1.5169067f, -1.1020975f, 0.60859376f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6117188f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 0.5685915f, -1.749944f, 0.6117188f, 0.14453125f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 2.8429573E-10f, -8.7497193E-10f, 0.6117188f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.6117188f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 7.5845336E-10f, -5.5104876E-10f, 0.60859376f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 7.4429557E-10f, -5.407625E-10f, 0.60859376f, 0.1484375f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 0.5685915f, -1.749944f, 0.6117188f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, 0.5794071f, -1.7832309f, 0.6117188f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.6148437f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -0.56859154f, -1.749944f, 0.6148437f, 0.14453125f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -2.8429575E-10f, -8.7497193E-10f, 0.6148437f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.6148437f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 2.8970354E-10f, -8.9161545E-10f, 0.6117188f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, 2.8429573E-10f, -8.7497193E-10f, 0.6117188f, 0.1484375f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -0.56859154f, -1.749944f, 0.6148437f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, -0.5794071f, -1.7832309f, 0.6148437f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.61796874f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, -1.4885917f, -1.0815243f, 0.61796874f, 0.14453125f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -7.4429585E-10f, -5.4076216E-10f, 0.61796874f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.61796874f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -2.8970354E-10f, -8.916154E-10f, 0.6148437f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -2.8429575E-10f, -8.7497193E-10f, 0.6148437f, 0.1484375f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, 9.1999997E-10f, -8.0428955E-17f, 0.64453125f, 0.14453125f);
			vertices[1] = new PositionTransformVertex(0.0625f, 9.375E-10f, -8.1958855E-17f, 0.64453125f, 0.1484375f);
			vertices[2] = new PositionTransformVertex(0.0625f, 1.875f, -1.6391772E-7f, 0.63671875f, 0.1484375f);
			vertices[3] = new PositionTransformVertex(0.0f, 1.84f, -1.6085792E-7f, 0.63671875f, 0.14453125f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(0.0f, -1.4885917f, -1.0815243f, 0.63671875f, 0.1484375f);
			vertices[1] = new PositionTransformVertex(0.0625f, -1.5169073f, -1.1020968f, 0.63671875f, 0.15234375f);
			vertices[2] = new PositionTransformVertex(0.0625f, -7.5845363E-10f, -5.510484E-10f, 0.64453125f, 0.15234375f);
			vertices[3] = new PositionTransformVertex(0.0f, -7.4429585E-10f, -5.4076216E-10f, 0.64453125f, 0.1484375f);
			faces[17] = new TexturedPolygon(vertices);
			//
			group0[240].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		group0[240].setRotationPoint(2.5f, -34.25f, 0.0f);
		group0[240].rotateAngleX = -1.8849556f;

		group0[241] = new ModelRendererTurbo(this, 172, 4, textureX, textureY);
		group0[241].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f);
		group0[241].setRotationPoint(1.5625f, -36.5f, -2.0f);

		group0[242] = new ModelRendererTurbo(this, 139, 4, textureX, textureY);
		group0[242].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f);
		group0[242].setRotationPoint(1.5625f, -36.5f, 1.0f);

		group0[243] = new ModelRendererTurbo(this, 117, 4, textureX, textureY);
		group0[243].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f);
		group0[243].setRotationPoint(-2.0625f, -36.5f, -2.0f);

		group0[244] = new ModelRendererTurbo(this, 106, 4, textureX, textureY);
		group0[244].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f);
		group0[244].setRotationPoint(-2.0625f, -36.5f, 1.0f);

		group0[245] = new ModelRendererTurbo(this, 221, 3, textureX, textureY);
		group0[245].addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.1875f, -0.25f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.1875f, -0.25f, -0.25f);
		group0[245].setRotationPoint(-2.875f, -34.0f, 0.0f);

	}

	private final void initGroup_Signal(){
		Signal[0] = new ModelRendererTurbo(this, 150, 6, textureX, textureY); // Lamp
		Signal[0].flip = false;
		Signal[0].addCylinder(3.8125f, 9, 0, 1, 1, 8, 0.4375f, 0.6875f, 2);
		Signal[0].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[1] = new ModelRendererTurbo(this, 73, 3, textureX, textureY);
		Signal[1].addShapeBox(0, 0.5f, -0.5f, 1, 1, 1, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f);
		Signal[1].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[2] = new ModelRendererTurbo(this, 201, 25, textureX, textureY);
		Signal[2].flip = false;
		Signal[2].addCylinder(2.5312f, 9, 0, 3, 1, 12, 1, 1, 2);
		Signal[2].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[3] = new ModelRendererTurbo(this, 251, 5, textureX, textureY);
		Signal[3].addShapeBox(0, 0.1875f, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f);
		Signal[3].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[4] = new ModelRendererTurbo(this, 51, 3, textureX, textureY);
		Signal[4].addShapeBox(1.3125f, 3.5f, -0.5f, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f);
		Signal[4].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[5] = new ModelRendererTurbo(this, 40, 3, textureX, textureY);
		Signal[5].addShapeBox(0, 3.1875f, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.6092f, -0.2812f, -0.3125f, -0.125f, -0.5625f, -0.3125f, -0.125f, -0.5627f, -0.3125f, -0.6095f, -0.2812f, -0.3125f);
		Signal[5].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[6] = new ModelRendererTurbo(this, 18, 3, textureX, textureY);
		Signal[6].addShapeBox(0.3125f, 3.5f, -0.5f, 1, 1, 1, 0, -0.5625f, -0.125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, -0.2964f, -0.5933f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.2969f, -0.5933f, -0.3125f);
		Signal[6].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[7] = new ModelRendererTurbo(this, 9, 3, textureX, textureY);
		Signal[7].addShapeBox(3, 3.8125f, -0.5f, 1, 1, 1, 0, -0.125f, -0.5625f, -0.3125f, -0.6092f, -0.2812f, -0.3125f, -0.6095f, -0.2812f, -0.3125f, -0.125f, -0.5627f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f);
		Signal[7].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[8] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		Signal[8].addShapeBox(2.6875f, 3.5f, -0.5f, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.2964f, -0.5933f, -0.3125f, -0.2969f, -0.5933f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, 0, -0.3125f, -0.3125f);
		Signal[8].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[9] = new ModelRendererTurbo(this, 243, 5, textureX, textureY);
		Signal[9].addShapeBox(3, 4.8125f, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f);
		Signal[9].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[10] = new ModelRendererTurbo(this, 188, 19, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[48]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.598076f, 1.5000006f, 0.7519531f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.5938f, 11.327443f, 1.3437505f, 0.75097656f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.5938f, 11.6875f, 2.3494871E-7f, 0.74609375f, 0.095703125f);
			vertices[3] = new PositionTransformVertex(3.5938f, 12.0f, 2.6226834E-7f, 0.74609375f, 0.09765625f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.5f, 2.5980763f, 0.7562425f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.5938f, 10.34375f, 2.3274434f, 0.75455105f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.5938f, 11.327443f, 1.3437505f, 0.75097656f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.598076f, 1.5000006f, 0.7519531f, 0.096086234f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.0f, 3.0f, 0.7578125f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.5938f, 9.0f, 2.6875f, 0.7558594f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.5938f, 10.34375f, 2.3274434f, 0.75455105f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.5f, 2.5980763f, 0.7562425f, 0.091796875f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.5f, 2.5980763f, 0.7562425f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.5938f, 7.65625f, 2.3274434f, 0.75455105f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.5938f, 9.0f, 2.6875f, 0.7558594f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.0f, 3.0f, 0.7578125f, 0.0859375f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.401924f, 1.5000005f, 0.7519531f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.5938f, 6.672557f, 1.3437505f, 0.75097656f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.5938f, 7.65625f, 2.3274434f, 0.75455105f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.5f, 2.5980763f, 0.7562425f, 0.080078125f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.0f, -5.245367E-7f, 0.74609375f, 0.07421875f);
			vertices[1] = new PositionTransformVertex(3.5938f, 6.3125f, -4.6989743E-7f, 0.74609375f, 0.076171875f);
			vertices[2] = new PositionTransformVertex(3.5938f, 6.672557f, 1.3437505f, 0.75097656f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.401924f, 1.5000005f, 0.7519531f, 0.075788766f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.4019246f, -1.5000014f, 0.7402344f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.5938f, 6.6725574f, -1.3437513f, 0.74121094f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.5938f, 6.3125f, -4.6989743E-7f, 0.74609375f, 0.076171875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.0f, -5.245367E-7f, 0.74609375f, 0.07421875f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.500001f, -2.5980768f, 0.735945f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.5938f, 7.656251f, -2.3274438f, 0.73763645f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.5938f, 6.6725574f, -1.3437513f, 0.74121094f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.4019246f, -1.5000014f, 0.7402344f, 0.075788766f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.000001f, -3.0f, 0.734375f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.5938f, 9.000001f, -2.6875f, 0.7363281f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.5938f, 7.656251f, -2.3274438f, 0.73763645f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.500001f, -2.5980768f, 0.735945f, 0.080078125f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.500001f, -2.5980759f, 0.735945f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.5938f, 10.343751f, -2.327443f, 0.73763645f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.5938f, 9.000001f, -2.6875f, 0.7363281f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.000001f, -3.0f, 0.734375f, 0.0859375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.598076f, -1.4999996f, 0.7402344f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.5938f, 11.327443f, -1.3437496f, 0.74121094f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.5938f, 10.343751f, -2.327443f, 0.73763645f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.500001f, -2.5980759f, 0.735945f, 0.091796875f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 12.0f, 2.6226834E-7f, 0.74609375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5938f, 11.6875f, 2.3494871E-7f, 0.74609375f, 0.095703125f);
			vertices[2] = new PositionTransformVertex(3.5938f, 11.327443f, -1.3437496f, 0.74121094f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.598076f, -1.4999996f, 0.7402344f, 0.096086234f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 12.0f, 2.6226834E-7f, 0.76953125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.6875f, 2.3494871E-7f, 0.76953125f, 0.095703125f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.327443f, 1.3437505f, 0.77441406f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.5313f, 11.598076f, 1.5000006f, 0.7753906f, 0.096086234f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 11.598076f, 1.5000006f, 0.7753906f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.327443f, 1.3437505f, 0.77441406f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.34375f, 2.3274434f, 0.77798855f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.5313f, 10.5f, 2.5980763f, 0.77968f, 0.091796875f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 10.5f, 2.5980763f, 0.77968f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.34375f, 2.3274434f, 0.77798855f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.0f, 2.6875f, 0.7792969f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.5313f, 9.0f, 3.0f, 0.78125f, 0.0859375f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 9.0f, 3.0f, 0.78125f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.0f, 2.6875f, 0.7792969f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.65625f, 2.3274434f, 0.77798855f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.5313f, 7.5f, 2.5980763f, 0.77968f, 0.080078125f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 7.5f, 2.5980763f, 0.77968f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.65625f, 2.3274434f, 0.77798855f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.672557f, 1.3437505f, 0.77441406f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.5313f, 6.401924f, 1.5000005f, 0.7753906f, 0.075788766f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 6.401924f, 1.5000005f, 0.7753906f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.672557f, 1.3437505f, 0.77441406f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.3125f, -4.6989743E-7f, 0.76953125f, 0.076171875f);
			vertices[3] = new PositionTransformVertex(3.5313f, 6.0f, -5.245367E-7f, 0.76953125f, 0.07421875f);
			faces[17] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 6.0f, -5.245367E-7f, 0.76953125f, 0.07421875f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.3125f, -4.6989743E-7f, 0.76953125f, 0.076171875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.6725574f, -1.3437513f, 0.76464844f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.5313f, 6.4019246f, -1.5000014f, 0.7636719f, 0.075788766f);
			faces[18] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 6.4019246f, -1.5000014f, 0.7636719f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.6725574f, -1.3437513f, 0.76464844f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.656251f, -2.3274438f, 0.76107395f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.5313f, 7.500001f, -2.5980768f, 0.7593825f, 0.080078125f);
			faces[19] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 7.500001f, -2.5980768f, 0.7593825f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.656251f, -2.3274438f, 0.76107395f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.000001f, -2.6875f, 0.7597656f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.5313f, 9.000001f, -3.0f, 0.7578125f, 0.0859375f);
			faces[20] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 9.000001f, -3.0f, 0.7578125f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.000001f, -2.6875f, 0.7597656f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.343751f, -2.327443f, 0.76107395f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.5313f, 10.500001f, -2.5980759f, 0.7593825f, 0.091796875f);
			faces[21] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 10.500001f, -2.5980759f, 0.7593825f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.343751f, -2.327443f, 0.76107395f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.327443f, -1.3437496f, 0.76464844f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.5313f, 11.598076f, -1.4999996f, 0.7636719f, 0.096086234f);
			faces[22] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5313f, 11.598076f, -1.4999996f, 0.7636719f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.327443f, -1.3437496f, 0.76464844f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.6875f, 2.3494871E-7f, 0.76953125f, 0.095703125f);
			vertices[3] = new PositionTransformVertex(3.5313f, 12.0f, 2.6226834E-7f, 0.76953125f, 0.09765625f);
			faces[23] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 12.0f, 2.6226834E-7f, 0.734375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 12.0f, 2.6226834E-7f, 0.734375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.598076f, 1.5000006f, 0.73828125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.598076f, 1.5000006f, 0.73828125f, 0.09765625f);
			faces[24] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.327443f, 1.3437505f, 0.73828125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.327443f, 1.3437505f, 0.73828125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.6875f, 2.3494871E-7f, 0.734375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.6875f, 2.3494871E-7f, 0.734375f, 0.1015625f);
			faces[25] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.598076f, 1.5000006f, 0.73828125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.598076f, 1.5000006f, 0.73828125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.5f, 2.5980763f, 0.7421875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.5f, 2.5980763f, 0.7421875f, 0.09765625f);
			faces[26] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.34375f, 2.3274434f, 0.7421875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.34375f, 2.3274434f, 0.7421875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.327443f, 1.3437505f, 0.73828125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.327443f, 1.3437505f, 0.73828125f, 0.1015625f);
			faces[27] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.5f, 2.5980763f, 0.7421875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.5f, 2.5980763f, 0.7421875f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.0f, 3.0f, 0.74609375f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.0f, 3.0f, 0.74609375f, 0.09765625f);
			faces[28] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.0f, 2.6875f, 0.74609375f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.0f, 2.6875f, 0.74609375f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.34375f, 2.3274434f, 0.7421875f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.34375f, 2.3274434f, 0.7421875f, 0.1015625f);
			faces[29] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.0f, 3.0f, 0.74609375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.0f, 3.0f, 0.74609375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.5f, 2.5980763f, 0.75f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.5f, 2.5980763f, 0.75f, 0.09765625f);
			faces[30] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.65625f, 2.3274434f, 0.75f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.65625f, 2.3274434f, 0.75f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.0f, 2.6875f, 0.74609375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.0f, 2.6875f, 0.74609375f, 0.1015625f);
			faces[31] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.5f, 2.5980763f, 0.75f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.5f, 2.5980763f, 0.75f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.401924f, 1.5000005f, 0.75390625f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.401924f, 1.5000005f, 0.75390625f, 0.09765625f);
			faces[32] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.672557f, 1.3437505f, 0.75390625f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.672557f, 1.3437505f, 0.75390625f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.65625f, 2.3274434f, 0.75f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.65625f, 2.3274434f, 0.75f, 0.1015625f);
			faces[33] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.401924f, 1.5000005f, 0.75390625f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.401924f, 1.5000005f, 0.75390625f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.0f, -5.245367E-7f, 0.7578125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.0f, -5.245367E-7f, 0.7578125f, 0.09765625f);
			faces[34] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.3125f, -4.6989743E-7f, 0.7578125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.3125f, -4.6989743E-7f, 0.7578125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.672557f, 1.3437505f, 0.75390625f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.672557f, 1.3437505f, 0.75390625f, 0.1015625f);
			faces[35] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.0f, -5.245367E-7f, 0.7578125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.0f, -5.245367E-7f, 0.7578125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.4019246f, -1.5000014f, 0.76171875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.4019246f, -1.5000014f, 0.76171875f, 0.09765625f);
			faces[36] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.6725574f, -1.3437513f, 0.76171875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.6725574f, -1.3437513f, 0.76171875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.3125f, -4.6989743E-7f, 0.7578125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.3125f, -4.6989743E-7f, 0.7578125f, 0.1015625f);
			faces[37] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 6.4019246f, -1.5000014f, 0.76171875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 6.4019246f, -1.5000014f, 0.76171875f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.500001f, -2.5980768f, 0.765625f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.500001f, -2.5980768f, 0.765625f, 0.09765625f);
			faces[38] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.656251f, -2.3274438f, 0.765625f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.656251f, -2.3274438f, 0.765625f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 6.6725574f, -1.3437513f, 0.76171875f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 6.6725574f, -1.3437513f, 0.76171875f, 0.1015625f);
			faces[39] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 7.500001f, -2.5980768f, 0.765625f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 7.500001f, -2.5980768f, 0.765625f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.000001f, -3.0f, 0.76953125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.000001f, -3.0f, 0.76953125f, 0.09765625f);
			faces[40] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.000001f, -2.6875f, 0.76953125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.000001f, -2.6875f, 0.76953125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 7.656251f, -2.3274438f, 0.765625f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 7.656251f, -2.3274438f, 0.765625f, 0.1015625f);
			faces[41] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 9.000001f, -3.0f, 0.76953125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 9.000001f, -3.0f, 0.76953125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.500001f, -2.5980759f, 0.7734375f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.500001f, -2.5980759f, 0.7734375f, 0.09765625f);
			faces[42] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.343751f, -2.327443f, 0.7734375f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.343751f, -2.327443f, 0.7734375f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 9.000001f, -2.6875f, 0.76953125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 9.000001f, -2.6875f, 0.76953125f, 0.1015625f);
			faces[43] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 10.500001f, -2.5980759f, 0.7734375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 10.500001f, -2.5980759f, 0.7734375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.598076f, -1.4999996f, 0.77734375f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.598076f, -1.4999996f, 0.77734375f, 0.09765625f);
			faces[44] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.327443f, -1.3437496f, 0.77734375f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.327443f, -1.3437496f, 0.77734375f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 10.343751f, -2.327443f, 0.7734375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 10.343751f, -2.327443f, 0.7734375f, 0.1015625f);
			faces[45] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.598076f, -1.4999996f, 0.77734375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.598076f, -1.4999996f, 0.77734375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.5313f, 12.0f, 2.6226834E-7f, 0.78125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.5938f, 12.0f, 2.6226834E-7f, 0.78125f, 0.09765625f);
			faces[46] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.5938f, 11.6875f, 2.3494871E-7f, 0.78125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.5313f, 11.6875f, 2.3494871E-7f, 0.78125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.5313f, 11.327443f, -1.3437496f, 0.77734375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.5938f, 11.327443f, -1.3437496f, 0.77734375f, 0.1015625f);
			faces[47] = new TexturedPolygon(vertices);
			//
			Signal[10].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		Signal[10].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[11] = new ModelRendererTurbo(this, 251, 0, textureX, textureY);
		Signal[11].flip = false;
		Signal[11].addCylinder(2.5f, 9, 0, 1, 2, 8, 1, 1, 2);
		Signal[11].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[12] = new ModelRendererTurbo(this, 175, 19, textureX, textureY);
		{//LEGACY CONVERTER START
			TexturedPolygon[] faces = new TexturedPolygon[48]; PositionTransformVertex[] vertices = null;
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.598076f, 1.5000006f, 0.7011719f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.4688f, 11.327443f, 1.3437505f, 0.7001953f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.4688f, 11.6875f, 2.3494871E-7f, 0.6953125f, 0.095703125f);
			vertices[3] = new PositionTransformVertex(3.4688f, 12.0f, 2.6226834E-7f, 0.6953125f, 0.09765625f);
			faces[0] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.5f, 2.5980763f, 0.70546126f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.4688f, 10.34375f, 2.3274434f, 0.7037698f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.4688f, 11.327443f, 1.3437505f, 0.7001953f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.598076f, 1.5000006f, 0.7011719f, 0.096086234f);
			faces[1] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.0f, 3.0f, 0.70703125f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.4688f, 9.0f, 2.6875f, 0.7050781f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.4688f, 10.34375f, 2.3274434f, 0.7037698f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.5f, 2.5980763f, 0.70546126f, 0.091796875f);
			faces[2] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.5f, 2.5980763f, 0.70546126f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.4688f, 7.65625f, 2.3274434f, 0.7037698f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.4688f, 9.0f, 2.6875f, 0.7050781f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.0f, 3.0f, 0.70703125f, 0.0859375f);
			faces[3] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.401924f, 1.5000005f, 0.7011719f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.4688f, 6.672557f, 1.3437505f, 0.7001953f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.4688f, 7.65625f, 2.3274434f, 0.7037698f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.5f, 2.5980763f, 0.70546126f, 0.080078125f);
			faces[4] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.0f, -5.245367E-7f, 0.6953125f, 0.07421875f);
			vertices[1] = new PositionTransformVertex(3.4688f, 6.3125f, -4.6989743E-7f, 0.6953125f, 0.076171875f);
			vertices[2] = new PositionTransformVertex(3.4688f, 6.672557f, 1.3437505f, 0.7001953f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.401924f, 1.5000005f, 0.7011719f, 0.075788766f);
			faces[5] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.4019246f, -1.5000014f, 0.6894531f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.4688f, 6.6725574f, -1.3437513f, 0.6904297f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.4688f, 6.3125f, -4.6989743E-7f, 0.6953125f, 0.076171875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.0f, -5.245367E-7f, 0.6953125f, 0.07421875f);
			faces[6] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.500001f, -2.5980768f, 0.68516374f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.4688f, 7.656251f, -2.3274438f, 0.6868552f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.4688f, 6.6725574f, -1.3437513f, 0.6904297f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.4019246f, -1.5000014f, 0.6894531f, 0.075788766f);
			faces[7] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.000001f, -3.0f, 0.68359375f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.4688f, 9.000001f, -2.6875f, 0.6855469f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.4688f, 7.656251f, -2.3274438f, 0.6868552f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.500001f, -2.5980768f, 0.68516374f, 0.080078125f);
			faces[8] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.500001f, -2.5980759f, 0.68516374f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.4688f, 10.343751f, -2.327443f, 0.6868552f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.4688f, 9.000001f, -2.6875f, 0.6855469f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.000001f, -3.0f, 0.68359375f, 0.0859375f);
			faces[9] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.598076f, -1.4999996f, 0.6894531f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.4688f, 11.327443f, -1.3437496f, 0.6904297f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.4688f, 10.343751f, -2.327443f, 0.6868552f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.500001f, -2.5980759f, 0.68516374f, 0.091796875f);
			faces[10] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 12.0f, 2.6226834E-7f, 0.6953125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4688f, 11.6875f, 2.3494871E-7f, 0.6953125f, 0.095703125f);
			vertices[2] = new PositionTransformVertex(3.4688f, 11.327443f, -1.3437496f, 0.6904297f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.598076f, -1.4999996f, 0.6894531f, 0.096086234f);
			faces[11] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 12.0f, 2.6226834E-7f, 0.71875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.6875f, 2.3494871E-7f, 0.71875f, 0.095703125f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.327443f, 1.3437505f, 0.7236328f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.4063f, 11.598076f, 1.5000006f, 0.7246094f, 0.096086234f);
			faces[12] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 11.598076f, 1.5000006f, 0.7246094f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.327443f, 1.3437505f, 0.7236328f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.34375f, 2.3274434f, 0.7272073f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.4063f, 10.5f, 2.5980763f, 0.72889876f, 0.091796875f);
			faces[13] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 10.5f, 2.5980763f, 0.72889876f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.34375f, 2.3274434f, 0.7272073f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.0f, 2.6875f, 0.7285156f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.4063f, 9.0f, 3.0f, 0.73046875f, 0.0859375f);
			faces[14] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 9.0f, 3.0f, 0.73046875f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.0f, 2.6875f, 0.7285156f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.65625f, 2.3274434f, 0.7272073f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.4063f, 7.5f, 2.5980763f, 0.72889876f, 0.080078125f);
			faces[15] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 7.5f, 2.5980763f, 0.72889876f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.65625f, 2.3274434f, 0.7272073f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.672557f, 1.3437505f, 0.7236328f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.4063f, 6.401924f, 1.5000005f, 0.7246094f, 0.075788766f);
			faces[16] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 6.401924f, 1.5000005f, 0.7246094f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.672557f, 1.3437505f, 0.7236328f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.3125f, -4.6989743E-7f, 0.71875f, 0.076171875f);
			vertices[3] = new PositionTransformVertex(3.4063f, 6.0f, -5.245367E-7f, 0.71875f, 0.07421875f);
			faces[17] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 6.0f, -5.245367E-7f, 0.71875f, 0.07421875f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.3125f, -4.6989743E-7f, 0.71875f, 0.076171875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.6725574f, -1.3437513f, 0.7138672f, 0.07748022f);
			vertices[3] = new PositionTransformVertex(3.4063f, 6.4019246f, -1.5000014f, 0.7128906f, 0.075788766f);
			faces[18] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 6.4019246f, -1.5000014f, 0.7128906f, 0.075788766f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.6725574f, -1.3437513f, 0.7138672f, 0.07748022f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.656251f, -2.3274438f, 0.7102927f, 0.08105469f);
			vertices[3] = new PositionTransformVertex(3.4063f, 7.500001f, -2.5980768f, 0.70860124f, 0.080078125f);
			faces[19] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 7.500001f, -2.5980768f, 0.70860124f, 0.080078125f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.656251f, -2.3274438f, 0.7102927f, 0.08105469f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.000001f, -2.6875f, 0.7089844f, 0.0859375f);
			vertices[3] = new PositionTransformVertex(3.4063f, 9.000001f, -3.0f, 0.70703125f, 0.0859375f);
			faces[20] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 9.000001f, -3.0f, 0.70703125f, 0.0859375f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.000001f, -2.6875f, 0.7089844f, 0.0859375f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.343751f, -2.327443f, 0.7102927f, 0.09082031f);
			vertices[3] = new PositionTransformVertex(3.4063f, 10.500001f, -2.5980759f, 0.70860124f, 0.091796875f);
			faces[21] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 10.500001f, -2.5980759f, 0.70860124f, 0.091796875f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.343751f, -2.327443f, 0.7102927f, 0.09082031f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.327443f, -1.3437496f, 0.7138672f, 0.09439478f);
			vertices[3] = new PositionTransformVertex(3.4063f, 11.598076f, -1.4999996f, 0.7128906f, 0.096086234f);
			faces[22] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4063f, 11.598076f, -1.4999996f, 0.7128906f, 0.096086234f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.327443f, -1.3437496f, 0.7138672f, 0.09439478f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.6875f, 2.3494871E-7f, 0.71875f, 0.095703125f);
			vertices[3] = new PositionTransformVertex(3.4063f, 12.0f, 2.6226834E-7f, 0.71875f, 0.09765625f);
			faces[23] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 12.0f, 2.6226834E-7f, 0.68359375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 12.0f, 2.6226834E-7f, 0.68359375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.598076f, 1.5000006f, 0.6875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.598076f, 1.5000006f, 0.6875f, 0.09765625f);
			faces[24] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.327443f, 1.3437505f, 0.6875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.327443f, 1.3437505f, 0.6875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.6875f, 2.3494871E-7f, 0.68359375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.6875f, 2.3494871E-7f, 0.68359375f, 0.1015625f);
			faces[25] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.598076f, 1.5000006f, 0.6875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.598076f, 1.5000006f, 0.6875f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.5f, 2.5980763f, 0.69140625f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.5f, 2.5980763f, 0.69140625f, 0.09765625f);
			faces[26] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.34375f, 2.3274434f, 0.69140625f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.34375f, 2.3274434f, 0.69140625f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.327443f, 1.3437505f, 0.6875f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.327443f, 1.3437505f, 0.6875f, 0.1015625f);
			faces[27] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.5f, 2.5980763f, 0.69140625f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.5f, 2.5980763f, 0.69140625f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.0f, 3.0f, 0.6953125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.0f, 3.0f, 0.6953125f, 0.09765625f);
			faces[28] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.0f, 2.6875f, 0.6953125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.0f, 2.6875f, 0.6953125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.34375f, 2.3274434f, 0.69140625f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.34375f, 2.3274434f, 0.69140625f, 0.1015625f);
			faces[29] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.0f, 3.0f, 0.6953125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.0f, 3.0f, 0.6953125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.5f, 2.5980763f, 0.69921875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.5f, 2.5980763f, 0.69921875f, 0.09765625f);
			faces[30] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.65625f, 2.3274434f, 0.69921875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.65625f, 2.3274434f, 0.69921875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.0f, 2.6875f, 0.6953125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.0f, 2.6875f, 0.6953125f, 0.1015625f);
			faces[31] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.5f, 2.5980763f, 0.69921875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.5f, 2.5980763f, 0.69921875f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.401924f, 1.5000005f, 0.703125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.401924f, 1.5000005f, 0.703125f, 0.09765625f);
			faces[32] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.672557f, 1.3437505f, 0.703125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.672557f, 1.3437505f, 0.703125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.65625f, 2.3274434f, 0.69921875f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.65625f, 2.3274434f, 0.69921875f, 0.1015625f);
			faces[33] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.401924f, 1.5000005f, 0.703125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.401924f, 1.5000005f, 0.703125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.0f, -5.245367E-7f, 0.70703125f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.0f, -5.245367E-7f, 0.70703125f, 0.09765625f);
			faces[34] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.3125f, -4.6989743E-7f, 0.70703125f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.3125f, -4.6989743E-7f, 0.70703125f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.672557f, 1.3437505f, 0.703125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.672557f, 1.3437505f, 0.703125f, 0.1015625f);
			faces[35] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.0f, -5.245367E-7f, 0.70703125f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.0f, -5.245367E-7f, 0.70703125f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.4019246f, -1.5000014f, 0.7109375f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.4019246f, -1.5000014f, 0.7109375f, 0.09765625f);
			faces[36] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.6725574f, -1.3437513f, 0.7109375f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.6725574f, -1.3437513f, 0.7109375f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.3125f, -4.6989743E-7f, 0.70703125f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.3125f, -4.6989743E-7f, 0.70703125f, 0.1015625f);
			faces[37] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 6.4019246f, -1.5000014f, 0.7109375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 6.4019246f, -1.5000014f, 0.7109375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.500001f, -2.5980768f, 0.71484375f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.500001f, -2.5980768f, 0.71484375f, 0.09765625f);
			faces[38] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.656251f, -2.3274438f, 0.71484375f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.656251f, -2.3274438f, 0.71484375f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 6.6725574f, -1.3437513f, 0.7109375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 6.6725574f, -1.3437513f, 0.7109375f, 0.1015625f);
			faces[39] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 7.500001f, -2.5980768f, 0.71484375f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 7.500001f, -2.5980768f, 0.71484375f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.000001f, -3.0f, 0.71875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.000001f, -3.0f, 0.71875f, 0.09765625f);
			faces[40] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.000001f, -2.6875f, 0.71875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.000001f, -2.6875f, 0.71875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 7.656251f, -2.3274438f, 0.71484375f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 7.656251f, -2.3274438f, 0.71484375f, 0.1015625f);
			faces[41] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 9.000001f, -3.0f, 0.71875f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 9.000001f, -3.0f, 0.71875f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.500001f, -2.5980759f, 0.72265625f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.500001f, -2.5980759f, 0.72265625f, 0.09765625f);
			faces[42] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.343751f, -2.327443f, 0.72265625f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.343751f, -2.327443f, 0.72265625f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 9.000001f, -2.6875f, 0.71875f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 9.000001f, -2.6875f, 0.71875f, 0.1015625f);
			faces[43] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 10.500001f, -2.5980759f, 0.72265625f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 10.500001f, -2.5980759f, 0.72265625f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.598076f, -1.4999996f, 0.7265625f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.598076f, -1.4999996f, 0.7265625f, 0.09765625f);
			faces[44] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.327443f, -1.3437496f, 0.7265625f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.327443f, -1.3437496f, 0.7265625f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 10.343751f, -2.327443f, 0.72265625f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 10.343751f, -2.327443f, 0.72265625f, 0.1015625f);
			faces[45] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.598076f, -1.4999996f, 0.7265625f, 0.09765625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.598076f, -1.4999996f, 0.7265625f, 0.1015625f);
			vertices[2] = new PositionTransformVertex(3.4063f, 12.0f, 2.6226834E-7f, 0.73046875f, 0.1015625f);
			vertices[3] = new PositionTransformVertex(3.4688f, 12.0f, 2.6226834E-7f, 0.73046875f, 0.09765625f);
			faces[46] = new TexturedPolygon(vertices);
			vertices = new PositionTransformVertex[4];
			vertices[0] = new PositionTransformVertex(3.4688f, 11.6875f, 2.3494871E-7f, 0.73046875f, 0.1015625f);
			vertices[1] = new PositionTransformVertex(3.4063f, 11.6875f, 2.3494871E-7f, 0.73046875f, 0.10546875f);
			vertices[2] = new PositionTransformVertex(3.4063f, 11.327443f, -1.3437496f, 0.7265625f, 0.10546875f);
			vertices[3] = new PositionTransformVertex(3.4688f, 11.327443f, -1.3437496f, 0.7265625f, 0.1015625f);
			faces[47] = new TexturedPolygon(vertices);
			//
			Signal[12].copyTo(new PositionTransformVertex[0], faces);
		}//LEGACY CONVERTER END
		Signal[12].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[13] = new ModelRendererTurbo(this, 198, 0, textureX, textureY); // Lamp
		Signal[13].flip = false;
		Signal[13].addCylinder(3.625f, 9, 0, 1, 1, 8, 0.875f, 0.9375f, 2);
		Signal[13].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[14] = new ModelRendererTurbo(this, 172, 0, textureX, textureY); // Lamp
		Signal[14].flip = false;
		Signal[14].addCylinder(3.75f, 9, 0, 1, 1, 8, 0.6875f, 0.875f, 2);
		Signal[14].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[15] = new ModelRendererTurbo(this, 139, 0, textureX, textureY); // Lamp
		Signal[15].flip = false;
		Signal[15].addCylinder(1.5f, 9, 0, 1, 1, 8, 0.9375f, 0.875f, 2);
		Signal[15].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[16] = new ModelRendererTurbo(this, 117, 0, textureX, textureY); // Lamp
		Signal[16].flip = false;
		Signal[16].addCylinder(1.625f, 9, 0, 1, 1, 8, 0.875f, 0.6875f, 2);
		Signal[16].setRotationPoint(-3.75f, -34.0f, 0.0f);

		Signal[17] = new ModelRendererTurbo(this, 106, 0, textureX, textureY); // Lamp
		Signal[17].flip = false;
		Signal[17].addCylinder(1.6875f, 9, 0, 1, 1, 8, 0.6875f, 0.4375f, 2);
		Signal[17].setRotationPoint(-3.9375f, -34.0f, 0.0f);

		Signal[18] = new ModelRendererTurbo(this, 84, 0, textureX, textureY);
		Signal[18].addShapeBox(2.9688f, 6.3125f, -0.5f, 1, 5, 1, 0, -0.4531f, 0, 0, -0.3907f, 0, 0, -0.3907f, 0, 0, -0.4531f, 0, 0, -0.4531f, 0.375f, 0, -0.3907f, 0.375f, 0, -0.3907f, 0.375f, 0, -0.4531f, 0.375f, 0);
		Signal[18].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[19] = new ModelRendererTurbo(this, 243, 5, textureX, textureY);
		Signal[19].addShapeBox(2.9688f, 8.5f, -2.3125f, 1, 1, 5, 0, -0.4531f, 0, 0.375f, -0.3907f, 0, 0.375f, -0.3907f, 0, 0, -0.4531f, 0, 0, -0.4531f, 0, 0.375f, -0.3907f, 0, 0.375f, -0.3907f, 0, 0, -0.4531f, 0, 0);
		Signal[19].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[20] = new ModelRendererTurbo(this, 73, 0, textureX, textureY);
		Signal[20].addShapeBox(0, 0.5f, -0.25f, 1, 1, 1, 0, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f);
		Signal[20].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[21] = new ModelRendererTurbo(this, 51, 0, textureX, textureY);
		Signal[21].addShapeBox(0, 0.5f, -1.125f, 1, 1, 1, 0, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f);
		Signal[21].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[22] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
		Signal[22].addShapeBox(-0.0625f, 0.5625f, -0.3125f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f);
		Signal[22].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[23] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		Signal[23].addShapeBox(-0.0625f, 1.3125f, -0.3125f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f);
		Signal[23].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[24] = new ModelRendererTurbo(this, 9, 0, textureX, textureY);
		Signal[24].addShapeBox(-0.0625f, 0.5625f, -1.1875f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f);
		Signal[24].setRotationPoint(-3.5f, -34.0f, 0.0f);

		Signal[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		Signal[25].addShapeBox(-0.0625f, 1.3125f, -1.1875f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f);
		Signal[25].setRotationPoint(-3.5f, -34.0f, 0.0f);

	}

}
