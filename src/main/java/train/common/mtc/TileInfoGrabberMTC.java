package train.common.mtc;

import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.Locomotive;

import java.util.List;

public class TileInfoGrabberMTC  extends TileEntity implements IPeripheral {
    public Boolean isActivated = false;
    public String trainID = "0";
    public String trainLevel = "0";
    //h
    public String trainName = "0";
    public String trainType = "0";
    public boolean trainOverSensor = false;
    public AxisAlignedBB boundingBox = null;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);

        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.trainID = nbttagcompound.getString("trainID");
        this.trainLevel = nbttagcompound.getString("trainLevel");
        this.trainName = nbttagcompound.getString("trainName");
        this.trainType = nbttagcompound.getString("trainType");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
    //    nbttagcompound.setBoolean("isActivated", this.isActivated);
     //   nbttagcompound.setInteger("setSpeed", this.setSpeed);

        nbttagcompound.setBoolean("isActivated", this.isActivated);
        nbttagcompound.setString("trainID", this.trainID);
        nbttagcompound.setString("trainLevel", this.trainLevel);
        nbttagcompound.setString("trainName", this.trainName);
        nbttagcompound.setString("trainType", this.trainType);

    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
        }
        return boundingBox;
    }


        @Override
        public void updateEntity() {
            if (worldObj == null) {
                return;
            }
            if (isActivated) {
                List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
                if (list != null && list.size() > 0) {
                    for (Object obj : list) {

                        if (obj instanceof Locomotive) {

                            Locomotive daTrain = (Locomotive) obj;
                            if (daTrain.mtcOverridePressed) { return;}
                           this.trainLevel = daTrain.trainLevel;
                           this.trainID = daTrain.trainID;
                           this.trainName = daTrain.getTrainName();
                           this.trainType = daTrain.getTrainType();
                           trainOverSensor = true;
                        }
                    }
                }
            }
        }


    @Override
    public String getType() {
        return "info_receiver_mtcdata";
    }

    @Override
    public String[] getMethodNames() {
        return new String[]  {"activate", "deactivate", "getMTCLevel", "getMTCName", "getMTCType", "isTrainOverSensor", "getTrainID"};
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

                return new Object[]{trainLevel};

            } case 3: {
                return new Object[] {trainName};

            } case 4: {
                return new Object[]{trainType};
            } case 5: {
                return new Object[]{trainOverSensor};
            } case 6: {
                return new Object[]{trainID};
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
