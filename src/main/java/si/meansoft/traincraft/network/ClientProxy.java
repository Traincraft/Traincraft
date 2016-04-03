/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.network;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.traincraft.Traincraft;

import java.util.Map;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        for(Item item : renderList){
            if(item != null) {
                registerModel(item);
            }
        }
        for(Map.Entry<Block, ResourceLocation> entry : forgeRender.entrySet()){
            if(entry.getKey() != null && entry.getValue() != null){
                registerForgeBlock(entry.getKey(), entry.getValue());
            }
        }
    }

    private void registerModel(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    private void registerForgeBlock(Block block, ResourceLocation location){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(location, "inventory"));
    }
}
