package si.meansoft.traincraft.tile;

import net.minecraft.util.math.BlockPos;

/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase{

    public BlockPos defaultTrackPosition;

    public TileEntityTrack(){
        super("Track");
    }

    public void create(BlockPos defaultTrackPosition){
        this.defaultTrackPosition = defaultTrackPosition;
    }

}
