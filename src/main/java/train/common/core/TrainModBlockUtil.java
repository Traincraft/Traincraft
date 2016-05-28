package train.common.core;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class TrainModBlockUtil {
	/**
	 * Multiply this to convert foreign energy into UE Joules.
	 */
	public static double IC2_RATIO = 40;
	public static double BC3_RATIO = 100;

	/**
	 * Multiply this to convert UE Joules into foreign energy.
	 */
	public static double TO_IC2_RATIO = 1 / IC2_RATIO;
	public static double TO_BC_RATIO = 1 / BC3_RATIO;
	
	public static ArrayList<ItemStack> getItemStackFromBlock(World world, int i, int j, int k) {
		Block block = world.getBlock(i, j, k);

		if (block == null) {
			return null;
		}

		int meta = world.getBlockMetadata(i, j, k);
		return block.getDrops(world, i, j, k, meta, 0);
	}
}