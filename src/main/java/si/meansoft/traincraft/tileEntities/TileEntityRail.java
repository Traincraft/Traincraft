package si.meansoft.traincraft.tileEntities;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityRail extends TileEntity implements ITickable{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();

    @Override
    public void tick(){

    }
}
