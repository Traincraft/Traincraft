package train.common.mtc;

import cpw.mods.fml.common.Optional;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import li.cil.oc.api.Network;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.Locomotive;

import java.util.ArrayList;
import java.util.List;
@Optional.Interface(iface = "li.cil.oc.api.network.Environment", modid = "OpenComputers")
public class TileInfoGrabberMTC  extends TileEntity implements IPeripheral, Environment {
    public Boolean isActivated = false;
    public String trainID = "0";
    public String trainLevel = "0";
    public ArrayList<IComputerAccess> computers = new ArrayList<IComputerAccess>();
    public String trainName = "0";
    public String trainType = "0";
    public boolean trainOverSensor = false;
    public AxisAlignedBB boundingBox = null;
    protected boolean addedToNetwork = false;
    public Node leNode = Network.newNode(this, Visibility.Network).withComponent(getComponentName()).withConnector(32).create();;

    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);

        this.isActivated = nbttagcompound.getBoolean("isActivated");
        this.trainID = nbttagcompound.getString("trainID");
        this.trainLevel = nbttagcompound.getString("trainLevel");
        this.trainName = nbttagcompound.getString("trainName");
        this.trainType = nbttagcompound.getString("trainType");
        if (leNode != null && leNode.host() == this) {
            // This restores the node's address, which is required for networks
            // to continue working without interruption across loads. If the
            // node is a power connector this is also required to restore the
            // internal energy buffer of the node.
            leNode.load(nbttagcompound.getCompoundTag("oc:node"));
        }
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
        if (leNode != null && leNode.host() == this) {
            final NBTTagCompound nodeNbt = new NBTTagCompound();
            leNode.save(nodeNbt);
            nbttagcompound.setTag("oc:node", nodeNbt);
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
    public void updateEntity() {
        if (worldObj == null) {
            return;
        }
        if (!addedToNetwork) {
            addedToNetwork = true;
            Network.joinOrCreateNetwork(this);
        }
        if (isActivated) {
            List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
            if (list != null && list.size() > 0) {
                for (Object obj : list) {


                    if (obj instanceof Locomotive) {
                        Locomotive daTrain = (Locomotive) obj;
                        if (daTrain.mtcOverridePressed) {
                            return;
                        }
                        this.trainLevel = daTrain.trainLevel;
                        this.trainID = daTrain.trainID;
                        this.trainName = daTrain.getTrainName();
                        this.trainType = daTrain.getTrainType();
                        trainOverSensor = true;
                        try {
                            if (computers != null && computers.size() > 0) {
                                for (IComputerAccess c : computers) {
                                    c.queueEvent("mtc_trainoversensor", new Object[]{c.getAttachmentName()});

                                    // System.out.println(message.message);
                                }
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        if (leNode != null) {
                            node().sendToReachable("computer.signal", "trainOverSensor");
                        }

                    }

                }
            } else {
                trainOverSensor = false;
            }
        }
    }


    @Override
    public String getType() {
        return "info_receiver_mtcdata";
    }

    @Override
    public String[] getMethodNames() {
        return new String[]{"activate", "deactivate", "getMTCLevel", "getMTCName", "getMTCType", "isTrainOverSensor", "getTrainID", "getIsEndOfTrain"};
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException {
        switch (method) {
            case 0: {
                isActivated = true;
                return new Object[]{true};

            }
            case 1: {
                isActivated = false;
                return new Object[]{true};

            }
            case 2: {

                return new Object[]{trainLevel};

            }
            case 3: {
                return new Object[]{trainName};

            }
            case 4: {
                return new Object[]{trainType};
            }
            case 5: {
                return new Object[]{trainOverSensor};
            }
            case 6: {
                return new Object[]{trainID};
            }
            default:
                return new Object[]{"nil"};
        }

    }

    public void attach(IComputerAccess computer) {
        computers.add(computer);
    }

    @Override
    public void detach(IComputerAccess computer) {
        computers.remove(computer);
    }

    @Override
    public boolean equals(IPeripheral other) {
        return false;
    }

    //OpenComputers!
    public String getComponentName() {
        return "info_receiver_mtcdata";
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
    public Object[] getMTCLevel(Context context, Arguments args) {
        return new Object[]{trainLevel};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getTrainName(Context context, Arguments args) {
        return new Object[]{trainName};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getTrainType(Context context, Arguments args) {
        return new Object[]{trainType};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] isTrainOverSensor(Context context, Arguments args) {
        return new Object[]{trainOverSensor};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getTrainID(Context context, Arguments args) {
        return new Object[]{trainID};
    }
    @Optional.Method(modid = "OpenComputers")
    /*@Override
    public Node node() {
        return leNode;
    }

    @Override
    public void onConnect(Node node) {
        this.leNode = node;
    }

    @Override
    public void onDisconnect(Node node) {

    }

    @Override
    public void onMessage(Message message) {}*/
    @Override
    public Node node() {
        return leNode;
    }

    @Override
    public void onConnect(Node node) {

    }

    @Override
    public void onDisconnect(Node node) {

    }
    @Override
    public void onMessage(Message message) {}


    @Override
    public void onChunkUnload() {
        super.onChunkUnload();
        if (leNode != null) leNode.remove();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (leNode != null) leNode.remove();
    }
}
