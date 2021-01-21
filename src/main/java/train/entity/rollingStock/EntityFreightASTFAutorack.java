package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityFreightASTFAutorack extends GenericRailTransport {

    public EntityFreightASTFAutorack(World worldObj) {
        super(worldObj);
    }

    public EntityFreightASTFAutorack(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityFreightASTFAutorack((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Freight ASTF Autorack";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1966";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 4;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 42321.982f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelASTFAutorack()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-1.0f, -0.033f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/astf_autorack.png","astf_autorack", "description.astf_autorack"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"astf_autorack";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 4), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 6),
                new ItemStack(TiMOres.ingotSteel, 4), null, null, null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{8.8f,2.5f,1.25f};}
    @Override
    public float[] rotationPoints() {return new float[]{3.3f, -3.55f};}



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