package ebf.tim.entities;


import net.minecraft.world.World;

import java.util.UUID;

/**
 * <h1>Rollingstock core</h1>
 * this is the management core for all rollingstock.
 * any rollingstock functionality that happens specifically from the core entity happens here.
 * @author Eternal Blue Flame
 */
public abstract class EntityRollingStockCore extends GenericRailTransport {



    /**
    * <h2> Base rollingstock Constructor</h2>
    *
    * default constructor for all rollingstock, the first one is server only, the second is client only.
    *
    * @param owner the owner profile, used to define owner of the entity,
    * @param world the world to spawn the entity in, used in super's super.
    * @param xPos the x position to spawn entity at, used in super's super.
    * @param yPos the y position to spawn entity at, used in super's super.
    * @param zPos the z position to spawn entity at, used in super's super.
    */
    public EntityRollingStockCore(UUID owner, World world, double xPos, double yPos, double zPos){
        super(owner, world, xPos, yPos, zPos);
    }
    //this constructor is for client side spawning
    public EntityRollingStockCore(World world){
        super(world);
    }


}
