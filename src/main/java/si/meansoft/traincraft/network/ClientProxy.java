/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.network;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.client.renderer.TestVecRenderer;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.tile.TileEntityWindmill;

import java.util.Map;

/**
 * @author canitzp
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TestVecRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrack.class, new TileEntityTrack.TrackRenderer());
        for(Fluid fluid : fluids){
            this.registerFluidRenderer(fluid);
        }
        for(Map.Entry<ItemStack, ModelResourceLocation> entry : forgeRender.entrySet()){
            this.registerForgeRenderer(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

    private void registerForgeRenderer(ItemStack stack, ModelResourceLocation location){
        ModelLoader.setCustomModelResourceLocation(stack.getItem(), stack.getItemDamage(), location);
    }

    private void registerFluidRenderer(Fluid fluid){
        Block block = fluid.getBlock();
        Item item = Item.getItemFromBlock(block);
        final ModelResourceLocation loc = new ModelResourceLocation(new ResourceLocation(Traincraft.MODID, "fluids"), fluid.getName());
        ItemMeshDefinition mesh = stack -> loc;
        StateMapperBase mapper = new StateMapperBase(){
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state){
                return loc;
            }
        };
        ModelLoader.registerItemVariants(item);
        ModelLoader.setCustomMeshDefinition(item, mesh);
        ModelLoader.setCustomStateMapper(block, mapper);
    }

}
