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
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoDiesel44TonSwitcher extends EntityTrainCore {

    public EntityLocoDiesel44TonSwitcher(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDiesel44TonSwitcher(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDiesel44TonSwitcher((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "GE 44-ton Diesel switcher";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLoco44TonSwitcher()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.45f, 0.625f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_44tonswitcher.png","loco_44tonswitcher", "description.loco_44tonswitcher"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"loco_44tonswitcher";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), 
                null, null, new ItemStack(ItemIDs.steelcab.item, 2), 
                new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.1f,1.6f, 0.35f},{0.1f,1.6f, -0.35f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.1f,2.6f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.45f, -1.45f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 400;}
    @Override
    public float transportTopSpeed(){return 56;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{6850};}



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