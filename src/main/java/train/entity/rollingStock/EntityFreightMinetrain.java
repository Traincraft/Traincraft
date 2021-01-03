package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class EntityFreightMinetrain extends GenericRailTransport {

    public EntityFreightMinetrain(World worldObj) {
        super(worldObj);
    }

    public EntityFreightMinetrain(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreightMinetrain((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Minecart Yellow";}
    @Override
    public String transportcountry(){return null;}
    @Override
    public String transportYear(){return null;}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 2;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override//the average minecart weighs anywhere from 500lb to 1500lb, considering this one is a bit larger im guessing around 1400?
    public float weightKg(){return 625f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelMinetrain()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, worldObj==null?0.2f:0.62f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/minetrain.png","minetrain", "description.minetrain"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"minetrain";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), 
                new ItemStack(Items.iron_ingot, 2), null, null, null, null, new ItemStack(Blocks.chest, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{worldObj==null?1.9f:1.2f,1.6f,1.2f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.3f, -0.3f};}



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