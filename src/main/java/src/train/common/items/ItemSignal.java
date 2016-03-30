package src.train.common.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import src.train.common.Traincraft;

public class ItemSignal extends Item { // implements IBoxable TODO when IC2
	private int spawnID;

	public ItemSignal(int i, Block block) {
		super(i);
		spawnID = block.blockID;
		setCreativeTab(Traincraft.tcTab);
	}

	public boolean canBeStoredInToolbox(ItemStack itemstack) {
		return true;
	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l) {
		int i1 = world.getBlockId(i, j, k);
		if (i1 == Block.snow.blockID) {
			l = 0;
		}
		else if (i1 != Block.vine.blockID) {
			if (l == 0) {
				j--;
			}
			if (l == 1) {
				j++;
			}
			if (l == 2) {
				k--;
			}
			if (l == 3) {
				k++;
			}
			if (l == 4) {
				i--;
			}
			if (l == 5) {
				i++;
			}
		}
		/*if (!entityplayer.canCurrentToolHarvestBlock(i, j, k)) {
			return false;
		}*/
		if (itemstack.stackSize == 0) {
			return false;
		}

		Block block = Block.blocksList[spawnID];
		if (world.setBlockMetadataWithNotify(i, j, k, spawnID, 0)) {
			if (world.getBlockId(i, j, k) == spawnID) {
				Block.blocksList[spawnID].onBlockPlacedBy(world, i, j, k, entityplayer, new ItemStack(Block.blocksList[spawnID]));
			}
			world.playSoundEffect((float) i + 0.5F, (float) j + 0.5F, (float) k + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
			itemstack.stackSize--;
		}
		return true;
	}
}
