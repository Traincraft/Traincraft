package train.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.api.skin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.blocks.bench.AssemblyTableRecipes;
import train.render.models.ModelLoco;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoSteam4_4_0 extends EntityTrainCore {

    /**
     CONVERSION NOTES:
     Model information can still be found in
     @see train.render.RenderEnum
     Transport stats can still be found in
     @see train.library.EnumTrains
     Transport recipes are still shown in (and probably still work)
     @see AssemblyTableRecipes
     */

    public EntityLocoSteam4_4_0(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityLocoSteam4_4_0(World w){
        super(w);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoSteam4_4_0(null), Info.modID, Traincraft.tcTab);


    @Override
    public String transportName(){return "Loco Steam 4-4-0";}
    @Override
    public String transportcountry(){return "TrainCraft";}
    @Override
    public String transportYear(){return "2007-ish";}
    @Override
    public String transportFuelType(){return "Steam";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public float transportTractiveEffort(){return 0;}

    @Override
    public void registerSkins(){
        //todo: needs skin credits
        //make base skin and register
        String description = "description.4-4-0-loco";
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Blue.png","Blue", description));

        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Purple.png","Purple", description));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(Info.modID,"textures/trains/4-4-0-loco_Black.png","Black", description));
        //note: is more detail is needed on the skin setup, you can make a new TransportSkin as a variable, and add additional data.
        //TC's models, even newer ones are fairly simple though, so this is an unlikely scenario.

    }

    /**
     * Defines the default skin using a ResourceLocation-esk string URI of the modid and the skin name.
     */
    @Override
    public String getDefaultSkin(){
        return Info.modID+":Blue";
    }

    //
    /**
     * <h2>Max speed</h2>
     * @return the value of the max speed in km/h
     */
    @Override
    public float transportTopSpeed(){return accelerator<0?30f:50f;}

    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     * each row is 9 items
     */
    @Override
    public int getInventoryRows(){return 1;}
    /**
     * <h2>Type</h2>
     * @return the type which will define it's features, GUI, a degree of storage (like crafting slots), and a number of other things.
     */
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    /**
     * <h2>Max Fuel</h2>
     * @return the max heat of fuel the boiler can sustain, a vale of 1 allows for a max of 750c.
     * @see GenericRailTransport#getMaxFuel() for more info.
     * @see FuelHandler for information on fuel consumption.
     */
    @Override
    public float getMaxFuel(){return 1;}

    /**
     * defines the slot used for fuel, host class figures this out automatically from
     * @see #getTypes
     * additionally fuel management is also automatically handled from the type, if something more specific is needed
     * @see GenericRailTransport#manageFuel()
     * water slots can also be manaed via
     * @see GenericRailTransport#waterSlot()
     * and any additional slots can be assigned via
     * @see GenericRailTransport#initInventorySlots()
     * be sure to call the super class on the start of that last one or you break inventories.
     */
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }

    /**
     * <h2>Rider offset</h2>
     * @return defines the offsets of the riders in blocks,
     *     the first value is how far back, the second is how high, third is offset to the left or right
     *     Negative values are towards the front, ground, or right.
     *     Each set of floats represents a different rider.
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.3f,1.2f, 0f}};}

    /**
     * defines the size of the hitbox for processing, in order of length, height, and width.
     */
    @Override
    public float[] getHitboxSize() {
        return new float[]{2f,2.1f,1.1f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration and pulling strength.
     * if only tractive effort is known you can use
     * @see GenericRailTransport#transportTractiveEffort() which is defined in lfb.
     */
    @Override
    public float transportMetricHorsePower(){return 400f;}

    @Override
    public float weightKg(){return 15000f;}//taken from The General 4-4-0 with some compensations for size difference


    /**
     * ItemStacks are defined in order of:
     * top left, top center, top right
     * middle left, middle center, middle right
     * bottom left, bottom center, bottom right
     * the TiM crafting grid is designed the same as vanilla.
     * All ore directory support is automatically figured out by
     * @see ebf.tim.utility.RecipeManager#ODC(ItemStack)
     */
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(Items.stick, 2), null,
                new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1),
                new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.woodenFrame.item, 2), null
        };
    }


    /**
     * Defines the points server uses to move and rotate the entity from.
     */
    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1f, -0.8f};
    }

    /**
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    /**
     * Fluid tank capacity.
     * For steam the first is water, and the second is steam.
     * for everything else the first is fuel and there isn't a second
     */
    @Override
    public int[] getTankCapacity(){return new int[]{5000, 800};}

    /**
     * this should b exactly the same in all classes
     * the only reason we have to declare it is to be sure inheritance works correctly.
     */
    public Item getItem(){return thisItem;}

    /**
     * defines the model to render.
     */
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelLoco()};}
}
