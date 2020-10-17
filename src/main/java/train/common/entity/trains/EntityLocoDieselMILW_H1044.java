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

public class EntityLocoDieselMILW_H1044 extends EntityTrainCore {

    public EntityLocoDieselMILW_H1044(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselMILW_H1044(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselMILW_H1044((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel MILW H10-44";}
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
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelMILW_H1044()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.06f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 180.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Orange.png","Orange", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Yellow.png","Yellow", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Grey.png","Grey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_LightBlue.png","LightBlue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/MILW_H1044_Green.png","Green", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{-3.999999994039536f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{-2.2f, 2.2f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1618;}
    @Override
    public float transportTopSpeed(){return 97;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
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