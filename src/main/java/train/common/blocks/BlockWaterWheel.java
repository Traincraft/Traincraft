package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
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
import train.common.tile.TileWaterWheel;

import java.util.Random;

public class BlockWaterWheel extends Block {
	private IIcon texture;

	public BlockWaterWheel() {
		super(Material.wood);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 1F, 1F);
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
		return new TileWaterWheel();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		TileEntity tile = par1World.getTileEntity(par2, par3, par4);
		if (tile != null && tile instanceof TileWaterWheel && ((TileWaterWheel) tile).getWaterDir() > -1001) {
			double d0 = (double) ((float) par2 + 0.5F);
			double d2 = (double) ((float) par4 + 0.5F);

			par1World.spawnParticle("splash", d0, par3 + 1, d2, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("splash", d0, par3, d2, 0.0D, 0.0D, 0.0D);
			if (par5Random.nextInt(20) == 0) {
				par1World.playSound(par2, par3, par4, "liquid.water", par5Random.nextFloat() * 0.25F + 0.75F, par5Random.nextFloat() * 1F + 0.1F, true);
			}
		}
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
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":water_wheel");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		TileEntity tile = par1World.getTileEntity(par2, par3, par4);
		if (tile != null && tile instanceof TileWaterWheel) {
			(tile).onChunkUnload();
		}
		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}
}
