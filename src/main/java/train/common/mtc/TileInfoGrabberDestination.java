package train.common.mtc;

import cpw.mods.fml.common.Loader;
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

public class TileInfoGrabberDestination extends TileEntity implements IPeripheral, Environment {
    public Boolean isActivated = false;
    public String trainDestination = "";
    public Boolean trainThere = false;
    public AxisAlignedBB boundingBox = null;
    public ArrayList<IComputerAccess> computers = new ArrayList<IComputerAccess>();
    protected boolean addedToNetwork = false;
    public Node node;
    public TileInfoGrabberDestination() {
        if (Loader.isModLoaded("OpenComputers")) {
            node = Network.newNode(this, Visibility.Network).withComponent(getComponentName()).withConnector(32).create();
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);

        this.isActivated = nbttagcompound .getBoolean("isActivated");
        this.trainDestination = nbttagcompound.getString("trainDestination");
        //this.trainID = nbttagcompound.getString("trainID");
        if (node != null && node.host() == this) {
            // This restores the node's address, which is required for networks
            // to continue working without interruption across loads. If the
            // node is a power connector this is also required to restore the
            // internal energy buffer of the node.
            node.load(nbttagcompound.getCompoundTag("oc:node"));
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
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        //    nbttagcompound.setBoolean("isActivated", this.isActivated);
        //   nbttagcompound.setInteger("setSpeed", this.setSpeed);

        nbttagcompound.setBoolean("isActivated", this.isActivated);
        nbttagcompound.setString("trainDestination", this.trainDestination);
        if (node != null && node.host() == this) {
            final NBTTagCompound nodeNbt = new NBTTagCompound();
            node.save(nodeNbt);
            nbttagcompound.setTag("oc:node", nodeNbt);
        }
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
                        if (daTrain.mtcOverridePressed) { return;}
                       trainThere = true;
                       trainDestination = daTrain.getDestinationGUI();
                        try {
                            if (computers != null && computers.size() > 0) {
                                for (IComputerAccess c : computers) {
                                    c.queueEvent("mtc_trainoversensor", new Object[]{c.getAttachmentName()});

                                    // System.out.println(message.message);
                                }
                            }
                            //Ooor, if it's OpenComputers..

                            if (node != null) {
                                node().sendToReachable("computer.signal","trainOverSensor");
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            } else {
                trainThere = false;
            }
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
        return "info_receiver_destination";
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
    public Object[] getDestination(Context context, Arguments args) {
        return new Object[]{trainDestination};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] isTrainOverSensor(Context context, Arguments args) {
        return new Object[]{trainThere};
    }
    @Override
    public Node node() {
        return node;
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
        if (node != null) node.remove();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (node != null) node.remove();
    }

}
