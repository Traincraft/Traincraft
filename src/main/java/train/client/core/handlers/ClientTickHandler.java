package train.client.core.handlers;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemStack;
import train.client.core.helpers.CapesHelper;
import train.common.Traincraft;
import train.common.core.CommonProxy;
import train.common.core.util.MP3Player;
import train.common.library.Info;

import java.util.Objects;

public class ClientTickHandler {
    private static final Minecraft mc = Minecraft.getMinecraft();
    private static boolean isHidden = false;

    @SubscribeEvent
    public void tick(TickEvent event) {
        if (event.side != Side.CLIENT) {
            return;
        }

        if (Objects.requireNonNull(event.phase) == TickEvent.Phase.START) {
            tickStart(event);
        }
    }

    private void tickStart(TickEvent event) {
        if (mc.theWorld == null) { // fixes streaming after exiting a world
            for (MP3Player player : CommonProxy.playerList) if (player != null) player.stop();
            CommonProxy.playerList.clear();
        }
        if (mc.theWorld != null && mc.theWorld.playerEntities != null) {
            for (Object p : mc.theWorld.playerEntities) {
                AbstractClientPlayer player = (AbstractClientPlayer) p;
                CapesHelper user = CapesHelper.users.get(player.getDisplayName());

                if (user == null) {
                    user = new CapesHelper(player.getDisplayName());
                    CapesHelper.users.put(player.getDisplayName(), user);
                    user.setDaemon(true);
                    user.setName("Cape for " + player.getDisplayName());
                    user.start();
                } else if (CapesHelper.isLoaded && user.MCCape) {
                    // NOTE: func_152121_a = switchTexture
                    player.func_152121_a(MinecraftProfileTexture.Type.CAPE, user.getCurrentRL());
                }
            }
        }

        if (!isHidden && Traincraft.hasNotEnoughItems()) {
            if (mc.theWorld != null && mc.theWorld.playerEntities != null) {
                Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Info.modID + ":tcRail")));
                Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Info.modID + ":tcRailGag")));
                isHidden = true;
            }
        }
    }

}