package train.common.blocks;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.ItemIDs;
import train.common.tile.TileSignal;

import java.util.Random;

/*
 I propose a simple x-bit identifier in the following format:
 xxxxx
 |||||
 ||||+ Color		0=green		1=red
 |||+  Mounted		0=no		1=yes
 ||+   Directions	0=both		1=one
 ++    Direction facing	00=north	01=east	10=south	11=west
 */

public class BlockSignal extends BlockContainer {

	public BlockSignal() {
		super(Material.circuits);
		this.setLightLevel(1.0F);
		setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 2.6F, 0.8F);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return ItemIDs.signal.item;
	}
	@Override
	public int quantityDropped(Random random) {
		return 1;
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
		return null;
	}

	public int tickRate() {
		return 4;
	}
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k) {
		setBlockBoundsBasedOnState(world, i, j, k);
		return super.getSelectedBoundingBoxFromPool(world, i, j, k);
	}

	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving) {
		TileSignal te = (TileSignal) world.getTileEntity(i, j, k);

		/*
		 * if (l == 0) { world.setBlockMetadataWithNotify(i, j, k, 2); te.rot = 2; } if (l == 1) { world.setBlockMetadataWithNotify(i, j, k, 5); te.rot = 5; } if (l == 2) { world.setBlockMetadataWithNotify(i, j, k, 3); te.rot = 3; } if (l == 3) { world.setBlockMetadataWithNotify(i, j, k, 4); te.rot = 4; } */
		int var6 = MathHelper.floor_double((double) (entityliving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int var7 = world.getBlockMetadata(i, j, k) >> 2;
		++var6;
		var6 %= 4;

		if (var6 == 0) {
			//world.setBlockMetadataWithNotify(par2, par3, par4, 2 | var7 << 2);
			if (te != null) {
				te.setFacing(2 | var7 << 2);
			}
		}

		if (var6 == 1) {
			//world.setBlockMetadataWithNotify(par2, par3, par4, 3 | var7 << 2);
			if (te != null) {
				te.setFacing(3 | var7 << 2);
			}
		}

		if (var6 == 2) {
			//world.setBlockMetadataWithNotify(par2, par3, par4, 0 | var7 << 2);
			if (te != null) {
				te.setFacing(0 | var7 << 2);
			}
		}

		if (var6 == 3) {
			//world.setBlockMetadataWithNotify(par2, par3, par4, 1 | var7 << 2);
			if (te != null) {
				te.setFacing(1 | var7 << 2);
			}
		}

		world.scheduleBlockUpdate(i, j, k, this, 4);
		updateTick(world, i, j, k);
	}
	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		TileSignal te = (TileSignal) world.getTileEntity(i, j, k);

		if (world.isBlockIndirectlyGettingPowered(i, j, k)) {

			te.state = 1;
		}
		/* int l = world.getBlockMetadata(i, j, k); if (l == 2) {
		 * 
		 * te.rot = 2; } if (l == 5) {
		 * 
		 * te.rot = 5; } if (l == 3) {
		 * 
		 * te.rot = 3; } if (l == 4) { te.rot = 4; } */
		//System.out.println("added " + te.rot);
		updateTick(world, i, j, k);
	}

	/**
	 * Sets whether this block type will receive random update ticks
	 */
	@Override
	public Block setTickRandomly(boolean par1) {
		this.needsRandomTick = true;
		return this;
	}

	/**
	 * Returns whether or not this block is of a type that needs random ticking. Called for ref-counting purposes by ExtendedBlockStorage in order to broadly cull a chunk from the random chunk update list for efficiency's sake.
	 */
	@Override
	public boolean getTickRandomly() {
		return this.needsRandomTick;
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(World world, int i, int j, int k, Random random) {
		updateTick(world, i, j, k, random);
	}

	public void updateTick(World world, int i, int j, int k) {

		TileSignal te = (TileSignal) world.getTileEntity(i, j, k);
		if (te == null)
			return;
		//te.rot = l;
		// int l = world.getBlockMetadata(i, j, k);
		if (te.state == 1 && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
			te.state = 0;
		}
		if (te.state == 0 && world.isBlockIndirectlyGettingPowered(i, j, k)) {
			te.state = 1;
		}
	}
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
		updateTick(world, i, j, k);
		return true;
	}
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block l) {
		TileSignal te = (TileSignal) world.getTileEntity(i, j, k);
		if (te == null)
			return;
		if (te.state == 1 && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
			world.scheduleBlockUpdate(i, j, k, this, 4);
		}
		else if (te.state == 0 && world.isBlockIndirectlyGettingPowered(i, j, k)) {
			// world.setBlockWithNotify(i, j, k,Train.ActiveSignalBlock.blockID);

			te.state = 1;
			// world.setBlockMetadata(i, j, k,l);
		}
		updateTick(world, i, j, k);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileSignal();
	}
}