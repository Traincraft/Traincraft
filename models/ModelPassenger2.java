package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelPassenger2 extends ModelBase {

	public ModelPassenger2() {
		box = new ModelRendererTurbo(this, 3, 52, 128, 256);
		box.addBox(0F, 0F, 0F, 37, 2, 20, 0.0F);
		box.setPosition(-18F, 2F, -9F);

		box0 = new ModelRendererTurbo(this, 84, 215, 128, 256);
		box0.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box0.setPosition(18F, 4F, 10F);

		box1 = new ModelRendererTurbo(this, 78, 215, 128, 256);
		box1.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box1.setPosition(18F, 4F, -9F);

		box10 = new ModelRendererTurbo(this, 63, 155, 128, 256);
		box10.addBox(0F, 0F, 0F, 23, 20, 1, 0.0F);
		box10.setPosition(-11F, 4F, -8F);

		box11 = new ModelRendererTurbo(this, 2, 155, 128, 256);
		box11.addBox(0F, 0F, 0F, 23, 20, 1, 0.0F);
		box11.setPosition(-11F, 4F, 9F);

		box12 = new ModelRendererTurbo(this, 1, 20, 128, 256);
		box12.addBox(0F, 0F, 0F, 39, 1, 24, 0.0F);
		box12.setPosition(-19F, 24F, -11F);

		box13 = new ModelRendererTurbo(this, 85, 192, 128, 256);
		box13.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box13.setPosition(18F, 11F, 10F);

		box14 = new ModelRendererTurbo(this, 78, 192, 128, 256);
		box14.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box14.setPosition(18F, 11F, -9F);

		box15 = new ModelRendererTurbo(this, 70, 192, 128, 256);
		box15.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box15.setPosition(-18F, 11F, -9F);

		box16 = new ModelRendererTurbo(this, 62, 192, 128, 256);
		box16.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box16.setPosition(-18F, 11F, 10F);

		box17 = new ModelRendererTurbo(this, 15, 129, 128, 256);
		box17.addBox(0F, 0F, 0F, 30, 3, 16, 0.0F);
		box17.setPosition(-15F, 25F, -7F);

		box18 = new ModelRendererTurbo(this, 38, 216, 128, 256);
		box18.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box18.setPosition(-13F, -1F, -6F);

		box19 = new ModelRendererTurbo(this, 26, 216, 128, 256);
		box19.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box19.setPosition(-13F, -1F, 7F);

		box2 = new ModelRendererTurbo(this, 71, 215, 128, 256);
		box2.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box2.setPosition(18F, 4F, 1F);

		box20 = new ModelRendererTurbo(this, 14, 216, 128, 256);
		box20.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box20.setPosition(10F, -1F, 7F);

		box21 = new ModelRendererTurbo(this, 2, 216, 128, 256);
		box21.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box21.setPosition(10F, -1F, -6F);

		box3 = new ModelRendererTurbo(this, 65, 215, 128, 256);
		box3.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box3.setPosition(-18F, 4F, -9F);

		box4 = new ModelRendererTurbo(this, 59, 215, 128, 256);
		box4.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box4.setPosition(-18F, 4F, 10F);

		box5 = new ModelRendererTurbo(this, 53, 215, 128, 256);
		box5.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box5.setPosition(-18F, 4F, 0F);

		box6 = new ModelRendererTurbo(this, 3, 182, 128, 256);
		box6.addBox(0F, 0F, 0F, 1, 1, 22, 0.0F);
		box6.setPosition(-18F, 10F, -10F);

		box7 = new ModelRendererTurbo(this, 3, 182, 128, 256);
		box7.addBox(0F, 0F, 0F, 1, 1, 22, 0.0F);
		box7.setPosition(18F, 10F, -10F);

		box8 = new ModelRendererTurbo(this, 49, 85, 128, 256);
		box8.addBox(0F, 0F, 0F, 1, 20, 16, 0.0F);
		box8.setPosition(-11F, 4F, -7F);

		box9 = new ModelRendererTurbo(this, 4, 85, 128, 256);
		box9.addBox(0F, 0F, 0F, 1, 20, 16, 0.0F);
		box9.setPosition(11F, 4F, -7F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;
}