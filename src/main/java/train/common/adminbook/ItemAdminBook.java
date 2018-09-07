package train.common.adminbook;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import train.common.Traincraft;
import train.common.library.Info;

import java.io.File;
import java.io.UnsupportedEncodingException;
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
public class ItemAdminBook extends Item {

    public ItemAdminBook(){
        setCreativeTab(Traincraft.tcTab);
        setUnlocalizedName("adminbook");
    }

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
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        try {
            if (world.isRemote) {
                return stack;
            } else if (!player.canCommandSenderUseCommand(2, "")) {
                return stack;
            }

            if (new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/").exists()) {
                //if player wasin't looking at a train
                StringBuilder sb = new StringBuilder();
                File[] list = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/").listFiles();
                if (list!=null) {
                    Arrays.sort(list, new compareFile());
                    for (File f : list) {
                        if (f.isDirectory() && f.list() != null && f.list().length > 0) {
                            sb.append(f.getName());
                            sb.append(",");
                        }
                    }
                    //wrong player or something....?
                    Traincraft.keyChannel.sendTo(new PacketAdminBook(1, -1, sb.toString()), (EntityPlayerMP) player);
                }
                return stack;
            } else {
                return stack;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return super.onItemRightClick(stack, world, player);
    }


    class compareFile implements Comparator<File> {
        // Overriding the compare method to sort the age
        public int compare(File d, File d1) {
            return d.getName().toLowerCase().compareTo(d1.getName().toLowerCase());
        }
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/item_book_blue");
    }



    public static class PacketAdminBookClient implements IMessage {
        private String id;
        private int player;

        public PacketAdminBookClient() {

        }

        public PacketAdminBookClient(String data, int playerID) {
            this.id = data;
            this.player = playerID;
        }

        /**reads the packet on server to get the variables from the Byte Buffer*/
        @Override
        public void fromBytes(ByteBuf bbuf) {
            try {
                String data = new String(bbuf.array(), "UTF-8");
                if (!data.equals("")) {
                    player = Integer.parseInt(data.substring(data.indexOf(":") + 1, data.indexOf(",")));
                    id = data.substring(data.indexOf(",")+1, data.length());
                }
            } catch (UnsupportedEncodingException e){

            }
        }
        /**puts the variables into a Byte Buffer so they can be sent to server*/
        @Override
        public void toBytes(ByteBuf bbuf) {
            try{
                bbuf.writeBytes((":" + player +"," + id).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e){

            }
        }
        public static class Handler implements IMessageHandler<PacketAdminBookClient, IMessage> {
            @Override
            public IMessage onMessage(PacketAdminBookClient message, MessageContext context) {
                int event=0;
                if(message.id.length()>2 && message.id.substring(0,2).equals("0:")){
                    message.id = message.id.substring(2, message.id.length());
                    event=1;
                }
                if(message.id.length()>2 && message.id.substring(0,2).equals("1:")){
                    message.id = message.id.substring(2, message.id.length());
                    event=2;
                }
                File f = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id);
                if (f.exists()) {
                    //if player wasin't looking at a train
                    StringBuilder sb = new StringBuilder();
                    if (!f.isDirectory()){
                        try {
                            if(event==0) {
                                sb.append("<");
                                sb.append(message.id);
                                sb.append(",");
                                sb.append(message.id.substring(0, message.id.indexOf("/") + 1));
                                sb.append(",");
                                String document = new String(Files.readAllBytes(Paths.get(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id)), "UTF-8");
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
                                if (document.contains("<fuel>")) {
                                    sb.append(",Fuel amount: ");
                                    sb.append(document.substring(document.indexOf("<fuel>") + 6, document.indexOf("</fuel>")));
                                }
                                if (document.contains("<inventory>")) {
                                    sb.append(",");
                                    sb.append(document.substring(document.indexOf("<inventory>"), document.indexOf("</inventory>") + 12));
                                }
                            }
                            else if (event==1){
                                for (WorldServer world : DimensionManager.getWorlds()) {
                                    if (world.getEntityByID(message.player) != null) {
                                        EntityPlayerMP p = (EntityPlayerMP) world.getEntityByID(message.player);
                                        List<ItemStack> items = ServerLogger.getItems(new String(Files.readAllBytes(Paths.get(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id)), "UTF-8"));
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
                        if(!message.id.equals("")) {
                            sb.append(",");
                        }
                        File[] folder = f.listFiles();
                        if (folder !=null) {
                            for (File file : folder) {
                                if (file != null) {
                                    sb.append(message.id);
                                    if(!message.id.equals("")) {
                                        sb.append("/");
                                    }
                                    sb.append(file.getName());
                                    sb.append(",");
                                }
                            }
                        }
                    }
                    if(sb.toString().length()<5){
                        return null;
                    }
                    for (WorldServer world : DimensionManager.getWorlds()) {
                        if (world.getEntityByID(message.player) != null) {
                            Traincraft.keyChannel.sendTo(new PacketAdminBook(1, -1, sb.toString()), (EntityPlayerMP) world.getEntityByID(message.player));
                            return null;
                        }
                    }
                }
                return null;
            }
        }

    }



    public static class PacketAdminBook implements IMessage {


        /**the key to define what function to use*/
        private int key;
        private int ID;
        private String datacsv;

        public PacketAdminBook(){

        }

        public PacketAdminBook(int key, int ID, String data) {
            this.key = key;
            this.ID = ID;
            this.datacsv = data;
        }
        /**reads the packet on server to get the variables from the Byte Buffer*/
        @Override
        public void fromBytes(ByteBuf bbuf) {
            try {
                String data = new String(bbuf.array(), "UTF-8");
                if (!data.equals("")) {
                    key = Integer.parseInt(data.substring(data.indexOf(":")+1, data.indexOf(",")));
                    data = data.substring(data.indexOf(",") + 1, data.length());
                    ID = Integer.parseInt(data.substring(0, data.indexOf(",")));
                    datacsv = data.substring(data.indexOf(",") + 1, data.length());
                }
            } catch (UnsupportedEncodingException e){

            }
        }
        /**puts the variables into a Byte Buffer so they can be sent to server*/
        @Override
        public void toBytes(ByteBuf bbuf) {
            try{
                StringBuilder sb=new StringBuilder();
                sb.append(":");
                sb.append(key);
                sb.append(",");
                sb.append(ID);
                sb.append(",");
                sb.append(datacsv);
                bbuf.writeBytes(sb.toString().getBytes("UTF-8"));

            } catch (UnsupportedEncodingException e){

            }
        }


        public static class Handler implements IMessageHandler<PacketAdminBook, IMessage> {
            @Override
            public IMessage onMessage(PacketAdminBook message, MessageContext context) {
                Traincraft.proxy.openadmingui(message.datacsv);

                return null;
            }

        }
    }

}
