package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelStockCar extends ModelBase {

	public ModelStockCar() {
		box = new ModelRendererTurbo(this, 1, 24, 150, 150);
		box.addBox(0F, 0F, 0F, 9, 4, 18);
		box.setPosition(-5F, 1F, -9F);
		box0 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box0.addBox(0F, 0F, 0F, 6, 6, 1);
		box0.setPosition(-20F, -1F, -7F);
		box1 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-13F, -1F, -7F);
		box10 = new ModelRendererTurbo(this, 47, 33, 150, 150);
		box10.addBox(0F, 0F, 0F, 1, 2, 14);
		box10.setPosition(-22F, 29F, -7F);
		box11 = new ModelRendererTurbo(this, 78, 30, 150, 150);
		box11.addBox(0F, 0F, 0F, 1, 22, 20);
		box11.setPosition(-22F, 7F, -10F);
		box12 = new ModelRendererTurbo(this, 115, 78, 150, 150);
		box12.addBox(0F, 0F, 0F, 15, 23, 1);
		box12.setPosition(5F, 7F, -10F);
		box13 = new ModelRendererTurbo(this, 121, 31, 150, 150);
		box13.addBox(0F, 0F, 0F, 12, 20, 1);
		box13.setPosition(-7F, 7F, 10F);
		box14 = new ModelRendererTurbo(this, 94, 25, 150, 150);
		box14.addBox(0F, 0F, 0F, 26, 3, 1);
		box14.setPosition(-8F, 27F, 10F);
		box15 = new ModelRendererTurbo(this, 1, 96, 150, 150);
		box15.addBox(0F, 0F, 0F, 15, 4, 12);
		box15.setPosition(-21F, 1F, -6F);
		box16 = new ModelRendererTurbo(this, 3, 118, 150, 150);
		box16.addBox(0F, 0F, 0F, 9, 2, 1);
		box16.setPosition(-18F, 1F, -8F);
		box17 = new ModelRendererTurbo(this, 3, 118, 150, 150);
		box17.addBox(0F, 0F, 0F, 9, 2, 1);
		box17.setPosition(-18F, 1F, 7F);
		box18 = new ModelRendererTurbo(this, 3, 118, 150, 150);
		box18.addBox(0F, 0F, 0F, 9, 2, 1);
		box18.setPosition(8F, 1F, 7F);
		box19 = new ModelRendererTurbo(this, 3, 118, 150, 150);
		box19.addBox(0F, 0F, 0F, 9, 2, 1);
		box19.setPosition(8F, 1F, -8F);
		box2 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-13F, -1F, 6F);
		box20 = new ModelRendererTurbo(this, 110, 4, 150, 150);
		box20.addBox(0F, 0F, 0F, 10, 10, 1);
		box20.setPosition(-18F, 15F, 10F);
		box21 = new ModelRendererTurbo(this, 3, 58, 150, 150);
		box21.addBox(0F, 0F, 0F, 3, 2, 2);
		box21.setPosition(20F, 2F, -1F);
		box22 = new ModelRendererTurbo(this, 115, 78, 150, 150);
		box22.addBox(0F, 0F, 0F, 15, 23, 1);
		box22.setPosition(-21F, 7F, -10F);
		box23 = new ModelRendererTurbo(this, 121, 31, 150, 150);
		box23.addBox(0F, 0F, 0F, 12, 20, 1);
		box23.setPosition(-7F, 7F, -11F);
		box24 = new ModelRendererTurbo(this, 94, 25, 150, 150);
		box24.addBox(0F, 0F, 0F, 26, 3, 1);
		box24.setPosition(-8F, 27F, -11F);
		box25 = new ModelRendererTurbo(this, 3, 58, 150, 150);
		box25.addBox(0F, 0F, 0F, 3, 2, 2);
		box25.setPosition(-24F, 2F, -1F);
		box26 = new ModelRendererTurbo(this, 8, 84, 150, 150);
		box26.addBox(0F, -1F, 0F, 43, 1, 9);
		box26.setPosition(-22F, 29F, 10F);
		box26.rotateAngleX = -2.792526803190927F;
		box27 = new ModelRendererTurbo(this, 115, 78, 150, 150);
		box27.addBox(0F, 0F, 0F, 15, 23, 1);
		box27.setPosition(5F, 7F, 9F);
		box28 = new ModelRendererTurbo(this, 110, 4, 150, 150);
		box28.addBox(0F, 0F, 0F, 10, 10, 1);
		box28.setPosition(-18F, 15F, -11F);
		box3 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-20F, -1F, 6F);
		box38 = new ModelRendererTurbo(this, 47, 33, 150, 150);
		box38.addBox(0F, 0F, 0F, 1, 2, 14);
		box38.setPosition(20F, 29F, -7F);
		box4 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(13F, -1F, -7F);
		box40 = new ModelRendererTurbo(this, 14, 75, 150, 150);
		box40.addBox(0F, 0F, 0F, 43, 1, 4);
		box40.setPosition(-22F, 32F, -2F);
		box42 = new ModelRendererTurbo(this, 78, 30, 150, 150);
		box42.addBox(0F, 0F, 0F, 1, 22, 20);
		box42.setPosition(20F, 7F, -10F);
		box44 = new ModelRendererTurbo(this, 115, 78, 150, 150);
		box44.addBox(0F, 0F, 0F, 15, 23, 1);
		box44.setPosition(-21F, 7F, 9F);
		box45 = new ModelRendererTurbo(this, 8, 84, 150, 150);
		box45.addBox(0F, 0F, 0F, 43, 1, 9);
		box45.setPosition(-22F, 29F, -10F);
		box45.rotateAngleX = -0.3490658503988659F;
		box5 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box5.addBox(0F, 0F, 0F, 6, 6, 1);
		box5.setPosition(6F, -1F, -7F);
		box6 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box6.addBox(0F, 0F, 0F, 6, 6, 1);
		box6.setPosition(6F, -1F, 6F);
		box7 = new ModelRendererTurbo(this, 2, 66, 150, 150);
		box7.addBox(0F, 0F, 0F, 6, 6, 1);
		box7.setPosition(13F, -1F, 6F);
		box8 = new ModelRendererTurbo(this, 1, 96, 150, 150);
		box8.addBox(0F, 0F, 0F, 15, 4, 12);
		box8.setPosition(5F, 1F, -6F);
		box9 = new ModelRendererTurbo(this, 0, 1, 150, 150);
		box9.addBox(0F, 0F, 0F, 43, 2, 20);
		box9.setPosition(-22F, 5F, -10F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}*/
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
		box28.render(f5);
		box3.render(f5);
		box38.render(f5);
		box4.render(f5);
		box40.render(f5);
		box42.render(f5);
		box44.render(f5);
		box45.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box23;
	public ModelRendererTurbo box24;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box26;
	public ModelRendererTurbo box27;
	public ModelRendererTurbo box28;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box38;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box40;
	public ModelRendererTurbo box42;
	public ModelRendererTurbo box44;
	public ModelRendererTurbo box45;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;

}
