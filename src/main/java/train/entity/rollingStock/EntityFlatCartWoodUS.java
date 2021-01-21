package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityFlatCartWoodUS extends GenericRailTransport {

    public EntityFlatCartWoodUS(World worldObj) {
        super(worldObj);
    }

    public EntityFlatCartWoodUS(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFlatCartWoodUS((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Flat Cart Wood US";}
    @Override
    public String transportcountry(){return "1826";}
    @Override
    public String transportYear(){return "15000";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelFlatCarWoodUS()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.63f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/flatCartWoodUS.png","flatCartWoodUS", "description.flatCartWoodUS"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"flatCartWoodUS";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 6), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{3.75f,1.65f,1.1f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.9f, -0.95f};}



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