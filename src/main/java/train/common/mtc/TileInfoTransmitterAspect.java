package train.common.mtc;


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
import train.common.mtc.packets.PacketSetAspect;

import java.util.List;

public class TileInfoTransmitterAspect extends TileEntity implements IPeripheral {

public Boolean isActivated = false;
public String setAspect = "red";
public World world;
public int idefNumber;
    public TileInfoTransmitterAspect() {
     this.world = worldObj;
    }

    public AxisAlignedBB boundingBox = null;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.setAspect = nbttagcompound.getString("setAspect");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setBoolean("isActivated", this.isActivated);
        nbttagcompound.setString("setAspect", this.setAspect);
    }

    @Override

    public void updateEntity() {
        if (worldObj == null) {
            return;
        }

            List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
            if (list != null && list.size() > 0) {
                for (Object obj : list) {
                    if (obj instanceof Locomotive) {
                        Locomotive daTrain = (Locomotive) obj;
                        daTrain.signalAspect = setAspect;


                        if (!worldObj.isRemote) {
                            int ts = 0;
                            if (setAspect.equals("green")) {
                                ts = 1;
                            }
                            if (setAspect.equals("blink_yellow")) {
                                ts = 2;
                            }
                            if (setAspect.equals("yellow")) {
                                ts = 3;
                            }
                            if (setAspect.equals("red")) {
                                ts = 4;
                            }
                            if (setAspect.equals("blink_red")) {
                                ts = 5;
                            }
                            if (setAspect.equals("off")) {
                                ts = 6;
                            }


                            Traincraft.itaChannel.sendToAll(new PacketSetAspect(ts, this.xCoord, this.yCoord, this.zCoord));

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
        return "info_transmitter_aspect";
    }

    @Override
    public String[] getMethodNames() {
        return new String[] {"activate", "deactivate", "setTransAspect", "getTransAspect"};
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

                    updateAspect(arguments[0].toString());


                return new Object[] {setAspect};
            } case 3: {
                return new Object[] {setAspect};
            } default:
                return new Object[] {"That method is not here.."};
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

     public void updateAspect(String aspect) {
        setAspect = aspect;
     }

}
