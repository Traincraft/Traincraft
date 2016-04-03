package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import si.meansoft.traincraft.blocks.BlockBase;
import si.meansoft.traincraft.blocks.BlockDistillery;

/**
 * @author canitzp
 */
public class BlockRegistry {

    public static Block oilSand;
    public static Block distillery;

    public static void preInit(){
        oilSand = new BlockBase(Material.sand, "oilSand").generateBlock(Blocks.sand, 50, 80, 7, 11).addOreDict("oreOilSand").setForgeModel().setHarvestLevel(BlockBase.ToolEnum.SHOVEL, 2).setSound(SoundType.SAND);
        distillery = new BlockDistillery().setForgeModel();
    }

}
