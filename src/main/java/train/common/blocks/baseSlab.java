package train.common.blocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.library.Info;

public class baseSlab extends BlockSlab {

    public baseSlab(boolean p_i45410_1_, Material p_i45410_2_, String name, float hardness, float blockResistance , SoundType stepSound, String harvestTool, int harvestLevel, float lightValue, String textureName) {
        super(p_i45410_1_, p_i45410_2_);
        setBlockName(name);
        setHardness(hardness);
        setBlockTextureName(Info.modID +":"+textureName);
        setStepSound(stepSound);
        setHarvestLevel(harvestTool, harvestLevel);
        setResistance(blockResistance);
        setLightLevel(lightValue);
        ;
    }

    @Override
    public String func_150002_b(int p_150002_1_) {
        return null;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
        if (this.field_150004_a)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            boolean flag = (p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) & 8) != 0;

            if (flag)
            {
                this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            }
        }
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }
}
