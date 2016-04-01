package src.train.common.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import buildcraft.api.tools.IToolWrench;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import src.train.common.Traincraft;
import src.train.common.items.ItemTCRail;
import src.train.common.items.ItemTCRail.TrackTypes;
import src.train.common.library.BlockIDs;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import src.train.common.tile.TileTCRail;
import src.train.common.tile.TileTCRailGag;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTCRail extends Block {
	private IIcon texture;
	private int itemID;

	public BlockTCRail(int id) {
		super(id, Material.iron);
		setCreativeTab(Traincraft.tcTab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockId(par2, par3, par4);
		Block block = Block.blocksList[l];
		return false;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return blockID;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int idPicked(World world, int i, int j, int k) {
		TileTCRail tileEntity = (TileTCRail) world.getBlockTileEntity(i, j, k);
		if (tileEntity != null) {
			return tileEntity.idDrop;
		}
		return 0;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, int par5, int par6) {
		TileTCRail tileEntity = (TileTCRail) world.getBlockTileEntity(i, j, k);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			world.destroyBlock(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ, false);
			world.removeBlockTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
		}
		if (tileEntity != null && tileEntity.idDrop != 0 && !world.isRemote) {
			EntityPlayer player = Traincraft.proxy.getPlayer();
			boolean flag = player instanceof EntityPlayer && ((EntityPlayer)player).capabilities.isCreativeMode;
			if(!flag) {
				this.dropBlockAsItem_do(world, i, j, k, new ItemStack(tileEntity.idDrop, 1, 0));
			}
		}
		world.removeBlockTileEntity(i, j, k);
	}

	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, int par5) {
		TileEntity tile = world.getBlockTileEntity(i, j, k);
		if (tile == null || !(tile instanceof TileTCRail))
			return;

		TileTCRail tileEntity = (TileTCRail) world.getBlockTileEntity(i, j, k);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			if (world.getBlockId(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ) < 1) {
				world.destroyBlock(i, j, k, false);
				world.removeBlockTileEntity(i, j, k);
			}
		}
		if (!world.doesBlockHaveSolidTopSurface(i, j - 1, k) && world.getBlockId(i, j-1, k) != BlockIDs.bridgePillar.blockID) {
			world.destroyBlock(i, j, k, false);
			world.removeBlockTileEntity(i, j, k);
		}
		if (tileEntity != null && !world.isRemote) {
			boolean flag = world.isBlockIndirectlyGettingPowered(i, j, k);
			boolean switchState = tileEntity.getSwitchState();
			if (tileEntity.previousRedstoneState != flag) {
				tileEntity.changeSwitchState(world, tileEntity, i, j, k);
				tileEntity.previousRedstoneState = flag;
			}
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileTCRail();
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getBlockTileEntity(i, j, k);
		int l = world.getBlockMetadata(i, j, k);
		if (!world.isRemote && te != null && (te instanceof TileTCRail)) {
			if (player != null && player.inventory != null && player.inventory.getCurrentItem() != null && (player.inventory.getCurrentItem().getItem() instanceof IToolWrench) && ((TileTCRail) te).getType() != null && ((TileTCRail) te).getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel())) {
				l++;
				if (l > 3)
					l = 0;
				world.setBlockMetadataWithNotify(i, j, k, l, 2);
				((TileTCRail) te).hasRotated = true;
				return true;
			}
			//((TileTCRail)te).printInfo();
		}
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":tracks/rail_normal_turned");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}
}
