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

public class EntityLocoSteamMogulBlue extends EntityTrainCore {

    public EntityLocoSteamMogulBlue(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamMogulBlue(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamMogulBlue((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Mogul";}
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
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelLocoMogul()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.6f, -0.44f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 90.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/locoMogul_White.png","White", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{-1.8500000059604647f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{-1.1f, 1.1f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 500;}
    @Override
    public float transportTopSpeed(){return 65;}
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