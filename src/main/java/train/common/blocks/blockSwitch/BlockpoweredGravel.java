package train.common.blocks.blockSwitch;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockpoweredGravel extends Block {
    public BlockpoweredGravel(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    /*
    @Override
    public boolean canProvidePower() {
        return true;
    }

     */

    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
        return super.canConnectRedstone(world, x, y, z, side);
    }


   /*
    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
    }

     */


    @Override
    public boolean renderAsNormalBlock() {
        return true;
    }

    @Override
    public boolean isOpaqueCube() {
        return true;
    }

    @Override
    public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_) {
        return 15;
    }

    @Override
    public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_) {
        return 15;
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }
}
