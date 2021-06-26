package train.client.render.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.common.entity.rollingStock.EntityTenderBR01_DB;
import train.common.library.Info;

public class ModelTenderBR01_DB extends ModelBase {
	
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box16;
	public CustomModelRenderer box17;
	public CustomModelRenderer box18;
	public CustomModelRenderer box19;
	public CustomModelRenderer box20;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box38;
	public CustomModelRenderer box39;
	public CustomModelRenderer box47;
	public CustomModelRenderer box48;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box50;
	public CustomModelRenderer box51;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box56;
	public CustomModelRenderer box58;
	public CustomModelRenderer box59;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box61;
	public CustomModelRenderer box62;
	public CustomModelRenderer box63;
	public CustomModelRenderer box64;
	public CustomModelRenderer box65;
	public CustomModelRenderer box66;
	public CustomModelRenderer box67;
	public CustomModelRenderer box68;
	public CustomModelRenderer box69;
	public CustomModelRenderer box7;
	public CustomModelRenderer box70;
	public CustomModelRenderer box71;
	public CustomModelRenderer box8;
	public CustomModelRenderer box81;
	public CustomModelRenderer box9;

	public ModelTenderBR01_DB() {
		box = new CustomModelRenderer(this, 98, 93, 128, 128);
		box.addBox(0F, 0F, 0F, 1, 7, 1);
		box.setPosition(9F, 25F, 8F);
		box.rotateAngleX = -6.14355896702004F;
		box.rotateAngleY = -3.141592653589793F;

		box0 = new CustomModelRenderer(this, 44, 36, 128, 128);
		box0.addBox(0F, 0F, 0F, 37, 14, 5);
		box0.setPosition(20F, 9F, 11F);
		box0.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 1, 18, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 15, 1);
		box11.setPosition(-19F, 9F, -9F);

		box12 = new CustomModelRenderer(this, 44, 36, 128, 128);
		box12.addBox(0F, 0F, 0F, 37, 14, 5);
		box12.setPosition(20F, 9F, -6F);
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new CustomModelRenderer(this, 0, 77, 128, 128);
		box13.addBox(0F, 0F, 0F, 32, 3, 5);
		box13.setPosition(15F, 23F, -6F);
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new CustomModelRenderer(this, 82, 57, 128, 128);
		box14.addBox(0F, 0F, 0F, 11, 17, 12);
		box14.setPosition(20F, 9F, 6F);
		box14.rotateAngleY = -3.141592653589793F;

		box15 = new CustomModelRenderer(this, 45, 60, 128, 128);
		box15.addBox(0F, 0F, 0F, 3, 6, 12);
		box15.setPosition(22F, 11F, 6F);
		box15.rotateAngleY = -3.141592653589793F;

		box16 = new CustomModelRenderer(this, 118, 114, 128, 128);
		box16.addBox(0F, 0F, 0F, 2, 3, 3);
		box16.setPosition(23F, 7F, 4F);

		box17 = new CustomModelRenderer(this, 106, 90, 128, 128);
		box17.addBox(0F, 0F, 1F, 1, 9, 1);
		box17.setPosition(-20F, 4F, 6F);

		box18 = new CustomModelRenderer(this, 59, 114, 128, 128);
		box18.addBox(0F, 0F, 0F, 4, 1, 4);
		box18.setPosition(-23F, 4F, 7F);

		box19 = new CustomModelRenderer(this, 59, 114, 128, 128);
		box19.addBox(0F, 0F, 0F, 4, 1, 4);
		box19.setPosition(-23F, 4F, -11F);

		box20 = new CustomModelRenderer(this, 46, 110, 128, 128);
		box20.addBox(0F, 0F, 1F, 4, 1, 3);
		box20.setPosition(-23F, 10F, 6F);

		box22 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box22.addBox(0F, 0F, 0F, 1, 7, 1);
		box22.setPosition(4F, 25F, 8F);
		box22.rotateAngleX = -6.14355896702004F;
		box22.rotateAngleY = -3.141592653589793F;

		box23 = new CustomModelRenderer(this, 38, 92, 128, 128);
		box23.addBox(0F, 0F, 0F, 25, 6, 1);
		box23.setPosition(10F, 26F, -6F);
		box23.rotateAngleY = -3.141592653589793F;

		box25 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box25.addBox(0F, 0F, 0F, 1, 7, 1);
		box25.setPosition(-12F, 25F, -8F);
		box25.rotateAngleX = -6.14355896702004F;

		box26 = new CustomModelRenderer(this, 38, 92, 128, 128);
		box26.addBox(0F, 0F, 0F, 25, 6, 1);
		box26.setPosition(10F, 26F, 7F);
		box26.rotateAngleY = -3.141592653589793F;

		box27 = new CustomModelRenderer(this, 46, 110, 128, 128);
		box27.addBox(0F, 0F, 0F, 4, 1, 3);
		box27.setPosition(-23F, 7F, 7F);

		box29 = new CustomModelRenderer(this, 18, 40, 128, 128);
		box29.addBox(0F, 0F, 0F, 4, 1, 16);
		box29.setPosition(9F, 3F, -8F);

		box3 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box3.addBox(0F, 0F, 0F, 11, 1, 16);
		box3.setPosition(-23F, 13F, -8F);

		box30 = new CustomModelRenderer(this, 18, 40, 128, 128);
		box30.addBox(0F, 0F, 0F, 4, 1, 16);
		box30.setPosition(-14F, 3F, -8F);

		box32 = new CustomModelRenderer(this, 102, 0, 128, 128);
		box32.addBox(0F, 0F, 0F, 1, 6, 12);
		box32.setPosition(10F, 26F, 6F);
		box32.rotateAngleY = -3.141592653589793F;

		box33 = new CustomModelRenderer(this, 69, 59, 128, 128);
		box33.addBox(0F, 0F, 0F, 2, 8, 1);
		box33.setPosition(-15F, 32F, 7F);
		box33.rotateAngleY = 3.141592653589793F;
		box33.rotateAngleZ = 2.91469985083053F;

		box34 = new CustomModelRenderer(this, 3, 47, 128, 128);
		box34.addBox(0F, 0F, 0F, 1, 16, 12);
		box34.setPosition(-13F, 14F, 6F);
		box34.rotateAngleY = -3.141592653589793F;

		box35 = new CustomModelRenderer(this, 69, 59, 128, 128);
		box35.addBox(0F, 0F, 0F, 2, 8, 1);
		box35.setPosition(-15F, 32F, -6F);
		box35.rotateAngleY = 3.141592653589793F;
		box35.rotateAngleZ = 2.91469985083053F;

		box36 = new CustomModelRenderer(this, 1, 18, 128, 128);
		box36.addBox(0F, 0F, 19F, 2, 15, 1);
		box36.setPosition(-19F, 9F, -11F);

		box37 = new CustomModelRenderer(this, 0, 111, 128, 128);
		box37.addBox(0F, 0F, 0F, 18, 7, 10);
		box37.setPosition(-3F, 0F, 5F);
		box37.rotateAngleY = -3.141592653589793F;

		box38 = new CustomModelRenderer(this, 0, 111, 128, 128);
		box38.addBox(0F, 0F, 0F, 18, 7, 10);
		box38.setPosition(20F, 0F, 5F);
		box38.rotateAngleY = -3.141592653589793F;

		box39 = new CustomModelRenderer(this, 1, 85, 128, 128);
		box39.addBox(0F, 0F, 0F, 2, 2, 14);
		box39.setPosition(-6F, 2F, 7F);
		box39.rotateAngleY = -3.141592653589793F;

		box47 = new CustomModelRenderer(this, 1, 85, 128, 128);
		box47.addBox(0F, 0F, 0F, 2, 2, 14);
		box47.setPosition(-16F, 2F, 7F);
		box47.rotateAngleY = -3.141592653589793F;

		box48 = new CustomModelRenderer(this, 1, 85, 128, 128);
		box48.addBox(0F, 0F, 0F, 2, 2, 14);
		box48.setPosition(17F, 2F, 7F);
		box48.rotateAngleY = -3.141592653589793F;

		box49 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box49.addBox(0F, 0F, 0F, 1, 7, 1);
		box49.setPosition(-1F, 25F, 8F);
		box49.rotateAngleX = -6.14355896702004F;
		box49.rotateAngleY = -3.141592653589793F;

		box5 = new CustomModelRenderer(this, 106, 90, 128, 128);
		box5.addBox(0F, 0F, 1F, 1, 9, 1);
		box5.setPosition(-23F, 4F, 6F);

		box50 = new CustomModelRenderer(this, 0, 102, 128, 128);
		box50.addBox(0F, 0F, 0F, 50, 3, 4);
		box50.setPosition(-24F, 6F, -2F);

		box51 = new CustomModelRenderer(this, 1, 85, 128, 128);
		box51.addBox(0F, 0F, 0F, 2, 2, 14);
		box51.setPosition(7F, 2F, 7F);
		box51.rotateAngleY = -3.141592653589793F;

		box52 = new CustomModelRenderer(this, 118, 114, 128, 128);
		box52.addBox(0F, 0F, 0F, 2, 3, 3);
		box52.setPosition(23F, 7F, -7F);

		box53 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box53.addBox(0F, 0F, 0F, 1, 7, 1);
		box53.setPosition(-2F, 25F, -8F);
		box53.rotateAngleX = -6.14355896702004F;

		box54 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box54.addBox(0F, 0F, 0F, 1, 7, 1);
		box54.setPosition(3F, 25F, -8F);
		box54.rotateAngleX = -6.14355896702004F;

		box55 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box55.addBox(0F, 0F, 0F, 1, 7, 1);
		box55.setPosition(8F, 25F, -8F);
		box55.rotateAngleX = -6.14355896702004F;

		box56 = new CustomModelRenderer(this, 96, 69, 128, 128);
		box56.addBox(0F, 0F, 0F, 3, 5, 12);
		box56.setPosition(-14F, 11F, 6F);
		box56.rotateAngleY = -3.141592653589793F;

		box58 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box58.addBox(0F, 0F, 0F, 1, 7, 1);
		box58.setPosition(-6F, 25F, 8F);
		box58.rotateAngleX = -6.14355896702004F;
		box58.rotateAngleY = -3.141592653589793F;

		box59 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box59.addBox(0F, 0F, 0F, 1, 7, 1);
		box59.setPosition(-11F, 25F, 8F);
		box59.rotateAngleX = -6.14355896702004F;
		box59.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 10, 17, 128, 128);
		box6.addBox(0F, 0F, 0F, 45, 5, 14);
		box6.setPosition(22F, 6F, 7F);
		box6.rotateAngleY = -3.141592653589793F;

		box60 = new CustomModelRenderer(this, 118, 87, 128, 128);
		box60.addBox(0F, 0F, 0F, 1, 18, 4);
		box60.setPosition(21F, 4F, 10F);
		box60.rotateAngleY = -3.141592653589793F;

		box61 = new CustomModelRenderer(this, 118, 87, 128, 128);
		box61.addBox(0F, 0F, 0F, 1, 18, 4);
		box61.setPosition(21F, 4F, -6F);
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new CustomModelRenderer(this, 22, 88, 128, 128);
		box62.addBox(0F, 0F, 0F, 3, 3, 3);
		box62.setPosition(19F, 21F, 10F);
		box62.rotateAngleY = -3.141592653589793F;

		box63 = new CustomModelRenderer(this, 22, 88, 128, 128);
		box63.addBox(0F, 0F, 0F, 3, 3, 3);
		box63.setPosition(19F, 21F, -7F);
		box63.rotateAngleY = -3.141592653589793F;

		box64 = new CustomModelRenderer(this, 2, 4, 128, 128);
		box64.addBox(0F, 0F, 0F, 5, 8, 1);
		box64.setPosition(-24F, 15F, -9F);

		box65 = new CustomModelRenderer(this, 2, 4, 128, 128);
		box65.addBox(0F, 0F, 0F, 5, 8, 1);
		box65.setPosition(-24F, 15F, 8F);

		box66 = new CustomModelRenderer(this, 68, 110, 128, 128);
		box66.addBox(0F, 0F, 0F, 18, 5, 12);
		box66.setPosition(-3F, 1F, 6F);
		box66.rotateAngleY = -3.141592653589793F;

		box67 = new CustomModelRenderer(this, 68, 110, 128, 128);
		box67.addBox(0F, 0F, 0F, 18, 5, 12);
		box67.setPosition(20F, 1F, 6F);
		box67.rotateAngleY = -3.141592653589793F;

		box68 = new CustomModelRenderer(this, 56, 2, 128, 128);
		box68.addBox(0F, 0F, 0F, 22, 1, 12);
		box68.setPosition(-13F, 27F, -6F);
		box68.rotateAngleZ = -6.230825429619756F;

		box69 = new CustomModelRenderer(this, 46, 110, 128, 128);
		box69.addBox(0F, 0F, 0F, 4, 1, 3);
		box69.setPosition(-23F, 7F, -10F);

		box7 = new CustomModelRenderer(this, 62, 71, 128, 128);
		box7.addBox(0F, 0F, 0F, 1, 5, 16);
		box7.setPosition(23F, 6F, 8F);
		box7.rotateAngleY = -3.141592653589793F;

		box70 = new CustomModelRenderer(this, 46, 110, 128, 128);
		box70.addBox(0F, 0F, 1F, 4, 1, 3);
		box70.setPosition(-23F, 10F, -11F);

		box71 = new CustomModelRenderer(this, 106, 90, 128, 128);
		box71.addBox(3F, 0F, 1F, 1, 9, 1);
		box71.setPosition(-23F, 4F, -9F);

		box8 = new CustomModelRenderer(this, 0, 77, 128, 128);
		box8.addBox(0F, 0F, 0F, 32, 3, 5);
		box8.setPosition(15F, 23F, 11F);
		box8.rotateAngleY = -3.141592653589793F;

		box81 = new CustomModelRenderer(this, 106, 90, 128, 128);
		box81.addBox(0F, 0F, 1F, 1, 9, 1);
		box81.setPosition(-23F, 4F, -9F);

		box9 = new CustomModelRenderer(this, 98, 93, 128, 128);
		box9.addBox(0F, 0F, 0F, 1, 7, 1);
		box9.setPosition(-7F, 25F, -8F);
		box9.rotateAngleX = -6.14355896702004F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		if (ClientProxy.isHoliday()) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/tenderBR01_DB_winter.png"));
		}
		
		box.render(f5);
		box0.render(f5);
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
		box22.render(f5);
		box23.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box32.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box38.render(f5);
		box39.render(f5);
		box47.render(f5);
		box48.render(f5);
		box49.render(f5);
		box5.render(f5);
		box50.render(f5);
		box51.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box56.render(f5);
		box58.render(f5);
		box59.render(f5);
		box6.render(f5);
		box60.render(f5);
		box61.render(f5);
		box62.render(f5);
		box63.render(f5);
		box64.render(f5);
		box65.render(f5);
		box66.render(f5);
		box67.render(f5);
		box69.render(f5);
		box7.render(f5);
		box70.render(f5);
		box71.render(f5);
		box8.render(f5);
		box81.render(f5);
		box9.render(f5);
		
		int cargo = ((EntityTenderBR01_DB) entity).getAmmountOfCargo();
		if (cargo != 0) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0, -0.66f+cargo*0.046f, 0);
			box68.render(f5);
			GL11.glPopMatrix();
		}
		else {
			GL11.glPushMatrix();
			GL11.glTranslatef(0, -0.68f, 0);
			box68.render(f5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}