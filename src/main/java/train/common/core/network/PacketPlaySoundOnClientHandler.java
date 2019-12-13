package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import train.common.mtc.packets.PacketPlaySoundOnClient;

public class PacketPlaySoundOnClientHandler implements IMessageHandler<PacketPlaySoundOnClient, IMessage> {


        @Override
        public IMessage onMessage(PacketPlaySoundOnClient message, MessageContext ctx) {
            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord
                    .func_147673_a(new ResourceLocation(message.sound)));
            return null;
        }

}
