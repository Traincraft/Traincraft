package train.common.mtc;


import cpw.mods.fml.common.network.NetworkRegistry;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTC;
import train.common.mtc.packets.PacketNextSpeed;
import train.common.mtc.packets.PacketSetSpeed;

import java.util.List;

public class TileInfoTransmitterSpeed  extends TileEntity implements IPeripheral {
    public Boolean isActivated = false;
    public int setSpeed = 0;
    public int nextSpeedLimit = 0;
    public Double xFromSpeedChange = 0.0;
    public Double yFromSpeedChange = 0.0;
    public Double zFromSpeedChange = 0.0;



    public AxisAlignedBB boundingBox = null;
	public int trainNumber = 0;

	public boolean hadSentPacket = false;
	public boolean hadSentMTCPacket = false;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.setSpeed = nbttagcompound.getInteger("setSpeed");
        this.nextSpeedLimit = nbttagcompound.getInteger("nextSpeedLimit");
        this.xFromSpeedChange = nbttagcompound.getDouble("xFromSpeedChange");
        this.yFromSpeedChange = nbttagcompound.getDouble("yFromSpeedChange");
        this.zFromSpeedChange = nbttagcompound.getDouble("zFromSpeedChange");


    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setBoolean("isActivated", this.isActivated);
        nbttagcompound.setInteger("setSpeed", this.setSpeed);
        nbttagcompound.setInteger("nextSpeedLimit", this.nextSpeedLimit);
        nbttagcompound.setDouble("xFromSpeedChange", this.xFromSpeedChange);
        nbttagcompound.setDouble("yFromSpeedChange",  this.yFromSpeedChange);
        nbttagcompound.setDouble("zFromSpeedChange",  this.zFromSpeedChange);

    }
    @Override

    public void updateEntity() {

        if (worldObj == null) {
            return;
        }
        if (isActivated) {
            List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
			if (list.size() == 0 ) {
				hadSentPacket = false;
				hadSentMTCPacket = false;
				trainNumber = 0;
				//Reset everything.
			}
            if (list != null && list.size() > 0) {
                for (Object obj : list) {
					
                    if (obj instanceof Locomotive) {

                        Locomotive daTrain = (Locomotive) obj;
                        if (daTrain.mtcOverridePressed) { return;}
                         if (daTrain.mtcStatus == 0  && hadSentMTCPacket == false) {
                             daTrain.mtcStatus = 1;
                            Traincraft.mscChannel.sendToAllAround(new PacketMTC(daTrain.getEntityId(),   daTrain.mtcStatus, 1)  , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
							 hadSentMTCPacket = true;
                         }


                        daTrain.speedLimit = setSpeed;

                        if (!worldObj.isRemote && hadSentPacket == false) {

                            trainNumber = daTrain.getEntityId();
							hadSentPacket = true;
                            Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(setSpeed, this.xCoord, this.yCoord, this.zCoord, daTrain.getEntityId()) , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));


                                daTrain.nextSpeedLimit = this.nextSpeedLimit;
                                daTrain.xSpeedLimitChange = this.xFromSpeedChange;
                                daTrain.ySpeedLimitChange = this.yFromSpeedChange;
                                daTrain.zSpeedLimitChange = this.zFromSpeedChange;

                                Traincraft.itnsChannel.sendToAllAround(new PacketNextSpeed(this.nextSpeedLimit, this.xCoord, this.yCoord, this.zCoord, this.xFromSpeedChange, this.yFromSpeedChange,this.zFromSpeedChange, daTrain.getEntityId()) , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));


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
        return "info_transmitter_speed";
    }

    @Override
    public String[] getMethodNames() {
        return new String[]  {"activate", "deactivate", "setSpeed", "getSpeed", "setNextSpeed", "setNextX", "setNextY", "setNextZ"};
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException {
        switch(method) {
            case 0: {
                isActivated = true;
                return new Object[] {true};

            } case 1: {
                isActivated = false;
                return new Object[] {true};

            } case 2: {

                if (arguments[0] instanceof Double) {this.setSpeed = (int)Math.round(Double.parseDouble(arguments[0].toString()));
                return new Object[] {"true"}; } else { return new Object[] {"nil"}; }






            } case 3: {
                return new Object[]{setSpeed};

            } case 4: {

               if (arguments[0] instanceof Double) {this.nextSpeedLimit = (int)Math.round(Double.parseDouble(arguments[0].toString())); } else { return new Object[] {"nil"}; }
                return new Object[] {true};
            } case 5: {
              if (arguments[0] instanceof Double) { this.xFromSpeedChange = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
                return new Object[] {true};
            } case 6: {
                if (arguments[0] instanceof Double) { this.yFromSpeedChange = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
                return new Object[] {true};
            }case 7: {
                if (arguments[0] instanceof Double) { this.zFromSpeedChange = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
                return new Object[] {true};
            } default:
                return new Object[] {"nil"};
        }


    }
    public boolean isObjectInteger(Object o)
    {
        try {
            Integer.parseInt(o.toString());
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
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
    public void updateSpeed(double speed) {
        try {
            setSpeed = (int)speed;
        } catch (Exception ex) {

        }

    }

    public void nextUpdateSpeed(int speed, double nx, double ny, double nz) {
        try {
            nextSpeedLimit = speed;
            xFromSpeedChange = nx;
            yFromSpeedChange = ny;
            zFromSpeedChange = nz;
        } catch (Exception ex) {

        }

    }

    public boolean saveStringNBT(Entity theEntity, String key, String value) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().setString(key, value);//sets the NBT value if it exists, or creates the entry if it doesn't.
            return true;
        }


        return false;
    }

    public boolean saveIntegerNBT(Entity theEntity, String key, int value) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().setInteger(key, value);//sets the NBT value if it exists, or creates the entry if it doesn't.
            return true;
        }


        return false;
    }

    public boolean readStringNBT(Entity theEntity, String key) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().getString(key);
            return true;
        }


        return false;
    }

    public boolean readIntegerNBT(Entity theEntity, String key) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().getInteger(key);
            return true;
        }


        return false;
    }

}
