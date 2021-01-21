package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityTankWagon2 extends GenericRailTransport {

    public EntityTankWagon2(World worldObj) {
        super(worldObj);
    }

    public EntityTankWagon2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityTankWagon2((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Tank Wagon Grey";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1890";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TANKER.singleton();
    }
    @Override
    public float weightKg(){return 15875.733f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelTankWagon2()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.57f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/tankwagon2.png","tankwagon2", "description.tankwagon2"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"tankwagon2";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 6), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, new ItemStack(Items.water_bucket, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{2.85f,1.775f,1.3f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.76f, -0.85f};}
    @Override
    public int[] getTankCapacity(){return new int[]{40000};}



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