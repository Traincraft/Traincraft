/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.render;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import src.train.client.render.models.blocks.ModelBlockSignal;
import src.train.common.library.Info;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemRenderSignal implements IItemRenderer {

	private ModelBlockSignal signal;

	public ItemRenderSignal() {
		signal = new ModelBlockSignal(1.0f);
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
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case ENTITY: {
			renderSignal(0.0F, 0F, 0.0F, 0.0F, 1F);
			break;
		}
		case EQUIPPED: {
			renderSignal(0F, 0.05F, 0F, 180.0F, 0.7F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderSignal(0F, 0.05F, 0F, 180.0F, 0.7F);
			return;
		}
		case INVENTORY: {
			renderSignal(0F, -0.8F, 0F, 180.0F, 0.65F);
			break;
		}
		default:
			break;
		}
	}

	private void renderSignal(float f, float g, float h, float rotation, float scale) {
		Tessellator tesselator = Tessellator.instance;
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix + "signal_suisse_green.png"));
		GL11.glPushMatrix(); //start
		GL11.glTranslatef(f, g, h); //size
		GL11.glRotatef(rotation, f, g, h);
		GL11.glScalef(scale, scale, scale);
		signal.render2(0.0625F);
		GL11.glPopMatrix(); //end
	}
}
