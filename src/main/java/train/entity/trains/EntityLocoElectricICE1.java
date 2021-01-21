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

public class EntityLocoElectricICE1 extends EntityTrainCore {

    public EntityLocoElectricICE1(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricICE1(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricICE1((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Electric ICE 1";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1989-2008";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 849415f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelICE1()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{3.2f, 0f, -0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/ICE1_Engine.png","ICE1_Engine", "description.ICE1_Engine"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"ICE1_Engine";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 2),
                null, null, new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.transformer, 4), new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(Items.redstone, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.4f,1.1f, -0.2f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.8f,2.1f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.4f, -1.5f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 6539;}
    @Override
    public float transportTopSpeed(){return 280;}
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