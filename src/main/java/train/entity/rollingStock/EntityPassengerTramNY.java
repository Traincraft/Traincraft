package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityPassengerTramNY extends GenericRailTransport {

    public EntityPassengerTramNY(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerTramNY(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerTramNY((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger Tram NY";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1986-2011";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//NOTE: this is actually from the PA5, but the design and materials are very similar
    public float weightKg(){return 29029.9f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelTramNY()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.63f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoTramNY.png","locoTramNY", "description.locoTramNY"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"locoTramNY";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 1),
                new ItemStack(TiMOres.ingotSteel, 1), null, new ItemStack(TiMItems.cabinSteel, 1),
                null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.9f,1.2f, 0.3f},{-0.7f,1.2f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.475f,2.175f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.25f, -1.25f};}



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