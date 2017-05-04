/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelStopper;
import train.common.library.Info;

public class ItemRenderStopper implements IItemRenderer {
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "buffer.png");
	private static final ModelStopper stopper = new ModelStopper(1F);

	public ItemRenderStopper() {
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
			renderStopper(0.0F, 0F, 0.0F, 0.0F);
			break;
		}
		case EQUIPPED: {
			renderStopper(0F, 0.4F, 0F, 180.0F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderStopper(0F, 0.4F, 0F, 180.0F);
			return;
		}
		case INVENTORY: {
			renderStopper(1F, 0.65F, 1F, 0.0F);
			break;
		}
		default:
			break;
		}
	}

	private void renderStopper(float f, float g, float h, float rotation) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix(); //start
		GL11.glTranslatef(f, g, h); //size
		GL11.glRotatef(rotation, f, g, h);
		stopper.render2(0.0625F);
		GL11.glPopMatrix(); //end
	}
}
