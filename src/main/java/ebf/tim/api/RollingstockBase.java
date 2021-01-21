package ebf.tim.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityRollingStockCore;
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
 * you don't have to extend this class, you can just extend RollingstockBase if you want.
 *
 * TODO: add example values
 */
public abstract class RollingstockBase extends EntityRollingStockCore{

    //Constructors, no need to override these unless you need to.
    public RollingstockBase(UUID owner, World world, double xPos, double yPos, double zPos){
        super(owner, world, xPos, yPos, zPos);
    }
    public RollingstockBase(World worldObj){
        super(worldObj);
    }


    /*if this needs to be changed, then after you change it, have the renderdata.modelList variable set to null so it has to regen the data with the new models*/
    public abstract ModelBase[] getModel();


    /**
     * returns the type of transport, for a list of options:
     *
     * @see TrainsInMotion.transportTypes
     */
    public abstract List<TrainsInMotion.transportTypes> getTypes();

    /**
     * returns the rider offsets, each of the outer arrays represents a new rider seat,
     * the first value of the double[] inside that represents length from center in blocks.
     * the second represents height offset in blocks
     * the third value is for the horizontal offset
     */
    public abstract float[][] getRiderOffsets();

    /**
     * returns the item of the transport, this should be a static value in the transport's class.
     */
    public abstract Item getItem();

    /**
     * defines the size of the inventory, not counting any special slots like for fuel.
     */
    public abstract int getInventoryRows();

    /**
     * defines the radius in microblocks that the pistons animate
     */
    public abstract float getPistonOffset();

    /**
     * defines the length from center of the transport, thus is used for the motion calculation
     */
    public abstract float[] rotationPoints();

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
     */
    public abstract int[] getTankCapacity();

    /**
     * this function allows individual trains and rollingstock to implement custom fuel consumption and management
     * @see ebf.tim.utility.FuelHandler#manageElectric(EntityTrainCore)
     *
     * this is also used by rollingstock for consumeables, like filling a water tank
     * @see ebf.tim.utility.FuelHandler#manageTanker(GenericRailTransport)
     */
    public abstract void manageFuel();

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
}
