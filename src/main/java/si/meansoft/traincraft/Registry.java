package si.meansoft.traincraft;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import si.meansoft.traincraft.api.TraincraftAPI;
import si.meansoft.traincraft.blocks.*;
import si.meansoft.traincraft.fluids.FluidBase;
import si.meansoft.traincraft.items.ItemMaterial;

/**
 * @author canitzp
 */
public class Registry{

    public static BlockBase oilSand, petroleum;
    public static BlockDistillery distillery;
    public static BlockHearthFurnace hearthFurnace;
    public static BlockCrafter crafterSteam, crafterDiesel, crafterIron;
    public static BlockWindmill windmill;

    public static ItemMaterial material;

    public static FluidBase diesel, refinedFuel, oil;

    public static void preInit(FMLPreInitializationEvent event){
        //Blocks
        register(oilSand = new BlockBase(Material.SAND, "oilSand").generateBlock(Blocks.SAND, 50, 80, 7, 11).addOreDict("oreOilSand").setHarvestLevel(BlockBase.ToolEnum.SHOVEL, 2).setSound(SoundType.SAND));
        register(petroleum = new BlockBase(Material.ROCK, "orePetroleum").generateBlock(Blocks.STONE, 20, 70, 5, 9).addOreDict("orePetroleum").setHarvestLevel(BlockBase.ToolEnum.PICKAXE, 2).setSound(SoundType.STONE));
        register(distillery = new BlockDistillery());
        register(hearthFurnace = new BlockHearthFurnace());
        register(crafterSteam = new BlockCrafter(BlockCrafter.CrafterTier.STEAM), crafterDiesel = new BlockCrafter(BlockCrafter.CrafterTier.DIESEL), crafterIron = new BlockCrafter(BlockCrafter.CrafterTier.ELECTRO));
        register(windmill = new BlockWindmill());

        //Items
        register(material = new ItemMaterial());

        register(diesel = new FluidBase("diesel", "fluidDiesel", Material.WATER));
        register(refinedFuel = new FluidBase("refinedFuel", "fluidRefinedFuel", Material.WATER));
        register(oil = new FluidBase("oil", "fluidOil", Material.WATER));

        TraincraftAPI.addTrackRegister(BlockTrackStraight.class, BlockTrackSlope.class, BlockTrackCurve.class);
        TraincraftAPI.registerTracks();
    }

    public static <T extends IRegistryEntry> T[] register(T... entries){
        for(T entry : entries){
            for(IRegistryEntry reg : entry.getRegisterElements()){
                if(reg instanceof IForgeRegistryEntry){
                    ((IForgeRegistryEntry) reg).setRegistryName(new ResourceLocation(Traincraft.MODID, reg.getName()));
                    GameRegistry.register((IForgeRegistryEntry<?>) reg);
                    reg.onRegister(entries);
                } else {
                    reg.ownRegistry();
                }
            }
        }
        return entries;
    }

}
