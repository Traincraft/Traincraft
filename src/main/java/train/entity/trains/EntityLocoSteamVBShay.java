package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteamVBShay extends EntityTrainCore {

    public EntityLocoSteamVBShay(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamVBShay(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamVBShay((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam VB Shay";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1878-1945";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 11793f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelVBShay()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.35f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/vbshay.png","vbshay", "description.vbshay"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"vbshay";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), 
                null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), 
                new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.5f,1.5f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.5f,2.7f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.1f, -2.1f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 250;}
    @Override
    public float transportTractiveEffort(){return 6050;}
    @Override
    public float transportTopSpeed(){return 40.2f;}
    @Override
    public float transportTopSpeedReverse(){return 24f;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{1514, 400};}



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