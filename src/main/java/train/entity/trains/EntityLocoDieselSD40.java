package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoDieselSD40 extends EntityTrainCore {

    public EntityLocoDieselSD40(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselSD40(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselSD40((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel SD40";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1972-1989";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 166922f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelSD40()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, 0.67f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180, 90.0f, 0}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Red.png","Red", "description.locoSD40.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Yellow.png","Yellow", "description.locoSD40.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Black.png","Black", "description.locoSD40.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Green.png","Green", "description.locoSD40.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Orange.png","Orange", "description.locoSD40.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Magenta.png","Magenta", "description.locoSD40.Magenta"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoSD40_Blue.png","Blue", "description.locoSD40.Blue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1,1.4f, 0.2f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.7f,2.3f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.3f, -1.3f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 3041.61f;}
    @Override
    public float transportTopSpeed(){return 105;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override//fuel storage is 4000 us gallons, which translates to roughly 15.14 cubic meters of fluid
    public int[] getTankCapacity(){return new int[]{15140};}



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