package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteam040VB extends EntityTrainCore {

    public EntityLocoSteam040VB(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteam040VB(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteam040VB((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam 040VB Chaloner";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1877-1950";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 4082f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelVB040()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.7f, worldObj==null?-0.4f:0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco040VB.png","loco040VB", "description.loco040VB"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"loco040VB";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 4), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), 
                null, new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.8f,1.4f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{worldObj==null?3:2.5f,2.6f,1.6f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.55f, -0.55f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 200;}
    @Override
    public float transportTopSpeed(){return 32;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{2500, 500};}



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