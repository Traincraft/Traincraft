package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityTenderAdler extends GenericRailTransport {

    public EntityTenderAdler(World worldObj) {
        super(worldObj);
    }

    public EntityTenderAdler(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityTenderAdler((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Tender Adler";}
    @Override
    public String transportcountry(){return "germany";}
    @Override
    public String transportYear(){return "1835";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TENDER.singleton();
    }
    @Override
    public float weightKg(){return 5994.6f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelTenderAdler()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, worldObj==null?-1.2f:-0.85f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, -90.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/tender_adler.png","tender_adler", "description.tender_adler"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"tender_adler";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Items.iron_ingot, 2), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameWood, 1),
                new ItemStack(Items.iron_ingot, 1), null, null, null, null, new ItemStack(Items.coal, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{worldObj==null?2:1.8f,1.3f,1.0f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.3f, -0.375f};}
    @Override
    public int[] getTankCapacity(){return new int[]{4000};}



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