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

public class EntityLocoDieselShunter extends EntityTrainCore {

    public EntityLocoDieselShunter(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselShunter(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselShunter((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override// this is the Victorian Railways F class, but i wanted to try and keep the old name to prevent confusion
    public String transportName(){return "Loco F Class Diesel Shunter";}
    @Override
    public String transportcountry(){return "australia";}
    @Override
    public String transportYear(){return "1951-1953";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 51000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelShunter()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.62f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/shunter_Blue.png","Blue", "description.shunter.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/shunter_Green.png","Green", "description.shunter.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/shunter_Red.png","Red", "description.shunter.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/shunter_Black.png","Black", "description.shunter.Black"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 1), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.pneumaticTransmission, 1), new ItemStack(TiMItems.smallDieselEngine, 3), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.4f,1.3f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.7f,2.3f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.85f, -0.8f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 354;}
    @Override
    public float transportTopSpeed(){return 32;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}



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