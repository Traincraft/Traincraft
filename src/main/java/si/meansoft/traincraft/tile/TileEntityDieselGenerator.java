/*
 * This file ("TileEntityDieselGenerator.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

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
