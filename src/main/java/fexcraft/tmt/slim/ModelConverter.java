package fexcraft.tmt.slim;

/**
* Converter to use Flansmod-Type vehicle models.
* @Author Ferdinand Calo' (FEX___96)
*/
public class ModelConverter extends ModelBase {

	public ModelRendererTurbo model[],bodyDoorOpenModel[], bodyDoorCloseModel[],trailerModel[],steeringWheelModel[];
	
	public ModelRendererTurbo turretModel[],barrelModel[];
	public ModelRendererTurbo frontWheelModel[],backWheelModel[],
			leftFrontWheelModel[],rightFrontWheelModel[],leftBackWheelModel[],rightBackWheelModel[];
	public ModelRendererTurbo rightTrackModel[],leftTrackModel[],
			rightTrackWheelModels[],leftTrackWheelModels[];

	@Override
	public void initAllParts(){
		model=initList(model);
		bodyDoorOpenModel=initList(bodyDoorOpenModel);
		bodyDoorCloseModel=initList(bodyDoorCloseModel);
		trailerModel=initList(trailerModel);
		steeringWheelModel=initList(steeringWheelModel);
		turretModel=initList(turretModel);
		barrelModel=initList(barrelModel);
		frontWheelModel=initList(frontWheelModel);
		backWheelModel=initList(backWheelModel);
		leftFrontWheelModel=initList(leftFrontWheelModel);
		rightFrontWheelModel=initList(rightFrontWheelModel);
		leftBackWheelModel=initList(leftBackWheelModel);
		rightBackWheelModel=initList(rightBackWheelModel);
		rightTrackModel=initList(rightTrackModel);
		leftTrackModel=initList(leftTrackModel);
		rightTrackWheelModels=initList(rightTrackWheelModels);
		leftTrackWheelModels=initList(leftTrackWheelModels);
		super.initAllParts();
	}


	@Override
	public void translateAll(float x, float y, float z){
		super.translateAll(x,y,z);
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
		super.rotateAll(x,y,z);
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

	@Override
	public void flipAll(){
		super.flipAll();
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
	
}
