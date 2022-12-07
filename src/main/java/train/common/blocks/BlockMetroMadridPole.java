package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.tile.TileMetroMadridPole;

import java.util.List;

public class BlockMetroMadridPole extends Block implements ITileEntityProvider {
    private IIcon texture;

    public BlockMetroMadridPole(Material p_i45410_2_) {
        super(p_i45410_2_);
        setCreativeTab(Traincraft.tcTab);

        //this.setTickRandomly(true);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 1F, 1F);
    }

    @Override
    public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase living, ItemStack stack) {
        TileMetroMadridPole te = (TileMetroMadridPole) world.getTileEntity(par2, par3, par4);
        int dir = MathHelper.floor_double((double) ((living.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
    }

    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }


    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }


    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileMetroMadridPole();
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileMetroMadridPole();
    }


    @Override
    public int getRenderType() {
        return -1;
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
        if(p_149749_1_.getTileEntity(p_149749_2_,p_149749_3_,p_149749_4_)!=null){
            p_149749_1_.removeTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);
        }
    }






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
