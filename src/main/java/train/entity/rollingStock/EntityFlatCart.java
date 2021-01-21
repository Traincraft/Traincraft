package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityFlatCart extends GenericRailTransport {

    public EntityFlatCart(World worldObj) {
        super(worldObj);
    }

    public EntityFlatCart(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFlatCart((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Flat Cart";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1826";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 15000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelFlatCar()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, worldObj==null?0f:0.57f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/flatcart.png","flatcart", "description.flatcart"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"flatcart";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 3), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameWood, 2),
                new ItemStack(Items.stick, 2), null, null, null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{2.85f,1.5f,1.3f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.76f, -0.84f};}



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