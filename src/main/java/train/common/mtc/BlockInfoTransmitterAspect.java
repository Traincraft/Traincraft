package train.common.mtc;


import cpw.mods.fml.common.Optional;
import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.peripheral.IPeripheralProvider;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInfoTransmitterAspect extends BlockContainer implements IPeripheralProvider {

    public static BlockInfoTransmitterAspect instance;
    public BlockInfoTransmitterAspect(Material p_i45386_1_) {
        super(p_i45386_1_);
        instance = this;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileInfoTransmitterAspect();
    }

    public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        return (IPeripheral)tileEntity;
    }

}
