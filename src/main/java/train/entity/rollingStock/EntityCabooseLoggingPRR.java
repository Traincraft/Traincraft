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

public class EntityCabooseLoggingPRR extends GenericRailTransport {

    public EntityCabooseLoggingPRR(World worldObj) {
        super(worldObj);
    }

    public EntityCabooseLoggingPRR(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityCabooseLoggingPRR((World)null), Info.modID, Traincraft.tcTab);


    //I cannot find anything about this one xx Chiel
    //main stats
    @Override
    public String transportName(){return "PRR Caboose Logging";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1942";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.WORKCAR.singleton();
    }
    @Override
    public float weightKg(){return 19595.19f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPRRCaboose()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.525f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/PRRCaboose_Red.png","Red", "description.PRRCaboose.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/PRRCaboose_Blue.png","Blue", "description.PRRCaboose.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/PRRCaboose_Green.png","Green", "description.PRRCaboose.Green"));
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
                new ItemStack(TiMOres.ingotSteel, 2), null, null, null, null, new ItemStack(Blocks.crafting_table, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.5f,2.07f,1.1f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.25f, -1.25f};}



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
