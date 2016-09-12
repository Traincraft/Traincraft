package si.meansoft.traincraft;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

/**
 * @author canitzp
 */
public class Util {

    public static final DataParameter<Boolean> TEST = EntityDataManager.createKey(EntityMinecart.class, DataSerializers.BOOLEAN);

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

}
