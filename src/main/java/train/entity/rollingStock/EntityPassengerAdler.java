package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class EntityPassengerAdler extends GenericRailTransport {

    public EntityPassengerAdler(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerAdler(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerAdler((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger Adler";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1835";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//this is kinda sketchy, it's documented:
    // During a trial run the adler hauled one railway wagon with a payload of 8,000 German pounds
    //but no weight of the third or second class passenger cars was documented, so we're assuming the payload is a similar weight.
    public float weightKg(){return 4480.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPassengerAdler()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.05f, worldObj==null?-1.2f:-0.85f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, -90.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passengerAdler.png","passengerAdler", "description.passengerAdler"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"passengerAdler";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Items.iron_ingot, 1), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), 
                new ItemStack(Items.iron_ingot, 1), null, new ItemStack(ItemIDs.woodenCab.item, 1), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.1f,0.9f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{worldObj==null?2.6f:2.2f,1.6f,1.0f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.375f, -0.325f};}



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