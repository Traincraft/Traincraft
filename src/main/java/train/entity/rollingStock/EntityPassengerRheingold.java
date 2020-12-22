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

public class EntityPassengerRheingold extends GenericRailTransport {

    public EntityPassengerRheingold(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerRheingold(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerRheingold((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger Rheingold";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1962-1976";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//weight is fully unknown, many passenger rollingstock are listed around 20 to 30 tons, so this is just a guess,
    public float weightKg(){return 25000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelRheingoldPassenger()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.75f, 0f, 0.6f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_Blue.png","Blue", "description.Rheingold.passenger.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_Red.png","Red", "description.Rheingold.passenger.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_Green.png","Green", "description.Rheingold.passenger.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_LightBlue.png","LightBlue", "description.Rheingold.passenger.LightBlue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_Magenta.png","Magenta", "description.Rheingold.passenger.Magenta"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Rheingold_passenger_Lime.png","Lime", "description.Rheingold.passenger.Lime"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), 
                null, null, new ItemStack(ItemIDs.steelcab.item, 1), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{
            {-2.2f,1.2f, -0.1f},{-1.0f,1.2f, -0.1f},{-0.3f,1.2f, -0.1f},{0.9f,1.2f, -0.1f},{2.1f,1.2f, -0.1f}
    };}
    @Override
    public float[] getHitboxSize(){return new float[]{8.8f,2.2f,1.3f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.7f, -2.7f};}



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