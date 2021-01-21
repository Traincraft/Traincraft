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

public class EntityLocoElectricHighSpeedZeroED extends EntityTrainCore {

    public EntityLocoElectricHighSpeedZeroED(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricHighSpeedZeroED(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricHighSpeedZeroED((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Electric High Speed ZeroED";}
    @Override
    public String transportcountry(){return null;}
    @Override
    public String transportYear(){return null;}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 10000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLocoHighSpeedZeroED()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, 0.64f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoHighSpeedZeroED.png","locoHighSpeedZeroED", "description.locoHighSpeedZeroED"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"locoHighSpeedZeroED";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 1),
                new ItemStack(TiMOres.ingotSteel, 1), null, new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.transformer, 2), new ItemStack(TiMItems.smallElectricEngine, 2), new ItemStack(Items.redstone, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-0.5f,1.5f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.5f,2.3f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.3f, -1.325f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 700;}
    @Override
    public float transportTopSpeed(){return 237;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    public int[] getTankCapacity(){return new int[]{2250};}



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
