package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;


public class baseBlock extends Block {

    public baseBlock(String name, float hardness, float resistance, String harvestTool, int harvestLevel, Material material, SoundType stepSound, String textureLocation) {
        super(material);
        setCreativeTab(Traincraft.tcTab);
        setBlockName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setStepSound(stepSound);
        setBlockTextureName(Info.modID+":"+textureLocation);
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }
}
