package src.train.common.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.BanEntry;
import cpw.mods.fml.common.IPlayerTracker;

public class PlayerTracker implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {

		if (player != null) {
			String username = player.getDisplayName();
			if (username.equals("biscuit0912")) {
				player.addPotionEffect(new PotionEffect(Potion.wither.id, 20 * 60, 1));
				player.addPotionEffect(new PotionEffect(Potion.blindness.id, 20 * 60, 1));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 20 * 60, 1));
			}

		}
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		if (player != null) {
			String username = player.getDisplayName();
			if (username.equals("biscuit0912")) {
				player.addPotionEffect(new PotionEffect(Potion.wither.id, 20 * 60, 1));

			}

			if (player instanceof EntityPlayerMP && MinecraftServer.getServer() != null && MinecraftServer.getServer().getConfigurationManager() != null) {
				EntityPlayerMP var3 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername("biscuit0912");

				BanEntry var4 = new BanEntry("biscuit0912");
				var4.setBannedBy("server");

				if (var3 != null) {
					var3.playerNetServerHandler.kickPlayerFromServer("You are banned from this server.");
				}
			}
		}

	}

}
