package si.meansoft.traincraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author canitzp
 */
public class PacketSyncFluid implements IMessage {

    public FluidStack fluidStack;
    public int worldId, x, y, z, maxAmount;
    public String methodName;

    public PacketSyncFluid(){}

    public PacketSyncFluid(World world, BlockPos pos, FluidTank tank, String methodName){
        this.fluidStack = tank.getFluid();
        this.worldId = world.provider.getDimension();
        this.x = pos.getX();
        this.y = pos.getY();
        this.z = pos.getZ();
        this.methodName = methodName;
        this.maxAmount = tank.getCapacity();
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.fluidStack = new FluidStack(FluidRegistry.getFluid(ByteBufUtils.readUTF8String(buf)), buf.readInt());
        this.worldId = buf.readInt();
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.methodName = ByteBufUtils.readUTF8String(buf);
        this.maxAmount = buf.readInt();
    }
    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, this.fluidStack.getFluid().getName());
        buf.writeInt(this.fluidStack.amount);
        buf.writeInt(this.worldId);
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        ByteBufUtils.writeUTF8String(buf, this.methodName);
        buf.writeInt(this.maxAmount);
    }

    public static class Handler implements IMessageHandler<PacketSyncFluid, IMessage> {
        @Override
        public IMessage onMessage(PacketSyncFluid message, MessageContext ctx) {
            World world = DimensionManager.getWorld(message.worldId);
            TileEntity tile = world.getTileEntity(new BlockPos(message.x, message.y, message.z));
            try {
                tile.getClass().getDeclaredField(message.methodName).set(tile, new FluidTank(message.fluidStack, message.maxAmount));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
