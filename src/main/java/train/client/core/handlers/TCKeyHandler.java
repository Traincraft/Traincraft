package train.client.core.handlers;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiMTCInfo;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.core.network.PacketKeyPress;
import train.common.items.ItemRemoteController;


public class TCKeyHandler {
	public static KeyBinding horn;
	public static KeyBinding inventory;
	public static KeyBinding up;
	public static KeyBinding down;
	public static KeyBinding idle;
	public static KeyBinding furnace;
	public static KeyBinding MTCScreen;
	public static KeyBinding toggleATO;
	public static KeyBinding mtcOverride;
	public static KeyBinding overspeedOverride;
	public static KeyBinding remoteControlForward;
	public static KeyBinding remoteControlBackwards;
	public static KeyBinding remoteControlHorn;
	public static KeyBinding remoteControlBrake;
	public static KeyBinding remoteControlParkingBrake;
	public TCKeyHandler() {
		horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(horn);
		inventory = new KeyBinding("key.traincraft.inventory", Keyboard.KEY_R, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(inventory);
		up = new KeyBinding("key.traincraft.up", Keyboard.KEY_Y, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(up);
		down = new KeyBinding("key.traincraft.down", Keyboard.KEY_X, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(down);
		idle = new KeyBinding("key.traincraft.idle", Keyboard.KEY_C, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(idle);
		furnace = new KeyBinding("key.traincraft.furnace", Keyboard.KEY_F, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(furnace);
		if (Loader.isModLoaded("ComputerCraft")) {
			MTCScreen = new KeyBinding("key.traincraft.showMTCScreen", Keyboard.KEY_M, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(MTCScreen);
			toggleATO = new KeyBinding("key.traincraft.toggleATO", Keyboard.KEY_O, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(toggleATO);
			mtcOverride = new KeyBinding("key.traincraft.mtcOverride", Keyboard.KEY_T, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(mtcOverride);
			overspeedOverride = new KeyBinding("key.traincraft.overspeedOverride", Keyboard.KEY_L, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(overspeedOverride);
}
		remoteControlForward = new KeyBinding("key.traincraft.remoteforward", Keyboard.KEY_UP, "key.categories.traincraft");
		remoteControlBackwards = new KeyBinding("key.traincraft.remotebackwards", Keyboard.KEY_DOWN, "key.categories.traincraft");
		remoteControlHorn = new KeyBinding("key.traincraft.remotehorn", Keyboard.KEY_O, "key.categories.traincraft");
		remoteControlBrake = new KeyBinding("key.traincraft.remotebrake", Keyboard.KEY_P, "key.categories.traincraft");
		remoteControlParkingBrake = new KeyBinding("key.traincraft.parkingbrake", Keyboard.KEY_B, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(remoteControlForward);
		ClientRegistry.registerKeyBinding(remoteControlBackwards);
		ClientRegistry.registerKeyBinding(remoteControlHorn);
		ClientRegistry.registerKeyBinding(remoteControlBrake);
		ClientRegistry.registerKeyBinding(remoteControlParkingBrake);
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
			Item currentItem = new Item();
			if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem() != null) {
				currentItem = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem().getItem();
			}
			boolean hasController = currentItem instanceof ItemRemoteController;

			if (up.getIsKeyPressed()) {
				sendKeyControlsPacket(0);
			}
			if (down.getIsKeyPressed()) {
				sendKeyControlsPacket(2);
			}
			if (idle.isPressed()) {
				sendKeyControlsPacket(6);
			}
			if (inventory.isPressed()) {
				sendKeyControlsPacket(7);
			}
			if (horn.isPressed()) {
				sendKeyControlsPacket(8);
			}
			if (furnace.isPressed()) {
				sendKeyControlsPacket(9);
			}

			/*if (remoteControlForward.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(4);
					System.out.println("Forward!!");
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}

			} else if (!remoteControlForward.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(13);
				}
			}

			if (remoteControlBackwards.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(5);
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}
			}  else if (!remoteControlBackwards.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(14);
				}
			}

			if (remoteControlHorn.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(8);
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}
			}

			if (remoteControlBrake.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(12);
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}
			}  else if (!remoteControlBrake.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(15);
				}
			}

}*/
			if (remoteControlParkingBrake.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController) currentItem;
				if (theController.attachedLoco != null) {
					if (theController.attachedLoco.getParkingBrakeFromPacket()) {
						theController.sendParkingBrake(false);
					} else {
						theController.sendParkingBrake(true);
					}
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}

			}

			if (remoteControlHorn.isPressed() && hasController) {
				ItemRemoteController theController = (ItemRemoteController)currentItem;
				if (theController.attachedLoco != null) {
					theController.sendKeyPacket(8);
				} else {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("The controller is not paired to a train yet!"));
				}
			}

			if (Loader.isModLoaded("ComputerCraft")) {
				if (MTCScreen.isPressed() && !FMLClientHandler.instance().isGUIOpen(GuiMTCInfo.class)) {
					if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
//&&((Locomotive)Minecraft.getMinecraft().thePlayer.ridingEntity).getTrainOwner().equals(Minecraft.getMinecraft().thePlayer.getDisplayName()))
						if (((Locomotive)Minecraft.getMinecraft().thePlayer.ridingEntity).locked) {
							if (((Locomotive)Minecraft.getMinecraft().thePlayer.ridingEntity).getTrainOwner().equals(Minecraft.getMinecraft().thePlayer.getDisplayName())) {
								Minecraft.getMinecraft().displayGuiScreen(new GuiMTCInfo(Minecraft.getMinecraft().thePlayer.ridingEntity));
						}

						} else {
							Minecraft.getMinecraft().displayGuiScreen(new GuiMTCInfo(Minecraft.getMinecraft().thePlayer.ridingEntity));
						}
					}
				}
				if (toggleATO.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					sendKeyControlsPacket(16);
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
					if (train.mtcStatus != 0 && train.mtcType == 2) {
						if (!train.trainIsATOSupported()) {
							((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("Automatic Train Operation is not supported for this train"));
						} else {
							if (train.atoStatus == 1) {
								train.atoStatus = 0;
							} else {
								train.atoStatus = 1;
							}
						}

					} else {
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("Automatic Train Operation can only be activated when you are using W-MTC"));
					}

				}


				if (mtcOverride.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;


					if (train.mtcOverridePressed) {
						train.mtcOverridePressed = false;
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("MTC has been enabled and will re-activate when the system receives new data"));
					} else {
						train.mtcOverridePressed = true;
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("MTC has been disabled and will not receive speed changes or transmit MTC data"));
						train.mtcStatus = 0;
						train.speedLimit = 0;
						train.nextSpeedLimit = 0;
						train.xSpeedLimitChange = 0.0;
						train.ySpeedLimitChange = 0.0;
						train.zSpeedLimitChange = 0.0;
						train.xFromStopPoint = 0.0;
						train.yFromStopPoint = 0.0;
						train.zFromStopPoint = 0.0;
						train.trainLevel = "0";

					}
					sendKeyControlsPacket(17);
				}
				if (overspeedOverride.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
					sendKeyControlsPacket(18);
					if (train.mtcStatus == 1 | train.mtcStatus == 2) {
						if (train.overspeedOveridePressed) {
							train.overspeedOveridePressed = false;
						} else {
							train.overspeedOveridePressed = true;
						}
					}
				}

			}
		}

		//if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
		//	sendKeyControlsPacket(404);
		//}
	}


	
	private static void sendKeyControlsPacket(int key)
	{
		Traincraft.keyChannel.sendToServer(new PacketKeyPress(key));
	}
}