package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import si.meansoft.traincraft.blocks.BlockBase;
import si.meansoft.traincraft.blocks.BlockDistillery;
import si.meansoft.traincraft.blocks.BlockRail;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class BlockRegistry {

    public static List<Block> toReg = new ArrayList<Block>();

    public static Block oilSand;
    public static Block distillery;

    public static void preInit(){
        oilSand = new BlockBase(Material.SAND, "oilSand", true).generateBlock(Blocks.SAND, 50, 80, 7, 11).addOreDict("oreOilSand").setHarvestLevel(BlockBase.ToolEnum.SHOVEL, 2).setSound(SoundType.SAND);
        distillery = new BlockDistillery();
        Block rail = new BlockRail("", BlockRail.TrackLength.LONG, BlockRail.TrackDirection.STRAIGHT);
    }

}
