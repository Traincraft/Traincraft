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

public class EntityLocoDieselCD742 extends EntityTrainCore {

    public EntityLocoDieselCD742(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselCD742(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselCD742((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel CD742";}
    @Override
    public String transportcountry(){return "cezch";}
    @Override
    public String transportYear(){return "1973-1989";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 64000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelGP40()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.55f, -0.9f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, 0.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/cd742_Yellow.png","Yellow", "description.cd742.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/cd742_White.png","White", "description.cd742.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/cd742_Blue.png","Blue", "description.cd742.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/cd742_Orange.png","Orange", "description.cd742.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/cd742_LightBlue.png","LightBlue", "description.cd742.LightBlue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Yellow";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.smallDieselEngine, 4), new ItemStack(TiMItems.generator, 2)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1,1.4f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.6f,2.4f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.0f, -1.05f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1727;}
    @Override
    public float transportTopSpeed(){return 70;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{10000};}



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