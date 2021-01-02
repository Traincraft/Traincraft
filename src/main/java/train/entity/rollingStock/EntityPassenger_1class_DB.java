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

public class EntityPassenger_1class_DB extends GenericRailTransport {

    public EntityPassenger_1class_DB(World worldObj) {
        super(worldObj);
    }

    public EntityPassenger_1class_DB(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassenger_1class_DB((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger 1Class DB";}
    @Override
    public String transportcountry(){return "germany";}
    @Override//this may be incorrect, the only documentation i found was for a
    //class 3 German Federal Railways passenger car, this is a class 1.
    public String transportYear(){return "1928 - 1938";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//this is a VERY rough guess, no documentation could be found.
    public float weightKg(){return 13000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPassenger_1class_DB()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.64f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passenger_1class_DB.png","passenger_1class_DB", "description.passenger_1class_DB"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"passenger_1class_DB";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), null, new ItemStack(ItemIDs.steelcab.item, 1), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.9f,1.2f, -0.3f},{0,1.2f, -0.25f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.8f,2.2f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.9f, -0.85f};}



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