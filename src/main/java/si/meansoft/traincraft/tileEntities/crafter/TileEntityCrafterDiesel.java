package si.meansoft.traincraft.tileEntities.crafter;

import si.meansoft.traincraft.blocks.BlockCrafter;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterBase;

public class TileEntityCrafterDiesel extends TileEntityCrafterBase{

    public TileEntityCrafterDiesel(){
        super("crafterDiesel");
    }

    @Override
    public BlockCrafter.CrafterTier getTier(){
        return BlockCrafter.CrafterTier.DIESEL;
    }
}
