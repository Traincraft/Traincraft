package src.train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import src.train.client.render.CustomModelRenderer;
import src.train.common.core.handlers.ConfigHandler;

public class ModelTenderHeavy extends ModelBase {

	public ModelTenderHeavy() {

		// constructor:
		box = new CustomModelRenderer(0, 27, 128, 256);
		box.addBox(0F, 0F, 0F, 43, 16, 20);
		box.setPosition(-21F, 5F, -10F);
		box0 = new CustomModelRenderer(2, 66, 128, 256);
		box0.addBox(0F, 0F, 0F, 6, 6, 1);
		box0.setPosition(-18F, -1F, -7F);
		box1 = new CustomModelRenderer(2, 66, 128, 256);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-11F, -1F, -7F);
		box10 = new CustomModelRenderer(37, 64, 128, 256);
		box10.addBox(0F, 0F, 0F, 31, 4, 1);
		box10.setPosition(-24F, 21F, -10F);
		box11 = new CustomModelRenderer(37, 64, 128, 256);
		box11.addBox(0F, 0F, 0F, 31, 4, 1);
		box11.setPosition(-24F, 21F, 9F);
		box12 = new CustomModelRenderer(1, 1, 128, 256);
		box12.addBox(0F, 0F, 0F, 26, 3, 12);
		box12.setPosition(-20F, 21F, -6F);
		box13 = new CustomModelRenderer(82, 65, 128, 256);
		box13.addBox(0F, 0F, 0F, 2, 4, 20);
		box13.setPosition(-21F, 1F, -10F);
		box14 = new CustomModelRenderer(82, 65, 128, 256);
		box14.addBox(0F, 0F, 0F, 2, 4, 20);
		box14.setPosition(20F, 1F, -10F);
		box15 = new CustomModelRenderer(1, 96, 128, 256);
		box15.addBox(0F, 0F, 0F, 39, 4, 12);
		box15.setPosition(-19F, 1F, -6F);
		box16 = new CustomModelRenderer(3, 118, 128, 256);
		box16.addBox(0F, 0F, 0F, 9, 2, 1);
		box16.setPosition(-16F, 1F, -8F);
		box17 = new CustomModelRenderer(3, 118, 128, 256);
		box17.addBox(0F, 0F, 0F, 9, 2, 1);
		box17.setPosition(-16F, 1F, 7F);
		box18 = new CustomModelRenderer(3, 118, 128, 256);
		box18.addBox(0F, 0F, 0F, 9, 2, 1);
		box18.setPosition(8F, 1F, 7F);
		box19 = new CustomModelRenderer(3, 118, 128, 256);
		box19.addBox(0F, 0F, 0F, 9, 2, 1);
		box19.setPosition(8F, 1F, -8F);
		box2 = new CustomModelRenderer(2, 66, 128, 256);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-11F, -1F, 6F);
		box20 = new CustomModelRenderer(7, 77, 128, 256);
		box20.addBox(0F, 0F, 0F, 3, 2, 2);
		box20.setPosition(22F, 2F, 5F);
		box21 = new CustomModelRenderer(7, 77, 128, 256);
		box21.addBox(0F, 0F, 0F, 3, 2, 2);
		box21.setPosition(22F, 2F, -7F);
		box22 = new CustomModelRenderer(34, 70, 128, 256);
		box22.addBox(0F, 0F, 0F, 10, 2, 2);
		box22.setPosition(-31F, 2F, -7F);
		box23 = new CustomModelRenderer(34, 70, 128, 256);
		box23.addBox(0F, 0F, 0F, 10, 2, 2);
		box23.setPosition(-31F, 2F, 5F);
		box24 = new CustomModelRenderer(3, 65, 128, 256);
		box24.addBox(0F, 0F, 0F, 5, 3, 20);
		box24.setPosition(-26F, 5F, -10F);
		box25 = new CustomModelRenderer(34, 70, 128, 256);
		box25.addBox(0F, 0F, 0F, 10, 2, 2);
		box25.setPosition(-31F, 2F, -1F);
		box26 = new CustomModelRenderer(2, 27, 128, 256);
		box26.addBox(0F, 0F, 0F, 3, 14, 1);
		box26.setPosition(-24F, 7F, -10F);
		box27 = new CustomModelRenderer(20, 46, 128, 256);
		box27.addBox(0F, 0F, 0F, 3, 14, 1);
		box27.setPosition(-24F, 7F, 9F);
		box3 = new CustomModelRenderer(2, 66, 128, 256);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-18F, -1F, 6F);
		box4 = new CustomModelRenderer(2, 66, 128, 256);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(13F, -1F, -7F);
		box5 = new CustomModelRenderer(2, 66, 128, 256);
		box5.addBox(0F, 0F, 0F, 6, 6, 1);
		box5.setPosition(6F, -1F, -7F);
		box6 = new CustomModelRenderer(2, 66, 128, 256);
		box6.addBox(0F, 0F, 0F, 6, 6, 1);
		box6.setPosition(6F, -1F, 6F);
		box7 = new CustomModelRenderer(2, 66, 128, 256);
		box7.addBox(0F, 0F, 0F, 6, 6, 1);
		box7.setPosition(13F, -1F, 6F);
		box8 = new CustomModelRenderer(55, 73, 128, 256);
		box8.addBox(0F, 0F, 0F, 1, 4, 18);
		box8.setPosition(6F, 21F, -9F);
		box9 = new CustomModelRenderer(65, 1, 128, 256);
		box9.addBox(0F, 0F, 0F, 9, 4, 20);
		box9.setPosition(-4F, 1F, -10F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}

		// render:
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
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
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
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
