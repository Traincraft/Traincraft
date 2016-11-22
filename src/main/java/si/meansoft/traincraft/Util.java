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
        return stack != null ? stack.getCount() : 0;
    }

    public static ItemStack decreaseItemStack(ItemStack toDecrease, ItemStack decreaseValue){
        if(ItemStack.areItemStacksEqual(toDecrease, decreaseValue)){
            int i = toDecrease.copy().getCount() - decreaseValue.copy().getCount();
            if(i > 0){
                toDecrease.setCount(toDecrease.getCount() - decreaseValue.getCount());
            } else if(i <= 0){
                toDecrease = ItemStack.EMPTY;
            }
            return toDecrease;
        }
        return toDecrease;
    }

    public enum NBTType{
        SYNC,
        SAVE;

        public boolean sync(){
            return this == SYNC;
        }
        public boolean save(){
            return this == SAVE;
        }
    }

}
