/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelTCBook;
import train.common.library.Info;

public class ItemRenderBook implements IItemRenderer {
	
	ModelTCBook book1;
	ModelTCBook book2;
	
	public static boolean open = false;
	
	public ItemRenderBook() {
		book1 = new ModelTCBook();
		book2 = new ModelTCBook();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
		switch (type) {
		case ENTITY: {
			renderBook(0.0F, 1.0F, 0.0F, 0.0F, 0.0f, 0.0f, 0.0f, 1.5F);
			break;
		}
		case EQUIPPED: {
			renderBook(0.3F, 0.6F, 0.7F, 70.0F, 0.0f, 1.0f, 0.0f, 1.0F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			if(open) {
				rotateBook(-0.7F, 1.8F, -0.277F, -45.0F, 0.0f, 1.0f, 0.0f, 1.0f+Minecraft.getMinecraft().currentScreen.height*0.003f);
			}
			else {
				renderBook(0F, 0.8F, 0F, 0.0F, 0.0f, 1.0f, 0.0f, 1.0F);
			}
			return;
		}
		case INVENTORY: {
			renderBook(0.5F, 0.4F, 0.5F, 180.0F, 0.0f, 1.0f, 0.0f, 1.2F);
			break;
		}
		default:
			break;
		}
	}

	private void renderBook(float left, float up, float right, float rotation, float x, float y, float z, float scale) {
		Tessellator tesselator = Tessellator.instance;
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "book2.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(left, up, right);
		GL11.glRotatef(rotation, x, y, z);
		GL11.glScalef(scale, scale, scale);
		book1.render(20);
		GL11.glPopMatrix();
	}
	
	private void rotateBook(float left, float up, float right, float rotation, float x, float y, float z, float scale) {
//		if(upp) {
//			w++;
//		}
//		if(down) {
//			w--;
//		}
//		if(w==pages) {
//			upp = false;
//			down = true;
//		}
//		if(w==0) {
//			upp = true;
//			down = false;
//		}
		//System.out.println(w/10);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "book2.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(left, up, right);
		GL11.glTranslatef(0.5f, 1.f, -0.5f);
		GL11.glRotatef(rotation, x, y, z);
		GL11.glRotatef(-25.0f, 1.0f, 0.0f, 0.0f);
		GL11.glScalef(scale, scale, scale);
		book1.rotate(10/*+(int)((Math.sin(w)*10)-(Math.sin(w))%10)*/);
		GL11.glPopMatrix();
	}

}
