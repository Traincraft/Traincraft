package tmt;

import net.minecraft.entity.Entity;

/**
* Converter to use Flansmod-Type vehicle models.
* @Author Ferdinand Calo' (FEX___96)
*/
public class ModelConverter extends Model<Object> {
	
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
	
	public void render(){
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

	@Override
	public void render(Object type, Entity ent){
		render();
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

	@Override
	public void rotateAll(float x, float y, float z){
		rotate(bodyModel, x, y, z);
		rotate(model, x, y, z);
		rotate(bodyDoorOpenModel, x, y, z);
		rotate(bodyDoorCloseModel, x, y, z);
		rotate(turretModel, x, y, z);
		rotate(barrelModel, x, y, z);
		rotate(frontWheelModel, x, y, z);
		rotate(backWheelModel, x, y, z);
		rotate(leftFrontWheelModel, x, y, z);
		rotate(rightFrontWheelModel, x, y, z);
		rotate(leftBackWheelModel, x, y, z);
		rotate(rightBackWheelModel, x, y, z);
		rotate(rightTrackModel, x, y, z);
		rotate(leftTrackModel, x, y, z);
		rotate(rightTrackWheelModels, x, y, z);
		rotate(leftTrackWheelModels, x, y, z);
		rotate(trailerModel, x, y, z);
		rotate(steeringWheelModel, x, y, z);
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
	
	private void flip(ModelRendererTurbo[] model) {
		for(ModelRendererTurbo sub : model){
			sub.doMirror(false, true, true);
			sub.setRotationPoint(sub.rotationPointX, -sub.rotationPointY, -sub.rotationPointZ);
		}
	}
	
}
