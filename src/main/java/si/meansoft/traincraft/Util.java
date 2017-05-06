/*
 * This file ("Util.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import si.meansoft.traincraft.compat.VanillaUtil;

/**
 * @author canitzp
 */
public class Util {

    public static void sendTilePacketToAllAround(TileEntity tile) {
        for (EntityPlayer player : tile.getWorld().playerEntities) {
            if (player instanceof EntityPlayerMP) {
                BlockPos pos = tile.getPos();
                if (player.getDistance(pos.getX(), pos.getY(), pos.getZ()) <= 64) {
                    ((EntityPlayerMP) player).connection.sendPacket(tile.getUpdatePacket());
                }
            }
        }
    }

    public static ItemStack decreaseItemStack(ItemStack toDecrease, ItemStack decreaseValue) {
        if (ItemStack.areItemStacksEqual(toDecrease, decreaseValue)) {
            int i = VanillaUtil.getCount(toDecrease) - VanillaUtil.getCount(decreaseValue);
            if (i > 0) {
                VanillaUtil.decreaseStack(toDecrease, VanillaUtil.getCount(decreaseValue));
            } else if (i <= 0) {
                toDecrease = VanillaUtil.getEmpty();
            }
            return toDecrease;
        }
        return toDecrease;
    }

    public enum NBTType {
        SYNC,
        SAVE;

        public boolean sync() {
            return this == SYNC;
        }

        public boolean save() {
            return this == SAVE;
        }
    }

}
