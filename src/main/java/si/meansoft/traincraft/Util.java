package si.meansoft.traincraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import si.meansoft.traincraft.blocks.BlockRail;

/**
 * @author canitzp
 */
public class Util {

    public static void sendTilePacketToAllAround(TileEntity tile){
        for(EntityPlayer player : tile.getWorld().playerEntities){
            if(player instanceof EntityPlayerMP){
                BlockPos pos = tile.getPos();
                if(player.getDistance(pos.getX(), pos.getY(), pos.getZ()) <= 64){
                    ((EntityPlayerMP)player).connection.sendPacket(tile.getUpdatePacket());
                }
            }
        }
    }

    @Deprecated
    public static String firstCharToUpperCase(String string){
        return string.length() >= 1 ? string.substring(0, 1).toUpperCase() + string.substring(1) : string;
    }

    public static int getStackSize(ItemStack stack){
        return stack != null ? stack.stackSize : 0;
    }

    public static ItemStack decreaseItemStack(ItemStack toDecrease, ItemStack decreaseValue){
        if(ItemStack.areItemStacksEqual(toDecrease, decreaseValue)){
            int i = toDecrease.copy().stackSize - decreaseValue.copy().stackSize;
            if(i > 0){
                toDecrease.stackSize -= decreaseValue.stackSize;
            } else if(i <= 0){
                toDecrease = null;
            }
            return toDecrease;
        }
        return toDecrease == null ? decreaseValue : null;
    }

    public static ResourceLocation getObjectLocationFromRail(BlockRail block){
        return block != null ? new ResourceLocation(Traincraft.MODID, "block/" + "track" + firstCharToUpperCase(block.length.name) + firstCharToUpperCase(block.direction.name) + block.nameExtra + ".obj") : null;
    }

}
