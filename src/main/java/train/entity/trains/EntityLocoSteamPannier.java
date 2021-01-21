package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteamPannier extends EntityTrainCore {

    public EntityLocoSteamPannier(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamPannier(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamPannier((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam Pannier";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1949–1955";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 2;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 42274.8f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelLocoPannier()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.9f, -0.15f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/locoPannier.png","locoPannier", "description.locoPannier"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"locoPannier";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.boilerIron, 2), new ItemStack(TiMItems.fireboxSteel, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.1f,1.7f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.6f,2.8f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.5f, -1.7f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 903;}
    @Override
    public float transportTractiveEffort(){return 18515;}
    @Override
    public float transportTopSpeed(){return 80;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3970, 800};}



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