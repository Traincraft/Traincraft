package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityWorkCart extends GenericRailTransport {

    public EntityWorkCart(World worldObj) {
        super(worldObj);
    }

    public EntityWorkCart(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityWorkCart((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Work Cart Yellow";}
    @Override
    public String transportcountry(){return "Uk";}
    @Override
    public String transportYear(){return "1945";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.WORKCAR.singleton();
    }
    @Override
    public float weightKg(){return 22500f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelWorkCart()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.63f, 0.0f}};}
@Override
    public float[][] modelRotations(){return new float[][]{{0f,0f,180f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/workcart.png","workcart", "description.workcart"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"workcart";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Blocks.crafting_table, 1), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameWood, 1),
                new ItemStack(Items.stick, 2), null, new ItemStack(TiMItems.cabinWood, 1),
                null, null, new ItemStack(Blocks.furnace, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.75f,2.15f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{0.925f, -0.95f};}



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