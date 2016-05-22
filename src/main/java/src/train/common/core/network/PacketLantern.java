package src.train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import src.train.common.api.Locomotive;

public class PacketLantern implements IMessage {

    /** The key that was pressed. */
    int color;
    int xPos;
    int yPos;
    int zPos;
    public PacketLantern() {}

    public PacketLantern(int color, int x, int y, int z) {

        this.color = color;
        this.xPos = x;
        this.yPos = y;
        this.zPos = z;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.color = bbuf.readInt();
        this.xPos = bbuf.readInt();
        this.yPos = bbuf.readInt();
        this.zPos = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeInt(this.color);
        bbuf.writeInt(this.xPos);
        bbuf.writeInt(this.yPos);
        bbuf.writeInt(this.zPos);
    }

    public static class Handler implements IMessageHandler<PacketLantern, IMessage> {

        @Override
        public IMessage onMessage(PacketLantern message, MessageContext context) {

            return null;
        }
    }
}