package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class EntityPassengerDBOriental extends GenericRailTransport {

    public EntityPassengerDBOriental(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerDBOriental(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerDBOriental((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger DB oriental";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1966-1974";}
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
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPassenger_DB_oriental()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.62f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, -180.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passenger_DB_oriental_Yellow.png","Yellow", "description.passenger.DB.oriental.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passenger_DB_oriental_Blue.png","Blue", "description.passenger.DB.oriental.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/passenger_DB_oriental_White.png","White", "description.passenger.DB.oriental.White"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Yellow";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 6), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), 
                new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f},{-1,1.2f, 0f},{1,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.5f,2.3f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.1f, -1.1f};}



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