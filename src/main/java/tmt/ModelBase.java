package tmt;

import net.minecraft.entity.Entity;

/**
* Similar to 'FlansMod'-type Models, for a fast convert.
* @Author Ferdinand Calo' (FEX___96)
*/
public class ModelBase extends Model<Object> {
	
	public ModelRendererTurbo base[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo open[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo closed[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r1[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r2[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r3[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r4[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r5[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r6[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r7[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r8[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r9[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo r0[] = new ModelRendererTurbo[0];
	   
	public void render(){
		render(base);
		render(open);
		render(closed);
		render(r0);
		render(r1);
		render(r2);
		render(r3);
		render(r4);
		render(r5);
		render(r6);
		render(r7);
		render(r8);
		render(r9);
	}

	@Override
	public void render(Object type, Entity ent){
		render();
	}
	
	@Override
	public void translateAll(float x, float y, float z){
		translate(base, x, y, z);
		translate(open, x, y, z);
		translate(closed, x, y, z);
		translate(r0, x, y, z);
		translate(r1, x, y, z);
		translate(r2, x, y, z);
		translate(r3, x, y, z);
		translate(r4, x, y, z);
		translate(r5, x, y, z);
		translate(r6, x, y, z);
		translate(r7, x, y, z);
		translate(r8, x, y, z);
		translate(r9, x, y, z);
	}

	@Override
	public void rotateAll(float x, float y, float z){
		rotate(base, x, y, z);
		rotate(open, x, y, z);
		rotate(closed, x, y, z);
		rotate(r0, x, y, z);
		rotate(r1, x, y, z);
		rotate(r2, x, y, z);
		rotate(r3, x, y, z);
		rotate(r4, x, y, z);
		rotate(r5, x, y, z);
		rotate(r6, x, y, z);
		rotate(r7, x, y, z);
		rotate(r8, x, y, z);
		rotate(r9, x, y, z);
	}


	public void fixRotations(ModelRendererTurbo[] geometry){
		for(ModelRendererTurbo turbo : geometry){
			if(turbo.isShape) {
				turbo.rotateAngleY = -turbo.rotateAngleY;
				turbo.rotateAngleX = -turbo.rotateAngleX;
				turbo.rotateAngleZ = -turbo.rotateAngleZ + 3.14159f;
			} else {
				turbo.rotateAngleZ = -turbo.rotateAngleZ;
			}
		}
	}
	
}
