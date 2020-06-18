package traincraft.liquids;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import traincraft.Traincraft;
import traincraft.blocks.TCBlocks;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TCLiquids {
    
    public static final Fluid OIL = new Fluid("traincraft:oil", new ResourceLocation(Traincraft.MOD_ID, "fluids/oil_still"), new ResourceLocation(Traincraft.MOD_ID, "fluids/oil_flowing"));
    public static final Fluid REFINED_FUEL = new Fluid("traincraft:refined_fuel", new ResourceLocation(Traincraft.MOD_ID, "fluids/refined_fuel_still"), new ResourceLocation(Traincraft.MOD_ID, "fluids/refined_fuel_flowing"));
    public static final Fluid DIESEL = new Fluid("traincraft:diesel", new ResourceLocation(Traincraft.MOD_ID, "fluids/diesel_still"), new ResourceLocation(Traincraft.MOD_ID, "fluids/diesel_flowing"));
    
    public static void registerLiquids(FMLPreInitializationEvent event){
        registerLiquid(OIL);
        registerLiquid(REFINED_FUEL);
        registerLiquid(DIESEL);
    }
    
    private static void registerLiquid(Fluid fluid){
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
    
    @SubscribeEvent
    public static void modelRegistryEvent(ModelRegistryEvent event){
        try{
            for(Field field : TCLiquids.class.getDeclaredFields()){
                if(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())){
                    Object obj = field.get(null);
                    if(obj instanceof Fluid){
                        registerFluidRenderer((Fluid) obj);
                    }
                }
            }
        }catch(IllegalAccessException ignored){}
    }
    
    private static void registerFluidRenderer(Fluid fluid) {
        Block block = fluid.getBlock();
        Item item = Item.getItemFromBlock(block);
        final ModelResourceLocation loc = new ModelResourceLocation(new ResourceLocation(Traincraft.MOD_ID, "fluids"), fluid.getName());
        ItemMeshDefinition mesh = stack -> loc;
        StateMapperBase mapper = new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return loc;
            }
        };
        ModelLoader.registerItemVariants(item);
        ModelLoader.setCustomMeshDefinition(item, mesh);
        ModelLoader.setCustomStateMapper(block, mapper);
    }
    
}
