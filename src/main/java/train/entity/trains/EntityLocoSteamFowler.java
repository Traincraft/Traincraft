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

public class EntityLocoSteamFowler extends EntityTrainCore {

    public EntityLocoSteamFowler(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamFowler(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamFowler((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Fowler";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1924–1941";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 49532.3f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelFowler()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.35f, 0.65f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_Fowler.png","loco_Fowler", "description.loco_Fowler"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"loco_Fowler";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 3), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2,1.4f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.4f,2.4f,1.4f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.3f, -1.3f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 980;}
    @Override
    public float transportTractiveEffort(){return 24555;}
    @Override
    public float transportTopSpeed(){return 102;}
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