package train.common.mtc;


import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketATOSetStopPoint;

import java.util.Iterator;
import java.util.List;

public class TileATOTransmitterStopPoint extends TileEntity implements IPeripheral {

   public Boolean isActivated = false;
   public double stopX = 0.0;
   public double stopY = 0.0D;
   public double stopZ = 0.0D;
   public AxisAlignedBB boundingBox = null;


   public void updateEntity() {
      if(worldObj != null) {
         if(this.isActivated) {
            List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());

            for (Object obj : list) {
               if (obj instanceof Locomotive) {
                  Locomotive daTrain = (Locomotive) obj;
                  if (daTrain.mtcOverridePressed) {
                     return;
                  }
                  if (daTrain.mtcStatus == 1 | daTrain.mtcStatus == 2) {
                     if (this.stopX == 0) {
                        return;
                     }

                     daTrain.xFromStopPoint = this.stopX;
                     daTrain.yFromStopPoint = this.stopY;
                     daTrain.zFromStopPoint = this.stopZ;
                     Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(daTrain.getEntityId(), Double.valueOf(this.stopX), Double.valueOf(this.stopY), Double.valueOf(this.stopZ), daTrain.xStationStop, daTrain.yStationStop, daTrain.zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
                  }
               }
            }
         }

      }
   }

   public String getType() {
      return "ato_stoppoint_transmitter";
   }

   public String[] getMethodNames() {
      return new String[]{"activate", "deactivate", "setX", "setY", "setZ"};
   }

   public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException {
      switch(method) {
      case 0:
         this.isActivated = true;
         return new Object[]{true};
      case 1:
         this.isActivated = false;
         return new Object[]{false};
      case 2:
         if (arguments[0] instanceof Double) { this.stopX = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
         return new Object[]{true};
      case 3:
         if (arguments[0] instanceof Double) { this.stopY = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
         return new Object[]{true};
      case 4:
        if (arguments[0] instanceof Double) { this.stopZ = Double.parseDouble(arguments[0].toString()); } else { return new Object[] {"nil"};}
         return new Object[]{true};
      default:
         return new Object[]{"nil"};
      }
   }


   public void attach(IComputerAccess computer) {}

   public void detach(IComputerAccess computer) {}

   public boolean equals(IPeripheral other) {
      return false;
   }

   //Open Computers!
   @Override
   public String getComponentName() {
      return "ato_transmitter";
   }

   @Callback
   @Optional.Method(modid = "OpenComputers")
   public Object[] activate(Context context, Arguments args) {
      this.isActivated = true;
      return new Object[]{true};
   }
   @Callback
   @Optional.Method(modid = "OpenComputers")
   public Object[] deactivate(Context context, Arguments args) {
      this.isActivated = false;
      return new Object[]{true};
   }
   @Callback
   @Optional.Method(modid = "OpenComputers")
   public Object[] setX(Context context, Arguments args) {
      if (args.isDouble(0)) {
         this.stopX = args.checkDouble(0);
         return new Object[]{true};
      } else {
         return new Object[]{false};
      }
   }
   @Callback
   @Optional.Method(modid = "OpenComputers")
   public Object[] setY(Context context, Arguments args) {
      if (args.isDouble(0)) {
         this.stopY = args.checkDouble(0);
         return new Object[]{true};
      } else {
         return new Object[]{false};
      }
   }
   @Callback
   @Optional.Method(modid = "OpenComputers")
   public Object[] setZ(Context context, Arguments args) {
      if (args.isDouble(0)) {
         this.stopZ = args.checkDouble(0);
         return new Object[]{true};
      } else {
         return new Object[]{false};
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
   public void readFromNBT(NBTTagCompound nbttagcompound) {
      super.readFromNBT(nbttagcompound);
      this.isActivated = nbttagcompound.getBoolean("isActivated");
      this.stopX = nbttagcompound.getDouble("stopX");
      this.stopY = nbttagcompound.getDouble("stopY");
      this.stopZ = nbttagcompound.getDouble("stopZ");
   }

   @Override
   public void writeToNBT(NBTTagCompound nbttagcompound) {
      super.writeToNBT(nbttagcompound);
      nbttagcompound.setBoolean("isActivated", this.isActivated);
      nbttagcompound.setDouble("stopX", this.stopX);
      nbttagcompound.setDouble("stopY", this.stopY);
      nbttagcompound.setDouble("stopZ", this.stopZ);
   }


}
