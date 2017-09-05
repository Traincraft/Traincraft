package train.client.tmt;

import net.minecraft.entity.Entity;

/**
 * Converts ModelBase use to ModelRendererTurbo.
 */
public class ModelBase extends net.minecraft.client.model.ModelBase {

	public ModelRendererTurbo baseModel[] = new ModelRendererTurbo[0];

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(ModelRendererTurbo mrt : baseModel){
			mrt.render(f5);
		}
	}


	public void render(){
		render(baseModel);
	}
	
	public static void render(ModelRendererTurbo[] part){
		for(ModelRendererTurbo mrt : part){
			mrt.render();
		}
	}
	
	protected void translate(ModelRendererTurbo[] model, float x, float y, float z){
		for(ModelRendererTurbo mod : model){
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	
	public void translateAll(float x, float y, float z){
		translate(baseModel, x, y, z);
	}
}
