package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class EntityFreightIceWagon extends GenericRailTransport {

    public EntityFreightIceWagon(World worldObj) {
        super(worldObj);
    }

    public EntityFreightIceWagon(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreightIceWagon((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Ice Wagon";}
    @Override
    public String transportcountry(){return "undefined";}
    @Override
    public String transportYear(){return "2019";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 4;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override//cart is known fictional, so we're just going off original stats.
    public float weightKg(){return 9071.85f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelIceWagon()};}
    @Override
    public float[][] modelOffsets(){return worldObj==null?new float[][]{{0.0f, -0.5f, 0.0f}}:new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/icewagon.png","icewagon", "description.icewagon"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"icewagon";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), 
                new ItemStack(Items.iron_ingot, 2), null, null, null, null, new ItemStack(Items.snowball, 9)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return worldObj==null?new float[]{2f,1.4f,1.1f}:new float[]{1.6f,1.4f,1.1f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.35f, -0.35f};}



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