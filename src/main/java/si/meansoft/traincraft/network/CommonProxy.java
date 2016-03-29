/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.network;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonProxy {

    protected static List<Item> renderList = new ArrayList<Item>();
    protected static HashMap<Block, ResourceLocation> forgeRender = new HashMap<Block, ResourceLocation>();

    public void preInit(FMLPreInitializationEvent event){}

    public void init(FMLInitializationEvent event){}

    public void postInit(FMLPostInitializationEvent event){}

    public static void addStackToRender(Item item){
        if(!renderList.contains(item)) {
            renderList.add(item);
        }
    }

    public static void addForgeRender(Block block, ResourceLocation location){
        if(!forgeRender.containsKey(block)){
            forgeRender.put(block, location);
        }
    }

}
