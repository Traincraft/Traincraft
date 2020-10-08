package train.common.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;
import java.util.UUID;

/**
 * NOTE: this class was made short and to the point, for documentation on the features
 * @see train.common.entity.trains.EntityLocoSteam4_4_0
 */

public class EntityBoxCartUS extends GenericRailTransport {
    public static final Item thisItem = new ItemTransport(new EntityBoxCartUS(null), Info.modID, Traincraft.tcTab);


    public EntityBoxCartUS(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBoxCartUS(World world) {
        super(world);
    }

    @Override
    public void registerSkins() {
        String description = "Fictional boxcar, likely designed after early 1800's US rollingstock.";
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Brown.png",
                "Brown", description);


        //todo: change names to match skin design rather than color.
        //todo: change skin descriptions to note contributor that created it (where applicable)
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Black.png",
                "Black", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Blue.png",
                "Blue", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Cyan.png",
                "Cyan", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Green.png",
                "Green", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Grey.png",
                "Grey", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_LightBlue.png",
                "LightBlue", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_LightGrey.png",
                "LightGrey", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Lime.png",
                "Lime", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Magenta.png",
                "Magenta", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Orange.png",
                "Orange", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Pink.png",
                "Pink", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Purple.png",
                "Purple", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Red.png",
                "Red", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_White.png",
                "White", description);
        SkinRegistry.addSkin(this.getClass(), TrainsInMotion.MODID, "textures/trains/boxCartUS_Yellow.png",
                "Yellow", description);
    }


    @Override
    public String getDefaultSkin(){return "tc:Brown";}
    @Override
    public String transportName(){return "Freight Box Cart US";}
    @Override
    public String transportcountry(){return "TrainCraft";}
    @Override
    public String transportYear(){return "2007-ish";}
    @Override
    public String transportFuelType(){return "Boxcar";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public String[] additionalItemText(){return new String[]{"Cargo type: any"};}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.7f, -0.7f};}
    @Override
    public Item getItem(){return thisItem;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }

    //NOTE: the length can be taken from the getOptimalDistance() method in the original classes.
    @Override
    public float[] getHitboxSize() {
        return new float[]{1.65f,2.1f,1.1f};
    }

    @Override
    public float weightKg(){return 7257f;}//taken from csa-railroads documentation on american civil war boxcars

    //again as noted in Steam4_4_0, all ore directory support is handled automatically,
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                new ItemStack(ItemIDs.steelframe.item, 2),new ItemStack(Blocks.chest, 2) , new ItemStack(ItemIDs.steel.item, 2),
                new ItemStack(ItemIDs.bogie.item, 1),new ItemStack(ItemIDs.steel.item, 5),new ItemStack(ItemIDs.bogie.item, 1)
        };
    }


}
