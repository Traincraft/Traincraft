package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelLantern;
import train.common.library.Info;

public class ItemRenderLantern implements IItemRenderer {
	private static final ModelLantern modelLantern= new ModelLantern();
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lantern_uv_draw_2.png");

	public ItemRenderLantern() {
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
			renderLantern(0f, 0f, 0f, 1f);
			return;
		}
		case EQUIPPED: {
			renderLantern(0.2f, 1f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderLantern(0.2f, 1f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderLantern(0f, 0f, 0f, 0.7f);
			return;
		}
		default:
			break;
		}
	}

	private void renderLantern(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		float f2 = (float) (0x4f4e4a >> 16 & 255) / 255.0F;
		float f3 = (float) (0x4f4e4a >> 8 & 255) / 255.0F;
		float f4 = (float) (0x4f4e4a & 255) / 255.0F;
		GL11.glColor3f(f2, f3, f4);

		modelLantern.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
