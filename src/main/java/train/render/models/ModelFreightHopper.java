package train.render.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import train.render.CustomModelRenderer;

public class ModelFreightHopper extends ModelBase {
	
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
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelFreightHopper() {
		box = new CustomModelRenderer(this, 10, 1, 128, 128);
		box.addBox(0F, 0F, 0F, 4, 3, 3);
		box.setPosition(13F, 1F, -7F);

		box0 = new CustomModelRenderer(this, 48, 34, 128, 128);
		box0.addBox(0F, 0F, 0F, 25, 6, 14);
		box0.setPosition(-23F, 18F, -7F);
		box0.rotateAngleZ = -0.6632251157578453F;

		box1 = new CustomModelRenderer(this, 7, 2, 128, 128);
		box1.addBox(0F, 0F, 0F, 7, 3, 4);
		box1.setPosition(23F, 6F, -2F);

		box10 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box10.addBox(0F, 0F, 0F, 2, 2, 10);
		box10.setPosition(-12F, 2F, -5F);

		box11 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 2, 10);
		box11.setPosition(-22F, 2F, -5F);

		box12 = new CustomModelRenderer(this, 3, 2, 128, 128);
		box12.addBox(0F, 0F, 0F, 4, 3, 3);
		box12.setPosition(-17F, 1F, 4F);

		box13 = new CustomModelRenderer(this, 5, 2, 128, 128);
		box13.addBox(0F, 0F, 0F, 4, 3, 3);
		box13.setPosition(-17F, 1F, -7F);

		box14 = new CustomModelRenderer(this, 63, 59, 128, 128);
		box14.addBox(0F, 0F, 0F, 7, 7, 1);
		box14.setPosition(-22F, 18F, 7F);

		box15 = new CustomModelRenderer(this, 1, 14, 128, 128);
		box15.addBox(0F, 0F, 0F, 46, 1, 16);
		box15.setPosition(-23F, 7F, -8F);

		box16 = new CustomModelRenderer(this, 7, 2, 128, 128);
		box16.addBox(0F, 0F, 0F, 2, 1, 4);
		box16.setPosition(21F, 6F, -2F);

		box17 = new CustomModelRenderer(this, 63, 59, 128, 128);
		box17.addBox(0F, 0F, 0F, 7, 7, 1);
		box17.setPosition(-15F, 18F, -7F);
		box17.rotateAngleY = -3.141592653589793F;

		box18 = new CustomModelRenderer(this, 63, 59, 128, 128);
		box18.addBox(0F, 0F, 0F, 7, 7, 1);
		box18.setPosition(22F, 18F, -7F);
		box18.rotateAngleY = -3.141592653589793F;

		box19 = new CustomModelRenderer(this, 0, 55, 128, 128);
		box19.addBox(0F, 0F, 0F, 30, 17, 1);
		box19.setPosition(-15F, 8F, -8F);

		box2 = new CustomModelRenderer(this, 0, 92, 128, 128);
		box2.addBox(0F, 0F, 0F, 48, 7, 12);
		box2.setPosition(-24F, 0F, -6F);

		box20 = new CustomModelRenderer(this, 0, 55, 128, 128);
		box20.addBox(0F, 0F, 0F, 30, 17, 1);
		box20.setPosition(15F, 8F, 8F);
		box20.rotateAngleY = -3.141592653589793F;

		box21 = new CustomModelRenderer(this, 17, 32, 128, 128);
		box21.addBox(0F, 0F, 0F, 1, 7, 14);
		box21.setPosition(-22F, 18F, 7F);
		box21.rotateAngleY = -3.141592653589793F;

		box22 = new CustomModelRenderer(this, 17, 32, 128, 128);
		box22.addBox(0F, 0F, 0F, 1, 7, 14);
		box22.setPosition(22F, 18F, -7F);

		box23 = new CustomModelRenderer(this, 1, 1, 128, 128);
		box23.addBox(0F, 0F, 0F, 7, 3, 4);
		box23.setPosition(-30F, 6F, -2F);

		box24 = new CustomModelRenderer(this, 7, 2, 128, 128);
		box24.addBox(0F, 0F, 0F, 2, 1, 4);
		box24.setPosition(-23F, 6F, -2F);

		box25 = new CustomModelRenderer(this, 0, 111, 128, 128);
		box25.addBox(0F, 0F, 0F, 48, 7, 10);
		box25.setPosition(-24F, 0F, -5F);

		box26 = new CustomModelRenderer(this, 2, 76, 128, 128);
		box26.addBox(0F, 0F, 0F, 44, 1, 14);
		box26.setPosition(-22F, 22F, -7F);

		box27 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box27.addBox(0F, 0F, 0F, 1, 17, 1);
		box27.setPosition(22F, 8F, 7F);

		box28 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box28.addBox(0F, 0F, 0F, 1, 17, 1);
		box28.setPosition(22F, 8F, -8F);

		box29 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box29.addBox(0F, 0F, 0F, 1, 17, 1);
		box29.setPosition(-23F, 8F, -8F);

		box3 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 10);
		box3.setPosition(20F, 2F, -5F);

		box30 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box30.addBox(0F, 0F, 0F, 1, 17, 1);
		box30.setPosition(-23F, 8F, 7F);

		box31 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box31.addBox(0F, 0F, 0F, 1, 10, 1);
		box31.setPosition(-23F, 8F, 2F);

		box32 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box32.addBox(0F, 0F, 0F, 1, 10, 1);
		box32.setPosition(-23F, 8F, -3F);

		box33 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box33.addBox(0F, 0F, 0F, 1, 10, 1);
		box33.setPosition(22F, 8F, 2F);

		box34 = new CustomModelRenderer(this, 121, 102, 128, 128);
		box34.addBox(0F, 0F, 0F, 1, 10, 1);
		box34.setPosition(22F, 8F, -3F);

		box35 = new CustomModelRenderer(this, 2, 31, 128, 128);
		box35.addBox(0F, 0F, 0F, 4, 22, 1);
		box35.setPosition(-21F, 3F, 8F);

		box36 = new CustomModelRenderer(this, 2, 31, 128, 128);
		box36.addBox(0F, 0F, 0F, 4, 22, 1);
		box36.setPosition(21F, 3F, -8F);
		box36.rotateAngleY = -3.141592653589793F;

		box4 = new CustomModelRenderer(this, 1, 0, 128, 128);
		box4.addBox(0F, 0F, 0F, 12, 3, 8);
		box4.setPosition(-21F, 4F, -4F);

		box5 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box5.addBox(0F, 0F, 0F, 2, 2, 10);
		box5.setPosition(10F, 2F, -5F);

		box6 = new CustomModelRenderer(this, 48, 34, 128, 128);
		box6.addBox(0F, 0F, 0F, 25, 6, 14);
		box6.setPosition(23F, 18F, 7F);
		box6.rotateAngleY = 3.141592653589793F;
		box6.rotateAngleZ = -0.6632251157578453F;

		box7 = new CustomModelRenderer(this, 63, 59, 128, 128);
		box7.addBox(0F, 0F, 0F, 7, 7, 1);
		box7.setPosition(15F, 18F, 7F);

		box8 = new CustomModelRenderer(this, 6, 2, 128, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 3);
		box8.setPosition(13F, 1F, 4F);

		box9 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box9.addBox(0F, 0F, 0F, 12, 3, 8);
		box9.setPosition(9F, 4F, -4F);

		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box22,box23,box24,box25,box27,box28,box29,
				box30,box31,box32,box33,box34,box35,box36
		};
		fixRotation(bodyModel,false,false,true);
		fixRotation(bodyModel);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		int cargo = 0;

		for (ItemStackSlot s : ((GenericRailTransport) entity).inventory){
			if(s.getStack()!=null){
				cargo++;
			}
		}
		if (cargo != 0) {
			if(cargo<=16) {
    			GL11.glPushMatrix();
    			GL11.glTranslatef(0, -0.86f+cargo*0.033f, 0);
    			GL11.glScalef(1.0f-((((GenericRailTransport) entity).getInventoryRows()*9)-cargo)*0.0168f, 1, 1);
    			box26.render(f5);
    			GL11.glPopMatrix();
			}
			else {
				GL11.glPushMatrix();
				GL11.glTranslatef(0, -0.86f+cargo*0.033f, 0);
				box26.render(f5);
				GL11.glPopMatrix();
			}
		}

		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}