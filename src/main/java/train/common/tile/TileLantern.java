package train.common.tile;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TileLantern extends TileEntity {

	/** Static instance used to access random number generation to create random colors. */
	protected static final Random rand = new Random();

	private int randomColor = (rand.nextInt() * 0xFFFFFF);
	private int oldColor = 0;

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

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
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
	public void updateEntity(){
		if (oldColor != randomColor){
			oldColor = randomColor;
			this.markDirty();
			this.syncTileEntity();
		}
	}
	
	public void syncTileEntity() {
		for (Object o : this.worldObj.playerEntities) {
			if (o instanceof EntityPlayerMP) {
				EntityPlayerMP player = (EntityPlayerMP) o;
				if (player.getDistance(xCoord, yCoord, zCoord) <= 64) {
					player.playerNetServerHandler.sendPacket(this.getDescriptionPacket());
				}
			}
		}
	}

}