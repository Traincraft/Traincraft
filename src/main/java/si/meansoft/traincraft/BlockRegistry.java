package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import si.meansoft.traincraft.blocks.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class BlockRegistry {

    public static Block oilSand;
    public static Block distillery, crafterSteam, crafterDiesel, crafterElectro;
    public static Block hearthFurnace;

    public static void preInit(){
        oilSand = new BlockBase(Material.SAND, "oilSand", BlockBase.RenderType.FORGEJSON).generateBlock(Blocks.SAND, 50, 80, 7, 11).addOreDict("oreOilSand").setHarvestLevel(BlockBase.ToolEnum.SHOVEL, 2).setSound(SoundType.SAND);
        distillery = new BlockDistillery();
        Block rail = new BlockRail("", BlockRail.TrackLength.LONG, BlockRail.TrackDirection.STRAIGHT);
        crafterSteam = new BlockCrafter(BlockCrafter.CrafterTier.STEAM);
        crafterDiesel = new BlockCrafter(BlockCrafter.CrafterTier.DIESEL);
        crafterElectro = new BlockCrafter(BlockCrafter.CrafterTier.ELECTRO);
        hearthFurnace = new BlockHearthFurnace();
    }

}
