package train.common.core.network;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.mtc.packets.PacketPlaySoundOnClient;

public class PacketPlaySoundOnClientHandler implements IMessageHandler<PacketPlaySoundOnClient, IMessage> {


        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(PacketPlaySoundOnClient message, MessageContext ctx) {

            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord
                    .func_147673_a(new ResourceLocation(message.sound)));
            return null;
        }

}
