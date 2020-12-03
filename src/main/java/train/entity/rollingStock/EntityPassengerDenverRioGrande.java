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

public class EntityPassengerDenverRioGrande extends GenericRailTransport {

    public EntityPassengerDenverRioGrande(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerDenverRioGrande(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerDenverRioGrande((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger Denver Rio Grande";}
    @Override
    public String transportcountry(){return "us";}
    @Override//probably wrong, this is actually taken from:
    // https://www.historycolorado.org/sites/default/files/media/documents/2017/5ah3006.pdf
    public String transportYear(){return "1914-1960";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//probably wrong, this is actually taken:
    // https://www.historycolorado.org/sites/default/files/media/documents/2017/5ah3006.pdf
    public float weightKg(){return 58967f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelDRGPassenger()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_passenger_Yellow.png","Yellow", "description.drg.passenger.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_passenger_Red.png","Red", "description.drg.passenger.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_passenger_Green.png","Green", "description.drg.passenger.Green"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Yellow";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 3), 
                null, null, new ItemStack(ItemIDs.woodenCab.item, 3), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.2f,1.5f, 0f},{-2.2f,1.5f, 0f},{-1f,1.5f, 0f},{1.2f,1.5f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.1f,2.6f,1.4f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.1f, -2.1f};}



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