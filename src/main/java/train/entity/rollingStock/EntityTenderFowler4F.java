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

public class EntityTenderFowler4F extends GenericRailTransport {

    public EntityTenderFowler4F(World worldObj) {
        super(worldObj);
    }

    public EntityTenderFowler4F(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityTenderFowler4F((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Fowler 4F Tender";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1924–1941";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TENDER.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelFowler4FTender()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-5.25f, 0.51585f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Fowler_4F_Tender.png","Fowler_4F_Tender", "description.Fowler_4F_Tender"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Fowler_4F_Tender";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), 
                new ItemStack(ItemIDs.steel.item, 2), null, null, null, null, new ItemStack(Items.coal, 2)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.5999999046325684f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4399999380111694f, -1.4399999380111694f};}
    @Override
    public int[] getTankCapacity(){return new int[]{15000};}



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