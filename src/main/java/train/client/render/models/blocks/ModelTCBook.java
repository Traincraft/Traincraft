/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileBook;

public class ModelTCBook extends ModelBase {
	private IModelCustom book;
	
	private final GameSettings settings = Minecraft.getMinecraft().gameSettings;
	
	float rot = 0.0f;
	
	public ModelTCBook() {
		book = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "book2.obj"));
	}
	
	public void render(int pages) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "book2.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0f, 0.0f, 0.0f);
		GL11.glScalef(1.0f+(pages*0.158f), 1.0f, 1.0f);
		book.renderPart("back");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0f, 0.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("divider_bottom");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0f-((pages-1)*0.005f), 0.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("cover_left");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0f+((pages-1)*0.005f), 0.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("cover_right");
		GL11.glPopMatrix();
		
		for (int i = 0; i < pages; i++) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0f+((pages-i)*0.005f), 0.0f, 0.0f);
			GL11.glScalef(1.0f, 1.0f, 1.0f);
			book.renderPart("page_left");
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0f-((pages-i)*0.005f), 0.0f, 0.0f);
			GL11.glScalef(1.0f, 1.0f, 1.0f);
			book.renderPart("page_right");
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0f+(i*0.005f), 0.0f, 0.0f);
			GL11.glScalef(0.5f, 1.0f, 1.0f);
			book.renderPart("divider_top");
			GL11.glPopMatrix();
		}
		
		if(pages>=10) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			GL11.glScalef(1.0f, 1.0f, 1.0f);
			book.renderPart("back_logo");
			GL11.glPopMatrix();
		}
	}
	
	public void render2(int pages) {
		Tessellator tesselator = Tessellator.instance;
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "book2.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0f, 0.0f, 0.0f);
		GL11.glScalef(1.0f+(pages*0.158f), 1.0f, 1.0f);
		book.renderPart("back");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0.4f+pages*0.0012f, 0.0f, -0.478f+((pages-pages/10)*0.007f));
		GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("divider_bottom");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.51f-((pages-1)*0.0048f), 0.0f, -0.47f);
		GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("cover_left");
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0.51f+((pages-1)*0.0048f), 0.0f, -0.47f);
		GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
		GL11.glScalef(1.0f, 1.0f, 1.0f);
		book.renderPart("cover_right");
		GL11.glPopMatrix();
		
		for (int i = 0; i < pages; i++) {
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-0.50889f-i*0.0047898f+(float)(Math.log(pages-i)/102.5f), 0.0f, -0.477f+((pages-i)*0.007f));
    		GL11.glScalef(1.0f, 1.0f, 1.0f);
    		//GL11.glTranslatef(-0.51889f-i*0.0047898f+(float)(Math.log(pages-i)/49.76f), 0.0f, -0.477f+((pages-i)*0.007f)); + rotation
    		GL11.glRotatef(-90.0f/*+((pages-i)*0.155f)*/, 0.0f, 1.0f, 0.0f);
    		GL11.glDisable(GL11.GL_LIGHTING);
    		book.renderPart("page_left");
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0.50889f+i*0.0047898f-(float)(Math.log(pages-i)/102.5f), 0.0f, -0.477f+((pages-i)*0.007f));
    		GL11.glScalef(1.0f, 1.0f, 1.0f);
    		GL11.glRotatef(90.0f/*-((pages-i)*0.155f)*/, 0.0f, 1.0f, 0.0f);
    		book.renderPart("page_right");
    		GL11.glPopMatrix();
		}
		
//		GL11.glPushMatrix();
//		GL11.glTranslatef(0.0f, 0.0f, -0.266f);
//		GL11.glScalef(0.004f, 0.004f, 1.0f);
//		GL11.glRotatef(-180.0f, 1.0f, 0.0f, 0.0f);
//		mc.fontRenderer.drawString("This is the Traincraft guide book.", -230, -110, 1);
//		mc.fontRenderer.drawString("In here you will find all the information", -230, -90, 1);
//		mc.fontRenderer.drawString("needed to be able to use the mod.", -230, -80, 1);
//		GL11.glPopMatrix();
		
//		System.out.println("H3d: " + mc.currentScreen.height + " W3d: " + mc.currentScreen.width);
		
		if(pages>=10) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			GL11.glScalef(1.0f, 1.0f, 1.0f);
			book.renderPart("back_logo");
			GL11.glPopMatrix();
		}
	}
	
	public void rotate(int pages) {
		if(rot > 360.0f) {
			rot -= 360.0f;
		}
		Tessellator tesselator = Tessellator.instance;
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "book2.png"));
		GL11.glPushMatrix();
		if(settings.guiScale == 0) {
			GL11.glScalef(0.2f, 0.2f, 0.2f);
		}
		else if(settings.guiScale == 1) {
			GL11.glScalef(0.2f, 0.2f, 0.2f);
		}
		else if(settings.guiScale == 2) {
			GL11.glScalef(0.1f, 0.1f, 0.1f);
		}
		else {
			GL11.glScalef(1.0f, 1.0f, 1.0f);
		}
		render2(pages);
		GL11.glPopMatrix();
		rot += 0.04f;
	}

	public void render(TileBook book, double x, double y, double z) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5f, (float) y + 0.205f, (float) z + 0.5f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "book2.png"));
		GL11.glScalef(0.4f, 0.4f, 0.4f);
		GL11.glRotatef(-90, 1, 0, 0);
		int facing = book.getFacing();
		if (facing == 3) {
			GL11.glRotatef(-180, 0, 0, 1);
		}
		if (facing == 1) {
			GL11.glRotatef(0, 0, 0, 1);
		}
		if (facing == 0) {
			GL11.glRotatef(90, 0, 0, 1);
		}
		if (facing == 2) {
			GL11.glRotatef(-90, 0, 0, 1);
		}
		render2(10);
		GL11.glPopMatrix();
	}
}