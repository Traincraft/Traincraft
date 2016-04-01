package src.train.common.tile;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import src.train.common.core.handlers.PacketHandler;
import src.train.common.items.ItemTCRail;
import src.train.common.items.ItemTCRail.TrackTypes;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileTCRail extends TileEntity {
	protected Random rand = new Random();
	protected Side side;
	public double r;
	public double cx;
	public double cy;
	public double cz;
	public double slopeHeight;
	public double slopeLength;
	public double slopeAngle;
	private String type;
	private int facingMeta;
	public boolean isLinkedToRail = false;
	public int linkedX;
	public int linkedY;
	public int linkedZ;
	public boolean hasModel = true;
	private boolean switchActive = false;
	/** stores the latest redstone state */
	public boolean previousRedstoneState;
	public boolean canTypeBeModifiedBySwitch = false;
	private boolean manualOverride = false;
	private int updateTicks;
	private int updateTicks2;
	public int idDrop;
	float f = 0.125F;
	public boolean hasRotated = false;

	public TileTCRail() {
		facingMeta = this.blockMetadata;
		side = FMLCommonHandler.instance().getEffectiveSide();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public double getMaxRenderDistanceSquared() {
		if(FMLClientHandler.instance()!=null && FMLClientHandler.instance().getClient()!=null && FMLClientHandler.instance().getClient().gameSettings!=null){
			if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 0) {
				return 30000.0D;
			}
			else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 1) {
				return 15900.0D;
			}
			else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 2) {
				return 4000.0D;
			} else return 4096.0;
		}else{
			return 4096.0;
		}
	}

	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public boolean getSwitchState() {
		return switchActive;
	}

	public void printInfo() {
		System.out.println(type);
		System.out.println(getSwitchState());
		System.out.println(ItemTCRail.isTCStraightTrack(this));
	}

	@Override
	public void updateEntity() {
		if (worldObj.isRemote) return;
		updateTicks2++;
		/*if (updateTicks2 % 20 == 0 && !isLinkedToRail && getType() != null && getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel()) && !hasRotated) {
			TileEntity tileNorth = worldObj.getBlockTileEntity(xCoord, yCoord, zCoord - 1);
			TileEntity tileSouth = worldObj.getBlockTileEntity(xCoord, yCoord, zCoord + 1);
			TileEntity tileEast = worldObj.getBlockTileEntity(xCoord + 1, yCoord, zCoord);
			TileEntity tileWest = worldObj.getBlockTileEntity(xCoord - 1, yCoord, zCoord);
			if (tileNorth != null && (tileNorth instanceof TileTCRail)) {//&& (tileNorth.getBlockMetadata() == 2 || tileNorth.getBlockMetadata() == 0)) {
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 2, 2);
				hasRotated = true;
			}
			if (tileSouth != null && (tileSouth instanceof TileTCRail)) {//&& (tileSouth.getBlockMetadata() == 0 || tileSouth.getBlockMetadata() == 2)) {
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 2);
				hasRotated = true;
			}
			if (tileEast != null && (tileEast instanceof TileTCRail)) {// && ( tileEast.getBlockMetadata() == 3 || tileEast.getBlockMetadata() == 1)) {
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 3, 2);
				hasRotated = true;
			}
			if (tileWest != null && (tileWest instanceof TileTCRail)) {//&& ( tileWest.getBlockMetadata() == 1 || tileWest.getBlockMetadata() == 3)) {
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 2);
				hasRotated = true;
			}
		}*/
		if (updateTicks2 % 10 == 0) {
			if (canTypeBeModifiedBySwitch) {
				int meta = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
				TileEntity tile1 = null;
				TileEntity tile2 = null;
				if (meta == 2) {
					tile1 = worldObj.getTileEntity(xCoord, yCoord, zCoord + 1);
					tile2 = worldObj.getTileEntity(xCoord, yCoord, zCoord + 2);
				}
				if (meta == 0) {
					tile1 = worldObj.getTileEntity(xCoord, yCoord, zCoord - 1);
					tile2 = worldObj.getTileEntity(xCoord, yCoord, zCoord - 2);
				}
				if (meta == 1) {
					tile1 = worldObj.getTileEntity(xCoord + 1, yCoord, zCoord);
					tile2 = worldObj.getTileEntity(xCoord + 2, yCoord, zCoord);
				}
				if (meta == 3) {
					tile1 = worldObj.getTileEntity(xCoord - 1, yCoord, zCoord);
					tile2 = worldObj.getTileEntity(xCoord - 2, yCoord, zCoord);
				}
				if (tile1 != null && tile1 instanceof TileTCRail && ItemTCRail.isTCSwitch((TileTCRail) tile1)) {
					TileTCRail tileSwitch = (TileTCRail) tile1;
					boolean flag1 = worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord);
					boolean flag2 = worldObj.isBlockIndirectlyGettingPowered(tileSwitch.xCoord, tileSwitch.yCoord, tileSwitch.zCoord);
					//System.out.println(flag1+" flag1");
					//boolean switchState1 = tileSwitch.getSwitchState();
					if (tileSwitch.previousRedstoneState != flag1 && !flag2) {
						tileSwitch.changeSwitchState(worldObj, tile1, tile1.xCoord, tile1.yCoord, tile1.zCoord);
						tileSwitch.previousRedstoneState = flag1;
					}
				}
				/*
				 * if (tile2 != null && tile2 instanceof TileTCRail &&
				 * ItemTCRail.isTCSwitch((TileTCRail) tile2)) { TileTCRail
				 * tileSwitch = (TileTCRail) tile2; boolean flag1 =
				 * worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord,
				 * zCoord); boolean flag2 =
				 * worldObj.isBlockIndirectlyGettingPowered(tileSwitch.xCoord,
				 * tileSwitch.yCoord, tileSwitch.zCoord);
				 * //System.out.println(flag2+" flag2"); //boolean switchState2
				 * = tileSwitch.getSwitchState(); if
				 * (tileSwitch.previousRedstoneState != flag1 && !flag2) {
				 * tileSwitch.changeSwitchState(worldObj, tile2, tile2.xCoord,
				 * tile2.yCoord, tile2.zCoord); tileSwitch.previousRedstoneState
				 * = flag1; } }
				 */
			}
		}
		if (manualOverride) {
			//System.out.println(updateTicks);
			updateTicks++;
			List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord + f), (double) yCoord, (double) ((float) zCoord + f), (double) ((float) (xCoord + 1) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord + 1) - f)));
			if (updateTicks > 50 && list.isEmpty()) {
				manualOverride = false;
				//setSwitchState(false,false);
				//worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, facingMeta, 2);
				boolean flag = worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord);
				changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
				previousRedstoneState = flag;
				setSwitchState(flag, false);

			}
		}
		if (type != null && (type.equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) || (type.equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) || (type.equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())))) {
			if (facingMeta == 2 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord + 1), (double) yCoord, (double) ((float) zCoord - 1), (double) ((float) (xCoord + 2) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 0 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord - 2), (double) yCoord, (double) ((float) zCoord + 2), (double) ((float) (xCoord) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord + 2) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 1 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord - 1), (double) yCoord, (double) ((float) zCoord - 1), (double) ((float) (xCoord) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 3 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord + 1), (double) yCoord, (double) ((float) zCoord + 1), (double) ((float) (xCoord + 3) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord + 2) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
		}
		if (type != null && (type.equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) || type.equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) || (type.equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())))) {
			if (facingMeta == 2 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord - 1), (double) yCoord, (double) ((float) zCoord - 1), (double) ((float) (xCoord) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 0 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord + 1), (double) yCoord, (double) ((float) zCoord + 1), (double) ((float) (xCoord + 2) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord + 2) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 1 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord - 1), (double) yCoord, (double) ((float) zCoord + 1), (double) ((float) (xCoord) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord + 2) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
			if (facingMeta == 3 && !getSwitchState()) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) xCoord + 1), (double) yCoord, (double) ((float) zCoord - 1), (double) ((float) (xCoord + 3) - f), (double) ((float) (yCoord + 1) - f), (double) ((float) (zCoord) - f)));
				if (!list.isEmpty()) {
					changeSwitchState(worldObj, this, xCoord, yCoord, zCoord);
					setSwitchState(true, true);
				}
			}
		}

	}

	@Override
	public boolean canUpdate() {
		return true;
	}

	public void setSwitchState(boolean state, boolean manualOverride) {
		this.switchActive = state;
		this.manualOverride = manualOverride;
		if (manualOverride) updateTicks = 0;
		PacketHandler.sendPacketToClients(getDescriptionPacket(), worldObj, xCoord, yCoord, zCoord, 50D);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		facingMeta = nbt.getByte("Orientation");
		r = nbt.getDouble("r");
		cx = nbt.getDouble("cx");
		cy = nbt.getDouble("cy");
		cz = nbt.getDouble("cz");
		cy = nbt.getDouble("cy");
		slopeHeight = nbt.getDouble("slopeHeight");
		slopeLength = nbt.getDouble("slopeLength");
		slopeAngle = nbt.getDouble("slopeAngle");
		linkedX = nbt.getInteger("linkedX");
		linkedY = nbt.getInteger("linkedY");
		linkedZ = nbt.getInteger("linkedZ");
		type = nbt.getString("type");
		isLinkedToRail = nbt.getBoolean("isLinkedToRail");
		hasModel = nbt.getBoolean("hasModel");
		switchActive = nbt.getBoolean("switchActive");
		canTypeBeModifiedBySwitch = nbt.getBoolean("canTypeBeModifiedBySwitch");
		manualOverride = nbt.getBoolean("manualOverride");
		idDrop = nbt.getInteger("idDrop");
		hasRotated = nbt.getBoolean("hasRotated");
		previousRedstoneState = nbt.getBoolean("previousRedstoneState");
		super.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setDouble("r", r);
		nbt.setDouble("cx", cx);
		nbt.setDouble("cy", cy);
		nbt.setDouble("cz", cz);
		nbt.setDouble("slopeHeight", slopeHeight);
		nbt.setDouble("slopeLength", slopeLength);
		nbt.setDouble("slopeAngle", slopeAngle);
		nbt.setInteger("linkedX", linkedX);
		nbt.setInteger("linkedY", linkedY);
		nbt.setInteger("linkedZ", linkedZ);
		if (type != null) nbt.setString("type", type);
		nbt.setBoolean("isLinkedToRail", isLinkedToRail);
		nbt.setBoolean("hasModel", hasModel);
		nbt.setBoolean("switchActive", switchActive);
		nbt.setBoolean("canTypeBeModifiedBySwitch", canTypeBeModifiedBySwitch);
		nbt.setBoolean("manualOverride", manualOverride);
		nbt.setBoolean("hasRotated", hasRotated);
		nbt.setInteger("idDrop", idDrop);
		nbt.setBoolean("previousRedstoneState", previousRedstoneState);
		super.writeToNBT(nbt);
	}

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}

	public void handlePacketDataFromServer(byte orientation, String type, boolean hasModel, boolean switchActive, int idDropped) {
		facingMeta = orientation;
		this.type = type;
		this.hasModel = hasModel;
		this.switchActive = switchActive;
		this.idDrop = idDropped;
	}

	public void changeSwitchState(World world, TileEntity tileEntity, int i, int j, int k) {
		if (((TileTCRail) tileEntity).getType() != null && (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()))) {
			if (((TileTCRail) tileEntity).getSwitchState()) {
				((TileTCRail) tileEntity).setSwitchState(false, false);
				if (tileEntity.getBlockMetadata() == 2) {
					TileEntity te1 = world.getTileEntity(i, j, k - 1);
					if (te1 != null) {
						((TileTCRail) te1).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(i, j, k - 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 0) {
					TileEntity te1 = world.getTileEntity(i, j, k + 1);
					if (te1 != null) {
						((TileTCRail) te1).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(i, j, k + 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 1) {
					TileEntity te1 = world.getTileEntity(i - 1, j, k);
					if (te1 != null) {
						((TileTCRail) te1).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(i - 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 3) {
					TileEntity te1 = world.getTileEntity(i + 1, j, k);
					if (te1 != null) {
						((TileTCRail) te1).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || ((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(i + 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
			}
			else if (!((TileTCRail) tileEntity).getSwitchState()) {
				((TileTCRail) tileEntity).setSwitchState(true, false);
				if (tileEntity.getBlockMetadata() == 2) {
					TileEntity te1 = world.getTileEntity(i, j, k - 1);
					if (te1 != null) {
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k - 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k - 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k - 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k - 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
						}

					}
				}
				if (tileEntity.getBlockMetadata() == 0) {
					TileEntity te1 = world.getTileEntity(i, j, k + 1);
					if (te1 != null) {
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k + 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k + 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k + 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i, j, k + 2);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 1) {
					TileEntity te1 = world.getTileEntity(i - 1, j, k);
					if (te1 != null) {
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i - 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i - 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i - 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i - 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 3) {
					TileEntity te1 = world.getTileEntity(i + 1, j, k);
					if (te1 != null) {
						if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i + 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i + 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i + 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (((TileTCRail) tileEntity).getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(i + 2, j, k);
							if (te2 != null) ((TileTCRail) te2).setType(TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
			}
		}
	}
}
