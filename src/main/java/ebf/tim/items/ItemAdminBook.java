package ebf.tim.items;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.utility.CommonProxy;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.ServerLogger;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <h1>Key Item</h1>
 * the key used to allow people other than the owner to interact with a locked train or rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemAdminBook extends Item{

    public ItemAdminBook(){ }

    /**
     * <h2>Description text</h2>
     * Allows items to add custom lines of information to the mouseover description, by adding new lines to stringList.
     * Each string added defines a new line.
     * We can cover the key and ticket description here, to simplify other classes.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack thisStack, EntityPlayer player, List stringList, boolean p_77624_4_) {
        stringList.add("This book is for Operators ONLY, and allows the following:");
        stringList.add("- drop trains/rollingstock and their inventory lost during a crash");
        stringList.add("- Lock or unlock trains/rollingstock");
    }
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World worldObj, EntityPlayer player) {
        try {
            if (worldObj.isRemote) {
                return itemStack;
            } else if (!player.canCommandSenderUseCommand(2, "")) {
                return itemStack;
            }

            if (new File(CommonProxy.configDirectory + "/TrainsInMotion/logging/").exists()) {
                //if player wasin't looking at a train
                StringBuilder sb = new StringBuilder();
                File[] list = new File(CommonProxy.configDirectory + "/TrainsInMotion/logging/").listFiles();
                if (list!=null) {
                    Arrays.sort(list, new compareFile());
                    for (File f : list) {
                        if (f.isDirectory() && f.list() != null && f.list().length > 0) {
                            sb.append(f.getName());
                            sb.append(",");
                        }
                    }
                    //wrong player or something....?
                    TrainsInMotion.keyChannel.sendTo(new PacketAdminBook(sb.toString()), (EntityPlayerMP) player);
                }
                return itemStack;
            } else {
                return itemStack;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return super.onItemRightClick(itemStack, worldObj, player);
    }



    class compareFile implements Comparator<File> {
        // Overriding the compare method to sort the age
        public int compare(File d, File d1) {
            return d.getName().compareTo(d1.getName());
        }
    }





    public static class PacketAdminBookClient implements IMessage {
        private String data;

        public PacketAdminBookClient() {}

        public PacketAdminBookClient(String data) {
            this.data = data;
        }

        /**reads the packet on server to get the variables from the Byte Buffer*/
        @Override
        public void fromBytes(ByteBuf bbuf) {
            data= ByteBufUtils.readUTF8String(bbuf);
            onMessage(bbuf.readInt());
        }

        /**puts the variables into a Byte Buffer so they can be sent to server*/
        @Override
        public void toBytes(ByteBuf bbuf) {
            ByteBufUtils.writeUTF8String(bbuf, data);
            bbuf.writeInt(Minecraft.getMinecraft().thePlayer.getEntityId());
        }


        private void onMessage(int player) {
            int event=0;
            if(data.length()>2 && data.substring(0,2).equals("0:")){
                data = data.substring(2);
                event=1;
            }
            if(data.length()>2 && data.substring(0,2).equals("1:")){
                data = data.substring(2);
                event=2;
            }
            File f = new File(CommonProxy.configDirectory + "/TrainsInMotion/logging/" + data);
            if (f.exists()) {
                //if player wasin't looking at a train
                StringBuilder sb = new StringBuilder();
                if (!f.isDirectory()){
                    try {
                        if(event==0) {
                            sb.append("<");
                            sb.append(data);
                            sb.append(",");
                            sb.append(data.substring(0, data.indexOf("/") + 1));
                            sb.append(",");
                            String document = new String(Files.readAllBytes(Paths.get(CommonProxy.configDirectory + "/TrainsInMotion/logging/" + data)), "UTF-8");
                            sb.append("Delegate:,");
                            sb.append(document.substring(document.indexOf("<delegate>") + 10, document.indexOf("</delegate>")));
                            sb.append(",UUID:,");
                            sb.append(document.substring(document.indexOf("<uuid>") + 6, document.indexOf("</uuid>")).substring(0, 19));
                            sb.append(",");
                            sb.append(document.substring(document.indexOf("<uuid>") + 6, document.indexOf("</uuid>")).substring(19));
                            sb.append(",Last Known Position:,X:");
                            sb.append(document.substring(document.indexOf("<pos_x>") + 7, document.indexOf("</pos_x>")));
                            sb.append("- Y:");
                            sb.append(document.substring(document.indexOf("<pos_y>") + 7, document.indexOf("</pos_y>")));
                            sb.append("- Z:");
                            sb.append(document.substring(document.indexOf("<pos_z>") + 7, document.indexOf("</pos_z>")));
                            if (CommonUtil.stringContains(document, "<fuel>")) {
                                sb.append(",Fuel amount: ");
                                sb.append(document.substring(document.indexOf("<fuel>") + 6, document.indexOf("</fuel>")));
                            }
                            if (CommonUtil.stringContains(document,"<inventory>")) {
                                sb.append(",");
                                sb.append(document.substring(document.indexOf("<inventory>"), document.indexOf("</inventory>") + 12));
                            }
                        }
                        else if (event==1){
                            for (WorldServer world : DimensionManager.getWorlds()) {
                                if (world.getEntityByID(player) != null) {
                                    EntityPlayerMP p = (EntityPlayerMP) world.getEntityByID(player);
                                    List<ItemStack> items = ServerLogger.getItems(new String(Files.readAllBytes(Paths.get(DimensionManager.getCurrentSaveRootDirectory().getAbsolutePath() + "/traincraft/" + data)), "UTF-8"));
                                    for (ItemStack i : items){
                                        if (i.stackSize != 0 && i.getItem() != null)
                                        {
                                            EntityItem entityitem = new EntityItem(world, p.posX, p.posY + 3, p.posZ, i);
                                            entityitem.delayBeforeCanPickup = 120;
                                            if (p.captureDrops) {
                                                p.capturedDrops.add(entityitem);
                                            } else{
                                                world.spawnEntityInWorld(entityitem);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (event==2){
                            if (f.exists()) {
                                f.delete();
                            }
                        }
                    } catch (Exception e){}
                } else {
                    if(!data.equals("")) {
                        sb.append(",");
                    }
                    File[] folder = f.listFiles();
                    if (folder !=null) {
                        for (File file : folder) {
                            if (file != null) {
                                sb.append(data);
                                if(!data.equals("")) {
                                    sb.append("/");
                                }
                                sb.append(file.getName());
                                sb.append(",");
                            }
                        }
                    }
                }
                if(sb.toString().length()<5){
                    return;
                }
                for (WorldServer world : DimensionManager.getWorlds()) {
                    if (world.getEntityByID(player) != null) {
                        TrainsInMotion.keyChannel.sendTo(new PacketAdminBook(sb.toString()), (EntityPlayerMP) world.getEntityByID(player));
                        return;
                    }
                }
            }
        }
    }



    public static class PacketAdminBook implements IMessage{
        private String datacsv;
        public PacketAdminBook(){}

        public PacketAdminBook(String data) {
            this.datacsv = data;
        }
        /**reads the packet on server to get the variables from the Byte Buffer*/
        @Override
        public void fromBytes(ByteBuf bbuf) {
            TrainsInMotion.proxy.adminGui(ByteBufUtils.readUTF8String(bbuf));
        }
        /**puts the variables into a Byte Buffer so they can be sent to server*/
        @Override
        public void toBytes(ByteBuf bbuf) {
            ByteBufUtils.writeUTF8String(bbuf, datacsv);
        }
    }

}
