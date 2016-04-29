/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.network;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import si.meansoft.traincraft.Traincraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonProxy {

    protected static List<Item> renderList = new ArrayList<Item>();
    protected static List<ItemBlock> forgeRender = new ArrayList<ItemBlock>();
    public static SimpleNetworkWrapper wrapper;

    public void preInit(FMLPreInitializationEvent event){}

    public void init(FMLInitializationEvent event){
        wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Traincraft.MODID);
        wrapper.registerMessage(PacketSyncFluid.Handler.class, PacketSyncFluid.class, 0, Side.CLIENT);
    }

    public void postInit(FMLPostInitializationEvent event){}

    public static void addStackToRender(Item item){
        if(!renderList.contains(item)) {
            renderList.add(item);
        }
    }

    public static void addForgeRender(ItemBlock block){
        if(!forgeRender.contains(block)){
            forgeRender.add(block);
        }
    }

}
