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

public class EntityLocoSteamAlcoSC4 extends EntityTrainCore {

    public EntityLocoSteamAlcoSC4(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamAlcoSC4(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamAlcoSC4((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Alco SC4";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1910";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 121562.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelAlcoSC4()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.5f, 0.7f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/AlcoSC4.png","AlcoSC4", "description.AlcoSC4"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"AlcoSC4";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), 
                new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), 
                new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.coal, 1)        };
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
    public float transportMetricHorsePower(){return 800;}
    @Override
    public float transportTractiveEffort(){return 42000;}
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
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}