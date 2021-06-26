package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;
import train.common.core.handlers.ConfigHandler;

public class ModelFlatCarLogs_DB extends ModelBase {
	
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
	public CustomModelRenderer box44;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box63;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelFlatCarLogs_DB() {
		box = new CustomModelRenderer(this, 70, 25, 256, 128);
		box.addBox(0F, 0F, 0F, 8, 4, 4);
		box.setPosition(-5F, 2F, 0F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-23F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-20F, 0F, 5F);

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

		box15 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box15.addBox(0F, 0F, 0F, 2, 19, 1);
		box15.setPosition(19F, 5F, -12F);

		box16 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box16.addBox(0F, 0F, 0F, 2, 19, 1);
		box16.setPosition(6F, 5F, -12F);

		box17 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box17.addBox(0F, 0F, 0F, 2, 19, 1);
		box17.setPosition(-8F, 5F, -12F);

		box18 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box18.addBox(0F, 0F, 0F, 2, 19, 1);
		box18.setPosition(-21F, 5F, -12F);

		box19 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box19.addBox(0F, 0F, 0F, 2, 19, 1);
		box19.setPosition(19F, 5F, 11F);

		box2 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(15F, 2F, -7F);

		box20 = new CustomModelRenderer(this, 187, 68, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 5, 16);
		box20.setPosition(-28F, 6F, -8F);

		box21 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box21.addBox(0F, 0F, 0F, 2, 19, 1);
		box21.setPosition(6F, 5F, 11F);

		box22 = new CustomModelRenderer(this, 7, 82, 256, 128);
		box22.addBox(0F, 0F, 0F, 1, 16, 2);
		box22.setPosition(-28F, 11F, -6F);

		box23 = new CustomModelRenderer(this, 7, 82, 256, 128);
		box23.addBox(0F, 0F, 0F, 1, 16, 2);
		box23.setPosition(-28F, 11F, 4F);

		box24 = new CustomModelRenderer(this, 0, 83, 256, 128);
		box24.addBox(0F, 0F, 0F, 52, 1, 20);
		box24.setPosition(-26F, 8F, -10F);

		box25 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new CustomModelRenderer(this, 104, 42, 256, 128);
		box26.addBox(0F, 0F, 0F, 54, 3, 22);
		box26.setPosition(-27F, 5F, -11F);

		box27 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box27.addBox(0F, 0F, 0F, 2, 19, 1);
		box27.setPosition(-8F, 5F, 11F);

		box28 = new CustomModelRenderer(this, 7, 82, 256, 128);
		box28.addBox(0F, 0F, 0F, 1, 16, 2);
		box28.setPosition(27F, 11F, -6F);

		box29 = new CustomModelRenderer(this, 7, 82, 256, 128);
		box29.addBox(0F, 0F, 0F, 1, 16, 2);
		box29.setPosition(27F, 11F, 4F);

		box3 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-17F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box30.addBox(0F, 0F, 0F, 2, 19, 1);
		box30.setPosition(-21F, 5F, 11F);

		box31 = new CustomModelRenderer(this, 2, 49, 256, 128);
		box31.addBox(0F, 0F, 0F, 50, 6, 6);
		box31.setPosition(-25F, 9F, -9F);

		box32 = new CustomModelRenderer(this, 2, 49, 256, 128);
		box32.addBox(0F, 0F, -1F, 50, 6, 6);
		box32.setPosition(-24F, 9F, -2F);
		box32.rotateAngleY = -0.017453292519943295F;

		box33 = new CustomModelRenderer(this, 2, 49, 256, 128);
		box33.addBox(0F, 0F, 13F, 50, 6, 6);
		box33.setPosition(-26F, 9F, -9F);

		box34 = new CustomModelRenderer(this, 2, 49, 256, 128);
		box34.addBox(0F, 6F, -9F, 50, 6, 6);
		box34.setPosition(-24F, 9F, 0F);
		box34.rotateAngleY = -6.265732014659643F;

		box35 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(12F, 0F, 5F);

		box36 = new CustomModelRenderer(this, 141, 112, 256, 128);
		box36.addBox(0F, 0F, 13F, 50, 7, 7);
		box36.setPosition(-25F, 15F, -9F);

		box37 = new CustomModelRenderer(this, 2, 49, 256, 128);
		box37.addBox(0F, 0F, 13F, 50, 6, 6);
		box37.setPosition(-25F, 15F, -16F);

		box38 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new CustomModelRenderer(this, 2, 34, 256, 128);
		box39.addBox(0F, 0F, 13F, 46, 7, 7);
		box39.setPosition(-23F, 21F, -20F);

		box4 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-23F, 1F, 5F);

		box40 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box41 = new CustomModelRenderer(this, 12, 68, 256, 128);
		box41.addBox(0F, 0F, 0F, 50, 6, 6);
		box41.setPosition(-26F, 21F, 1F);
		box41.rotateAngleX = -0.19198621771937624F;

		box42 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box44 = new CustomModelRenderer(this, 158, 77, 256, 128);
		box44.addBox(0F, 0F, 0F, 2, 3, 4);
		box44.setPosition(-30F, 6F, -2F);

		box5 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(12F, 0F, -5F);

		box6 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(9F, 1F, 5F);

		box63 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-20F, 0F, -5F);

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
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
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
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box35.render(f5);
		box38.render(f5);
		box4.render(f5);
		box40.render(f5);
		box42.render(f5);
		box44.render(f5);
		box5.render(f5);
		box6.render(f5);
		box63.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
    		if(cargo<=9) {
    			box31.render(f5);
	    		box32.render(f5);
			}
			else if(cargo<=18 && cargo>9) {
				box31.render(f5);
	    		box32.render(f5);
	    		box33.render(f5);
			}
			else if(cargo<=27 && cargo>18) {
				box31.render(f5);
	    		box32.render(f5);
	    		box33.render(f5);
	    		box37.render(f5);
			}
			else if(cargo<=36 && cargo>27) {
				box31.render(f5);
	    		box32.render(f5);
	    		box33.render(f5);
	    		box34.render(f5);
	    		box36.render(f5);
	    		box37.render(f5);
			}
			else if(cargo<45 && cargo>36) {
	    		box41.render(f5);
	    		box31.render(f5);
	    		box32.render(f5);
	    		box33.render(f5);
	    		box34.render(f5);
	    		box36.render(f5);
	    		box37.render(f5);
			}
			else {
				box39.render(f5);
	    		box41.render(f5);
	    		box31.render(f5);
	    		box32.render(f5);
	    		box33.render(f5);
	    		box34.render(f5);
	    		box36.render(f5);
	    		box37.render(f5);
    		}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}