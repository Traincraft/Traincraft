package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityBUnitDD35 extends GenericRailTransport {

    public EntityBUnitDD35(World worldObj) {
        super(worldObj);
    }

    public EntityBUnitDD35(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityBUnitDD35((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "DD35 B Unit";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1963-1981";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.B_UNIT.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelDD35B()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.18f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/dd35b_Orange.png","Orange", "description.dd35b.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/dd35b_Black.png","Black", "description.dd35b.Black"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 8), new ItemStack(ItemIDs.steelframe.item, 3),
                new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(ItemIDs.electmotor.item, 8), new ItemStack(ItemIDs.dieselengine.item, 11), new ItemStack(ItemIDs.generator.item, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.199999809265137f,2.1f,1.1f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.4800000190734863f, -2.4800000190734863f};}
    @Override
    public int[] getTankCapacity(){return new int[]{12000};}



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
