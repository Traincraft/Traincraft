/*
 * This file ("CommonProxy.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.network;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.oredict.OreDictionary;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.blocks.BlockBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author canitzp
 */
public class CommonProxy {

    protected static Map<ItemStack, ModelResourceLocation> forgeRender = new HashMap<ItemStack, ModelResourceLocation>();
    protected static List<Fluid> fluids = new ArrayList<>();
    public static SimpleNetworkWrapper wrapper;
    public static Map<BlockBase, String> oreDicts = new HashMap<>();

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Traincraft.MODID);
        //wrapper.registerMessage(new PacketUpdateBlockState<>(), PacketUpdateBlockState.class, 0, Side.CLIENT);
    }

    public void postInit(FMLPostInitializationEvent event) {
        for (Map.Entry<BlockBase, String> entry : oreDicts.entrySet()) {
            Item itemBlock = Item.getItemFromBlock(entry.getKey());
            if (itemBlock != null) {
                OreDictionary.registerOre(entry.getValue(), itemBlock);
            }
        }
    }

    public static void addForgeRender(Item item) {
        forgeRender.put(new ItemStack(item), new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void addForgeRender(ItemStack stack, ModelResourceLocation location) {
        forgeRender.put(stack, location);
    }

    public static void addFluid(Fluid fluid) {
        fluids.add(fluid);
    }

}
