/*
 * Traincraft
 * Copyright (c) 2011-2020.
 * <p>
 * This file ("ConfigHandler.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.api;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import traincraft.Traincraft;

@Config(modid = Traincraft.MOD_ID, category = "general")
@Config.LangKey(Traincraft.MOD_ID  + ":config.title")
public class ConfigHandler {

    @Config.LangKey(Traincraft.MOD_ID + ":config.copper_ore_gen")
    @Config.Comment("This toggles whether Copper ore will generate or not. Must be set before world generates.")
    public static boolean COPPER_ORE_GEN = true;

    @Config.LangKey(Traincraft.MOD_ID + ":config.other_ore_gen")
    @Config.Comment("This toggles whether Petroleum and Oil Sands will generate in the world. Must be set before world generates.")
    public static boolean OTHER_ORE_GEN = true;

    @Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
    private static class EventHandler {

        /**
         * Inject the new values and save to the config file when the config has been changed from the GUI.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Traincraft.MOD_ID)) {
                ConfigManager.sync(Traincraft.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
