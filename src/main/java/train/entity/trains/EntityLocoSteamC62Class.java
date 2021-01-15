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

public class EntityLocoSteamC62Class extends EntityTrainCore {

    public EntityLocoSteamC62Class(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamC62Class(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamC62Class((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam C62Class";}
    @Override
    public String transportcountry(){return "japan";}
    @Override
    public String transportYear(){return "1948-1973";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 88832.9f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelC62Locomotive()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{2.9f, 0.6f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/c62_engine_Black.png","Black", "description.c62.engine.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/c62_engine_Red.png","Red", "description.c62.engine.Red"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Black";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.wheelSteel, 5), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.boilerIron, 3), new ItemStack(TiMItems.fireboxSteel, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{3,1.5f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.9f,2.4f,1.3f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.3f, -2.1f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 1223;}
    @Override
    public float transportTractiveEffort(){ return 30600f;}
    @Override
    public float transportTopSpeed(){return 129;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{10000, 2000};}



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