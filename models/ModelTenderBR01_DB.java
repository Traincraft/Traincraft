package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.ModelRendererTurbo;
import train.common.library.Info;

public class ModelTenderBR01_DB extends ModelBase {
	
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box23;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box26;
	public ModelRendererTurbo box27;
	public ModelRendererTurbo box29;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box30;
	public ModelRendererTurbo box32;
	public ModelRendererTurbo box33;
	public ModelRendererTurbo box34;
	public ModelRendererTurbo box35;
	public ModelRendererTurbo box36;
	public ModelRendererTurbo box37;
	public ModelRendererTurbo box38;
	public ModelRendererTurbo box39;
	public ModelRendererTurbo box47;
	public ModelRendererTurbo box48;
	public ModelRendererTurbo box49;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box50;
	public ModelRendererTurbo box51;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box56;
	public ModelRendererTurbo box58;
	public ModelRendererTurbo box59;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box60;
	public ModelRendererTurbo box61;
	public ModelRendererTurbo box62;
	public ModelRendererTurbo box63;
	public ModelRendererTurbo box64;
	public ModelRendererTurbo box65;
	public ModelRendererTurbo box66;
	public ModelRendererTurbo box67;
	public ModelRendererTurbo box68;
	public ModelRendererTurbo box69;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box70;
	public ModelRendererTurbo box71;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box81;
	public ModelRendererTurbo box9;

	public ModelTenderBR01_DB() {
		box = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box.addBox(0F, 0F, 0F, 1, 7, 1);
		box.setPosition(9F, 25F, 8F);
		box.rotateAngleX = -6.14355896702004F;
		box.rotateAngleY = -3.141592653589793F;

		box0 = new ModelRendererTurbo(this, 44, 36, 128, 128);
		box0.addBox(0F, 0F, 0F, 37, 14, 5);
		box0.setPosition(20F, 9F, 11F);
		box0.rotateAngleY = -3.141592653589793F;

		box11 = new ModelRendererTurbo(this, 1, 18, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 15, 1);
		box11.setPosition(-19F, 9F, -9F);

		box12 = new ModelRendererTurbo(this, 44, 36, 128, 128);
		box12.addBox(0F, 0F, 0F, 37, 14, 5);
		box12.setPosition(20F, 9F, -6F);
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new ModelRendererTurbo(this, 0, 77, 128, 128);
		box13.addBox(0F, 0F, 0F, 32, 3, 5);
		box13.setPosition(15F, 23F, -6F);
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new ModelRendererTurbo(this, 82, 57, 128, 128);
		box14.addBox(0F, 0F, 0F, 11, 17, 12);
		box14.setPosition(20F, 9F, 6F);
		box14.rotateAngleY = -3.141592653589793F;

		box15 = new ModelRendererTurbo(this, 45, 60, 128, 128);
		box15.addBox(0F, 0F, 0F, 3, 6, 12);
		box15.setPosition(22F, 11F, 6F);
		box15.rotateAngleY = -3.141592653589793F;

		box16 = new ModelRendererTurbo(this, 118, 114, 128, 128);
		box16.addBox(0F, 0F, 0F, 2, 3, 3);
		box16.setPosition(23F, 7F, 4F);

		box17 = new ModelRendererTurbo(this, 106, 90, 128, 128);
		box17.addBox(0F, 0F, 1F, 1, 9, 1);
		box17.setPosition(-20F, 4F, 6F);

		box18 = new ModelRendererTurbo(this, 59, 114, 128, 128);
		box18.addBox(0F, 0F, 0F, 4, 1, 4);
		box18.setPosition(-23F, 4F, 7F);

		box19 = new ModelRendererTurbo(this, 59, 114, 128, 128);
		box19.addBox(0F, 0F, 0F, 4, 1, 4);
		box19.setPosition(-23F, 4F, -11F);

		box20 = new ModelRendererTurbo(this, 46, 110, 128, 128);
		box20.addBox(0F, 0F, 1F, 4, 1, 3);
		box20.setPosition(-23F, 10F, 6F);

		box22 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box22.addBox(0F, 0F, 0F, 1, 7, 1);
		box22.setPosition(4F, 25F, 8F);
		box22.rotateAngleX = -6.14355896702004F;
		box22.rotateAngleY = -3.141592653589793F;

		box23 = new ModelRendererTurbo(this, 38, 92, 128, 128);
		box23.addBox(0F, 0F, 0F, 25, 6, 1);
		box23.setPosition(10F, 26F, -6F);
		box23.rotateAngleY = -3.141592653589793F;

		box25 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box25.addBox(0F, 0F, 0F, 1, 7, 1);
		box25.setPosition(-12F, 25F, -8F);
		box25.rotateAngleX = -6.14355896702004F;

		box26 = new ModelRendererTurbo(this, 38, 92, 128, 128);
		box26.addBox(0F, 0F, 0F, 25, 6, 1);
		box26.setPosition(10F, 26F, 7F);
		box26.rotateAngleY = -3.141592653589793F;

		box27 = new ModelRendererTurbo(this, 46, 110, 128, 128);
		box27.addBox(0F, 0F, 0F, 4, 1, 3);
		box27.setPosition(-23F, 7F, 7F);

		box29 = new ModelRendererTurbo(this, 18, 40, 128, 128);
		box29.addBox(0F, 0F, 0F, 4, 1, 16);
		box29.setPosition(9F, 3F, -8F);

		box3 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box3.addBox(0F, 0F, 0F, 11, 1, 16);
		box3.setPosition(-23F, 13F, -8F);

		box30 = new ModelRendererTurbo(this, 18, 40, 128, 128);
		box30.addBox(0F, 0F, 0F, 4, 1, 16);
		box30.setPosition(-14F, 3F, -8F);

		box32 = new ModelRendererTurbo(this, 102, 0, 128, 128);
		box32.addBox(0F, 0F, 0F, 1, 6, 12);
		box32.setPosition(10F, 26F, 6F);
		box32.rotateAngleY = -3.141592653589793F;

		box33 = new ModelRendererTurbo(this, 69, 59, 128, 128);
		box33.addBox(0F, 0F, 0F, 2, 8, 1);
		box33.setPosition(-15F, 32F, 7F);
		box33.rotateAngleY = 3.141592653589793F;
		box33.rotateAngleZ = 2.91469985083053F;

		box34 = new ModelRendererTurbo(this, 3, 47, 128, 128);
		box34.addBox(0F, 0F, 0F, 1, 16, 12);
		box34.setPosition(-13F, 14F, 6F);
		box34.rotateAngleY = -3.141592653589793F;

		box35 = new ModelRendererTurbo(this, 69, 59, 128, 128);
		box35.addBox(0F, 0F, 0F, 2, 8, 1);
		box35.setPosition(-15F, 32F, -6F);
		box35.rotateAngleY = 3.141592653589793F;
		box35.rotateAngleZ = 2.91469985083053F;

		box36 = new ModelRendererTurbo(this, 1, 18, 128, 128);
		box36.addBox(0F, 0F, 19F, 2, 15, 1);
		box36.setPosition(-19F, 9F, -11F);

		box37 = new ModelRendererTurbo(this, 0, 111, 128, 128);
		box37.addBox(0F, 0F, 0F, 18, 7, 10);
		box37.setPosition(-3F, 0F, 5F);
		box37.rotateAngleY = -3.141592653589793F;

		box38 = new ModelRendererTurbo(this, 0, 111, 128, 128);
		box38.addBox(0F, 0F, 0F, 18, 7, 10);
		box38.setPosition(20F, 0F, 5F);
		box38.rotateAngleY = -3.141592653589793F;

		box39 = new ModelRendererTurbo(this, 1, 85, 128, 128);
		box39.addBox(0F, 0F, 0F, 2, 2, 14);
		box39.setPosition(-6F, 2F, 7F);
		box39.rotateAngleY = -3.141592653589793F;

		box47 = new ModelRendererTurbo(this, 1, 85, 128, 128);
		box47.addBox(0F, 0F, 0F, 2, 2, 14);
		box47.setPosition(-16F, 2F, 7F);
		box47.rotateAngleY = -3.141592653589793F;

		box48 = new ModelRendererTurbo(this, 1, 85, 128, 128);
		box48.addBox(0F, 0F, 0F, 2, 2, 14);
		box48.setPosition(17F, 2F, 7F);
		box48.rotateAngleY = -3.141592653589793F;

		box49 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box49.addBox(0F, 0F, 0F, 1, 7, 1);
		box49.setPosition(-1F, 25F, 8F);
		box49.rotateAngleX = -6.14355896702004F;
		box49.rotateAngleY = -3.141592653589793F;

		box5 = new ModelRendererTurbo(this, 106, 90, 128, 128);
		box5.addBox(0F, 0F, 1F, 1, 9, 1);
		box5.setPosition(-23F, 4F, 6F);

		box50 = new ModelRendererTurbo(this, 0, 102, 128, 128);
		box50.addBox(0F, 0F, 0F, 50, 3, 4);
		box50.setPosition(-24F, 6F, -2F);

		box51 = new ModelRendererTurbo(this, 1, 85, 128, 128);
		box51.addBox(0F, 0F, 0F, 2, 2, 14);
		box51.setPosition(7F, 2F, 7F);
		box51.rotateAngleY = -3.141592653589793F;

		box52 = new ModelRendererTurbo(this, 118, 114, 128, 128);
		box52.addBox(0F, 0F, 0F, 2, 3, 3);
		box52.setPosition(23F, 7F, -7F);

		box53 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box53.addBox(0F, 0F, 0F, 1, 7, 1);
		box53.setPosition(-2F, 25F, -8F);
		box53.rotateAngleX = -6.14355896702004F;

		box54 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box54.addBox(0F, 0F, 0F, 1, 7, 1);
		box54.setPosition(3F, 25F, -8F);
		box54.rotateAngleX = -6.14355896702004F;

		box55 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box55.addBox(0F, 0F, 0F, 1, 7, 1);
		box55.setPosition(8F, 25F, -8F);
		box55.rotateAngleX = -6.14355896702004F;

		box56 = new ModelRendererTurbo(this, 96, 69, 128, 128);
		box56.addBox(0F, 0F, 0F, 3, 5, 12);
		box56.setPosition(-14F, 11F, 6F);
		box56.rotateAngleY = -3.141592653589793F;

		box58 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box58.addBox(0F, 0F, 0F, 1, 7, 1);
		box58.setPosition(-6F, 25F, 8F);
		box58.rotateAngleX = -6.14355896702004F;
		box58.rotateAngleY = -3.141592653589793F;

		box59 = new ModelRendererTurbo(this, 98, 93, 128, 128);
		box59.addBox(0F, 0F, 0F, 1, 7, 1);
		box59.setPosition(-11F, 25F, 8F);
		box59.rotateAngleX = -6.14355896702004F;
		box59.rotateAngleY = -3.141592653589793F;

		box6 = new ModelRendererTurbo(this, 10, 17, 128, 128);
		box6.addBox(0F, 0F, 0F, 45, 5, 14);
		box6.setPosition(22F, 6F, 7F);
		box6.rotateAngleY = -3.141592653589793F;

		box60 = new ModelRendererTurbo(this, 118, 87, 128, 128);
		box60.addBox(0F, 0F, 0F, 1, 18, 4);
		box60.setPosition(21F, 4F, 10F);
		box60.rotateAngleY = -3.141592653589793F;

		box61 = new ModelRendererTurbo(this, 118, 87, 128, 128);
		box61.addBox(0F, 0F, 0F, 1, 18, 4);
		box61.setPosition(21F, 4F, -6F);
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new ModelRendererTurbo(this, 22, 88, 128, 128);
		box62.addBox(0F, 0F, 0F, 3, 3, 3);
		box62.setPosition(19F, 21F, 10F);
		box62.rotateAngleY = -3.141592653589793F;

		box63 = new ModelRendererTurbo(this, 22, 88, 128, 128);
		box63.addBox(0F, 0F, 0F, 3, 3, 3);
		box63.setPosition(19F, 21F, -7F);
		box63.rotateAngleY = -3.141592653589793F;

		box64 = new ModelRendererTurbo(this, 2, 4, 128, 128);
		box64.addBox(0F, 0F, 0F, 5, 8, 1);
		box64.setPosition(-24F, 15F, -9F);

		box65 = new ModelRendererTurbo(this, 2, 4, 128, 128);
		box65.addBox(0F, 0F, 0F, 5, 8, 1);
		box65.setPosition(-24F, 15F, 8F);

		box66 = new ModelRendererTurbo(this, 68, 110, 128, 128);
		box66.addBox(0F, 0F, 0F, 18, 5, 12);
		box66.setPosition(-3F, 1F, 6F);
		box66.rotateAngleY = -3.141592653589793F;

		box67 = new ModelRendererTurbo(this, 68, 110, 128, 128);
		box67.addBox(0F, 0F, 0F, 18, 5, 12);
		box67.setPosition(20F, 1F, 6F);
		box67.rotateAngleY = -3.141592653589793F;

		box68 = new ModelRendererTurbo(this, 56, 2, 128, 128);
		box68.addBox(0F, 0F, 0F, 22, 1, 12);
		box68.setPosition(-13F, 27F, -6F);
		box68.rotateAngleZ = -6.230825429619756F;

		box69 = new ModelRendererTurbo(this, 46, 110, 128, 128);
		box69.addBox(0F, 0F, 0F, 4, 1, 3);
		box69.setPosition(-23F, 7F, -10F);

		box7 = new ModelRendererTurbo(this, 62, 71, 128, 128);
		box7.addBox(0F, 0F, 0F, 1, 5, 16);
		box7.setPosition(23F, 6F, 8F);
		box7.rotateAngleY = -3.141592653589793F;

		box70 = new ModelRendererTurbo(this, 46, 110, 128, 128);
		box70.addBox(0F, 0F, 1F, 4, 1, 3);
		box70.setPosition(-23F, 10F, -11F);

		box71 = new ModelRendererTurbo(this, 106, 90, 128, 128);
		box71.addBox(3F, 0F, 1F, 1, 9, 1);
		box71.setPosition(-23F, 4F, -9F);

		box8 = new ModelRendererTurbo(this, 0, 77, 128, 128);
		box8.addBox(0F, 0F, 0F, 32, 3, 5);
		box8.setPosition(15F, 23F, 11F);
		box8.rotateAngleY = -3.141592653589793F;

		box81 = new ModelRendererTurbo(this, 106, 90, 128, 128);
		box81.addBox(0F, 0F, 1F, 1, 9, 1);
		box81.setPosition(-23F, 4F, -9F);

		box9 = new ModelRendererTurbo(this, 98, 93, 128, 128);
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
		
		int cargo = 0;//((EntityTenderBR01_DB) entity).getAmmountOfCargo();
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