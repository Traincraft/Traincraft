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

public class EntityLocoSteamKingClass extends EntityTrainCore {

    public EntityLocoSteamKingClass(World worldObj) {
        super(worldObj);
    }

    public EntityLocoSteamKingClass(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamKingClass((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco King Class";}
    @Override
    public String transportcountry(){return "uk";}
    @Override
    public String transportYear(){return "1927-1936";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 90446f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelKingClass()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.9f, 0f, 0}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/King_Class_Locomotive_Green.png","Green", "description.King.Class.Locomotive.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/King_Class_Locomotive_Blue.png","Blue", "description.King.Class.Locomotive.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/King_Class_Locomotive_Lime.png","Lime", "description.King.Class.Locomotive.Lime"));
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
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.boilerIron, 3), new ItemStack(TiMItems.fireboxSteel, 2), null        };
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
    public float transportMetricHorsePower(){return 1613;}
    @Override
    public float transportTractiveEffort(){return 40300;}
    @Override
    public float transportTopSpeed(){return 174;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{18170, 1000};}



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