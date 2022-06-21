//FMT-Marker TiM-1.0
package train.client.render.models.blocks;


import net.minecraft.entity.Entity;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelMFPBWigWag extends FVTMFormatBase {

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		for(ModelRendererTurbo turbo : groups.get(0)){
			turbo.render();
		}

		for(ModelRendererTurbo turbo : groups.get(1)){
			turbo.rotateAngleX=f0*0.0174533f;
			turbo.render();
		}
	}

	public ModelMFPBWigWag(){
		super();
		textureX = 256; textureY = 256;
		this.addToCreators("Green PC");
		//
		FVTMFormatBase.TurboList group0 = new FVTMFormatBase.TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 117, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 7, 0, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f)
				.setRotationPoint(-3.5f, -1, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 80, 33, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 1, 1, 4, null)
				.setRotationPoint(0, -5.3125f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f)
				.setRotationPoint(-2, -2.25f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 75, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, 0, -0.4375f)
				.setRotationPoint(-0.125f, -5.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 70, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.4375f, 0, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f)
				.setRotationPoint(0.5f, -5.25f, -0.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 221, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-1.5f, -21.75f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 102, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
				.setRotationPoint(-1.375f, -29.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 153, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f)
				.setRotationPoint(-1.375f, -24.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 65, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0)
				.setRotationPoint(0.5625f, -43.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 165, 0, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.5f, 1, 3, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0)
				.setRotationPoint(0.625f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 202, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 4, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-2, -36, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 247, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(1.5f, -32.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 208, 9, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.875f, 3, new Vec3f(-0.875, 0.0, 0.0))
				.setRotationPoint(2.5f, -34.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 248, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(2.375f, -34.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 84, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f, 0.0625f, -0.5f, 0.0625f)
				.setRotationPoint(-3.5f, -1.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 51, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-3.5f, -1.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f, -0.1875f, -0.75f, -0.1875f)
				.setRotationPoint(-3.5f, -2, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 228, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-0.125f, -5.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 219, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, -0.25f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.3125f, -0.25f, -0.75f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(-1.5f, -5.25f, -0.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 13, 8, 0.625f, 0.625f, 4, null)
				.setRotationPoint(0, -18.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 145, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 4, null)
				.setRotationPoint(0, -21.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 143, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2)
				.setRotationPoint(-1.5f, -24.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 126, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2)
				.setRotationPoint(-1.4375f, -24.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 109, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f)
				.setRotationPoint(-1.5f, -30, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 140, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-1.5f, -29.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 92, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f)
				.setRotationPoint(-1.4375f, -30, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 135, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, -0.9375f, 0, -0.0625f, -0.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f)
				.setRotationPoint(-1.4375f, -29.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 51, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-1.5f, -24.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 34, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-1.4375f, -24.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 17, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-1.5f, -30, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 130, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.9375f, -1, -0.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-1.5f, -29.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f)
				.setRotationPoint(-1.4375f, -30, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 125, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.0625f, -0.9375f, -0.5f, -0.0625f, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5625f, -0.9375f, -0.5f, -0.5625f, -0.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-1.4375f, -29.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 234, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2)
				.setRotationPoint(0.5f, -24.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 224, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2)
				.setRotationPoint(0.4375f, -24.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 198, 10, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.9375f, 2.25f, -2, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, -1.5f, -0.9375f, -2.75f, -1.5f)
				.setRotationPoint(0.5f, -30, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 120, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -1, -0.5f, -0.9375f, -1, -0.5f)
				.setRotationPoint(0.5f, -29.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 214, 8, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 2.25f, -2, -0.5f, 2.25f, -2, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -3.1875f, -1.9375f, -0.5f, -3.1875f, -1.9375f)
				.setRotationPoint(0.4375f, -30, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 115, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.9375f, -0.5f, -0.0625f, -0.9375f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5625f, -0.9375f, -0.5f, -0.5625f, -0.9375f)
				.setRotationPoint(0.4375f, -29.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 183, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.9375f, -0.5f, 0)
				.setRotationPoint(0.5f, -24.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(0.4375f, -24.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 233, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.9375f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, -2.75f, -1.5f, 0, -2.75f, -1.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f)
				.setRotationPoint(0.5f, -30, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 110, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.9375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, -1, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, -0.9375f, -0.5f, 0)
				.setRotationPoint(0.5f, -29.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 162, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 2.25f, -2, 0, 2.25f, -2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -3.1875f, -1.9375f, 0, -3.1875f, -1.9375f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f)
				.setRotationPoint(0.4375f, -30, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 105, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.0625f, -0.9375f, 0, -0.0625f, -0.9375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(0.4375f, -29.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 100, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, 0, 0, -0.5625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f)
				.setRotationPoint(0.5f, -21.25f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 95, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.25f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.8125f, 0, 0, -0.5625f)
				.setRotationPoint(0.5f, -21.25f, 0.3125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 90, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.4375f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.8125f, 0, 0, -0.5625f, 0, 0, -0.4375f, -0.75f, 0, -0.1875f)
				.setRotationPoint(-1.5f, -21.25f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.75f, 0, -0.1875f, 0, 0, -0.4375f, 0, 0, -0.5625f, -0.75f, 0, -0.8125f)
				.setRotationPoint(-1.5f, -21.25f, 0.3125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 55, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(-1.6875f, -29.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 50, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(0.6875f, -29.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 169, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
				.setRotationPoint(-1.375f, -24.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 45, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(-1.6875f, -24.8125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(0.6875f, -24.8125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 160, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
				.setRotationPoint(-1.375f, -24.5f, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 30, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(-1.6875f, -24.8125f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 214, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(0.6875f, -24.8125f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 135, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
				.setRotationPoint(-1.375f, -29.375f, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 195, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(-1.6875f, -29.6875f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 190, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.4375f, -0.4375f, -0.75f)
				.setRotationPoint(0.6875f, -29.6875f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 185, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1)
				.setRotationPoint(-1.625f, -24.4375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 180, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1)
				.setRotationPoint(0.625f, -22.15f, -3.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 136, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f)
				.setRotationPoint(0.375f, -24.125f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 175, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1)
				.setRotationPoint(0.625f, -24.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 170, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1)
				.setRotationPoint(-1.625f, -22.2125f, -3.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 165, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1)
				.setRotationPoint(-0.5f, -23.3375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 119, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f)
				.setRotationPoint(-1.375f, -30.375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 85, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f)
				.setRotationPoint(0.625f, -30.0625f, -7.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 224, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f)
				.setRotationPoint(-1.625f, -32.3375f, -3.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 102, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f)
				.setRotationPoint(0.375f, -30.4375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 160, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f)
				.setRotationPoint(-1.625f, -30, -7.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 155, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f)
				.setRotationPoint(0.625f, -32.275f, -3.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 80, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f)
				.setRotationPoint(-0.5f, -31.175f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 44, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f)
				.setRotationPoint(-1.375f, -24.0625f, 2.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 75, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f)
				.setRotationPoint(-1.625f, -24.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 70, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f)
				.setRotationPoint(0.625f, -22.15f, 2.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 27, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0)
				.setRotationPoint(0.375f, -24.125f, 2.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 65, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f)
				.setRotationPoint(0.625f, -24.5f, 6.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 248, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f)
				.setRotationPoint(-1.625f, -22.2125f, 2.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 219, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f)
				.setRotationPoint(-0.5f, -23.3375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -2.375f, 1.6375f, -0.3125f, 1.75f, 1.55f, -0.5f, -0.625f, -0.9375f, 0, 0, -0.875f, -0.125f, -2.375f, -2.5625f, -0.3125f, 1.75f, -2.4625f, -0.5f, -0.625f, 0, 0, 0, -0.0625f, -0.125f)
				.setRotationPoint(-1.375f, -30.375f, 2.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
				.setRotationPoint(0.625f, -30.0625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 145, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -1, -0.4375f, -0.3125f, -1, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
				.setRotationPoint(-1.625f, -32.3375f, 2.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 8, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.75f, 1.55f, -0.5f, -2.375f, 1.6375f, -0.3125f, 0, -0.875f, -0.125f, -0.625f, -0.9375f, 0, 1.75f, -2.4625f, -0.5f, -2.375f, -2.5625f, -0.3125f, 0, -0.0625f, -0.125f, -0.625f, 0, 0)
				.setRotationPoint(0.375f, -30.4375f, 2.8125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 140, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
				.setRotationPoint(-1.625f, -30, 6.625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 135, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, -1, -0.4375f, -0.25f, -1, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
				.setRotationPoint(0.625f, -32.275f, 2.4375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 130, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -1, -0.4375f, -0.375f, -1, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
				.setRotationPoint(-0.5f, -31.2375f, 4.375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 125, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.5f, -3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 120, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.5f, -4.625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 115, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 110, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.5f, -4.625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 105, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.4375f, -3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 100, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.4375f, -4.625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 95, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.4375f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 90, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.4375f, -4.625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.5625f, -3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 55, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.5625f, -4.625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 50, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.5625f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 45, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-0.5625f, -4.625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 160, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f)
				.setRotationPoint(-2.4375f, -32.75f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 68, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f)
				.setRotationPoint(0.5f, -32.75f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 209, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f)
				.setRotationPoint(-1.9375f, -32.75f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, -0.5f, -0.4375f, -0.0625f)
				.setRotationPoint(0.4375f, -32.75f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 126, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f)
				.setRotationPoint(-1.5f, -33.25f, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 117, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5625f, 0, -0.9375f, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
				.setRotationPoint(-1.5f, -33.25f, -2.9375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 102, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f)
				.setRotationPoint(-1.5f, -33.25f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 217, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5625f, 0, -0.9375f, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
				.setRotationPoint(-1.5f, -33.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.6875f, -0.5f, -0.9375f, -0.6875f, -0.5f, -0.9375f, 0.6875f, 0.25f, 0, 0.6875f, 0.25f, 0, 0, 0, -0.9375f, 0, 0)
				.setRotationPoint(0.5f, -33.25f, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 35, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.21f, 0, -0.9375f, -0.21f, 0, -0.9375f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, -0.9375f, 0, 0)
				.setRotationPoint(0.5f, -36.25f, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 30, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, -1.25f, 0.5f, -0.9375f, -1.25f, 0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, 0.6875f, 0.25f, -0.9375f, 0.6875f, 0.25f)
				.setRotationPoint(0.5f, -33.25f, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 25, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, -0.21f, 0, 0, -0.21f, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.5f, -0.9375f, -0.3125f, -0.5f)
				.setRotationPoint(0.5f, -36.25f, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 20, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, 0, -1, 0, 0, -1, 0, -0.6875f, 0, -0.9375f, -0.6875f, 0, -0.9375f, -1, 2.5f, 0, -1, 2.5f, 0, -0.79f, -3, -0.9375f, -0.79f, -3)
				.setRotationPoint(0.5f, -39.25f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 15, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.9375f, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, -1, -0.9375f, 0, -1, -0.9375f, -0.79f, -3, 0, -0.79f, -3, 0, -1, 2.5f, -0.9375f, -1, 2.5f)
				.setRotationPoint(0.5f, -39.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.185f, -0.9375f, 0, -0.185f, -0.9375f, 0, -0.21f, 0, -0.5f, -0.21f, 0, -0.5f, 0.03125f, -0.9375f, 0, 0.03125f, -0.9375f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(0.4375f, -36.25f, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 5, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.21f, 0, 0, -0.21f, 0, 0, -0.185f, -0.9375f, -0.5f, -0.185f, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, 0.03125f, -0.9375f, -0.5f, 0.03125f, -0.9375f)
				.setRotationPoint(0.4375f, -36.25f, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.625f, -1, 0, -0.625f, -1, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.815f, 2.0625f, 0, -0.815f, 2.0625f, 0, -0.79f, -3, -0.5f, -0.79f, -3)
				.setRotationPoint(0.4375f, -39.25f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 243, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.625f, -1, -0.5f, -0.625f, -1, -0.5f, -0.79f, -3, 0, -0.79f, -3, 0, -0.815f, 2.0625f, -0.5f, -0.815f, 2.0625f)
				.setRotationPoint(0.4375f, -39.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 238, 28, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.5f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 233, 28, textureX, textureY)
				.addShapeBox(0, -1.5f, 7.25f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 132, 0, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 99, 0, textureX, textureY)
				.addShapeBox(0, 1, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 214, 28, textureX, textureY)
				.addShapeBox(0, -1, -6.375f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 193, 28, textureX, textureY)
				.addShapeBox(0, -0.625f, -6.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 188, 28, textureX, textureY)
				.addShapeBox(0, 0, -6.375f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 183, 28, textureX, textureY)
				.addShapeBox(0, -0.875f, -6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 178, 28, textureX, textureY)
				.addShapeBox(0, 0.625f, -6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 173, 28, textureX, textureY)
				.addShapeBox(0, -1, -6.125f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 85, 28, textureX, textureY)
				.addShapeBox(0, 0, -6.125f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 228, 27, textureX, textureY)
				.addShapeBox(0, -0.625f, -5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 223, 27, textureX, textureY)
				.addShapeBox(0, 0.375f, -5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 168, 27, textureX, textureY)
				.addShapeBox(0, -0.875f, -4.625f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 163, 27, textureX, textureY)
				.addShapeBox(0, -0.875f, -4.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 158, 27, textureX, textureY)
				.addShapeBox(0, -1, -4.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 80, 27, textureX, textureY)
				.addShapeBox(0, -0.125f, -4.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 75, 27, textureX, textureY)
				.addShapeBox(0, -0.625f, -3.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 70, 27, textureX, textureY)
				.addShapeBox(0, -0.75f, -4.375f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 65, 27, textureX, textureY)
				.addShapeBox(0, 0, -4.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 26, textureX, textureY)
				.addShapeBox(0, -1, -2.875f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 153, 26, textureX, textureY)
				.addShapeBox(0, -0.625f, -2.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 148, 26, textureX, textureY)
				.addShapeBox(0, 0, -2.875f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 143, 26, textureX, textureY)
				.addShapeBox(0, -0.875f, -2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 138, 26, textureX, textureY)
				.addShapeBox(0, 0.625f, -2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 133, 26, textureX, textureY)
				.addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 128, 26, textureX, textureY)
				.addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 123, 26, textureX, textureY)
				.addShapeBox(0, -0.625f, -1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 118, 26, textureX, textureY)
				.addShapeBox(0, -1, -1.125f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 113, 26, textureX, textureY)
				.addShapeBox(0, -0.625f, -1.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 108, 26, textureX, textureY)
				.addShapeBox(0, 0, -1.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 103, 26, textureX, textureY)
				.addShapeBox(0, -0.875f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 98, 26, textureX, textureY)
				.addShapeBox(0, 0.625f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 93, 26, textureX, textureY)
				.addShapeBox(0, -1, -0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 26, textureX, textureY)
				.addShapeBox(0, 0, -0.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 55, 26, textureX, textureY)
				.addShapeBox(0, -0.625f, -0.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 50, 26, textureX, textureY)
				.addShapeBox(0, 0.375f, -1.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 45, 26, textureX, textureY)
				.addShapeBox(0, -0.125f, -0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 26, textureX, textureY)
				.addShapeBox(0, 0.125f, -0.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 35, 26, textureX, textureY)
				.addShapeBox(0, -0.25f, -0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 30, 26, textureX, textureY)
				.addShapeBox(0, -0.75f, -1.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 25, 26, textureX, textureY)
				.addShapeBox(0, -1, 0.625f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 20, 26, textureX, textureY)
				.addShapeBox(0, -0.625f, 0.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 15, 26, textureX, textureY)
				.addShapeBox(0, 0, 0.625f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 26, textureX, textureY)
				.addShapeBox(0, -0.875f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 5, 26, textureX, textureY)
				.addShapeBox(0, 0.625f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 26, textureX, textureY)
				.addShapeBox(0, -1, 0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 244, 25, textureX, textureY)
				.addShapeBox(0, 0, 0.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 239, 25, textureX, textureY)
				.addShapeBox(0, -0.625f, 1.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 234, 25, textureX, textureY)
				.addShapeBox(0, 0.375f, 0.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 219, 25, textureX, textureY)
				.addShapeBox(0, -0.125f, 0.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 214, 25, textureX, textureY)
				.addShapeBox(0, 0.125f, 1.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 88, 25, textureX, textureY)
				.addShapeBox(0, -0.25f, 0.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 251, 23, textureX, textureY)
				.addShapeBox(0, -0.75f, 0.625f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 229, 23, textureX, textureY)
				.addShapeBox(0, -0.875f, 2.375f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 224, 23, textureX, textureY)
				.addShapeBox(0, -0.875f, 3.125f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 83, 23, textureX, textureY)
				.addShapeBox(0, -0.875f, 4.375f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 201, 22, textureX, textureY)
				.addShapeBox(0, -0.875f, 3.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, -1.375f, 0, -0.9375f, -1.375f, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, 0.75f, 0, -0.9375f, 0.75f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 169, 22, textureX, textureY)
				.addShapeBox(0, -1, 5.125f, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 77, 22, textureX, textureY)
				.addShapeBox(0, -0.625f, 5.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 69, 21, textureX, textureY)
				.addShapeBox(0, 0, 5.125f, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 61, 21, textureX, textureY)
				.addShapeBox(0, -0.875f, 5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 21, textureX, textureY)
				.addShapeBox(0, 0.625f, 5.375f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 20, textureX, textureY)
				.addShapeBox(0, -1, 5.375f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 244, 20, textureX, textureY)
				.addShapeBox(0, 0, 5.375f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 206, 19, textureX, textureY)
				.addShapeBox(0, -0.625f, 6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 201, 19, textureX, textureY)
				.addShapeBox(0, 0.125f, 6.125f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 169, 19, textureX, textureY)
				.addShapeBox(0, 0.125f, 5.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f)
				.setRotationPoint(0.6875f, -41.75f, 0).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 66, 0, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.5f, 1, 3, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0)
				.setRotationPoint(0.4375f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 92, 19, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.5f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 87, 19, textureX, textureY)
				.addShapeBox(0, -1.5f, 7.25f, 1, 3, 1, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 33, 0, textureX, textureY)
				.addShapeBox(0, -1.5f, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
				.addShapeBox(0, 1, -7.25f, 1, 1, 15, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.9375f, -0.125f, -0.5f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.9375f, -0.625f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 82, 19, textureX, textureY)
				.addShapeBox(0, -0.875f, -7, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 77, 19, textureX, textureY)
				.addShapeBox(0, -0.875f, -6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 65, 19, textureX, textureY)
				.addShapeBox(0, -1, -6.75f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 234, 18, textureX, textureY)
				.addShapeBox(0, -0.125f, -6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 161, 18, textureX, textureY)
				.addShapeBox(0, -0.625f, -6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 17, textureX, textureY)
				.addShapeBox(0, -0.75f, -6.75f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 244, 17, textureX, textureY)
				.addShapeBox(0, 0, -6.75f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 223, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, -5.25f, 1, 2, 1, 0, -0.9375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.9375f, -0.25f, -0.375f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 218, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, -4.25f, 1, 2, 1, 0, -0.9375f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.9375f, -0.25f, -1.125f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 153, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, -4.875f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 144, 17, textureX, textureY)
				.addShapeBox(0, 0.125f, -4.875f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 136, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, -3.5f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 127, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, -2.75f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 119, 17, textureX, textureY)
				.addShapeBox(0, 0.625f, -2.5f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 110, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, 1.625f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 102, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, 1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 61, 17, textureX, textureY)
				.addShapeBox(0, -1, 1.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 52, 17, textureX, textureY)
				.addShapeBox(0, -0.125f, 1.875f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 44, 17, textureX, textureY)
				.addShapeBox(0, -0.625f, 2.625f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 35, 17, textureX, textureY)
				.addShapeBox(0, -0.75f, 1.875f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 27, 17, textureX, textureY)
				.addShapeBox(0, 0, 1.875f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.25f, -0.9375f, -0.125f, -0.25f, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.9375f, -0.125f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 17, textureX, textureY)
				.addShapeBox(0, -1, 3, 1, 1, 1, 0, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 17, textureX, textureY)
				.addShapeBox(0, -0.625f, 3, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 172, 12, textureX, textureY)
				.addShapeBox(0, 0, 3, 1, 1, 1, 0, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.9375f, -0.625f, -0.75f, -0.9375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, -0.75f, -0.9375f, -0.125f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 167, 12, textureX, textureY)
				.addShapeBox(0, -0.875f, 3.25f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 142, 12, textureX, textureY)
				.addShapeBox(0, 0.625f, 3.25f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 137, 12, textureX, textureY)
				.addShapeBox(0, -1, 3.25f, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 132, 12, textureX, textureY)
				.addShapeBox(0, 0, 3.25f, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 127, 12, textureX, textureY)
				.addShapeBox(0, -0.625f, 4, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY)
				.addShapeBox(0, -0.875f, 4.375f, 1, 2, 1, 0, -0.9375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.9375f, -0.25f, -0.375f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 234, 14, textureX, textureY)
				.addShapeBox(0, -0.875f, 5.375f, 1, 2, 1, 0, -0.9375f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.9375f, -0.25f, -1.125f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 122, 12, textureX, textureY)
				.addShapeBox(0, -0.875f, 4.75f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 117, 12, textureX, textureY)
				.addShapeBox(0, 0.125f, 4.75f, 1, 1, 1, 0, -0.9375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5625f, -0.9375f, 0, -0.5625f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.9375f, -0.75f, -0.5f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 200, 12, textureX, textureY)
				.addShapeBox(0, -0.875f, 5.75f, 1, 2, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.9375f, -0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 10, textureX, textureY)
				.addShapeBox(0, -0.875f, 6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 183, 9, textureX, textureY)
				.addShapeBox(0, -1, 6, 1, 1, 1, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 233, 8, textureX, textureY)
				.addShapeBox(0, 0.625f, 6, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.9375f, -0.75f, -0.25f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 8, 8, textureX, textureY)
				.addShapeBox(0, -0.625f, 6.75f, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.9375f, 0.25f, -0.75f)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 8, textureX, textureY)
				.addShapeBox(0, 0, 6, 1, 1, 1, 0, -0.9375f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.9375f, -0.625f, 0, -0.9375f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.375f, 0, -0.9375f, -0.375f, 0)
				.setRotationPoint(0.5f, -41.75f, 0).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 183, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(-2, -36.25f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
				.setRotationPoint(-2, -36.5f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 234, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, -1.25f, 0, 0, -1.25f, 0, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
				.setRotationPoint(-2, -36.625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 93, 9, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.8125f, 3, new Vec3f(-0.75, 0.0, 0.0))
				.setRotationPoint(2.625f, -34.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 84, 9, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.8125f, 0.625f, 3, new Vec3f(-0.75, 0.0, 0.0))
				.setRotationPoint(2.875f, -34.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 69, 9, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.625f, 0.375f, 3, new Vec3f(-0.875, 0.0, 0.0))
				.setRotationPoint(3.125f, -34.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 183, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.875f, -0.375f, -0.375f)
				.setRotationPoint(2.5f, -34.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 177, 34, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(2, 1.0E-9f).setLength(1).setSegments(10, 4).setScale(0.9375f, 0.9375f).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.9375, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(2.5625f, -34.25f, 0).setRotationAngle(-108, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 166, 34, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(2, 1.0E-9f).setLength(1).setSegments(10, 4).setScale(0.9375f, 0.875f).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(2.625f, -34.25f, 0).setRotationAngle(-108, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 233, 33, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(2, 1.0E-9f).setLength(1).setSegments(10, 4).setScale(0.875f, 0.6875f).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(2.875f, -34.25f, 0).setRotationAngle(-108, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 200, 33, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(2, 1.0E-9f).setLength(1).setSegments(10, 4).setScale(0.6875f, 0.375f).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.8125, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(3.125f, -34.25f, 0).setRotationAngle(-108, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 155, 33, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(2, 1.0E-9f).setLength(1).setSegments(10, 4).setScale(0.92f, 0.9375f).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.9375, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(2.5f, -34.25f, 0).setRotationAngle(-108, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 172, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
				.setRotationPoint(1.5625f, -36.5f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
				.setRotationPoint(1.5625f, -36.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 117, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
				.setRotationPoint(-2.0625f, -36.5f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 106, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
				.setRotationPoint(-2.0625f, -36.5f, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 221, 3, textureX, textureY)
				.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.1875f, -0.25f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.1875f, -0.25f, -0.25f)
				.setRotationPoint(-2.875f, -34, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		FVTMFormatBase.TurboList Signal = new FVTMFormatBase.TurboList("Signal");
		Signal.add(new ModelRendererTurbo(Signal, 150, 6, textureX, textureY).addCylinder(3.8125f, 8, 0, 1, 1, 8, 0.4375f, 0.6875f, 2, new Vec3f(0.9375, 0.0, 0.0))
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 73, 3, textureX, textureY)
				.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 201, 25, textureX, textureY).addCylinder(2.5312f, 8, 0, 3, 1, 12, 1, 1, 2, new Vec3f(0.9375, 0.0, 0.0))
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 251, 5, textureX, textureY)
				.addShapeBox(0, -0.8125f, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 51, 3, textureX, textureY)
				.addShapeBox(1.3125f, 2.5f, -0.5f, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 40, 3, textureX, textureY)
				.addShapeBox(0, 2.1875f, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.6092f, -0.2812f, -0.3125f, -0.125f, -0.5625f, -0.3125f, -0.125f, -0.5627f, -0.3125f, -0.6095f, -0.2812f, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 18, 3, textureX, textureY)
				.addShapeBox(0.3125f, 2.5f, -0.5f, 1, 1, 1, 0, -0.5625f, -0.125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, -0.2964f, -0.5933f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.2969f, -0.5933f, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 9, 3, textureX, textureY)
				.addShapeBox(3, 2.8125f, -0.5f, 1, 1, 1, 0, -0.125f, -0.5625f, -0.3125f, -0.6092f, -0.2812f, -0.3125f, -0.6095f, -0.2812f, -0.3125f, -0.125f, -0.5627f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 0, 3, textureX, textureY)
				.addShapeBox(2.6875f, 2.5f, -0.5f, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.2964f, -0.5933f, -0.3125f, -0.2969f, -0.5933f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, -0.5625f, -0.125f, -0.3125f, 0, -0.3125f, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 243, 5, textureX, textureY)
				.addShapeBox(3, 3.8125f, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f, -0.3125f, 0.3125f, -0.3125f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 188, 19, textureX, textureY).newCylinderBuilder()
				.setPosition(2.5938f, 8, 0).setRadius(3, 2.6875f).setLength(1).setSegments(12, 0).setScale(1, 1).setDirection(2)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(0.9375, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 251, 0, textureX, textureY).addCylinder(2.5f, 8, 0, 1, 2, 8, 1, 1, 2, null)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 175, 19, textureX, textureY).newCylinderBuilder()
				.setPosition(2.4688f, 8, 0).setRadius(3, 2.6875f).setLength(1).setSegments(12, 0).setScale(1, 1).setDirection(2)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(0.9375, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 198, 0, textureX, textureY).addCylinder(3.625f, 8, 0, 1, 1, 8, 0.875f, 0.9375f, 2, new Vec3f(0.875, 0.0, 0.0))
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 172, 0, textureX, textureY).addCylinder(3.75f, 8, 0, 1, 1, 8, 0.6875f, 0.875f, 2, new Vec3f(0.875, 0.0, 0.0))
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 139, 0, textureX, textureY).addCylinder(1.5f, 8, 0, 1, 1, 8, 0.9375f, 0.875f, 2, new Vec3f(0.875, 0.0, 0.0))
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 117, 0, textureX, textureY).addCylinder(1.625f, 8, 0, 1, 1, 8, 0.875f, 0.6875f, 2, new Vec3f(0.875, 0.0, 0.0))
				.setRotationPoint(-3.75f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 106, 0, textureX, textureY).addCylinder(1.6875f, 8, 0, 1, 1, 8, 0.6875f, 0.4375f, 2, new Vec3f(0.9375, 0.0, 0.0))
				.setRotationPoint(-3.9375f, -34, 0).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		Signal.add(new ModelRendererTurbo(Signal, 84, 0, textureX, textureY)
				.addShapeBox(2.9688f, 5.3125f, -0.5f, 1, 5, 1, 0, -0.4531f, 0, 0, -0.3907f, 0, 0, -0.3907f, 0, 0, -0.4531f, 0, 0, -0.4531f, 0.375f, 0, -0.3907f, 0.375f, 0, -0.3907f, 0.375f, 0, -0.4531f, 0.375f, 0)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 243, 5, textureX, textureY)
				.addShapeBox(2.9688f, 7.5f, -2.3125f, 1, 1, 5, 0, -0.4531f, 0, 0.375f, -0.3907f, 0, 0.375f, -0.3907f, 0, 0, -0.4531f, 0, 0, -0.4531f, 0, 0.375f, -0.3907f, 0, 0.375f, -0.3907f, 0, 0, -0.4531f, 0, 0)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 73, 0, textureX, textureY)
				.addShapeBox(0, -0.5f, -0.25f, 1, 1, 1, 0, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 51, 0, textureX, textureY)
				.addShapeBox(0, -0.5f, -1.125f, 1, 1, 1, 0, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 40, 0, textureX, textureY)
				.addShapeBox(-0.0625f, -0.4375f, -0.3125f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 18, 0, textureX, textureY)
				.addShapeBox(-0.0625f, 0.3125f, -0.3125f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 9, 0, textureX, textureY)
				.addShapeBox(-0.0625f, -0.4375f, -1.1875f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		Signal.add(new ModelRendererTurbo(Signal, 0, 0, textureX, textureY)
				.addShapeBox(-0.0625f, 0.3125f, -1.1875f, 1, 1, 1, 0, -0.4375f, 0, -0.6875f, -0.3125f, 0, -0.6875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.6875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f)
				.setRotationPoint(-3.5f, -34, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Signal);
		//
	}

}
