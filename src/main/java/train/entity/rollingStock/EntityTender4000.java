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

public class EntityTender4000 extends GenericRailTransport {

    public EntityTender4000(World worldObj) {
        super(worldObj);
    }

    public EntityTender4000(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityTender4000((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "4000GallonTender";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1926-1944";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 4;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TENDER.singleton();
    }
    @Override
    public float weightKg(){return 47445.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.Model4000GallonTender()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-4.1f, 0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GWR_Tender_Green.png","Green", "description.GWR.Tender.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GWR_Tender_Blue.png","Blue", "description.GWR.Tender.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GWR_Tender_Red.png","Red", "description.GWR.Tender.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GWR_Tender_Lime.png","Lime", "description.GWR.Tender.Lime"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Green";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steel.item, 6), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), 
                new ItemStack(ItemIDs.steel.item, 2), null, null, null, null, new ItemStack(Items.coal, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.7f,2.0f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.05f, -1.3f};}
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