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

    private static final double radian = (Math.PI / 180.0D);
    public static void updateRider(EntityRollingStock transport, float p, float yaw, double zOffset, double yOffset, double distance) {
        double pitchRads = transport.anglePitchClient * radian;
        float rotationCos1, rotationSin1;
        if(transport.side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(transport.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians(transport.serverRealRotation + 90));
            transport.anglePitchClient = transport.serverRealPitch*60;
        } else {
            rotationCos1 = (float) Math.cos(Math.toRadians(transport.renderYaw + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians(transport.renderYaw + 90));
        }
        float pitch = (float) (transport.posY + ((Math.tan(pitchRads) * distance) + transport.getMountedYOffset())
                + transport.riddenByEntity.getYOffset() + yOffset);
        // System.out.println(rotationCos1+" "+rotationSin1);
        if(transport.anglePitchClient>20 && rotationCos1 == 1){
            pitch-=pitchRads*1.2;
        }
        if(transport.anglePitchClient>20 && rotationSin1 == 1){
            pitch-=pitchRads*1.2;
        }


        double bogieX1 = transport.posX + (distance * rotationCos1) - (zOffset * rotationSin1);
        double bogieZ1 = transport.posZ +(distance * rotationSin1) + (zOffset * rotationCos1);

        if (pitchRads == 0.0) {
            transport.riddenByEntity.setPosition(bogieX1, (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset), bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }

    }

}
