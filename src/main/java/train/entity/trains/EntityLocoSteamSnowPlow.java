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

public class EntityLocoSteamSnowPlow extends EntityTrainCore {

    public EntityLocoSteamSnowPlow(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamSnowPlow(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamSnowPlow((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Snow Plow";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1834-1884";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override//it's a small steam powered rotary engine in a small boxcar, i added the weight of the US boxcar and the adler, close enough
    public float weightKg(){return 122467f+11400f;}

    public String[] additionalItemText(){return new String[]{"Historically this was not self powered"};}
    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelSnowPlow()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.05f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        //more useful information may be found at https://www.midcontinent.org/equipment-roster/service-equipment/oregon-short-line-762/
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/train_snowplow.png","train_snowplow", "description.train_snowplow"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"train_snowplow";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelIron, 2), new ItemStack(TiMItems.frameWood, 4),
                null, new ItemStack(TiMItems.chimneyIron, 1), new ItemStack(TiMItems.cabinWood, 1),
                new ItemStack(TiMItems.boilerIron, 1), new ItemStack(TiMItems.fireboxIron, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.15f,2.6f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.5f, -1.4f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam, snow plow";}
    @Override
    public float transportMetricHorsePower(){return 200;}
    @Override
    public float transportTopSpeed(){return 20;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{6850};}



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