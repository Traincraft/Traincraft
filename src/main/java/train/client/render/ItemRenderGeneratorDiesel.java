/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelGeneratorDiesel;
import train.common.library.Info;

public class ItemRenderGeneratorDiesel implements IItemRenderer {

	private static final ModelGeneratorDiesel generator = new ModelGeneratorDiesel(1F);
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "generator_diesel.png");

	public ItemRenderGeneratorDiesel() {

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
			renderGenerator(0.0F, 0F, 0.0F);
			break;
		}
		case EQUIPPED: {
			renderGenerator(0F, 0.1F, 0F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderGenerator(0F, 0.1F, 0F);
			return;
		}
		case INVENTORY: {
			renderGenerator(0.5F, -0.1F, 0.5F);
			break;
		}
		default:
			break;
		}
	}

	private void renderGenerator(float f, float g, float h) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glTranslatef(f, g, h);
		GL11.glScalef(0.7F, 0.7F, 0.7F);
		generator.render2(0.0625F);
		GL11.glPopMatrix();
	}
}
