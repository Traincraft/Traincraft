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

public class EntityLocoDieselMILW_H1044 extends EntityTrainCore {

    public EntityLocoDieselMILW_H1044(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselMILW_H1044(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselMILW_H1044((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel MILW H10-44";}
    @Override
    public String transportcountry(){return "us";}
    @Override
    public String transportYear(){return "1944-1950";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 108862f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelMILW_H1044()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{2.05f, 0.2f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Orange.png","Orange", "description.MILW.H1044.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Yellow.png","Yellow", "description.MILW.H1044.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Black.png","Black", "description.MILW.H1044.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Red.png","Red", "description.MILW.H1044.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Blue.png","Blue", "description.MILW.H1044.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Grey.png","Grey", "description.MILW.H1044.Grey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_LightBlue.png","LightBlue", "description.MILW.H1044.LightBlue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/MILW_H1044_Green.png","Green", "description.MILW.H1044.Green"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelIron, 2), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.smallDieselEngine, 4), new ItemStack(TiMItems.generator, 3)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.2f,1.2f, 0.35f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.9f,2.1f,1.2f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.5f, -1.6f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1618;}
    @Override
    public float transportTopSpeed(){return 97;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
    }
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}



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