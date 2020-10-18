package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.render.models.ModelHallClass;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteamHallClass extends EntityTrainCore {

    public EntityLocoSteamHallClass(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityLocoSteamHallClass(World w){
        super(w);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamHallClass(null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Hall Clas";}
    @Override
    public String transportcountry(){return "United Kingdom";}
    @Override
    public String transportYear(){return "1928–1943";}
    @Override
    public String transportFuelType(){return "Steam";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 27275f;}
    @Override
    public float transportMetricHorsePower(){return 1091;}
    @Override
    public float transportTopSpeed(){return accelerator<0?90f:164f;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 76200f;}
    @Override
    public int[] getTankCapacity(){return new int[]{10000, 1600};}
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelHallClass()};}

    //skins
    @Override
    public void registerSkins(){
        //todo: add skin texture credits.
        //make base skin and register
        String description ="The Great Western Railway (GWR) 4900 Class, better known as the Hall Class\n" +
                "was built at the Swindon Works in England, it's design was a large inspiration to some iconic locomotives such as The Black Five.\n" +
                "The prototype Saint Martin accumulated a remarkable 2,092,500 miles during it's lifespan.";
        SkinRegistry.addSkin(this.getClass(),
                new skin(Info.modID,"textures/trains/Hall_Class_Locomotive_Green.png","Green", description));

        SkinRegistry.addSkin(this.getClass(),
                new skin(Info.modID,"textures/trains/Hall_Class_Locomotive_Lime.png","Lime", description));

        SkinRegistry.addSkin(this.getClass(),
                new skin(Info.modID,"textures/trains/Hall_Class_Locomotive_Red.png","Red", description));

    }

    @Override
    public String getDefaultSkin(){
        return Info.modID+":Green";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steel.item, 1), null,
                new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 2), new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), null
        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{3.7f,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{8f,2.1f,1.1f};
    }
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{3.5f, -3f};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    public Item getItem(){return thisItem;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public float getMaxFuel(){return 1;}

}
