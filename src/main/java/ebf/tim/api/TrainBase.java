package ebf.tim.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.models.Bogie;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

/**
 * Created by Eternal Blue Flame
 *
 * This is mainly for the purpose of documentation and ease of use.
 * you don't have to extend this class, you can just extend EntityTrainCore e if you want.
 */
public abstract class TrainBase extends EntityTrainCore{

    //Constructors, no need to override these unless you need to.
    public TrainBase(UUID owner, World world, double xPos, double yPos, double zPos){
        super(owner, world, xPos, yPos, zPos);
    }
    public TrainBase(World worldObj){
        super(worldObj);
    }

    /**
     * returns the type of transport, for a list of options:
     *
     * @see TrainsInMotion.transportTypes
     */
    public abstract List<TrainsInMotion.transportTypes> getTypes();

    /**
     * returns the item of the transport, this should be a static value in the transport's class.
     */
    public abstract Item getItem();

    /**
     * defines the size of the inventory, not counting any special slots like for fuel.
     *
     */
    public abstract int getInventoryRows();

    /**
     * defines the radius in microblocks that the pistons animate
     */
    public abstract float getPistonOffset();

    /**
     * defines the length from center of the transport, thus is used for the motion calculation
     */
    public abstract float[] bogieLengthFromCenter();

    /**
     * defines the render scale, minecraft's default is 0.0625
     */
    public abstract float getRenderScale();

    /**
     * defines if the transport is explosion resistant
     */
    public abstract boolean isReinforced();

    /**
     * defines the capacity of the fluidTank tank.
     * Usually value is 10,000 *the cubic meter capacity, so 242 gallons, is 0.9161 cubic meters, which is 9161 tank capacity
     * NOTE if this is used for a train, minimum value should be 1100, which is just a little over a single bucket to allow prevention of overheating.
     * NOTE 2: RF is stored as a fluid
     */
    public abstract int[] getTankCapacity();

    /**
     * this function allows individual trains and rollingstock to implement custom fuel consumption and management
     * @see ebf.tim.utility.FuelHandler#manageElectric(EntityTrainCore)
     *
     * this is also used by rollingstock for consumeables, like filling a water tank
     * @see ebf.tim.utility.FuelHandler#manageTanker(GenericRailTransport)
     */
    //public abstract void manageFuel();

    /**
     * defines the weight of the transport.
     */
    public abstract float weightKg();

    /**
     * returns the max fuel.
     * for steam trains this is cubic meters of the firebox size. (1.5 on average)
     * for diesel this is cubic meters. (11.3 on average)
     * for electric this is Kw. (400 on average)
     * for nuclear this is the number of fusion cores, rounded down. (usually 1)
     */
    public abstract float getMaxFuel();
    /*
     * <h2>Inherited variables</h2>
     * these functions are overridden by classes that extend GenericRailTransport, or EntityTrainCore so that way the values can be changed indirectly.
     */

    /*
    <h1>Bogies and models</h1>
    */

    /**returns the x/y/z offset each bogie should render at, with 0 being the entity center, in order with getBogieModels
     * example:
     * return new float[][]{{x1,y1,z1},{x2,y2,z2}, etc...};
     * may return null.
     * this method is old, you can use it but the new Bogie[] method is better in every way*/
    //@SideOnly(Side.CLIENT)
    //public abstract float[][] bogieModelOffsets();

    /**returns a list of models to be used for the bogies
     * example:
     * return new ModelBase[]{new MyModel1(), new myModel2(), etc...};
     * may return null.
     * this method is old, you can use it but the new Bogie[] method is better in every way*/
    //@SideOnly(Side.CLIENT)
    //public abstract ModelBase[] bogieModels();

    /**
     * The new method for defining bogies, returns an array of bogies which have a set model and optionally set offsets.
     * example:
     *  return new Bogie[]{new Bogie(new BogieModel(), x,y,z), etc};
     *  Bogies may have sub bogies, for example larger steamers that have guiding wheels on a front bogie
     *  example:
     *  new Bogie(new BogieModel(), x,y,z).addSubBogie(new subBogieModel, x,y,z)
     * @return
     */
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){return super.bogies();}


    /**returns the x/y/z offset each model should render at, with 0 being the entity center, in order with getModels
     * example:
     * return new float[][]{{x1,y1,z1},{x2,y2,z2}, etc...};
     * may return null.*/
    @SideOnly(Side.CLIENT)
    public float[][] modelOffsets(){return super.modelOffsets();}

    /**event is to add skins for the model to the skins registry on mod initialization.
     * this function can be used to register multiple skins, one after another.
     * example:
     * SkinRegistry.addSkin(this.class, MODID, "folder/mySkin.png", new int[][]{{oldHex, newHex},{oldHex, newHex}, etc... }, displayName, displayDescription);
     * the int[][] for hex recolors may be null.
     * hex values use "0x" in place of "#"
     * "0xff00aa" as an example.
     * the first skin added to the registry for a transport class will be the default
     * additionally the addSkin function may be called from any other class at any time.
     * the registerSkins method is only for organization and convenience.*/
    public abstract void registerSkins();

    /**returns a list of models to be used for the transport
     * example:
     * return new MyModel();
     * may return null. */
    @SideOnly(Side.CLIENT)
    public abstract ModelBase[] getModel();


    /*
    <h1>riders and interaction</h1>
    */

    /**defines the rider position offsets, with 0 being the center of the entity.
     * Each set of coords represents a new rider seat, with the first one being the "driver"
     * example:
     * return new float[][]{{x1,y1,z1},{x2,y2,z2}, etc...};
     * may return null*/
    public abstract float[][] getRiderOffsets();

    /**returns the size of the hitbox in blocks.
     * example:
     * return new float[]{x,y,z};
     * may not return null*/
    public abstract float[] getHitboxSize();

    /*
    <h1> inventory and fluid tanks </h1>
    */

    /** defines the whitelist of fluid names for the tank defined by tankID
     * NOTE: RF is a fluid.
     * simple example:
     * return FuelHandler.DefaultTanks.ELECTRIC.value();
     * alternate example:
     * if(tankID==0){return new String[]{"water", "diesel"}} else { return null}
     * NOTE 2: for trains that are just basic diesel or electric with no additional tanks, you don't need to define this*/
    public String[][] getTankFilters(){return super.getTankFilters();}


    /**defines the name used for registration and the default name used in the gui.*/
    public abstract String transportName();
    /**defines the country of origin for the transport*/
    public abstract String transportcountry();
    /**the year or year range to display for the transport.*/
    public abstract String transportYear();

    /**the fuel type to display for the transport.*/
    public abstract String transportFuelType();

    /**the top speed in km/h for the transport.
     * not used tor rollingstock.*/
    public abstract float transportTopSpeed();
    /**displays in item lore if the transport is fictional or not*/
    public abstract boolean isFictional();
    /**the tractive effort for the transport, this is a fallback if metric horsepower (mhp) is not available*/
    public abstract float transportTractiveEffort();
    /**this is the default value to define the acceleration speed and pulling power of a transport.*/
    public abstract float transportMetricHorsePower();

    /**additional lore for the item, each entry in the array is a new line.
     * may return null.*/
    public abstract String[] additionalItemText();


    /**
     * DEPRECIATED
     */
    /**This does nothing, remove it*/
    public List<Double> getRenderBogieOffsets(){return  null;}

    /**This does nothing, remove it*/
    public Bogie[] getBogieModels(){return null;}
}
