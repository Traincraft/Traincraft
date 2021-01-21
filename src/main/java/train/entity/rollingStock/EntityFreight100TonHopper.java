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

public class EntityFreight100TonHopper extends GenericRailTransport {

    public EntityFreight100TonHopper(World worldObj) {
        super(worldObj);
    }

    public EntityFreight100TonHopper(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreight100TonHopper((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight 100 Ton Hopper";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1979";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 28032.008f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.Model100TonHopper()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.1f, 0.16f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/freight_100tonhopper_Red.png","Red", "description.freight.100tonhopper.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/freight_100tonhopper_Black.png","Black", "description.freight.100tonhopper.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/freight_100tonhopper_Blue.png","Blue", "description.freight.100tonhopper.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/freight_100tonhopper_Grey.png","Grey", "description.freight.100tonhopper.Grey"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 6), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, new ItemStack(Blocks.hopper, 3)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{5.800000190734863f,2.175f,1.15f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.035f, -2.25f};}



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