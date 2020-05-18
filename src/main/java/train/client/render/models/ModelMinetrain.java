package train.client.render.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelMinetrain extends ModelBase {
	
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

	public ModelMinetrain() {
		box = new CustomModelRenderer(this, 47, 47, 64, 64);
		box.addBox(0F, 0F, 0F, 1, 6, 2);
		box.setPosition(-9F, 5F, -1F);

		box0 = new CustomModelRenderer(this, 47, 47, 64, 64);
		box0.addBox(0F, 0F, 0F, 1, 6, 2);
		box0.setPosition(8F, 5F, -1F);

		box1 = new CustomModelRenderer(this, 0, 58, 64, 64);
		box1.addBox(0F, 0F, 0F, 5, 5, 1);
		box1.setPosition(7F, 0F, -4F);
		box1.rotateAngleY = -3.141592653589793F;

		box10 = new CustomModelRenderer(this, 1, 25, 64, 64);
		box10.addBox(0F, 0F, 0F, 16, 1, 2);
		box10.setPosition(-8F, 7F, -5F);
		box10.rotateAngleX = -5.742133239061344F;

		box11 = new CustomModelRenderer(this, 0, 16, 64, 64);
		box11.addBox(0F, 0F, 0F, 16, 1, 7);
		box11.setPosition(-8F, 6F, -3F);

		box12 = new CustomModelRenderer(this, 1, 30, 64, 64);
		box12.addBox(0F, 0F, 1F, 1, 8, 7);
		box12.setPosition(8F, 7F, 5F);
		box12.rotateAngleX = -0.24434609527920614F;
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new CustomModelRenderer(this, 33, 25, 64, 64);
		box13.addBox(0F, 0F, 0F, 1, 2, 14);
		box13.setPosition(8F, 15F, 7F);
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new CustomModelRenderer(this, 1, 30, 64, 64);
		box14.addBox(0F, 0F, 1F, 1, 8, 7);
		box14.setPosition(7F, 7F, -5F);
		box14.rotateAngleX = -0.24434609527920614F;

		box15 = new CustomModelRenderer(this, 19, 35, 64, 64);
		box15.addBox(0F, 0F, 0F, 1, 2, 8);
		box15.setPosition(7F, 7F, -4F);

		box16 = new CustomModelRenderer(this, 19, 35, 64, 64);
		box16.addBox(0F, 0F, 0F, 1, 2, 8);
		box16.setPosition(-8F, 7F, -4F);

		box17 = new CustomModelRenderer(this, 1, 30, 64, 64);
		box17.addBox(0F, 0F, 1F, 1, 8, 7);
		box17.setPosition(-8F, 7F, -5F);
		box17.rotateAngleX = -0.24434609527920614F;

		box18 = new CustomModelRenderer(this, 1, 30, 64, 64);
		box18.addBox(0F, 0F, 1F, 1, 8, 7);
		box18.setPosition(-7F, 7F, 5F);
		box18.rotateAngleX = -0.24434609527920614F;
		box18.rotateAngleY = -3.141592653589793F;

		box19 = new CustomModelRenderer(this, 33, 25, 64, 64);
		box19.addBox(0F, 0F, 0F, 1, 2, 14);
		box19.setPosition(-8F, 15F, -7F);

		box2 = new CustomModelRenderer(this, 0, 58, 64, 64);
		box2.addBox(0F, 0F, 0F, 5, 5, 1);
		box2.setPosition(-2F, 0F, 5F);
		box2.rotateAngleY = -3.141592653589793F;

		box20 = new CustomModelRenderer(this, 0, 58, 64, 64);
		box20.addBox(0F, 0F, 0F, 5, 5, 1);
		box20.setPosition(-2F, 0F, -4F);
		box20.rotateAngleY = -3.141592653589793F;

		box21 = new CustomModelRenderer(this, 0, 58, 64, 64);
		box21.addBox(0F, 0F, 0F, 5, 5, 1);
		box21.setPosition(7F, 0F, 5F);
		box21.rotateAngleY = -3.141592653589793F;

		box22 = new CustomModelRenderer(this, 47, 47, 64, 64);
		box22.addBox(0F, 0F, 0F, 1, 2, 6);
		box22.setPosition(2F, 3F, -3F);

		box23 = new CustomModelRenderer(this, 47, 47, 64, 64);
		box23.addBox(0F, 0F, 0F, 1, 2, 6);
		box23.setPosition(-3F, 3F, -3F);

		box24 = new CustomModelRenderer(this, 15, 30, 64, 64);
		box24.addBox(0F, 0F, 0F, 2, 2, 2);
		box24.setPosition(-11F, 3F, -1F);

		box25 = new CustomModelRenderer(this, 15, 30, 64, 64);
		box25.addBox(0F, 0F, 0F, 2, 2, 2);
		box25.setPosition(9F, 3F, -1F);

		box3 = new CustomModelRenderer(this, 23, 59, 64, 64);
		box3.addBox(0F, 0F, 0F, 18, 2, 1);
		box3.setPosition(-9F, 3F, -4F);

		box4 = new CustomModelRenderer(this, 23, 59, 64, 64);
		box4.addBox(0F, 0F, 0F, 18, 2, 1);
		box4.setPosition(-9F, 3F, 3F);
		
		box26 = new CustomModelRenderer(this, -4, 1, 64, 64);
		box26.addBox(0F, 0F, 0F, 16, 1, 13);
		box26.setPosition(-8F, 14F, -6.5F);
		
		box27 = new CustomModelRenderer(this, -4, 1, 64, 64);
		box27.addBox(0F, 0F, 0F, 15, 1, 10);
		box27.setPosition(-8F, 10F, -5F);

		box5 = new CustomModelRenderer(this, 47, 47, 64, 64);
		box5.addBox(0F, 0F, 0F, 2, 2, 6);
		box5.setPosition(-9F, 3F, -3F);

		box6 = new CustomModelRenderer(this, 47, 47, 64, 64);
		box6.addBox(0F, 0F, 0F, 2, 2, 6);
		box6.setPosition(7F, 3F, -3F);

		box7 = new CustomModelRenderer(this, 1, 46, 64, 64);
		box7.addBox(0F, 0F, 0F, 16, 10, 1);
		box7.setPosition(-8F, 7F, -5F);
		box7.rotateAngleX = -0.24434609527920614F;

		box8 = new CustomModelRenderer(this, 1, 46, 64, 64);
		box8.addBox(0F, 0F, 0F, 16, 10, 1);
		box8.setPosition(8F, 7F, 5F);
		box8.rotateAngleX = -0.24434609527920614F;
		box8.rotateAngleY = -3.141592653589793F;

		box9 = new CustomModelRenderer(this, 1, 25, 64, 64);
		box9.addBox(0F, 0F, 0F, 16, 1, 2);
		box9.setPosition(8F, 7F, 5F);
		box9.rotateAngleX = -5.742133239061344F;
		box9.rotateAngleY = -3.141592653589793F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ClientProxy.isHoliday()) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/minetrain_winter.png"));
		}
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
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
		box20.render(f5);
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
			if(cargo<=9) {
				box27.render(f5);
			}
			else {
				box26.render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}