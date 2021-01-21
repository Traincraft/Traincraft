package ebf.tim.items;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.*;

public class ItemCraftGuide extends Item {

    public void init(){
        GenericRailTransport itm;
        String key;
        for(Class c:itemEntries){
            try {
                itm = ((GenericRailTransport)c.getConstructor(UUID.class, World.class, double.class, double.class, double.class).newInstance(null, null,0,0,0));
            } catch (Exception e){
                System.out.println(c.getName() +" failed at class cast for recipe book");
                e.printStackTrace();
                continue;
            }
            key=itm.getItem().delegate.name().split(":")[0];
            if(!processedTransports.containsKey(key)){
                processedTransports.put(key,new ArrayList<GenericRailTransport>());
                processedTransports.get(key).add(itm);
            } else {
                processedTransports.get(key).add(itm);
            }
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if(world.isRemote){
            player.openGui(TrainsInMotion.MODID, -1, world,0,0,0);
        }
        return stack;
    }

    //modid, then info page
    public Map<String, List<GenericRailTransport>> processedTransports = new HashMap<>();
    public List<String> indexPages = new ArrayList<>();

    public static List<Class> itemEntries = new ArrayList<>();



}
