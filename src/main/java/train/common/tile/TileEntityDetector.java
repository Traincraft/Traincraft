package train.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDetector extends TileEntity {
	public int meta = 6;

	public TileEntityDetector() {}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {

		// TODO This might raise an exception upon loading; the server might try to assign an instance to some coords only to realise the TileEntity does not exist there. Please verify this does not raise any issues.
	}
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {

	}
}