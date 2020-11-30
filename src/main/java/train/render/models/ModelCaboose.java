package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;
import train.core.handlers.ConfigHandler;

public class ModelCaboose extends ModelBase {

	public ModelCaboose() {

		// sideModels = new CustomModelRenderer[16];

		box = new CustomModelRenderer(this, 3, 52, 128, 256);
		box.addBox(0F, 0F, 0F, 37, 2, 20, 0.0F);
		box.setPosition(-18F, 2F, -9F);

		box0 = new CustomModelRenderer(this, 84, 215, 128, 256);
		box0.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box0.setPosition(18F, 4F, 10F);

		box1 = new CustomModelRenderer(this, 78, 215, 128, 256);
		box1.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box1.setPosition(18F, 4F, -9F);

		box10 = new CustomModelRenderer(this, 63, 155, 128, 256);
		box10.addBox(0F, 0F, 0F, 23, 20, 1, 0.0F);
		box10.setPosition(-11F, 4F, -8F);

		box11 = new CustomModelRenderer(this, 2, 155, 128, 256);
		box11.addBox(0F, 0F, 0F, 23, 20, 1, 0.0F);
		box11.setPosition(-11F, 4F, 9F);

		box12 = new CustomModelRenderer(this, -1, 20, 128, 256);
		box12.addBox(0F, 0F, 0F, 39, 1, 24, 0.0F);
		box12.setPosition(-19F, 24F, -11F);

		box13 = new CustomModelRenderer(this, 85, 192, 128, 256);
		box13.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box13.setPosition(18F, 11F, 10F);

		box14 = new CustomModelRenderer(this, 78, 192, 128, 256);
		box14.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box14.setPosition(18F, 11F, -9F);

		box15 = new CustomModelRenderer(this, 70, 192, 128, 256);
		box15.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box15.setPosition(-18F, 11F, -9F);

		box16 = new CustomModelRenderer(this, 62, 192, 128, 256);
		box16.addBox(0F, 0F, 0F, 1, 13, 1, 0.0F);
		box16.setPosition(-18F, 11F, 10F);

		box17 = new CustomModelRenderer(this, 58, 135, 128, 256);
		box17.addBox(0F, 0F, 0F, 13, 2, 14, 0.0F);
		box17.setPosition(-19F, 25F, -6F);

		box18 = new CustomModelRenderer(this, 38, 216, 128, 256);
		box18.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box18.setPosition(-13F, -1F, -6F);

		box19 = new CustomModelRenderer(this, 26, 216, 128, 256);
		box19.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box19.setPosition(-13F, -1F, 7F);

		box2 = new CustomModelRenderer(this, 71, 215, 128, 256);
		box2.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box2.setPosition(18F, 4F, 1F);

		box20 = new CustomModelRenderer(this, 14, 216, 128, 256);
		box20.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box20.setPosition(10F, -1F, 7F);

		box21 = new CustomModelRenderer(this, 2, 216, 128, 256);
		box21.addBox(0F, 0F, 0F, 4, 4, 1, 0.0F);
		box21.setPosition(10F, -1F, -6F);

		box22 = new CustomModelRenderer(this, 25, 228, 128, 256);
		box22.addBox(0F, 0F, 0F, 20, 10, 14, 0.0F);
		box22.setPosition(-6F, 25F, -6F);

		box23 = new CustomModelRenderer(this, 2, 126, 128, 256);
		box23.addBox(0F, 0F, 0F, 20, 2, 6, 0.0F);
		box23.setPosition(-6F, 35F, -2F);

		box24 = new CustomModelRenderer(this, 6, 137, 128, 256);
		box24.addBox(0F, 0F, 0F, 6, 2, 14, 0.0F);
		box24.setPosition(14F, 25F, -6F);

		box3 = new CustomModelRenderer(this, 65, 215, 128, 256);
		box3.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box3.setPosition(-18F, 4F, -9F);

		box4 = new CustomModelRenderer(this, 59, 215, 128, 256);
		box4.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box4.setPosition(-18F, 4F, 10F);

		box5 = new CustomModelRenderer(this, 53, 215, 128, 256);
		box5.addBox(0F, 0F, 0F, 1, 6, 1, 0.0F);
		box5.setPosition(-18F, 4F, 0F);

		box6 = new CustomModelRenderer(this, 3, 182, 128, 256);
		box6.addBox(0F, 0F, 0F, 1, 1, 22, 0.0F);
		box6.setPosition(-18F, 10F, -10F);

		box7 = new CustomModelRenderer(this, 3, 182, 128, 256);
		box7.addBox(0F, 0F, 0F, 1, 1, 22, 0.0F);
		box7.setPosition(18F, 10F, -10F);

		box8 = new CustomModelRenderer(this, 49, 85, 128, 256);
		box8.addBox(0F, 0F, 0F, 1, 20, 16, 0.0F);
		box8.setPosition(-11F, 4F, -7F);

		box9 = new CustomModelRenderer(this, 4, 85, 128, 256);
		box9.addBox(0F, 0F, 0F, 1, 20, 16, 0.0F);
		box9.setPosition(11F, 4F, -7F);
		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box22,box23,box24
		};

		fixRotation(bodyModel);

	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// public CustomModelRenderer sideModels[];
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box16;
	public CustomModelRenderer box17;
	public CustomModelRenderer box18;
	public CustomModelRenderer box19;
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box21;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
