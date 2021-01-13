package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
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

public class EntityLocoDieselBamboo extends EntityTrainCore {

    public EntityLocoDieselBamboo(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselBamboo(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselBamboo((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Bamboo Flatcar Engine";}
    @Override
    public String transportcountry(){return "Cambodia";}
    @Override
    public String transportYear(){return "1980s";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override//the weight is a rough estimate based on size and the average weight of bamboo, plus a small 25kg engine.
    public float weightKg(){return 92f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelBambooTrainEngine()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.14f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, 0.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Red.png","Red", "description.loco.bamboo.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Blue.png","Blue", "description.loco.bamboo.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Black.png","Black", "description.loco.bamboo.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Yellow.png","Yellow", "description.loco.bamboo.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Magenta.png","Magenta", "description.loco.bamboo.Magenta"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Cyan.png","Cyan", "description.loco.bamboo.Cyan"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Pink.png","Pink", "description.loco.bamboo.Pink"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_LightGrey.png","LightGrey", "description.loco.bamboo.LightGrey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Green.png","Green", "description.loco.bamboo.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_White.png","White", "description.loco.bamboo.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_LightBlue.png","LightBlue", "description.loco.bamboo.LightBlue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Lime.png","Lime", "description.loco.bamboo.Lime"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Brown.png","Brown", "description.loco.bamboo.Brown"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Purple.png","Purple", "description.loco.bamboo.Purple"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Orange.png","Orange", "description.loco.bamboo.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/loco_bamboo_Grey.png","Grey", "description.loco.bamboo.Grey"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameWood, 1),
                null, null, null, null, new ItemStack(TiMItems.smallDieselEngine, 1), null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.8f,1.2f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.1f,1.3f,1.6f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.925f, -1f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 30;}
    @Override
    public float transportTopSpeed(){return 20;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}



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
