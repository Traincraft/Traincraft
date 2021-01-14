package train.render.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;

public class ModelFreightCenterBeam_Wood_2 extends ModelBase {

	public ModelFreightCenterBeam_Wood_2() {
		box = new CustomModelRenderer(this, 1, 7, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(5F, 0F, 10F);

		box0 = new CustomModelRenderer(this, 4, 29, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 4, 10);
		box0.setPosition(6F, 1F, 12F);

		box1 = new CustomModelRenderer(this, 22, 2, 256, 128);
		box1.addBox(0F, 0F, 0F, 10, 1, 1);
		box1.setPosition(-5F, 3F, -22F);

		box10 = new CustomModelRenderer(this, 84, 22, 256, 128);
		box10.addBox(0F, 0F, 0F, 1, 2, 48);
		box10.setPosition(3F, 4F, -24F);

		box11 = new CustomModelRenderer(this, 84, 22, 256, 128);
		box11.addBox(0F, 0F, 0F, 1, 2, 48);
		box11.setPosition(-4F, 4F, -24F);

		box12 = new CustomModelRenderer(this, 84, 27, 256, 128);
		box12.addBox(0F, 0F, 0F, 2, 22, 46);
		box12.setPosition(-1F, 8F, -23F);

		box13 = new CustomModelRenderer(this, 0, 0, 256, 128);
		box13.addBox(0F, 0F, 0F, 8, 1, 48);
		box13.setPosition(-4F, 30F, -24F);

		box14 = new CustomModelRenderer(this, 6, 88, 256, 128);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setPosition(-8F, 2F, 16F);

		box15 = new CustomModelRenderer(this, 22, 2, 256, 128);
		box15.addBox(0F, 0F, 0F, 10, 1, 1);
		box15.setPosition(-5F, 3F, 21F);

		box16 = new CustomModelRenderer(this, 65, 1, 256, 128);
		box16.addBox(0F, 0F, 0F, 18, 22, 1);
		box16.setPosition(-9F, 8F, 23F);

		box17 = new CustomModelRenderer(this, 29, 37, 256, 128);
		box17.addBox(0F, 0F, 0F, 4, 2, 4);
		box17.setPosition(-2F, 4F, -19F);

		box18 = new CustomModelRenderer(this, 64, 25, 256, 128);
		box18.addBox(0F, 0F, 0F, 18, 22, 1);
		box18.setPosition(-9F, 8F, -24F);

		box19 = new CustomModelRenderer(this, 136, 5, 256, 128);
		box19.addBox(0F, 0F, 0F, 6, 20, 44);
		box19.setPosition(-8F, 8F, -22F);

		box2 = new CustomModelRenderer(this, 1, 7, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(-6F, 0F, -24F);

		box20 = new CustomModelRenderer(this, 136, 5, 256, 128);
		box20.addBox(0F, 0F, 0F, 6, 20, 44);
		box20.setPosition(2F, 8F, -22F);

		box22 = new CustomModelRenderer(this, 29, 37, 256, 128);
		box22.addBox(0F, 0F, 0F, 4, 2, 4);
		box22.setPosition(-2F, 4F, 15F);

		box3 = new CustomModelRenderer(this, 1, 7, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 6, 14);
		box3.setPosition(5F, 0F, -24F);

		box31 = new CustomModelRenderer(this, 1, 7, 256, 128);
		box31.addBox(0F, 0F, 0F, 1, 6, 14);
		box31.setPosition(-6F, 0F, 10F);

		box32 = new CustomModelRenderer(this, 4, 29, 256, 128);
		box32.addBox(0F, 0F, 0F, 1, 4, 10);
		box32.setPosition(-7F, 1F, 12F);

		box4 = new CustomModelRenderer(this, 4, 29, 256, 128);
		box4.addBox(0F, 0F, 0F, 1, 4, 10);
		box4.setPosition(-7F, 1F, -22F);

		box41 = new CustomModelRenderer(this, 0, 49, 256, 128);
		box41.addBox(0F, 0F, 0F, 18, 2, 48);
		box41.setPosition(-9F, 6F, -24F);

		box43 = new CustomModelRenderer(this, 3, 61, 256, 128);
		box43.addBox(0F, 0F, 0F, 4, 2, 9);
		box43.setPosition(-2F, 5F, -28F);

		box5 = new CustomModelRenderer(this, 4, 29, 256, 128);
		box5.addBox(0F, 0F, 0F, 1, 4, 10);
		box5.setPosition(6F, 1F, -22F);

		box6 = new CustomModelRenderer(this, 6, 88, 256, 128);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setPosition(-8F, 2F, -18F);

		box7 = new CustomModelRenderer(this, 22, 2, 256, 128);
		box7.addBox(0F, 0F, 0F, 10, 1, 1);
		box7.setPosition(-5F, 3F, -13F);

		box8 = new CustomModelRenderer(this, 22, 2, 256, 128);
		box8.addBox(0F, 0F, 0F, 10, 1, 1);
		box8.setPosition(-5F, 3F, 12F);

		box9 = new CustomModelRenderer(this, 3, 49, 256, 128);
		box9.addBox(0F, 0F, 0F, 4, 2, 9);
		box9.setPosition(-2F, 5F, 19F);

		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box22,box31,box32,box41,box43
		};

		fixRotation(bodyModel);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box19.showModel=false;
		box20.showModel=false;
		
		//freight
		int cargo = 0;

		for (ItemStackSlot s : ((GenericRailTransport) entity).inventory){
			if(s.getStack()!=null){
				cargo++;
			}
		}
		if(cargo != 0) {
			//GL11.glPushMatrix();
			//GL11.glScalef(1, 0.0f+((Freight)entity).getAmmountOfCargo()*0.0194f, 1);
			//GL11.glTranslatef(0, 0.0f+(((Freight)entity).getSizeInventory()-((Freight)entity).getAmmountOfCargo())*0.5f, 0);
			//System.out.println(((Freight)entity).getSizeInventory()-((Freight)entity).getAmmountOfCargo());
    		box19.showModel=true;
    		box20.showModel=true;
    		//GL11.glPopMatrix();
		}

		super.render(entity, f, f1, f2, f3, f4, f5);

	}

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
	public CustomModelRenderer box22;
	public CustomModelRenderer box3;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box4;
	public CustomModelRenderer box41;
	public CustomModelRenderer box43;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;
}
