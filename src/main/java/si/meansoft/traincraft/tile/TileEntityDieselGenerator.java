package si.meansoft.traincraft.tile;

import net.minecraft.util.ITickable;

/**
 * @author canitzp
 */
public class TileEntityDieselGenerator extends TileEntityEnergy implements ITickable{

    public TileEntityDieselGenerator(){
        super("DieselGenerator", 1, 30000, 5000);
    }

    @Override
    public void update(){
        this.receiveEnergy(1, false);
        System.out.println("" + this.getStoredEnergy());
    }
}
