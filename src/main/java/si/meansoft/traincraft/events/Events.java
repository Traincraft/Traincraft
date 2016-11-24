/*
 * This file ("Events.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * @author canitzp
 */
public class Events{

    public static void init(FMLInitializationEvent event){
        registerEvent(new MinecartMovement());
    }

    private static void registerEvent(Object c){
        MinecraftForge.EVENT_BUS.register(c);
    }

}
