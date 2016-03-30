/*
 * ******************************************************************************
 *  Copyright 2011-2015 CovertJaguar
 *
 *  This work (the API) is licensed under the "MIT" License, see LICENSE.md for details.
 * ***************************************************************************
 */

package mods.railcraft.api.tracks;

import net.minecraft.entity.item.EntityMinecart;

public interface ISwitchDevice {
    /**
     * This method is used by the <code>switchTrack</code> to ask the switch
     * device whether it thinks the track should be switched or not. Ultimately,
     * the track itself will decide whether it will be switched, however the
     * track will usually try to honor results of this method when possible.
     *
     * @param switchTrack The switch track that is asking
     * @param cart        The cart that the switch may use to determine switch status.
     *                    Implementations should expect null values.
     * @return true if the switch would like the track switched
     * @see mods.railcraft.api.tracks.ITrackSwitch
     */
    public boolean shouldSwitch(ITrackSwitch switchTrack, EntityMinecart cart);

    /**
     * Announces track state changes to the device.
     * Server side only.
     *
     * @param isSwitched
     */
    public void onSwitch(boolean isSwitched);

    /**
     * The track uses this function to tell the switch device what direction it should render its arrows.
     * Client side only.
     *
     * @param redArrow
     * @param whiteArrow
     */
    public void setRenderState(ArrowDirection redArrow, ArrowDirection whiteArrow);

    enum ArrowDirection {
        NORTH, SOUTH, EAST, WEST, NORTH_SOUTH, EAST_WEST
    }
}
