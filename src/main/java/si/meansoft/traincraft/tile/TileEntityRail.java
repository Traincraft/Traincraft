package si.meansoft.traincraft.tile;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityRail extends TileEntityBase{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();
    public EnumFacing rotation;

    public TileEntityRail(String name){
        super(name);
    }

    public void placeTrack(List<BlockPos> harvestPositions, EnumFacing rotation){
        this.harvestPositions = harvestPositions;
        this.rotation = rotation;
    }

}
