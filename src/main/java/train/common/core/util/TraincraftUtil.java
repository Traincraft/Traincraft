package train.common.core.util;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;


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

    private static final double radian = Math.PI / 180.0;
    public static void updateRider(EntityRollingStock transport, float p, float yaw, double distance, double yOffset, double zOffset) {

        double pitchRads = p * radian;
        double rotationCos1 =  Math.cos(Math.toRadians(yaw + 90));
        double rotationSin1 =  Math.sin(Math.toRadians(yaw + 90));
        double pitch =  (transport.posY + ((Math.tan(pitchRads) * yOffset) + transport.getMountedYOffset())
                + transport.riddenByEntity.getYOffset() + yOffset);
        double pitch1 =  (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (transport.posX + (rotationCos1 * zOffset) - (rotationSin1 * distance));
        double bogieZ1 = (transport.posZ + (rotationSin1 * zOffset) + (rotationCos1 * distance));
        // System.out.println(rotationCos1+" "+rotationSin1);
        if (p > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (p > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        } else {
            transport.riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
    }

}
