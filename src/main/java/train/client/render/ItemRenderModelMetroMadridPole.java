package train.client.render;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.ModelMetroMadridOHW;
import train.common.library.Info;

public class ItemRenderModelMetroMadridPole implements IItemRenderer {

    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "MetroMadridPole.png");
    private static final ModelMetroMadridOHW modelMetroMadridPole = new ModelMetroMadridOHW();

    public ItemRenderModelMetroMadridPole() {
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
                renderMetroMadridPole(0f, 0f, 0f);
                return;
            }
            case EQUIPPED: {
                renderMetroMadridPole(0.2f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderMetroMadridPole(0.2f, 1f, 1f);
                return;
            }
            case INVENTORY: {
                renderMetroMadridPole(0f, 0f, 0f);
                return;
            }
            default:
                break;
        }
    }

    private void renderMetroMadridPole(float x, float y, float z) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y+0.125f, z);
        GL11.glRotatef(180f,0f,0f, 1f);
        modelMetroMadridPole.render();
        GL11.glPopMatrix();
    }
}
