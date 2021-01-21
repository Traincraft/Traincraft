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

public class EntityLocoElectricBR185 extends EntityTrainCore {

    public EntityLocoElectricBR185(World worldObj) {
        super(worldObj);
    }

    public EntityLocoElectricBR185(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoElectricBR185((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Electric BR 185";}
    @Override
    public String transportcountry(){return "german";}
    @Override
    public String transportYear(){return "1996";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override//this is a rough estimate as the weight varies between years
    public float weightKg(){return 84000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.BR185_EngineModel()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.45f, 0.1f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Red.png","Red", "description.BR185.Engine.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Blue.png","Blue", "description.BR185.Engine.Blue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Magenta.png","Magenta", "description.BR185.Engine.Magenta"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Cyan.png","Cyan", "description.BR185.Engine.Cyan"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Grey.png","Grey", "description.BR185.Engine.Grey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_LightBlue.png","LightBlue", "description.BR185.Engine.LightBlue"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_LightGrey.png","LightGrey", "description.BR185.Engine.LightGrey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Orange.png","Orange", "description.BR185.Engine.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Pink.png","Pink", "description.BR185.Engine.Pink"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Purple.png","Purple", "description.BR185.Engine.Purple"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_White.png","White", "description.BR185.Engine.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Yellow.png","Yellow", "description.BR185.Engine.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/BR185_Engine_Black.png","Black", "description.BR185.Engine.Black"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Red";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlPanel, 2), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 2),
                null, null, new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.transformer, 2), new ItemStack(TiMItems.smallElectricEngine, 2), new ItemStack(Items.redstone, 4)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.1f,1.2f, -0.3f},{2.1f,1.2f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.1f,2.2f,1.6f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.1f, -1.1f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 2428;}
    @Override
    public float transportTractiveEffort(){return 24555;}
    @Override
    public float transportTopSpeed(){return 160;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot();
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