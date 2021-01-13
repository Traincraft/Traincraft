package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityLocoElectricTramWood extends EntityTrainCore {

    public EntityLocoElectricTramWood(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricTramWood(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricTramWood((World)null), Info.modID, Traincraft.tcTab);


    //this seems to be a mild parody of the Lisbon trams Series 737, 738, 741-745
    // http://tram-lisboa.ernstkers.nl/SecondGeneration.html
    //main stats
    @Override
    public String transportName(){return "Loco Electric Yellow Wood Tram";}
    @Override
    public String transportcountry(){return "singapore";}
    @Override
    public String transportYear(){return "1905-1927";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 10730f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelTram()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.64f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,0f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/tram.png","tram", "description.tram"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"tram";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 4), new ItemStack(TiMItems.wheelIron, 2), new ItemStack(TiMItems.frameWood, 1),
                new ItemStack(Items.iron_ingot, 1), null, new ItemStack(TiMItems.cabinWood, 1),
                new ItemStack(TiMItems.transformer, 1), new ItemStack(TiMItems.smallElectricEngine, 2), new ItemStack(Items.redstone, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.25f,1.1f, 0f},{0.6f,1.1f, -0.3f},{-0.6f,1.1f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.7f,2.3f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.775f, -0.8f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 300;}
    @Override
    public float transportTopSpeed(){return 55;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    public int[] getTankCapacity(){return new int[]{2250};}



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
