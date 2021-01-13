package ebf.tim.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.OreGen;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerBlock;
import static ebf.tim.registry.TiMGenericRegistry.registerOreGen;

public class TiMOres {

    public static Item ingotSteel, ingotCopper, ingotAluminum, dustPlastic;

    public static BlockDynamic copperBlock = new BlockDynamic(new Material(MapColor.mapColorArray[2]), false, false);
    public static BlockDynamic steelBlock = new BlockDynamic(new Material(MapColor.mapColorArray[6]), false, false);
    public static BlockDynamic aluminiumBlock = new BlockDynamic(new Material(MapColor.mapColorArray[14]), false, false);

    public static BlockDynamic oreCopper = new BlockDynamic(new Material(MapColor.mapColorArray[11]), false, false);
    public static BlockDynamic oreSteel = new BlockDynamic(new Material(MapColor.mapColorArray[11]), false, false);
    public static BlockDynamic oreAluminium = new BlockDynamic(new Material(MapColor.mapColorArray[11]), false, false);



    public static void registerOres(){

        oreCopper.texture=new ResourceLocation("traincraft", "textures/blocks/ores/ore_copper.png");

        ingotSteel = createItem("ingot.steel", "ingotSteel").setTextureName(TrainsInMotion.MODID + ":materials/ingot.steel");
        dustPlastic = createItem("dust.plastic", "dustPlastic").setTextureName(TrainsInMotion.MODID + ":materials/dust.plastic");
        ingotCopper = createItem("ingot.copper", "ingotCopper").setTextureName(TrainsInMotion.MODID + ":materials/ingot.copper");
        ingotAluminum = createItem("ingot.aluminum", "ingotAluminum").setTextureName(TrainsInMotion.MODID + ":materials/ingot.aluminum");

        //left these in case I f'ed something up by doing this.
//        registerItem(dustPlastic= new Item(), "dustPlastic", TrainsInMotion.MODID).setTextureName("traincraft:textures/items/parts/item_plastic.png");
//        registerItem(ingotCopper= new Item(), "ingotCopper", TrainsInMotion.MODID).setTextureName("traincraft:textures/items/parts/item_copper.png");
//        registerItem(ingotSteel= new Item(), "ingotSteel", TrainsInMotion.MODID).setTextureName("traincraft:textures/items/parts/item_steel.png");
//        registerItem(ingotAluminum= new Item(), "ingotAluminum", TrainsInMotion.MODID);

        registerBlock(oreCopper, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "oreCopper", "oreCopper", null);
        registerBlock(oreSteel, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "oreSteel", "oreSteel", null);
        registerBlock(oreAluminium, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "oreAluminum", "oreAluminum", null);



        addRecipe(new ItemStack(registerBlock(copperBlock, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "blockCopper", "blockCopper", null),1),
                "III","III","III", 'I', ingotCopper);
        addRecipe(new ItemStack(registerBlock(steelBlock, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "blockSteel", "blockSteel", null),1),
                "III","III","III", 'I', ingotSteel);
        addRecipe(new ItemStack(registerBlock(aluminiumBlock, TrainsInMotion.creativeTab, TrainsInMotion.MODID, "blockAluminum", "blockAluminum", null),1),
                "III","III","III", 'I', ingotAluminum);

        GameRegistry.addSmelting(oreCopper, new ItemStack(ingotCopper), 0.7f);
        GameRegistry.addSmelting(oreSteel, new ItemStack(ingotSteel), 1.2f);
        GameRegistry.addSmelting(oreAluminium, new ItemStack(ingotAluminum), 0.5f);



        OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));

        OreDictionary.registerOre("ingotSteel", new ItemStack(ingotSteel));

        OreDictionary.registerOre("itemPlastic", new ItemStack(dustPlastic));
        OreDictionary.registerOre("dustPlastic", new ItemStack(dustPlastic));//MFR support



        registerOreGen(0, new OreGen(oreCopper,5,50,6,4,4));

    }

    private static Item createItem(String unlocalizedName, String oredictName) {
        Item item = new Item();
        TiMGenericRegistry.RegisterItem(item, TrainsInMotion.MODID, unlocalizedName, oredictName, TrainsInMotion.creativeTabCrafting, null, null);
        return item;
    }
}
