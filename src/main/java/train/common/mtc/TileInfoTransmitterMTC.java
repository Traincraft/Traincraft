package train.common.mtc;


import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTC;

import java.util.List;
@Optional.Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "OpenComputers")
public class TileInfoTransmitterMTC extends TileEntity implements IPeripheral, SimpleComponent {
    public World world;
    public int MTCInfo = 1;
    //MTC Info Transmitter Statues:
    //MTC 0 = Nothing, really/Inactive
    //MTC 1 = MTC Start
    //MTC 2 = MTC Warn End
    //MTC 3 = MTC End
	public boolean activated = false;
	public String stationName = "";
	public String serverUUID = "";
	public String signalBlock = "";
	public int mtcType = 1;
    public boolean enforceSpeedLimits = false;

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
        this.signalBlock = nbttagcompound.getString("signalBlock");
        this.enforceSpeedLimits = nbttagcompound.getBoolean("enforceSpeedLimits");
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
        nbttagcompound.setBoolean("enforceSpeedLimits", this.enforceSpeedLimits);

    }

    public void updateEntity() {
        if (worldObj == null) {
            return;
        }

        if (worldObj.isRemote) {return;}
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
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
                    daTrain.enforceSpeedLimits = enforceSpeedLimits;
                    if (this.mtcType == 2 && !daTrain.isConnecting) {
                        daTrain.stationStop = false;
                        daTrain.speedGoingDown = false;
                        if ( !this.serverUUID.equals("") &&  !(daTrain.serverUUID.equals(this.serverUUID))) {
                            daTrain.isConnecting = true;
                            daTrain.connectingUUID = this.serverUUID;
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
        return new  String[] {"setMTCStatus", "getMTCStatus", "activate", "deactivate", "setStationName", "setServerUUID", "setSignalBlock", "setMTCType", "enforceSpeedLimits"};
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
            }case 8: {
                if (arguments[0] instanceof Boolean) {
                    this.enforceSpeedLimits = (Boolean) arguments[0];
                }
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

    @Override
    public String getComponentName() {
        return "info_transmitter_mtc";
    }

    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] activate(Context context, Arguments args) {
        this.activated = true;
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] deactivate(Context context, Arguments args) {
        this.activated = false;
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setMTCStatus(Context context, Arguments args) {
        if (args.isInteger(0)) { this.MTCInfo = args.checkInteger(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setServerUUID(Context context, Arguments args) {
        if (args.isString(0)) { this.serverUUID = args.checkString(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setMTCType(Context context, Arguments args) {
        if (args.isInteger(0)) { this.mtcType = args.checkInteger(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setSignalBlock(Context context, Arguments args) {
        if (args.isString(0)) { this.signalBlock = args.checkString(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] enforceSpeedLimits(Context context, Arguments args) {
        if (args.isBoolean(0)) { this.enforceSpeedLimits = args.isBoolean(0);}
        return new Object[]{true};
    }
}
