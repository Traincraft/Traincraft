package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelWindMill;
import train.client.render.models.blocks.ModelWindMillWheel;
import train.common.library.Info;

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
			break;
		}
	}

	private void renderWindMill(float x, float y, float z, float scale) {
		GL11.glPushMatrix();

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "water_wheel_uv.png"));
		float f2 = (float) (0x331D14 >> 16 & 255) / 255.0F;
		float f3 = (float) (0x331D14 >> 8 & 255) / 255.0F;
		float f4 = (float) (0x331D14 & 255) / 255.0F;
		GL11.glColor3f(f2,f3,f4);

		modelWindMill.render();
		f2 = (float) (0x7A7674 >> 16 & 255) / 255.0F;
		f3 = (float) (0x7A7674 >> 8 & 255) / 255.0F;
		f4 = (float) (0x7A7674 & 255) / 255.0F;
		GL11.glColor3f(f2,f3,f4);
		GL11.glTranslatef(0, 2F, 0);
		modelWindMillWheel.render();

		GL11.glPopMatrix();
	}
}
