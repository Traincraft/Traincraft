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

public class EntityTenderMILW extends GenericRailTransport {

    public EntityTenderMILW(World worldObj) {
        super(worldObj);
    }

    public EntityTenderMILW(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityTenderMILW((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Tender MILW";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1935-1937";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TENDER.singleton();
    }
    @Override
    public float weightKg(){return 114273f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelMILWTender()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.1f, 0.065f, 0.025f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/milw_tender.png","milw_tender", "description.milw_tender"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"milw_tender";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Items.coal, 2), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 1),
                null, null, null, null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{4.55f,2.0f,1.3f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.125f, -1.1f};}
    @Override
    public int[] getTankCapacity(){return new int[]{16000};}



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