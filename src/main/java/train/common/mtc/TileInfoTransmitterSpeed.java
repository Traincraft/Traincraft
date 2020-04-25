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
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTC;
import train.common.mtc.packets.PacketNextSpeed;
import train.common.mtc.packets.PacketPlaySoundOnClient;
import train.common.mtc.packets.PacketSetSpeed;

import java.util.List;
@Optional.Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "OpenComputers")
public class TileInfoTransmitterSpeed  extends TileEntity implements IPeripheral, SimpleComponent {
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

	public boolean enforceSpeedLimits = false;
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.setSpeed = nbttagcompound.getInteger("setSpeed");
        this.nextSpeedLimit = nbttagcompound.getInteger("nextSpeedLimit");
        this.xFromSpeedChange = nbttagcompound.getDouble("xFromSpeedChange");
        this.yFromSpeedChange = nbttagcompound.getDouble("yFromSpeedChange");
        this.zFromSpeedChange = nbttagcompound.getDouble("zFromSpeedChange");
        this.enforceSpeedLimits = nbttagcompound.getBoolean("enforceSpeedLimits");
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
        nbttagcompound.setBoolean("enforceSpeedLimits", this.enforceSpeedLimits);
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
                        daTrain.enforceSpeedLimits = enforceSpeedLimits;
                        if (daTrain.mtcOverridePressed) { return;}
                         if (daTrain.mtcStatus == 0  && hadSentMTCPacket == false) {
                             daTrain.mtcStatus = 1;
                            Traincraft.mscChannel.sendToAllAround(new PacketMTC(daTrain.getEntityId(),   1, 1)  , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
                            hadSentMTCPacket = true;
                         }

                        if (daTrain.speedLimit != setSpeed) {

                                if (daTrain.riddenByEntity != null ) {

                                   // worldObj.playSoundAtEntity(daTrain.ridingEntity, Info.resourceLocation + ":" + "mtc_speedchange", 1.0F, 1.0F);
                                    // worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getHornString(), sounds.getHornVolume(), 1.0F);
                                    Traincraft.playSoundOnClientChannel.sendTo(new PacketPlaySoundOnClient(7, "tc:mtc_speedchange"), (EntityPlayerMP)daTrain.riddenByEntity);
                                }

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
        return new String[]  {"activate", "deactivate", "setSpeed", "getSpeed", "setNextSpeed", "setNextX", "setNextY", "setNextZ", "enforceSpeedLimits"};
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
                if (arguments[0] instanceof Double) {
                    this.zFromSpeedChange = Double.parseDouble(arguments[0].toString());
                } else {
                    return new Object[]{"nil"};
                }
                return new Object[]{true};
            }case 8: {
                if (arguments[0] instanceof Boolean) {
                    this.enforceSpeedLimits = (Boolean) arguments[0];
                }
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
    @Override
    public String getComponentName() {
        return "info_transmitter_speed";
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
    public Object[] setNextSpeed(Context context, Arguments args) {
        if (args.isInteger(0)) { this.nextSpeedLimit = args.checkInteger(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setSpeed(Context context, Arguments args) {
        System.out.println("Set!");
        if (args.isInteger(0)) { this.setSpeed = args.checkInteger(0);}
        System.out.println(args.isInteger(0));

        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setNextX(Context context, Arguments args) {
        if (args.isDouble(0)) { this.xFromSpeedChange = args.checkDouble(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setNextY(Context context, Arguments args) {
        if (args.isDouble(0)) { this.yFromSpeedChange = args.checkDouble(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] setNextZ(Context context, Arguments args) {
        if (args.isDouble(0)) { this.zFromSpeedChange = args.checkDouble(0);}
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] enforceSpeedLimits(Context context, Arguments args) {
        if (args.isBoolean(0)) { this.enforceSpeedLimits = args.checkBoolean(0);}
        return new Object[]{true};
    }


}
