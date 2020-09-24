/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("Traincraft.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import traincraft.api.TraincraftAddonLoader;
import traincraft.blocks.TCBlocks;
import traincraft.blocks.assemblytables.AssemblyTableRecipe;
import traincraft.blocks.distillery.DistilleryRecipe;
import traincraft.blocks.trainworkbench.TrainWorkbenchRecipe;
import traincraft.capabilities.CapabilityWorldWind;
import traincraft.entity.TCEntities;
import traincraft.items.TCItems;
import traincraft.liquids.TCLiquids;
import traincraft.network.GuiHandler;
import traincraft.network.PacketTraincraftEntity;
import traincraft.world.OreHandler;
import traincraft.world.WorldGenWorld;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Mod(modid = Traincraft.MOD_ID, name = Traincraft.MOD_NAME, version = Traincraft.MOD_VERSION)
public class Traincraft {
    
    /* Mod relevant information */
    public static final String MOD_ID = "traincraft";
    public static final String MOD_NAME = "Traincraft";
    public static final String MOD_VERSION = "@VERSION@";
    /* TrainCraft Logger */
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static final SimpleNetworkWrapper TC_NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID);
    /* TrainCraft instance */
    @Mod.Instance(MOD_ID)
    public static Traincraft INSTANCE;
    /* Creative tab for Traincraft */
    public static CreativeTabs TAB = new CreativeTabs(MOD_ID) {
        @Override
        public ItemStack createIcon(){
            return new ItemStack(TCItems.CANISTER);
        }
        
        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> stacks){
            List<Item> blocks = new ArrayList<>();
            List<Item> armor = new ArrayList<>();
            List<Item> items = new ArrayList<>();
            for(Item item : ForgeRegistries.ITEMS){
                if(item.getRegistryName() != null && item.getRegistryName().getNamespace().equals(MOD_ID)){
                    if(item instanceof ItemBlock){
                        blocks.add(item);
                    } else if(item instanceof ItemArmor){
                        armor.add(item);
                    } else{
                        items.add(item);
                    }
                }
            }
            blocks.forEach(item -> item.getSubItems(this, stacks));
            armor.forEach(item -> item.getSubItems(this, stacks));
            items.forEach(item -> item.getSubItems(this, stacks));
        }
    };
    public static File configDirectory;
    
    public File gameDirectory;
    
    static{
        FluidRegistry.enableUniversalBucket();
    }
    
    public Traincraft(){
    
    }
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        this.gameDirectory = event.getModConfigurationDirectory().getParentFile();
        LOGGER.info("Starting Traincraft " + MOD_VERSION + "!");
        /* Config handler */
        configDirectory = event.getModConfigurationDirectory();
        //Config.initialize(event.getSuggestedConfigurationFile());
        
        /* Register Items, Blocks, ... */
        LOGGER.info("Initialize Blocks, Items, ...");
        TCEntities.registerEntities(event);
        TCLiquids.registerLiquids(event);
        
        /* Ore dictionary */
        LOGGER.info("Register Ores into OreDictionary");
        OreHandler.registerOres();
        
        GameRegistry.registerWorldGenerator(WorldGenWorld.INSTANCE, 5);
        
        LOGGER.info("Finished PreInitialization");
    }
    
    @Mod.EventHandler
    public void load(FMLInitializationEvent event){
        LOGGER.info("Start Initialization");
        
        LOGGER.info("Initializing Network Packets");
        NetworkRegistry.INSTANCE.registerGuiHandler(Traincraft.INSTANCE, new GuiHandler());
        TC_NETWORK.registerMessage(PacketTraincraftEntity.class, PacketTraincraftEntity.class, 0, Side.SERVER);
        TC_NETWORK.registerMessage(PacketTraincraftEntity.class, PacketTraincraftEntity.class, 1, Side.CLIENT);
        
        if(event.getSide() == Side.CLIENT){
            LOGGER.info("Register item color handler");
            for(Item item : ForgeRegistries.ITEMS){
                if(item.getRegistryName() != null && item.getRegistryName().getNamespace().equals(MOD_ID)){
                    if(item instanceof IItemColor){
                        Minecraft.getMinecraft().getItemColors().registerItemColorHandler((IItemColor) item, item);
                    }
                }
            }
            
            LOGGER.info("Register Keys");
            
        }
        
        /* Recipes */
        LOGGER.info("Initialize Smelting Recipe");
        GameRegistry.addSmelting(TCBlocks.COPPER_ORE, new ItemStack(TCItems.COPPER_INGOT, 1), 0.7f);
        
        File addonRoot = new File(this.gameDirectory, "traincraft");
        LOGGER.info("Loading internal files");
        TraincraftAddonLoader.loadInternals(event.getSide(), MOD_ID);
        LOGGER.info("Loading external addons");
        TraincraftAddonLoader.loadFolders(event.getSide(), addonRoot);
        
        LOGGER.info("Finished Initialization");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt){
        LOGGER.info("Start to PostInitialize");
        
        LOGGER.info("Initializing Capabilities");
        CapabilityWorldWind.register();
        
        LOGGER.info("Register ChunkHandler");
        
        LOGGER.info("Activation Mod Compatibility");
        
        if(evt.getSide().isClient()){
            LOGGER.info("Register Reload Listener");
            ((IReloadableResourceManager) Minecraft.getMinecraft().getResourceManager()).registerReloadListener(this::onResourceReload);
        }
        
        LOGGER.info("Finished PostInitialization");
    }
    
    public void onResourceReload(IResourceManager resourceManager){
        // add distillery & trainworkbench recipes to new list
        DistilleryRecipe.DISTIL_RECIPES.clear();
        TrainWorkbenchRecipe.TRAINWORKBENCH_RECIPES.clear();
        ForgeRegistries.RECIPES.forEach(recipe -> {
            if(recipe instanceof DistilleryRecipe){
                DistilleryRecipe.DISTIL_RECIPES.add((DistilleryRecipe) recipe);
            } else if(recipe instanceof TrainWorkbenchRecipe){
                TrainWorkbenchRecipe.TRAINWORKBENCH_RECIPES.add((TrainWorkbenchRecipe) recipe);
            } else if(recipe instanceof AssemblyTableRecipe){
                AssemblyTableRecipe.ASSEMBLY_TABLE_RECIPES.add((AssemblyTableRecipe) recipe);
            }
        });
    }
    
}