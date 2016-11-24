/*
 * This file ("IEnergyConnection.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package cofh.api.energy;

import net.minecraft.util.EnumFacing;


/**
 * Implement this interface on TileEntities which should connect to energy transportation blocks. This is intended for blocks which generate energy but do not
 * accept it; otherwise just use IEnergyHandler.
 * <p>
 * Note that {@link IEnergyHandler} is an extension of this.
 *
 * @author King Lemming
 *
 */
public interface IEnergyConnection {

	/**
	 * Returns TRUE if the TileEntity can connect on a given side.
	 */
	boolean canConnectEnergy(EnumFacing from);

}
