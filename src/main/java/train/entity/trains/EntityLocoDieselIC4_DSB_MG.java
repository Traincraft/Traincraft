package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
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

public class EntityLocoDieselIC4_DSB_MG extends EntityTrainCore {

    public EntityLocoDieselIC4_DSB_MG(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselIC4_DSB_MG(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselIC4_DSB_MG((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel IC4 DSB MG";}
    @Override
    public String transportcountry(){return "denmark";}
    @Override
    public String transportYear(){return "2007";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 160027.4f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLocoDieselIC4_DSB_MG()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-2.65f, -0.94f, 0.05f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,90f,0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/IC4_DSB_MG_White.png","White", "description.IC4.DSB.MG.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/IC4_DSB_MG_Red.png","Red", "description.IC4.DSB.MG.Red"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"White";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return null;
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.0f,1.2f, 0f},{2f,1.2f, -0.25f},{-0.4f,1.2f, -0.25f},{-1.2f,1.2f, 0.25f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{8.6f,2.4f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{4.0f, -2.0f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 760;}
    @Override
    public float transportTopSpeed(){return 200;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{20000};}



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