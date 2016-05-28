package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelWaterWheel;
import train.common.library.Info;

public class ItemRenderWaterWheel implements IItemRenderer {
	private ModelWaterWheel modelWaterWheel;

	public ItemRenderWaterWheel() {
		modelWaterWheel = new ModelWaterWheel();
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
			return;
		}
	}

	private void renderWaterWheel(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glScalef(0.36F, 0.36F, 1F);
		GL11.glRotatef(180f, 0f, 1f, 0f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "water_wheel_uv.png"));
		int j = 0x331D14;
		float f1 = 1.0F;
		float f2 = (float) (j >> 16 & 255) / 255.0F;
		float f3 = (float) (j >> 8 & 255) / 255.0F;
		float f4 = (float) (j & 255) / 255.0F;
		GL11.glColor3f(f1 * f2, f1 * f3, f1 * f4);

		modelWaterWheel.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
