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

public class EntityLocoSteamCoranationClass extends EntityTrainCore {

    public EntityLocoSteamCoranationClass(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamCoranationClass(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamCoranationClass((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Coranation Class";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1938";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 109834.6f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelCoranationClass()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.8f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/CoranationClass.png","CoranationClass", "description.CoranationClass"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"CoranationClass";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 2), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{3.1f,1.5f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.8f,2.6f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.8f, -2.5f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 1619;}
    @Override
    public float transportTopSpeed(){return 183;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{10000, 2000};}



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