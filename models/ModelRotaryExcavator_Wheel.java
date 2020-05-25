package train.client.render.models;

import net.fexcraft.lib.tmt.ModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelRotaryExcavator_Wheel extends ModelBase {
	//public float wheel1 = 0.4188790204786391F;
	//private long lastframe;
	//private float wheel;
	//private int l;

	public ModelRotaryExcavator_Wheel() {
		box4 = new ModelRendererTurbo(this, 60, 26, 128, 64);
		box3 = new ModelRendererTurbo(this, 59, 23, 128, 64);
		box1 = new ModelRendererTurbo(this, 56, 9, 128, 64);
		box13 = new ModelRendererTurbo(this, 59, 23, 128, 64);
		box10 = new ModelRendererTurbo(this, 54, 3, 128, 64);
		box12 = new ModelRendererTurbo(this, 58, 14, 128, 64);
		box11 = new ModelRendererTurbo(this, 56, 9, 128, 64);
		box = new ModelRendererTurbo(this, 60, 26, 128, 64);
		box6 = new ModelRendererTurbo(this, 54, 3, 128, 64);
		box5 = new ModelRendererTurbo(this, 4, 29, 128, 64);
		box0 = new ModelRendererTurbo(this, 54, 3, 128, 64);
		box2 = new ModelRendererTurbo(this, 58, 14, 128, 64);
		box7 = new ModelRendererTurbo(this, 54, 3, 128, 64);

		box4.addBox(-2F, -4F, -4F, 9, 8, 8);
		box4.setPosition(-4F, 0F, 0F);
		box3.addBox(-3F, -5F, -5F, 7, 10, 10);
		box3.setPosition(-2F, 0F, 0F);
		box1.addBox(-2F, -9F, -9F, 3, 18, 18);
		box1.setPosition(-1F, 0F, 0F);
		box13.addBox(-3F, -5F, -5F, 7, 10, 10);
		box13.setPosition(-2F, 0F, 0F);
		box10.addBox(-1F, -11F, -11F, 1, 22, 22);
		box10.setPosition(-1F, 0F, 0F);
		box12.addBox(-2F, -7F, -7F, 5, 14, 14);
		box12.setPosition(-2F, 0F, 0F);
		box11.addBox(-2F, -9F, -9F, 3, 18, 18);
		box11.setPosition(-1F, 0F, 0F);
		box.addBox(-2F, -4F, -4F, 9, 8, 8);
		box.setPosition(-4F, 0F, 0F);
		box6.addBox(-1F, -11F, -11F, 1, 22, 22);
		box6.setPosition(-1F, 0F, 0F);
		box5.addBox(-2F, -2F, -2F, 15, 4, 4);
		box5.setPosition(-7F, 0F, 0F);
		box0.addBox(-1F, -11F, -11F, 1, 22, 22);
		box0.setPosition(-1F, 0F, 0F);
		box2.addBox(-2F, -7F, -7F, 5, 14, 14);
		box2.setPosition(-2F, 0F, 0F);
		box7.addBox(-1F, -11F, -11F, 1, 22, 22);
		box7.setPosition(-1F, 0F, 0F);
		
		box4.rotationAngleX = -0.7853981633974483F;
		box3.rotationAngleX = -0.7853981633974483F;
		box1.rotationAngleX = -0.7853981633974483F;
		box6.rotationAngleX = -1.2217304763960306F;
		box0.rotationAngleX = -0.7853981633974483F;
		box2.rotationAngleX = -0.7853981633974483F;
		box7.rotationAngleX = -0.4363323129985824F;
	}
	
	@Override
	public void render() {
		box.render();
		box4.render();
		box5.render();
		box0.render();
		box2.render();
		box7.render();
		box1.render();
		box3.render();
		box6.render();
		box.render();
		box10.render();
		box11.render();
		box12.render();
		box13.render();
	}
	
	@Override
	public void translate(float x, float y, float z) {
	
	}
	
	@Override
	public void rotate(float x, float y, float z) {
	
	}
	
	// variables init:
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;

}
