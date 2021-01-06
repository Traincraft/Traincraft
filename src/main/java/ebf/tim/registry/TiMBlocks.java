package ebf.tim.registry;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.rails.BlockRailCore;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerBlock;

public class TiMBlocks {

    /**the crafting table for trains*/
    //public static BlockDynamic trainTable = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true); //original
    public static BlockDynamic trainTableTier1 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 1);
    public static BlockDynamic trainTableTier2 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 2);
    public static BlockDynamic trainTableTier3 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 3);

    public static BlockDynamic railTable = new BlockDynamic(new Material(MapColor.mapColorArray[6]), true, true);

    public static BlockRailCore railBlock = new BlockRailCore(750,1f);


    public static void registerBlocks(){

        registerBlock(railBlock, null, TrainsInMotion.MODID,"block.timrail", null, TrainsInMotion.proxy.getTESR());

        //register the train crafting table
        //addRecipe(new ItemStack(registerBlock(trainTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintable", null, null),1),
        //        "WWW", "WIW", "WWW", 'W', Blocks.planks, 'I', Items.iron_ingot); //original
        addRecipe(new ItemStack(registerBlock(trainTableTier1, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintabletier1", null, null),1),
                "IPI", "S S", "SPS", 'S', Blocks.stone, 'I', Items.iron_ingot, 'P', Blocks.piston); //tier 1
        addRecipe(new ItemStack(registerBlock(trainTableTier2, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintabletier2", null, null),1),
                "GPG", "O O", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston); //tier 2
        addRecipe(new ItemStack(registerBlock(trainTableTier3, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintabletier3", null, null),1),
                "GPG", "DLD", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone); //tier 3

        addRecipe(new ItemStack(registerBlock(railTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.railtable", null, null),1),
                "III", "I I", "I I", 'I', Items.iron_ingot);

    }
}
