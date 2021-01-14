package train.render.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;
import train.core.handlers.ConfigHandler;

public class ModelFreightTrailer extends ModelBase {

	public ModelFreightTrailer() {
		box = new CustomModelRenderer(this, 108, 0, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(5F, 0F, 10F);

		box0 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 4, 10);
		box0.setPosition(6F, 1F, 12F);

		box1 = new CustomModelRenderer(this, 69, 5, 256, 128);
		box1.addBox(0F, 0F, 0F, 10, 1, 1);
		box1.setPosition(-5F, 3F, -22F);

		box10 = new CustomModelRenderer(this, 1, 63, 256, 128);
		box10.addBox(0F, 0F, 0F, 8, 1, 6);
		box10.setPosition(-4F, 13F, -21F);

		box11 = new CustomModelRenderer(this, 4, 55, 256, 128);
		box11.addBox(0F, 0F, 0F, 6, 6, 1);
		box11.setPosition(-3F, 8F, -22F);
		box11.rotateAngleX = -5.951572749300664F;

		box12 = new CustomModelRenderer(this, 27, 61, 256, 128);
		box12.addBox(0F, 0F, 0F, 6, 8, 1);
		box12.setPosition(-3F, 14F, -16F);
		box12.rotateAngleX = -3.839724354387525F;

		box13 = new CustomModelRenderer(this, 219, 103, 256, 128);
		box13.addBox(0F, 0F, 0F, 12, 4, 1);
		box13.setPosition(-6F, 9F, 13F);

		box14 = new CustomModelRenderer(this, 71, 66, 256, 128);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setPosition(-8F, 2F, 16F);

		box15 = new CustomModelRenderer(this, 69, 5, 256, 128);
		box15.addBox(0F, 0F, 0F, 10, 1, 1);
		box15.setPosition(-5F, 3F, 21F);

		box16 = new CustomModelRenderer(this, 219, 103, 256, 128);
		box16.addBox(0F, 0F, 0F, 12, 4, 1);
		box16.setPosition(-6F, 9F, 15F);

		box17 = new CustomModelRenderer(this, 77, 37, 256, 128);
		box17.addBox(0F, 0F, 0F, 4, 2, 4);
		box17.setPosition(-2F, 4F, -19F);

		box18 = new CustomModelRenderer(this, 216, 108, 256, 128);
		box18.addBox(0F, 0F, 0F, 4, 6, 13);
		box18.setPosition(-6F, 8F, 8F);

		box19 = new CustomModelRenderer(this, 216, 108, 256, 128);
		box19.addBox(0F, 0F, 0F, 4, 6, 13);
		box19.setPosition(2F, 8F, 8F);

		box2 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(-6F, 0F, -24F);

		box20 = new CustomModelRenderer(this, 217, 82, 256, 128);
		box20.addBox(0F, 0F, 0F, 4, 4, 11);
		box20.setPosition(-2F, 10F, 9F);

		box21 = new CustomModelRenderer(this, 44, 63, 256, 128);
		box21.addBox(0F, 0F, 0F, 8, 6, 1);
		box21.setPosition(-4F, 8F, -10F);

		box22 = new CustomModelRenderer(this, 77, 37, 256, 128);
		box22.addBox(0F, 0F, 0F, 4, 2, 4);
		box22.setPosition(-2F, 4F, 15F);

		box23 = new CustomModelRenderer(this, 219, 76, 256, 128);
		box23.addBox(0F, 0F, 0F, 12, 5, 0);
		box23.setPosition(-6F, 9F, 22F);

		box24 = new CustomModelRenderer(this, 179, 73, 256, 128);
		box24.addBox(0F, 0F, 0F, 14, 5, 0);
		box24.setPosition(-7F, 9F, 23F);

		box28 = new CustomModelRenderer(this, 1, 94, 256, 128);
		box28.addBox(0F, 0F, 0F, 1, 5, 22);
		box28.setPosition(-4F, 1F, -11F);

		box3 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 6, 14);
		box3.setPosition(5F, 0F, -24F);

		box30 = new CustomModelRenderer(this, 1, 94, 256, 128);
		box30.addBox(0F, 0F, 0F, 1, 5, 22);
		box30.setPosition(3F, 1F, -11F);

		box31 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box31.addBox(0F, 0F, 0F, 1, 6, 14);
		box31.setPosition(-6F, 0F, 10F);

		box32 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box32.addBox(0F, 0F, 0F, 1, 4, 10);
		box32.setPosition(-7F, 1F, 12F);

		box4 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box4.addBox(0F, 0F, 0F, 1, 4, 10);
		box4.setPosition(-7F, 1F, -22F);

		box41 = new CustomModelRenderer(this, 14, 75, 256, 128);
		box41.addBox(0F, 0F, 0F, 18, 2, 48);
		box41.setPosition(-9F, 6F, -24F);

		box43 = new CustomModelRenderer(this, 73, 23, 256, 128);
		box43.addBox(0F, 0F, 0F, 4, 2, 9);
		box43.setPosition(-2F, 5F, -28F);

		box49 = new CustomModelRenderer(this, 133, 9, 256, 128);
		box49.addBox(0F, 0F, 0F, 14, 18, 46);
		box49.setPosition(-7F, 14F, -23F);

		box5 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box5.addBox(0F, 0F, 0F, 1, 4, 10);
		box5.setPosition(6F, 1F, -22F);

		box6 = new CustomModelRenderer(this, 71, 66, 256, 128);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setPosition(-8F, 2F, -18F);

		box7 = new CustomModelRenderer(this, 69, 4, 256, 128);
		box7.addBox(0F, 0F, 0F, 10, 1, 1);
		box7.setPosition(-5F, 3F, -13F);

		box8 = new CustomModelRenderer(this, 69, 1, 256, 128);
		box8.addBox(0F, 0F, 0F, 10, 1, 1);
		box8.setPosition(-5F, 3F, 12F);

		box9 = new CustomModelRenderer(this, 42, 23, 256, 128);
		box9.addBox(0F, 0F, 0F, 4, 2, 9);
		box9.setPosition(-2F, 5F, 19F);
		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box22,box23,box24,box28,
				box30,box31,box32,box41,box43,box49
		};

		fixRotation(bodyModel);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		box49.showModel=false;
		box23.showModel=false;
		box24.showModel=false;
		box20.showModel=false;
		box21.showModel=false;
		box18.showModel=false;
		box19.showModel=false;
		box16.showModel=false;
		box10.showModel=false;
		box11.showModel=false;
		box12.showModel=false;
		box13.showModel=false;
		
		int cargo = 0;

		for (ItemStackSlot s : ((GenericRailTransport) entity).inventory){
			if(s.getStack()!=null){
				cargo++;
			}
		}
		if(cargo != 0) {
    		box49.showModel=true;
    		box23.showModel=true;
    		box24.showModel=true;
    		box20.showModel=true;
    		box21.showModel=true;
    		box18.showModel=true;
    		box19.showModel=true;
    		box16.showModel=true;
    		box10.showModel=true;
    		box11.showModel=true;
    		box12.showModel=true;
    		box13.showModel=true;
		}

		super.render(entity, f, f1, f2, f3, f4, f5);
	}

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
	public CustomModelRenderer box28;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box4;
	public CustomModelRenderer box41;
	public CustomModelRenderer box43;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
