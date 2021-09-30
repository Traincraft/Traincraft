package train.common.api;

import net.minecraft.world.World;
import train.common.library.BlockIDs;

public class TrainsSignal {
	// ***Signal behavior***/
	public static int isSignal(double motionX, double motionZ, int i, int j, int k, World worldObj) {
		int action = 0;// stupid name
		// equals 1 if there is a signal near, carts slows down
		// equals 2 if the signal is two blocks away, the carts can't move

		int l = 1;// no idea

		/* Basically checks if there is a signal somewhere in front of the cart, using the speed */
		/* t represents the distance to the signal */
		//@SuppressWarnings("unused") TileSignal te = (TileSignal) worldObj.getTileEntity(i, j, k);

		if ((motionX > 0) && motionZ == 0) {
			for (int t = 0; t < 12; t++) {
				if ((worldObj.getBlock(i + t, j, k + l) == BlockIDs.signal.block) || (worldObj.getBlock(i + t, j, k - l) == BlockIDs.signal.block)) {// k = sides, j= heigh, i front
					action = 1;
					if (t == 2) {
						action = 2;
					}
					t = 12;
				}
				else {
					action = 0;
				}
			}
			/* North */
		}
		else if ((motionX < 0) && motionZ == 0) {
			for (int t = 0; t < 12; t++) {
				if ((worldObj.getBlock(i - t, j, k + l) == BlockIDs.signal.block) || (worldObj.getBlock(i - t, j, k - l) == BlockIDs.signal.block)) {// k = sides, j= heigh, i front
					action = 1;
					if (t == 2) {
						action = 2;
					}
					t = 12;
				}
				else {
					action = 0;
				}
			}
			/* EAST */
		}
		else if ((motionZ > 0) && motionX == 0) {
			// k - = front
			for (int t = 0; t < 12; t++) {
				if ((worldObj.getBlock(i + l, j, k + t) == BlockIDs.signal.block) || (worldObj.getBlock(i - l, j, k + t) == BlockIDs.signal.block)) {// k = sides, j= heigh, i front
					action = 1;
					if (t == 2) {
						action = 2;
					}
					t = 12;
				}
				else {
					action = 0;
				}
			}
			/* WEST */
		}
		else if ((motionZ < 0) && motionX == 0) {
			for (int t = 0; t < 12; t++) {
				if ((worldObj.getBlock(i + l, j, k - t) == BlockIDs.signal.block) || (worldObj.getBlock(i - l, j, k - t) == BlockIDs.signal.block)) {// k = sides, j= heigh, i front
					action = 1;
					if (t == 2) {
						action = 2;
					}
					t = 12;
				}
				else {
					action = 0;
				}
			}
		}
		else {
			action = 0;
		}
		return action;
	}
}