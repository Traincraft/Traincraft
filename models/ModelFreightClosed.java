package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelFreightClosed extends ModelBase {

	public ModelFreightClosed() {

		bogey = new ModelRendererTurbo(this, 2, 9, 256, 128);
		bogey.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey.setPosition(-6F, 0F, -18F);

		bogey0 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		bogey0.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey0.setPosition(5F, 0F, -18F);

		box = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(6F, 0F, -18F);

		box0 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 6, 14);
		box0.setPosition(-7F, 0F, -18F);

		box1 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 6, 14);
		box1.setPosition(-7F, 0F, 5F);

		box2 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(6F, 0F, 5F);

		box3 = new ModelRendererTurbo(this, 151, 57, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 21, 35);
		box3.setPosition(7F, 9F, -17F);

		box4 = new ModelRendererTurbo(this, 115, 68, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 22, 1);
		box4.setPosition(-7F, 9F, -17F);

		box5 = new ModelRendererTurbo(this, 155, 1, 256, 128);
		box5.addBox(0F, 0F, 0F, 9, 1, 37);
		box5.setPosition(0F, 31F, 19F);
		box5.rotateAngleY = 3.141592653589793F;
		box5.rotateAngleZ = 0.13962634015954636F;

		box52 = new ModelRendererTurbo(this, 65, 44, 256, 128);
		box52.addBox(0F, 0F, 0F, 14, 1, 1);
		box52.setPosition(-7F, 5F, -4F);

		box53 = new ModelRendererTurbo(this, 65, 44, 256, 128);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setPosition(-7F, 5F, -19F);

		box54 = new ModelRendererTurbo(this, 31, 33, 256, 128);
		box54.addBox(0F, 0F, 0F, 4, 2, 4);
		box54.setPosition(-2F, 7F, 19F);

		box55 = new ModelRendererTurbo(this, 2, 33, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 3, 4);
		box55.setPosition(-2F, 4F, -13F);

		box6 = new ModelRendererTurbo(this, 189, 68, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 22, 1);
		box6.setPosition(-7F, 9F, 17F);

		box68 = new ModelRendererTurbo(this, 29, 40, 256, 128);
		box68.addBox(0F, 0F, 0F, 4, 2, 4);
		box68.setPosition(-2F, 7F, -22F);

		box7 = new ModelRendererTurbo(this, 97, 0, 256, 128);
		box7.addBox(0F, 0F, 0F, 9, 1, 37);
		box7.setPosition(0F, 31F, -18F);
		box7.rotateAngleZ = -0.13962634015954636F;

		box71 = new ModelRendererTurbo(this, 66, 47, 256, 128);
		box71.addBox(0F, 0F, 0F, 12, 2, 2);
		box71.setPosition(-6F, 2F, -12F);

		box72 = new ModelRendererTurbo(this, 64, 44, 256, 128);
		box72.addBox(0F, 0F, 0F, 14, 1, 1);
		box72.setPosition(-7F, 5F, 4F);

		box73 = new ModelRendererTurbo(this, 65, 44, 256, 128);
		box73.addBox(0F, 0F, 0F, 14, 1, 1);
		box73.setPosition(-7F, 5F, 19F);

		box78 = new ModelRendererTurbo(this, 77, 57, 256, 128);
		box78.addBox(0F, 0F, 0F, 1, 21, 35);
		box78.setPosition(-8F, 9F, -17F);

		box79 = new ModelRendererTurbo(this, 3, 89, 256, 128);
		box79.addBox(0F, 0F, 0F, 18, 2, 37);
		box79.setPosition(-9F, 7F, -18F);

		box8 = new ModelRendererTurbo(this, 2, 33, 256, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 4);
		box8.setPosition(-2F, 4F, 10F);

		box80 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		box80.addBox(0F, 0F, 0F, 1, 6, 14);
		box80.setPosition(-6F, 0F, 5F);

		box81 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		box81.addBox(0F, 0F, 0F, 1, 6, 14);
		box81.setPosition(5F, 0F, 5F);

		box82 = new ModelRendererTurbo(this, 66, 47, 256, 128);
		box82.addBox(0F, 0F, 0F, 12, 2, 2);
		box82.setPosition(-6F, 2F, 11F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}*/
		bogey.render(f5);
		bogey0.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box6.render(f5);
		box68.render(f5);
		box7.render(f5);
		box71.render(f5);
		box72.render(f5);
		box73.render(f5);
		box78.render(f5);
		box79.render(f5);
		box8.render(f5);
		box80.render(f5);
		box81.render(f5);
		box82.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public ModelRendererTurbo bogey;
	public ModelRendererTurbo bogey0;
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box68;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box71;
	public ModelRendererTurbo box72;
	public ModelRendererTurbo box73;
	public ModelRendererTurbo box78;
	public ModelRendererTurbo box79;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box80;
	public ModelRendererTurbo box81;
	public ModelRendererTurbo box82;
}
