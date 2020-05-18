package train.client.render.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelRing;
import train.common.library.Info;

public class ModelLocoBR80_DB extends ModelBase {
	
	public float dig1 = 0.0F;
	private long lastframe;
	private float dig;
	
	private ModelRing ring;
	
	public CustomModelRenderer body;
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
	public CustomModelRenderer lightFront;
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
	public CustomModelRenderer wheels1;
	public CustomModelRenderer wheels2;
	public CustomModelRenderer wheels3;
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
	public CustomModelRenderer lightBack;
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
	public CustomModelRenderer coalbox;
	public CustomModelRenderer box7;
	public CustomModelRenderer box70;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelLocoBR80_DB() {
		
		ring = new ModelRing();
		
		body = new CustomModelRenderer(this, 0, 206, 128, 256);
		body.addBox(0F, 0F, 0F, 23, 2, 22);
		body.setPosition(2F, 10F, -11F);

		box = new CustomModelRenderer(this, 22, 133, 128, 256);
		box.addBox(0F, 0F, 0F, 1, 3, 20);
		box.setPosition(2F, 28F, -10F);

		box0 = new CustomModelRenderer(this, 75, 180, 128, 256);
		box0.addBox(0F, 0F, 0F, 2, 2, 2);
		box0.setPosition(-25F, 7F, -7F);

		box1 = new CustomModelRenderer(this, 1, 100, 128, 256);
		box1.addBox(0F, 0F, 0F, 1, 12, 20);
		box1.setPosition(18F, 12F, -10F);

		box10 = new CustomModelRenderer(this, 82, 84, 128, 256);
		box10.addBox(0F, 0F, 0F, 19, 5, 1);
		box10.setPosition(20F, 32F, -7F);
		box10.rotateAngleX = -4.1887902047863905F;
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 44, 129, 128, 256);
		box11.addBox(0F, 0F, 0F, 1, 4, 14);
		box11.setPosition(2F, 24F, -7F);

		box12 = new CustomModelRenderer(this, 24, 103, 128, 256);
		box12.addBox(0F, 0F, 0F, 9, 11, 1);
		box12.setPosition(2F, 12F, 10F);

		box13 = new CustomModelRenderer(this, 37, 235, 128, 256);
		box13.addBox(0F, 0F, 0F, 7, 7, 5);
		box13.setPosition(-14F, 3F, -5F);
		box13.rotateAngleY = 3.141592653589793F;
		box13.rotateAngleZ = 6.283185307179586F;

		box14 = new CustomModelRenderer(this, 22, 133, 128, 256);
		box14.addBox(0F, 0F, 0F, 1, 3, 20);
		box14.setPosition(19F, 28F, 10F);
		box14.rotateAngleY = -3.141592653589793F;

		box15 = new CustomModelRenderer(this, 44, 129, 128, 256);
		box15.addBox(0F, 0F, 0F, 1, 4, 14);
		box15.setPosition(19F, 24F, 7F);
		box15.rotateAngleY = -3.141592653589793F;

		box16 = new CustomModelRenderer(this, 116, 249, 128, 256);
		box16.addBox(0F, 0F, 0F, 1, 3, 3);
		box16.setPosition(-26F, 7F, 5F);

		box17 = new CustomModelRenderer(this, 75, 180, 128, 256);
		box17.addBox(0F, 0F, 0F, 2, 2, 2);
		box17.setPosition(26F, 7F, 5F);

		box18 = new CustomModelRenderer(this, 75, 180, 128, 256);
		box18.addBox(0F, 0F, 0F, 2, 2, 2);
		box18.setPosition(26F, 7F, -7F);

		box19 = new CustomModelRenderer(this, 116, 249, 128, 256);
		box19.addBox(0F, 0F, 0F, 1, 3, 3);
		box19.setPosition(28F, 7F, 5F);

		box2 = new CustomModelRenderer(this, 25, 69, 128, 256);
		box2.addBox(0F, 0F, 0F, 19, 1, 14);
		box2.setPosition(1F, 31F, -7F);

		box20 = new CustomModelRenderer(this, 116, 249, 128, 256);
		box20.addBox(0F, 0F, 0F, 1, 3, 3);
		box20.setPosition(28F, 7F, -8F);

		box21 = new CustomModelRenderer(this, 0, 103, 128, 256);
		box21.addBox(0F, 0F, 0F, 9, 11, 1);
		box21.setPosition(2F, 12F, -11F);

		lightFront = new CustomModelRenderer(this, 23, 143, 128, 256);
		lightFront.addBox(0F, 0F, 0F, 2, 4, 4);
		lightFront.setPosition(-22F, 25F, -2F);

		box23 = new CustomModelRenderer(this, 53, 93, 128, 256);
		box23.addBox(0F, 0F, 0F, 3, 7, 1);
		box23.setPosition(2F, 23F, -11F);
		box23.rotateAngleX = -6.1086523819801535F;

		box24 = new CustomModelRenderer(this, 81, 93, 128, 256);
		box24.addBox(0F, 0F, 0F, 1, 7, 1);
		box24.setPosition(10F, 23F, -11F);
		box24.rotateAngleX = -6.1086523819801535F;

		box25 = new CustomModelRenderer(this, 52, 103, 128, 256);
		box25.addBox(0F, 0F, 0F, 2, 11, 1);
		box25.setPosition(17F, 12F, -11F);

		box26 = new CustomModelRenderer(this, 1, 68, 128, 256);
		box26.addBox(0F, 0F, 0F, 1, 12, 20);
		box26.setPosition(2F, 12F, -10F);

		box27 = new CustomModelRenderer(this, 62, 93, 128, 256);
		box27.addBox(0F, 0F, 0F, 2, 7, 1);
		box27.setPosition(17F, 23F, -11F);
		box27.rotateAngleX = -6.1086523819801535F;

		box28 = new CustomModelRenderer(this, 44, 93, 128, 256);
		box28.addBox(0F, 0F, 0F, 3, 7, 1);
		box28.setPosition(5F, 23F, 11F);
		box28.rotateAngleX = -6.1086523819801535F;
		box28.rotateAngleY = -3.141592653589793F;

		box29 = new CustomModelRenderer(this, 45, 103, 128, 256);
		box29.addBox(0F, 0F, 0F, 2, 11, 1);
		box29.setPosition(17F, 12F, 10F);

		box3 = new CustomModelRenderer(this, 0, 248, 128, 256);
		box3.addBox(0F, 0F, 0F, 47, 6, 1);
		box3.setPosition(25F, 4F, -3F);
		box3.rotateAngleY = -3.141592653589793F;

		box30 = new CustomModelRenderer(this, 76, 93, 128, 256);
		box30.addBox(0F, 0F, 0F, 1, 7, 1);
		box30.setPosition(11F, 23F, 11F);
		box30.rotateAngleX = -6.1086523819801535F;
		box30.rotateAngleY = -3.141592653589793F;

		box31 = new CustomModelRenderer(this, 69, 93, 128, 256);
		box31.addBox(0F, 0F, 0F, 2, 7, 1);
		box31.setPosition(19F, 23F, 11F);
		box31.rotateAngleX = -6.1086523819801535F;
		box31.rotateAngleY = -3.141592653589793F;

		box32 = new CustomModelRenderer(this, 37, 235, 128, 256);
		box32.addBox(0F, 0F, 0F, 7, 7, 5);
		box32.setPosition(-14F, 3F, 10F);
		box32.rotateAngleY = -3.141592653589793F;

		box33 = new CustomModelRenderer(this, 72, 142, 128, 256);
		box33.addBox(0F, 0F, 0F, 22, 12, 6);
		box33.setPosition(-20F, 15F, -3F);

		box34 = new CustomModelRenderer(this, 60, 124, 128, 256);
		box34.addBox(0F, 0F, 0F, 22, 6, 12);
		box34.setPosition(-20F, 18F, -6F);

		box35 = new CustomModelRenderer(this, 76, 160, 128, 256);
		box35.addBox(0F, 0F, 0F, 22, 4, 4);
		box35.setPosition(-20F, 24F, -6F);
		box35.rotateAngleX = -5.497787143782138F;

		box36 = new CustomModelRenderer(this, 76, 160, 128, 256);
		box36.addBox(0F, 0F, 0F, 22, 4, 4);
		box36.setPosition(2F, 24F, 6F);
		box36.rotateAngleX = -5.497787143782138F;
		box36.rotateAngleY = -3.141592653589793F;

		box37 = new CustomModelRenderer(this, 76, 160, 128, 256);
		box37.addBox(0F, 0F, 0F, 22, 4, 4);
		box37.setPosition(2F, 18F, 6F);
		box37.rotateAngleX = -5.497787143782138F;
		box37.rotateAngleY = -3.141592653589793F;

		box38 = new CustomModelRenderer(this, 76, 160, 128, 256);
		box38.addBox(0F, 0F, 0F, 22, 4, 4);
		box38.setPosition(-20F, 18F, -6F);
		box38.rotateAngleX = -5.497787143782138F;

		box39 = new CustomModelRenderer(this, 109, 198, 128, 256);
		box39.addBox(0F, 0F, 0F, 4, 7, 4);
		box39.setPosition(-19F, 27F, -2F);

		box4 = new CustomModelRenderer(this, 82, 84, 128, 256);
		box4.addBox(0F, 0F, 0F, 19, 5, 1);
		box4.setPosition(1F, 32F, 7F);
		box4.rotateAngleX = -4.1887902047863905F;

		box40 = new CustomModelRenderer(this, 44, 101, 128, 256);
		box40.addBox(0F, 0F, 0F, 20, 1, 22);
		box40.setPosition(-18F, 13F, -11F);

		box41 = new CustomModelRenderer(this, 2, 4, 128, 256);
		box41.addBox(0F, 0F, 0F, 15, 9, 22);
		box41.setPosition(-13F, 14F, -11F);

		box42 = new CustomModelRenderer(this, 70, 188, 128, 256);
		box42.addBox(0F, 0F, 0F, 7, 11, 22);
		box42.setPosition(19F, 12F, -11F);

		box43 = new CustomModelRenderer(this, 89, 170, 128, 256);
		box43.addBox(-1F, 0F, 0F, 7, 7, 10);
		box43.setPosition(20F, 23F, -5F);
		box43.rotateAngleZ = -0.17453292519943295F;

		box44 = new CustomModelRenderer(this, 35, 157, 128, 256);
		box44.addBox(0F, 0F, 0F, 4, 1, 18);
		box44.setPosition(-22F, 10F, -9F);

		box45 = new CustomModelRenderer(this, 53, 179, 128, 256);
		box45.addBox(0F, 0F, 0F, 5, 10, 8);
		box45.setPosition(-19F, 10F, -4F);

		wheels1 = new CustomModelRenderer(this, 0, 230, 128, 256);
		wheels1.addBox(-4F, -4F, 0F, 8, 8, 10);
		wheels1.setPosition(-8F, 4F, 5F);
		wheels1.rotateAngleY = -3.141592653589793F;

		wheels2 = new CustomModelRenderer(this, 0, 230, 128, 256);
		wheels2.addBox(-4F, -4F, 0F, 8, 8, 10);
		wheels2.setPosition(12F, 4F, 5F);
		wheels2.rotateAngleY = -3.141592653589793F;

		wheels3 = new CustomModelRenderer(this, 0, 230, 128, 256);
		wheels3.addBox(-4F, -4F, 0F, 8, 8, 10);
		wheels3.setPosition(2F, 4F, 5F);
		wheels3.rotateAngleY = -3.141592653589793F;

		box49 = new CustomModelRenderer(this, 107, 113, 128, 256);
		box49.addBox(0F, 0F, 0F, 2, 3, 4);
		box49.setPosition(-25F, 6F, -2F);

		box5 = new CustomModelRenderer(this, 75, 180, 128, 256);
		box5.addBox(0F, 0F, 0F, 2, 2, 2);
		box5.setPosition(-25F, 7F, 5F);

		box50 = new CustomModelRenderer(this, 107, 113, 128, 256);
		box50.addBox(0F, 0F, 0F, 4, 3, 4);
		box50.setPosition(26F, 6F, -2F);

		box51 = new CustomModelRenderer(this, 22, 164, 128, 256);
		box51.addBox(0F, 0F, 0F, 9, 4, 6);
		box51.setPosition(-12F, 26F, -3F);

		box52 = new CustomModelRenderer(this, 27, 232, 128, 256);
		box52.addBox(0F, 0F, 0F, 20, 1, 1);
		box52.setPosition(14F, 2F, 7F);
		box52.rotateAngleY = -3.141592653589793F;

		box53 = new CustomModelRenderer(this, 27, 232, 128, 256);
		box53.addBox(0F, 0F, 0F, 21, 1, 1);
		box53.setPosition(13F, 2F, 8F);
		box53.rotateAngleY = 3.141592653589793F;
		box53.rotateAngleZ = 6.14355896702004F;

		box54 = new CustomModelRenderer(this, 27, 230, 128, 256);
		box54.addBox(0F, 0F, 0F, 16, 1, 1);
		box54.setPosition(-8F, 5F, 8F);
		box54.rotateAngleY = -3.141592653589793F;

		box55 = new CustomModelRenderer(this, 27, 232, 128, 256);
		box55.addBox(0F, 0F, 0F, 20, 1, 1);
		box55.setPosition(14F, 2F, -6F);
		box55.rotateAngleY = -3.141592653589793F;

		box56 = new CustomModelRenderer(this, 27, 232, 128, 256);
		box56.addBox(0F, 0F, 0F, 21, 1, 1);
		box56.setPosition(13F, 2F, -7F);
		box56.rotateAngleY = 3.141592653589793F;
		box56.rotateAngleZ = 6.14355896702004F;

		box57 = new CustomModelRenderer(this, 27, 230, 128, 256);
		box57.addBox(0F, 0F, 0F, 16, 1, 1);
		box57.setPosition(-8F, 5F, -7F);
		box57.rotateAngleY = -3.141592653589793F;

		box58 = new CustomModelRenderer(this, 1, 210, 128, 256);
		box58.addBox(0F, 0F, 0F, 2, 8, 8);
		box58.setPosition(-21F, 17F, -4F);

		lightBack = new CustomModelRenderer(this, 23, 143, 128, 256);
		lightBack.addBox(0F, 0F, 0F, 2, 4, 4);
		lightBack.setPosition(28F, 22F, 2F);
		lightBack.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 0, 248, 128, 256);
		box6.addBox(0F, 0F, 0F, 47, 6, 1);
		box6.setPosition(25F, 4F, 4F);
		box6.rotateAngleY = -3.141592653589793F;

		box60 = new CustomModelRenderer(this, 86, 221, 128, 256);
		box60.addBox(0F, 0F, 0F, 9, 16, 12);
		box60.setPosition(6F, 10F, 6F);
		box60.rotateAngleY = -3.141592653589793F;

		box61 = new CustomModelRenderer(this, 64, 238, 128, 256);
		box61.addBox(0F, 0F, 0F, 6, 8, 1);
		box61.setPosition(17F, 2F, -9F);
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new CustomModelRenderer(this, 64, 238, 128, 256);
		box62.addBox(0F, 0F, 0F, 6, 8, 1);
		box62.setPosition(17F, 2F, 10F);
		box62.rotateAngleY = -3.141592653589793F;

		box63 = new CustomModelRenderer(this, 112, 101, 128, 256);
		box63.addBox(0F, 0F, 1F, 1, 3, 3);
		box63.setPosition(-20F, 11F, 5F);
		box63.rotateAngleZ = -0.5061454830783556F;

		box64 = new CustomModelRenderer(this, 112, 101, 128, 256);
		box64.addBox(0F, 0F, -14F, 1, 3, 3);
		box64.setPosition(-20F, 11F, 5F);
		box64.rotateAngleZ = -0.5061454830783556F;

		box65 = new CustomModelRenderer(this, 75, 48, 128, 256);
		box65.addBox(0F, 0F, 0F, 7, 4, 16);
		box65.setPosition(25F, 6F, 8F);
		box65.rotateAngleY = -3.141592653589793F;

		box66 = new CustomModelRenderer(this, 2, 51, 128, 256);
		box66.addBox(0F, 0F, 0F, 2, 2, 12);
		box66.setPosition(-7F, 3F, 6F);
		box66.rotateAngleY = -3.141592653589793F;

		box67 = new CustomModelRenderer(this, 2, 51, 128, 256);
		box67.addBox(0F, 0F, 0F, 2, 2, 12);
		box67.setPosition(3F, 3F, 6F);
		box67.rotateAngleY = -3.141592653589793F;

		box68 = new CustomModelRenderer(this, 2, 51, 128, 256);
		box68.addBox(0F, 0F, 0F, 2, 2, 12);
		box68.setPosition(13F, 3F, 6F);
		box68.rotateAngleY = -3.141592653589793F;

		coalbox = new CustomModelRenderer(this, 28, 54, 128, 256);
		coalbox.addBox(1F, 5F, 0F, 9, 2, 12);
		coalbox.setPosition(18F, 23F, -6F);

		box7 = new CustomModelRenderer(this, 0, 140, 128, 256);
		box7.addBox(0F, 1F, 0F, 1, 5, 18);
		box7.setPosition(-23F, 5F, -9F);

		box70 = new CustomModelRenderer(this, 60, 35, 128, 256);
		box70.addBox(1F, 5F, 0F, 3, 7, 10);
		box70.setPosition(18F, 17F, -5F);

		box8 = new CustomModelRenderer(this, 0, 140, 128, 256);
		box8.addBox(0F, 0F, 0F, 1, 5, 18);
		box8.setPosition(26F, 6F, 9F);
		box8.rotateAngleY = -3.141592653589793F;

		box9 = new CustomModelRenderer(this, 116, 249, 128, 256);
		box9.addBox(0F, 0F, 0F, 1, 3, 3);
		box9.setPosition(-26F, 7F, -8F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		long now = System.nanoTime();
		int elapsed = (int) ((now - lastframe) / (1000 * 1000));
		dig -= elapsed / 500.0f;
		lastframe = now;
		
		if (ClientProxy.isHoliday()) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/locoBR80_DB_winter.png"));
		}
		
		body.render(f5);
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
		
		wheels1.render(f5);
		wheels2.render(f5);
		wheels3.render(f5);
		
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
		box58.render(f5);
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		lightBack.render(f5);
		lightFront.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
		
		box6.render(f5);
		box60.render(f5);
		box61.render(f5);
		box62.render(f5);
		box63.render(f5);
		box64.render(f5);
		box65.render(f5);
		box66.render(f5);
		box67.render(f5);
		box68.render(f5);
		coalbox.render(f5);
		box7.render(f5);
		box70.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		double moveX = entity.lastTickPosX-entity.posX;
		double moveZ = entity.lastTickPosZ-entity.posZ;
		
		if(moveX != 0 || moveZ != 0) {
			if((entity.lastTickPosX-entity.posX) != 0) {
				wheels1.rotateAngleZ = (float) (-dig*moveX);
				wheels2.rotateAngleZ = (float) (-dig*moveX);
				wheels3.rotateAngleZ = (float) (-dig*moveX);
			}
			else {
				wheels1.rotateAngleZ = (float) (-dig*moveZ);
				wheels2.rotateAngleZ = (float) (-dig*moveZ);
				wheels3.rotateAngleZ = (float) (-dig*moveZ);
			}
		}
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.4f, 1.2f, 0);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glScalef(0.7f, 0.7f, 0.7f);
			ring.render(5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
