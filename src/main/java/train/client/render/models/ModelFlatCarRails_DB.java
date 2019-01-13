package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;

public class ModelFlatCarRails_DB extends ModelBase {

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
	public CustomModelRenderer box28;
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box38;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
	public CustomModelRenderer box43;
	public CustomModelRenderer box44;
	public CustomModelRenderer box45;
	public CustomModelRenderer box46;
	public CustomModelRenderer box47;
	public CustomModelRenderer box48;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box50;
	public CustomModelRenderer box51;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelFlatCarRails_DB() {
		box = new CustomModelRenderer(this, 70, 25, 256, 128);
		box.addBox(0F, 0F, 0F, 8, 4, 4);
		box.setPosition(-5F, 2F, 0F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-23F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 213, 80, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 5, 16);
		box1.setPosition(-27F, 6F, 8F);
		box1.rotateAngleY = -3.141592653589793F;

		box10 = new CustomModelRenderer(this, 213, 80, 256, 128);
		box10.addBox(0F, 0F, 0F, 1, 5, 16);
		box10.setPosition(27F, 6F, -8F);

		box11 = new CustomModelRenderer(this, 158, 77, 256, 128);
		box11.addBox(0F, 0F, 0F, 2, 3, 4);
		box11.setPosition(28F, 6F, -2F);

		box12 = new CustomModelRenderer(this, 160, 73, 256, 128);
		box12.addBox(0F, 0F, 0F, 1, 6, 20);
		box12.setPosition(27F, 8F, 10F);
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new CustomModelRenderer(this, 21, 121, 256, 128);
		box13.addBox(0F, 0F, 0F, 54, 6, 1);
		box13.setPosition(27F, 8F, 11F);
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new CustomModelRenderer(this, 21, 121, 256, 128);
		box14.addBox(0F, 0F, 0F, 54, 6, 1);
		box14.setPosition(-27F, 8F, -11F);

		box15 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box15.addBox(0F, 0F, 0F, 1, 3, 3);
		box15.setPosition(28F, 7F, -7F);

		box16 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box16.addBox(0F, 0F, 0F, 2, 2, 14);
		box16.setPosition(15F, 2F, -7F);

		box17 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box17.addBox(0F, 0F, 0F, 2, 1, 18);
		box17.setPosition(16F, 9F, -9F);

		box18 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box18.addBox(0F, 0F, 0F, 2, 1, 18);
		box18.setPosition(-2F, 9F, -9F);

		box19 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box19.addBox(0F, 0F, 0F, 2, 1, 18);
		box19.setPosition(1F, 11F, -9F);

		box2 = new CustomModelRenderer(this, 0, 83, 256, 128);
		box2.addBox(0F, 0F, 0F, 52, 1, 20);
		box2.setPosition(-26F, 8F, -10F);

		box20 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box20.addBox(0F, 0F, 0F, 2, 1, 18);
		box20.setPosition(-18F, 11F, -9F);
		box20.rotateAngleY = -0.06981317007977318F;

		box21 = new CustomModelRenderer(this, 128, 104, 256, 128);
		box21.addBox(0F, 0F, 0F, 48, 1, 16);
		box21.setPosition(-24F, 10F, -8F);

		box22 = new CustomModelRenderer(this, 128, 104, 256, 128);
		box22.addBox(0F, 0F, 0F, 48, 1, 16);
		box22.setPosition(23F, 12F, 8F);
		box22.rotateAngleY = -3.141592653589793F;

		box23 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box23.addBox(0F, 0F, 0F, 2, 1, 18);
		box23.setPosition(-20F, 9F, -9F);

		box24 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box24.addBox(0F, 0F, 0F, 2, 1, 18);
		box24.setPosition(17F, 11F, -9F);
		box24.rotateAngleY = -0.10471975511965978F;

		box25 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box25.addBox(-1F, 2F, 0F, 2, 1, 18);
		box25.setPosition(15F, 11F, -9F);
		box25.rotateAngleY = -6.213372137099813F;

		box26 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box26.addBox(0F, 0F, 0F, 2, 1, 18);
		box26.setPosition(-19F, 13F, -9F);

		box27 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box27.addBox(7F, 2F, 0F, 2, 1, 18);
		box27.setPosition(-7F, 11F, -9F);
		box27.rotateAngleY = -0.05235987755982989F;

		box28 = new CustomModelRenderer(this, 128, 104, 256, 128);
		box28.addBox(-6F, 0F, 0F, 48, 1, 16);
		box28.setPosition(-18F, 14F, -8F);
		box28.rotateAngleY = -0.017453292519943295F;

		box29 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box29.addBox(7F, 2F, 0F, 2, 1, 18);
		box29.setPosition(-24F, 13F, -9F);
		box29.rotateAngleY = -0.05235987755982989F;

		box3 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-17F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box30.addBox(0F, 0F, 0F, 2, 1, 18);
		box30.setPosition(-1F, 15F, -9F);

		box31 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box31.addBox(0F, 0F, 0F, 2, 1, 18);
		box31.setPosition(15F, 15F, -9F);

		box32 = new CustomModelRenderer(this, 128, 104, 256, 128);
		box32.addBox(0F, 0F, 0F, 48, 1, 16);
		box32.setPosition(-24F, 16F, -8F);

		box33 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box33.addBox(0F, 0F, 0F, 2, 1, 18);
		box33.setPosition(-20F, 17F, -9F);

		box34 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box34.addBox(7F, 2F, 0F, 2, 1, 18);
		box34.setPosition(-9F, 15F, -9F);
		box34.rotateAngleY = -0.05235987755982989F;

		box35 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box35.addBox(0F, 0F, 0F, 2, 1, 18);
		box35.setPosition(15F, 17F, -9F);
		box35.rotateAngleY = -6.2482787221397F;

		box36 = new CustomModelRenderer(this, 129, 105, 256, 128);
		box36.addBox(0F, 0F, 0F, 48, 1, 15);
		box36.setPosition(24F, 18F, 8F);
		box36.rotateAngleY = -3.141592653589793F;

		box37 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box37.addBox(0F, 0F, 0F, 2, 1, 18);
		box37.setPosition(-2F, 19F, -9F);

		box38 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box39.addBox(0F, 0F, 0F, 2, 1, 18);
		box39.setPosition(16F, 19F, -9F);

		box4 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-23F, 1F, 5F);

		box40 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box41 = new CustomModelRenderer(this, 131, 0, 256, 128);
		box41.addBox(0F, 0F, 0F, 2, 1, 18);
		box41.setPosition(-20F, 19F, -9F);
		box41.rotateAngleY = -6.213372137099813F;

		box42 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box43 = new CustomModelRenderer(this, 6, 50, 256, 128);
		box43.addBox(0F, 0F, 0F, 48, 1, 5);
		box43.setPosition(-25F, 20F, -4F);

		box44 = new CustomModelRenderer(this, 158, 77, 256, 128);
		box44.addBox(0F, 0F, 0F, 2, 3, 4);
		box44.setPosition(-30F, 6F, -2F);

		box45 = new CustomModelRenderer(this, 11, 41, 256, 128);
		box45.addBox(0F, 0F, 1F, 48, 1, 1);
		box45.setPosition(-25F, 20F, 4F);
		box45.rotateAngleY = -0.017453292519943295F;

		box46 = new CustomModelRenderer(this, 10, 45, 256, 128);
		box46.addBox(0F, 0F, -1F, 48, 1, 2);
		box46.setPosition(-24F, 20F, 3F);
		box46.rotateAngleY = -6.265732014659643F;

		box47 = new CustomModelRenderer(this, 11, 41, 256, 128);
		box47.addBox(0F, 0F, -12F, 48, 1, 1);
		box47.setPosition(-23F, 20F, 7F);
		box47.rotateAngleY = -6.2482787221397F;

		box48 = new CustomModelRenderer(this, 216, 12, 256, 128);
		box48.addBox(0F, 0F, 0F, 8, 7, 0);
		box48.setPosition(-20F, 0F, 5F);

		box49 = new CustomModelRenderer(this, 216, 12, 256, 128);
		box49.addBox(0F, 0F, 0F, 8, 7, 0);
		box49.setPosition(12F, 0F, 5F);

		box5 = new CustomModelRenderer(this, 104, 42, 256, 128);
		box5.addBox(0F, 0F, 0F, 54, 3, 22);
		box5.setPosition(-27F, 5F, -11F);

		box50 = new CustomModelRenderer(this, 216, 12, 256, 128);
		box50.addBox(0F, 0F, 0F, 8, 7, 0);
		box50.setPosition(12F, 0F, -5F);

		box51 = new CustomModelRenderer(this, 216, 12, 256, 128);
		box51.addBox(0F, 0F, 0F, 8, 7, 0);
		box51.setPosition(-20F, 0F, -5F);

		box6 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(9F, 1F, 5F);

		box7 = new CustomModelRenderer(this, 160, 73, 256, 128);
		box7.addBox(0F, 0F, 0F, 1, 6, 20);
		box7.setPosition(-27F, 8F, -10F);

		box8 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box8.addBox(0F, 0F, 0F, 14, 5, 1);
		box8.setPosition(9F, 1F, -6F);

		box9 = new CustomModelRenderer(this, 118, 21, 256, 128);
		box9.addBox(0F, 0F, 0F, 54, 2, 14);
		box9.setPosition(-27F, 6F, -7F);

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
		box2.render(f5);
		box3.render(f5);
		box38.render(f5);
		
		box4.render(f5);
		box40.render(f5);
		box42.render(f5);
		box44.render(f5);
		box48.render(f5);
		box49.render(f5);
		box5.render(f5);
		box50.render(f5);
		box51.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
    		if(cargo<=6) {
    			box23.render(f5);
    			box17.render(f5);
    			box18.render(f5);
    			box21.render(f5);
			}
			else if(cargo<=12 && cargo>6) {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
			}
			else if(cargo<=18 && cargo>12) {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
				box25.render(f5);
				box26.render(f5);
				box27.render(f5);
				box28.render(f5);
			}
			else if(cargo<=24 && cargo>18) {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
				box25.render(f5);
				box26.render(f5);
				box27.render(f5);
				box28.render(f5);
				box29.render(f5);
				box30.render(f5);
				box31.render(f5);
				box32.render(f5);
			}
			else if(cargo<=30 && cargo>24) {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
				box25.render(f5);
				box26.render(f5);
				box27.render(f5);
				box28.render(f5);
				box29.render(f5);
				box30.render(f5);
				box31.render(f5);
				box32.render(f5);
				box33.render(f5);
				box34.render(f5);
				box35.render(f5);
				box36.render(f5);
			}
			else if(cargo<36 && cargo>30) {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
				box25.render(f5);
				box26.render(f5);
				box27.render(f5);
				box28.render(f5);
				box29.render(f5);
				box30.render(f5);
				box31.render(f5);
				box32.render(f5);
				box33.render(f5);
				box34.render(f5);
				box35.render(f5);
				box36.render(f5);
				box37.render(f5);
				box46.render(f5);
				box47.render(f5);
				box39.render(f5);
				box41.render(f5);
			}
			else {
				box23.render(f5);
				box17.render(f5);
				box18.render(f5);
				box21.render(f5);
				box19.render(f5);
				box20.render(f5);
				box22.render(f5);
				box24.render(f5);
				box25.render(f5);
				box26.render(f5);
				box27.render(f5);
				box28.render(f5);
				box29.render(f5);
				box30.render(f5);
				box31.render(f5);
				box32.render(f5);
				box33.render(f5);
				box34.render(f5);
				box35.render(f5);
				box36.render(f5);
				box37.render(f5);
				box45.render(f5);
				box46.render(f5);
				box47.render(f5);
				box39.render(f5);
				box41.render(f5);
				box43.render(f5);
    		}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}