package train.client.render.renderSwitch;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.library.Info;

import static train.client.render.renderSwitch.RendertrackConcrete.modeltrackConcrete;

public class ItemRendertrackConcrete implements IItemRenderer {

	public ItemRendertrackConcrete() {
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
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_concreteTexture2.png"));
		GL11.glTranslatef(x, y, z);

		//GL11.glScalef(0.1f,0.1f,0.1f);

		GL11.glRotatef(180f,0f,1f,0f);

		modeltrackConcrete.render();
		GL11.glPopMatrix();
	}
}
