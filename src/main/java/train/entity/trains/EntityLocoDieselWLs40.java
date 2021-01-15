package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
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

public class EntityLocoDieselWLs40 extends EntityTrainCore {

    public EntityLocoDieselWLs40(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselWLs40(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselWLs40((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco WLs40";}
    @Override
    public String transportcountry(){return "poland";}
    @Override
    public String transportYear(){return "1948-1993";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 10000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelWLs40()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.4f, 0.05f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/wls40.png","wls40", "description.wls40"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"wls40";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 1), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                null, null, new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.pneumaticTransmission, 1), new ItemStack(TiMItems.smallDieselEngine, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.4f,1.4f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.1f,2.4f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.4f, -0.65f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 60;}
    @Override
    public float transportTopSpeed(){return 17;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}



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