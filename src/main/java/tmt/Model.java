package tmt;

import net.minecraft.entity.Entity;

/**
* Replaces the old `ModelBase` in this package.
* @Author Ferdinand Calo' (FEX___96)
*/

public abstract class Model<T> extends net.minecraft.client.model.ModelBase {
	
	public static final Model<Object> EMPTY;
	static {
		EMPTY = new Model<Object>(){
			@Override public void render(){}
			@Override public void render(Object type, Entity element){}
			@Override public void translateAll(float x, float y, float z){}
			@Override public void rotateAll(float x, float y, float z){}
		};
	}
	
	/** render whole model */
	public abstract void render();
	
	/** render sub-model array */
	public void render(ModelRendererTurbo[] model){
		for(ModelRendererTurbo sub : model){
			sub.render();
		}
	}
	
	public void render(ModelRendererTurbo[] model, float scale, boolean rotorder){
		for(ModelRendererTurbo sub : model){
			sub.render(scale, rotorder);
		}
	}
	
	/** render whole model based on data and entity */
	public abstract void render(T type, Entity entity);
	
	protected void translate(ModelRendererTurbo[] model, float x, float y, float z){
		for(ModelRendererTurbo mod : model){
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	
	public abstract void translateAll(float x, float y, float z);
	
	protected void rotate(ModelRendererTurbo[] model, float x, float y, float z) {
		for(ModelRendererTurbo mod : model){
			mod.rotateAngleX += x;
			mod.rotateAngleY += y;
			mod.rotateAngleZ += z;
		}
	}
	
	public abstract void rotateAll(float x, float y, float z);
	
	protected final void fixRotation(ModelRendererTurbo[] model, boolean... bools){
		if(bools.length >= 1 && bools[0]){
			for(ModelRendererTurbo mod : model){
				mod.rotateAngleX = -mod.rotateAngleX;
			}
		}
		if(bools.length >= 2 && bools[1]){
			for(ModelRendererTurbo mod : model){
				mod.rotateAngleY = -mod.rotateAngleY;
			}
		}
		if(bools.length >= 3 && bools[2]){
			for(ModelRendererTurbo mod : model){
				mod.rotateAngleZ = -mod.rotateAngleZ;
			}
		}
	}
	
}