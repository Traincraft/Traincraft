package src.train.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import src.train.common.Traincraft;

public class ItemWaterTankBuckets extends ItemBucket { // implements IBucketHandler

	public ItemWaterTankBuckets(int id, int blockId, int icon) {
		super(id, blockId);
		this.maxStackSize = 16;
		setCreativeTab(Traincraft.tcTab);
	}

	public boolean canBeStoredInToolbox(ItemStack itemstack) {
		return true;
	}

	public ItemStack fillCustomBucket(World w, int i, int j, int k) {
		if (w.getBlockId(i, j, k) == Block.waterStill.blockID || w.getBlockId(i, j, k) == Block.waterStill.blockID) {
			w.setBlockMetadataWithNotify(i, j, k, 0, 0);
			return new ItemStack(this);
		}

		if (w.getBlockId(i, j, k) == Block.waterMoving.blockID || w.getBlockId(i, j, k) == Block.waterMoving.blockID) {
			w.setBlockMetadataWithNotify(i, j, k, 0, 0);
			return new ItemStack(this);
		}
		return null;
	}

}