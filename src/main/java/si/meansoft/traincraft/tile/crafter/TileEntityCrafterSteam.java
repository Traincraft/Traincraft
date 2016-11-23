/*
 * This file ("TileEntityCrafterSteam.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.tile.crafter;

import si.meansoft.traincraft.blocks.BlockCrafter;

public class TileEntityCrafterSteam extends TileEntityCrafterBase{

    public TileEntityCrafterSteam(){
        super("CrafterSteam");
    }

    @Override
    public BlockCrafter.CrafterTier getTier(){
        return BlockCrafter.CrafterTier.STEAM;
    }
}
