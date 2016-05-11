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
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
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
        for(ItemBlock item : forgeRender){
            if(item != null) {
                registerForgeBlock(item);
            }
        }
        OBJLoader.INSTANCE.addDomain(Traincraft.NAME);
        for(Map.Entry<Class<? extends TileEntity>, TileEntitySpecialRenderer> entry : objRender.entrySet()){
            ClientRegistry.bindTileEntitySpecialRenderer(entry.getKey(), entry.getValue());
        }
    }

    private void registerModel(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    private void registerForgeBlock(ItemBlock block){
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
