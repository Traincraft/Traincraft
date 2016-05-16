package si.meansoft.traincraft.tileentities.crafter;

import si.meansoft.traincraft.blocks.BlockCrafter;

public class TileEntityCrafterSteam extends TileEntityCrafterBase{

    public TileEntityCrafterSteam(){
        super("crafterSteam");
    }

    @Override
    public BlockCrafter.CrafterTier getTier(){
        return BlockCrafter.CrafterTier.STEAM;
    }
}
