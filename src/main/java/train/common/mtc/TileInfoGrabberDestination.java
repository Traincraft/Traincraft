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

public class TileInfoGrabberDestination extends TileEntity implements IPeripheral {
    public Boolean isActivated = false;
    public String trainDestination = "";
    public Boolean trainThere = false;
    public AxisAlignedBB boundingBox = null;

    public TileInfoGrabberDestination() {
    }

    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);

        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.trainDestination = nbttagcompound.getString("trainDestination");
        //this.trainID = nbttagcompound.getString("trainID");

    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
        }
        return boundingBox;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        //    nbttagcompound.setBoolean("isActivated", this.isActivated);
        //   nbttagcompound.setInteger("setSpeed", this.setSpeed);

        nbttagcompound.setBoolean("isActivated", this.isActivated);
        nbttagcompound.setString("trainDestination", this.trainDestination);

    }

    @Override
    public String getType() {
        return "info_receiver_destination";
    }

    @Override
    public String[] getMethodNames() {
        return new String[]  {"activate", "deactivate", "getDestination", "isTrainOverSensor"};
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

                return new Object[]{trainDestination};

            } case 3: {
                return new Object[] {trainThere};



            } default:
                return new Object[] {"nil"};
        }
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
                       trainThere = true;
                       trainDestination = daTrain.getDestinationGUI();
                    }
                }
            }
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
