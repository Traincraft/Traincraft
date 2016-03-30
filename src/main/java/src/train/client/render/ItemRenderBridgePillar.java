package src.train.client.render;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import src.train.client.render.models.blocks.ModelBridgePillar;
import src.train.common.library.Info;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemRenderBridgePillar implements IItemRenderer {
	private ModelBridgePillar modelBridgePillar;

	public ItemRenderBridgePillar() {
		modelBridgePillar = new ModelBridgePillar();
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
			renderBridgePillar(0f, 0f, 0f, 1f);
			return;
		}
		case EQUIPPED: {
			renderBridgePillar(0.2f, 1f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderBridgePillar(0.2f, 1f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderBridgePillar(0f, -0.5f, 0f, 1f);
			return;
		}
		default:
			return;
		}
	}

	private void renderBridgePillar(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glRotatef(180f, 0f, 1f, 0f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "track_slope.png"));

		modelBridgePillar.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
