package si.meansoft.traincraft.events;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.minecart.MinecartUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import si.meansoft.traincraft.api.ITraincraftTrack;

/**
 * @author canitzp
 */
public class MinecartMovement{

    @SubscribeEvent
    public static void onMinecraftTick(MinecartUpdateEvent event){
        EntityMinecart cart = event.getMinecart();
        World world = cart.getEntityWorld();
        BlockPos cartPos = event.getPos();
        if(!cart.isDead){
            IBlockState cartBlockState = world.getBlockState(cartPos);
            if(cartBlockState.getBlock() instanceof ITraincraftTrack){
                ((ITraincraftTrack) cartBlockState.getBlock()).onMinecartDriveOver(world, cartPos, cartBlockState, cart, cart.getPassengers().isEmpty() ? null : cart.getPassengers().get(0));
            }
        }
    }

}
