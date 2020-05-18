package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelLights;

public class ModelJukeBox extends ModelBase {
	
	private ModelLights lights;

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
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box35;
	public CustomModelRenderer box38;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box42;
	public CustomModelRenderer box44;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box63;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelJukeBox() {
		
		lights = new ModelLights();
		
		box = new CustomModelRenderer(this, 70, 25, 256, 128);
		box.addBox(0F, 0F, 0F, 8, 4, 4);
		box.setPosition(-5F, 2F, 0F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-23F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 188, 12, 256, 128);
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

		box15 = new CustomModelRenderer(this, 38, 3, 256, 128);
		box15.addBox(0F, -2F, 1F, 9, 8, 8);
		box15.setPosition(1F, 11F, -10F);
		box15.rotateAngleY = -0.10471975511965978F;

		box16 = new CustomModelRenderer(this, 116, 2, 256, 128);
		box16.addBox(-2F, 0F, 0F, 9, 1, 8);
		box16.setPosition(-9F, 17F, -10F);

		box17 = new CustomModelRenderer(this, 143, 2, 256, 128);
		box17.addBox(0F, 0F, 4F, 1, 1, 6);
		box17.setPosition(-2F, 18F, -13F);
		box17.rotateAngleX = -6.213372137099813F;
		box17.rotateAngleY = -0.4014257279586958F;

		box18 = new CustomModelRenderer(this, 4, 3, 256, 128);
		box18.addBox(0F, -2F, 0F, 9, 8, 8);
		box18.setPosition(-10F, 11F, -10F);
		box18.rotateAngleY = -0.05235987755982989F;

		box19 = new CustomModelRenderer(this, 8, 59, 256, 128);
		box19.addBox(0F, 0F, 0F, 10, 12, 8);
		box19.setPosition(15F, 9F, -10F);
		box19.rotateAngleY = -0.5061454830783556F;

		box2 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(15F, 2F, -7F);

		box20 = new CustomModelRenderer(this, 187, 68, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 5, 16);
		box20.setPosition(-28F, 6F, -8F);

		box21 = new CustomModelRenderer(this, 8, 59, 256, 128);
		box21.addBox(0F, 0F, 0F, 10, 12, 8);
		box21.setPosition(-24F, 9F, -5F);
		box21.rotateAngleY = -5.916666164260777F;

		box22 = new CustomModelRenderer(this, 6, 41, 256, 128);
		box22.addBox(0F, 0F, 0F, 5, 6, 9);
		box22.setPosition(-21F, 21F, 2F);
		box22.rotateAngleY = -4.4505895925855405F;

		box23 = new CustomModelRenderer(this, 6, 41, 256, 128);
		box23.addBox(0F, 0F, 0F, 5, 6, 9);
		box23.setPosition(12F, 21F, -2F);
		box23.rotateAngleY = -5.009094953223726F;

		box24 = new CustomModelRenderer(this, 0, 83, 256, 128);
		box24.addBox(0F, 0F, 0F, 52, 1, 20);
		box24.setPosition(-26F, 8F, -10F);

		box25 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new CustomModelRenderer(this, 104, 42, 256, 128);
		box26.addBox(0F, 0F, 0F, 54, 3, 22);
		box26.setPosition(-27F, 5F, -11F);

		box27 = new CustomModelRenderer(this, 65, 54, 256, 128);
		box27.addBox(0F, 0F, 0F, 2, 15, 5);
		box27.setPosition(-19F, 9F, 2F);
		box27.rotateAngleY = -4.380776422505767F;

		box29 = new CustomModelRenderer(this, 81, 37, 256, 128);
		box29.addBox(0F, 0F, 0F, 9, 1, 8);
		box29.setPosition(1F, 17F, -8F);
		box29.rotateAngleY = -0.08726646259971647F;

		box3 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-17F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 81, 37, 256, 128);
		box30.addBox(0F, 0F, 0F, 9, 1, 8);
		box30.setPosition(1F, 18F, -8F);
		box30.rotateAngleX = -6.178465552059927F;
		box30.rotateAngleY = -0.08726646259971647F;

		box31 = new CustomModelRenderer(this, 49, 54, 256, 128);
		box31.addBox(0F, 0F, 0F, 2, 15, 5);
		box31.setPosition(13F, 9F, -1F);
		box31.rotateAngleY = -5.078908123303499F;
		box31.rotateAngleZ = -0.017453292519943295F;

		box35 = new CustomModelRenderer(this, 188, 12, 256, 128);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(12F, 0F, 5F);

		box38 = new CustomModelRenderer(this, 146, 80, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box4 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-23F, 1F, 5F);

		box40 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box42 = new CustomModelRenderer(this, 138, 80, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box44 = new CustomModelRenderer(this, 158, 77, 256, 128);
		box44.addBox(0F, 0F, 0F, 2, 3, 4);
		box44.setPosition(-30F, 6F, -2F);

		box5 = new CustomModelRenderer(this, 188, 12, 256, 128);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(12F, 0F, -5F);

		box6 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(9F, 1F, 5F);

		box63 = new CustomModelRenderer(this, 188, 12, 256, 128);
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
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
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
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.1f, 0.6f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0, 0.6f, -0.71f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(1.1f, 0.6f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.1f, 0.6f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0, 0.6f, 0.71f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(1.1f, 0.6f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
		}
		
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
