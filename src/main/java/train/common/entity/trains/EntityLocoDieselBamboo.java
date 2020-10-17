package train.common.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import train.client.render.models.*;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoDieselBamboo extends EntityTrainCore {

    public EntityLocoDieselBamboo(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselBamboo(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselBamboo((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Bamboo Flatcar Engine";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelBambooTrainEngine()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, 180.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Yellow.png","Yellow", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Magenta.png","Magenta", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Cyan.png","Cyan", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Pink.png","Pink", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_LightGrey.png","LightGrey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_White.png","White", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_LightBlue.png","LightBlue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Lime.png","Lime", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Purple.png","Purple", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Orange.png","Orange", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco_bamboo_Grey.png","Grey", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), 
                null, null, null, null, new ItemStack(ItemIDs.dieselengine.item, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{-1.8499999940395355f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{-1.0f, 1.0f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 30;}
    @Override
    public float transportTopSpeed(){return 20;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}