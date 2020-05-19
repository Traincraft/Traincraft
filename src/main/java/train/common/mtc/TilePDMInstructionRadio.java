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
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.api.WirelessTransmitter;

import java.util.*;

@Optional.Interface(iface = "li.cil.oc.api.network.Environment", modid = "OpenComputers")
public class TilePDMInstructionRadio extends TileEntity implements IPeripheral, WirelessTransmitter, Environment {
    public Boolean isActivated = false;
    public ArrayList<IComputerAccess> computers = new ArrayList<IComputerAccess>();
    public int system = 0;
    public String uniqueID = "";
    public AxisAlignedBB boundingBox = null;
    Map< String,Map<String, String>> connectedTrains =
            new HashMap<String,Map<String, String>>();
    protected boolean addedToNetwork = false;
    public Node node = Network.newNode(this, Visibility.Network).withComponent(getComponentName()).withConnector(32).create();

    public TilePDMInstructionRadio() {
        if (uniqueID.equals("")) {
            uniqueID = UUID.randomUUID().toString();
        }
    }
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.isActivated = nbttagcompound.getBoolean("activated");
        this.uniqueID =  nbttagcompound.getString("uniqueID");
        if (node != null && node.host() == this) {
            // This restores the node's address, which is required for networks
            // to continue working without interruption across loads. If the
            // node is a power connector this is also required to restore the
            // internal energy buffer of the node.
            node.load(nbttagcompound.getCompoundTag("oc:node"));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setBoolean("activated", this.isActivated);
        nbttagcompound.setString("uniqueID", this.uniqueID);
        if (node != null && node.host() == this) {
            final NBTTagCompound nodeNbt = new NBTTagCompound();
            node.save(nodeNbt);
            nbttagcompound.setTag("oc:node", nodeNbt);
        }
    }
    @Override
    public String getType() {
        return "wirelessMTCRadio";
    }

    @Override
    public String[] getMethodNames() {
        return new String[] {"activate", "deactivate", "sendMessage", "getSelfUUID", "getConnectedTrains"};
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException {
        switch(method) {
            case 0: {
                isActivated = true;
                Traincraft.LOGGER.info("Wireless Transmitter UUID is: " + uniqueID);
                return new Object[] {true};

            } case 1: {
                isActivated = false;
                return new Object[] {true};

            } case 2: {
                sendMessage(new PDMMessage(this.uniqueID, arguments[0].toString(), arguments[1].toString(), 1 ));
                return new Object[]{true};
            } case 3 : {
                Traincraft.LOGGER.info("Wireless Transmitter UUID is: " + uniqueID);
                return new Object[]{uniqueID};
            } case 4 : {
               return new Object[]{connectedTrains};
            } default:
                return new Object[] {"nil"};
        }
    }

    @Override
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
    @Override
    public void sendMessage(PDMMessage message) {
        //System.out.println("Attempting to send..");
        if (isActivated) {
            for (WirelessTransmitter wt : getWirelessTransmittersInBoundingBox()) {
                if (wt instanceof Locomotive) {
                    ///System.out.println("Train's ID: " + ((Locomotive)wt).trainID);
                    //System.out.println("Finding ID: " + message.UUIDTo);
                    //System.out.println("It's at " +  ((Locomotive)wt).posX + ", " +  ((Locomotive)wt).posY + ", " +  ((Locomotive)wt).posZ);
                } else if (wt instanceof TilePDMInstructionRadio) {
                    ///System.out.println("Radio's ID: " + ((TilePDMInstructionRadio)wt).uniqueID);
                    /// System.out.println("Finding ID: " + message.UUIDTo);
                    // System.out.println("It's at " + ((TilePDMInstructionRadio)wt).xCoord + ", " + ((TilePDMInstructionRadio)wt).yCoord + ", " + ((TilePDMInstructionRadio)wt).zCoord );
                }


                if (wt instanceof Locomotive) {

                    Locomotive actualLocomotive = (Locomotive) wt;
                    if (actualLocomotive.trainID.equals(message.UUIDTo)) {
                        //    System.out.println("Both of those match! Sending message..");
                        wt.receiveMessage(new PDMMessage(this.uniqueID, message.UUIDTo, message.message, system));
                    }
                } else if (wt instanceof TilePDMInstructionRadio) {

                    TilePDMInstructionRadio actualRadio = (TilePDMInstructionRadio) wt;
                    if (actualRadio.uniqueID.equals(message.UUIDTo)) {
                        //   System.out.println("Both of those match! Sending message..");
                        wt.receiveMessage(message);
                    }

                }

            }
        }
    }

    public ArrayList<WirelessTransmitter> getWirelessTransmittersInBoundingBox() {
       // System.out.println("Got some..");
      /*  List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 100, yCoord +100, zCoord + 100));
        ArrayList<EntityLocoElectricPeachDriverlessMetro> returnList = new ArrayList();
        if (list != null) {
            System.out.println(list.size());
            for (Object obj : list) {
                System.out.println(obj.getClass().getName());
                if (obj instanceof EntityLocoElectricPeachDriverlessMetro) {
                    returnList.add((EntityLocoElectricPeachDriverlessMetro)obj);
                }
            }
        }Oka
        return returnList;*/
        int i = (this.xCoord / 16) -50;
        int j = (this.xCoord / 16 )+ 50;
        int k = (this.zCoord / 16)-50;
        int l = (this.zCoord / 16) + 50;
        List[] entities;
        ArrayList<WirelessTransmitter> toAdd = new ArrayList();

        for (int i1 = i; i1 <= j; ++i1) {
            for (int j1 = k; j1 <= l; ++j1) {
                if (worldObj.getChunkProvider().chunkExists(i1, j1)) {
                    entities = worldObj.getChunkFromChunkCoords(i1, j1).entityLists;
                    for (List olist: entities) {
                        for(Object obj : olist) {

                            if(obj instanceof Locomotive){

                                toAdd.add((Locomotive)obj);
                            }

                        }
                    }
                }
            }
        }
        //Oh yeah, also get other instruction radios too
        List<TileEntity> allTEs = worldObj.loadedTileEntityList;

        List<TileEntity> allTEs2 = allTEs;

        Iterator<TileEntity> iterator = allTEs2.iterator();
        while(iterator.hasNext()) {
           TileEntity te = iterator.next();
            if (te instanceof TilePDMInstructionRadio) {
                //   System.out.println("Found a radio, uuid is " + ((TilePDMInstructionRadio)te).uniqueID);
                toAdd.add((TilePDMInstructionRadio)te);
            }
        }
       //System.out.println("Got some..");
        ArrayList returnList = new ArrayList();
        returnList.addAll(toAdd);
        return returnList;
    }

    public void receiveMessage(PDMMessage message) {
        if (isActivated) {
            try {
                if (computers != null && computers.size() > 0) {
                    for (IComputerAccess c : computers) {
                        c.queueEvent("radio_message", new Object[]{c.getAttachmentName(), message.UUIDFrom, message.UUIDTo, message.message,
                                message.system});

                         System.out.println(message.message);
                    }
                }
                if (node != null) {
                    node().sendToReachable("computer.signal","radio_message", node.address(), message.UUIDFrom, message.UUIDTo, message.message,
                            message.system);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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
    }

    public String getComponentName() {
        return "wirelessMTCRadio";
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] activate(Context context, Arguments args) {
        isActivated = true;
        Traincraft.LOGGER.info("Wireless Transmitter UUID is: " + uniqueID);
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
    public Object[] getSelfUUID(Context context, Arguments args) {
        return new Object[]{uniqueID};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] sendMessage(Context context, Arguments args) {
        if (args.isString(0) && args.isString(1)) {
            sendMessage(new PDMMessage(this.uniqueID, args.checkString(0),args.checkString(1), 1));
        }
        return new Object[]{true};
    }


   /* @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
          //  System.out.println("new");
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2000, yCoord +2000, zCoord + 2000);
        }
        return boundingBox;
    }*/

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
