package train.common.core.util;

import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.AbstractTrains;


public class TraincraftUtil{

    public static Item getItemFromName(String name){
        if (Item.itemRegistry.containsKey(name)){
            return (Item) Item.itemRegistry.getObject(name);
        } else {
            return null;
        }
    }

    public static ItemStack getItemFromUnlocalizedName(String itemName, int meta){
        Item item = getItemFromName(itemName);
        if(item != null){
            return new ItemStack(item, 1, meta);
        }
        return null;
    }
    
    public static boolean itemStackMatches(ItemStack item1, ItemStack item2){
    	return (item1.getItem() == item2.getItem()) && 
    			(item1.getItemDamage() == item2.getItemDamage() 
    				|| item1.getItemDamage() == OreDictionary.WILDCARD_VALUE
    				|| item2.getItemDamage() == OreDictionary.WILDCARD_VALUE);
    }

    public static boolean isRailBlockAt(World world, int x, int y, int z){
        return world.getBlock(x,y,z) instanceof BlockRailBase;
    }

    private static final float radianF = (float) Math.PI / 180.0f;
    public static void updateRider(Entity rider, AbstractTrains transport, float pitch, float yaw, double xOffset, double yOffset, double zOffset) {
        double cos;
        double sin;
        double x=0,y=0,z=0;
        //pitch
        if (pitch != 0.0) {
            pitch *= radianF;
            cos = MathHelper.cos(pitch);
            sin = MathHelper.sin(pitch);

            x = (xOffset * cos);
            y = (xOffset * sin);
        }
        //yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            cos = MathHelper.cos(yaw);
            sin = MathHelper.sin(yaw);

            x = (xOffset * cos) - (zOffset * sin);
            z = (xOffset * sin) + (zOffset * cos);
        }
        rider.setPosition(transport.posX + x, transport.posY + rider.getMountedYOffset() + transport.getMountedYOffset()+yOffset, transport.posZ+z);
    }
}
