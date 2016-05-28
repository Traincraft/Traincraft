package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;

public class ItemWaterTankBuckets extends ItemBucket { // implements IBucketHandler

	public ItemWaterTankBuckets(Block block, int icon) {
		super(block);
		this.maxStackSize = 16;
		setCreativeTab(Traincraft.tcTab);
	}

	public boolean canBeStoredInToolbox(ItemStack itemstack) {
		return true;
	}

	public ItemStack fillCustomBucket(World w, int i, int j, int k) {
		if (w.getBlock(i, j, k) == Blocks.water || w.getBlock(i, j, k) == Blocks.water) {
			w.setBlockMetadataWithNotify(i, j, k, 0, 0);
			return new ItemStack(this);
		}

		if (w.getBlock(i, j, k) == Blocks.flowing_water || w.getBlock(i, j, k) == Blocks.flowing_water) {
			w.setBlockMetadataWithNotify(i, j, k, 0, 0);
			return new ItemStack(this);
		}
		return null;
	}

}