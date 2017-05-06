package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBridgePillar;
import train.common.library.Info;

public class ItemRenderBridgePillar implements IItemRenderer {
	private static final ModelBridgePillar modelBridgePillar = new ModelBridgePillar();
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "track_slope.png");

	public ItemRenderBridgePillar() {
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
			renderBridgePillar(0f, 0f, 0f);
			return;
		}
		case EQUIPPED: {
			renderBridgePillar(0.2f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderBridgePillar(0.2f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderBridgePillar(0f, -0.5f, 0f);
			return;
		}
		default:
			break;
		}
	}

	private void renderBridgePillar(float x, float y, float z) {
		GL11.glPushMatrix();

		GL11.glTranslatef(x, y, z);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);

		modelBridgePillar.render();
		GL11.glPopMatrix();
	}
}
