package train.common.blocks.blockSwitch;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.tile.tileSwitch.TiletrackConcrete;

public class BlocktrackConcrete extends BlockContainer {

    private IIcon texture;

    public BlocktrackConcrete() {
        super(Material.wood);
        setCreativeTab(Traincraft.tcTab);
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
    public int getRenderType() {
        return RenderingRegistry.getNextAvailableRenderId();
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TiletrackConcrete();
    }

    /**
     * Called when the block is placed in the world.
     */
    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
        int l = MathHelper.floor_double((double) (par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        int i1 = par1World.getBlockMetadata(par2, par3, par4) >> 2;
        ++l;
        l %= 4;

        if (l == 0) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | i1 << 2, 2);
        }

        if (l == 1) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | i1 << 2, 2);
        }

        if (l == 2) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | i1 << 2, 2);
        }

        if (l == 3) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | i1 << 2, 2);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
    }
}