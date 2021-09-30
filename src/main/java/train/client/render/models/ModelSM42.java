//FMT-Marker TiM-1.0
package train.client.render.models;

//import fexcraft.fvtm.RollingStockModel;
//import fexcraft.fvtm.TurboList;
//import fexcraft.tmt.slim.ModelRendererTurbo;
//import fexcraft.tmt.slim.Vec3f;
/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
/*public class ModelSM42 extends ModelConverter {

	public ModelSM42(){
		int textureX = 512;
		int textureY = 512;
		//super(); textureX = 512; textureY = 512;
		//this.addToCreators("OfflineUser");
		//
		bodyModel = new ModelRendererTurbo[];//("bodyModel");

		bodyModel.add(new ModelRendererTurbo(this, 1, 1, textureX, textureY).addBox(0, 0, 0, 63, 3, 22)
			.setRotationPoint(-33, -1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 1, textureX, textureY).addBox(0, 0, 0, 17, 3, 22)
			.setRotationPoint(33, -1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 1, textureX, textureY).addBox(0, 0, 0, 3, 3, 20)
			.setRotationPoint(51, 2, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(49, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 1, textureX, textureY).addBox(0, 0, 0, 3, 3, 20)
			.setRotationPoint(-37, 2, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(33, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(28, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(30, 0, -10).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 3, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 4, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 10, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -17, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, -0.5f, 0, 0, 0, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52, -17, -5).setRotationAngle(0, -180, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -17, 5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 1, textureX, textureY).addBox(0, 0, 0, 2, 14, 10)
			.setRotationPoint(-35, -15, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52, -17, -7).setRotationAngle(0, -90, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, -0.5f, -0.5f, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52, -17, 5).setRotationAngle(0, -90, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f)
			.setRotationPoint(50, -17, 5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50, -15, 5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -17, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 1, textureX, textureY).addBox(0, 0, 0, 7, 14, 1)
			.setRotationPoint(-33, -15, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 1, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(-26, -3, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 33, textureX, textureY).addBox(0, 0, 0, 27, 12, 1)
			.setRotationPoint(-15, -13, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-21, -13, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 33, textureX, textureY).addBox(0, 0, 0, 46, 2, 1)
			.setRotationPoint(-26, -15, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 41, textureX, textureY).addBox(0, 0, 0, 53, 14, 12)
			.setRotationPoint(-33, -15, -6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 33, textureX, textureY).addBox(0, 0, 0, 7, 14, 1)
			.setRotationPoint(-33, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 9, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(-26, -3, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 41, textureX, textureY).addBox(0, 0, 0, 27, 12, 1)
			.setRotationPoint(-15, -13, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-21, -13, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 41, textureX, textureY).addBox(0, 0, 0, 46, 2, 1)
			.setRotationPoint(-26, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -17, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-35, -17, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.15f, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-33.15f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35, -17, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-35, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-35.15f, -17, -0.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35.15f, -17, -1.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35.15f, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-35.15f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0)
			.setRotationPoint(55, -1, 7).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-39.6f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-38.25f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-38.25f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.6f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.6f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-39.6f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-39.75f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.75f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.75f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-39.75f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-38.25f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-38.25f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0)
			.setRotationPoint(55, -1, -11).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39.45f, -2.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-39.55f, -5, 8.5f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-39.6f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-38.25f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-38.25f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.6f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.6f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-39.6f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-39.75f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.75f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.75f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-39.75f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-38.25f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-38.25f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39.45f, -2.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-39.55f, -5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-35.1f, -14.8f, -3).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-35.1f, -14.3f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-35.1f, -13.8f, -2).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f)
			.setRotationPoint(-35.2f, -14.8f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 33, textureX, textureY).addBox(0, 0, 0, 1, 7, 20)
			.setRotationPoint(20, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(19.25f, -13, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(19.25f, -13, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 33, textureX, textureY).addBox(0, 0, 0, 4, 3, 20)
			.setRotationPoint(-37, -1, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, 4, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(-38, -1, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 49, textureX, textureY).addBox(0, 0, 0, 4, 3, 20)
			.setRotationPoint(50, -1, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, 4, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(55, -1, -7).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(-38, -1, 9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 41, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-38, -1, -9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 41, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-38, 2, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 49, textureX, textureY).addBox(0, 0, 0, 14, 14, 12)
			.setRotationPoint(36, -15, -6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(35, -17, 5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(35, -17, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 10, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, -17, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, -0.5f, -0.5f, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -17, 7).setRotationAngle(0, -180, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f)
			.setRotationPoint(-33, -17, 5).setRotationAngle(0, -90, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, -0.5f, 0, 0, 0, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-33, -17, -7).setRotationAngle(0, -90, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, -17, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 57, textureX, textureY).addBox(0, 0, 0, 2, 14, 10)
			.setRotationPoint(50, -15, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-35, -15, 5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 57, textureX, textureY).addBox(0, 0, 0, 2, 14, 1)
			.setRotationPoint(36, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 57, textureX, textureY).addBox(0, 0, 0, 5, 14, 1)
			.setRotationPoint(45, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 49, textureX, textureY).addBox(0, 0, 0, 7, 7, 1)
			.setRotationPoint(38, -8, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 17, textureX, textureY).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(38, -15, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 65, textureX, textureY).addBox(0, 0, 0, 2, 14, 1)
			.setRotationPoint(36, -15, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 65, textureX, textureY).addBox(0, 0, 0, 5, 14, 1)
			.setRotationPoint(45, -15, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 49, textureX, textureY).addBox(0, 0, 0, 7, 7, 1)
			.setRotationPoint(38, -8, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 49, textureX, textureY).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(38, -15, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(35, -17, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -16, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 73, textureX, textureY).addBox(0, 0, 0, 17, 4, 6)
			.setRotationPoint(4, -21, -3).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 7, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -21, -3.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -16, -7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, -1.25f, 0, 0.25f, -1.25f, 0, 0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20, -18, -7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(20, -16.75f, -9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0.05f, 0, -1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(20, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.075f, -1.75f, -0.25f, 0.075f, -1.75f, -0.25f, 0.2f, 0, 0, -0.2f, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -22, -8.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20, -16, -8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, -0.5f, 0, -1.2f, -0.5f)
			.setRotationPoint(20, -15.25f, -9).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -13, -8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20, -13, -9).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, -0.125f, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(21, -21.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1125f, -1.175f, -0.5f, -0.1125f, -1.175f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1125f, 0.175f, -0.5f, -0.1125f, 0.175f, -0.5f, -0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(20.5f, -19, -4.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -22, -3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -16, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.4f, 0, -0.5f, 0.4f, 0, -0.5f, 0.25f, -1.25f, 0, -0.25f, -1.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -18, 3).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20, -16.75f, 7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0.05f, 0, 1, 0.05f, 0, 1, 0, -0.75f, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.075f, -1.75f, -0.25f, -0.075f, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(21, -22, 3.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f)
			.setRotationPoint(20, -16, 7).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.2f, -0.5f, 0, -1.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20, -15.25f, 8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20, -13, 7).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, -13, 8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0.125f, 0, 0, -0.125f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(21, -21.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1125f, -1.175f, -0.5f, 0.1125f, -1.175f, -0.5f, 0.1f, 0, 0, -0.1f, 0, 0, -0.1125f, 0.175f, -0.5f, 0.1125f, 0.175f, -0.5f)
			.setRotationPoint(20.5f, -19, 3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f, -0.135f, -0.5f, 0.1f, 0.135f, -0.5f, 0.1f)
			.setRotationPoint(21, -20, 7.25f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0.135f, -0.5f, 0.1f, -0.135f, -0.5f, 0.1f, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f)
			.setRotationPoint(21, -20, -8.25f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 73, textureX, textureY).addBox(0, 0, 0, 16, 4, 20)
			.setRotationPoint(20, -5, -10).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 57, textureX, textureY).addBox(0, 0, 0, 1, 7, 20)
			.setRotationPoint(35, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -16, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -16, -7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -13, -8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35, -13, -9).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35, -13, 7).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -13, 8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -16, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 7, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -21, -3.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.25f, -1.25f, 0, -0.25f, -1.25f, 0, -0.4f, 0, -0.5f, 0.4f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35, -18, -7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(35, -16.75f, -9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(35, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.075f, -1.75f, -0.25f, -0.075f, -1.75f, -0.25f, -0.2f, 0, 0, 0.2f, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -22, -8.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34, -21.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1125f, -1.175f, -0.5f, 0.1125f, -1.175f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.1125f, 0.175f, -0.5f, 0.1125f, 0.175f, -0.5f, 0.1f, 0, 0, -0.1f, 0, 0)
			.setRotationPoint(34.5f, -19, -4.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -22, -3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.25f, -1.25f, 0, 0.25f, -1.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -18, 3).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(35, -16.75f, 7).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.075f, -1.75f, -0.25f, 0.075f, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(34, -22, 3.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.6f, -0.5f, 0, -0.6f, -0.5f, -0.125f, 0, 0, 0.125f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(34, -21.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.1125f, -1.175f, -0.5f, -0.1125f, -1.175f, -0.5f, -0.1f, 0, 0, 0.1f, 0, 0, 0.1125f, 0.175f, -0.5f, -0.1125f, 0.175f, -0.5f)
			.setRotationPoint(34.5f, -19, 3.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f, 0.135f, -0.5f, 0.1f, -0.135f, -0.5f, 0.1f)
			.setRotationPoint(34, -20, 7.25f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.15f, -0.5f, 0, 0.15f, -0.5f, -0.135f, -0.5f, 0.1f, 0.135f, -0.5f, 0.1f, 0, -1.15f, -0.5f, 0, -1.15f, -0.5f)
			.setRotationPoint(34, -20, -8.25f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(17, -22.1f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, -0.7f, 0, -0.9f, -0.7f)
			.setRotationPoint(17, -22.1f, 3.5f).setRotationAngle(-21, 0, 0).setName("Box 166")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 81, textureX, textureY)
			.addShapeBox(0, 0, -6, 22, 1, 6, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.7f, 0, -0.9f, -0.7f, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(17, -22.1f, -3.5f).setRotationAngle(21, 0, 0).setName("Box 166")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, -2, 0, 0, 0, 0, 0, 0, 0, -0.9f, -2, 0, -0.9f)
			.setRotationPoint(17, -20.18f, -8.5f).setRotationAngle(-11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
			.setRotationPoint(21, -20.18f, -8.5f).setRotationAngle(-11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -2, 0, 0, -2, 0, -0.9f, 0, 0, -0.9f)
			.setRotationPoint(35, -20.18f, -8.5f).setRotationAngle(-11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, -2, 0, 0, 0, 0, 0, 0, 0, -0.9f, -2, 0, -0.9f)
			.setRotationPoint(17, -20.15f, 8.41f).setRotationAngle(11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
			.setRotationPoint(21, -20.15f, 8.41f).setRotationAngle(11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -2, 0, 0, -2, 0, -0.9f, 0, 0, -0.9f)
			.setRotationPoint(35, -20.15f, 8.41f).setRotationAngle(11, 0, 0).setName("Box 170")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(2, -20, -3).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, -21, -3).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(30.5f, -3, -11).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -1, -0.8f, 0, -1, -0.8f, 0, -1, 0, 0, -1)
			.setRotationPoint(30.5f, -2.8f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -1, -0.8f, 0, -1, -0.8f, 0, -1, 0, 0, -1)
			.setRotationPoint(33.3f, -2.8f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0.05f, 0, -1, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.5f, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 0.5f, 0.05f, 0, 0.5f, 0, -0.375f, -1, 0, -0.375f, -1, 0, -0.375f, 0.5f, 0, -0.375f)
			.setRotationPoint(29, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -1, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.05f, 0, -1, 0.05f, 0, -0.5f, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -0.5f, 0, -0.375f)
			.setRotationPoint(22, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -1, 0, -0.75f, -1, 0.05f, 0, 0, 0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34, -20, -9.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34, -16, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(33.75f, -18, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(30, -18, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(33.75f, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(30, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21, -12, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, -0.75f, 1, 0, -0.75f, 1, 0, 0, -1, 0, 0, -1, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -1, 0, -0.375f)
			.setRotationPoint(20, -16, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21, -14, -10).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(35, -16, -8).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.185f, -0.5f, 0, -0.185f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f)
			.setRotationPoint(35, -16, 7).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 89, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(54, -1, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 89, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(54, -1, 9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 89, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(54, -1, -9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 89, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(54, 2, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 89, textureX, textureY)
			.addShapeBox(-3.5f, 0, -0.25f, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.75f, -14, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 73, textureX, textureY)
			.addShapeBox(-3.5f, 0, -0.25f, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -18, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 73, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.25f, 1, 4, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -17.5f, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 81, textureX, textureY)
			.addShapeBox(-3.5f, 0, -0.25f, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -17.5f, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 73, textureX, textureY)
			.addShapeBox(-1.25f, 0, -0.25f, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(33.75f, -18, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 81, textureX, textureY)
			.addShapeBox(-3.25f, 0, -0.25f, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.75f, -18, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 81, textureX, textureY)
			.addShapeBox(-1.25f, 0, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -14.5f, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 81, textureX, textureY)
			.addShapeBox(-3.25f, 0, -0.25f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -14.5f, -8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 81, textureX, textureY)
			.addShapeBox(-3, 1, -0.65f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(33.75f, -14, -8.65f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 89, textureX, textureY)
			.addShapeBox(-2.75f, 1, -0.65f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(33.75f, -14, -8.65f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 89, textureX, textureY)
			.addShapeBox(-2.75f, 1, 0.22f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(33.75f, -14, -8.65f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(33, 2, 9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(28, 2, 9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 89, textureX, textureY)
			.addShapeBox(-1, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(31, 0, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 3, 10).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 4, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16.5f, -23, -1.5f).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0.05f, 0, 1, 0.05f, 0, 1, 0, -0.75f, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.5f, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.375f, -1, 0, -0.375f, -1, 0, -0.375f, 0.5f, 0, -0.375f)
			.setRotationPoint(29, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -1, 0.05f, 0, 0.5f, 0.05f, 0, 0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -0.5f, 0, -0.375f)
			.setRotationPoint(22, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0.05f, 0, -1, 0.05f, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -20, 8.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -16, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -12, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.75f, -18, 8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -18, 8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.75f, -12, 8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -12, 8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -12, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, -0.75f, -1, 0, -0.75f, -1, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, 0, -0.375f, -1, 0, -0.375f)
			.setRotationPoint(20, -16, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, 9).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 97, textureX, textureY)
			.addShapeBox(-3.5f, 0, 0, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.75f, -14, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 97, textureX, textureY)
			.addShapeBox(-3.5f, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -18, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 89, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -17.5f, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 97, textureX, textureY)
			.addShapeBox(-3.5f, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -17.5f, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 89, textureX, textureY)
			.addShapeBox(-1.25f, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(33.75f, -18, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 97, textureX, textureY)
			.addShapeBox(-3.25f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.75f, -18, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 97, textureX, textureY)
			.addShapeBox(-1.25f, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -14.5f, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 97, textureX, textureY)
			.addShapeBox(-3.25f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.75f, -14.5f, 8.65f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 97, textureX, textureY)
			.addShapeBox(-3, 1, -0.4f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(33.75f, -14, 8.65f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 97, textureX, textureY)
			.addShapeBox(-2.75f, 1, -0.4f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(33.75f, -14, 8.65f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 97, textureX, textureY)
			.addShapeBox(-2.75f, 1, 0.48f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(33.75f, -14, 8.64f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.1f, -14.8f, -3).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.1f, -14.3f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.1f, -13.8f, -2).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f)
			.setRotationPoint(51.2f, -14.8f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0)
			.setRotationPoint(-40, -1, 7).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0)
			.setRotationPoint(-40, -1, -11).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-40, -1, -7).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 97, textureX, textureY).addBox(0, 0, 0, 5, 7, 9)
			.setRotationPoint(21, -12, -4.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -15, -4.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 97, textureX, textureY).addBox(0, 0, 0, 1, 3, 2)
			.setRotationPoint(22, -21, -1).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9f, 0, 0, 1, 0, 0, 1, -0.75f, 0, -0.9f, -0.75f, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(20, -17, -1.2f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9f, 0, 0, 1, 0, 0, 1, -0.75f, 0, -0.9f, -0.75f, 0, 0, 0, 0, -1.9f, 0, 0, -1.9f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(20, -17, 0.9f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(25.75f, -11, 2).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, 0, 0, -0.3f)
			.setRotationPoint(26.75f, -10.4f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, 0, 0, -0.3f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(26.75f, -10.4f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, 0, -0.5f, -0.3f, 0, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, 0, -0.2f, -0.3f)
			.setRotationPoint(26.75f, -9.9f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(21.55f, -14.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4f, 0, -0.9f, -0.5f, 0, -0.9f, -0.5f, -0.75f, 0, -0.4f, -0.75f)
			.setRotationPoint(22, -21.5f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4f, 0, -0.9f, -0.5f, 0, -0.9f, -0.5f, -0.75f, 0, -0.4f, -0.75f)
			.setRotationPoint(22, -21.5f, 0.9f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(24.75f, -10, -9.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(29.75f, -13.75f, -9.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(24.75f, -10.25f, -9.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f)
			.setRotationPoint(29.5f, -13.75f, -9.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(21.55f, -14.75f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(21.55f, -14.75f, -2).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(21.55f, -14.75f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 2.95f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 3.05f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 3.15f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.925f, 0, 0, -0.925f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.925f, 0, -0.5f, -0.925f)
			.setRotationPoint(26.8f, -10.2f, 3.45f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, -0.75f, -0.5f, -0.3f, 0, -0.5f, -0.3f, 0, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, -0.75f, -0.2f, -0.3f, 0, -0.2f, -0.3f)
			.setRotationPoint(26.7f, -10.8f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -3, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -3.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -4, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -4.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -5, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -5.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -6, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -6.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 105, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -7, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -7.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -8, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -8.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -9, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -9.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -10, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -10.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -11, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -11.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -12, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 113, textureX, textureY).addBox(0, 0, 0, 11, 0, 1)
			.setRotationPoint(-26, -12.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -3, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -3.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -4, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -4.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -5, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -5.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -6, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 113, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -6.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -7, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -7.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -8, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -8.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -9, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -9.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -10, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -10.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -11, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -11.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -12, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 121, textureX, textureY).addBox(0, 0, -1, 11, 0, 1)
			.setRotationPoint(-26, -12.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(15.5f, -13, -7).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 33, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(12.13f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 49, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(12.63f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 73, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(13.13f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 105, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(13.63f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 105, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(14.13f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 113, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(14.63f, -13, 6).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(18.63f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(18.13f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(17.63f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(17.13f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 329, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(16.63f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(16.13f, -13, 6.75f).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(16.13f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(16.63f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(17.13f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(17.63f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(18.13f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 121, textureX, textureY)
			.addBox(0, 0, 0, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(18.63f, -13, -6.75f).setRotationAngle(0, 45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(14.63f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(14.13f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(13.63f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(13.13f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(12.63f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 121, textureX, textureY)
			.addBox(0, 0, -1, 0, 12, 1, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(12.13f, -13, -6).setRotationAngle(0, -45, 0).setName("Box 332")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 9, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -8, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 41, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -8.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 57, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -9, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 81, 105, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -9.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 121, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -10, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 121, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -10.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 129, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -11, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 129, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -11.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 129, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -12, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 129, textureX, textureY).addBox(0, 0, -1, 7, 0, 1)
			.setRotationPoint(38, -12.5f, 6.85f).setRotationAngle(-45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 65, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -8, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 81, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -8.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -9, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -9.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -10, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -10.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -11, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -11.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -12, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 129, textureX, textureY).addBox(0, 0, 0, 7, 0, 1)
			.setRotationPoint(38, -12.5f, -6.87f).setRotationAngle(45, 0, 0).setName("Box 272")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, -1, 0, 0, -1, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.75f, 5, -9.5f).setRotationAngle(0, -2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.75f, 0, -1.25f, -1.25f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-36.75f, 7, -8.5f).setRotationAngle(0, -2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 129, textureX, textureY)
			.addShapeBox(0, 0, -7, 1, 2, 7, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, -1, -0.75f, 0, -1)
			.setRotationPoint(-36.75f, 5, 9.5f).setRotationAngle(0, 2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 129, textureX, textureY)
			.addShapeBox(0, 0, -7, 1, 1, 6, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, 0, 0, -1.25f, 0, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f)
			.setRotationPoint(-36.75f, 7, 9.5f).setRotationAngle(0, 2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, -1, -0.75f, 0, -1, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(52.75f, 5, -9.5f).setRotationAngle(0, 2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f, 0.5f, 0, 0, -1.25f, 0, 0)
			.setRotationPoint(52.75f, 7, -8.5f).setRotationAngle(0, 2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 137, textureX, textureY)
			.addShapeBox(0, 0, -7, 1, 2, 7, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, -1, 0, 0, -1)
			.setRotationPoint(52.75f, 5, 9.5f).setRotationAngle(0, -2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 137, textureX, textureY)
			.addShapeBox(0, 0, -7, 1, 1, 6, 0, -0.75f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -1.25f, -0.75f, 0, -1.25f)
			.setRotationPoint(52.75f, 7, 9.5f).setRotationAngle(0, -2, 0).setName("Box 382")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 201, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 0, 4).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 0, -7).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 105, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(-40.75f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 105, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(-40.75f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 0, 4).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 105, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(54.75f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 0, -7).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 129, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(54.75f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f)
			.setRotationPoint(50, -17, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0)
			.setRotationPoint(49.15f, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f)
			.setRotationPoint(49.15f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.15f, 0, -0.5f)
			.setRotationPoint(50, -17, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.15f, -0.375f, -0.375f, -0.15f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.15f, -0.5f, 0)
			.setRotationPoint(50, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.15f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.15f, -0.5f, -0.5f)
			.setRotationPoint(50, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f)
			.setRotationPoint(51.15f, -17, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f)
			.setRotationPoint(51.15f, -17, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0)
			.setRotationPoint(51.15f, -18, -0.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f)
			.setRotationPoint(51.15f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(-39, -0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 137, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(-42, -0.5f, -1).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(55, -0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 137, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(56, -0.5f, -1).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f)
			.setRotationPoint(54.6f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f)
			.setRotationPoint(54.25f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(54.25f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f)
			.setRotationPoint(54.6f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 201, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0)
			.setRotationPoint(54.6f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f)
			.setRotationPoint(54.6f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f)
			.setRotationPoint(55.75f, -3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f)
			.setRotationPoint(55.75f, -3, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0)
			.setRotationPoint(55.75f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f)
			.setRotationPoint(55.75f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0)
			.setRotationPoint(54.25f, -4, 8.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f)
			.setRotationPoint(54.25f, -4, 7.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(55.45f, -2.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(55.45f, -5, 8.5f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f)
			.setRotationPoint(54.6f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f)
			.setRotationPoint(54.25f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(54.25f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f)
			.setRotationPoint(54.6f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.65f, -0.375f, -0.375f, -0.65f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.65f, -0.5f, 0)
			.setRotationPoint(54.6f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.65f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.65f, 0, -0.5f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.65f, -0.5f, -0.5f)
			.setRotationPoint(54.6f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f)
			.setRotationPoint(55.75f, -3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f)
			.setRotationPoint(55.75f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.85f, -0.375f, -0.375f, -0.85f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.85f, -0.5f, 0)
			.setRotationPoint(55.75f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.85f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.85f, -0.5f, -0.5f)
			.setRotationPoint(55.75f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.8f, -0.375f, -0.375f, -0.3f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8f, -0.5f, 0)
			.setRotationPoint(54.25f, -4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.8f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f)
			.setRotationPoint(54.25f, -4, -10.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(55.45f, -2.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(55.45f, -5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(21.35f, -14.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(21.35f, -14.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.1f, -0.125f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.35f, -14.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0.1f, -0.125f, -0.125f, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(21.35f, -14.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(21.35f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.1f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(21.35f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.1f, -0.125f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.35f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0.1f, -0.125f, -0.125f, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(21.35f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.4f, -14.5f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.4f, -14.5f, 2.35f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.4f, -14.5f, 2.95f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.4f, -14.5f, 3.55f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.6f, -13.75f, 2.05f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 65, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.6f, -13.75f, 2.65f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(21.6f, -13.75f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 2.75f, -1, -0.5f, 2.75f, -1, -0.5f, 0, 0, 0, 0, 0, 0, -3.5f, -1, -0.5f, -3.5f, -1)
			.setRotationPoint(28.75f, -7, -9.75f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 2.75f, -1, -0.5f, 2.75f, -1, -0.5f, 0, 0, 0, 0, 0, 0, -3.5f, -1, -0.5f, -3.5f, -1)
			.setRotationPoint(24.75f, -7, -9.75f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(24.75f, -10, 4.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(29.75f, -13.75f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(24.75f, -10.25f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, -0.25f)
			.setRotationPoint(29.5f, -13.75f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 2.75f, -1, 0, 2.75f, -1, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -3.5f, -1, 0, -3.5f, -1, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(28.75f, -7, 3.75f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 2.75f, -1, 0, 2.75f, -1, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -3.5f, -1, 0, -3.5f, -1, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(24.75f, -7, 3.75f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(21, -14, 5.25f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(29, -22, -2).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 201, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.875f)
			.setRotationPoint(29, -22, 0).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(31, -22, -2).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.5f)
			.setRotationPoint(31, -22, 0).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 17, 145, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(26, -22, -1).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -17, -5).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-21, -16.75f, 0).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-23, -16.75f, 0).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, -16.75f, -2).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -16.75f, -2).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, -17, 4).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -17, 1).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, -17, 3).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-26, -17, -5).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 145, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-26, -17, -4).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -17, 4).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -17, 1).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-18, -17, -5).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 145, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-17, -17, -4).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -17, 3).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-20, -17, -5).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-17, -17, -3).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-18, -17, -4).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-24, -17, -5).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -17, -3).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-25, -17, -4).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 489, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-26, -17, 4).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-18, -17, 4).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 145, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-26, -17, 3).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 153, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-17, -17, 3).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 9, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -247.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 65, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -67.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -157.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, 22.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -202.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -22.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -112.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, 67.5f, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -225, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -45, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -135, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, 45, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -180, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, 0, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 201, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, -90, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 153, textureX, textureY).addBox(0, 0, -0.5f, 5, 0, 1)
			.setRotationPoint(-21, -16, 0).setRotationAngle(20, 90, 0).setName("Box 500")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 329, 153, textureX, textureY)
			.addShapeBox(-5, 0, -1.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 153, textureX, textureY)
			.addShapeBox(-5, 0, -0.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 153, textureX, textureY)
			.addShapeBox(-5, 0, 0.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 153, textureX, textureY)
			.addShapeBox(-5, 0, 1, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 153, textureX, textureY)
			.addShapeBox(-5, 0, 1.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 153, textureX, textureY)
			.addShapeBox(-5, 0, 2.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 153, textureX, textureY)
			.addShapeBox(-5, 0, 3.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 161, textureX, textureY)
			.addShapeBox(-5, 0, 4, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 161, textureX, textureY)
			.addShapeBox(-5, 0, -4.25f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 161, textureX, textureY)
			.addShapeBox(-5, 0, -3.5f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 161, textureX, textureY)
			.addShapeBox(-5, 0, -2.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 161, textureX, textureY)
			.addShapeBox(-5, 0, -2, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(17, -11, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-32.25f, -11.25f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(7.8f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-32.25f, -5, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-38, -11, 6.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-38, -6, -11.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-38, -11, -12).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 329, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-38, -11.25f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(19.75f, -21.65f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -21.65f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f)
			.setRotationPoint(18.75f, -21.4f, -4).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f)
			.setRotationPoint(19.75f, -21.65f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(19.75f, -21.65f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0)
			.setRotationPoint(19.75f, -21.65f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0)
			.setRotationPoint(18.75f, -21.9f, -4).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(18.75f, -21.4f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f)
			.setRotationPoint(18.75f, -21.9f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(19.75f, -21.65f, 3.2f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -21.65f, 3.2f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f)
			.setRotationPoint(18.75f, -21.4f, 3.45f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f)
			.setRotationPoint(19.75f, -21.65f, 3.2f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.25f, -0.25f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(19.75f, -21.65f, 3.2f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 457, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, 0)
			.setRotationPoint(19.75f, -21.65f, 3.2f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.375f, -0.625f, -0.1875f, -0.1875f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, 0)
			.setRotationPoint(18.75f, -21.9f, 3.45f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(18.75f, -21.4f, 2.95f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, -0.1875f, 0, -0.375f, -0.375f, 0, -0.25f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f)
			.setRotationPoint(18.75f, -21.9f, 2.95f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 169, textureX, textureY)
			.addShapeBox(-5, 0, -5, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 169, textureX, textureY)
			.addShapeBox(-5, 0, 4.75f, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21, -16.95f, 0).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 481, 161, textureX, textureY)
			.addShapeBox(-2.5f, 0, -2.5f, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30, -5.25f, -1).setRotationAngle(0, 31, 0).setName("Box 570")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-38, -11, -7.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-38, -5, -6.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-38, -6, 10.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f)
			.setRotationPoint(-38, -11, 7).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 65, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -11, 6.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(54, -6, -11.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(54, -11, -12).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(54, -11.25f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 81, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -11, -7.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(54, -5, -6.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(54, -6, 10.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 49, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -5, -1.75f, -0.25f, -5, -1.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 4.5f, -1.75f, -0.25f, 4.5f, -1.75f)
			.setRotationPoint(54, -11, 7).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 97, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-33, -11, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 105, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-22.8f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 113, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-12.6f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 121, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-2.4f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 129, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(17, -11, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-32.25f, -11.25f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 241, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(7.8f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-32.25f, -5, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 249, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-33, -11, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 257, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-22.8f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-12.6f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-2.4f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 281, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(38, -11, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 289, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(49, -11, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(38.75f, -11.25f, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(38.75f, -5, 10).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 321, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(38, -11, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 465, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(49, -11, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 473, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(38.75f, -11.25f, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(38.75f, -5, -11).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 497, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(21, -10.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 505, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(20.75f, -12, 5.25f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 25, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f)
			.setRotationPoint(20.75f, -12, 5.75f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 33, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(21.25f, -12, 5.25f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 41, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.375f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.375f, -0.5f, -0.375f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(21.25f, -12, 5.75f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f)
			.setRotationPoint(21, -12, 6.12f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 73, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(21, -8.87f, 5.75f).setRotationAngle(90, 0, 0).setName("Box 559")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 89, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(23, -14, 8.37f).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 137, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
			.setRotationPoint(23, -14.3f, 8.17f).setRotationAngle(0, 0, 6).setName("Box 574")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 145, 177, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 2, 0, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, -0.75f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0)
			.setRotationPoint(23.47f, -14.05f, 7).setRotationAngle(0, 0, 6).setName("Box 575")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 153, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(24, -13.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 161, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(24, -13.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 169, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(25, -13.75f, 8.35f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 177, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(24, -13.25f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 185, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(24, -13.75f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 193, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(25, -13.75f, -10.1f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 1, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, 3.25f).setRotationAngle(0, -33, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 201, 177, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(21.75f, -16.4f, 3.25f).setRotationAngle(0, -33, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 273, 9, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, 3.25f).setRotationAngle(120, -33, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 9, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, 3.25f).setRotationAngle(240, -33, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 209, 177, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(21.75f, -16, 3.25f).setRotationAngle(0, -33, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 17, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, -3.25f).setRotationAngle(26, 36, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 217, 177, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(21.75f, -16.4f, -3.25f).setRotationAngle(0, 35, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 17, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, -3.25f).setRotationAngle(146, 36, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 17, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.25f, 0, 1, 1, 0, 0.12f, 0, 0, -0.12f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.12f, -0.25f, 0, -0.12f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(21.75f, -15.9f, -3.25f).setRotationAngle(266, 36, 0).setName("Box 598")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 225, 177, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.5f, 1, 1, 1, 0, 0, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(21.75f, -16, -3.25f).setRotationAngle(0, 35, 0).setName("Box 255")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 233, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(21.25f, -16.75f, -8.5f).setRotationAngle(20, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 177, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(21.25f, -16.75f, 8.75f).setRotationAngle(-20, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 305, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(34, -16.75f, -8.5f).setRotationAngle(20, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 177, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(34, -16.75f, 8.75f).setRotationAngle(-20, 0, 0).setName("Box 576")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 49, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(24.5f, -10.5f, 4.55f).setRotationAngle(0, 0, -199).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 329, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0)
			.setRotationPoint(23, -10, -4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 337, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0)
			.setRotationPoint(23, -12, -4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 345, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0)
			.setRotationPoint(24, -12, -4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 353, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0)
			.setRotationPoint(24, -10, -4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 361, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0)
			.setRotationPoint(23, -9, -4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 369, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(24, -9, -4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 377, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(23, -11, -4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 385, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0)
			.setRotationPoint(24, -11, -4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 9, 1, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0)
			.setRotationPoint(24.5f, -10.5f, -4.63f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 265, 1, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0)
			.setRotationPoint(24.5f, -10.5f, -4.63f).setRotationAngle(0, 0, -90).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 393, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0)
			.setRotationPoint(23, -10, 4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 401, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0)
			.setRotationPoint(23, -12, 4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 409, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0)
			.setRotationPoint(24, -12, 4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 417, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0)
			.setRotationPoint(24, -10, 4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 425, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0)
			.setRotationPoint(23, -9, 4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 433, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(24, -9, 4.63f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 441, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(23, -11, 4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 449, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.5f, -1.725f, 0, -0.575f, -1.425f, 0, -0.575f, -1.425f, 0, -0.5f, -1.725f, 0, -0.5f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, 0, 0)
			.setRotationPoint(24, -11, 4.63f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 297, 1, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0)
			.setRotationPoint(24.5f, -10.5f, 4.63f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 313, 1, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 1, 0, 0, -0.02f, 0.75f, 0, 0.15f, -0.25f, 0, 0.15f, -0.25f, 0, -0.02f, 0.75f, 0, 0.15f, -1.25f, 0, -0.02f, -0.25f, 0, -0.02f, -0.25f, 0, 0.15f, -1.25f, 0)
			.setRotationPoint(24.5f, -10.5f, 4.63f).setRotationAngle(0, 0, -90).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 1, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -12, -11).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 14, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -9.75f, -11).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 26, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -7.5f, -11).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 35, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(25, -12, 10).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 46, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(25, -9.75f, 10).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 57, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(25.5f, -7.5f, 10).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 0, 0, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-39.8f, -2.2f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 0, 0, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-39.8f, -2.2f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 0, 6, textureX, textureY)
			.addBox(0, 0, 0, 0, 1, 1, 0, 1f, new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(56.8f, -2.2f, -9.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		bodyModel.add(new ModelRendererTurbo(bodyModel, 0, 6, textureX, textureY)
			.addBox(0, 0, 0, 0, 1, 1, 0, 1f, new boolean[]{ false, true, false, false, true, false })
			.setRotationPoint(56.8f, -2.2f, 8.5f).setRotationAngle(0, 0, 0).setName("Lamp")
		);
		this.groups.add(bodyModel);
		//
	}
	ModelSM42_Bogie bogie = new ModelSM42_Bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : bodyModel){
			if(mrt.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5);
			}
		}


		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/SM42_bogies.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/SM42_bogies.png"));
		}

		GL11.glPushMatrix();
		GL11.glTranslated(-0.725,0,0.11);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.425,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();


	}
}*/
