package train.common.mtc;


import cpw.mods.fml.common.network.NetworkRegistry;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTC;

import java.util.List;

public class TileInfoTransmitterMTC extends TileEntity implements IPeripheral {
    public World world;
    public int MTCInfo = 0;
    //MTC Info Transmitter Statues:
    //MTC 0 = Nothing, really/Inactive
    //MTC 1 = MTC Start
    //MTC 2 = MTC Warn End
    //MTC 3 = MTC End
	public boolean activated = false;
	public String stationName = "";
	public String serverUUID = "";
	public String signalBlock = "";
	public int mtcType = 0;
    public TileInfoTransmitterMTC() {
        this.world = worldObj;
    }

    public AxisAlignedBB boundingBox = null;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.MTCInfo = nbttagcompound.getInteger("mtcInfo");
        this.mtcType = nbttagcompound.getInteger("mtcType");
        this.activated = nbttagcompound.getBoolean("activated");
        this.stationName =  nbttagcompound.getString("stationName");
        this.serverUUID = nbttagcompound.getString("serverUUID");
        this.signalBlock = nbttagcompound.getString("signalBlock");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);

        nbttagcompound.setInteger("mtcInfo", this.MTCInfo);
        nbttagcompound.setInteger("mtcType", this.mtcType);
		nbttagcompound.setBoolean("activated", this.activated);
        nbttagcompound.setString("stationName", this.stationName);
        nbttagcompound.setString("serverUUID", this.serverUUID);
        nbttagcompound.setString("signalBlock", this.signalBlock);

    }

    public void updateEntity() {
        if (worldObj == null) {
            return;
        }

        if (worldObj.isRemote) {return;}
        List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                if (obj instanceof Locomotive) {

                    Locomotive daTrain = (Locomotive) obj;
                    if (daTrain.mtcOverridePressed) { return;}
                //    daTrain.mtcStatus = MTCInfo;
                 //   if (daTrain.mtcStatus == 0) {
                 //       daTrain.speedLimit = "0";

                 //   }

				 if (activated) {
                    //ExampleMod.msChannel.sendToAll(new PacketMTC(daTrain.getEntityId(), MTCInfo, 2));
                    Traincraft.mscChannel.sendToAllAround(new PacketMTC(daTrain.getEntityId(), MTCInfo, 0) , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));

                    daTrain.mtcStatus =  MTCInfo;
                    daTrain.currentSignalBlock = this.signalBlock;
                    daTrain.mtcType = this.mtcType;
                    if (this.mtcType == 2) {
                        daTrain.stationStop = false;
                        daTrain.speedGoingDown = false;
                        if (!(daTrain.serverUUID.equals(this.serverUUID))) {

                            daTrain.attemptConnection(serverUUID);
                        }
                    } else if (serverUUID.equals("end")) {
                    //End communications with the server
                        daTrain.disconnectFromServer();
                        daTrain.serverUUID = "";
                    }


                  }
                }
            }
        }
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
        }
        return boundingBox;
    }

    @Override
    public String getType() {
        return "info_transmitter_mtc";
    }

    @Override
    public String[] getMethodNames() {
        return new  String[] {"setMTCStatus", "getMTCStatus", "activate", "deactivate", "setStationName", "setServerUUID", "setSignalBlock", "setMTCType"};
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException {
        switch(method) {
            case 0: {

                if (arguments[0] instanceof Double) {this.MTCInfo = (int)Math.round(Double.parseDouble(arguments[0].toString())); } else { return new Object[] {"nil"}; }
                return new Object[] {true};
            } case 1: {

                return new Object[] {MTCInfo};

		    } case 2: {
			activated = true;
             return new Object[] {true};

		    } case 3: {
                activated = false;
                return new Object[]{true};


            } case 4: {
               stationName = arguments[0].toString();
                return new Object[]{true};
			} case 5: {
			  serverUUID = arguments[0].toString();
			  return new Object[]{true};
            } case 6: {
               signalBlock = arguments[0].toString();
                return new Object[]{true};
            } case 7: {
                mtcType = (int)Math.round(Double.parseDouble(arguments[0].toString()));
                return new Object[]{true};
            } default:
                return new Object[] {"nil"};
        }
	}
    

    @Override
    public void attach(IComputerAccess computer) {

    }

    @Override
    public void detach(IComputerAccess computer) {

    }

    @Override
    public boolean equals(IPeripheral other) {
        return false;
    }
}
