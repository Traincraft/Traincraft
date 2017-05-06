/*
 * This file ("MinecartMovement.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.events;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.minecart.MinecartUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import si.meansoft.traincraft.api.ITraincraftTrack;

/**
 * @author canitzp
 */
@Mod.EventBusSubscriber
public class MinecartMovement {

    @SubscribeEvent
    public void onMinecraftTick(MinecartUpdateEvent event) {
        EntityMinecart cart = event.getMinecart();
        World world = cart.getEntityWorld();
        BlockPos cartPos = event.getPos();
        if (!cart.isDead) {
            IBlockState cartBlockState = world.getBlockState(cartPos);
            if (cartBlockState.getBlock() instanceof ITraincraftTrack) {
                ((ITraincraftTrack) cartBlockState.getBlock()).onMinecartDriveOver(world, cartPos, cartBlockState, cart, cart.getPassengers().isEmpty() ? null : cart.getPassengers().get(0));
            }
        }
    }

    @SubscribeEvent
    public void onMinecartInit(EntityEvent.EntityConstructing event) {
        Entity entity = event.getEntity();
        if (entity instanceof EntityMinecart) {
            //entity.getDataManager().register(Util.TEST, false);
        }
    }

}
