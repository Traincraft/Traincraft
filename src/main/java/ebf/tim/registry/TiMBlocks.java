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
    public static BlockDynamic trainTable = new BlockDynamic(new Material(MapColor.mapColorArray[13]),true, 0); //tier 0 = "no tier"

    public static BlockDynamic railTable = new BlockDynamic(new Material(MapColor.mapColorArray[6]),true);

    public static BlockRailCore railBlock = new BlockRailCore(750,1f);


    public static void registerBlocks(){
        trainTable.setTextureName(TrainsInMotion.MODID +":textures/blocks/train_table.png");
        railTable.setTextureName(TrainsInMotion.MODID +":textures/blocks/rail_table.png");

        registerBlock(railBlock, null, TrainsInMotion.MODID,"block.timrail", null, TrainsInMotion.proxy.getTESR());

        //register the train crafting table
        addRecipe(new ItemStack(registerBlock(trainTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintable", null, null),1),
                "WWW", "WIW", "WWW", 'W', Blocks.planks, 'I', Items.iron_ingot); //original

        addRecipe(new ItemStack(registerBlock(railTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.railtable", null, null),1),
                "III", "I I", "I I", 'I', Items.iron_ingot);

    }
}
