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

public class EntityLocoSteamClimax extends EntityTrainCore {

    public EntityLocoSteamClimax(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamClimax(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamClimax((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Climax";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override//weight was taken from this document as noted under the Class A: https://www.climaxlocomotives.com/history/
    public float weightKg(){return 2993.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLocoClimax()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_climax.png","loco_climax", "description.loco_climax"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"loco_climax";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 1), 
                null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), 
                new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1,1.325f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.8f,2.4f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.9f, -1.875f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 250;}
    @Override
    public float transportTopSpeed(){return 45;}
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