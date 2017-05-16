/*
 * This file ("PacketUpdateBlockState.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.network.packets;

import com.google.common.base.Optional;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author canitzp
 */
public class PacketUpdateBlockState<T extends Comparable<T>> implements IMessage, IMessageHandler<PacketUpdateBlockState<T>, IMessage> {

    private BlockPos blockPos;
    private String property, propertyName;

    public PacketUpdateBlockState() {
    }

    public PacketUpdateBlockState(IBlockState state, BlockPos pos, IProperty<T> property) {
        this.blockPos = pos;
        this.property = property.getName(state.getValue(property));
        this.propertyName = property.getName();
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        PacketBuffer buffer = new PacketBuffer(buf);
        this.blockPos = buffer.readBlockPos();
        this.propertyName = buffer.readString(Integer.MAX_VALUE);
        this.property = buffer.readString(Integer.MAX_VALUE);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        PacketBuffer buffer = new PacketBuffer(buf);
        buffer.writeBlockPos(this.blockPos);
        buffer.writeString(this.propertyName);
        buffer.writeString(this.property);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IMessage onMessage(PacketUpdateBlockState<T> message, MessageContext ctx) {
        World world = Minecraft.getMinecraft().world;
        if (world != null) {
            IBlockState state = world.getBlockState(message.blockPos);
            for (IProperty<?> property : state.getPropertyKeys()) {
                if (property.getName().equals(message.propertyName)) {
                    IProperty<T> prop = (IProperty<T>) property;
                    Optional<T> optional = prop.parseValue(message.property);
                    if (optional.isPresent()) {
                        state.withProperty(prop, optional.get());
                    }
                }
            }
        }
        return null;
    }

}
