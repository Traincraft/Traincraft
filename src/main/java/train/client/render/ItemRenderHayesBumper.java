/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelHayesBumper;
import train.common.library.Info;

public class ItemRenderHayesBumper implements IItemRenderer {
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "HayesBumper.png");
    private static final ModelHayesBumper hayesBumper = new ModelHayesBumper();

    public ItemRenderHayesBumper() {
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
                renderHayesBumper(0.0F, 0F, 0.0F, 0.0F);
                break;
            }
            case EQUIPPED: {
                renderHayesBumper(0F, 0.4F, 0F, 180.0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderHayesBumper(0F, 0.4F, 0F, 180.0F);
                return;
            }
            case INVENTORY: {
                renderHayesBumper(1F, 0.65F, 1F, 0.0F);
                break;
            }
            default:
                break;
        }
    }

    private void renderHayesBumper(float f, float g, float h, float rotation) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(f, g, h); //size
        GL11.glRotatef(rotation, f, g, h);
        hayesBumper.render();
        GL11.glPopMatrix(); //end
    }
}
