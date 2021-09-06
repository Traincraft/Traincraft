package train.client.render.renderSwitch;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.library.Info;

import static train.client.render.renderSwitch.RenderSpeedSign.modelspeedSign;

public class ItemRenderSpeedSign implements IItemRenderer {

	public ItemRenderSpeedSign() {
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
			renderSpeedSign(0f, 0f, 0f, 0f);
			return;
		}
		case EQUIPPED: {
			renderSpeedSign(0.2f, 1f, 1f, 0f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderSpeedSign(0.2f, 1f, 1f, 1f);
			GL11.glRotatef(180,0f,1f,0f);
			return;
		}
		case INVENTORY: {
			renderSpeedSign(0f, 0f, 0f, 0f);
			return;
		}
		default:
			break;
		}
	}

	private void renderSpeedSign(float x, float y, float z, float rotate) {
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign10.png"));
		GL11.glTranslatef(x, y, z);
		GL11.glRotatef(180f,0f,0f, rotate);
		//GL11.glRotatef();
		modelspeedSign.render();
		GL11.glPopMatrix();
	}
}
