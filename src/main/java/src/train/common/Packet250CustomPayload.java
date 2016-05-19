package src.train.common;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.nio.charset.Charset;


public class Packet250CustomPayload implements IMessage {
        public String channel;
        public int length;
        public byte data[];
        public Packet250CustomPayload() {}
        /*/
        public void readPacketData(PacketBuffer datainputstream)
                throws IOException {
                channel = datainputstream.readStringFromBuffer(16);
                length = datainputstream.readShort();
                if (length > 0 && length < 32767)
                {
                        data = new byte[length];
                        datainputstream.readBytes(data);
                }
        }
        public void writePacketData(PacketBuffer dataoutputstream)
                throws IOException {
                dataoutputstream.writeStringToBuffer(channel);
                dataoutputstream.writeShort((short) length);
                if (data != null)
                {
                        dataoutputstream.writeBytes(data);
                }
        }
        public void processPacket(INetHandler nethandler) {
                //nethandler.func_44028_a(this);
        }
        /*/

        private int toSend;
        public Packet250CustomPayload(String channel, byte[] data) {
                this.channel = channel;
                this.length = data.length;
                this.data = data;
        }

        @Override
        public void toBytes(ByteBuf buf) {
                // Writes the int into the buf
                channel = buf.toString();
                buf.writeShort((short) length);
                if (data != null)
                {
                        buf.writeBytes(data);
                }
                //buf.writeInt(toSend);
        }

        @Override
        public void fromBytes(ByteBuf buf) {
                // Reads the int back from the buf. Note that if you have multiple values, you must read in the same order you wrote.

                channel = buf.toString(0,16, Charset.defaultCharset());
                length = buf.readShort();
                if (length > 0 && length < 32767)
                {
                        data = new byte[length];
                        buf.readBytes(data);
                }

                //toSend = buf.readInt();
        }
        public int getPacketSize() {
                return 2 + channel.length() * 2 + 2 + length;
        }
}
