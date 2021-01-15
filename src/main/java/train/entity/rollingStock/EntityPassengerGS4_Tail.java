package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityPassengerGS4_Tail extends GenericRailTransport {

    public EntityPassengerGS4_Tail(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerGS4_Tail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerGS4_Tail((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger GS4 Tail";}
    @Override
    public String transportcountry(){return "Us";}
    @Override
    public String transportYear(){return "1939";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override//weight is fully unknown, many passenger rollingstock are listed around 20 to 30 tons, so this is just a guess,
    public float weightKg(){return 48987.976f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelGS4Tail()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.2f, 0.13f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Orange.png","Orange", "description.GS4.Tail.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_White.png","White", "description.GS4.Tail.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Yellow.png","Yellow", "description.GS4.Tail.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Brown.png","Brown", "description.GS4.Tail.Brown"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Lime.png","Lime", "description.GS4.Tail.Lime"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Red.png","Red", "description.GS4.Tail.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Grey.png","Grey", "description.GS4.Tail.Grey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Green.png","Green", "description.GS4.Tail.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_LightGrey.png","LightGrey", "description.GS4.Tail.LightGrey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_Black.png","Black", "description.GS4.Tail.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tail_LightBlue.png","LightBlue", "description.GS4.Tail.LightBlue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 1),
                null, null, new ItemStack(TiMItems.cabinSteel, 1),
                null, null, new ItemStack(TiMItems.seatsWooden, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-0.2f,1.2f, 0.3f},{0.9f,1.2f, -0.3f},{2.1f,1.2f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{8.375f,2.25f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.6f, -2.075f};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}