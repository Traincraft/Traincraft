package train.client.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.network.TCPackets;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCKeyHandler {
	
	public static KeyBinding horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
	public static KeyBinding inventory = new KeyBinding("key.traincraft.inventory", Keyboard.KEY_R, "key.categories.traincraft");
	public static KeyBinding up = new KeyBinding("key.traincraft.up", Keyboard.KEY_Y, "key.categories.traincraft");
	public static KeyBinding down = new KeyBinding("key.traincraft.down", Keyboard.KEY_X, "key.categories.traincraft");
	public static KeyBinding idle = new KeyBinding("key.traincraft.idle", Keyboard.KEY_C, "key.categories.traincraft");
	public static KeyBinding furnace = new KeyBinding("key.traincraft.furnace", Keyboard.KEY_F, "key.categories.traincraft");
	
	/*public static KeyBinding MTCScreen;
	public static KeyBinding toggleATO;
	public static KeyBinding mtcOverride;
	public static KeyBinding overspeedOverride;
	public static KeyBinding remoteControlForward;
	public static KeyBinding remoteControlBackwards;
	public static KeyBinding remoteControlHorn;
	public static KeyBinding remoteControlBrake;*/
	
	public static void register(){
		ClientRegistry.registerKeyBinding(horn);
		ClientRegistry.registerKeyBinding(inventory);
		ClientRegistry.registerKeyBinding(up);
		ClientRegistry.registerKeyBinding(down);
		ClientRegistry.registerKeyBinding(idle);
		ClientRegistry.registerKeyBinding(furnace);
		
		/*if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			MTCScreen = new KeyBinding("key.traincraft.showMTCScreen", Keyboard.KEY_M, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(MTCScreen);
			toggleATO = new KeyBinding("key.traincraft.toggleATO", Keyboard.KEY_O, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(toggleATO);
			mtcOverride = new KeyBinding("key.traincraft.mtcOverride", Keyboard.KEY_T, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(mtcOverride);
			overspeedOverride = new KeyBinding("key.traincraft.overspeedOverride", Keyboard.KEY_L, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(overspeedOverride);
		}*/
	}

	@SubscribeEvent
	public static void onKeyInput(InputEvent.KeyInputEvent event) {
		Entity ridingEntity = Minecraft.getMinecraft().player.getRidingEntity();
		if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
			if (up.isPressed()) {
				//sendKeyControlsPacket(0);
			}
			if (down.isPressed()) {
				//sendKeyControlsPacket(2);
			}
			if (idle.isPressed()) {
				//sendKeyControlsPacket(6);
			}
			if (inventory.isPressed()) {
				//sendKeyControlsPacket(7);
			}
			if (horn.isPressed()) {
				if(ridingEntity instanceof AbstractRollingStock<?>){
					TCPackets.KEY_HORN.sendToServer((AbstractRollingStock<?>) ridingEntity, new NBTTagCompound());
				}
			}
			if (furnace.isPressed()) {
				//sendKeyControlsPacket(9);
			}
			/*if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
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

			}*/
		}

		//if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
		//	sendKeyControlsPacket(404);
		//}
	}

}