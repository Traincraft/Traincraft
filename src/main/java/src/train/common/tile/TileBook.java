/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileBook extends TileEntity {
	
	private int facingMeta;
	
	public TileBook() {
		facingMeta = this.blockMetadata;
	}
	
	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		facingMeta = nbtTag.getByte("Orientation");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setByte("Orientation", (byte) facingMeta);
	}

	//TODO Packets
	/*
	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}
	*/
	
	@Override
	public void updateEntity() {
		super.updateEntity();
	}

	public void handlePacketDataFromServer(byte orientation) {
		facingMeta = orientation;
	}
}