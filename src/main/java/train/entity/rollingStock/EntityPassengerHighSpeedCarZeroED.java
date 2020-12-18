package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityPassengerHighSpeedCarZeroED extends GenericRailTransport {

    public EntityPassengerHighSpeedCarZeroED(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerHighSpeedCarZeroED(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerHighSpeedCarZeroED((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger High Speed Zero ED";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//weight is fully unknown, many underground passenger rollingstock are listed around 25 to 40 tons, so this is just a guess,
    public float weightKg(){return 35000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPassengerHighSpeedCarZeroED()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.61f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passengerHighSpeedCarZeroED.png","passengerHighSpeedCarZeroED", "description.passengerHighSpeedCarZeroED"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"passengerHighSpeedCarZeroED";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), null, new ItemStack(ItemIDs.steelcab.item, 1), 
                null, new ItemStack(ItemIDs.seats.item, 5), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.4f,2.3f,1.4f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.2f, -1.3f};}



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