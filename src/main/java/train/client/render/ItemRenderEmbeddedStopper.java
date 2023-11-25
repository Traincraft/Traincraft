/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelEmbeddedStopper;
import train.common.library.Info;

public class ItemRenderEmbeddedStopper implements IItemRenderer {
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "embedded_buffer.png");
    private static final ModelEmbeddedStopper embeddedStopper = new ModelEmbeddedStopper(1F);

    public ItemRenderEmbeddedStopper() {
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
                renderEmbeddedStopper(0.0F, 0F, 0.0F, 0.0F);
                break;
            }
            case EQUIPPED: {
                renderEmbeddedStopper(0F, 0.4F, 0F, 180.0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderEmbeddedStopper(0F, 0.4F, 0F, 180.0F);
                return;
            }
            case INVENTORY: {
                renderEmbeddedStopper(1F, 0.65F, 1F, 0.0F);
                break;
            }
            default:
                break;
        }
    }

    private void renderEmbeddedStopper(float f, float g, float h, float rotation) {
        fexcraft.tmt.slim.Tessellator.bindTexture(texture);
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(f, g, h); //size
        GL11.glRotatef(rotation, f, g, h);
        embeddedStopper.render2(0.0625F);
        GL11.glPopMatrix(); //end
    }
}
