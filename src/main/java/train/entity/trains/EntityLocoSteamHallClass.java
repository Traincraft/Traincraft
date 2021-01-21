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

public class EntityLocoSteamHallClass extends EntityTrainCore {

    public EntityLocoSteamHallClass(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamHallClass(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamHallClass((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Hall Class";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1928–1943";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 76203.5f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelHallClass()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{1.9f, 0f, 0.25f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Hall_Class_Locomotive_Green.png","Green", "description.Hall.Class.Locomotive.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Hall_Class_Locomotive_Red.png","Red", "description.Hall.Class.Locomotive.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/Hall_Class_Locomotive_Lime.png","Lime", "description.Hall.Class.Locomotive.Lime"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Green";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 1), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.boilerIron, 2), new ItemStack(TiMItems.fireboxSteel, 2), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.8f,1.5f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.15f,2.3f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.9f, -1.7f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 1091;}
    @Override
    public float transportTractiveEffort(){return 24555;}
    @Override
    public float transportTopSpeed(){return 164;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{15898, 1000};}



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