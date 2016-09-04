package si.meansoft.traincraft.tile.crafter;

import si.meansoft.traincraft.blocks.BlockCrafter;

public class TileEntityCrafterDiesel extends TileEntityCrafterBase{

    public TileEntityCrafterDiesel(){
        super("CrafterDiesel");
    }

    @Override
    public BlockCrafter.CrafterTier getTier(){
        return BlockCrafter.CrafterTier.DIESEL;
    }
}
