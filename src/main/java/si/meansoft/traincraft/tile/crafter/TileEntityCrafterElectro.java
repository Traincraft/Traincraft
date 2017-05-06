/*
 * This file ("TileEntityCrafterElectro.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.tile.crafter;

import si.meansoft.traincraft.blocks.BlockCrafter;

public class TileEntityCrafterElectro extends TileEntityCrafterBase {

    public TileEntityCrafterElectro() {
        super("CrafterElectro");
    }

    @Override
    public BlockCrafter.CrafterTier getTier() {
        return BlockCrafter.CrafterTier.ELECTRO;
    }
}
