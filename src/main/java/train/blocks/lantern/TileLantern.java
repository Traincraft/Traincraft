package train.blocks.lantern;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

import java.util.Random;

public class TileLantern extends TileRenderFacing {

	/** Static instance used to access random number generation to create random colors. */
	protected static final Random rand = new Random();

	private int randomColor = (rand.nextInt() * 0xFFFFFF);
	private int oldColor = 0;

	public TileLantern(BlockDynamic block) {
		super(block);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		randomColor = nbt.getInteger("randomColor");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("randomColor", randomColor);
	}


	public String getColor() {
		return String.format("#%06X", (0xFFFFFF & this.randomColor));
	}

	public int getRandomColor(){
		return this.oldColor;
	}

	public void  setColor(int col){
		randomColor = col;
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		readFromNBT(pkt.func_148857_g());
	}

	@Override
	public boolean canUpdate(){return true;}

	@Override
	public void updateEntity(){
		if (oldColor != randomColor){
			oldColor = randomColor;
			this.markDirty();
			this.syncTileEntity();
		}
	}

}