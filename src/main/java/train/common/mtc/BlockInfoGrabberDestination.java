package train.common.mtc;

import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.peripheral.IPeripheralProvider;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInfoGrabberDestination  extends BlockContainer implements IPeripheralProvider {

    public static BlockInfoGrabberDestination instance;
    public BlockInfoGrabberDestination(Material mtrl) {
        super(mtrl);
        instance = this;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileInfoGrabberDestination();
    }

    public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        return (IPeripheral)tileEntity;
    }


}

