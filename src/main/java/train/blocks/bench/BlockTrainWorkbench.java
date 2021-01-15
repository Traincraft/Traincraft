package train.blocks.bench;

import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.Traincraft;
import train.library.GuiIDs;

public class BlockTrainWorkbench extends BlockDynamic {

	public BlockTrainWorkbench() {
		super(Material.wood, true);
		setCreativeTab(Traincraft.tcTab);
	}


	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileTrainWbench) {
				player.openGui(Traincraft.instance, GuiIDs.TRAIN_WORKBENCH, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		//this seems to drop the items all over the place, the super method does this,
		//    but maybe we should revisit this for something more interesting?
		/*Random distilRand = new Random();
		TileTrainWbench tilewb = (TileTrainWbench) world.getTileEntity(i, j, k);
		if (tilewb != null) {
			label0: for (int l = 0; l < tilewb.getSizeInventory(); l++) {
				ItemStack itemstack = tilewb.getStackInSlot(l);
				if (itemstack == null) {
					continue;
				}
				float f = distilRand.nextFloat() * 0.8F + 0.1F;
				float f1 = distilRand.nextFloat() * 0.8F + 0.1F;
				float f2 = distilRand.nextFloat() * 0.8F + 0.1F;
				do {
					if (itemstack.stackSize <= 0) {
						continue label0;
					}
					int i1 = distilRand.nextInt(21) + 10;
					if (i1 > itemstack.stackSize) {
						i1 = itemstack.stackSize;
					}
					itemstack.stackSize -= i1;
					EntityItem entityitem = new EntityItem(world, (float) i + f, (float) j + f1, (float) k + f2, itemstack.splitStack(i1));
					float f3 = 0.05F;
					entityitem.motionX = (float) distilRand.nextGaussian() * f3;
					entityitem.motionY = (float) distilRand.nextGaussian() * f3 + 0.2F;
					entityitem.motionZ = (float) distilRand.nextGaussian() * f3;
					world.spawnEntityInWorld(entityitem);
				} while (true);
			}
		}*/
		super.breakBlock(world, i, j, k, par5, par6);
	}

	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		world.markBlockForUpdate(i, j, k);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		TileTrainWbench te = (TileTrainWbench) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(i, j, k);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTrainWbench(this);
	}

}