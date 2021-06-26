package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.api.LiquidTank;

public class ModelWatertransp extends ModelBase {

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
	public CustomModelRenderer box37;
	public CustomModelRenderer box38;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
	public CustomModelRenderer box43;
	public CustomModelRenderer box44;
	public CustomModelRenderer box45;
	public CustomModelRenderer box46;
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
	public CustomModelRenderer box57;
	public CustomModelRenderer box58;
	public CustomModelRenderer box59;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box61;
	public CustomModelRenderer box62;
	public CustomModelRenderer box63;
	public CustomModelRenderer box64;
	public CustomModelRenderer box65;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelWatertransp() {
		box = new CustomModelRenderer(this, 3, 18, 256, 128);
		box.addBox(0F, 0F, 0F, 8, 4, 4);
		box.setPosition(-19F, 11F, -2F);
		box.rotateAngleY = -1.5707963267948966F;

		box0 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-24F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 232, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-21F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 221, 84, 256, 128);
		box10.addBox(0F, 0F, 0F, 1, 5, 16);
		box10.setPosition(27F, 6F, -8F);

		box11 = new CustomModelRenderer(this, 222, 111, 256, 128);
		box11.addBox(0F, 0F, 0F, 2, 3, 4);
		box11.setPosition(28F, 6F, -2F);

		box12 = new CustomModelRenderer(this, 0, 60, 256, 128);
		box12.addBox(0F, -3F, 0F, 8, 3, 22);
		box12.setPosition(-10F, 11F, -11F);
		box12.rotateAngleZ = -0.9773843811168246F;

		box13 = new CustomModelRenderer(this, 1, 0, 256, 128);
		box13.addBox(0F, 0F, 0F, 17, 2, 14);
		box13.setPosition(10F, 6F, -7F);

		box14 = new CustomModelRenderer(this, 0, 60, 256, 128);
		box14.addBox(0F, -3F, 0F, 8, 3, 22);
		box14.setPosition(10F, 11F, 11F);
		box14.rotateAngleY = -3.141592653589793F;
		box14.rotateAngleZ = 0.9773843811168246F;

		box15 = new CustomModelRenderer(this, 0, 34, 256, 128);
		box15.addBox(0F, 0F, 0F, 16, 3, 22);
		box15.setPosition(-8F, 3F, -11F);

		box16 = new CustomModelRenderer(this, 75, 61, 256, 128);
		box16.addBox(0F, 0F, 0F, 2, 19, 8);
		box16.setPosition(-9F, 10F, -4F);

		box17 = new CustomModelRenderer(this, 123, 66, 256, 128);
		box17.addBox(0F, 0F, 0F, 8, 19, 2);
		box17.setPosition(-4F, 10F, -9F);

		box18 = new CustomModelRenderer(this, 96, 92, 256, 128);
		box18.addBox(0F, 0F, 0F, 7, 19, 2);
		box18.setPosition(-9F, 10F, -4F);
		box18.rotateAngleY = -5.497787143782138F;

		box19 = new CustomModelRenderer(this, 75, 88, 256, 128);
		box19.addBox(0F, 0F, 0F, 2, 19, 7);
		box19.setPosition(-9F, 10F, 4F);
		box19.rotateAngleY = -5.497787143782138F;

		box2 = new CustomModelRenderer(this, 49, 4, 256, 128);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(16F, 2F, -7F);

		box20 = new CustomModelRenderer(this, 221, 106, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 5, 16);
		box20.setPosition(-28F, 6F, -8F);

		box21 = new CustomModelRenderer(this, 75, 88, 256, 128);
		box21.addBox(0F, 0F, 0F, 2, 19, 7);
		box21.setPosition(4F, 10F, 9F);
		box21.rotateAngleY = -3.9269908169872414F;

		box22 = new CustomModelRenderer(this, 96, 92, 256, 128);
		box22.addBox(0F, 0F, 0F, 7, 19, 2);
		box22.setPosition(4F, 10F, -9F);
		box22.rotateAngleY = -0.7853981633974483F;

		box23 = new CustomModelRenderer(this, 123, 36, 256, 128);
		box23.addBox(0F, 0F, 0F, 3, 9, 4);
		box23.setPosition(11F, 9F, -7F);

		box24 = new CustomModelRenderer(this, 169, 112, 256, 128);
		box24.addBox(-6F, 0F, -6F, 12, 2, 12);
		box24.setPosition(0F, 8F, 0F);

		box25 = new CustomModelRenderer(this, 241, 112, 256, 128);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new CustomModelRenderer(this, 0, 102, 256, 128);
		box26.addBox(0F, 0F, 0F, 5, 3, 22);
		box26.setPosition(-15F, 8F, -11F);

		box27 = new CustomModelRenderer(this, 98, 61, 256, 128);
		box27.addBox(0F, 0F, 0F, 2, 19, 8);
		box27.setPosition(7F, 10F, -4F);

		box28 = new CustomModelRenderer(this, 147, 66, 256, 128);
		box28.addBox(0F, 0F, 0F, 8, 19, 2);
		box28.setPosition(-4F, 10F, 7F);

		box29 = new CustomModelRenderer(this, 167, 8, 256, 128);
		box29.addBox(0F, 0F, 0F, 10, 10, 2);
		box29.setPosition(-5F, 16F, -10F);

		box3 = new CustomModelRenderer(this, 49, 4, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-18F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 139, 8, 256, 128);
		box30.addBox(0F, 0F, 0F, 10, 10, 2);
		box30.setPosition(-5F, 16F, 8F);

		box31 = new CustomModelRenderer(this, 168, 24, 256, 128);
		box31.addBox(0F, 0F, 0F, 2, 10, 7);
		box31.setPosition(5F, 16F, 10F);
		box31.rotateAngleY = -3.9269908169872414F;

		box32 = new CustomModelRenderer(this, 147, 24, 256, 128);
		box32.addBox(0F, 0F, 0F, 7, 10, 2);
		box32.setPosition(-10F, 16F, -5F);
		box32.rotateAngleY = -5.497787143782138F;

		box33 = new CustomModelRenderer(this, 82, 1, 256, 128);
		box33.addBox(0F, 0F, 0F, 2, 10, 10);
		box33.setPosition(8F, 16F, -5F);

		box34 = new CustomModelRenderer(this, 110, 1, 256, 128);
		box34.addBox(0F, 0F, 0F, 2, 10, 10);
		box34.setPosition(-10F, 16F, -5F);

		box35 = new CustomModelRenderer(this, 232, 9, 256, 128);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(13F, 0F, 5F);

		box36 = new CustomModelRenderer(this, 168, 24, 256, 128);
		box36.addBox(0F, 0F, 0F, 2, 10, 7);
		box36.setPosition(-10F, 16F, 5F);
		box36.rotateAngleY = -5.497787143782138F;

		box37 = new CustomModelRenderer(this, 147, 24, 256, 128);
		box37.addBox(0F, 0F, 0F, 7, 10, 2);
		box37.setPosition(5F, 16F, -10F);
		box37.rotateAngleY = -0.7853981633974483F;

		box38 = new CustomModelRenderer(this, 241, 112, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new CustomModelRenderer(this, 193, 47, 256, 128);
		box39.addBox(0F, -1F, -1F, 26, 3, 3);
		box39.setPosition(-13F, 23F, 0F);
		box39.rotateAngleX = -0.7853981633974483F;

		box4 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-24F, 1F, 5F);

		box40 = new CustomModelRenderer(this, 241, 112, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box41 = new CustomModelRenderer(this, 195, 2, 256, 128);
		box41.addBox(0F, -1F, -1F, 26, 2, 2);
		box41.setPosition(-13F, 18F, -5F);
		box41.rotateAngleX = -0.7853981633974483F;

		box42 = new CustomModelRenderer(this, 241, 112, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box43 = new CustomModelRenderer(this, 195, 2, 256, 128);
		box43.addBox(0F, -1F, -1F, 26, 2, 2);
		box43.setPosition(-13F, 18F, 5F);
		box43.rotateAngleX = -0.7853981633974483F;

		box44 = new CustomModelRenderer(this, 222, 111, 256, 128);
		box44.addBox(0F, 0F, 0F, 2, 3, 4);
		box44.setPosition(-30F, 6F, -2F);

		box45 = new CustomModelRenderer(this, 123, 36, 256, 128);
		box45.addBox(0F, 0F, 0F, 3, 9, 4);
		box45.setPosition(11F, 9F, 3F);

		box46 = new CustomModelRenderer(this, 106, 36, 256, 128);
		box46.addBox(0F, 0F, 0F, 3, 9, 4);
		box46.setPosition(-14F, 9F, 3F);

		box47 = new CustomModelRenderer(this, 106, 36, 256, 128);
		box47.addBox(0F, 0F, 0F, 3, 9, 4);
		box47.setPosition(-14F, 9F, -7F);

		box48 = new CustomModelRenderer(this, 139, 36, 256, 128);
		box48.addBox(0F, 0F, 0F, 1, 9, 4);
		box48.setPosition(-13F, 9F, -11F);
		box48.rotateAngleX = -5.82939970166106F;

		box49 = new CustomModelRenderer(this, 139, 36, 256, 128);
		box49.addBox(23F, 0F, 0F, 1, 9, 4);
		box49.setPosition(-11F, 9F, -11F);
		box49.rotateAngleX = -5.82939970166106F;

		box5 = new CustomModelRenderer(this, 232, 9, 256, 128);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(13F, 0F, -5F);

		box50 = new CustomModelRenderer(this, 139, 36, 256, 128);
		box50.addBox(0F, 0F, 0F, 1, 9, 4);
		box50.setPosition(13F, 9F, 11F);
		box50.rotateAngleX = -5.82939970166106F;
		box50.rotateAngleY = -3.141592653589793F;

		box51 = new CustomModelRenderer(this, 139, 36, 256, 128);
		box51.addBox(0F, 0F, 0F, 1, 9, 4);
		box51.setPosition(-12F, 9F, 11F);
		box51.rotateAngleX = -5.82939970166106F;
		box51.rotateAngleY = -3.141592653589793F;

		box52 = new CustomModelRenderer(this, 2, 86, 256, 128);
		box52.addBox(0F, 0F, 0F, 12, 3, 3);
		box52.setPosition(15F, 8F, -11F);
		box52.rotateAngleY = -0.33161255787892263F;

		box53 = new CustomModelRenderer(this, 34, 93, 256, 128);
		box53.addBox(0F, 0F, 0F, 3, 3, 14);
		box53.setPosition(24F, 8F, -7F);

		box54 = new CustomModelRenderer(this, 2, 93, 256, 128);
		box54.addBox(0F, 0F, -3F, 12, 3, 3);
		box54.setPosition(15F, 8F, 11F);
		box54.rotateAngleY = -5.951572749300664F;

		box55 = new CustomModelRenderer(this, 33, 112, 256, 128);
		box55.addBox(0F, 0F, 0F, 9, 3, 8);
		box55.setPosition(15F, 8F, -4F);

		box56 = new CustomModelRenderer(this, 33, 112, 256, 128);
		box56.addBox(0F, 0F, 0F, 9, 3, 8);
		box56.setPosition(-24F, 8F, -4F);

		box57 = new CustomModelRenderer(this, 34, 93, 256, 128);
		box57.addBox(0F, 0F, 0F, 3, 3, 14);
		box57.setPosition(-27F, 8F, -7F);

		//lava
		box58 = new CustomModelRenderer(this, 197, 61, 256, 128);
		box58.addBox(-6F, 0F, -6F, 14, 1, 14);
		box58.setPosition(-1F, 11F, -1F);
		//box58.setPosition(-1F, 25F, -1F);

		box59 = new CustomModelRenderer(this, 2, 93, 256, 128);
		box59.addBox(0F, 0F, -3F, 12, 3, 3);
		box59.setPosition(-15F, 8F, -11F);
		box59.rotateAngleY = -2.8099800957108707F;

		box6 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(10F, 1F, 5F);

		box60 = new CustomModelRenderer(this, 2, 86, 256, 128);
		box60.addBox(0F, 0F, 0F, 12, 3, 3);
		box60.setPosition(-15F, 8F, 11F);
		box60.rotateAngleY = -3.473205211468716F;

		box61 = new CustomModelRenderer(this, 84, 33, 256, 128);
		box61.addBox(0F, 0F, 0F, 1, 5, 6);
		box61.setPosition(11F, 10F, -3F);

		box62 = new CustomModelRenderer(this, 84, 33, 256, 128);
		box62.addBox(0F, 0F, 0F, 1, 5, 6);
		box62.setPosition(-12F, 10F, -3F);

		box63 = new CustomModelRenderer(this, 232, 9, 256, 128);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-21F, 0F, -5F);

		box64 = new CustomModelRenderer(this, 136, 116, 256, 128);
		box64.addBox(-6F, 0F, -6F, 8, 2, 8);
		box64.setPosition(2F, 7F, 2F);

		box65 = new CustomModelRenderer(this, 158, 95, 256, 128);
		box65.addBox(-6F, 0F, -6F, 14, 1, 14);
		box65.setPosition(-1F, 10F, -1F);

		box7 = new CustomModelRenderer(this, 197, 19, 256, 128);
		box7.addBox(0F, 0F, 0F, 5, 3, 22);
		box7.setPosition(10F, 8F, -11F);

		box8 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box8.addBox(0F, 0F, 0F, 14, 5, 1);
		box8.setPosition(10F, 1F, -6F);

		box9 = new CustomModelRenderer(this, 1, 0, 256, 128);
		box9.addBox(0F, 0F, 0F, 17, 2, 14);
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
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box32.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box38.render(f5);
		box39.render(f5);
		box4.render(f5);
		box40.render(f5);
		box41.render(f5);
		box42.render(f5);
		box43.render(f5);
		box44.render(f5);
		box45.render(f5);
		box46.render(f5);
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
		box57.render(f5);
		box59.render(f5);
		box6.render(f5);
		box60.render(f5);
		box61.render(f5);
		box62.render(f5);
		box63.render(f5);
		box64.render(f5);
		box65.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);		
		//lava	
		//Fluid theLiquid = FluidRegistry.getFluid(((LiquidTank)entity).getLiquidName());
		GL11.glPushMatrix();
		if ((((LiquidTank) entity).getAmount()) != 0) {
			GL11.glTranslatef(0.0f, ((((LiquidTank)entity).getAmount()/1000)*0.03f)+0.0f, 0.0f);
    		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
    		box58.render(f5);
    		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
		}
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
