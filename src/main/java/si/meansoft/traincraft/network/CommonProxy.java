/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.network;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
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
import java.util.Map;

public class CommonProxy {

    protected static Map<ItemStack, ModelResourceLocation> forgeRender = new HashMap<ItemStack, ModelResourceLocation>();
    protected static HashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer> objRender = new HashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer>();
    public static SimpleNetworkWrapper wrapper;

    public void preInit(FMLPreInitializationEvent event){}

    public void init(FMLInitializationEvent event){
        wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Traincraft.MODID);
    }

    public void postInit(FMLPostInitializationEvent event){}

    public static void addForgeRender(Item item){
        forgeRender.put(new ItemStack(item), new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void addForgeRender(ItemStack stack, ModelResourceLocation location){
        forgeRender.put(stack, location);
    }

    public static void addOBJRender(Class<? extends TileEntity> tileEntity, TileEntitySpecialRenderer specialRenderer){
        if(!objRender.containsKey(tileEntity)){
            objRender.put(tileEntity, specialRenderer);
        }
    }

}
