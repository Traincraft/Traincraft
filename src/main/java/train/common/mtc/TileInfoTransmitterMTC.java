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
    public TileInfoTransmitterMTC() {
        this.world = worldObj;
    }

    public AxisAlignedBB boundingBox = null;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.MTCInfo = nbttagcompound.getInteger("mtcInfo");
        this.activated = nbttagcompound.getBoolean("activated");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);

        nbttagcompound.setInteger("mtcInfo", this.MTCInfo);
		nbttagcompound.setBoolean("activated", this.activated);
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
				 if (activated == true) {
                    //ExampleMod.msChannel.sendToAll(new PacketMTC(daTrain.getEntityId(), MTCInfo, 2));
                    Traincraft.mscChannel.sendToAll(new PacketMTC(daTrain.getEntityId(), MTCInfo, 1));
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
        return new  String[] {"setMTCStatus", "getMTCStatus", "activate", "deactivate"};
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
			 return new Object[] {true};
		    
			
			
			
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
