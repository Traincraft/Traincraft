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

public class EntityFreightLongCoveredHopper extends GenericRailTransport {

    public EntityFreightLongCoveredHopper(World worldObj) {
        super(worldObj);
    }

    public EntityFreightLongCoveredHopper(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreightLongCoveredHopper((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight Long Covered Hopper";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "2004";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 28394.882f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLongCoveredHopper()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.0f, 0.4425f, -0.7f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_LightGrey.png","LightGrey", "description.LongCoveredHopper.LightGrey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_Grey.png","Grey", "description.LongCoveredHopper.Grey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_Pink.png","Pink", "description.LongCoveredHopper.Pink"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_White.png","White", "description.LongCoveredHopper.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_Green.png","Green", "description.LongCoveredHopper.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_Orange.png","Orange", "description.LongCoveredHopper.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/LongCoveredHopper_Lime.png","Lime", "description.LongCoveredHopper.Lime"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"LightGrey";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 5), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, new ItemStack(Items.dye, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{6.325f,2.15f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.5f, -2.325f};}



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