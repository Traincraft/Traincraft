package si.meansoft.traincraft;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.model.TRSRTransformation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

/**
 * @author canitzp
 */
public class Util {

    public static final String BUGGED_ITEM_NAME = "uwotm8";

    public static void sendTilePacketToAllAround(TileEntity tile){
        for(EntityPlayer player : tile.getWorld().playerEntities){
            if(player instanceof EntityPlayerMP){
                BlockPos pos = tile.getPos();
                if(player.getDistance(pos.getX(), pos.getY(), pos.getZ()) <= 64){
                    ((EntityPlayerMP)player).playerNetServerHandler.sendPacket(tile.getDescriptionPacket());
                }
            }
        }
    }

    public static String firstCharToUpperCase(String string){
        return string.length() >= 1 ? string.substring(0, 1).toUpperCase() + string.substring(1) : string;
    }

    public static int getStackSize(ItemStack stack){
        return stack != null ? stack.stackSize : 0;
    }

    @SideOnly(Side.CLIENT)
    public static IBakedModel renderObjectFile(IBakedModel currentModel, ResourceLocation objLocation, TileEntity te, float xOffset, float yOffset, float zOffset){
        if(currentModel != null){
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.5F + xOffset, 0 + yOffset, 0.5F + zOffset);
            RenderHelper.disableStandardItemLighting();
            Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            if (Minecraft.isAmbientOcclusionEnabled()) {
                GlStateManager.shadeModel(GL11.GL_SMOOTH);
            } else {
                GlStateManager.shadeModel(GL11.GL_FLAT);
            }
            GlStateManager.translate(-te.getPos().getX(), -te.getPos().getY(), -te.getPos().getZ());
            Tessellator tessy = Tessellator.getInstance();
            tessy.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.BLOCK);
            Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModel(te.getWorld(), currentModel, te.getWorld().getBlockState(te.getPos()), te.getPos(), Tessellator.getInstance().getBuffer(), false);
            tessy.draw();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.popMatrix();
        } else {
            currentModel = getBakedModel(objLocation);
            if(currentModel != null){
                renderObjectFile(currentModel, objLocation, te, xOffset, yOffset, zOffset);
            }
        }
        return currentModel;
    }

    @SideOnly(Side.CLIENT)
    private static IBakedModel getBakedModel(ResourceLocation location){
        try{
            IBakedModel model;
            model = ModelLoaderRegistry.getModel(location).bake(TRSRTransformation.identity(), DefaultVertexFormats.ITEM, new Function<ResourceLocation, TextureAtlasSprite>(){
                @Nullable
                @Override
                public TextureAtlasSprite apply(@Nullable ResourceLocation input){
                    return Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(input.toString());
                }
            });
            return model;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
