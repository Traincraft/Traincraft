package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;
import train.render.models.ModelA4Locomotive;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteamMallardA4 extends EntityTrainCore {

    public EntityLocoSteamMallardA4(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityLocoSteamMallardA4(World w){
        super(w);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteamMallardA4(null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Steam A4 Mallard";}
    @Override
    public String transportcountry(){return "United Kingdom";}
    @Override
    public String transportYear(){return "1938";}
    @Override
    public String transportFuelType(){return "Steam";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 35455f;}
    @Override
    public float transportMetricHorsePower(){return 1418;}
    @Override
    public float transportTopSpeed(){return accelerator<0?130f:203f;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 167600f;}
    @Override
    public int[] getTankCapacity(){return new int[]{10000, 1600};}
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelA4Locomotive()};}

    //skins
    @Override
    public void registerSkins(){
        //todo: add skin texture credits.
        //make base skin and register
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/locoA4_UK_Blue.png","Blue", "description.locoA4.UK.Blue"));

        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/locoA4_UK_White.png","White", "description.locoA4.UK.White"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/locoA4_UK_Green.png","Green", "description.locoA4.UK.Green"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/locoA4_UK_Lime.png","Lime", "description.locoA4.UK.Lime"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/locoA4_UK_Black.png","Black", "description.locoA4.UK.black"));
    }

    @Override
    public String getDefaultSkin(){
        return Info.modID+":Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(Items.iron_ingot, 2), null,
                new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), null
        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.65f,1.6f, 0.425f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{7.6f,2.6f,1.5f};
    }
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.9f, -2.6f};}

    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.4f,0.0f,0f}};}


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
