package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.TiMItems;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;

import java.util.List;
import java.util.UUID;

public class EntityPassengerGS4_Observatory extends GenericRailTransport {

    public EntityPassengerGS4_Observatory(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerGS4_Observatory(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerGS4_Observatory((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger GS4 Tavern";}
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
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelGS4Tavern()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.05f, 0.13f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Orange.png","Orange", "description.GS4.Tavern.Orange"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_White.png","White", "description.GS4.Tavern.White"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Yellow.png","Yellow", "description.GS4.Tavern.Yellow"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Brown.png","Brown", "description.GS4.Tavern.Brown"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Lime.png","Lime", "description.GS4.Tavern.Lime"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Red.png","Red", "description.GS4.Tavern.Red"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Grey.png","Grey", "description.GS4.Tavern.Grey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Green.png","Green", "description.GS4.Tavern.Green"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_LightGrey.png","LightGrey", "description.GS4.Tavern.LightGrey"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_Black.png","Black", "description.GS4.Tavern.Black"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(Info.modID,"textures/trains/GS4_Tavern_LightBlue.png","LightBlue", "description.GS4.Tavern.LightBlue"));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                new ItemStack(Blocks.glass, 1), new ItemStack(TiMItems.wheelWood, 2), new ItemStack(TiMItems.frameSteel, 1),
                null, null, new ItemStack(TiMItems.cabinSteel, 1),
                null, null, new ItemStack(TiMItems.seatsWooden, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-0.2f,1.2f, -0.15f},{-2.7f,1.2f, -0.3f},{2.3f,1.2f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.875f,2.25f,1.4f};}
    @Override
    public float[] rotationPoints() {return new float[]{1.85f, -1.85f};}



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