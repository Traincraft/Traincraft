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

public class EntityLocoElectricClass85 extends EntityTrainCore {

    public EntityLocoElectricClass85(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricClass85(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricClass85((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Electric Class 85";}
    @Override
    public String transportcountry(){return "britain";}
    @Override
    public String transportYear(){return "1961-1992";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 80775.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelClass85()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.45f, -0.45f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, -90.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Class85.png","Class85", "description.Class85"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Class85";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 1), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.transformer, 2), new ItemStack(TiMItems.smallElectricEngine, 2), new ItemStack(Items.redstone, 2)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.3f,1.3f, 0f},{2.3f,1.3f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.05f,2.3f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.7f, -1.7f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 1997;}
    @Override
    public float transportTopSpeed(){return 160;}
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