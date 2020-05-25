package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelWagon extends ModelBase {

	public ModelWagon() {

		box = new ModelRendererTurbo(this, 1, 24, 128, 256);
		box.addBox(0F, 0F, 0F, 9, 4, 18);
		box.setPosition(-5F, 1F, -9F);
		box0 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box0.addBox(0F, 0F, 0F, 6, 6, 1);
		box0.setPosition(-20F, -1F, -7F);
		box1 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-13F, -1F, -7F);
		box10 = new ModelRendererTurbo(this, 1, 124, 128, 256);
		box10.addBox(0F, 0F, 0F, 43, 27, 20);
		box10.setPosition(-22F, 5F, -10F);
		box11 = new ModelRendererTurbo(this, 64, 26, 128, 256);
		box11.addBox(0F, 0F, 0F, 12, 17, 1);
		box11.setPosition(-5F, 10F, -11F);
		box12 = new ModelRendererTurbo(this, 64, 26, 128, 256);
		box12.addBox(0F, 0F, 0F, 12, 17, 1);
		box12.setPosition(-5F, 10F, 10F);
		box13 = new ModelRendererTurbo(this, 41, 26, 128, 256);
		box13.addBox(0F, 0F, 0F, 10, 10, 1);
		box13.setPosition(-18F, 15F, 10F);
		box14 = new ModelRendererTurbo(this, 63, 49, 128, 256);
		box14.addBox(0F, 0F, 0F, 25, 3, 1);
		box14.setPosition(-6F, 7F, -11F);
		box15 = new ModelRendererTurbo(this, 1, 96, 128, 256);
		box15.addBox(0F, 0F, 0F, 15, 4, 12);
		box15.setPosition(-21F, 1F, -6F);
		box16 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box16.addBox(0F, 0F, 0F, 9, 2, 1);
		box16.setPosition(-18F, 1F, -8F);
		box17 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box17.addBox(0F, 0F, 0F, 9, 2, 1);
		box17.setPosition(-18F, 1F, 7F);
		box18 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box18.addBox(0F, 0F, 0F, 9, 2, 1);
		box18.setPosition(8F, 1F, 7F);
		box19 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box19.addBox(0F, 0F, 0F, 9, 2, 1);
		box19.setPosition(8F, 1F, -8F);
		box2 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-13F, -1F, 6F);
		box20 = new ModelRendererTurbo(this, 63, 49, 128, 256);
		box20.addBox(0F, 0F, 0F, 25, 3, 1);
		box20.setPosition(-6F, 27F, -11F);
		box21 = new ModelRendererTurbo(this, 7, 77, 128, 256);
		box21.addBox(0F, 0F, 0F, 3, 2, 2);
		box21.setPosition(20F, 2F, -1F);
		box22 = new ModelRendererTurbo(this, 63, 49, 128, 256);
		box22.addBox(0F, 0F, 0F, 25, 3, 1);
		box22.setPosition(-6F, 7F, 10F);
		box25 = new ModelRendererTurbo(this, 7, 77, 128, 256);
		box25.addBox(0F, 0F, 0F, 3, 2, 2);
		box25.setPosition(-24F, 2F, -1F);
		box28 = new ModelRendererTurbo(this, 41, 26, 128, 256);
		box28.addBox(0F, 0F, 0F, 10, 10, 1);
		box28.setPosition(-18F, 15F, -11F);
		box3 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-20F, -1F, 6F);
		box4 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(13F, -1F, -7F);
		box5 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box5.addBox(0F, 0F, 0F, 6, 6, 1);
		box5.setPosition(6F, -1F, -7F);
		box6 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box6.addBox(0F, 0F, 0F, 6, 6, 1);
		box6.setPosition(6F, -1F, 6F);
		box7 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box7.addBox(0F, 0F, 0F, 6, 6, 1);
		box7.setPosition(13F, -1F, 6F);
		box8 = new ModelRendererTurbo(this, 1, 96, 128, 256);
		box8.addBox(0F, 0F, 0F, 15, 4, 12);
		box8.setPosition(5F, 1F, -6F);
		box9 = new ModelRendererTurbo(this, 63, 49, 128, 256);
		box9.addBox(0F, 0F, 0F, 25, 3, 1);
		box9.setPosition(-6F, 27F, 10F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}*/
		/* super.render(entity, f, f1, f2, f3, f4, f5); for(int i = 0; i < 16; i++) { sideModels[i].render(f5);
		 * 
		 * } */
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box20.render(f5);
		box21.render(f5);
		box22.render(f5);
		box25.render(f5);
		box28.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box28;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;

}
