package train.client.tmt;

import net.minecraft.entity.Entity;

/**
 * Converts flans models to our version of ModelRendererTurbo, which doesn't use the sme animation methods.
 */
public class ModelConverter extends ModelBase {
	
	public ModelRendererTurbo bodyModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo turretModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo barrelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo frontWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo backWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftFrontWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightFrontWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftBackWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightBackWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightTrackModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftTrackModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightTrackWheelModels[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftTrackWheelModels[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo trailerModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo steeringWheelModel[] = new ModelRendererTurbo[0];

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		render(bodyModel);
		render(model);
		render(bodyDoorCloseModel);
		render(turretModel);
		render(barrelModel);
		render(frontWheelModel);
		render(backWheelModel);
		render(leftFrontWheelModel);
		render(rightFrontWheelModel);
		render(leftBackWheelModel);
		render(rightBackWheelModel);
		render(rightTrackModel);
		render(leftTrackModel);
		render(rightTrackWheelModels);
		render(leftTrackWheelModels);
		render(trailerModel);
		render(steeringWheelModel);
	}

	public void flipAll(){
		flip(bodyModel);
		flip(model);
		flip(bodyDoorOpenModel);
		flip(bodyDoorCloseModel);
		flip(turretModel);
		flip(barrelModel);
		flip(frontWheelModel);
		flip(backWheelModel);
		flip(leftFrontWheelModel);
		flip(rightFrontWheelModel);
		flip(leftBackWheelModel);
		flip(rightBackWheelModel);
		flip(rightTrackModel);
		flip(leftTrackModel);
		flip(rightTrackWheelModels);
		flip(leftTrackWheelModels);
		flip(trailerModel);
		flip(steeringWheelModel);
	}
	
	private void flip(ModelRendererTurbo[] bodyModel2) {
		// TODO Auto-generated method stub
	}

	public void translateAll(float x, float y, float z){
		translate(bodyModel, x, y, z);
		translate(model, x, y, z);
		translate(bodyDoorOpenModel, x, y, z);
		translate(bodyDoorCloseModel, x, y, z);
		translate(turretModel, x, y, z);
		translate(barrelModel, x, y, z);
		translate(frontWheelModel, x, y, z);
		translate(backWheelModel, x, y, z);
		translate(leftFrontWheelModel, x, y, z);
		translate(rightFrontWheelModel, x, y, z);
		translate(leftBackWheelModel, x, y, z);
		translate(rightBackWheelModel, x, y, z);
		translate(rightTrackModel, x, y, z);
		translate(leftTrackModel, x, y, z);
		translate(rightTrackWheelModels, x, y, z);
		translate(leftTrackWheelModels, x, y, z);
		translate(trailerModel, x, y, z);
		translate(steeringWheelModel, x, y, z);
	}
}
