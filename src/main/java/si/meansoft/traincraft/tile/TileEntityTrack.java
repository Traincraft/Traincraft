package si.meansoft.traincraft.tile;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase{

    public List<BlockPos> toDestroy = new ArrayList<>();
    public BlockPos defaultTrackPosition;

    public TileEntityTrack(){
        super("Track");
    }

    public void create(BlockPos defaultTrackPosition){
        this.defaultTrackPosition = defaultTrackPosition;
    }

    public void create(List<BlockPos> poses){
        this.toDestroy = poses;
    }

}
