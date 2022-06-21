package train.client.render.renderSwitch;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.renderSwitch.models.ModeloverheadWireDouble;
import train.common.library.Info;

public class ItemRenderoverheadWireDouble implements IItemRenderer {
    private static final ModeloverheadWireDouble modeSwitch = new ModeloverheadWireDouble();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "overheadWireDouble.png");

    public ItemRenderoverheadWireDouble() {
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
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                renderSwitch(0.2f, 1f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSwitch(0.2f, 1f, 1f, 0.5f);
                return;
            }
            case INVENTORY: {
                renderSwitch(0f, 0f, 0f, 0.25f);
                return;
            }
            default:
                break;
        }
    }

    private void renderSwitch(float x, float y, float z, float scale) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        GL11.glTranslatef(x, y, z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotated(180,0,0,1);
        GL11.glRotated(180,0,1,0);

        Tessellator.bindTexture(texture);

        modeSwitch.render(null,0,0,0,0,0,0.0625f);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }


}
