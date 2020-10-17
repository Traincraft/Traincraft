package train.common.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import train.client.render.models.*;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteamSmall extends EntityTrainCore {

    public EntityLocoSteamSmall(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamSmall(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamSmall((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Small";}
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
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelLoco3()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.99f, -0.5f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, -90.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco3_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco3_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco3_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco3_Yellow.png","Yellow", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/loco3_Black.png","Black", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), 
                new ItemStack(Items.stick, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), 
                new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Blocks.torch, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{-1.5999999985098838f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{-0.85f, 0.85f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 250;}
    @Override
    public float transportTopSpeed(){return 45;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{5000, 1000};}



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