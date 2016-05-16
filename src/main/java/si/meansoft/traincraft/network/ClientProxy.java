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
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.traincraft.FluidRegistry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.blocks.BlockRail;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy {

    public static HashMap<BlockRail.Rails, IBakedModel> railModels = new HashMap<>();
    private static boolean hasBaked = false;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        this.registerFluidRenderer(FluidRegistry.diesel);
        OBJLoader.INSTANCE.addDomain("traincraft");
        for(Map.Entry<ItemStack, ModelResourceLocation> entry : forgeRender.entrySet()){
            this.registerForgeRenderer(entry.getKey(), entry.getValue());
        }
        for(Map.Entry<Class<? extends TileEntity>, TileEntitySpecialRenderer> entry : objRender.entrySet()){
            ClientRegistry.bindTileEntitySpecialRenderer(entry.getKey(), entry.getValue());
        }
    }

    private void registerForgeRenderer(ItemStack stack, ModelResourceLocation location){
        ModelLoader.setCustomModelResourceLocation(stack.getItem(), stack.getItemDamage(), location);
    }

    private void registerFluidRenderer(Fluid fluid){
        Block block = fluid.getBlock();
        Item item = Item.getItemFromBlock(block);
        final ModelResourceLocation loc = new ModelResourceLocation(new ResourceLocation(Traincraft.MODID, "fluids"), fluid.getName());
        ItemMeshDefinition mesh = new ItemMeshDefinition(){
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack){
                return loc;
            }
        };
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

    public static void bakeAllModels(){
        if(!hasBaked){
            System.out.println("bake");
            for(BlockRail.Rails rail : BlockRail.Rails.values()){
                railModels.put(rail, Util.getBakedModel(rail.location));
            }
            hasBaked = true;
        }
    }

}
