package train.render.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;

public class ModelFlatCarWoodUS extends ModelBase {
	
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
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelFlatCarWoodUS() {
		box = new CustomModelRenderer(this, 102, 6, 128, 128);
		box.addBox(0F, 0F, 0F, 4, 3, 3);
		box.setPosition(13F, 1F, -7F);

		box0 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box0.addBox(0F, 0F, 0F, 1, 16, 1);
		box0.setPosition(-12F, 8F, 9F);

		box1 = new CustomModelRenderer(this, 7, 13, 128, 128);
		box1.addBox(0F, 0F, 0F, 7, 3, 4);
		box1.setPosition(23F, 6F, -2F);

		box10 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box10.addBox(0F, 0F, 0F, 2, 2, 10);
		box10.setPosition(-12F, 2F, -5F);

		box11 = new CustomModelRenderer(this, 94, 2, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 2, 10);
		box11.setPosition(-22F, 2F, -5F);

		box12 = new CustomModelRenderer(this, 103, 6, 128, 128);
		box12.addBox(0F, 0F, 0F, 4, 3, 3);
		box12.setPosition(-17F, 1F, 4F);

		box13 = new CustomModelRenderer(this, 105, 4, 128, 128);
		box13.addBox(0F, 0F, 0F, 4, 3, 3);
		box13.setPosition(-17F, 1F, -7F);

		box14 = new CustomModelRenderer(this, 43, 81, 128, 128);
		box14.addBox(0F, 0F, 0F, 18, 2, 1);
		box14.setPosition(-9F, 4F, -9F);

		box15 = new CustomModelRenderer(this, 43, 81, 128, 128);
		box15.addBox(0F, 0F, 0F, 18, 2, 1);
		box15.setPosition(-9F, 4F, 8F);

		box16 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box16.addBox(0F, 0F, 0F, 1, 16, 1);
		box16.setPosition(0F, 8F, -10F);

		box17 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box17.addBox(0F, 0F, 0F, 1, 16, 1);
		box17.setPosition(12F, 8F, -10F);

		box18 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box18.addBox(0F, 0F, 0F, 1, 16, 1);
		box18.setPosition(-12F, 8F, -10F);

		box19 = new CustomModelRenderer(this, 21, 28, 128, 128);
		box19.addBox(0F, 0F, 0F, 41, 4, 4);
		box19.setPosition(-21F, 9F, -9F);

		box2 = new CustomModelRenderer(this, 0, 85, 128, 128);
		box2.addBox(0F, 0F, 0F, 48, 7, 12);
		box2.setPosition(-24F, 0F, -6F);

		box20 = new CustomModelRenderer(this, 29, 20, 128, 128);
		box20.addBox(0F, 0F, 0F, 38, 4, 4);
		box20.setPosition(-19F, 13F, -9F);

		box21 = new CustomModelRenderer(this, 26, 45, 128, 128);
		box21.addBox(0F, 0F, 0F, 39, 4, 4);
		box21.setPosition(-20F, 9F, 5F);

		box22 = new CustomModelRenderer(this, 30, 20, 128, 128);
		box22.addBox(0F, 0F, 0F, 39, 4, 4);
		box22.setPosition(-19F, 13F, 5F);

		box23 = new CustomModelRenderer(this, 6, 15, 128, 128);
		box23.addBox(0F, 0F, 0F, 7, 3, 4);
		box23.setPosition(-30F, 6F, -2F);

		box24 = new CustomModelRenderer(this, 0, 60, 128, 128);
		box24.addBox(0F, 0F, 0F, 46, 3, 18);
		box24.setPosition(-23F, 6F, -9F);

		box25 = new CustomModelRenderer(this, 3, 109, 128, 128);
		box25.addBox(0F, 0F, 0F, 48, 7, 10);
		box25.setPosition(-24F, 0F, -5F);

		box26 = new CustomModelRenderer(this, 26, 45, 128, 128);
		box26.addBox(0F, 0F, 0F, 39, 4, 4);
		box26.setPosition(-20F, 9F, -4F);

		box27 = new CustomModelRenderer(this, 21, 28, 128, 128);
		box27.addBox(0F, 0F, 0F, 41, 4, 4);
		box27.setPosition(-21F, 9F, 1F);

		box28 = new CustomModelRenderer(this, 29, 20, 128, 128);
		box28.addBox(0F, 0F, 0F, 38, 4, 4);
		box28.setPosition(-19F, 13F, -5F);

		box29 = new CustomModelRenderer(this, 26, 45, 128, 128);
		box29.addBox(0F, 0F, 0F, 39, 4, 4);
		box29.setPosition(-20F, 13F, 0F);

		box3 = new CustomModelRenderer(this, 94, 1, 128, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 10);
		box3.setPosition(20F, 2F, -5F);

		box30 = new CustomModelRenderer(this, 26, 45, 128, 128);
		box30.addBox(0F, 0F, 0F, 39, 4, 4);
		box30.setPosition(-20F, 17F, -8F);

		box31 = new CustomModelRenderer(this, 21, 28, 128, 128);
		box31.addBox(0F, 0F, 0F, 41, 4, 4);
		box31.setPosition(-21F, 17F, 4F);

		box32 = new CustomModelRenderer(this, 21, 28, 128, 128);
		box32.addBox(0F, 0F, 0F, 41, 4, 4);
		box32.setPosition(-21F, 17F, 0F);

		box33 = new CustomModelRenderer(this, 23, 37, 128, 128);
		box33.addBox(0F, 0F, 0F, 37, 4, 4);
		box33.setPosition(-19F, 17F, -4F);

		box34 = new CustomModelRenderer(this, 23, 37, 128, 128);
		box34.addBox(0F, 0F, 0F, 37, 4, 4);
		box34.setPosition(-19F, 21F, -4F);

		box35 = new CustomModelRenderer(this, 23, 37, 128, 128);
		box35.addBox(0F, 0F, 0F, 37, 4, 4);
		box35.setPosition(-19F, 21F, 0F);

		box4 = new CustomModelRenderer(this, 22, 7, 128, 128);
		box4.addBox(0F, 0F, 0F, 10, 2, 8);
		box4.setPosition(-21F, 4F, -4F);

		box5 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box5.addBox(0F, 0F, 0F, 2, 2, 10);
		box5.setPosition(10F, 2F, -5F);

		box6 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box6.addBox(0F, 0F, 0F, 1, 16, 1);
		box6.setPosition(12F, 8F, 9F);

		box7 = new CustomModelRenderer(this, 117, 36, 128, 128);
		box7.addBox(0F, 0F, 0F, 1, 16, 1);
		box7.setPosition(0F, 8F, 9F);

		box8 = new CustomModelRenderer(this, 107, 5, 128, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 3);
		box8.setPosition(13F, 1F, 4F);

		box9 = new CustomModelRenderer(this, 22, 7, 128, 128);
		box9.addBox(0F, 0F, 0F, 10, 2, 8);
		box9.setPosition(11F, 4F, -4F);

		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box22,box23,box24,box25,box26,box27,box28,box29,
				box30,box31,box32,box33,box34,box35
		};

		fixRotation(bodyModel);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box19.showModel=false;
		box20.showModel=false;
		box22.showModel=false;
		box26.showModel=false;
		box27.showModel=false;
		box28.showModel=false;
		box29.showModel=false;
		box21.showModel=false;
		box30.showModel=false;
		box31.showModel=false;
		box32.showModel=false;
		box33.showModel=false;
		box34.showModel=false;
		box35.showModel=false;
		int cargo = 0;

		for (ItemStackSlot s : ((GenericRailTransport) entity).inventory){
			if(s.getStack()!=null){
				cargo++;
			}
		}
		if (cargo != 0) {
    		if(cargo<=9) {
    			box19.showModel=true;
    			box21.showModel=true;
    			box27.showModel=true;
    			box26.showModel=true;
			}
    		else if(cargo<=18 && cargo>9) {
    			box19.showModel=true;
    			box20.showModel=true;
    			box22.showModel=true;
    			box26.showModel=true;
    			box28.showModel=true;
    			box29.showModel=true;
    			box21.showModel=true;
    			box27.showModel=true;
    		}
    		else {
    			box19.showModel=true;
    			box20.showModel=true;
    			box22.showModel=true;
    			box26.showModel=true;
    			box27.showModel=true;
    			box28.showModel=true;
    			box29.showModel=true;
    			box21.showModel=true;
    			box30.showModel=true;
    			box31.showModel=true;
    			box32.showModel=true;
    			box33.showModel=true;
    			box34.showModel=true;
    			box35.showModel=true;
    		}
		}
		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}