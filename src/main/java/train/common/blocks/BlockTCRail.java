package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.items.ItemTCRail;
import train.common.items.ItemWrench;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.tile.TileTCRail;

import java.util.Random;

public class BlockTCRail extends Block {
	private IIcon texture;

	public BlockTCRail() {
		super(Material.iron);
		setCreativeTab(Traincraft.tcTab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return false;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player)  {
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(x, y, z);
		if (tileEntity != null && tileEntity.idDrop != null) {
			return new ItemStack(tileEntity.idDrop);
		}
		return null;
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
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(i, j, k);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			// NOTE: func_147480_a = destroyBlock
			world.func_147480_a(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ, false);
			world.removeTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
		}
		if (tileEntity != null && (tileEntity.idDrop != null) && !world.isRemote) {
			EntityPlayer player = Traincraft.proxy.getPlayer();
			if (!(player != null && player.capabilities.isCreativeMode)) {
				this.dropBlockAsItem(world, i, j, k, new ItemStack(tileEntity.idDrop, 1, 0));
			}
		}
		world.removeTileEntity(i, j, k);
	}

	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block par5) {
		TileEntity tile = world.getTileEntity(i, j, k);
		if (tile == null || !(tile instanceof TileTCRail))
			return;

		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(i, j, k);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			if (world.isAirBlock(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ)) {
				// NOTE: func_147480_a = destroyBlock
				world.removeTileEntity(i, j, k);
				world.func_147480_a(i, j, k, false);
			}
		}
		if (!World.doesBlockHaveSolidTopSurface(world, i, j - 1, k) && world.getBlock(i, j-1, k) != BlockIDs.bridgePillar.block) {
			// NOTE: func_147480_a = destroyBlock
			world.func_147480_a(i, j, k, false);
			world.removeTileEntity(i, j, k);
		}
		if (tileEntity != null && !world.isRemote) {
			boolean flag = world.isBlockIndirectlyGettingPowered(i, j, k);
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
		TileEntity te = world.getTileEntity(i, j, k);
		int l = world.getBlockMetadata(i, j, k);
		if (!world.isRemote && te != null && (te instanceof TileTCRail)) {
			if (player != null && player.inventory != null && player.inventory.getCurrentItem() != null && (player.inventory.getCurrentItem().getItem() instanceof ItemWrench) && ((TileTCRail) te).getType() != null && ((TileTCRail) te).getType().equals(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel())) {
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
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":tracks/rail_normal_turned");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
		return world==null||world.isRemote?
				AxisAlignedBB.getBoundingBox(i -18f, j, k -18f, i +18f, j, k +18f)
		:
				AxisAlignedBB.getBoundingBox(i + this.minX, j + this.minY, k + this.minZ, i + this.maxX, j, k + this.maxZ);
	}
}
