package train.client.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.network.EnumKeyEvent;
import traincraft.network.TCEntityPackets;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCKeyHandler {
	
	public static KeyBinding horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
	
	public static void register() {
		ClientRegistry.registerKeyBinding(horn);
	}
	
	@SubscribeEvent
	public static void onKeyInput(InputEvent.KeyInputEvent event) {
		Entity ridingEntity = Minecraft.getMinecraft().player.getRidingEntity();
		if(ridingEntity instanceof AbstractRollingStock<?>){
			List<EnumKeyEvent> pressedKeys = new ArrayList<>();
			GameSettings settings = Minecraft.getMinecraft().gameSettings;
			if(settings.keyBindForward.isPressed()){
				pressedKeys.add(EnumKeyEvent.FORWARD);
			}
			if(settings.keyBindBack.isPressed()){
				pressedKeys.add(EnumKeyEvent.BACKWARD);
			}
			if(settings.keyBindLeft.isPressed()){
				pressedKeys.add(EnumKeyEvent.LEFT);
			}
			if(settings.keyBindRight.isPressed()){
				pressedKeys.add(EnumKeyEvent.RIGHT);
			}
			if(settings.keyBindJump.isPressed()){
				pressedKeys.add(EnumKeyEvent.UP);
			}
			if(settings.keyBindSneak.isPressed()){
				pressedKeys.add(EnumKeyEvent.DOWN);
			}
			if(horn.isPressed()){
				pressedKeys.add(EnumKeyEvent.HORN);
			}
			if(!pressedKeys.isEmpty()){
				NBTTagCompound data = new NBTTagCompound();
				data.setBoolean("gui_open", Minecraft.getMinecraft().currentScreen != null);
				data.setIntArray("pressed_keys", pressedKeys.stream().mapToInt(Enum::ordinal).toArray());
				TCEntityPackets.KEY_PRESS.sendToServer((AbstractRollingStock<?>) ridingEntity, data);
			}
		}
	}
	
}