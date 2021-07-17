package train.common.blocks.blockSwitch;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class harieshHead extends Block {
    public harieshHead(Material p_i45394_1_) {
        super(p_i45394_1_);

        setBlockName("hariesh");
        setStepSound(soundTypeAnvil);
        setHardness(4);
        setResistance(10);
        setHarvestLevel("pickaxe",4);
        setLightLevel(1);
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }




}
