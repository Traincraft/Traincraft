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

public class EntityLocoSteam262T extends EntityTrainCore {

    public EntityLocoSteam262T(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteam262T(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteam262T((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam 262T Class V1";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1930-1939";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 57965f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelT262()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.6f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/262t.png","262t", "description.262t"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"262t";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelIron, 4), new ItemStack(TiMItems.frameWood, 1),
                null, new ItemStack(TiMItems.chimneyIron, 1), new ItemStack(TiMItems.cabinIron, 1),
                new ItemStack(TiMItems.boilerIron, 1), new ItemStack(TiMItems.fireboxSteel, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.7f,1.4f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.7f,2.6f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.675f, -1.825f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 300;}
    @Override
    public float transportTopSpeed(){return 70;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{4250, 850};}



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