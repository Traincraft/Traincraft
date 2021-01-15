package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityLocoDieselKof_DB extends EntityTrainCore {

    public EntityLocoDieselKof_DB(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselKof_DB(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselKof_DB((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel KOF II DB";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1932";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 22048f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelKof()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.1f, 0.64f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoKof_DB_Red.png","Red", "description.locoKof.DB.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoKof_DB_Green.png","Green", "description.locoKof.DB.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoKof_DB_Yellow.png","Yellow", "description.locoKof.DB.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoKof_DB_Black.png","Black", "description.locoKof.DB.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoKof_DB_Blue.png","Blue", "description.locoKof.DB.Blue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 1), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 1),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.pneumaticTransmission, 1), new ItemStack(TiMItems.smallDieselEngine, 2), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1f,1.0f, 0.35f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{2.9f,1.9f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.5f, -0.65f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 750;}
    @Override
    public float transportTopSpeed(){return 45;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{5000};}



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