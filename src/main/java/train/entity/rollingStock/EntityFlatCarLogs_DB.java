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

public class EntityFlatCarLogs_DB extends GenericRailTransport {

    public EntityFlatCarLogs_DB(World worldObj) {
        super(worldObj);
    }

    public EntityFlatCarLogs_DB(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFlatCarLogs_DB((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Flat Cart Logs DB";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1924";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 22500f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelFlatCarLogs_DB()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.63f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/flatCarLogs_DB_Red.png","Red", "description.flatCarLogs.DB.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/flatCarLogs_DB_Green.png","Green", "description.flatCarLogs.DB.Green"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 5), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, new ItemStack(Blocks.log, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{3.75f,1.725f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1f, -1f};}



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
