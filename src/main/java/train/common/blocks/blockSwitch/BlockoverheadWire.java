package train.common.blocks.blockSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileoverheadWire;

import java.util.List;
import java.util.Random;

public class BlockoverheadWire extends Block {
    private IIcon texture;

    public BlockoverheadWire() {
        super(Material.rock);
        setCreativeTab(Traincraft.tcTab);
        this.setTickRandomly(true);
        //this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileoverheadWire();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @SideOnly(Side.CLIENT)
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @Override
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {

    }


    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
        TileoverheadWire te = (TileoverheadWire) world.getTileEntity(i, j, k);
        if (te != null) {
            int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
            world.markBlockForUpdate(i, j, k);
        }
    }


    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_1_.isRemote)
        {
            return true;
        }
        else
        {
            int i1 = p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);
            int j1 = i1 & 7;
            int k1 = 8 - (i1 & 8);
            p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_, p_149727_4_, j1 + k1, 3);
            p_149727_1_.playSoundEffect((double)p_149727_2_ + 0.5D, (double)p_149727_3_ + 0.5D, (double)p_149727_4_ + 0.5D, "random.click", 0.3F, k1 > 0 ? 0.6F : 0.5F);
            p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_, p_149727_3_, p_149727_4_, this);

            if (j1 == 1)
            {
                p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_ - 1, p_149727_3_, p_149727_4_, this);
            }
            else if (j1 == 2)
            {
                p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_ + 1, p_149727_3_, p_149727_4_, this);
            }
            else if (j1 == 3)
            {
                p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_, p_149727_3_, p_149727_4_ - 1, this);
            }
            else if (j1 == 4)
            {
                p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_, p_149727_3_, p_149727_4_ + 1, this);
            }
            else if (j1 != 5 && j1 != 6)
            {
                if (j1 == 0 || j1 == 7)
                {
                    p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_, p_149727_3_ + 1, p_149727_4_, this);
                }
            }
            else
            {
                p_149727_1_.notifyBlocksOfNeighborChange(p_149727_2_, p_149727_3_ - 1, p_149727_4_, this);
            }

            return true;
        }
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        if ((p_149749_6_ & 8) > 0)
        {
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_, this);
            int i1 = p_149749_6_ & 7;

            if (i1 == 1)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
            }
            else if (i1 == 2)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
            }
            else if (i1 == 3)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
            }
            else if (i1 == 4)
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
            }
            else if (i1 != 5 && i1 != 6)
            {
                if (i1 == 0 || i1 == 7)
                {
                    p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
                }
            }
            else
            {
                p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
            }
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }

    public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
    {
        return (p_149709_1_.getBlockMetadata(p_149709_2_, p_149709_3_, p_149709_4_) & 8) > 0 ? 15 : 0;
    }

    public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_)
    {
        int i1 = p_149748_1_.getBlockMetadata(p_149748_2_, p_149748_3_, p_149748_4_);

        if ((i1 & 8) == 0)
        {
            return 0;
        }
        else
        {
            int j1 = i1 & 7;
            return j1 == 0 && p_149748_5_ == 0 ? 15 : (j1 == 7 && p_149748_5_ == 0 ? 15 : (j1 == 6 && p_149748_5_ == 1 ? 15 : (j1 == 5 && p_149748_5_ == 1 ? 15 : (j1 == 4 && p_149748_5_ == 2 ? 15 : (j1 == 3 && p_149748_5_ == 3 ? 15 : (j1 == 2 && p_149748_5_ == 4 ? 15 : (j1 == 1 && p_149748_5_ == 5 ? 15 : 0)))))));
        }
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }
}

