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

public class EntityLocoSteamC41 extends EntityTrainCore {

    public EntityLocoSteamC41(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamC41(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamC41((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam C41";}
    @Override
    public String transportcountry(){return "us";}
    @Override//this source is hard to find, https://forums.auran.com/trainz/archive/index.php/t-45743.html
    public String transportYear(){return "1924-1927";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override//there's no way this is accurate, the stats are from the K-37 model.
    public float weightKg(){return 83420f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLocoC41()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.5f, 0.7f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoC41.png","locoC41", "description.locoC41"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"locoC41";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), 
                new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), 
                new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.coal, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.1f,1.5f, -0.3f},{2.1f,1.5f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5f,2.4f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.3f, -2f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 1484;}
    @Override
    public float transportTopSpeed(){return 120;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{4000, 800};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}