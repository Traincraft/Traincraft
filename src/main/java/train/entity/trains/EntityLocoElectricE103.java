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

public class EntityLocoElectricE103 extends EntityTrainCore {

    public EntityLocoElectricE103(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricE103(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricE103((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Electric E103";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1970";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 113797f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelE103()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.25f, 0.05f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/E103_Red.png","Red", "description.E103.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/E103_Blue.png","Blue", "description.E103.Blue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), 
                new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(ItemIDs.transformer.item, 2), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.2f,1.3f, 0.2f},{-2.2f,1.3f, -0.2f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.1f,2.2f,1.5f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.55f, -1.45f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 2806;}
    @Override
    public float transportTopSpeed(){return 200;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}



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