package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityPropagandaUS extends GenericRailTransport {

    public EntityPropagandaUS(World worldObj) {
        super(worldObj);
    }

    public EntityPropagandaUS(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPropagandaUS((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Propaganda USA";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.OTHER.singleton();
    }
    @Override//Most flatcars weigh anywhere between 10 and 30 tons.
    public float weightKg(){return 15000f;}
    @Override
    public String[] additionalItemText(){return new String[]{"A generation which ignores history has no past and no future. -Robert A. Heinlein"};}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelPropagandaCar()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.1f, 0f, 0.075f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/propaganda_US_Blue.png","Blue", "description.propaganda.US.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/propaganda_US_White.png","White", "description.propaganda.US.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/propaganda_US_Red.png","Red", "description.propaganda.US.Red"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), 
                null, null, null, null, null, new ItemStack(Items.painting, 2)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{7.4f,3.2f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.8f, -2.7f};}



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