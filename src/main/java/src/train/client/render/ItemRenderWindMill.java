package src.train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import src.train.client.render.models.blocks.ModelWindMill;
import src.train.client.render.models.blocks.ModelWindMillWheel;
import src.train.common.library.Info;

public class ItemRenderWindMill implements IItemRenderer {
	private ModelWindMill modelWindMill;
	private ModelWindMillWheel modelWindMillWheel;

	public ItemRenderWindMill() {
		modelWindMill = new ModelWindMill();
		modelWindMillWheel = new ModelWindMillWheel();
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
			renderWindMill(0f, 0f, 0f, 0.5f);
			return;
		}
		case EQUIPPED: {
			renderWindMill(0f, 0.5f, 0.5f, 0.4f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderWindMill(0f, 0.5f, 0.5f, 0.4f);
			return;
		}
		case INVENTORY: {
			renderWindMill(0f, -0.34f, 0f, 0.4f);
			return;
		}
		default:
			return;
		}
	}

	private void renderWindMill(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "water_wheel_uv.png"));
		int j = 0x331D14;
		float f1 = 1.0F;
		float f2 = (float) (j >> 16 & 255) / 255.0F;
		float f3 = (float) (j >> 8 & 255) / 255.0F;
		float f4 = (float) (j & 255) / 255.0F;
		GL11.glColor3f(f1 * f2, f1 * f3, f1 * f4);

		modelWindMill.render();
		j = 0x7A7674;
		f2 = (float) (j >> 16 & 255) / 255.0F;
		f3 = (float) (j >> 8 & 255) / 255.0F;
		f4 = (float) (j & 255) / 255.0F;
		GL11.glColor3f(f1 * f2, f1 * f3, f1 * f4);
		GL11.glTranslatef(0, 2F, 0);
		modelWindMillWheel.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
