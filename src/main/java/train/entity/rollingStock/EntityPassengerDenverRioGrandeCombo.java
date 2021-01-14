package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EntityPassengerDenverRioGrandeCombo extends GenericRailTransport {

    public EntityPassengerDenverRioGrandeCombo(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerDenverRioGrandeCombo(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerDenverRioGrandeCombo((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger Denver Rio Grande Combo";}
    @Override//probably wrong, this is actually taken from:
    // https://www.historycolorado.org/sites/default/files/media/documents/2017/5ah3006.pdf
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1914-1960";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 2;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        List<TrainsInMotion.transportTypes> l=new ArrayList<>();
        l.add(TrainsInMotion.transportTypes.PASSENGER);
        l.add(TrainsInMotion.transportTypes.FREIGHT);
        return l;
    }
    @Override//probably wrong, this is actually taken from:
    // https://www.historycolorado.org/sites/default/files/media/documents/2017/5ah3006.pdf
    public float weightKg(){return 58967f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelDRGCombo()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_combo_Yellow.png","Yellow", "description.drg.combo.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_combo_Red.png","Red", "description.drg.combo.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/drg_combo_Green.png","Green", "description.drg.combo.Green"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Yellow";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 3), 
                null, null, new ItemStack(ItemIDs.woodenCab.item, 3), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.6f,1.5f, 0f},{0.2f,1.4f, 0f},{-1f,1.5f, 0f},{-2.2f,1.5f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.2f,2.35f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{2.15f, -2.05f};}



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