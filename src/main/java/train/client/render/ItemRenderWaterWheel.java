package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelWaterWheel;
import train.common.library.Info;

public class ItemRenderWaterWheel implements IItemRenderer {
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "water_wheel_uv.png");
	private static final ModelWaterWheel modelWaterWheel = new ModelWaterWheel();

	public ItemRenderWaterWheel() {
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
			renderWaterWheel(0f, 0f, 0f, 0.8f);
			return;
		}
		case EQUIPPED: {
			renderWaterWheel(0f, 0.5f, 0.5f, 0.8f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderWaterWheel(0f, 0.5f, 0.5f, 0.8f);
			return;
		}
		case INVENTORY: {
			renderWaterWheel(0f, 0f, 0f, 0.5f);
			return;
		}
		default:
			break;
		}
	}

	private void renderWaterWheel(float x, float y, float z, float scale) {
		GL11.glPushMatrix();

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glScalef(0.36F, 0.36F, 1F);
		GL11.glRotatef(180f, 0f, 1f, 0f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		float f2 = (float) (0x331D14 >> 16 & 255) / 255.0F;
		float f3 = (float) (0x331D14 >> 8 & 255) / 255.0F;
		float f4 = (float) (0x331D14 & 255) / 255.0F;
		GL11.glColor3f(f2, f3, f4);

		modelWaterWheel.render();

		GL11.glPopMatrix();
	}
}
