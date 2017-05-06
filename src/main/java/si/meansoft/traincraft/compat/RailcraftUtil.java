/*
 * This file ("RailcraftUtil.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.compat;

import mods.railcraft.api.carts.CartToolsAPI;
import mods.railcraft.common.blocks.tracks.TrackTools;
import mods.railcraft.common.carts.IRailcraftCartContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.api.ITraincraftTrack;

/**
 * @author canitzp
 */
public class RailcraftUtil {

    public static void placeRailcraftCart(IRailcraftCartContainer cartType, EntityPlayer owner, ItemStack cartStack, World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if ((TrackTools.isRailBlock(state) || state.getBlock() instanceof ITraincraftTrack) && !CartToolsAPI.isMinecartAt(world, pos, 0.0F)) {
            EntityMinecart cart = cartType.makeCart(cartStack, world, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);
            if (cartStack.hasDisplayName()) {
                cart.setCustomNameTag(cartStack.getDisplayName());
            }
            CartToolsAPI.setCartOwner(cart, owner);
            world.spawnEntity(cart);
        }
    }

}
