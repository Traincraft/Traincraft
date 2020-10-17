package train.common.entity.rollingStock;

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

public class EntityFreightWellcar extends GenericRailTransport {

    public EntityFreightWellcar(World worldObj) {
        super(worldObj);
    }

    public EntityFreightWellcar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreightWellcar((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Well Car";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelWellcar()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 180.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Grey.png","Grey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Cyan.png","Cyan", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Lime.png","Lime", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_LightBlue.png","LightBlue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_LightGrey.png","LightGrey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Magenta.png","Magenta", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Orange.png","Orange", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Pink.png","Pink", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Purple.png","Purple", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_White.png","White", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/wellcar_Yellow.png","Yellow", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steel.item, 5), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(ItemIDs.steel.item, 2), null, null, null, null, new ItemStack(Blocks.chest, 2)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{0.8999999761581421f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.0f, -0.0f};}



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