package train.common.adminbook;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;

import java.io.File;
import java.nio.charset.StandardCharsets;
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
        this.setCreativeTab(Traincraft.TAB);
        this.setRegistryName(new ResourceLocation(Traincraft.MOD_ID, "adminbook"));
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
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        try {
            if (world.isRemote) {
                return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
            } else if (!player.canUseCommand(2, "tc.admin")) {
                return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
            }

            if (new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/").exists()) {
                //if player wasin't looking at a train
                StringBuilder sb = new StringBuilder();
                File[] list = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/").listFiles();
                if (list!=null) {
                    Arrays.sort(list, Comparator.comparing(d -> d.getName().toLowerCase()));
                    for (File f : list) {
                        if (f.isDirectory() && f.list() != null && f.list().length > 0) {
                            sb.append(f.getName());
                            sb.append(",");
                        }
                    }
                    //wrong player or something....?
                    Traincraft.keyChannel.sendTo(new PacketAdminBook(1, -1, sb.toString()), (EntityPlayerMP) player);
                }
                return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
            } else {
                return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return super.onItemRightClick(world, player, hand);
    }
    
    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/item_book_blue");
    }*/
    
    public static class PacketAdminBookClient implements IMessage {
    
        private String id;
        private int player;
    
        public PacketAdminBookClient() {
        
        }
    
        public PacketAdminBookClient(String data, int playerID) {
            this.id = data;
            this.player = playerID;
        }
    
        /**
         * reads the packet on server to get the variables from the Byte Buffer
         */
        @Override
        public void fromBytes(ByteBuf bbuf) {
            String data = new String(bbuf.array(), StandardCharsets.UTF_8);
            if(!data.equals("")){
                player = Integer.parseInt(data.substring(data.indexOf(":") + 1, data.indexOf(",")));
                id = data.substring(data.indexOf(",") + 1, data.length());
            }
        }
    
        /**
         * puts the variables into a Byte Buffer so they can be sent to server
         */
        @Override
        public void toBytes(ByteBuf bbuf) {
            bbuf.writeBytes((":" + player + "," + id).getBytes(StandardCharsets.UTF_8));
        }
    
        public static class Handler implements IMessageHandler<PacketAdminBookClient, IMessage> {
        
            @Override
            public IMessage onMessage(PacketAdminBookClient message, MessageContext context) {
                int event = 0;
                if(message.id.length() > 2 && message.id.startsWith("0:")){
                    message.id = message.id.substring(2);
                    event = 1;
                }
                if(message.id.length() > 2 && message.id.startsWith("1:")){
                    message.id = message.id.substring(2);
                    event = 2;
                }
                File f = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id);
                if(f.exists()){
                    //if player wasin't looking at a train
                    StringBuilder sb = new StringBuilder();
                    if(!f.isDirectory()){
                        try{
                            switch(event){
                                case 0:
                                    sb.append("<");
                                    sb.append(message.id);
                                    sb.append(",");
                                    sb.append(message.id, 0, message.id.indexOf("/") + 1);
                                    sb.append(",");
                                    String document = new String(Files.readAllBytes(Paths.get(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id)), StandardCharsets.UTF_8);
                                    sb.append("Delegate:,");
                                    sb.append(document, document.indexOf("<delegate>") + 10, document.indexOf("</delegate>"));
                                    sb.append(",UUID:,");
                                    sb.append(document.substring(document.indexOf("<uuid>") + 6, document.indexOf("</uuid>")), 0, 19);
                                    sb.append(",");
                                    sb.append(document.substring(document.indexOf("<uuid>") + 6, document.indexOf("</uuid>")).substring(19));
                                    sb.append(",Last Known Position:,X:");
                                    sb.append(document, document.indexOf("<pos_x>") + 7, document.indexOf("</pos_x>"));
                                    sb.append("- Y:");
                                    sb.append(document, document.indexOf("<pos_y>") + 7, document.indexOf("</pos_y>"));
                                    sb.append("- Z:");
                                    sb.append(document, document.indexOf("<pos_z>") + 7, document.indexOf("</pos_z>"));
                                    if(document.contains("<fuel>")){
                                        sb.append(",Fuel amount: ");
                                        sb.append(document, document.indexOf("<fuel>") + 6, document.indexOf("</fuel>"));
                                    }
                                    if(document.contains("<inventory>")){
                                        sb.append(",");
                                        sb.append(document, document.indexOf("<inventory>"), document.indexOf("</inventory>") + 12);
                                    }
                                    break;
                                case 1:
                                    for(WorldServer world : DimensionManager.getWorlds()){
                                        if(world.getEntityByID(message.player) != null){
                                            EntityPlayerMP p = (EntityPlayerMP) world.getEntityByID(message.player);
                                            // todo wtf is happening here
                                            List<ItemStack> items = ServerLogger.getItems(new String(Files.readAllBytes(Paths.get(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + message.id)), StandardCharsets.UTF_8));
                                            for(ItemStack i : items){
                                                if(!i.isEmpty() && i.getCount() > 0){
                                                    EntityItem entityitem = new EntityItem(world, p.posX, p.posY + 3, p.posZ, i);
                                                    entityitem.setPickupDelay(120);
                                                    if(p.captureDrops){
                                                        p.capturedDrops.add(entityitem);
                                                    } else {
                                                        world.spawnEntity(entityitem);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    if(f.exists()){
                                        f.delete();
                                    }
                                    break;
                            }
                        }catch(Exception ignored){
                        }
                    } else {
                        if(!message.id.equals("")){
                            sb.append(",");
                        }
                        File[] folder = f.listFiles();
                        if(folder != null){
                            for(File file : folder){
                                if(file != null){
                                    sb.append(message.id);
                                    if(!message.id.equals("")){
                                        sb.append("/");
                                    }
                                    sb.append(file.getName());
                                    sb.append(",");
                                }
                            }
                        }
                    }
                    if(sb.toString().length() < 5){
                        return null;
                    }
                    for(WorldServer world : DimensionManager.getWorlds()){
                        if(world.getEntityByID(message.player) != null){
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
            String data = new String(bbuf.array(), StandardCharsets.UTF_8);
            if (!data.equals("")) {
                key = Integer.parseInt(data.substring(data.indexOf(":")+1, data.indexOf(",")));
                data = data.substring(data.indexOf(",") + 1);
                ID = Integer.parseInt(data.substring(0, data.indexOf(",")));
                datacsv = data.substring(data.indexOf(",") + 1);
            }
        }
        
        /**puts the variables into a Byte Buffer so they can be sent to server*/
        @Override
        public void toBytes(ByteBuf bbuf) {
            String sb = ":" +
                key +
                "," +
                ID +
                "," +
                datacsv;
            bbuf.writeBytes(sb.getBytes(StandardCharsets.UTF_8));
    
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
