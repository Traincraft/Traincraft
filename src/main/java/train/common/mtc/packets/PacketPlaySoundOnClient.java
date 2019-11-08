package train.common.mtc.packets;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import train.common.api.Locomotive;

/*
public class PacketPlaySoundOnClient implements IMessage {
    public int entity;
    public String sound;


    public PacketPlaySoundOnClient() {
    }

    public PacketPlaySoundOnClient(int entity, String sound) {
        // Entity TrainEntity = context.getServerHandler().playerEntity.ridingEntity;
        this.entity = entity;
        this.sound = sound;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entity = buf.readInt();
        sound = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, sound);
    }

}*/

public class PacketPlaySoundOnClient implements IMessage {
    public int entityID;
    public String sound;

    public PacketPlaySoundOnClient() {}

    public PacketPlaySoundOnClient(Integer entityID, String sound) {
        this.entityID = entityID;
        this.sound = sound;
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.entityID = buf.readInt();
        sound = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        ByteBufUtils.writeUTF8String(buf, sound);
    }
}